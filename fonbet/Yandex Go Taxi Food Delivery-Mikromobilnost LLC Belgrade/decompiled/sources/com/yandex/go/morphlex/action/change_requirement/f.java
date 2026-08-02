package com.yandex.go.morphlex.action.change_requirement;

import com.yandex.go.morphlex.action.change_requirement.ChangeRequirementAction;
import defpackage.b580;
import defpackage.b8r;
import defpackage.dqe0;
import defpackage.dw;
import defpackage.ejj0;
import defpackage.fmw0;
import defpackage.gi;
import defpackage.if70;
import defpackage.jf70;
import defpackage.jl40;
import defpackage.jmw0;
import defpackage.kr;
import defpackage.lmw0;
import defpackage.mf70;
import defpackage.mi31;
import defpackage.n6u;
import defpackage.of70;
import defpackage.q5z;
import defpackage.qf70;
import defpackage.rf70;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;

/* loaded from: classes12.dex */
public final class f implements dw {
    public final dqe0 a;
    public final b8r b;
    public final RequirementsChangedNotifier c;

    public f(dqe0 dqe0Var, b8r b8rVar, RequirementsChangedNotifier requirementsChangedNotifier) {
        this.a = dqe0Var;
        this.b = b8rVar;
        this.c = requirementsChangedNotifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    @Override // defpackage.dw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handle(kr krVar, n6u n6uVar) {
        rf70 rf70Var;
        mi31 d;
        Object obj;
        lmw0 lmw0Var;
        ejj0 ejj0Var;
        Object if70Var;
        Iterator it;
        Object obj2;
        ChangeRequirementAction changeRequirementAction = (ChangeRequirementAction) krVar;
        ChangeRequirementAction.Operation operation = changeRequirementAction.c;
        int i = operation == null ? -1 : e.a[operation.ordinal()];
        if (i == -1) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return;
            }
            String str = changeRequirementAction.a;
            List list = this.a.a.x;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (!jl40.l(((b580) obj3).a, str)) {
                    arrayList.add(obj3);
                }
            }
            if (arrayList.size() == list.size()) {
                return;
            }
            this.a.a.x = arrayList;
            this.c.a.g(RequirementsChangedNotifier.ChangeType.CHANGE);
            return;
        }
        ChangeRequirementAction.ValueType valueType = changeRequirementAction.d;
        int i2 = valueType == null ? -1 : e.b[valueType.ordinal()];
        b580 b580Var = null;
        if (i2 != -1) {
            if (i2 == 1) {
                Boolean bool = changeRequirementAction.e;
                if (bool != null) {
                    rf70Var = new mf70(bool.booleanValue());
                }
            } else if (i2 == 2) {
                Integer num = changeRequirementAction.f;
                if (num != null) {
                    rf70Var = new of70(num.intValue());
                }
            } else if (i2 != 3) {
                w511.b();
                return;
            } else {
                String str2 = changeRequirementAction.g;
                if (str2 != null) {
                    rf70Var = new qf70(str2);
                }
            }
            if (rf70Var != null) {
                return;
            }
            String str3 = changeRequirementAction.b;
            if (str3 == null || (d = b8r.d(this.b, str3, null, 6)) == null) {
                lmw0Var = null;
            } else {
                Iterator it2 = d.a.f().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (jl40.l(((lmw0) obj).getName(), changeRequirementAction.a)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                lmw0Var = (lmw0) obj;
            }
            if (lmw0Var == null) {
                return;
            }
            ChangeRequirementAction.ValueType valueType2 = changeRequirementAction.d;
            int i3 = valueType2 == null ? -1 : e.b[valueType2.ordinal()];
            boolean z = false;
            if (i3 != -1) {
                if (i3 == 1) {
                    z = lmw0Var instanceof fmw0;
                } else if (i3 != 2) {
                    if (i3 != 3) {
                        w511.b();
                        return;
                    }
                    if (lmw0Var instanceof jmw0) {
                        ArrayList arrayList2 = ((jmw0) lmw0Var).s().c;
                        if (!arrayList2.isEmpty()) {
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                if (((ejj0) it3.next()).l instanceof jf70) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                    }
                } else if (lmw0Var instanceof jmw0) {
                    ArrayList arrayList3 = ((jmw0) lmw0Var).s().c;
                    if (!arrayList3.isEmpty()) {
                        Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            if (((ejj0) it4.next()).l instanceof if70) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
            }
            if (z) {
                if (lmw0Var instanceof fmw0) {
                    fmw0 fmw0Var = (fmw0) lmw0Var;
                    b580Var = b580.a(gi.e(fmw0Var.a, fmw0Var.b), rf70Var, null, null, 55);
                } else if (lmw0Var instanceof jmw0) {
                    jmw0 jmw0Var = (jmw0) lmw0Var;
                    ChangeRequirementAction.ValueType valueType3 = changeRequirementAction.d;
                    int i4 = valueType3 == null ? -1 : e.b[valueType3.ordinal()];
                    if (i4 == -1 || i4 == 1) {
                        ejj0Var = null;
                    } else if (i4 == 2) {
                        Integer num2 = changeRequirementAction.f;
                        if (num2 != null) {
                            if70Var = new if70(num2.intValue());
                            it = jmw0Var.s().c.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                }
                            }
                            ejj0Var = (ejj0) obj2;
                        }
                        if70Var = null;
                        it = jmw0Var.s().c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                            }
                        }
                        ejj0Var = (ejj0) obj2;
                    } else {
                        if (i4 != 3) {
                            w511.b();
                            return;
                        }
                        String str4 = changeRequirementAction.g;
                        if (str4 != null) {
                            if70Var = new jf70(str4);
                            it = jmw0Var.s().c.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj2 = it.next();
                                    if (jl40.l(((ejj0) obj2).l, if70Var)) {
                                        break;
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            ejj0Var = (ejj0) obj2;
                        }
                        if70Var = null;
                        it = jmw0Var.s().c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                            }
                        }
                        ejj0Var = (ejj0) obj2;
                    }
                    if (ejj0Var != null) {
                        b580Var = q5z.u(jmw0Var, Collections.singletonList(ejj0Var));
                    }
                }
                if (b580Var == null) {
                    return;
                }
                List list2 = this.a.a.x;
                ListBuilder listBuilder = new ListBuilder(list2.size());
                for (Object obj4 : list2) {
                    if (!jl40.l(((b580) obj4).a, changeRequirementAction.a)) {
                        listBuilder.add(obj4);
                    }
                }
                listBuilder.add(b580Var);
                this.a.a.x = listBuilder.j();
                this.c.a.g(RequirementsChangedNotifier.ChangeType.CHANGE);
                return;
            }
            return;
        }
        rf70Var = null;
        if (rf70Var != null) {
        }
    }
}
