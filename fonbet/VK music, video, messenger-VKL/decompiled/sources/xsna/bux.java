package xsna;

/* compiled from: ItemBaseContract.kt */
/* loaded from: classes7.dex */
public interface bux extends cc6 {
    gzs<s3q0> H1();

    gzs<s3q0> J0();

    default s3q0 P1() {
        if (q3().a()) {
            return s3q0.a;
        }
        gzs<s3q0> J0 = J0();
        if (J0 == null) {
            return null;
        }
        J0.invoke();
        return s3q0.a;
    }

    default s3q0 p7() {
        if (q3().a()) {
            return s3q0.a;
        }
        gzs<s3q0> H1 = H1();
        if (H1 == null) {
            return null;
        }
        H1.invoke();
        return s3q0.a;
    }

    pxo0 q3();
}
