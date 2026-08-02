package defpackage;

import com.yandex.plus.pay.ui.core.debug.internal.ui.form.ReportFormFragment;

/* loaded from: classes2.dex */
public final class i2j0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ReportFormFragment b;

    public /* synthetic */ i2j0(ReportFormFragment reportFormFragment, int i) {
        this.a = i;
        this.b = reportFormFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        ReportFormFragment reportFormFragment = this.b;
        switch (i) {
        }
        return reportFormFragment.getViewLifecycleOwner().getLifecycle();
    }
}
