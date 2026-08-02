package defpackage;

import android.media.MediaCodecInfo;
import android.util.Base64;
import android.util.Pair;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;
import org.webrtc.WebrtcBuildVersion;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import yads.lj1;
import yads.t31;

/* loaded from: classes7.dex */
public abstract class o581 {
    public static final Pattern a;
    public static final HashMap b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static int j;

    static {
        z881 z881Var = mf81.e;
        a = Pattern.compile("^\\D?(\\d+)$");
        b = new HashMap();
        z881Var.getClass();
        byte[] decode = Base64.decode("YXZjMQ==", 0);
        Charset charset = uza.a;
        c = new String(decode, charset);
        d = new String(Base64.decode("YXZjMg==", 0), charset);
        e = new String(Base64.decode("dnAwOQ==", 0), charset);
        f = new String(Base64.decode("aGV2MQ==", 0), charset);
        g = new String(Base64.decode("aHZjMQ==", 0), charset);
        h = new String(Base64.decode("YXYwMQ==", 0), charset);
        i = new String(Base64.decode("bXA0YQ==", 0), charset);
        j = -1;
    }

    public static int a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i2;
        if (j == -1) {
            int i3 = 0;
            List e2 = e("video/avc", false, false);
            aq61 aq61Var = e2.isEmpty() ? null : (aq61) e2.get(0);
            if (aq61Var != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = aq61Var.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = codecProfileLevelArr[i3].level;
                    if (i5 != 1 && i5 != 2) {
                        switch (i5) {
                            case 8:
                            case 16:
                            case 32:
                                i2 = 101376;
                                break;
                            case 64:
                                i2 = 202752;
                                break;
                            case 128:
                            case 256:
                                i2 = 414720;
                                break;
                            case 512:
                                i2 = 921600;
                                break;
                            case 1024:
                                i2 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i2 = 2097152;
                                break;
                            case 8192:
                                i2 = 2228224;
                                break;
                            case 16384:
                                i2 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i2 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i2 = 35651584;
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                    } else {
                        i2 = 25344;
                    }
                    i4 = Math.max(i2, i4);
                    i3++;
                }
                i3 = Math.max(i4, rf71.a >= 21 ? 345600 : 172800);
            }
            j = i3;
        }
        return j;
    }

    public static String b(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            byte[] decode = Base64.decode("T01YLk1TLkhFVkNEVi5EZWNvZGVy", 0);
            Charset charset = uza.a;
            if (new String(decode, charset).equals(str)) {
                return new String(Base64.decode("dmlkZW8vaGV2Y2R2", 0), charset);
            }
            if (new String(Base64.decode("T01YLlJUSy52aWRlby5kZWNvZGVy", 0), charset).equals(str) || new String(Base64.decode("T01YLnJlYWx0ZWsudmlkZW8uZGVjb2Rlci50dW5uZWxlZA==", 0), charset).equals(str)) {
                return new String(Base64.decode("dmlkZW8vZHZfaGV2Yw==", 0), charset);
            }
            return null;
        }
        if (str2.equals("audio/alac") && new String(Base64.decode("T01YLmxnZS5hbGFjLmRlY29kZXI=", 0), uza.a).equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && new String(Base64.decode("T01YLmxnZS5mbGFjLmRlY29kZXI=", 0), uza.a).equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && new String(Base64.decode("T01YLmxnZS5hYzMuZGVjb2Rlcg==", 0), uza.a).equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static String c(qd81 qd81Var) {
        Pair i2;
        if ("audio/eac3-joc".equals(qd81Var.E)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(qd81Var.E) || (i2 = i(qd81Var)) == null) {
            return null;
        }
        int intValue = ((Integer) i2.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0118 A[Catch: Exception -> 0x0160, TRY_ENTER, TryCatch #0 {Exception -> 0x0160, blocks: (B:3:0x000a, B:5:0x001c, B:7:0x0026, B:12:0x0137, B:13:0x0031, B:16:0x003e, B:48:0x0110, B:51:0x0118, B:53:0x011e, B:56:0x013d, B:57:0x015e), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013d A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(zm71 zm71Var, us71 us71Var) {
        String b2;
        String str;
        int i2;
        String str2;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean a2;
        boolean c2;
        boolean z;
        boolean z2;
        String str3;
        zm71 zm71Var2 = zm71Var;
        boolean z3 = zm71Var2.b;
        try {
            ArrayList arrayList = new ArrayList();
            String str4 = zm71Var2.a;
            int a3 = us71Var.a();
            boolean b3 = us71Var.b();
            int i3 = 0;
            while (i3 < a3) {
                MediaCodecInfo b4 = us71Var.b(i3);
                int i4 = rf71.a;
                if (i4 < 29 || !b4.isAlias()) {
                    int i5 = i3;
                    String name = b4.getName();
                    if (h(b4, name, b3, str4) && (b2 = b(b4, name, str4)) != null) {
                        try {
                            capabilitiesForType = b4.getCapabilitiesForType(b2);
                            a2 = us71Var.a("tunneled-playback", b2, capabilitiesForType);
                            c2 = us71Var.c("tunneled-playback", capabilitiesForType);
                            z = zm71Var2.c;
                        } catch (Exception e2) {
                            e = e2;
                            str = name;
                            i2 = i5;
                            str2 = b2;
                        }
                        if ((z || !c2) && (!z || a2)) {
                            boolean a4 = us71Var.a("secure-playback", b2, capabilitiesForType);
                            boolean c3 = us71Var.c("secure-playback", capabilitiesForType);
                            if ((z3 || !c3) && (!z3 || a4)) {
                                boolean isHardwareAccelerated = i4 >= 29 ? b4.isHardwareAccelerated() : !g(b4, str4);
                                g(b4, str4);
                                if (i4 >= 29) {
                                    b4.isVendor();
                                    z2 = isHardwareAccelerated;
                                    str3 = b2;
                                } else {
                                    String a5 = tea1.a(b4.getName());
                                    z2 = isHardwareAccelerated;
                                    str3 = b2;
                                    try {
                                        try {
                                            if (!a5.startsWith(new String(Base64.decode("b214Lmdvb2dsZS4=", 0), uza.a))) {
                                                a5.startsWith("c2.android.");
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            str = name;
                                            i2 = i5;
                                            str2 = str3;
                                            if (rf71.a <= 23) {
                                            }
                                            nba1.c("MediaCodecUtil", "Failed to query codec " + str + Extension.O_BRAKE_SPACE + str2 + Extension.C_BRAKE);
                                            throw e;
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        str = name;
                                        i2 = i5;
                                        str2 = str3;
                                        if (rf71.a <= 23) {
                                        }
                                        nba1.c("MediaCodecUtil", "Failed to query codec " + str + Extension.O_BRAKE_SPACE + str2 + Extension.C_BRAKE);
                                        throw e;
                                    }
                                }
                                if (!(b3 && z3 == a4) && (b3 || z3)) {
                                    str = name;
                                    str2 = str3;
                                    i2 = i5;
                                    boolean z4 = z2;
                                    if (!b3 && a4) {
                                        arrayList.add(aq61.a(str + ".secure", str4, str2, capabilitiesForType, z4, true));
                                        break;
                                    }
                                    i3 = i2 + 1;
                                    zm71Var2 = zm71Var;
                                } else {
                                    str2 = str3;
                                    i2 = i5;
                                    try {
                                        str = name;
                                    } catch (Exception e5) {
                                        e = e5;
                                        str = name;
                                        if (rf71.a <= 23 || arrayList.isEmpty()) {
                                            nba1.c("MediaCodecUtil", "Failed to query codec " + str + Extension.O_BRAKE_SPACE + str2 + Extension.C_BRAKE);
                                            throw e;
                                        }
                                        nba1.c("MediaCodecUtil", "Skipping codec " + str + " (failed to query capabilities)");
                                        i3 = i2 + 1;
                                        zm71Var2 = zm71Var;
                                    }
                                    try {
                                        arrayList.add(aq61.a(name, str4, str2, capabilitiesForType, z2, false));
                                    } catch (Exception e6) {
                                        e = e6;
                                        if (rf71.a <= 23) {
                                        }
                                        nba1.c("MediaCodecUtil", "Failed to query codec " + str + Extension.O_BRAKE_SPACE + str2 + Extension.C_BRAKE);
                                        throw e;
                                    }
                                    i3 = i2 + 1;
                                    zm71Var2 = zm71Var;
                                }
                            }
                        }
                    }
                    i2 = i5;
                } else {
                    i2 = i3;
                }
                i3 = i2 + 1;
                zm71Var2 = zm71Var;
            }
            return arrayList;
        } catch (Exception e7) {
            throw new lj1("Failed to query underlying media codecs", e7);
        }
    }

    public static synchronized List e(String str, boolean z, boolean z2) {
        synchronized (o581.class) {
            try {
                zm71 zm71Var = new zm71(str, z, z2);
                HashMap hashMap = b;
                List list = (List) hashMap.get(zm71Var);
                if (list != null) {
                    return list;
                }
                int i2 = rf71.a;
                ArrayList d2 = d(zm71Var, i2 >= 21 ? new dd10(z, z2) : new aw71());
                if (z && d2.isEmpty() && 21 <= i2 && i2 <= 23) {
                    d2 = d(zm71Var, new aw71());
                    if (!d2.isEmpty()) {
                        String str2 = ((aq61) d2.get(0)).a;
                        nba1.e();
                    }
                }
                f(str, d2);
                t31 m = t31.m(d2);
                hashMap.put(zm71Var, m);
                return m;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void f(String str, ArrayList arrayList) {
        int i2 = 16;
        if ("audio/raw".equals(str)) {
            if (rf71.a < 26) {
                String str2 = rf71.b;
                mf81.e.getClass();
                byte[] decode = Base64.decode("Ujk=", 0);
                Charset charset = uza.a;
                if (str2.equals(new String(decode, charset)) && arrayList.size() == 1 && ((aq61) arrayList.get(0)).a.equals(new String(Base64.decode("T01YLk1USy5BVURJTy5ERUNPREVSLlJBVw==", 0), charset))) {
                    arrayList.add(aq61.a(new String(Base64.decode("T01YLmdvb2dsZS5yYXcuZGVjb2Rlcg==", 0), charset), "audio/raw", "audio/raw", null, false, false));
                }
            }
            Collections.sort(arrayList, new oe7(i2, new su71(6)));
        }
        int i3 = rf71.a;
        if (i3 < 21 && arrayList.size() > 1) {
            String str3 = ((aq61) arrayList.get(0)).a;
            mf81.e.getClass();
            byte[] decode2 = Base64.decode("T01YLlNFQy5tcDMuZGVj", 0);
            Charset charset2 = uza.a;
            if (new String(decode2, charset2).equals(str3) || new String(Base64.decode("T01YLlNFQy5NUDMuRGVjb2Rlcg==", 0), charset2).equals(str3) || new String(Base64.decode("T01YLmJyY20uYXVkaW8ubXAzLmRlY29kZXI=", 0), charset2).equals(str3)) {
                Collections.sort(arrayList, new oe7(i2, new su71(7)));
            }
        }
        if (i3 >= 32 || arrayList.size() <= 1) {
            return;
        }
        String str4 = ((aq61) arrayList.get(0)).a;
        mf81.e.getClass();
        if (new String(Base64.decode("T01YLnF0aS5hdWRpby5kZWNvZGVyLmZsYWM=", 0), uza.a).equals(str4)) {
            arrayList.add((aq61) arrayList.remove(0));
        }
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str) {
        if (rf71.a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str))) {
            return true;
        }
        String a2 = tea1.a(mediaCodecInfo.getName());
        if (!a2.startsWith("arc.")) {
            byte[] decode = Base64.decode("b214Lmdvb2dsZS4=", 0);
            Charset charset = uza.a;
            if (a2.startsWith(new String(decode, charset)) || a2.startsWith(new String(Base64.decode("b214LmZmbXBlZy4=", 0), charset))) {
                return true;
            }
            if ((a2.startsWith(new String(Base64.decode("b214LnNlYy4=", 0), charset)) && a2.contains(".sw.")) || a2.equals(new String(Base64.decode("b214LnFjb20udmlkZW8uZGVjb2Rlci5oZXZjc3d2ZGVj", 0), charset)) || a2.startsWith("c2.android.") || a2.startsWith("c2.google.")) {
                return true;
            }
            if (!a2.startsWith(new String(Base64.decode("b214Lg==", 0), charset)) && !a2.startsWith("c2.")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0340, code lost:
    
        if (r1.startsWith(new java.lang.String(android.util.Base64.decode("dDA=", 0), r5)) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0367, code lost:
    
        if (new java.lang.String(android.util.Base64.decode("T01YLnFjb20udmlkZW8uZGVjb2Rlci52cDg=", 0), r3).equals(r7) != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if ("MP3Decoder".equals(r7) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bd, code lost:
    
        if (r1.startsWith(new java.lang.String(android.util.Base64.decode("SE0=", 0), r2)) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a4, code lost:
    
        if (new java.lang.String(android.util.Base64.decode("U08tMDJF", 0), r3).equals(r2) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0201, code lost:
    
        if (new java.lang.String(android.util.Base64.decode("QzE2MDU=", 0), r2).equals(r1) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02c8, code lost:
    
        if (new java.lang.String(android.util.Base64.decode("U0NWMzE=", 0), r3).equals(r8) == false) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (!mediaCodecInfo.isEncoder() && (z || !str.endsWith(".secure"))) {
            int i2 = rf71.a;
            if (i2 < 21) {
                byte[] decode = Base64.decode("Q0lQQUFDRGVjb2Rlcg==", 0);
                Charset charset = uza.a;
                if (!new String(decode, charset).equals(str)) {
                    if (!new String(Base64.decode("Q0lQTVAzRGVjb2Rlcg==", 0), charset).equals(str)) {
                        if (!new String(Base64.decode("Q0lQVm9yYmlzRGVjb2Rlcg==", 0), charset).equals(str)) {
                            if (!new String(Base64.decode("Q0lQQU1STkJEZWNvZGVy", 0), charset).equals(str)) {
                                if (!"AACDecoder".equals(str)) {
                                }
                            }
                        }
                    }
                }
            }
            if (i2 < 18) {
                byte[] decode2 = Base64.decode("T01YLk1USy5BVURJTy5ERUNPREVSLkFBQw==", 0);
                Charset charset2 = uza.a;
                if (new String(decode2, charset2).equals(str)) {
                    String str3 = new String(Base64.decode("YTcw", 0), charset2);
                    String str4 = rf71.b;
                    if (!str3.equals(str4)) {
                        if (new String(Base64.decode("WGlhb21p", 0), charset2).equals(rf71.c)) {
                        }
                    }
                }
            }
            if (i2 == 16) {
                byte[] decode3 = Base64.decode("T01YLnFjb20uYXVkaW8uZGVjb2Rlci5tcDM=", 0);
                Charset charset3 = uza.a;
                if (new String(decode3, charset3).equals(str)) {
                    String str5 = new String(Base64.decode("ZGx4dQ==", 0), charset3);
                    String str6 = rf71.b;
                    if (!str5.equals(str6)) {
                        if (!new String(Base64.decode("cHJvdG91", 0), charset3).equals(str6)) {
                            if (!new String(Base64.decode("dmlsbGU=", 0), charset3).equals(str6)) {
                                if (!new String(Base64.decode("dmlsbGVwbHVz", 0), charset3).equals(str6)) {
                                    if (!new String(Base64.decode("dmlsbGVjMg==", 0), charset3).equals(str6)) {
                                        if (!str6.startsWith(new String(Base64.decode("Z2Vl", 0), charset3))) {
                                            if (!new String(Base64.decode("QzY2MDI=", 0), charset3).equals(str6)) {
                                                if (!new String(Base64.decode("QzY2MDM=", 0), charset3).equals(str6)) {
                                                    if (!new String(Base64.decode("QzY2MDY=", 0), charset3).equals(str6)) {
                                                        if (!new String(Base64.decode("QzY2MTY=", 0), charset3).equals(str6)) {
                                                            if (!new String(Base64.decode("TDM2aA==", 0), charset3).equals(str6)) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i2 == 16) {
                byte[] decode4 = Base64.decode("T01YLnFjb20uYXVkaW8uZGVjb2Rlci5hYWM=", 0);
                Charset charset4 = uza.a;
                if (new String(decode4, charset4).equals(str)) {
                    String str7 = new String(Base64.decode("QzE1MDQ=", 0), charset4);
                    String str8 = rf71.b;
                    if (!str7.equals(str8)) {
                        if (!new String(Base64.decode("QzE1MDU=", 0), charset4).equals(str8)) {
                            if (!new String(Base64.decode("QzE2MDQ=", 0), charset4).equals(str8)) {
                            }
                        }
                    }
                }
            }
            if (i2 < 24) {
                byte[] decode5 = Base64.decode("T01YLlNFQy5hYWMuZGVj", 0);
                Charset charset5 = uza.a;
                if ((new String(decode5, charset5).equals(str) || new String(Base64.decode("T01YLkV4eW5vcy5BQUMuRGVjb2Rlcg==", 0), charset5).equals(str)) && new String(Base64.decode("c2Ftc3VuZw==", 0), charset5).equals(rf71.c)) {
                    String str9 = rf71.b;
                    if (!str9.startsWith(new String(Base64.decode("emVyb2ZsdGU=", 0), charset5))) {
                        if (!str9.startsWith(new String(Base64.decode("emVyb2x0ZQ==", 0), charset5))) {
                            if (!str9.startsWith(new String(Base64.decode("emVubHRl", 0), charset5))) {
                                if (!new String(Base64.decode("U0MtMDVH", 0), charset5).equals(str9)) {
                                    if (!new String(Base64.decode("bWFyaW5lbHRlYXR0", 0), charset5).equals(str9)) {
                                        if (!new String(Base64.decode("NDA0U0M=", 0), charset5).equals(str9)) {
                                            if (!new String(Base64.decode("U0MtMDRH", 0), charset5).equals(str9)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i2 <= 19) {
                byte[] decode6 = Base64.decode("T01YLlNFQy52cDguZGVj", 0);
                Charset charset6 = uza.a;
                if (new String(decode6, charset6).equals(str) && new String(Base64.decode("c2Ftc3VuZw==", 0), charset6).equals(rf71.c)) {
                    String str10 = rf71.b;
                    if (!str10.startsWith("d2")) {
                        if (!str10.startsWith(new String(Base64.decode("c2VycmFubw==", 0), charset6))) {
                            if (!str10.startsWith(new String(Base64.decode("amZsdGU=", 0), charset6))) {
                                if (!str10.startsWith(new String(Base64.decode("c2FudG9z", 0), charset6))) {
                                }
                            }
                        }
                    }
                }
            }
            if (i2 <= 19) {
                String str11 = rf71.b;
                byte[] decode7 = Base64.decode("amZsdGU=", 0);
                Charset charset7 = uza.a;
                if (str11.startsWith(new String(decode7, charset7))) {
                }
            }
            if (i2 > 23 || !"audio/eac3-joc".equals(str2) || !new String(Base64.decode("T01YLk1USy5BVURJTy5ERUNPREVSLkRTUEFDMw==", 0), uza.a).equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x043d A[Catch: NumberFormatException -> 0x044d, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x044d, blocks: (B:275:0x03ec, B:277:0x0400, B:288:0x041e, B:291:0x043d), top: B:274:0x03ec }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x06d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair i(qd81 qd81Var) {
        int i2;
        int i3;
        int i4;
        int parseInt;
        int i5;
        int parseInt2;
        int i6;
        int i7;
        Integer num;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Integer num2;
        char c2;
        Integer num3;
        Integer num4;
        char c3;
        String str = qd81Var.B;
        if (str != null) {
            String[] split = str.split("\\.");
            boolean equals = "video/dolby-vision".equals(qd81Var.E);
            Pattern pattern = a;
            if (equals) {
                if (split.length < 3) {
                    nba1.e();
                    return null;
                }
                Matcher matcher = pattern.matcher(split[1]);
                if (!matcher.matches()) {
                    nba1.e();
                    return null;
                }
                String group = matcher.group(1);
                if (group == null) {
                    num2 = 4096;
                } else {
                    switch (group.hashCode()) {
                        case HProv.ALG_TYPE_BLOCK /* 1536 */:
                            num2 = 4096;
                            if (group.equals("00")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1537:
                            if (group.equals("01")) {
                                num2 = 4096;
                                c2 = 1;
                                break;
                            }
                            num2 = 4096;
                            c2 = 65535;
                            break;
                        case 1538:
                            if (group.equals("02")) {
                                num2 = 4096;
                                c2 = 2;
                                break;
                            }
                            num2 = 4096;
                            c2 = 65535;
                            break;
                        case 1539:
                            if (group.equals(WebrtcBuildVersion.webrtc_commit)) {
                                num2 = 4096;
                                c2 = 3;
                                break;
                            }
                            num2 = 4096;
                            c2 = 65535;
                            break;
                        case 1540:
                            if (group.equals("04")) {
                                num2 = 4096;
                                c2 = 4;
                                break;
                            }
                            num2 = 4096;
                            c2 = 65535;
                            break;
                        case 1541:
                            if (group.equals("05")) {
                                num2 = 4096;
                                c2 = 5;
                                break;
                            }
                            num2 = 4096;
                            c2 = 65535;
                            break;
                        case 1542:
                            if (group.equals("06")) {
                                num2 = 4096;
                                c2 = 6;
                                break;
                            }
                            num2 = 4096;
                            c2 = 65535;
                            break;
                        case 1543:
                            if (group.equals("07")) {
                                num2 = 4096;
                                c2 = 7;
                                break;
                            }
                            num2 = 4096;
                            c2 = 65535;
                            break;
                        case 1544:
                            if (group.equals("08")) {
                                num2 = 4096;
                                c2 = '\b';
                                break;
                            }
                            num2 = 4096;
                            c2 = 65535;
                            break;
                        case 1545:
                            if (group.equals("09")) {
                                num2 = 4096;
                                c2 = '\t';
                                break;
                            }
                            num2 = 4096;
                            c2 = 65535;
                            break;
                        default:
                            num2 = 4096;
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            num3 = 1;
                            break;
                        case 1:
                            num3 = 2;
                            break;
                        case 2:
                            num3 = 4;
                            break;
                        case 3:
                            num3 = 8;
                            break;
                        case 4:
                            num3 = 16;
                            break;
                        case 5:
                            num3 = 32;
                            break;
                        case 6:
                            num3 = 64;
                            break;
                        case 7:
                            num3 = 128;
                            break;
                        case '\b':
                            num3 = 256;
                            break;
                        case '\t':
                            num3 = 512;
                            break;
                    }
                    if (num3 != null) {
                        nba1.e();
                        return null;
                    }
                    String str2 = split[2];
                    if (str2 != null) {
                        switch (str2.hashCode()) {
                            case 1537:
                                if (str2.equals("01")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1538:
                                if (str2.equals("02")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1539:
                                if (str2.equals(WebrtcBuildVersion.webrtc_commit)) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1540:
                                if (str2.equals("04")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1541:
                                if (str2.equals("05")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1542:
                                if (str2.equals("06")) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1543:
                                if (str2.equals("07")) {
                                    c3 = 6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1544:
                                if (str2.equals("08")) {
                                    c3 = 7;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1545:
                                if (str2.equals("09")) {
                                    c3 = '\b';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1567:
                                if (str2.equals("10")) {
                                    c3 = '\t';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1568:
                                if (str2.equals("11")) {
                                    c3 = '\n';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1569:
                                if (str2.equals("12")) {
                                    c3 = 11;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1570:
                                if (str2.equals("13")) {
                                    c3 = '\f';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                                num4 = 1;
                                break;
                            case 1:
                                num4 = 2;
                                break;
                            case 2:
                                num4 = 4;
                                break;
                            case 3:
                                num4 = 8;
                                break;
                            case 4:
                                num4 = 16;
                                break;
                            case 5:
                                num4 = 32;
                                break;
                            case 6:
                                num4 = 64;
                                break;
                            case 7:
                                num4 = 128;
                                break;
                            case '\b':
                                num4 = 256;
                                break;
                            case '\t':
                                num4 = 512;
                                break;
                            case '\n':
                                num4 = 1024;
                                break;
                            case 11:
                                num4 = 2048;
                                break;
                            case '\f':
                                num4 = num2;
                                break;
                        }
                        if (num4 == null) {
                            return new Pair(num3, num4);
                        }
                        nba1.e();
                        return null;
                    }
                    num4 = null;
                    if (num4 == null) {
                    }
                }
                num3 = null;
                if (num3 != null) {
                }
            } else {
                if (c.equals(split[0]) || d.equals(split[0])) {
                    int i13 = 8;
                    if (split.length < 2) {
                        nba1.e();
                        return null;
                    }
                    try {
                        if (split[1].length() == 6) {
                            i2 = 16;
                            parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                            i3 = 4;
                            parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                            i5 = 2;
                            i4 = 1;
                        } else {
                            i2 = 16;
                            i3 = 4;
                            if (split.length < 3) {
                                nba1.e();
                                return null;
                            }
                            i4 = 1;
                            parseInt = Integer.parseInt(split[1]);
                            i5 = 2;
                            parseInt2 = Integer.parseInt(split[2]);
                        }
                        int i14 = parseInt != 66 ? parseInt != 77 ? parseInt != 88 ? parseInt != 100 ? parseInt != 110 ? parseInt != 122 ? parseInt != 244 ? -1 : 64 : 32 : i2 : 8 : i3 : i5 : i4;
                        if (i14 == -1) {
                            nba1.e();
                            return null;
                        }
                        switch (parseInt2) {
                            case 10:
                                i13 = i4;
                                break;
                            case 11:
                                i13 = i3;
                                break;
                            case 12:
                                break;
                            case 13:
                                i13 = i2;
                                break;
                            default:
                                switch (parseInt2) {
                                    case 20:
                                        i13 = 32;
                                        break;
                                    case 21:
                                        i13 = 64;
                                        break;
                                    case 22:
                                        i13 = 128;
                                        break;
                                    default:
                                        switch (parseInt2) {
                                            case 30:
                                                i13 = 256;
                                                break;
                                            case 31:
                                                i13 = 512;
                                                break;
                                            case 32:
                                                i13 = 1024;
                                                break;
                                            default:
                                                switch (parseInt2) {
                                                    case 40:
                                                        i13 = 2048;
                                                        break;
                                                    case 41:
                                                        i13 = 4096;
                                                        break;
                                                    case 42:
                                                        i13 = 8192;
                                                        break;
                                                    default:
                                                        switch (parseInt2) {
                                                            case 50:
                                                                i13 = 16384;
                                                                break;
                                                            case SAFETY_TIPS_VALUE:
                                                                i13 = 32768;
                                                                break;
                                                            case 52:
                                                                i13 = 65536;
                                                                break;
                                                            default:
                                                                i13 = -1;
                                                                break;
                                                        }
                                                }
                                        }
                                }
                        }
                        if (i13 != -1) {
                            return new Pair(Integer.valueOf(i14), Integer.valueOf(i13));
                        }
                        nba1.e();
                        return null;
                    } catch (NumberFormatException unused) {
                        nba1.e();
                        return null;
                    }
                }
                if (e.equals(split[0])) {
                    if (split.length < 3) {
                        nba1.e();
                        return null;
                    }
                    try {
                        int parseInt3 = Integer.parseInt(split[1]);
                        int parseInt4 = Integer.parseInt(split[2]);
                        int i15 = parseInt3 != 0 ? parseInt3 != 1 ? parseInt3 != 2 ? parseInt3 != 3 ? -1 : 8 : 4 : 2 : 1;
                        if (i15 == -1) {
                            nba1.e();
                            return null;
                        }
                        if (parseInt4 == 10) {
                            i11 = -1;
                            i12 = 1;
                        } else if (parseInt4 == 11) {
                            i11 = -1;
                            i12 = 2;
                        } else if (parseInt4 == 20) {
                            i11 = -1;
                            i12 = 4;
                        } else if (parseInt4 == 21) {
                            i11 = -1;
                            i12 = 8;
                        } else if (parseInt4 == 30) {
                            i11 = -1;
                            i12 = 16;
                        } else if (parseInt4 == 31) {
                            i11 = -1;
                            i12 = 32;
                        } else if (parseInt4 == 40) {
                            i11 = -1;
                            i12 = 64;
                        } else if (parseInt4 == 41) {
                            i11 = -1;
                            i12 = 128;
                        } else if (parseInt4 == 50) {
                            i11 = -1;
                            i12 = 256;
                        } else if (parseInt4 != 51) {
                            switch (parseInt4) {
                                case 60:
                                    i11 = -1;
                                    i12 = 2048;
                                    break;
                                case 61:
                                    i11 = -1;
                                    i12 = 4096;
                                    break;
                                case 62:
                                    i12 = 8192;
                                    i11 = -1;
                                    break;
                                default:
                                    i11 = -1;
                                    i12 = -1;
                                    break;
                            }
                        } else {
                            i11 = -1;
                            i12 = 512;
                        }
                        if (i12 != i11) {
                            return new Pair(Integer.valueOf(i15), Integer.valueOf(i12));
                        }
                        nba1.e();
                        return null;
                    } catch (NumberFormatException unused2) {
                        nba1.e();
                        return null;
                    }
                }
                if (f.equals(split[0])) {
                    i6 = 16384;
                } else {
                    i6 = 16384;
                    if (!g.equals(split[0])) {
                        if (h.equals(split[0])) {
                            hw81 hw81Var = qd81Var.Q;
                            if (split.length < 4) {
                                nba1.e();
                                return null;
                            }
                            try {
                                int parseInt5 = Integer.parseInt(split[1]);
                                int parseInt6 = Integer.parseInt(split[2].substring(0, 2));
                                int parseInt7 = Integer.parseInt(split[3]);
                                if (parseInt5 != 0) {
                                    nba1.e();
                                    return null;
                                }
                                int i16 = 8;
                                if (parseInt7 != 8 && parseInt7 != 10) {
                                    nba1.e();
                                    return null;
                                }
                                int i17 = parseInt7 == 8 ? 1 : (hw81Var == null || !(hw81Var.w != null || (i10 = hw81Var.c) == 7 || i10 == 6)) ? 2 : 4096;
                                switch (parseInt6) {
                                    case 0:
                                        i16 = 1;
                                        break;
                                    case 1:
                                        i16 = 2;
                                        break;
                                    case 2:
                                        i16 = 4;
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        i16 = 16;
                                        break;
                                    case 5:
                                        i16 = 32;
                                        break;
                                    case 6:
                                        i16 = 64;
                                        break;
                                    case 7:
                                        i16 = 128;
                                        break;
                                    case 8:
                                        i16 = 256;
                                        break;
                                    case 9:
                                        i16 = 512;
                                        break;
                                    case 10:
                                        i16 = 1024;
                                        break;
                                    case 11:
                                        i16 = 2048;
                                        break;
                                    case 12:
                                        i16 = 4096;
                                        break;
                                    case 13:
                                        i16 = 8192;
                                        break;
                                    case 14:
                                        i16 = 16384;
                                        break;
                                    case 15:
                                        i16 = 32768;
                                        break;
                                    case 16:
                                        i16 = 65536;
                                        break;
                                    case 17:
                                        i16 = 131072;
                                        break;
                                    case 18:
                                        i16 = 262144;
                                        break;
                                    case 19:
                                        i16 = 524288;
                                        break;
                                    case 20:
                                        i16 = 1048576;
                                        break;
                                    case 21:
                                        i16 = 2097152;
                                        break;
                                    case 22:
                                        i16 = 4194304;
                                        break;
                                    case 23:
                                        i16 = 8388608;
                                        break;
                                    default:
                                        i16 = -1;
                                        break;
                                }
                                if (i16 != -1) {
                                    return new Pair(Integer.valueOf(i17), Integer.valueOf(i16));
                                }
                                nba1.e();
                                return null;
                            } catch (NumberFormatException unused3) {
                                nba1.e();
                                return null;
                            }
                        }
                        if (i.equals(split[0])) {
                            if (split.length != 3) {
                                nba1.e();
                                return null;
                            }
                            try {
                                if ("audio/mp4a-latm".equals(g681.a(Integer.parseInt(split[1], 16)))) {
                                    int parseInt8 = Integer.parseInt(split[2]);
                                    int i18 = 17;
                                    if (parseInt8 != 17) {
                                        if (parseInt8 != 20) {
                                            i18 = 23;
                                            if (parseInt8 != 23) {
                                                i18 = 29;
                                                if (parseInt8 != 29) {
                                                    i18 = 39;
                                                    if (parseInt8 != 39) {
                                                        i18 = 42;
                                                        if (parseInt8 != 42) {
                                                            switch (parseInt8) {
                                                                case 1:
                                                                    i9 = -1;
                                                                    i8 = 1;
                                                                    break;
                                                                case 2:
                                                                    i9 = -1;
                                                                    i8 = 2;
                                                                    break;
                                                                case 3:
                                                                    i9 = -1;
                                                                    i8 = 3;
                                                                    break;
                                                                case 4:
                                                                    i9 = -1;
                                                                    i8 = 4;
                                                                    break;
                                                                case 5:
                                                                    i8 = 5;
                                                                    break;
                                                                case 6:
                                                                    i9 = -1;
                                                                    i8 = 6;
                                                                    break;
                                                                default:
                                                                    i9 = -1;
                                                                    i8 = -1;
                                                                    break;
                                                            }
                                                            if (i8 != i9) {
                                                                return new Pair(Integer.valueOf(i8), 0);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            i8 = 20;
                                        }
                                        i9 = -1;
                                        if (i8 != i9) {
                                        }
                                    }
                                    i8 = i18;
                                    i9 = -1;
                                    if (i8 != i9) {
                                    }
                                }
                            } catch (NumberFormatException unused4) {
                                nba1.e();
                            }
                        }
                    }
                }
                if (split.length < 4) {
                    nba1.e();
                    return null;
                }
                Matcher matcher2 = pattern.matcher(split[1]);
                if (!matcher2.matches()) {
                    nba1.e();
                    return null;
                }
                String group2 = matcher2.group(1);
                if ("1".equals(group2)) {
                    i7 = 1;
                } else {
                    if (!"2".equals(group2)) {
                        nba1.e();
                        return null;
                    }
                    i7 = 2;
                }
                String str3 = split[3];
                if (str3 != null) {
                    mf81.e.getClass();
                    byte[] decode = Base64.decode("TDMw", 0);
                    Charset charset = uza.a;
                    if (new String(decode, charset).equals(str3)) {
                        num = 1;
                    } else if (new String(Base64.decode("TDYw", 0), charset).equals(str3)) {
                        num = 4;
                    } else if (new String(Base64.decode("TDYz", 0), charset).equals(str3)) {
                        num = 16;
                    } else if (new String(Base64.decode("TDkw", 0), charset).equals(str3)) {
                        num = 64;
                    } else if (new String(Base64.decode("TDkz", 0), charset).equals(str3)) {
                        num = 256;
                    } else if (new String(Base64.decode("TDEyMA==", 0), charset).equals(str3)) {
                        num = 1024;
                    } else if (new String(Base64.decode("TDEyMw==", 0), charset).equals(str3)) {
                        num = 4096;
                    } else if (new String(Base64.decode("TDE1MA==", 0), charset).equals(str3)) {
                        num = Integer.valueOf(i6);
                    } else if (new String(Base64.decode("TDE1Mw==", 0), charset).equals(str3)) {
                        num = 65536;
                    } else if (new String(Base64.decode("TDE1Ng==", 0), charset).equals(str3)) {
                        num = 262144;
                    } else if (new String(Base64.decode("TDE4MA==", 0), charset).equals(str3)) {
                        num = 1048576;
                    } else if (new String(Base64.decode("TDE4Mw==", 0), charset).equals(str3)) {
                        num = Integer.valueOf(SelfTester_JCP.ENCRYPT_CBC);
                    } else if (new String(Base64.decode("TDE4Ng==", 0), charset).equals(str3)) {
                        num = 16777216;
                    } else if (new String(Base64.decode("SDMw", 0), charset).equals(str3)) {
                        num = 2;
                    } else if (new String(Base64.decode("SDYw", 0), charset).equals(str3)) {
                        num = 8;
                    } else if (new String(Base64.decode("SDYz", 0), charset).equals(str3)) {
                        num = 32;
                    } else if (new String(Base64.decode("SDkw", 0), charset).equals(str3)) {
                        num = 128;
                    } else if (new String(Base64.decode("SDkz", 0), charset).equals(str3)) {
                        num = 512;
                    } else if (new String(Base64.decode("SDEyMA==", 0), charset).equals(str3)) {
                        num = 2048;
                    } else if (new String(Base64.decode("SDEyMw==", 0), charset).equals(str3)) {
                        num = 8192;
                    } else if (new String(Base64.decode("SDE1MA==", 0), charset).equals(str3)) {
                        num = 32768;
                    } else if (new String(Base64.decode("SDE1Mw==", 0), charset).equals(str3)) {
                        num = 131072;
                    } else if (new String(Base64.decode("SDE1Ng==", 0), charset).equals(str3)) {
                        num = 524288;
                    } else if (new String(Base64.decode("SDE4MA==", 0), charset).equals(str3)) {
                        num = 2097152;
                    } else if (new String(Base64.decode("SDE4Mw==", 0), charset).equals(str3)) {
                        num = Integer.valueOf(SelfTester_JCP.ENCRYPT_CNT);
                    } else if (new String(Base64.decode("SDE4Ng==", 0), charset).equals(str3)) {
                        num = Integer.valueOf(SelfTester_JCP.DECRYPT_CFB);
                    }
                    if (num == null) {
                        return new Pair(Integer.valueOf(i7), num);
                    }
                    nba1.e();
                    return null;
                }
                num = null;
                if (num == null) {
                }
            }
        }
        return null;
    }
}
