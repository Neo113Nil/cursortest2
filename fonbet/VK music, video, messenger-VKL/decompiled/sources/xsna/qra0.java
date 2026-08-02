package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PickerTechMetrics;

/* compiled from: PlacePickerSideEffect.kt */
/* loaded from: classes4.dex */
public final class qra0 implements com.vk.newsfeed.posting.geo_picker.presentation.i {
    public final PickerTechMetrics a;

    public qra0(PickerTechMetrics pickerTechMetrics) {
        this.a = pickerTechMetrics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qra0) && epx.f(this.a, ((qra0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Send(techMetrics=" + this.a + ')';
    }
}
