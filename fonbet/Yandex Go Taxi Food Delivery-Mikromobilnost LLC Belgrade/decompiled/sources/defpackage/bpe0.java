package defpackage;

import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class bpe0 {
    public final cne0 a;
    public final r0 b;
    public final r0 c;

    public bpe0(dne0 dne0Var) {
        cne0 a = dne0Var.a("com.yandex.go.preload.PreloadRepository");
        this.a = a;
        boolean f = a.f("completed");
        r0 c = bvf0.c(new ape0(f, f, 2));
        this.b = c;
        this.c = c;
    }
}
