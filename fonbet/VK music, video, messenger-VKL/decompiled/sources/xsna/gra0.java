package xsna;

import com.vk.newsfeed.posting.geo_picker.presentation.model.PickerPlaceDto;

/* compiled from: PlacePickerPlaceItem.kt */
/* loaded from: classes4.dex */
public final class gra0 extends yqa0 {
    public final PickerPlaceDto a;
    public final String b;

    public gra0(PickerPlaceDto pickerPlaceDto) {
        String str = pickerPlaceDto.d;
        this.a = pickerPlaceDto;
        String str2 = pickerPlaceDto.e;
        if (str2 != null && str2.length() != 0 && str != null && str.length() != 0) {
            str = str2 + " · " + str;
        } else if (str2 != null && str2.length() != 0) {
            str = str2;
        } else if (str == null || str.length() == 0) {
            str = "";
        }
        this.b = str;
    }
}
