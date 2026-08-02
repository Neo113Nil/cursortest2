package xsna;

import com.vk.log.L;
import kotlin.Result;
import org.json.JSONObject;

/* compiled from: AnimatedSharingControlConfig.kt */
/* loaded from: classes2.dex */
public final class il2 {
    public static final a b = new a();
    public final int a;

    /* compiled from: AnimatedSharingControlConfig.kt */
    public static final class a {
        public static il2 a(String str) {
            Object failure;
            if (str == null) {
                return new il2(1);
            }
            try {
                failure = new il2(new JSONObject(str).getInt("animation_strategy"));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                L.j(a, "failed to parse config: ".concat(str));
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            il2 il2Var = (il2) failure;
            return il2Var == null ? new il2(1) : il2Var;
        }
    }

    public il2() {
        this(1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof il2) && this.a == ((il2) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("AnimatedSharingControlConfig(animationStrategy="), this.a, ')');
    }

    public il2(int i) {
        this.a = i;
    }

    public /* synthetic */ il2(Object obj) {
        this(1);
    }
}
