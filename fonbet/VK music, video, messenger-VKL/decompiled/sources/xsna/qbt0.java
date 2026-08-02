package xsna;

import androidx.recyclerview.widget.m;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.items.payload.VideoRelatedVideoItemChangePayload;

/* compiled from: VideoRelatedVideosAdapter.kt */
/* loaded from: classes7.dex */
public final class qbt0 extends m.e<hfz> {
    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(hfz hfzVar, hfz hfzVar2) {
        return hfzVar.equals(hfzVar2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(hfz hfzVar, hfz hfzVar2) {
        hfz hfzVar3 = hfzVar;
        hfz hfzVar4 = hfzVar2;
        return hfzVar3.getClass().equals(hfzVar4.getClass()) && epx.f(hfzVar3.getItemId(), hfzVar4.getItemId());
    }

    @Override // androidx.recyclerview.widget.m.e
    public final Object getChangePayload(hfz hfzVar, hfz hfzVar2) {
        hfz hfzVar3 = hfzVar;
        hfz hfzVar4 = hfzVar2;
        if ((hfzVar3 instanceof mbt0) && (hfzVar4 instanceof mbt0) && ((mbt0) hfzVar3).d != ((mbt0) hfzVar4).d) {
            return VideoRelatedVideoItemChangePayload.IsCurrent;
        }
        return null;
    }
}
