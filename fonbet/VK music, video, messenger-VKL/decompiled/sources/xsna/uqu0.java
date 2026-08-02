package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.vk.core.view.components.placeholder.VkPlaceholder;

/* compiled from: VkEmptyView.kt */
/* loaded from: classes17.dex */
public final class uqu0 extends FrameLayout {
    public VkPlaceholder b;

    public uqu0(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        VkPlaceholder vkPlaceholder = new VkPlaceholder(context, null, 6);
        this.b = vkPlaceholder;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        s3q0 s3q0Var = s3q0.a;
        super.addView(vkPlaceholder, layoutParams);
    }

    public final void a(com.vk.core.view.components.paging.list.a aVar) {
        uh50 C;
        dak0 j = qak0.j();
        uh50 uh50Var = j instanceof uh50 ? (uh50) j : null;
        if (uh50Var == null || (C = uh50Var.C(null, null)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            dak0 j2 = C.j();
            try {
                this.b.setTop(aVar.a);
                this.b.setMiddle(aVar.b);
                this.b.setBottom(aVar.c);
                s3q0 s3q0Var = s3q0.a;
                C.w().a();
            } finally {
                dak0.q(j2);
            }
        } finally {
        }
    }

    public final void setPlaceholder(VkPlaceholder vkPlaceholder) {
        removeView(this.b);
        vkPlaceholder.setTop(this.b.getTop());
        vkPlaceholder.setMiddle(this.b.getMiddle());
        vkPlaceholder.setBottom(this.b.getBottom());
        this.b = vkPlaceholder;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        s3q0 s3q0Var = s3q0.a;
        super.addView(vkPlaceholder, layoutParams);
    }
}
