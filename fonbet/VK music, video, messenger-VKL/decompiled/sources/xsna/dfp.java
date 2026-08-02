package xsna;

import android.util.SparseArray;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Source;
import com.vk.dto.stickers.StickerItem;
import com.vk.im.engine.models.stickers.StickerEntry;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.ij20;

/* compiled from: EmptyChatWelcomeStickersGet.kt */
/* loaded from: classes2.dex */
public final class dfp extends le6<List<? extends StickerEntry>> {
    public final Source b;
    public w2w c;

    /* compiled from: EmptyChatWelcomeStickersGet.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public dfp(Source source) {
        this.b = source;
    }

    @Override // xsna.le6
    public final List<? extends StickerEntry> e(w2w w2wVar) {
        this.c = w2wVar;
        int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            return f();
        }
        if (i != 2) {
            if (i == 3) {
                return g();
            }
            throw new NoWhenBranchMatchedException();
        }
        w2w w2wVar2 = this.c;
        if (w2wVar2 == null) {
            w2wVar2 = null;
        }
        Collection<Integer> values = w2wVar2.getConfig().o().values();
        List<StickerEntry> f = f();
        List<StickerEntry> list = f;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((StickerEntry) it.next()).c.b));
        }
        return epx.f(j5g.C0(values), j5g.C0(arrayList)) ? f : g();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dfp) && this.b == ((dfp) obj).b;
    }

    public final List<StickerEntry> f() {
        List<StickerEntry> O0;
        try {
            w2w w2wVar = this.c;
            if (w2wVar == null) {
                w2wVar = null;
            }
            byte[] b = w2wVar.I0().k().b("EmptyChatWelcomeStickers");
            if (b == null) {
                return EmptyList.b;
            }
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            ArrayList b2 = Serializer.b.b(b, StickerEntry.class.getClassLoader());
            if (b2 != null && (O0 = j5g.O0(b2)) != null) {
                return O0;
            }
            return EmptyList.b;
        } catch (Exception e) {
            L.g("The cache is out of date", e);
            return EmptyList.b;
        }
    }

    public final ArrayList g() {
        w2w w2wVar = this.c;
        if (w2wVar == null) {
            w2wVar = null;
        }
        Map<Integer, Integer> o = w2wVar.getConfig().o();
        Collection<Integer> values = o.values();
        ij20.a aVar = new ij20.a();
        aVar.d = bz2.m();
        aVar.c = "store.getStickers";
        aVar.i = true;
        aVar.b("sticker_ids", j5g.g0(values, null, null, null, 0, null, 63));
        ij20 ij20Var = new ij20(aVar);
        SparseArray sparseArray = new SparseArray();
        bz2.f(ij20Var, new efp(sparseArray));
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, Integer> entry : o.entrySet()) {
            arrayList.add(new StickerEntry(entry.getKey().intValue(), (StickerItem) sparseArray.get(entry.getValue().intValue())));
        }
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        byte[] f = Serializer.b.f(arrayList);
        w2w w2wVar2 = this.c;
        (w2wVar2 != null ? w2wVar2 : null).I0().k().k(f, "EmptyChatWelcomeStickers");
        return arrayList;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "EmptyChatWelcomeStickersGet(source=" + this.b + ')';
    }
}
