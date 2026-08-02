package xsna;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import androidx.media3.datasource.c;
import androidx.media3.datasource.e;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class ewy0 {
    public static androidx.media3.exoplayer.source.a a(Context context, Uri uri) {
        String str;
        e.a aVar = new e.a();
        String str2 = y2r0.a;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "?";
        }
        aVar.b = i5s.a(t33.a("myTarget/", str, " (Linux;Android "), Build.VERSION.RELEASE, ") AndroidXMedia3/1.9.3");
        c.a aVar2 = new c.a(context, aVar);
        if (y2r0.I(uri) == 2) {
            return new HlsMediaSource.Factory(new qfl(aVar2)).d(kr10.b(uri));
        }
        b630 b630Var = new b630(new uel(), 8);
        androidx.media3.exoplayer.upstream.a aVar3 = new androidx.media3.exoplayer.upstream.a();
        kr10 b = kr10.b(uri);
        b.b.getClass();
        b.b.getClass();
        b.b.getClass();
        return new androidx.media3.exoplayer.source.n(b, aVar2, b630Var, androidx.media3.exoplayer.drm.b.a, aVar3, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, null);
    }
}
