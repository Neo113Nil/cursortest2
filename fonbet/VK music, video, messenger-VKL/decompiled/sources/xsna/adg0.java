package xsna;

import android.content.Context;
import android.widget.ImageView;
import com.vk.core.ui.image.VKImageController;

/* compiled from: RestrictionImageControllerFactory.kt */
/* loaded from: classes2.dex */
public final class adg0 implements bcr0<ImageView> {
    public static final adg0 a = new adg0();

    @Override // xsna.bcr0
    public final VKImageController<ImageView> create(Context context) {
        return new zcg0(context);
    }
}
