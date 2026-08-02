package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Trace;
import android.util.Size;
import android.view.View;
import android.widget.TextView;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.container.CatalogBannerVh;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.fave.di.FaveComponent;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.a;
import com.vk.newsfeed.api.posting.listsfriends.ListsFriendsDefaultList;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.tag.CommunityActionTags;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.api.dto.auth.UserItem;
import com.vk.superapp.multiaccount.api.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import xsna.bs60;
import xsna.cru0;
import xsna.e260;
import xsna.fh8;
import xsna.gh8;
import xsna.hv70;
import xsna.ikv0;
import xsna.ksf;
import xsna.rv9;
import xsna.vx70;
import xsna.wml0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class hn9 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hn9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        e2q e2qVar;
        MusicTrack musicTrack;
        ExposedFunction invoke$lambda$38;
        s3q0 loadFailure$lambda$3;
        switch (this.b) {
            case 0:
                CameraUIView cameraUIView = (CameraUIView) this.c;
                TextView textView = (TextView) this.d;
                float f = CameraUIView.w1;
                int measuredWidth = cameraUIView.getMeasuredWidth();
                if (textView.getMaxWidth() != measuredWidth && measuredWidth > 0) {
                    textView.setMaxWidth(measuredWidth);
                }
                return s3q0.a;
            case 1:
                ((izs) this.c).invoke(new rv9.i.c((a.C0919a) this.d));
                return s3q0.a;
            case 2:
                CatalogBannerVh catalogBannerVh = (CatalogBannerVh) this.c;
                Context context = (Context) this.d;
                com.vk.core.utils.newtork.b.a.getClass();
                if (com.vk.core.utils.newtork.b.d()) {
                    catalogBannerVh.f.c();
                    yok0 yok0Var = catalogBannerVh.i;
                    if (yok0Var == null || !yok0Var.isActive()) {
                        catalogBannerVh.i = myc0.h(catalogBannerVh.g, null, null, new CatalogBannerVh.a(catalogBannerVh, context, null), 3);
                    }
                } else {
                    ikv0.a aVar = new ikv0.a(context);
                    aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_globe_cross_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
                    aVar.u = new ikv0.d(context.getString(R.string.snackbar_adfree_network_error_message), (String) null, (ikv0.d.a) null, 6);
                    aVar.n();
                }
                return s3q0.a;
            case 3:
                return "loadByCache(): missing channelIds = " + j5g.g0((List) this.c, null, null, null, 0, null, 63) + "\nrequestedIds = " + j5g.g0((ArrayList) this.d, null, null, null, 0, null, 63);
            case 4:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.c;
                ksf ksfVar = (ksf) this.d;
                int i = ClipsWrapperFragment.Q0;
                npf npfVar = ((ksf.a) ksfVar).a;
                clipsWrapperFragment.getClass();
                xn50.a.c(clipsWrapperFragment, npfVar);
                return s3q0.a;
            case 5:
                ((d3h) this.c).h((String) this.d, true);
                return s3q0.a;
            case 6:
                cih cihVar = (cih) this.c;
                return new dgh(cihVar.a, cihVar.b, (po5) this.d, cihVar.c, cihVar.d, cihVar.f, cihVar.e);
            case 7:
                ((com.vk.profile.community.impl.ui.profile.actions.e) this.c).b.i(((d.b.c) ((d.b) this.d)).a);
                return s3q0.a;
            case 8:
                ((v4i) this.c).j.invoke((View) this.d, CommunityActionTags.LEAVE);
                return s3q0.a;
            case 9:
                String str = (String) this.c;
                gzs gzsVar = (gzs) this.d;
                ndp0.b(str);
                try {
                    return gzsVar.invoke();
                } finally {
                    Trace.endSection();
                }
            case 10:
                a2q a2qVar = (a2q) this.c;
                UserItem userItem = (UserItem) this.d;
                Object obj = a2qVar.o;
                c2q c2qVar = (c2q) (obj != null ? obj : null);
                c2qVar.getClass();
                SchemeStatSak$TypeRegistrationItem.EventType eventType = SchemeStatSak$TypeRegistrationItem.EventType.FULL_LOGOUT;
                UserId userId = userItem.b;
                c2qVar.C.e(new a.f(c2qVar.E, eventType, userId, e43.m(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.LOGOUT_REASON, "", "", "DROP_ACCOUNT_TAP".toLowerCase(Locale.ROOT))), null));
                d2q.D0(userItem.c);
                c2r0 c2r0Var = c2qVar.f;
                Context context2 = c2qVar.b;
                c2r0Var.b(context2, userId);
                c2qVar.g.b(context2, userId);
                c2qVar.N();
                ArrayList arrayList = c2qVar.x;
                if (arrayList.size() > 1 && (e2qVar = (e2q) c2qVar.a) != null) {
                    e2qVar.U7(0, arrayList);
                }
                return s3q0.a;
            case 11:
                k5q k5qVar = (k5q) this.c;
                soz sozVar = (soz) this.d;
                String uri = sozVar.a.toString();
                if (drm0.D(uri, ".ts", false) && (musicTrack = k5qVar.a) != null && k5qVar.i.get(sozVar.a) == null) {
                    bpn0 bpn0Var = e260.e;
                    e260 a = e260.a.a();
                    a.getClass();
                    Object obj2 = cru0.j;
                    if (cru0.a.b()) {
                        a.b.put(uri, new e260.b());
                    }
                    int i2 = musicTrack.b;
                    UserId userId2 = musicTrack.c;
                    ConcurrentHashMap<Uri, am4> concurrentHashMap = k5qVar.i;
                    Uri uri2 = sozVar.a;
                    am4 am4Var = new am4(i2, userId2, uri);
                    am4Var.e = sozVar.b;
                    concurrentHashMap.put(uri2, am4Var);
                }
                return s3q0.a;
            case 12:
                invoke$lambda$38 = HandleInvocationsFromAdViewer.invoke$lambda$38((HandleInvocationsFromAdViewer) this.c, (AdObject) this.d);
                return invoke$lambda$38;
            case 13:
                ukv ukvVar = (ukv) this.c;
                zqa zqaVar = (zqa) this.d;
                mkx mkxVar = ukvVar.b;
                tkv tkvVar = ukvVar.c;
                vx70.b bVar = (vx70.b) vhk0.h(mkxVar.j, "OkHttpExecutor", new lkx(mkxVar, new qob(tkvVar), ukvVar.e), 4);
                a9v.b(zqaVar, bVar.b, a9v.a(tkvVar.a));
                return bVar;
            case 14:
                r6y r6yVar = (r6y) this.c;
                fvv0 fvv0Var = (fvv0) this.d;
                r2y r2yVar = new r2y();
                r2yVar.a = r6yVar;
                r2yVar.b = fvv0Var;
                return r2yVar;
            case 15:
                loadFailure$lambda$3 = LegacyLoadUseCase.loadFailure$lambda$3((LegacyLoadUseCase) this.c, (LoadResult.Failure) this.d);
                return loadFailure$lambda$3;
            case 16:
                uhz uhzVar = (uhz) this.c;
                com.vk.newsfeed.common.posting.listfriends.a aVar2 = (com.vk.newsfeed.common.posting.listfriends.a) this.d;
                View findViewById = uhzVar.m.findViewById(R.id.ds_internal_cell_right_extra_actions_wrapper);
                int c = dhr0.t.c(R.attr.vk_ui_icon_accent);
                findViewById.getContext();
                e.b bVar2 = new e.b(findViewById, null, null, c, 6);
                bVar2.w = R.layout.ds_internal_context_menu_item;
                VkContextMenu.c.d(bVar2, y8g0.e(R.string.list_friends_overflow_menu_edit_list), null, false, new com.vk.movika.sdk.base.ui.r0(14, uhzVar, aVar2), 30);
                ListsFriendsDefaultList.a aVar3 = ListsFriendsDefaultList.Companion;
                int i3 = aVar2.b;
                aVar3.getClass();
                if (!ListsFriendsDefaultList.a.a(i3)) {
                    VkContextMenu.c.d(bVar2, y8g0.e(R.string.list_friends_overflow_menu_remove_list), null, false, new jl4(11, uhzVar, aVar2), 30);
                }
                bVar2.l(false);
                return s3q0.a;
            case 17:
                ((izs) this.c).invoke(Long.valueOf(((s110) this.d).a));
                return s3q0.a;
            case 18:
                String str2 = (String) this.c;
                return Boolean.valueOf(qu20.b(str2) ? drm0.D((CharSequence) ((bpn0) this.d).getValue(), str2.subSequence(1, str2.length()), false) : false);
            case 19:
                return Float.valueOf(((Number) ((wh50) this.c).getValue()).intValue() == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ((Number) ((wh50) this.d).getValue()).intValue() / ((Number) r0.getValue()).intValue());
            case 20:
                v4d0 v4d0Var = (v4d0) this.c;
                gzs gzsVar2 = (gzs) this.d;
                if (v4d0Var != null) {
                    ww50<?> ww50Var = v4d0Var.b;
                    if (ww50Var != null) {
                        ww50Var.H(v4d0Var.c);
                    }
                    v4d0Var.a = null;
                    v4d0Var.b = null;
                }
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                return s3q0.a;
            case 21:
                fq60 fq60Var = (fq60) this.c;
                Lazy lazy = (Lazy) this.d;
                String str3 = com.vk.newsfeed.common.util.k.a;
                return new mc60(new p4r(), new po40(), new eq60(fq60Var.a), lazy);
            case 22:
                return new hs60(Collections.singleton(com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_DIGEST_DZEN)), new bs60.a(((bs60) this.c).f), (Lazy) this.d);
            case 23:
                ((izs) this.c).invoke(new a.c(((hv70.c) this.d).a));
                return s3q0.a;
            case 24:
                nkd nkdVar = (nkd) this.c;
                ikd ikdVar = (ikd) this.d;
                if (nkdVar != null) {
                    nkdVar.a(ClipsBottomSheetSideEffectOptions.REMOVE_FROM_OWNER, ikdVar.a);
                }
                return s3q0.a;
            case 25:
                uph0[] uph0VarArr = (uph0[]) this.c;
                eph0 eph0Var = (eph0) this.d;
                for (uph0 uph0Var : uph0VarArr) {
                    uph0Var.toString();
                    eph0Var.h.b(uph0Var);
                }
                return s3q0.a;
            case 26:
                ((izs) this.c).invoke(new wml0.a.j(((zni0) this.d).a));
                return s3q0.a;
            case 27:
                clj0 clj0Var = (clj0) this.c;
                gh8.d.a aVar4 = (gh8.d.a) this.d;
                clj0Var.e.invoke(new fh8.h.c(aVar4.a, aVar4.b));
                return s3q0.a;
            case 28:
                AtomicInteger atomicInteger = (AtomicInteger) this.c;
                gzs gzsVar3 = (gzs) this.d;
                if (atomicInteger.decrementAndGet() <= 0) {
                    gzsVar3.invoke();
                }
                return s3q0.a;
            default:
                return new bml0((Context) this.c, ((FaveComponent) ((h7m) this.d).mo408a(fpf0.a(FaveComponent.class))).xf());
        }
    }

    public /* synthetic */ hn9(String str, qu20 qu20Var, bpn0 bpn0Var) {
        this.b = 18;
        this.c = str;
        this.d = bpn0Var;
    }
}
