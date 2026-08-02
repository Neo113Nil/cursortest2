package xsna;

import com.vk.superapp.api.dto.configurations.ShowcaseConfiguration;
import com.vk.superapp.api.dto.menu.QueueParams;
import com.vk.superapp.api.dto.menu.UpdateOptions;
import com.vk.superapp.api.dto.widgets.InvalidWidgetInfo;
import com.vk.superapp.ui.uniwidgets.WidgetObjects;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.api.StubTiles;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: SuperAppMenuResponse.kt */
/* loaded from: classes6.dex */
public final class q9n0 {
    public final ArrayList a;
    public final List<InvalidWidgetInfo> b;
    public final Set<String> c;
    public final WidgetObjects d;
    public final UpdateOptions e;
    public final QueueParams f;
    public final StubTiles g;
    public final Integer h;
    public final Integer i;
    public final String j;
    public final String k;
    public final List<ShowcaseConfiguration> l;

    public q9n0(ArrayList arrayList, List list, Set set, WidgetObjects widgetObjects, UpdateOptions updateOptions, QueueParams queueParams, StubTiles stubTiles, Integer num, Integer num2, String str, String str2, List list2) {
        this.a = arrayList;
        this.b = list;
        this.c = set;
        this.d = widgetObjects;
        this.e = updateOptions;
        this.f = queueParams;
        this.g = stubTiles;
        this.h = num;
        this.i = num2;
        this.j = str;
        this.k = str2;
        this.l = list2;
    }

    public static q9n0 a(q9n0 q9n0Var, ArrayList arrayList) {
        List<InvalidWidgetInfo> list = q9n0Var.b;
        Set<String> set = q9n0Var.c;
        WidgetObjects widgetObjects = q9n0Var.d;
        UpdateOptions updateOptions = q9n0Var.e;
        QueueParams queueParams = q9n0Var.f;
        StubTiles stubTiles = q9n0Var.g;
        Integer num = q9n0Var.h;
        Integer num2 = q9n0Var.i;
        String str = q9n0Var.j;
        String str2 = q9n0Var.k;
        List<ShowcaseConfiguration> list2 = q9n0Var.l;
        q9n0Var.getClass();
        return new q9n0(arrayList, list, set, widgetObjects, updateOptions, queueParams, stubTiles, num, num2, str, str2, list2);
    }

    public final List<ShowcaseConfiguration> b() {
        return this.l;
    }

    public final List<InvalidWidgetInfo> c() {
        return this.b;
    }

    public final Integer d() {
        return this.i;
    }

    public final WidgetObjects e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9n0)) {
            return false;
        }
        q9n0 q9n0Var = (q9n0) obj;
        return this.a.equals(q9n0Var.a) && epx.f(this.b, q9n0Var.b) && epx.f(this.c, q9n0Var.c) && epx.f(this.d, q9n0Var.d) && epx.f(this.e, q9n0Var.e) && epx.f(this.f, q9n0Var.f) && epx.f(this.g, q9n0Var.g) && epx.f(this.h, q9n0Var.h) && epx.f(this.i, q9n0Var.i) && epx.f(this.j, q9n0Var.j) && epx.f(this.k, q9n0Var.k) && epx.f(this.l, q9n0Var.l);
    }

    public final String f() {
        return this.j;
    }

    public final Set<String> g() {
        return this.c;
    }

    public final QueueParams h() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + fw3.b(fw3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31;
        StubTiles stubTiles = this.g;
        int hashCode2 = (hashCode + (stubTiles == null ? 0 : stubTiles.hashCode())) * 31;
        Integer num = this.h;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.i;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.j;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ShowcaseConfiguration> list = this.l;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final Integer i() {
        return this.h;
    }

    public final StubTiles j() {
        return this.g;
    }

    public final String k() {
        return this.k;
    }

    public final UpdateOptions l() {
        return this.e;
    }

    public final List<SuperAppWidget> m() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppMenuResponse(widgets=");
        sb.append(this.a);
        sb.append(", invalidWidgets=");
        sb.append(this.b);
        sb.append(", promoWidgetIds=");
        sb.append(this.c);
        sb.append(", objects=");
        sb.append(this.d);
        sb.append(", updateOptions=");
        sb.append(this.e);
        sb.append(", queueParams=");
        sb.append(this.f);
        sb.append(", stubTiles=");
        sb.append(this.g);
        sb.append(", sessionId=");
        sb.append(this.h);
        sb.append(", nextOffset=");
        sb.append(this.i);
        sb.append(", paginationMeta=");
        sb.append(this.j);
        sb.append(", trackCode=");
        sb.append(this.k);
        sb.append(", configurations=");
        return ms9.a(')', sb, this.l);
    }
}
