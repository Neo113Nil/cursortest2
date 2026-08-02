package xsna;

import android.app.Activity;
import android.util.Size;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ikv0;

/* compiled from: SnackbarDownloadingFailedHandler.kt */
/* loaded from: classes.dex */
public final class p7k0 implements gco {
    public final k850 a;
    public g9o b;

    public p7k0(k850 k850Var) {
        this.a = k850Var;
    }

    @Override // xsna.gco
    public final void a(MusicTrack musicTrack, Throwable th) {
        c63 c63Var = c63.a;
        Activity b = c63.b();
        if (b == null || p90.e(b) || this.a.e(th)) {
            return;
        }
        o7k0 o7k0Var = new o7k0(0, this, musicTrack);
        ikv0.a aVar = new ikv0.a(b);
        aVar.h(new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_24, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12));
        aVar.i(new ikv0.d(b.getString(R.string.vk_download_track_error), (String) null, (ikv0.d.a) null, 6));
        aVar.j(new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, b.getString(R.string.vk_common_retry), new rx20(1, o7k0Var)));
        aVar.d(new qz40(this, 26));
        aVar.n();
    }

    @Override // xsna.gco
    public final void b(lq40 lq40Var) {
        this.b = lq40Var;
    }
}
