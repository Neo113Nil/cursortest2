package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.sharing.api.dto.Target;

/* compiled from: PostingAvatarView.kt */
/* loaded from: classes4.dex */
public final class edc0 extends FrameLayout implements fdc0 {
    public final VKCircleImageView b;

    public edc0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new VKCircleImageView(context);
    }

    @Override // xsna.fdc0
    public final void q(Target target, Drawable drawable) {
        VKCircleImageView vKCircleImageView = this.b;
        if (drawable != null) {
            vKCircleImageView.setPlaceholderImage(drawable);
        }
        vKCircleImageView.o0(target.f, null);
    }

    @Override // xsna.ts5
    public View getView() {
        return this;
    }
}
