package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacement;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.header.TopBarVh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.oap;

/* compiled from: CatalogReplacementPresenter.kt */
/* loaded from: classes16.dex */
public class eda {
    public final wba a;
    public final q3a b;
    public final jda c;
    public final a d;

    /* compiled from: CatalogReplacementPresenter.kt */
    public interface a {
        io.reactivex.rxjava3.core.q<CatalogReplacementResponse> b(wba wbaVar, List<String> list, String str);
    }

    /* compiled from: CatalogReplacementPresenter.kt */
    public static final class b {
        public final ArrayList a;

        public b(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("ReplacementUIBlockContainer(replacementUIBlock="), this.a);
        }
    }

    public eda(wba wbaVar, q3a q3aVar, jda jdaVar, a aVar) {
        this.a = wbaVar;
        this.b = q3aVar;
        this.c = jdaVar;
        this.d = aVar;
    }

    public static /* synthetic */ io.reactivex.rxjava3.disposables.c c(eda edaVar, String str, oap oapVar, UIBlock uIBlock, int i) {
        if ((i & 4) != 0) {
            uIBlock = null;
        }
        return edaVar.b(str, oapVar, uIBlock, null);
    }

    public void a(UIBlock uIBlock, CatalogReplacementResponse catalogReplacementResponse, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (CatalogReplacement catalogReplacement : catalogReplacementResponse.b) {
            List<CatalogBlock> list = catalogReplacement.c;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                g5g.y(jda.a(this.c, (CatalogBlock) it.next(), catalogReplacementResponse.c, false, true, 4), arrayList);
            }
            b bVar = new b(arrayList);
            Iterator<T> it2 = catalogReplacement.b.iterator();
            while (it2.hasNext()) {
                linkedHashMap.put((String) it2.next(), bVar);
            }
        }
        this.b.b(new buz(4, new h5(this, linkedHashMap), new s0(this, str, linkedHashMap, catalogReplacementResponse, 2)), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final io.reactivex.rxjava3.disposables.c b(String str, oap<? extends Context, ? extends io.reactivex.rxjava3.core.u<CatalogReplacementResponse, CatalogReplacementResponse>> oapVar, UIBlock uIBlock, String str2) {
        io.reactivex.rxjava3.core.q m;
        io.reactivex.rxjava3.core.q<CatalogReplacementResponse> b2 = this.d.b(this.a, Collections.singletonList(str), str2);
        if (oapVar instanceof oap.b) {
            m = b2.p((io.reactivex.rxjava3.core.u) ((oap.b) oapVar).a);
        } else {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
            m = hg1.m(b2, (Context) ((oap.a) oapVar).a, 0L, false, 62);
        }
        return new io.reactivex.rxjava3.internal.operators.observable.c2(m.F(new sv(new y8(6), 9)), new vj0(new kz0(7), 7)).subscribe(new m5(new dda(this, uIBlock, str, 0), 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final io.reactivex.rxjava3.disposables.c d(String str, String str2, oap.b bVar) {
        Object obj = null;
        io.reactivex.rxjava3.core.q y0 = rsg0.y0(new cda(this.a, str2), null, null, 3);
        io.reactivex.rxjava3.core.q p = bVar != null ? y0.p((io.reactivex.rxjava3.core.u) bVar.a) : null;
        if (p != null) {
            y0 = p;
        }
        return y0.subscribe(new defpackage.x(new rm9(this, str, obj, 1), 8), new defpackage.z(new vr0(5), 10));
    }

    public final void e(Context context, String str, String str2, TopBarVh topBarVh) {
        hg1.m(rsg0.y0(new cda(this.a, str2), null, null, 3), context, 0L, false, 62).subscribe(new defpackage.x(new rm9(this, str, topBarVh, 1), 8), new defpackage.z(new vr0(5), 10));
    }
}
