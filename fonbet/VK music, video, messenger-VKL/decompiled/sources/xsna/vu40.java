package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PickerTechMetrics;

/* compiled from: MusicPickerSideEffect.kt */
/* loaded from: classes4.dex */
public final class vu40 implements su40 {
    public final PickerTechMetrics a;

    public vu40(PickerTechMetrics pickerTechMetrics) {
        this.a = pickerTechMetrics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vu40) && epx.f(this.a, ((vu40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Send(techMetrics=" + this.a + ')';
    }
}
