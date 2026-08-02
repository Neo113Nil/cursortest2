package xsna;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistToolbarVh;
import com.vk.dto.stickers.StickerPackRecommendationBlock;
import com.vk.dto.video.VideoAlbum;
import com.vk.instantjobs.InstantJob;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.stat.scheme.SchemeStat$TypeRegistrationItem;
import com.vk.stories.design.view.editor.verticalization.VerticalizationBannerView;
import com.vk.stories.design.view.text.TextStyleFontPicker;
import com.vk.superapp.api.dto.story.WebRenderableSticker;
import com.vk.superapp.api.dto.story.WebSticker;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vk.superapp.api.internal.requests.app.OrdersCancelUserSubscriptionResult;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.polls.entrypoint.model.UxPollEntryPoint;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoverySideEffect;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipants;
import xsna.a7f0;
import xsna.evr0;
import xsna.f3l0;
import xsna.nps0;
import xsna.p9i0;
import xsna.q8z;
import xsna.qyq0;
import xsna.sdk0;
import xsna.us2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class q8i0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q8i0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0339, code lost:
    
        if (r9.d == r2) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x034c, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x034a, code lost:
    
        if (r9.d == r2) goto L162;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object T;
        Integer m;
        boolean f;
        y4r0 y4r0Var;
        b5r0 b;
        int i = 4;
        int i2 = 16;
        boolean z = false;
        r5 = 0;
        int i3 = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        switch (this.b) {
            case 0:
                s8i0 s8i0Var = (s8i0) this.c;
                Activity activity = s8i0Var.b;
                cmf0.d(activity, s8i0Var.c, j03.g(activity, (Throwable) obj, R.string.error), false, iah0.a(88), true);
                return s3q0.a;
            case 1:
                ((s9i0) this.c).C(new p9i0.e((List) obj));
                return s3q0.a;
            case 2:
                ((io.reactivex.rxjava3.core.y) this.c).onSuccess(((SessionRoomParticipants) obj).getParticipants());
                return s3q0.a;
            case 3:
                hyi0 hyi0Var = (hyi0) this.c;
                InstantJob instantJob = (InstantJob) obj;
                boolean z2 = hyi0Var.e;
                int i4 = hyi0Var.c;
                long j = hyi0Var.b;
                if (z2) {
                    if (instantJob instanceof oug) {
                        oug ougVar = (oug) instantJob;
                        if (ougVar.c == j) {
                            break;
                        }
                    }
                    return Boolean.valueOf(z);
                }
                if (instantJob instanceof n6b) {
                    n6b n6bVar = (n6b) instantJob;
                    if (n6bVar.c == j) {
                        break;
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                ((ldk0) this.c).T(new sdk0.b.C3663b((List) obj));
                return s3q0.a;
            case 5:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.c;
                fl3.k(sQLiteDatabase, new gj80(sQLiteDatabase, i2));
                return s3q0.a;
            case 6:
                ((s3l0) this.c).i = new f3l0.a.C2847a((List<StickerPackRecommendationBlock>) obj);
                return s3q0.a;
            case 7:
                i8l0 i8l0Var = (i8l0) this.c;
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                i8l0Var.b.setVisibility(4);
                return s3q0.a;
            case 8:
                etj etjVar = ((ncl0) this.c).d;
                etjVar.getClass();
                n2i0.a(etjVar.b, hf8.a, new Intent("com.vkontakte.android.STICKERS_ANIMATION_ENABLED_CHANGED"));
                return s3q0.a;
            case 9:
                b0m0 b0m0Var = (b0m0) this.c;
                WebStoryBox webStoryBox = (WebStoryBox) obj;
                List<WebSticker> list = webStoryBox.h;
                List<WebSticker> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    return io.reactivex.rxjava3.core.q.T(webStoryBox);
                }
                List<WebSticker> list3 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                for (WebSticker webSticker : list3) {
                    if (webSticker instanceof WebRenderableSticker) {
                        WebRenderableSticker webRenderableSticker = (WebRenderableSticker) webSticker;
                        T = b0m0Var.a(webRenderableSticker.e, webRenderableSticker.f).U(new u1j0(new ap30((WebRenderableSticker) webSticker, b0m0Var), i));
                    } else {
                        T = io.reactivex.rxjava3.core.q.T(webSticker);
                    }
                    arrayList.add(T);
                }
                return kwg0.a(arrayList).U(new k6c0(new qze0(webStoryBox, 1), 6));
            case 10:
                gzm0 gzm0Var = (gzm0) this.c;
                if (((OrdersCancelUserSubscriptionResult) obj) == OrdersCancelUserSubscriptionResult.SUCCESS) {
                    gzm0Var.b.Mf(gzm0Var.f ? 0 : -1, new Intent());
                }
                return s3q0.a;
            case 11:
                tjo0 tjo0Var = (tjo0) this.c;
                us2.d dVar = (us2.d) obj;
                us2.a aVar = (us2.a) dVar.a;
                if (aVar instanceof q8z.b) {
                    q8z.b bVar = (q8z.b) aVar;
                    if (bVar.b == null) {
                        return us2.d.a(dVar, new q8z.b(bVar.a, tjo0Var, bVar.c), 0, 14);
                    }
                }
                if (!(aVar instanceof q8z.a)) {
                    return dVar;
                }
                q8z.a aVar2 = (q8z.a) aVar;
                return aVar2.b == null ? us2.d.a(dVar, new q8z.a(aVar2.a, tjo0Var, aVar2.c), 0, 14) : dVar;
            case 12:
                cmo0 cmo0Var = (cmo0) this.c;
                Float f2 = (Float) obj;
                TextStyleFontPicker textStyleFontPicker = cmo0Var.l;
                if (textStyleFontPicker == null) {
                    textStyleFontPicker = null;
                }
                t5s currentFontStyle = textStyleFontPicker.getCurrentFontStyle();
                cmo0Var.f.c = (float) Math.ceil((f2.floatValue() * (currentFontStyle.d() - currentFontStyle.a())) + currentFontStyle.a());
                TextStyleFontPicker textStyleFontPicker2 = cmo0Var.l;
                (textStyleFontPicker2 != null ? textStyleFontPicker2 : null).getCurrentFontStyle().e(f2.floatValue());
                cmo0Var.f();
                return s3q0.a;
            case 13:
                mdp0 mdp0Var = (mdp0) this.c;
                String str = ((vqt) obj).i;
                if (str != null && (m = arm0.m(10, str)) != null) {
                    i3 = m.intValue();
                }
                mdp0Var.d = i3;
                return s3q0.a;
            case 14:
                r0e0 r0e0Var = ((vnq0) this.c).a;
                nda0 nda0Var = (nda0) obj;
                if (nda0Var instanceof s4a0) {
                    f = epx.f(((s4a0) nda0Var).b.e, r0e0Var.a());
                } else {
                    if (!(nda0Var instanceof zaa0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = epx.f(((zaa0) nda0Var).c, r0e0Var.a());
                }
                return Boolean.valueOf(f);
            case 15:
                ((zwq0) this.c).t();
                return s3q0.a;
            case 16:
                hyq0 hyq0Var = (hyq0) this.c;
                ((Boolean) obj).getClass();
                if (hyq0Var.g.a) {
                    fzq0.b(SchemeStat$TypeRegistrationItem.EventType.SCREEN_PROCEED);
                }
                hyq0Var.j.b(qyq0.a.a);
                return s3q0.a;
            case 17:
                com.vk.libvideo.bottomsheet.about.delegate.e0 e0Var = (com.vk.libvideo.bottomsheet.about.delegate.e0) this.c;
                UxPollEntryPoint uxPollEntryPoint = e0Var.b;
                if (uxPollEntryPoint != null && (y4r0Var = e0Var.a) != null && (b = y4r0Var.b()) != null) {
                    b.a(uxPollEntryPoint, false, true);
                }
                return s3q0.a;
            case 18:
                VerticalizationBannerView.a aVar3 = ((VerticalizationBannerView) this.c).f;
                if (aVar3 != null) {
                    aVar3.dismiss();
                }
                return s3q0.a;
            case 19:
                ((evr0.a) this.c).a();
                return s3q0.a;
            case 20:
                mm50<ups0, nps0, rps0> mm50Var = ((t3s0) this.c).U0;
                if (mm50Var != null) {
                    mm50Var.b(nps0.b.b);
                }
                return s3q0.a;
            case 21:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) this.c;
                Pair pair = (Pair) obj;
                Boolean bool = (Boolean) pair.d();
                boolean booleanValue = ((Boolean) pair.g()).booleanValue();
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_REOPEN_DISCOVERY;
                videoFeatures.getClass();
                if (com.vk.toggle.b.A.a(videoFeatures)) {
                    a7f0.a.f(gVar, gVar.h.a(), new zhw(booleanValue, gVar), new b3m0(gVar, i2), 1);
                } else if (!bool.booleanValue() || booleanValue) {
                    gVar.v0();
                    gVar.v.h();
                } else {
                    gVar.J.b(VideoMinimizableDiscoverySideEffect.j0.a);
                }
                return s3q0.a;
            case 22:
                ((cys0) this.c).p((k9t0) obj);
                return s3q0.a;
            case 23:
                VideoOfflineFragment videoOfflineFragment = (VideoOfflineFragment) this.c;
                int i5 = VideoOfflineFragment.f1;
                j03.j(videoOfflineFragment.getActivity(), (Throwable) obj);
                return s3q0.a;
            case 24:
                t1t0 t1t0Var = (t1t0) this.c;
                t1t0Var.f = 0;
                t1t0Var.j.r(true);
                return s3q0.a;
            case 25:
                jwr0 jwr0Var = (jwr0) obj;
                VideoAlbum videoAlbum = ((VideoPlaylistToolbarVh) this.c).o;
                return Boolean.valueOf((videoAlbum != null ? videoAlbum : null).b == jwr0Var.a.b);
            case 26:
                ((l49) this.c).invoke();
                return s3q0.a;
            case 27:
                v2v0 v2v0Var = (v2v0) ((a3v0) this.c).a;
                if (v2v0Var != null) {
                    v2v0Var.Lb();
                }
                return s3q0.a;
            case 28:
                ffv0 ffv0Var = (ffv0) this.c;
                ffv0Var.p1 = true;
                rns0 rns0Var = ffv0Var.m1;
                (rns0Var != null ? rns0Var : null).invoke();
                ffv0Var.dismiss();
                return s3q0.a;
            default:
                Throwable th = (Throwable) obj;
                r6y r6yVar = ((fwv0) this.c).b;
                if (r6yVar != null) {
                    r6yVar.z(JsApiMethodType.GET_EMAIL, th);
                }
                return s3q0.a;
        }
    }
}
