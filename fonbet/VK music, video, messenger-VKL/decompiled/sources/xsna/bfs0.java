package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.LinearLayout;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.h7u0;

/* compiled from: VideoDialogHelper.kt */
/* loaded from: classes17.dex */
public final class bfs0 {
    public static Context a(Context context) {
        if (dhr0.M()) {
            lpj lpjVar = context instanceof lpj ? (lpj) context : null;
            Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
            dhr0.a.getClass();
            int i = dhr0.u().c;
            if (valueOf == null || valueOf.intValue() != i) {
                return new l7s(context, dhr0.u().c);
            }
        }
        return context;
    }

    public static androidx.appcompat.app.d b(Context context, VideoFile videoFile, final dz20 dz20Var) {
        Context a = a(context);
        m1s0 m1s0Var = new m1s0(a, null, 0);
        int i = 1;
        m1s0Var.setOrientation(1);
        m1s0Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        m1s0Var.setGravity(5);
        if (!fxc0.B().s().G()) {
            m1s0Var.a(R.string.video_download_error_settings, "SETTINGS");
        }
        m1s0Var.a(R.string.video_download_error_close, "CANCEL");
        int i2 = h7u0.p;
        h7u0.a b = h7u0.b.b(a);
        b.f = m1s0Var;
        b.g0(!fxc0.B().s().G() ? R.string.video_download_error_title_no_space : R.string.video_download_error_title);
        Pair<String, sht0> l = gpt0.l(videoFile);
        b.U((l == null || drm0.N(l.i())) ? R.string.video_download_error_technical : !fxc0.B().s().G() ? R.string.video_download_error_no_space : R.string.video_download_error_license);
        b.b0(new DialogInterface.OnShowListener() { // from class: xsna.yes0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                dz20 dz20Var2 = dz20.this;
                if (dz20Var2 != null) {
                    dz20Var2.Ff(null);
                }
            }
        });
        b.a0(new y5h(dz20Var, i));
        androidx.appcompat.app.d m = b.m();
        m1s0Var.setListener(new jkc(6, m, a));
        return m;
    }

    public static androidx.appcompat.app.d c(Context context, Integer num, int i, final dz20 dz20Var, gzs gzsVar) {
        Context a = a(context);
        rm1 rm1Var = new rm1(gzsVar, 3);
        int i2 = h7u0.p;
        h7u0.a c = h7u0.b.c(a);
        c.U(i);
        c.c0(R.string.video_confirm_remove_positive, rm1Var);
        c.W(R.string.cancel, null);
        c.b0(new DialogInterface.OnShowListener() { // from class: xsna.xes0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                dz20 dz20Var2 = dz20.this;
                if (dz20Var2 != null) {
                    dz20Var2.Ff(null);
                }
            }
        });
        c.a0(new o6m0(dz20Var, 1));
        if (num != null) {
            c.g0(num.intValue());
        }
        return c.m();
    }

    public static /* synthetic */ androidx.appcompat.app.d d(Context context, int i, dz20 dz20Var, gzs gzsVar, int i2) {
        Integer valueOf = Integer.valueOf(R.string.video_alert_title);
        if ((i2 & 4) != 0) {
            i = R.string.video_confirm_remove;
        }
        if ((i2 & 8) != 0) {
            dz20Var = null;
        }
        return c(context, valueOf, i, dz20Var, gzsVar);
    }
}
