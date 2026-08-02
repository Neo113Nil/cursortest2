package androidx.room;

import androidx.room.RoomDatabase;
import defpackage.ate0;
import defpackage.e5e;
import defpackage.ewk0;
import defpackage.fwk0;
import defpackage.h0w;
import defpackage.hkw0;
import defpackage.kkw0;
import defpackage.lkw0;
import defpackage.ny61;
import defpackage.p2l;
import defpackage.pll0;
import defpackage.qc20;
import defpackage.vnh;
import defpackage.wls;
import defpackage.zpb1;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class i extends b {
    public final c c;
    public final p2l d;
    public final List e;
    public final e5e f;
    public final lkw0 g;
    public hkw0 h;

    public i(c cVar, p2l p2lVar, wls wlsVar) {
        int i;
        e5e b;
        RoomDatabase.JournalMode journalMode = cVar.g;
        kkw0 kkw0Var = cVar.c;
        String str = cVar.b;
        pll0 pll0Var = cVar.u;
        this.c = cVar;
        this.d = p2lVar;
        List list = cVar.e;
        this.e = list == null ? EmptyList.a : list;
        if (pll0Var != null) {
            this.g = null;
            if (pll0Var.m()) {
                b = new androidx.room.coroutines.d(new h0w(this, pll0Var), str == null ? ":memory:" : str, wlsVar);
            } else if (str == null) {
                b = zpb1.c(new h0w(this, pll0Var));
            } else {
                h0w h0wVar = new h0w(this, pll0Var);
                int[] iArr = a.a;
                int i2 = iArr[journalMode.ordinal()];
                if (i2 == 1) {
                    i = 1;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + journalMode + '\'').toString());
                    }
                    i = 4;
                }
                int i3 = iArr[journalMode.ordinal()];
                if (i3 != 1 && i3 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + journalMode + '\'').toString());
                }
                b = zpb1.b(h0wVar, str, i);
            }
            this.f = b;
        } else {
            if (kkw0Var == null) {
                ny61.g("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            lkw0 a = kkw0Var.a(new vnh(cVar.a, cVar.b, new fwk0(this, p2lVar.a), false, false));
            this.g = a;
            this.f = new androidx.room.coroutines.d(new qc20(a), str == null ? ":memory:" : str, wlsVar);
        }
        boolean z = journalMode == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
        lkw0 lkw0Var = this.g;
        if (lkw0Var != null) {
            lkw0Var.setWriteAheadLoggingEnabled(z);
        }
    }

    @Override // androidx.room.b
    public final List c() {
        return this.e;
    }

    @Override // androidx.room.b
    public final c d() {
        return this.c;
    }

    @Override // androidx.room.b
    public final p2l e() {
        return this.d;
    }

    public i(c cVar, ate0 ate0Var, wls wlsVar) {
        RoomDatabase.JournalMode journalMode = cVar.g;
        this.c = cVar;
        this.d = new ewk0();
        List list = cVar.e;
        EmptyList emptyList = EmptyList.a;
        this.e = list == null ? emptyList : list;
        c cVar2 = new c(cVar.a, cVar.b, cVar.c, cVar.d, kotlin.collections.a.o0(list == null ? emptyList : list, new h(new ate0(7, this))), cVar.f, journalMode, cVar.h, cVar.i, cVar.j, cVar.k, cVar.l, cVar.m, cVar.n, cVar.o, cVar.p, cVar.q, cVar.r, cVar.s, cVar.t, cVar.u, cVar.v);
        cVar2.w = cVar.w;
        lkw0 A0 = ((RoomDatabase) ate0Var.b).A0(cVar2);
        this.g = A0;
        qc20 qc20Var = new qc20(A0);
        String str = cVar.b;
        this.f = new androidx.room.coroutines.d(qc20Var, str == null ? ":memory:" : str, wlsVar);
        boolean z = journalMode == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
        if (A0 != null) {
            A0.setWriteAheadLoggingEnabled(z);
        }
    }
}
