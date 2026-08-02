package defpackage;

import android.os.Bundle;
import com.yandex.go.destination_picker.ChooseAddressMode;
import com.yandex.go.search.router.Origin;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.fragment.CustomizedAddressMapPickerFragment;

/* loaded from: classes6.dex */
public final class knf {
    public static CustomizedAddressMapPickerFragment a(int i, PointType pointType, String str, Origin origin, boolean z, boolean z2, int i2, int i3, int i4, int i5, boolean z3) {
        Bundle bundle = new Bundle();
        bundle.putInt("title", i);
        bundle.putString("zone_mode", str);
        bundle.putSerializable("point_type", pointType);
        bundle.putSerializable("origin", origin);
        bundle.putBoolean("autolocate_visibility", z);
        bundle.putBoolean("address_confirm_immediately", z2);
        bundle.putInt("source_pin_drawable", i2);
        bundle.putInt("error_pin_drawable", i3);
        bundle.putInt("bg_color", i4);
        bundle.putInt("content_color", i5);
        bundle.putBoolean("should_draw_pickup_points", z3);
        CustomizedAddressMapPickerFragment customizedAddressMapPickerFragment = new CustomizedAddressMapPickerFragment();
        customizedAddressMapPickerFragment.setArguments(bundle);
        customizedAddressMapPickerFragment.setChooseAddressMode(ChooseAddressMode.OTHER);
        return customizedAddressMapPickerFragment;
    }
}
