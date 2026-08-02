package xsna;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* compiled from: MovableContent.kt */
/* loaded from: classes11.dex */
public final class ic30 {
    public final fc30<Object> a;
    public final Object b;
    public final hqj c;
    public final be d;
    public final yy1 e;
    public List<? extends Pair<androidx.compose.runtime.f, ? extends Object>> f;
    public final sy90 g;
    public final List<ic30> h;

    public ic30(fc30 fc30Var, Object obj, hqj hqjVar, be beVar, yy1 yy1Var, List list, sy90 sy90Var, AbstractList abstractList) {
        this.a = fc30Var;
        this.b = obj;
        this.c = hqjVar;
        this.d = beVar;
        this.e = yy1Var;
        this.f = list;
        this.g = sy90Var;
        this.h = abstractList;
    }

    public final yy1 a() {
        return this.e;
    }

    public final fc30<Object> b() {
        return this.a;
    }

    public final List<Pair<androidx.compose.runtime.f, Object>> c() {
        return this.f;
    }

    public final Object d() {
        return this.b;
    }

    public final void e(ArrayList arrayList) {
        this.f = arrayList;
    }
}
