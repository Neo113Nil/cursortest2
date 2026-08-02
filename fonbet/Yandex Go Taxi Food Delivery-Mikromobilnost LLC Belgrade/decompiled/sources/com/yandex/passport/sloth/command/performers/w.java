package com.yandex.passport.sloth.command.performers;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.sloth.command.data.y0;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.iqn;
import defpackage.jl40;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w implements com.yandex.passport.sloth.command.q {
    public final SlothParams a;

    public w(SlothParams slothParams) {
        this.a = slothParams;
    }

    @Override // com.yandex.passport.sloth.command.q
    public final Object a(Object obj, Continuation continuation) {
        y0 y0Var = (y0) obj;
        if (jl40.l(y0Var.a, "fullscreen")) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Nothing changes for fullscreen mode of setPopupSize", 8);
            }
            return new iqn(com.yandex.passport.sloth.command.u.c);
        }
        String str = "Not supported SetPopupSizeData.mode = " + y0Var.a + " for variant.mode = " + this.a.getVariant().getMode();
        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, str, 8);
        }
        return new iqn(com.yandex.passport.sloth.command.u.b);
    }
}
