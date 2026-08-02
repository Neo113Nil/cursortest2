package defpackage;

import android.graphics.Rect;
import com.yandex.go.summary.repository.MarginSource;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class jqv0 {
    public final z62 a;
    public final fpo b;
    public final v0s c;
    public final vdv0 d;
    public final wjm e;

    public jqv0(z62 z62Var, fpo fpoVar, v0s v0sVar, vdv0 vdv0Var, wjm wjmVar) {
        this.a = z62Var;
        this.b = fpoVar;
        this.c = v0sVar;
        this.d = vdv0Var;
        this.e = wjmVar;
    }

    public final Object a(iqv0 iqv0Var, oiv0 oiv0Var, SuspendLambda suspendLambda) {
        Object value;
        Object value2;
        LinkedHashMap linkedHashMap;
        Object value3;
        boolean z = iqv0Var instanceof dqv0;
        zy11 zy11Var = zy11.a;
        if (z) {
            y62 y62Var = ((dqv0) iqv0Var).a;
            boolean z2 = y62Var instanceof x62;
            z62 z62Var = this.a;
            if (z2) {
                z62Var.a.a(((x62) y62Var).a, oiv0Var);
                return zy11Var;
            }
            if (y62Var instanceof r62) {
                z62Var.b.a(((r62) y62Var).a, oiv0Var);
                return zy11Var;
            }
            if (y62Var instanceof w62) {
                return z62Var.c.a(((w62) y62Var).a, oiv0Var, suspendLambda);
            }
            if (y62Var instanceof v62) {
                return z62Var.d.d(((v62) y62Var).a, oiv0Var, suspendLambda);
            }
            if (y62Var instanceof t62) {
                bgj bgjVar = z62Var.e;
                agj agjVar = ((t62) y62Var).a;
                bgjVar.getClass();
                if (agjVar != null) {
                    agjVar.a.invoke();
                    return zy11Var;
                }
                w511.b();
                return null;
            }
            if (y62Var instanceof s62) {
                je3 je3Var = z62Var.g;
                ie3 ie3Var = ((s62) y62Var).a;
                je3Var.getClass();
                if (ie3Var != null) {
                    ie3Var.a.invoke();
                    return zy11Var;
                }
                w511.b();
                return null;
            }
            if (!(y62Var instanceof u62)) {
                z62Var.getClass();
                w511.b();
                return null;
            }
            hdu hduVar = z62Var.f;
            fdu fduVar = ((u62) y62Var).a;
            if (fduVar instanceof zcu) {
                ((fwu0) hduVar.b).getClass();
                return zy11Var;
            }
            hduVar.getClass();
            if (jl40.l(fduVar, cdu.a)) {
                return ((pev0) hduVar.a).a(new gdv0(SummaryExpandReason.OPTIONS_TAP), suspendLambda);
            }
            w511.b();
            return null;
        }
        if (iqv0Var instanceof eqv0) {
            epo epoVar = ((eqv0) iqv0Var).a;
            fpo fpoVar = this.b;
            if (epoVar != null) {
                return fpoVar.a.a(epoVar.a, oiv0Var, suspendLambda);
            }
            fpoVar.getClass();
            w511.b();
            return null;
        }
        if (iqv0Var instanceof fqv0) {
            return this.c.a(((fqv0) iqv0Var).a, oiv0Var, suspendLambda);
        }
        if (iqv0Var instanceof hqv0) {
            udv0 udv0Var = ((hqv0) iqv0Var).a;
            vdv0 vdv0Var = this.d;
            pev0 pev0Var = vdv0Var.a;
            if (jl40.l(udv0Var, qdv0.a)) {
                return pev0Var.a(new ddv0(), suspendLambda);
            }
            if (udv0Var instanceof rdv0) {
                return pev0Var.a(new edv0(((rdv0) udv0Var).a), suspendLambda);
            }
            if (jl40.l(udv0Var, sdv0.a)) {
                return pev0Var.a(new fdv0(null), suspendLambda);
            }
            if (udv0Var instanceof tdv0) {
                return pev0Var.a(new gdv0(((tdv0) udv0Var).a), suspendLambda);
            }
            if (udv0Var instanceof pdv0) {
                ldv0 ldv0Var = vdv0Var.b;
                ch6 ch6Var = ((pdv0) udv0Var).a;
                r0 r0Var = ldv0Var.a;
                do {
                    value3 = r0Var.getValue();
                } while (!r0Var.k(value3, ch6Var));
            } else {
                if (!(udv0Var instanceof odv0)) {
                    w511.b();
                    return null;
                }
                ggv0 ggv0Var = vdv0Var.c;
                MarginSource marginSource = MarginSource.BottomSheet;
                Integer num = new Integer(((odv0) udv0Var).a);
                r0 r0Var2 = ggv0Var.a;
                do {
                    value2 = r0Var2.getValue();
                    Map map = (Map) value2;
                    Rect rect = (Rect) map.get(marginSource);
                    if (rect == null) {
                        rect = new Rect();
                    }
                    linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.put(marginSource, new Rect(rect.left, rect.top, rect.right, num.intValue()));
                } while (!r0Var2.k(value2, linkedHashMap));
            }
        } else {
            if (!(iqv0Var instanceof gqv0)) {
                w511.b();
                return null;
            }
            tg00 tg00Var = ((gqv0) iqv0Var).a;
            boolean z3 = tg00Var instanceof pg00;
            wjm wjmVar = this.e;
            if (z3) {
                ((w81) wjmVar.b).a(((pg00) tg00Var).a, oiv0Var);
                return zy11Var;
            }
            if (tg00Var instanceof rg00) {
                ((mww0) wjmVar.c).a(((rg00) tg00Var).a, oiv0Var);
                return zy11Var;
            }
            if (!(tg00Var instanceof qg00)) {
                if (tg00Var instanceof sg00) {
                    ((ouw0) wjmVar.x).a(((sg00) tg00Var).a);
                    return zy11Var;
                }
                wjmVar.getClass();
                w511.b();
                return null;
            }
            kg00 kg00Var = (kg00) wjmVar.w;
            int i = ((qg00) tg00Var).a;
            r0 r0Var3 = kg00Var.a;
            do {
                value = r0Var3.getValue();
                ((Number) value).intValue();
            } while (!r0Var3.k(value, Integer.valueOf(i)));
        }
        return zy11Var;
    }
}
