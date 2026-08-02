package defpackage;

/* loaded from: classes6.dex */
public final class ljz0 {
    public static u22 a(sf20 sf20Var) {
        if (sf20Var instanceof hf20) {
            hf20 hf20Var = (hf20) sf20Var;
            String str = hf20Var.b;
            q0d0 q0d0Var = hf20Var.c;
            return new bo4(str, q0d0Var != null ? q0d0Var : null, hf20Var.f.a.toString());
        }
        if (sf20Var instanceof jf20) {
            jf20 jf20Var = (jf20) sf20Var;
            String str2 = jf20Var.b;
            q0d0 q0d0Var2 = jf20Var.c;
            return new ez6(str2, q0d0Var2 != null ? q0d0Var2 : null);
        }
        if (sf20Var instanceof nf20) {
            nf20 nf20Var = (nf20) sf20Var;
            String str3 = nf20Var.b;
            q0d0 q0d0Var3 = nf20Var.c;
            return new d4v(str3, q0d0Var3 != null ? q0d0Var3 : null);
        }
        if (sf20Var instanceof uf20) {
            String str4 = ((uf20) sf20Var).b;
            q0d0 q0d0Var4 = sf20Var.a;
            return new lkt0(str4, q0d0Var4 != null ? q0d0Var4 : null);
        }
        if (sf20Var instanceof xf20) {
            xf20 xf20Var = (xf20) sf20Var;
            String str5 = xf20Var.b;
            q0d0 q0d0Var5 = xf20Var.c;
            return new ryw0(str5, q0d0Var5 != null ? q0d0Var5 : null);
        }
        if (!(sf20Var instanceof zf20)) {
            w511.b();
            return null;
        }
        zf20 zf20Var = (zf20) sf20Var;
        String str6 = zf20Var.b;
        q0d0 q0d0Var6 = zf20Var.c;
        return new ujy0(str6, q0d0Var6 != null ? q0d0Var6 : null, zf20Var.f.a.toString());
    }
}
