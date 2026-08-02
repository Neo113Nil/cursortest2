package com.yandex.passport.internal.social.esia;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.report.a7;
import com.yandex.passport.internal.report.reporters.EsiaBindingReporter$EsiaWay;
import com.yandex.passport.internal.report.yd;
import defpackage.hs31;
import defpackage.rcc;
import defpackage.sls;
import defpackage.zy11;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes15.dex */
public final /* synthetic */ class a implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ EsiaBindActivity b;

    public /* synthetic */ a(EsiaBindActivity esiaBindActivity, int i) {
        this.a = i;
        this.b = esiaBindActivity;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        h component_delegate$lambda$0;
        com.yandex.passport.internal.report.reporters.y reporter_delegate$lambda$1;
        hs31 viewModel_delegate$lambda$2;
        com.yandex.passport.internal.report.reporters.y reporter;
        Uid uid;
        i0 viewModel;
        com.yandex.passport.internal.report.reporters.y reporter2;
        Uid uid2;
        i0 viewModel2;
        com.yandex.passport.internal.report.reporters.y reporter3;
        Uid uid3;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        EsiaBindActivity esiaBindActivity = this.b;
        switch (i) {
            case 0:
                component_delegate$lambda$0 = EsiaBindActivity.component_delegate$lambda$0(esiaBindActivity);
                break;
            case 1:
                reporter_delegate$lambda$1 = EsiaBindActivity.reporter_delegate$lambda$1(esiaBindActivity);
                break;
            case 2:
                viewModel_delegate$lambda$2 = EsiaBindActivity.viewModel_delegate$lambda$2(esiaBindActivity);
                break;
            case 3:
                reporter = esiaBindActivity.getReporter();
                uid = esiaBindActivity.uid;
                reporter.getClass();
                a7 a7Var = a7.w;
                ListBuilder a = rcc.a();
                if (uid != null) {
                    a.add(new yd(uid));
                }
                reporter.e(a7Var, a.j());
                viewModel = esiaBindActivity.getViewModel();
                if (!((EsiaBindViewModel$State) viewModel.w.a.invoke()).isEsiaBindingAppToApp()) {
                    reporter2 = esiaBindActivity.getReporter();
                    uid2 = esiaBindActivity.uid;
                    reporter2.n(uid2, EsiaBindingReporter$EsiaWay.WEB_VIEW);
                    break;
                }
                break;
            default:
                viewModel2 = esiaBindActivity.getViewModel();
                if (!((EsiaBindViewModel$State) viewModel2.w.a.invoke()).isEsiaBindingAppToApp()) {
                    reporter3 = esiaBindActivity.getReporter();
                    uid3 = esiaBindActivity.uid;
                    reporter3.l(uid3, EsiaBindingReporter$EsiaWay.WEB_VIEW);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
