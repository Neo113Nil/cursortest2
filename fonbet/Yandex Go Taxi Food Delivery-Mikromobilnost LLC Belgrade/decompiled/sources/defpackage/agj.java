package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class agj {
    public final sls a;

    public agj(sls slsVar) {
        this.a = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agj) && this.a.equals(((agj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DialogueButtonClicked(clickCallBack=" + this.a + Extension.C_BRAKE;
    }
}
