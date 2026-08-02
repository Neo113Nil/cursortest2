package xsna;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlin.Result;
import xsna.bxi;
import xsna.n6q0;

/* compiled from: PlainDialogModalController.kt */
@ozl
/* loaded from: classes3.dex */
public final class ysa0 implements k6q0 {
    public static final ysa0 a = new ysa0();
    public static Dialog b;

    @Override // xsna.k6q0
    public final void a(AppCompatActivity appCompatActivity, boolean z, boolean z2) {
        bxi.a aVar;
        if (b != null) {
            return;
        }
        d6q0.a.getClass();
        bxi bxiVar = d6q0.b;
        if (bxiVar == null || (aVar = bxiVar.f) == null) {
            return;
        }
        Dialog dialog = new Dialog(appCompatActivity);
        n6q0.a aVar2 = new n6q0.a();
        aVar2.a = aVar.b;
        aVar2.g = z2;
        bxi.a.C2631a c2631a = aVar.d;
        String str = c2631a.a;
        if (str != null && c2631a.b != null) {
            ge0 ge0Var = new ge0(13, c2631a, appCompatActivity);
            aVar2.b = str;
            aVar2.c = ge0Var;
        }
        bxi.a.C2631a c2631a2 = aVar.e;
        String str2 = c2631a2.a;
        if (str2 != null && c2631a2.b != null) {
            wo1 wo1Var = new wo1(15, c2631a2, appCompatActivity);
            aVar2.d = str2;
            aVar2.e = wo1Var;
        }
        if (z) {
            aVar2.f = new ko60(appCompatActivity);
        }
        dialog.setContentView(aVar2.a(appCompatActivity), new FrameLayout.LayoutParams(-1, -1));
        dialog.setCanceledOnTouchOutside(z);
        dialog.setCancelable(z);
        if (!z) {
            dialog.setOnKeyListener(new wsa0());
        }
        dialog.setOnDismissListener(new xsa0());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setDimAmount(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        dialog.show();
        b = dialog;
        Iterator<ny1> it = d6q0.d.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        d6q0.a.getClass();
        bxi bxiVar2 = d6q0.b;
        if (bxiVar2 == null || bxiVar2.s) {
            return;
        }
        d6q0.c.c();
    }

    @Override // xsna.k6q0
    public final void hide() {
        Object failure;
        f370 f370Var;
        try {
            Dialog dialog = b;
            if (dialog != null) {
                dialog.dismiss();
                failure = s3q0.a;
            } else {
                failure = null;
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            d6q0.a.getClass();
            bxi bxiVar = d6q0.b;
            if (bxiVar != null && (f370Var = bxiVar.h) != null) {
                f370Var.n(a2);
            }
        }
        if (b != null) {
            d6q0.a.getClass();
            Iterator<ny1> it = d6q0.d.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
            d6q0.a.getClass();
            bxi bxiVar2 = d6q0.b;
            if (bxiVar2 != null && !bxiVar2.s) {
                d6q0.c.e();
            }
        }
        b = null;
    }
}
