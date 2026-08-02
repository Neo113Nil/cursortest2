package defpackage;

import com.yandex.go.destination_picker.ChooseAddressMode;
import ru.yandex.taxi.masstransit.address.ui.MtAddressMapPickerFragment;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class hc30 {
    public static MtAddressMapPickerFragment a(PointType pointType, pv0 pv0Var, zzs zzsVar) {
        Integer valueOf;
        MtAddressMapPickerFragment mtAddressMapPickerFragment = new MtAddressMapPickerFragment();
        int[] iArr = gc30.a;
        int i = iArr[pointType.ordinal()];
        boolean z = true;
        if (i == 1) {
            valueOf = Integer.valueOf(kyh0.new_point_selection_screen_starting_point_title_statement);
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            valueOf = Integer.valueOf(kyh0.new_point_selection_screen_destination_point_title_statement);
        }
        mtAddressMapPickerFragment.titleResId = valueOf;
        mtAddressMapPickerFragment.pointType = pointType;
        int i2 = iArr[pointType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            z = false;
        }
        mtAddressMapPickerFragment.isAutolocateVisible = z;
        mtAddressMapPickerFragment.setChooseAddressMode(ChooseAddressMode.OTHER);
        if (pv0Var != null) {
            mtAddressMapPickerFragment.setInitialAddress(pv0Var);
            return mtAddressMapPickerFragment;
        }
        mtAddressMapPickerFragment.updateInitialPoint(zzsVar);
        return mtAddressMapPickerFragment;
    }
}
