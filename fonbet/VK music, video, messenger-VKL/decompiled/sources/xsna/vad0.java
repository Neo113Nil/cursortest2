package xsna;

import android.content.Context;
import android.graphics.Point;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.util.measure.ScaleType;
import com.vk.dto.common.VideoFile;
import com.vk.feed.tool.view.newsfeed.attach.PrimaryAttachmentLayout;
import com.vk.feed.tool.view.newsfeed.attach.PrimaryVideoWrapperView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;

/* compiled from: PrimaryVideoHolder.kt */
/* loaded from: classes4.dex */
public final class vad0 extends m56<VideoAttachment> {
    public static final /* synthetic */ int G = 0;
    public final com.vk.newsfeed.common.recycler.holders.i D;
    public final PrimaryAttachmentLayout E;
    public final PrimaryVideoWrapperView F;

    public vad0(PrimaryAttachmentLayout primaryAttachmentLayout, com.vk.newsfeed.common.recycler.holders.i iVar) {
        super(primaryAttachmentLayout);
        this.D = iVar;
        this.E = (PrimaryAttachmentLayout) primaryAttachmentLayout.findViewById(R.id.attach);
        this.F = (PrimaryVideoWrapperView) primaryAttachmentLayout.findViewById(R.id.primary_video_wrap);
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.D.Q6(s6oVar);
    }

    @Override // xsna.m56
    public final void T6(VideoAttachment videoAttachment) {
        VideoAttachment videoAttachment2 = videoAttachment;
        s1c0 s1c0Var = this.x;
        this.E.setHeightMatchContent(!(s1c0Var != null && s1c0Var.l));
        s1c0 s1c0Var2 = this.x;
        ScaleType a = tks0.a(t6(), s1c0Var2 != null && s1c0Var2.l);
        com.vk.newsfeed.common.recycler.holders.i iVar = this.D;
        iVar.e0 = a;
        iVar.N.setScaleType(a);
        s1c0 s1c0Var3 = this.x;
        boolean z = s1c0Var3 != null && s1c0Var3.l;
        PrimaryVideoWrapperView primaryVideoWrapperView = this.F;
        if (primaryVideoWrapperView.b != z) {
            primaryVideoWrapperView.b = z;
            primaryVideoWrapperView.requestLayout();
        }
        s1c0 s1c0Var4 = this.x;
        if (s1c0Var4 == null || !s1c0Var4.l) {
            Context context = this.itemView.getContext();
            VideoFile videoFile = videoAttachment2.k;
            float height = (videoFile.getWidth() <= 0 || videoFile.getHeight() <= 0) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : videoFile.getHeight() / videoFile.getWidth();
            boolean s = iah0.s(context);
            Point j = iah0.j(context);
            float f = j.y;
            float f2 = j.x;
            iVar.Q.setRatio(Math.max(Math.min(height, (!s ? f2 / f : f / f2) > 2.0f ? 1.25f : 1.3333334f), 0.5625f));
        }
        iVar.itemView.setPadding(0, 0, 0, 0);
    }

    @Override // xsna.m56, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        com.vk.newsfeed.common.recycler.holders.i iVar = this.D;
        iVar.Y = true;
        iVar.a6(u1c0Var);
        super.a6(u1c0Var);
    }
}
