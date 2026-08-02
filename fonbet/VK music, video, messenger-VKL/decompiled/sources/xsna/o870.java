package xsna;

import com.vk.notifications.list.impl.presentation.model.common.ListNextState;
import com.vk.notifications.list.impl.presentation.model.common.NotificationPageState;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: NotificationCategoryState.kt */
/* loaded from: classes4.dex */
public final class o870 {
    public final int a;
    public final ListNextState b;
    public final NotificationPageState c;
    public final List<kb70> d;
    public final String e;
    public final Integer f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public o870() {
        this(0);
    }

    public static o870 a(o870 o870Var, int i, ListNextState listNextState, NotificationPageState notificationPageState, List list, String str, Integer num, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        if ((i2 & 1) != 0) {
            i = o870Var.a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            listNextState = o870Var.b;
        }
        ListNextState listNextState2 = listNextState;
        if ((i2 & 4) != 0) {
            notificationPageState = o870Var.c;
        }
        NotificationPageState notificationPageState2 = notificationPageState;
        if ((i2 & 8) != 0) {
            list = o870Var.d;
        }
        List list2 = list;
        String str2 = (i2 & 16) != 0 ? o870Var.e : str;
        Integer num2 = (i2 & 32) != 0 ? o870Var.f : num;
        boolean z5 = (i2 & 64) != 0 ? o870Var.g : z;
        boolean z6 = (i2 & 128) != 0 ? o870Var.h : z2;
        boolean z7 = (i2 & 256) != 0 ? o870Var.i : z3;
        boolean z8 = (i2 & 512) != 0 ? o870Var.j : z4;
        o870Var.getClass();
        return new o870(i3, listNextState2, notificationPageState2, list2, str2, num2, z5, z6, z7, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o870)) {
            return false;
        }
        o870 o870Var = (o870) obj;
        return this.a == o870Var.a && this.b == o870Var.b && this.c == o870Var.c && epx.f(this.d, o870Var.d) && epx.f(this.e, o870Var.e) && epx.f(this.f, o870Var.f) && this.g == o870Var.g && this.h == o870Var.h && this.i == o870Var.i && this.j == o870Var.j;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        ListNextState listNextState = this.b;
        int a = fw3.a((this.c.hashCode() + ((hashCode + (listNextState == null ? 0 : listNextState.hashCode())) * 31)) * 31, 31, this.d);
        String str = this.e;
        int hashCode2 = (a + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f;
        return Boolean.hashCode(this.j) + qoy.b(qoy.b(qoy.b((hashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationCategoryState(lastViewed=");
        sb.append(this.a);
        sb.append(", nextState=");
        sb.append(this.b);
        sb.append(", pageState=");
        sb.append(this.c);
        sb.append(", items=");
        sb.append(this.d);
        sb.append(", nextFrom=");
        sb.append(this.e);
        sb.append(", lastReloadServerTime=");
        sb.append(this.f);
        sb.append(", isBackgroundLoading=");
        sb.append(this.g);
        sb.append(", isScrollOnTop=");
        sb.append(this.h);
        sb.append(", hasGroupedNotifications=");
        sb.append(this.i);
        sb.append(", hasNewNotifications=");
        return defpackage.q0.a(sb, this.j, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o870(int i, ListNextState listNextState, NotificationPageState notificationPageState, List<? extends kb70> list, String str, Integer num, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = i;
        this.b = listNextState;
        this.c = notificationPageState;
        this.d = list;
        this.e = str;
        this.f = num;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
    }

    public o870(int i) {
        this(Integer.MAX_VALUE, null, NotificationPageState.LOADING, EmptyList.b, null, null, false, false, false, false);
    }
}
