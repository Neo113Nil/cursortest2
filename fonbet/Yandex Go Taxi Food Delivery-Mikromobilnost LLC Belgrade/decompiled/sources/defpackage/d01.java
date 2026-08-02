package defpackage;

import android.os.Bundle;
import com.yandex.go.destination_picker.ChooseAddressMode;
import com.yandex.go.search.router.Origin;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.fragment.AddressMapPickerFragment;

/* loaded from: classes6.dex */
public final class d01 {
    public static AddressMapPickerFragment a(int i, PointType pointType, String str, Origin origin, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putInt("title", i);
        bundle.putString("zone_mode", str);
        bundle.putSerializable("point_type", pointType);
        bundle.putSerializable("origin", origin);
        bundle.putBoolean("autolocate_visibility", z);
        bundle.putBoolean("address_confirm_immediately", z2);
        bundle.putBoolean("should_draw_pickup_points", z3);
        bundle.putBoolean("arg_should_show_default_modal_view", z4);
        bundle.putBoolean("arg_allow_pickup_from_photo_entry_point", z5);
        bundle.putBoolean("arg_need_update_position_on_resume", z6);
        bundle.putBoolean("arg_should_show_state_bar_message", z7);
        bundle.putBoolean("arg_should_show_eta_in_pin", z8);
        bundle.putBoolean("arg_blocked_zone_alerts_enabled", z9);
        bundle.putBoolean("arg_route_drawing_enabled", z10);
        AddressMapPickerFragment addressMapPickerFragment = new AddressMapPickerFragment();
        addressMapPickerFragment.setArguments(bundle);
        addressMapPickerFragment.setChooseAddressMode(ChooseAddressMode.OTHER);
        return addressMapPickerFragment;
    }
}
