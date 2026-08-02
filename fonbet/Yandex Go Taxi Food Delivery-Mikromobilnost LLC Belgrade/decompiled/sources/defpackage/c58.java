package defpackage;

import ru.yandex.taxi.appdelegates.SummaryUiDelegate$TariffCardStyle;

/* loaded from: classes12.dex */
public final class c58 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public c58(zuj0 zuj0Var, mqv0 mqv0Var) {
        SummaryUiDelegate$TariffCardStyle c = mqv0Var.c();
        int[] iArr = b58.a;
        int i = iArr[c.ordinal()];
        if (i != 1 && i != 2) {
            w511.b();
            throw null;
        }
        avj0 avj0Var = (avj0) zuj0Var;
        this.a = avj0Var.c(ttg0.colorized_car_width_smart);
        int i2 = iArr[mqv0Var.c().ordinal()];
        if (i2 != 1 && i2 != 2) {
            w511.b();
            throw null;
        }
        this.b = avj0Var.c(ttg0.colorized_car_height_smart);
        int i3 = iArr[mqv0Var.c().ordinal()];
        if (i3 != 1 && i3 != 2) {
            w511.b();
            throw null;
        }
        this.c = avj0Var.c(ttg0.colorized_car_left_padding_smart);
        int i4 = iArr[mqv0Var.c().ordinal()];
        if (i4 != 1 && i4 != 2) {
            w511.b();
            throw null;
        }
        this.d = avj0Var.c(ttg0.colorized_car_top_padding_smart);
        int i5 = iArr[mqv0Var.c().ordinal()];
        if (i5 == 1 || i5 == 2) {
            this.e = avj0Var.c(ttg0.colorized_car_right_padding_smart);
        } else {
            w511.b();
            throw null;
        }
    }
}
