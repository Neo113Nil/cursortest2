package ru.mail.libverify.e;

import ru.mail.verify.core.utils.Gsonable;
import xsna.epx;

/* loaded from: classes9.dex */
public final class a implements Gsonable {

    @ru.mail.libverify.q0.b("name")
    private final String applicationName;

    @ru.mail.libverify.q0.b("hash")
    private final String retrieverHash;

    public a(String str, String str2) {
        this.applicationName = str;
        this.retrieverHash = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.applicationName, aVar.applicationName) && epx.f(this.retrieverHash, aVar.retrieverHash);
    }

    public final int hashCode() {
        return this.retrieverHash.hashCode() + (this.applicationName.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
