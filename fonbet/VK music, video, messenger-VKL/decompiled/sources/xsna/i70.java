package xsna;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.articles.ArticleFragment;
import com.vk.biometric.auth.api.di.BiometricAuthComponent;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.BiometricsLockPinFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipGlobalSearchFeatureRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.ChildTopBarWrapperVh;
import com.vk.clips.coauthors.di.ClipsCoauthorsInternalComponent;
import com.vk.clips.coauthors.invite.CoauthorsInviteDialog;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.design.view.templates.ClipsTemplateEditorFragmentsBottomView;
import com.vk.clips.interests.impl.di.ClipsInterestsComponentImpl;
import com.vk.clips.sdk.screens.feed.decorator.api.di.ClipsDecorationComponent;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.decoration.ClipsDecorationKey;
import com.vk.clips.upload.vk.impl.di.ClipsUploadVkComponentImpl;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.checklist.impl.presentation.CommunityCheckListFragment;
import com.vk.im.channelcreation.impl.di.ChannelCreationInternalDiComponent;
import com.vk.libvideo.api.di.VideoKidsComponent;
import com.vk.photo.editor.features.collage.model.stat.CollageStatEvent;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer;
import ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsConfigurationImpl;
import ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsUploadConfig;
import xsna.d3h;
import xsna.mo6;
import xsna.w8l;
import xsna.z31;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class i70 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i70(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v110, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v60, types: [xsna.j8i, xsna.xwb$a] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ConversationAnalyticsUploadConfig init$lambda$0;
        ClipsDecorationKey clipsDecorationKey;
        switch (this.b) {
            case 0:
                return ((ClipsConfigViewersComponent) ((k7m) m7m.f((k70) this.c)).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 1:
                z31 z31Var = (z31) this.c;
                z31.a aVar = z31Var.a;
                return new bel0(aVar.b, new mo6.b(aVar.d, aVar.e), (vh0) z31Var.f.getValue(), z31Var.b, (b41) z31Var.h.getValue());
            case 2:
                return Float.valueOf(((s600) this.c).getProgress());
            case 3:
                return (Rect) this.c;
            case 4:
                ArticleFragment articleFragment = (ArticleFragment) this.c;
                int i = ArticleFragment.E0;
                articleFragment.wo();
                return s3q0.a;
            case 5:
                return ((ow3) this.c).c.findViewById(R.id.iv_close);
            case 6:
                uj5 uj5Var = (uj5) this.c;
                uj5Var.h.remove(0);
                uj5Var.notifyDataSetChanged();
                return s3q0.a;
            case 7:
                return u86.G((y440) this.c);
            case 8:
                return (ucg0) ((tq6) this.c).b.getValue();
            case 9:
                ((uic) this.c).clear();
                return s3q0.a;
            case 10:
                BiometricsLockPinFragment biometricsLockPinFragment = (BiometricsLockPinFragment) this.c;
                int i2 = BiometricsLockPinFragment.c0;
                return ((BiometricAuthComponent) m7m.d(biometricsLockPinFragment).mo408a(fpf0.a(BiometricAuthComponent.class))).Y6();
            case 11:
                init$lambda$0 = CallAnalyticsInitializer.init$lambda$0((ConversationAnalyticsConfigurationImpl) this.c);
                return init$lambda$0;
            case 12:
                return ((laa) this.c).i;
            case 13:
                ChannelCreationInternalDiComponent channelCreationInternalDiComponent = (ChannelCreationInternalDiComponent) this.c;
                qcy<Object>[] qcyVarArr = ChannelCreationInternalDiComponent.j;
                a1w a1wVar = q1w.a;
                return new xul(a1wVar != null ? a1wVar : null, channelCreationInternalDiComponent.Df());
            case 14:
                return i5s.a(new StringBuilder(), ((wgb) this.c).s, ": updateAllHistoryFromCache: start");
            case 15:
                ((xwb) this.c).b.o();
                return s3q0.a;
            case 16:
                return ((VideoKidsComponent) m7m.a(((ChildTopBarWrapperVh) this.c).b).a(fpf0.a(VideoKidsComponent.class))).I4();
            case 17:
                ylc ylcVar = (ylc) this.c;
                return new xyo(ylcVar.c, ylcVar.a, ylcVar.b);
            case 18:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
                int i3 = ClipFeedListFragment.a2;
                ClipFeedTab Ka = clipFeedListFragment.Ka();
                ClipFeedTab.SingleClipWithDecoration singleClipWithDecoration = Ka instanceof ClipFeedTab.SingleClipWithDecoration ? (ClipFeedTab.SingleClipWithDecoration) Ka : null;
                if (singleClipWithDecoration == null || (clipsDecorationKey = singleClipWithDecoration.e) == null) {
                    return w8l.a.a.getSTUB();
                }
                w8l j = ((ClipsDecorationComponent) clipFeedListFragment.q1.getValue()).sb(clipsDecorationKey).j();
                clipFeedListFragment.P.b(j.d().a0(asu0.a.d()).subscribe(new xn(new p1(clipFeedListFragment, 26), 11)));
                return j;
            case 19:
                return ((ClipGlobalSearchFeatureRootVh) this.c).k0().ck();
            case 20:
                return ((ClipsViewerComponent) ((k7m) m7m.f((cfd) this.c)).a(fpf0.a(ClipsViewerComponent.class))).J6();
            case 21:
                return ((BridgeComponent) ((yud) this.c).b.a(fpf0.a(BridgeComponent.class))).x();
            case 22:
                return t0e.P4((t0e) this.c);
            case 23:
                ClipsInterestsComponentImpl clipsInterestsComponentImpl = (ClipsInterestsComponentImpl) this.c;
                qcy<Object>[] qcyVarArr2 = ClipsInterestsComponentImpl.o;
                qhe Df = clipsInterestsComponentImpl.Df();
                nwy nwyVar = clipsInterestsComponentImpl.f;
                qcy<Object> qcyVar = ClipsInterestsComponentImpl.o[5];
                return new qge(Df, (eie) nwyVar.c());
            case 24:
                ClipsTemplateEditorFragmentsBottomView clipsTemplateEditorFragmentsBottomView = (ClipsTemplateEditorFragmentsBottomView) this.c;
                int i4 = ClipsTemplateEditorFragmentsBottomView.j;
                return (RecyclerView) clipsTemplateEditorFragmentsBottomView.findViewById(R.id.clips_template_editor_template_fragments_recycler_view);
            case 25:
                com.vk.movika.sdk.base.ui.i iVar = (com.vk.movika.sdk.base.ui.i) this.c;
                qcy<Object>[] qcyVarArr3 = ClipsUploadVkComponentImpl.h;
                iVar.invoke();
                return s3q0.a;
            case 26:
                return ((ClipsCoauthorsInternalComponent) ((CoauthorsInviteDialog) this.c).c.getValue()).Ef();
            case 27:
                r2g r2gVar = (r2g) this.c;
                r2gVar.A.b(CollageStatEvent.a.a);
                r2gVar.e.c(false);
                return s3q0.a;
            case 28:
                CommunityCheckListFragment communityCheckListFragment = (CommunityCheckListFragment) this.c;
                int i5 = CommunityCheckListFragment.Y;
                return ((BridgeComponent) m7m.d(communityCheckListFragment).a(fpf0.a(BridgeComponent.class))).id();
            default:
                d4h d4hVar = (d4h) this.c;
                d3h d3hVar = (d3h) d4hVar.c.invoke();
                UserId userId = d4hVar.m;
                ExtendedCommunityProfile extendedCommunityProfile = d4hVar.d;
                extendedCommunityProfile.G2 = null;
                d3h.a aVar2 = d3hVar.c;
                aVar2.e(extendedCommunityProfile);
                UserId a = fkq0.a(userId);
                int i6 = 15;
                int i7 = 14;
                tfx tfxVar = new tfx("groups.toggleAdminTipsSection", new wp(i6), new cq(i7));
                tfx.n(tfxVar, "group_id", a, 1L, 0L, 8);
                tfxVar.j("is_hidden", true);
                aVar2.m(rsg0.y0(yfb.x(tfxVar), null, null, 3).subscribe(new c3h(new ht(i7)), new bn3(new sm0(10), i6)));
                return s3q0.a;
        }
    }
}
