package xsna;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media.MediaBrowserServiceCompat;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.auto.VKAndroidAutoCatalogMediaService;
import com.vk.catalog2.common.ui.mvp.auto.a;
import com.vk.catalog2.common.ui.mvp.auto.a.C0494a;
import com.vk.dto.common.id.UserId;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.c22;
import xsna.f8u0;
import xsna.k840;
import xsna.k8u0;
import xsna.q22;
import xsna.u4a;

/* compiled from: VKAndroidAutoCatalogMediaServiceDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class x6r0 implements w6r0 {
    public final VKAndroidAutoCatalogMediaService a;
    public final Lazy<pq40> b;
    public final f8u0 c;
    public final k8u0 d;
    public final com.vk.catalog2.common.ui.mvp.auto.d e;
    public final s22 f;
    public com.vk.catalog2.common.ui.mvp.auto.a g;
    public final io.reactivex.rxjava3.disposables.b h;

    public x6r0(VKAndroidAutoCatalogMediaService vKAndroidAutoCatalogMediaService, bpn0 bpn0Var) {
        i8u0 i8u0Var = new i8u0();
        f8u0.a aVar = f8u0.a.a;
        Pair pair = new Pair("catalog", aVar);
        LinkedHashMap linkedHashMap = i8u0Var.a;
        linkedHashMap.put(c22.a.class, pair);
        LinkedHashMap linkedHashMap2 = i8u0Var.b;
        linkedHashMap2.put("catalog", aVar);
        f8u0.c cVar = f8u0.c.a;
        linkedHashMap.put(c22.c.class, new Pair("section", cVar));
        linkedHashMap2.put("section", cVar);
        f8u0.b bVar = f8u0.b.a;
        linkedHashMap.put(c22.b.class, new Pair("search_suggestion", bVar));
        linkedHashMap2.put("search_suggestion", bVar);
        f8u0 f8u0Var = new f8u0(i8u0Var);
        i8u0 i8u0Var2 = new i8u0();
        k8u0.f fVar = k8u0.f.a;
        Pair pair2 = new Pair("track", fVar);
        LinkedHashMap linkedHashMap3 = i8u0Var2.a;
        linkedHashMap3.put(q22.f.class, pair2);
        LinkedHashMap linkedHashMap4 = i8u0Var2.b;
        linkedHashMap4.put("track", fVar);
        k8u0.c cVar2 = k8u0.c.a;
        linkedHashMap3.put(q22.c.class, new Pair("fast_play", cVar2));
        linkedHashMap4.put("fast_play", cVar2);
        k8u0.d dVar = k8u0.d.a;
        linkedHashMap3.put(q22.d.class, new Pair("playlist", dVar));
        linkedHashMap4.put("playlist", dVar);
        k8u0.g gVar = k8u0.g.a;
        linkedHashMap3.put(q22.g.class, new Pair("vk_mix", gVar));
        linkedHashMap4.put("vk_mix", gVar);
        k8u0.a aVar2 = k8u0.a.a;
        linkedHashMap3.put(q22.a.class, new Pair("artist", aVar2));
        linkedHashMap4.put("artist", aVar2);
        k8u0.b bVar2 = k8u0.b.a;
        linkedHashMap3.put(q22.b.class, new Pair("curator", bVar2));
        linkedHashMap4.put("curator", bVar2);
        k8u0.e eVar = k8u0.e.a;
        linkedHashMap3.put(q22.e.class, new Pair("podcast", eVar));
        linkedHashMap4.put("podcast", eVar);
        k8u0 k8u0Var = new k8u0(i8u0Var2);
        com.vk.catalog2.common.ui.mvp.auto.d dVar2 = new com.vk.catalog2.common.ui.mvp.auto.d(vKAndroidAutoCatalogMediaService);
        s22 s22Var = new s22(vKAndroidAutoCatalogMediaService.getApplicationContext(), f8u0Var, k8u0Var);
        this.a = vKAndroidAutoCatalogMediaService;
        this.b = bpn0Var;
        this.c = f8u0Var;
        this.d = k8u0Var;
        this.e = dVar2;
        this.f = s22Var;
        this.h = new io.reactivex.rxjava3.disposables.b();
    }

    @Override // xsna.w6r0
    public final void a(androidx.media.d dVar) {
        dVar.e();
    }

    @Override // xsna.w6r0
    public final void b(MediaSessionCompat mediaSessionCompat) {
        VKAndroidAutoCatalogMediaService vKAndroidAutoCatalogMediaService = this.a;
        Context applicationContext = vKAndroidAutoCatalogMediaService.getApplicationContext();
        bqz0 bqz0Var = new bqz0(this.b);
        com.vk.catalog2.common.ui.mvp.auto.d dVar = this.e;
        u4a u4aVar = dVar.f;
        u4a.a aVar = u4aVar.b;
        com.vk.catalog2.common.ui.mvp.auto.a aVar2 = new com.vk.catalog2.common.ui.mvp.auto.a(applicationContext, mediaSessionCompat, new m22(bqz0Var, aVar.t, aVar.u, u4aVar.c.d), dVar.f.b.i, new com.vk.music.track.a(), new com.vk.catalog2.common.ui.mvp.auto.b(vKAndroidAutoCatalogMediaService.getApplicationContext(), this.f, this.d), this.d);
        this.g = aVar2;
        a.C0494a c0494a = aVar2.h;
        u2b0 u2b0Var = aVar2.d;
        if (c0494a != null) {
            u2b0Var.n0(c0494a);
        }
        a.C0494a c0494a2 = aVar2.new C0494a();
        u2b0Var.P0(c0494a2, false);
        r5v0 r5v0Var = k840.a.h;
        if (r5v0Var == null) {
            r5v0Var = null;
        }
        aVar2.k.b(r5v0Var.a.a.b0(mv40.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new js1(new t9(c0494a2, 2), 1)));
        aVar2.h = c0494a2;
        aVar2.b.setActive(true);
    }

    @Override // xsna.w6r0
    public final f22 c() {
        return this.g;
    }

    @Override // xsna.w6r0
    public final void d(String str, androidx.media.c cVar) {
        com.vk.catalog2.common.ui.mvp.auto.d dVar = this.e;
        dVar.getClass();
        boolean z = str.length() < 2 || !str.equals(dVar.h);
        dVar.h = str;
        g(dVar.d(str, null, z), cVar);
    }

    @Override // xsna.w6r0
    public final void e(String str, MediaBrowserServiceCompat.g<List<MediaBrowserCompat.MediaItem>> gVar) {
        io.reactivex.rxjava3.core.q<List<UIBlock>> d;
        f8u0 f8u0Var = this.c;
        f8u0Var.getClass();
        boolean equals = str.equals(DomExceptionUtils.SEPARATOR);
        c22.a aVar = c22.a.c;
        c22 a = equals ? aVar : f8u0Var.a.a(str);
        if (a == null) {
            gVar.f(null);
            com.vk.catalog2.common.ui.mvp.auto.a aVar2 = this.g;
            if (aVar2 != null) {
                aVar2.c(this.a.getApplicationContext(), str);
                return;
            }
            return;
        }
        com.vk.catalog2.common.ui.mvp.auto.d dVar = this.e;
        dVar.getClass();
        if (a instanceof c22.a) {
            c22.a aVar3 = (c22.a) a;
            d = (aVar3 == aVar ? dVar.f : dVar.a(aVar3)).b.s.x(UserId.d, aVar3.b).U(new lp0(new d05(4, aVar3, dVar), 10)).L(new ql2(new s6(dVar, 16), 7), false);
        } else if (a instanceof c22.c) {
            d = dVar.c((c22.c) a, EmptyList.b);
        } else {
            if (!(a instanceof c22.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c22.b bVar = (c22.b) a;
            dVar.h = "";
            d = dVar.d(bVar.a, bVar.b, false);
        }
        g(d, gVar);
    }

    @Override // xsna.w6r0
    public final MediaBrowserServiceCompat.a f() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("android.media.browse.SEARCH_SUPPORTED", true);
        bundle.putBoolean("android.media.browse.CONTENT_STYLE_SUPPORTED", true);
        return new MediaBrowserServiceCompat.a(bundle);
    }

    public final void g(io.reactivex.rxjava3.core.q qVar, MediaBrowserServiceCompat.g gVar) {
        gVar.a();
        this.h.b(qVar.U(new kxa0(new mmm0(this, 11), 12)).a0(asu0.a.d()).subscribe(new g600(new fvq0(gVar, 3), 26), new lkz(new evh0(5, this, gVar), 23)));
    }

    @Override // xsna.w6r0
    public final void onDestroy() {
        com.vk.catalog2.common.ui.mvp.auto.a aVar = this.g;
        if (aVar != null) {
            aVar.b();
        }
        this.h.dispose();
    }
}
