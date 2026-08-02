package com.yandex.passport.internal.ui.bouncer.model;

/* loaded from: classes2.dex */
public final class g0 implements n0 {
    public final SocialContentData a;

    public g0(SocialContentData socialContentData) {
        this.a = socialContentData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && this.a.equals(((g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowSocialContent(contentData=" + this.a + ')';
    }
}
