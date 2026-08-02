package xsna;

/* compiled from: VkWorkoutsSyncEvent.kt */
/* loaded from: classes6.dex */
public final class l3w0 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public l3w0(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3w0)) {
            return false;
        }
        l3w0 l3w0Var = (l3w0) obj;
        return this.a == l3w0Var.a && epx.f(this.b, l3w0Var.b) && epx.f(this.c, l3w0Var.c) && epx.f(this.d, l3w0Var.d);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkWorkoutsSyncEvent(workoutSyncTime=");
        sb.append(this.a);
        sb.append(", nativeErrorDescription=");
        sb.append(this.b);
        sb.append(", googleFitVersion=");
        sb.append(this.c);
        sb.append(", gmsVersion=");
        return ho8.a(sb, this.d, ')');
    }
}
