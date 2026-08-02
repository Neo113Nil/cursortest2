package xsna;

import com.vk.video.ui.upload.api.router.PublishArguments;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragment;

/* compiled from: UploadRouterImpl.kt */
/* loaded from: classes7.dex */
public final class kcq0 implements jcq0 {
    @Override // xsna.jcq0
    public final void a(bc6 bc6Var, PublishArguments publishArguments) {
        PublishFragment.a aVar = new PublishFragment.a(PublishFragment.class, null, null);
        aVar.j.putParcelable("arguments", publishArguments);
        aVar.m(bc6Var);
    }
}
