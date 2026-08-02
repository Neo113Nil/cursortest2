package androidx.room;

import android.content.Context;
import android.content.Intent;
import androidx.room.RoomDatabase;
import defpackage.fse;
import defpackage.kkw0;
import defpackage.pll0;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c {
    public final Context a;
    public final String b;
    public final kkw0 c;
    public final RoomDatabase.b d;
    public final List e;
    public final boolean f;
    public final RoomDatabase.JournalMode g;
    public final Executor h;
    public final Executor i;
    public final Intent j;
    public final boolean k;
    public final boolean l;
    public final Set m;
    public final String n;
    public final File o;
    public final Callable p;
    public final RoomDatabase.c q;
    public final List r;
    public final List s;
    public final boolean t;
    public final pll0 u;
    public final fse v;
    public boolean w = true;

    public c(Context context, String str, kkw0 kkw0Var, RoomDatabase.b bVar, List list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set set, String str2, File file, Callable callable, RoomDatabase.c cVar, List list2, List list3, boolean z4, pll0 pll0Var, fse fseVar) {
        this.a = context;
        this.b = str;
        this.c = kkw0Var;
        this.d = bVar;
        this.e = list;
        this.f = z;
        this.g = journalMode;
        this.h = executor;
        this.i = executor2;
        this.j = intent;
        this.k = z2;
        this.l = z3;
        this.m = set;
        this.n = str2;
        this.o = file;
        this.p = callable;
        this.q = cVar;
        this.r = list2;
        this.s = list3;
        this.t = z4;
        this.u = pll0Var;
        this.v = fseVar;
    }
}
