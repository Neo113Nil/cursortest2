package xsna;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.vk.api.generated.shortVideo.dto.ShortVideoSetCoOwnerStatusResponseDto;
import com.vk.api.generated.translations.dto.TranslationsTranslateResponseDto;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.auth.entername.EnterProfilePresenter;
import com.vk.catalog2.feature.music.holders.curator.CuratorInfoVhOld;
import com.vk.clips.attachments.impl.publish.links.edit.helper.EditLinkHideReason;
import com.vk.clips.coauthors.invite.CoauthorsInviteDialog;
import com.vk.clips.editor.templates.impl.views.main.ClipsTemplateEditorFragment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Peer;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.g;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.view.CommunityReviewsView;
import com.vk.friends.impl.cleanup.presentation.fragment.FriendsCleanupFragment;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.im.engine.models.education.EduScheduleOnDayModel;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.media.MediaFilteringStrategy;
import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.net.DownloadService;
import xsna.a4j;
import xsna.bex0;
import xsna.gm50;
import xsna.h2g0;
import xsna.hnd;
import xsna.it80;
import xsna.j0j;
import xsna.lke;
import xsna.pwh;
import xsna.qzr;
import xsna.w1g0;
import xsna.xje;
import xsna.xyj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wje implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wje(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        xy2 o;
        s3q0 download$lambda$0$3;
        int i = this.b;
        int i2 = 6;
        int i3 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                xje xjeVar = (xje) obj2;
                lke lkeVar = (lke) obj;
                xje.b bVar = xje.j1;
                if (lkeVar instanceof lke.a) {
                    lke.a aVar = (lke.a) lkeVar;
                    xjeVar.bo(new EditLinkHideReason.RulesClick(aVar.a, aVar.b));
                } else {
                    if (!(lkeVar instanceof lke.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lke.b bVar2 = (lke.b) lkeVar;
                    xjeVar.bo(new EditLinkHideReason.SaveClick(bVar2.a, bVar2.b));
                }
                return s3q0.a;
            case 1:
                int i4 = ClipsTemplateEditorFragment.h0;
                ((ClipsTemplateEditorFragment) obj2).eo().k();
                return s3q0.a;
            case 2:
                t8f t8fVar = (t8f) obj2;
                t8fVar.n.invoke(Integer.valueOf(t8fVar.getBindingAdapterPosition()));
                return s3q0.a;
            case 3:
                CoauthorsInviteDialog coauthorsInviteDialog = (CoauthorsInviteDialog) obj2;
                Pair pair = (Pair) obj;
                ShortVideoSetCoOwnerStatusResponseDto shortVideoSetCoOwnerStatusResponseDto = (ShortVideoSetCoOwnerStatusResponseDto) pair.d();
                ClipVideoFile clipVideoFile = (ClipVideoFile) pair.g();
                if (shortVideoSetCoOwnerStatusResponseDto.d()) {
                    wjs0.a(new fyr0(clipVideoFile));
                    wjs0.a(pwr0.a);
                    ((ind) coauthorsInviteDialog.d.getValue()).c(new hnd.b(true, 1, 1), true);
                }
                return s3q0.a;
            case 4:
                qgi0.r((tgi0) obj, "ContactsField" + ((CommunityAddContactsState.ContactField) obj2).d.ordinal());
                return s3q0.a;
            case 5:
                ((hrh) obj2).t();
                return s3q0.a;
            case 6:
                jwh jwhVar = (jwh) obj2;
                f4z f4zVar = jwhVar.k;
                String str = ((b4g0) obj).b;
                if (drm0.N(str)) {
                    jwhVar.T(qwh.b);
                    f4zVar.b(new h2g0.e("", EmptyList.b));
                    jwhVar.C(w1g0.m.b);
                    jwhVar.T(pwh.b.b);
                } else {
                    f4zVar.b(new h2g0.f(oq.d(tlo0.Companion, str)));
                }
                return s3q0.a;
            case 7:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) obj2;
                int i5 = CommunityReviewsFragment.o0;
                gm50.a.a(communityReviewsFragment, ((g.c) obj).a, new h6g(communityReviewsFragment, i2));
                CommunityReviewsView communityReviewsView = communityReviewsFragment.a0;
                if (communityReviewsView != null) {
                    bwt0.p0(communityReviewsView, false);
                }
                communityReviewsFragment.ho(CommunityReviewsFragment.b.ERROR);
                return s3q0.a;
            case 8:
                c1j c1jVar = (c1j) obj2;
                x0j x0jVar = c1jVar.t;
                if (x0jVar != null) {
                    SessionRoomParticipantModel sessionRoomParticipantModel = x0jVar.d;
                    if (!sessionRoomParticipantModel.d && !x0jVar.c) {
                        c1jVar.l.invoke(new j0j.k(sessionRoomParticipantModel.a, true));
                    }
                }
                return s3q0.a;
            case 9:
                ((a4j.a) obj2).k();
                return s3q0.a;
            case 10:
                ((czj) obj2).C(new xyj.h((Coordinates) obj));
                return s3q0.a;
            case 11:
                wck wckVar = (wck) obj2;
                o = wckVar.e.o(fkq0.a(wckVar.d), (r30 & 2) != 0 ? null : null, (r30 & 4) != 0 ? null : null, (r30 & 8) != 0 ? null : null, (r30 & 16) != 0 ? null : null, (r30 & 32) != 0 ? null : null, (r30 & 256) != 0 ? null : null, (r30 & 134217728) != 0 ? null : null, (r31 & 4) != 0 ? null : null, (r32 & 64) != 0 ? null : null, (r32 & 256) != 0 ? null : null, (r32 & 512) != 0 ? null : null, (4194304 & r32) != 0 ? null : null, (r32 & 8388608) != 0 ? null : null);
                return ((awg0) obj).g(rsg0.W(yfb.x(o), 7), new uck(i3), new ueh());
            case 12:
                ((CuratorInfoVhOld) obj2).n = null;
                return s3q0.a;
            case 13:
                d0l d0lVar = (d0l) obj2;
                Long l = (Long) obj;
                wh50<rz8> wh50Var = d0lVar.f;
                if (l != null) {
                    rz8 b = d0lVar.c.b(l.longValue());
                    ((zak0) wh50Var).setValue(d0lVar.a.e(b.b) ? b : null);
                } else {
                    ((zak0) wh50Var).setValue(null);
                }
                return s3q0.a;
            case 14:
                return new h6n0((m420) obj2, (Map<Peer, EduScheduleOnDayModel>) obj);
            case 15:
                StringBuilder sb = new StringBuilder("UPDATE dialogs SET sort_id_local = NULL WHERE id = ");
                long j = ((com.vk.im.engine.models.dialogs.b) obj).b;
                sb.append(j);
                String sb2 = sb.toString();
                tgl0 tgl0Var = ((hpm) obj2).b;
                tgl0Var.b().execSQL(sb2);
                tgl0Var.b().execSQL("UPDATE dialog_weight SET x_sort_id_local = NULL WHERE x_dialog_id = " + j);
                return s3q0.a;
            case 16:
                download$lambda$0$3 = DownloadService.Impl.download$lambda$0$3((DownloadService.Impl) obj2, (String) obj);
                return download$lambda$0$3;
            case 17:
                cop copVar = (cop) ((vop) obj2).a;
                if (copVar != null) {
                    copVar.v4();
                }
                return s3q0.a;
            case 18:
                EnterProfilePresenter enterProfilePresenter = (EnterProfilePresenter) obj2;
                enterProfilePresenter.B0(com.vk.auth.entername.a.b(enterProfilePresenter.A, (String) obj, null, null, null, null, 30));
                return s3q0.a;
            case 19:
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) obj2;
                ptk ptkVar = (ptk) obj;
                if (extendedCommunityProfile != null) {
                    ((ExtendedCommunityProfile) ptkVar.a).D2 = extendedCommunityProfile.D2;
                }
                return new ptk(ptkVar.a, ptkVar.b);
            case 20:
                pzr pzrVar = (pzr) obj2;
                vzr vzrVar = (vzr) obj;
                Set<Long> set = vzrVar.i;
                Set<Long> set2 = vzrVar.j;
                if (set.isEmpty() && set2.isEmpty()) {
                    pzrVar.m(qzr.b.a);
                } else {
                    pzrVar.m(new qzr.a(set, set2));
                }
                return s3q0.a;
            case 21:
                int i6 = FriendsCleanupFragment.W;
                xns fo = ((FriendsCleanupFragment) obj2).fo();
                fo.a.setVisibility(8);
                fo.b.setVisibility(0);
                fo.c.setVisibility(8);
                fo.d.setVisibility(8);
                return s3q0.a;
            case 22:
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) obj2;
                List list = (List) obj;
                return galleryFragmentImpl.R.u != MediaFilteringStrategy.NONE ? ((ifr) galleryFragmentImpl.s0.getValue()).a(list, galleryFragmentImpl.R.u).a : list;
            case 23:
                GeoFragment geoFragment = (GeoFragment) obj2;
                com.vk.geo.impl.presentation.h hVar = (com.vk.geo.impl.presentation.h) obj;
                qcy<Object>[] qcyVarArr = GeoFragment.c0;
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{qjg.a(hVar)});
                }
                try {
                    geoFragment.ho(hVar);
                } catch (Throwable th) {
                    L.i(th);
                }
                return s3q0.a;
            case 24:
                hot hotVar = (hot) obj2;
                if (((Boolean) obj).booleanValue()) {
                    su9 su9Var = hotVar.c;
                    return ((lrt) su9Var.b).b().l(new vj0(new wcg(su9Var, 19), 23)).l(new qj4(new sop(hotVar, 10), 17)).w();
                }
                it80.b.getClass();
                return io.reactivex.rxjava3.core.q.T(it80.a.a());
            case 25:
                jcu jcuVar = (jcu) obj2;
                ycu ycuVar = (ycu) obj;
                yzt0<ghq0> yzt0Var = ycuVar.g;
                n99 n99Var = new n99(jcuVar, 5);
                jcuVar.getClass();
                gm50.a.a(jcuVar, yzt0Var, n99Var);
                gm50.a.a(jcuVar, ycuVar.f, new o99(jcuVar.C, 5));
                gm50.a.a(jcuVar, ycuVar.a, new bw6(jcuVar.y, 6));
                gm50.a.a(jcuVar, ycuVar.b, new dcu(1, jcuVar, jcu.class, "updateUndoRedoButtons", "updateUndoRedoButtons(Lcom/vk/attachpicker/impl/graffiti/presentation/mvi/GraffitiRender$Main$UndoRedoState;)V", 0));
                gm50.a.a(jcuVar, ycuVar.d, new ecu(1, jcuVar, jcu.class, "handleStateChanging", "handleStateChanging(Lcom/vk/attachpicker/impl/graffiti/presentation/mvi/GraffitiRender$Main$SceneChange;)V", 0));
                gm50.a.a(jcuVar, ycuVar.c, new p99(jcuVar, 7));
                gm50.a.a(jcuVar, ycuVar.e, new fcu(1, jcuVar, jcu.class, "updateUi", "updateUi(Lcom/vk/attachpicker/impl/graffiti/presentation/mvi/GraffitiRender$Main$UiState;)V", 0));
                return s3q0.a;
            case 26:
                wxu wxuVar = (wxu) obj2;
                Boolean bool = (Boolean) obj;
                if (bool == null || bool.equals(Boolean.FALSE)) {
                    wxuVar.c.ed(true, false);
                    qdc0 qdc0Var = wxuVar.b;
                    if (qdc0Var != null) {
                        qdc0Var.G4();
                    }
                } else {
                    wxuVar.e6(wxuVar.m, (r3 & 2) != 0, false);
                }
                return s3q0.a;
            case 27:
                eqv eqvVar = (eqv) obj2;
                eqvVar.d(new BitmapDrawable(eqvVar.c.getResources(), (Bitmap) obj));
                return s3q0.a;
            case 28:
                z6q0 z6q0Var = ((t0x) obj2).e;
                if (z6q0Var != null) {
                    z6q0Var.I1();
                }
                return s3q0.a;
            default:
                j6y j6yVar = (j6y) obj2;
                TranslationsTranslateResponseDto translationsTranslateResponseDto = (TranslationsTranslateResponseDto) obj;
                JSONObject jSONObject = new JSONObject();
                List<String> e = translationsTranslateResponseDto.e();
                bex0.a.b(j6yVar.a, JsApiMethodType.TRANSLATE, new JSONObject().put("result", jSONObject.put("texts", e != null ? kvf.a(e) : null).put("source_lang", translationsTranslateResponseDto.d())), null, 12);
                return s3q0.a;
        }
    }
}
