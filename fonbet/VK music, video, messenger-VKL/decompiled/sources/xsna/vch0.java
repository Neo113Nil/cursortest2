package xsna;

import com.vk.clips.sdk.shared.feed.controller.mvi.state.spinner.ClipSpinnerEntryPoint;

/* compiled from: ScreenSpinnerState.kt */
/* loaded from: classes17.dex */
public final class vch0 implements uch0 {
    public final ClipSpinnerEntryPoint b;

    public vch0(ClipSpinnerEntryPoint clipSpinnerEntryPoint) {
        this.b = clipSpinnerEntryPoint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vch0) && this.b == ((vch0) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Loading(reason=" + this.b + ')';
    }
}
