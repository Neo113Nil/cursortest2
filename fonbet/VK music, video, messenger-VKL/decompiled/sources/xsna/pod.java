package xsna;

import android.content.Context;
import com.vk.clips.attachments.api.publish.cta.ClipsCtaAttachEntryParams;
import com.vk.clips.attachments.impl.publish.cta.donut.presentation.fragment.ClipCtaWithDonutFragment;

/* compiled from: ClipsCtaPickerLauncherImpl.kt */
/* loaded from: classes16.dex */
public final class pod implements ood {
    @Override // xsna.ood
    public final void a(ClipsCtaAttachEntryParams clipsCtaAttachEntryParams, Context context) {
        ClipCtaWithDonutFragment.a aVar = new ClipCtaWithDonutFragment.a(ClipCtaWithDonutFragment.class, null, null);
        aVar.j.putParcelable("clip_cta_buttons_arg_key", clipsCtaAttachEntryParams);
        aVar.k(context);
    }
}
