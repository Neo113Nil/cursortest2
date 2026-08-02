package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class m implements n {
    public final com.yandex.passport.internal.sloth.performers.webcard.f a;

    public m(com.yandex.passport.internal.sloth.performers.webcard.f fVar) {
        this.a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && jl40.l(this.a, ((m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WebCardEventAction(event=" + this.a + ')';
    }
}
