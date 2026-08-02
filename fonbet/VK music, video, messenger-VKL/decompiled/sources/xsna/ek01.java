package xsna;

import android.app.Activity;
import android.content.IntentSender;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.Set;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes.dex */
public final class ek01 implements mlk0 {
    public final r401 a;
    public final r401 b;
    public final r401 c;

    public ek01(r401 r401Var, r401 r401Var2, r401 r401Var3) {
        this.a = r401Var;
        this.b = r401Var2;
        this.c = r401Var3;
    }

    @Override // xsna.mlk0
    public final Task<Integer> a(@NonNull nlk0 nlk0Var) {
        return f().a(nlk0Var);
    }

    @Override // xsna.mlk0
    @NonNull
    public final Task<Void> b(int i) {
        return f().b(i);
    }

    @Override // xsna.mlk0
    public final boolean c(@NonNull olk0 olk0Var, @NonNull Activity activity, int i) throws IntentSender.SendIntentException {
        return f().c(olk0Var, activity, i);
    }

    @Override // xsna.mlk0
    public final void d(@NonNull plk0 plk0Var) {
        f().d(plk0Var);
    }

    @Override // xsna.mlk0
    @NonNull
    public final Set<String> e() {
        return f().e();
    }

    public final mlk0 f() {
        return this.c.zza() != null ? (mlk0) this.b.zza() : (mlk0) this.a.zza();
    }
}
