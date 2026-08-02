package xsna;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media.MediaBrowserServiceCompat;
import com.vk.catalog2.common.ui.mvp.auto.VKAndroidAutoCatalogMediaService;
import com.vk.dto.common.id.UserId;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.g0z;
import xsna.g0z.a;
import xsna.u4a;

/* compiled from: LegacyMediaServiceDelegate.kt */
/* loaded from: classes16.dex */
public final class a1z implements w6r0 {
    public final VKAndroidAutoCatalogMediaService a;
    public final k0z b;
    public final h0z c;
    public g0z d;

    public a1z(VKAndroidAutoCatalogMediaService vKAndroidAutoCatalogMediaService) {
        k0z k0zVar = new k0z(vKAndroidAutoCatalogMediaService);
        h0z h0zVar = new h0z(vKAndroidAutoCatalogMediaService.getApplicationContext());
        this.a = vKAndroidAutoCatalogMediaService;
        this.b = k0zVar;
        this.c = h0zVar;
    }

    @Override // xsna.w6r0
    public final void a(androidx.media.d dVar) {
        dVar.e();
    }

    @Override // xsna.w6r0
    public final void b(MediaSessionCompat mediaSessionCompat) {
        Context applicationContext = this.a.getApplicationContext();
        u4a u4aVar = this.b.a;
        u4a.a aVar = u4aVar.b;
        g0z g0zVar = new g0z(applicationContext, mediaSessionCompat, aVar.i, aVar.t, aVar.u, u4aVar.c.d, this.c);
        this.d = g0zVar;
        g0z.a aVar2 = g0zVar.h;
        u2b0 u2b0Var = g0zVar.c;
        if (aVar2 != null) {
            u2b0Var.n0(aVar2);
        }
        g0z.a aVar3 = g0zVar.new a();
        u2b0Var.P0(aVar3, false);
        g0zVar.h = aVar3;
        MediaSessionCompat mediaSessionCompat2 = g0zVar.b;
        mediaSessionCompat2.setActive(true);
        mediaSessionCompat2.setQueue(EmptyList.b);
    }

    @Override // xsna.w6r0
    public final f22 c() {
        return this.d;
    }

    @Override // xsna.w6r0
    public final void d(String str, androidx.media.c cVar) {
        cVar.f(EmptyList.b);
    }

    @Override // xsna.w6r0
    public final void e(String str, MediaBrowserServiceCompat.g<List<MediaBrowserCompat.MediaItem>> gVar) {
        gVar.a();
        boolean equals = str.equals(DomExceptionUtils.SEPARATOR);
        k0z k0zVar = this.b;
        if (equals) {
            itg0.i(4, k0zVar.c.x(UserId.d, null).U(new vx6(new x2e(k0zVar, 26), 19)), null, new l22(17, gVar, this), new ma(17, this, gVar));
        } else {
            itg0.i(4, k0zVar.c.D(str, null, false).U(new ox0(new j9k(k0zVar, 24), 23)), null, new com.vk.movika.sdk.base.ui.s0(16, gVar, this), new ut6(19, this, gVar));
        }
    }

    @Override // xsna.w6r0
    public final MediaBrowserServiceCompat.a f() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("android.media.browse.CONTENT_STYLE_SUPPORTED", true);
        return new MediaBrowserServiceCompat.a(bundle);
    }

    @Override // xsna.w6r0
    public final void onDestroy() {
        g0z g0zVar = this.d;
        if (g0zVar != null) {
            g0zVar.b();
        }
    }
}
