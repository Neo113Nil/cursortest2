package xsna;

import android.content.Context;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.video.Doc2DocItem;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.music.screens.about.CommunityProfileLinksFragment;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.story.viewer.impl.presentation.stories.util.audio.StoryAudioHandler;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$LongRef;
import xsna.sdh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class oa5 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oa5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r3v21, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.wzs] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        int i2 = 7;
        us2 us2Var = null;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xa5.e((to5) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((hr8) obj3).c(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 2:
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1216243692, intValue, -1, "com.vk.clips.compose.ClipsComposeThemeProvider.Theme.<anonymous> (ClipsComposeThemeProvider.kt:26)");
                    }
                    rvi.a(c490.a.b(null), kai.c(-761468116, new wnd(r8, jaiVar), aVar), aVar, 56);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 3:
                CommunityProfileLinksFragment communityProfileLinksFragment = (CommunityProfileLinksFragment) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = CommunityProfileLinksFragment.P;
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-304447293, intValue2, -1, "com.vk.music.screens.about.CommunityProfileLinksFragment.onCreateView.<anonymous>.<anonymous> (CommunityProfileLinksFragment.kt:48)");
                    }
                    communityProfileLinksFragment.eo(0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                ((tyq) obj3).d(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((sau) obj3).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                HighlightEditFragment highlightEditFragment = (HighlightEditFragment) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i3 = HighlightEditFragment.h0;
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1049941551, intValue3, -1, "com.vk.narratives.impl.highlights.HighlightEditFragment.onViewCreated.<anonymous>.<anonymous> (HighlightEditFragment.kt:176)");
                    }
                    rrv0.d(null, null, null, null, kai.c(1093270518, new qw6(highlightEditFragment, 5), aVar3), aVar3, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 7:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                ee eeVar = ((NewsfeedCustomFragment2) obj3).c0;
                if (eeVar != null) {
                    eeVar.setVisibility(booleanValue ? 0 : 8);
                }
                return s3q0.a;
            case 8:
                rui ruiVar = (rui) obj;
                nn50 nn50Var = (nn50) obj2;
                ruiVar.b = new x2(i2, ruiVar.a(new hkd0(nn50Var, (rkd0) obj3)), ruiVar.a(new sjd0(tci.c, nn50Var)));
                new p370(nn50Var);
                return s3q0.a;
            case 9:
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-294644689, intValue4, -1, "com.vk.ecomm.reviews.impl.reviewfriends.presentation.content.ReviewFriendsComposeView.ThemedContent.<anonymous> (ReviewFriendsComposeView.kt:51)");
                    }
                    lhg0.a(384, aVar4, d370.N(R.string.friends_review_count_dialog_title, 0, aVar4), izsVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 10:
                ((xlb0) obj).a();
                ((Ref$LongRef) obj3).element = ((ov70) obj2).a;
                return s3q0.a;
            case 11:
                StoryAudioHandler storyAudioHandler = (StoryAudioHandler) obj3;
                Context context = (Context) obj;
                if (((Boolean) obj2).booleanValue() && storyAudioHandler.g) {
                    storyAudioHandler.c.b(context);
                } else {
                    storyAudioHandler.c.a(context);
                }
                return s3q0.a;
            case 12:
                ((Integer) obj2).getClass();
                ((rpq0) obj3).q6(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 13:
                kfs0 kfs0Var = (kfs0) obj3;
                Doc2DocItem.Banner.Action action = (Doc2DocItem.Banner.Action) obj;
                String str = (String) obj2;
                if (str != null) {
                    kfs0Var.l.e.invoke(action, str);
                }
                return s3q0.a;
            case 14:
                VideoMinimizableState videoMinimizableState = (VideoMinimizableState) obj;
                sdh0 sdh0Var = (sdh0) obj2;
                ((com.vk.video.ui.discovery.minimizable.p) obj3).getClass();
                if (!(sdh0Var instanceof sdh0.b)) {
                    return sdh0Var;
                }
                sdh0.b bVar = (sdh0.b) sdh0Var;
                return new sdh0.b(bVar.a, ((videoMinimizableState instanceof VideoMinimizableState.Pip) || (videoMinimizableState instanceof VideoMinimizableState.Collapsed)) ? false : true, bVar.c);
            case 15:
                DonutVideoUiModel.DescriptionChip descriptionChip = (DonutVideoUiModel.DescriptionChip) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                aVar5.K(172466135);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(172466135, intValue5, -1, "com.vk.catalog.mvi.block.video.impl.video.list.VideosListViewStateMapper.map.<anonymous>.<anonymous> (VideosListViewStateMapper.kt:72)");
                }
                DonutPriceTemplate donutPriceTemplate = descriptionChip.c;
                if (donutPriceTemplate == null) {
                    aVar5.K(1157787681);
                } else {
                    aVar5.K(-1763767328);
                    us2Var = z1o.a(donutPriceTemplate, m4s.B(aVar5), aVar5, 0);
                }
                aVar5.j();
                if (us2Var == null) {
                    aVar5.K(-1763762606);
                    us2Var = ws2.b(descriptionChip.b, aVar5, 0);
                    aVar5.j();
                } else {
                    aVar5.K(-1763767907);
                    aVar5.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                return us2Var;
            default:
                ((Integer) obj2).getClass();
                ((nnx0) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ oa5(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
