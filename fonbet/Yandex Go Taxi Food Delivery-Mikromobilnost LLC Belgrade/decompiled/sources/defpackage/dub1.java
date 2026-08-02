package defpackage;

import android.content.Context;
import android.graphics.DashPathEffect;
import androidx.compose.foundation.lazy.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class dub1 {
    public static final void a(final List list, final b bVar, f530 f530Var, final boolean z, fid fidVar, int i) {
        int i2;
        bts btsVar;
        float f;
        float w0;
        float size;
        o430 o430Var;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-225823686);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar2.k(list) : btsVar2.e(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.k(f530Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.a(z) ? 2048 : 1024;
        }
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            final Context context = (Context) btsVar2.m(AndroidCompositionLocals_androidKt.b);
            final fwi fwiVar = (fwi) btsVar2.m(j.h);
            final long n = tje.n(AppColor$Palette.Line, btsVar2);
            final float w02 = fwiVar.w0(4.0f);
            final float w03 = fwiVar.w0(12.0f);
            final float w04 = fwiVar.w0(4.0f);
            final float w05 = fwiVar.w0(4.0f);
            if (z) {
                w0 = fwiVar.w0(6.0f);
                f = 8.0f;
            } else {
                f = 8.0f;
                w0 = fwiVar.w0(8.0f);
            }
            float f2 = 0.0f;
            float w06 = z ? 0.0f : fwiVar.w0(f);
            if (z) {
                float f3 = a5l0.a;
                f2 = fwiVar.w0(58.0f);
            }
            if (z) {
                float f4 = a5l0.a;
                size = 40.0f;
            } else {
                size = SlotSize.L.getSize();
            }
            final float w07 = (fwiVar.w0(size) / 2.0f) + f2;
            Object Q = btsVar2.Q();
            o430 o430Var2 = did.a;
            if (Q == o430Var2) {
                o430Var = o430Var2;
                Q = new teb(20);
                btsVar2.o0(Q);
            } else {
                o430Var = o430Var2;
            }
            f530 a = fnq0.a(f530Var, (tls) Q);
            int i3 = i2;
            boolean e = ((i2 & 7168) == 2048) | ((i2 & 112) == 32) | btsVar2.e(context) | btsVar2.b(w03) | btsVar2.b(w02) | btsVar2.b(w07) | btsVar2.b(w04);
            final float f5 = w0;
            boolean b = ((i3 & 14) == 4 || ((i3 & 8) != 0 && btsVar2.e(list))) | e | btsVar2.b(f5) | btsVar2.d(n) | btsVar2.b(w05) | btsVar2.k(fwiVar) | btsVar2.b(w06);
            Object Q2 = btsVar2.Q();
            if (b || Q2 == o430Var) {
                btsVar = btsVar2;
                final float f6 = w06;
                f530Var2 = a;
                tls tlsVar = new tls() { // from class: i711
                    /* JADX WARN: Code restructure failed: missing block: B:203:0x0315, code lost:
                    
                        r19 = r8;
                        r22 = r9;
                        r20 = r10;
                        r23 = r11;
                        r25 = r12;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:204:0x0323, code lost:
                    
                        if (r1.isEmpty() == false) goto L197;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:206:0x0327, code lost:
                    
                        r1 = kotlin.collections.a.x0(r1, new defpackage.pzo(6, new defpackage.k711()));
                        r2 = new java.util.ArrayList();
                        r1 = r1.iterator();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:208:0x0345, code lost:
                    
                        if (r1.hasNext() == false) goto L245;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:209:0x0347, code lost:
                    
                        r3 = (defpackage.j711) r1.next();
                        r7 = (defpackage.j711) kotlin.collections.a.b0(r2);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:210:0x0353, code lost:
                    
                        if (r7 == null) goto L243;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:212:0x035d, code lost:
                    
                        if (r7.a.equals(r3.a) == false) goto L246;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:213:0x035f, code lost:
                    
                        r8 = r3.b;
                        r9 = r7.c;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:214:0x0365, code lost:
                    
                        if (r8 > r9) goto L244;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:216:0x0370, code lost:
                    
                        r2.add(r3);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:220:0x0367, code lost:
                    
                        r7.c = java.lang.Math.max(r9, r3.c);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:225:0x0374, code lost:
                    
                        r1 = r2.iterator();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:227:0x037c, code lost:
                    
                        if (r1.hasNext() == false) goto L251;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:229:0x037e, code lost:
                    
                        r2 = (defpackage.j711) r1.next();
                        r15 = r2.a;
                        r3 = r15 instanceof defpackage.zhy;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:230:0x0388, code lost:
                    
                        r7 = r2.b;
                        r8 = r6;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:231:0x038c, code lost:
                    
                        if (r3 == false) goto L215;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:232:0x038e, code lost:
                    
                        r7 = r7 + r8;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:233:0x038f, code lost:
                    
                        r16 = r7;
                        r2 = r2.c;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:234:0x0393, code lost:
                    
                        if (r3 == false) goto L218;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:235:0x0395, code lost:
                    
                        r2 = r2 - r8;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:236:0x0396, code lost:
                    
                        r7 = r34;
                        r31 = r5;
                        r8 = r17;
                        r5 = r19;
                        r10 = r20;
                        r6 = r21;
                        r9 = r22;
                        r11 = r23;
                        r12 = r25;
                        r17 = r2;
                        r2 = r4;
                        r4 = r18;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:238:0x03ad, code lost:
                    
                        defpackage.dub1.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:239:0x03b0, code lost:
                    
                        r18 = r4;
                        r19 = r5;
                        r21 = r6;
                        r17 = r8;
                        r22 = r9;
                        r20 = r10;
                        r23 = r11;
                        r25 = r12;
                        r4 = r2;
                        r34 = r7;
                        r5 = r31;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:241:0x03c6, code lost:
                    
                        r0 = th;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:242:0x03c7, code lost:
                    
                        r3 = r31;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:243:0x03d7, code lost:
                    
                        defpackage.b64.C(r2, r3);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:244:0x03da, code lost:
                    
                        throw r0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:246:0x03ca, code lost:
                    
                        r0 = th;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:247:0x03cb, code lost:
                    
                        r2 = r4;
                        r31 = r5;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:249:0x03cf, code lost:
                    
                        defpackage.b64.C(r4, r5);
                     */
                    /* JADX WARN: Removed duplicated region for block: B:101:0x0224 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:3:0x0046, B:9:0x0064, B:12:0x007a, B:13:0x0083, B:15:0x0089, B:17:0x00a8, B:18:0x00b1, B:21:0x00bf, B:23:0x00cf, B:25:0x00db, B:27:0x0105, B:29:0x0113, B:31:0x0115, B:34:0x011f, B:36:0x0126, B:40:0x01f3, B:42:0x021b, B:43:0x0221, B:44:0x024d, B:51:0x0282, B:56:0x02a3, B:61:0x02ca, B:62:0x02b9, B:64:0x02bd, B:70:0x02d4, B:73:0x02e4, B:75:0x02ee, B:81:0x0294, B:83:0x0298, B:91:0x0276, B:97:0x0263, B:101:0x0224, B:103:0x0228, B:104:0x022f, B:106:0x0237, B:107:0x023c, B:109:0x0240, B:110:0x0247, B:111:0x0133, B:114:0x0139, B:116:0x0140, B:119:0x0149, B:122:0x0151, B:125:0x0156, B:129:0x015d, B:132:0x0166, B:135:0x016b, B:139:0x0172, B:142:0x017b, B:146:0x0182, B:149:0x018b, B:152:0x0190, B:155:0x0195, B:159:0x019c, B:162:0x01a4, B:166:0x01ab, B:169:0x01b3, B:172:0x01b9, B:175:0x01bf, B:178:0x01cb, B:180:0x01cf, B:182:0x01d3, B:184:0x01d7, B:186:0x01db, B:188:0x01df, B:190:0x01e3, B:192:0x01e7, B:196:0x01ed, B:197:0x01f2, B:198:0x010d, B:203:0x0315, B:206:0x0327, B:207:0x0341, B:209:0x0347, B:211:0x0355, B:213:0x035f, B:220:0x0367, B:216:0x0370, B:225:0x0374, B:226:0x0378), top: B:2:0x0046 }] */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x021b A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:3:0x0046, B:9:0x0064, B:12:0x007a, B:13:0x0083, B:15:0x0089, B:17:0x00a8, B:18:0x00b1, B:21:0x00bf, B:23:0x00cf, B:25:0x00db, B:27:0x0105, B:29:0x0113, B:31:0x0115, B:34:0x011f, B:36:0x0126, B:40:0x01f3, B:42:0x021b, B:43:0x0221, B:44:0x024d, B:51:0x0282, B:56:0x02a3, B:61:0x02ca, B:62:0x02b9, B:64:0x02bd, B:70:0x02d4, B:73:0x02e4, B:75:0x02ee, B:81:0x0294, B:83:0x0298, B:91:0x0276, B:97:0x0263, B:101:0x0224, B:103:0x0228, B:104:0x022f, B:106:0x0237, B:107:0x023c, B:109:0x0240, B:110:0x0247, B:111:0x0133, B:114:0x0139, B:116:0x0140, B:119:0x0149, B:122:0x0151, B:125:0x0156, B:129:0x015d, B:132:0x0166, B:135:0x016b, B:139:0x0172, B:142:0x017b, B:146:0x0182, B:149:0x018b, B:152:0x0190, B:155:0x0195, B:159:0x019c, B:162:0x01a4, B:166:0x01ab, B:169:0x01b3, B:172:0x01b9, B:175:0x01bf, B:178:0x01cb, B:180:0x01cf, B:182:0x01d3, B:184:0x01d7, B:186:0x01db, B:188:0x01df, B:190:0x01e3, B:192:0x01e7, B:196:0x01ed, B:197:0x01f2, B:198:0x010d, B:203:0x0315, B:206:0x0327, B:207:0x0341, B:209:0x0347, B:211:0x0355, B:213:0x035f, B:220:0x0367, B:216:0x0370, B:225:0x0374, B:226:0x0378), top: B:2:0x0046 }] */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x025d A[ADDED_TO_REGION] */
                    /* JADX WARN: Removed duplicated region for block: B:49:0x026e A[ADDED_TO_REGION] */
                    /* JADX WARN: Removed duplicated region for block: B:53:0x028e  */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x02b4  */
                    /* JADX WARN: Removed duplicated region for block: B:72:0x02e2 A[ADDED_TO_REGION] */
                    /* JADX WARN: Removed duplicated region for block: B:80:0x02fb A[ADDED_TO_REGION, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:89:0x02b0  */
                    /* JADX WARN: Removed duplicated region for block: B:91:0x0276 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:3:0x0046, B:9:0x0064, B:12:0x007a, B:13:0x0083, B:15:0x0089, B:17:0x00a8, B:18:0x00b1, B:21:0x00bf, B:23:0x00cf, B:25:0x00db, B:27:0x0105, B:29:0x0113, B:31:0x0115, B:34:0x011f, B:36:0x0126, B:40:0x01f3, B:42:0x021b, B:43:0x0221, B:44:0x024d, B:51:0x0282, B:56:0x02a3, B:61:0x02ca, B:62:0x02b9, B:64:0x02bd, B:70:0x02d4, B:73:0x02e4, B:75:0x02ee, B:81:0x0294, B:83:0x0298, B:91:0x0276, B:97:0x0263, B:101:0x0224, B:103:0x0228, B:104:0x022f, B:106:0x0237, B:107:0x023c, B:109:0x0240, B:110:0x0247, B:111:0x0133, B:114:0x0139, B:116:0x0140, B:119:0x0149, B:122:0x0151, B:125:0x0156, B:129:0x015d, B:132:0x0166, B:135:0x016b, B:139:0x0172, B:142:0x017b, B:146:0x0182, B:149:0x018b, B:152:0x0190, B:155:0x0195, B:159:0x019c, B:162:0x01a4, B:166:0x01ab, B:169:0x01b3, B:172:0x01b9, B:175:0x01bf, B:178:0x01cb, B:180:0x01cf, B:182:0x01d3, B:184:0x01d7, B:186:0x01db, B:188:0x01df, B:190:0x01e3, B:192:0x01e7, B:196:0x01ed, B:197:0x01f2, B:198:0x010d, B:203:0x0315, B:206:0x0327, B:207:0x0341, B:209:0x0347, B:211:0x0355, B:213:0x035f, B:220:0x0367, B:216:0x0370, B:225:0x0374, B:226:0x0378), top: B:2:0x0046 }] */
                    /* JADX WARN: Removed duplicated region for block: B:97:0x0263 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:3:0x0046, B:9:0x0064, B:12:0x007a, B:13:0x0083, B:15:0x0089, B:17:0x00a8, B:18:0x00b1, B:21:0x00bf, B:23:0x00cf, B:25:0x00db, B:27:0x0105, B:29:0x0113, B:31:0x0115, B:34:0x011f, B:36:0x0126, B:40:0x01f3, B:42:0x021b, B:43:0x0221, B:44:0x024d, B:51:0x0282, B:56:0x02a3, B:61:0x02ca, B:62:0x02b9, B:64:0x02bd, B:70:0x02d4, B:73:0x02e4, B:75:0x02ee, B:81:0x0294, B:83:0x0298, B:91:0x0276, B:97:0x0263, B:101:0x0224, B:103:0x0228, B:104:0x022f, B:106:0x0237, B:107:0x023c, B:109:0x0240, B:110:0x0247, B:111:0x0133, B:114:0x0139, B:116:0x0140, B:119:0x0149, B:122:0x0151, B:125:0x0156, B:129:0x015d, B:132:0x0166, B:135:0x016b, B:139:0x0172, B:142:0x017b, B:146:0x0182, B:149:0x018b, B:152:0x0190, B:155:0x0195, B:159:0x019c, B:162:0x01a4, B:166:0x01ab, B:169:0x01b3, B:172:0x01b9, B:175:0x01bf, B:178:0x01cb, B:180:0x01cf, B:182:0x01d3, B:184:0x01d7, B:186:0x01db, B:188:0x01df, B:190:0x01e3, B:192:0x01e7, B:196:0x01ed, B:197:0x01f2, B:198:0x010d, B:203:0x0315, B:206:0x0327, B:207:0x0341, B:209:0x0347, B:211:0x0355, B:213:0x035f, B:220:0x0367, B:216:0x0370, B:225:0x0374, B:226:0x0378), top: B:2:0x0046 }] */
                    @Override // defpackage.tls
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj) {
                        float f7;
                        fwi fwiVar2;
                        float f8;
                        float f9;
                        long j;
                        float w08;
                        float w09;
                        float min;
                        float f10;
                        float f11;
                        fiy e2;
                        fiy d;
                        int i4;
                        int i5;
                        b bVar2 = b.this;
                        List list2 = list;
                        fwi fwiVar3 = fwiVar;
                        float f12 = w02;
                        float f13 = w07;
                        float f14 = w04;
                        float f15 = f5;
                        float f16 = w05;
                        long j2 = n;
                        Context context2 = context;
                        qam qamVar = (qam) obj;
                        float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                        nfh N = qamVar.N();
                        float f17 = f12;
                        long v = N.v();
                        N.q().save();
                        try {
                            ((cot) N.a).f(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, 1);
                            List list3 = bVar2.j().k;
                            if (!list3.isEmpty()) {
                                List list4 = list3;
                                int d2 = gw00.d(tcc.n(list4, 10));
                                qam qamVar2 = qamVar;
                                if (d2 < 16) {
                                    d2 = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(d2);
                                for (Iterator it = list4.iterator(); it.hasNext(); it = it) {
                                    Object next = it.next();
                                    linkedHashMap.put(Integer.valueOf(((t6y) ((n6y) next)).a), next);
                                }
                                ArrayList arrayList = new ArrayList();
                                Iterator it2 = list3.iterator();
                                while (true) {
                                    boolean hasNext = it2.hasNext();
                                    float f18 = f13;
                                    boolean z2 = z;
                                    float f19 = w03;
                                    if (!hasNext) {
                                        break;
                                    }
                                    n6y n6yVar = (n6y) it2.next();
                                    int i6 = ((t6y) n6yVar).a;
                                    if (i6 >= 0) {
                                        f7 = f14;
                                        if (i6 < list2.size()) {
                                            h711 h711Var = (h711) list2.get(i6);
                                            f8 = f15;
                                            float f20 = ((t6y) n6yVar).o;
                                            f9 = f16;
                                            float f21 = ((t6y) n6yVar).p + f20;
                                            j = j2;
                                            float w010 = fwiVar3.w0(SlotSize.L.getSize()) / 2.0f;
                                            float f22 = (!z2 || f21 - f20 < w010 * 2.0f) ? (f20 + f21) / 2.0f : w010 + f20;
                                            boolean z3 = true;
                                            if (h711Var instanceof h611) {
                                                if (!z2) {
                                                    if (((h611) h711Var).c == null) {
                                                        if (((h611) h711Var).d != null) {
                                                        }
                                                        z3 = false;
                                                    }
                                                }
                                                float w011 = fwiVar3.w0(6.0f);
                                                float f23 = f19 / 2.0f;
                                                float f24 = f22;
                                                float max = Math.max(0.0f, (((t6y) n6yVar).p / 2.0f) - fwiVar3.w0(4.0f));
                                                if (h711Var instanceof h611) {
                                                    w09 = fwiVar3.w0(36.0f);
                                                } else if (h711Var instanceof n611) {
                                                    w09 = fwiVar3.w0(24.0f);
                                                } else if (h711Var instanceof r611) {
                                                    w09 = fwiVar3.w0(18.0f);
                                                } else if (h711Var instanceof c711) {
                                                    w09 = fwiVar3.w0(18.0f);
                                                } else {
                                                    w08 = fwiVar3.w0(12.0f);
                                                    float min2 = Math.min(w08 + w011, max);
                                                    fwiVar2 = fwiVar3;
                                                    min = Math.min(f23 + w011, max);
                                                    float f25 = (z2 || !z3) ? (z2 && (h711Var instanceof j611)) ? 60.0f : 20.0f : min2;
                                                    if (z2 || !z3) {
                                                        f10 = (z2 && (h711Var instanceof j611)) ? 8.0f : 44.0f;
                                                        f11 = min;
                                                    } else {
                                                        f11 = min;
                                                        f10 = min2;
                                                    }
                                                    e2 = nta1.e(i6, list2);
                                                    float f26 = f10;
                                                    d = nta1.d(i6, list2);
                                                    if (e2 != null) {
                                                        i4 = i6;
                                                    } else if (z2) {
                                                        if (z3) {
                                                            f25 = min2;
                                                        } else {
                                                            if ((e2 instanceof zhy) && (d instanceof diy)) {
                                                                f25 = f11;
                                                            }
                                                            f25 = 0.0f;
                                                        }
                                                        i4 = i6;
                                                        arrayList.add(new j711(e2, f20, f24 - f25));
                                                    } else {
                                                        if (z3) {
                                                            i4 = i6;
                                                            arrayList.add(new j711(e2, f20, f24 - f25));
                                                        }
                                                        f25 = 0.0f;
                                                        i4 = i6;
                                                        arrayList.add(new j711(e2, f20, f24 - f25));
                                                    }
                                                    if (d != null) {
                                                        if (z2) {
                                                            if (!z3) {
                                                                if ((d instanceof zhy) && (e2 instanceof diy)) {
                                                                    min2 = f11;
                                                                }
                                                                min2 = 0.0f;
                                                            }
                                                            arrayList.add(new j711(d, f24 + min2, f21));
                                                        } else {
                                                            if (z3) {
                                                                min2 = f26;
                                                                arrayList.add(new j711(d, f24 + min2, f21));
                                                            }
                                                            min2 = 0.0f;
                                                            arrayList.add(new j711(d, f24 + min2, f21));
                                                        }
                                                    }
                                                    i5 = i4 + 1;
                                                    if (((n6y) linkedHashMap.get(Integer.valueOf(i5))) != null && d != null && jl40.l(nta1.e(i5, list2), d)) {
                                                        arrayList.add(new j711(d, f21, ((t6y) r3).o));
                                                    }
                                                }
                                                w08 = w09 / 2.0f;
                                                float min22 = Math.min(w08 + w011, max);
                                                fwiVar2 = fwiVar3;
                                                min = Math.min(f23 + w011, max);
                                                if (z2) {
                                                }
                                                if (z2) {
                                                }
                                                if (z2) {
                                                }
                                                f11 = min;
                                                e2 = nta1.e(i6, list2);
                                                float f262 = f10;
                                                d = nta1.d(i6, list2);
                                                if (e2 != null) {
                                                }
                                                if (d != null) {
                                                }
                                                i5 = i4 + 1;
                                                if (((n6y) linkedHashMap.get(Integer.valueOf(i5))) != null) {
                                                    arrayList.add(new j711(d, f21, ((t6y) r3).o));
                                                }
                                            } else if (h711Var instanceof n611) {
                                                if (!z2) {
                                                    if (((n611) h711Var).c == null) {
                                                        if (((n611) h711Var).d != null) {
                                                        }
                                                        z3 = false;
                                                    }
                                                }
                                                float w0112 = fwiVar3.w0(6.0f);
                                                float f232 = f19 / 2.0f;
                                                float f242 = f22;
                                                float max2 = Math.max(0.0f, (((t6y) n6yVar).p / 2.0f) - fwiVar3.w0(4.0f));
                                                if (h711Var instanceof h611) {
                                                }
                                                w08 = w09 / 2.0f;
                                                float min222 = Math.min(w08 + w0112, max2);
                                                fwiVar2 = fwiVar3;
                                                min = Math.min(f232 + w0112, max2);
                                                if (z2) {
                                                }
                                                if (z2) {
                                                }
                                                if (z2) {
                                                }
                                                f11 = min;
                                                e2 = nta1.e(i6, list2);
                                                float f2622 = f10;
                                                d = nta1.d(i6, list2);
                                                if (e2 != null) {
                                                }
                                                if (d != null) {
                                                }
                                                i5 = i4 + 1;
                                                if (((n6y) linkedHashMap.get(Integer.valueOf(i5))) != null) {
                                                }
                                            } else {
                                                if (h711Var instanceof r611) {
                                                    z3 = z2;
                                                } else {
                                                    if (!(h711Var instanceof m611)) {
                                                        if (h711Var instanceof d711) {
                                                            if (!z2 && ((d711) h711Var).d != null) {
                                                            }
                                                        } else if (!(h711Var instanceof s611)) {
                                                            if (h711Var instanceof i611) {
                                                                if (!z2 && ((i611) h711Var).c != null) {
                                                                }
                                                            } else if (h711Var instanceof j611) {
                                                                if (!z2 && ((j611) h711Var).e != null) {
                                                                }
                                                            } else if (!(h711Var instanceof g611) && !(h711Var instanceof l611)) {
                                                                if (h711Var instanceof k611) {
                                                                    if (!z2 && ((k611) h711Var).c != null) {
                                                                    }
                                                                } else if (h711Var instanceof f611) {
                                                                    if (!z2 && ((f611) h711Var).c != null) {
                                                                    }
                                                                } else if (!(h711Var instanceof q611)) {
                                                                    if (h711Var instanceof c711) {
                                                                        if (z2 && ((c711) h711Var).b.length() > 0) {
                                                                        }
                                                                    } else if (!(h711Var instanceof w611) && !(h711Var instanceof b711) && !(h711Var instanceof e711) && !(h711Var instanceof f711) && !(h711Var instanceof g711) && !(h711Var instanceof d611) && !(h711Var instanceof e611) && !(h711Var instanceof v611)) {
                                                                        throw new NoWhenBranchMatchedException();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z3 = false;
                                                }
                                                float w01122 = fwiVar3.w0(6.0f);
                                                float f2322 = f19 / 2.0f;
                                                float f2422 = f22;
                                                float max22 = Math.max(0.0f, (((t6y) n6yVar).p / 2.0f) - fwiVar3.w0(4.0f));
                                                if (h711Var instanceof h611) {
                                                }
                                                w08 = w09 / 2.0f;
                                                float min2222 = Math.min(w08 + w01122, max22);
                                                fwiVar2 = fwiVar3;
                                                min = Math.min(f2322 + w01122, max22);
                                                if (z2) {
                                                }
                                                if (z2) {
                                                }
                                                if (z2) {
                                                }
                                                f11 = min;
                                                e2 = nta1.e(i6, list2);
                                                float f26222 = f10;
                                                d = nta1.d(i6, list2);
                                                if (e2 != null) {
                                                }
                                                if (d != null) {
                                                }
                                                i5 = i4 + 1;
                                                if (((n6y) linkedHashMap.get(Integer.valueOf(i5))) != null) {
                                                }
                                            }
                                            f13 = f18;
                                            f15 = f8;
                                            f14 = f7;
                                            f16 = f9;
                                            fwiVar3 = fwiVar2;
                                            j2 = j;
                                        }
                                    } else {
                                        f7 = f14;
                                    }
                                    fwiVar2 = fwiVar3;
                                    f8 = f15;
                                    f9 = f16;
                                    j = j2;
                                    f13 = f18;
                                    f15 = f8;
                                    f14 = f7;
                                    f16 = f9;
                                    fwiVar3 = fwiVar2;
                                    j2 = j;
                                }
                            }
                            b64.C(N, v);
                            return zy11.a;
                        } catch (Throwable th) {
                            th = th;
                            nfh nfhVar = N;
                            long j3 = v;
                        }
                    }
                };
                btsVar.o0(tlsVar);
                Q2 = tlsVar;
            } else {
                btsVar = btsVar2;
                f530Var2 = a;
            }
            pi6.a(bb1.g(f530Var2, (tls) Q2), btsVar, 0);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a1z0(list, bVar, f530Var, z, i);
        }
    }

    public static final void b(boolean z, float f, float f2, qam qamVar, float f3, float f4, float f5, float f6, long j, Context context, fiy fiyVar, float f7, float f8) {
        if (f8 <= f7) {
            return;
        }
        if (fiyVar instanceof diy) {
            kdc kdcVar = ((diy) fiyVar).a;
            if (kdcVar != null) {
                qamVar.h(rzo.d(s8o.m(kdcVar, context)), (Float.floatToRawIntBits(f7) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f3) << 32), (Float.floatToRawIntBits(f3) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Float.floatToRawIntBits(f8)), z ? f : f2, (r21 & 16) != 0 ? 0 : 1, (r21 & 32) != 0 ? null : null);
                return;
            }
            return;
        }
        if (!(fiyVar instanceof zhy)) {
            if (fiyVar.equals(biy.a)) {
                return;
            }
            w511.b();
            return;
        }
        if (!z) {
            qamVar.h(j, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f7) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(f3) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Float.floatToRawIntBits(f8)), f2, (r21 & 16) != 0 ? 0 : 1, (r21 & 32) != 0 ? null : new kb2(new DashPathEffect(new float[]{f6, f5}, f6 / 2.0f)));
            return;
        }
        float f9 = f4 / 2.0f;
        float f10 = f4 + f5;
        float f11 = f8 - f7;
        if (f11 < f4) {
            return;
        }
        int i = (int) ((f11 - f4) / f10);
        int i2 = i + 1;
        float f12 = i2 * f4;
        if (i < 0) {
            i = 0;
        }
        float f13 = f11 - ((i * f5) + f12);
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        float f14 = (f13 / 2.0f) + f7 + f9;
        for (int i3 = 0; i3 < i2; i3++) {
            qam.z(qamVar, j, f9, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f14) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0.0f, null, 0, 120);
            f14 += f10;
        }
    }

    public static oz40 c() {
        return f.i(zy11.a, x4c.Q);
    }

    public static fcf d() {
        return new fcf();
    }

    public static gcf e() {
        return new gcf();
    }
}
