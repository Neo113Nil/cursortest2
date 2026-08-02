package androidx.compose.foundation.lazy.layout;

import defpackage.cmm0;
import defpackage.dmm0;
import defpackage.e530;
import defpackage.f530;
import defpackage.hz40;
import defpackage.iz40;
import defpackage.j530;
import defpackage.jl40;
import defpackage.l0u;
import defpackage.l5y;
import defpackage.m5y;
import defpackage.qar;
import defpackage.tje;
import defpackage.tse;
import defpackage.u5y;
import defpackage.v5y;
import defpackage.y4y;
import defpackage.z5w;
import java.util.ArrayList;
import kotlin.Metadata;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class c {
    public h b;
    public int c;
    public l5y j;
    public final hz40 a = cmm0.b();
    public final iz40 d = dmm0.a();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final f530 k = new a(this);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/c$a;", "Lj530;", "Ll5y;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class a extends j530 {
        public final c a;

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // defpackage.j530
        public final e530 a() {
            l5y l5yVar = new l5y();
            l5yVar.a = this.a;
            return l5yVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jl40.l(this.a, ((a) obj).a);
        }

        @Override // defpackage.j530
        public final void f(e530 e530Var) {
            l5y l5yVar = (l5y) e530Var;
            c cVar = l5yVar.a;
            c cVar2 = this.a;
            if (jl40.l(cVar, cVar2) || !l5yVar.getNode().isAttached()) {
                return;
            }
            c cVar3 = l5yVar.a;
            cVar3.e();
            cVar3.b = null;
            cVar3.c = -1;
            cVar2.j = l5yVar;
            l5yVar.a = cVar2;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.a + ')';
        }
    }

    public static void c(u5y u5yVar, int i, m5y m5yVar) {
        long j;
        int i2 = 0;
        long l = u5yVar.l(0);
        if (u5yVar.g()) {
            j = (((int) (l >> 32)) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & i);
        } else {
            j = (((int) (l & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (i << 32);
        }
        b[] bVarArr = m5yVar.a;
        int length = bVarArr.length;
        int i3 = 0;
        while (i2 < length) {
            b bVar = bVarArr[i2];
            int i4 = i3 + 1;
            if (bVar != null) {
                bVar.l = z5w.c(j, z5w.b(u5yVar.l(i3), l));
            }
            i2++;
            i3 = i4;
        }
    }

    public static int h(int[] iArr, u5y u5yVar) {
        int m = u5yVar.m();
        int e = u5yVar.e() + m;
        int i = 0;
        while (m < e) {
            int j = u5yVar.j() + iArr[m];
            iArr[m] = j;
            i = Math.max(i, j);
            m++;
        }
        return i;
    }

    public final b a(int i, Object obj) {
        m5y m5yVar = (m5y) this.a.d(obj);
        if (m5yVar != null) {
            return m5yVar.a[i];
        }
        return null;
    }

    public final long b() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            b bVar = (b) arrayList.get(i);
            androidx.compose.ui.graphics.layer.a aVar = bVar.n;
            if (aVar != null) {
                j = (Math.max((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), ((int) (bVar.l & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + ((int) (aVar.u & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Math.max((int) (j >> 32), ((int) (bVar.l >> 32)) + ((int) (aVar.u >> 32))) << 32);
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01cd, code lost:
    
        r30 = r7;
        r29 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d3, code lost:
    
        if (r3 == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d5, code lost:
    
        r2 = r28.a;
        r3 = r2.length;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d9, code lost:
    
        if (r6 >= r3) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01db, code lost:
    
        r7 = r2[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01dd, code lost:
    
        if (r7 == null) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e3, code lost:
    
        if (r7.c() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e5, code lost:
    
        r5.remove(r7);
        r8 = r48.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ea, code lost:
    
        if (r8 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ec, code lost:
    
        defpackage.rzo.D(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ef, code lost:
    
        r7.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f2, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01f5, code lost:
    
        g(r11, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0120, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0118, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00fc, code lost:
    
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0204, code lost:
    
        r35 = r3;
        r30 = r7;
        r29 = r8;
        f(r11.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x021b, code lost:
    
        r6 = r57;
        r30 = r7;
        r2 = new int[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0221, code lost:
    
        if (r15 == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0223, code lost:
    
        if (r30 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        r8 = r48.c;
        r9 = (defpackage.u5y) kotlin.collections.a.R(r52);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0229, code lost:
    
        if (r10.isEmpty() != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0230, code lost:
    
        if (r10.size() <= 1) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0232, code lost:
    
        r7 = r30;
        defpackage.xcc.q(r10, new defpackage.n5y(r7, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0240, code lost:
    
        r3 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0245, code lost:
    
        if (r8 >= r3) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0247, code lost:
    
        r11 = (defpackage.u5y) r10.get(r8);
        c(r11, r59 - h(r2, r11), (defpackage.m5y) r12.d(r11.getKey()));
        g(r11, false);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0267, code lost:
    
        r13 = 0;
        java.util.Arrays.fill(r2, 0, r6, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r9 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0273, code lost:
    
        if (r9.isEmpty() != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x027a, code lost:
    
        if (r9.size() <= 1) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x027c, code lost:
    
        defpackage.xcc.q(r9, new defpackage.n5y(r7, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0284, code lost:
    
        r3 = r9.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0289, code lost:
    
        if (r8 >= r3) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x028b, code lost:
    
        r11 = (defpackage.u5y) r9.get(r8);
        c(r11, (h(r2, r11) + r60) - r11.j(), (defpackage.m5y) r12.d(r11.getKey()));
        g(r11, false);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02b0, code lost:
    
        java.util.Arrays.fill(r2, 0, r6, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        r9 = r9.getIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02b7, code lost:
    
        r3 = r1.b;
        r8 = r1.a;
        r11 = r8.length - 2;
        r14 = r48.h;
        r13 = r48.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02c4, code lost:
    
        if (r11 < 0) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02c6, code lost:
    
        r29 = r9;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02cb, code lost:
    
        r8 = r8[r1];
        r31 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02d7, code lost:
    
        if (((((~r8) << 7) & r8) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02d9, code lost:
    
        r3 = 8 - ((~(r1 - r11)) >>> 31);
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02e3, code lost:
    
        if (r4 >= r3) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02e9, code lost:
    
        if ((r8 & 255) >= 128) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02eb, code lost:
    
        r33 = r4;
        r4 = r31[(r1 << 3) + r4];
        r34 = r8;
        r8 = (defpackage.m5y) r12.d(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        r48.c = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02fd, code lost:
    
        if (r8 != null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02ff, code lost:
    
        r44 = r2;
        r9 = r5;
        r32 = r10;
        r45 = r12;
        r43 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0463, code lost:
    
        r5 = r9;
        r8 = r34 >> 8;
        r4 = r33 + 1;
        r10 = r32;
        r15 = r43;
        r2 = r44;
        r12 = r45;
        r6 = r57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x030a, code lost:
    
        r32 = r10;
        r10 = r53.a(r4);
        r43 = r15;
        r15 = java.lang.Math.min(r6, r8.e);
        r8.e = r15;
        r6 = java.lang.Math.min(r6 - r15, r8.d);
        r8.d = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0327, code lost:
    
        if (r10 != (-1)) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0329, code lost:
    
        r6 = r8.a;
        r10 = r6.length;
        r15 = 0;
        r36 = false;
        r37 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0331, code lost:
    
        if (r15 >= r10) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0333, code lost:
    
        r38 = r6;
        r6 = r38[r15];
        r39 = r37 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0339, code lost:
    
        if (r6 == null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (r55 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x033f, code lost:
    
        if (r6.c() == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0341, code lost:
    
        r44 = r2;
        r40 = r10;
        r45 = r12;
        r41 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03b5, code lost:
    
        r36 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03ca, code lost:
    
        r15 = r41 + 1;
        r6 = r38;
        r37 = r39;
        r10 = r40;
        r2 = r44;
        r12 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x034b, code lost:
    
        r40 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0359, code lost:
    
        if (((java.lang.Boolean) r6.k.getValue()).booleanValue() == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x035b, code lost:
    
        r6.d();
        r8.a[r37] = r16;
        r5.remove(r6);
        r6 = r48.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0367, code lost:
    
        if (r6 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        r13 = r49 & ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues.maxDWORD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0369, code lost:
    
        defpackage.rzo.D(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x036c, code lost:
    
        r44 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03c6, code lost:
    
        r45 = r12;
        r41 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x036f, code lost:
    
        r10 = r6.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0371, code lost:
    
        if (r10 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0373, code lost:
    
        r41 = r15;
        r15 = r6.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x037b, code lost:
    
        if (r6.c() != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x037d, code lost:
    
        if (r15 != null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0384, code lost:
    
        r44 = r2;
        r45 = r12;
        r6.j.setValue(java.lang.Boolean.TRUE);
        r9 = r16;
        defpackage.tje.N(r6.a, r9, r9, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1(r6, r15, r10, r9), 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r56 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03a7, code lost:
    
        if (r6.c() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03a9, code lost:
    
        r5.add(r6);
        r2 = r48.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03ae, code lost:
    
        if (r2 == null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03b0, code lost:
    
        defpackage.rzo.D(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03b3, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03b8, code lost:
    
        r6.d();
        r16 = null;
        r8.a[r37] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x037f, code lost:
    
        r44 = r2;
        r45 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x039d, code lost:
    
        r44 = r2;
        r45 = r12;
        r41 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r58 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03c2, code lost:
    
        r44 = r2;
        r40 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03da, code lost:
    
        r44 = r2;
        r45 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03de, code lost:
    
        if (r36 != false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03e0, code lost:
    
        f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0461, code lost:
    
        r9 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03e5, code lost:
    
        r44 = r2;
        r45 = r12;
        r9 = r5;
        r2 = r54.a(r10, r6, r8.b.a, r8.e);
        r2.h();
        r6 = r8.a;
        r10 = r6.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0407, code lost:
    
        if (r12 >= r10) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0409, code lost:
    
        r15 = r6[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x040b, code lost:
    
        if (r15 == null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x040d, code lost:
    
        r37 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x041c, code lost:
    
        if (((java.lang.Boolean) r15.h.getValue()).booleanValue() != true) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0434, code lost:
    
        r8.a(r37, r61, r62, r59, r60, r8.c);
        r2 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0449, code lost:
    
        if (r10 >= r48.c) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x044b, code lost:
    
        r13.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x044f, code lost:
    
        r14.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0421, code lost:
    
        r12 = r12 + 1;
        r2 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x041f, code lost:
    
        r37 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0426, code lost:
    
        r37 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0428, code lost:
    
        if (r7 == null) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x042e, code lost:
    
        if (r10 != r7.a(r4)) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0430, code lost:
    
        f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0455, code lost:
    
        r44 = r2;
        r33 = r4;
        r34 = r8;
        r32 = r10;
        r45 = r12;
        r43 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0479, code lost:
    
        r44 = r2;
        r9 = r5;
        r32 = r10;
        r45 = r12;
        r43 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        r9 = r12.b;
        r10 = r12.a;
        r11 = r10.length - 2;
        r1 = r48.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0484, code lost:
    
        if (r3 != 8) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0492, code lost:
    
        if (r1 == r11) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0494, code lost:
    
        r1 = r1 + 1;
        r6 = r57;
        r5 = r9;
        r3 = r31;
        r10 = r32;
        r15 = r43;
        r2 = r44;
        r12 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x04b5, code lost:
    
        if (r13.isEmpty() != false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04bc, code lost:
    
        if (r13.size() <= 1) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x04be, code lost:
    
        r5 = r53;
        defpackage.xcc.q(r13, new defpackage.n5y(r5, 3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04cc, code lost:
    
        r1 = r13.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r11 < 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x04d1, code lost:
    
        if (r2 >= r1) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x04d3, code lost:
    
        r3 = (defpackage.u5y) r13.get(r2);
        r6 = r45;
        r4 = (defpackage.m5y) r6.d(r3.getKey());
        r7 = r44;
        r8 = h(r7, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04eb, code lost:
    
        if (r56 == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04ed, code lost:
    
        r9 = (defpackage.u5y) kotlin.collections.a.P(r52);
        r11 = r9.l(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x04fc, code lost:
    
        if (r9.g() == false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x04fe, code lost:
    
        r9 = r11 & ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues.maxDWORD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0500, code lost:
    
        r9 = (int) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0507, code lost:
    
        r3.c(r9 - r8, r4.c, r50, r51);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0511, code lost:
    
        if (r43 == false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0513, code lost:
    
        g(r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0517, code lost:
    
        r2 = r2 + 1;
        r45 = r6;
        r44 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0502, code lost:
    
        r9 = r11 >> 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0505, code lost:
    
        r9 = r4.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x051e, code lost:
    
        r8 = r50;
        r10 = r51;
        r7 = r44;
        r6 = r45;
        java.util.Arrays.fill(r7, 0, r57, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x053b, code lost:
    
        if (r14.isEmpty() != false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x053d, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
    
        r2 = r10[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0542, code lost:
    
        if (r14.size() <= 1) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0544, code lost:
    
        defpackage.xcc.q(r14, new defpackage.n5y(r5, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x054c, code lost:
    
        r1 = r14.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0551, code lost:
    
        if (r2 >= r1) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0553, code lost:
    
        r3 = (defpackage.u5y) r14.get(r2);
        r4 = (defpackage.m5y) r6.d(r3.getKey());
        r3.c((r4.g - r3.j()) + h(r7, r3), r4.c, r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0575, code lost:
    
        if (r43 == false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0577, code lost:
    
        g(r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x057a, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        if (((((~r2) << 7) & r2) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x057d, code lost:
    
        java.util.Collections.reverse(r13);
        r52.addAll(0, r13);
        r52.addAll(r14);
        r32.clear();
        r29.clear();
        r13.clear();
        r14.clear();
        r1.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0598, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x04ca, code lost:
    
        r5 = r53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x052d, code lost:
    
        r8 = r50;
        r10 = r51;
        r5 = r53;
        r7 = r44;
        r6 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0487, code lost:
    
        r44 = r2;
        r9 = r5;
        r32 = r10;
        r45 = r12;
        r43 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x04a7, code lost:
    
        r44 = r2;
        r29 = r9;
        r32 = r10;
        r45 = r12;
        r43 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x023e, code lost:
    
        r7 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        r5 = 8 - ((~(r9 - r11)) >>> 31);
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x026c, code lost:
    
        r7 = r30;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x02b5, code lost:
    
        r7 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0070, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0065, code lost:
    
        r13 = r49 << 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0056, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        if (r6 >= r5) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
    
        if ((r2 & 255) >= 128) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        r29 = r2;
        r1.a(r9[(r9 << 3) + r6]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b9, code lost:
    
        r2 = r29 >> 8;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
    
        r29 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        if (r5 != 8) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c2, code lost:
    
        if (r9 == r11) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c4, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
    
        r2 = r52.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ce, code lost:
    
        r5 = r48.i;
        r9 = r48.f;
        r10 = r48.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d4, code lost:
    
        if (r3 >= r2) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d6, code lost:
    
        r11 = (defpackage.u5y) r52.get(r3);
        r1.l(r11.getKey());
        r6 = r11.d();
        r34 = r2;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ea, code lost:
    
        if (r2 >= r6) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ec, code lost:
    
        r35 = r3;
        r3 = r11.k(r2);
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f6, code lost:
    
        if ((r3 instanceof defpackage.y4y) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f8, code lost:
    
        r2 = (defpackage.y4y) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fe, code lost:
    
        if (r2 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01fa, code lost:
    
        r2 = r28 + 1;
        r3 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0100, code lost:
    
        r28 = (defpackage.m5y) r12.d(r11.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010c, code lost:
    
        if (r7 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010e, code lost:
    
        r2 = r7.a(r11.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011a, code lost:
    
        if (r2 != (-1)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011c, code lost:
    
        if (r7 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011e, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0121, code lost:
    
        if (r28 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0123, code lost:
    
        r5 = new defpackage.m5y(r48);
        defpackage.m5y.b(r5, r11, r61, r62, r59, r60);
        r12.o(r11.getKey(), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0142, code lost:
    
        if (r11.getIndex() == r2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0145, code lost:
    
        if (r2 == (-1)) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0147, code lost:
    
        if (r2 >= r8) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0149, code lost:
    
        r10.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0150, code lost:
    
        r30 = r7;
        r29 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0211, code lost:
    
        r3 = r35 + 1;
        r8 = r29;
        r7 = r30;
        r2 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014d, code lost:
    
        r9.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0156, code lost:
    
        r9 = r11.l(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015f, code lost:
    
        if (r11.g() == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0161, code lost:
    
        r9 = r9 & ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues.maxDWORD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0168, code lost:
    
        c(r11, (int) r9, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016b, code lost:
    
        if (r3 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016d, code lost:
    
        r2 = r5.a;
        r3 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0171, code lost:
    
        if (r5 >= r3) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0173, code lost:
    
        r6 = r2[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0175, code lost:
    
        if (r6 == null) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0177, code lost:
    
        r6.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017a, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0165, code lost:
    
        r9 = r9 >> 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x017d, code lost:
    
        if (r15 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x017f, code lost:
    
        defpackage.m5y.b(r28, r11, r61, r62, r59, r60);
        r6 = r28.a;
        r9 = r6.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0192, code lost:
    
        if (r10 >= r9) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0194, code lost:
    
        r58 = r3;
        r3 = r6[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        if (r3 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x019a, code lost:
    
        r29 = r8;
        r28 = r9;
        r31 = r6;
        r30 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ad, code lost:
    
        if (defpackage.z5w.a(r3.l, 9223372034707292159L) != false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01af, code lost:
    
        r3.l = defpackage.z5w.c(r3.l, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c0, code lost:
    
        r10 = r10 + 1;
        r3 = r58;
        r9 = r28;
        r8 = r29;
        r7 = r30;
        r6 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b8, code lost:
    
        r31 = r6;
        r30 = r7;
        r29 = r8;
        r28 = r9;
     */
    /* JADX WARN: Type inference failed for: r9v28, types: [fse, kotlin.coroutines.Continuation, kotlinx.coroutines.CoroutineStart] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i, int i2, int i3, ArrayList arrayList, h hVar, v5y v5yVar, boolean z, boolean z2, int i4, boolean z3, int i5, int i6, tse tseVar, l0u l0uVar) {
        Object obj;
        h hVar2 = this.b;
        this.b = hVar;
        int size = arrayList.size();
        int i7 = 0;
        loop0: while (true) {
            hz40 hz40Var = this.a;
            if (i7 < size) {
                u5y u5yVar = (u5y) arrayList.get(i7);
                int d = u5yVar.d();
                for (int i8 = 0; i8 < d; i8++) {
                    obj = null;
                    Object k = u5yVar.k(i8);
                    if ((k instanceof y4y ? (y4y) k : null) != null) {
                        break loop0;
                    }
                }
                i7++;
            } else {
                obj = null;
                if (hz40Var.f()) {
                    e();
                    return;
                }
            }
        }
    }

    public final void e() {
        hz40 hz40Var = this.a;
        if (hz40Var.g()) {
            Object[] objArr = hz40Var.c;
            long[] jArr = hz40Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (b bVar : ((m5y) objArr[(i << 3) + i3]).a) {
                                    if (bVar != null) {
                                        bVar.d();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            hz40Var.h();
        }
    }

    public final void f(Object obj) {
        m5y m5yVar = (m5y) this.a.m(obj);
        if (m5yVar != null) {
            for (b bVar : m5yVar.a) {
                if (bVar != null) {
                    bVar.d();
                }
            }
        }
    }

    public final void g(u5y u5yVar, boolean z) {
        b[] bVarArr = ((m5y) this.a.d(u5yVar.getKey())).a;
        int length = bVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            b bVar = bVarArr[i];
            int i3 = i2 + 1;
            if (bVar != null) {
                long l = u5yVar.l(i2);
                long j = bVar.l;
                if (!z5w.a(j, 9223372034707292159L) && !z5w.a(j, l)) {
                    long b = z5w.b(l, j);
                    qar qarVar = bVar.e;
                    if (qarVar != null) {
                        long b2 = z5w.b(((z5w) bVar.q.getValue()).a, b);
                        bVar.e(b2);
                        bVar.h.setValue(Boolean.TRUE);
                        bVar.g = z;
                        tje.N(bVar.a, null, null, new LazyLayoutItemAnimation$animatePlacementDelta$1(bVar, qarVar, b2, null), 3);
                    }
                }
                bVar.l = l;
            }
            i++;
            i2 = i3;
        }
    }
}
