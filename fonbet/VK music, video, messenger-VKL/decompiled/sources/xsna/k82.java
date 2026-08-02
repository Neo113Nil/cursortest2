package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.SurfaceView;
import android.view.ViewGroup;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.verification.base.stats.VerificationStatFlow;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenUrl;
import com.vk.catalog2.common.dto.ui.actions.UIBlockMusicFollowOwnerButton;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMyShelfPlayable;
import com.vk.catalog2.feature.music.holders.MusicFollowOwnerButtonVh;
import com.vk.dto.common.VideoFile;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.games.model.GamesCatalogScreenTab;
import com.vk.im.engine.exceptions.chat.AlreadyInChatException;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.fragments.ImDialogsSelectionFragment;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreImageEntry;
import com.vk.newsfeed.common.recycler.holders.videos.clips.ClipsHolderViewImpl;
import com.vk.newsfeed.posting.impl.domain.model.RelativeImageCropArea;
import com.vk.notifications.settings.CommunitiesManageNotificationsFragment;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vkworkout.types.SyncWorkoutReason;
import com.vk.update.core.a;
import com.vk.update.core.c;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledWatchTogetherOption;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.akd;
import xsna.bex0;
import xsna.e8v0;
import xsna.edt;
import xsna.egp0;
import xsna.eqc;
import xsna.f2w0;
import xsna.gyw0;
import xsna.h3k0;
import xsna.iet;
import xsna.iyw0;
import xsna.k2a0;
import xsna.u2u0;
import xsna.xjd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class k82 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k82(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01d0  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        RelativeImageCropArea relativeImageCropArea;
        sir0 sir0Var;
        LibverifyScreenData b;
        boolean z;
        obi0 b2;
        int a;
        int i = this.b;
        int i2 = 8;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                j82 j82Var = (j82) obj2;
                SurfaceView surfaceView = new SurfaceView((Context) obj);
                ((izs) obj3).invoke(j82Var);
                surfaceView.getHolder().addCallback(j82Var);
                return surfaceView;
            case 1:
                io.reactivex.rxjava3.internal.operators.completable.s sVar = (io.reactivex.rxjava3.internal.operators.completable.s) obj3;
                final Context context = (Context) obj2;
                final k2a0 k2a0Var = (k2a0) obj;
                if ((k2a0Var instanceof k2a0.c) || (k2a0Var instanceof k2a0.a)) {
                    return sVar;
                }
                if (k2a0Var instanceof k2a0.b) {
                    return sVar.c(io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.d55
                        @Override // io.reactivex.rxjava3.functions.a
                        public final void run() {
                            l55.a.getClass();
                            ((l2a0) l55.e.getValue()).b(context, ((k2a0.b) k2a0Var).a);
                        }
                    }).q(io.reactivex.rxjava3.android.schedulers.a.b()));
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                ClipsDraftPersistentStore.r(ClipsDraftPersistentStore.b, (String) obj3, 6);
                ClipsDraftPersistentStore.s();
                ((io.reactivex.rxjava3.core.b) obj2).onComplete();
                return s3q0.a;
            case 3:
                qfe qfeVar = (qfe) obj3;
                com.vk.lists.c cVar = (com.vk.lists.c) obj2;
                eqc.a aVar = (eqc.a) obj;
                if (aVar instanceof eqc.a.b) {
                    eqc.a.b bVar = (eqc.a.b) aVar;
                    if (!bVar.a.isEmpty()) {
                        qfeVar.d(bVar.a, false);
                        ClipsHolderViewImpl clipsHolderViewImpl = qfeVar.b;
                        boolean z2 = j5g.i0(qfeVar.f.d) instanceof xjd.b;
                        clipsHolderViewImpl.x.invalidateItemDecorations();
                        if (z2) {
                            akd akdVar = clipsHolderViewImpl.U;
                            if (!((akdVar == null ? null : akdVar) instanceof akd.a)) {
                                if (!((akdVar != null ? akdVar : null) instanceof akd.d)) {
                                    clipsHolderViewImpl.x.setEdgeEffectFactory(clipsHolderViewImpl.W);
                                }
                            }
                        }
                        clipsHolderViewImpl.x.setEdgeEffectFactory(clipsHolderViewImpl.V);
                    }
                } else if (epx.f(aVar, eqc.a.c.a)) {
                    cVar.p(false);
                } else {
                    if (!epx.f(aVar, eqc.a.C2834a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.s(null);
                    cVar.r(false);
                }
                return s3q0.a;
            case 4:
                CommunitiesManageNotificationsFragment communitiesManageNotificationsFragment = (CommunitiesManageNotificationsFragment) obj3;
                ((rj70) communitiesManageNotificationsFragment.Y.getValue()).b();
                communitiesManageNotificationsFragment.io(((Group) obj2).c);
                communitiesManageNotificationsFragment.X = ((cvl) obj).b;
                return s3q0.a;
            case 5:
                return new wxh((ViewGroup) obj, cn70.b(16), new RecyclerView.u(), ((fyh) obj2).i, ((Boolean) ((com.vk.movika.sdk.base.logic.interactor.h) obj3).invoke()).booleanValue());
            case 6:
                ((v940) obj).b((ykk) obj3, (ax1) obj2);
                return s3q0.a;
            case 7:
                ((com.vk.im.ui.components.viewcontrollers.dialog_header.info.b) obj3).E((MenuItem) obj2);
                return s3q0.a;
            case 8:
                ((lrs) obj3).a.a((VkOnboardingCampaign) obj2, VkOnboardingType.Tooltip, e8v0.m.b);
                return s3q0.a;
            case 9:
                xbt xbtVar = (xbt) obj3;
                GamesCatalogScreenTab gamesCatalogScreenTab = (GamesCatalogScreenTab) obj2;
                adt adtVar = (adt) obj;
                mzp0 mzp0Var = xbtVar.i;
                if (mzp0Var != null) {
                    mzp0Var.c(false);
                }
                xbtVar.T(new edt.f.e(adtVar.f, uca.a() ? adtVar.g : null, vdt.a(adtVar.c), adtVar.e, adtVar.d, gamesCatalogScreenTab));
                tct tctVar = adtVar.a;
                if (tctVar != null) {
                    xbtVar.X(new iet.f(new zct(tctVar.d, tctVar.a, tctVar.b, tctVar.e, tctVar.c)));
                }
                i9t i9tVar = adtVar.b;
                if (i9tVar != null) {
                    xbtVar.X(new iet.d(new n9t(i9tVar.a, i9tVar.b, i9tVar.c, i9tVar.d, i9tVar.e, i9tVar.f)));
                }
                return s3q0.a;
            case 10:
                ImDialogsSelectionFragment imDialogsSelectionFragment = (ImDialogsSelectionFragment) obj3;
                DialogExt dialogExt = (DialogExt) obj2;
                Throwable th = (Throwable) obj;
                int i3 = ImDialogsSelectionFragment.n0;
                zk70.e(th);
                if (th instanceof AlreadyInChatException) {
                    imDialogsSelectionFragment.go(dialogExt);
                }
                return s3q0.a;
            case 11:
                com.vk.update.core.a aVar2 = (com.vk.update.core.a) obj3;
                a.C1935a c1935a = (a.C1935a) obj2;
                Throwable th2 = (Throwable) obj;
                aVar2.g.m("error download the update", th2);
                aVar2.h.a(c1935a.b.a(), new c.C1936c(c1935a.a.b));
                aVar2.c.f(th2, new ni0(i2, aVar2, c1935a));
                return s3q0.a;
            case 12:
                ((p3y) obj3).X0().a(((JSONObject) obj).optString("response"), (String) obj2);
                return s3q0.a;
            case 13:
                x6y x6yVar = (x6y) obj3;
                String str = (String) obj2;
                Pair pair = (Pair) obj;
                if (((Boolean) pair.i()).booleanValue()) {
                    bex0.a.b(x6yVar, JsApiMethodType.DOWNLOAD_FILE, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("result", true), str, 8);
                } else {
                    bex0.a.a(x6yVar, JsApiMethodType.DOWNLOAD_FILE, VkAppsErrors.Client.UNKNOWN_ERROR, String.valueOf(((Number) pair.j()).intValue()), null, null, 56);
                }
                return s3q0.a;
            case 14:
                ofy ofyVar = (ofy) obj2;
                y4l0 y4l0Var = ((nfy) obj3).l;
                if (y4l0Var != null) {
                    y4l0Var.i(null, ofyVar.b, "stickers_keyboard");
                }
                return s3q0.a;
            case 15:
                u2u0 u2u0Var = (u2u0) obj3;
                x020 x020Var = (x020) obj2;
                MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) obj;
                if (!epx.f(u2u0Var, u2u0.a.a)) {
                    if (epx.f(u2u0Var, u2u0.b.a)) {
                        return null;
                    }
                    if (!(u2u0Var instanceof u2u0.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((u2u0.c) u2u0Var).getClass();
                    throw null;
                }
                if (mediaStoreEntry instanceof MediaStoreImageEntry) {
                    MediaStoreImageEntry mediaStoreImageEntry = (MediaStoreImageEntry) mediaStoreEntry;
                    h3k0.a a2 = x020Var.d.a(mediaStoreImageEntry.m, mediaStoreImageEntry.n);
                    relativeImageCropArea = new RelativeImageCropArea(a2.e, a2.f, a2.g, a2.h, a2.i, a2.j);
                } else {
                    relativeImageCropArea = null;
                }
                if (relativeImageCropArea == null) {
                    return null;
                }
                return new udc0(relativeImageCropArea);
            case 16:
                MusicFollowOwnerButtonVh musicFollowOwnerButtonVh = (MusicFollowOwnerButtonVh) obj3;
                UIBlockMusicFollowOwnerButton uIBlockMusicFollowOwnerButton = (UIBlockMusicFollowOwnerButton) obj2;
                BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) obj;
                musicFollowOwnerButtonVh.f = null;
                if (baseBoolIntDto == BaseBoolIntDto.YES) {
                    uIBlockMusicFollowOwnerButton.A = false;
                    musicFollowOwnerButtonVh.b(false);
                }
                return s3q0.a;
            case 17:
                return new UIBlockMyShelfPlayable(((bi20) obj3).b(), (CatalogButtonOpenUrl) obj2, (MusicTrack) obj, null, 8, null);
            case 18:
                cp70 cp70Var = (cp70) obj3;
                String str2 = (String) obj2;
                VkAuthValidatePhoneResult vkAuthValidatePhoneResult = (VkAuthValidatePhoneResult) obj;
                cp70Var.K = vkAuthValidatePhoneResult.b;
                cp70Var.e.getClass();
                if (str2 != null && !drm0.N(str2) && (b = sir0.b((sir0Var = sir0.a), cp70Var.b, str2, vkAuthValidatePhoneResult)) != null) {
                    SignUpRouter signUpRouter = cp70Var.n;
                    sir0.f(sir0Var, signUpRouter != null ? signUpRouter : null, b, null, null, 12);
                    return s3q0.a;
                }
                String str3 = vkAuthValidatePhoneResult.m;
                vo70 vo70Var = (vo70) cp70Var.a;
                if (vo70Var != null) {
                    vo70Var.Xj(str3);
                }
                vo70 vo70Var2 = (vo70) cp70Var.a;
                if (vo70Var2 != null) {
                    vo70Var2.da(cp70Var.E.a() == VerificationStatFlow.SIGN_UP);
                }
                return s3q0.a;
            case 19:
                p1a0 p1a0Var = (p1a0) obj3;
                VkOnboardingCampaign vkOnboardingCampaign = (VkOnboardingCampaign) obj2;
                if (((Boolean) obj).booleanValue()) {
                    p1a0Var.d.a(vkOnboardingCampaign, VkOnboardingType.Tooltip, e8v0.j.b);
                }
                return s3q0.a;
            case 20:
                Boolean bool = (Boolean) obj;
                ((VideoFile) obj3).r0(bool.booleanValue());
                ((com.vk.newsfeed.impl.presenters.b) obj2).i0().ua(bool.booleanValue());
                return s3q0.a;
            case 21:
                ((ror) obj3).post(new fv((b4d0) obj2, ((Integer) obj).intValue(), 1));
                return s3q0.a;
            case 22:
                bei0 bei0Var = (bei0) obj3;
                Context context2 = (Context) obj2;
                tco0 tco0Var = (tco0) obj;
                tco0Var.a();
                fh50<uco0> fh50Var = tco0Var.a;
                TextContextMenuItems textContextMenuItems = TextContextMenuItems.Copy;
                boolean h = bei0Var.h();
                wzb0 wzb0Var = new wzb0(bei0Var, i2);
                Resources resources = context2.getResources();
                int i4 = 29;
                zf1 zf1Var = new zf1(i4, wzb0Var, r5);
                if (h) {
                    fh50Var.j(new edo0(textContextMenuItems.i(), resources.getString(textContextMenuItems.j()), textContextMenuItems.h(), zf1Var));
                }
                TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.SelectAll;
                oei0 oei0Var = bei0Var.a;
                ArrayList j = oei0Var.j(bei0Var.j());
                if (!j.isEmpty()) {
                    int size = j.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        cai0 cai0Var = (cai0) j.get(i5);
                        us2 text = cai0Var.getText();
                        if (text.c.length() != 0 && ((b2 = oei0Var.i().b(cai0Var.e())) == null || Math.abs(b2.a.b - b2.b.b) != text.c.length())) {
                            z = false;
                            dei0 dei0Var = new dei0(bei0Var, 0);
                            yu60 yu60Var = new yu60(bei0Var, 20);
                            Resources resources2 = context2.getResources();
                            zf1 zf1Var2 = new zf1(i4, yu60Var, dei0Var);
                            if (!z) {
                                fh50Var.j(new edo0(textContextMenuItems2.i(), resources2.getString(textContextMenuItems2.j()), textContextMenuItems2.h(), zf1Var2));
                            }
                            tco0Var.a();
                            return s3q0.a;
                        }
                    }
                }
                z = true;
                dei0 dei0Var2 = new dei0(bei0Var, 0);
                yu60 yu60Var2 = new yu60(bei0Var, 20);
                Resources resources22 = context2.getResources();
                zf1 zf1Var22 = new zf1(i4, yu60Var2, dei0Var2);
                if (!z) {
                }
                tco0Var.a();
                return s3q0.a;
            case 23:
                pbl0 pbl0Var = (pbl0) obj3;
                val0 val0Var = ((wbl0) obj2).l;
                pbl0Var.b((val0Var != null ? val0Var : null).b);
                return Boolean.TRUE;
            case 24:
                vkl0 vkl0Var = (vkl0) obj3;
                kpl0 kpl0Var = (kpl0) obj2;
                g47 g47Var = (g47) obj;
                l370.o(g47Var, new yu60(kpl0Var, vkl0Var), f9t.z(vkl0Var), new xsq(kpl0Var, 26));
                l370.m(g47Var, f9t.w(vkl0Var));
                g47Var.d(new rkl0(vkl0Var));
                return s3q0.a;
            case 25:
                com.vk.superapp.ui.a aVar3 = (com.vk.superapp.ui.a) obj3;
                Activity activity = (Activity) obj2;
                SelectedDataSource selectedDataSource = (SelectedDataSource) obj;
                if (selectedDataSource != SelectedDataSource.UNKNOWN) {
                    f2w0.b.a(aVar3.f, activity, new ton0(SyncWorkoutReason.WIDGET_UPDATE, false), null, null, selectedDataSource, 28);
                }
                return s3q0.a;
            case 26:
                hcp0 hcp0Var = (hcp0) obj2;
                ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                bVar2.u = ((lf30) obj3).getView().getId();
                Context context3 = hcp0Var.s;
                int a3 = e3m.a(hcp0Var.a ? R.dimen.video_topshelf_content_margin_bottom : R.dimen.video_topshelf_content_margin_bottom_without_dots, context3);
                zbp0 zbp0Var = hcp0Var.u;
                boolean z3 = zbp0Var.e;
                int i6 = R.dimen.video_topshelf_content_margin_horizontal;
                int a4 = e3m.a(z3 ? R.dimen.video_topshelf_tablet_margins_horizontal : R.dimen.video_topshelf_content_margin_horizontal, context3);
                if (zbp0Var.f) {
                    if (zbp0Var.e) {
                        i6 = R.dimen.video_topshelf_tablet_margins_horizontal;
                    }
                    a = e3m.a(i6, context3);
                } else {
                    a = 0;
                }
                bVar2.t = 0;
                bVar2.l = 0;
                bVar2.setMargins(a4, 0, a, a3);
                return s3q0.a;
            case 27:
                ((xfp0) obj3).V(egp0.a.C2808a.b, ((fgp0) obj2).b);
                return s3q0.a;
            case 28:
                gzs gzsVar = (gzs) obj2;
                ((ikv0) obj).a();
                fpq0 fpq0Var = ((pnq0) obj3).d;
                (fpq0Var != null ? fpq0Var : null).B((com.vk.profile.user.impl.ui.f) gzsVar.invoke());
                return s3q0.a;
            default:
                cyw0 cyw0Var = (cyw0) obj3;
                iyw0.a aVar4 = (iyw0.a) obj;
                ScheduledWatchTogetherOption scheduledWatchTogetherOption = aVar4.g;
                ScheduledWatchTogetherOption a5 = ScheduledWatchTogetherOption.a(scheduledWatchTogetherOption, true ^ scheduledWatchTogetherOption.c);
                cyw0Var.T(new gyw0.j(a5));
                cyw0.V(cyw0Var, null, null, null, null, null, a5, null, null, null, aVar4, 479);
                return s3q0.a;
        }
    }
}
