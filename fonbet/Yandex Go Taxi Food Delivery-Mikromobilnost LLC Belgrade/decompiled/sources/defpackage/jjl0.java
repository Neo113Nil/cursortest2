package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import org.webrtc.MediaStreamTrack;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes10.dex */
public final class jjl0 {
    public final vil0 a;
    public final Uri b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x05a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jjl0(djl0 djl0Var, nd10 nd10Var, Uri uri) {
        char c;
        String str;
        String str2;
        int i;
        ImmutableMap immutableMap;
        Object obj;
        ImmutableMap a;
        int i2;
        String str3;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Uri parse;
        boolean z6;
        ImmutableMap immutableMap2 = nd10Var.i;
        d6z.k("missing attribute control", immutableMap2.containsKey("control"));
        f7s f7sVar = new f7s();
        int i4 = nd10Var.e;
        md10 md10Var = nd10Var.j;
        if (i4 > 0) {
            f7sVar.h = i4;
        }
        int i5 = md10Var.a;
        String str4 = md10Var.b;
        String h = f0b1.h(str4);
        h.getClass();
        switch (h.hashCode()) {
            case -1922091719:
                if (h.equals("MPEG4-GENERIC")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2412:
                if (h.equals("L8")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 64593:
                if (h.equals("AC3")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 64934:
                if (h.equals("AMR")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 74609:
                if (h.equals("L16")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 85182:
                if (h.equals("VP8")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 85183:
                if (h.equals("VP9")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 2194728:
                if (h.equals("H264")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2194729:
                if (h.equals("H265")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 2433087:
                if (h.equals("OPUS")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2450119:
                if (h.equals("PCMA")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2450139:
                if (h.equals("PCMU")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1061166827:
                if (h.equals("MP4A-LATM")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1934494802:
                if (h.equals("AMR-WB")) {
                    c = HexString.LF;
                    break;
                }
                c = 65535;
                break;
            case 1959269366:
                if (h.equals("MP4V-ES")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2137188397:
                if (h.equals("H263-1998")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2137209252:
                if (h.equals("H263-2000")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        int i6 = 1;
        switch (c) {
            case 0:
            case '\f':
                str = str4;
                str2 = "audio/mp4a-latm";
                break;
            case 1:
            case 4:
                str = str4;
                str2 = "audio/raw";
                break;
            case 2:
                str = str4;
                str2 = "audio/ac3";
                break;
            case 3:
                str = str4;
                str2 = "audio/3gpp";
                break;
            case 5:
                str = str4;
                str2 = "video/x-vnd.on2.vp8";
                break;
            case 6:
                str = str4;
                str2 = "video/x-vnd.on2.vp9";
                break;
            case 7:
                str = str4;
                str2 = "video/avc";
                break;
            case '\b':
                str = str4;
                str2 = "video/hevc";
                break;
            case '\t':
                str = str4;
                str2 = "audio/opus";
                break;
            case '\n':
                str = str4;
                str2 = "audio/g711-alaw";
                break;
            case 11:
                str = str4;
                str2 = "audio/g711-mlaw";
                break;
            case '\r':
                str = str4;
                str2 = "audio/amr-wb";
                break;
            case 14:
                str = str4;
                str2 = "video/mp4v-es";
                break;
            case 15:
            case 16:
                str = str4;
                str2 = "video/3gpp";
                break;
            default:
                ny61.g(str4);
                throw null;
        }
        f7sVar.d(str2);
        int i7 = md10Var.c;
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(nd10Var.a)) {
            int i8 = md10Var.d;
            i8 = i8 == -1 ? str2.equals("audio/ac3") ? 6 : 1 : i8;
            f7sVar.D = i7;
            f7sVar.C = i8;
            i = i8;
        } else {
            i = -1;
        }
        String str5 = (String) immutableMap2.get("fmtp");
        if (str5 == null) {
            a = ImmutableMap.f();
            immutableMap = immutableMap2;
            obj = "audio/ac3";
        } else {
            int i9 = tw21.a;
            immutableMap = immutableMap2;
            String[] split = str5.split(" ", 2);
            obj = "audio/ac3";
            d6z.k(str5, split.length == 2);
            String str6 = split[1];
            int i10 = 0;
            String[] split2 = str6.split(";\\s?", 0);
            ImmutableMap.a aVar = new ImmutableMap.a();
            int length = split2.length;
            char c2 = 0;
            while (i10 < length) {
                String[] strArr = split2;
                String[] split3 = strArr[i10].split("=", 2);
                aVar.b(split3[c2], split3[1]);
                i10++;
                split2 = strArr;
                length = length;
                c2 = 0;
            }
            a = aVar.a();
        }
        switch (str2.hashCode()) {
            case -1664118616:
                i2 = 1;
                str3 = str;
                z = 0;
                z = 0;
                if (str2.equals("video/3gpp")) {
                    f7sVar.t = 352;
                    f7sVar.u = 288;
                }
                d6z.l(i7 > 0 ? i2 : z);
                this.a = new vil0(new a(f7sVar), i5, i7, a, str3);
                String str7 = (String) immutableMap.get("control");
                parse = Uri.parse(str7);
                if (!parse.isAbsolute()) {
                    parse = !TextUtils.isEmpty(djl0Var.b("Content-Base")) ? Uri.parse(djl0Var.b("Content-Base")) : !TextUtils.isEmpty(djl0Var.b("Content-Location")) ? Uri.parse(djl0Var.b("Content-Location")) : uri;
                    if (!str7.equals("*")) {
                        parse = parse.buildUpon().appendEncodedPath(str7).build();
                    }
                }
                this.b = parse;
                return;
            case -1662541442:
                i3 = 1;
                str3 = str;
                z2 = false;
                z = 0;
                z = 0;
                if (str2.equals("video/hevc")) {
                    d6z.k("missing attribute fmtp", !a.isEmpty());
                    if (a.containsKey("sprop-max-don-diff")) {
                        String str8 = (String) a.get("sprop-max-don-diff");
                        str8.getClass();
                        int parseInt = Integer.parseInt(str8);
                        d6z.k("non-zero sprop-max-don-diff " + parseInt + " is not supported", parseInt == 0);
                    }
                    d6z.k("missing sprop-vps parameter", a.containsKey("sprop-vps"));
                    String str9 = (String) a.get("sprop-vps");
                    str9.getClass();
                    d6z.k("missing sprop-sps parameter", a.containsKey("sprop-sps"));
                    String str10 = (String) a.get("sprop-sps");
                    str10.getClass();
                    d6z.k("missing sprop-pps parameter", a.containsKey("sprop-pps"));
                    String str11 = (String) a.get("sprop-pps");
                    str11.getClass();
                    ImmutableList t = ImmutableList.t(a(str9), a(str10), a(str11));
                    f7sVar.p = t;
                    i2 = 1;
                    byte[] bArr = (byte[]) t.get(1);
                    h150 h2 = l150.h(bArr, 4, bArr.length, null);
                    f7sVar.x = h2.g;
                    f7sVar.u = h2.f;
                    f7sVar.t = h2.e;
                    jfc jfcVar = new jfc();
                    jfcVar.a = h2.i;
                    jfcVar.b = h2.j;
                    jfcVar.c = h2.k;
                    jfcVar.e = h2.c + 8;
                    jfcVar.f = h2.d + 8;
                    f7sVar.A = jfcVar.a();
                    e150 e150Var = h2.b;
                    if (e150Var != null) {
                        f7sVar.j = bac.b(e150Var.a, e150Var.b, e150Var.c, e150Var.d, e150Var.e, e150Var.f);
                    }
                    d6z.l(i7 > 0 ? i2 : z);
                    this.a = new vil0(new a(f7sVar), i5, i7, a, str3);
                    String str72 = (String) immutableMap.get("control");
                    parse = Uri.parse(str72);
                    if (!parse.isAbsolute()) {
                    }
                    this.b = parse;
                    return;
                }
                i2 = i3;
                z = z2;
                d6z.l(i7 > 0 ? i2 : z);
                this.a = new vil0(new a(f7sVar), i5, i7, a, str3);
                String str722 = (String) immutableMap.get("control");
                parse = Uri.parse(str722);
                if (!parse.isAbsolute()) {
                }
                this.b = parse;
                return;
            case -1606874997:
                str3 = str;
                z3 = false;
                z6 = false;
                if (str2.equals("audio/amr-wb")) {
                    i3 = 1;
                    d6z.k("Multi channel AMR is not currently supported.", i != i3 ? i3 : z6 ? 1 : 0);
                    d6z.k("fmtp parameters must include octet-align.", (a.isEmpty() ? 1 : 0) ^ i3);
                    d6z.k("Only octet aligned mode is currently supported.", a.containsKey("octet-align"));
                    d6z.k("Interleaving mode is not currently supported.", (a.containsKey("interleaving") ? 1 : 0) ^ i3);
                    z2 = z6;
                    i2 = i3;
                    z = z2;
                    d6z.l(i7 > 0 ? i2 : z);
                    this.a = new vil0(new a(f7sVar), i5, i7, a, str3);
                    String str7222 = (String) immutableMap.get("control");
                    parse = Uri.parse(str7222);
                    if (!parse.isAbsolute()) {
                    }
                    this.b = parse;
                    return;
                }
                i2 = 1;
                z = z3;
                d6z.l(i7 > 0 ? i2 : z);
                this.a = new vil0(new a(f7sVar), i5, i7, a, str3);
                String str72222 = (String) immutableMap.get("control");
                parse = Uri.parse(str72222);
                if (!parse.isAbsolute()) {
                }
                this.b = parse;
                return;
            case -53558318:
                str3 = str;
                if (str2.equals("audio/mp4a-latm")) {
                    d6z.l(i != -1);
                    d6z.k("missing attribute fmtp", !a.isEmpty());
                    if (str3.equals("MP4A-LATM")) {
                        d6z.k("Only supports cpresent=0 in AAC audio.", a.containsKey("cpresent") && ((String) a.get("cpresent")).equals("0"));
                        String str12 = (String) a.get(ConfigConstants.CONFIG);
                        d6z.u(str12, "AAC audio stream must include config fmtp parameter");
                        d6z.k("Malformat MPEG4 config: ".concat(str12), str12.length() % 2 == 0);
                        byte[] u = tw21.u(str12);
                        df90 df90Var = new df90(u, u.length);
                        d6z.k("Only supports audio mux version 0.", df90Var.g(1) == 0);
                        d6z.k("Only supports allStreamsSameTimeFraming.", df90Var.g(1) == 1);
                        df90Var.o(6);
                        d6z.k("Only supports one program.", df90Var.g(4) == 0);
                        d6z.k("Only supports one numLayer.", df90Var.g(3) == 0);
                        z4 = false;
                        try {
                            a4 o = pw21.o(df90Var, false);
                            f7sVar.D = o.b;
                            f7sVar.C = o.c;
                            f7sVar.j = o.a;
                        } catch (ParserException e) {
                            yci0.r(e);
                            throw null;
                        }
                    } else {
                        z4 = false;
                    }
                    String str13 = (String) a.get("profile-level-id");
                    if (str13 == null && str3.equals("MP4A-LATM")) {
                        str13 = "30";
                    }
                    d6z.k("missing profile-level-id param", (str13 == null || str13.isEmpty()) ? z4 ? 1 : 0 : true);
                    f7sVar.j = "mp4a.40." + str13;
                    f7sVar.p = ImmutableList.r(pw21.c(i7, i));
                    z3 = z4;
                } else {
                    z3 = false;
                }
                i2 = 1;
                z = z3;
                d6z.l(i7 > 0 ? i2 : z);
                this.a = new vil0(new a(f7sVar), i5, i7, a, str3);
                String str722222 = (String) immutableMap.get("control");
                parse = Uri.parse(str722222);
                if (!parse.isAbsolute()) {
                }
                this.b = parse;
                return;
            case 187078296:
                str3 = str;
                str2.equals(obj);
                i2 = 1;
                z = 0;
                d6z.l(i7 > 0 ? i2 : z);
                this.a = new vil0(new a(f7sVar), i5, i7, a, str3);
                String str7222222 = (String) immutableMap.get("control");
                parse = Uri.parse(str7222222);
                if (!parse.isAbsolute()) {
                }
                this.b = parse;
                return;
            case 187094639:
                if (str2.equals("audio/raw")) {
                    str3 = str;
                    d6z.l(str3.equals("L8") || str3.equals("L16"));
                    f7sVar.E = str3.equals("L8") ? 3 : SelfTester_JCP.IMITA;
                    i2 = 1;
                    z = 0;
                    d6z.l(i7 > 0 ? i2 : z);
                    this.a = new vil0(new a(f7sVar), i5, i7, a, str3);
                    String str72222222 = (String) immutableMap.get("control");
                    parse = Uri.parse(str72222222);
                    if (!parse.isAbsolute()) {
                    }
                    this.b = parse;
                    return;
                }
                str3 = str;
                i2 = 1;
                z = 0;
                d6z.l(i7 > 0 ? i2 : z);
                this.a = new vil0(new a(f7sVar), i5, i7, a, str3);
                String str722222222 = (String) immutableMap.get("control");
                parse = Uri.parse(str722222222);
                if (!parse.isAbsolute()) {
                }
                this.b = parse;
                return;
            case 1187890754:
                if (str2.equals("video/mp4v-es")) {
                    d6z.l(!a.isEmpty());
                    String str14 = (String) a.get(ConfigConstants.CONFIG);
                    if (str14 != null) {
                        byte[] u2 = tw21.u(str14);
                        f7sVar.p = ImmutableList.r(u2);
                        byte[] bArr2 = bac.a;
                        ef90 ef90Var = new ef90(u2);
                        int i11 = 0;
                        while (true) {
                            int i12 = i11 + 3;
                            if (i12 >= u2.length) {
                                z5 = false;
                            } else if (ef90Var.B() == i6 && (u2[i12] & 240) == 32) {
                                z5 = true;
                            } else {
                                ef90Var.K(ef90Var.b - 2);
                                i11++;
                                i6 = 1;
                            }
                        }
                        d6z.k("Invalid input: VOL not found.", z5);
                        df90 df90Var2 = new df90(u2, u2.length);
                        df90Var2.o((i11 + 4) * 8);
                        df90Var2.o(1);
                        df90Var2.o(8);
                        if (df90Var2.f()) {
                            df90Var2.o(4);
                            df90Var2.o(3);
                        }
                        if (df90Var2.g(4) == 15) {
                            df90Var2.o(8);
                            df90Var2.o(8);
                        }
                        if (df90Var2.f()) {
                            df90Var2.o(2);
                            df90Var2.o(1);
                            if (df90Var2.f()) {
                                df90Var2.o(79);
                            }
                        }
                        d6z.k("Only supports rectangular video object layer shape.", df90Var2.g(2) == 0);
                        d6z.l(df90Var2.f());
                        int g = df90Var2.g(16);
                        d6z.l(df90Var2.f());
                        if (df90Var2.f()) {
                            d6z.l(g > 0);
                            int i13 = 0;
                            for (int i14 = g - 1; i14 > 0; i14 >>= 1) {
                                i13++;
                            }
                            df90Var2.o(i13);
                        }
                        d6z.l(df90Var2.f());
                        int g2 = df90Var2.g(13);
                        d6z.l(df90Var2.f());
                        int g3 = df90Var2.g(13);
                        d6z.l(df90Var2.f());
                        df90Var2.o(1);
                        Pair create = Pair.create(Integer.valueOf(g2), Integer.valueOf(g3));
                        f7sVar.t = ((Integer) create.first).intValue();
                        f7sVar.u = ((Integer) create.second).intValue();
                    } else {
                        f7sVar.t = 352;
                        f7sVar.u = 288;
                    }
                    String str15 = (String) a.get("profile-level-id");
                    f7sVar.j = "mp4v.".concat(str15 == null ? "1" : str15);
                }
                str3 = str;
                i2 = 1;
                z = 0;
                d6z.l(i7 > 0 ? i2 : z);
                this.a = new vil0(new a(f7sVar), i5, i7, a, str3);
                String str7222222222 = (String) immutableMap.get("control");
                parse = Uri.parse(str7222222222);
                if (!parse.isAbsolute()) {
                }
                this.b = parse;
                return;
            case 1331836730:
                if (str2.equals("video/avc")) {
                    d6z.k("missing attribute fmtp", !a.isEmpty());
                    d6z.k("missing sprop parameter", a.containsKey("sprop-parameter-sets"));
                    String str16 = (String) a.get("sprop-parameter-sets");
                    str16.getClass();
                    int i15 = tw21.a;
                    String[] split4 = str16.split(",", -1);
                    d6z.k("empty sprop value", split4.length == 2);
                    ImmutableList s = ImmutableList.s(a(split4[0]), a(split4[1]));
                    f7sVar.p = s;
                    byte[] bArr3 = (byte[]) s.get(0);
                    k150 j = l150.j(4, bArr3.length, bArr3);
                    f7sVar.x = j.g;
                    f7sVar.u = j.f;
                    f7sVar.t = j.e;
                    jfc jfcVar2 = new jfc();
                    jfcVar2.a = j.p;
                    jfcVar2.b = j.q;
                    jfcVar2.c = j.r;
                    jfcVar2.e = j.h + 8;
                    jfcVar2.f = j.i + 8;
                    f7sVar.A = jfcVar2.a();
                    String str17 = (String) a.get("profile-level-id");
                    if (str17 != null) {
                        f7sVar.j = "avc1.".concat(str17);
                    } else {
                        f7sVar.j = bac.a(j.a, j.b, j.c);
                    }
                }
                i2 = 1;
                str3 = str;
                z = 0;
                d6z.l(i7 > 0 ? i2 : z);
                this.a = new vil0(new a(f7sVar), i5, i7, a, str3);
                String str72222222222 = (String) immutableMap.get("control");
                parse = Uri.parse(str72222222222);
                if (!parse.isAbsolute()) {
                }
                this.b = parse;
                return;
            case 1503095341:
                if (str2.equals("audio/3gpp")) {
                    i3 = 1;
                    str3 = str;
                    z6 = false;
                    d6z.k("Multi channel AMR is not currently supported.", i != i3 ? i3 : z6 ? 1 : 0);
                    d6z.k("fmtp parameters must include octet-align.", (a.isEmpty() ? 1 : 0) ^ i3);
                    d6z.k("Only octet aligned mode is currently supported.", a.containsKey("octet-align"));
                    d6z.k("Interleaving mode is not currently supported.", (a.containsKey("interleaving") ? 1 : 0) ^ i3);
                    z2 = z6;
                    i2 = i3;
                    z = z2;
                    d6z.l(i7 > 0 ? i2 : z);
                    this.a = new vil0(new a(f7sVar), i5, i7, a, str3);
                    String str722222222222 = (String) immutableMap.get("control");
                    parse = Uri.parse(str722222222222);
                    if (!parse.isAbsolute()) {
                    }
                    this.b = parse;
                    return;
                }
                i2 = 1;
                str3 = str;
                z = 0;
                d6z.l(i7 > 0 ? i2 : z);
                this.a = new vil0(new a(f7sVar), i5, i7, a, str3);
                String str7222222222222 = (String) immutableMap.get("control");
                parse = Uri.parse(str7222222222222);
                if (!parse.isAbsolute()) {
                }
                this.b = parse;
                return;
            case 1504891608:
                if (str2.equals("audio/opus")) {
                    d6z.l(i != -1);
                    d6z.k("Invalid OPUS clock rate.", i7 == 48000);
                }
                i2 = 1;
                str3 = str;
                z = 0;
                d6z.l(i7 > 0 ? i2 : z);
                this.a = new vil0(new a(f7sVar), i5, i7, a, str3);
                String str72222222222222 = (String) immutableMap.get("control");
                parse = Uri.parse(str72222222222222);
                if (!parse.isAbsolute()) {
                }
                this.b = parse;
                return;
            case 1599127256:
                if (str2.equals("video/x-vnd.on2.vp8")) {
                    f7sVar.t = 320;
                    f7sVar.u = PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC;
                }
                i2 = 1;
                str3 = str;
                z = 0;
                d6z.l(i7 > 0 ? i2 : z);
                this.a = new vil0(new a(f7sVar), i5, i7, a, str3);
                String str722222222222222 = (String) immutableMap.get("control");
                parse = Uri.parse(str722222222222222);
                if (!parse.isAbsolute()) {
                }
                this.b = parse;
                return;
            case 1599127257:
                if (str2.equals("video/x-vnd.on2.vp9")) {
                    f7sVar.t = 320;
                    f7sVar.u = PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC;
                }
                i2 = 1;
                str3 = str;
                z = 0;
                d6z.l(i7 > 0 ? i2 : z);
                this.a = new vil0(new a(f7sVar), i5, i7, a, str3);
                String str7222222222222222 = (String) immutableMap.get("control");
                parse = Uri.parse(str7222222222222222);
                if (!parse.isAbsolute()) {
                }
                this.b = parse;
                return;
            case 1903231877:
                str2.equals("audio/g711-alaw");
                i2 = 1;
                str3 = str;
                z = 0;
                d6z.l(i7 > 0 ? i2 : z);
                this.a = new vil0(new a(f7sVar), i5, i7, a, str3);
                String str72222222222222222 = (String) immutableMap.get("control");
                parse = Uri.parse(str72222222222222222);
                if (!parse.isAbsolute()) {
                }
                this.b = parse;
                return;
            case 1903589369:
                str2.equals("audio/g711-mlaw");
                i2 = 1;
                str3 = str;
                z = 0;
                d6z.l(i7 > 0 ? i2 : z);
                this.a = new vil0(new a(f7sVar), i5, i7, a, str3);
                String str722222222222222222 = (String) immutableMap.get("control");
                parse = Uri.parse(str722222222222222222);
                if (!parse.isAbsolute()) {
                }
                this.b = parse;
                return;
            default:
                i2 = 1;
                str3 = str;
                z = 0;
                d6z.l(i7 > 0 ? i2 : z);
                this.a = new vil0(new a(f7sVar), i5, i7, a, str3);
                String str7222222222222222222 = (String) immutableMap.get("control");
                parse = Uri.parse(str7222222222222222222);
                if (!parse.isAbsolute()) {
                }
                this.b = parse;
                return;
        }
    }

    public static byte[] a(String str) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length + 4];
        System.arraycopy(l150.a, 0, bArr, 0, 4);
        System.arraycopy(decode, 0, bArr, 4, decode.length);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jjl0.class == obj.getClass()) {
            jjl0 jjl0Var = (jjl0) obj;
            if (this.a.equals(jjl0Var.a) && this.b.equals(jjl0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 217) * 31);
    }
}
