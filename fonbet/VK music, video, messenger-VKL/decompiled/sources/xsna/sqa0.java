package xsna;

import com.vk.newsfeed.posting.geo_picker.presentation.model.PickerPlaceDto;

/* compiled from: PlacePickerAction.kt */
/* loaded from: classes4.dex */
public final class sqa0 implements com.vk.newsfeed.posting.geo_picker.presentation.a {
    public final PickerPlaceDto b;

    public sqa0(PickerPlaceDto pickerPlaceDto) {
        this.b = pickerPlaceDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sqa0) && epx.f(this.b, ((sqa0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CloseWithResult(place=" + this.b + ')';
    }
}
