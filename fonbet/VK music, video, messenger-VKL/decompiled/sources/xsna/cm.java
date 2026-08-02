package xsna;

import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.util.Size;
import android.view.accessibility.AccessibilityManager;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.modal.base.ModalAuthInfo;
import com.vk.auth.ui.consent.ConsentScreenInfo;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.d;
import com.vk.clips.attachments.impl.publish.links.ClipsLinksControllerRootFragment;
import com.vk.clips.playlists.playlist_ui.model.PlaylistHeaderIconState;
import com.vk.core.view.mediapicker.VkMediaPicker;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.im.engine.models.InfoBar;
import com.vk.profile.community.impl.ui.suggestions.model.SuggestionVariant;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import com.vk.superapp.api.dto.ad.AdInfo;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.voip.ui.permissions.OverlayPermissionFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ce10;
import xsna.chz;
import xsna.d3h;
import xsna.djc;
import xsna.dw20;
import xsna.ewh;
import xsna.o9t;
import xsna.pxu;
import xsna.r2c;
import xsna.us2;
import xsna.zqe;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class cm implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cm(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v68, types: [java.lang.Object, xsna.jv20] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        chz.b bVar;
        int i = this.b;
        int i2 = 10;
        int i3 = 4;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                chz chzVar = (chz) obj;
                AccessibilityManager accessibilityManager = (AccessibilityManager) obj2;
                chzVar.getClass();
                accessibilityManager.removeAccessibilityStateChangeListener(chzVar);
                chz.c cVar = chzVar.e;
                if (cVar != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(cVar);
                }
                if (Build.VERSION.SDK_INT >= 33 && (bVar = chzVar.f) != null) {
                    chz.a.b(accessibilityManager, tw5.b(bVar));
                }
                return s3q0.a;
            case 1:
                ed0 ed0Var = (ed0) obj2;
                ((hd0) obj).n.b(ed0Var.d, ed0Var.a);
                return s3q0.a;
            case 2:
                r46 r46Var = (r46) obj;
                io.reactivex.rxjava3.internal.operators.single.f0 q = r46Var.d.C(r46Var, new zbg0((Peer) obj2)).q(asu0.a.c());
                int i4 = kwg0.a;
                r46Var.e(q.subscribe(new iwg0(), new bf2(new af2(4), i3)));
                return s3q0.a;
            case 3:
                com.vk.biometrics.lock.impl.presentation.base.mvi.pin.b bVar2 = (com.vk.biometrics.lock.impl.presentation.base.mvi.pin.b) obj;
                com.vk.biometrics.lock.impl.presentation.base.mvi.pin.h hVar = (com.vk.biometrics.lock.impl.presentation.base.mvi.pin.h) obj2;
                p97 p97Var = bVar2.f;
                com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c cVar2 = hVar.c;
                d77 d77Var = hVar.b;
                if ((cVar2 instanceof c.f) || (cVar2 instanceof c.b)) {
                    bVar2.T(d.e.b);
                } else if (cVar2 instanceof c.C0426c) {
                    Object obj3 = epx.f(d77Var.a, d77Var.b) ? d.k.b : d.f.b;
                    if (epx.f(obj3, d.k.b)) {
                        p97Var.p(d77Var.a);
                    }
                    bVar2.T(obj3);
                } else {
                    if (!(cVar2 instanceof c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object obj4 = p97Var.f(d77Var.a) ? d.k.b : d.f.b;
                    int i5 = d77Var.d.a + 1;
                    if (i5 >= 3 && !epx.f(obj4, d.k.b)) {
                        bVar2.W(r57.a(i5));
                        bVar2.j.b(i77.a);
                        p97Var.j(new ux5(i5, System.currentTimeMillis()));
                    }
                    bVar2.T(obj4);
                }
                return s3q0.a;
            case 4:
                return new SimpleDateFormat(((Context) obj).getString(R.string.live_broadcast_start_time_this_year), ((vj8) obj2).d);
            case 5:
                s7c s7cVar = (s7c) obj2;
                ((izs) obj).invoke(new r2c.l(s7cVar.b, s7cVar.d));
                return s3q0.a;
            case 6:
                ((ClipsLinksControllerRootFragment) obj).N = null;
                ((FragmentManager) obj2).e("links_key");
                return s3q0.a;
            case 7:
                d3h d3hVar = (d3h) ((d4h) obj).c.invoke();
                SuggestionVariant suggestionVariant = ((mru) obj2).e;
                ExtendedCommunityProfile extendedCommunityProfile = d3hVar.b;
                int i6 = d3h.b.$EnumSwitchMapping$2[suggestionVariant.ordinal()];
                if (i6 == 1) {
                    extendedCommunityProfile.n2 = null;
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    extendedCommunityProfile.o2 = null;
                }
                d3hVar.c.e(extendedCommunityProfile);
                return s3q0.a;
            case 8:
                return ((s290) ((reh) obj).o.getValue()).a(((VideoFile) obj2).w2());
            case 9:
                return new rxi((sxi) obj, (rx40) obj2);
            case 10:
                com.vk.contacts.c cVar3 = com.vk.contacts.c.b;
                com.vk.contacts.c.g((FragmentActivity) obj);
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj2).element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 11:
                ((izs) obj).invoke(new AuthorHeaderEvent.Info.c(((AuthorHeaderConfig.Info.InfoSlotData.e) ((zak0) ((dlk) obj2).a).getValue()).a));
                return s3q0.a;
            case 12:
                ((edo0) ((uco0) obj)).d.invoke((jdo0) obj2);
                return s3q0.a;
            case 13:
                ((com.vk.im.ui.components.dialogs_list.c) obj).p((InfoBar) obj2, "action");
                return s3q0.a;
            case 14:
                ufs ufsVar = (ufs) obj;
                Size size = (Size) obj2;
                r1t r1tVar = ufsVar.j;
                if (r1tVar != null) {
                    r1tVar.a();
                }
                ufsVar.j = new r1t(size.getWidth(), size.getHeight());
                r1t r1tVar2 = ufsVar.k;
                if (r1tVar2 != null) {
                    r1tVar2.a();
                }
                ufsVar.k = new r1t(size.getWidth(), size.getHeight());
                return s3q0.a;
            case 15:
                ArrayList<Integer> arrayList = h6t.a;
                ((izs) obj).invoke(new o9t.m(new djc.a(((g6t) obj2).c)));
                return s3q0.a;
            case 16:
                izs izsVar = (izs) obj2;
                int i7 = pxu.a.$EnumSwitchMapping$0[((PlaylistHeaderIconState) obj).ordinal()];
                if (i7 == 1) {
                    izsVar.invoke(zqe.h.b);
                } else if (i7 == 2) {
                    izsVar.invoke(zqe.i.h.b);
                }
                return s3q0.a;
            case 17:
                com.vk.clips.sdk.shared.item.market_ads.b bVar3 = (com.vk.clips.sdk.shared.item.market_ads.b) obj2;
                return new gq00(this.c, bVar3.z, bVar3.l.o(), bVar3.o, bVar3.h);
            case 18:
                ((izs) obj).invoke(new ce10.c.a((String) ((us2.d) obj2).a));
                return Boolean.TRUE;
            case 19:
                su10 su10Var = (su10) obj;
                Context context = (Context) obj2;
                dw20.b x = new dw20.b(context, null).c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3)).q0(false).x(0);
                VkMediaPicker vkMediaPicker = new VkMediaPicker(context, null, 6);
                su10Var.r = vkMediaPicker;
                vkMediaPicker.d(new VkMediaPicker.c(new tu10(su10Var, context), ((Boolean) ((zak0) su10Var.k).getValue()).booleanValue(), ((Boolean) ((zak0) su10Var.l).getValue()).booleanValue(), (VkMediaPicker.CellAspectRation) ((zak0) su10Var.n).getValue(), ((Boolean) ((zak0) su10Var.i).getValue()).booleanValue() ? new VkMediaPicker.e.b(new l500(su10Var, i3), new tn0(16, su10Var, context)) : VkMediaPicker.e.c.a, ((Boolean) ((zak0) su10Var.j).getValue()).booleanValue() ? new VkMediaPicker.b.C0889b(new pr0(19)) : new VkMediaPicker.b.c(0)));
                VkMediaPicker vkMediaPicker2 = su10Var.r;
                if (vkMediaPicker2 != null) {
                    vkMediaPicker2.setAlbums(new VkMediaPicker.a(new wow(su10Var.g), su10Var.s));
                }
                su10Var.g(context);
                s3q0 s3q0Var = s3q0.a;
                su10Var.q = x.D0(vkMediaPicker, false).I0(null);
                return s3q0.a;
            case 20:
                ((z520) obj).d((AttachmentWithMedia) obj2);
                return s3q0.a;
            case 21:
                ModalAuthInfo modalAuthInfo = (ModalAuthInfo) obj2;
                ?? r1 = ((wv20) obj).b;
                String str = modalAuthInfo.j;
                String str2 = modalAuthInfo.h;
                String str3 = modalAuthInfo.i;
                String str4 = modalAuthInfo.d;
                ConsentScreenInfo consentScreenInfo = modalAuthInfo.p;
                r1.vc(str, str2, str3, str4, String.valueOf(consentScreenInfo != null ? consentScreenInfo.b : null));
                return s3q0.a;
            case 22:
                int[] iArr = (int[]) obj;
                yn80 yn80Var = (yn80) obj2;
                ArrayList arrayList2 = new ArrayList(iArr.length);
                for (int i8 : iArr) {
                    arrayList2.add(yn80Var.d[yn80Var.indexOf(i8)]);
                }
                List list = (List) yn80Var.B.getValue();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : list) {
                    if (arrayList2.contains((androidx.media3.common.a) obj5)) {
                        arrayList3.add(obj5);
                    }
                }
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    cms0 d = fr10.d((androidx.media3.common.a) it.next());
                    arrayList4.add(new one.video.player.tracks.c(hr80.x(d), d, true));
                }
                return arrayList4;
            case 23:
                int i9 = OverlayPermissionFragment.S;
                ((fww0) obj).invoke();
                ((OverlayPermissionFragment) obj2).tn();
                return s3q0.a;
            case 24:
                bin0 bin0Var = (bin0) obj;
                xzb0 xzb0Var = (xzb0) obj2;
                bin0<String> bin0Var2 = xzb0Var.b;
                bpn0 bpn0Var = new bpn0(new b010(xzb0Var, 25));
                int i10 = 12;
                bpn0 bpn0Var2 = new bpn0(new kr50(xzb0Var, i10));
                bpn0 bpn0Var3 = xzb0Var.r;
                bpn0 bpn0Var4 = xzb0Var.n;
                bpn0 bpn0Var5 = xzb0Var.o;
                bpn0 bpn0Var6 = xzb0Var.p;
                bpn0 bpn0Var7 = xzb0Var.q;
                bpn0 bpn0Var8 = new bpn0(new gd40(xzb0Var, i2));
                bpn0 bpn0Var9 = new bpn0(new re40(xzb0Var, 11));
                bpn0 bpn0Var10 = new bpn0(new rf20(xzb0Var, i10));
                bpn0 bpn0Var11 = new bpn0(new hk70(xzb0Var, 7));
                bpn0 bpn0Var12 = new bpn0(new by20(xzb0Var, 16));
                bpn0 bpn0Var13 = new bpn0(new b410(xzb0Var, 13));
                bpn0 bpn0Var14 = fxc0.a;
                return new hu60(bin0Var, bin0Var2, bpn0Var, new iu60(bpn0Var2, bpn0Var3, bpn0Var8, bpn0Var5, bpn0Var6, bpn0Var4, bpn0Var7, bpn0Var9, bpn0Var10, bpn0Var11, bpn0Var12, bpn0Var13, bpn0Var14 != null ? bpn0Var14 : null));
            case 25:
                ((izs) obj).invoke((String) obj2);
                return s3q0.a;
            case 26:
                ((izs) obj).invoke((ewh.a) obj2);
                return s3q0.a;
            case 27:
                return ((o7m0) obj).getStyle().j() ? rl3.u0(((l0u0) obj2).c.getFillPoints()) : e43.l(new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            default:
                zdn0 zdn0Var = (zdn0) obj;
                u7n0 u7n0Var = zdn0Var.p;
                Context context2 = zdn0Var.itemView.getContext();
                WebAction webAction = ((AdInfo) obj2).c;
                Object obj6 = zdn0Var.l;
                if (obj6 == null) {
                    obj6 = null;
                }
                u7n0Var.b(context2, webAction, (den0) obj6, null);
                return s3q0.a;
        }
    }
}
