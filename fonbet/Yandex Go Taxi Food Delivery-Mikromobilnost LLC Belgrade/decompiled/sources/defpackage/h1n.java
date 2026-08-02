package defpackage;

/* loaded from: classes12.dex */
public final class h1n implements rym {
    @Override // defpackage.rym
    public final Double a(Double d, mp60 mp60Var, boolean z) {
        Object obj;
        if (d == null) {
            d = null;
            if (!mp60Var.d()) {
                Object[] objArr = mp60Var.a;
                int i = mp60Var.b;
                int i2 = 0;
                if (z) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i) {
                            i3 = -1;
                            break;
                        }
                        te7 te7Var = (te7) objArr[i3];
                        if ((te7Var.b instanceof ve7) && te7Var.c != null) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 >= 0) {
                        Double d2 = ((te7) mp60Var.b(i3)).c;
                        if (d2 == null) {
                            ny61.g("Required value was null.");
                            return null;
                        }
                        double doubleValue = d2.doubleValue();
                        Object[] objArr2 = mp60Var.a;
                        int i4 = mp60Var.b;
                        while (i2 < i4) {
                            te7 te7Var2 = (te7) objArr2[i2];
                            Double d3 = te7Var2.c;
                            xe7 xe7Var = te7Var2.b;
                            if (((xe7Var instanceof ve7) || (xe7Var instanceof ue7)) && d3 != null && d3.doubleValue() > doubleValue) {
                                doubleValue = d3.doubleValue();
                            }
                            i2++;
                        }
                        return Double.valueOf(doubleValue);
                    }
                } else {
                    while (true) {
                        if (i2 >= i) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i2];
                        if (((te7) obj).b instanceof we7) {
                            break;
                        }
                        i2++;
                    }
                    te7 te7Var3 = (te7) obj;
                    if (te7Var3 != null) {
                        return te7Var3.c;
                    }
                }
            }
        }
        return d;
    }
}
