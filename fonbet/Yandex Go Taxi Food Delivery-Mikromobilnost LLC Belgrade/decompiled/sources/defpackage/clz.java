package defpackage;

import com.yandex.plus.pay.ui.core.debug.internal.ui.log.LogsFragment;

/* loaded from: classes2.dex */
public final class clz implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ LogsFragment b;

    public /* synthetic */ clz(LogsFragment logsFragment, int i) {
        this.a = i;
        this.b = logsFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        LogsFragment logsFragment = this.b;
        switch (i) {
        }
        return logsFragment.getViewLifecycleOwner().getLifecycle();
    }
}
