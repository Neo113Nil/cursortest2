package xsna;

import com.ironsource.InterfaceC4413l1;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import java.util.ArrayList;

/* compiled from: MyTargetInternalNativeAdCarouselUiDto.kt */
/* loaded from: classes4.dex */
public final class wq50 extends ol60 {
    public final gjx h;
    public final MyTargetNativeAdEntry i;
    public final ArrayList j;

    public wq50(gjx gjxVar, MyTargetNativeAdEntry myTargetNativeAdEntry, ArrayList arrayList) {
        super(InterfaceC4413l1.a.b.h, 0, 0, 0, null);
        this.h = gjxVar;
        this.i = myTargetNativeAdEntry;
        this.j = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq50)) {
            return false;
        }
        wq50 wq50Var = (wq50) obj;
        wq50Var.getClass();
        return epx.f(this.h, wq50Var.h) && epx.f(this.i, wq50Var.i) && epx.f(this.j, wq50Var.j);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + (Integer.hashCode(0) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MyTargetInternalNativeAdCarouselUiDto(seqId=0, internalNativeBanner=");
        sb.append(this.h);
        sb.append(", rawEntry=");
        sb.append(this.i);
        sb.append(", cards=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.j);
    }
}
