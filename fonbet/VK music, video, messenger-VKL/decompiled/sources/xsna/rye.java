package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vkontakte.android.R;
import java.util.Arrays;
import xsna.rye;
import xsna.tlo0;

/* compiled from: ClipsProgressDialog.kt */
/* loaded from: classes17.dex */
public final class rye extends b33 {
    public static final /* synthetic */ int j = 0;
    public final VkScreenSpinner h;
    public final bpn0 i;

    /* compiled from: ClipsProgressDialog.kt */
    public static final class a implements VkSpinnerContent.b {
        public final /* synthetic */ gzs<s3q0> a;
        public final /* synthetic */ rye b;

        public a(gzs<s3q0> gzsVar, rye ryeVar) {
            this.a = gzsVar;
            this.b = ryeVar;
        }

        @Override // com.vk.core.view.components.spinner.VkSpinnerContent.b
        public final void onCancel() {
            gzs<s3q0> gzsVar = this.a;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            this.b.cancel();
        }
    }

    /* compiled from: ClipsProgressDialog.kt */
    public static final class b {
        public final Context a;
        public final gzs<s3q0> b;
        public rye c;
        public final Handler d;

        public b(Context context, gzs<s3q0> gzsVar) {
            this.a = context;
            this.b = gzsVar;
            Handler handler = new Handler(Looper.getMainLooper());
            this.d = handler;
            handler.post(new n52(this, 6));
        }

        public final void a() {
            Handler handler = this.d;
            try {
                handler.removeCallbacksAndMessages(null);
                handler.post(new xw1(this, 3));
            } catch (Throwable unused) {
            }
        }

        public final void b(final long j, final gzs gzsVar, final boolean z) {
            this.d.post(new Runnable() { // from class: xsna.sye
                @Override // java.lang.Runnable
                public final void run() {
                    rye ryeVar = rye.b.this.c;
                    if (ryeVar != null) {
                        ryeVar.n(j, gzsVar, z);
                    }
                }
            });
        }

        public final void c(io.reactivex.rxjava3.disposables.c cVar) {
            rye ryeVar;
            if (!epx.f(Looper.myLooper(), Looper.getMainLooper()) || (ryeVar = this.c) == null) {
                this.d.post(new xq8(1, this, cVar));
            } else if (ryeVar != null) {
                ryeVar.setOnCancelListener(new tye(cVar, 0));
            }
        }
    }

    public rye(Context context, gzs<s3q0> gzsVar) {
        super(context, 0);
        this.i = new bpn0(new o6(7));
        VkScreenSpinner vkScreenSpinner = new VkScreenSpinner(context, null, 6);
        this.h = vkScreenSpinner;
        vkScreenSpinner.setOnCancelListener(new a(gzsVar, this));
        setCancelable(false);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        setContentView(vkScreenSpinner);
    }

    public final void n(long j2, gzs gzsVar, boolean z) {
        VkScreenSpinner vkScreenSpinner = this.h;
        if (!z || j2 <= 0) {
            if (j2 > 0 && vkScreenSpinner != null) {
                vkScreenSpinner.setSpinnerState(VkSpinnerContent.SpinnerState.Error);
            }
        } else if (vkScreenSpinner != null) {
            vkScreenSpinner.setSpinnerState(VkSpinnerContent.SpinnerState.Done);
            tlo0.a aVar = tlo0.Companion;
            String string = vkScreenSpinner.getContext().getString(R.string.camera_loading_success);
            aVar.getClass();
            vkScreenSpinner.b(new tlo0.h(string).a(vkScreenSpinner.getContext()), true);
        }
        if (j2 > 0) {
            ((Handler) this.i.getValue()).postDelayed(new qye(0, gzsVar, this), j2);
            return;
        }
        gzsVar.invoke();
        try {
            cancel();
        } catch (Throwable unused) {
        }
    }

    public final void o(float f) {
        VkScreenSpinner vkScreenSpinner = this.h;
        if (vkScreenSpinner != null) {
            VkSpinnerContent.SpinnerState spinnerState = vkScreenSpinner.getSpinnerState();
            VkSpinnerContent.SpinnerState spinnerState2 = VkSpinnerContent.SpinnerState.Loading;
            if (spinnerState != spinnerState2) {
                vkScreenSpinner.setSpinnerState(spinnerState2);
            }
            vkScreenSpinner.b(oq.d(tlo0.Companion, f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? String.format(vkScreenSpinner.getContext().getString(R.string.camera_loading_progress), Arrays.copyOf(new Object[]{Integer.valueOf((int) (f * 100))}, 1)) : vkScreenSpinner.getContext().getString(R.string.camera_loading_process)).a(vkScreenSpinner.getContext()), true);
        }
    }

    @Override // xsna.b33, xsna.y8i, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        VkScreenSpinner vkScreenSpinner = this.h;
        if (vkScreenSpinner != null) {
            f4m.m(17, vkScreenSpinner);
        }
    }
}
