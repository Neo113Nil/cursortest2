package defpackage;

import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.h6k0;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class fwq0 {
    public final jgv a;
    public final cti b;
    public final sze0 c;
    public final pdc d;
    public final bco e;
    public final yp2 f;
    public final pmw0 g;
    public final xdf h;

    public fwq0(jgv jgvVar, cti ctiVar, sze0 sze0Var, pdc pdcVar, bco bcoVar, yp2 yp2Var, pmw0 pmw0Var, xdf xdfVar) {
        this.a = jgvVar;
        this.b = ctiVar;
        this.c = sze0Var;
        this.d = pdcVar;
        this.e = bcoVar;
        this.f = yp2Var;
        this.g = pmw0Var;
        this.h = xdfVar;
    }

    public static q6k0 a(h6k0 h6k0Var, int i, String str, String str2) {
        Object obj;
        List d = h6k0Var.getD();
        ListIterator listIterator = d.listIterator(d.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((h6k0.c) obj).getA() <= i) {
                break;
            }
        }
        h6k0.c cVar = (h6k0.c) obj;
        if (cVar == null) {
            return null;
        }
        return new q6k0(str, str2, cVar.getC().getA(), cVar.getC().getB(), h6k0Var.getA(), cVar.getB());
    }

    public static oox0 b(yal0 yal0Var, boolean z, ServiceLevel.Branding.RideTimeAppearance rideTimeAppearance) {
        o5v o5vVar;
        if (rideTimeAppearance != null) {
            String b = rideTimeAppearance.getB();
            if (b == null) {
                b = "";
            }
            String a = rideTimeAppearance.getA();
            if (a == null) {
                a = "";
            }
            o5vVar = new o5v("", b, a, "");
        } else {
            o5vVar = null;
        }
        if (o5vVar != null) {
            return new oox0(z ? "" : yal0Var.h, yal0Var.i, o5vVar);
        }
        return new oox0(z ? "" : yal0Var.h, yal0Var.i);
    }
}
