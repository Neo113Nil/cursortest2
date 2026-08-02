package xsna;

import android.content.Context;
import com.vk.clips.sdk.shared.api.comment.SdkReplyInfo;
import com.vk.clips.sdk.shared.api.external.action.ClipExternalAction;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.common.links.LaunchContext;
import com.vk.libvideo.models.comment.ReplyInfo;
import com.vk.log.L;
import com.vk.profile.community.impl.ui.widget.CommunityWidgetPreviewFragment;
import com.vk.voip.ui.view.VoipActionMultiLineView;
import com.vkontakte.android.R;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import ru.ok.android.utils.Logger;
import xsna.aqf;
import xsna.npf;
import xsna.xn50;

/* compiled from: BroadcastConfigView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class xd8 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v43, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ClipExternalAction.ShowActionButton showActionButton;
        Set dataOrigins;
        switch (this.b) {
            case 0:
                ke8 ke8Var = (ke8) this.receiver;
                VoipActionMultiLineView voipActionMultiLineView = ke8Var.o;
                ke8Var.u.getClass();
                voipActionMultiLineView.setSubtitle(gdp.a((String) obj));
                return s3q0.a;
            case 1:
                L.i((Throwable) obj);
                return s3q0.a;
            case 2:
                aqf aqfVar = (aqf) obj;
                ((bqf) this.receiver).getClass();
                if (aqfVar instanceof aqf.a) {
                    return new npf.e.a(((aqf.a) aqfVar).a);
                }
                if (aqfVar instanceof aqf.b) {
                    return new npf.n(((aqf.b) aqfVar).a);
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.receiver;
                int i = ClipsWrapperFragment.Q0;
                clipsWrapperFragment.getClass();
                ClipFeedOpenAction clipFeedOpenAction = ((ssf) obj).a;
                if (clipFeedOpenAction instanceof ClipFeedOpenAction.OpenComments) {
                    ClipFeedListFragment lo = clipsWrapperFragment.lo();
                    if (lo != null) {
                        SdkReplyInfo sdkReplyInfo = ((ClipFeedOpenAction.OpenComments) clipFeedOpenAction).b;
                        ReplyInfo replyInfo = new ReplyInfo(sdkReplyInfo.b, sdkReplyInfo.c);
                        Object b0 = j5g.b0(0, lo.ro());
                        FeedItem.n nVar = b0 instanceof FeedItem.n ? (FeedItem.n) b0 : null;
                        lo.Io(nVar != null ? nVar.W() : null, lo.getString(R.string.comments), replyInfo);
                    }
                } else if (clipFeedOpenAction instanceof ClipFeedOpenAction.ShowInterestsChoice) {
                    xn50.a.c(clipsWrapperFragment, npf.h.f.b);
                } else if (clipFeedOpenAction instanceof ClipFeedOpenAction.ShowLogin) {
                    xn50.a.c(clipsWrapperFragment, npf.h.C3409h.b);
                } else if (clipFeedOpenAction instanceof ClipFeedOpenAction.OpenDiscover) {
                    xn50.a.c(clipsWrapperFragment, npf.h.m.b);
                } else {
                    if (!(clipFeedOpenAction instanceof ClipFeedOpenAction.ShowActionButton)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ClipFeedListFragment lo2 = clipsWrapperFragment.lo();
                    if (lo2 != null) {
                        ClipFeedOpenAction.ShowActionButton showActionButton2 = (ClipFeedOpenAction.ShowActionButton) clipFeedOpenAction;
                        String str = showActionButton2.b;
                        int i2 = ClipsWrapperFragment.b.$EnumSwitchMapping$1[showActionButton2.c.ordinal()];
                        if (i2 == 1) {
                            showActionButton = ClipExternalAction.ShowActionButton.INACTIVE;
                        } else {
                            if (i2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            showActionButton = ClipExternalAction.ShowActionButton.ACTIVE;
                        }
                        ((y1e) lo2.j0.getValue()).b(new qvc(str, showActionButton));
                    }
                }
                return s3q0.a;
            case 4:
                String str2 = (String) obj;
                CommunityWidgetPreviewFragment communityWidgetPreviewFragment = (CommunityWidgetPreviewFragment) this.receiver;
                int i3 = CommunityWidgetPreviewFragment.U;
                Context mo2getContext = communityWidgetPreviewFragment.mo2getContext();
                if (mo2getContext != null) {
                    maz.c((maz) communityWidgetPreviewFragment.S.getValue(), mo2getContext, str2, LaunchContext.A, null, null, 24);
                }
                return s3q0.a;
            case 5:
                ((cfm) this.receiver).B((u8m) obj);
                return s3q0.a;
            case 6:
                ((juq) this.receiver).a((com.vk.newsfeed.posting.geo_picker.presentation.g) obj);
                return s3q0.a;
            case 7:
                dataOrigins = q81.a(this.receiver).getDataOrigins(vw6.b(obj));
                return dataOrigins;
            case 8:
                mhg0 mhg0Var = (mhg0) this.receiver;
                mhg0Var.getClass();
                xn50.a.c(mhg0Var, (ehg0) obj);
                return s3q0.a;
            case 9:
                jfl0 jfl0Var = (jfl0) this.receiver;
                jfl0Var.getClass();
                xn50.a.c(jfl0Var, (sx40) obj);
                return s3q0.a;
            case 10:
                ((com.vk.video.profile.presentation.c) this.receiver).T((com.vk.video.profile.presentation.f) obj);
                return s3q0.a;
            case 11:
                ((bnu0) this.receiver).a((String) obj);
                return s3q0.a;
            case 12:
                L.C(((pew0) this.receiver).b(), (Throwable) obj);
                return s3q0.a;
            default:
                L.i((Throwable) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd8(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, bqf.class, "map", "map(Lcom/vk/clips/viewer/impl/feed/wrapper/domain/interactor/ClipsWrapperExternalAction;)Lcom/vk/clips/viewer/impl/feed/wrapper/presentation/actions/ClipsWrapperAction;", 0);
                break;
            case 7:
                super(1, obj, y92.d(), "getDataOrigins", "getDataOrigins(Landroid/health/connect/datatypes/AggregationType;)Ljava/util/Set;", 0);
                break;
            case 10:
                super(1, obj, com.vk.video.profile.presentation.c.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0);
                break;
            case 13:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd8(pew0 pew0Var) {
        super(1, pew0Var, pew0.class, BatchApiRequest.FIELD_NAME_ON_ERROR, "onError(Ljava/lang/Throwable;)V", 0);
        this.b = 12;
    }
}
