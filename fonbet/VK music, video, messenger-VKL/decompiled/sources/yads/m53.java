package yads;

import xsna.emb;

/* loaded from: classes10.dex */
public final class m53 implements er2 {
    @Override // yads.er2
    public final Object a(xq2 xq2Var) {
        byte[] bArr = xq2Var.b.a;
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, u01.a(xq2Var.c));
        } catch (Exception unused) {
            return new String(bArr, emb.b);
        }
    }
}
