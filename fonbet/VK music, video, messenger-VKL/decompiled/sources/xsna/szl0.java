package xsna;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.Layout;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stories.model.CanvasStickerDraft;
import com.vk.dto.stories.model.actions.ActionPoll;
import com.vk.dto.stories.model.clickable.ClickableMention;
import com.vk.log.L;
import com.vk.stickers.api.models.question.StoryQuestionInfo;
import com.vk.stickers.api.models.time.TimeStickerStyle;
import com.vk.stickers.api.styles.StickerCommonStyle;
import com.vk.stickers.api.styles.b;
import com.vk.superapp.api.dto.story.WebNativeSticker;
import com.vk.superapp.api.dto.story.WebRenderableSticker;
import com.vk.superapp.api.dto.story.WebServiceInfo;
import com.vk.superapp.api.dto.story.WebSticker;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vk.superapp.api.dto.story.WebTransform;
import com.vk.superapp.api.dto.story.actions.StickerAction;
import com.vk.superapp.api.dto.story.actions.WebActionAudioTrack;
import com.vk.superapp.api.dto.story.actions.WebActionEmoji;
import com.vk.superapp.api.dto.story.actions.WebActionHashtag;
import com.vk.superapp.api.dto.story.actions.WebActionLink;
import com.vk.superapp.api.dto.story.actions.WebActionMarketItem;
import com.vk.superapp.api.dto.story.actions.WebActionMention;
import com.vk.superapp.api.dto.story.actions.WebActionPlace;
import com.vk.superapp.api.dto.story.actions.WebActionQuestion;
import com.vk.superapp.api.dto.story.actions.WebActionSituationalTemplate;
import com.vk.superapp.api.dto.story.actions.WebActionSticker;
import com.vk.superapp.api.dto.story.actions.WebActionText;
import com.vk.superapp.api.dto.story.actions.WebActionTime;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import xsna.bx80;
import xsna.hmo0;
import xsna.kcl0;
import xsna.qzl0;
import xsna.rsg0;
import xsna.t6g0;
import xsna.vpe0;
import xsna.yfb;
import xsna.zq70;

/* compiled from: StoryBoxConverter.kt */
/* loaded from: classes6.dex */
public final class szl0 {
    public final float a;
    public final float b;
    public final s5m0 c;
    public final com.vk.stickers.api.styles.b d;

    /* compiled from: StoryBoxConverter.kt */
    public static final class a {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x00c1, code lost:
        
            if (r4.equals("left_top") != false) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00c9, code lost:
        
            if (r4.equals("right_center") == false) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00f0, code lost:
        
            r19.getStickerMatrix().getValues(xsna.ln10.a());
            r6 = (r22 / 2.0f) - ((r19.getOriginalHeight() * xsna.ln10.a()[4]) / 2.0f);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00d1, code lost:
        
            if (r4.equals("right_bottom") == false) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0114, code lost:
        
            r19.getStickerMatrix().getValues(xsna.ln10.a());
            r6 = r22 - (r19.getOriginalHeight() * xsna.ln10.a()[4]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00d8, code lost:
        
            if (r4.equals("center_top") == false) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00df, code lost:
        
            if (r4.equals("center_bottom") == false) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00e6, code lost:
        
            if (r4.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.CENTER) == false) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00ed, code lost:
        
            if (r4.equals("left_center") == false) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0111, code lost:
        
            if (r4.equals("left_bottom") == false) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0131, code lost:
        
            if (r4.equals("right_top") == false) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x004b, code lost:
        
            if (r4.equals("right_center") == false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
        
            r5 = r21 - (r19.getOriginalWidth() * xsna.ln10.b(r19.getStickerMatrix()));
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0052, code lost:
        
            if (r4.equals("right_bottom") == false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0059, code lost:
        
            if (r4.equals("center_top") == false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:
        
            r5 = (r21 / 2.0f) - ((r19.getOriginalWidth() * xsna.ln10.b(r19.getStickerMatrix())) / 2.0f);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0060, code lost:
        
            if (r4.equals("center_bottom") == false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0067, code lost:
        
            if (r4.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.CENTER) == false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0083, code lost:
        
            if (r4.equals("left_center") == false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x008a, code lost:
        
            if (r4.equals("left_bottom") == false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0093, code lost:
        
            if (r4.equals("right_top") == false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
        
            if (r4.equals("left_top") != false) goto L34;
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00b8. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x003c. Please report as an issue. */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void a(nov novVar, WebTransform webTransform, float f, float f2) {
            float originalWidth;
            float originalHeight;
            String str = webTransform.f;
            novVar.w0(f, f2);
            Float f3 = webTransform.e;
            novVar.a(f3 != null ? (f3.floatValue() * f) / novVar.getOriginalWidth() : 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            switch (str.hashCode()) {
                case -1568783182:
                    break;
                case -1514196637:
                    break;
                case -1494981747:
                    break;
                case -1364013995:
                    break;
                case 26292565:
                    break;
                case 1162316395:
                    break;
                case 1699249582:
                    break;
                case 1718464472:
                    break;
                case 1718760733:
                    break;
                default:
                    b7l.a("You pass incorrect transform gravity: ".concat(str));
                    originalWidth = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    break;
            }
            float f4 = (webTransform.c * f) + originalWidth;
            switch (str.hashCode()) {
                case -1568783182:
                    break;
                case -1514196637:
                    break;
                case -1494981747:
                    break;
                case -1364013995:
                    break;
                case 26292565:
                    break;
                case 1162316395:
                    break;
                case 1699249582:
                    break;
                case 1718464472:
                    break;
                case 1718760733:
                    break;
                default:
                    b7l.a("You pass incorrect transform gravity: ".concat(str));
                    originalHeight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    break;
            }
            novVar.e(f4, (f2 * webTransform.d) + originalHeight);
            novVar.y0(-webTransform.b, novVar.getCenterX(), novVar.getCenterY(), true);
        }
    }

    /* compiled from: StoryBoxConverter.kt */
    public static final class b implements izs {
        public final /* synthetic */ CanvasStickerDraft.NativeCanvasStickerDraft b;

        public b(CanvasStickerDraft.NativeCanvasStickerDraft nativeCanvasStickerDraft) {
            this.b = nativeCanvasStickerDraft;
        }

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            ((nov) obj).getCommons().p(this.b.c);
            return s3q0.a;
        }
    }

    public szl0(float f, float f2, s5m0 s5m0Var, com.vk.stickers.api.styles.b bVar) {
        this.a = f;
        this.b = f2;
        this.c = s5m0Var;
        this.d = bVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0339, code lost:
    
        if (r14.equals("KnickerbockersGrotesk") == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03e2, code lost:
    
        if (r5.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT) == false) goto L183;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0407 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x046b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.reactivex.rxjava3.internal.operators.observable.b0 a(WebSticker webSticker, boolean z, boolean z2) {
        io.reactivex.rxjava3.core.q w;
        Integer num;
        int intValue;
        String str;
        hmo0.c cVar;
        String str2;
        Float f;
        Float f2;
        Layout.Alignment alignment;
        imo0 imo0Var;
        ix5 ix5Var;
        int length;
        ix5 ix5Var2;
        hmo0.c bVar;
        Object obj;
        m0g0 m0g0Var;
        Date date;
        List list;
        Object obj2;
        x6m0 x6m0Var;
        int i = 16;
        int i2 = 4;
        int i3 = 0;
        int i4 = 2;
        if (webSticker instanceof WebRenderableSticker) {
            WebRenderableSticker webRenderableSticker = (WebRenderableSticker) webSticker;
            String str3 = webRenderableSticker.d;
            String str4 = webRenderableSticker.e;
            if (epx.f(str3, "image")) {
                w = mcr0.h(brm0.B(str4, "http", false) ? Uri.parse(str4) : Uri.parse("file://".concat(str4))).U(new uq80(new pzl0(webRenderableSticker, this, z, z2), i4));
            } else if (epx.f(str3, "gif")) {
                Uri parse = brm0.B(str4, "http", false) ? Uri.parse(str4) : Uri.parse("file://".concat(str4));
                Field field = mcr0.a;
                w = new io.reactivex.rxjava3.internal.operators.observable.q(new qcr0(parse)).U(new j630(new mu0(webRenderableSticker, z, i2), 16));
            } else {
                b7l.a("Create video sticker not implementation yet");
                w = null;
            }
        } else {
            if (webSticker instanceof WebNativeSticker) {
                WebNativeSticker webNativeSticker = (WebNativeSticker) webSticker;
                StickerAction stickerAction = webNativeSticker.e;
                if (stickerAction instanceof ActionPoll) {
                    Poll poll = ((ActionPoll) stickerAction).b;
                    if (poll != null) {
                        float f3 = r8m0.Z;
                        w = io.reactivex.rxjava3.core.q.T(new r8m0(new q8m0(poll, false, new s8m0(true, null)), true));
                    }
                } else {
                    boolean z3 = stickerAction instanceof WebActionHashtag;
                    com.vk.stickers.api.styles.b bVar2 = this.d;
                    if (z3) {
                        WebActionHashtag webActionHashtag = (WebActionHashtag) stickerAction;
                        StickerCommonStyle.a aVar = StickerCommonStyle.Companion;
                        String str5 = webActionHashtag.c;
                        aVar.getClass();
                        com.vk.stickers.api.styles.a a2 = b.C1791b.a(bVar2, StickerCommonStyle.a.a(str5, StickerCommonStyle.ACCENT_CONTENT), null, 2);
                        o0m0 o0m0Var = o0m0.b;
                        w = io.reactivex.rxjava3.core.q.T(o0m0.b(webActionHashtag.b, a2, bVar2, null));
                    } else if (stickerAction instanceof WebActionMention) {
                        WebActionMention webActionMention = (WebActionMention) stickerAction;
                        StickerCommonStyle.a aVar2 = StickerCommonStyle.Companion;
                        String str6 = webActionMention.c;
                        aVar2.getClass();
                        com.vk.stickers.api.styles.a b2 = b.C1791b.b(bVar2, StickerCommonStyle.a.a(str6, StickerCommonStyle.ACCENT_CONTENT), null, 2);
                        o0m0 o0m0Var2 = o0m0.b;
                        String str7 = webActionMention.b;
                        Serializer.c<ClickableMention> cVar2 = ClickableMention.CREATOR;
                        Pair c = ClickableMention.a.c(str7);
                        if (c == null) {
                            x6m0Var = null;
                        } else {
                            UserId userId = (UserId) c.d();
                            String str8 = (String) c.g();
                            String U = drm0.U(str8, "@");
                            if (U.length() > 23) {
                                U = erm0.D0(23, U).concat("…");
                            }
                            a420 a420Var = new a420(userId, str8);
                            if (b2 == null) {
                                b2 = b.C1791b.b(bVar2, null, null, 1);
                            }
                            x6m0Var = new x6m0(new v6m0(b2, null, a420Var, U), new qmj0(1));
                        }
                        if (x6m0Var != null) {
                            w = io.reactivex.rxjava3.core.q.T(x6m0Var);
                        }
                    } else if (stickerAction instanceof WebActionLink) {
                        WebActionLink webActionLink = (WebActionLink) stickerAction;
                        StickerCommonStyle.a aVar3 = StickerCommonStyle.Companion;
                        String str9 = webActionLink.e;
                        aVar3.getClass();
                        r5m0 b3 = this.c.b(webActionLink.b, webActionLink.d, bVar2.d(StickerCommonStyle.a.a(str9, StickerCommonStyle.ACCENT_CONTENT), null), this.d, null);
                        if (b3 != null) {
                            w = io.reactivex.rxjava3.core.q.T(new q5m0(b3));
                        }
                    } else if (stickerAction instanceof WebActionTime) {
                        WebActionTime webActionTime = (WebActionTime) stickerAction;
                        Long l = webActionTime.c;
                        String str10 = webActionTime.e;
                        if (l != null) {
                            m0g0Var = new m0g0(new Date(l.longValue()));
                        } else if (str10 != null) {
                            try {
                                date = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.ENGLISH).parse(str10);
                            } catch (Throwable th) {
                                L.g("Can't parse date from exif", th);
                                date = null;
                            }
                            if (date == null) {
                                date = Calendar.getInstance().getTime();
                            }
                            m0g0Var = new m0g0(date);
                        } else {
                            m0g0Var = new m0g0(new Date(System.currentTimeMillis()));
                        }
                        TimeStickerStyle.a aVar4 = TimeStickerStyle.Companion;
                        String str11 = webActionTime.b;
                        aVar4.getClass();
                        list = TimeStickerStyle.entries;
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (epx.f(((TimeStickerStyle) obj2).j(), str11)) {
                                break;
                            }
                        }
                        TimeStickerStyle timeStickerStyle = (TimeStickerStyle) obj2;
                        if (timeStickerStyle == null) {
                            timeStickerStyle = TimeStickerStyle.STYLE_TIME_STICKER_BLACK;
                        }
                        w = io.reactivex.rxjava3.core.q.T(new yjm0(new nvo0(false, m0g0Var, timeStickerStyle, webActionTime.d)));
                    } else if (stickerAction instanceof WebActionPlace) {
                        WebActionPlace webActionPlace = (WebActionPlace) stickerAction;
                        StickerCommonStyle.a aVar5 = StickerCommonStyle.Companion;
                        String str12 = webActionPlace.e;
                        aVar5.getClass();
                        com.vk.stickers.api.styles.a b4 = bVar2.b(StickerCommonStyle.a.a(str12, StickerCommonStyle.ACCENT_CONTENT), null);
                        String str13 = webActionPlace.c;
                        String str14 = webActionPlace.f;
                        if (str14 == null) {
                            str14 = "";
                        }
                        String str15 = str14;
                        int i5 = webActionPlace.b;
                        Integer num2 = webActionPlace.d;
                        if (str13.length() > 27) {
                            str13 = erm0.D0(27, str13).concat("…");
                        }
                        w = io.reactivex.rxjava3.core.q.T(new z3m0(new d4m0(str13, str15, b4, i5, num2)));
                    } else if (stickerAction instanceof WebActionQuestion) {
                        WebActionQuestion webActionQuestion = (WebActionQuestion) stickerAction;
                        StoryQuestionInfo.Style.a aVar6 = StoryQuestionInfo.Style.Companion;
                        String str16 = webActionQuestion.d;
                        aVar6.getClass();
                        Iterator<E> it2 = StoryQuestionInfo.Style.h().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            if (epx.f(((StoryQuestionInfo.Style) obj).i(), str16)) {
                                break;
                            }
                        }
                        StoryQuestionInfo.Style style = (StoryQuestionInfo.Style) obj;
                        if (style == null) {
                            vpe0.d.a.getClass();
                            style = vpe0.d.c;
                        }
                        StoryQuestionInfo.Style style2 = style;
                        w = io.reactivex.rxjava3.core.q.T(new sam0(new StoryQuestionInfo(webActionQuestion.b, webActionQuestion.c, 0, vpe0.b.a(style2, null).b(), style2)));
                    } else {
                        int i6 = 6;
                        if (stickerAction instanceof WebActionText) {
                            WebActionText webActionText = (WebActionText) stickerAction;
                            float f4 = xlo0.p;
                            float f5 = this.a;
                            float f6 = f5 - f4;
                            if (f6 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                f5 = f6;
                            }
                            int i7 = (int) f5;
                            String str17 = webActionText.f;
                            if (str17 != null) {
                                try {
                                    num = Integer.valueOf(Color.parseColor(str17));
                                } catch (Throwable unused) {
                                    num = null;
                                }
                                if (num != null) {
                                    intValue = num.intValue();
                                    str = webActionText.c;
                                    cVar = hmo0.d;
                                    if (str != null) {
                                        switch (str.hashCode()) {
                                            case -1849621137:
                                                if (str.equals("BarrelsRegular")) {
                                                    i2 = 0;
                                                    break;
                                                }
                                                i2 = -1;
                                                break;
                                            case -1595303039:
                                                if (str.equals("RoundsNeueMedium")) {
                                                    i2 = 1;
                                                    break;
                                                }
                                                i2 = -1;
                                                break;
                                            case -1582008519:
                                                if (str.equals("BarrelsLightItalic")) {
                                                    i2 = 2;
                                                    break;
                                                }
                                                i2 = -1;
                                                break;
                                            case -966811514:
                                                if (str.equals("FirsDemiBold")) {
                                                    i2 = 3;
                                                    break;
                                                }
                                                i2 = -1;
                                                break;
                                            case -298289545:
                                                break;
                                            case -195052376:
                                                if (str.equals("LoveliesScript")) {
                                                    i2 = 5;
                                                    break;
                                                }
                                                i2 = -1;
                                                break;
                                            case 861651339:
                                                if (str.equals("KnickerbockersTrialScript")) {
                                                    i2 = 6;
                                                    break;
                                                }
                                                i2 = -1;
                                                break;
                                            case 958142205:
                                                if (str.equals("CommonsBoldItalic")) {
                                                    i2 = 7;
                                                    break;
                                                }
                                                i2 = -1;
                                                break;
                                            case 1412564877:
                                                if (str.equals("PhobosRegular")) {
                                                    i2 = 8;
                                                    break;
                                                }
                                                i2 = -1;
                                                break;
                                            case 1676947805:
                                                if (str.equals("CommonsMedium")) {
                                                    i2 = 9;
                                                    break;
                                                }
                                                i2 = -1;
                                                break;
                                            default:
                                                i2 = -1;
                                                break;
                                        }
                                        switch (i2) {
                                            case 0:
                                                bVar = new hmo0.b();
                                                break;
                                            case 1:
                                                bVar = new hmo0.l();
                                                break;
                                            case 2:
                                                bVar = new hmo0.a();
                                                break;
                                            case 3:
                                                bVar = new hmo0.f();
                                                break;
                                            case 4:
                                                bVar = new hmo0.h();
                                                break;
                                            case 5:
                                                bVar = new hmo0.j();
                                                break;
                                            case 6:
                                                bVar = new hmo0.i();
                                                break;
                                            case 7:
                                                bVar = new hmo0.d();
                                                break;
                                            case 8:
                                                bVar = new hmo0.k();
                                                break;
                                            case 9:
                                                bVar = new hmo0.e();
                                                break;
                                            default:
                                                bVar = null;
                                                break;
                                        }
                                        if (bVar != null) {
                                            cVar = bVar;
                                        }
                                    }
                                    str2 = webActionText.e;
                                    if (str2 == null) {
                                        str2 = TtmlNode.CENTER;
                                    }
                                    f = webActionText.h;
                                    if (f != null) {
                                        if (f.floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            f = null;
                                        }
                                        if (f != null) {
                                            f2 = Float.valueOf(cn70.e() * f.floatValue());
                                            switch (str2.hashCode()) {
                                                case -1364013995:
                                                    if (str2.equals(TtmlNode.CENTER)) {
                                                        i4 = 0;
                                                        break;
                                                    }
                                                    i4 = -1;
                                                    break;
                                                case 3317767:
                                                    if (str2.equals(TtmlNode.LEFT)) {
                                                        i4 = 1;
                                                        break;
                                                    }
                                                    i4 = -1;
                                                    break;
                                                case 108511772:
                                                    break;
                                                default:
                                                    i4 = -1;
                                                    break;
                                            }
                                            switch (i4) {
                                                case 0:
                                                    alignment = Layout.Alignment.ALIGN_CENTER;
                                                    break;
                                                case 1:
                                                    alignment = Layout.Alignment.ALIGN_NORMAL;
                                                    break;
                                                case 2:
                                                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                    break;
                                                default:
                                                    alignment = null;
                                                    break;
                                            }
                                            if (cVar != null || alignment == null) {
                                                imo0Var = null;
                                            } else {
                                                imo0Var = new imo0(f2 == null ? (cVar.a() + cVar.d()) / 3.0f : f2.floatValue(), intValue, alignment);
                                                cVar.b(imo0Var);
                                            }
                                            if (imo0Var != null) {
                                                String str18 = webActionText.d;
                                                if (str18 != null) {
                                                    if (str18.equals("none")) {
                                                        ix5Var = new dco0();
                                                    } else if (str18.equals("solid")) {
                                                        ix5Var = new cco0();
                                                    }
                                                    if (ix5Var == null) {
                                                        ix5Var = new dco0();
                                                    }
                                                    imo0Var.f = intValue;
                                                    ix5[] ix5VarArr = cVar.a;
                                                    length = ix5VarArr.length;
                                                    while (true) {
                                                        if (i3 >= length) {
                                                            ix5Var2 = ix5VarArr[i3];
                                                            if (ix5Var2.getId() != ix5Var.getId()) {
                                                                i3++;
                                                            }
                                                        } else {
                                                            ix5Var2 = null;
                                                        }
                                                    }
                                                    if (ix5Var2 != null) {
                                                        ix5Var.b(imo0Var);
                                                    }
                                                    cVar.d = imo0Var.b(cVar);
                                                    cVar.b(imo0Var);
                                                    w = io.reactivex.rxjava3.core.q.T(new xlo0(i7, nik0.b(nik0.b(webActionText.b, new Regex(ClickableMention.k), new k990(20)), new Regex(Pattern.compile("#([a-zA-Zа-яА-ЯёЁ0-9_])+")), new ha40(15)), imo0Var));
                                                }
                                                ix5Var = null;
                                                if (ix5Var == null) {
                                                }
                                                imo0Var.f = intValue;
                                                ix5[] ix5VarArr2 = cVar.a;
                                                length = ix5VarArr2.length;
                                                while (true) {
                                                    if (i3 >= length) {
                                                    }
                                                    i3++;
                                                }
                                                if (ix5Var2 != null) {
                                                }
                                                cVar.d = imo0Var.b(cVar);
                                                cVar.b(imo0Var);
                                                w = io.reactivex.rxjava3.core.q.T(new xlo0(i7, nik0.b(nik0.b(webActionText.b, new Regex(ClickableMention.k), new k990(20)), new Regex(Pattern.compile("#([a-zA-Zа-яА-ЯёЁ0-9_])+")), new ha40(15)), imo0Var));
                                            }
                                        }
                                    }
                                    f2 = webActionText.g;
                                    switch (str2.hashCode()) {
                                        case -1364013995:
                                            break;
                                        case 3317767:
                                            break;
                                        case 108511772:
                                            break;
                                    }
                                    switch (i4) {
                                    }
                                    if (cVar != null) {
                                    }
                                    imo0Var = null;
                                    if (imo0Var != null) {
                                    }
                                }
                            }
                            intValue = e43.a.getColor(R.color.vk_black);
                            str = webActionText.c;
                            cVar = hmo0.d;
                            if (str != null) {
                            }
                            str2 = webActionText.e;
                            if (str2 == null) {
                            }
                            f = webActionText.h;
                            if (f != null) {
                            }
                            f2 = webActionText.g;
                            switch (str2.hashCode()) {
                                case -1364013995:
                                    break;
                                case 3317767:
                                    break;
                                case 108511772:
                                    break;
                            }
                            switch (i4) {
                            }
                            if (cVar != null) {
                            }
                            imo0Var = null;
                            if (imo0Var != null) {
                            }
                        } else if (stickerAction instanceof WebActionEmoji) {
                            Serializer.c<WebActionEmoji> cVar3 = WebActionEmoji.CREATOR;
                            String a3 = WebActionEmoji.a.a(((WebActionEmoji) stickerAction).b);
                            if (a3 != null) {
                                w = mcr0.h(Uri.parse("asset:///emoji/" + a3 + ".png")).U(new ga40(new mz80(14, this, a3), 10));
                            }
                        } else {
                            int i8 = 11;
                            if (stickerAction instanceof WebActionSticker) {
                                final WebActionSticker webActionSticker = (WebActionSticker) stickerAction;
                                w = new io.reactivex.rxjava3.internal.operators.observable.t(new io.reactivex.rxjava3.functions.n() { // from class: com.vk.storycamera.a
                                    @Override // io.reactivex.rxjava3.functions.n
                                    public final Object get() {
                                        t6g0 t6g0Var = t6g0.b;
                                        kcl0 d = t6g0.d();
                                        WebActionSticker webActionSticker2 = WebActionSticker.this;
                                        StickerItem E0 = d.E0(webActionSticker2.b, webActionSticker2.c);
                                        return E0 != null ? q.T(E0) : rsg0.T(yfb.x(new zq70().H(null, Collections.singletonList(Integer.valueOf(webActionSticker2.b))))).U(new bx80(new qzl0(webActionSticker2, 0), 8));
                                    }
                                }).L(new xx40(new cq3(28, webActionSticker, this), 11), false);
                            } else if (stickerAction instanceof WebActionMarketItem) {
                                WebActionMarketItem webActionMarketItem = (WebActionMarketItem) stickerAction;
                                a6m0 a6m0Var = new a6m0(webActionMarketItem.b, webActionMarketItem.c, webActionMarketItem.d, webActionMarketItem.e, null, null, null);
                                Context context = e43.a;
                                if (context == null) {
                                    context = null;
                                }
                                w = io.reactivex.rxjava3.core.q.T(new b6m0(context, a6m0Var));
                            } else if (stickerAction instanceof WebActionSituationalTemplate) {
                                WebActionSituationalTemplate webActionSituationalTemplate = (WebActionSituationalTemplate) stickerAction;
                                w = io.reactivex.rxjava3.core.q.T(new pjm0(webActionSituationalTemplate.b, webActionSituationalTemplate.c, 12));
                            } else if (stickerAction instanceof WebActionAudioTrack) {
                                WebActionAudioTrack webActionAudioTrack = (WebActionAudioTrack) stickerAction;
                                w = new io.reactivex.rxjava3.internal.operators.single.r(rsg0.W(yfb.x(hx4.o(new ix4(), Collections.singletonList(webActionAudioTrack.b), null, 6)), 7), new did0(new ow60(i), i6)).l(new fe60(new bws(19), 12)).l(new qu50(new rzl0(webActionAudioTrack, i3), i8)).w();
                            } else {
                                b7l.a("Not supported native type " + webNativeSticker);
                            }
                        }
                    }
                }
            }
            w = null;
        }
        if (w == null) {
            return null;
        }
        ca10 ca10Var = new ca10(new tzl0(webSticker, z, this), 24);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return w.E(ca10Var, lVar, kVar, kVar);
    }

    public final io.reactivex.rxjava3.core.q<? extends List<nov>> b(WebStoryBox webStoryBox) {
        boolean Db = webStoryBox.Db();
        WebServiceInfo webServiceInfo = webStoryBox.i;
        String str = webServiceInfo != null ? webServiceInfo.j : null;
        boolean z = !(str == null || drm0.N(str));
        List<WebSticker> list = webStoryBox.h;
        if (list == null) {
            return io.reactivex.rxjava3.core.q.T(EmptyList.b);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            io.reactivex.rxjava3.internal.operators.observable.b0 a2 = a((WebSticker) it.next(), Db, z);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return kwg0.a(arrayList);
    }

    public final io.reactivex.rxjava3.core.q<? extends List<nov>> c(List<CanvasStickerDraft.NativeCanvasStickerDraft> list) {
        io.reactivex.rxjava3.internal.operators.observable.b0 b0Var;
        ArrayList arrayList = new ArrayList();
        for (CanvasStickerDraft.NativeCanvasStickerDraft nativeCanvasStickerDraft : list) {
            io.reactivex.rxjava3.internal.operators.observable.b0 a2 = a(nativeCanvasStickerDraft.e, false, false);
            if (a2 != null) {
                eeh0 eeh0Var = new eeh0(new b(nativeCanvasStickerDraft), 3);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                b0Var = a2.E(eeh0Var, lVar, kVar, kVar);
            } else {
                b0Var = null;
            }
            if (b0Var != null) {
                arrayList.add(b0Var);
            }
        }
        return kwg0.a(arrayList);
    }
}
