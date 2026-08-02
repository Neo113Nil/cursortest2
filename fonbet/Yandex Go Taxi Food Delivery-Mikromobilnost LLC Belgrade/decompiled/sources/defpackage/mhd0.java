package defpackage;

import kotlin.a;

/* loaded from: classes8.dex */
public final class mhd0 {
    public final int a;
    public final int b;
    public final i3y c;
    public final i3y d;
    public final i3y e;

    public mhd0() {
        int i = e1i0.PlusSDK_Theme_PaymentSdk_Light;
        int i2 = e1i0.PlusSDK_Theme_PaymentSdk_Dark;
        this.a = i;
        this.b = i2;
        final int i3 = 0;
        this.c = a.a(new sls(this) { // from class: nes0
            public final /* synthetic */ mhd0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i4 = i3;
                mhd0 mhd0Var = this.b;
                switch (i4) {
                    case 0:
                        return new mes0(mhd0Var.a);
                    case 1:
                        return new mes0(mhd0Var.b);
                    default:
                        return new o3x0(mhd0Var.a, mhd0Var.b);
                }
            }
        });
        final int i4 = 1;
        this.d = a.a(new sls(this) { // from class: nes0
            public final /* synthetic */ mhd0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i42 = i4;
                mhd0 mhd0Var = this.b;
                switch (i42) {
                    case 0:
                        return new mes0(mhd0Var.a);
                    case 1:
                        return new mes0(mhd0Var.b);
                    default:
                        return new o3x0(mhd0Var.a, mhd0Var.b);
                }
            }
        });
        final int i5 = 2;
        this.e = a.a(new sls(this) { // from class: nes0
            public final /* synthetic */ mhd0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i42 = i5;
                mhd0 mhd0Var = this.b;
                switch (i42) {
                    case 0:
                        return new mes0(mhd0Var.a);
                    case 1:
                        return new mes0(mhd0Var.b);
                    default:
                        return new o3x0(mhd0Var.a, mhd0Var.b);
                }
            }
        });
    }
}
