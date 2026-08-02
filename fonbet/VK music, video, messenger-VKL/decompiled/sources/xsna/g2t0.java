package xsna;

import android.view.ViewGroup;
import com.vk.clips.attachments.impl.views.video.ClipsVideoAttachmentPickerFragment;

/* compiled from: VideoPickerDelegate.kt */
/* loaded from: classes16.dex */
public final class g2t0 extends p1u0<m2t0> {
    public final ClipsVideoAttachmentPickerFragment.c a;

    public g2t0(ClipsVideoAttachmentPickerFragment.c cVar) {
        this.a = cVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends m2t0> b(ViewGroup viewGroup) {
        return new h3t0(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof m2t0;
    }
}
