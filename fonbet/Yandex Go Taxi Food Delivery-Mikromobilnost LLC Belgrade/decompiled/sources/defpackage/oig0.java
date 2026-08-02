package defpackage;

import com.yandex.go.quark.impl.data.QuarkLockLCPListener$onLargestContentfulPaint$$inlined$collectIn$1;

/* loaded from: classes8.dex */
public final class oig0 implements lz60 {
    public final tse a;
    public final zgg0 b;
    public final vgg0 c;

    public oig0(tse tseVar, zgg0 zgg0Var, vgg0 vgg0Var) {
        this.a = tseVar;
        this.b = zgg0Var;
        this.c = vgg0Var;
    }

    @Override // defpackage.lz60
    public final void g() {
        tje.N(this.a, null, null, new QuarkLockLCPListener$onLargestContentfulPaint$$inlined$collectIn$1(this.c.a.b.a(), null, this), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "QuarkLockLCPListener";
    }
}
