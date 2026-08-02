package xsna;

import android.content.Context;
import com.vk.core.view.components.cell.VkCell;
import com.vk.libvideo.ui.VideoAuthorView;

/* compiled from: VideoAuthorView.kt */
/* loaded from: classes3.dex */
public final class c3s0 implements VkCell.e {
    public final /* synthetic */ VideoAuthorView a;

    public c3s0(VideoAuthorView videoAuthorView) {
        this.a = videoAuthorView;
    }

    @Override // com.vk.core.view.components.cell.VkCell.e
    public final VkCell.d create(Context context) {
        os5 os5Var = new os5(context);
        this.a.k = os5Var.a;
        return os5Var;
    }
}
