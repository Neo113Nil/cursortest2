package xsna;

import kotlin.Pair;

/* compiled from: CommunityCreationOnboardingData.kt */
/* loaded from: classes17.dex */
public final class j0h {
    public final String a;
    public final Pair<Integer, Integer> b;

    public j0h(String str, Pair<Integer, Integer> pair) {
        this.a = str;
        this.b = pair;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0h)) {
            return false;
        }
        j0h j0hVar = (j0h) obj;
        return epx.f(this.a, j0hVar.a) && epx.f(this.b, j0hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommunityCreationOnboardingTitle(text=" + this.a + ", highlightedTokenPosition=" + this.b + ')';
    }
}
