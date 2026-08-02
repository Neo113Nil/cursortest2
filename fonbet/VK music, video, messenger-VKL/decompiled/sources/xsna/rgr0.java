package xsna;

import android.content.Context;
import com.vk.core.ui.image.VKImageController;
import com.vk.imageloader.view.VKImageView;

/* compiled from: VKSuperappImageControllerFactory.kt */
/* loaded from: classes6.dex */
public final class rgr0 implements bcr0<VKImageView> {
    public static final rgr0 a = new rgr0();

    @Override // xsna.bcr0
    public final VKImageController<VKImageView> create(Context context) {
        return new qgr0(context);
    }
}
