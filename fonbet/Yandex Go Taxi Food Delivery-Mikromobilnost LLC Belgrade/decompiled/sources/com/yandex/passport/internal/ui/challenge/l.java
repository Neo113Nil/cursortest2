package com.yandex.passport.internal.ui.challenge;

import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.common.core.Uid;

/* loaded from: classes2.dex */
public abstract class l {
    public final Uid a;
    public final PassportTheme b;

    static {
        int i = Uid.$stable;
    }

    public l(Uid uid, PassportTheme passportTheme) {
        this.a = uid;
        this.b = passportTheme;
    }
}
