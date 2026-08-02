package xsna;

import android.os.MessageQueue;
import android.view.View;
import com.vk.channelrestrictions.WarningReason;
import com.vk.clips.design.view.component.button.ClipActionButton;
import com.vk.core.view.components.subnavigation.SubnavigationButton;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.reactions.impl.set_reaction.list.ReactionListController;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.music.view.vkmix.models.MusicMixMood;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkConnectNavigationItem;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.toggle.data.RecommendationsItemImageStyle;
import com.vk.video.profile.analytics.ContentWarningModalClick;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.amw0;
import xsna.fbw;
import xsna.obf0;
import xsna.sum0;
import xsna.sx40;
import xsna.ugf;
import xsna.ymb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class xm6 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xm6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [xsna.j8i, xsna.xwb$a] */
    @Override // xsna.gzs
    public final Object invoke() {
        gvv0 view;
        int t6;
        int i = this.b;
        boolean z = true;
        r5 = false;
        boolean z2 = false;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                BaseSharingExternalActivity baseSharingExternalActivity = (BaseSharingExternalActivity) obj2;
                int i2 = BaseSharingExternalActivity.Z;
                baseSharingExternalActivity.getClass();
                ((com.vk.storycamera.builder.a) obj).C(baseSharingExternalActivity);
                return null;
            case 1:
                ymb ymbVar = (ymb) obj2;
                LinkedHashMap linkedHashMap = ymbVar.k;
                Collection<Msg> collection = (Collection) obj;
                ArrayList arrayList = new ArrayList(c5g.u(collection, 10));
                for (Msg msg : collection) {
                    ymb.a aVar = (ymb.a) linkedHashMap.get(Integer.valueOf(msg.d));
                    arrayList.add(new ymb.a(msg, z, aVar != null ? aVar.c : null));
                }
                int e = on00.e(c5g.u(arrayList, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(e);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap2.put(Integer.valueOf(((ymb.a) next).a.d), next);
                }
                linkedHashMap.putAll(linkedHashMap2);
                ymbVar.V();
                return s3q0.a;
            case 2:
                ((xwb) obj2).b.p((AvatarAction) obj);
                return s3q0.a;
            case 3:
                ClipActionButton clipActionButton = new ClipActionButton(((e1d) obj2).q.getContext());
                jjc.g(clipActionButton, new ec((w6d) obj, 25));
                return clipActionButton;
            case 4:
                return f5f.z(((uru) obj2).a.getAlpha(), ((Boolean) ((Pair) obj).j()).booleanValue() ? 250 : 0, ((long) Math.abs((r5 - r1) / 250)) * 100);
            case 5:
                wcf wcfVar = (wcf) obj2;
                q7v0 q7v0Var = (q7v0) obj;
                VkOnboardingCampaign e2 = wcfVar.t.e("clips:attached_video");
                if (e2 != null && q7v0Var.d(e2)) {
                    z2 = q7v0Var.b(e2, false);
                }
                wcfVar.e(new ugf.h.j(z2));
                return s3q0.a;
            case 6:
                List<String> list = (List) obj;
                fvv0 fvv0Var = ((c6y) obj2).a;
                if (fvv0Var != null && (view = fvv0Var.getView()) != null) {
                    view.am(list);
                }
                return s3q0.a;
            case 7:
                izs izsVar = (izs) obj2;
                MarketProductTileConfig marketProductTileConfig = (MarketProductTileConfig) obj;
                if (izsVar != null) {
                    izsVar.invoke(new MarketProductTileConfig.f(marketProductTileConfig.a));
                }
                return s3q0.a;
            case 8:
                yn40.e((yn40) obj2, (MusicMixMood) obj);
                return s3q0.a;
            case 9:
                ((d8e0) obj2).c.getClass();
                new cev0(SchemeStatSak$TypeVkConnectNavigationItem.EventType.UNBLOCK_PROTECT_ACCOUNT_CONNECT).q();
                ((yq1) obj).invoke();
                return s3q0.a;
            case 10:
                ReactionListController reactionListController = (ReactionListController) obj2;
                yaw yawVar = (yaw) obj;
                Msg msg2 = reactionListController.e;
                f1f0 f1f0Var = reactionListController.k;
                Integer num = f1f0Var.l;
                int i3 = yawVar.a;
                if (num != null && num.intValue() == i3) {
                    f1f0Var.Ve(null);
                    reactionListController.b.d(msg2.d, msg2.b, msg2.c, msg2 instanceof MsgFromChannel);
                } else {
                    f1f0Var.Ve(Integer.valueOf(i3));
                    reactionListController.b.e(new fbw.a(msg2.c, msg2.d, msg2.b, msg2 instanceof MsgFromChannel, yawVar.a, reactionListController.h));
                    reactionListController.d.a(msg2.b, i3, msg2.c);
                    vvr0.d();
                }
                reactionListController.g.a.invoke(num, Integer.valueOf(i3));
                return s3q0.a;
            case 11:
                obf0 obf0Var = (obf0) obj;
                int i4 = obf0.a.$EnumSwitchMapping$1[((RecommendationsItemImageStyle) obj2).ordinal()];
                if (i4 == 1) {
                    t6 = obf0Var.t6();
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i5 = obf0.a.$EnumSwitchMapping$0[obf0Var.q.ordinal()];
                    if (i5 == 1) {
                        t6 = e3m.a(R.dimen.recomm_carousel_portrait_image_height, obf0Var.itemView.getContext());
                    } else if (i5 == 2) {
                        t6 = e3m.a(R.dimen.recomm_carousel_small_item_portrait_image_height, obf0Var.itemView.getContext());
                    } else {
                        if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        t6 = obf0Var.t6();
                    }
                }
                return Integer.valueOf(t6);
            case 12:
                cl40.a((View) obj2, MusicHapticEvent.LIGHT);
                ((izs) obj).invoke(new sx40.g0(PlayerContext.FULL));
                return s3q0.a;
            case 13:
                ((fgl0) obj2).d.d(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), (String) obj, 1, null));
                return s3q0.a;
            case 14:
                ((izs) obj2).invoke(j5g.v0(new sum0.d(SubnavigationButton.Size.Small, SubnavigationButton.Mode.Primary, SubnavigationButton.Appearance.Inherit, true, "Button", true, sum0.a.PLACE_16, true, 1, sum0.b.Icon, false, true), new wow((List) obj)));
                return s3q0.a;
            case 15:
                f3n0 f3n0Var = (f3n0) obj;
                ((g3n0) obj2).m.G(f3n0Var.b, f3n0Var.d);
                return s3q0.a;
            case 16:
                int i6 = VideoProfileFragmentOld.p0;
                m7t0.a((WarningReason) obj2, ((UserId) obj).b, ContentWarningModalClick.Article);
                return s3q0.a;
            case 17:
                tet0 tet0Var = (tet0) obj;
                return Integer.valueOf(((ecr) ((nuz) obj2).c.a.get(tet0Var.o.indexOf(Integer.valueOf(((set0) ((zak0) tet0Var.m).getValue()).getDuration())))).a());
            case 18:
                ((dou0) obj2).d.addIdleHandler((MessageQueue.IdleHandler) obj);
                return s3q0.a;
            case 19:
                vlw0 vlw0Var = (vlw0) obj2;
                vlw0Var.T(amw0.b.a.b);
                vlw0Var.k.b(vlw0Var.V((String) obj));
                return s3q0.a;
            default:
                ((gvw0) obj2).h = false;
                ((gzs) obj).invoke();
                return s3q0.a;
        }
    }

    public /* synthetic */ xm6(List list, izs izsVar, sum0 sum0Var) {
        this.b = 14;
        this.c = izsVar;
        this.d = list;
    }

    public /* synthetic */ xm6(uru uruVar, f5f f5fVar, Pair pair) {
        this.b = 4;
        this.c = uruVar;
        this.d = pair;
    }

    public /* synthetic */ xm6(m7t0 m7t0Var, WarningReason warningReason, UserId userId) {
        this.b = 16;
        this.c = warningReason;
        this.d = userId;
    }
}
