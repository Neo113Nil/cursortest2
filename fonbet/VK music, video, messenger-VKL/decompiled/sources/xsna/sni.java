package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.zznn;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.model.BookingRecord;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.lists.ListDataSet;
import com.vk.voip.api.id.CallId;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.PostInteract;
import com.vungle.ads.internal.protos.Sdk;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import kotlin.collections.EmptyList;
import kotlin.random.Random;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.webrtc.mediarecord.VideoRecord;

/* compiled from: VkDropdown.kt */
/* loaded from: classes17.dex */
public final class sni implements lbk0, kbf0, axp, q701, lzn, rdv {
    public static final jai c = new jai(310151998, new rni(0), false);
    public static final sni d = new sni(1);
    public static final sni e = new sni(3);
    public static final sni f = new sni(4);
    public static final sni g = new sni(5);
    public static final /* synthetic */ sni h = new sni(7);
    public static final /* synthetic */ sni i = new sni(8);
    public static boolean j;
    public final /* synthetic */ int b;

    public /* synthetic */ sni(int i2) {
        this.b = i2;
    }

    public static final long c(long j2, long j3) {
        if (j2 > j3) {
            return -1L;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j2 < j3) {
            j2 = j3;
        }
        if (j4 == 0 && j2 == 0) {
            return 0L;
        }
        if (j4 == 0 || j2 == 0) {
            return -1L;
        }
        return j2 - j4;
    }

    public static Map d(int i2, int i3) {
        if ((i3 & 1) != 0) {
            i2 = 32;
        }
        Map hashMap = i2 >= 1000 ? new HashMap(i2) : new zk3(i2);
        hashMap.putAll(jgp.b);
        return hashMap;
    }

    public static rxu e(rxu rxuVar, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = rxuVar.a;
        }
        if ((i2 & 2) != 0) {
            z2 = rxuVar.b;
        }
        return (z == rxuVar.a && z2 == rxuVar.b) ? rxuVar : new rxu(z, z2);
    }

    public static String f(byte[] bArr) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        if (p(bArr)) {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, C.UTF8_NAME));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            }
            bufferedReader.close();
            gZIPInputStream.close();
        } else {
            sb.append(bArr);
        }
        return sb.toString();
    }

    public static int g(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((dak) it.next()).c));
        }
        return ((Number) j5g.n0(arrayList)).intValue();
    }

    public static HashMap h() {
        HashMap hashMap = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        arrayList.add("BB");
        arrayList.add("BM");
        arrayList.add("BS");
        arrayList.add("CA");
        arrayList.add("DM");
        arrayList.add("DO");
        arrayList.add("GD");
        arrayList.add("GU");
        arrayList.add("JM");
        arrayList.add("KN");
        arrayList.add("KY");
        arrayList.add("LC");
        arrayList.add("MP");
        arrayList.add("MS");
        arrayList.add("PR");
        arrayList.add("SX");
        arrayList.add("TC");
        arrayList.add("TT");
        arrayList.add("VC");
        arrayList.add("VG");
        arrayList.add("VI");
        hashMap.put(1, arrayList);
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add("RU");
        arrayList2.add("KZ");
        ArrayList d2 = wq.d(36, hashMap, wq.d(34, hashMap, wq.d(33, hashMap, wq.d(32, hashMap, wq.d(31, hashMap, wq.d(30, hashMap, wq.d(27, hashMap, wq.d(20, hashMap, wq.d(7, hashMap, arrayList2, 1, "EG"), 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"), 2, "IT");
        d2.add("VA");
        hashMap.put(39, d2);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add("RO");
        ArrayList d3 = wq.d(43, hashMap, wq.d(41, hashMap, wq.d(40, hashMap, arrayList3, 1, "CH"), 1, "AT"), 4, "GB");
        d3.add("GG");
        d3.add("IM");
        d3.add("JE");
        hashMap.put(44, d3);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add("DK");
        ArrayList d4 = wq.d(46, hashMap, wq.d(45, hashMap, arrayList4, 1, "SE"), 2, "NO");
        d4.add("SJ");
        hashMap.put(47, d4);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("PL");
        ArrayList d5 = wq.d(60, hashMap, wq.d(58, hashMap, wq.d(57, hashMap, wq.d(56, hashMap, wq.d(55, hashMap, wq.d(54, hashMap, wq.d(53, hashMap, wq.d(52, hashMap, wq.d(51, hashMap, wq.d(49, hashMap, wq.d(48, hashMap, arrayList5, 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"), 3, "AU");
        d5.add("CC");
        d5.add("CX");
        hashMap.put(61, d5);
        ArrayList arrayList6 = new ArrayList(1);
        arrayList6.add("ID");
        ArrayList d6 = wq.d(211, hashMap, wq.d(98, hashMap, wq.d(95, hashMap, wq.d(94, hashMap, wq.d(93, hashMap, wq.d(92, hashMap, wq.d(91, hashMap, wq.d(90, hashMap, wq.d(86, hashMap, wq.d(84, hashMap, wq.d(82, hashMap, wq.d(81, hashMap, wq.d(66, hashMap, wq.d(65, hashMap, wq.d(64, hashMap, wq.d(63, hashMap, wq.d(62, hashMap, arrayList6, 1, "PH"), 1, "NZ"), 1, "SG"), 1, "TH"), 1, "JP"), 1, "KR"), 1, "VN"), 1, "CN"), 1, "TR"), 1, "IN"), 1, "PK"), 1, "AF"), 1, "LK"), 1, "MM"), 1, "IR"), 1, "SS"), 2, "MA");
        d6.add("EH");
        hashMap.put(Integer.valueOf(Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE), d6);
        ArrayList arrayList7 = new ArrayList(1);
        arrayList7.add("DZ");
        ArrayList d7 = wq.d(261, hashMap, wq.d(260, hashMap, wq.d(258, hashMap, wq.d(257, hashMap, wq.d(256, hashMap, wq.d(255, hashMap, wq.d(254, hashMap, wq.d(253, hashMap, wq.d(252, hashMap, wq.d(251, hashMap, wq.d(250, hashMap, wq.d(249, hashMap, wq.d(248, hashMap, wq.d(247, hashMap, wq.d(246, hashMap, wq.d(245, hashMap, wq.d(244, hashMap, wq.d(243, hashMap, wq.d(242, hashMap, wq.d(241, hashMap, wq.d(PsExtractor.VIDEO_STREAM_MASK, hashMap, wq.d(239, hashMap, wq.d(238, hashMap, wq.d(237, hashMap, wq.d(236, hashMap, wq.d(235, hashMap, wq.d(234, hashMap, wq.d(233, hashMap, wq.d(232, hashMap, wq.d(231, hashMap, wq.d(230, hashMap, wq.d(229, hashMap, wq.d(228, hashMap, wq.d(Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, hashMap, wq.d(Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, hashMap, wq.d(Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, hashMap, wq.d(224, hashMap, wq.d(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, hashMap, wq.d(Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, hashMap, wq.d(Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, hashMap, wq.d(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, hashMap, wq.d(Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, hashMap, wq.d(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, hashMap, wq.d(Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, hashMap, arrayList7, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"), 2, "RE");
        d7.add("YT");
        hashMap.put(262, d7);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("ZW");
        ArrayList d8 = wq.d(269, hashMap, wq.d(268, hashMap, wq.d(267, hashMap, wq.d(266, hashMap, wq.d(265, hashMap, wq.d(264, hashMap, wq.d(263, hashMap, arrayList8, 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"), 2, "SH");
        d8.add("TA");
        hashMap.put(290, d8);
        ArrayList arrayList9 = new ArrayList(1);
        arrayList9.add("ER");
        ArrayList d9 = wq.d(357, hashMap, wq.d(356, hashMap, wq.d(355, hashMap, wq.d(354, hashMap, wq.d(353, hashMap, wq.d(352, hashMap, wq.d(351, hashMap, wq.d(350, hashMap, wq.d(299, hashMap, wq.d(298, hashMap, wq.d(297, hashMap, wq.d(291, hashMap, arrayList9, 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, IronSourceConstants.INTERSTITIAL_EVENT_TYPE), 1, "AL"), 1, "MT"), 1, "CY"), 2, "FI");
        d9.add("AX");
        hashMap.put(358, d9);
        ArrayList arrayList10 = new ArrayList(1);
        arrayList10.add("BG");
        ArrayList d10 = wq.d(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, hashMap, wq.d(IronSourceError.ERROR_CODE_INIT_FAILED, hashMap, wq.d(507, hashMap, wq.d(IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, hashMap, wq.d(505, hashMap, wq.d(ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED, hashMap, wq.d(503, hashMap, wq.d(502, hashMap, wq.d(501, hashMap, wq.d(500, hashMap, wq.d(423, hashMap, wq.d(421, hashMap, wq.d(420, hashMap, wq.d(389, hashMap, wq.d(387, hashMap, wq.d(386, hashMap, wq.d(385, hashMap, wq.d(383, hashMap, wq.d(382, hashMap, wq.d(381, hashMap, wq.d(380, hashMap, wq.d(378, hashMap, wq.d(377, hashMap, wq.d(376, hashMap, wq.d(375, hashMap, wq.d(374, hashMap, wq.d(373, hashMap, wq.d(372, hashMap, wq.d(371, hashMap, wq.d(370, hashMap, wq.d(359, hashMap, arrayList10, 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"), 3, "GP");
        d10.add("BL");
        d10.add("MF");
        hashMap.put(590, d10);
        ArrayList arrayList11 = new ArrayList(1);
        arrayList11.add("BO");
        ArrayList d11 = wq.d(598, hashMap, wq.d(597, hashMap, wq.d(596, hashMap, wq.d(595, hashMap, wq.d(594, hashMap, wq.d(593, hashMap, wq.d(592, hashMap, wq.d(591, hashMap, arrayList11, 1, "GY"), 1, "EC"), 1, "GF"), 1, "PY"), 1, "MQ"), 1, "SR"), 1, "UY"), 2, "CW");
        d11.add("BQ");
        hashMap.put(Integer.valueOf(CommonGatewayClient.CODE_599), d11);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add("TL");
        hashMap.put(998, wq.d(996, hashMap, wq.d(995, hashMap, wq.d(994, hashMap, wq.d(993, hashMap, wq.d(992, hashMap, wq.d(979, hashMap, wq.d(977, hashMap, wq.d(976, hashMap, wq.d(975, hashMap, wq.d(974, hashMap, wq.d(973, hashMap, wq.d(972, hashMap, wq.d(971, hashMap, wq.d(970, hashMap, wq.d(968, hashMap, wq.d(967, hashMap, wq.d(966, hashMap, wq.d(965, hashMap, wq.d(964, hashMap, wq.d(963, hashMap, wq.d(962, hashMap, wq.d(961, hashMap, wq.d(VideoRecord.DEFAULT_MAX_DIMENSION, hashMap, wq.d(888, hashMap, wq.d(886, hashMap, wq.d(883, hashMap, wq.d(882, hashMap, wq.d(881, hashMap, wq.d(880, hashMap, wq.d(878, hashMap, wq.d(870, hashMap, wq.d(856, hashMap, wq.d(855, hashMap, wq.d(853, hashMap, wq.d(852, hashMap, wq.d(850, hashMap, wq.d(808, hashMap, wq.d(800, hashMap, wq.d(692, hashMap, wq.d(691, hashMap, wq.d(690, hashMap, wq.d(689, hashMap, wq.d(688, hashMap, wq.d(687, hashMap, wq.d(686, hashMap, wq.d(685, hashMap, wq.d(683, hashMap, wq.d(682, hashMap, wq.d(681, hashMap, wq.d(680, hashMap, wq.d(679, hashMap, wq.d(678, hashMap, wq.d(677, hashMap, wq.d(676, hashMap, wq.d(675, hashMap, wq.d(674, hashMap, wq.d(673, hashMap, wq.d(672, hashMap, wq.d(670, hashMap, arrayList12, 1, "NF"), 1, "BN"), 1, "NR"), 1, "PG"), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, ExpandedProductParsedResult.POUND), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, ExpandedProductParsedResult.KILOGRAM), 1, "UZ"));
        return hashMap;
    }

    public static File j(Context context) {
        return context.getNoBackupFilesDir();
    }

    public static final float k(Context context) {
        HashSet hashSet = iah0.a;
        return Math.min(iah0.a(320), r2 - iah0.a(40)) / context.getResources().getDisplayMetrics().widthPixels;
    }

    public static final UserId l(NewsEntry newsEntry) {
        UserId I0;
        UserId userId;
        if (newsEntry instanceof Post) {
            return ((Post) newsEntry).m;
        }
        if (newsEntry instanceof Videos) {
            Owner owner = ((Videos) newsEntry).m;
            return (owner == null || (userId = owner.b) == null) ? UserId.d : userId;
        }
        if (!(newsEntry instanceof ShitAttachment)) {
            return UserId.d;
        }
        VideoAttachment videoAttachment = ((ShitAttachment) newsEntry).I;
        return (videoAttachment == null || (I0 = videoAttachment.k.I0()) == null) ? UserId.d : I0;
    }

    public static final Owner m(NewsEntry newsEntry) {
        Owner s;
        if (newsEntry instanceof Post) {
            Owner owner = ((Post) newsEntry).Q;
            return owner == null ? new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null) : owner;
        }
        if (newsEntry instanceof Videos) {
            Owner owner2 = ((Videos) newsEntry).m;
            return owner2 == null ? new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null) : owner2;
        }
        if (!(newsEntry instanceof ShitAttachment)) {
            return new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
        }
        ShitAttachment shitAttachment = (ShitAttachment) newsEntry;
        VideoAttachment videoAttachment = shitAttachment.I;
        if (videoAttachment != null && (s = videoAttachment.s()) != null) {
            if (!shitAttachment.Gb()) {
                s = null;
            }
            if (s != null) {
                return s;
            }
        }
        return new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
    }

    public static final CallId n(CallId callId, gzs gzsVar) {
        return (callId == null || callId.c) ? (CallId) gzsVar.invoke() : callId;
    }

    public static Map o(int i2, int i3) {
        if ((i3 & 1) != 0) {
            i2 = 32;
        }
        Map hashMap = i2 >= 1000 ? new HashMap(i2) : new zk3(i2);
        hashMap.putAll(jgp.b);
        return hashMap;
    }

    public static boolean p(byte[] bArr) {
        return bArr[0] == 31 && bArr[1] == -117;
    }

    public static final boolean q(NewsEntry newsEntry) {
        return newsEntry instanceof Post ? !((Post) newsEntry).J : newsEntry instanceof Videos ? !((Videos) newsEntry).x : (newsEntry instanceof ShitAttachment) && !((ShitAttachment) newsEntry).g0;
    }

    public static w9k r(w9k w9kVar, List list, String str) {
        String obj = drm0.p0(str).toString();
        List list2 = list;
        if (list2 == null || list2.isEmpty() || obj.length() == 0) {
            return null;
        }
        if (w9kVar != null && new k9x(w9kVar.b, w9kVar.c, 1).e(obj.length())) {
            return w9kVar;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dak dakVar = (dak) it.next();
            int i2 = dakVar.b;
            List<String> list3 = dakVar.d;
            int i3 = dakVar.c;
            if (new k9x(i2, i3, 1).e(obj.length())) {
                return new w9k(dakVar.a, dakVar.b, i3, list3.get(swe0.n(new k9x(0, list3.size() - 1, 1), Random.b)));
            }
        }
        return null;
    }

    public static final BookingServiceType s(BookingRecord bookingRecord) {
        if (bookingRecord != null) {
            BookingServiceType bookingServiceType = bookingRecord.o > 0 ? BookingServiceType.GROUP : BookingServiceType.INDIVIDUAL;
            if (bookingServiceType != null) {
                return bookingServiceType;
            }
        }
        return BookingServiceType.INDIVIDUAL;
    }

    public static jq6 t(VideoAttachment videoAttachment) {
        float width = videoAttachment.k.getWidth();
        float height = videoAttachment.k.getHeight();
        VideoFile videoFile = videoAttachment.k;
        int duration = videoFile.getDuration();
        String title = videoAttachment.k.getTitle();
        String str = videoAttachment.l;
        String r = videoAttachment.k.r();
        boolean Z9 = videoAttachment.k.Z9();
        boolean c2 = fxc0.B().c(videoAttachment.k);
        Image image = videoAttachment.k.getImage();
        PostInteract postInteract = videoAttachment.g;
        String str2 = postInteract != null ? postInteract.b : null;
        boolean z = videoAttachment.l != null;
        int duration2 = videoAttachment.k.getDuration() * 1000;
        Image image2 = videoAttachment.k.getImage();
        return new jq6(videoAttachment, videoFile, null, width, height, duration, title, str, r, Z9, c2, image, str2, z, duration2, image2.Db() ? image2.c : image2.b, true, null, null, null, null);
    }

    public static boolean v(ShitAttachment shitAttachment, izs izsVar) {
        PhotoAttachment photoAttachment = shitAttachment.H;
        if (photoAttachment == null) {
            return false;
        }
        Photo photo = photoAttachment.l;
        if (!((Boolean) izsVar.invoke(photoAttachment)).booleanValue()) {
            return false;
        }
        if (!photo.Hb()) {
            return true;
        }
        photo.L = null;
        return true;
    }

    public static boolean w(fsx0 fsx0Var, izs izsVar) {
        List<EntryAttachment> N7 = fsx0Var.N7();
        boolean z = false;
        z = false;
        if (N7 != null) {
            List<EntryAttachment> list = N7;
            if (list instanceof RandomAccess) {
                List<EntryAttachment> list2 = list;
                int size = list2.size();
                boolean z2 = false;
                for (int i2 = 0; i2 < size; i2++) {
                    Attachment attachment = list2.get(i2).b;
                    if ((attachment instanceof PhotoAttachment) && ((Boolean) izsVar.invoke(attachment)).booleanValue()) {
                        PhotoAttachment photoAttachment = (PhotoAttachment) attachment;
                        if (photoAttachment.l.Hb()) {
                            photoAttachment.l.L = null;
                        }
                        z2 = true;
                    }
                }
                return z2;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Attachment attachment2 = ((EntryAttachment) it.next()).b;
                if ((attachment2 instanceof PhotoAttachment) && ((Boolean) izsVar.invoke(attachment2)).booleanValue()) {
                    PhotoAttachment photoAttachment2 = (PhotoAttachment) attachment2;
                    if (photoAttachment2.l.Hb()) {
                        photoAttachment2.l.L = null;
                    }
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // xsna.lzn
    public CharSequence a(DonutVideoUiModel donutVideoUiModel, Context context) {
        return null;
    }

    @Override // xsna.rdv
    public void b(int i2, Rect rect) {
        int i3 = (int) ((i2 / 2.0f) + 0.5f);
        rect.right = i3;
        rect.left = i3;
    }

    public long i() {
        return System.currentTimeMillis();
    }

    public String toString() {
        switch (this.b) {
            case 3:
                return "NoDeclaredBrand";
            default:
                return super.toString();
        }
    }

    public io.reactivex.rxjava3.disposables.c u(final ArrayList arrayList, final ListDataSet listDataSet, final izs izsVar) {
        io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.r2q0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                List list = arrayList;
                List<Parcelable> list2 = list;
                boolean z = list2 instanceof List;
                izs izsVar2 = izsVar;
                if (z && (list2 instanceof RandomAccess)) {
                    List list3 = list2;
                    int size = list3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Parcelable parcelable = (NewsEntry) list3.get(i2);
                        if (parcelable instanceof Post) {
                            if (sni.w((fsx0) parcelable, izsVar2)) {
                                linkedHashSet.add(parcelable);
                            }
                            Post post = (Post) parcelable;
                            Post post2 = post.D;
                            if (post2 != null && sni.w(post2, izsVar2)) {
                                linkedHashSet.add(post.D);
                            }
                        } else if (parcelable instanceof PromoPost) {
                            PromoPost promoPost = (PromoPost) parcelable;
                            if (sni.w(promoPost.n, izsVar2)) {
                                linkedHashSet.add(promoPost.n);
                            }
                        } else if (parcelable instanceof ShitAttachment) {
                            if (sni.v((ShitAttachment) parcelable, izsVar2)) {
                                linkedHashSet.add(parcelable);
                            }
                        } else if (parcelable instanceof FaveEntry) {
                            if (sni.w((fsx0) parcelable, izsVar2)) {
                                Object obj = ((FaveEntry) parcelable).i.f;
                                NewsEntry newsEntry = obj instanceof NewsEntry ? (NewsEntry) obj : null;
                                if (newsEntry != null) {
                                    linkedHashSet.add(newsEntry);
                                }
                            }
                        } else if ((parcelable instanceof fsx0) && sni.w((fsx0) parcelable, izsVar2)) {
                            linkedHashSet.add(parcelable);
                        }
                    }
                } else {
                    for (Parcelable parcelable2 : list2) {
                        if (parcelable2 instanceof Post) {
                            if (sni.w((fsx0) parcelable2, izsVar2)) {
                                linkedHashSet.add(parcelable2);
                            }
                            Post post3 = (Post) parcelable2;
                            Post post4 = post3.D;
                            if (post4 != null && sni.w(post4, izsVar2)) {
                                linkedHashSet.add(post3.D);
                            }
                        } else if (parcelable2 instanceof PromoPost) {
                            PromoPost promoPost2 = (PromoPost) parcelable2;
                            if (sni.w(promoPost2.n, izsVar2)) {
                                linkedHashSet.add(promoPost2.n);
                            }
                        } else if (parcelable2 instanceof ShitAttachment) {
                            if (sni.v((ShitAttachment) parcelable2, izsVar2)) {
                                linkedHashSet.add(parcelable2);
                            }
                        } else if (parcelable2 instanceof FaveEntry) {
                            if (sni.w((fsx0) parcelable2, izsVar2)) {
                                Object obj2 = ((FaveEntry) parcelable2).i.f;
                                NewsEntry newsEntry2 = obj2 instanceof NewsEntry ? (NewsEntry) obj2 : null;
                                if (newsEntry2 != null) {
                                    linkedHashSet.add(newsEntry2);
                                }
                            }
                        } else if ((parcelable2 instanceof fsx0) && sni.w((fsx0) parcelable2, izsVar2)) {
                            linkedHashSet.add(parcelable2);
                        }
                    }
                }
                final SparseArray sparseArray = new SparseArray();
                if (linkedHashSet.isEmpty()) {
                    return sparseArray;
                }
                final boolean z2 = list.size() == 1;
                final sni sniVar = sni.this;
                listDataSet.u(new wzs(linkedHashSet, sniVar, sparseArray, z2) { // from class: xsna.s2q0
                    public final /* synthetic */ LinkedHashSet b;
                    public final /* synthetic */ SparseArray c;
                    public final /* synthetic */ boolean d;

                    {
                        this.c = sparseArray;
                        this.d = z2;
                    }

                    @Override // xsna.wzs
                    public final Object invoke(Object obj3, Object obj4) {
                        boolean z3;
                        Integer num = (Integer) obj3;
                        u1c0 u1c0Var = (u1c0) obj4;
                        NewsEntry newsEntry3 = u1c0Var.a;
                        LinkedHashSet linkedHashSet2 = this.b;
                        if (!linkedHashSet2.contains(newsEntry3)) {
                            return s3q0.a;
                        }
                        int i3 = u1c0Var.c;
                        SparseArray sparseArray2 = this.c;
                        if (i3 == 5 || i3 == 97 || i3 == 124 || i3 == 192) {
                            sparseArray2.put(num.intValue(), u1c0Var);
                            z3 = true;
                        } else {
                            boolean z4 = this.d;
                            if (i3 == 204 || i3 == 110) {
                                int intValue = num.intValue();
                                ol60 ol60Var = u1c0Var.h;
                                jcg0 jcg0Var = ol60Var instanceof jcg0 ? (jcg0) ol60Var : null;
                                if (jcg0Var != null) {
                                    u1c0 c2 = lbs.c(u1c0Var, null, null, 0, 7);
                                    icg0 icg0Var = new icg0();
                                    NewsEntry newsEntry4 = jcg0Var.h;
                                    NewsEntry newsEntry5 = jcg0Var.i;
                                    PhotoAttachment photoAttachment = jcg0Var.j;
                                    int i4 = u1c0Var.c;
                                    EmptyList emptyList = EmptyList.b;
                                    s1c0 s1c0Var = u1c0Var.n;
                                    Object a0 = j5g.a0(icg0Var.a(new vp10(newsEntry4, newsEntry5, photoAttachment, i4, 0, emptyList, s1c0Var != null ? s1c0Var.q : null)));
                                    jcg0 jcg0Var2 = a0 instanceof jcg0 ? (jcg0) a0 : null;
                                    c2.h = jcg0Var2 != null ? jcg0.i(jcg0Var2, null, jcg0Var.s, jcg0Var.t, 26623) : null;
                                    sparseArray2.put(intValue, c2);
                                } else {
                                    sparseArray2.put(intValue, u1c0Var);
                                }
                                z3 = !z4;
                            } else if (i3 != 111) {
                                z3 = false;
                            } else {
                                sparseArray2.put(num.intValue(), u1c0Var);
                                z3 = true ^ z4;
                            }
                        }
                        if (z3) {
                            linkedHashSet2.remove(u1c0Var.a);
                        }
                        return s3q0.a;
                    }
                });
                return sparseArray;
            }
        });
        asu0.a.getClass();
        return s0Var.r0(asu0.i()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new eeh0(new yka0(listDataSet, 16), 10), new xj50(new r8(com.vk.metrics.eventtracking.b.a, 11), 17));
    }

    @Override // xsna.q701
    public Object zza() {
        switch (this.b) {
            case 7:
                List list = s701.a;
                return Long.valueOf(zznn.zzn());
            default:
                List list2 = s701.a;
                return Boolean.valueOf(zzoi.zzd());
        }
    }
}
