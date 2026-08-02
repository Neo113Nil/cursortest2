package defpackage;

/* loaded from: classes9.dex */
public interface j1u extends ylt0 {
    default Integer f(int i) {
        int u;
        int i2;
        int u2 = u(i);
        int l = l(i);
        int o = o(i);
        while (true) {
            i++;
            if (i >= getItemCount() || (u = u(i)) > (i2 = u2 + 1)) {
                return null;
            }
            int l2 = l(i);
            int o2 = o(i);
            if (u == i2 && l2 <= l && l + o <= l2 + o2) {
                return Integer.valueOf(i);
            }
        }
    }

    int getItemCount();

    default Integer h(int i) {
        int u;
        int i2;
        int u2 = u(i);
        int l = l(i);
        int o = o(i);
        while (true) {
            i--;
            if (i < 0 || (u = u(i)) < u2 - 1) {
                return null;
            }
            int l2 = l(i);
            int o2 = o(i);
            if (u == i2 && l2 <= l && l + o <= l2 + o2) {
                return Integer.valueOf(i);
            }
        }
    }

    int l(int i);

    int u(int i);
}
