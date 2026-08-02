package xsna;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.voip.VoipCallSource;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoScreenSource;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.notifications.core.item.a;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.profile.user.impl.di.UserProfileComponentImpl;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.pushes.PushOpenActivity;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vkontakte.android.attachments.ShitAttachment;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import xsna.a5o;
import xsna.awr0;
import xsna.b4;
import xsna.qir0;
import xsna.whg;
import xsna.xx30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k4 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0257  */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i = this.b;
        int i2 = 2;
        int i3 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                n4 n4Var = (n4) obj2;
                b4.p pVar = (b4.p) ((b4) obj);
                a5o a5oVar = new a5o(new a5o.a(DonutVideoScreenSource.VK_VIDEO.h(), DonutVideoClickSource.PAYWALL.h()), 1);
                x4o x4oVar = n4Var.d.n;
                if (x4oVar != null) {
                    x4oVar.a(pVar.a, n4Var.b, a5oVar);
                }
                return s3q0.a;
            case 1:
                ri6 ri6Var = (ri6) obj2;
                NotificationManager notificationManager = (NotificationManager) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"[Push][Channels]: Channel ready channel=" + ri6Var.c()});
                }
                Notification a = ri6Var.a();
                Map<String, String> d = ri6Var.d();
                if (d != null) {
                    UserId c = o25.a().c();
                    int e = ri6Var.e();
                    String f = ri6Var.f();
                    yh70.b.f(c, e, f, d);
                    o970.b.f(c, e, f, d);
                }
                if (myc0.f(ri6Var.f())) {
                    notificationManager.notify(ri6Var.f(), ri6Var.e(), a);
                } else {
                    notificationManager.notify(ri6Var.e(), a);
                }
                ri6Var.j();
                return s3q0.a;
            case 2:
                izs izsVar = (izs) obj;
                nt7 nt7Var = ((vu7) obj2).d.b;
                if (nt7Var != null) {
                    izsVar.invoke(nt7Var);
                }
                return s3q0.a;
            case 3:
                Uri uri = (Uri) obj;
                on4 on4Var = (on4) ((bzd) obj2).t.getValue();
                on4Var.getClass();
                io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new ln4(i3, on4Var, uri));
                e2e e2eVar = on4Var.c;
                int i4 = 5;
                s0Var.a0(e2eVar.i.e().d()).r0(e2eVar.i.e().c()).subscribe(new defpackage.p(new defpackage.o(4, on4Var, uri), i2), new sv(new sz(on4Var, i4), i4));
                return s3q0.a;
            case 4:
                yhg yhgVar = (yhg) obj2;
                whg.m mVar = (whg.m) obj;
                kyv j = yhgVar.c.j();
                Context context = yhgVar.a;
                mVar.getClass();
                j.n(context, null, new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.HISTORY, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_LIST), mVar.a, true, mVar.b);
                return s3q0.a;
            case 5:
                qop qopVar = (qop) obj2;
                VkAuthCredentials vkAuthCredentials = (VkAuthCredentials) obj;
                ((tdk) qopVar.C.getValue()).b();
                o200 o200Var = (o200) qopVar.a;
                if (o200Var != null) {
                    o200Var.w8(vkAuthCredentials.b, vkAuthCredentials.c);
                }
                Serializer.c<VkAuthState> cVar = VkAuthState.CREATOR;
                String str = vkAuthCredentials.b;
                String str2 = vkAuthCredentials.c;
                if (str2 == null) {
                    str2 = "";
                }
                p66.j0(qopVar, VkAuthState.a.b(str, str2, null, true), null, new VkAuthMetaInfo(null, null, null, SilentAuthSource.BY_LOGIN, null, null, 55, null), null, 26);
                return s3q0.a;
            case 6:
                f6s f6sVar = (f6s) obj2;
                ?? r0 = f6sVar.N;
                NewsEntry newsEntry = ((q6s) obj).h0;
                if (hd60.a().S(f6sVar.itemView.getContext())) {
                    if (newsEntry instanceof ShitAttachment) {
                        ShitAttachment shitAttachment = (ShitAttachment) newsEntry;
                        if (shitAttachment.Gb()) {
                            ((rv0) r0.getValue()).g(shitAttachment);
                            hd60.a().H(newsEntry);
                            com.vk.newsfeed.common.helpers.a aVar = new com.vk.newsfeed.common.helpers.a(f6sVar.itemView.getContext());
                            aVar.c = f6sVar.u;
                            aVar.d = (String) ((zak0) f6sVar.J).getValue();
                            u1c0 J0 = f6sVar.J0();
                            aVar.e = J0 != null ? Integer.valueOf(J0.k) : null;
                            aVar.e(newsEntry);
                        }
                    }
                    if (newsEntry instanceof PromoPost) {
                        ((rv0) r0.getValue()).c((PromoPost) newsEntry);
                    }
                    hd60.a().H(newsEntry);
                    com.vk.newsfeed.common.helpers.a aVar2 = new com.vk.newsfeed.common.helpers.a(f6sVar.itemView.getContext());
                    aVar2.c = f6sVar.u;
                    aVar2.d = (String) ((zak0) f6sVar.J).getValue();
                    u1c0 J02 = f6sVar.J0();
                    aVar2.e = J02 != null ? Integer.valueOf(J02.k) : null;
                    aVar2.e(newsEntry);
                }
                return s3q0.a;
            case 7:
                lrs lrsVar = (lrs) obj2;
                View view = (View) obj;
                q7v0 q7v0Var = lrsVar.a;
                VkOnboardingCampaign e2 = q7v0Var.e("com:ctlg_friends");
                if (e2 != null && q7v0Var.d(e2) && q7v0Var.b(e2, false)) {
                    bwt0.j(view, new yf1(view, lrsVar, e2, 3));
                }
                return s3q0.a;
            case 8:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                ptv ptvVar = (ptv) obj;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ptvVar.c.g((bd70) it.next());
                }
                linkedHashSet.clear();
                return s3q0.a;
            case 9:
                ((n1y) obj2).e.e.a((Activity) obj, new log(8));
                return s3q0.a;
            case 10:
                ((z520) obj2).i((Photo) obj);
                return s3q0.a;
            case 11:
                ((r010) obj2).invoke();
                View view2 = (View) ((WeakReference) obj).get();
                if (view2 != null) {
                    view2.performHapticFeedback(0, 2);
                }
                return s3q0.a;
            case 12:
                sw30 sw30Var = (sw30) obj;
                return new r9f0(Source.CACHE, (a1w) obj2, new bx30(1, sw30Var, xx30.a.class, "isDialogAllowed", "isDialogAllowed(Lcom/vk/im/engine/models/dialogs/Dialog;)Z", 0), new cx30(1, sw30Var, xx30.a.class, "isDialogActive", "isDialogActive(Lcom/vk/im/engine/models/dialogs/Dialog;)Z", 0));
            case 13:
                ((um50) obj2).d.b.e((pk50) obj);
                return s3q0.a;
            case 14:
                a.C1441a c1441a = (a.C1441a) obj2;
                izs izsVar2 = (izs) obj;
                if (!jjc.d().a()) {
                    snv snvVar = c1441a.c;
                    if (snvVar != null) {
                        izsVar2.invoke(snvVar);
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 15:
                Future future = (Future) obj2;
                bzb0 bzb0Var = (bzb0) obj;
                try {
                    future.get();
                    pro0.e(new rc4(bzb0Var, 14));
                    return s3q0.a;
                } catch (InterruptedException e3) {
                    future.cancel(true);
                    throw e3;
                } catch (ExecutionException e4) {
                    Throwable cause = e4.getCause();
                    if ((cause instanceof Exception) || (cause instanceof Error)) {
                        throw cause;
                    }
                    throw new RuntimeException(cause);
                }
            case 16:
                ((a0p0) obj2).c.invoke(((CodeState.MaxCodeWait) obj).h);
                return s3q0.a;
            case 17:
                ((izs) obj2).invoke(((hze) obj).a);
                return s3q0.a;
            case 18:
                UserProfileComponentImpl userProfileComponentImpl = (UserProfileComponentImpl) obj;
                qcy<Object>[] qcyVarArr = UserProfileComponentImpl.m;
                Context context2 = ((AppContextDiComponent) obj2).a;
                BridgeComponent bridgeComponent = userProfileComponentImpl.a;
                return new evq0(context2, bridgeComponent.s(), bridgeComponent.A(), bridgeComponent.x(), userProfileComponentImpl.b.Ad(), new sdy());
            case 19:
                UserProfileHeaderView userProfileHeaderView = (UserProfileHeaderView) obj;
                int i5 = UserProfileHeaderView.G;
                wx40 wx40Var = new wx40(userProfileHeaderView, 11);
                RectF o = zjq.o(userProfileHeaderView.A.getRightMainRect());
                Rect rect = new Rect();
                o.roundOut(rect);
                ((slq0) obj2).a(new UserProfileAction.m.c(wx40Var, rect));
                return s3q0.a;
            case 20:
                Context context3 = (Context) obj2;
                qir0 qir0Var = (qir0) obj;
                int i6 = PushOpenActivity.f;
                String str3 = qir0Var.l;
                qir0.a aVar3 = qir0Var.x;
                Intent a2 = PushOpenActivity.a.a(str3, context3, "validate_action_confirm", aVar3.a("type"), aVar3.a(AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT), aVar3.a("need_track_interaction"));
                i35 i35Var = i35.c;
                a2.setAction(String.valueOf(i35Var.e()));
                a2.putExtra("hash", aVar3.m);
                a2.putExtra("confirm_text", aVar3.n);
                a2.putExtra("target_user_id", aVar3.k);
                return t2i0.a(context3, i35Var.e(), a2, 167772160);
            case 21:
                ((hqs0) obj2).g(new awr0.c((BlockId.CompositeId) obj));
                return s3q0.a;
            default:
                VkButton vkButton = (VkButton) obj2;
                VkButton vkButton2 = (VkButton) obj;
                int i7 = VideoNewProfileHeaderViewV2.y;
                ViewGroup.LayoutParams layoutParams = vkButton.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = vkButton2.getHeight();
                vkButton.setLayoutParams(layoutParams);
                return s3q0.a;
        }
    }
}
