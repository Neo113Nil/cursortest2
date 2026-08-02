package xsna;

import com.google.zxing.pdf417.PDF417Common;
import com.huawei.hms.api.ConnectionResult;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.dto.common.ImageSizeKey;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import ru.ok.android.webrtc.mediarecord.VideoRecord;

/* compiled from: HtmlEscapeSymbols.java */
/* loaded from: classes8.dex */
public final class nhv {
    public static final nhv e;
    public final short[] a = new short[12287];
    public final char[][] b;
    public final int[] c;
    public final int[][] d;

    /* compiled from: HtmlEscapeSymbols.java */
    public class a implements Comparator<char[]> {
        @Override // java.util.Comparator
        public final int compare(char[] cArr, char[] cArr2) {
            return new String(cArr).compareTo(new String(cArr2));
        }
    }

    /* compiled from: HtmlEscapeSymbols.java */
    public static final class b {
        public final char[] a;
        public final int[] b;

        public b(String str, int[] iArr) {
            this.a = str.toCharArray();
            this.b = iArr;
        }
    }

    /* compiled from: HtmlEscapeSymbols.java */
    public static final class c {
        public final ArrayList a = new ArrayList(200);

        public final void a(int i, int i2, String str) {
            this.a.add(new b(str, new int[]{i, i2}));
        }

        public final void b(int i, String str) {
            this.a.add(new b(str, new int[]{i}));
        }
    }

    static {
        c cVar = new c();
        cVar.b(34, "&quot;");
        cVar.b(38, "&amp;");
        cVar.b(60, "&lt;");
        cVar.b(62, "&gt;");
        cVar.b(160, "&nbsp;");
        cVar.b(161, "&iexcl;");
        cVar.b(162, "&cent;");
        cVar.b(163, "&pound;");
        cVar.b(164, "&curren;");
        cVar.b(165, "&yen;");
        cVar.b(166, "&brvbar;");
        cVar.b(167, "&sect;");
        cVar.b(168, "&uml;");
        cVar.b(169, "&copy;");
        cVar.b(170, "&ordf;");
        cVar.b(171, "&laquo;");
        cVar.b(172, "&not;");
        cVar.b(173, "&shy;");
        cVar.b(174, "&reg;");
        cVar.b(175, "&macr;");
        cVar.b(176, "&deg;");
        cVar.b(177, "&plusmn;");
        cVar.b(178, "&sup2;");
        cVar.b(179, "&sup3;");
        cVar.b(180, "&acute;");
        cVar.b(181, "&micro;");
        cVar.b(182, "&para;");
        cVar.b(183, "&middot;");
        cVar.b(184, "&cedil;");
        cVar.b(185, "&sup1;");
        cVar.b(186, "&ordm;");
        cVar.b(187, "&raquo;");
        cVar.b(188, "&frac14;");
        cVar.b(PsExtractor.PRIVATE_STREAM_1, "&frac12;");
        cVar.b(190, "&frac34;");
        cVar.b(191, "&iquest;");
        cVar.b(PsExtractor.AUDIO_STREAM, "&Agrave;");
        cVar.b(193, "&Aacute;");
        cVar.b(194, "&Acirc;");
        cVar.b(195, "&Atilde;");
        cVar.b(196, "&Auml;");
        cVar.b(197, "&Aring;");
        cVar.b(198, "&AElig;");
        cVar.b(199, "&Ccedil;");
        cVar.b(200, "&Egrave;");
        cVar.b(201, "&Eacute;");
        cVar.b(202, "&Ecirc;");
        cVar.b(203, "&Euml;");
        cVar.b(204, "&Igrave;");
        cVar.b(205, "&Iacute;");
        cVar.b(206, "&Icirc;");
        cVar.b(207, "&Iuml;");
        cVar.b(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, "&ETH;");
        cVar.b(Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, "&Ntilde;");
        cVar.b(Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, "&Ograve;");
        cVar.b(211, "&Oacute;");
        cVar.b(Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, "&Ocirc;");
        cVar.b(Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, "&Otilde;");
        cVar.b(Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, "&Ouml;");
        cVar.b(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, "&times;");
        cVar.b(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, "&Oslash;");
        cVar.b(Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, "&Ugrave;");
        cVar.b(Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, "&Uacute;");
        cVar.b(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, "&Ucirc;");
        cVar.b(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, "&Uuml;");
        cVar.b(Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, "&Yacute;");
        cVar.b(Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, "&THORN;");
        cVar.b(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, "&szlig;");
        cVar.b(224, "&agrave;");
        cVar.b(Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, "&aacute;");
        cVar.b(Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, "&acirc;");
        cVar.b(Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, "&atilde;");
        cVar.b(228, "&auml;");
        cVar.b(229, "&aring;");
        cVar.b(230, "&aelig;");
        cVar.b(231, "&ccedil;");
        cVar.b(232, "&egrave;");
        cVar.b(233, "&eacute;");
        cVar.b(234, "&ecirc;");
        cVar.b(235, "&euml;");
        cVar.b(236, "&igrave;");
        cVar.b(237, "&iacute;");
        cVar.b(238, "&icirc;");
        cVar.b(239, "&iuml;");
        cVar.b(PsExtractor.VIDEO_STREAM_MASK, "&eth;");
        cVar.b(241, "&ntilde;");
        cVar.b(242, "&ograve;");
        cVar.b(243, "&oacute;");
        cVar.b(244, "&ocirc;");
        cVar.b(245, "&otilde;");
        cVar.b(246, "&ouml;");
        cVar.b(247, "&divide;");
        cVar.b(248, "&oslash;");
        cVar.b(249, "&ugrave;");
        cVar.b(250, "&uacute;");
        cVar.b(251, "&ucirc;");
        cVar.b(252, "&uuml;");
        cVar.b(253, "&yacute;");
        cVar.b(254, "&thorn;");
        cVar.b(255, "&yuml;");
        cVar.b(402, "&fnof;");
        cVar.b(913, "&Alpha;");
        cVar.b(914, "&Beta;");
        cVar.b(915, "&Gamma;");
        cVar.b(916, "&Delta;");
        cVar.b(917, "&Epsilon;");
        cVar.b(918, "&Zeta;");
        cVar.b(919, "&Eta;");
        cVar.b(920, "&Theta;");
        cVar.b(921, "&Iota;");
        cVar.b(922, "&Kappa;");
        cVar.b(923, "&Lambda;");
        cVar.b(924, "&Mu;");
        cVar.b(925, "&Nu;");
        cVar.b(926, "&Xi;");
        cVar.b(927, "&Omicron;");
        cVar.b(PDF417Common.MAX_CODEWORDS_IN_BARCODE, "&Pi;");
        cVar.b(PDF417Common.NUMBER_OF_CODEWORDS, "&Rho;");
        cVar.b(931, "&Sigma;");
        cVar.b(932, "&Tau;");
        cVar.b(933, "&Upsilon;");
        cVar.b(934, "&Phi;");
        cVar.b(935, "&Chi;");
        cVar.b(936, "&Psi;");
        cVar.b(937, "&Omega;");
        cVar.b(945, "&alpha;");
        cVar.b(946, "&beta;");
        cVar.b(947, "&gamma;");
        cVar.b(948, "&delta;");
        cVar.b(949, "&epsilon;");
        cVar.b(950, "&zeta;");
        cVar.b(951, "&eta;");
        cVar.b(952, "&theta;");
        cVar.b(953, "&iota;");
        cVar.b(954, "&kappa;");
        cVar.b(955, "&lambda;");
        cVar.b(956, "&mu;");
        cVar.b(957, "&nu;");
        cVar.b(958, "&xi;");
        cVar.b(959, "&omicron;");
        cVar.b(VideoRecord.DEFAULT_MAX_DIMENSION, "&pi;");
        cVar.b(961, "&rho;");
        cVar.b(962, "&sigmaf;");
        cVar.b(963, "&sigma;");
        cVar.b(964, "&tau;");
        cVar.b(965, "&upsilon;");
        cVar.b(966, "&phi;");
        cVar.b(967, "&chi;");
        cVar.b(968, "&psi;");
        cVar.b(969, "&omega;");
        cVar.b(977, "&thetasym;");
        cVar.b(978, "&upsih;");
        cVar.b(982, "&piv;");
        cVar.b(8226, "&bull;");
        cVar.b(8230, "&hellip;");
        cVar.b(8242, "&prime;");
        cVar.b(8243, "&Prime;");
        cVar.b(8254, "&oline;");
        cVar.b(8260, "&frasl;");
        cVar.b(8472, "&weierp;");
        cVar.b(8465, "&image;");
        cVar.b(8476, "&real;");
        cVar.b(8482, "&trade;");
        cVar.b(8501, "&alefsym;");
        cVar.b(8592, "&larr;");
        cVar.b(8593, "&uarr;");
        cVar.b(8594, "&rarr;");
        cVar.b(8595, "&darr;");
        cVar.b(8596, "&harr;");
        cVar.b(8629, "&crarr;");
        cVar.b(8656, "&lArr;");
        cVar.b(8657, "&uArr;");
        cVar.b(8658, "&rArr;");
        cVar.b(8659, "&dArr;");
        cVar.b(8660, "&hArr;");
        cVar.b(8704, "&forall;");
        cVar.b(8706, "&part;");
        cVar.b(8707, "&exist;");
        cVar.b(8709, "&empty;");
        cVar.b(8711, "&nabla;");
        cVar.b(8712, "&isin;");
        cVar.b(8713, "&notin;");
        cVar.b(8715, "&ni;");
        cVar.b(8719, "&prod;");
        cVar.b(8721, "&sum;");
        cVar.b(8722, "&minus;");
        cVar.b(8727, "&lowast;");
        cVar.b(8730, "&radic;");
        cVar.b(8733, "&prop;");
        cVar.b(8734, "&infin;");
        cVar.b(8736, "&ang;");
        cVar.b(8743, "&and;");
        cVar.b(8744, "&or;");
        cVar.b(8745, "&cap;");
        cVar.b(8746, "&cup;");
        cVar.b(8747, "&int;");
        cVar.b(8756, "&there4;");
        cVar.b(8764, "&sim;");
        cVar.b(8773, "&cong;");
        cVar.b(8776, "&asymp;");
        cVar.b(8800, "&ne;");
        cVar.b(8801, "&equiv;");
        cVar.b(8804, "&le;");
        cVar.b(8805, "&ge;");
        cVar.b(8834, "&sub;");
        cVar.b(8835, "&sup;");
        cVar.b(8836, "&nsub;");
        cVar.b(8838, "&sube;");
        cVar.b(8839, "&supe;");
        cVar.b(8853, "&oplus;");
        cVar.b(8855, "&otimes;");
        cVar.b(8869, "&perp;");
        cVar.b(8901, "&sdot;");
        cVar.b(8968, "&lceil;");
        cVar.b(8969, "&rceil;");
        cVar.b(8970, "&lfloor;");
        cVar.b(8971, "&rfloor;");
        cVar.b(ConnectionResult.RESOLUTION_REQUIRED, "&lang;");
        cVar.b(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, "&rang;");
        cVar.b(9674, "&loz;");
        cVar.b(9824, "&spades;");
        cVar.b(9827, "&clubs;");
        cVar.b(9829, "&hearts;");
        cVar.b(9830, "&diams;");
        cVar.b(338, "&OElig;");
        cVar.b(339, "&oelig;");
        cVar.b(352, "&Scaron;");
        cVar.b(353, "&scaron;");
        cVar.b(376, "&Yuml;");
        cVar.b(710, "&circ;");
        cVar.b(732, "&tilde;");
        cVar.b(8194, "&ensp;");
        cVar.b(8195, "&emsp;");
        cVar.b(8201, "&thinsp;");
        cVar.b(8204, "&zwnj;");
        cVar.b(8205, "&zwj;");
        cVar.b(8206, "&lrm;");
        cVar.b(8207, "&rlm;");
        cVar.b(8211, "&ndash;");
        cVar.b(8212, "&mdash;");
        cVar.b(8216, "&lsquo;");
        cVar.b(8217, "&rsquo;");
        cVar.b(8218, "&sbquo;");
        cVar.b(8220, "&ldquo;");
        cVar.b(8221, "&rdquo;");
        cVar.b(8222, "&bdquo;");
        cVar.b(8224, "&dagger;");
        cVar.b(8225, "&Dagger;");
        cVar.b(8240, "&permil;");
        cVar.b(8249, "&lsaquo;");
        cVar.b(8250, "&rsaquo;");
        cVar.b(8364, "&euro;");
        byte[] bArr = new byte[129];
        Arrays.fill(bArr, (byte) 3);
        for (char c2 = 'A'; c2 <= 'Z'; c2 = (char) (c2 + 1)) {
            bArr[c2] = 4;
        }
        for (char c3 = 'a'; c3 <= 'z'; c3 = (char) (c3 + 1)) {
            bArr[c3] = 4;
        }
        for (char c4 = ImageSizeKey.SIZE_KEY_UNDEFINED; c4 <= '9'; c4 = (char) (c4 + 1)) {
            bArr[c4] = 4;
        }
        bArr[39] = 1;
        bArr[34] = 0;
        bArr[60] = 0;
        bArr[62] = 0;
        bArr[38] = 0;
        bArr[128] = 2;
        new nhv(cVar, bArr);
        e = bhv.a();
    }

    public nhv(c cVar, byte[] bArr) {
        int i = 0;
        System.arraycopy(bArr, 0, new byte[129], 0, 129);
        ArrayList arrayList = cVar.a;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + 5);
        ArrayList arrayList3 = new ArrayList(arrayList.size() + 5);
        ArrayList arrayList4 = new ArrayList(100);
        HashMap hashMap = new HashMap(20);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            char[] cArr = bVar.a;
            int[] iArr = bVar.b;
            arrayList2.add(cArr);
            if (iArr.length == 1) {
                arrayList3.add(Integer.valueOf(iArr[0]));
            } else {
                if (iArr.length != 2) {
                    throw new RuntimeException("Unsupported codepoints #: " + iArr.length + " for " + new String(cArr));
                }
                arrayList4.add(iArr);
                arrayList3.add(Integer.valueOf(arrayList4.size() * (-1)));
            }
        }
        Arrays.fill(this.a, (short) 0);
        this.b = new char[arrayList2.size()][];
        this.c = new int[arrayList3.size()];
        ArrayList arrayList5 = new ArrayList(arrayList2);
        Collections.sort(arrayList5, new a());
        for (short s = 0; s < this.b.length; s = (short) (s + 1)) {
            char[] cArr2 = (char[]) arrayList5.get(s);
            this.b[s] = cArr2;
            short s2 = 0;
            while (true) {
                if (s2 >= this.b.length) {
                    break;
                }
                if (Arrays.equals(cArr2, (char[]) arrayList2.get(s2))) {
                    Integer num = (Integer) arrayList3.get(s2);
                    int intValue = num.intValue();
                    this.c[s] = intValue;
                    if (intValue > 0) {
                        if (intValue < 12287) {
                            short[] sArr = this.a;
                            short s3 = sArr[intValue];
                            if (s3 == 0) {
                                sArr[intValue] = s;
                            } else {
                                char[] cArr3 = this.b[s3];
                                Iterator it2 = arrayList2.iterator();
                                int i2 = 0;
                                while (true) {
                                    if (!it2.hasNext()) {
                                        i2 = -1;
                                        break;
                                    } else if (Arrays.equals((char[]) it2.next(), cArr3)) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                                Iterator it3 = arrayList2.iterator();
                                int i3 = 0;
                                while (true) {
                                    if (!it3.hasNext()) {
                                        i3 = -1;
                                        break;
                                    } else if (Arrays.equals((char[]) it3.next(), cArr2)) {
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                                if (i3 < i2) {
                                    this.a[intValue] = s;
                                }
                            }
                        } else {
                            hashMap.put(num, Short.valueOf(s));
                        }
                    }
                } else {
                    s2 = (short) (s2 + 1);
                }
            }
        }
        hashMap.size();
        if (arrayList4.size() <= 0) {
            this.d = null;
            return;
        }
        this.d = new int[arrayList4.size()][];
        while (true) {
            int[][] iArr2 = this.d;
            if (i >= iArr2.length) {
                return;
            }
            iArr2[i] = (int[]) arrayList4.get(i);
            i++;
        }
    }
}
