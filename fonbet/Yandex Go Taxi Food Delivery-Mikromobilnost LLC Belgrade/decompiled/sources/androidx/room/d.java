package androidx.room;

import android.content.Intent;
import defpackage.aww;
import defpackage.fzw;
import defpackage.i2v;
import defpackage.ppr;
import defpackage.rol0;
import defpackage.tpr;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class d {
    public final RoomDatabase a;
    public final String[] b;
    public final o c;
    public final LinkedHashMap d;
    public final ReentrantLock e;
    public final i2v f;
    public final aww g;
    public Intent h;
    public f i;
    public final Object j;

    public d(RoomDatabase roomDatabase, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.a = roomDatabase;
        this.b = strArr;
        o oVar = new o(roomDatabase, hashMap, hashMap2, strArr, roomDatabase.k, new InvalidationTracker$implementation$1(1, this, d.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0));
        this.c = oVar;
        this.d = new LinkedHashMap();
        this.e = new ReentrantLock();
        this.f = new i2v(this);
        this.g = new aww(this);
        Collections.newSetFromMap(new IdentityHashMap());
        this.j = new Object();
        oVar.k = new ppr(16, this);
    }

    public final tpr a(String[] strArr) {
        o oVar = this.c;
        Pair g = oVar.g(strArr);
        String[] strArr2 = (String[]) g.getFirst();
        rol0 rol0Var = new rol0(new TriggerBasedInvalidationTracker$createFlow$1(oVar, (int[]) g.getSecond(), true, strArr2, null));
        f fVar = this.i;
        fzw a = fVar != null ? fVar.a(strArr2) : null;
        return a != null ? kotlinx.coroutines.flow.e.K(rol0Var, a) : rol0Var;
    }
}
