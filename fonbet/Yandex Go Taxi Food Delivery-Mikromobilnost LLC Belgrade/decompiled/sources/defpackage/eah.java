package defpackage;

import com.yandex.quark.alice.AliceModelType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class eah implements odj {
    public final gej a;
    public final String b;
    public final AliceModelType c;

    public eah(gej gejVar, String str, AliceModelType aliceModelType) {
        this.a = gejVar;
        this.b = str;
        this.c = aliceModelType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eah)) {
            return false;
        }
        eah eahVar = (eah) obj;
        return this.a.equals(eahVar.a) && this.b.equals(eahVar.b) && this.c == eahVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "DefaultDialogContext(dialogId=" + this.a + ", folderId=" + qwr.a(this.b) + ", aliceModelType=" + this.c + Extension.C_BRAKE;
    }
}
