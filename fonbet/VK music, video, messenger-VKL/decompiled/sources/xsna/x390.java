package xsna;

import android.app.Application;
import com.vk.core.preference.Preference;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vkontakte.android.VKApplication;

/* compiled from: OverrideDomainInitTaskLogic.kt */
/* loaded from: classes7.dex */
public final class x390 extends ParallelTaskRunner.a {
    public x390(VKApplication vKApplication) {
        super(vKApplication, new uz(vKApplication));
    }

    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "OverrideDomainInit";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        w390 w390Var = w390.a;
        Application application = this.b;
        t210 t210Var = new t210(this, 14);
        w390Var.getClass();
        w390.c = t210Var;
        nf3 nf3Var = w390.d;
        qcy<Object> qcyVar = w390.b[0];
        nf3Var.c = application;
        Preference.a.getClass();
        Preference.w(application);
        usm0.b.add(new dl70(2));
        return s3q0.a;
    }
}
