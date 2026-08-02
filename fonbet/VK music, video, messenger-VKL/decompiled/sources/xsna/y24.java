package xsna;

import android.widget.TextView;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.core.ui.swipes.ButtonsSwipeView;
import com.vk.core.view.ProgressButton;
import com.vk.dto.user.RequestUserProfile;
import com.vk.newsfeed.common.recycler.holders.videos.clips.ClipsHolderViewImpl;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.t24;

/* compiled from: AttachMusicTopBarController.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class y24 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y24(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                t24.e eVar = ((x24) this.receiver).d;
                if (eVar != null) {
                    eVar.onClick();
                }
                break;
            case 1:
                ClipsHolderViewImpl clipsHolderViewImpl = (ClipsHolderViewImpl) this.receiver;
                int i = ClipsHolderViewImpl.d0;
                clipsHolderViewImpl.getClass();
                ClipsRouter.c(g620.f().a(), clipsHolderViewImpl.getContext(), ClipsHolderViewImpl.x(new ClipFeedTab.TopVideo(ClipFeedTab.TopVideo.Mode.FROM_RETENTION_BLOCK, null, null, null, null, 30, null)), null, null, null, null, null, false, null, 2044);
                break;
            case 2:
                ((EntriesListPresenter) this.receiver).Y();
                break;
            default:
                ajs ajsVar = (ajs) this.receiver;
                ProgressButton progressButton = ajsVar.E;
                TextView textView = ajsVar.F;
                ajsVar.itemView.setForeground(null);
                ButtonsSwipeView q6 = ajsVar.q6();
                q6.b();
                q6.q = false;
                ajsVar.C.setVisibility(8);
                if (((RequestUserProfile) ajsVar.m).j) {
                    progressButton.setVisibility(8);
                    textView.setVisibility(0);
                    textView.setEnabled(((RequestUserProfile) ajsVar.m).d());
                } else {
                    progressButton.setVisibility(0);
                    textView.setVisibility(8);
                }
                if (ajsVar.H) {
                    ajsVar.itemView.requestLayout();
                }
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y24(Object obj) {
        super(0, obj, x24.class, "onLeftButtonClick", "onLeftButtonClick()V", 0);
        this.b = 0;
    }
}
