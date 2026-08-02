package com.yandex.passport.internal.entities;

import com.yandex.passport.api.PassportParameterRule;
import com.yandex.passport.data.models.ParameterRule;
import defpackage.w511;

/* loaded from: classes15.dex */
public abstract class h {
    public static final PassportParameterRule a(ParameterRule parameterRule) {
        int i = g.a[parameterRule.getSign().ordinal()];
        if (i == 1) {
            return new PassportParameterRule(PassportParameterRule.Sign.INCLUDE, parameterRule.getParameters());
        }
        if (i == 2) {
            return new PassportParameterRule(PassportParameterRule.Sign.EXCLUDE, parameterRule.getParameters());
        }
        w511.b();
        return null;
    }

    public static final ParameterRule b(PassportParameterRule passportParameterRule) {
        int i = g.b[passportParameterRule.getSign().ordinal()];
        if (i == 1) {
            return new ParameterRule(ParameterRule.Sign.INCLUDE, passportParameterRule.getParameters());
        }
        if (i == 2) {
            return new ParameterRule(ParameterRule.Sign.EXCLUDE, passportParameterRule.getParameters());
        }
        w511.b();
        return null;
    }
}
