package com.yandex.passport.internal.flags.experiments;

/* loaded from: classes8.dex */
public final class j {
    public static ExperimentsOperator a(String str) {
        ExperimentsOperator experimentsOperator = ExperimentsOperator.EQUAL;
        if (str.equals(experimentsOperator.getOperator())) {
            return experimentsOperator;
        }
        ExperimentsOperator experimentsOperator2 = ExperimentsOperator.LESS_OR_EQUAL;
        if (str.equals(experimentsOperator2.getOperator())) {
            return experimentsOperator2;
        }
        ExperimentsOperator experimentsOperator3 = ExperimentsOperator.MORE_OR_EQUAL;
        if (str.equals(experimentsOperator3.getOperator())) {
            return experimentsOperator3;
        }
        ExperimentsOperator experimentsOperator4 = ExperimentsOperator.NOT_EQUAL;
        experimentsOperator4.getClass();
        return experimentsOperator4;
    }
}
