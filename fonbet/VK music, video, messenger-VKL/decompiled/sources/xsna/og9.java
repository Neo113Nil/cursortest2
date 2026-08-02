package xsna;

import com.vkontakte.android.R;

/* compiled from: MediaCellHolderItem.kt */
/* loaded from: classes17.dex */
public final class og9 extends xp10 {
    public final boolean a;

    public og9(boolean z) {
        this.a = z;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.ds_camera_cell_holder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof og9) && this.a == ((og9) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("CameraCellHolderItem(isEnabled="), this.a, ')');
    }
}
