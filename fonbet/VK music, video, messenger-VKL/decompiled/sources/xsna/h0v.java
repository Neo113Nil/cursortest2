package xsna;

/* compiled from: HealthConnectVersionInfo.kt */
/* loaded from: classes12.dex */
public final class h0v {
    public final Integer a;

    public h0v(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0v)) {
            return false;
        }
        h0v h0vVar = (h0v) obj;
        h0vVar.getClass();
        return this.a.equals(h0vVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Integer.hashCode(34) * 31);
    }

    public final String toString() {
        return uqi.b(new StringBuilder("HealthConnectPlatformVersion(buildVersionCode=34, sdkExtensionVersion="), this.a, ')');
    }
}
