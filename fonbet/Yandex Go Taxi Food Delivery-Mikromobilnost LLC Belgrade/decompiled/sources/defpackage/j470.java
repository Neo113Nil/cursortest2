package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class j470 extends mr {
    public final String a;
    public final z220 b;
    public final String c;
    public final MapBuilder d;

    public j470(String str, z220 z220Var, String str2, MapBuilder mapBuilder) {
        this.a = str;
        this.b = z220Var;
        this.c = str2;
        this.d = mapBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j470)) {
            return false;
        }
        j470 j470Var = (j470) obj;
        return jl40.l(this.a, j470Var.a) && this.b.equals(j470Var.b) && jl40.l(this.c, j470Var.c) && this.d.equals(j470Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "OpenChat(title=" + this.a + ", messengerParams=" + this.b + ", imageTag=" + this.c + ", analyticsAttrs=" + this.d + Extension.C_BRAKE;
    }
}
