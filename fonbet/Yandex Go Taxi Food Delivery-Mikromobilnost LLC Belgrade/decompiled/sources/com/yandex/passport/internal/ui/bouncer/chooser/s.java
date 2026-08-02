package com.yandex.passport.internal.ui.bouncer.chooser;

import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes2.dex */
public final class s implements t {
    public final List a;

    public s(ListBuilder listBuilder) {
        this.a = listBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && jl40.l(this.a, ((s) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.t(new StringBuilder("SetMasterChooserItems(value="), this.a, ')');
    }
}
