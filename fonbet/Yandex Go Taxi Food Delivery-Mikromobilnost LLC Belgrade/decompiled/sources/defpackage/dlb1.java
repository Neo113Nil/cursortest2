package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.action.MessagingAction;
import com.yandex.messaging.action.MessagingActionParser;
import com.yandex.messaging.domain.statuses.StatusAvailability;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.telemost.domain.entities.CallHistoryData;
import com.yandex.messaging.ui.chatinfo.mediabrowser.ui.MediaBrowserTab;
import com.yandex.messaging.ui.onboarding.OnboardingShowingType;
import com.yandex.messaging.ui.switchMeeting.SwitchMeetingAction;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes15.dex */
public abstract class dlb1 {
    /* JADX WARN: Removed duplicated region for block: B:107:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, final String str, String str2, long j, boolean z, final boolean z2, lzr lzrVar, long j2, ehr0 ehr0Var, iib iibVar, wls wlsVar, final sls slsVar, fid fidVar, final int i, final int i2, final int i3) {
        int i4;
        String str3;
        int i5;
        int i6;
        lzr lzrVar2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        final f530 f530Var2;
        final long j3;
        final boolean z3;
        final ehr0 ehr0Var2;
        final iib iibVar2;
        final wls wlsVar2;
        final lzr lzrVar3;
        final String str4;
        final long j4;
        aii0 v;
        long j5;
        long j6;
        f530 f530Var3;
        iib iibVar3;
        wls wlsVar3;
        int i12;
        ehr0 ehr0Var3;
        final boolean z4;
        long j7;
        int i13;
        bts btsVar = (bts) fidVar;
        btsVar.g0(486384728);
        int i14 = i3 & 1;
        if (i14 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= btsVar.k(str) ? 32 : 16;
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            str3 = str2;
            i4 |= btsVar.k(str3) ? 256 : 128;
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i4 |= ((i3 & 8) == 0 && btsVar.d(j)) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i4 |= btsVar.a(z) ? 16384 : 8192;
                if ((i & ImageMetadata.EDGE_MODE) == 0) {
                    i4 |= btsVar.a(z2) ? 131072 : 65536;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                    lzrVar2 = lzrVar;
                } else {
                    lzrVar2 = lzrVar;
                    if ((i & 1572864) == 0) {
                        i4 |= btsVar.k(lzrVar2) ? 1048576 : 524288;
                    }
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        i7 = i14;
                        if (btsVar.d(j2)) {
                            i13 = SelfTester_JCP.ENCRYPT_CNT;
                            i4 |= i13;
                        }
                    } else {
                        i7 = i14;
                    }
                    i13 = SelfTester_JCP.ENCRYPT_CBC;
                    i4 |= i13;
                } else {
                    i7 = i14;
                }
                if ((i & 100663296) == 0) {
                    i4 |= SelfTester_JCP.DECRYPT_CFB;
                }
                i8 = i3 & 512;
                if (i8 != 0) {
                    i4 |= 805306368;
                } else if ((805306368 & i) == 0) {
                    i4 |= btsVar.k(iibVar) ? 536870912 : SelfTester_JCP.IMITA;
                    i9 = i3 & 1024;
                    if (i9 == 0) {
                        i11 = i2 | 6;
                        i10 = i9;
                    } else if ((i2 & 6) == 0) {
                        i10 = i9;
                        i11 = i2 | (btsVar.e(wlsVar) ? 4 : 2);
                    } else {
                        i10 = i9;
                        i11 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i11 |= btsVar.e(slsVar) ? 32 : 16;
                    }
                    if (btsVar.V(i4 & 1, (i4 & 306783379) == 306783378 || (i11 & 19) != 18)) {
                        btsVar.Y();
                        f530Var2 = f530Var;
                        j3 = j;
                        z3 = z;
                        ehr0Var2 = ehr0Var;
                        iibVar2 = iibVar;
                        wlsVar2 = wlsVar;
                        lzrVar3 = lzrVar2;
                        str4 = str3;
                        j4 = j2;
                    } else {
                        btsVar.a0();
                        int i16 = i & 1;
                        c530 c530Var = c530.a;
                        if (i16 == 0 || btsVar.C()) {
                            f530 f530Var4 = i7 != 0 ? c530Var : f530Var;
                            if (i15 != 0) {
                                str3 = null;
                            }
                            if ((i3 & 8) != 0) {
                                j5 = ((el51) btsVar.m(gl51.a)).o();
                                i4 &= -7169;
                            } else {
                                j5 = j;
                            }
                            boolean z5 = i5 != 0 ? true : z;
                            lzr lzrVar4 = i6 != 0 ? lzr.E : lzrVar2;
                            if ((i3 & 128) != 0) {
                                j6 = ((el51) btsVar.m(gl51.a)).d();
                                i4 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            byk0 b = ((YandexShapes) btsVar.m(qm51.a)).b();
                            int i17 = i4 & (-234881025);
                            f530Var3 = f530Var4;
                            iibVar3 = i8 != 0 ? iib.c : iibVar;
                            wlsVar3 = i10 != 0 ? null : wlsVar;
                            i12 = i17;
                            ehr0Var3 = b;
                            lzrVar2 = lzrVar4;
                            z4 = z5;
                            j7 = j5;
                        } else {
                            btsVar.Y();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            int i18 = i4 & (-234881025);
                            f530Var3 = f530Var;
                            j7 = j;
                            z4 = z;
                            j6 = j2;
                            ehr0Var3 = ehr0Var;
                            wlsVar3 = wlsVar;
                            i12 = i18;
                            iibVar3 = iibVar;
                        }
                        btsVar.u();
                        final iib iibVar4 = iibVar3;
                        f530 d = hi91.d(f530Var3, false, null, 3);
                        z910 d2 = pi6.d(x4c.b, false);
                        int hashCode = Long.hashCode(btsVar.T);
                        r1b0 o = btsVar.o();
                        f530 d3 = b.d(btsVar, d);
                        ohd.G1.getClass();
                        sls slsVar2 = d.b;
                        final long j8 = j7;
                        if (btsVar.a == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar.i0();
                        if (btsVar.S) {
                            btsVar.n(slsVar2);
                        } else {
                            btsVar.r0();
                        }
                        qje.W(btsVar, d.f, d2);
                        qje.W(btsVar, d.e, o);
                        wls wlsVar4 = d.g;
                        if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                            b64.z(hashCode, btsVar, hashCode, wlsVar4);
                        }
                        qje.W(btsVar, d.d, d3);
                        f530 e = ljs0.e(c530Var, 56.0f);
                        awk0 awk0Var = new awk0(3);
                        boolean z6 = (i11 & 112) == 32;
                        Object Q = btsVar.Q();
                        o430 o430Var = did.a;
                        if (z6 || Q == o430Var) {
                            Q = new ic0(11, slsVar);
                            btsVar.o0(Q);
                        }
                        f530 w = r5a1.w(e, z2, false, awk0Var, (tls) Q, 10);
                        int i19 = i12;
                        boolean z7 = ((i19 & 112) == 32) | ((i19 & 896) == 256);
                        Object Q2 = btsVar.Q();
                        if (z7 || Q2 == o430Var) {
                            Q2 = new r(str, str3, 8);
                            btsVar.o0(Q2);
                        }
                        f530 f530Var5 = f530Var3;
                        l27 l27Var = new l27((tls) Q2);
                        final lzr lzrVar5 = lzrVar2;
                        final String str5 = str3;
                        final wls wlsVar5 = wlsVar3;
                        ehr0 ehr0Var4 = ehr0Var3;
                        boolean z8 = z4;
                        long j9 = j6;
                        a.b(slsVar, w, ehr0Var4, j9, 0L, null, null, null, z8, null, null, l27Var, wwg.S(1527048785, true, new zls() { // from class: lib
                            @Override // defpackage.zls
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                bts btsVar2 = (bts) fidVar2;
                                if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                    web1.c(null, 56.0f, false, 0.0f, null, wls.this, wwg.S(-801842451, true, new k7a(j8, lzrVar5, str, str5), btsVar2), null, null, wwg.S(733790986, true, new s0(z2, z4, iibVar4, slsVar), btsVar2), null, null, false, btsVar2, 806879280, 0, 7581);
                                } else {
                                    btsVar2.Y();
                                }
                                return zy11.a;
                            }
                        }, btsVar), btsVar, ((i11 >> 3) & 14) | ((i19 >> 12) & 7168) | (234881024 & (i19 << 12)), 384, 1776);
                        btsVar.t(true);
                        ehr0Var2 = ehr0Var4;
                        j4 = j9;
                        z3 = z8;
                        f530Var2 = f530Var5;
                        str4 = str5;
                        lzrVar3 = lzrVar5;
                        iibVar2 = iibVar4;
                        wlsVar2 = wlsVar5;
                        j3 = j8;
                    }
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new wls() { // from class: mib
                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int O = vng.O(i | 1);
                                int O2 = vng.O(i2);
                                dlb1.a(f530.this, str, str4, j3, z3, z2, lzrVar3, j4, ehr0Var2, iibVar2, wlsVar2, slsVar, (fid) obj, O, O2, i3);
                                return zy11.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i9 = i3 & 1024;
                if (i9 == 0) {
                }
                if ((i2 & 48) == 0) {
                }
                if (btsVar.V(i4 & 1, (i4 & 306783379) == 306783378 || (i11 & 19) != 18)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            if ((i & ImageMetadata.EDGE_MODE) == 0) {
            }
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i8 = i3 & 512;
            if (i8 != 0) {
            }
            i9 = i3 & 1024;
            if (i9 == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if (btsVar.V(i4 & 1, (i4 & 306783379) == 306783378 || (i11 & 19) != 18)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        str3 = str2;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        if ((i & ImageMetadata.EDGE_MODE) == 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i8 = i3 & 512;
        if (i8 != 0) {
        }
        i9 = i3 & 1024;
        if (i9 == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if (btsVar.V(i4 & 1, (i4 & 306783379) == 306783378 || (i11 & 19) != 18)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [com.yandex.messaging.internal.ServerMessageRef] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.CharSequence[]] */
    /* JADX WARN: Type inference failed for: r0v50, types: [com.yandex.messaging.internal.ServerMessageRef] */
    /* JADX WARN: Type inference failed for: r0v52, types: [com.yandex.messaging.internal.ServerMessageRef] */
    /* JADX WARN: Type inference failed for: r0v55, types: [com.yandex.messaging.internal.ServerMessageRef] */
    /* JADX WARN: Type inference failed for: r0v56, types: [double[]] */
    /* JADX WARN: Type inference failed for: r0v57, types: [com.yandex.messaging.internal.ServerMessageRef] */
    /* JADX WARN: Type inference failed for: r0v60, types: [com.yandex.messaging.internal.ServerMessageRef] */
    /* JADX WARN: Type inference failed for: r0v61, types: [float[]] */
    /* JADX WARN: Type inference failed for: r0v62, types: [com.yandex.messaging.internal.ServerMessageRef] */
    /* JADX WARN: Type inference failed for: r0v65, types: [com.yandex.messaging.internal.ServerMessageRef] */
    /* JADX WARN: Type inference failed for: r0v66, types: [long[]] */
    /* JADX WARN: Type inference failed for: r0v67, types: [com.yandex.messaging.internal.ServerMessageRef] */
    /* JADX WARN: Type inference failed for: r0v70, types: [com.yandex.messaging.internal.ServerMessageRef] */
    /* JADX WARN: Type inference failed for: r0v71, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v72, types: [com.yandex.messaging.internal.ServerMessageRef] */
    /* JADX WARN: Type inference failed for: r0v75, types: [com.yandex.messaging.internal.ServerMessageRef] */
    /* JADX WARN: Type inference failed for: r0v78, types: [com.yandex.messaging.internal.ServerMessageRef] */
    /* JADX WARN: Type inference failed for: r0v79, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v80, types: [com.yandex.messaging.internal.ServerMessageRef] */
    /* JADX WARN: Type inference failed for: r0v82, types: [com.yandex.messaging.internal.ServerMessageRef] */
    /* JADX WARN: Type inference failed for: r0v86, types: [com.yandex.messaging.internal.ServerMessageRef] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.yandex.messaging.action.MessagingAction] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.yandex.messaging.action.MessagingAction] */
    public static s120 b(Bundle bundle) {
        Object obj;
        String d = d(bundle, "Messaging.Arguments.Key");
        int hashCode = d.hashCode();
        MessagingAction.OpenChatList openChatList = MessagingAction.OpenChatList.a;
        switch (hashCode) {
            case -2147177627:
                if (d.equals("Messaging.Arguments.Key.Unauthorized")) {
                    return new bw11(bundle);
                }
                break;
            case -1909854444:
                if (d.equals("Messaging.Arguments.Key.Settings")) {
                    String string = bundle.getString("Messaging.Arguments.Source");
                    if (string != null) {
                        int i = g720.c;
                        return new w6r0(glb1.b(string), bundle.getBoolean("invalidate_user", false));
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                    return null;
                }
                break;
            case -1907412201:
                if (d.equals("Messaging.Arguments.Key.ChatInfo")) {
                    String string2 = bundle.getString("Messaging.Arguments.Source");
                    if (string2 == null) {
                        vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                        return null;
                    }
                    int i2 = g720.c;
                    g720 b = glb1.b(string2);
                    String string3 = bundle.getString("Messaging.Arguments.ChatId");
                    if (string3 != null) {
                        return new k3b(b, string3, bundle.getString("Messaging.Arguments.ChatId"));
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.ChatId"));
                    return null;
                }
                break;
            case -1907327225:
                if (d.equals("Messaging.Arguments.Key.ChatList")) {
                    return new n4b(bundle);
                }
                break;
            case -1907231565:
                if (d.equals("Messaging.Arguments.Key.ChatOpen")) {
                    return new q6b(bundle);
                }
                break;
            case -1789799014:
                if (d.equals("Messaging.Arguments.Key.MainFragment")) {
                    return new d500(bundle);
                }
                break;
            case -1760818898:
                if (d.equals("Messaging.Arguments.Key.GROUP")) {
                    return new w2u(bundle);
                }
                break;
            case -1742957709:
                if (d.equals("Messaging.Arguments.Key.EditChat")) {
                    return new xkn(bundle);
                }
                break;
            case -1725150651:
                if (d.equals("Messaging.Arguments.Key.AboutApp")) {
                    String string4 = bundle.getString("Messaging.Arguments.Source");
                    if (string4 != null) {
                        int i3 = g720.c;
                        return new u4(glb1.b(string4));
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                    return null;
                }
                break;
            case -1625734015:
                if (d.equals("Messaging.Arguments.Key.PhoneContactList")) {
                    String string5 = bundle.getString("Messaging.Arguments.Source");
                    if (string5 != null) {
                        int i4 = g720.c;
                        return new fae(glb1.b(string5));
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                    return null;
                }
                break;
            case -1517347893:
                if (d.equals("Messaging.Arguments.Key.Sharing")) {
                    String string6 = bundle.getString("Messaging.Arguments.Source");
                    if (string6 == null) {
                        vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                        return null;
                    }
                    int i5 = g720.c;
                    g720 b2 = glb1.b(string6);
                    if (bcb1.r(bundle) != null) {
                        return new cqr0(b2);
                    }
                    ny61.r("no sharing data here");
                    return null;
                }
                break;
            case -1417426697:
                if (d.equals("Messaging.Arguments.Key.FoldersSettings")) {
                    String string7 = bundle.getString("Messaging.Arguments.Source");
                    if (string7 != null) {
                        int i6 = g720.c;
                        return new jxr(glb1.b(string7));
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                    return null;
                }
                break;
            case -1394052916:
                if (d.equals("Messaging.Arguments.Key.Onboarding")) {
                    String string8 = bundle.getString("Messaging.Arguments.Source");
                    if (string8 == null) {
                        vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                        return null;
                    }
                    int i7 = g720.c;
                    g720 b3 = glb1.b(string8);
                    ?? a = MessagingActionParser.a(bundle);
                    if (a != 0) {
                        openChatList = a;
                    }
                    OnboardingShowingType onboardingShowingType = (OnboardingShowingType) vng.u(bundle, OnboardingShowingType.class, "Messaging.OnboardingArguments.RequiredOnboardingType");
                    if (onboardingShowingType == null) {
                        onboardingShowingType = OnboardingShowingType.AppStart;
                    }
                    return new k170(b3, openChatList, onboardingShowingType);
                }
                break;
            case -1305102740:
                if (d.equals("Messaging.Arguments.Key.Fullscreen")) {
                    String string9 = bundle.getString("Messaging.Arguments.Source");
                    if (string9 == null) {
                        vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                        return null;
                    }
                    int i8 = g720.c;
                    g720 b4 = glb1.b(string9);
                    ?? a2 = MessagingActionParser.a(bundle);
                    if (a2 != 0) {
                        openChatList = a2;
                    }
                    return new vi3(b4, openChatList, bundle.getBoolean("phone_required", true));
                }
                break;
            case -1220282733:
                if (d.equals("Messaging.Arguments.Key.TelemessengerOnboarding")) {
                    return new ndy0(bundle);
                }
                break;
            case -1023665698:
                if (d.equals("Messaging.Arguments.Key.ResolveInviteLink")) {
                    return new jsj0(bundle);
                }
                break;
            case -957222991:
                if (d.equals("Messaging.Arguments.Key.VpnBlockedDialog")) {
                    String string10 = bundle.getString("Messaging.Arguments.Source");
                    if (string10 != null) {
                        int i9 = g720.c;
                        return new xz31(glb1.b(string10), bundle.getString("Messaging.Arguments.MessageId"), (ChatRequest) vng.u(bundle, ChatRequest.class, "Messaging.Arguments.ChatRequest"));
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                    return null;
                }
                break;
            case -892281481:
                if (d.equals("Messaging.Arguments.Key.CreateUserPoll")) {
                    Parcelable parcelable = (Parcelable) vng.u(bundle, ChatRequest.class, "Messaging.Arguments.ChatRequest");
                    if (parcelable == null) {
                        ny61.r("missing required key Messaging.Arguments.ChatRequest");
                        return null;
                    }
                    ChatRequest chatRequest = (ChatRequest) parcelable;
                    String string11 = bundle.getString("Messaging.Arguments.Source");
                    if (string11 != null) {
                        int i10 = g720.c;
                        return new l7f(glb1.b(string11), chatRequest);
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                    return null;
                }
                break;
            case -880015267:
                if (d.equals("Messaging.Arguments.Key.ContactInfo")) {
                    String string12 = bundle.getString("Messaging.Arguments.Source");
                    if (string12 == null) {
                        vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                        return null;
                    }
                    int i11 = g720.c;
                    g720 b5 = glb1.b(string12);
                    String string13 = bundle.getString("Messaging.Arguments.SourceChatId");
                    String string14 = bundle.getString("Messaging.Arguments.ChatId");
                    if (string14 != null) {
                        return new bae(b5, string13, string14);
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.ChatId"));
                    return null;
                }
                break;
            case -587861982:
                if (d.equals("Messaging.Arguments.Key.InviteLinkInfo")) {
                    String string15 = bundle.getString("Messaging.Arguments.Source");
                    if (string15 != null) {
                        int i12 = g720.c;
                        return new jww(glb1.b(string15));
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                    return null;
                }
                break;
            case -562521956:
                if (d.equals("Messaging.Arguments.Key.NeophonishUpgrade")) {
                    String string16 = bundle.getString("Messaging.Arguments.Source");
                    if (string16 != null) {
                        int i13 = g720.c;
                        return new gm50(glb1.b(string16), bundle.getString("Messaging.Arguments.ShownMessageId"), (ChatRequest) vng.u(bundle, ChatRequest.class, "Messaging.Arguments.ChatRequest"));
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                    return null;
                }
                break;
            case -496053775:
                if (d.equals("Messaging.Arguments.Key.FolderDialog.Edit")) {
                    String d2 = d(bundle, "Messaging.Arguments.Source");
                    int i14 = g720.c;
                    return new t4f(glb1.b(d2), d(bundle, "KEY_FOLDER_ID"), c(bundle, "KEY_ORG_ID"));
                }
                break;
            case -473672319:
                if (d.equals("Messaging.Arguments.Key.TeleMessengerMainFragment")) {
                    return new scy0(bundle);
                }
                break;
            case -452834799:
                if (d.equals("Messaging.Arguments.Key.Participants")) {
                    return new sg90(bundle);
                }
                break;
            case -451506379:
                if (d.equals("Messaging.Arguments.Key.JoinLink")) {
                    String string17 = bundle.getString("Messaging.Arguments.Source");
                    if (string17 != null) {
                        int i15 = g720.c;
                        return new k9x(glb1.b(string17), 0);
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                    return null;
                }
                break;
            case -451186427:
                if (d.equals("Messaging.Arguments.Key.JoinWall")) {
                    String string18 = bundle.getString("Messaging.Arguments.Source");
                    if (string18 == null) {
                        vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                        return null;
                    }
                    int i16 = g720.c;
                    g720 b6 = glb1.b(string18);
                    String string19 = bundle.getString("Messaging.Arguments.ChatId");
                    String string20 = bundle.getString("Messaging.Arguments.JoinWall.InviteHash");
                    String string21 = bundle.getString("Messaging.Arguments.JoinWall.Url");
                    if (string21 == null) {
                        string21 = "";
                    }
                    String str = string21;
                    if (bundle.containsKey("Messaging.Arguments.JoinWall.MessageRef")) {
                        g0c a3 = qoi0.a(ServerMessageRef.class);
                        r7 = a3.equals(qoi0.a(Boolean.TYPE)) ? (ServerMessageRef) Boolean.valueOf(bundle.getBoolean("Messaging.Arguments.JoinWall.MessageRef", true)) : a3.equals(qoi0.a(Byte.TYPE)) ? (ServerMessageRef) bundle.getByte("Messaging.Arguments.JoinWall.MessageRef", (byte) 0) : a3.equals(qoi0.a(byte[].class)) ? (ServerMessageRef) bundle.getByteArray("Messaging.Arguments.JoinWall.MessageRef") : a3.equals(qoi0.a(Short.TYPE)) ? (ServerMessageRef) Short.valueOf(bundle.getShort("Messaging.Arguments.JoinWall.MessageRef")) : a3.equals(qoi0.a(Integer.TYPE)) ? (ServerMessageRef) Integer.valueOf(bundle.getInt("Messaging.Arguments.JoinWall.MessageRef", 0)) : a3.equals(qoi0.a(int[].class)) ? (ServerMessageRef) bundle.getIntArray("Messaging.Arguments.JoinWall.MessageRef") : a3.equals(qoi0.a(Long.TYPE)) ? (ServerMessageRef) Long.valueOf(bundle.getLong("Messaging.Arguments.JoinWall.MessageRef", 0L)) : a3.equals(qoi0.a(long[].class)) ? (ServerMessageRef) bundle.getLongArray("Messaging.Arguments.JoinWall.MessageRef") : a3.equals(qoi0.a(Float.TYPE)) ? (ServerMessageRef) Float.valueOf(bundle.getFloat("Messaging.Arguments.JoinWall.MessageRef")) : a3.equals(qoi0.a(float[].class)) ? (ServerMessageRef) bundle.getFloatArray("Messaging.Arguments.JoinWall.MessageRef") : a3.equals(qoi0.a(Double.TYPE)) ? (ServerMessageRef) Double.valueOf(bundle.getDouble("Messaging.Arguments.JoinWall.MessageRef")) : a3.equals(qoi0.a(double[].class)) ? (ServerMessageRef) bundle.getDoubleArray("Messaging.Arguments.JoinWall.MessageRef") : a3.equals(qoi0.a(Character.TYPE)) ? (ServerMessageRef) Character.valueOf(bundle.getChar("Messaging.Arguments.JoinWall.MessageRef")) : a3.equals(qoi0.a(CharSequence.class)) ? (ServerMessageRef) bundle.getCharSequence("Messaging.Arguments.JoinWall.MessageRef") : a3.equals(qoi0.a(CharSequence[].class)) ? (ServerMessageRef) bundle.getCharSequenceArray("Messaging.Arguments.JoinWall.MessageRef") : a3.equals(qoi0.a(Bundle.class)) ? (ServerMessageRef) bundle.getBundle("Messaging.Arguments.JoinWall.MessageRef") : vng.u(bundle, ServerMessageRef.class, "Messaging.Arguments.JoinWall.MessageRef");
                    }
                    return new p9x(b6, string19, string20, str, (ServerMessageRef) r7);
                }
                break;
            case -446917317:
                if (d.equals("Messaging.Arguments.Key.CallHistoryInfoDialog")) {
                    String string22 = bundle.getString("Messaging.Arguments.Source");
                    if (string22 == null) {
                        vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                        return null;
                    }
                    int i17 = g720.c;
                    g720 b7 = glb1.b(string22);
                    Object u = vng.u(bundle, CallHistoryData.class, "call_data");
                    if (u != null) {
                        return new th7(b7, (CallHistoryData) u);
                    }
                    ny61.g("Required value was null.");
                    return null;
                }
                break;
            case -209735019:
                if (d.equals("Messaging.Arguments.Key.ChatOrganizationsList")) {
                    return new z6b(bundle);
                }
                break;
            case -43764746:
                if (d.equals("Messaging.Arguments.Key.RequestUserForAction")) {
                    return new l9j0(bundle);
                }
                break;
            case -26677929:
                if (d.equals("Messaging.Arguments.Key.TelemessengerCreation")) {
                    String string23 = bundle.getString("Messaging.Arguments.Source");
                    if (string23 != null) {
                        int i18 = g720.c;
                        return new k9x(glb1.b(string23), 1);
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                    return null;
                }
                break;
            case -10770653:
                if (d.equals("Messaging.Arguments.Key.FolderDialog.Create")) {
                    String string24 = bundle.getString("Messaging.Arguments.Source");
                    if (string24 != null) {
                        int i19 = g720.c;
                        return new s4f(glb1.b(string24), bundle.getString("KEY_CHAT_ID"));
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                    return null;
                }
                break;
            case -2799417:
                if (d.equals("Messaging.Arguments.Key.CallsSettings")) {
                    String string25 = bundle.getString("Messaging.Arguments.Source");
                    if (string25 != null) {
                        int i20 = g720.c;
                        return new vl7(glb1.b(string25));
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                    return null;
                }
                break;
            case 6408278:
                if (d.equals("Messaging.Arguments.Key.ChatCreateChooser")) {
                    return new m1b(bundle);
                }
                break;
            case 169619335:
                if (d.equals("Messaging.Arguments.Key.ContactsSettings")) {
                    String string26 = bundle.getString("Messaging.Arguments.Source");
                    if (string26 != null) {
                        int i21 = g720.c;
                        return new rde(glb1.b(string26));
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                    return null;
                }
                break;
            case 202454899:
                if (d.equals("Messaging.Arguments.Key.ChatCreateInfo")) {
                    String string27 = bundle.getString("Messaging.Arguments.Source");
                    if (string27 == null) {
                        vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                        return null;
                    }
                    int i22 = g720.c;
                    g720 b8 = glb1.b(string27);
                    String string28 = bundle.getString("key_chat_type");
                    if (string28 != null) {
                        return new x1b(b8, string28);
                    }
                    ny61.r("missing required key");
                    return null;
                }
                break;
            case 524039501:
                if (d.equals("Messaging.Arguments.Key.EditStatus")) {
                    String string29 = bundle.getString("Messaging.Arguments.Source");
                    if (string29 == null) {
                        vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                        return null;
                    }
                    int i23 = g720.c;
                    g720 b9 = glb1.b(string29);
                    Bundle bundle2 = bundle.getBundle("Messaging.Arguments.CustomStatusData");
                    if (bundle2 != null) {
                        StatusAvailability statusAvailability = (StatusAvailability) vng.u(bundle2, StatusAvailability.class, "availability");
                        if (statusAvailability == null) {
                            ny61.t("availability should not be null");
                            return null;
                        }
                        o430 o430Var = e3n.b;
                        long V = kp50.V(bundle2.getLong("duration"), DurationUnit.MILLISECONDS);
                        long j = bundle2.getLong(ClidProvider.TIMESTAMP);
                        String string30 = bundle2.getString("emoji");
                        String string31 = bundle2.getString("text");
                        boolean z = bundle2.getBoolean("mute_notifications", false);
                        obj = (string30 == null || string31 == null) ? jzz.g(statusAvailability, V, j, null, z) : new du21(statusAvailability, V, j, string30, string31, z, null);
                    } else {
                        obj = null;
                    }
                    return new onn(b9, obj instanceof du21 ? (du21) obj : null);
                }
                break;
            case 584990657:
                if (d.equals("Messaging.Arguments.Key.ChatThreadsContainer")) {
                    return new x9b(bundle);
                }
                break;
            case 759789861:
                if (d.equals("Messaging.Arguments.Key.ChatCreate")) {
                    String string32 = bundle.getString("Messaging.Arguments.Source");
                    if (string32 != null) {
                        int i24 = g720.c;
                        return new j1b(glb1.b(string32));
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                    return null;
                }
                break;
            case 777614093:
                if (d.equals("Messaging.Arguments.Key.CallList")) {
                    String string33 = bundle.getString("Messaging.Arguments.Source");
                    if (string33 != null) {
                        int i25 = g720.c;
                        return new ji7(glb1.b(string33));
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                    return null;
                }
                break;
            case 803388790:
                if (d.equals("Messaging.Arguments.Key.CallUserIntent")) {
                    return new vk7(bundle);
                }
                break;
            case 905592516:
                if (d.equals("Messaging.Arguments.Key.NeophonishAttachMenu")) {
                    String string34 = bundle.getString("Messaging.Arguments.Source");
                    if (string34 == null) {
                        vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                        return null;
                    }
                    int i26 = g720.c;
                    g720 b10 = glb1.b(string34);
                    Object u2 = vng.u(bundle, ChatRequest.class, "Messaging.Arguments.ChatRequest");
                    if (u2 != null) {
                        return new xl50(b10, (ChatRequest) u2);
                    }
                    ny61.g("Required value was null.");
                    return null;
                }
                break;
            case 1025161762:
                if (d.equals("Messaging.Arguments.Key.DebugPanel")) {
                    String string35 = bundle.getString("Messaging.Arguments.Source");
                    if (string35 != null) {
                        int i27 = g720.c;
                        return new ovg(glb1.b(string35));
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                    return null;
                }
                break;
            case 1231579356:
                if (d.equals("Messaging.Arguments.Key.Stars.List")) {
                    String string36 = bundle.getString("Messaging.Arguments.Source");
                    if (string36 == null) {
                        vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                        return null;
                    }
                    int i28 = g720.c;
                    g720 b11 = glb1.b(string36);
                    String string37 = bundle.getString("Messaging.Arguments.ChatId");
                    if (string37 != null) {
                        return new e0u0(b11, string37);
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.ChatId"));
                    return null;
                }
                break;
            case 1497981421:
                if (d.equals("Messaging.Arguments.Key.BlockedUsers")) {
                    String string38 = bundle.getString("Messaging.Arguments.Source");
                    if (string38 != null) {
                        int i29 = g720.c;
                        return new n46(glb1.b(string38));
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                    return null;
                }
                break;
            case 1499376638:
                if (d.equals("Messaging.Arguments.Key.PollInfo")) {
                    return new wwd0(bundle);
                }
                break;
            case 1610850521:
                if (d.equals("Messaging.Arguments.Key.Search")) {
                    String string39 = bundle.getString("Messaging.Arguments.Source");
                    if (string39 != null) {
                        int i30 = g720.c;
                        return new jjt(glb1.b(string39));
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                    return null;
                }
                break;
            case 1620671624:
                if (d.equals("Messaging.Arguments.Key.ReorderPins")) {
                    String string40 = bundle.getString("Messaging.Arguments.Source");
                    if (string40 != null) {
                        int i31 = g720.c;
                        return new b0j0(glb1.b(string40));
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                    return null;
                }
                break;
            case 1694587001:
                if (d.equals("Messaging.Arguments.Key.ThreadList")) {
                    String string41 = bundle.getString("Messaging.Arguments.Source");
                    if (string41 != null) {
                        int i32 = g720.c;
                        return new yxy0(glb1.b(string41));
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                    return null;
                }
                break;
            case 1697365269:
                if (d.equals("Messaging.Arguments.Key.MediaBrowser")) {
                    String string42 = bundle.getString("Messaging.Arguments.Source");
                    if (string42 == null) {
                        vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                        return null;
                    }
                    int i33 = g720.c;
                    g720 b12 = glb1.b(string42);
                    Parcelable parcelable2 = (Parcelable) vng.u(bundle, ExistingChatRequest.class, "Messaging.Arguments.ChatRequest");
                    if (parcelable2 == null) {
                        ny61.r("missing required key Messaging.Arguments.ChatRequest");
                        return null;
                    }
                    ExistingChatRequest existingChatRequest = (ExistingChatRequest) parcelable2;
                    String string43 = bundle.getString("Messaging.Arguments.SourceTab");
                    if (string43 != null) {
                        MediaBrowserTab.valueOf(string43);
                        return new k9x(b12, existingChatRequest);
                    }
                    ny61.g("Required value was null.");
                    return null;
                }
                break;
            case 1750992826:
                if (d.equals("Messaging.Arguments.Key.PrivacySettings")) {
                    String string44 = bundle.getString("Messaging.Arguments.Source");
                    if (string44 != null) {
                        int i34 = g720.c;
                        return new h4f0(glb1.b(string44), bundle.getBoolean("open_search_item", false));
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                    return null;
                }
                break;
            case 1869012895:
                if (d.equals("Messaging.Arguments.Key.NotificationSettings")) {
                    String string45 = bundle.getString("Messaging.Arguments.Source");
                    if (string45 != null) {
                        int i35 = g720.c;
                        return new gj60(glb1.b(string45));
                    }
                    vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                    return null;
                }
                break;
            case 2075681827:
                if (d.equals("Messaging.Arguments.Key.SelectFolderDialog")) {
                    String string46 = bundle.getString("Messaging.Arguments.Source");
                    if (string46 == null) {
                        vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                        return null;
                    }
                    int i36 = g720.c;
                    g720 b13 = glb1.b(string46);
                    String string47 = bundle.getString("KEY_CHAT_ID");
                    if (string47 != null) {
                        return new mbq0(b13, string47);
                    }
                    vg10.d("missing required key ".concat("KEY_CHAT_ID"));
                    return null;
                }
                break;
            case 2104105313:
                if (d.equals("Messaging.Arguments.Key.SwitchConference")) {
                    String string48 = bundle.getString("Messaging.Arguments.Source");
                    if (string48 == null) {
                        vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
                        return null;
                    }
                    int i37 = g720.c;
                    g720 b14 = glb1.b(string48);
                    Object u3 = vng.u(bundle, SwitchMeetingAction.class, "action");
                    if (u3 != null) {
                        return new kzw0(b14, (SwitchMeetingAction) u3);
                    }
                    ny61.g("Required value was null.");
                    return null;
                }
                break;
        }
        vg10.d("Unknown key ".concat(d));
        return null;
    }

    public static long c(Bundle bundle, String str) {
        if (bundle.keySet().contains(str)) {
            return bundle.getLong(str);
        }
        vg10.d("missing required key ".concat(str));
        return 0L;
    }

    public static String d(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        vg10.d("missing required key ".concat(str));
        return null;
    }
}
