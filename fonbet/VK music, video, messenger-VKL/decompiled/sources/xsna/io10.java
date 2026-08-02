package xsna;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import com.vk.core.view.components.cell.VkCell;
import xsna.tlo0;

/* compiled from: MaxMessengerCheckController.kt */
/* loaded from: classes15.dex */
public final class io10 {
    public final ViewStub a;
    public final mo10 b;
    public View c;
    public Button d;
    public boolean e;

    public io10(ViewStub viewStub, mo10 mo10Var) {
        this.a = viewStub;
        this.b = mo10Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i, int i2, int i3) {
        VkCell vkCell;
        View view = this.c;
        if (view == null || (vkCell = (VkCell) view.findViewById(i)) == null) {
            return;
        }
        vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.c(i2, VkCell.Left.Main.Size.Small, (k1u0) null, (tlo0.h) null, 12), null));
        vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(tq.h(tlo0.Companion, i3), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), (VkCell.Middle.d) null, (VkCell.Middle.c) null, (VkCell.Middle.Size) (0 == true ? 1 : 0), 14));
    }
}
