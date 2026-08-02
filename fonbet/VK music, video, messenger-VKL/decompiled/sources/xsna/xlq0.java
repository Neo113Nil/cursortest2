package xsna;

import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetRecomResponseDto;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoOwner;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.log.L;
import com.vk.video.ui.upload.impl.videoviewer.presentation.feature.entity.VideoViewerState;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.bcp0;
import xsna.cvw0;
import xsna.f5h0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class xlq0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ xlq0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UIBlockTopshelf.TopshelfItem topshelfItem;
        VideoFile videoFile;
        switch (this.b) {
            case 0:
                ojt ojtVar = (ojt) obj;
                ojtVar.l = f5h0.o.a;
                ojtVar.m = new PointF(1.0f, 0.5f);
                return s3q0.a;
            case 1:
                Throwable th = (Throwable) obj;
                L.i(th);
                if (!(th instanceof IllegalStateException)) {
                    cvk.u(R.string.common_network_error, false);
                }
                return s3q0.a;
            case 2:
                return Boolean.valueOf(com.vk.libvideo.api.minimizable.a.h((VideoMinimizableState) obj));
            case 3:
                iss0.a.getClass();
                return new Pair(obj, new VideoOwner(-1, UserId.d));
            case 4:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 5:
                RecyclerView.e0 e0Var = (RecyclerView.e0) obj;
                RecyclerView.Adapter<? extends RecyclerView.e0> bindingAdapter = e0Var.getBindingAdapter();
                xcp0 xcp0Var = bindingAdapter instanceof xcp0 ? (xcp0) bindingAdapter : null;
                int bindingAdapterPosition = e0Var.getBindingAdapterPosition();
                if (xcp0Var == null) {
                    return null;
                }
                bcp0.b bVar = xcp0Var.q;
                String r = (bVar == null || (topshelfItem = (UIBlockTopshelf.TopshelfItem) j5g.b0(bindingAdapterPosition, bVar.a)) == null || (videoFile = topshelfItem.c) == null) ? null : videoFile.r();
                if (r != null) {
                    return new flt0(bindingAdapterPosition, r);
                }
                return null;
            case 6:
                return VideoViewerState.a((VideoViewerState) obj, null, null, false, 0L, 0L, 27);
            case 7:
                return i0f.a((ShortVideoGetRecomResponseDto) obj, null);
            default:
                return cvw0.c.a;
        }
    }
}
