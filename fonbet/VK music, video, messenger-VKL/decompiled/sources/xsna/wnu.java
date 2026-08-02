package xsna;

import com.vk.notifications.list.impl.presentation.model.common.ListNextState;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.tlo0;
import xsna.xh70;

/* compiled from: GroupedNotificationListState.kt */
/* loaded from: classes4.dex */
public final class wnu implements km50 {
    public final tlo0 b;
    public final boolean c;
    public final int d;
    public final ListNextState e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final List<kb70> i;
    public final int j;
    public final xh70 k;
    public final umu l;
    public final String m;
    public final Integer n;
    public final boolean o;

    public wnu() {
        this(0);
    }

    public static wnu a(wnu wnuVar, tlo0.h hVar, int i, ListNextState listNextState, boolean z, boolean z2, boolean z3, List list, int i2, xh70 xh70Var, umu umuVar, String str, Integer num, boolean z4, int i3) {
        tlo0 tlo0Var = (i3 & 1) != 0 ? wnuVar.b : hVar;
        boolean z5 = (i3 & 2) != 0 ? wnuVar.c : true;
        int i4 = (i3 & 4) != 0 ? wnuVar.d : i;
        ListNextState listNextState2 = (i3 & 8) != 0 ? wnuVar.e : listNextState;
        boolean z6 = (i3 & 16) != 0 ? wnuVar.f : z;
        boolean z7 = (i3 & 32) != 0 ? wnuVar.g : z2;
        boolean z8 = (i3 & 64) != 0 ? wnuVar.h : z3;
        List list2 = (i3 & 128) != 0 ? wnuVar.i : list;
        int i5 = (i3 & 256) != 0 ? wnuVar.j : i2;
        xh70 xh70Var2 = (i3 & 512) != 0 ? wnuVar.k : xh70Var;
        umu umuVar2 = (i3 & 1024) != 0 ? wnuVar.l : umuVar;
        String str2 = (i3 & 2048) != 0 ? wnuVar.m : str;
        Integer num2 = (i3 & 4096) != 0 ? wnuVar.n : num;
        boolean z9 = (i3 & 8192) != 0 ? wnuVar.o : z4;
        wnuVar.getClass();
        return new wnu(tlo0Var, z5, i4, listNextState2, z6, z7, z8, list2, i5, xh70Var2, umuVar2, str2, num2, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnu)) {
            return false;
        }
        wnu wnuVar = (wnu) obj;
        return epx.f(this.b, wnuVar.b) && this.c == wnuVar.c && this.d == wnuVar.d && this.e == wnuVar.e && this.f == wnuVar.f && this.g == wnuVar.g && this.h == wnuVar.h && epx.f(this.i, wnuVar.i) && this.j == wnuVar.j && epx.f(this.k, wnuVar.k) && epx.f(this.l, wnuVar.l) && epx.f(this.m, wnuVar.m) && epx.f(this.n, wnuVar.n) && this.o == wnuVar.o;
    }

    public final int hashCode() {
        tlo0 tlo0Var = this.b;
        int a = shy.a(this.d, qoy.b((tlo0Var == null ? 0 : tlo0Var.hashCode()) * 31, 31, this.c), 31);
        ListNextState listNextState = this.e;
        int hashCode = (this.k.hashCode() + shy.a(this.j, fw3.a(qoy.b(qoy.b(qoy.b((a + (listNextState == null ? 0 : listNextState.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31)) * 31;
        umu umuVar = this.l;
        int hashCode2 = (hashCode + (umuVar == null ? 0 : umuVar.hashCode())) * 31;
        String str = this.m;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.n;
        return Boolean.hashCode(this.o) + ((hashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedNotificationListState(title=");
        sb.append(this.b);
        sb.append(", settingEnabled=");
        sb.append(this.c);
        sb.append(", lastViewed=");
        sb.append(this.d);
        sb.append(", nextState=");
        sb.append(this.e);
        sb.append(", isLoading=");
        sb.append(this.f);
        sb.append(", isRefreshing=");
        sb.append(this.g);
        sb.append(", isError=");
        sb.append(this.h);
        sb.append(", items=");
        sb.append(this.i);
        sb.append(", snackbarKey=");
        sb.append(this.j);
        sb.append(", snackbarType=");
        sb.append(this.k);
        sb.append(", alert=");
        sb.append(this.l);
        sb.append(", nextFrom=");
        sb.append(this.m);
        sb.append(", lastReloadServerTime=");
        sb.append(this.n);
        sb.append(", isBackgroundLoading=");
        return defpackage.q0.a(sb, this.o, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wnu(tlo0 tlo0Var, boolean z, int i, ListNextState listNextState, boolean z2, boolean z3, boolean z4, List<? extends kb70> list, int i2, xh70 xh70Var, umu umuVar, String str, Integer num, boolean z5) {
        this.b = tlo0Var;
        this.c = z;
        this.d = i;
        this.e = listNextState;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = list;
        this.j = i2;
        this.k = xh70Var;
        this.l = umuVar;
        this.m = str;
        this.n = num;
        this.o = z5;
    }

    public wnu(int i) {
        this(null, false, Integer.MAX_VALUE, null, false, false, false, EmptyList.b, 0, xh70.b.a, null, null, null, false);
    }
}
