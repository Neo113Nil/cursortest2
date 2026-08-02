package com.yandex.passport.sloth.ui;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.sloth.SlothMetricaEvent$PhoneNumberHintState;
import defpackage.iy60;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements iy60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.iy60
    public final void onFailure(Exception exc) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                h hVar = (h) obj2;
                t tVar = (t) obj;
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.WARN, null, "Phone Number Hint failure", exc);
                }
                ((com.yandex.passport.internal.ui.sloth.f) hVar.a).a(new com.yandex.passport.sloth.n0(SlothMetricaEvent$PhoneNumberHintState.FAILED, exc.getMessage()));
                tVar.invoke(null);
                break;
            default:
                d0 d0Var = (d0) obj2;
                com.yandex.passport.sloth.t tVar2 = (com.yandex.passport.sloth.t) obj;
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.WARN, null, "Phone Number Hint failure", exc);
                }
                d0Var.M.a(new com.yandex.passport.sloth.n0(SlothMetricaEvent$PhoneNumberHintState.FAILED, exc.getMessage()));
                tVar2.a.invoke(null);
                break;
        }
    }
}
