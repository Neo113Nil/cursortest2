package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.dto.shortvideo.ClipCameraParams;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vkontakte.android.R;

/* compiled from: ClipsGridChallengeHolder.kt */
/* loaded from: classes17.dex */
public final class hce extends RecyclerView.e0 {
    public final wzs<ClipGridParams.Data, ClipCameraParams, s3q0> l;
    public gce m;
    public final sce n;
    public final VkMiniInfoCell o;
    public final VkMiniInfoCell p;

    /* JADX WARN: Multi-variable type inference failed */
    public hce(ViewGroup viewGroup, wzs<? super ClipGridParams.Data, ? super ClipCameraParams, s3q0> wzsVar) {
        super(tf3.b(viewGroup, R.layout.clip_grid_challenge, viewGroup, false));
        this.l = wzsVar;
        this.n = new sce();
        VkMiniInfoCell vkMiniInfoCell = (VkMiniInfoCell) this.itemView.findViewById(R.id.clip_grid_challenge_info);
        sce.a(vkMiniInfoCell);
        this.o = vkMiniInfoCell;
        VkMiniInfoCell vkMiniInfoCell2 = (VkMiniInfoCell) hvt0.a(R.id.clip_grid_challenge_more_info_btn, this.itemView, new d7(this, 26));
        vkMiniInfoCell2.setMode(VkMiniInfoCell.Mode.MoreInfo);
        vkMiniInfoCell2.setIcon(new VkMiniInfoCell.d(new gko(R.drawable.vk_icon_info_circle_outline_28), null, 6));
        vkMiniInfoCell2.setMiddle(new VkMiniInfoCell.e(tq.h(tlo0.Companion, R.string.clips_grid_challenge_details), false, false, false, false, null, 62));
        this.p = vkMiniInfoCell2;
    }
}
