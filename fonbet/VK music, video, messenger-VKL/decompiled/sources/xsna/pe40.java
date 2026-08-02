package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;

/* compiled from: MusicCategoryOfflineAutoDownloadDataProvider.kt */
/* loaded from: classes16.dex */
public final class pe40 implements qe40 {
    public final df5 a;

    public pe40(df5 df5Var) {
        this.a = df5Var;
    }

    public static List d(List list, UIBlockLink uIBlockLink) {
        if (!drm0.D(uIBlockLink.y.e, "kids_section", false)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (jnj.b(((MusicTrack) obj).V)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List e(List list, UIBlockLink uIBlockLink) {
        return epx.f(uIBlockLink.y.b, "synthetic_offline_music_autodownload_all") ? EmptyList.b : rli0.A(rli0.y(rli0.t(new i5g(list), new nk(28)), 2));
    }

    @Override // xsna.qe40
    public final io.reactivex.rxjava3.core.x<tt70> a(UIBlockLink uIBlockLink) {
        if (drm0.D(uIBlockLink.y.e, "kids_section", false)) {
            return io.reactivex.rxjava3.core.x.k(new tt70(7, 0L, (List) null));
        }
        String valueOf = String.valueOf(o25.a().c().b);
        return new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new ne40(this, valueOf)), new oe40(new s62(this, valueOf, uIBlockLink, 4), 0));
    }

    @Override // xsna.qe40
    public final boolean b(UIBlockLink uIBlockLink, yj40 yj40Var) {
        return (yj40Var instanceof cf5) || (yj40Var instanceof hiy);
    }

    @Override // xsna.qe40
    public final io.reactivex.rxjava3.core.x<tt70> c(UIBlockLink uIBlockLink) {
        if (drm0.D(uIBlockLink.y.e, "kids_section", false)) {
            return io.reactivex.rxjava3.core.x.k(new tt70(7, 0L, (List) null));
        }
        if (epx.f(uIBlockLink.y.b, "synthetic_offline_music_autodownload_all")) {
            return io.reactivex.rxjava3.core.x.k(new tt70(3, 0L, (List) null));
        }
        final String valueOf = String.valueOf(o25.a().c().b);
        return new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.me40
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(pe40.this.a.n(valueOf));
            }
        }), new g7(new wh9(this, valueOf, uIBlockLink, 7), 25));
    }
}
