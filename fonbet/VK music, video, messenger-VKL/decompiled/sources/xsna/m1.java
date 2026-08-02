package xsna;

import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.g;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.camera.clips.impl.di.CameraClipsComponentBase;
import com.vk.channels.impl.channel_screen.AppChannelFragment;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.channels.impl.list.ChannelsListFragment;
import com.vk.clips.attachments.api.di.ClipsAttachmentsComponent;
import com.vk.clips.blacklists.api.di.ClipsBlacklistsComponent;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponent;
import com.vk.clips.design.view.nps.internal.stars.FeedbackResult;
import com.vk.clips.editor.mapper.fragment.ClipsEditorFragment;
import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListFragment;
import com.vk.clips.sdk.drafts.impl.ClipsDraftComponentBase;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.im.engine.di.ImCmdRxExecutorScopedComponent;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.mapper.attachment.di.AttachmentMappersComponentImpl;
import com.vk.newsfeed.impl.fragments.ClipsCommentThreadFragment;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import com.vk.superapp.presentation.about.AboutAppFragment;
import com.vk.voip.ui.onboarding.features.FeatureId;
import com.vkontakte.android.task.di.configure.ClipsRegisterComponentFactoriesKt$createSdkDraftsComponentFactory$1$createComponent$1;
import java.util.Arrays;
import java.util.Locale;
import kotlin.coroutines.d;
import xsna.g69;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class m1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = AboutAppFragment.X;
                return ((AboutAppFragment) obj).requireArguments().getString("ORIGINAL_URL");
            case 1:
                int i2 = AppChannelFragment.l1;
                return new tta(((AppChannelFragment) obj).V, asu0.a);
            case 2:
                int i3 = ArchiveFragment.e0;
                return ((ArchiveFragment) obj).fo().Y5();
            case 3:
                return new ppt0(((ClipsViewerComponent) ((AttachmentMappersComponentImpl) obj).b.getValue()).pe());
            case 4:
                j96 j96Var = (j96) obj;
                return new m4m0(j96Var.getStickersDrawingView(), (b96) j96Var.f.invoke(), (u76) j96Var.e.invoke(), (w3l0) j96Var.j.getValue());
            case 5:
                izs<? super FeedbackResult, s3q0> izsVar = ((zn6) obj).g;
                if (izsVar != null) {
                    izsVar.invoke(FeedbackResult.STAR_2);
                }
                return s3q0.a;
            case 6:
                x17 x17Var = (x17) obj;
                int intValue = ((Number) ((zak0) x17Var.e).getValue()).intValue();
                int i4 = intValue > 0 ? intValue : 0;
                int a = x17Var.a();
                if (i4 > a) {
                    i4 = a;
                }
                return String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4 / 60), Integer.valueOf(i4 % 60)}, 2));
            case 7:
                ((wj50) obj).b(g.f.a);
                return s3q0.a;
            case 8:
                ((es7) obj).d(false);
                return s3q0.a;
            case 9:
                return ((k79) obj).a.kn();
            case 10:
                h69 h69Var = ((z89) obj).f;
                if (h69Var != null) {
                    h69Var.d.onNext(new g69.e(FeatureId.REACTIONS));
                }
                com.vk.voip.ui.c.b.getClass();
                u4x0 u4x0Var = com.vk.voip.ui.c.Y;
                u4x0Var.h(true ^ u4x0Var.e);
                return s3q0.a;
            case 11:
                qcy<Object>[] qcyVarArr2 = CameraClipsComponentBase.i;
                return ((ClipsBlacklistsComponent) obj).f4();
            case 12:
                ((cd80) obj).getClass();
                return s3q0.a;
            case 13:
                int i5 = ChannelFragment.a1;
                return new com.vk.im.popup.b(((ChannelFragment) obj).requireContext());
            case 14:
                int i6 = ChannelsListFragment.f0;
                return Boolean.valueOf(o25.c(((BridgeComponent) m7m.d((ChannelsListFragment) obj).a(fpf0.a(BridgeComponent.class))).s()));
            case 15:
                ChatFragment chatFragment = (ChatFragment) obj;
                ChatFragment.d dVar = ChatFragment.w1;
                l7m d = m7m.d(chatFragment);
                return ((ImCmdRxExecutorScopedComponent) xq.f((ImFeatureScopeProviderComponent) d.a(fpf0.a(ImFeatureScopeProviderComponent.class)), chatFragment.no(), d).a(fpf0.a(ImCmdRxExecutorScopedComponent.class))).g();
            case 16:
                ((ttb) obj).e.b();
                return s3q0.a;
            case 17:
                q0c q0cVar = (q0c) ((r0c) obj).a;
                if (q0cVar != null) {
                    q0cVar.e();
                }
                return s3q0.a;
            case 18:
                int i7 = ClipFeedListFragment.a2;
                return ((ClipFeedListFragment) obj).no().h8();
            case 19:
                return (ClipsCoauthorsComponent) ((k7m) m7m.f((ekd) obj)).mo408a(fpf0.a(ClipsCoauthorsComponent.class));
            case 20:
                return ((imd) obj).a.Df();
            case 21:
                int i8 = ClipsCommentThreadFragment.A0;
                return ((AttachmentMappersComponent) m7m.d((ClipsCommentThreadFragment) obj).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3();
            case 22:
                return zvj.a(d.a.a(whn0.a(), (ovj) ((ClipsRegisterComponentFactoriesKt$createSdkDraftsComponentFactory$1$createComponent$1) ((ClipsDraftComponentBase) obj)).f.b));
            case 23:
                return ((ClipsAttachmentsComponent) obj).i2().a();
            case 24:
                Integer num = ClipsEditorFragment.W;
                return (ClipsBlacklistsComponent) m7m.d((ClipsEditorFragment) obj).a(fpf0.a(ClipsBlacklistsComponent.class));
            case 25:
                if (((qzd) obj).b == null) {
                    return null;
                }
                y1q0 y1q0Var = new y1q0(0);
                y1q0Var.b();
                return y1q0Var;
            case 26:
                int i9 = ClipsFavoriteFoldersListFragment.U;
                return Boolean.valueOf(((ClipsFavoriteFoldersListFragment) obj).requireArguments().getBoolean("force_dark_theme"));
            case 27:
                qcy<Object>[] qcyVarArr3 = ClipsGridFragment.H0;
                return ((CameraClipsComponent) m7m.d((ClipsGridFragment) obj).a(fpf0.a(CameraClipsComponent.class))).c4();
            default:
                zde zdeVar = (zde) obj;
                zdeVar.C0(new ve0(15));
                zdeVar.o = true;
                return s3q0.a;
        }
    }
}
