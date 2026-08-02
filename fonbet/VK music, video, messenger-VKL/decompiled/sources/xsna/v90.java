package xsna;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.IntentSender;
import kotlin.jvm.internal.Lambda;

/* compiled from: ActivityLauncherAnalytics.kt */
/* loaded from: classes9.dex */
public final class v90 {
    public final bpn0 a;

    /* compiled from: ActivityLauncherAnalytics.kt */
    public static final class a extends Lambda implements gzs<hl20> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // xsna.gzs
        public final hl20 invoke() {
            return r3y0.c.a(this.$context).b;
        }
    }

    /* compiled from: ActivityLauncherAnalytics.kt */
    public static final class b extends Lambda implements izs<s3q0, s3q0> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final /* bridge */ /* synthetic */ s3q0 invoke(s3q0 s3q0Var) {
            return s3q0.a;
        }
    }

    public v90(Context context) {
        this.a = new bpn0(new a(context));
    }

    public final void a(Exception exc) {
        String str;
        if (exc instanceof ActivityNotFoundException) {
            str = "ActivityLauncher.ActivityNotFoundException";
        } else if (exc instanceof IntentSender.SendIntentException) {
            str = "ActivityLauncher.SendIntentException";
        } else {
            str = fpf0.a(exc.getClass()).h() + " || " + exc.getMessage() + " ||| " + exc.getCause();
        }
        gwj0 a2 = ((hl20) this.a.getValue()).a(new jl20("launchActivity.error", dt.b("errorDescription", str)));
        bpn0 bpn0Var = adn.a;
        qz9.f(new yuj0(new gwj0(a2, adn.a()), w90.j), b.i);
    }
}
