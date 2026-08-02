package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Size;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.core.ui.themes.ThemableActivity;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.report.dialog.VoipReportSuspiciousCallActivity;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.R;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class sy0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sy0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                StringBuilder sb = new StringBuilder("tel:");
                sb.append(obj2);
                ((Activity) obj3).startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(sb.toString())));
                com.vk.qrcode.d dVar = com.vk.qrcode.d.b;
                com.vk.qrcode.d.a((cme0) obj);
                break;
            case 2:
                hcp0 hcp0Var = (hcp0) obj3;
                Context context = (Context) obj2;
                VideoAlbum videoAlbum = (VideoAlbum) obj;
                wjs0.a(new jwr0(VideoAlbum.Ab(videoAlbum, hcp0Var.w, null, 261119), videoAlbum.l ? "albums_subscribe" : "albums_unsubscribe"));
                boolean z = hcp0Var.w;
                ikv0.a aVar = new ikv0.a(context);
                float f = 28;
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_done_outline_24, Integer.valueOf(R.attr.vk_ui_icon_accent_themed), new Size(iah0.a(f), iah0.a(f)), 8);
                aVar.u = new ikv0.d(context.getString(z ? R.string.topshelf_snackbar_playlist_subscribed : R.string.topshelf_snackbar_playlist_unsubscribed), (String) null, (ikv0.d.a) null, 6);
                pkv0.e(aVar);
                pkv0.f(aVar);
                lf30 lf30Var = hcp0Var.v;
                if (lf30Var != null) {
                    lf30Var.a();
                }
                pgn pgnVar = hcp0Var.x;
                qcy<Object> qcyVar = hcp0.y[0];
                pgnVar.b(null);
                break;
            default:
                VoipReportSuspiciousCallActivity voipReportSuspiciousCallActivity = (VoipReportSuspiciousCallActivity) obj3;
                int i3 = VoipReportSuspiciousCallActivity.q;
                fww0 fww0Var = new fww0(i2, voipReportSuspiciousCallActivity, (CallId) obj);
                voipReportSuspiciousCallActivity.m = true;
                r3y.a("VKWebAppReturnReason", new qum0(7, voipReportSuspiciousCallActivity, fww0Var));
                ThemableActivity themableActivity = voipReportSuspiciousCallActivity.i;
                g2v.c().getClass();
                int i4 = ReportFragment.a0;
                ReportFragment.a a = ReportFragment.b.a();
                a.K(NotificationCompat.CATEGORY_CALL);
                a.G((UserId) obj2);
                a.s(true);
                a.k(themableActivity);
                break;
        }
        return s3q0.a;
    }
}
