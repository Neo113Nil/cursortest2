package xsna;

import com.vkontakte.android.R;

/* compiled from: MediaCellHolderItem.kt */
/* loaded from: classes17.dex */
public final class dhw extends xp10 {
    public final ehw a;

    public dhw(ehw ehwVar) {
        this.a = ehwVar;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.ds_image_cell_holder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dhw) && epx.f(this.a, ((dhw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ImageCellHolderItem(data=" + this.a + ')';
    }
}
