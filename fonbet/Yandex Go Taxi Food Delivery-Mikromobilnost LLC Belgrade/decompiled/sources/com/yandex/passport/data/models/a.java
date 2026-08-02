package com.yandex.passport.data.models;

import defpackage.smw0;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class a {
    public final ArrayList a;

    public a(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.a.equals(((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return smw0.m(new StringBuilder("AccountFilterConfig(configEntries="), this.a, ')');
    }
}
