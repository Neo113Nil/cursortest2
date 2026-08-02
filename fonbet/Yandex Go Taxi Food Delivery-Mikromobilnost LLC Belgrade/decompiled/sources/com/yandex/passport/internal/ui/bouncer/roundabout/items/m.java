package com.yandex.passport.internal.ui.bouncer.roundabout.items;

/* loaded from: classes2.dex */
public final class m implements o {
    public final SocialProvider a;

    public m(SocialProvider socialProvider) {
        this.a = socialProvider;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.a == ((m) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Social(provider=" + this.a + ')';
    }
}
