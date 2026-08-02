package ru.ok.android.webrtc.stat.call.methods.loss;

import java.math.BigInteger;
import xsna.k9x;
import xsna.swe0;

/* loaded from: classes9.dex */
public final class LossStat {
    public BigInteger a;
    public BigInteger b;

    public final Integer getLoss(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2 != null && bigInteger != null) {
            BigInteger bigInteger3 = this.a;
            BigInteger bigInteger4 = this.b;
            this.a = bigInteger;
            this.b = bigInteger2;
            if (bigInteger3 != null && bigInteger4 != null) {
                if (bigInteger3.compareTo(bigInteger) > 0 || bigInteger4.compareTo(bigInteger2) > 0) {
                    reset();
                } else {
                    BigInteger subtract = bigInteger.subtract(bigInteger3);
                    BigInteger subtract2 = bigInteger2.subtract(bigInteger4);
                    if (subtract.compareTo(BigInteger.ZERO) > 0) {
                        return Integer.valueOf(swe0.h((int) ((subtract2.floatValue() * 100) / subtract.floatValue()), new k9x(0, 100, 1)));
                    }
                }
            }
        }
        return null;
    }

    public final void reset() {
        this.a = null;
        this.b = null;
    }
}
