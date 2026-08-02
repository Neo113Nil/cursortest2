package one.video.exo.datasource.hls.parser;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import androidx.media3.exoplayer.hls.playlist.b;
import androidx.media3.exoplayer.hls.playlist.c;
import androidx.media3.exoplayer.upstream.c;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import one.video.player.OneVideoPlayer;
import one.video.player.manifest.ManifestValidationErrorType;
import one.video.player.model.VideoContentType;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ahn;
import xsna.bvk;
import xsna.fe60;
import xsna.fi20;
import xsna.fl80;
import xsna.fo8;
import xsna.fxc0;
import xsna.io20;
import xsna.lj00;
import xsna.neq0;
import xsna.o9v;
import xsna.pzl;
import xsna.qoy;
import xsna.sd9;
import xsna.tu8;
import xsna.u9v;
import xsna.uhf0;
import xsna.w9v;
import xsna.xae0;
import xsna.y2r0;

/* loaded from: classes8.dex */
public final class OneVideoHlsPlaylistParser implements c.a<o9v> {
    public final androidx.media3.exoplayer.hls.playlist.c a;

    @Nullable
    public final b b;
    public final Handler c = new Handler(Looper.getMainLooper());

    @Nullable
    public final fe60 d;

    @Nullable
    public final OneVideoPlayer.b e;
    public final HashSet<w9v> f;
    public final lj00 g;
    public static final Pattern h = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern i = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern j = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern k = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern l = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern m = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern n = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern o = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern p = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern q = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern r = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern s = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern t = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern u = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern v = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern w = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern x = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern y = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern z = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern A = b("CAN-SKIP-DATERANGES");
    public static final Pattern B = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern C = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern D = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern E = b("CAN-BLOCK-RELOAD");
    public static final Pattern F = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern G = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern H = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern I = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern J = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern K = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern L = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern M = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern N = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern O = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern P = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern Q = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern R = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern S = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern T = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern U = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern V = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern W = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern X = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern Y = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern Z = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern a0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern b0 = b("AUTOSELECT");
    public static final Pattern c0 = b("DEFAULT");
    public static final Pattern d0 = b("FORCED");
    public static final Pattern e0 = b("INDEPENDENT");
    public static final Pattern f0 = b("GAP");
    public static final Pattern g0 = b("PRECISE");
    public static final Pattern h0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern i0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern j0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern k0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern l0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern m0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern n0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern o0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern p0 = b("END-ON-NEXT");
    public static final Pattern q0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern r0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern s0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern t0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern u0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern v0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern w0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern x0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern y0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern z0 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    public static final Pattern A0 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    public static final Pattern B0 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    public static final Pattern C0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern D0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");
    public static final Pattern E0 = Pattern.compile("#EXT-X-VK-PLAYBACK-DURATION:(\\d+)\\b");

    public static final class DeltaUpdateException extends IOException {
    }

    public static class a {
        public final BufferedReader a;
        public final ArrayDeque b;

        @Nullable
        public String c;

        public a(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
            this.b = arrayDeque;
            this.a = bufferedReader;
        }

        public final boolean a() throws IOException {
            String trim;
            if (this.c == null) {
                ArrayDeque arrayDeque = this.b;
                if (!arrayDeque.isEmpty()) {
                    String str = (String) arrayDeque.poll();
                    str.getClass();
                    this.c = str;
                    return true;
                }
                do {
                    String readLine = this.a.readLine();
                    this.c = readLine;
                    if (readLine == null) {
                        return false;
                    }
                    trim = readLine.trim();
                    this.c = trim;
                } while (trim.isEmpty());
            }
            return true;
        }

        public final String b() throws IOException {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.c;
            this.c = null;
            return str;
        }
    }

    public OneVideoHlsPlaylistParser(androidx.media3.exoplayer.hls.playlist.c cVar, @Nullable b bVar, @Nullable fe60 fe60Var, @Nullable OneVideoPlayer.b bVar2, @Nullable lj00 lj00Var, @NonNull Set<w9v> set) {
        HashSet<w9v> hashSet = new HashSet<>();
        this.f = hashSet;
        this.a = cVar;
        this.b = bVar;
        this.d = fe60Var;
        this.e = bVar2;
        this.g = lj00Var;
        hashSet.addAll(set);
    }

    public static Pattern b(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static DrmInitData c(@Nullable String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i2 = 0; i2 < schemeDataArr.length; i2++) {
            schemeDataArr2[i2] = schemeDataArr[i2].a(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    @Nullable
    public static DrmInitData.SchemeData f(String str, HashMap hashMap, String str2) throws ParserException {
        String l2 = l(str, R, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = S;
        if (equals) {
            String m2 = m(str, pattern, hashMap);
            return new DrmInitData.SchemeData(tu8.d, MimeTypes.VIDEO_MP4, Base64.decode(m2.substring(m2.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = tu8.d;
            String str3 = y2r0.a;
            return new DrmInitData.SchemeData(uuid, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(l2)) {
            return null;
        }
        String m3 = m(str, pattern, hashMap);
        byte[] decode = Base64.decode(m3.substring(m3.indexOf(44)), 0);
        UUID uuid2 = tu8.e;
        return new DrmInitData.SchemeData(uuid2, MimeTypes.VIDEO_MP4, xae0.b(uuid2, null, decode));
    }

    /* JADX WARN: Code restructure failed: missing block: B:179:0x0841, code lost:
    
        if (r7.equals("POINT") != false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x085f, code lost:
    
        if (r7.equals("HIGHLIGHT") != false) goto L347;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0887  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0a43  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0a4a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0877  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b g(androidx.media3.exoplayer.hls.playlist.c cVar, @Nullable b bVar, a aVar, String str) throws IOException {
        ArrayList arrayList;
        b.c cVar2;
        HashMap hashMap;
        ArrayList arrayList2;
        TreeMap treeMap;
        String str2;
        long j2;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList3;
        long j3;
        b.e eVar;
        int i2;
        long j4;
        String str3;
        int i3;
        DrmInitData drmInitData;
        long j5;
        long j6;
        DrmInitData drmInitData2;
        HashMap hashMap2;
        ArrayList arrayList4;
        int i4;
        ArrayList arrayList5;
        String str4;
        b.e eVar2;
        int i5;
        DrmInitData drmInitData3;
        int i6;
        long j7;
        DrmInitData drmInitData4;
        long j8;
        String str5;
        String l2;
        String str6;
        Matcher matcher;
        String str7;
        char c;
        ArrayList arrayList6;
        long j9;
        ArrayList arrayList7;
        b.a aVar2;
        int i7;
        char c2;
        androidx.media3.exoplayer.hls.playlist.c cVar3 = cVar;
        b bVar2 = bVar;
        boolean z2 = cVar3.c;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        b.g gVar = new b.g(C.TIME_UNSET, false, C.TIME_UNSET, C.TIME_UNSET, false);
        TreeMap treeMap2 = new TreeMap();
        String str8 = "";
        boolean z3 = z2;
        String str9 = "";
        long j10 = -9223372036854775807L;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = -1;
        b.c cVar4 = null;
        String str10 = null;
        DrmInitData drmInitData5 = null;
        String str11 = null;
        DrmInitData drmInitData6 = null;
        int i8 = 0;
        int i9 = 1;
        boolean z4 = false;
        boolean z5 = false;
        int i10 = 0;
        b.e eVar3 = null;
        int i11 = 0;
        String str12 = null;
        int i12 = 0;
        boolean z6 = false;
        int i13 = 0;
        long j19 = -9223372036854775807L;
        long j20 = -9223372036854775807L;
        long j21 = 0;
        boolean z7 = false;
        while (aVar.a()) {
            String b = aVar.b();
            if (b.startsWith("#EXT")) {
                arrayList11.add(b);
            }
            if (b.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String m2 = m(b, y, hashMap3);
                if ("VOD".equals(m2)) {
                    i8 = 1;
                } else if ("EVENT".equals(m2)) {
                    i8 = 2;
                }
            } else if (b.equals("#EXT-X-I-FRAMES-ONLY")) {
                z6 = true;
            } else {
                if (b.startsWith("#EXT-X-START")) {
                    arrayList = arrayList11;
                    long parseDouble = (long) (Double.parseDouble(m(b, K, Collections.EMPTY_MAP)) * 1000000.0d);
                    z7 = i(b, g0);
                    linkedHashMap2 = linkedHashMap2;
                    j10 = parseDouble;
                } else {
                    arrayList = arrayList11;
                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                    if (b.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double j22 = j(b, z, -9.223372036854776E18d);
                        long j23 = j22 == -9.223372036854776E18d ? -9223372036854775807L : (long) (j22 * 1000000.0d);
                        boolean i14 = i(b, A);
                        double j24 = j(b, C, -9.223372036854776E18d);
                        long j25 = j24 == -9.223372036854776E18d ? -9223372036854775807L : (long) (j24 * 1000000.0d);
                        double j26 = j(b, D, -9.223372036854776E18d);
                        linkedHashMap2 = linkedHashMap3;
                        arrayList11 = arrayList;
                        gVar = new b.g(j23, i14, j25, j26 == -9.223372036854776E18d ? -9223372036854775807L : (long) (j26 * 1000000.0d), i(b, E));
                    } else if (b.startsWith("#EXT-X-PART-INF")) {
                        j20 = (long) (Double.parseDouble(m(b, w, Collections.EMPTY_MAP)) * 1000000.0d);
                        linkedHashMap2 = linkedHashMap3;
                    } else {
                        boolean startsWith = b.startsWith("#EXT-X-MAP");
                        Pattern pattern = M;
                        b.g gVar2 = gVar;
                        Pattern pattern2 = S;
                        if (startsWith) {
                            String m3 = m(b, pattern2, hashMap3);
                            String l3 = l(b, pattern, null, hashMap3);
                            if (l3 != null) {
                                String str13 = y2r0.a;
                                String[] split = l3.split("@", -1);
                                j18 = Long.parseLong(split[i12]);
                                if (split.length > 1) {
                                    j11 = Long.parseLong(split[1]);
                                }
                            }
                            long j27 = j18;
                            long j28 = j27 == -1 ? 0L : j11;
                            if (str12 != null && str11 == null) {
                                throw ParserException.b(null, "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                            }
                            b.e eVar4 = new b.e(j28, j27, m3, str12, str11);
                            String str14 = str11;
                            if (j27 != -1) {
                                j28 += j27;
                            }
                            j11 = j28;
                            linkedHashMap2 = linkedHashMap3;
                            eVar3 = eVar4;
                            j18 = -1;
                            arrayList11 = arrayList;
                            gVar = gVar2;
                            str11 = str14;
                        } else {
                            String str15 = str11;
                            ArrayList arrayList12 = arrayList9;
                            ArrayList arrayList13 = arrayList10;
                            if (b.startsWith("#EXT-X-TARGETDURATION")) {
                                j19 = Integer.parseInt(m(b, t, Collections.EMPTY_MAP)) * 1000000;
                            } else if (b.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j13 = Long.parseLong(m(b, F, Collections.EMPTY_MAP));
                                linkedHashMap2 = linkedHashMap3;
                                arrayList9 = arrayList12;
                                j21 = j13;
                                arrayList11 = arrayList;
                                gVar = gVar2;
                                str11 = str15;
                                arrayList10 = arrayList13;
                            } else if (b.startsWith("#EXT-X-VERSION")) {
                                i9 = Integer.parseInt(m(b, x, Collections.EMPTY_MAP));
                            } else {
                                if (b.startsWith("#EXT-X-DEFINE")) {
                                    String l4 = l(b, i0, null, hashMap3);
                                    if (l4 != null) {
                                        String str16 = cVar3.l.get(l4);
                                        if (str16 != null) {
                                            hashMap3.put(l4, str16);
                                        }
                                    } else {
                                        hashMap3.put(m(b, X, hashMap3), m(b, h0, hashMap3));
                                    }
                                } else if (b.startsWith("#EXTINF")) {
                                    j16 = new BigDecimal(m(b, G, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                                    str9 = l(b, H, str8, hashMap3);
                                } else if (b.startsWith("#EXT-X-SKIP")) {
                                    int parseInt = Integer.parseInt(m(b, B, Collections.EMPTY_MAP));
                                    fxc0.z((bVar2 == null || !arrayList8.isEmpty()) ? i12 : 1);
                                    String str17 = y2r0.a;
                                    long j29 = bVar2.k;
                                    ImmutableList immutableList = bVar2.r;
                                    int i15 = (int) (j21 - j29);
                                    int i16 = parseInt + i15;
                                    if (i15 < 0 || i16 > immutableList.size()) {
                                        throw new DeltaUpdateException();
                                    }
                                    long j30 = j12;
                                    while (i15 < i16) {
                                        b.e eVar5 = (b.e) immutableList.get(i15);
                                        int i17 = i16;
                                        int i18 = i15;
                                        if (j21 != bVar2.k) {
                                            eVar5 = eVar5.a((bVar2.j - i10) + eVar5.e, j30);
                                        }
                                        arrayList8.add(eVar5);
                                        long j31 = eVar5.d;
                                        String str18 = eVar5.i;
                                        j15 = j30 + j31;
                                        long j32 = eVar5.k;
                                        if (j32 != -1) {
                                            j11 = eVar5.j + j32;
                                        }
                                        int i19 = eVar5.e;
                                        b.e eVar6 = eVar5.c;
                                        DrmInitData drmInitData7 = eVar5.g;
                                        String str19 = eVar5.h;
                                        if (str18 == null || !str18.equals(Long.toHexString(j13))) {
                                            str15 = str18;
                                        }
                                        j13++;
                                        i11 = i19;
                                        eVar3 = eVar6;
                                        str12 = str19;
                                        i16 = i17;
                                        drmInitData6 = drmInitData7;
                                        j30 = j15;
                                        i15 = i18 + 1;
                                    }
                                    cVar3 = cVar;
                                    j12 = j30;
                                } else if (b.startsWith("#EXT-X-KEY")) {
                                    String m4 = m(b, P, hashMap3);
                                    String l5 = l(b, Q, "identity", hashMap3);
                                    if ("NONE".equals(m4)) {
                                        treeMap2.clear();
                                        str11 = null;
                                    } else {
                                        String l6 = l(b, T, null, hashMap3);
                                        if (!"identity".equals(l5)) {
                                            if (str10 == null) {
                                                str10 = ("SAMPLE-AES-CENC".equals(m4) || "SAMPLE-AES-CTR".equals(m4)) ? C.CENC_TYPE_cenc : C.CENC_TYPE_cbcs;
                                            }
                                            DrmInitData.SchemeData f = f(b, hashMap3, l5);
                                            if (f != null) {
                                                treeMap2.put(l5, f);
                                                str11 = l6;
                                            }
                                        } else if ("AES-128".equals(m4)) {
                                            str12 = m(b, pattern2, hashMap3);
                                            str11 = l6;
                                            cVar3 = cVar;
                                            linkedHashMap2 = linkedHashMap3;
                                            arrayList9 = arrayList12;
                                            arrayList11 = arrayList;
                                            gVar = gVar2;
                                            arrayList10 = arrayList13;
                                        }
                                        str11 = l6;
                                        str12 = null;
                                        cVar3 = cVar;
                                        linkedHashMap2 = linkedHashMap3;
                                        arrayList9 = arrayList12;
                                        arrayList11 = arrayList;
                                        gVar = gVar2;
                                        arrayList10 = arrayList13;
                                    }
                                    drmInitData6 = null;
                                    str12 = null;
                                    cVar3 = cVar;
                                    linkedHashMap2 = linkedHashMap3;
                                    arrayList9 = arrayList12;
                                    arrayList11 = arrayList;
                                    gVar = gVar2;
                                    arrayList10 = arrayList13;
                                } else {
                                    if (b.startsWith("#EXT-X-BYTERANGE")) {
                                        String m5 = m(b, L, hashMap3);
                                        String str20 = y2r0.a;
                                        String[] split2 = m5.split("@", -1);
                                        j18 = Long.parseLong(split2[i12]);
                                        if (split2.length > 1) {
                                            j11 = Long.parseLong(split2[1]);
                                        }
                                    } else if (b.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                        i10 = Integer.parseInt(b.substring(b.indexOf(58) + 1));
                                        cVar3 = cVar;
                                        linkedHashMap2 = linkedHashMap3;
                                        arrayList9 = arrayList12;
                                        arrayList11 = arrayList;
                                        gVar = gVar2;
                                        str11 = str15;
                                        arrayList10 = arrayList13;
                                        z5 = true;
                                    } else if (b.equals("#EXT-X-DISCONTINUITY")) {
                                        i11++;
                                    } else if (b.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                        if (j14 == 0) {
                                            j14 = y2r0.S(y2r0.V(b.substring(b.indexOf(58) + 1))) - j12;
                                        }
                                    } else if (b.equals("#EXT-X-GAP")) {
                                        cVar3 = cVar;
                                        linkedHashMap2 = linkedHashMap3;
                                        arrayList9 = arrayList12;
                                        arrayList11 = arrayList;
                                        gVar = gVar2;
                                        str11 = str15;
                                        arrayList10 = arrayList13;
                                        i13 = 1;
                                    } else if (b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                        cVar3 = cVar;
                                        linkedHashMap2 = linkedHashMap3;
                                        arrayList9 = arrayList12;
                                        arrayList11 = arrayList;
                                        gVar = gVar2;
                                        str11 = str15;
                                        arrayList10 = arrayList13;
                                        z3 = true;
                                    } else if (b.equals("#EXT-X-ENDLIST")) {
                                        cVar3 = cVar;
                                        linkedHashMap2 = linkedHashMap3;
                                        arrayList9 = arrayList12;
                                        arrayList11 = arrayList;
                                        gVar = gVar2;
                                        str11 = str15;
                                        arrayList10 = arrayList13;
                                        z4 = true;
                                    } else if (b.startsWith("#EXT-X-RENDITION-REPORT")) {
                                        long k2 = k(b, I);
                                        Matcher matcher2 = J.matcher(b);
                                        if (matcher2.find()) {
                                            String group = matcher2.group(1);
                                            group.getClass();
                                            i3 = Integer.parseInt(group);
                                        } else {
                                            i3 = -1;
                                        }
                                        arrayList13.add(new b.d(Uri.parse(neq0.c(str, m(b, pattern2, hashMap3))), k2, i3));
                                    } else {
                                        if (b.startsWith("#EXT-X-PRELOAD-HINT")) {
                                            if (cVar4 == null && "PART".equals(m(b, V, hashMap3))) {
                                                String m6 = m(b, pattern2, hashMap3);
                                                long k3 = k(b, N);
                                                long k4 = k(b, O);
                                                String hexString = str12 == null ? null : str15 != null ? str15 : Long.toHexString(j13);
                                                if (drmInitData6 != null || treeMap2.isEmpty()) {
                                                    drmInitData = drmInitData6;
                                                } else {
                                                    DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap2.values().toArray(new DrmInitData.SchemeData[i12]);
                                                    DrmInitData drmInitData8 = new DrmInitData(str10, schemeDataArr);
                                                    if (drmInitData5 == null) {
                                                        drmInitData5 = c(str10, schemeDataArr);
                                                    }
                                                    drmInitData = drmInitData8;
                                                }
                                                if (k3 == -1 || k4 != -1) {
                                                    cVar4 = new b.c(m6, eVar3, 0L, i11, j15, drmInitData, str12, hexString, k3 != -1 ? k3 : 0L, k4, false, false, true);
                                                }
                                                arrayList10 = arrayList13;
                                                linkedHashMap2 = linkedHashMap3;
                                                arrayList9 = arrayList12;
                                                drmInitData6 = drmInitData;
                                                arrayList11 = arrayList;
                                                gVar = gVar2;
                                                str11 = str15;
                                                i12 = 0;
                                            } else {
                                                arrayList13 = arrayList13;
                                            }
                                        } else if (b.startsWith("#EXT-X-PART")) {
                                            String hexString2 = str12 == null ? null : str15 != null ? str15 : Long.toHexString(j13);
                                            String m7 = m(b, pattern2, hashMap3);
                                            long parseDouble2 = (long) (Double.parseDouble(m(b, u, Collections.EMPTY_MAP)) * 1000000.0d);
                                            boolean i20 = i(b, e0) | (z3 && arrayList12.isEmpty());
                                            boolean i21 = i(b, f0);
                                            String l7 = l(b, pattern, null, hashMap3);
                                            if (l7 != null) {
                                                String str21 = y2r0.a;
                                                String[] split3 = l7.split("@", -1);
                                                long parseLong = Long.parseLong(split3[0]);
                                                j5 = parseDouble2;
                                                if (split3.length > 1) {
                                                    j17 = Long.parseLong(split3[1]);
                                                }
                                                j6 = parseLong;
                                            } else {
                                                j5 = parseDouble2;
                                                j6 = -1;
                                            }
                                            long j33 = j6 == -1 ? 0L : j17;
                                            if (drmInitData6 != null || treeMap2.isEmpty()) {
                                                drmInitData2 = drmInitData6;
                                            } else {
                                                DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap2.values().toArray(new DrmInitData.SchemeData[0]);
                                                DrmInitData drmInitData9 = new DrmInitData(str10, schemeDataArr2);
                                                if (drmInitData5 == null) {
                                                    drmInitData5 = c(str10, schemeDataArr2);
                                                }
                                                drmInitData2 = drmInitData9;
                                            }
                                            b.e eVar7 = eVar3;
                                            int i22 = i11;
                                            arrayList12.add(new b.c(m7, eVar3, j5, i11, j15, drmInitData2, str12, hexString2, j33, j6, i21, i20, false));
                                            j15 += j5;
                                            if (j6 != -1) {
                                                j33 += j6;
                                            }
                                            j17 = j33;
                                            eVar3 = eVar7;
                                            i11 = i22;
                                            arrayList9 = arrayList12;
                                            linkedHashMap2 = linkedHashMap3;
                                            drmInitData6 = drmInitData2;
                                            arrayList11 = arrayList;
                                            gVar = gVar2;
                                            str11 = str15;
                                            i12 = 0;
                                            arrayList10 = arrayList13;
                                        } else {
                                            b.e eVar8 = eVar3;
                                            int i23 = i11;
                                            if (b.startsWith("#EXT-X-DATERANGE") && l(b, k0, str8, hashMap3).equals("com.apple.hls.interstitial")) {
                                                String m8 = m(b, j0, hashMap3);
                                                eVar = eVar8;
                                                String l8 = l(b, q0, null, hashMap3);
                                                Uri parse = l8 != null ? Uri.parse(l8) : null;
                                                i4 = i23;
                                                String l9 = l(b, r0, null, hashMap3);
                                                Uri parse2 = l9 != null ? Uri.parse(l9) : null;
                                                arrayList5 = arrayList12;
                                                String l10 = l(b, l0, null, hashMap3);
                                                if (l10 != null) {
                                                    str2 = str8;
                                                    j8 = y2r0.S(y2r0.V(l10));
                                                } else {
                                                    str2 = str8;
                                                    j8 = -9223372036854775807L;
                                                }
                                                String l11 = l(b, n0, null, hashMap3);
                                                long S2 = l11 != null ? y2r0.S(y2r0.V(l11)) : -9223372036854775807L;
                                                ArrayList arrayList14 = new ArrayList();
                                                treeMap = treeMap2;
                                                String l12 = l(b, m0, null, hashMap3);
                                                if (l12 != null) {
                                                    String str22 = y2r0.a;
                                                    String[] split4 = l12.split(StringUtils.COMMA, -1);
                                                    int length = split4.length;
                                                    int i24 = 0;
                                                    while (i24 < length) {
                                                        int i25 = length;
                                                        String trim = split4[i24].trim();
                                                        trim.getClass();
                                                        switch (trim.hashCode()) {
                                                            case 79491:
                                                                i7 = i24;
                                                                if (trim.equals("PRE")) {
                                                                    c2 = 0;
                                                                    break;
                                                                }
                                                                c2 = 65535;
                                                                break;
                                                            case 2430593:
                                                                i7 = i24;
                                                                if (trim.equals("ONCE")) {
                                                                    c2 = 1;
                                                                    break;
                                                                }
                                                                c2 = 65535;
                                                                break;
                                                            case 2461856:
                                                                i7 = i24;
                                                                if (trim.equals("POST")) {
                                                                    c2 = 2;
                                                                    break;
                                                                }
                                                                c2 = 65535;
                                                                break;
                                                            default:
                                                                i7 = i24;
                                                                c2 = 65535;
                                                                break;
                                                        }
                                                        switch (c2) {
                                                            case 0:
                                                            case 1:
                                                            case 2:
                                                                arrayList14.add(trim);
                                                                break;
                                                        }
                                                        i24 = i7 + 1;
                                                        length = i25;
                                                    }
                                                }
                                                str4 = str10;
                                                double j34 = j(b, v, -1.0d);
                                                long j35 = j34 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? (long) (j34 * 1000000.0d) : -9223372036854775807L;
                                                hashMap2 = hashMap4;
                                                arrayList4 = arrayList8;
                                                double j36 = j(b, o0, -1.0d);
                                                long j37 = j36 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? (long) (j36 * 1000000.0d) : -9223372036854775807L;
                                                boolean i26 = i(b, p0);
                                                cVar2 = cVar4;
                                                arrayList13 = arrayList13;
                                                double j38 = j(b, s0, Double.MIN_VALUE);
                                                long j39 = j38 != Double.MIN_VALUE ? (long) (j38 * 1000000.0d) : -9223372036854775807L;
                                                double j40 = j(b, t0, -1.0d);
                                                long j41 = j40 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? (long) (j40 * 1000000.0d) : -9223372036854775807L;
                                                ArrayList arrayList15 = new ArrayList();
                                                long j42 = j41;
                                                String l13 = l(b, u0, null, hashMap3);
                                                if (l13 != null) {
                                                    String str23 = y2r0.a;
                                                    String[] split5 = l13.split(StringUtils.COMMA, -1);
                                                    int length2 = split5.length;
                                                    int i27 = 0;
                                                    while (i27 < length2) {
                                                        int i28 = i27;
                                                        String trim2 = split5[i27].trim();
                                                        trim2.getClass();
                                                        int i29 = length2;
                                                        if (trim2.equals("IN") || trim2.equals("OUT")) {
                                                            arrayList15.add(trim2);
                                                        }
                                                        i27 = i28 + 1;
                                                        length2 = i29;
                                                    }
                                                }
                                                ArrayList arrayList16 = new ArrayList();
                                                String l14 = l(b, v0, null, hashMap3);
                                                if (l14 != null) {
                                                    String str24 = y2r0.a;
                                                    String[] split6 = l14.split(StringUtils.COMMA, -1);
                                                    int length3 = split6.length;
                                                    int i30 = 0;
                                                    while (i30 < length3) {
                                                        String[] strArr = split6;
                                                        String trim3 = split6[i30].trim();
                                                        trim3.getClass();
                                                        int i31 = length3;
                                                        if (trim3.equals("JUMP") || trim3.equals(BatchApiRequest.FIELD_VALUE_ON_ERROR_SKIP)) {
                                                            arrayList16.add(trim3);
                                                        }
                                                        i30++;
                                                        length3 = i31;
                                                        split6 = strArr;
                                                    }
                                                }
                                                Boolean valueOf = l(b, w0, null, hashMap3) != null ? Boolean.valueOf(!r1.equals("NO")) : null;
                                                String l15 = l(b, x0, null, hashMap3);
                                                if (l15 != null) {
                                                    str5 = "RANGE";
                                                    if (!l15.equals("RANGE")) {
                                                        str5 = "POINT";
                                                    }
                                                    String str25 = str5;
                                                    l2 = l(b, y0, null, hashMap3);
                                                    if (l2 != null) {
                                                        str6 = "PRIMARY";
                                                        if (!l2.equals("PRIMARY")) {
                                                            str6 = "HIGHLIGHT";
                                                        }
                                                        Boolean bool = valueOf;
                                                        String str26 = str6;
                                                        double j43 = j(b, z0, -1.0d);
                                                        long j44 = j43 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? (long) (j43 * 1000000.0d) : -9223372036854775807L;
                                                        double j45 = j(b, A0, -1.0d);
                                                        long j46 = j45 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? (long) (j45 * 1000000.0d) : -9223372036854775807L;
                                                        String l16 = l(b, B0, null, hashMap3);
                                                        ArrayList arrayList17 = new ArrayList();
                                                        String substring = b.substring(17);
                                                        matcher = D0.matcher(substring);
                                                        while (matcher.find()) {
                                                            Matcher matcher3 = matcher;
                                                            String group2 = matcher3.group();
                                                            group2.getClass();
                                                            switch (group2.hashCode()) {
                                                                case -2136701954:
                                                                    str7 = l16;
                                                                    if (group2.equals("X-SNAP=")) {
                                                                        c = 0;
                                                                        break;
                                                                    }
                                                                    c = 65535;
                                                                    break;
                                                                case -1843050726:
                                                                    str7 = l16;
                                                                    if (group2.equals("X-CONTENT-MAY-VARY=")) {
                                                                        c = 1;
                                                                        break;
                                                                    }
                                                                    c = 65535;
                                                                    break;
                                                                case -148960310:
                                                                    str7 = l16;
                                                                    if (group2.equals("X-PLAYOUT-LIMIT=")) {
                                                                        c = 2;
                                                                        break;
                                                                    }
                                                                    c = 65535;
                                                                    break;
                                                                case -36345757:
                                                                    str7 = l16;
                                                                    if (group2.equals("X-TIMELINE-STYLE=")) {
                                                                        c = 3;
                                                                        break;
                                                                    }
                                                                    c = 65535;
                                                                    break;
                                                                case 397239341:
                                                                    str7 = l16;
                                                                    if (group2.equals("X-ASSET-LIST=")) {
                                                                        c = 4;
                                                                        break;
                                                                    }
                                                                    c = 65535;
                                                                    break;
                                                                case 850193465:
                                                                    str7 = l16;
                                                                    if (group2.equals("X-TIMELINE-OCCUPIES=")) {
                                                                        c = 5;
                                                                        break;
                                                                    }
                                                                    c = 65535;
                                                                    break;
                                                                case 1065650400:
                                                                    str7 = l16;
                                                                    if (group2.equals("X-SKIP-CONTROL-DURATION=")) {
                                                                        c = 6;
                                                                        break;
                                                                    }
                                                                    c = 65535;
                                                                    break;
                                                                case 1274498945:
                                                                    str7 = l16;
                                                                    if (group2.equals("X-SKIP-CONTROL-OFFSET=")) {
                                                                        c = 7;
                                                                        break;
                                                                    }
                                                                    c = 65535;
                                                                    break;
                                                                case 1472528844:
                                                                    str7 = l16;
                                                                    if (group2.equals("X-RESTRICT=")) {
                                                                        c = '\b';
                                                                        break;
                                                                    }
                                                                    c = 65535;
                                                                    break;
                                                                case 1748487807:
                                                                    str7 = l16;
                                                                    if (group2.equals("X-RESUME-OFFSET=")) {
                                                                        c = '\t';
                                                                        break;
                                                                    }
                                                                    c = 65535;
                                                                    break;
                                                                case 1814205923:
                                                                    str7 = l16;
                                                                    if (group2.equals("X-ASSET-URI=")) {
                                                                        c = '\n';
                                                                        break;
                                                                    }
                                                                    c = 65535;
                                                                    break;
                                                                case 2080546752:
                                                                    str7 = l16;
                                                                    if (group2.equals("X-SKIP-CONTROL-LABEL-ID=")) {
                                                                        c = 11;
                                                                        break;
                                                                    }
                                                                    c = 65535;
                                                                    break;
                                                                default:
                                                                    str7 = l16;
                                                                    c = 65535;
                                                                    break;
                                                            }
                                                            switch (c) {
                                                                case 0:
                                                                case 1:
                                                                case 2:
                                                                case 3:
                                                                case 4:
                                                                case 5:
                                                                case 6:
                                                                case 7:
                                                                case '\b':
                                                                case '\t':
                                                                case '\n':
                                                                case 11:
                                                                    arrayList6 = arrayList16;
                                                                    j9 = j37;
                                                                    arrayList7 = arrayList14;
                                                                    break;
                                                                default:
                                                                    arrayList6 = arrayList16;
                                                                    String c3 = qoy.c(1, 0, group2);
                                                                    String a2 = fo8.a(c3, "=");
                                                                    int length4 = a2.length() + substring.indexOf(a2);
                                                                    arrayList7 = arrayList14;
                                                                    String substring2 = substring.substring(length4, (substring.length() == length4 + 1 ? 1 : 2) + length4);
                                                                    if (substring2.startsWith("\"")) {
                                                                        aVar2 = new b.a(c3, m(substring, Pattern.compile(c3 + "=\"((?:.|\f)+?)\""), hashMap3), 0);
                                                                        j9 = j37;
                                                                    } else if (substring2.equals("0x") || substring2.equals("0X")) {
                                                                        j9 = j37;
                                                                        aVar2 = new b.a(c3, m(substring, Pattern.compile(c3 + "=(0[xX][A-F0-9]+)"), hashMap3), 1);
                                                                    } else {
                                                                        j9 = j37;
                                                                        aVar2 = new b.a(c3, Double.parseDouble(m(substring, Pattern.compile(c3 + "=([\\d\\.]+)\\b"), Collections.EMPTY_MAP)));
                                                                    }
                                                                    arrayList17.add(aVar2);
                                                                    break;
                                                            }
                                                            matcher = matcher3;
                                                            l16 = str7;
                                                            arrayList16 = arrayList6;
                                                            arrayList14 = arrayList7;
                                                            j37 = j9;
                                                        }
                                                        ArrayList arrayList18 = arrayList16;
                                                        String str27 = l16;
                                                        long j47 = j37;
                                                        ArrayList arrayList19 = arrayList14;
                                                        linkedHashMap = linkedHashMap3;
                                                        b.C0058b.a aVar3 = linkedHashMap.containsKey(m8) ? (b.C0058b.a) linkedHashMap.get(m8) : new b.C0058b.a(m8);
                                                        aVar3.c(parse);
                                                        aVar3.b(parse2);
                                                        aVar3.r(j8);
                                                        aVar3.h(S2);
                                                        aVar3.g(j35);
                                                        aVar3.j(j47);
                                                        aVar3.f(arrayList19);
                                                        aVar3.i(i26);
                                                        aVar3.m(j39);
                                                        aVar3.k(j42);
                                                        aVar3.q(arrayList15);
                                                        aVar3.l(arrayList18);
                                                        aVar3.d(arrayList17);
                                                        aVar3.e(bool);
                                                        aVar3.s(str25);
                                                        aVar3.t(str26);
                                                        aVar3.p(j44);
                                                        aVar3.n(j46);
                                                        aVar3.o(str27);
                                                        linkedHashMap.put(m8, aVar3);
                                                    }
                                                    str6 = null;
                                                    Boolean bool2 = valueOf;
                                                    String str262 = str6;
                                                    double j432 = j(b, z0, -1.0d);
                                                    long j442 = j432 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? (long) (j432 * 1000000.0d) : -9223372036854775807L;
                                                    double j452 = j(b, A0, -1.0d);
                                                    long j462 = j452 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? (long) (j452 * 1000000.0d) : -9223372036854775807L;
                                                    String l162 = l(b, B0, null, hashMap3);
                                                    ArrayList arrayList172 = new ArrayList();
                                                    String substring3 = b.substring(17);
                                                    matcher = D0.matcher(substring3);
                                                    while (matcher.find()) {
                                                    }
                                                    ArrayList arrayList182 = arrayList16;
                                                    String str272 = l162;
                                                    long j472 = j37;
                                                    ArrayList arrayList192 = arrayList14;
                                                    linkedHashMap = linkedHashMap3;
                                                    if (linkedHashMap.containsKey(m8)) {
                                                    }
                                                    aVar3.c(parse);
                                                    aVar3.b(parse2);
                                                    aVar3.r(j8);
                                                    aVar3.h(S2);
                                                    aVar3.g(j35);
                                                    aVar3.j(j472);
                                                    aVar3.f(arrayList192);
                                                    aVar3.i(i26);
                                                    aVar3.m(j39);
                                                    aVar3.k(j42);
                                                    aVar3.q(arrayList15);
                                                    aVar3.l(arrayList182);
                                                    aVar3.d(arrayList172);
                                                    aVar3.e(bool2);
                                                    aVar3.s(str25);
                                                    aVar3.t(str262);
                                                    aVar3.p(j442);
                                                    aVar3.n(j462);
                                                    aVar3.o(str272);
                                                    linkedHashMap.put(m8, aVar3);
                                                }
                                                str5 = null;
                                                String str252 = str5;
                                                l2 = l(b, y0, null, hashMap3);
                                                if (l2 != null) {
                                                }
                                                str6 = null;
                                                Boolean bool22 = valueOf;
                                                String str2622 = str6;
                                                double j4322 = j(b, z0, -1.0d);
                                                long j4422 = j4322 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? (long) (j4322 * 1000000.0d) : -9223372036854775807L;
                                                double j4522 = j(b, A0, -1.0d);
                                                long j4622 = j4522 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? (long) (j4522 * 1000000.0d) : -9223372036854775807L;
                                                String l1622 = l(b, B0, null, hashMap3);
                                                ArrayList arrayList1722 = new ArrayList();
                                                String substring32 = b.substring(17);
                                                matcher = D0.matcher(substring32);
                                                while (matcher.find()) {
                                                }
                                                ArrayList arrayList1822 = arrayList16;
                                                String str2722 = l1622;
                                                long j4722 = j37;
                                                ArrayList arrayList1922 = arrayList14;
                                                linkedHashMap = linkedHashMap3;
                                                if (linkedHashMap.containsKey(m8)) {
                                                }
                                                aVar3.c(parse);
                                                aVar3.b(parse2);
                                                aVar3.r(j8);
                                                aVar3.h(S2);
                                                aVar3.g(j35);
                                                aVar3.j(j4722);
                                                aVar3.f(arrayList1922);
                                                aVar3.i(i26);
                                                aVar3.m(j39);
                                                aVar3.k(j42);
                                                aVar3.q(arrayList15);
                                                aVar3.l(arrayList1822);
                                                aVar3.d(arrayList1722);
                                                aVar3.e(bool22);
                                                aVar3.s(str252);
                                                aVar3.t(str2622);
                                                aVar3.p(j4422);
                                                aVar3.n(j4622);
                                                aVar3.o(str2722);
                                                linkedHashMap.put(m8, aVar3);
                                            } else {
                                                arrayList13 = arrayList13;
                                                cVar2 = cVar4;
                                                hashMap2 = hashMap4;
                                                arrayList4 = arrayList8;
                                                eVar = eVar8;
                                                i4 = i23;
                                                arrayList5 = arrayList12;
                                                treeMap = treeMap2;
                                                str4 = str10;
                                                str2 = str8;
                                                linkedHashMap = linkedHashMap3;
                                                if (!b.startsWith("#")) {
                                                    String hexString3 = str12 == null ? null : str15 != null ? str15 : Long.toHexString(j13);
                                                    long j48 = j13 + 1;
                                                    String n2 = n(b, hashMap3);
                                                    b.e eVar9 = (b.e) hashMap2.get(n2);
                                                    if (j18 == -1) {
                                                        eVar2 = eVar9;
                                                        j11 = 0;
                                                    } else if (z6 && eVar == null && eVar9 == null) {
                                                        b.e eVar10 = new b.e(0L, j11, n2, null, null);
                                                        hashMap2.put(n2, eVar10);
                                                        eVar2 = eVar10;
                                                    } else {
                                                        eVar2 = eVar9;
                                                        j11 = j11;
                                                    }
                                                    if (drmInitData6 != null || treeMap.isEmpty()) {
                                                        str10 = str4;
                                                        i5 = 0;
                                                        drmInitData3 = drmInitData5;
                                                        i6 = i4;
                                                        j7 = j12;
                                                        drmInitData4 = drmInitData6;
                                                    } else {
                                                        i5 = 0;
                                                        DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                        str10 = str4;
                                                        DrmInitData drmInitData10 = new DrmInitData(str10, schemeDataArr3);
                                                        if (drmInitData5 == null) {
                                                            drmInitData3 = c(str10, schemeDataArr3);
                                                            drmInitData4 = drmInitData10;
                                                        } else {
                                                            drmInitData4 = drmInitData10;
                                                            drmInitData3 = drmInitData5;
                                                        }
                                                        i6 = i4;
                                                        j7 = j12;
                                                    }
                                                    long j49 = j11;
                                                    int i32 = i6;
                                                    String str28 = str12;
                                                    long j50 = j16;
                                                    i11 = i32;
                                                    str12 = str28;
                                                    arrayList4.add(new b.e(n2, eVar != null ? eVar : eVar2, str9, j50, i32, j7, drmInitData4, str28, hexString3, j49, j18, i13, arrayList5));
                                                    j15 = j7 + j50;
                                                    ArrayList arrayList20 = new ArrayList();
                                                    j11 = j18 != -1 ? j49 + j18 : j49;
                                                    j13 = j48;
                                                    hashMap4 = hashMap2;
                                                    drmInitData5 = drmInitData3;
                                                    i12 = i5;
                                                    i13 = i12;
                                                    drmInitData6 = drmInitData4;
                                                    j12 = j15;
                                                    eVar3 = eVar;
                                                    str8 = str2;
                                                    str9 = str8;
                                                    treeMap2 = treeMap;
                                                    j16 = 0;
                                                    j18 = -1;
                                                    arrayList11 = arrayList;
                                                    gVar = gVar2;
                                                    str11 = str15;
                                                    arrayList10 = arrayList13;
                                                    linkedHashMap2 = linkedHashMap;
                                                    arrayList8 = arrayList4;
                                                    arrayList9 = arrayList20;
                                                    cVar4 = cVar2;
                                                    cVar3 = cVar;
                                                    bVar2 = bVar;
                                                }
                                            }
                                            j2 = j11;
                                            i11 = i4;
                                            j3 = j12;
                                            arrayList3 = arrayList5;
                                            str10 = str4;
                                            hashMap = hashMap2;
                                            arrayList2 = arrayList4;
                                            j4 = j16;
                                            str3 = str9;
                                            i2 = 0;
                                            arrayList8 = arrayList2;
                                            hashMap4 = hashMap;
                                            i12 = i2;
                                            str9 = str3;
                                            j16 = j4;
                                            j12 = j3;
                                            j11 = j2;
                                            eVar3 = eVar;
                                            str8 = str2;
                                            treeMap2 = treeMap;
                                            arrayList11 = arrayList;
                                            gVar = gVar2;
                                            str11 = str15;
                                            arrayList10 = arrayList13;
                                            bVar2 = bVar;
                                            linkedHashMap2 = linkedHashMap;
                                            arrayList9 = arrayList3;
                                            cVar4 = cVar2;
                                        }
                                        cVar3 = cVar;
                                    }
                                    cVar3 = cVar;
                                }
                                cVar2 = cVar4;
                                hashMap = hashMap4;
                                arrayList2 = arrayList8;
                                treeMap = treeMap2;
                                str2 = str8;
                                j2 = j11;
                                linkedHashMap = linkedHashMap3;
                                arrayList3 = arrayList12;
                                j3 = j12;
                                eVar = eVar3;
                                i2 = i12;
                                j4 = j16;
                                str3 = str9;
                                arrayList8 = arrayList2;
                                hashMap4 = hashMap;
                                i12 = i2;
                                str9 = str3;
                                j16 = j4;
                                j12 = j3;
                                j11 = j2;
                                eVar3 = eVar;
                                str8 = str2;
                                treeMap2 = treeMap;
                                arrayList11 = arrayList;
                                gVar = gVar2;
                                str11 = str15;
                                arrayList10 = arrayList13;
                                bVar2 = bVar;
                                linkedHashMap2 = linkedHashMap;
                                arrayList9 = arrayList3;
                                cVar4 = cVar2;
                                cVar3 = cVar;
                            }
                            linkedHashMap2 = linkedHashMap3;
                            arrayList9 = arrayList12;
                            arrayList11 = arrayList;
                            gVar = gVar2;
                            str11 = str15;
                            arrayList10 = arrayList13;
                        }
                    }
                }
                arrayList11 = arrayList;
            }
        }
        b.c cVar5 = cVar4;
        ArrayList arrayList21 = arrayList8;
        ArrayList arrayList22 = arrayList9;
        ArrayList arrayList23 = arrayList10;
        ArrayList arrayList24 = arrayList11;
        LinkedHashMap linkedHashMap4 = linkedHashMap2;
        b.g gVar3 = gVar;
        int i33 = i12;
        HashMap hashMap5 = new HashMap();
        int i34 = i33;
        while (i34 < arrayList23.size()) {
            ArrayList arrayList25 = arrayList23;
            b.d dVar = (b.d) arrayList25.get(i34);
            long j51 = dVar.b;
            if (j51 == -1) {
                j51 = (j21 + arrayList21.size()) - (arrayList22.isEmpty() ? 1L : 0L);
            }
            int i35 = dVar.c;
            if (i35 == -1 && j20 != C.TIME_UNSET) {
                i35 = (arrayList22.isEmpty() ? ((b.e) sd9.k(arrayList21)).n : arrayList22).size() - 1;
            }
            Uri uri = dVar.a;
            hashMap5.put(uri, new b.d(uri, j51, i35));
            i34++;
            arrayList23 = arrayList25;
        }
        if (cVar5 != null) {
            arrayList22.add(cVar5);
        }
        ArrayList arrayList26 = new ArrayList();
        Iterator it = linkedHashMap4.values().iterator();
        while (it.hasNext()) {
            b.C0058b a3 = ((b.C0058b.a) it.next()).a();
            if (a3 != null) {
                arrayList26.add(a3);
            }
        }
        long j52 = (j14 == 0 && bVar != null && bVar.p) ? bVar.h : j14;
        return new b(i8, str, arrayList24, j10, z7, j52, z5, i10, j21, i9, j19, j20, z3, z4, j52 != 0 ? 1 : i33, drmInitData5, arrayList21, arrayList22, gVar3, hashMap5, arrayList26);
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
    /* JADX WARN: Removed duplicated region for block: B:85:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fe  */
    /* JADX WARN: Type inference failed for: r43v12 */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r43v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static androidx.media3.exoplayer.hls.playlist.c h(a aVar, String str) throws IOException {
        int i2;
        ArrayList arrayList;
        char c;
        ArrayList arrayList2;
        c.b bVar;
        String str2;
        ArrayList arrayList3;
        int parseInt;
        String str3;
        c.b bVar2;
        String str4;
        c.b bVar3;
        HashMap hashMap;
        HashSet hashSet;
        ArrayList arrayList4;
        boolean z2;
        int i3;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int i4;
        String str5;
        String str6;
        String w2;
        String l2;
        int i5;
        int i6;
        Uri d;
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
            boolean a2 = aVar.a();
            Pattern pattern = S;
            ArrayList arrayList17 = arrayList13;
            boolean z5 = z3;
            Pattern pattern2 = X;
            boolean z6 = z4;
            if (!a2) {
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
                    c.b bVar4 = (c.b) arrayList9.get(i7);
                    Uri uri = bVar4.a;
                    androidx.media3.common.a aVar2 = bVar4.b;
                    if (hashSet2.add(uri)) {
                        fxc0.z(aVar2.l == null);
                        ArrayList arrayList24 = (ArrayList) hashMap4.get(bVar4.a);
                        arrayList24.getClass();
                        hashMap = hashMap4;
                        hashSet = hashSet2;
                        fi20 fi20Var = new fi20(new u9v(null, null, arrayList24));
                        a.C0043a a3 = aVar2.a();
                        a3.k = fi20Var;
                        arrayList23.add(bVar4.a(new androidx.media3.common.a(a3)));
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
                androidx.media3.common.a aVar3 = null;
                while (i8 < arrayList14.size()) {
                    String str9 = (String) arrayList14.get(i8);
                    String m2 = m(str9, Y, hashMap3);
                    String m3 = m(str9, pattern2, hashMap3);
                    a.C0043a c0043a = new a.C0043a();
                    int i9 = i8;
                    c0043a.a = pzl.b(m2, StringUtils.PROCESS_POSTFIX_DELIMITER, m3);
                    c0043a.b = m3;
                    c0043a.l = io20.q(MimeTypes.APPLICATION_M3U8);
                    boolean i10 = i(str9, c0);
                    ?? r43 = i10;
                    if (i(str9, d0)) {
                        r43 = (i10 ? 1 : 0) | 2;
                    }
                    c0043a.e = i(str9, b0) ? r43 | 4 : r43;
                    ArrayList arrayList25 = arrayList14;
                    String l3 = l(str9, Z, null, hashMap3);
                    if (TextUtils.isEmpty(l3)) {
                        arrayList = arrayList23;
                        i2 = 0;
                    } else {
                        String str10 = y2r0.a;
                        String[] split = l3.split(StringUtils.COMMA, -1);
                        i2 = y2r0.m(split, "public.accessibility.describes-video") ? 512 : 0;
                        arrayList = arrayList23;
                        if (y2r0.m(split, "public.accessibility.transcribes-spoken-dialog")) {
                            i2 |= 4096;
                        }
                        if (y2r0.m(split, "public.accessibility.describes-music-and-sound")) {
                            i2 |= 1024;
                        }
                        if (y2r0.m(split, "public.easy-to-read")) {
                            i2 |= 8192;
                        }
                    }
                    c0043a.f = i2;
                    c0043a.d = l(str9, W, null, hashMap3);
                    String l4 = l(str9, pattern, null, hashMap3);
                    Uri d2 = l4 == null ? null : neq0.d(str8, l4);
                    fi20 fi20Var2 = new fi20(new u9v(m2, m3, Collections.EMPTY_LIST));
                    String m4 = m(str9, U, hashMap3);
                    switch (m4.hashCode()) {
                        case -959297733:
                            if (m4.equals("SUBTITLES")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -333210994:
                            if (m4.equals("CLOSED-CAPTIONS")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 62628790:
                            if (m4.equals(SignalingProtocol.MEDIA_OPTION_AUDIO)) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 81665115:
                            if (m4.equals(SignalingProtocol.MEDIA_OPTION_VIDEO)) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            int i11 = 0;
                            while (true) {
                                if (i11 < arrayList9.size()) {
                                    bVar = (c.b) arrayList9.get(i11);
                                    if (!m2.equals(bVar.e)) {
                                        i11++;
                                    }
                                } else {
                                    bVar = null;
                                }
                            }
                            if (bVar != null) {
                                String w3 = y2r0.w(bVar.b.k, 3);
                                c0043a.j = w3;
                                str2 = io20.e(w3);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = MimeTypes.TEXT_VTT;
                            }
                            c0043a.m = io20.q(str2);
                            c0043a.k = fi20Var2;
                            if (d2 == null) {
                                arrayList2 = arrayList20;
                                ahn.F("EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            } else {
                                c.a aVar4 = new c.a(d2, new androidx.media3.common.a(c0043a), m3);
                                arrayList2 = arrayList20;
                                arrayList2.add(aVar4);
                                break;
                            }
                        case 1:
                            arrayList3 = arrayList19;
                            String m5 = m(str9, a0, hashMap3);
                            if (m5.startsWith("CC")) {
                                parseInt = Integer.parseInt(m5.substring(2));
                                str3 = MimeTypes.APPLICATION_CEA608;
                            } else {
                                parseInt = Integer.parseInt(m5.substring(7));
                                str3 = MimeTypes.APPLICATION_CEA708;
                            }
                            if (list == null) {
                                list = new ArrayList();
                            }
                            c0043a.m = io20.q(str3);
                            c0043a.J = parseInt;
                            list.add(new androidx.media3.common.a(c0043a));
                            arrayList19 = arrayList3;
                            arrayList2 = arrayList20;
                            break;
                        case 2:
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList9.size()) {
                                    bVar2 = (c.b) arrayList9.get(i12);
                                    int i13 = i12;
                                    if (!m2.equals(bVar2.d)) {
                                        i12 = i13 + 1;
                                    }
                                } else {
                                    bVar2 = null;
                                }
                            }
                            if (bVar2 != null) {
                                String w4 = y2r0.w(bVar2.b.k, 1);
                                c0043a.j = w4;
                                str4 = io20.e(w4);
                            } else {
                                str4 = null;
                            }
                            c.b bVar5 = bVar2;
                            String l5 = l(str9, n, null, hashMap3);
                            if (l5 != null) {
                                String str11 = y2r0.a;
                                c0043a.E = Integer.parseInt(l5.split(DomExceptionUtils.SEPARATOR, 2)[0]);
                                if (MimeTypes.AUDIO_E_AC3.equals(str4) && l5.endsWith("/JOC")) {
                                    c0043a.j = "ec+3";
                                    str4 = MimeTypes.AUDIO_E_AC3_JOC;
                                }
                            }
                            c0043a.q(str4);
                            if (d2 != null) {
                                c0043a.k = fi20Var2;
                                arrayList19.add(new c.a(d2, new androidx.media3.common.a(c0043a), m3));
                            } else {
                                arrayList3 = arrayList19;
                                if (bVar5 != null) {
                                    arrayList19 = arrayList3;
                                    aVar3 = new androidx.media3.common.a(c0043a);
                                }
                                arrayList19 = arrayList3;
                            }
                            arrayList2 = arrayList20;
                            break;
                        case 3:
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList9.size()) {
                                    bVar3 = (c.b) arrayList9.get(i14);
                                    if (!m2.equals(bVar3.c)) {
                                        i14++;
                                    }
                                } else {
                                    bVar3 = null;
                                }
                            }
                            if (bVar3 != null) {
                                androidx.media3.common.a aVar5 = bVar3.b;
                                String w5 = y2r0.w(aVar5.k, 2);
                                c0043a.j = w5;
                                c0043a.m = io20.q(io20.e(w5));
                                c0043a.t = aVar5.u;
                                c0043a.u = aVar5.v;
                                c0043a.x = aVar5.y;
                            }
                            if (d2 != null) {
                                c0043a.k = fi20Var2;
                                arrayList18.add(new c.a(d2, new androidx.media3.common.a(c0043a), m3));
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
                return new androidx.media3.exoplayer.hls.playlist.c(str, arrayList21, arrayList26, arrayList18, arrayList19, arrayList27, arrayList17, aVar3, list, z6, hashMap3, arrayList22);
            }
            String b = aVar.b();
            if (b.startsWith("#EXT")) {
                arrayList16.add(b);
            }
            boolean startsWith = b.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList28 = arrayList16;
            if (b.startsWith("#EXT-X-DEFINE")) {
                hashMap3.put(m(b, pattern2, hashMap3), m(b, h0, hashMap3));
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
                DrmInitData.SchemeData f = f(b, hashMap3, l(b, Q, "identity", hashMap3));
                if (f != null) {
                    String m6 = m(b, P, hashMap3);
                    arrayList15.add(new DrmInitData(("SAMPLE-AES-CENC".equals(m6) || "SAMPLE-AES-CTR".equals(m6)) ? C.CENC_TYPE_cenc : C.CENC_TYPE_cbcs, f));
                }
            } else if (b.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                boolean contains = z5 | b.contains("CLOSED-CAPTIONS=NONE");
                int i15 = startsWith ? 16384 : 0;
                z5 = contains;
                arrayList4 = arrayList15;
                int parseInt2 = Integer.parseInt(m(b, m, Collections.EMPTY_MAP));
                Matcher matcher = h.matcher(b);
                if (matcher.find()) {
                    z2 = startsWith;
                    String group = matcher.group(1);
                    group.getClass();
                    i3 = Integer.parseInt(group);
                } else {
                    z2 = startsWith;
                    i3 = -1;
                }
                arrayList5 = arrayList12;
                String l6 = l(b, o, null, hashMap3);
                arrayList6 = arrayList11;
                String l7 = l(b, p, null, hashMap3);
                arrayList7 = arrayList10;
                String l8 = l(b, q, null, hashMap3);
                if (l8 != null) {
                    String str12 = y2r0.a;
                    String[] split2 = l8.split(StringUtils.COMMA, 2)[0].split(DomExceptionUtils.SEPARATOR, -1);
                    str5 = split2[0];
                    if (split2.length > 1) {
                        str6 = split2[1];
                        i4 = 2;
                        w2 = y2r0.w(l7, i4);
                        if (io20.m(w2, str5)) {
                            if (str5 == null) {
                                str7 = w2;
                            } else if (l6 != null && str6 != null) {
                                str7 = w2;
                                if (l6.equals("PQ")) {
                                }
                                if (l6.equals("SDR")) {
                                }
                                if (l6.equals("HLG")) {
                                }
                            }
                            if (str5 == null) {
                                str5 = str7;
                            }
                            String x2 = y2r0.x(l7);
                            l7 = x2 != null ? pzl.b(str5, StringUtils.COMMA, x2) : str5;
                        }
                        l2 = l(b, r, null, hashMap3);
                        if (l2 != null) {
                            String[] split3 = l2.split("x", -1);
                            i6 = Integer.parseInt(split3[0]);
                            i5 = Integer.parseInt(split3[1]);
                            if (i6 > 0) {
                            }
                        }
                        i5 = -1;
                        i6 = -1;
                        String l9 = l(b, s, null, hashMap3);
                        float parseFloat = l9 == null ? Float.parseFloat(l9) : -1.0f;
                        String l10 = l(b, i, null, hashMap3);
                        String l11 = l(b, j, null, hashMap3);
                        String l12 = l(b, k, null, hashMap3);
                        String l13 = l(b, l, null, hashMap3);
                        if (!z2) {
                            d = neq0.d(str8, m(b, pattern, hashMap3));
                        } else {
                            if (!aVar.a()) {
                                throw ParserException.b(null, "#EXT-X-STREAM-INF must be followed by another line");
                            }
                            d = neq0.d(str8, n(aVar.b(), hashMap3));
                        }
                        Uri uri2 = d;
                        a.C0043a c0043a2 = new a.C0043a();
                        c0043a2.a = Integer.toString(arrayList9.size());
                        c0043a2.l = io20.q(MimeTypes.APPLICATION_M3U8);
                        c0043a2.j = l7;
                        c0043a2.h = i3;
                        c0043a2.i = parseInt2;
                        c0043a2.t = i6;
                        c0043a2.u = i5;
                        c0043a2.x = parseFloat;
                        c0043a2.f = i15;
                        arrayList9.add(new c.b(uri2, new androidx.media3.common.a(c0043a2), l10, l11, l12, l13));
                        arrayList8 = (ArrayList) hashMap2.get(uri2);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                            hashMap2.put(uri2, arrayList8);
                        }
                        arrayList8.add(new u9v.a(i3, l10, parseInt2, l11, l12, l13));
                        z3 = z5;
                        z4 = z6;
                        arrayList13 = arrayList17;
                        arrayList16 = arrayList28;
                        arrayList15 = arrayList4;
                        arrayList12 = arrayList5;
                        arrayList11 = arrayList6;
                        arrayList10 = arrayList7;
                    } else {
                        i4 = 2;
                    }
                } else {
                    i4 = 2;
                    str5 = null;
                }
                str6 = null;
                w2 = y2r0.w(l7, i4);
                if (io20.m(w2, str5)) {
                }
                l2 = l(b, r, null, hashMap3);
                if (l2 != null) {
                }
                i5 = -1;
                i6 = -1;
                String l92 = l(b, s, null, hashMap3);
                if (l92 == null) {
                }
                String l102 = l(b, i, null, hashMap3);
                String l112 = l(b, j, null, hashMap3);
                String l122 = l(b, k, null, hashMap3);
                String l132 = l(b, l, null, hashMap3);
                if (!z2) {
                }
                Uri uri22 = d;
                a.C0043a c0043a22 = new a.C0043a();
                c0043a22.a = Integer.toString(arrayList9.size());
                c0043a22.l = io20.q(MimeTypes.APPLICATION_M3U8);
                c0043a22.j = l7;
                c0043a22.h = i3;
                c0043a22.i = parseInt2;
                c0043a22.t = i6;
                c0043a22.u = i5;
                c0043a22.x = parseFloat;
                c0043a22.f = i15;
                arrayList9.add(new c.b(uri22, new androidx.media3.common.a(c0043a22), l102, l112, l122, l132));
                arrayList8 = (ArrayList) hashMap2.get(uri22);
                if (arrayList8 == null) {
                }
                arrayList8.add(new u9v.a(i3, l102, parseInt2, l112, l122, l132));
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

    public static boolean i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double j(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d;
        }
        String group = matcher.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    public static long k(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static String l(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : n(str2, map);
    }

    public static String m(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String l2 = l(str, pattern, null, map);
        if (l2 != null) {
            return l2;
        }
        throw ParserException.b(null, "Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String n(String str, Map<String, String> map) {
        Matcher matcher = C0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0176, code lost:
    
        if (r0 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017a, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
    
        r0.a(r13.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00e5, code lost:
    
        if (r0 == null) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a5 A[Catch: all -> 0x00c8, TRY_ENTER, TryCatch #4 {all -> 0x00c8, blocks: (B:3:0x001d, B:5:0x0026, B:7:0x002e, B:10:0x0037, B:13:0x0076, B:15:0x007c, B:18:0x0087, B:69:0x008f, B:72:0x00a8, B:73:0x00ae, B:75:0x00b4, B:78:0x00c2, B:20:0x00f0, B:22:0x00f8, B:24:0x0100, B:26:0x0108, B:28:0x0110, B:30:0x0118, B:32:0x0120, B:34:0x0128, B:36:0x0131, B:43:0x0139, B:39:0x013e, B:47:0x0143, B:110:0x01a5, B:111:0x01ab, B:114:0x003d, B:116:0x0043, B:121:0x004c, B:123:0x0055, B:128:0x005e, B:130:0x0064, B:132:0x006a, B:134:0x006f), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[Catch: all -> 0x00c8, LOOP:0: B:13:0x0076->B:41:0x0076, LOOP_START, TryCatch #4 {all -> 0x00c8, blocks: (B:3:0x001d, B:5:0x0026, B:7:0x002e, B:10:0x0037, B:13:0x0076, B:15:0x007c, B:18:0x0087, B:69:0x008f, B:72:0x00a8, B:73:0x00ae, B:75:0x00b4, B:78:0x00c2, B:20:0x00f0, B:22:0x00f8, B:24:0x0100, B:26:0x0108, B:28:0x0110, B:30:0x0118, B:32:0x0120, B:34:0x0128, B:36:0x0131, B:43:0x0139, B:39:0x013e, B:47:0x0143, B:110:0x01a5, B:111:0x01ab, B:114:0x003d, B:116:0x0043, B:121:0x004c, B:123:0x0055, B:128:0x005e, B:130:0x0064, B:132:0x006a, B:134:0x006f), top: B:2:0x001d }] */
    /* JADX WARN: Type inference failed for: r12v11, types: [androidx.media3.exoplayer.hls.playlist.c, xsna.o9v] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v15, types: [androidx.media3.exoplayer.hls.playlist.b, xsna.o9v] */
    @Override // androidx.media3.exoplayer.upstream.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Uri uri, bvk bvkVar) throws IOException {
        String trim;
        Object h2;
        OneVideoPlayer.b bVar = this.e;
        uhf0 uhf0Var = new uhf0(bvkVar);
        ByteArrayOutputStream byteArrayOutputStream = uhf0Var.c;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uhf0Var));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int read = bufferedReader.read();
            boolean z2 = false;
            if (read == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    read = bufferedReader.read();
                }
                if (z2) {
                    throw ParserException.b(null, "Input does not start with the #EXTM3U header.");
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        y2r0.h(bufferedReader);
                        do {
                            try {
                            } catch (IOException e) {
                                ahn.n("OVHlsPlaylistParser", "finally recording stream read error" + e);
                            }
                        } while (uhf0Var.read() != -1);
                        if (bVar != null) {
                            bVar.a(byteArrayOutputStream.toString());
                        }
                        throw ParserException.b(null, "Failed to parse the playlist, could not identify any tags.");
                    }
                    trim = readLine.trim();
                    if (!trim.isEmpty()) {
                        if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                            if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                                break;
                            }
                            if (trim.startsWith("#EXT-X-VK-PLAYBACK-DURATION")) {
                                e(trim);
                            } else {
                                arrayDeque.add(trim);
                            }
                        } else {
                            arrayDeque.add(trim);
                            h2 = h(new a(arrayDeque, bufferedReader), uri.toString());
                            d(h2.b);
                            lj00 lj00Var = this.g;
                            if (lj00Var != null) {
                                Iterator<w9v> it = this.f.iterator();
                                while (it.hasNext()) {
                                    ManifestValidationErrorType a2 = it.next().a(h2);
                                    if (a2 != ManifestValidationErrorType.MANIFEST_OK) {
                                        lj00Var.a(VideoContentType.HLS, a2);
                                    }
                                }
                            }
                            y2r0.h(bufferedReader);
                            do {
                                try {
                                } catch (IOException e2) {
                                    ahn.n("OVHlsPlaylistParser", "finally recording stream read error" + e2);
                                }
                            } while (uhf0Var.read() != -1);
                        }
                    }
                }
                arrayDeque.add(trim);
                h2 = g(this.a, this.b, new a(arrayDeque, bufferedReader), uri.toString());
                d(h2.b);
                y2r0.h(bufferedReader);
                do {
                    try {
                    } catch (IOException e3) {
                        ahn.n("OVHlsPlaylistParser", "finally recording stream read error" + e3);
                    }
                } while (uhf0Var.read() != -1);
            }
            while (read != -1 && Character.isWhitespace(read)) {
                read = bufferedReader.read();
            }
            int i2 = 0;
            while (true) {
                if (i2 >= 7) {
                    while (read != -1 && Character.isWhitespace(read) && !y2r0.O(read)) {
                        read = bufferedReader.read();
                    }
                    z2 = y2r0.O(read);
                } else {
                    if (read != "#EXTM3U".charAt(i2)) {
                        break;
                    }
                    read = bufferedReader.read();
                    i2++;
                }
            }
            if (z2) {
            }
        } finally {
        }
    }

    public final void d(List<String> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2);
            if (str.startsWith("#EXT-X-VK-PLAYBACK-DURATION") && e(str)) {
                return;
            }
        }
    }

    public final boolean e(String str) {
        try {
            long parseInt = Integer.parseInt(m(str, E0, Collections.EMPTY_MAP));
            if (this.d == null) {
                return true;
            }
            this.c.post(new fl80(this, parseInt, 0));
            return true;
        } catch (ParserException unused) {
            ahn.n("OVHlsPlaylistParser", "Error parsing #EXT-X-VK-PLAYBACK-DURATION tag");
            return false;
        }
    }
}
