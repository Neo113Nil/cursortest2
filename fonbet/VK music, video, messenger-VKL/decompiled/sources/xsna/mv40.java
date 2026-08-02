package xsna;

/* compiled from: MusicPlayerEvents.kt */
/* loaded from: classes3.dex */
public final class mv40 implements yj40 {
    public static final mv40 a = new mv40();
    public static final String b = "MusicPlayerAdStartedEvent";

    @Override // xsna.yj40
    public final String a() {
        return "";
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mv40);
    }

    @Override // xsna.yj40
    public final String getTag() {
        return b;
    }

    public final int hashCode() {
        return 147235970;
    }

    public final String toString() {
        return "MusicPlayerAdStartedEvent";
    }
}
