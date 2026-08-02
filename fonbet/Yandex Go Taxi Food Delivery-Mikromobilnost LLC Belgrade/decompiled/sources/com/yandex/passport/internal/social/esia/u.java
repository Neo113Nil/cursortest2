package com.yandex.passport.internal.social.esia;

/* loaded from: classes15.dex */
public final class u implements x {
    public final EsiaException a;

    public u(EsiaException esiaException) {
        this.a = esiaException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.a == ((u) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EsiaError(exception=" + this.a + ')';
    }
}
