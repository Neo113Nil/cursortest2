package com.yandex.div.core.view2.debugview;

import android.view.View;
import defpackage.an8;
import defpackage.fn6;
import defpackage.sls;

/* loaded from: classes11.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((DebugView$tryAddDetailsView$holder$1) ((sls) ((fn6) obj).a)).invoke();
                break;
            case 1:
                ((DebugView$tryAddDetailsView$holder$2) ((sls) ((fn6) obj).d)).invoke();
                break;
            default:
                ((DebugView$tryAddCounterView$holder$1) ((sls) ((an8) obj).c)).invoke();
                break;
        }
    }
}
