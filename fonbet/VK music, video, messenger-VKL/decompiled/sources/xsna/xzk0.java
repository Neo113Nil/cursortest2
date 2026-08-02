package xsna;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.feed.core.models.actions.ActionOpenBestFriendsPosting;
import com.vk.feed.core.models.actions.ActionOpenModal;
import com.vk.feed.core.models.actions.ActionRemote;
import com.vk.feed.core.models.actions.HeaderAction;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.posting.donut_teaser.domain.interactor.TextValidationState;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.b;
import com.vk.profile.user.impl.ui.f;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vkontakte.android.data.b;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.atq0;
import xsna.fhc0;
import xsna.yzk0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class xzk0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xzk0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                yzk0 yzk0Var = (yzk0) obj3;
                Context context = (Context) obj2;
                HeaderAction headerAction = (HeaderAction) obj;
                if (headerAction instanceof ActionOpenModal) {
                    new yzk0.a(context, (ActionOpenModal) headerAction).I0(null);
                } else if (headerAction instanceof ActionRemote) {
                    Action action = ((ActionRemote) headerAction).b;
                    if (action != null) {
                        di60.w(action, context, null, null, null, null, 62);
                    }
                } else if (headerAction instanceof ActionOpenBestFriendsPosting) {
                    vp80 vp80Var = new vp80();
                    NewsfeedRouter.B((NewsfeedRouter) vp80Var.b.getValue(), context, PostingVisibilityMode.BEST_FRIENDS, 4);
                    ((fhc0.c) vp80Var.c.getValue()).e();
                    jbc0 jbc0Var = (jbc0) vp80Var.d.getValue();
                    SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
                    jbc0Var.g();
                }
                yzk0Var.dismiss();
                return s3q0.a;
            case 1:
                String str = (String) obj3;
                String str2 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    b.d dVar = new b.d("stories_preview");
                    dVar.b(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "action");
                    dVar.b(str, "source");
                    dVar.b = true;
                    dVar.b(str2, "story_ids");
                    dVar.e();
                }
                return s3q0.a;
            case 2:
                ndn0 ndn0Var = (ndn0) obj3;
                mdn0 mdn0Var = (mdn0) obj2;
                mdn0Var.p.b(mdn0Var.itemView.getContext(), ndn0Var.h.o.b, ndn0Var, null);
                return s3q0.a;
            case 3:
                ((defpackage.y) obj3).invoke((WebAction) obj2);
                return s3q0.a;
            case 4:
                io.reactivex.rxjava3.core.r rVar = (io.reactivex.rxjava3.core.r) obj3;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj2;
                if (!rVar.h() && !cVar.h()) {
                    rVar.onNext(TextValidationState.LOADING);
                }
                return s3q0.a;
            case 5:
                fpq0 fpq0Var = (fpq0) obj2;
                Throwable th = (Throwable) obj;
                if (((UserProfileAction.x) obj3).d) {
                    fpq0Var.R.b(new f.h(new atq0.f(null, null, th, 11)));
                } else {
                    fpq0Var.T(b.q.b);
                }
                return s3q0.a;
            case 6:
                Pair pair = (Pair) obj;
                ptk ptkVar = (ptk) pair.d();
                JSONObject jSONObject = (JSONObject) pair.g();
                ((tuq0) obj3).m.a((UserId) obj2, jSONObject);
                return (ExtendedUserProfile) ptkVar.a;
            default:
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a aVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a) obj2;
                View view = (View) obj;
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar2 = ((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f) obj3).k;
                if (cVar2 != null) {
                    int i2 = cVar2.b;
                    pk30 pk30Var = aVar.J;
                    if (pk30Var != null) {
                        pk30Var.c(i2, view);
                    }
                }
                return s3q0.a;
        }
    }
}
