package xsna;

import android.text.TextUtils;
import android.util.Size;
import android.view.ViewGroup;
import com.vk.clips.attachments.impl.views.video.ClipsVideoAttachmentPickerFragment;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.Owner;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import xsna.mto0;
import xsna.tlo0;
import xsna.zmf;

/* compiled from: VideoPickerViewHolder.kt */
/* loaded from: classes16.dex */
public final class h3t0 extends vfz<m2t0> {
    public final izs<com.vk.clips.attachments.impl.views.video.a, s3q0> l;
    public final VkCell m;
    public final Object n;

    public h3t0(ViewGroup viewGroup, ClipsVideoAttachmentPickerFragment.c cVar) {
        super(R.layout.video_picker_item, viewGroup);
        this.l = cVar;
        this.m = (VkCell) this.itemView.findViewById(R.id.video_attachment_cell);
        this.n = msy.a(LazyThreadSafetyMode.NONE, new cy20(21));
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vfz
    public final void W5(m2t0 m2t0Var) {
        n2t0 n2t0Var = m2t0Var.b;
        boolean z = n2t0Var.b;
        Serializer.c<Owner> cVar = Owner.CREATOR;
        VideoFile videoFile = n2t0Var.a;
        String a = Owner.a.a(iah0.a((int) b6().getDimension(R.dimen.video_attachment_cover_width)), videoFile.getImage());
        DecimalFormat decimalFormat = z8s.a;
        String e = z8s.e(videoFile.L8(), this.itemView.getContext());
        ?? r7 = this.n;
        ((StringBuffer) r7.getValue()).setLength(0);
        mto0.a(TimeUnit.SECONDS.toMillis(videoFile.b0()), (StringBuffer) r7.getValue(), mto0.a.C3369a.g);
        zmf zmfVar = new zmf();
        VkCell vkCell = this.m;
        vkCell.setLeftMainViewController(zmfVar);
        VkCell.Left.Main.e eVar = new VkCell.Left.Main.e(new zmf.b(a, videoFile.getDuration()), new Size(e3m.a(R.dimen.video_attachment_cover_width, this.itemView.getContext()), e3m.a(R.dimen.video_attachment_cover_height, this.itemView.getContext())));
        VkCell.Right.d dVar = null;
        vkCell.setLeft(new VkCell.Left.b(eVar, null));
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        tlo0.h f = u11.f(tlo0.Companion, gpt0.v(videoFile));
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_CLIP_ATTACH_VIDEO;
        videoFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        vkCell.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(f, bVar.a(videoFeatures) ? 2 : Integer.MAX_VALUE, bVar.a(videoFeatures) ? TextUtils.TruncateAt.END : null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d(new tlo0.h(this.itemView.getContext().getString(R.string.clips_video_attachment_info, e, ((StringBuffer) r7.getValue()).toString())), (gzs) null, 1, TextUtils.TruncateAt.END, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), null, 12));
        if (!bVar.a(videoFeatures)) {
            dVar = new VkCell.Right.d((VkCell.Right.a) null, (VkCell.Right.e) null, new VkCell.Right.ExtraAction.a(6, null, z), (VkCell.Right.b) null, 27);
        } else if (z) {
            dVar = new VkCell.Right.d((VkCell.Right.a) null, (VkCell.Right.e) null, new VkCell.Right.ExtraAction.a(6, null, true), (VkCell.Right.b) null, 27);
        }
        vkCell.setRight(dVar);
        vkCell.setOnClickListener(new com.vk.im.video.c(4, n2t0Var, this));
        vkCell.setEnabledAppearance(n2t0Var.c);
    }
}
