package com.google.android.gms.internal.play_billing;

/* loaded from: classes11.dex */
final class zzcb extends zzce {
    public static final zzcb a = new zzcb();

    @Override // com.google.android.gms.internal.play_billing.zzce
    public final int a(zzce zzceVar) {
        return zzceVar == this ? 0 : 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzce
    public final void b(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // com.google.android.gms.internal.play_billing.zzce
    public final void c(StringBuilder sb) {
        sb.append("+∞)");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((zzce) obj) == this ? 0 : 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzce
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "+∞";
    }
}
