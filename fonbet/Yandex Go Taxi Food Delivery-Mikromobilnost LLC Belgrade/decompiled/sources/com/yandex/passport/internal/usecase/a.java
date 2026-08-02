package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import defpackage.smw0;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class a {
    public final Environment a;
    public final MasterToken b;
    public final ArrayList c;

    public a(Environment environment, MasterToken masterToken, ArrayList arrayList) {
        this.a = environment;
        this.b = masterToken;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b.equals(aVar.b) && this.c.equals(aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", masterToken=");
        sb.append(this.b);
        sb.append(", allowedAliasTypes=");
        return smw0.m(sb, this.c, ')');
    }
}
