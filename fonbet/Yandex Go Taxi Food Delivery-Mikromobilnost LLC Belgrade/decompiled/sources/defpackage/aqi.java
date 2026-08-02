package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class aqi implements bqi {
    public final fri a;

    public aqi(fri friVar) {
        this.a = friVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aqi) && this.a.equals(((aqi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UrbanAds(urbanAdsSettings=" + this.a + Extension.C_BRAKE;
    }
}
