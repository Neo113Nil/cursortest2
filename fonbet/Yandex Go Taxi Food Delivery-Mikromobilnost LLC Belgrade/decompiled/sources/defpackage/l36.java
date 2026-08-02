package defpackage;

import flex.engine.section.model.ScrollPosition;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes4.dex */
public final class l36 implements dw {
    public final /* synthetic */ int a;
    public static final l36 b = new l36(0);
    public static final l36 c = new l36(1);
    public static final l36 w = new l36(2);
    public static final l36 x = new l36(3);
    public static final l36 y = new l36(4);
    public static final l36 z = new l36(5);
    public static final l36 A = new l36(6);
    public static final l36 B = new l36(7);
    public static final l36 C = new l36(8);
    public static final l36 D = new l36(9);
    public static final l36 E = new l36(10);
    public static final l36 F = new l36(11);
    public static final l36 G = new l36(12);
    public static final l36 H = new l36(13);
    public static final l36 I = new l36(14);
    public static final l36 J = new l36(15);
    public static final l36 K = new l36(16);
    public static final l36 L = new l36(17);
    public static final l36 M = new l36(18);
    public static final l36 N = new l36(19);
    public static final l36 O = new l36(20);
    public static final l36 P = new l36(21);
    public static final l36 Q = new l36(22);

    public l36(qih qihVar) {
        this.a = 23;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        String str;
        ywl a;
        ScrollPosition scrollPosition;
        ywl a2;
        int i = this.a;
        e4q0 e4q0Var = e4q0.a;
        switch (i) {
            case 0:
                krVar.getClass();
                throw new ClassCastException();
            case 1:
                n6uVar.d.a(new l5q0(((ble) krVar).a));
                return;
            case 2:
                h5z0.a.h(g8e.o("Caught ", ((uug) krVar).b), new Object[0]);
                return;
            case 3:
                n6uVar.d.a(new n5q0(((rnj) krVar).a));
                return;
            case 4:
                n6uVar.d.a(p5q0.a);
                return;
            case 5:
                lhu lhuVar = (lhu) krVar;
                n6uVar.d.a(new y5q0(e4q0Var, null, new b5t0(lhuVar.a, lhuVar.b), 2));
                return;
            case 6:
                siu siuVar = (siu) krVar;
                n6uVar.d.a(new y5q0(new f4q0(siuVar.a), null, new b5t0(siuVar.b, siuVar.c), 2));
                return;
            case 7:
                yki0 yki0Var = (yki0) krVar;
                n6uVar.d.a(new hxl(yki0Var.b, yki0Var.a));
                return;
            case 8:
                n6uVar.d.a(new jxl(false));
                return;
            case 9:
                bti0 bti0Var = (bti0) krVar;
                t1q0 t1q0Var = (t1q0) n6uVar.b.a.b(qoi0.a(t1q0.class));
                if (t1q0Var == null) {
                    return;
                }
                List b2 = t1q0Var.b(bti0Var.a);
                if (b2.isEmpty()) {
                    return;
                }
                n6uVar.d.a(new r5q0(b2, b.f()));
                return;
            case 10:
                n6uVar.d.a(new s5q0(((exi0) krVar).a));
                return;
            case 11:
                zyi0 zyi0Var = (zyi0) krVar;
                txl txlVar = n6uVar.d;
                m631 m631Var = (m631) n6uVar.b.a.b(qoi0.a(m631.class));
                str = m631Var != null ? (String) m631Var.a.get("documentQueryPath") : null;
                if (str == null) {
                    a = zyi0Var.a;
                } else {
                    cnr0 cnr0Var = cnr0.b;
                    cnr0 f = vez0.f(Collections.singletonList(new m631(g8e.z("documentQueryPath", str))));
                    ywl ywlVar = zyi0Var.a;
                    a = ywl.a(ywlVar, null, null, ywlVar.c.a(f), null, 59);
                }
                txlVar.a(new mxl(a, zwl.d));
                return;
            case 12:
                b1j0 b1j0Var = (b1j0) krVar;
                n6uVar.d.a(new y5q0(e4q0Var, new b5t0(b1j0Var.c, b1j0Var.d), new b5t0(b1j0Var.a, b1j0Var.b)));
                return;
            case 13:
                g1j0 g1j0Var = (g1j0) krVar;
                txl txlVar2 = n6uVar.d;
                String str2 = g1j0Var.a;
                String str3 = g1j0Var.b;
                if (str3 == null) {
                    str3 = str2;
                }
                txlVar2.a(new t5q0(str2, str3, g1j0Var.c));
                return;
            case 14:
                j1j0 j1j0Var = (j1j0) krVar;
                n6uVar.d.a(new y5q0(new f4q0(j1j0Var.a), new b5t0(j1j0Var.d, j1j0Var.e), new b5t0(j1j0Var.b, j1j0Var.c)));
                return;
            case 15:
                yip0 yip0Var = (yip0) krVar;
                txl txlVar3 = n6uVar.d;
                String str4 = yip0Var.a;
                int i2 = zip0.a[yip0Var.b.ordinal()];
                if (i2 == 1) {
                    scrollPosition = ScrollPosition.TOP;
                } else if (i2 == 2) {
                    scrollPosition = ScrollPosition.CENTER;
                } else {
                    if (i2 != 3) {
                        w511.b();
                        return;
                    }
                    scrollPosition = ScrollPosition.BOTTOM;
                }
                txlVar3.a(new u5q0(str4, scrollPosition, yip0Var.c, yip0Var.d));
                return;
            case 16:
                txl txlVar4 = n6uVar.d;
                Boolean bool = ((gjp0) krVar).a;
                txlVar4.a(new v5q0(bool != null ? bool.booleanValue() : false));
                return;
            case 17:
                u3r0 u3r0Var = (u3r0) krVar;
                txl txlVar5 = n6uVar.d;
                boolean z2 = u3r0Var.b;
                String str5 = u3r0Var.a;
                txlVar5.a(z2 ? new o5q0(str5) : new m5q0(str5));
                return;
            case 18:
                n6uVar.d.a(new w5q0(((a4r0) krVar).a));
                return;
            case 19:
                p5s0 p5s0Var = (p5s0) krVar;
                n6uVar.d.a(new y5q0(e4q0Var, new b5t0(p5s0Var.a, p5s0Var.b), null, 4));
                return;
            case 20:
                f9s0 f9s0Var = (f9s0) krVar;
                n6uVar.d.a(new y5q0(new f4q0(f9s0Var.a), new b5t0(f9s0Var.b, f9s0Var.c), null, 4));
                return;
            case 21:
                x621 x621Var = (x621) krVar;
                txl txlVar6 = n6uVar.d;
                m631 m631Var2 = (m631) n6uVar.b.a.b(qoi0.a(m631.class));
                str = m631Var2 != null ? (String) m631Var2.a.get("documentQueryPath") : null;
                if (str == null) {
                    a2 = x621Var.a;
                } else {
                    cnr0 cnr0Var2 = cnr0.b;
                    cnr0 f2 = vez0.f(Collections.singletonList(new m631(g8e.z("documentQueryPath", str))));
                    ywl ywlVar2 = x621Var.a;
                    a2 = ywl.a(ywlVar2, null, null, ywlVar2.c.a(f2), null, 59);
                }
                txlVar6.a(new mxl(a2, zwl.c));
                return;
            case 22:
                x721 x721Var = (x721) krVar;
                n6uVar.d.a(new x5q0(x721Var.a, x721Var.b));
                return;
            default:
                Iterator it = ((ivi0) krVar).a.iterator();
                while (it.hasNext()) {
                    n6uVar.c.b((kr) it.next(), n6uVar.b, n6uVar.e);
                }
                return;
        }
    }

    public /* synthetic */ l36(int i) {
        this.a = i;
    }
}
