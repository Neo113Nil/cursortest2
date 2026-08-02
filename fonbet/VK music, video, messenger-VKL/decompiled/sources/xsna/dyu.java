package xsna;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;

/* compiled from: View.kt */
/* loaded from: classes16.dex */
public final class dyu implements Runnable {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public dyu(View view, VkOnboardingHighlighter vkOnboardingHighlighter) {
        this.c = view;
        this.d = vkOnboardingHighlighter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((VkOnboardingHighlighter) this.d).c(false);
                return;
            case 1:
                y901 y901Var = (y901) this.d;
                z901 z901Var = y901Var.c;
                String str = y901Var.b;
                zzbr zzbrVar = (zzbr) this.c;
                mb01 mb01Var = z901Var.a;
                kb01 kb01Var = mb01Var.k;
                mb01.k(kb01Var);
                kb01Var.k();
                Bundle bundle = new Bundle();
                bundle.putString("package_name", str);
                try {
                    if (zzbrVar.zzd(bundle) == null) {
                        k901 k901Var = mb01Var.j;
                        mb01.k(k901Var);
                        k901Var.i.a("Install Referrer Service returned a null response");
                    }
                } catch (Exception e) {
                    k901 k901Var2 = mb01Var.j;
                    mb01.k(k901Var2);
                    k901Var2.i.b(e.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                kb01 kb01Var2 = mb01Var.k;
                mb01.k(kb01Var2);
                kb01Var2.k();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                yh01 s = ((AppMeasurementDynamiteService) this.d).a.s();
                zzcf zzcfVar = (zzcf) this.c;
                s.k();
                s.l();
                s.w(new nb01(s, s.t(false), zzcfVar));
                return;
        }
    }

    public dyu(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar) {
        this.d = appMeasurementDynamiteService;
        this.c = zzcfVar;
    }

    public dyu(y901 y901Var, zzbr zzbrVar, y901 y901Var2) {
        this.d = y901Var;
        this.c = zzbrVar;
    }
}
