package defpackage;

import com.yandex.go.summary.analytics.SummaryAnalytics$RequirementBubbleAction;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.sequences.b;
import ru.yandex.taxi.requirements.models.domain.BubbleAvailability;
import ru.yandex.taxi.requirements.models.domain.RequirementBubbleAction;

/* loaded from: classes6.dex */
public final class ajj0 {
    public final xcv0 a;
    public final w421 b;
    public final dqe0 c;
    public final uih d;
    public final wiq0 e;
    public volatile kdj0 f = kdj0.c;

    public ajj0(xcv0 xcv0Var, w421 w421Var, dqe0 dqe0Var, uih uihVar, wiq0 wiq0Var) {
        this.a = xcv0Var;
        this.b = w421Var;
        this.c = dqe0Var;
        this.d = uihVar;
        this.e = wiq0Var;
    }

    public static boolean a(kdj0 kdj0Var, String str, String str2) {
        List<ndj0> list = kdj0Var.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (ndj0 ndj0Var : list) {
            if (jl40.l(ndj0Var.a, str) && (str2.length() == 0 || jl40.l(ndj0Var.b, str2))) {
                return true;
            }
        }
        return false;
    }

    public final void b(kdj0 kdj0Var, boolean z) {
        if (jl40.l(this.f, kdj0Var)) {
            return;
        }
        this.f = kdj0Var;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList e = e(kdj0Var.b);
        BubbleAvailability bubbleAvailability = kdj0Var.b.f;
        BubbleAvailability bubbleAvailability2 = BubbleAvailability.AVAILABLE;
        if (bubbleAvailability == bubbleAvailability2) {
            if (a(kdj0Var, "__delivery_explicit_comment__", "")) {
                arrayList.add(d("__delivery_explicit_comment__", ""));
            } else {
                arrayList2.add(d("__delivery_explicit_comment__", ""));
            }
        }
        if (kdj0Var.b.g == bubbleAvailability2) {
            if (a(kdj0Var, "__pay_on_delivery__", "")) {
                arrayList.add(d("__pay_on_delivery__", ""));
            } else {
                arrayList2.add(d("__pay_on_delivery__", ""));
            }
        }
        if (kdj0Var.b.i == bubbleAvailability2) {
            if (a(kdj0Var, "__delivery_paid_insurance__", "")) {
                arrayList.add(d("__delivery_paid_insurance__", ""));
            } else {
                arrayList2.add(d("__delivery_paid_insurance__", ""));
            }
        }
        for (Pair pair : kdj0Var.b.a) {
            if (!((List) pair.f()).isEmpty()) {
                for (String str : (List) pair.f()) {
                    if (a(kdj0Var, (String) pair.c(), str)) {
                        arrayList.add(d((String) pair.c(), str));
                    } else {
                        arrayList2.add(d((String) pair.c(), str));
                    }
                }
            } else if (a(kdj0Var, (String) pair.c(), "")) {
                arrayList.add(d((String) pair.c(), ""));
            } else {
                arrayList2.add(d((String) pair.c(), ""));
            }
        }
        int size = arrayList2.size() + arrayList.size() + e.size();
        xcv0 xcv0Var = this.a;
        List list = kdj0Var.a;
        boolean z2 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (jl40.l(((ndj0) it.next()).a, "__REMOVE_ALL_UNSUPPORTED__")) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        HashMap q = tse0.q(xcv0Var);
        q.put("requirement_num", Integer.valueOf(size));
        q.put("unknown_requirement", Boolean.valueOf(z2));
        q.put("unavailable_requirement_list", e);
        q.put("shown_available_requirement_list", arrayList);
        q.put("non_shown_available_requirement_list", arrayList2);
        q.put("collapsed", Boolean.valueOf(z));
        xcv0Var.a.a("Summary.Requirements.BubbleShown", q, 2, new HashMap());
    }

    public final void c(ndj0 ndj0Var, RequirementBubbleAction requirementBubbleAction) {
        SummaryAnalytics$RequirementBubbleAction summaryAnalytics$RequirementBubbleAction;
        String d = d(ndj0Var.a, ndj0Var.b);
        switch (zij0.a[requirementBubbleAction.ordinal()]) {
            case 1:
                summaryAnalytics$RequirementBubbleAction = SummaryAnalytics$RequirementBubbleAction.Close;
                break;
            case 2:
                summaryAnalytics$RequirementBubbleAction = SummaryAnalytics$RequirementBubbleAction.Preorder;
                break;
            case 3:
                summaryAnalytics$RequirementBubbleAction = SummaryAnalytics$RequirementBubbleAction.Edit;
                break;
            case 4:
                summaryAnalytics$RequirementBubbleAction = SummaryAnalytics$RequirementBubbleAction.Remove;
                break;
            case 5:
                summaryAnalytics$RequirementBubbleAction = SummaryAnalytics$RequirementBubbleAction.CompoundOptions;
                break;
            case 6:
                summaryAnalytics$RequirementBubbleAction = SummaryAnalytics$RequirementBubbleAction.Edit;
                break;
            case 7:
                summaryAnalytics$RequirementBubbleAction = SummaryAnalytics$RequirementBubbleAction.Edit;
                break;
            default:
                w511.b();
                return;
        }
        xcv0 xcv0Var = this.a;
        HashMap m = nnm.m(xcv0Var, "requirement_name", d);
        m.put("action", summaryAnalytics$RequirementBubbleAction.getEventValue());
        xcv0Var.a.a("Summary.Requirements.BubbleTapped", m, 2, new HashMap());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public final String d(String str, String str2) {
        kf70 kf70Var;
        Object obj;
        int indexOf;
        kf70 g0;
        Object obj2;
        ejj0 p;
        switch (str.hashCode()) {
            case -1932536996:
                if (str.equals("__REMOVE_ALL_UNSUPPORTED__")) {
                    return "__all_unsupported__";
                }
                break;
            case -1493878731:
                if (str.equals("__MULTICLASS_UNSUPPORTED__")) {
                    return "__multiclass_unsupported__";
                }
                break;
            case -611872686:
                if (str.equals("__delivery_paid_insurance__")) {
                    return "paid_insurance";
                }
                break;
            case 2131255543:
                if (str.equals("alt_choice")) {
                    return g8e.o("alternative_requirement_option:", str2);
                }
                break;
        }
        if (str2.length() != 0) {
            Iterator it = this.c.a.x.iterator();
            while (true) {
                kf70Var = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (jl40.l(((b580) obj).a, str)) {
                    }
                } else {
                    obj = null;
                }
            }
            b580 b580Var = (b580) obj;
            if (b580Var != null && (indexOf = b580Var.e.indexOf(str2)) >= 0) {
                rf70 b = b580Var.b();
                nf70 nf70Var = b instanceof nf70 ? (nf70) b : null;
                if (nf70Var != null) {
                    int i = 7;
                    rf70 rf70Var = (rf70) b.j(new yw01(new t5r(new i73(2, new h73(1, nf70Var.a)), true, new mj1(new jj20(indexOf), i)), new hlq0(i)));
                    if (rf70Var != null) {
                        g0 = q5z.g0(rf70Var);
                    }
                }
                g0 = q5z.g0(b580Var.b());
            } else {
                g0 = null;
            }
            if (g0 == null) {
                pex0 m = ((k) this.e).m();
                if (m != null) {
                    List list = (List) ((tlw) this.d.a.b()).b.get(m.b);
                    if (list != null && list.contains(str)) {
                        Iterator it2 = m.f().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                if (jl40.l(((lmw0) obj2).getName(), str)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        jmw0 jmw0Var = obj2 instanceof jmw0 ? (jmw0) obj2 : null;
                        if (jmw0Var != null && (p = jmw0Var.p(str2)) != null) {
                            kf70Var = p.l;
                        }
                    }
                }
                if (kf70Var != null) {
                    g0 = kf70Var;
                }
            }
            return str + "/" + q5z.j0(g0);
        }
        return str;
    }

    public final ArrayList e(bdj0 bdj0Var) {
        ArrayList arrayList = new ArrayList();
        if (bdj0Var.b()) {
            arrayList.add("__preorder__");
        }
        if (bdj0Var.a()) {
            arrayList.add("__order_for_other__");
        }
        BubbleAvailability bubbleAvailability = bdj0Var.f;
        BubbleAvailability bubbleAvailability2 = BubbleAvailability.UNAVAILABLE;
        if (bubbleAvailability == bubbleAvailability2) {
            arrayList.add("__delivery_explicit_comment__");
        }
        if (bdj0Var.g == bubbleAvailability2) {
            arrayList.add("__pay_on_delivery__");
        }
        for (Pair pair : bdj0Var.b) {
            if (((List) pair.f()).isEmpty()) {
                arrayList.add(d((String) pair.c(), ""));
            } else {
                Iterator it = ((List) pair.f()).iterator();
                while (it.hasNext()) {
                    arrayList.add(d((String) pair.c(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }
}
