package xsna;

import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class pb0 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ pb0(View view, UserId userId, String str, izs izsVar, kwm0 kwm0Var) {
        this.d = kwm0Var;
        this.e = view;
        this.f = userId;
        this.c = str;
        this.g = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ib0 ib0Var = (ib0) this.d;
                lb0 lb0Var = (lb0) this.e;
                va0 va0Var = (va0) this.f;
                final wh50 wh50Var = (wh50) this.g;
                ib0Var.a = lb0Var.d(this.c, va0Var, new ua0() { // from class: xsna.qb0
                    @Override // xsna.ua0
                    public final void onActivityResult(Object obj2) {
                        ((izs) wh50.this.getValue()).invoke(obj2);
                    }
                });
                return new rb0(ib0Var, 0);
            default:
                kwm0 kwm0Var = (kwm0) this.d;
                View view = (View) this.e;
                UserId userId = (UserId) this.f;
                AdminLeaveAction adminLeaveAction = (AdminLeaveAction) obj;
                kwm0.q(kwm0Var, view.getContext(), fkq0.e(userId), this.c, 0L, adminLeaveAction, (izs) this.g, 8);
                return s3q0.a;
        }
    }

    public /* synthetic */ pb0(ib0 ib0Var, lb0 lb0Var, String str, va0 va0Var, wh50 wh50Var) {
        this.d = ib0Var;
        this.e = lb0Var;
        this.c = str;
        this.f = va0Var;
        this.g = wh50Var;
    }
}
