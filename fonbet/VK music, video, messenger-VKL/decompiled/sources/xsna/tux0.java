package xsna;

import android.util.LruCache;
import com.vk.dto.stickers.StickerSuggestion;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.kcl0;
import xsna.ncl0;

/* compiled from: WordsRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class tux0 implements kcl0.e {
    public final ncl0.b a;
    public final LruCache<Integer, List<StickerSuggestion>> b = new LruCache<>(50);

    public tux0(ncl0.b bVar) {
        this.a = bVar;
    }

    @Override // xsna.kcl0.e
    public final List<StickerSuggestion> a(int i) {
        return this.b.get(Integer.valueOf(i));
    }

    @Override // xsna.kcl0.e
    public final io.reactivex.rxjava3.internal.operators.observable.b0 b(int i) {
        hal0 hal0Var = new hal0("store.getStickerSuggestions");
        hal0Var.C(i, "sticker_id");
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(hal0Var, null, null, 3);
        wvq0 wvq0Var = new wvq0(new vqp(this, i, 3), 14);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(wvq0Var, lVar, kVar, kVar);
    }

    @Override // xsna.kcl0.e
    public final void c(int i, String str) {
        List<StickerSuggestion> a = a(i);
        if (a == null) {
            return;
        }
        List<StickerSuggestion> list = a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (StickerSuggestion stickerSuggestion : list) {
            boolean z = stickerSuggestion.d;
            String str2 = stickerSuggestion.b;
            if (z && epx.f(str2, str)) {
                stickerSuggestion = new StickerSuggestion(str2, stickerSuggestion.c, stickerSuggestion.d, !stickerSuggestion.e);
            }
            arrayList.add(stickerSuggestion);
        }
        this.b.put(Integer.valueOf(i), arrayList);
    }

    @Override // xsna.kcl0.e
    public final void d(int i) {
        List<StickerSuggestion> a = a(i);
        if (a == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : a) {
            if (((StickerSuggestion) obj).e) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((StickerSuggestion) it.next()).b);
        }
        sea0 sea0Var = new sea0("store.deleteStickerSuggestion");
        sea0Var.C(i, "sticker_id");
        sea0Var.G("words", arrayList2);
        rsg0.y0(sea0Var, null, null, 3).subscribe(new uwv0(new xau0(this, 12), 3), kwg0.b());
        ArrayList arrayList3 = new ArrayList(a);
        arrayList3.removeAll(arrayList);
        this.b.put(Integer.valueOf(i), arrayList3);
    }

    @Override // xsna.kcl0.e
    public final void e(int i, String str) {
        List<StickerSuggestion> a = a(i);
        if (a != null) {
            List<StickerSuggestion> list = a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (epx.f(((StickerSuggestion) it.next()).b, str)) {
                        return;
                    }
                }
            }
            ArrayList arrayList = new ArrayList(a);
            arrayList.add(new StickerSuggestion(str, false, true, false, 8, null));
            this.b.put(Integer.valueOf(i), arrayList);
            this.a.invoke();
        }
    }
}
