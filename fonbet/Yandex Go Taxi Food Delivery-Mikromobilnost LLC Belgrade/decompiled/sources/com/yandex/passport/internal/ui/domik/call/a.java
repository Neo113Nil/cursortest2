package com.yandex.passport.internal.ui.domik.call;

import com.yandex.passport.internal.ui.domik.base.BaseDomikFragment;
import com.yandex.passport.internal.ui.domik.common.BaseSmsFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements com.yandex.passport.internal.widget.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseDomikFragment b;

    public /* synthetic */ a(BaseDomikFragment baseDomikFragment, int i) {
        this.a = i;
        this.b = baseDomikFragment;
    }

    @Override // com.yandex.passport.internal.widget.a
    public final void a(String str, boolean z) {
        int i = this.a;
        BaseDomikFragment baseDomikFragment = this.b;
        switch (i) {
            case 0:
                CallConfirmFragment.onViewCreated$lambda$1((CallConfirmFragment) baseDomikFragment, str, z);
                break;
            default:
                ((BaseSmsFragment) baseDomikFragment).lambda$onViewCreated$0(str, z);
                break;
        }
    }
}
