package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.a;

/* loaded from: classes8.dex */
public final class asd implements h4j0 {
    public final List a;
    public final i3y b = a.a(new vrd(this, 0));
    public final i3y c = a.a(new vrd(this, 1));
    public final i3y d = a.a(new vrd(this, 2));
    public final i3y e = a.a(new vrd(this, 3));
    public final i3y f = a.a(new vrd(this, 4));
    public final i3y g = a.a(new vrd(this, 5));

    public asd(h4j0... h4j0VarArr) {
        this.a = scc.g(Arrays.copyOf(h4j0VarArr, h4j0VarArr.length));
    }

    @Override // defpackage.h4j0
    public final pcj b() {
        return new ka20(1, this);
    }

    @Override // defpackage.h4j0
    public final w8o c() {
        return new wrd(this);
    }

    @Override // defpackage.h4j0
    public final uhl0 d() {
        return new yrd(this);
    }

    @Override // defpackage.h4j0
    public final b3u0 e() {
        return new va20(1, this);
    }

    @Override // defpackage.h4j0
    public final zhl0 f() {
        return new zrd(this);
    }

    @Override // defpackage.h4j0
    public final rgo getEventReporter() {
        return new xrd(this);
    }
}
