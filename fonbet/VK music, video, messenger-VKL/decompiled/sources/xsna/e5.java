package xsna;

import android.graphics.PointF;
import android.graphics.RectF;
import android.location.Location;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.audio.dto.AudioGetAutoflowMixParamsResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.articles.ArticleFragment;
import com.vk.biometrics.lock.impl.presentation.view.BiometricsPinLockActivity;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.clips.clipsaudio.views.ClipsAudioFragment;
import com.vk.clips.entrypoints.ui.ClipsEntryPointDraftsFragment;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.view.search.AnimStartSearchView;
import com.vk.dto.articles.Article;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.clips.ClipVideoItem;
import com.vk.dto.music.MusicTrack;
import com.vk.ecomm.onlinebooking.impl.records.ui.BookingRecordsScreenFragment;
import com.vk.editor.timeline.state.TracksFilter;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.toggle.features.ImFeatures;
import com.vk.voip.ui.settings.participants_view.j;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.acs;
import xsna.azb;
import xsna.bph0;
import xsna.ca9;
import xsna.e5r;
import xsna.gm50;
import xsna.ngd;
import xsna.r5;
import xsna.tlo0;
import xsna.v7e;
import xsna.xn50;
import xsna.yf8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        MusicTrack musicTrack;
        v7e.a feature;
        r2 = null;
        String str = null;
        int i = 0;
        switch (this.b) {
            case 0:
                r5.a aVar = (r5.a) this.c;
                nw20 nw20Var = (nw20) obj;
                if (nw20Var != null) {
                    r4 = iah0.r(nw20Var.getContext()) ? 8388693 : 1;
                    ViewGroup viewGroup = nw20Var.i0;
                    f4m.m(r4, viewGroup != null ? viewGroup : null);
                }
                aVar.S0(aVar.i);
                return s3q0.a;
            case 1:
                ph phVar = (ph) this.c;
                qcy<Object>[] qcyVarArr = ph.n1;
                phVar.getFeature().C(new bph0.f((String) obj));
                return s3q0.a;
            case 2:
                ((r8) this.c).invoke((Throwable) obj);
                return s3q0.a;
            case 3:
                AnimStartSearchView animStartSearchView = (AnimStartSearchView) this.c;
                if (((String) obj).length() == 0) {
                    animStartSearchView.b(true);
                } else {
                    animStartSearchView.b(false);
                }
                return s3q0.a;
            case 4:
                int i2 = ArticleFragment.E0;
                ((ArticleFragment) this.c).no((Article) obj);
                return s3q0.a;
            case 5:
                lj5 lj5Var = (lj5) this.c;
                shh0 shh0Var = (shh0) obj;
                gp6 gp6Var = shh0Var.a;
                float f = shh0Var.b;
                float f2 = shh0Var.c.y;
                acs.a aVar2 = lj5Var.b;
                int i3 = lj5.l;
                int i4 = lj5.m;
                float f3 = gp6Var.u().top;
                float f4 = lj5.j;
                float f5 = f3 - f4;
                mwo0 mwo0Var = lj5Var.a;
                ywo0 ywo0Var = mwo0Var.d;
                gc00 gc00Var = mwo0Var.e;
                RectF rectF = ywo0Var.q;
                float f6 = rectF.top;
                if (f5 >= f6 || ywo0Var.b <= ywo0Var.d || f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float f7 = gp6Var.u().bottom + f4;
                    float f8 = rectF.top;
                    TracksFilter tracksFilter = TracksFilter.WITHOUT_FIXED;
                    if (f7 > ywo0Var.f(tracksFilter) + f8 && ywo0Var.b < 0 && f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        int min = Math.min(i4, Math.max(((int) ((ywo0Var.f(tracksFilter) + rectF.top) - gp6Var.u().bottom)) / 50, i3));
                        if (((Boolean) aVar2.invoke(new nxm(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -min), new PointF(gp6Var.u().centerX(), gp6Var.u().centerY()), gp6Var, Boolean.TRUE)).booleanValue()) {
                            ywo0Var.k(0, min);
                            gc00Var.a(gp6Var);
                            mwo0Var.a();
                        }
                    }
                } else {
                    int min2 = Math.min(i4, Math.max(((int) Math.abs(f6 - gp6Var.u().top)) / 50, i3));
                    if (((Boolean) aVar2.invoke(new nxm(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, min2), new PointF(gp6Var.u().centerX(), gp6Var.u().centerY()), gp6Var, Boolean.TRUE)).booleanValue()) {
                        ywo0Var.k(0, -min2);
                        gc00Var.a(gp6Var);
                        mwo0Var.a();
                    }
                }
                return s3q0.a;
            case 6:
                List list = (List) this.c;
                AudioGetAutoflowMixParamsResponseDto audioGetAutoflowMixParamsResponseDto = (AudioGetAutoflowMixParamsResponseDto) obj;
                String e = audioGetAutoflowMixParamsResponseDto.e();
                String d = audioGetAutoflowMixParamsResponseDto.d();
                PlayerTrack playerTrack = (PlayerTrack) j5g.k0(list);
                if (playerTrack != null && (musicTrack = playerTrack.b) != null) {
                    str = musicTrack.d;
                }
                if (str == null) {
                    str = "";
                }
                return new StartPlayVkMixSource("", "", e, false, str, null, d, null, Integer.valueOf(R.string.music_player_header_track_mix_source), null, 672, null);
            case 7:
                p66 p66Var = (p66) this.c;
                p66Var.s0(p66Var.u + 1);
                p66Var.t0(p66Var.v + 1);
                return s3q0.a;
            case 8:
                Object obj2 = ((ta6) this.c).o;
                ((smp) (obj2 != null ? obj2 : null)).r();
                return s3q0.a;
            case 9:
                BiometricsPinLockActivity biometricsPinLockActivity = (BiometricsPinLockActivity) this.c;
                int i5 = BiometricsPinLockActivity.v;
                biometricsPinLockActivity.moveTaskToBack(true);
                return s3q0.a;
            case 10:
                ((vak0) ((bh7) this.c).d).g(((Float) obj).floatValue());
                return s3q0.a;
            case 11:
                BookingRecordsScreenFragment bookingRecordsScreenFragment = (BookingRecordsScreenFragment) this.c;
                qcy<Object>[] qcyVarArr2 = BookingRecordsScreenFragment.V;
                bookingRecordsScreenFragment.U = rwp.a(bookingRecordsScreenFragment.requireContext(), (Exception) obj, false);
                return s3q0.a;
            case 12:
                BotButton.ModalView modalView = (BotButton.ModalView) this.c;
                w9y w9yVar = (w9y) obj;
                w9yVar.c(Integer.valueOf(modalView.g.h()), "type");
                w9yVar.e(modalView.h, "payload");
                w9yVar.c(Integer.valueOf(modalView.i), TtmlNode.TAG_SPAN);
                w9yVar.e(modalView.j, "key");
                w9yVar.e(modalView.k, "link");
                w9yVar.c(Integer.valueOf(modalView.l.h()), "color_id");
                w9yVar.b(Boolean.valueOf(modalView.m), "inline");
                w9yVar.d(Long.valueOf(modalView.n.b), "author");
                return s3q0.a;
            case 13:
                wf8 wf8Var = (wf8) this.c;
                yf8 yf8Var = (yf8) obj;
                bwt0.p0(wf8Var.c, yf8Var instanceof yf8.c);
                bwt0.p0(wf8Var.e, yf8Var instanceof yf8.a);
                bwt0.p0(wf8Var.h, yf8Var instanceof yf8.b);
                return s3q0.a;
            case 14:
                ((com.vk.voip.ui.settings.participants_view.c) this.c).a(new j.l((String) obj));
                return s3q0.a;
            case 15:
                return ca9.c.a((ca9.c) obj, null, null, null, j5g.S0((ArrayList) this.c), null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, null, -32769, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            case 16:
                return new Pair((ClipVideoItem) this.c, (Location) obj);
            case 17:
                b.d dVar = (b.d) obj;
                Integer num = ((am9) this.c).b;
                if (num != null) {
                    nf9 nf9Var = nf9.b;
                    nf9.n(dVar, num);
                }
                return s3q0.a;
            case 18:
                z9a z9aVar = (z9a) this.c;
                vua0 vua0Var = z9aVar.j;
                String str2 = z9aVar.h;
                vua0Var.getClass();
                return vua0.B(str2, (List) obj);
            case 19:
                f5b f5bVar = (f5b) this.c;
                int i6 = t5b.u;
                return new t5b(f5bVar.i.inflate(R.layout.im_channel_msg_search_msg, (ViewGroup) obj, false), f5bVar.h);
            case 20:
                ((vsb) this.c).a.b();
                return s3q0.a;
            case 21:
                azb.a aVar3 = ((ryb) this.c).i;
                ViewGroup viewGroup2 = (ViewGroup) obj;
                ImFeatures imFeatures = ImFeatures.IM_CHAT_PROFILE_MEMBERS_COMPONENT_REDESIGN;
                imFeatures.getClass();
                return com.vk.toggle.b.A.a(imFeatures) ? new gsr0(aVar3, viewGroup2) : new fsr0(aVar3, viewGroup2, null);
            case 22:
                com.vk.ecomm.cart.impl.checkout.feature.state.b bVar = ((w7c) this.c).d;
                Throwable th = ((w8c) obj).d;
                ((w4c) bVar.b.getValue()).getClass();
                return (!(th instanceof VKApiExecutionException) || ((th == null || ((VKApiExecutionException) th).s() != -1) && !(th instanceof IOException))) ? new mw9(tq.h(tlo0.Companion, R.string.ecomm_checkout_error_loading_screen), new tlo0.f(R.string.ecomm_checkout_error_loading_screen_description), new tlo0.f(R.string.ecomm_checkout_retry), 1) : new mw9(tq.h(tlo0.Companion, R.string.ecomm_checkout_error_connection), new tlo0.f(R.string.ecomm_checkout_error_connection_description), new tlo0.f(R.string.ecomm_checkout_retry), 1);
            case 23:
                ((igc) this.c).j().getClass();
                return e3a.c((CatalogCatalogResponseObjectDto) obj);
            case 24:
                ((io.reactivex.rxjava3.core.y) this.c).onSuccess((ClipVideoFile) obj);
                return s3q0.a;
            case 25:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
                qvq qvqVar = (qvq) obj;
                int i7 = ClipFeedListFragment.a2;
                v7e Do = clipFeedListFragment.Do();
                if (Do != null && (feature = Do.getFeature()) != null) {
                    feature.a(qvqVar);
                }
                return s3q0.a;
            case 26:
                ClipsAudioFragment clipsAudioFragment = (ClipsAudioFragment) this.c;
                int i8 = ClipsAudioFragment.Y;
                ngd.e eVar = ngd.e.b;
                clipsAudioFragment.getClass();
                xn50.a.c(clipsAudioFragment, eVar);
                return s3q0.a;
            case 27:
                ClipsEntryPointDraftsFragment clipsEntryPointDraftsFragment = (ClipsEntryPointDraftsFragment) this.c;
                int i9 = ClipsEntryPointDraftsFragment.Y;
                m1e Df = clipsEntryPointDraftsFragment.io().Df();
                j5 j5Var = new j5(clipsEntryPointDraftsFragment, 23);
                Df.getClass();
                ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
                l1e l1eVar = new l1e(j5Var, i);
                clipsDraftPersistentStore.getClass();
                ClipsDraftPersistentStore.o(l1eVar);
                return s3q0.a;
            case 28:
                return new p3e((ViewGroup) obj, ((m3e) this.c).i);
            default:
                d8e d8eVar = (d8e) this.c;
                e5r.a aVar4 = (e5r.a) obj;
                gm50.a.a(d8eVar, aVar4.a, new com.vk.movika.sdk.base.observable.w(d8eVar, 24));
                gm50.a.a(d8eVar, aVar4.b, new pz(d8eVar, 19));
                gm50.a.a(d8eVar, aVar4.c, new u4e(d8eVar, r4));
                gm50.a.a(d8eVar, aVar4.d, new yad(d8eVar, 4));
                return s3q0.a;
        }
    }
}
