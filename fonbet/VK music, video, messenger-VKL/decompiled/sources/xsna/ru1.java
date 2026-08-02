package xsna;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog.mvi.block.impl.banner.BannerView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.hints.HintId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.user.ReactionUserProfile;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedStartFastChat;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.Set;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutorImpl;
import ru.ok.android.webrtc.features.CallFeature;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ru1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ru1(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Long l;
        JSONObject enableFeatureForRoles$lambda$0;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                q030 q030Var = (q030) obj;
                g2v.c().b().d(((ReactionUserProfile) obj2).c.b, ((su1) obj3).itemView.getContext());
                new p4r();
                long longValue = (q030Var == null || (l = q030Var.a) == null) ? -1L : l.longValue();
                String str = q030Var != null ? q030Var.c : null;
                Long valueOf = q030Var != null ? Long.valueOf(q030Var.b) : null;
                UiTracker uiTracker = UiTracker.a;
                new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.FEED_ITEM, Long.valueOf(longValue), valueOf, null, str, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedStartFastChat(MobileOfficialAppsFeedStat$TypeFeedStartFastChat.EntryPoint.FROM_REACTIONS_MODAL), 2)).q();
                return s3q0.a;
            case 1:
                ((wh50) obj).setValue(Boolean.TRUE);
                ((izs) obj3).invoke(new BannerView.a.C0448a(((BannerView.BannerViewState) obj2).b, HintId.INFO_ADDED_VIDEO_MOVED));
                return s3q0.a;
            case 2:
                smq.f(((yah) obj3).e, (Context) obj2, (Narrative) obj, null, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                return s3q0.a;
            case 3:
                enableFeatureForRoles$lambda$0 = ConversationFeatureCommandExecutorImpl.enableFeatureForRoles$lambda$0((ConversationFeatureCommandExecutorImpl) obj3, (CallFeature) obj2, (Set) obj);
                return enableFeatureForRoles$lambda$0;
            default:
                vm30 vm30Var = (vm30) obj3;
                vm30Var.u.post(new vy10(vm30Var, (MsgFromUser) obj2, (fm20) obj, 1));
                return s3q0.a;
        }
    }
}
