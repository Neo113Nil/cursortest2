package xsna;

import android.content.Context;
import com.vk.video.ui.smartcrop.api.router.SmartCropArguments;
import com.vk.video.ui.smartcrop.impl.presentation.fragment.SmartCropFragment;

/* compiled from: SmartCropRouterImpl.kt */
/* loaded from: classes7.dex */
public final class g5k0 implements f5k0 {
    @Override // xsna.f5k0
    public final void a(Context context, SmartCropArguments smartCropArguments) {
        SmartCropFragment.a aVar = new SmartCropFragment.a(SmartCropFragment.class, null, null);
        aVar.j.putParcelable("arguments", smartCropArguments);
        aVar.k(context);
    }
}
