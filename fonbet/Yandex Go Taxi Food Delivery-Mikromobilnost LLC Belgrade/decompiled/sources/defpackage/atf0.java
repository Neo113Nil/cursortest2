package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Latf0;", "Llwj0;", "Companion", "ysf0", "zsf0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class atf0 extends lwj0 {
    public static final zsf0 Companion = new zsf0();
    public static final i3y[] h;
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final zn11 g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{a.b(lazyThreadSafetyMode, new pmf0(12)), a.b(lazyThreadSafetyMode, new pmf0(13)), a.b(lazyThreadSafetyMode, new pmf0(14)), a.b(lazyThreadSafetyMode, new pmf0(15)), a.b(lazyThreadSafetyMode, new pmf0(16)), a.b(lazyThreadSafetyMode, new pmf0(17)), null};
    }

    public /* synthetic */ atf0(int i, List list, List list2, List list3, List list4, List list5, List list6, zn11 zn11Var) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = emptyList;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = emptyList;
        } else {
            this.c = list3;
        }
        if ((i & 8) == 0) {
            this.d = emptyList;
        } else {
            this.d = list4;
        }
        if ((i & 16) == 0) {
            this.e = emptyList;
        } else {
            this.e = list5;
        }
        if ((i & 32) == 0) {
            this.f = emptyList;
        } else {
            this.f = list6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = zn11Var;
        }
    }

    @Override // defpackage.lwj0
    /* renamed from: e, reason: from getter */
    public final zn11 getY() {
        return this.g;
    }

    public atf0() {
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = emptyList;
        this.c = emptyList;
        this.d = emptyList;
        this.e = emptyList;
        this.f = emptyList;
        this.g = null;
    }
}
