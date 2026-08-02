package defpackage;

import com.bumptech.glide.load.DecodeFormat;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class e16 {
    public final li10 a;
    public final b16 b;
    public d16 c;

    public e16(li10 li10Var, b16 b16Var, DecodeFormat decodeFormat) {
        this.a = li10Var;
        this.b = b16Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(kge0... kge0VarArr) {
        b16 b16Var = this.b;
        li10 li10Var = this.a;
        d16 d16Var = this.c;
        if (d16Var != null) {
            d16Var.y = true;
        }
        int length = kge0VarArr.length;
        m2a1[] m2a1VarArr = new m2a1[length];
        if (kge0VarArr.length > 0) {
            kge0 kge0Var = kge0VarArr[0];
            throw null;
        }
        v9u v9uVar = (v9u) li10Var;
        synchronized (v9uVar) {
        }
        synchronized (v9uVar) {
        }
        b16Var.getClass();
        if (length > 0) {
            m2a1 m2a1Var = m2a1VarArr[0];
            throw null;
        }
        HashMap hashMap = new HashMap();
        if (length > 0) {
            m2a1 m2a1Var2 = m2a1VarArr[0];
            throw null;
        }
        d16 d16Var2 = new d16(b16Var, li10Var, new ao7(hashMap));
        this.c = d16Var2;
        pw21.j().post(d16Var2);
    }
}
