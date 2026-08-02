package defpackage;

import com.yandex.go.scooters.passes.model.PassPayment;

@gsq0
/* loaded from: classes6.dex */
public final class jk90 {
    public static final ik90 Companion = new ik90();
    public final String a;
    public final PassPayment b;
    public final String c;

    public /* synthetic */ jk90(int i, String str, PassPayment passPayment, String str2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, hk90.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = passPayment;
        this.c = str2;
    }

    public jk90(String str, PassPayment passPayment, String str2) {
        this.a = str;
        this.b = passPayment;
        this.c = str2;
    }
}
