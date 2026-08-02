package defpackage;

import com.yandex.go.shortcuts.dto.request.Counters;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class o5t {
    public final n170 a;
    public final c1f b;

    public o5t(n170 n170Var, c1f c1fVar) {
        this.a = n170Var;
        this.b = c1fVar;
    }

    public final Counters a() {
        return new Counters(a.m0(a.J0((CopyOnWriteArraySet) this.b.c), a.J0((CopyOnWriteArraySet) this.a.c)));
    }
}
