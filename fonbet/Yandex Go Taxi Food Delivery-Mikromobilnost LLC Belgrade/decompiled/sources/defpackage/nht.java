package defpackage;

import android.R;
import com.yandex.go.design.compose.slot.SlotSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;

/* loaded from: classes10.dex */
public abstract class nht {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData};

    public static final void a(g711 g711Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1750654390);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(g711Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 c2 = ljs0.c(f530Var, 1.0f);
            boolean e = btsVar.e(g711Var);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new wx11(i3, g711Var);
                btsVar.o0(Q);
            }
            f530 a2 = fnq0.a(c2, (tls) Q);
            zed.a.getClass();
            ydb1.a(a2, zed.b, wwg.S(1412300697, true, new jvx0(21, g711Var), btsVar), null, zed.c, null, SlotSize.L, false, btsVar, 1597872, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(g711Var, f530Var, i, 13);
        }
    }

    public static scg b(if41 if41Var) {
        if41Var.getClass();
        scg scgVar = new scg();
        scgVar.a = new rcg(if41Var, 1);
        scgVar.b = new rcg(if41Var, 0);
        xvf0 a2 = dhs0.a(new d441(new rcg(if41Var, 2), 15));
        scgVar.c = a2;
        scgVar.d = new d441(a2, 6);
        xvf0 b2 = i5m.b(bg41.a);
        scgVar.e = b2;
        scgVar.f = i5m.b(new t4v0(scgVar.a, scgVar.b, scgVar.d, b2, 22));
        return scgVar;
    }

    public static final tm80 c(xx20 xx20Var) {
        Iterator it;
        ListBuilder a2 = rcc.a();
        int size = xx20Var.b.size() - 1;
        Iterator it2 = xx20Var.b.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            v4r v4rVar = (v4r) next;
            String str = v4rVar.a;
            CharSequence charSequence = v4rVar.b;
            List list = v4rVar.c;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                c4r c4rVar = (c4r) it3.next();
                String str2 = c4rVar.a;
                ypb ypbVar = c4rVar.b;
                lqb c2 = xlb1.c(ypbVar);
                kdc kdcVar = ypbVar.e;
                if (kdcVar == null) {
                    it = it2;
                    kdcVar = new bdc(xng0.bgInvert);
                } else {
                    it = it2;
                }
                Iterator it4 = it3;
                zpb zpbVar = new zpb(ypbVar.b, kdcVar);
                boolean z = c4rVar.c;
                k7v k7vVar = ypbVar.f;
                arrayList.add(new mqb(str2, c2, zpbVar, z, k7vVar != null ? k7vVar.a : null));
                it2 = it;
                it3 = it4;
            }
            Iterator it5 = it2;
            a2.add(new z5r(str, charSequence, arrayList));
            if (i != size) {
                a2.add(a6r.a);
            }
            i = i2;
            it2 = it5;
        }
        ListBuilder j = a2.j();
        List<ky6> list2 = xx20Var.c;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        for (ky6 ky6Var : list2) {
            CharSequence charSequence2 = ky6Var.a;
            kdc kdcVar2 = ky6Var.c;
            if (kdcVar2 == null) {
                kdcVar2 = new bdc(xng0.controlMinor);
            }
            arrayList2.add(new c6r(charSequence2, kdcVar2, ky6Var.d));
        }
        return new tm80(j, arrayList2);
    }
}
