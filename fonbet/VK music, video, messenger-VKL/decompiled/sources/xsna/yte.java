package xsna;

import androidx.compose.ui.platform.ComposeView;
import com.vk.clips.playlists.folders.root.ClipsPlaylistsFoldersRootFragment;
import com.vk.core.preference.Preference;
import com.vk.dto.stories.model.StoryPrivacyResponse;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.log.L;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.repository.internal.repos.stickers.suggests.VmojiPromoInSuggestsRepositoryImpl;
import com.vk.uxpolls.presentation.view.PollsWebView;
import com.vk.voip.ui.view.VoipActionMultiLineView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.fkw0;
import xsna.xn50;

/* compiled from: ClipsPlaylistsFoldersRootFragment.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class yte extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yte(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ClipsPlaylistsFoldersRootFragment clipsPlaylistsFoldersRootFragment = (ClipsPlaylistsFoldersRootFragment) this.receiver;
                clipsPlaylistsFoldersRootFragment.getClass();
                xn50.a.c(clipsPlaylistsFoldersRootFragment, (com.vk.clips.playlists.folders.root.b) obj);
                return s3q0.a;
            case 1:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).T((com.vk.profile.community.impl.ui.profile.d) obj);
                return s3q0.a;
            case 2:
                ((kpg) this.receiver).a((CommunityProfileAction) obj);
                return s3q0.a;
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                CommunityRepliesFragment communityRepliesFragment = (CommunityRepliesFragment) this.receiver;
                if (booleanValue) {
                    xo2.f(communityRepliesFragment.V, true, true, 300L);
                } else {
                    ComposeView composeView = communityRepliesFragment.V;
                    if (composeView != null) {
                        composeView.postDelayed(communityRepliesFragment.W, 400L);
                    }
                }
                return s3q0.a;
            case 4:
                hpm.h((hpm) this.receiver, (com.vk.im.engine.models.dialogs.b) obj);
                return s3q0.a;
            case 5:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                zcz zczVar = (zcz) this.receiver;
                VoipActionMultiLineView voipActionMultiLineView = zczVar.s;
                voipActionMultiLineView.setSwitchListener(null);
                VoipActionMultiLineView.b(voipActionMultiLineView, booleanValue2);
                voipActionMultiLineView.setSwitchListener(zczVar.t);
                return s3q0.a;
            case 6:
                return Boolean.valueOf(((ddr) this.receiver).a(((Number) obj).intValue()));
            case 7:
                L.i((Throwable) obj);
                return s3q0.a;
            case 8:
                ((io.reactivex.rxjava3.subjects.g) this.receiver).onNext((List) obj);
                return s3q0.a;
            case 9:
                L.i((Throwable) obj);
                return s3q0.a;
            case 10:
                PollsWebView pollsWebView = (PollsWebView) this.receiver;
                int i = PollsWebView.h;
                pollsWebView.g((com.vk.uxpolls.presentation.js.model.a) obj);
                return s3q0.a;
            case 11:
                Preference.H("StoryPrivacyCache", "StoryPrivacyResponse", ((bam0) this.receiver).d.toJson((StoryPrivacyResponse) obj));
                return s3q0.a;
            case 12:
                VmojiPromoInSuggestsRepositoryImpl vmojiPromoInSuggestsRepositoryImpl = (VmojiPromoInSuggestsRepositoryImpl) this.receiver;
                vmojiPromoInSuggestsRepositoryImpl.getClass();
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                vmojiPromoInSuggestsRepositoryImpl.a();
                return s3q0.a;
            case 13:
                fkw0 fkw0Var = (fkw0) obj;
                io.reactivex.rxjava3.subjects.d<lkw0> dVar = ((gkw0) this.receiver).g;
                lkw0 P0 = dVar.P0();
                if (!(fkw0Var instanceof fkw0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                boolean z = P0.a;
                boolean z2 = ((fkw0.a) fkw0Var).a;
                if (z != z2) {
                    dVar.onNext(new lkw0(z2));
                }
                return s3q0.a;
            default:
                xkx0.y0((xkx0) this.receiver, (vgg) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yte(Object obj, int i) {
        super(1, obj, CommunityRepliesFragment.class, "setScreenSpinnerVisibility", "setScreenSpinnerVisibility(Z)V", 0);
        this.b = i;
        switch (i) {
            case 7:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 8:
                super(1, obj, io.reactivex.rxjava3.subjects.g.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
                break;
            case 9:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 14:
                super(1, obj, xkx0.class, "handleCommonError", "handleCommonError(Lcom/vk/superapp/core/errors/CommonApiError;)V", 0);
                break;
            default:
                break;
        }
    }
}
