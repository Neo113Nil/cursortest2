package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.yandex.payment.sdk.subscribebills.ui.a;
import com.yandex.xplat.payment.sdk.ApiMethodNameForAnalytics;
import java.util.Collections;
import kotlin.collections.b;

/* loaded from: classes2.dex */
public final class cja0 implements bja0 {
    public final ksi0 a;

    public cja0(ksi0 ksi0Var) {
        this.a = ksi0Var;
    }

    @Override // defpackage.bja0
    public final boolean a() {
        return ((icp0) ((pwf) this.a.h()).G.get()).a(jui0.a);
    }

    @Override // defpackage.bja0
    public final tpr b() {
        return new acu((lz40) ((pwf) this.a.h()).E.get(), 10);
    }

    @Override // defpackage.bja0
    public final Intent c() {
        return this.a.c();
    }

    @Override // defpackage.bja0
    public final Intent d(String str) {
        return this.a.g(str, b.f());
    }

    @Override // defpackage.bja0
    public final void e(AppCompatActivity appCompatActivity, FrameLayout frameLayout, FragmentManager fragmentManager, String str) {
        String host = Uri.parse(str).getHost();
        int i = 15;
        ksi0 ksi0Var = this.a;
        if (host == null || host.hashCode() != -757727721 || !host.equals("subscribe_bills")) {
            sv90 sv90Var = qv90.a;
            ApiMethodNameForAnalytics apiMethodNameForAnalytics = ApiMethodNameForAnalytics.UNKNOWN_METHOD;
            sv90Var.getClass();
            ksi0Var.i(new mrj(i, apiMethodNameForAnalytics));
            return;
        }
        sv90 sv90Var2 = qv90.a;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics2 = ApiMethodNameForAnalytics.RTP;
        sv90Var2.getClass();
        ksi0Var.i(new mrj(i, apiMethodNameForAnalytics2));
        rwf rwfVar = (rwf) ksi0Var.j.getValue();
        rwfVar.getClass();
        pzu0 pzu0Var = new pzu0(Collections.singletonMap(ozu0.class, rwfVar.o));
        h450 h450Var = (h450) rwfVar.g.get();
        pwf pwfVar = rwfVar.a;
        new a(pzu0Var, h450Var, (pcy) pwfVar.b.get(), (rwo) pwfVar.i.get()).a(appCompatActivity, frameLayout, fragmentManager);
    }

    @Override // defpackage.bja0
    public final boolean refresh() {
        return ((icp0) ((pwf) this.a.h()).G.get()).a(jui0.b);
    }
}
