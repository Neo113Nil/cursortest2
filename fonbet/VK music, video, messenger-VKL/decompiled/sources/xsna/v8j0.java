package xsna;

import xsna.m8j0;

/* compiled from: ShareStoryRenderView.kt */
/* loaded from: classes16.dex */
public final class v8j0 implements jjv0 {
    public final /* synthetic */ w8j0 b;

    public v8j0(w8j0 w8j0Var) {
        this.b = w8j0Var;
    }

    @Override // xsna.jjv0
    public final int n1(int i) {
        if (i == 0) {
            return 2;
        }
        w8j0 w8j0Var = this.b;
        return ((j5g.b0(i, w8j0Var.d.h) instanceof m8j0.e) || (j5g.b0(i, w8j0Var.d.h) instanceof m8j0.g)) ? 3 : 0;
    }

    @Override // xsna.jjv0
    public final int t(int i) {
        return 0;
    }
}
