package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.video.ui.discovery.minimizable.recycler.similar.SimilarVideoAction;
import xsna.mut0;

/* compiled from: SimilarViewHolder.kt */
/* loaded from: classes7.dex */
public final class voj0 extends vfz<AboutVideoItem.SimilarVideoRedesign> {
    public final goj0 l;
    public final VideoScreenMode m;
    public final wh50 n;
    public final com.vk.movika.sdk.base.logic.processor.d o;

    /* compiled from: SimilarViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SimilarVideoAction.values().length];
            try {
                iArr[SimilarVideoAction.OpenVideo.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SimilarVideoAction.MoreClick.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SimilarVideoAction.AvatarClick.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public voj0(ViewGroup viewGroup, c4 c4Var, goj0 goj0Var, VideoScreenMode videoScreenMode) {
        super(r0);
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        composeView.setViewCompositionStrategy(mut0.c.a);
        this.l = goj0Var;
        this.m = videoScreenMode;
        this.n = androidx.compose.runtime.k.b(null);
        this.o = new com.vk.movika.sdk.base.logic.processor.d(29, this, c4Var);
        ((ComposeView) this.itemView).setContent(new jai(-656973640, new ht7(this, 11), true));
    }

    @Override // xsna.vfz
    public final void W5(AboutVideoItem.SimilarVideoRedesign similarVideoRedesign) {
        AboutVideoItem.SimilarVideoRedesign similarVideoRedesign2 = similarVideoRedesign;
        ((zak0) this.n).setValue(poj0.a(similarVideoRedesign2, this.itemView.getContext(), similarVideoRedesign2.h == AboutVideoItem.SimilarVideoRedesign.Style.NORMAL ? 640 : 142, true));
    }
}
