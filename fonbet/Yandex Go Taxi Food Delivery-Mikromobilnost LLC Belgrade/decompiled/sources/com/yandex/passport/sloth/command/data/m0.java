package com.yandex.passport.sloth.command.data;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes2.dex */
public final class m0 {
    public static final l0 Companion = new l0();
    public static final KSerializer[] b = {com.yandex.passport.common.url.b.Companion.serializer()};
    public final String a;

    public /* synthetic */ m0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, k0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        String str = ((m0) obj).a;
        String str2 = this.a;
        if (str2 == null) {
            if (str == null) {
                l = true;
            }
            l = false;
        } else {
            if (str != null) {
                l = jl40.l(str2, str);
            }
            l = false;
        }
        return l;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SamlSsoAuthData(authUrl=");
        String str = this.a;
        sb.append((Object) (str == null ? "null" : com.yandex.passport.common.url.b.l(str)));
        sb.append(')');
        return sb.toString();
    }
}
