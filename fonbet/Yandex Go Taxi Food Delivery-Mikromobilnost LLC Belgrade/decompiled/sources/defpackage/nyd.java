package defpackage;

import android.os.Looper;
import com.yandex.go.morphlex.api.MorphlexScreenPayload$PresentType;
import com.yandex.go.morphlex.data.descriptors.actions.morphlex_forward.OpenMorphlexScreenAction;
import com.yandex.go.morphlex.data.dto.MorphlexDimension;
import com.yandex.go.morphlex.router.b;
import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes13.dex */
public final class nyd implements dw {
    public final /* synthetic */ int a;
    public final k6x b;
    public final Object c;
    public final Object w;
    public final Object x;

    public nyd(k6x k6xVar, u4x u4xVar) {
        this.a = 0;
        this.b = k6xVar;
        this.c = u4xVar;
        this.w = new ArrayList();
        this.x = new zjr(xfz.b(nyd.class.getSimpleName()));
        k6xVar.c(new i6x() { // from class: lyd
            @Override // defpackage.i6x
            public final void a(d6x d6xVar) {
                nyd nydVar = nyd.this;
                ((ArrayList) nydVar.w).removeIf(new sdc(1, new vqb(17, nydVar)));
            }
        });
    }

    public boolean a(myd mydVar) {
        StackTraceElement stackTraceElement;
        String str;
        iyd iydVar = mydVar.a;
        if (Looper.getMainLooper().isCurrentThread()) {
            f5x a = ((u4x) this.c).a(iydVar.a, this.b.b);
            if (a instanceof e5x) {
                Object obj = ((e5x) a).c;
                Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                if (bool != null ? bool.booleanValue() : false) {
                    n6u n6uVar = mydVar.b;
                    n6uVar.c.b(iydVar.b, n6uVar.b, n6uVar.e);
                    return true;
                }
            } else if (!(a instanceof d5x)) {
                w511.b();
                return false;
            }
            return false;
        }
        zjr zjrVar = (zjr) this.x;
        String type = ErrorTypes.JS_UPDATE_NON_MAIN_THREAD.getType();
        i3y a2 = xfz.a(new Pair("locator", "ConditionalActionHandler.dispatch"), new Pair("currentThreadName", Thread.currentThread().getName()));
        s7s0 s7s0Var = zjrVar.c.a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        tjr tjrVar = tjr.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
            if (valueOf == null || (str = valueOf.toString()) == null) {
                str = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str);
        }
        zjrVar.d(FlexLogLevel.ERROR, "JasonStatham must be used on main thread", xfz.c(a2, xfz.a(new Pair("errorType", type))), EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
        return false;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        k6x k6xVar;
        int i = this.a;
        Object obj = this.w;
        switch (i) {
            case 0:
                myd mydVar = new myd((iyd) krVar, n6uVar);
                if (!a(mydVar)) {
                    ((ArrayList) obj).add(mydVar);
                    break;
                }
                break;
            default:
                OpenMorphlexScreenAction openMorphlexScreenAction = (OpenMorphlexScreenAction) krVar;
                MorphlexScreenPayload$PresentType b = c830.b(openMorphlexScreenAction.e);
                h830 h830Var = null;
                if (b == null) {
                    k6xVar = null;
                } else {
                    String str = openMorphlexScreenAction.a;
                    String str2 = openMorphlexScreenAction.b;
                    List list = openMorphlexScreenAction.c;
                    ArrayList a = list != null ? c830.a(list) : null;
                    String str3 = openMorphlexScreenAction.d;
                    MorphlexDimension morphlexDimension = openMorphlexScreenAction.g;
                    k6xVar = null;
                    h830Var = new h830(str, str2, b, null, a, null, str3, false, morphlexDimension != null ? new i6z0(morphlexDimension.a, morphlexDimension.b, 8) : null, openMorphlexScreenAction.h, openMorphlexScreenAction.i, NetworkRequestException.INVALID_RANGE);
                }
                if (h830Var != null) {
                    l6x l6xVar = jl40.l(openMorphlexScreenAction.f, Boolean.TRUE) ? new l6x(this.b) : new l6x(k6xVar);
                    oep0 oep0Var = (oep0) this.x;
                    i6r i6rVar = (i6r) this.c;
                    ((q3g) obj).getClass();
                    i6rVar.getClass();
                    int i2 = 16;
                    m3g m3gVar = new m3g(i6rVar, i2);
                    m3g m3gVar2 = new m3g(i6rVar, 8);
                    m3g m3gVar3 = new m3g(i6rVar, 6);
                    m3g m3gVar4 = new m3g(i6rVar, 9);
                    int i3 = 15;
                    xvf0 b2 = i5m.b(new jl00(new jl00(new m3g(i6rVar, i3), i2), i3));
                    aos aosVar = new aos(n3w.a(new u730(new y94(b2))), 17);
                    r3g r3gVar = new r3g(i6rVar, 4);
                    n3w a2 = n3w.a(i6rVar);
                    int i4 = 18;
                    xvf0 b3 = i5m.b(new aos(n3w.a(l6xVar), i4));
                    ret retVar = new ret(r3gVar, a2, b3, 22);
                    di20 di20Var = new di20(new m3g(i6rVar, 24), a2, b3, 8);
                    srb srbVar = new srb(new dx9(b2, new m3g(i6rVar, i4), 16, false), 5);
                    xvf0 b4 = i5m.b(o830.a);
                    ba9 ba9Var = new ba9(new ig7(b4, 24), 10);
                    lq40 lq40Var = new lq40(16, new ge50((xvf0) a2, (xvf0) e830.a, b3, (xvf0) new r3g(i6rVar, 3), 7, (byte) 0));
                    m3g m3gVar5 = new m3g(i6rVar, 12);
                    r3g r3gVar2 = new r3g(i6rVar, 7);
                    m3g m3gVar6 = new m3g(i6rVar, 14);
                    m3g m3gVar7 = new m3g(i6rVar, 17);
                    m3g m3gVar8 = new m3g(i6rVar, 26);
                    zmm0 zmm0Var = new zmm0(m3gVar5, r3gVar2, m3gVar6, m3gVar7, m3gVar8, 23);
                    int i5 = 6;
                    gaq0 gaq0Var = new gaq0(zmm0Var, i5);
                    r3g r3gVar3 = new r3g(i6rVar, i5);
                    m3g m3gVar9 = new m3g(i6rVar, 21);
                    m3g m3gVar10 = new m3g(i6rVar, 7);
                    m3g m3gVar11 = new m3g(i6rVar, 20);
                    eqh eqhVar = new eqh();
                    xvf0 b5 = i5m.b(j830.a);
                    c0j c0jVar = new c0j(m3gVar10, m3gVar11, eqhVar, b5, 28);
                    ba9 ba9Var2 = new ba9(new kj7((xvf0) m3gVar8, (xvf0) m3gVar6, (xvf0) new r3g(i6rVar, 1), 17, (char) 0), 7);
                    m3g m3gVar12 = new m3g(i6rVar, 27);
                    h830 h830Var2 = h830Var;
                    m3g m3gVar13 = new m3g(i6rVar, 29);
                    gaq0 gaq0Var2 = new gaq0(new gzn0(m3gVar12, m3gVar13, new r3g(i6rVar, 10), 26), 7);
                    n3w n3wVar = y2r0.c;
                    ArrayList arrayList = new ArrayList(11);
                    List list2 = Collections.EMPTY_LIST;
                    arrayList.add(retVar);
                    arrayList.add(di20Var);
                    arrayList.add(srbVar);
                    arrayList.add(ba9Var);
                    arrayList.add(lq40Var);
                    arrayList.add(gaq0Var);
                    arrayList.add(r3gVar3);
                    arrayList.add(m3gVar9);
                    arrayList.add(c0jVar);
                    arrayList.add(ba9Var2);
                    arrayList.add(gaq0Var2);
                    ssj ssjVar = new ssj(aosVar, new y2r0(arrayList, list2), 1);
                    r3g r3gVar4 = new r3g(i6rVar, 9);
                    m3g m3gVar14 = new m3g(i6rVar, 19);
                    r3g r3gVar5 = new r3g(i6rVar, 0);
                    m3g m3gVar15 = new m3g(i6rVar, 23);
                    r3g r3gVar6 = new r3g(i6rVar, 2);
                    r3g r3gVar7 = new r3g(i6rVar, 8);
                    m3g m3gVar16 = new m3g(i6rVar, 25);
                    m3g m3gVar17 = new m3g(i6rVar, 28);
                    r3g r3gVar8 = new r3g(i6rVar, 5);
                    m3g m3gVar18 = new m3g(i6rVar, 11);
                    ArrayList arrayList2 = new ArrayList(1);
                    List list3 = Collections.EMPTY_LIST;
                    arrayList2.add(y730.a);
                    eqh.a(eqhVar, new xki(m3gVar2, m3gVar3, m3gVar4, ssjVar, b2, b5, r3gVar4, m3gVar12, m3gVar14, b4, r3gVar5, m3gVar15, r3gVar6, b3, r3gVar7, m3gVar8, m3gVar5, m3gVar7, m3gVar16, m3gVar13, m3gVar17, r3gVar8, m3gVar18, new y2r0(arrayList2, list3)));
                    m3g m3gVar19 = new m3g(i6rVar, 10);
                    xvf0 b6 = i5m.b(new di20(m3gVar3, new m3g(i6rVar, 22), b3, 9));
                    m3g m3gVar20 = new m3g(i6rVar, 13);
                    h3y a3 = i5m.a(m3gVar19);
                    c0g c0gVar = (c0g) i6rVar;
                    tt2 Z1 = c0gVar.Z1();
                    q5z.h(Z1);
                    ((pep0) oep0Var).f(new b(m3gVar, eqhVar, a3, Z1, i6rVar, i5m.a(b6), i5m.a(m3gVar20), c0gVar.p2()), h830Var2, hxx.a);
                    break;
                }
                break;
        }
    }

    public nyd(i6r i6rVar, q3g q3gVar, k6x k6xVar, oep0 oep0Var) {
        this.a = 1;
        this.c = i6rVar;
        this.w = q3gVar;
        this.b = k6xVar;
        this.x = oep0Var;
    }
}
