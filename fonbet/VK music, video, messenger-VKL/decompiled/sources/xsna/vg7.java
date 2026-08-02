package xsna;

import java.util.List;

/* compiled from: BlurRecordingState.kt */
/* loaded from: classes17.dex */
public final class vg7 {
    public final wh50<List<lg7>> a;

    public vg7(wh50<List<lg7>> wh50Var) {
        this.a = wh50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vg7) && epx.f(this.a, ((vg7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BlurRecordingState(areas=" + this.a + ')';
    }
}
