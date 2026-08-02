package yads;

import java.util.ArrayList;
import java.util.Comparator;
import xsna.dey0;
import xsna.mmy0;

/* loaded from: classes10.dex */
public final class f23 {
    public static final Comparator h;
    public static final Comparator i;
    public final int a;
    public int e;
    public int f;
    public int g;
    public final e23[] c = new e23[5];
    public final ArrayList b = new ArrayList();
    public int d = -1;

    static {
        int i2 = 1;
        h = new mmy0(i2);
        i = new dey0(i2);
    }

    public f23(int i2) {
        this.a = i2;
    }

    public static /* synthetic */ int a(e23 e23Var, e23 e23Var2) {
        return e23Var.a - e23Var2.a;
    }
}
