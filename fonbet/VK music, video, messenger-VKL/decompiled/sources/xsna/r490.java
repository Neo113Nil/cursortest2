package xsna;

import android.content.res.Resources;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.ui.components.common.MemberAction;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.commons.nio.charset.CharsetEncoder;
import xsna.ejk;

/* compiled from: OwnerButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class r490 implements io.reactivex.rxjava3.functions.c {
    public static x25 b = new x25(0);

    public static final void a(boolean z, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1759349933);
        int i2 = (M.l(z) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1759349933, i2, -1, "com.vk.donut.design.compose.utils.theme.VkDarkThemeWrapper (VkDarkThemeWrapper.kt:15)");
            }
            if (z) {
                M.K(1308057601);
                rrv0.e(true, null, null, null, null, null, kai.c(833921903, new k3m(3, jaiVar), M), M, 1572870, 62);
                M.j();
            } else {
                M.K(1308145052);
                jaiVar.invoke(M, 6);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new to7(i, jaiVar, z);
        }
    }

    public static final void b(ArrayList arrayList, izs izsVar) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            izsVar.invoke(it.next());
            it.remove();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fc, code lost:
    
        if ((r10.f != null) == false) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List c(Dialog dialog, DialogMember dialogMember, Peer peer) {
        ChatSettings Hb;
        boolean z;
        a1w a1wVar;
        if (!dialog.uc()) {
            return EmptyList.b;
        }
        ChatSettings Hb2 = dialog.Hb();
        ChatSettings Hb3 = dialog.Hb();
        boolean z2 = true;
        boolean z3 = (Hb3 != null && Hb3.e.contains(peer)) || ((Hb = dialog.Hb()) != null && epx.f(Hb.d, peer));
        boolean Ab = peer.Ab(Peer.Type.GROUP);
        Peer peer2 = dialogMember.b;
        ChatSettings Hb4 = dialog.Hb();
        boolean z4 = Hb4 != null && epx.f(Hb4.d, peer2);
        if ((Hb2 != null ? Hb2.r : false) && !z4) {
            if (!dialogMember.e && dialogMember.f == null) {
                z = true;
                a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                boolean contains = a1wVar.r().d0.getValue().contains(Long.valueOf(dialogMember.b.b));
                ArrayList arrayList = new ArrayList();
                p4g.a(MemberAction.ADMIN_SET, arrayList, (z || dialogMember.h || contains) ? false : true);
                p4g.a(MemberAction.ADMIN_UNSET, arrayList, (z || !dialogMember.h || contains) ? false : true);
                p4g.a(MemberAction.WRITE_DISABLE, arrayList, dialogMember.h && !dialogMember.j && z3 && !Ab);
                p4g.a(MemberAction.WRITE_ENABLE, arrayList, dialogMember.h && dialogMember.j && z3 && !Ab);
                p4g.a(MemberAction.KICK, arrayList, !dialogMember.i || dialogMember.e);
                MemberAction memberAction = MemberAction.OWNER_SET;
                a1w a1wVar2 = q1w.a;
                cau0 cau0Var = (a1wVar2 != null ? a1wVar2 : null).r().h;
                if (Hb2 == null ? Hb2.p : false) {
                }
                z2 = false;
                p4g.a(memberAction, arrayList, z2);
                return arrayList;
            }
        }
        z = false;
        a1wVar = q1w.a;
        if (a1wVar == null) {
        }
        boolean contains2 = a1wVar.r().d0.getValue().contains(Long.valueOf(dialogMember.b.b));
        ArrayList arrayList2 = new ArrayList();
        p4g.a(MemberAction.ADMIN_SET, arrayList2, (z || dialogMember.h || contains2) ? false : true);
        p4g.a(MemberAction.ADMIN_UNSET, arrayList2, (z || !dialogMember.h || contains2) ? false : true);
        p4g.a(MemberAction.WRITE_DISABLE, arrayList2, dialogMember.h && !dialogMember.j && z3 && !Ab);
        p4g.a(MemberAction.WRITE_ENABLE, arrayList2, dialogMember.h && dialogMember.j && z3 && !Ab);
        p4g.a(MemberAction.KICK, arrayList2, !dialogMember.i || dialogMember.e);
        MemberAction memberAction2 = MemberAction.OWNER_SET;
        a1w a1wVar22 = q1w.a;
        cau0 cau0Var2 = (a1wVar22 != null ? a1wVar22 : null).r().h;
        if (Hb2 == null ? Hb2.p : false) {
        }
        z2 = false;
        p4g.a(memberAction2, arrayList2, z2);
        return arrayList2;
    }

    public static final float d(int i, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(804324951, 0, -1, "androidx.compose.ui.res.dimensionResource (PrimitiveResources.android.kt:72)");
        }
        float dimension = ((Resources) aVar.r(AndroidCompositionLocals_androidKt.c)).getDimension(i) / ((azl) aVar.r(uvi.h)).getDensity();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return dimension;
    }

    public static String e(byte[] bArr) {
        if (bArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder(X3.j.d);
        int length = bArr.length;
        String str = "";
        int i = 0;
        while (i < length) {
            byte b2 = bArr[i];
            sb.append(str);
            sb.append((int) b2);
            i++;
            str = StringUtils.COMMA;
        }
        sb.append(X3.j.e);
        return sb.toString();
    }

    public static String f(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer == null) {
            return "<null>";
        }
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        StringBuilder sb = new StringBuilder("{ ");
        StringBuilder a = odj.a(position, limit, "pos=", " lim=", " cap=");
        a.append(byteBuffer.capacity());
        sb.append(a.toString());
        if (z) {
            sb.append(" buf=");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            byteBuffer.position(position);
            sb.append(e(bArr));
        }
        sb.append(" }");
        return sb.toString();
    }

    public static String g(ByteBuffer byteBuffer) {
        String str;
        String sb;
        String str2;
        if (byteBuffer == null) {
            return "<null>";
        }
        int remaining = byteBuffer.remaining();
        if (remaining < 13) {
            return "<??? - too small>";
        }
        byteBuffer.get(0);
        StringBuilder sb2 = new StringBuilder();
        int i = 10;
        String str3 = "";
        while (true) {
            int i2 = i + 3;
            if (i2 > remaining) {
                if (i < remaining) {
                    sb2.append(str3);
                    sb2.append(i - remaining);
                    sb2.append(" trailing byte(s) ???");
                }
                return sb2.toString();
            }
            sb2.append(str3);
            int remaining2 = byteBuffer.remaining();
            byte b2 = byteBuffer.get(i);
            int i3 = i + 1;
            int i4 = i + 2;
            int i5 = ((byteBuffer.get(i3) & 255) << 8) | (byteBuffer.get(i4) & 255);
            byte[] bArr = n5j.a;
            int i6 = b2 & CharsetEncoder.DEFAULT_REPLACEMENT;
            switch (i6) {
                case 0:
                    str = "PT_DATA";
                    break;
                case 1:
                    str = "PT_ACK";
                    break;
                case 2:
                    str = "PT_ECHO";
                    break;
                case 3:
                    str = "PT_ECHO_RESPONSE";
                    break;
                case 4:
                    str = "PT_PADDING";
                    break;
                case 5:
                    str = "PT_INVITE";
                    break;
                case 6:
                    str = "PT_ACCEPT";
                    break;
                case 7:
                    str = "PT_REJECT";
                    break;
                case 8:
                    str = "PT_CLOSE";
                    break;
                case 9:
                    str = "PT_SEQUENCE_NUMBER";
                    break;
                default:
                    str = tgw.b(i6, "<Unknown PT ", ">");
                    break;
            }
            if ((b2 & (-64)) == 0) {
                sb = "";
            } else {
                StringBuilder sb3 = new StringBuilder();
                if ((b2 & 128) != 0) {
                    sb3.append("dropSN");
                }
                if ((b2 & 64) != 0) {
                    if (sb3.length() > 0) {
                        sb3.append(" ");
                    }
                    sb3.append("flag2");
                }
                sb = sb3.toString();
            }
            StringBuilder e = fw3.e(str);
            e.append(sb.isEmpty() ? "" : zr.a("(", sb, ")"));
            e.append(X3.j.d);
            e.append(i5);
            int i7 = i2 + i5;
            if (i7 > remaining2) {
                str2 = ", truncated " + (i7 - remaining2);
            } else {
                str2 = "";
            }
            e.append(str2);
            e.append(X3.j.e);
            sb2.append(e.toString());
            i += (((byteBuffer.get(i3) & 255) << 8) | (byteBuffer.get(i4) & 255)) + 3;
            str3 = ", ";
        }
    }

    public static String h(long j) {
        return efz.b(j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, "K", new StringBuilder());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final dp10 i(npg0 npg0Var, int i, int i2, int i3, int i4, int i5, ep10 ep10Var, List list, tra0[] tra0VarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int i10;
        float f;
        boolean z;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        List list2 = list;
        long j = i5;
        int i17 = i7 - i6;
        int[] iArr2 = new int[i17];
        int i18 = i6;
        int i19 = 0;
        int i20 = 0;
        boolean z2 = false;
        int i21 = 0;
        int i22 = 0;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (i18 < i7) {
            zo10 zo10Var = (zo10) list2.get(i18);
            long j2 = j;
            opg0 o = p490.o(zo10Var);
            float q = p490.q(o);
            if (!z2) {
                ejk ejkVar = o != null ? o.c : null;
                if (!(ejkVar != null ? ejkVar instanceof ejk.a : false)) {
                    z2 = false;
                    if (q <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f2 += q;
                        i20++;
                        i14 = i18;
                    } else {
                        int i23 = i3 - i21;
                        tra0 tra0Var = tra0VarArr[i18];
                        if (tra0Var == null) {
                            if (i3 == Integer.MAX_VALUE) {
                                i14 = i18;
                                i15 = i20;
                                i16 = Integer.MAX_VALUE;
                            } else {
                                i14 = i18;
                                i15 = i20;
                                i16 = i23 < 0 ? 0 : i23;
                            }
                            tra0Var = zo10Var.N(npg0Var.a(0, i16, i4, false));
                        } else {
                            i14 = i18;
                            i15 = i20;
                        }
                        int h = npg0Var.h(tra0Var);
                        int d = npg0Var.d(tra0Var);
                        iArr2[i14 - i6] = h;
                        int i24 = i23 - h;
                        if (i24 < 0) {
                            i24 = 0;
                        }
                        i22 = Math.min(i5, i24);
                        i21 += h + i22;
                        i19 = Math.max(i19, d);
                        tra0VarArr[i14] = tra0Var;
                        i20 = i15;
                    }
                    i18 = i14 + 1;
                    j = j2;
                }
            }
            z2 = true;
            if (q <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            }
            i18 = i14 + 1;
            j = j2;
        }
        long j3 = j;
        boolean z3 = true;
        if (i20 == 0) {
            i21 -= i22;
            i9 = 0;
        } else {
            long j4 = (r24 - 1) * j3;
            long j5 = ((i3 != Integer.MAX_VALUE ? i3 : i) - i21) - j4;
            if (j5 < 0) {
                j5 = 0;
            }
            float f3 = j5 / f2;
            int i25 = i6;
            while (i25 < i7) {
                j5 -= Math.round(p490.q(p490.o((zo10) list2.get(i25))) * f3);
                i25++;
                j4 = j4;
            }
            long j6 = j4;
            int i26 = i6;
            int i27 = 0;
            while (i26 < i7) {
                if (tra0VarArr[i26] == null) {
                    zo10 zo10Var2 = (zo10) list2.get(i26);
                    opg0 o2 = p490.o(zo10Var2);
                    float q2 = p490.q(o2);
                    if (!(q2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? z3 : false)) {
                        szw.b("All weights <= 0 should have placeables");
                    }
                    i10 = i26;
                    int signum = Long.signum(j5);
                    f = f3;
                    j5 -= signum;
                    int max = Math.max(0, Math.round(f * q2) + signum);
                    if ((o2 != null ? o2.b : z3) && max != Integer.MAX_VALUE) {
                        i11 = max;
                        z = z3;
                        tra0 N = zo10Var2.N(npg0Var.a(i11, max, i4, z));
                        int h2 = npg0Var.h(N);
                        int d2 = npg0Var.d(N);
                        iArr2[i10 - i6] = h2;
                        i27 += h2;
                        int max2 = Math.max(i19, d2);
                        tra0VarArr[i10] = N;
                        i19 = max2;
                    }
                    i11 = 0;
                    z = z3;
                    tra0 N2 = zo10Var2.N(npg0Var.a(i11, max, i4, z));
                    int h22 = npg0Var.h(N2);
                    int d22 = npg0Var.d(N2);
                    iArr2[i10 - i6] = h22;
                    i27 += h22;
                    int max22 = Math.max(i19, d22);
                    tra0VarArr[i10] = N2;
                    i19 = max22;
                } else {
                    i10 = i26;
                    f = f3;
                    z = z3;
                }
                list2 = list;
                z3 = z;
                i26 = i10 + 1;
                f3 = f;
            }
            i9 = (int) (i27 + j6);
            int i28 = i3 - i21;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i28) {
                i9 = i28;
            }
        }
        if (z2) {
            int i29 = 0;
            i12 = 0;
            for (int i30 = i6; i30 < i7; i30++) {
                tra0 tra0Var2 = tra0VarArr[i30];
                Object c = tra0Var2.c();
                opg0 opg0Var = c instanceof opg0 ? (opg0) c : null;
                ejk ejkVar2 = opg0Var != null ? opg0Var.c : null;
                Integer b2 = ejkVar2 != null ? ejkVar2.b(tra0Var2) : null;
                if (b2 != null) {
                    int intValue = b2.intValue();
                    int d3 = npg0Var.d(tra0Var2);
                    i29 = Math.max(i29, intValue != Integer.MIN_VALUE ? b2.intValue() : 0);
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = d3;
                    }
                    i12 = Math.max(i12, d3 - intValue);
                }
            }
            i13 = i29;
        } else {
            i12 = 0;
            i13 = 0;
        }
        int i31 = i21 + i9;
        int max3 = Math.max(i31 < 0 ? 0 : i31, i);
        int max4 = Math.max(i19, Math.max(i2, i12 + i13));
        int[] iArr3 = new int[i17];
        npg0Var.i(max3, iArr2, iArr3, ep10Var);
        return npg0Var.j(tra0VarArr, ep10Var, i13, iArr3, max3, max4, iArr, i8, i6, i7);
    }

    public static mf2 k(com.airbnb.lottie.parser.moshi.a aVar, i700 i700Var) throws IOException {
        return new mf2(rhy.a(aVar, i700Var, 1.0f, b7g.b, false), 0);
    }

    public static nf2 l(JsonReader jsonReader, i700 i700Var, boolean z) throws IOException {
        return new nf2(rhy.a(jsonReader, i700Var, z ? b3r0.c() : 1.0f, egi.d, false), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static of2 m(com.airbnb.lottie.parser.moshi.a aVar, i700 i700Var, int i) throws IOException {
        dbu dbuVar = new dbu();
        dbuVar.b = i;
        ArrayList a = rhy.a(aVar, i700Var, 1.0f, dbuVar, false);
        for (int i2 = 0; i2 < a.size(); i2++) {
            nhy nhyVar = (nhy) a.get(i2);
            abu abuVar = (abu) nhyVar.b;
            abu abuVar2 = (abu) nhyVar.c;
            if (abuVar != null && abuVar2 != null) {
                float[] fArr = abuVar.a;
                int length = fArr.length;
                float[] fArr2 = abuVar2.a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f = Float.NaN;
                    int i3 = 0;
                    for (int i4 = 0; i4 < length2; i4++) {
                        float f2 = fArr3[i4];
                        if (f2 != f) {
                            fArr3[i3] = f2;
                            i3++;
                            f = fArr3[i4];
                        }
                    }
                    float[] copyOfRange = Arrays.copyOfRange(fArr3, 0, i3);
                    nhyVar = new nhy(abuVar.b(copyOfRange), abuVar2.b(copyOfRange));
                }
            }
            a.set(i2, nhyVar);
        }
        return new of2(a, 0);
    }

    public static pf2 n(JsonReader jsonReader, i700 i700Var) throws IOException {
        return new pf2(rhy.a(jsonReader, i700Var, 1.0f, ahn.c, false), 0);
    }

    public static uf2 o(com.airbnb.lottie.parser.moshi.a aVar, i700 i700Var) throws IOException {
        return new uf2(rhy.a(aVar, i700Var, b3r0.c(), klb0.b, true), 0);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue());
    }

    public void j() {
    }
}
