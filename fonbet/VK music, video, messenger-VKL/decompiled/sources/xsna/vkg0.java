package xsna;

import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import xsna.pyn;

/* compiled from: VideoAuthorView.kt */
/* loaded from: classes3.dex */
public final class vkg0 implements VkCell.f {
    public final pyn a;
    public final boolean b;
    public final VkButton.Mode c;
    public final int d;
    public final int e;

    public vkg0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkg0)) {
            return false;
        }
        vkg0 vkg0Var = (vkg0) obj;
        return epx.f(this.a, vkg0Var.a) && this.b == vkg0Var.b && this.c == vkg0Var.c && this.d == vkg0Var.d && this.e == vkg0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + shy.a(this.d, qoy.b(qoy.b((this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, false), 961, false), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RightViewParams(donutButtonState=");
        sb.append(this.a);
        sb.append(", isSubscribeButtonVisible=");
        sb.append(this.b);
        sb.append(", subscribeButtonMode=");
        sb.append(this.c);
        sb.append(", isAnalyticsButtonVisible=false, isNotificationButtonVisible=false, notificationIconRes=null, notificationBtnBackground=");
        sb.append(this.d);
        sb.append(", buttonsTint=");
        return vu5.b(sb, this.e, ')');
    }

    public vkg0(int i) {
        pyn.a aVar = pyn.a.a;
        VkButton.Mode mode = VkButton.Mode.Primary;
        this.a = aVar;
        this.b = true;
        this.c = mode;
        this.d = -1;
        this.e = -1;
    }
}
