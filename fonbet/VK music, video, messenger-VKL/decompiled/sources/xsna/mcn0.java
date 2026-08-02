package xsna;

import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SuperAppTileWidgetsRowContainerItem.kt */
/* loaded from: classes6.dex */
public final class mcn0 extends g9n0 {
    public final int c;
    public final int d;
    public final ArrayList e;

    public mcn0(ArrayList arrayList, int i, int i2) {
        super(i);
        this.c = i;
        this.d = i2;
        this.e = arrayList;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_tile_widgets_container;
    }

    @Override // xsna.g9n0
    public final int c() {
        return this.c;
    }

    @Override // xsna.g9n0
    public final List<f9n0> d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcn0)) {
            return false;
        }
        mcn0 mcn0Var = (mcn0) obj;
        return this.c == mcn0Var.c && this.d == mcn0Var.d && epx.f(this.e, mcn0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + shy.a(this.d, Integer.hashCode(this.c) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppTileWidgetsRowContainerItem(containerId=");
        sb.append(this.c);
        sb.append(", columnCount=");
        sb.append(this.d);
        sb.append(", tiles=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.e);
    }
}
