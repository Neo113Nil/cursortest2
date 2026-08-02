package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.RemoteException;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.runtime.a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachArtist;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachCurator;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachGraffiti;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachMarket;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vk.im.engine.internal.sync.longpoll.LongPollSyncManager$InitialSyncState;
import com.vk.im.engine.models.attaches.AttachArticle;
import com.vk.im.engine.models.attaches.AttachChannelMessage;
import com.vk.im.engine.models.attaches.AttachDonutLink;
import com.vk.im.engine.models.attaches.AttachEvent;
import com.vk.im.engine.models.attaches.AttachHighlight;
import com.vk.im.engine.models.attaches.AttachLink;
import com.vk.im.engine.models.attaches.AttachPlaylist;
import com.vk.im.engine.models.attaches.AttachPodcastEpisode;
import com.vk.im.engine.models.attaches.AttachPoll;
import com.vk.im.engine.models.attaches.AttachQuestion;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.attaches.AttachUgcSticker;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.attaches.AttachWallReply;
import com.vk.im.engine.models.attaches.miniapp.AttachMiniApp;
import com.vk.log.L;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.bridges.JsApiEvent;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.TypeCastException;
import org.json.JSONObject;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.bex0;

/* compiled from: AudienceResearchTrackerExt.kt */
/* loaded from: classes15.dex */
public final class xa4 implements yxq, gn60, d4s, io.reactivex.rxjava3.functions.l, da9 {
    public static fmv d;
    public final /* synthetic */ int b;
    public static final va4 c = new va4(0);
    public static final xa4 e = new xa4(2);
    public static final jai f = new jai(-1771404885, new pii(0), false);
    public static final fh9 g = new fh9(new kxa(0, 7), new cb3(2));

    public /* synthetic */ xa4(int i) {
        this.b = i;
    }

    public static int A(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static boolean B(int i) {
        return i == 1 || i == 2 || i == 4;
    }

    @NonNull
    public static eo9 C(@NonNull CameraPosition cameraPosition) {
        exc0.j(cameraPosition, "cameraPosition must not be null");
        try {
            return new eo9(O().a0(cameraPosition));
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    @NonNull
    public static eo9 D(@NonNull LatLng latLng) {
        try {
            return new eo9(O().h0(latLng));
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    @NonNull
    public static eo9 E(@NonNull LatLngBounds latLngBounds, int i) {
        try {
            return new eo9(O().W0(latLngBounds, i));
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    @NonNull
    public static eo9 F(@NonNull LatLng latLng, float f2) {
        try {
            return new eo9(O().m1(latLng, f2));
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public static final io.reactivex.rxjava3.internal.operators.observable.c2 G(io.reactivex.rxjava3.core.q qVar, long j, long j2, int i, final izs izsVar, final wzs wzsVar, final izs izsVar2, final io.reactivex.rxjava3.core.w wVar) {
        final sx5 sx5Var = new sx5(new jaq(j, j2), i);
        io.reactivex.rxjava3.functions.l lVar = new io.reactivex.rxjava3.functions.l() { // from class: xsna.usg0
            @Override // io.reactivex.rxjava3.functions.l
            public final Object apply(Object obj) {
                return ((io.reactivex.rxjava3.core.q) obj).L(new nh40(new vsg0(izs.this, sx5Var, wzsVar, wVar, izsVar2), 12), false);
            }
        };
        qVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.c2(qVar, lVar);
    }

    public static /* synthetic */ io.reactivex.rxjava3.internal.operators.observable.c2 H(io.reactivex.rxjava3.internal.operators.observable.a aVar, int i, int i2) {
        long j = (i2 & 1) != 0 ? 500L : 5000L;
        if ((i2 & 16) != 0) {
            i = Integer.MAX_VALUE;
        }
        return G(aVar, j, ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, i, new kpr(22), new nq2((byte) 0, 10), new ept(25), io.reactivex.rxjava3.schedulers.a.a());
    }

    public static io.reactivex.rxjava3.internal.operators.observable.i2 I(io.reactivex.rxjava3.core.x xVar, int i, int i2) {
        long j = (i2 & 1) != 0 ? 500L : 1000L;
        if ((i2 & 16) != 0) {
            i = Integer.MAX_VALUE;
        }
        return G(xVar.w(), j, ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, i, new kpr(22), new lq2(8), new b4r(29), io.reactivex.rxjava3.schedulers.a.a()).m0();
    }

    public static final q630 J(q630 q630Var, final boolean z, final gzs gzsVar) {
        return qri.a(q630Var, a5x.a, new yzs() { // from class: xsna.alg0
            @Override // xsna.yzs
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                buw buwVar;
                q630 q630Var2 = (q630) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                aVar.K(-170689940);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-170689940, intValue, -1, "com.vk.core.compose.utils.rippleClickable.<anonymous> (rippleClickable.kt:13)");
                }
                if (z) {
                    aVar.K(-824272877);
                    buwVar = (buw) aVar.r(cuw.a);
                    aVar.j();
                } else {
                    aVar.K(217357393);
                    aVar.j();
                    buwVar = null;
                }
                buw buwVar2 = buwVar;
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = ir.h(aVar);
                }
                q630 b = ojc.b(q630Var2, (sg50) x, buwVar2, false, null, gzsVar, 28);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return b;
            }
        });
    }

    public static final Rect K(zhf0 zhf0Var) {
        return new Rect(an10.b(zhf0Var.a), an10.b(zhf0Var.b), an10.b(zhf0Var.c), an10.b(zhf0Var.d));
    }

    public static final bc6 L(Context context) {
        return new bc6(context, null);
    }

    public static final jbs M(FragmentImpl fragmentImpl) {
        return new jbs(fragmentImpl);
    }

    public static List N(NewsEntryWithAttachments newsEntryWithAttachments) {
        return Collections.singletonList(new i14(y64.d(newsEntryWithAttachments).size()));
    }

    public static fmv O() {
        fmv fmvVar = d;
        exc0.j(fmvVar, "CameraUpdateFactory is not initialized");
        return fmvVar;
    }

    public static final void h(int i, androidx.compose.runtime.a aVar, String str, izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(-1162737955);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(str) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1162737955, i2, -1, "androidx.compose.foundation.Canvas (Canvas.kt:62)");
            }
            q630 c2 = bu00.c(q630Var, izsVar);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new zw(str, 2);
                M.R(x);
            }
            f9t.e(egi0.b(c2, false, (izs) x), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ax(i, str, izsVar, q630Var);
        }
    }

    public static final void i(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-932836462);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-932836462, i2, -1, "androidx.compose.foundation.Canvas (Canvas.kt:41)");
            }
            f9t.e(bu00.c(q630Var, izsVar), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jr9(q630Var, izsVar, i);
        }
    }

    public static ill j(long j, long j2, long j3, androidx.compose.runtime.a aVar, int i) {
        long j4;
        long j5;
        long j6;
        if ((i & 1) != 0) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1462282791, 6, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:97)");
            }
            k9g k9gVar = (k9g) aVar.r(l9g.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j4 = ((l5g) ((zak0) k9gVar.c).getValue()).a;
        } else {
            j4 = j;
        }
        if ((i & 2) != 0) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1462282791, 6, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:97)");
            }
            k9g k9gVar2 = (k9g) aVar.r(l9g.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j5 = l5g.c(14, k9gVar2.a(), 0.6f);
        } else {
            j5 = j2;
        }
        if ((i & 4) != 0) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1462282791, 6, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:97)");
            }
            k9g k9gVar3 = (k9g) aVar.r(l9g.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j6 = l5g.c(14, k9gVar3.a(), fsk.r(6, aVar));
        } else {
            j6 = j3;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1370708026, 0, -1, "androidx.compose.material.RadioButtonDefaults.colors (RadioButton.kt:161)");
        }
        boolean p = aVar.p(j4) | aVar.p(j5) | aVar.p(j6);
        Object x = aVar.x();
        if (p || x == a.C0011a.a) {
            ill illVar = new ill(j4, j5, j6);
            aVar.R(illVar);
            x = illVar;
        }
        ill illVar2 = (ill) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return illVar2;
    }

    public static String k(Attach attach) {
        String str;
        if (attach instanceof AttachImage) {
            AttachImage attachImage = (AttachImage) attach;
            Long l = attachImage.z;
            if (l == null || !attachImage.x) {
                return p(attachImage.e, attachImage.d, "photo", attachImage.t);
            }
            return p(l.longValue(), attachImage.d, "photo", null);
        }
        str = "";
        if (attach instanceof AttachVideo) {
            AttachVideo attachVideo = (AttachVideo) attach;
            UserId I0 = attachVideo.b.I0();
            long id = attachVideo.getId();
            String C1 = attachVideo.b.C1();
            return p(id, I0, "video", C1 != null ? C1 : "");
        }
        if (attach instanceof AttachVideoMsg) {
            AttachVideoMsg attachVideoMsg = (AttachVideoMsg) attach;
            UserId I02 = attachVideoMsg.b.I0();
            long id2 = attachVideoMsg.getId();
            String C12 = attachVideoMsg.b.C1();
            return p(id2, I02, "video_message", C12 != null ? C12 : "");
        }
        if (attach instanceof AttachAudio) {
            AttachAudio attachAudio = (AttachAudio) attach;
            UserId userId = attachAudio.e;
            long j = attachAudio.f;
            String str2 = attachAudio.b.r;
            return p(j, userId, "audio", str2 != null ? str2 : "");
        }
        if (attach instanceof AttachDoc) {
            AttachDoc attachDoc = (AttachDoc) attach;
            return p(attachDoc.e, attachDoc.d, "doc", attachDoc.s);
        }
        if (attach instanceof AttachAudioMsg) {
            AttachAudioMsg attachAudioMsg = (AttachAudioMsg) attach;
            return p(attachAudioMsg.e, attachAudioMsg.d, "audio_message", attachAudioMsg.k);
        }
        if (attach instanceof AttachGraffiti) {
            AttachGraffiti attachGraffiti = (AttachGraffiti) attach;
            return p(attachGraffiti.e, attachGraffiti.d, "doc", attachGraffiti.h);
        }
        if (attach instanceof AttachWall) {
            AttachWall attachWall = (AttachWall) attach;
            return p(attachWall.e, attachWall.d, attachWall.h ? "wall_ads" : "wall", attachWall.n);
        }
        if (attach instanceof AttachWallReply) {
            StringBuilder sb = new StringBuilder();
            AttachWallReply attachWallReply = (AttachWallReply) attach;
            sb.append(p(attachWallReply.g, attachWallReply.d, "wall", attachWallReply.k));
            sb.append("?reply=");
            sb.append(attachWallReply.e);
            if (attachWallReply.f != 0) {
                str = "&thread=" + attachWallReply.f;
            }
            sb.append(str);
            return sb.toString();
        }
        if (attach instanceof AttachMarket) {
            AttachMarket attachMarket = (AttachMarket) attach;
            return p(attachMarket.e, attachMarket.d, "market", attachMarket.r);
        }
        if (attach instanceof AttachPlaylist) {
            AttachPlaylist attachPlaylist = (AttachPlaylist) attach;
            UserId userId2 = attachPlaylist.e;
            long j2 = attachPlaylist.f;
            String str3 = attachPlaylist.b.x;
            return p(j2, userId2, "audio_playlist", str3 != null ? str3 : "");
        }
        if (attach instanceof AttachArticle) {
            AttachArticle attachArticle = (AttachArticle) attach;
            return p(attachArticle.e, attachArticle.d, "article", attachArticle.o);
        }
        if (attach instanceof AttachStory) {
            StoryEntry storyEntry = ((AttachStory) attach).b;
            return p(storyEntry.c, storyEntry.d, "story", storyEntry.o);
        }
        if (attach instanceof AttachHighlight) {
            return p(r8.b, ((AttachHighlight) attach).b.c, "narrative", null);
        }
        if (attach instanceof AttachUgcSticker) {
            AttachUgcSticker attachUgcSticker = (AttachUgcSticker) attach;
            return p(attachUgcSticker.e, attachUgcSticker.d, "ugc_sticker", null);
        }
        if (attach instanceof AttachPoll) {
            AttachPoll attachPoll = (AttachPoll) attach;
            return p(attachPoll.g, attachPoll.f, "poll", null);
        }
        if (attach instanceof AttachLink) {
            return ((AttachLink) attach).e;
        }
        if (attach instanceof AttachPodcastEpisode) {
            return p(r8.b, ((AttachPodcastEpisode) attach).d.c, "podcast", null);
        }
        if (attach instanceof AttachArtist) {
            return String.format(Locale.US, "artist%s", Arrays.copyOf(new Object[]{((AttachArtist) attach).b}, 1));
        }
        if (attach instanceof AttachCurator) {
            return String.format(Locale.US, "curator%s", Arrays.copyOf(new Object[]{((AttachCurator) attach).b}, 1));
        }
        if (attach instanceof AttachEvent) {
            return String.format(Locale.US, "event%s", Arrays.copyOf(new Object[]{Long.valueOf(((AttachEvent) attach).getId())}, 1));
        }
        if (attach instanceof AttachMiniApp) {
            return ((AttachMiniApp) attach).N4(a0a.d);
        }
        if (attach instanceof AttachDonutLink) {
            return String.format(Locale.US, "donut_link%s", Arrays.copyOf(new Object[]{((AttachDonutLink) attach).d}, 1));
        }
        if (attach instanceof AttachQuestion) {
            StringBuilder sb2 = new StringBuilder("question");
            AttachQuestion attachQuestion = (AttachQuestion) attach;
            sb2.append(attachQuestion.c);
            sb2.append('_');
            sb2.append(attachQuestion.b);
            return sb2.toString();
        }
        if (!(attach instanceof AttachChannelMessage)) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder("channel_message");
        AttachChannelMessage attachChannelMessage = (AttachChannelMessage) attach;
        sb3.append(attachChannelMessage.b);
        sb3.append('_');
        sb3.append(attachChannelMessage.c);
        return sb3.toString();
    }

    public static SpannableString l(int i, Context context, gzs gzsVar) {
        String string = context.getString(i);
        String string2 = context.getString(R.string.vk_pay_checkout_bind_card_terms_target);
        int f2 = e3m.f(R.attr.vk_legacy_text_link, context);
        Locale locale = Locale.ROOT;
        int K = drm0.K(0, 6, string.toLowerCase(locale), string2.toLowerCase(locale), false);
        int length = string2.length() + K;
        SpannableString spannableString = new SpannableString(string);
        if (K >= 0) {
            spannableString.setSpan(new kik0(f2, gzsVar), K, length, 33);
            spannableString.setSpan(new ForegroundColorSpan(context.getColor(R.color.vk_blue_200)), K, length, 33);
        }
        return spannableString;
    }

    public static final io.reactivex.rxjava3.internal.operators.completable.b m(final ua4 ua4Var, long j, long j2, final io.reactivex.rxjava3.functions.a aVar, final gzs gzsVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        final io.reactivex.rxjava3.internal.operators.mixed.g gVar = (io.reactivex.rxjava3.internal.operators.mixed.g) io.reactivex.rxjava3.core.q.Q(j2, j2, timeUnit, io.reactivex.rxjava3.schedulers.a.a()).u(new ql2(new s6(ua4Var, 6), 2));
        return io.reactivex.rxjava3.core.a.s(j, timeUnit, io.reactivex.rxjava3.schedulers.a.a()).c(new io.reactivex.rxjava3.internal.operators.completable.f(new io.reactivex.rxjava3.functions.n() { // from class: xsna.wa4
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                if (!((Boolean) gzs.this.invoke()).booleanValue()) {
                    return io.reactivex.rxjava3.internal.operators.completable.i.b;
                }
                io.reactivex.rxjava3.core.a c2 = ua4Var.c();
                c2.getClass();
                return new io.reactivex.rxjava3.internal.operators.completable.v(c2, io.reactivex.rxjava3.internal.functions.a.g).c(io.reactivex.rxjava3.core.a.l(aVar)).c(gVar);
            }
        }).q(io.reactivex.rxjava3.schedulers.a.b()));
    }

    public static void n(File file, File file2, byte[] bArr) {
        L.e("start decrypt: " + file + " -> " + file2);
        StringBuilder sb = new StringBuilder("start decrypt: ");
        sb.append(file);
        L.e(sb.toString());
        byte[] B = com.vk.core.files.a.B(file, null);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(B, 0, 16));
        byte[] doFinal = cipher.doFinal(B, 16, ((int) file.length()) - 16);
        L.e(z9r.a(file, "end decrypt: "));
        com.vk.core.files.a.O(file2, doFinal);
        L.e("end decrypt: " + file + " -> " + file2);
    }

    public static void o(File file, File file2, byte[] bArr) {
        L.e("start encrypt: " + file + " -> " + file2);
        byte[] bytes = UUID.randomUUID().toString().getBytes(emb.b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bytes, 0, 16);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        byte[] bArr2 = new byte[(int) com.vk.core.files.a.I(file)];
        com.vk.core.files.a.B(file, bArr2);
        byte[] doFinal = cipher.doFinal(bArr2);
        byte[] bArr3 = new byte[doFinal.length + 16];
        jw5.f(bytes, 0, 0, bArr3, 16);
        jw5.f(doFinal, 16, 0, bArr3, doFinal.length);
        com.vk.core.files.a.O(file2, bArr3);
        L.e("end encrypt: " + file + " -> " + file2);
    }

    public static String p(long j, UserId userId, String str, String str2) {
        return (str2 == null || str2.length() == 0) ? String.format(Locale.US, "%s%d_%d", Arrays.copyOf(new Object[]{str, Long.valueOf(userId.b), Long.valueOf(j)}, 3)) : String.format(Locale.US, "%s%d_%d_%s", Arrays.copyOf(new Object[]{str, Long.valueOf(userId.b), Long.valueOf(j), str2}, 4));
    }

    public static ArrayList q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(StoryCameraMode.QR_SCANNER);
        ms i = o25.a().i();
        if (i.k) {
            arrayList.add(StoryCameraMode.LIVE);
        }
        if (g620.f().getExperiments().c()) {
            arrayList.add(StoryCameraMode.CLIPS);
        }
        arrayList.add(StoryCameraMode.STORY);
        arrayList.add(StoryCameraMode.STORY_VIDEO);
        if (i.l) {
            arrayList.add(StoryCameraMode.PING_PONG);
        }
        return arrayList;
    }

    public static final int s(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static List t() {
        List b = ttp0.b(q());
        b.remove(StoryCameraMode.QR_SCANNER);
        b.remove(StoryCameraMode.LIVE);
        b.remove(StoryCameraMode.CLIPS);
        return b;
    }

    public static int u(int i, int i2, int i3, boolean z) {
        int i4 = z ? 1 : 2;
        if (i2 == 0 || i == 5 || i3 > 0) {
            return i4;
        }
        return 4;
    }

    public static int v(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        return (i == 1 || i == 2) ? z ? R.string.community_status_button_public_subscribed : (z2 && i == 1) ? R.string.community_status_button_event_sure : (!z2 || i == 1) ? R.string.community_status_button_group_joined : R.string.community_status_button_event_not_sure : i != 4 ? (z3 || z4) ? R.string.community_status_button_sent_request : z2 ? R.string.community_status_button_join_event : z ? R.string.join_page : R.string.join_group_short : R.string.community_status_button_requested;
    }

    public static int w(Group group) {
        int i = group.C;
        int i2 = group.p;
        boolean z = false;
        boolean z2 = i2 == 2;
        boolean z3 = i2 == 1;
        boolean z4 = i2 == 0 && group.m == 1;
        if (i2 == 1 && group.m == 1) {
            z = true;
        }
        return v(i, z2, z3, z4, z);
    }

    public static int y(ExtendedCommunityProfile extendedCommunityProfile) {
        int i = extendedCommunityProfile.a1;
        int i2 = extendedCommunityProfile.Y;
        boolean z = false;
        boolean z2 = i2 == 2;
        boolean z3 = i2 == 1;
        boolean z4 = i2 == 0 && extendedCommunityProfile.Z == 1;
        if (i2 == 1 && extendedCommunityProfile.Z == 1) {
            z = true;
        }
        return v(i, z2, z3, z4, z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int z(@Nullable String str) {
        char c2;
        if (str == null) {
            return -1;
        }
        String q = io20.q(str);
        q.getClass();
        switch (q.hashCode()) {
            case -2123537834:
                if (q.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1662384011:
                if (q.equals("video/mp2p")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1662384007:
                if (q.equals("video/mp2t")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1662095187:
                if (q.equals("video/webm")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1606874997:
                if (q.equals(MimeTypes.AUDIO_AMR_WB)) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1487656890:
                if (q.equals("image/avif")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1487464693:
                if (q.equals("image/heic")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -1487464690:
                if (q.equals("image/heif")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1487394660:
                if (q.equals("image/jpeg")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1487018032:
                if (q.equals("image/webp")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1248337486:
                if (q.equals(MimeTypes.APPLICATION_MP4)) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -1079884372:
                if (q.equals("video/x-msvideo")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -1004728940:
                if (q.equals(MimeTypes.TEXT_VTT)) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case -879272239:
                if (q.equals("image/bmp")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case -879258763:
                if (q.equals("image/png")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -387023398:
                if (q.equals("audio/x-matroska")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case -43467528:
                if (q.equals(MimeTypes.APPLICATION_WEBM)) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 13915911:
                if (q.equals("video/x-flv")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 187078296:
                if (q.equals(MimeTypes.AUDIO_AC3)) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case 187078297:
                if (q.equals("audio/ac4")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 187078669:
                if (q.equals("audio/amr")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 187090232:
                if (q.equals(MimeTypes.AUDIO_MP4)) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 187091926:
                if (q.equals("audio/ogg")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case 187099443:
                if (q.equals("audio/wav")) {
                    c2 = 23;
                    break;
                }
                c2 = 65535;
                break;
            case 1331848029:
                if (q.equals(MimeTypes.VIDEO_MP4)) {
                    c2 = 24;
                    break;
                }
                c2 = 65535;
                break;
            case 1503095341:
                if (q.equals(MimeTypes.AUDIO_AMR_NB)) {
                    c2 = 25;
                    break;
                }
                c2 = 65535;
                break;
            case 1504578661:
                if (q.equals(MimeTypes.AUDIO_E_AC3)) {
                    c2 = 26;
                    break;
                }
                c2 = 65535;
                break;
            case 1504619009:
                if (q.equals(MimeTypes.AUDIO_FLAC)) {
                    c2 = 27;
                    break;
                }
                c2 = 65535;
                break;
            case 1504824762:
                if (q.equals("audio/midi")) {
                    c2 = 28;
                    break;
                }
                c2 = 65535;
                break;
            case 1504831518:
                if (q.equals(MimeTypes.AUDIO_MPEG)) {
                    c2 = 29;
                    break;
                }
                c2 = 65535;
                break;
            case 1505118770:
                if (q.equals(MimeTypes.AUDIO_WEBM)) {
                    c2 = 30;
                    break;
                }
                c2 = 65535;
                break;
            case 2039520277:
                if (q.equals("video/x-matroska")) {
                    c2 = 31;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
        }
        return -1;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        List asList = Arrays.asList((Object[]) obj);
        ArrayList arrayList = new ArrayList(c5g.u(asList, 10));
        for (Object obj2 : asList) {
            if (obj2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type T");
            }
            arrayList.add(obj2);
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            int h = ((LongPollSyncManager$InitialSyncState) next).h();
            do {
                Object next2 = it.next();
                int h2 = ((LongPollSyncManager$InitialSyncState) next2).h();
                if (h > h2) {
                    next = next2;
                    h = h2;
                }
            } while (it.hasNext());
        }
        return (LongPollSyncManager$InitialSyncState) next;
    }

    @Override // xsna.da9
    public void b() {
        q19 q19Var = q19.a;
        x6y x6yVar = q19.b;
        if (x6yVar != null) {
            x6yVar.x(JsApiEvent.CALL_FINISHED, q19.c);
        }
        q19.b = null;
    }

    @Override // xsna.da9
    public void c() {
        Context context;
        q19 q19Var = q19.a;
        x6y x6yVar = q19.b;
        if (x6yVar != null && (context = x6yVar.l) != null) {
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            if (superappUiRouterBridge == null) {
                superappUiRouterBridge = null;
            }
            superappUiRouterBridge.d(context);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("result", true);
        x6y x6yVar2 = q19.b;
        if (x6yVar2 != null) {
            bex0.a.b(x6yVar2, JsApiMethodType.CALL_JOIN, jSONObject, null, 12);
        }
    }

    @Override // xsna.da9
    public void d() {
        q19.a.a();
    }

    @Override // xsna.da9
    public void f() {
        q19 q19Var = q19.a;
        x6y x6yVar = q19.b;
        if (x6yVar != null) {
            x6yVar.x(JsApiEvent.CALL_LEFT, q19.c);
        }
        q19.b = null;
    }

    @Override // xsna.yxq
    public io.reactivex.rxjava3.core.x g(iw60 iw60Var) {
        ik60 ik60Var = new ik60(gcd0.g(iw60Var.a), iw60Var.c, Boolean.valueOf(iw60Var.d), iw60Var.j, ce60.b);
        ik60Var.D(iw60Var.f, CommonUrlParts.REQUEST_ID);
        String str = iw60Var.i;
        if (ik60.x.compareAndSet(true, false)) {
            ik60Var.K(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "initial");
        } else {
            ik60Var.K(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, str);
        }
        ik60Var.K("device_info", iw60Var.e);
        Boolean bool = iw60Var.k;
        if (bool != null) {
            ik60Var.R("has_cached_items", bool.booleanValue());
        }
        return rsg0.w0(ik60Var);
    }

    public int hashCode() {
        switch (this.b) {
            case 26:
                throw null;
            default:
                return super.hashCode();
        }
    }

    public io.reactivex.rxjava3.core.x r(String str) {
        return rsg0.W(new jrt(null, g5f0.a(str), "video_files,trust_mark," + jy2.a), 7);
    }

    public xa4(g5f0 g5f0Var) {
        this.b = 19;
    }

    public xa4() {
        this.b = 27;
        q19 q19Var = q19.a;
    }

    @Override // xsna.d4s
    public void a(h1j h1jVar) {
    }

    @Override // xsna.d4s
    public void e(boolean z, boolean z2, wzf wzfVar) {
    }
}
