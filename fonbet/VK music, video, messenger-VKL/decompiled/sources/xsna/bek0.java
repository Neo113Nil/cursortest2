package xsna;

import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: SocialNetConfig.kt */
/* loaded from: classes11.dex */
public final class bek0 {
    public static final a b = new a();
    public static final bek0 c = new bek0(EmptySet.b);
    public final Set<String> a;

    /* compiled from: SocialNetConfig.kt */
    public static final class a {
    }

    public bek0(Set<String> set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bek0) && epx.f(this.a, ((bek0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ur.c(new StringBuilder("SocialNetConfig(filters="), this.a, ')');
    }
}
