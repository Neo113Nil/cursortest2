package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.view.ProgressButton;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.reactions.impl.assets.ReactionAssetDrawable;
import com.vk.im.reactions.impl.assets.a;
import com.vk.im.ui.utils.EduMaxTransitionTracker;
import com.vk.im.ui.views.WriteBarDisabledMoveToMaxBanner;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.messagetemplates.impl.common.TemplateArgs;
import com.vk.messagetemplates.impl.keyboard.TemplatesKeyboardState;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.profile.user.impl.ui.b;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.g9v0;
import xsna.j2o0;
import xsna.y5j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class wze0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wze0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        float h;
        switch (this.b) {
            case 0:
                ReactionAssetDrawable reactionAssetDrawable = (ReactionAssetDrawable) this.c;
                gzs gzsVar = (gzs) this.d;
                reactionAssetDrawable.a((a.C1134a) obj);
                reactionAssetDrawable.b();
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 1:
                ProgressButton progressButton = (ProgressButton) this.c;
                com.vk.stickers.keyboard.navigation.h hVar = (com.vk.stickers.keyboard.navigation.h) this.d;
                progressButton.S(true);
                progressButton.setEnabled(false);
                hVar.l.c();
                return s3q0.a;
            case 2:
                ((AvatarView) obj).X0((Dialog) this.c, (ProfilesSimpleInfo) this.d);
                return s3q0.a;
            case 3:
                i2m0 i2m0Var = (i2m0) this.c;
                ViewGroup viewGroup = (ViewGroup) this.d;
                UserId b = t11.b();
                String r = hd60.a().a().r();
                hvz hvzVar = i2m0Var.n;
                String str = hvzVar != null ? ((NewsfeedSearchFragment) hvzVar.c).S : null;
                if (str == null || !brm0.B(str, "#", false)) {
                    str = null;
                }
                com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_NEWS), "stories_search_news");
                aVar.q(b, r, null);
                aVar.v = str;
                aVar.C(viewGroup.getContext());
                return s3q0.a;
            case 4:
                j2o0 j2o0Var = (j2o0) this.c;
                izs izsVar = (izs) this.d;
                aoj aojVar = (aoj) obj;
                Iterator it = j2o0Var.b.iterator();
                while (it.hasNext()) {
                    aojVar.a(new h2o0((j2o0.a) it.next(), izsVar));
                }
                if (!j2o0Var.b.isEmpty()) {
                    aojVar.b();
                }
                aojVar.a(new v0j0(izsVar));
                return s3q0.a;
            case 5:
                return new TemplatesKeyboardState((TemplateArgs) this.c, (List) this.d, TemplatesKeyboardState.State.LOADED);
            case 6:
                stq0 stq0Var = (stq0) this.c;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) this.d;
                Boolean bool = (Boolean) obj;
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar2 = stq0Var.f;
                if (izsVar2 == null) {
                    izsVar2 = null;
                }
                extendedUserProfile.A1 = bool.booleanValue();
                izsVar2.invoke(new b.s(extendedUserProfile, !bool.booleanValue(), false));
                return s3q0.a;
            case 7:
                wh50 wh50Var = (wh50) this.c;
                izs izsVar3 = (izs) this.d;
                ljo0 ljo0Var = (ljo0) obj;
                wh50Var.setValue(ljo0Var);
                if (izsVar3 != null) {
                    izsVar3.invoke(ljo0Var);
                }
                return s3q0.a;
            case 8:
                Pair pair = (Pair) this.c;
                VkTooltip$BalloonTilt vkTooltip$BalloonTilt = (VkTooltip$BalloonTilt) this.d;
                i6j i6jVar = (i6j) obj;
                float f = ((pco) pair.d()).b;
                float f2 = ((pco) pair.g()).b;
                s5j s5jVar = new s5j("anchor");
                s5j s5jVar2 = new s5j("balloon");
                int i = g9v0.a.$EnumSwitchMapping$3[vkTooltip$BalloonTilt.ordinal()];
                if (i == 1) {
                    h = e06.Near.h();
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h = e06.Far.h();
                }
                y5j.b e = i6jVar.e(f / 2);
                y5j.a g = i6jVar.g(f2 - h);
                i6jVar.c(s5jVar, new hwi0(18));
                i6jVar.c(s5jVar2, new evh0(10, g, e));
                return s3q0.a;
            default:
                WriteBarDisabledMoveToMaxBanner writeBarDisabledMoveToMaxBanner = (WriteBarDisabledMoveToMaxBanner) this.c;
                Context context = (Context) this.d;
                String str2 = writeBarDisabledMoveToMaxBanner.d;
                if (str2 != null) {
                    iwv iwvVar = writeBarDisabledMoveToMaxBanner.c;
                    if (iwvVar != null) {
                        iwvVar.b(context, str2);
                    }
                    WriteBarDisabledMoveToMaxBanner.Screen screen = writeBarDisabledMoveToMaxBanner.b;
                    int i2 = screen == null ? -1 : WriteBarDisabledMoveToMaxBanner.a.$EnumSwitchMapping$0[screen.ordinal()];
                    if (i2 == 1) {
                        EduMaxTransitionTracker.a(EduMaxTransitionTracker.BannerType.BANNER_BLOCKED_CHAT);
                    } else if (i2 == 2) {
                        EduMaxTransitionTracker.a(EduMaxTransitionTracker.BannerType.BANNER_BLOCKED_CHAT_INFO);
                    }
                }
                return s3q0.a;
        }
    }
}
