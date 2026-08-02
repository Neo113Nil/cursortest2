package xsna;

import com.vk.superapp.vkworkout.types.SyncWorkoutReason;

/* compiled from: SyncWorkoutData.kt */
/* loaded from: classes6.dex */
public final class ton0 {
    public final SyncWorkoutReason a;
    public final boolean b;

    public ton0(SyncWorkoutReason syncWorkoutReason, boolean z) {
        this.a = syncWorkoutReason;
        this.b = z;
    }

    public final SyncWorkoutReason a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ton0)) {
            return false;
        }
        ton0 ton0Var = (ton0) obj;
        return this.a == ton0Var.a && this.b == ton0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyncWorkoutData(syncWorkoutReason=");
        sb.append(this.a);
        sb.append(", needUpdateWorkoutsCache=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
