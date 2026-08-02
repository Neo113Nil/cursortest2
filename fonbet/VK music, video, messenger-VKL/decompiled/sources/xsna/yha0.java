package xsna;

import androidx.recyclerview.widget.m;
import com.vk.superapp.miniapps.picker.PickerItem;

/* compiled from: PickerItemDiffCallback.kt */
/* loaded from: classes6.dex */
public final class yha0 extends m.e<PickerItem> {
    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(PickerItem pickerItem, PickerItem pickerItem2) {
        return pickerItem.equals(pickerItem2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(PickerItem pickerItem, PickerItem pickerItem2) {
        return pickerItem.a() == pickerItem2.a();
    }
}
