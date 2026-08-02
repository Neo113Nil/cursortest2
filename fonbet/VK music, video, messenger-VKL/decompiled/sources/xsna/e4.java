package xsna;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.ads.core.domain.adquality.AndroidInitializeAdQuality;
import com.vk.channels.impl.channel_screen.profile.ChannelProfileFragment;
import com.vk.clips.design.view.templates.ClipsTemplateEditorCropperView;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.community.strikes.api.di.CommunityStrikesComponent;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.mytarget.AdsSdkComponent;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;
import com.vk.profile.community.details.impl.name_history.CommunityNameHistoryFragment;
import com.vk.profile.community.details.impl.name_history.a;
import com.vk.profile.questions.impl.AnswerSource;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.dzc;
import xsna.ikv0;
import xsna.n4;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e4 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        String reportLoadFailure$lambda$3;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                n4 n4Var = (n4) obj;
                n4.a aVar = n4Var.c;
                yks0 yks0Var = n4Var.e;
                aVar.a(yks0Var.e.a1(), yks0Var.e.O9());
                return s3q0.a;
            case 1:
                return com.vk.clips.sdk.shared.item.ads.c.m((com.vk.clips.sdk.shared.item.ads.c) obj);
            case 2:
                reportLoadFailure$lambda$3 = AndroidInitializeAdQuality.reportLoadFailure$lambda$3((Throwable) obj);
                return reportLoadFailure$lambda$3;
            case 3:
                com.vk.profile.questions.impl.a aVar2 = (com.vk.profile.questions.impl.a) obj;
                AnswerSource answerSource = aVar2.i1;
                if (answerSource == null) {
                    answerSource = null;
                }
                aVar2.ao(answerSource == AnswerSource.STORY_REPLY);
                ikv0.a aVar3 = new ikv0.a(aVar2.requireContext());
                aVar3.u = new ikv0.d(aVar2.requireContext().getString(R.string.questions_action_answer_failed), (String) null, (ikv0.d.a) null, 6);
                aVar3.n();
                aVar2.dismiss();
                return s3q0.a;
            case 4:
                return (AppCompatImageView) ((aw3) obj).b.findViewById(R.id.avatar_border);
            case 5:
                BoardTopicViewFragment boardTopicViewFragment = (BoardTopicViewFragment) obj;
                av20<mi7> av20Var = boardTopicViewFragment.d0;
                av20Var.setItems(new ArrayList(boardTopicViewFragment.b0));
                VkTopBar vkTopBar = boardTopicViewFragment.n0;
                if (vkTopBar != null) {
                    Rect K = xa4.K(vkTopBar.getRightMainRect());
                    int l = krv0.l(R.attr.vk_ui_icon_accent);
                    vkTopBar.getContext();
                    e.c cVar = new e.c(null, K, vkTopBar, l, 1);
                    cVar.l = av20Var;
                    cVar.a().g();
                }
                return s3q0.a;
            case 6:
                ((dk7) obj).l.ho();
                return s3q0.a;
            case 7:
                ((ikv0) obj).a();
                return s3q0.a;
            case 8:
                ChannelProfileFragment channelProfileFragment = (ChannelProfileFragment) obj;
                int i2 = ChannelProfileFragment.e0;
                zdw zdwVar = i7o0.b;
                dhr0 dhr0Var = (zdwVar != null ? zdwVar : null).f;
                a1w a1wVar = channelProfileFragment.Q;
                if (zdwVar == null) {
                    zdwVar = null;
                }
                alm almVar = new alm(dhr0Var, a1wVar, zdwVar.u, null);
                almVar.c(channelProfileFragment.getLifecycle());
                return almVar;
            case 9:
                ((ez20) obj).Qc("DialogEffectList");
                return s3q0.a;
            case 10:
                int i3 = ClipFeedListFragment.a2;
                return ((AdsSdkComponent) m7m.d((ClipFeedListFragment) obj).mo408a(fpf0.a(AdsSdkComponent.class))).P5();
            case 11:
                return new dzc.f((dzc) obj);
            case 12:
                return ((o1d) obj).a0;
            case 13:
                ViewGroup viewGroup = (ViewGroup) obj;
                if (viewGroup != null) {
                    return viewGroup;
                }
                return null;
            case 14:
                bzd bzdVar = (bzd) obj;
                return new f0e(bzdVar.n, bzdVar.c.getStickersInteractor(), bzdVar.p, bzdVar.e, new qu(bzdVar, 22));
            case 15:
                q0e q0eVar = (q0e) obj;
                c9d c9dVar = q0eVar.d;
                wo4 R = q0eVar.R();
                hwd hwdVar = q0eVar.c;
                s0e s0eVar = q0eVar.l;
                return new wwd(c9dVar, R, hwdVar, s0eVar == null ? null : s0eVar, q0eVar.e);
            case 16:
                int i4 = ClipsFavoriteFolderContentListFragment.W;
                return Boolean.valueOf(((ClipsFavoriteFolderContentListFragment) obj).requireArguments().getBoolean("force_dark_theme"));
            case 17:
                afe afeVar = (afe) obj;
                return Integer.valueOf(afeVar.d.getHeight() + afeVar.m);
            case 18:
                Bundle a = ((roe) obj).a();
                return Boolean.valueOf(a != null ? a.getBoolean("no_bottom_navigation", false) : false);
            case 19:
                int i5 = ClipsTemplateEditorCropperView.z;
                return ((ClipsTemplateEditorCropperView) obj).findViewById(R.id.clips_template_editor_cropper_view_pager_right_control);
            case 20:
                return (mhd) ((i8f) obj).h.d.getValue();
            case 21:
                iff iffVar = (iff) obj;
                return new caf(iffVar.b().x().e(), iffVar.b().t().b());
            case 22:
                ClipsWrapperInputArguments.a aVar4 = ClipsWrapperInputArguments.r;
                Bundle a2 = ((ClipsWrapperInputArguments) obj).a();
                aVar4.getClass();
                return Boolean.valueOf(a2 != null && a2.getBoolean("ClipsWrapperFragment.is_main_feed", false));
            case 23:
                ArrayList<dl60> arrayList = CommentThreadFragment.y0;
                ((CommentThreadFragment) obj).s();
                return s3q0.a;
            case 24:
                return ((CommunityStrikesComponent) ((k7m) m7m.f((mdg) obj)).a(fpf0.a(CommunityStrikesComponent.class))).ge();
            case 25:
                CommunityNameHistoryFragment communityNameHistoryFragment = (CommunityNameHistoryFragment) obj;
                int i6 = CommunityNameHistoryFragment.S;
                a.c cVar2 = a.c.b;
                communityNameHistoryFragment.getClass();
                xn50.a.c(communityNameHistoryFragment, cVar2);
                return s3q0.a;
            case 26:
                cch cchVar = (cch) ((bch) obj).m;
                mre mreVar = cchVar.j;
                if (mreVar != null) {
                    mreVar.invoke(cchVar.g.b);
                }
                return s3q0.a;
            case 27:
                kih kihVar = (kih) obj;
                p8u p8uVar = (p8u) kihVar.t;
                if (p8uVar != null) {
                    kihVar.E.b(p8uVar);
                }
                return s3q0.a;
            case 28:
                return (ish) ((osh) obj).d.L.getValue();
            default:
                return (TextView) ((s3i) obj).findViewById(R.id.community_time_cell_day);
        }
    }
}
