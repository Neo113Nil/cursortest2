package xsna;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ironsource.X3;
import com.vk.api.generated.messages.dto.MessagesGetCallPreviewResponseDto;
import com.vk.catalog2.common.ui.mvp.video.VideoPlaylistPlaceHolder;
import com.vk.common.links.LinksParserData;
import com.vk.core.voip.VoipCallSource;
import com.vk.ecomm.design.compose.productattaches.ProductVideoAttach;
import com.vk.ecomm.design.view.productattaches.VideoProductAttachesViewImpl;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.log.L;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.video.profile.presentation.f;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.VoipCallActivity;
import com.vk.voip.VoipService;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.voip.ui.group_selector.ui.b;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;
import com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.android.ext.lifecycle.LifecycleExtKt;
import ru.ok.android.webrtc.media_options.MediaOption;
import xsna.clw0;
import xsna.erw0;
import xsna.g0x0;
import xsna.ikv0;
import xsna.ogw0;
import xsna.pv3;
import xsna.pxw0;
import xsna.tj50;
import xsna.v9w0;
import xsna.yv3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class u5p0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u5p0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object[], xsna.we6[]] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.util.Size, xsna.ikv0$d$a] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [xsna.p4m] */
    /* JADX WARN: Type inference failed for: r3v24 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Throwable cause;
        Context context;
        zqk0 zqk0Var;
        xdw0 xdw0Var;
        int i = this.b;
        ?? r3 = 0;
        r3 = null;
        String str = null;
        r3 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((wh50) obj2).setValue((tny) obj);
                return s3q0.a;
            case 1:
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj2).element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 2:
                rhq0 rhq0Var = (rhq0) obj2;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj;
                ucp ucpVar = ucp.a;
                CharSequence i2 = ucp.i(rhq0Var.d.a().d(extendedUserProfile.g1, new LinksParserData(2939, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382)));
                tzk0 tzk0Var = myc0.f(i2) ? new tzk0(i2) : null;
                u4m u4mVar = new u4m(extendedUserProfile.A0, new km1(20, rhq0Var, extendedUserProfile));
                ExtendedUserProfile.a aVar = extendedUserProfile.S1;
                String str2 = aVar != null ? aVar.a : null;
                if (str2 != null && !drm0.N(str2)) {
                    r3 = new p4m();
                    r3.g = rhq0Var.a.getString(R.string.profile_aplus_details_title);
                    r3.j = R.drawable.vk_icon_blogger_mark_10k_outline_20;
                    r3.k = R.attr.vk_ui_text_link;
                    r3.h = new lhq0(rhq0Var, str2);
                }
                return rl3.I(new we6[]{tzk0Var, u4mVar, r3});
            case 3:
                int i3 = ((h7o0) obj).a;
                Integer num = ((onq0) obj2).o;
                return Boolean.valueOf(num != null && i3 == num.intValue());
            case 4:
                ((fpq0) obj2).C((UserProfileAction) obj);
                return s3q0.a;
            case 5:
                zaa0 zaa0Var = (zaa0) obj;
                return Boolean.valueOf(zaa0Var.a == -6 && epx.f(zaa0Var.c, ((tuq0) obj2).a.a()));
            case 6:
                io.reactivex.rxjava3.core.r rVar = (io.reactivex.rxjava3.core.r) obj2;
                Throwable th = (Throwable) obj;
                RuntimeException runtimeException = th instanceof RuntimeException ? (RuntimeException) th : null;
                if (runtimeException != null && (cause = runtimeException.getCause()) != null) {
                    th = cause;
                }
                if (!rVar.h()) {
                    rVar.onError(th);
                } else if (th != null) {
                    L.i(th);
                }
                return s3q0.a;
            case 7:
                ((s0s0) obj2).k.onNext(new a21("", null, null, null, null, null));
                return s3q0.a;
            case 8:
                tgi0 tgi0Var = (tgi0) obj;
                View view = ((VideoPlaylistPlaceHolder) obj2).y;
                if (view != null && (context = view.getContext()) != null) {
                    str = context.getString(R.string.more);
                }
                qgi0.h(tgi0Var, str != null ? str : "");
                return s3q0.a;
            case 9:
                return VideoProductAttachesViewImpl.C((VideoProductAttachesViewImpl) obj2, (ProductVideoAttach) obj);
            case 10:
                ((h9t0) obj2).e.invoke(f.h.c.b);
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 11:
                dbs0 dbs0Var = (dbs0) obj;
                ebs0 ebs0Var = ((VideoView) obj2).s;
                if (ebs0Var != null) {
                    ebs0Var.bk(dbs0Var);
                }
                return s3q0.a;
            case 12:
                ((vvr) obj2).y(false);
                return Boolean.FALSE;
            case 13:
                ((evv0) obj2).dismiss();
                return s3q0.a;
            case 14:
                ((r9w0) obj2).T((v9w0.c.b) obj);
                return s3q0.a;
            case 15:
                VoipCallActivity voipCallActivity = (VoipCallActivity) obj2;
                int i4 = VoipCallActivity.P;
                if (((Boolean) obj).booleanValue()) {
                    Object obj3 = VoipService.q;
                    VoipService.a.a(voipCallActivity);
                    com.vk.voip.ui.c.b.getClass();
                    com.vk.voip.ui.c.r.getClass();
                    Conversation conversation = OKVoipEngine.E.getConversation();
                    if (conversation != null) {
                        LifecycleExtKt.attachToLifecycle(conversation, voipCallActivity);
                    }
                } else {
                    voipCallActivity.finish();
                }
                return s3q0.a;
            case 16:
                ngw0 ngw0Var = (ngw0) obj2;
                ogw0 ogw0Var = (ogw0) obj;
                int i5 = ngw0.n1;
                if (ogw0Var instanceof ogw0.b) {
                    g2v.c().j().d(ngw0Var.requireContext(), new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.CALLS_SERVICES, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_LIST), ((ogw0.b) ogw0Var).a, false);
                    ngw0Var.dismiss();
                } else if (ogw0Var instanceof ogw0.a) {
                    g2v.c().j().p(ngw0Var.requireContext(), ((ogw0.a) ogw0Var).a, new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.HISTORY, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_LIST));
                    ngw0Var.dismiss();
                } else {
                    if (!(ogw0Var instanceof ogw0.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tax.f(ngw0Var.requireContext(), ((ogw0.c) ogw0Var).a);
                }
                return s3q0.a;
            case 17:
                ((VoipCallServiceFragment) obj2).S.setItems((List) obj);
                return s3q0.a;
            case 18:
                yjw0 yjw0Var = (yjw0) obj2;
                yv3.d dVar = (yv3.d) obj;
                l7s l7sVar = yjw0Var.a;
                ikv0 ikv0Var = yjw0Var.e;
                if (ikv0Var != null) {
                    ikv0Var.a();
                }
                yjw0Var.e = null;
                l7s u = bwt0.u(l7sVar);
                int b = cn70.b(8) + (yjw0Var.c.getControlsAreHidden() ? cn70.b(0) : cn70.b(108));
                ikv0.a aVar2 = new ikv0.a(u);
                aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_articles_outline_28, Integer.valueOf(R.attr.vk_ui_icon_secondary), (Size) r3, 12);
                String string = l7sVar.getString(R.string.voip_asr_stopped_title);
                com.vk.voip.ui.c.b.getClass();
                ?? r11 = com.vk.voip.ui.c.J().h() || !((zqk0Var = com.vk.voip.ui.c.P) == null || (xdw0Var = zqk0Var.k) == null || !xdw0Var.h);
                boolean z = dVar.a;
                dhw0 dhw0Var = com.vk.voip.ui.c.O;
                boolean z2 = (dhw0Var != null ? dhw0Var.D : false) && !com.vk.voip.ui.c.Z0;
                aVar2.u = new ikv0.d(string, l7sVar.getString((z2 || !z) ? (z2 || z) ? (r11 == true || !z) ? (r11 == true || z) ? (r11 == true && z) ? R.string.voip_asr_stopped_subtitle_edu_starter : R.string.voip_asr_stopped_subtitle_edu_no_starter : R.string.voip_asr_stopped_subtitle_no_starter : R.string.voip_asr_stopped_subtitle_starter : R.string.voip_asr_stopped_subtitle_p2p_no_starter : R.string.voip_asr_stopped_subtitle_p2p_starter), (ikv0.d.a) r3, 4);
                aVar2.o = Integer.valueOf(b);
                yjw0Var.e = aVar2.n();
                yjw0Var.b.a(pv3.a.a);
                return s3q0.a;
            case 19:
                wkw0 wkw0Var = (wkw0) obj2;
                String j = ((MessagesGetCallPreviewResponseDto) obj).j();
                String str3 = j != null ? j : "";
                f4z f4zVar = wkw0Var.i;
                if (wkw0Var.U(Uri.parse(str3))) {
                    MobileOfficialAppsCallsStat$TypeVoipCallItem.Source source = !drm0.N(wkw0Var.f) ? MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.DEEPLINK : MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.HISTORY;
                    if (wkw0Var.h.b()) {
                        f4zVar.b(new clw0.c(str3, new VoipCallSource(source, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_LIST)));
                    } else {
                        f4zVar.b(new clw0.b(str3));
                    }
                    f4zVar.b(clw0.a.a);
                }
                return s3q0.a;
            case 20:
                ((VoipCreateScheduleCallFragment) obj2).Q.a(new pxw0.l((VoipScheduleCallTimeZone) obj));
                return s3q0.a;
            case 21:
                return new b.C2051b(((tj50.a) obj).a(new zow0(1, ((apw0) obj2).d, qow0.class, "toViewState", "toViewState(Lcom/vk/voip/ui/group_selector/feature/VoipGroupSelectorState;)Lcom/vk/voip/ui/group_selector/ui/VoipGroupSelectorViewState$ContentDialog;", 0), ao8.d));
            case 22:
                zqw0 zqw0Var = (zqw0) obj2;
                tj50.a aVar3 = (tj50.a) obj;
                wqw0 wqw0Var = new wqw0(1, zqw0Var, zqw0.class, "composeLoading", "composeLoading(Lcom/vk/voip/ui/scheduled/invite/feature/VoipInviteToScheduledCallState;)Lcom/vk/voip/ui/scheduled/invite/ui/state/VoipInviteToScheduledCallViewState$Loading;", 0);
                ao8 ao8Var = ao8.d;
                return new erw0.b(aVar3.a(wqw0Var, ao8Var), aVar3.a(new xqw0(1, zqw0Var, zqw0.class, "composeContent", "composeContent(Lcom/vk/voip/ui/scheduled/invite/feature/VoipInviteToScheduledCallState;)Lcom/vk/voip/ui/scheduled/invite/ui/state/VoipInviteToScheduledCallViewState$Content;", 0), ao8Var), aVar3.a(new yqw0(1, zqw0Var, zqw0.class, "composeViewState", "composeViewState(Lcom/vk/voip/ui/scheduled/invite/feature/VoipInviteToScheduledCallState;)Lcom/vk/voip/ui/scheduled/invite/ui/state/VoipInviteToScheduledCallViewState$ViewState;", 0), ao8Var));
            case 23:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i6 = otw0.i1;
                ((otw0) obj2).Zn(booleanValue, MediaOption.VIDEO);
                return s3q0.a;
            case 24:
                ((j0x0) obj2).T(new g0x0.a.c.C2906a((Throwable) obj));
                return s3q0.a;
            case 25:
                Uri uri = (Uri) obj;
                int i7 = c2x0.o1;
                Context applicationContext = ((c2x0) obj2).requireContext().getApplicationContext();
                if (X3.i.b.equals(uri.getScheme())) {
                    try {
                        MediaScannerConnection.scanFile(applicationContext, new String[]{uri.getPath()}, null, null);
                    } catch (Exception unused) {
                    }
                }
                return s3q0.a;
            case 26:
                FragmentManager fragmentManager = ((com.vk.voip.ui.whiteboard.presentation.main.ui.a) obj2).a;
                androidx.fragment.app.a b2 = tk5.b(fragmentManager, fragmentManager);
                b2.g(R.id.voip_whiteboard_content, ((oz50) obj).f(), "Whiteboard");
                b2.k(true);
                return s3q0.a;
            default:
                z1y0 z1y0Var = ((y1y0) obj2).d;
                if (z1y0Var != null) {
                    z1y0Var.i();
                }
                return s3q0.a;
        }
    }
}
