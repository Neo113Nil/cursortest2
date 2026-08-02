package defpackage;

import com.yandex.go.morphlex.action.select_due.SetPreorderDueAction;
import flex.engine.a;
import flex.logger.FlexLogLevel;
import java.util.Calendar;
import java.util.Date;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes13.dex */
public final class poe0 implements dw {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object w;
    public final Object x;
    public final Object y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ poe0(m0m m0mVar, tse tseVar, a aVar, l0o l0oVar) {
        this(m0mVar, tseVar, aVar, l0oVar, ck91.b(), 0);
        this.a = 0;
        i3y i3yVar = ryl.c;
    }

    public void a(String str, String str2) {
        if (str == null || str.length() == 0) {
            return;
        }
        b8r b8rVar = (b8r) this.w;
        if (str2 == null) {
            str2 = "";
        }
        mi31 d = b8r.d(b8rVar, str, str2, 4);
        if (d != null) {
            ((c4r0) this.c).a(new gnx0(new fnx0(d, SelectionOrigin.DUE_TIMETABLE), true));
        }
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        dk91 tylVar;
        StackTraceElement stackTraceElement;
        String str;
        switch (this.a) {
            case 0:
                ooe0 ooe0Var = (ooe0) krVar;
                i7x0 i7x0Var = new i7x0();
                i7x0Var.b("isPreload");
                a aVar = (a) this.w;
                if (aVar != null) {
                    aVar.a.b("isPreload");
                } else {
                    aVar = bk91.e(ooe0Var.a, new ugd0(4, this, i7x0Var));
                }
                aVar.b(new el6(0));
                u1m u1mVar = ooe0Var.a;
                ywl ywlVar = ooe0Var.b;
                aVar.q0 = true;
                aVar.p(u1mVar, ywlVar, false);
                ryl rylVar = (ryl) this.y;
                u1m u1mVar2 = ooe0Var.a;
                Double d = ooe0Var.c;
                if (d == null || d.doubleValue() >= 1.0E-6d) {
                    tylVar = new tyl(d != null ? d.doubleValue() : 60.0d);
                } else {
                    tylVar = syl.a;
                }
                String str2 = ooe0Var.d;
                tjr tjrVar = tjr.d;
                rylVar.a();
                rylVar.b.put(u1mVar2, new uyl(new Date(), tylVar, aVar, str2));
                zjr zjrVar = rylVar.a;
                i3y b = ryl.b(rylVar, u1mVar2, null, 2);
                EmptyList emptyList = EmptyList.a;
                s7s0 s7s0Var = zjrVar.c.a;
                if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
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
                zjrVar.d(FlexLogLevel.DEBUG, "Engine is saved to storage", b, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
                break;
            default:
                SetPreorderDueAction setPreorderDueAction = (SetPreorderDueAction) krVar;
                Calendar calendar = setPreorderDueAction.a;
                String str3 = setPreorderDueAction.c;
                if (calendar != null && str3 != null) {
                    ((dqe0) this.y).a.R = setPreorderDueAction.b;
                    ((y1s) this.x).b(false);
                    ((axm) this.b).a(new xwm(calendar, str3, setPreorderDueAction.d));
                    a(setPreorderDueAction.f, setPreorderDueAction.g);
                    break;
                } else if (jl40.l(setPreorderDueAction.e, Boolean.TRUE)) {
                    ((dqe0) this.y).a.R = setPreorderDueAction.b;
                    ((y1s) this.x).b(true);
                    ((axm) this.b).a(msb1.F);
                    a(setPreorderDueAction.f, setPreorderDueAction.g);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ poe0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
    }
}
