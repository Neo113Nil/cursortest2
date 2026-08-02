package xsna;

import com.vk.dto.common.GoodAlbum;
import com.vk.ecomm.storefront.impl.albums.presentation.model.LoadingState;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: StorefrontAlbumsState.kt */
/* loaded from: classes18.dex */
public final class ukl0 implements lm50 {
    public final mpl0 b;
    public final List<GoodAlbum> c;
    public final int d;
    public final int e;
    public final r3p0 f;
    public final LoadingState g;

    public ukl0() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ukl0 a(ukl0 ukl0Var, ArrayList arrayList, int i, r3p0 r3p0Var, LoadingState loadingState, int i2) {
        mpl0 mpl0Var = ukl0Var.b;
        List list = arrayList;
        if ((i2 & 2) != 0) {
            list = ukl0Var.c;
        }
        List list2 = list;
        if ((i2 & 4) != 0) {
            i = ukl0Var.d;
        }
        int i3 = i;
        int i4 = ukl0Var.e;
        if ((i2 & 16) != 0) {
            r3p0Var = ukl0Var.f;
        }
        r3p0 r3p0Var2 = r3p0Var;
        if ((i2 & 32) != 0) {
            loadingState = ukl0Var.g;
        }
        ukl0Var.getClass();
        return new ukl0(mpl0Var, list2, i3, i4, r3p0Var2, loadingState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ukl0)) {
            return false;
        }
        ukl0 ukl0Var = (ukl0) obj;
        return epx.f(this.b, ukl0Var.b) && epx.f(this.c, ukl0Var.c) && this.d == ukl0Var.d && this.e == ukl0Var.e && epx.f(this.f, ukl0Var.f) && this.g == ukl0Var.g;
    }

    public final int hashCode() {
        mpl0 mpl0Var = this.b;
        return this.g.hashCode() + ((this.f.hashCode() + shy.a(this.e, shy.a(this.d, fw3.a((mpl0Var == null ? 0 : mpl0Var.hashCode()) * 31, 31, this.c), 31), 31)) * 31);
    }

    public final String toString() {
        return "StorefrontAlbumsState(viewedItems=" + this.b + ", albums=" + this.c + ", offset=" + this.d + ", total=" + this.e + ", toolbarState=" + this.f + ", loadingState=" + this.g + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ukl0(mpl0 mpl0Var, List<? extends GoodAlbum> list, int i, int i2, r3p0 r3p0Var, LoadingState loadingState) {
        this.b = mpl0Var;
        this.c = list;
        this.d = i;
        this.e = i2;
        this.f = r3p0Var;
        this.g = loadingState;
    }

    public ukl0(int i) {
        this(null, EmptyList.b, 0, 0, new r3p0(0), LoadingState.Full);
    }
}
