package com.google.android.gms.internal.play_billing;

/* loaded from: classes11.dex */
final class zzcd extends zzce {
    public static final zzcd a = new zzcd();

    @Override // com.google.android.gms.internal.play_billing.zzce
    public final int a(zzce zzceVar) {
        return zzceVar == this ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzce
    public final void b(StringBuilder sb) {
        sb.append("(-∞");
    }

    @Override // com.google.android.gms.internal.play_billing.zzce
    public final void c(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((zzce) obj) == this ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzce
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "-∞";
    }
}
