package xsna;

import com.facebook.soloader.MinElf;
import com.vk.contacts.ContactSyncState;
import com.vk.im.ui.components.contacts.SortOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ContactsListState.kt */
/* loaded from: classes2.dex */
public final class sbj {
    public final ContactSyncState a;
    public final long b;
    public final long c;
    public final List<? extends qtd0> d;
    public final List<? extends qtd0> e;
    public final List<? extends qtd0> f;
    public final List<? extends qtd0> g;
    public final List<? extends qtd0> h;
    public final List<? extends qtd0> i;
    public final List<k2i0> j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final int n;
    public final int o;
    public final SortOrder p;

    public sbj() {
        this(null, 0L, 0L, null, null, null, null, null, false, false, false, 0, 0, null, MinElf.PN_XNUM);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static sbj a(sbj sbjVar, ContactSyncState contactSyncState, List list, List list2, List list3, ArrayList arrayList, boolean z, SortOrder sortOrder, int i) {
        ContactSyncState contactSyncState2 = (i & 1) != 0 ? sbjVar.a : contactSyncState;
        long j = sbjVar.b;
        long j2 = sbjVar.c;
        List list4 = (i & 8) != 0 ? sbjVar.d : list;
        List<? extends qtd0> list5 = sbjVar.e;
        List<? extends qtd0> list6 = sbjVar.f;
        List list7 = (i & 64) != 0 ? sbjVar.g : list2;
        List list8 = (i & 128) != 0 ? sbjVar.h : list3;
        List list9 = (i & 256) != 0 ? sbjVar.i : arrayList;
        List<k2i0> list10 = sbjVar.j;
        boolean z2 = (i & 1024) != 0 ? sbjVar.k : z;
        boolean z3 = sbjVar.l;
        boolean z4 = sbjVar.m;
        int i2 = sbjVar.n;
        int i3 = sbjVar.o;
        SortOrder sortOrder2 = (i & 32768) != 0 ? sbjVar.p : sortOrder;
        sbjVar.getClass();
        return new sbj(contactSyncState2, j, j2, list4, list5, list6, list7, list8, list9, list10, z2, z3, z4, i2, i3, sortOrder2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbj)) {
            return false;
        }
        sbj sbjVar = (sbj) obj;
        return this.a == sbjVar.a && this.b == sbjVar.b && this.c == sbjVar.c && epx.f(this.d, sbjVar.d) && epx.f(this.e, sbjVar.e) && epx.f(this.f, sbjVar.f) && epx.f(this.g, sbjVar.g) && epx.f(this.h, sbjVar.h) && epx.f(this.i, sbjVar.i) && epx.f(this.j, sbjVar.j) && this.k == sbjVar.k && this.l == sbjVar.l && this.m == sbjVar.m && this.n == sbjVar.n && this.o == sbjVar.o && this.p == sbjVar.p;
    }

    public final int hashCode() {
        return this.p.hashCode() + shy.a(this.o, shy.a(this.n, qoy.b(qoy.b(qoy.b(fw3.a(fw3.a(fw3.a(fw3.a(fw3.a(fw3.a(fw3.a(bh10.a(bh10.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31), 31);
    }

    public final String toString() {
        return "ContactsListState(syncState=" + this.a + ", permissionRequestFirstTime=" + this.b + ", permissionRequestLifeTime=" + this.c + ", hintUsers=" + this.d + ", birthdays=" + this.e + ", newUsers=" + this.f + ", recentUsers=" + this.g + ", usersFromRootConversation=" + this.h + ", usersFromGlobalSearch=" + this.i + ", eduSections=" + this.j + ", hasContactsPermission=" + this.k + ", contactListLoaded=" + this.l + ", hasNewLocalContacts=" + this.m + ", subscribersCount=" + this.n + ", friendsCount=" + this.o + ", sortOrder=" + this.p + ')';
    }

    public sbj(ContactSyncState contactSyncState, long j, long j2, List<? extends qtd0> list, List<? extends qtd0> list2, List<? extends qtd0> list3, List<? extends qtd0> list4, List<? extends qtd0> list5, List<? extends qtd0> list6, List<k2i0> list7, boolean z, boolean z2, boolean z3, int i, int i2, SortOrder sortOrder) {
        this.a = contactSyncState;
        this.b = j;
        this.c = j2;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = list4;
        this.h = list5;
        this.i = list6;
        this.j = list7;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = i;
        this.o = i2;
        this.p = sortOrder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sbj(ContactSyncState contactSyncState, long j, long j2, List list, ArrayList arrayList, List list2, List list3, List list4, boolean z, boolean z2, boolean z3, int i, int i2, SortOrder sortOrder, int i3) {
        this(r3, r1, r6, r8, r9, (i3 & 32) != 0 ? r9 : arrayList, (i3 & 64) != 0 ? r9 : list2, (i3 & 128) != 0 ? r9 : list3, r9, (i3 & 512) != 0 ? r9 : list4, (i3 & 1024) != 0 ? false : z, (i3 & 2048) != 0 ? false : z2, (i3 & 4096) != 0 ? false : z3, (i3 & 8192) != 0 ? 0 : i, (i3 & 16384) != 0 ? 0 : i2, (i3 & 32768) != 0 ? SortOrder.BY_ONLINE : sortOrder);
        ContactSyncState contactSyncState2 = (i3 & 1) != 0 ? ContactSyncState.HIDDEN : contactSyncState;
        long j3 = (i3 & 2) != 0 ? 0L : j;
        long j4 = (i3 & 4) != 0 ? 0L : j2;
        List list5 = (i3 & 8) != 0 ? EmptyList.b : list;
        EmptyList emptyList = EmptyList.b;
    }
}
