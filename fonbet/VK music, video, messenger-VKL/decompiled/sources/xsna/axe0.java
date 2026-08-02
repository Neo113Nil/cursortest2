package xsna;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.text.Regex;

/* compiled from: RateLimiterConfig.kt */
/* loaded from: classes6.dex */
public final class axe0 {
    public final Set<String> a;
    public final Regex b;
    public final Regex c;

    public axe0() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axe0)) {
            return false;
        }
        axe0 axe0Var = (axe0) obj;
        return epx.f(this.a, axe0Var.a) && epx.f(this.b, axe0Var.b) && epx.f(this.c, axe0Var.c);
    }

    public final int hashCode() {
        Set<String> set = this.a;
        int hashCode = (set == null ? 0 : set.hashCode()) * 31;
        Regex regex = this.b;
        int hashCode2 = (hashCode + (regex == null ? 0 : regex.hashCode())) * 31;
        Regex regex2 = this.c;
        return hashCode2 + (regex2 != null ? regex2.hashCode() : 0);
    }

    public final String toString() {
        return "RateLimitPattern(requestTags=" + this.a + ", domainRegex=" + this.b + ", pathRegex=" + this.c + ')';
    }

    public axe0(LinkedHashSet linkedHashSet, Regex regex, Regex regex2) {
        this.a = linkedHashSet;
        this.b = regex;
        this.c = regex2;
    }
}
