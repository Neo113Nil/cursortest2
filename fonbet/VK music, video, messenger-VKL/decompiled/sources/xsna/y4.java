package xsna;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vk.clips.sdk.shared.item.common.error.ErrorOverlayRenderDelegate;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.hints.Hint;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.newsfeed.impl.discover.themed.ThemedFeedToolbarFragment;
import com.vk.pushes.PushOpenActivity;
import com.vk.video.ui.discovery.minimizable.g;
import com.vk.video.ui.upload.impl.settings.presentation.feature.entity.SettingsState;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsArguments;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsFragmentInternalComponent;
import com.vk.voip.ui.permissions.OverlayPermissionFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.clj0;
import xsna.djc;
import xsna.kvp0;
import xsna.lu10;
import xsna.o9t;
import xsna.oij0;
import xsna.rmy;
import xsna.zi3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class y4 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        String str;
        cfw0 a;
        String str2;
        int i = this.b;
        boolean z = false;
        int i2 = 1;
        String str3 = null;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((w4) obj2).a.b(((Hint) obj).b);
                return s3q0.a;
            case 1:
                return new ErrorOverlayRenderDelegate(((w01) ((uy0) obj2).a.getValue()).f, new com.vk.movika.sdk.base.observable.q((ux0) obj, 3));
            case 2:
                ((rh3) obj2).o.b(new zi3.b.a((List) obj));
                return s3q0.a;
            case 3:
                PhotoAttachment photoAttachment = (PhotoAttachment) obj;
                z84 z84Var = ((b94) obj2).t;
                if (z84Var != null) {
                    z84Var.u0(photoAttachment);
                }
                return s3q0.a;
            case 4:
                return new SimpleDateFormat(((Context) obj2).getString(R.string.live_broadcast_start_time_tomorrow), ((vj8) obj).d);
            case 5:
                dme dmeVar = (dme) obj2;
                wh50 wh50Var = (wh50) obj;
                g22 g22Var = dmeVar.l1;
                (g22Var != null ? g22Var : null).invoke(((tho0) wh50Var.getValue()).a.c);
                dmeVar.dismiss();
                return s3q0.a;
            case 6:
                ((reh) obj2).n.d((VideoFile) obj);
                return s3q0.a;
            case 7:
                ((izs) obj2).invoke(new com.vk.profile.design.compose.header.sink.a((String) obj));
                return s3q0.a;
            case 8:
                com.vk.im.ui.components.dialogs_list.c cVar = (com.vk.im.ui.components.dialogs_list.c) obj2;
                cVar.d.D(cVar, new com.vk.im.engine.commands.dialogs.b((Peer) obj));
                return s3q0.a;
            case 9:
                nkd nkdVar = (nkd) obj2;
                ikd ikdVar = (ikd) obj;
                if (nkdVar != null) {
                    nkdVar.a(ClipsBottomSheetSideEffectOptions.EDIT_DONE, ikdVar.a);
                }
                return s3q0.a;
            case 10:
                f6s f6sVar = (f6s) obj2;
                c6z Q = di60.Q(((q6s) obj).h0);
                f6sVar.E.d(f6sVar.itemView.getContext(), Q instanceof Badgeable ? (Badgeable) Q : null);
                return s3q0.a;
            case 11:
                ((Ref$BooleanRef) obj2).element = ((xfs) obj).init();
                return s3q0.a;
            case 12:
                VkTopBar vkTopBar = (VkTopBar) obj2;
                FriendsImportFragment friendsImportFragment = (FriendsImportFragment) obj;
                if (vkTopBar != null) {
                    int i3 = FriendsImportFragment.a0;
                    vkTopBar.setVisibility(0);
                }
                BaseVkSearchView baseVkSearchView = friendsImportFragment.T;
                if (baseVkSearchView != null) {
                    baseVkSearchView.setVisibility(8);
                }
                BaseVkSearchView baseVkSearchView2 = friendsImportFragment.T;
                if (baseVkSearchView2 != null) {
                    baseVkSearchView2.U4();
                }
                return s3q0.a;
            case 13:
                ArrayList<Integer> arrayList = h6t.a;
                ((izs) obj2).invoke(new o9t.m(new djc.a(((g6t) obj).c)));
                return s3q0.a;
            case 14:
                return new eq00(((com.vk.clips.sdk.shared.item.market_ads.b) obj2).h, new d11(e3m.a(R.dimen.clip_owner_avatar_height, (Context) obj)));
            case 15:
                ((nu10) obj2).b.getContentResolver().unregisterContentObserver((lu10.a) obj);
                return s3q0.a;
            case 16:
                int i4 = OverlayPermissionFragment.S;
                ((fww0) obj2).invoke();
                ((OverlayPermissionFragment) obj).tn();
                return s3q0.a;
            case 17:
                ((bob0) obj2).e(!((yrb0) obj).b);
                return s3q0.a;
            case 18:
                RecyclerView recyclerView = (RecyclerView) obj;
                List A = rli0.A(new ulp0(new jxt0(recyclerView), new isb0(i2, recyclerView, (pbc0) obj2)));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(A);
                animatorSet.addListener(new obc0());
                animatorSet.start();
                return s3q0.a;
            case 19:
                View findViewById = ((ixi0) obj2).a.findViewById(R.id.back);
                jjc.g(findViewById, new ggb0((po5) obj, 10));
                return findViewById;
            case 20:
                SettingsFragmentInternalComponent settingsFragmentInternalComponent = (SettingsFragmentInternalComponent) obj;
                SettingsFragmentInternalComponent.a aVar = SettingsFragmentInternalComponent.j;
                SettingsState settingsState = (SettingsState) ((gzs) obj2).invoke();
                if (settingsState != null) {
                    return settingsState;
                }
                SettingsArguments settingsArguments = settingsFragmentInternalComponent.a.a;
                return new SettingsState(settingsArguments.b, false, null, null, settingsArguments.d, settingsArguments.e, settingsArguments.f, settingsArguments.g, null, atv0.b, null);
            case 21:
                Context context = (Context) obj2;
                oij0 oij0Var = (oij0) obj;
                int i5 = PushOpenActivity.f;
                String str4 = oij0Var.l;
                oij0.a aVar2 = oij0Var.x;
                Intent a2 = PushOpenActivity.a.a(str4, context, "open_notification", aVar2.a("type"), aVar2.a(AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT), aVar2.a("need_track_interaction"));
                i35 i35Var = i35.c;
                a2.setAction(String.valueOf(i35Var.e()));
                a2.putExtra("title", aVar2.m);
                a2.putExtra("text", aVar2.n);
                a2.putExtra("button", aVar2.o);
                a2.putExtra("url", aVar2.p);
                a2.putExtra("target_user_id", aVar2.k);
                return t2i0.a(context, i35Var.e(), a2, 167772160);
            case 22:
                clj0 clj0Var = (clj0) obj2;
                rmy rmyVar = (rmy) obj;
                try {
                    a = clj0Var.a(rmyVar);
                    str2 = a.a;
                    try {
                        str = a.b;
                    } catch (Throwable th) {
                        th = th;
                        str = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str = null;
                }
                try {
                    String str5 = a.c;
                    rmy.a aVar3 = rmyVar instanceof rmy.a ? (rmy.a) rmyVar : null;
                    if (aVar3 != null && aVar3.d) {
                        z = true;
                    }
                    clj0Var.c.m(str2, str, str5, !z);
                    fvw c = clj0Var.c();
                    if (c != null) {
                        return c;
                    }
                    throw new IllegalStateException("Broadcast not found right after creation");
                } catch (Throwable th3) {
                    th = th3;
                    str3 = str2;
                    throw new clj0.a(str3, str, th);
                }
            case 23:
                return new jf40((u750) obj2, (x2b0) obj);
            case 24:
                ((myl0) obj2).c((t2l0) obj);
                return s3q0.a;
            case 25:
                int i6 = ThemedFeedToolbarFragment.a0;
                ((gzs) obj2).invoke();
                ((ThemedFeedToolbarFragment) obj).Z = null;
                return s3q0.a;
            case 26:
                ((izs) obj2).invoke((kvp0.a) ((wh50) obj).getValue());
                return s3q0.a;
            case 27:
                ((izs) obj2).invoke(((yc0) obj).g);
                return s3q0.a;
            case 28:
                pk30 pk30Var = (pk30) obj2;
                ssr0 ssr0Var = (ssr0) obj;
                if (pk30Var != null) {
                    pk30Var.I(ssr0Var.e);
                }
                return s3q0.a;
            default:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) obj2;
                com.vk.video.ui.discovery.minimizable.q qVar = (com.vk.video.ui.discovery.minimizable.q) obj;
                com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
                if (com.vk.libvideo.autoplay.e.a()) {
                    gVar.d0(qVar, g.b.AUTO);
                }
                return s3q0.a;
        }
    }
}
