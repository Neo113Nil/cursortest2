package com.yandex.passport.internal.impl;

import com.yandex.passport.common.logger.LogLevel;
import defpackage.tje;
import defpackage.tse;
import defpackage.u40;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class n implements u40 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;
    public final /* synthetic */ o c;
    public final /* synthetic */ n0 w;

    public /* synthetic */ n(n0 n0Var, o oVar, n0 n0Var2, int i) {
        this.a = i;
        this.b = n0Var;
        this.c = oVar;
        this.w = n0Var2;
    }

    @Override // defpackage.u40
    public final void a(Object obj) {
        int i = this.a;
        n0 n0Var = this.w;
        n0 n0Var2 = this.b;
        o oVar = this.c;
        switch (i) {
            case 0:
                tse tseVar = oVar.a;
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Activity result " + obj, 8);
                }
                tje.N(tseVar, null, null, new KPassportUiApiImpl$special$$inlined$registerAndTransform$1$1(n0Var2, obj, null), 3);
                tje.N(tseVar, null, null, new KPassportUiApiImpl$special$$inlined$registerAndTransform$1$2(n0Var, obj, null), 3);
                break;
            case 1:
                tse tseVar2 = oVar.a;
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Activity result " + obj, 8);
                }
                tje.N(tseVar2, null, null, new KPassportUiApiImpl$special$$inlined$registerAndTransform$2$1(n0Var2, obj, null), 3);
                tje.N(tseVar2, null, null, new KPassportUiApiImpl$special$$inlined$registerAndTransform$2$2(n0Var, obj, null), 3);
                break;
            case 2:
                tse tseVar3 = oVar.a;
                com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Activity result " + obj, 8);
                }
                tje.N(tseVar3, null, null, new KPassportUiApiImpl$special$$inlined$registerAndTransform$3$1(n0Var2, obj, null), 3);
                tje.N(tseVar3, null, null, new KPassportUiApiImpl$special$$inlined$registerAndTransform$3$2(n0Var, obj, null), 3);
                break;
            case 3:
                tse tseVar4 = oVar.a;
                com.yandex.passport.common.logger.c cVar4 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Activity result " + obj, 8);
                }
                tje.N(tseVar4, null, null, new KPassportUiApiImpl$special$$inlined$registerAndTransform$4$1(n0Var2, obj, null), 3);
                tje.N(tseVar4, null, null, new KPassportUiApiImpl$special$$inlined$registerAndTransform$4$2(n0Var, obj, null), 3);
                break;
            case 4:
                tse tseVar5 = oVar.a;
                com.yandex.passport.common.logger.c cVar5 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Activity result " + obj, 8);
                }
                tje.N(tseVar5, null, null, new KPassportUiApiImpl$special$$inlined$registerAndTransform$5$1(n0Var2, obj, null), 3);
                tje.N(tseVar5, null, null, new KPassportUiApiImpl$special$$inlined$registerAndTransform$5$2(n0Var, obj, null), 3);
                break;
            default:
                tse tseVar6 = oVar.a;
                com.yandex.passport.common.logger.c cVar6 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Activity result " + obj, 8);
                }
                tje.N(tseVar6, null, null, new KPassportUiApiImpl$special$$inlined$registerAndTransformCommon$1$1(n0Var2, obj, null), 3);
                tje.N(tseVar6, null, null, new KPassportUiApiImpl$special$$inlined$registerAndTransformCommon$1$2(n0Var, obj, null), 3);
                break;
        }
    }
}
