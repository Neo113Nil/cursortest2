package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes11.dex */
public final /* synthetic */ class kza1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kpr0 b;

    public /* synthetic */ kza1(kpr0 kpr0Var, int i) {
        this.a = i;
        this.b = kpr0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
        }
        return this.b.a();
    }
}
