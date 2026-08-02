package com.yandex.passport.internal.ui.bouncer.challenge;

/* loaded from: classes2.dex */
public final class j implements l {
    public final o a;

    public j(o oVar) {
        this.a = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.a.equals(((j) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a.a);
    }

    public final String toString() {
        return "ChallengeFinished(challengeResult=" + this.a + ')';
    }
}
