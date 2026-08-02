package xsna;

import android.content.Context;
import android.location.Location;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.catalog2.common.dto.ui.actions.UIBlockPlayMixAction;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.core.preference.Preference;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.user.RequestUserProfile;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.engine.models.credentials.UserCredentials;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vk.music.mixsettings.MixSettingsEntity;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.newsfeed.posting.geo_picker.presentation.PlacePickerState;
import com.vk.superapp.api.dto.identity.WebCountry;
import com.vk.video.ui.upload.impl.publish.domain.model.PrivacyDo;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.c2r;
import xsna.c2r0;
import xsna.dra0;
import xsna.dug0;
import xsna.evv;
import xsna.fxb;
import xsna.h3f;
import xsna.hil;
import xsna.k840;
import xsna.ky6;
import xsna.nj8;
import xsna.num;
import xsna.nwb;
import xsna.r1r0;
import xsna.smm0;
import xsna.u3f;
import xsna.u74;
import xsna.wk50;
import xsna.ytm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class v74 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v74(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01de, code lost:
    
        if (r1.g() == r7.b) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ef  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        List list;
        int i = this.b;
        int i2 = 2;
        int i3 = 9;
        boolean z = true;
        Dialog dialog = null;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                u74.g gVar = (u74.g) obj3;
                ImageSize Cb = ((Image) obj2).Cb(gVar.b.getWidth(), true, false);
                gVar.b.o0(Cb != null ? Cb.d.d : null, null);
                return s3q0.a;
            case 1:
                ((com.vk.auth.verification.base.b) obj3).G0(((v2j) obj2).b, (vgg) obj);
                return s3q0.a;
            case 2:
                nj8.a aVar = (nj8.a) obj3;
                ni8 ni8Var = (ni8) obj2;
                if (aVar.d) {
                    cvk.u(R.string.live_broadcast_settings_author_banned, false);
                } else {
                    ni8Var.m.invoke(aVar.b);
                }
                return s3q0.a;
            case 3:
                bi9 bi9Var = (bi9) obj3;
                ClipVideoFile clipVideoFile = (ClipVideoFile) obj2;
                dug0.c cVar = (dug0.c) obj;
                if (cVar != null) {
                    if (cVar.d()) {
                        bi9Var.b.setClipsContentLoadingProgress(cVar.b);
                    } else if (cVar.c()) {
                        bi9Var.e(clipVideoFile, cVar.c);
                    }
                }
                return s3q0.a;
            case 4:
                jsa jsaVar = (jsa) obj3;
                String str = (String) obj2;
                pf pfVar = new pf(i3);
                jsaVar.getClass();
                jsa.c(pfVar);
                qaj0.c(jsaVar.b.c(), "anonym_name", str);
                bpn0 bpn0Var = yt2.a;
                ((io.reactivex.rxjava3.subjects.f) yt2.a.getValue()).onNext(new xt2(str, ((vt2) obj).a));
                return s3q0.a;
            case 5:
                ((fxb.a) obj3).m.j(((nwb.h) obj2).b);
                return s3q0.a;
            case 6:
                final u3f.b bVar = (u3f.b) obj2;
                final List list2 = (List) obj;
                final h3f h3fVar = ((t3f) obj3).a;
                return new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.g3f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        h3f h3fVar2 = h3f.this;
                        u3f u3fVar = bVar;
                        List list3 = list2;
                        synchronized (h3fVar2) {
                            h3fVar2.a = new h3f.a(u3fVar, list3, o25.a().c());
                        }
                        return list3;
                    }
                });
            case 7:
                Context context = (Context) obj3;
                vmh vmhVar = (vmh) obj2;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) obj;
                ExtendedCommunityProfile.e eVar = extendedCommunityProfile.d3;
                if (eVar == null) {
                    return null;
                }
                boolean z2 = eVar instanceof ExtendedCommunityProfile.e.a;
                if (z2 && ((ExtendedCommunityProfile.e.a) eVar).a.isEmpty()) {
                    return EmptyList.b;
                }
                ListBuilder e = e43.e();
                e.add(new wr9(context.getString(R.string.community_sections_title), null, null, null, 30));
                if (z2) {
                    Iterator<T> it = ((ExtendedCommunityProfile.e.a) eVar).a.iterator();
                    while (it.hasNext()) {
                        e.add(new y1i0((ExtendedCommunityProfile.Section) it.next(), new d05(11, vmhVar, extendedCommunityProfile)));
                    }
                } else if (eVar instanceof ExtendedCommunityProfile.e.b) {
                    e.add(new l2i0(new com.vk.movika.sdk.base.ui.p(5, vmhVar, extendedCommunityProfile)));
                } else {
                    if (!(eVar instanceof ExtendedCommunityProfile.e.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    for (int i4 = 0; i4 < 3; i4++) {
                        e.add(new d2i0());
                    }
                }
                return e.g();
            case 8:
                ((hv10) obj).i((bgk0) obj3, (ur4) obj2);
                return s3q0.a;
            case 9:
                ytm ytmVar = (ytm) obj3;
                psm psmVar = (psm) obj2;
                oum oumVar = (oum) obj;
                Iterator<Dialog> it2 = oumVar.b.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Dialog next = it2.next();
                        if (epx.f(next.Zb(), ((ytm.e) ytmVar).b)) {
                            dialog = next;
                        }
                    }
                }
                Dialog dialog2 = dialog;
                if (dialog2 != null) {
                    psmVar.n(new num.g(new DialogExt(dialog2, oumVar.c)));
                }
                return s3q0.a;
            case 10:
                ((nfu) obj3).getClass();
                throw null;
            case 11:
                ((wsp) obj3).b.g((hyg0) obj, (ArrayList) obj2);
                return s3q0.a;
            case 12:
                return fqq.g((com.vk.lists.c) obj3, (fqq) obj2, (List) obj);
            case 13:
                wk50.a aVar2 = (wk50.a) obj3;
                qih0 qih0Var = (qih0) obj;
                myc mycVar = ((pwq) obj2).a;
                List<wih0> list3 = qih0Var.a;
                ArrayList f = mycVar.f(list3);
                PaginationKey paginationKey = qih0Var.e;
                wih0 wih0Var = (wih0) j5g.a0(list3);
                aVar2.b(new c2r.h.d(f, paginationKey, wih0Var != null ? xih0.b(wih0Var) : null, qih0Var.h));
                return s3q0.a;
            case 14:
                io.reactivex.rxjava3.internal.operators.observable.b1 b1Var = (io.reactivex.rxjava3.internal.operators.observable.b1) obj3;
                h7r0 h7r0Var = (h7r0) obj2;
                List<c2r0.b> list4 = (List) obj;
                if ((list4 instanceof Collection) && list4.isEmpty()) {
                    return b1Var;
                }
                for (c2r0.b bVar2 : list4) {
                    if (epx.f(bVar2.a, h7r0Var.e) && !drm0.N(bVar2.g)) {
                        return io.reactivex.rxjava3.internal.operators.completable.i.b;
                    }
                }
                return b1Var;
            case 15:
                com.vk.lists.c cVar2 = (com.vk.lists.c) obj3;
                h3t h3tVar = (h3t) obj2;
                Integer num = (Integer) obj;
                int i5 = cVar2.i();
                if (num == null || num.intValue() != i5) {
                    if (j5t.a != 0) {
                        j5t.a = 0;
                        ky6.a aVar3 = (ky6.a) Preference.j().edit();
                        aVar3.putInt("camera_gallery_scroll", 0);
                        aVar3.a();
                    }
                    j5t.b = 0;
                    ky6.a aVar4 = (ky6.a) Preference.j().edit();
                    aVar4.putInt("camera_gallery_offset", 0);
                    aVar4.a();
                    cVar2.q(num.intValue());
                    int intValue = num.intValue();
                    if (cVar2.f) {
                        cVar2.d.j(intValue);
                    }
                }
                return h3tVar.ui(num.intValue(), cVar2);
            case 16:
                gzs gzsVar = (gzs) obj3;
                Context context2 = (Context) obj2;
                vgg vggVar = (vgg) obj;
                Throwable th = vggVar.a;
                if (vggVar.b() == ApiErrorViewType.CUSTOM) {
                    Toast.makeText(context2, wbu0.a(context2, th, false).a, 0).show();
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    vggVar.c();
                }
                par0.a.getClass();
                par0.d(th);
                gzsVar.invoke();
                return s3q0.a;
            case 17:
                String str2 = (String) obj2;
                VKCircleImageView vKCircleImageView = ((HighlightEditFragment) obj3).U;
                if (vKCircleImageView == null) {
                    vKCircleImageView = null;
                }
                vKCircleImageView.o0(str2, null);
                return s3q0.a;
            case 18:
                evv evvVar = (evv) obj3;
                Country country = (Country) evvVar.d.get(((evv.a) obj2).getAdapterPosition());
                evvVar.c.invoke(new WebCountry(country.b, country.e, country.d, country.c, false));
                return s3q0.a;
            case 19:
                rw30 rw30Var = (rw30) obj3;
                qtd0 qtd0Var = (qtd0) obj;
                rw30Var.x.put((String) obj2, qtd0Var);
                rw30Var.U(rw30Var.p.d, SearchMode.PEERS);
                rw30Var.Q(qtd0Var, null);
                return s3q0.a;
            case 20:
                m340 m340Var = (m340) obj3;
                UserId userId = (UserId) obj2;
                if (((p680) obj).c) {
                    m340Var.getClass();
                    UserCredentials m = i2w.a().r().m();
                    if (m != null) {
                        break;
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 21:
                MusicTrack musicTrack = (MusicTrack) obj3;
                vh40 vh40Var = (vh40) obj2;
                MusicTrack musicTrack2 = (MusicTrack) j5g.Z(((Map) obj).values());
                if (musicTrack2 == null || !musicTrack2.S4()) {
                    if (!((musicTrack2 != null ? musicTrack2.J : null) instanceof DownloadingState.Downloading)) {
                        ifp0 ifp0Var = new ifp0(musicTrack, vh40Var.a);
                        sg40 sg40Var = vh40Var.c;
                        sg40Var.n.execute(new f1t(musicTrack, ifp0Var, sg40Var, o25.a().c(), 1));
                        return s3q0.a;
                    }
                }
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(new ib50(musicTrack, musicTrack2));
                return s3q0.a;
            case 22:
                cm70 cm70Var = (cm70) obj3;
                cm70Var.getClass();
                Animation loadAnimation = AnimationUtils.loadAnimation((Context) obj2, R.anim.clips_nps_survey_uploading_hide);
                View view = cm70Var.d;
                f4m.j(view);
                view.startAnimation(loadAnimation);
                return s3q0.a;
            case 23:
                dra0 dra0Var = (dra0) obj3;
                PlacePickerState placePickerState = (PlacePickerState) obj2;
                xqa0 xqa0Var = dra0Var.b;
                String str3 = placePickerState.e;
                Location location = ((dra0.c) obj).a;
                return xqa0Var.b(str3, location, dra0Var.d, 0).l(new xw70(new v63(dra0Var, placePickerState.e, location, 10), i2));
            case 24:
                ((ava0) obj3).b((MixSettingsEntity) obj, (UIBlockPlayMixAction) obj2);
                return s3q0.a;
            case 25:
                RequestUserProfile requestUserProfile = (RequestUserProfile) obj2;
                s1r0 s1r0Var = ((uzb0) obj3).i;
                UserId userId2 = requestUserProfile.c;
                if (userId2 != null) {
                    if (userId2.b <= 0) {
                        userId2 = null;
                    }
                    if (userId2 != null) {
                        list = Collections.singletonList(userId2);
                        String str4 = requestUserProfile.t0;
                        return rsg0.T(yfb.x(r1r0.a.b(s1r0Var, list, e43.l(UsersFieldsDto.CAN_WRITE_PRIVATE_MESSAGE, UsersFieldsDto.IS_FRIEND, UsersFieldsDto.FRIEND_STATUS), null, str4 != null ? Collections.singletonList(str4) : null, 42)));
                    }
                }
                list = null;
                String str42 = requestUserProfile.t0;
                return rsg0.T(yfb.x(r1r0.a.b(s1r0Var, list, e43.l(UsersFieldsDto.CAN_WRITE_PRIVATE_MESSAGE, UsersFieldsDto.IS_FRIEND, UsersFieldsDto.FRIEND_STATUS), null, str42 != null ? Collections.singletonList(str42) : null, 42)));
            case 26:
                ((izs) obj3).invoke(((slc0) obj2).m);
                return s3q0.a;
            case 27:
                mbe0 mbe0Var = (mbe0) obj3;
                PublishState publishState = (PublishState) obj;
                return PublishState.a(publishState, null, null, null, null, false, null, null, null, null, null, false, false, null, null, PrivacyDo.a(publishState.p, mbe0Var.b.e, null, (String) obj2, 2), null, null, null, mbe0Var.c, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -278529, 2047);
            case 28:
                y6s0 y6s0Var = (y6s0) obj3;
                s6s0 s6s0Var = (s6s0) obj2;
                if (y6s0Var != null) {
                    y6s0Var.a(VideoBottomSheetSideEffectOptions.REMOVE_FROM_OWNER, s6s0Var.a);
                }
                return s3q0.a;
            default:
                smm0.a aVar5 = (smm0.a) obj3;
                otz otzVar = (otz) obj;
                return new io.reactivex.rxjava3.internal.operators.observable.o1(((smm0) obj2).b(otzVar).d(new io.reactivex.rxjava3.internal.operators.observable.q(new rmm0(aVar5, otzVar))), new n8c0(new twi0(6, aVar5, otzVar), i3));
        }
    }

    public /* synthetic */ v74(hil.b bVar, bgk0 bgk0Var, ur4 ur4Var) {
        this.b = 8;
        this.c = bgk0Var;
        this.d = ur4Var;
    }
}
