package xsna;

import androidx.activity.ComponentActivity;
import com.vk.dialogtags.api.a;

/* compiled from: TagsFactoryImpl.kt */
/* loaded from: classes18.dex */
public final class dk3 {
    public final ComponentActivity a;
    public final long b;
    public final a.b c;
    public final d2o0 d;

    public dk3(ComponentActivity componentActivity, long j, a.b bVar, d2o0 d2o0Var) {
        this.a = componentActivity;
        this.b = j;
        this.c = bVar;
        this.d = d2o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk3)) {
            return false;
        }
        dk3 dk3Var = (dk3) obj;
        return epx.f(this.a, dk3Var.a) && this.b == dk3Var.b && epx.f(this.c, dk3Var.c) && epx.f(this.d, dk3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + bh10.a(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "ArgumentsWrapper(owner=" + this.a + ", groupId=" + this.b + ", params=" + this.c + ", handler=" + this.d + ')';
    }
}
