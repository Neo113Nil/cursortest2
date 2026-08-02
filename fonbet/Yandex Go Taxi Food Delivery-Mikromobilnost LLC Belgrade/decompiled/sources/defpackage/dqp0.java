package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class dqp0 {
    public final Regex a;
    public final Regex b;
    public final LinkedHashMap c;

    public dqp0(Regex regex, Regex regex2, LinkedHashMap linkedHashMap) {
        this.a = regex;
        this.b = regex2;
        this.c = linkedHashMap;
    }

    public final Map a() {
        return this.c;
    }

    public final Regex b() {
        return this.a;
    }

    public final Regex c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqp0)) {
            return false;
        }
        dqp0 dqp0Var = (dqp0) obj;
        return jl40.l(this.a, dqp0Var.a) && jl40.l(this.b, dqp0Var.b) && this.c.equals(dqp0Var.c);
    }

    public final int hashCode() {
        Regex regex = this.a;
        int hashCode = (regex == null ? 0 : regex.hashCode()) * 31;
        Regex regex2 = this.b;
        return this.c.hashCode() + ((hashCode + (regex2 != null ? regex2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BlackListItem(titleRegex=" + this.a + ", urlRegex=" + this.b + ", additionalRegexes=" + this.c + Extension.C_BRAKE;
    }
}
