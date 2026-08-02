package xsna;

import com.vk.clips.design.view.sidecontrols.side.reactions.ReactionsLoading;

/* compiled from: ReactionsState.kt */
/* loaded from: classes16.dex */
public final class q6f0 {
    public final e7z a;
    public final zbn b;
    public final ReactionsLoading c;

    /* JADX WARN: Multi-variable type inference failed */
    public q6f0() {
        this((e7z) null, (zbn) (0 == true ? 1 : 0), 7);
    }

    public static q6f0 a(q6f0 q6f0Var, e7z e7zVar, zbn zbnVar, ReactionsLoading reactionsLoading, int i) {
        if ((i & 1) != 0) {
            e7zVar = q6f0Var.a;
        }
        if ((i & 2) != 0) {
            zbnVar = q6f0Var.b;
        }
        if ((i & 4) != 0) {
            reactionsLoading = q6f0Var.c;
        }
        q6f0Var.getClass();
        return new q6f0(e7zVar, zbnVar, reactionsLoading);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6f0)) {
            return false;
        }
        q6f0 q6f0Var = (q6f0) obj;
        return epx.f(this.a, q6f0Var.a) && epx.f(this.b, q6f0Var.b) && this.c == q6f0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ReactionsState(likes=" + this.a + ", dislikes=" + this.b + ", loading=" + this.c + ')';
    }

    public q6f0(e7z e7zVar, zbn zbnVar, ReactionsLoading reactionsLoading) {
        this.a = e7zVar;
        this.b = zbnVar;
        this.c = reactionsLoading;
    }

    public /* synthetic */ q6f0(e7z e7zVar, zbn zbnVar, int i) {
        this((i & 1) != 0 ? new e7z((w6z) null, 3) : e7zVar, (i & 2) != 0 ? new zbn((xbn) null, 3) : zbnVar, ReactionsLoading.NONE);
    }
}
