package xsna;

import com.vkontakte.android.attachments.VideoAttachment;
import one.video.transform.TransformController;

/* compiled from: ClipVideoAutoPlayHolderWithFooterFactory.kt */
/* loaded from: classes4.dex */
public final class xed extends w3s0 {
    @Override // xsna.w3s0, com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, xsna.eq6
    /* renamed from: z7 */
    public final void c7(VideoAttachment videoAttachment) {
        float width = r7().getWidth() / r7().getHeight();
        Float E0 = this.s0.E0();
        if (E0 != null) {
            this.m0 = width > E0.floatValue() ? TransformController.ScaleType.FIT : TransformController.ScaleType.CROP;
        }
        super.c7(videoAttachment);
    }
}
