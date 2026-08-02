package xsna;

import java.util.ArrayList;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ocz0 extends xey0 {
    public final u6z0 U;
    public b V;
    public c W;
    public d X;
    public ArrayList Y;
    public ipy0 Z;
    public ArrayList a0;
    public njw b0;
    public final b2z0 c0;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a extends xey0 {
        public String U;
        public String V;
        public String W;
        public String X;
        public String Y;

        @Override // xsna.xey0
        public final String b() {
            return this.X;
        }

        @Override // xsna.xey0
        public final void m(String str) {
            this.V = str;
        }

        @Override // xsna.xey0
        public final String o() {
            return this.V;
        }

        @Override // xsna.xey0
        public final void p(String str) {
            this.X = str;
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class b extends xey0 {
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class c extends xey0 {
        public final String U;
        public final String V;

        public c(String str, String str2) {
            this.U = str;
            this.V = str2;
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class d extends xey0 {
        public final String U;
        public final String V;
        public final int W;
        public final int X;
        public final ArrayList Y;

        public d(String str, String str2, int i, int i2, ArrayList arrayList) {
            this.U = str;
            this.V = str2;
            this.W = i;
            this.X = i2;
            this.Y = arrayList;
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class e {
        public final String a;
        public final int b;
        public final int c;
        public final String d;

        public e(String str, int i, int i2, String str2) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = str2;
        }
    }

    public ocz0(u6z0 u6z0Var, giy0 giy0Var, b2z0 b2z0Var) {
        super(giy0Var, null, u6z0Var.k);
        this.a0 = null;
        this.b0 = null;
        this.U = u6z0Var;
        this.c0 = b2z0Var;
    }
}
