package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.libvideo.design.view.fullscreen.VideoTopBarView;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vk.log.L;
import com.vk.music.audioeffect.AudioEffectSettingsComponent;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationsBannerItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vkontakte.android.attachments.ShitAttachment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import xsna.a3p0;
import xsna.b4;
import xsna.ct60;
import xsna.dg70;
import xsna.l3e0;
import xsna.lr10;
import xsna.lr40;
import xsna.nzl;
import xsna.o9t;
import xsna.rf70;
import xsna.sx40;
import xsna.whg;
import xsna.yxd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j4 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object bVar;
        s980 s980Var;
        InfoBar.Payload.GiftsBirthdays.User user;
        int i = this.b;
        int i2 = 3;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                n4 n4Var = (n4) obj2;
                FragmentActivity fragmentActivity = n4Var.b;
                b4.k kVar = (b4.k) ((b4) obj);
                VideoFile videoFile = kVar.a;
                VideoScreenMode videoScreenMode = kVar.b;
                if (!(epx.f(videoFile.a1(), n4Var.e.e.a1()) ? n4Var.c(videoFile) : false)) {
                    if (((Boolean) n4Var.j.getValue()).booleanValue()) {
                        new w6s0(n4Var.a(videoFile, videoScreenMode), null).e(fragmentActivity);
                    } else {
                        new e6s0(fragmentActivity, n4Var.a(videoFile, videoScreenMode), null).c();
                    }
                }
                return s3q0.a;
            case 1:
                bq6 bq6Var = (bq6) obj2;
                com.vk.superapp.multiaccount.api.f fVar = (com.vk.superapp.multiaccount.api.f) obj;
                bq6Var.h0();
                kgq0 kgq0Var = bq6Var.l;
                if (kgq0Var != null) {
                    kgq0Var.c(fVar);
                }
                return s3q0.a;
            case 2:
                Exception exc = (Exception) obj;
                return "UPLOAD_TRACE upload: primary upload failed for attach " + ((qr6) obj2).o + ", error=" + exc.getClass().getSimpleName() + ": " + exc.getMessage();
            case 3:
                String str = (String) obj;
                nzl.a aVar = BottomSheetCommentsFragment.f1;
                c9c0 Co = ((BottomSheetCommentsFragment) obj2).Co();
                if (Co != null) {
                    Co.e4(str);
                }
                return s3q0.a;
            case 4:
                ch8 ch8Var = (ch8) obj2;
                hd8 hd8Var = (hd8) obj;
                L.e("BroadcastListenerProxy", fw3.d(ch8Var.b, new StringBuilder("callLifecycleListeners: ")));
                Iterator<ah8> it = ch8Var.b.iterator();
                while (it.hasNext()) {
                    it.next().e(hd8Var);
                }
                return s3q0.a;
            case 5:
                ChatFragment chatFragment = (ChatFragment) obj2;
                Msg msg = (Msg) obj;
                com.vk.im.ui.components.msg_list.a aVar2 = chatFragment.H0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                aVar2.W0();
                imv imvVar = chatFragment.J0;
                (imvVar != null ? imvVar : null).onPause();
                chatFragment.G0 = msg;
                return s3q0.a;
            case 6:
                DialogMember dialogMember = (DialogMember) obj;
                tsu tsuVar = ((azb) obj2).k;
                if (tsuVar != null) {
                    xyb xybVar = (xyb) tsuVar.b;
                    if (xybVar.q.f) {
                        xybVar.x.d(dialogMember);
                    }
                }
                return s3q0.a;
            case 7:
                r1f r1fVar = ((bzd) obj2).r;
                e2e e2eVar = r1fVar.e;
                c9d c9dVar = r1fVar.c;
                c9dVar.o();
                l3e0.a aVar3 = new l3e0.a(r1fVar.b, new cq6(0, c9dVar, x8d.class, "showPlayButtonInPause", "showPlayButtonInPause()V", 0, 1));
                List<yxd> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (yxd yxdVar : list) {
                    if (yxdVar instanceof yxd.a) {
                        File file = yxdVar.a;
                        ((yxd.a) yxdVar).getClass();
                        bVar = new lr10.a(file, 5000L);
                    } else {
                        if (!(yxdVar instanceof yxd.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar = new lr10.b(yxdVar.a);
                    }
                    arrayList.add(bVar);
                }
                cmf cmfVar = e2eVar.i;
                cxd cxdVar = e2eVar.k;
                File a = e2eVar.j.a();
                Context context = r1fVar.b;
                qzd qzdVar = r1fVar.f;
                ((io.reactivex.rxjava3.disposables.b) r1fVar.a).b(new io.reactivex.rxjava3.internal.operators.single.r(new m9e(cmfVar, cxdVar, a, context, qzdVar != null ? qzdVar.b : null, qzdVar != null ? Integer.valueOf(qzdVar.a) : null).c(arrayList, aVar3), new ca6(new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(r1fVar, 26), 9)).m(e2eVar.i.e().d()).subscribe(new fu0(new fre(r1fVar, 4), 12)));
                return s3q0.a;
            case 8:
                ((yle) obj2).a.V1(((a3p0.a.C2519a) obj).e);
                return s3q0.a;
            case 9:
                CommentThreadFragment commentThreadFragment = (CommentThreadFragment) obj2;
                VkTopBar vkTopBar = (VkTopBar) obj;
                ArrayList<dl60> arrayList2 = CommentThreadFragment.y0;
                afg Co2 = commentThreadFragment.Co();
                if (Co2 != null) {
                    Context context2 = vkTopBar.getContext();
                    dof dofVar = new dof(commentThreadFragment, i2);
                    mdg mdgVar = (mdg) Co2;
                    if (mdgVar.p == 0) {
                        ((NewsfeedRouter) mdgVar.d0.getValue()).H(context2, mdgVar.i, mdgVar.j, null, Integer.valueOf(mdgVar.k), new ndg(dofVar));
                    }
                }
                return s3q0.a;
            case 10:
                yhg yhgVar = (yhg) obj2;
                whg.k kVar2 = (whg.k) obj;
                yhgVar.c.j().o(yhgVar.a, kVar2.a, new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.HISTORY, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_LIST), kVar2.b, true);
                return s3q0.a;
            case 11:
                ((izs) obj2).invoke(((zc0) obj).d);
                return s3q0.a;
            case 12:
                f6s f6sVar = (f6s) obj2;
                q6s q6sVar = (q6s) obj;
                NewsEntry newsEntry = q6sVar.h0;
                NewsEntry newsEntry2 = q6sVar.g0;
                if (newsEntry instanceof ShitAttachment) {
                    ShitAttachment shitAttachment = (ShitAttachment) newsEntry;
                    if (shitAttachment.Gb()) {
                        ((rv0) f6sVar.N.getValue()).b(shitAttachment);
                    }
                }
                ga60 ga60Var = (ga60) f6sVar.Q.getValue();
                ga60Var.b = f6sVar.u;
                if (!ga60Var.b(newsEntry2) && (s980Var = f6sVar.y) != null) {
                    s980Var.r8(newsEntry2);
                }
                return s3q0.a;
            case 13:
                ((izs) obj2).invoke(new o9t.b((h8t) obj));
                return s3q0.a;
            case 14:
                ovw ovwVar = (ovw) obj2;
                InfoBar infoBar = (InfoBar) obj;
                ovwVar.l.a(infoBar);
                String str2 = infoBar.b;
                UserId userId = (!epx.f(str2, "gifts_birthdays") || (user = ovwVar.p) == null) ? null : user.b;
                iid0 iid0Var = new iid0();
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImConversationsBannerItem(str2, MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType.HIDE, userId != null ? Long.valueOf(userId.b) : null), 3);
                iid0Var.f = c;
                iid0Var.g = b;
                iid0Var.q();
                return s3q0.a;
            case 15:
                ((z520) obj2).d((AttachmentWithMedia) obj);
                return s3q0.a;
            case 16:
                e140 e140Var = (e140) obj;
                Rect C = bwt0.C((View) obj2);
                e140Var.getClass();
                ViewGroup viewGroup = e140Var.k;
                int i3 = C.bottom;
                if (i3 <= e140Var.q) {
                    viewGroup.setTranslationY(i3);
                    viewGroup.setLayoutAnimation(e140Var.e);
                } else {
                    viewGroup.setTranslationY(C.top - viewGroup.getHeight());
                    viewGroup.setLayoutAnimation(e140Var.f);
                }
                viewGroup.scheduleLayoutAnimation();
                return s3q0.a;
            case 17:
                izs izsVar = (izs) obj2;
                izsVar.invoke(new is40(SystemClock.elapsedRealtime()));
                izsVar.invoke(new lr40.a(true, ((Boolean) ((wh50) obj).getValue()).booleanValue()));
                return s3q0.a;
            case 18:
                ct60 ct60Var = (ct60) obj;
                return new ad60((at60) obj2, ct60Var.b, new ct60.b(0, (AtomicReference) ct60Var.c.a.b, AtomicReference.class, "get", "get()Ljava/lang/Object;", 0));
            case 19:
                ((izs) obj2).invoke(new rf70.e(((dg70.n) obj).a));
                return s3q0.a;
            case 20:
                vva0 vva0Var = (vva0) obj2;
                return new uva0(((MusicPrefsComponent) ((k7m) m7m.f(vva0Var)).a(fpf0.a(MusicPrefsComponent.class))).Q0(), (ex40) obj, ((AudioEffectSettingsComponent) ((k7m) m7m.f(vva0Var)).a(fpf0.a(AudioEffectSettingsComponent.class))).f0());
            case 21:
                try {
                    ((LocationManager) obj2).removeUpdates((wnf0) obj);
                } catch (Throwable unused) {
                }
                return s3q0.a;
            case 22:
                y6s0 y6s0Var = (y6s0) obj2;
                s6s0 s6s0Var = (s6s0) obj;
                if (y6s0Var != null) {
                    y6s0Var.b(VideoBottomSheetSideEffectOptions.REMOVE_FROM_OWNER, s6s0Var.a);
                }
                return s3q0.a;
            case 23:
                return a5g0.eo((a5g0) obj2, (DialogInterface) obj);
            case 24:
                cl40.a((View) obj2, MusicHapticEvent.LIGHT);
                ((izs) obj).invoke(sx40.j0.b);
                return s3q0.a;
            case 25:
                return ((edm0) obj2).getStyle().i() ? rl3.u0(((l0u0) obj).c.getFillPoints()) : e43.l(new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            case 26:
                dmb0 dmb0Var = (dmb0) obj2;
                float f = ((zhf0) ((bpn0) obj).getValue()).c;
                float f2 = wrp0.b;
                return new zhf0(f, dmb0Var.I0(f2), ((int) (dmb0Var.a() >> 32)) - dmb0Var.I0(wrp0.d), dmb0Var.I0(f2 + wrp0.e));
            case 27:
                ((izs) obj2).invoke(((hze) obj).a);
                return s3q0.a;
            default:
                sqt0 sqt0Var = (sqt0) obj2;
                Context context3 = (Context) obj;
                etn etnVar = sqt0Var.J;
                if (((etnVar.a || etnVar.f || sqt0Var.o()) ? sqt0Var : null) == null) {
                    return null;
                }
                VideoTopBarView videoTopBarView = new VideoTopBarView(context3, null, 6);
                videoTopBarView.setVisibility(8);
                videoTopBarView.setViewClickListener$core_release(sqt0Var.K);
                return videoTopBarView;
        }
    }
}
