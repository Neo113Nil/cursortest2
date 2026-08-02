package xsna;

import xsna.rwu;

/* compiled from: FileSettings.kt */
/* loaded from: classes.dex */
public final class jar {
    public final String a;
    public final String b;
    public final rwu c;
    public final String d;

    public jar(String str, String str2, rwu rwuVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = rwuVar;
        this.d = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [xsna.rwu] */
    public static jar a(jar jarVar, rwu.a aVar, String str, int i) {
        String str2 = jarVar.a;
        String str3 = jarVar.b;
        rwu.a aVar2 = aVar;
        if ((i & 4) != 0) {
            aVar2 = jarVar.c;
        }
        if ((i & 8) != 0) {
            str = jarVar.d;
        }
        jarVar.getClass();
        jarVar.getClass();
        return new jar(str2, str3, aVar2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jar)) {
            return false;
        }
        jar jarVar = (jar) obj;
        return epx.f(this.a, jarVar.a) && epx.f(this.b, jarVar.b) && epx.f(this.c, jarVar.c) && epx.f(this.d, jarVar.d);
    }

    public final int hashCode() {
        return ((this.d.hashCode() + ((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31) - 940873319;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileSettings(appId=");
        sb.append(this.a);
        sb.append(", dir=");
        sb.append(this.b);
        sb.append(", header=");
        sb.append(this.c);
        sb.append(", fileName=");
        return i5s.a(sb, this.d, ", archiveName=VK.logup.zip)");
    }
}
