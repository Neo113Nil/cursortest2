package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ldw0 implements mdw0 {
    public final String a;

    public /* synthetic */ ldw0(String str) {
        this.a = str;
    }

    public static final /* synthetic */ ldw0 a(String str) {
        return new ldw0(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ldw0) {
            return this.a.equals(((ldw0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Static(text=" + ((Object) this.a) + Extension.C_BRAKE;
    }
}
