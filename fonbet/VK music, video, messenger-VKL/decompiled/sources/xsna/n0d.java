package xsna;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.appcompat.widget.AppCompatTextView;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.clips.sdk.models.ActionLinkSnippet;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.SdkCoOwnerItem;
import com.vk.clips.sdk.models.SdkCompilation;
import com.vk.clips.sdk.models.SdkDuetMeta;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.models.SdkMask;
import com.vk.clips.sdk.models.SdkMusicTrack;
import com.vk.clips.sdk.models.SdkTrendingHashtag;
import com.vk.clips.sdk.models.ads.SdkOrdAdsInfo;
import com.vk.clips.sdk.shared.api.deps.SdkOriginalSoundStatus;
import com.vk.clips.sdk.shared.api.deps.dtos.SdkGeoPlace;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdInfo;
import com.vk.clips.sdk.shared.api.domain.HashtagParseMode;
import com.vk.clips.sdk.shared.api.domain.MentionsParseMode;
import com.vk.clips.sdk.shared.api.feed.data.activities.SdkClipActivities;
import com.vk.clips.sdk.shared.clips.SdkClipAudioTemplate;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsButtonToVideoConfig;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import xsna.m0d;
import xsna.mih0;
import xsna.tlo0;

/* compiled from: ClipItemClipStateProducer.kt */
/* loaded from: classes17.dex */
public final class n0d {
    public final Context a;
    public final z6e b;
    public final e0a c;
    public final s0d d;
    public final yof e;
    public final Object f;
    public final Object g;

    public n0d(Context context, z6e z6eVar, e0a e0aVar, s0d s0dVar, yof yofVar) {
        this.a = context;
        this.b = z6eVar;
        this.c = e0aVar;
        this.d = s0dVar;
        this.e = yofVar;
        u40 u40Var = new u40(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, u40Var);
        this.g = msy.a(lazyThreadSafetyMode, new sk4(2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x0669, code lost:
    
        if (((r11 == null || (r11 = r11.j) == null) ? null : r11.f) == com.vk.dto.market.MarketItemType.OZON) goto L330;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0541 A[LOOP:4: B:120:0x053b->B:122:0x0541, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x02ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04bb A[LOOP:1: B:94:0x04b5->B:96:0x04bb, LOOP_END] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m0d a(SdkClipVideoFile sdkClipVideoFile, FeedItem.f fVar) {
        boolean z;
        ArrayList Ma;
        h7e h7eVar;
        Object obj;
        j7e j7eVar;
        CharSequence a;
        SdkActionLink m1;
        m0d.a aVar;
        m0d.a c3314a;
        Long n;
        SdkClipActivities sdkClipActivities;
        boolean z2;
        ArrayList w6;
        ArrayList Ma2;
        mih0.n nVar;
        mih0.p pVar;
        int i;
        tlo0.a aVar2;
        mih0.i iVar;
        String a2;
        String str;
        CharSequence S6;
        tlo0.h hVar;
        SdkDuetMeta oa;
        mih0.b bVar;
        mih0.d dVar;
        ArrayList arrayList;
        Iterator it;
        mih0.d dVar2;
        ArrayList arrayList2;
        Iterator it2;
        mih0.d dVar3;
        SdkActionLink m12;
        ActionLinkSnippet actionLinkSnippet;
        SdkActionLink m13;
        mih0.o oVar;
        mih0.q qVar;
        Object failure;
        SdkActionLink m14;
        ActionLinkSnippet actionLinkSnippet2;
        SdkActionLink m15;
        njd njdVar = this.b.a;
        String r1 = sdkClipVideoFile.r1();
        yof yofVar = this.e;
        if (yofVar.P().a != ClipsButtonToVideoConfig.Variant.NONE && !yofVar.P().a()) {
            SdkActionLink m16 = sdkClipVideoFile.m1();
            if ((m16 != null ? m16.g : null) != null && (m14 = sdkClipVideoFile.m1()) != null && (actionLinkSnippet2 = m14.g) != null && actionLinkSnippet2.b.length() > 0 && actionLinkSnippet2.h.a(300) != null && (m15 = sdkClipVideoFile.m1()) != null && m15.f.length() > 0) {
                z = true;
                ArrayList K3 = sdkClipVideoFile.K3();
                boolean z3 = (K3 == null && !K3.isEmpty()) || !((Ma = sdkClipVideoFile.Ma()) == null || Ma.isEmpty()) || z;
                if (dgd.f(sdkClipVideoFile)) {
                    y7e y7eVar = njdVar.b;
                    SdkClipAudioTemplate a5 = sdkClipVideoFile.a5();
                    mih0.j jVar = a5 != null ? new mih0.j(a5) : null;
                    a9e a9eVar = njdVar.f;
                    a9eVar.getClass();
                    SdkTrendingHashtag sdkTrendingHashtag = (SdkTrendingHashtag) j5g.a0(sdkClipVideoFile.R0());
                    if (sdkTrendingHashtag == null) {
                        qVar = null;
                    } else {
                        tlo0.h d = oq.d(tlo0.Companion, sdkTrendingHashtag.b);
                        tlo0.f fVar2 = a9eVar.a.J().a ? new tlo0.f(R.string.clips_badge_trailing_trend_label) : null;
                        List<String> list = sdkTrendingHashtag.c;
                        if (list != null) {
                            if (list.isEmpty()) {
                                list = null;
                            }
                            if (list != null) {
                                ArrayList arrayList3 = new ArrayList();
                                Iterator<T> it3 = list.iterator();
                                while (it3.hasNext()) {
                                    try {
                                        String obj2 = drm0.p0((String) it3.next()).toString();
                                        if (!brm0.B(obj2, "#", false)) {
                                            obj2 = '#' + obj2;
                                        }
                                        failure = Integer.valueOf(Color.parseColor(obj2));
                                    } catch (Throwable th) {
                                        failure = new Result.Failure(th);
                                    }
                                    if (failure instanceof Result.Failure) {
                                        failure = null;
                                    }
                                    Integer num = (Integer) failure;
                                    b8g b8gVar = num != null ? new b8g(num.intValue()) : null;
                                    if (b8gVar != null) {
                                        arrayList3.add(b8gVar);
                                    }
                                }
                                if (!arrayList3.isEmpty()) {
                                    oVar = arrayList3.size() == 1 ? new mih0.o.c((cut0) j5g.Y(arrayList3)) : new mih0.o.a(arrayList3);
                                    qVar = new mih0.q(d, oVar, fVar2, false);
                                }
                            }
                        }
                        oVar = null;
                        qVar = new mih0.q(d, oVar, fVar2, false);
                    }
                    h7eVar = new h7e(jVar, qVar, 4);
                } else {
                    h7eVar = new h7e(0);
                }
                h7e h7eVar2 = h7eVar;
                if (dgd.f(sdkClipVideoFile)) {
                    mih0.k a3 = njdVar.h.a(sdkClipVideoFile);
                    njdVar.g.getClass();
                    tlo0.a aVar3 = tlo0.Companion;
                    mih0.p pVar2 = new mih0.p(tq.h(aVar3, R.string.clip_feed_more_shops_title), Integer.valueOf(R.drawable.vk_icon_shops_12), true, false);
                    yof yofVar2 = njdVar.c.a;
                    if (yofVar2.P().a != ClipsButtonToVideoConfig.Variant.NONE && !yofVar2.P().a()) {
                        SdkActionLink m17 = sdkClipVideoFile.m1();
                        if (epx.f(m17 != null ? m17.e : null, "video")) {
                            SdkActionLink m18 = sdkClipVideoFile.m1();
                            if ((m18 != null ? m18.g : null) != null && (m12 = sdkClipVideoFile.m1()) != null && (actionLinkSnippet = m12.g) != null && actionLinkSnippet.b.length() > 0 && actionLinkSnippet.h.a(300) != null && (m13 = sdkClipVideoFile.m1()) != null && m13.f.length() > 0) {
                                z2 = true;
                                w6 = sdkClipVideoFile.w6();
                                if ((w6 != null || w6.isEmpty()) && (((Ma2 = sdkClipVideoFile.Ma()) == null || Ma2.isEmpty()) && !z2)) {
                                    nVar = null;
                                } else {
                                    aVar3.getClass();
                                    nVar = new mih0.n(new tlo0.f(R.string.clip_feed_carousel_attaches_items_title), Integer.valueOf(R.drawable.vk_icon_market_12), true);
                                }
                                x7e x7eVar = njdVar.e;
                                x7eVar.getClass();
                                if (!dgd.f(sdkClipVideoFile)) {
                                    xne xneVar = x7eVar.b;
                                    Integer valueOf = Integer.valueOf(R.drawable.vk_icon_music_12);
                                    SdkMusicTrack V = sdkClipVideoFile.V();
                                    if (!dgd.f(sdkClipVideoFile)) {
                                        if (sdkClipVideoFile.k0()) {
                                            pVar = pVar2;
                                            aVar2 = aVar3;
                                            i = 10;
                                            obj = "video";
                                            iVar = new mih0.i(tq.h(aVar3, R.string.clip_audio_restricted), !xneVar.a(sdkClipVideoFile), valueOf, false, null, sdkClipVideoFile, null, null, null, false, 1544);
                                        } else {
                                            pVar = pVar2;
                                            obj = "video";
                                            i = 10;
                                            aVar2 = aVar3;
                                            Integer num2 = valueOf;
                                            if (V != null) {
                                                int i2 = x7e.c;
                                                String P = sdkClipVideoFile.P();
                                                CharSequence S62 = sdkClipVideoFile.S6();
                                                boolean f = epx.f(P, S62 != null ? S62.toString() : null);
                                                String str2 = V.i;
                                                SdkImages sdkImages = V.d;
                                                boolean z4 = str2 != null;
                                                boolean equals = V.c.equals(sdkClipVideoFile.I0());
                                                if (z4 && equals) {
                                                    if (sdkImages != null) {
                                                        a2 = sdkImages.a(i2);
                                                        boolean a4 = xneVar.a(sdkClipVideoFile);
                                                        if (V.j == null) {
                                                        }
                                                        if (!a4) {
                                                        }
                                                        StringBuilder sb = new StringBuilder();
                                                        sb.append((Object) sdkClipVideoFile.L5());
                                                        sb.append(' ');
                                                        str = V.h;
                                                        if (str == null) {
                                                        }
                                                        sb.append(str);
                                                        String obj3 = drm0.p0(sb.toString()).toString();
                                                        aVar2.getClass();
                                                        boolean z5 = r3;
                                                        tlo0.h hVar2 = new tlo0.h(obj3);
                                                        S6 = sdkClipVideoFile.S6();
                                                        if (S6 != null) {
                                                        }
                                                        hVar = null;
                                                        if (a2 != null) {
                                                        }
                                                        if (x7eVar.a.J().a) {
                                                        }
                                                        Integer valueOf2 = Integer.valueOf(R.drawable.vk_icon_flash_12);
                                                        boolean z6 = V.k;
                                                        iVar = new mih0.i(hVar2, r6, num2, r6, hVar, sdkClipVideoFile, r9, a2, z6 ? valueOf2 : null, z6, 8);
                                                    }
                                                    a2 = null;
                                                    boolean a42 = xneVar.a(sdkClipVideoFile);
                                                    if (V.j == null) {
                                                    }
                                                    if (!a42) {
                                                    }
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append((Object) sdkClipVideoFile.L5());
                                                    sb2.append(' ');
                                                    str = V.h;
                                                    if (str == null) {
                                                    }
                                                    sb2.append(str);
                                                    String obj32 = drm0.p0(sb2.toString()).toString();
                                                    aVar2.getClass();
                                                    boolean z52 = r3;
                                                    tlo0.h hVar22 = new tlo0.h(obj32);
                                                    S6 = sdkClipVideoFile.S6();
                                                    if (S6 != null) {
                                                    }
                                                    hVar = null;
                                                    if (a2 != null) {
                                                    }
                                                    if (x7eVar.a.J().a) {
                                                    }
                                                    Integer valueOf22 = Integer.valueOf(R.drawable.vk_icon_flash_12);
                                                    boolean z62 = V.k;
                                                    iVar = new mih0.i(hVar22, r6, num2, r6, hVar, sdkClipVideoFile, r9, a2, z62 ? valueOf22 : null, z62, 8);
                                                } else {
                                                    if (!equals) {
                                                        if (sdkImages == null) {
                                                            sdkImages = sdkClipVideoFile.M0();
                                                        }
                                                        a2 = sdkImages.a(i2);
                                                        boolean a422 = xneVar.a(sdkClipVideoFile);
                                                        boolean z7 = V.j == null || !f;
                                                        boolean z8 = (!a422 && sdkClipVideoFile.y8() == SdkOriginalSoundStatus.NONE && sdkClipVideoFile.V() == null) ? false : true;
                                                        StringBuilder sb22 = new StringBuilder();
                                                        sb22.append((Object) sdkClipVideoFile.L5());
                                                        sb22.append(' ');
                                                        str = V.h;
                                                        if (str == null) {
                                                            str = "";
                                                        }
                                                        sb22.append(str);
                                                        String obj322 = drm0.p0(sb22.toString()).toString();
                                                        aVar2.getClass();
                                                        boolean z522 = z7;
                                                        tlo0.h hVar222 = new tlo0.h(obj322);
                                                        S6 = sdkClipVideoFile.S6();
                                                        if (S6 != null) {
                                                            if (!z522 || drm0.N(S6)) {
                                                                S6 = null;
                                                            }
                                                            if (S6 != null) {
                                                                hVar = new tlo0.h(S6);
                                                                if (a2 != null) {
                                                                    num2 = null;
                                                                }
                                                                tlo0.f fVar3 = x7eVar.a.J().a ? new tlo0.f(R.string.clips_badge_trailing_trend_label) : null;
                                                                Integer valueOf222 = Integer.valueOf(R.drawable.vk_icon_flash_12);
                                                                boolean z622 = V.k;
                                                                iVar = new mih0.i(hVar222, z8, num2, z8, hVar, sdkClipVideoFile, fVar3, a2, z622 ? valueOf222 : null, z622, 8);
                                                            }
                                                        }
                                                        hVar = null;
                                                        if (a2 != null) {
                                                        }
                                                        if (x7eVar.a.J().a) {
                                                        }
                                                        Integer valueOf2222 = Integer.valueOf(R.drawable.vk_icon_flash_12);
                                                        boolean z6222 = V.k;
                                                        iVar = new mih0.i(hVar222, z8, num2, z8, hVar, sdkClipVideoFile, fVar3, a2, z6222 ? valueOf2222 : null, z6222, 8);
                                                    }
                                                    a2 = null;
                                                    boolean a4222 = xneVar.a(sdkClipVideoFile);
                                                    if (V.j == null) {
                                                    }
                                                    if (!a4222) {
                                                    }
                                                    StringBuilder sb222 = new StringBuilder();
                                                    sb222.append((Object) sdkClipVideoFile.L5());
                                                    sb222.append(' ');
                                                    str = V.h;
                                                    if (str == null) {
                                                    }
                                                    sb222.append(str);
                                                    String obj3222 = drm0.p0(sb222.toString()).toString();
                                                    aVar2.getClass();
                                                    boolean z5222 = z7;
                                                    tlo0.h hVar2222 = new tlo0.h(obj3222);
                                                    S6 = sdkClipVideoFile.S6();
                                                    if (S6 != null) {
                                                    }
                                                    hVar = null;
                                                    if (a2 != null) {
                                                    }
                                                    if (x7eVar.a.J().a) {
                                                    }
                                                    Integer valueOf22222 = Integer.valueOf(R.drawable.vk_icon_flash_12);
                                                    boolean z62222 = V.k;
                                                    iVar = new mih0.i(hVar2222, z8, num2, z8, hVar, sdkClipVideoFile, fVar3, a2, z62222 ? valueOf22222 : null, z62222, 8);
                                                }
                                            } else {
                                                boolean a6 = xneVar.a(sdkClipVideoFile);
                                                boolean z9 = sdkClipVideoFile.y8() != SdkOriginalSoundStatus.NONE && a6;
                                                boolean z10 = z9 || !a6;
                                                L l = L.a;
                                                l.getClass();
                                                if (!L.m(LoggerOutputTarget.NONE)) {
                                                    L.u(l, L.LogType.d, new Object[]{"ClipsFeedMusicBadgesMapper", "clip.ownerName = " + sdkClipVideoFile.P() + ", clip.formattedMusicAllArtists = " + ((Object) sdkClipVideoFile.S6())});
                                                }
                                                iVar = new mih0.i(tq.h(aVar2, R.string.original_sound), z10, num2, z9, null, sdkClipVideoFile, null, null, null, false, 1544);
                                            }
                                        }
                                        mih0.m a7 = njdVar.a.a(sdkClipVideoFile);
                                        mih0.l a8 = njdVar.d.a(sdkClipVideoFile);
                                        SdkGeoPlace A5 = sdkClipVideoFile.A5();
                                        mih0.c cVar = A5 != null ? new mih0.c(A5) : null;
                                        oa = sdkClipVideoFile.oa();
                                        if (oa != null) {
                                            String str3 = oa.f;
                                            if (!myc0.f(str3)) {
                                                str3 = null;
                                            }
                                            if (str3 != null) {
                                                aVar2.getClass();
                                                bVar = new mih0.b(oa, tlo0.a.c(R.string.clip_feed_duet_with, str3));
                                                if (sdkClipVideoFile.H4().isEmpty()) {
                                                    List<SdkCompilation> H4 = sdkClipVideoFile.H4();
                                                    ArrayList arrayList4 = new ArrayList(c5g.u(H4, i));
                                                    for (SdkCompilation sdkCompilation : H4) {
                                                        tlo0.a aVar4 = tlo0.Companion;
                                                        String str4 = sdkCompilation.b;
                                                        if (str4 == null) {
                                                            str4 = "";
                                                        }
                                                        arrayList4.add(new mih0.a(sdkCompilation, oq.d(aVar4, str4)));
                                                    }
                                                    dVar = new mih0.d(new mih0.e(R.string.clip_compilations_header), arrayList4, arrayList4);
                                                } else {
                                                    dVar = null;
                                                }
                                                List<SdkMask> H2 = sdkClipVideoFile.H2();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (Object obj4 : H2) {
                                                    if (((SdkMask) obj4).e) {
                                                        arrayList5.add(obj4);
                                                    }
                                                }
                                                arrayList = new ArrayList(c5g.u(arrayList5, i));
                                                it = arrayList5.iterator();
                                                while (it.hasNext()) {
                                                    arrayList.add(new mih0.f((SdkMask) it.next()));
                                                }
                                                if ((arrayList.isEmpty() ? arrayList : null) == null) {
                                                    mih0.e eVar = new mih0.e(R.string.clip_effects_header);
                                                    ArrayList arrayList6 = new ArrayList(c5g.u(arrayList, i));
                                                    Iterator it4 = arrayList.iterator();
                                                    while (it4.hasNext()) {
                                                        arrayList6.add(new mih0.g(((mih0.f) it4.next()).i));
                                                    }
                                                    dVar2 = new mih0.d(eVar, arrayList, arrayList6);
                                                } else {
                                                    dVar2 = null;
                                                }
                                                List<SdkMask> H22 = sdkClipVideoFile.H2();
                                                ArrayList arrayList7 = new ArrayList();
                                                for (Object obj5 : H22) {
                                                    if (!((SdkMask) obj5).e) {
                                                        arrayList7.add(obj5);
                                                    }
                                                }
                                                arrayList2 = new ArrayList(c5g.u(arrayList7, i));
                                                it2 = arrayList7.iterator();
                                                while (it2.hasNext()) {
                                                    arrayList2.add(new mih0.f((SdkMask) it2.next()));
                                                }
                                                if ((arrayList2.isEmpty() ? arrayList2 : null) == null) {
                                                    mih0.e eVar2 = new mih0.e(R.string.clip_masks_header);
                                                    ArrayList arrayList8 = new ArrayList(c5g.u(arrayList2, i));
                                                    Iterator it5 = arrayList2.iterator();
                                                    while (it5.hasNext()) {
                                                        arrayList8.add(new mih0.g(((mih0.f) it5.next()).i));
                                                    }
                                                    dVar3 = new mih0.d(eVar2, arrayList2, arrayList8);
                                                } else {
                                                    dVar3 = null;
                                                }
                                                j7eVar = new j7e(a3, nVar, pVar, iVar, a7, a8, dVar, cVar, dVar2, dVar3, bVar, 4);
                                            }
                                        }
                                        bVar = null;
                                        if (sdkClipVideoFile.H4().isEmpty()) {
                                        }
                                        List<SdkMask> H23 = sdkClipVideoFile.H2();
                                        ArrayList arrayList52 = new ArrayList();
                                        while (r3.hasNext()) {
                                        }
                                        arrayList = new ArrayList(c5g.u(arrayList52, i));
                                        it = arrayList52.iterator();
                                        while (it.hasNext()) {
                                        }
                                        if ((arrayList.isEmpty() ? arrayList : null) == null) {
                                        }
                                        List<SdkMask> H222 = sdkClipVideoFile.H2();
                                        ArrayList arrayList72 = new ArrayList();
                                        while (r3.hasNext()) {
                                        }
                                        arrayList2 = new ArrayList(c5g.u(arrayList72, i));
                                        it2 = arrayList72.iterator();
                                        while (it2.hasNext()) {
                                        }
                                        if ((arrayList2.isEmpty() ? arrayList2 : null) == null) {
                                        }
                                        j7eVar = new j7e(a3, nVar, pVar, iVar, a7, a8, dVar, cVar, dVar2, dVar3, bVar, 4);
                                    }
                                }
                                pVar = pVar2;
                                obj = "video";
                                i = 10;
                                aVar2 = aVar3;
                                iVar = null;
                                mih0.m a72 = njdVar.a.a(sdkClipVideoFile);
                                mih0.l a82 = njdVar.d.a(sdkClipVideoFile);
                                SdkGeoPlace A52 = sdkClipVideoFile.A5();
                                if (A52 != null) {
                                }
                                oa = sdkClipVideoFile.oa();
                                if (oa != null) {
                                }
                                bVar = null;
                                if (sdkClipVideoFile.H4().isEmpty()) {
                                }
                                List<SdkMask> H232 = sdkClipVideoFile.H2();
                                ArrayList arrayList522 = new ArrayList();
                                while (r3.hasNext()) {
                                }
                                arrayList = new ArrayList(c5g.u(arrayList522, i));
                                it = arrayList522.iterator();
                                while (it.hasNext()) {
                                }
                                if ((arrayList.isEmpty() ? arrayList : null) == null) {
                                }
                                List<SdkMask> H2222 = sdkClipVideoFile.H2();
                                ArrayList arrayList722 = new ArrayList();
                                while (r3.hasNext()) {
                                }
                                arrayList2 = new ArrayList(c5g.u(arrayList722, i));
                                it2 = arrayList722.iterator();
                                while (it2.hasNext()) {
                                }
                                if ((arrayList2.isEmpty() ? arrayList2 : null) == null) {
                                }
                                j7eVar = new j7e(a3, nVar, pVar, iVar, a72, a82, dVar, cVar, dVar2, dVar3, bVar, 4);
                            }
                        }
                    }
                    z2 = false;
                    w6 = sdkClipVideoFile.w6();
                    if (w6 != null) {
                    }
                    nVar = null;
                    x7e x7eVar2 = njdVar.e;
                    x7eVar2.getClass();
                    if (!dgd.f(sdkClipVideoFile)) {
                    }
                    pVar = pVar2;
                    obj = "video";
                    i = 10;
                    aVar2 = aVar3;
                    iVar = null;
                    mih0.m a722 = njdVar.a.a(sdkClipVideoFile);
                    mih0.l a822 = njdVar.d.a(sdkClipVideoFile);
                    SdkGeoPlace A522 = sdkClipVideoFile.A5();
                    if (A522 != null) {
                    }
                    oa = sdkClipVideoFile.oa();
                    if (oa != null) {
                    }
                    bVar = null;
                    if (sdkClipVideoFile.H4().isEmpty()) {
                    }
                    List<SdkMask> H2322 = sdkClipVideoFile.H2();
                    ArrayList arrayList5222 = new ArrayList();
                    while (r3.hasNext()) {
                    }
                    arrayList = new ArrayList(c5g.u(arrayList5222, i));
                    it = arrayList5222.iterator();
                    while (it.hasNext()) {
                    }
                    if ((arrayList.isEmpty() ? arrayList : null) == null) {
                    }
                    List<SdkMask> H22222 = sdkClipVideoFile.H2();
                    ArrayList arrayList7222 = new ArrayList();
                    while (r3.hasNext()) {
                    }
                    arrayList2 = new ArrayList(c5g.u(arrayList7222, i));
                    it2 = arrayList7222.iterator();
                    while (it2.hasNext()) {
                    }
                    if ((arrayList2.isEmpty() ? arrayList2 : null) == null) {
                    }
                    j7eVar = new j7e(a3, nVar, pVar, iVar, a722, a822, dVar, cVar, dVar2, dVar3, bVar, 4);
                } else {
                    obj = "video";
                    j7eVar = new j7e(0);
                }
                p2m p2mVar = (p2m) this.g.getValue();
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.f.getValue();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                xod xodVar = this.d.a;
                String j1 = sdkClipVideoFile.j1();
                a = xodVar.a(j1 == null ? drm0.p0(j1).toString() : null, HashtagParseMode.CLIPS, MentionsParseMode.CLIPS, true);
                if (dgd.c(sdkClipVideoFile)) {
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-1191182337);
                    boolean f2 = myc0.f(a);
                    SdkVideoAdInfo X0 = sdkClipVideoFile.X0();
                    SdkOrdAdsInfo p1 = sdkClipVideoFile.p1();
                    StringBuilder sb3 = new StringBuilder();
                    if (X0 != null) {
                        String str5 = X0.b;
                        if (str5 == null) {
                            str5 = "";
                        }
                        String str6 = X0.d;
                        if (str6 == null) {
                            str6 = "";
                        }
                        String str7 = X0.c;
                        if (str7 == null) {
                            str7 = "";
                        }
                        sb3.append(str5);
                        boolean f3 = myc0.f(str6);
                        if (myc0.f(sb3) && f3) {
                            sb3.append((CharSequence) " ");
                        }
                        sb3.append(str6);
                        boolean f4 = myc0.f(str7);
                        if (myc0.f(sb3) && f4) {
                            sb3.append((CharSequence) " · ");
                        }
                        sb3.append(str7);
                    } else if (p1 != null) {
                        UserId.b bVar2 = UserId.c;
                        ClickableStickers clickableStickers = k15.z(sdkClipVideoFile).C1;
                        ClickableMarketItem Bb = clickableStickers != null ? clickableStickers.Bb() : null;
                        if (myc0.f(Bb != null ? Bb.l : null)) {
                        }
                        sb3.append(p1.b);
                    }
                    if (myc0.f(sb3) && f2) {
                        sb3.append((CharSequence) " · ");
                    }
                    spannableStringBuilder.append(sb3, foregroundColorSpan, 33);
                }
                if (myc0.f(a)) {
                    Typeface a9 = cqi.a(Font.Companion, FontFamily.REGULAR, 13.0f, this.a);
                    TextSizeUnit textSizeUnit = TextSizeUnit.SP;
                    spannableStringBuilder.append(a, new pup0(a9), 33);
                }
                m2m a10 = p2mVar.a(appCompatTextView, spannableStringBuilder);
                String W = this.c.W(sdkClipVideoFile);
                List<SdkCoOwnerItem> P1 = sdkClipVideoFile.P1();
                ArrayList arrayList9 = new ArrayList();
                for (Object obj6 : P1) {
                    if (((SdkCoOwnerItem) obj6).d()) {
                        arrayList9.add(obj6);
                    }
                }
                m1 = sdkClipVideoFile.m1();
                if (epx.f(m1 == null ? m1.e : null, obj)) {
                    aVar = m0d.a.b.a;
                } else {
                    List c0 = drm0.c0(m1.b, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
                    String str8 = (String) j5g.b0(0, c0);
                    UserId userId = (str8 == null || (n = arm0.n(str8)) == null) ? null : new UserId(n.longValue());
                    String str9 = (String) j5g.b0(1, c0);
                    Integer m = str9 != null ? arm0.m(10, str9) : null;
                    if (userId != null && m != null) {
                        c3314a = new m0d.a.C3314a(userId, m.intValue());
                        return new m0d(sdkClipVideoFile, r1, z3, h7eVar2, j7eVar, a10, W, arrayList9, c3314a, (fVar != null || (sdkClipActivities = fVar.k) == null) ? null : new v80(sdkClipActivities));
                    }
                    aVar = m0d.a.b.a;
                }
                c3314a = aVar;
                return new m0d(sdkClipVideoFile, r1, z3, h7eVar2, j7eVar, a10, W, arrayList9, c3314a, (fVar != null || (sdkClipActivities = fVar.k) == null) ? null : new v80(sdkClipActivities));
            }
        }
        z = false;
        ArrayList K32 = sdkClipVideoFile.K3();
        if (K32 == null) {
        }
        if (dgd.f(sdkClipVideoFile)) {
        }
        h7e h7eVar22 = h7eVar;
        if (dgd.f(sdkClipVideoFile)) {
        }
        p2m p2mVar2 = (p2m) this.g.getValue();
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) this.f.getValue();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        xod xodVar2 = this.d.a;
        String j12 = sdkClipVideoFile.j1();
        a = xodVar2.a(j12 == null ? drm0.p0(j12).toString() : null, HashtagParseMode.CLIPS, MentionsParseMode.CLIPS, true);
        if (dgd.c(sdkClipVideoFile)) {
        }
        if (myc0.f(a)) {
        }
        m2m a102 = p2mVar2.a(appCompatTextView2, spannableStringBuilder2);
        String W2 = this.c.W(sdkClipVideoFile);
        List<SdkCoOwnerItem> P12 = sdkClipVideoFile.P1();
        ArrayList arrayList92 = new ArrayList();
        while (r3.hasNext()) {
        }
        m1 = sdkClipVideoFile.m1();
        if (epx.f(m1 == null ? m1.e : null, obj)) {
        }
        c3314a = aVar;
        return new m0d(sdkClipVideoFile, r1, z3, h7eVar22, j7eVar, a102, W2, arrayList92, c3314a, (fVar != null || (sdkClipActivities = fVar.k) == null) ? null : new v80(sdkClipActivities));
    }
}
