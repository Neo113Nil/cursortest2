package defpackage;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import java.util.List;
import java.util.Set;

/* loaded from: classes11.dex */
public final class esa1 implements lvt0 {
    public final rb91 a;
    public final rb91 b;
    public final rb91 c;

    public esa1(rb91 rb91Var, rb91 rb91Var2, rb91 rb91Var3) {
        this.a = rb91Var;
        this.b = rb91Var2;
        this.c = rb91Var3;
    }

    @Override // defpackage.lvt0
    public final Task a(SplitInstallRequest splitInstallRequest) {
        return h().a(splitInstallRequest);
    }

    @Override // defpackage.lvt0
    public final Task b(List list) {
        return h().b(list);
    }

    @Override // defpackage.lvt0
    public final boolean c(mvt0 mvt0Var, Activity activity) {
        return h().c(mvt0Var, activity);
    }

    @Override // defpackage.lvt0
    public final void d(nvt0 nvt0Var) {
        h().d(nvt0Var);
    }

    @Override // defpackage.lvt0
    public final Task e(int i) {
        return h().e(i);
    }

    @Override // defpackage.lvt0
    public final void f(nvt0 nvt0Var) {
        h().f(nvt0Var);
    }

    @Override // defpackage.lvt0
    public final Set g() {
        return h().g();
    }

    public final lvt0 h() {
        return this.c.zza() != null ? (lvt0) this.b.zza() : (lvt0) this.a.zza();
    }
}
