package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import defpackage.aou;
import defpackage.b87;
import defpackage.d6z;
import defpackage.eab1;
import defpackage.eh20;
import defpackage.f7s;
import defpackage.g8e;
import defpackage.gg90;
import defpackage.iou;
import defpackage.jou;
import defpackage.lk91;
import defpackage.m4m0;
import defpackage.nnu;
import defpackage.onu;
import defpackage.oyr;
import defpackage.pnu;
import defpackage.qnu;
import defpackage.rnu;
import defpackage.tnu;
import defpackage.tw21;
import defpackage.unu;
import defpackage.vaa1;
import defpackage.w820;
import defpackage.wnu;
import defpackage.xnu;
import defpackage.ynu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes10.dex */
public final class HlsPlaylistParser implements gg90 {
    public final ynu a;
    public final unu b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern w = Pattern.compile("VIDEO=\"(.+?)\"");
    public static final Pattern x = Pattern.compile("AUDIO=\"(.+?)\"");
    public static final Pattern y = Pattern.compile("SUBTITLES=\"(.+?)\"");
    public static final Pattern z = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    public static final Pattern A = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern B = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern C = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern D = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern E = Pattern.compile("SUPPLEMENTAL-CODECS=\"(.+?)\"");
    public static final Pattern F = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern G = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern H = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern I = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern J = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern K = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern L = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern M = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern N = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern O = a("CAN-SKIP-DATERANGES");
    public static final Pattern P = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern Q = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern R = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern S = a("CAN-BLOCK-RELOAD");
    public static final Pattern T = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern U = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern V = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern W = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern Z = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern a0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern b0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern c0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern d0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern e0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern f0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern g0 = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern h0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern i0 = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern j0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern k0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern l0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern m0 = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern n0 = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern o0 = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern p0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern q0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern r0 = a("AUTOSELECT");
    public static final Pattern s0 = a("DEFAULT");
    public static final Pattern t0 = a("FORCED");
    public static final Pattern u0 = a("INDEPENDENT");
    public static final Pattern v0 = a("GAP");
    public static final Pattern w0 = a("PRECISE");
    public static final Pattern x0 = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern y0 = Pattern.compile("IMPORT=\"(.+?)\"");
    public static final Pattern z0 = Pattern.compile("[:,]ID=\"(.+?)\"");
    public static final Pattern A0 = Pattern.compile("CLASS=\"(.+?)\"");
    public static final Pattern B0 = Pattern.compile("START-DATE=\"(.+?)\"");
    public static final Pattern C0 = Pattern.compile("CUE=\"(.+?)\"");
    public static final Pattern D0 = Pattern.compile("END-DATE=\"(.+?)\"");
    public static final Pattern E0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern F0 = a("END-ON-NEXT");
    public static final Pattern G0 = Pattern.compile("X-ASSET-URI=\"(.+?)\"");
    public static final Pattern H0 = Pattern.compile("X-ASSET-LIST=\"(.+?)\"");
    public static final Pattern I0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern J0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern K0 = Pattern.compile("X-SNAP=\"(.+?)\"");
    public static final Pattern L0 = Pattern.compile("X-RESTRICT=\"(.+?)\"");
    public static final Pattern M0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern N0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public static final class DeltaUpdateException extends IOException {
    }

    public HlsPlaylistParser(ynu ynuVar, unu unuVar) {
        this.a = ynuVar;
        this.b = unuVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static DrmInitData b(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i = 0; i < schemeDataArr.length; i++) {
            schemeDataArr2[i] = schemeDataArr[i].copyWithData(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    public static DrmInitData.SchemeData c(String str, HashMap hashMap, String str2) {
        String i = i(str, h0, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = i0;
        if (equals) {
            String j = j(str, pattern, hashMap);
            return new DrmInitData.SchemeData(b87.d, "video/mp4", Base64.decode(j.substring(j.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = b87.d;
            int i2 = tw21.a;
            return new DrmInitData.SchemeData(uuid, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(i)) {
            return null;
        }
        String j2 = j(str, pattern, hashMap);
        byte[] decode = Base64.decode(j2.substring(j2.indexOf(44)), 0);
        UUID uuid2 = b87.e;
        return new DrmInitData.SchemeData(uuid2, "video/mp4", vaa1.c(uuid2, null, decode));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:311:0x09f8  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0a0f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static unu d(ynu ynuVar, unu unuVar, aou aouVar, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str2;
        int i;
        long j;
        String str3;
        long j2;
        int i2;
        ArrayList arrayList4;
        rnu rnuVar;
        int i3;
        ArrayList arrayList5;
        rnu rnuVar2;
        long j3;
        int i4;
        DrmInitData drmInitData;
        rnu rnuVar3;
        int i5;
        String str4;
        long j4;
        long j5;
        boolean z2;
        long j6;
        String str5;
        String str6;
        char c2;
        ArrayList arrayList6;
        DrmInitData drmInitData2;
        int i6;
        char c3;
        long j7;
        int i7;
        DrmInitData drmInitData3;
        ynu ynuVar2 = ynuVar;
        unu unuVar2 = unuVar;
        boolean z3 = ynuVar2.c;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        tnu tnuVar = new tnu(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, false);
        TreeMap treeMap = new TreeMap();
        boolean z4 = z3;
        String str7 = "";
        long j8 = -9223372036854775807L;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = -1;
        boolean z5 = false;
        pnu pnuVar = null;
        int i8 = 0;
        DrmInitData drmInitData4 = null;
        rnu rnuVar4 = null;
        DrmInitData drmInitData5 = null;
        int i9 = 0;
        String str8 = null;
        String str9 = null;
        int i10 = 0;
        boolean z6 = false;
        int i11 = 0;
        String str10 = null;
        boolean z7 = false;
        int i12 = 0;
        long j18 = -9223372036854775807L;
        long j19 = -9223372036854775807L;
        boolean z8 = false;
        int i13 = 1;
        while (aouVar.a()) {
            String b = aouVar.b();
            if (b.startsWith("#EXT")) {
                arrayList10.add(b);
            }
            if (b.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String j20 = j(b, M, hashMap);
                if ("VOD".equals(j20)) {
                    i8 = 1;
                } else if ("EVENT".equals(j20)) {
                    i8 = 2;
                }
            } else if (b.equals("#EXT-X-I-FRAMES-ONLY")) {
                z7 = true;
            } else {
                if (b.startsWith("#EXT-X-START")) {
                    double parseDouble = Double.parseDouble(j(b, a0, Collections.EMPTY_MAP));
                    arrayList = arrayList10;
                    arrayList2 = arrayList11;
                    z5 = f(w0, b);
                    j8 = (long) (parseDouble * 1000000.0d);
                } else {
                    arrayList = arrayList10;
                    arrayList2 = arrayList11;
                    if (b.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double g = g(b, N, -9.223372036854776E18d);
                        long j21 = g == -9.223372036854776E18d ? -9223372036854775807L : (long) (g * 1000000.0d);
                        boolean f = f(O, b);
                        double g2 = g(b, Q, -9.223372036854776E18d);
                        long j22 = g2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g2 * 1000000.0d);
                        double g3 = g(b, R, -9.223372036854776E18d);
                        arrayList10 = arrayList;
                        arrayList11 = arrayList2;
                        tnuVar = new tnu(j21, j22, g3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g3 * 1000000.0d), f, f(S, b));
                    } else if (b.startsWith("#EXT-X-PART-INF")) {
                        j19 = (long) (Double.parseDouble(j(b, K, Collections.EMPTY_MAP)) * 1000000.0d);
                    } else {
                        boolean startsWith = b.startsWith("#EXT-X-MAP");
                        Pattern pattern = c0;
                        boolean z9 = z5;
                        Pattern pattern2 = i0;
                        if (startsWith) {
                            String j23 = j(b, pattern2, hashMap);
                            String i14 = i(b, pattern, null, hashMap);
                            if (i14 != null) {
                                int i15 = tw21.a;
                                String[] split = i14.split("@", -1);
                                j17 = Long.parseLong(split[i10]);
                                if (split.length > 1) {
                                    j13 = Long.parseLong(split[1]);
                                }
                            }
                            long j24 = j17 == -1 ? 0L : j13;
                            if (str8 != null && str9 == null) {
                                throw ParserException.b(null, "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                            }
                            String str11 = str8;
                            rnu rnuVar5 = new rnu(j24, j17, j23, str11, str9);
                            str8 = str11;
                            String str12 = str9;
                            if (j17 != -1) {
                                j24 += j17;
                            }
                            j13 = j24;
                            arrayList10 = arrayList;
                            rnuVar4 = rnuVar5;
                            j17 = -1;
                            arrayList11 = arrayList2;
                            z5 = z9;
                            str9 = str12;
                        } else {
                            tnu tnuVar2 = tnuVar;
                            String str13 = str9;
                            if (b.startsWith("#EXT-X-TARGETDURATION")) {
                                j18 = Integer.parseInt(j(b, H, Collections.EMPTY_MAP)) * 1000000;
                            } else {
                                if (b.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                    j12 = Long.parseLong(j(b, T, Collections.EMPTY_MAP));
                                    arrayList10 = arrayList;
                                    j10 = j12;
                                } else if (b.startsWith("#EXT-X-VERSION")) {
                                    i13 = Integer.parseInt(j(b, L, Collections.EMPTY_MAP));
                                } else {
                                    if (b.startsWith("#EXT-X-DEFINE")) {
                                        String i16 = i(b, y0, null, hashMap);
                                        if (i16 != null) {
                                            String str14 = (String) ynuVar2.j.get(i16);
                                            if (str14 != null) {
                                                hashMap.put(i16, str14);
                                            }
                                        } else {
                                            hashMap.put(j(b, n0, hashMap), j(b, x0, hashMap));
                                        }
                                        arrayList3 = arrayList;
                                        str2 = str8;
                                        i = i10;
                                        j = j17;
                                        str3 = str10;
                                        j2 = j14;
                                        i2 = i12;
                                        arrayList4 = arrayList2;
                                        rnuVar = rnuVar4;
                                    } else if (b.startsWith("#EXTINF")) {
                                        j15 = new BigDecimal(j(b, U, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                                        str7 = i(b, V, "", hashMap);
                                    } else if (b.startsWith("#EXT-X-SKIP")) {
                                        int parseInt = Integer.parseInt(j(b, P, Collections.EMPTY_MAP));
                                        d6z.x((unuVar2 == null || !arrayList7.isEmpty()) ? i10 : 1);
                                        int i17 = tw21.a;
                                        long j25 = unuVar2.k;
                                        ImmutableList immutableList = unuVar2.r;
                                        int i18 = (int) (j10 - j25);
                                        int i19 = parseInt + i18;
                                        if (i18 < 0 || i19 > immutableList.size()) {
                                            throw new DeltaUpdateException();
                                        }
                                        ArrayList arrayList12 = arrayList;
                                        long j26 = j14;
                                        while (i18 < i19) {
                                            rnu rnuVar6 = (rnu) immutableList.get(i18);
                                            int i20 = i18;
                                            ArrayList arrayList13 = arrayList12;
                                            if (j10 != unuVar2.k) {
                                                rnuVar6 = rnuVar6.a((unuVar2.j - i11) + rnuVar6.w, j26);
                                            }
                                            arrayList7.add(rnuVar6);
                                            long j27 = rnuVar6.c;
                                            String str15 = rnuVar6.A;
                                            j26 += j27;
                                            long j28 = rnuVar6.C;
                                            if (j28 != -1) {
                                                j13 = rnuVar6.B + j28;
                                            }
                                            int i21 = rnuVar6.w;
                                            rnu rnuVar7 = rnuVar6.b;
                                            int i22 = i19;
                                            DrmInitData drmInitData6 = rnuVar6.y;
                                            String str16 = rnuVar6.z;
                                            if (str15 == null || !str15.equals(Long.toHexString(j12))) {
                                                str13 = str15;
                                            }
                                            j12++;
                                            unuVar2 = unuVar;
                                            i9 = i21;
                                            rnuVar4 = rnuVar7;
                                            j9 = j26;
                                            str8 = str16;
                                            arrayList12 = arrayList13;
                                            i18 = i20 + 1;
                                            drmInitData4 = drmInitData6;
                                            i19 = i22;
                                        }
                                        ynuVar2 = ynuVar;
                                        unuVar2 = unuVar;
                                        arrayList10 = arrayList12;
                                        j14 = j26;
                                    } else {
                                        arrayList3 = arrayList;
                                        if (b.startsWith("#EXT-X-KEY")) {
                                            String j29 = j(b, f0, hashMap);
                                            String i23 = i(b, g0, ClidProvider.IDENTITY, hashMap);
                                            if (JCP.RAW_PREFIX.equals(j29)) {
                                                treeMap.clear();
                                                drmInitData4 = null;
                                                str8 = null;
                                                str9 = null;
                                            } else {
                                                String i24 = i(b, j0, null, hashMap);
                                                if (!ClidProvider.IDENTITY.equals(i23)) {
                                                    String str17 = str10;
                                                    str10 = str17 == null ? ("SAMPLE-AES-CENC".equals(j29) || "SAMPLE-AES-CTR".equals(j29)) ? "cenc" : "cbcs" : str17;
                                                    DrmInitData.SchemeData c4 = c(b, hashMap, i23);
                                                    if (c4 != null) {
                                                        treeMap.put(i23, c4);
                                                        str9 = i24;
                                                        drmInitData4 = null;
                                                        str8 = null;
                                                    }
                                                } else if ("AES-128".equals(j29)) {
                                                    str8 = j(b, pattern2, hashMap);
                                                    str9 = i24;
                                                }
                                                str9 = i24;
                                                str8 = null;
                                            }
                                            ynuVar2 = ynuVar;
                                            unuVar2 = unuVar;
                                            arrayList11 = arrayList2;
                                            z5 = z9;
                                        } else {
                                            str3 = str10;
                                            if (b.startsWith("#EXT-X-BYTERANGE")) {
                                                String j30 = j(b, b0, hashMap);
                                                int i25 = tw21.a;
                                                String[] split2 = j30.split("@", -1);
                                                j17 = Long.parseLong(split2[i10]);
                                                if (split2.length > 1) {
                                                    j13 = Long.parseLong(split2[1]);
                                                }
                                            } else if (b.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                                i11 = Integer.parseInt(b.substring(b.indexOf(58) + 1));
                                                ynuVar2 = ynuVar;
                                                unuVar2 = unuVar;
                                                str10 = str3;
                                                arrayList11 = arrayList2;
                                                z5 = z9;
                                                str9 = str13;
                                                tnuVar = tnuVar2;
                                                arrayList10 = arrayList3;
                                                z6 = true;
                                            } else if (b.equals("#EXT-X-DISCONTINUITY")) {
                                                i9++;
                                            } else {
                                                if (b.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                    if (j11 == 0) {
                                                        j11 = tw21.W(tw21.Z(b.substring(b.indexOf(58) + 1))) - j14;
                                                    }
                                                } else if (b.equals("#EXT-X-GAP")) {
                                                    ynuVar2 = ynuVar;
                                                    unuVar2 = unuVar;
                                                    str10 = str3;
                                                    arrayList11 = arrayList2;
                                                    z5 = z9;
                                                    str9 = str13;
                                                    tnuVar = tnuVar2;
                                                    arrayList10 = arrayList3;
                                                    i12 = 1;
                                                } else if (b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                    ynuVar2 = ynuVar;
                                                    unuVar2 = unuVar;
                                                    str10 = str3;
                                                    arrayList11 = arrayList2;
                                                    z5 = z9;
                                                    str9 = str13;
                                                    tnuVar = tnuVar2;
                                                    arrayList10 = arrayList3;
                                                    z4 = true;
                                                } else if (b.equals("#EXT-X-ENDLIST")) {
                                                    ynuVar2 = ynuVar;
                                                    unuVar2 = unuVar;
                                                    str10 = str3;
                                                    arrayList11 = arrayList2;
                                                    z5 = z9;
                                                    str9 = str13;
                                                    tnuVar = tnuVar2;
                                                    arrayList10 = arrayList3;
                                                    z8 = true;
                                                } else if (b.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                    long h = h(W, b);
                                                    Matcher matcher = Z.matcher(b);
                                                    if (matcher.find()) {
                                                        String group = matcher.group(1);
                                                        group.getClass();
                                                        i3 = Integer.parseInt(group);
                                                    } else {
                                                        i3 = -1;
                                                    }
                                                    arrayList9.add(new qnu(i3, h, Uri.parse(m4m0.i(str, j(b, pattern2, hashMap)))));
                                                } else {
                                                    if (!b.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                        DrmInitData drmInitData7 = drmInitData5;
                                                        rnu rnuVar8 = rnuVar4;
                                                        if (b.startsWith("#EXT-X-PART")) {
                                                            String hexString = str8 == null ? null : str13 != null ? str13 : Long.toHexString(j12);
                                                            String j31 = j(b, pattern2, hashMap);
                                                            DrmInitData drmInitData8 = drmInitData7;
                                                            long parseDouble2 = (long) (Double.parseDouble(j(b, I, Collections.EMPTY_MAP)) * 1000000.0d);
                                                            boolean f2 = f(u0, b) | (z4 && arrayList8.isEmpty());
                                                            boolean f3 = f(v0, b);
                                                            String i26 = i(b, pattern, null, hashMap);
                                                            if (i26 != null) {
                                                                int i27 = tw21.a;
                                                                String[] split3 = i26.split("@", -1);
                                                                j7 = Long.parseLong(split3[0]);
                                                                if (split3.length > 1) {
                                                                    j16 = Long.parseLong(split3[1]);
                                                                }
                                                            } else {
                                                                j7 = -1;
                                                            }
                                                            int i28 = (j7 > (-1L) ? 1 : (j7 == (-1L) ? 0 : -1));
                                                            long j32 = i28 == 0 ? 0L : j16;
                                                            if (drmInitData4 != null || treeMap.isEmpty()) {
                                                                i7 = i28;
                                                            } else {
                                                                i7 = i28;
                                                                DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                DrmInitData drmInitData9 = new DrmInitData(str3, schemeDataArr);
                                                                if (drmInitData8 == null) {
                                                                    drmInitData8 = b(str3, schemeDataArr);
                                                                }
                                                                drmInitData4 = drmInitData9;
                                                            }
                                                            long j33 = j9;
                                                            DrmInitData drmInitData10 = drmInitData4;
                                                            String str18 = hexString;
                                                            long j34 = j7;
                                                            arrayList8.add(new pnu(j31, rnuVar8, parseDouble2, i9, j33, drmInitData10, str8, str18, j32, j34, f3, f2, false));
                                                            j9 = j33 + parseDouble2;
                                                            if (i7 != 0) {
                                                                j32 += j34;
                                                            }
                                                            j16 = j32;
                                                            unuVar2 = unuVar;
                                                            rnuVar4 = rnuVar8;
                                                            drmInitData5 = drmInitData8;
                                                            str10 = str3;
                                                            drmInitData4 = drmInitData10;
                                                            arrayList11 = arrayList2;
                                                            z5 = z9;
                                                            str9 = str13;
                                                            tnuVar = tnuVar2;
                                                            arrayList10 = arrayList3;
                                                            i10 = 0;
                                                        } else {
                                                            DrmInitData drmInitData11 = drmInitData7;
                                                            if (b.startsWith("#EXT-X-DATERANGE") && i(b, A0, "", hashMap).equals("com.apple.hls.interstitial")) {
                                                                String j35 = j(b, z0, hashMap);
                                                                String i29 = i(b, G0, null, hashMap);
                                                                Uri parse = i29 != null ? Uri.parse(i29) : null;
                                                                String i30 = i(b, H0, null, hashMap);
                                                                Uri parse2 = i30 != null ? Uri.parse(i30) : null;
                                                                long W2 = tw21.W(tw21.Z(j(b, B0, hashMap)));
                                                                String i31 = i(b, D0, null, hashMap);
                                                                long W3 = i31 != null ? tw21.W(tw21.Z(i31)) : -9223372036854775807L;
                                                                ArrayList arrayList14 = new ArrayList();
                                                                String i32 = i(b, C0, null, hashMap);
                                                                rnuVar = rnuVar8;
                                                                if (i32 != null) {
                                                                    String[] split4 = i32.split(",", -1);
                                                                    int length = split4.length;
                                                                    int i33 = 0;
                                                                    while (i33 < length) {
                                                                        int i34 = length;
                                                                        String trim = split4[i33].trim();
                                                                        trim.getClass();
                                                                        switch (trim.hashCode()) {
                                                                            case 79491:
                                                                                i6 = i33;
                                                                                if (trim.equals("PRE")) {
                                                                                    c3 = 0;
                                                                                    break;
                                                                                }
                                                                                c3 = 65535;
                                                                                break;
                                                                            case 2430593:
                                                                                i6 = i33;
                                                                                if (trim.equals("ONCE")) {
                                                                                    c3 = 1;
                                                                                    break;
                                                                                }
                                                                                c3 = 65535;
                                                                                break;
                                                                            case 2461856:
                                                                                i6 = i33;
                                                                                if (trim.equals("POST")) {
                                                                                    c3 = 2;
                                                                                    break;
                                                                                }
                                                                                c3 = 65535;
                                                                                break;
                                                                            default:
                                                                                i6 = i33;
                                                                                c3 = 65535;
                                                                                break;
                                                                        }
                                                                        switch (c3) {
                                                                            case 0:
                                                                            case 1:
                                                                            case 2:
                                                                                arrayList14.add(trim);
                                                                                break;
                                                                        }
                                                                        i33 = i6 + 1;
                                                                        length = i34;
                                                                    }
                                                                }
                                                                double g4 = g(b, J, -1.0d);
                                                                long j36 = g4 >= 0.0d ? (long) (g4 * 1000000.0d) : -9223372036854775807L;
                                                                double g5 = g(b, E0, -1.0d);
                                                                long j37 = g5 >= 0.0d ? (long) (g5 * 1000000.0d) : -9223372036854775807L;
                                                                boolean f4 = f(F0, b);
                                                                double g6 = g(b, I0, Double.MIN_VALUE);
                                                                long j38 = g6 != Double.MIN_VALUE ? (long) (g6 * 1000000.0d) : -9223372036854775807L;
                                                                double g7 = g(b, J0, -1.0d);
                                                                long j39 = g7 >= 0.0d ? (long) (g7 * 1000000.0d) : -9223372036854775807L;
                                                                ArrayList arrayList15 = new ArrayList();
                                                                String i35 = i(b, K0, null, hashMap);
                                                                if (i35 != null) {
                                                                    String[] split5 = i35.split(",", -1);
                                                                    int length2 = split5.length;
                                                                    int i36 = 0;
                                                                    while (i36 < length2) {
                                                                        int i37 = i36;
                                                                        String trim2 = split5[i36].trim();
                                                                        trim2.getClass();
                                                                        int i38 = length2;
                                                                        if (trim2.equals("IN") || trim2.equals("OUT")) {
                                                                            arrayList15.add(trim2);
                                                                        }
                                                                        i36 = i37 + 1;
                                                                        length2 = i38;
                                                                    }
                                                                }
                                                                ArrayList arrayList16 = new ArrayList();
                                                                String i39 = i(b, L0, null, hashMap);
                                                                if (i39 != null) {
                                                                    String[] split6 = i39.split(",", -1);
                                                                    int length3 = split6.length;
                                                                    int i40 = 0;
                                                                    while (i40 < length3) {
                                                                        int i41 = length3;
                                                                        String trim3 = split6[i40].trim();
                                                                        trim3.getClass();
                                                                        String[] strArr = split6;
                                                                        if (trim3.equals("JUMP") || trim3.equals("SKIP")) {
                                                                            arrayList16.add(trim3);
                                                                        }
                                                                        i40++;
                                                                        split6 = strArr;
                                                                        length3 = i41;
                                                                    }
                                                                }
                                                                ImmutableList.a aVar = new ImmutableList.a();
                                                                String substring = b.substring(17);
                                                                Matcher matcher2 = N0.matcher(substring);
                                                                while (matcher2.find()) {
                                                                    String group2 = matcher2.group();
                                                                    group2.getClass();
                                                                    ArrayList arrayList17 = arrayList16;
                                                                    switch (group2.hashCode()) {
                                                                        case -2136701954:
                                                                            if (group2.equals("X-SNAP=")) {
                                                                                c2 = 0;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case -148960310:
                                                                            if (group2.equals("X-PLAYOUT-LIMIT=")) {
                                                                                c2 = 1;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 397239341:
                                                                            if (group2.equals("X-ASSET-LIST=")) {
                                                                                c2 = 2;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 1472528844:
                                                                            if (group2.equals("X-RESTRICT=")) {
                                                                                c2 = 3;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 1748487807:
                                                                            if (group2.equals("X-RESUME-OFFSET=")) {
                                                                                c2 = 4;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        case 1814205923:
                                                                            if (group2.equals("X-ASSET-URI=")) {
                                                                                c2 = 5;
                                                                                break;
                                                                            }
                                                                            c2 = 65535;
                                                                            break;
                                                                        default:
                                                                            c2 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c2) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                        case 5:
                                                                            arrayList6 = arrayList8;
                                                                            drmInitData2 = drmInitData11;
                                                                            break;
                                                                        default:
                                                                            arrayList6 = arrayList8;
                                                                            String g8 = oyr.g(1, 0, group2);
                                                                            String concat = g8.concat("=");
                                                                            int length4 = concat.length() + substring.indexOf(concat);
                                                                            drmInitData2 = drmInitData11;
                                                                            String substring2 = substring.substring(length4, (substring.length() == length4 + 1 ? 1 : 2) + length4);
                                                                            aVar.a(substring2.startsWith("\"") ? new nnu(g8, j(substring, Pattern.compile(g8.concat("=\"(.+?)\"")), hashMap), 0) : (substring2.equals(HexString.STR_0x) || substring2.equals("0X")) ? new nnu(g8, j(substring, Pattern.compile(g8.concat("=(0[xX][A-F0-9]+)")), hashMap), 1) : new nnu(g8, Double.parseDouble(j(substring, Pattern.compile(g8.concat("=([\\d\\.]+)\\b")), Collections.EMPTY_MAP))));
                                                                            break;
                                                                    }
                                                                    drmInitData11 = drmInitData2;
                                                                    arrayList8 = arrayList6;
                                                                    arrayList16 = arrayList17;
                                                                }
                                                                ArrayList arrayList18 = arrayList16;
                                                                arrayList5 = arrayList8;
                                                                drmInitData5 = drmInitData11;
                                                                if ((parse2 != null || parse == null) && (parse2 == null || parse != null)) {
                                                                    arrayList4 = arrayList2;
                                                                } else {
                                                                    onu onuVar = new onu(j35, parse, parse2, W2, W3, j36, j37, arrayList14, f4, j38, j39, arrayList15, arrayList18, aVar.g());
                                                                    arrayList4 = arrayList2;
                                                                    arrayList4.add(onuVar);
                                                                }
                                                            } else {
                                                                rnuVar = rnuVar8;
                                                                arrayList5 = arrayList8;
                                                                drmInitData5 = drmInitData11;
                                                                arrayList4 = arrayList2;
                                                                if (!b.startsWith(ShimmerDivHandler.NUMBER_SING)) {
                                                                    String hexString2 = str8 == null ? null : str13 != null ? str13 : Long.toHexString(j12);
                                                                    long j40 = j12 + 1;
                                                                    String k = k(b, hashMap);
                                                                    rnu rnuVar9 = (rnu) hashMap2.get(k);
                                                                    if (j17 == -1) {
                                                                        rnuVar2 = rnuVar9;
                                                                        j3 = 0;
                                                                    } else {
                                                                        if (z7 && rnuVar == null && rnuVar9 == null) {
                                                                            rnuVar9 = new rnu(0L, j13, k, null, null);
                                                                            hashMap2.put(k, rnuVar9);
                                                                        }
                                                                        rnuVar2 = rnuVar9;
                                                                        j3 = j13;
                                                                    }
                                                                    if (drmInitData4 != null || treeMap.isEmpty()) {
                                                                        i4 = 0;
                                                                    } else {
                                                                        i4 = 0;
                                                                        DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                        DrmInitData drmInitData12 = new DrmInitData(str3, schemeDataArr2);
                                                                        if (drmInitData5 == null) {
                                                                            drmInitData = b(str3, schemeDataArr2);
                                                                            drmInitData4 = drmInitData12;
                                                                            if (rnuVar == null) {
                                                                                rnuVar3 = rnuVar;
                                                                                str6 = k;
                                                                                i5 = i9;
                                                                                str4 = str8;
                                                                                j4 = j17;
                                                                                j5 = j14;
                                                                                z2 = i12;
                                                                                j6 = j15;
                                                                                str5 = str7;
                                                                            } else {
                                                                                rnuVar3 = rnuVar2;
                                                                                i5 = i9;
                                                                                str4 = str8;
                                                                                j4 = j17;
                                                                                j5 = j14;
                                                                                z2 = i12;
                                                                                j6 = j15;
                                                                                str5 = str7;
                                                                                str6 = k;
                                                                            }
                                                                            DrmInitData drmInitData13 = drmInitData4;
                                                                            i9 = i5;
                                                                            arrayList7.add(new rnu(str6, rnuVar3, str5, j6, i5, j5, drmInitData13, str4, hexString2, j3, j4, z2, arrayList5));
                                                                            j9 = j5 + j6;
                                                                            arrayList8 = new ArrayList();
                                                                            if (j17 != -1) {
                                                                                j3 += j4;
                                                                            }
                                                                            j13 = j3;
                                                                            arrayList11 = arrayList4;
                                                                            j12 = j40;
                                                                            drmInitData5 = drmInitData;
                                                                            i10 = i4;
                                                                            i12 = i10;
                                                                            str7 = "";
                                                                            j14 = j9;
                                                                            drmInitData4 = drmInitData13;
                                                                            str8 = str4;
                                                                            rnuVar4 = rnuVar;
                                                                            j15 = 0;
                                                                            j17 = -1;
                                                                            z5 = z9;
                                                                            str9 = str13;
                                                                            tnuVar = tnuVar2;
                                                                            arrayList10 = arrayList3;
                                                                            ynuVar2 = ynuVar;
                                                                            unuVar2 = unuVar;
                                                                            str10 = str3;
                                                                        } else {
                                                                            drmInitData4 = drmInitData12;
                                                                        }
                                                                    }
                                                                    drmInitData = drmInitData5;
                                                                    if (rnuVar == null) {
                                                                    }
                                                                    DrmInitData drmInitData132 = drmInitData4;
                                                                    i9 = i5;
                                                                    arrayList7.add(new rnu(str6, rnuVar3, str5, j6, i5, j5, drmInitData132, str4, hexString2, j3, j4, z2, arrayList5));
                                                                    j9 = j5 + j6;
                                                                    arrayList8 = new ArrayList();
                                                                    if (j17 != -1) {
                                                                    }
                                                                    j13 = j3;
                                                                    arrayList11 = arrayList4;
                                                                    j12 = j40;
                                                                    drmInitData5 = drmInitData;
                                                                    i10 = i4;
                                                                    i12 = i10;
                                                                    str7 = "";
                                                                    j14 = j9;
                                                                    drmInitData4 = drmInitData132;
                                                                    str8 = str4;
                                                                    rnuVar4 = rnuVar;
                                                                    j15 = 0;
                                                                    j17 = -1;
                                                                    z5 = z9;
                                                                    str9 = str13;
                                                                    tnuVar = tnuVar2;
                                                                    arrayList10 = arrayList3;
                                                                    ynuVar2 = ynuVar;
                                                                    unuVar2 = unuVar;
                                                                    str10 = str3;
                                                                }
                                                            }
                                                            str2 = str8;
                                                            arrayList8 = arrayList5;
                                                            j = j17;
                                                            j2 = j14;
                                                            i2 = i12;
                                                            i = 0;
                                                        }
                                                    } else if (pnuVar == null && "PART".equals(j(b, l0, hashMap))) {
                                                        DrmInitData drmInitData14 = drmInitData5;
                                                        rnu rnuVar10 = rnuVar4;
                                                        String j41 = j(b, pattern2, hashMap);
                                                        long h2 = h(d0, b);
                                                        long h3 = h(e0, b);
                                                        String hexString3 = str8 == null ? null : str13 != null ? str13 : Long.toHexString(j12);
                                                        if (drmInitData4 != null || treeMap.isEmpty()) {
                                                            drmInitData3 = drmInitData4;
                                                        } else {
                                                            DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[i10]);
                                                            DrmInitData drmInitData15 = new DrmInitData(str3, schemeDataArr3);
                                                            if (drmInitData14 == null) {
                                                                drmInitData14 = b(str3, schemeDataArr3);
                                                            }
                                                            drmInitData3 = drmInitData15;
                                                        }
                                                        if (h2 == -1 || h3 != -1) {
                                                            long j42 = j9;
                                                            j9 = j42;
                                                            pnuVar = new pnu(j41, rnuVar10, 0L, i9, j42, drmInitData3, str8, hexString3, h2 != -1 ? h2 : 0L, h3, false, false, true);
                                                        }
                                                        unuVar2 = unuVar;
                                                        str10 = str3;
                                                        rnuVar4 = rnuVar10;
                                                        drmInitData4 = drmInitData3;
                                                        arrayList11 = arrayList2;
                                                        z5 = z9;
                                                        str9 = str13;
                                                        tnuVar = tnuVar2;
                                                        arrayList10 = arrayList3;
                                                        i10 = 0;
                                                        drmInitData5 = drmInitData14;
                                                    }
                                                    ynuVar2 = ynuVar;
                                                }
                                                rnuVar = rnuVar4;
                                                str2 = str8;
                                                i = i10;
                                                j = j17;
                                                j2 = j14;
                                                i2 = i12;
                                                arrayList4 = arrayList2;
                                            }
                                            ynuVar2 = ynuVar;
                                            unuVar2 = unuVar;
                                            str10 = str3;
                                            arrayList11 = arrayList2;
                                            z5 = z9;
                                            str9 = str13;
                                        }
                                        tnuVar = tnuVar2;
                                        arrayList10 = arrayList3;
                                    }
                                    unuVar2 = unuVar;
                                    arrayList11 = arrayList4;
                                    i10 = i;
                                    j14 = j2;
                                    str8 = str2;
                                    j17 = j;
                                    i12 = i2;
                                    rnuVar4 = rnuVar;
                                    z5 = z9;
                                    str9 = str13;
                                    tnuVar = tnuVar2;
                                    arrayList10 = arrayList3;
                                    ynuVar2 = ynuVar;
                                    str10 = str3;
                                }
                                arrayList11 = arrayList2;
                                z5 = z9;
                                str9 = str13;
                                tnuVar = tnuVar2;
                            }
                            arrayList10 = arrayList;
                            arrayList11 = arrayList2;
                            z5 = z9;
                            str9 = str13;
                            tnuVar = tnuVar2;
                        }
                    }
                }
                arrayList10 = arrayList;
                arrayList11 = arrayList2;
            }
        }
        boolean z10 = z5;
        ArrayList arrayList19 = arrayList10;
        ArrayList arrayList20 = arrayList11;
        tnu tnuVar3 = tnuVar;
        int i42 = i10;
        HashMap hashMap3 = new HashMap();
        for (int i43 = i42; i43 < arrayList9.size(); i43++) {
            qnu qnuVar = (qnu) arrayList9.get(i43);
            long j43 = qnuVar.b;
            if (j43 == -1) {
                j43 = (j10 + arrayList7.size()) - (arrayList8.isEmpty() ? 1L : 0L);
            }
            int i44 = qnuVar.c;
            if (i44 == -1 && j19 != -9223372036854775807L) {
                i44 = (arrayList8.isEmpty() ? ((rnu) eab1.c(arrayList7)).F : arrayList8).size() - 1;
            }
            Uri uri = qnuVar.a;
            hashMap3.put(uri, new qnu(i44, j43, uri));
        }
        if (pnuVar != null) {
            arrayList8.add(pnuVar);
        }
        return new unu(i8, str, arrayList19, j8, z10, j11, z6, i11, j10, i13, j18, j19, z4, z8, j11 != 0 ? 1 : i42, drmInitData5, arrayList7, arrayList8, tnuVar3, hashMap3, arrayList20);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0197, code lost:
    
        if (r7.equals("db1p") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a7, code lost:
    
        if (r7.equals("db2g") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b7, code lost:
    
        if (r7.startsWith("db4") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ec, code lost:
    
        if (r4 > 0) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fe  */
    /* JADX WARN: Type inference failed for: r43v12 */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r43v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ynu e(aou aouVar, String str) {
        int i;
        ArrayList arrayList;
        char c2;
        ArrayList arrayList2;
        xnu xnuVar;
        String str2;
        ArrayList arrayList3;
        int parseInt;
        String str3;
        xnu xnuVar2;
        String str4;
        xnu xnuVar3;
        HashMap hashMap;
        HashSet hashSet;
        ArrayList arrayList4;
        boolean z2;
        int i2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int i3;
        String str5;
        String str6;
        String w2;
        String i4;
        int i5;
        int i6;
        Uri j;
        ArrayList arrayList8;
        String str7;
        String str8 = str;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            boolean a = aouVar.a();
            Pattern pattern = i0;
            ArrayList arrayList17 = arrayList13;
            boolean z5 = z3;
            Pattern pattern2 = n0;
            boolean z6 = z4;
            if (!a) {
                ArrayList arrayList18 = arrayList10;
                ArrayList arrayList19 = arrayList11;
                ArrayList arrayList20 = arrayList12;
                ArrayList arrayList21 = arrayList16;
                ArrayList arrayList22 = arrayList15;
                ArrayList arrayList23 = new ArrayList();
                HashSet hashSet2 = new HashSet();
                int i7 = 0;
                HashMap hashMap4 = hashMap2;
                while (i7 < arrayList9.size()) {
                    xnu xnuVar4 = (xnu) arrayList9.get(i7);
                    Uri uri = xnuVar4.a;
                    androidx.media3.common.a aVar = xnuVar4.b;
                    if (hashSet2.add(uri)) {
                        d6z.x(aVar.l == null);
                        ArrayList arrayList24 = (ArrayList) hashMap4.get(xnuVar4.a);
                        arrayList24.getClass();
                        hashMap = hashMap4;
                        hashSet = hashSet2;
                        w820 w820Var = new w820(new jou(null, null, arrayList24));
                        f7s a2 = aVar.a();
                        a2.k = w820Var;
                        arrayList23.add(new xnu(xnuVar4.a, new androidx.media3.common.a(a2), xnuVar4.c, xnuVar4.d, xnuVar4.e, xnuVar4.f));
                    } else {
                        hashMap = hashMap4;
                        hashSet = hashSet2;
                    }
                    i7++;
                    hashSet2 = hashSet;
                    hashMap4 = hashMap;
                }
                int i8 = 0;
                List list = null;
                androidx.media3.common.a aVar2 = null;
                while (i8 < arrayList14.size()) {
                    String str9 = (String) arrayList14.get(i8);
                    String j2 = j(str9, o0, hashMap3);
                    String j3 = j(str9, pattern2, hashMap3);
                    f7s f7sVar = new f7s();
                    int i9 = i8;
                    f7sVar.a = g8e.p(j2, ":", j3);
                    f7sVar.b = j3;
                    f7sVar.l = eh20.q("application/x-mpegURL");
                    boolean f = f(s0, str9);
                    ?? r43 = f;
                    if (f(t0, str9)) {
                        r43 = (f ? 1 : 0) | 2;
                    }
                    f7sVar.e = f(r0, str9) ? r43 | 4 : r43;
                    ArrayList arrayList25 = arrayList14;
                    String i10 = i(str9, p0, null, hashMap3);
                    if (TextUtils.isEmpty(i10)) {
                        arrayList = arrayList23;
                        i = 0;
                    } else {
                        int i11 = tw21.a;
                        String[] split = i10.split(",", -1);
                        i = tw21.l(split, "public.accessibility.describes-video") ? 512 : 0;
                        arrayList = arrayList23;
                        if (tw21.l(split, "public.accessibility.transcribes-spoken-dialog")) {
                            i |= 4096;
                        }
                        if (tw21.l(split, "public.accessibility.describes-music-and-sound")) {
                            i |= 1024;
                        }
                        if (tw21.l(split, "public.easy-to-read")) {
                            i |= 8192;
                        }
                    }
                    f7sVar.f = i;
                    f7sVar.d = i(str9, m0, null, hashMap3);
                    String i12 = i(str9, pattern, null, hashMap3);
                    Uri j4 = i12 == null ? null : m4m0.j(str8, i12);
                    w820 w820Var2 = new w820(new jou(j2, j3, Collections.EMPTY_LIST));
                    String j5 = j(str9, k0, hashMap3);
                    switch (j5.hashCode()) {
                        case -959297733:
                            if (j5.equals("SUBTITLES")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -333210994:
                            if (j5.equals("CLOSED-CAPTIONS")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 62628790:
                            if (j5.equals("AUDIO")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 81665115:
                            if (j5.equals("VIDEO")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            int i13 = 0;
                            while (true) {
                                if (i13 < arrayList9.size()) {
                                    xnuVar = (xnu) arrayList9.get(i13);
                                    if (!j2.equals(xnuVar.e)) {
                                        i13++;
                                    }
                                } else {
                                    xnuVar = null;
                                }
                            }
                            if (xnuVar != null) {
                                String w3 = tw21.w(3, xnuVar.b.k);
                                f7sVar.j = w3;
                                str2 = eh20.e(w3);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            f7sVar.m = eh20.q(str2);
                            f7sVar.k = w820Var2;
                            if (j4 == null) {
                                arrayList2 = arrayList20;
                                lk91.j("EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            } else {
                                wnu wnuVar = new wnu(j4, new androidx.media3.common.a(f7sVar), j3);
                                arrayList2 = arrayList20;
                                arrayList2.add(wnuVar);
                                break;
                            }
                        case 1:
                            arrayList3 = arrayList19;
                            String j6 = j(str9, q0, hashMap3);
                            if (j6.startsWith("CC")) {
                                parseInt = Integer.parseInt(j6.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(j6.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (list == null) {
                                list = new ArrayList();
                            }
                            f7sVar.m = eh20.q(str3);
                            f7sVar.H = parseInt;
                            list.add(new androidx.media3.common.a(f7sVar));
                            arrayList19 = arrayList3;
                            arrayList2 = arrayList20;
                            break;
                        case 2:
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList9.size()) {
                                    xnuVar2 = (xnu) arrayList9.get(i14);
                                    int i15 = i14;
                                    if (!j2.equals(xnuVar2.d)) {
                                        i14 = i15 + 1;
                                    }
                                } else {
                                    xnuVar2 = null;
                                }
                            }
                            if (xnuVar2 != null) {
                                String w4 = tw21.w(1, xnuVar2.b.k);
                                f7sVar.j = w4;
                                str4 = eh20.e(w4);
                            } else {
                                str4 = null;
                            }
                            xnu xnuVar5 = xnuVar2;
                            String i16 = i(str9, B, null, hashMap3);
                            if (i16 != null) {
                                int i17 = tw21.a;
                                f7sVar.C = Integer.parseInt(i16.split("/", 2)[0]);
                                if ("audio/eac3".equals(str4) && i16.endsWith("/JOC")) {
                                    f7sVar.j = "ec+3";
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            f7sVar.d(str4);
                            if (j4 != null) {
                                f7sVar.k = w820Var2;
                                arrayList19.add(new wnu(j4, new androidx.media3.common.a(f7sVar), j3));
                            } else {
                                arrayList3 = arrayList19;
                                if (xnuVar5 != null) {
                                    arrayList19 = arrayList3;
                                    aVar2 = new androidx.media3.common.a(f7sVar);
                                }
                                arrayList19 = arrayList3;
                            }
                            arrayList2 = arrayList20;
                            break;
                        case 3:
                            int i18 = 0;
                            while (true) {
                                if (i18 < arrayList9.size()) {
                                    xnuVar3 = (xnu) arrayList9.get(i18);
                                    if (!j2.equals(xnuVar3.c)) {
                                        i18++;
                                    }
                                } else {
                                    xnuVar3 = null;
                                }
                            }
                            if (xnuVar3 != null) {
                                androidx.media3.common.a aVar3 = xnuVar3.b;
                                String w5 = tw21.w(2, aVar3.k);
                                f7sVar.j = w5;
                                f7sVar.m = eh20.q(eh20.e(w5));
                                f7sVar.t = aVar3.u;
                                f7sVar.u = aVar3.v;
                                f7sVar.v = aVar3.w;
                            }
                            if (j4 != null) {
                                f7sVar.k = w820Var2;
                                arrayList18.add(new wnu(j4, new androidx.media3.common.a(f7sVar), j3));
                            }
                            arrayList2 = arrayList20;
                            break;
                        default:
                            arrayList2 = arrayList20;
                            break;
                    }
                    arrayList23 = arrayList;
                    arrayList20 = arrayList2;
                    i8 = i9 + 1;
                    arrayList14 = arrayList25;
                    str8 = str;
                }
                ArrayList arrayList26 = arrayList23;
                ArrayList arrayList27 = arrayList20;
                if (z5) {
                    list = Collections.EMPTY_LIST;
                }
                return new ynu(str, arrayList21, arrayList26, arrayList18, arrayList19, arrayList27, arrayList17, aVar2, list, z6, hashMap3, arrayList22);
            }
            String b = aouVar.b();
            if (b.startsWith("#EXT")) {
                arrayList16.add(b);
            }
            boolean startsWith = b.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList28 = arrayList16;
            if (b.startsWith("#EXT-X-DEFINE")) {
                hashMap3.put(j(b, pattern2, hashMap3), j(b, x0, hashMap3));
            } else if (b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                arrayList7 = arrayList10;
                arrayList6 = arrayList11;
                arrayList5 = arrayList12;
                arrayList4 = arrayList15;
                z3 = z5;
                z4 = true;
                arrayList13 = arrayList17;
                arrayList16 = arrayList28;
                arrayList15 = arrayList4;
                arrayList12 = arrayList5;
                arrayList11 = arrayList6;
                arrayList10 = arrayList7;
            } else if (b.startsWith("#EXT-X-MEDIA")) {
                arrayList14.add(b);
            } else if (b.startsWith("#EXT-X-SESSION-KEY")) {
                DrmInitData.SchemeData c3 = c(b, hashMap3, i(b, g0, ClidProvider.IDENTITY, hashMap3));
                if (c3 != null) {
                    String j7 = j(b, f0, hashMap3);
                    arrayList15.add(new DrmInitData(("SAMPLE-AES-CENC".equals(j7) || "SAMPLE-AES-CTR".equals(j7)) ? "cenc" : "cbcs", c3));
                }
            } else if (b.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                boolean contains = z5 | b.contains("CLOSED-CAPTIONS=NONE");
                int i19 = startsWith ? 16384 : 0;
                z5 = contains;
                arrayList4 = arrayList15;
                int parseInt2 = Integer.parseInt(j(b, A, Collections.EMPTY_MAP));
                Matcher matcher = c.matcher(b);
                if (matcher.find()) {
                    z2 = startsWith;
                    String group = matcher.group(1);
                    group.getClass();
                    i2 = Integer.parseInt(group);
                } else {
                    z2 = startsWith;
                    i2 = -1;
                }
                arrayList5 = arrayList12;
                String i20 = i(b, C, null, hashMap3);
                arrayList6 = arrayList11;
                String i21 = i(b, D, null, hashMap3);
                arrayList7 = arrayList10;
                String i22 = i(b, E, null, hashMap3);
                if (i22 != null) {
                    int i23 = tw21.a;
                    String[] split2 = i22.split(",", 2)[0].split("/", -1);
                    str5 = split2[0];
                    if (split2.length > 1) {
                        str6 = split2[1];
                        i3 = 2;
                        w2 = tw21.w(i3, i21);
                        if (eh20.m(w2, str5)) {
                            if (str5 == null) {
                                str7 = w2;
                            } else if (i20 != null && str6 != null) {
                                str7 = w2;
                                if (i20.equals("PQ")) {
                                }
                                if (i20.equals("SDR")) {
                                }
                                if (i20.equals("HLG")) {
                                }
                            }
                            if (str5 == null) {
                                str5 = str7;
                            }
                            String x2 = tw21.x(i21);
                            i21 = x2 != null ? g8e.p(str5, ",", x2) : str5;
                        }
                        i4 = i(b, F, null, hashMap3);
                        if (i4 != null) {
                            String[] split3 = i4.split(RemoteBioParameters.X, -1);
                            i6 = Integer.parseInt(split3[0]);
                            i5 = Integer.parseInt(split3[1]);
                            if (i6 > 0) {
                            }
                        }
                        i5 = -1;
                        i6 = -1;
                        String i24 = i(b, G, null, hashMap3);
                        float parseFloat = i24 == null ? Float.parseFloat(i24) : -1.0f;
                        String i25 = i(b, w, null, hashMap3);
                        String i26 = i(b, x, null, hashMap3);
                        String i27 = i(b, y, null, hashMap3);
                        String i28 = i(b, z, null, hashMap3);
                        if (!z2) {
                            j = m4m0.j(str8, j(b, pattern, hashMap3));
                        } else {
                            if (!aouVar.a()) {
                                throw ParserException.b(null, "#EXT-X-STREAM-INF must be followed by another line");
                            }
                            j = m4m0.j(str8, k(aouVar.b(), hashMap3));
                        }
                        Uri uri2 = j;
                        f7s f7sVar2 = new f7s();
                        f7sVar2.a = Integer.toString(arrayList9.size());
                        f7sVar2.l = eh20.q("application/x-mpegURL");
                        f7sVar2.j = i21;
                        f7sVar2.h = i2;
                        f7sVar2.i = parseInt2;
                        f7sVar2.t = i6;
                        f7sVar2.u = i5;
                        f7sVar2.v = parseFloat;
                        f7sVar2.f = i19;
                        arrayList9.add(new xnu(uri2, new androidx.media3.common.a(f7sVar2), i25, i26, i27, i28));
                        arrayList8 = (ArrayList) hashMap2.get(uri2);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                            hashMap2.put(uri2, arrayList8);
                        }
                        arrayList8.add(new iou(i2, parseInt2, i25, i26, i27, i28));
                        z3 = z5;
                        z4 = z6;
                        arrayList13 = arrayList17;
                        arrayList16 = arrayList28;
                        arrayList15 = arrayList4;
                        arrayList12 = arrayList5;
                        arrayList11 = arrayList6;
                        arrayList10 = arrayList7;
                    } else {
                        i3 = 2;
                    }
                } else {
                    i3 = 2;
                    str5 = null;
                }
                str6 = null;
                w2 = tw21.w(i3, i21);
                if (eh20.m(w2, str5)) {
                }
                i4 = i(b, F, null, hashMap3);
                if (i4 != null) {
                }
                i5 = -1;
                i6 = -1;
                String i242 = i(b, G, null, hashMap3);
                if (i242 == null) {
                }
                String i252 = i(b, w, null, hashMap3);
                String i262 = i(b, x, null, hashMap3);
                String i272 = i(b, y, null, hashMap3);
                String i282 = i(b, z, null, hashMap3);
                if (!z2) {
                }
                Uri uri22 = j;
                f7s f7sVar22 = new f7s();
                f7sVar22.a = Integer.toString(arrayList9.size());
                f7sVar22.l = eh20.q("application/x-mpegURL");
                f7sVar22.j = i21;
                f7sVar22.h = i2;
                f7sVar22.i = parseInt2;
                f7sVar22.t = i6;
                f7sVar22.u = i5;
                f7sVar22.v = parseFloat;
                f7sVar22.f = i19;
                arrayList9.add(new xnu(uri22, new androidx.media3.common.a(f7sVar22), i252, i262, i272, i282));
                arrayList8 = (ArrayList) hashMap2.get(uri22);
                if (arrayList8 == null) {
                }
                arrayList8.add(new iou(i2, parseInt2, i252, i262, i272, i282));
                z3 = z5;
                z4 = z6;
                arrayList13 = arrayList17;
                arrayList16 = arrayList28;
                arrayList15 = arrayList4;
                arrayList12 = arrayList5;
                arrayList11 = arrayList6;
                arrayList10 = arrayList7;
            }
            arrayList7 = arrayList10;
            arrayList6 = arrayList11;
            arrayList5 = arrayList12;
            arrayList4 = arrayList15;
            z3 = z5;
            z4 = z6;
            arrayList13 = arrayList17;
            arrayList16 = arrayList28;
            arrayList15 = arrayList4;
            arrayList12 = arrayList5;
            arrayList11 = arrayList6;
            arrayList10 = arrayList7;
        }
    }

    public static boolean f(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d;
        }
        String group = matcher.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    public static long h(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : k(str2, map);
    }

    public static String j(String str, Pattern pattern, Map map) {
        String i = i(str, pattern, null, map);
        if (i != null) {
            return i;
        }
        throw ParserException.b(null, "Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String k(String str, Map map) {
        Matcher matcher = M0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[Catch: all -> 0x0099, LOOP:0: B:14:0x006c->B:39:0x006c, LOOP_START, TryCatch #0 {all -> 0x0099, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:14:0x006c, B:16:0x0072, B:19:0x007d, B:54:0x0085, B:21:0x009b, B:23:0x00a3, B:25:0x00ab, B:27:0x00b3, B:29:0x00bb, B:31:0x00c3, B:33:0x00cb, B:35:0x00d3, B:37:0x00dc, B:42:0x00e0, B:63:0x0102, B:64:0x0108, B:68:0x0033, B:70:0x0039, B:75:0x0042, B:77:0x004b, B:82:0x0054, B:84:0x005a, B:86:0x0060, B:88:0x0065), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102 A[Catch: all -> 0x0099, TRY_ENTER, TryCatch #0 {all -> 0x0099, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:14:0x006c, B:16:0x0072, B:19:0x007d, B:54:0x0085, B:21:0x009b, B:23:0x00a3, B:25:0x00ab, B:27:0x00b3, B:29:0x00bb, B:31:0x00c3, B:33:0x00cb, B:35:0x00d3, B:37:0x00dc, B:42:0x00e0, B:63:0x0102, B:64:0x0108, B:68:0x0033, B:70:0x0039, B:75:0x0042, B:77:0x004b, B:82:0x0054, B:84:0x005a, B:86:0x0060, B:88:0x0065), top: B:2:0x000f }] */
    @Override // defpackage.gg90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object parse(Uri uri, InputStream inputStream) {
        boolean T2;
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int read = bufferedReader.read();
            if (read == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    read = bufferedReader.read();
                }
                T2 = false;
                if (T2) {
                    throw ParserException.b(null, "Input does not start with the #EXTM3U header.");
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        tw21.g(bufferedReader);
                        throw ParserException.b(null, "Failed to parse the playlist, could not identify any tags.");
                    }
                    trim = readLine.trim();
                    if (!trim.isEmpty()) {
                        if (trim.startsWith("#EXT-X-STREAM-INF")) {
                            arrayDeque.add(trim);
                            return e(new aou(arrayDeque, bufferedReader, 0), uri.toString());
                        }
                        if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(trim);
                    }
                }
                arrayDeque.add(trim);
                return d(this.a, this.b, new aou(arrayDeque, bufferedReader, 0), uri.toString());
            }
            while (read != -1 && Character.isWhitespace(read)) {
                read = bufferedReader.read();
            }
            for (int i = 0; i < 7; i++) {
                if (read != "#EXTM3U".charAt(i)) {
                    T2 = false;
                    break;
                }
                read = bufferedReader.read();
            }
            while (read != -1 && Character.isWhitespace(read) && !tw21.T(read)) {
                read = bufferedReader.read();
            }
            T2 = tw21.T(read);
            if (T2) {
            }
        } finally {
            tw21.g(bufferedReader);
        }
    }

    public HlsPlaylistParser() {
        this(ynu.l, null);
    }
}
