package xsna;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.vk.appredirects.ui.AppRedirectsSettingsFragment;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicVerticalListVh;
import com.vk.clips.design.view.feed.ClipCoauthorInvitationView;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListState;
import com.vk.clips.favorites.impl.ui.folders.picker.c;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.core.ui.themes.VKTheme;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.common.AttachmentType;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.ecomm.cart.api.router.models.CartCounterState;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.voip.ui.settings.participants_view.j;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.a5e;
import xsna.d4e;
import xsna.hab;
import xsna.wgb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ul1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ul1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v73, types: [xsna.j8i, xsna.smb$a] */
    /* JADX WARN: Type inference failed for: r1v77, types: [xsna.dqb$a, xsna.j8i] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v17, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.wzs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean flush$lambda$6;
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return Boolean.valueOf(((PhotoAlbum) obj).b == ((PhotoAlbum) obj2).b);
            case 1:
                ((io.reactivex.rxjava3.subjects.f) obj2).onNext(EmptyList.b);
                com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
                return s3q0.a;
            case 2:
                j03.j(((lu1) obj2).c.getActivity(), (Throwable) obj);
                return s3q0.a;
            case 3:
                flush$lambda$6 = AndroidDiagnosticEventRepository.flush$lambda$6((AndroidDiagnosticEventRepository) obj2, (DiagnosticEventRequestOuterClass.DiagnosticEvent) obj);
                return Boolean.valueOf(flush$lambda$6);
            case 4:
                int i3 = AppRedirectsSettingsFragment.L0;
                ((AppRedirectsSettingsFragment) obj2).Ao((List) obj);
                return s3q0.a;
            case 5:
                ((yd3) obj2).g1(((SimpleAttachListItem) obj).b);
                return s3q0.a;
            case 6:
                z84 z84Var = (z84) obj2;
                if (((Boolean) obj).booleanValue()) {
                    z84Var.b.s3(AttachmentType.MARKET_LINK);
                }
                return s3q0.a;
            case 7:
                iq5 iq5Var = (iq5) obj2;
                Bitmap bitmap = (Bitmap) obj;
                int width = (int) (iq5Var.h.left * bitmap.getWidth());
                RectF rectF = iq5Var.h;
                int height = (int) (rectF.top * bitmap.getHeight());
                int width2 = (int) (rectF.width() * bitmap.getWidth());
                int height2 = (int) (rectF.height() * bitmap.getHeight());
                if (width2 != height2) {
                    width2 = Math.min(width2, height2);
                    height2 = width2;
                }
                Bitmap h = kd7.h(iq5Var.requireContext(), Bitmap.createBitmap(bitmap, width, height, width2, height2), width2 * 0.5f);
                it80.b.getClass();
                return new it80(h);
            case 8:
                p16 p16Var = (p16) obj2;
                ((bp50) p16Var.h.getValue()).d((b520) obj);
                izs<? super ClipItemAction.e, s3q0> izsVar = p16Var.c;
                if (izsVar != null) {
                    izsVar.invoke(ClipItemAction.e.a.b);
                }
                p16Var.b();
                VkContextMenu vkContextMenu = p16Var.e;
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
                return s3q0.a;
            case 9:
                om6 om6Var = (om6) obj2;
                om6Var.b.reset();
                om6Var.f(om6Var.b);
                return s3q0.a;
            case 10:
                final ww7 ww7Var = (ww7) obj2;
                g47 g47Var = (g47) obj;
                g47Var.e(tci.l(ww7Var), com.vk.ecomm.onlinebooking.impl.services.presentation.model.b.b);
                l370.n(g47Var, f9t.w(ww7Var), new x4(6));
                g47Var.d(new xy() { // from class: xsna.ey7
                    @Override // xsna.xy
                    public final void a(lj50 lj50Var) {
                        ww7.this.b((com.vk.ecomm.onlinebooking.impl.services.presentation.a) lj50Var);
                    }
                });
                return s3q0.a;
            case 11:
                wf8 wf8Var = (wf8) obj2;
                yf8 yf8Var = (yf8) ((it80) obj).a;
                wf8Var.a();
                if (!wf8Var.B) {
                    zmp0.a(wf8Var.b, new mk5());
                }
                wf8Var.y.b(yf8Var);
                wf8Var.B = false;
                return s3q0.a;
            case 12:
                ((com.vk.voip.ui.settings.participants_view.c) obj2).a(j.e.a);
                return s3q0.a;
            case 13:
                ((m99) obj2).d(new mz((Boolean) obj, 15));
                return s3q0.a;
            case 14:
                ao8.p(((CartCounterState) obj2).b, ((Integer) obj).intValue());
                return s3q0.a;
            case 15:
                return ((qca) obj2).f;
            case 16:
                uab uabVar = (uab) obj2;
                int intValue = ((Integer) obj).intValue() + 1;
                if (intValue != uabVar.h) {
                    uabVar.h = intValue;
                    uabVar.d.invoke(new hab.b(intValue));
                }
                return s3q0.a;
            case 17:
                wgb wgbVar = (wgb) obj2;
                io.reactivex.rxjava3.subjects.d<io.reactivex.rxjava3.functions.a> dVar = wgbVar.r;
                gz9 gz9Var = wgbVar.b;
                wgb.b bVar = (wgb.b) obj;
                ProfilesInfo profilesInfo = bVar.b;
                qfb qfbVar = bVar.a;
                if (!bVar.f && !bVar.h) {
                    r2 = false;
                }
                if (!bVar.e || bVar.g || r2) {
                    return s3q0.a;
                }
                int i4 = 17;
                if (qfbVar.m()) {
                    gz9Var.a(new ra0(wgbVar, i4));
                    wgbVar.e(wgb.b.a(bVar, null, null, null, 0, false, true, false, 191));
                    dVar.onNext(new ugb(i2, wgbVar, qfbVar));
                } else if (profilesInfo.Gb()) {
                    gz9Var.a(new sa0(wgbVar, i4));
                    wgbVar.e(wgb.b.a(bVar, null, null, null, 0, false, true, false, 191));
                    dVar.onNext(new tgb(i2, wgbVar, profilesInfo.Ab()));
                }
                return s3q0.a;
            case 18:
                ?? r1 = ((smb) obj2).c;
                if (r1 != 0) {
                    r1.I(AvatarAction.REMOVE);
                }
                return s3q0.a;
            case 19:
                ((dqb) obj2).c.g0();
                return s3q0.a;
            case 20:
                uwb.b1((uwb) obj2, (Throwable) obj, null, 2);
                return s3q0.a;
            case 21:
                awt0.r((am) obj, ((ClipCoauthorInvitationView) obj2).t.getContext());
                return s3q0.a;
            case 22:
                ghd ghdVar = (ghd) obj;
                kid presenter = ((pid) obj2).getPresenter();
                if (presenter != null) {
                    presenter.d(ghdVar);
                }
                return s3q0.a;
            case 23:
                return ((com.vk.clips.favorites.impl.ui.folders.content.f) obj2).f.a((ClipsFavoriteFolderContentListState.a) obj);
            case 24:
                com.vk.clips.favorites.impl.ui.folders.picker.b bVar2 = (com.vk.clips.favorites.impl.ui.folders.picker.b) obj2;
                u2e u2eVar = ((d4e.a.d) obj).a;
                bVar2.T(new c.C0609c(u2eVar));
                bVar2.l.b(new a5e.a(u2eVar.a, u2eVar.d));
                return s3q0.a;
            case 25:
                qfe qfeVar = (qfe) obj2;
                bwr0 bwr0Var = (bwr0) obj;
                if (bwr0Var instanceof fyr0) {
                    qfeVar.a(((fyr0) bwr0Var).a);
                } else if (bwr0Var instanceof hxr0) {
                    qfeVar.a(((hxr0) bwr0Var).a);
                } else if (bwr0Var instanceof dyr0) {
                    qfeVar.a(((dyr0) bwr0Var).a);
                } else if (bwr0Var instanceof ywr0) {
                    qfeVar.b(((ywr0) bwr0Var).a);
                } else if (bwr0Var instanceof wxr0) {
                    qfeVar.b(((wxr0) bwr0Var).a);
                } else if (bwr0Var instanceof oxr0) {
                    qfeVar.b(((oxr0) bwr0Var).a);
                }
                return s3q0.a;
            case 26:
                ClipsMusicVerticalListVh clipsMusicVerticalListVh = (ClipsMusicVerticalListVh) obj2;
                jwp0 jwp0Var = (jwp0) obj;
                UIBlock uIBlock = clipsMusicVerticalListVh.G;
                if (uIBlock != null) {
                    jwp0Var.b.invoke(uIBlock, jwp0Var.a);
                    clipsMusicVerticalListVh.N6(uIBlock);
                }
                return s3q0.a;
            case 27:
                s4f s4fVar = (s4f) obj2;
                vqt vqtVar = (vqt) obj;
                s4fVar.i.l(vqtVar.b);
                String str = vqtVar.i;
                if (str == null || str.length() == 0 || vqtVar.a.isEmpty()) {
                    s4fVar.i.r(false);
                }
                return s3q0.a;
            case 28:
                t6g t6gVar = (t6g) obj2;
                p9m p9mVar = (p9m) obj;
                Pair j = bu00.j();
                VKTheme vKTheme = (VKTheme) j.d();
                VKTheme vKTheme2 = (VKTheme) j.g();
                String str2 = p9mVar.a;
                int[] k = fz5.k(p9mVar, vKTheme);
                if (k == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int[] k2 = fz5.k(p9mVar, vKTheme2);
                if (k2 != null) {
                    return new q6g(str2, k, k2, t6gVar.b.invoke(p9mVar).booleanValue());
                }
                throw new IllegalArgumentException("Required value was null.");
            default:
                ((d4h) obj2).i.invoke((CommunityProfileAction.CommunityInternalMenuAction) obj);
                return s3q0.a;
        }
    }
}
