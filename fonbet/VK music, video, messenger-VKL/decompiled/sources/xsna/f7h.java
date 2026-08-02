package xsna;

import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class f7h implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ f7h(View view, UserId userId, String str, izs izsVar, kwm0 kwm0Var) {
        this.d = userId;
        this.e = kwm0Var;
        this.f = view;
        this.c = str;
        this.g = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((j7h) this.d).d((oap) this.e, this.c, (AdminLeaveAction) this.g, (String) this.f);
                break;
            default:
                UserId userId = (UserId) this.d;
                kwm0 kwm0Var = (kwm0) this.e;
                View view = (View) this.f;
                izs izsVar = (izs) this.g;
                if (fkq0.b(userId)) {
                    kwm0.q(kwm0Var, view.getContext(), fkq0.e(userId), this.c, 0L, null, izsVar, 24);
                } else {
                    kwm0.s(view.getContext(), userId, 300L, izsVar);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ f7h(j7h j7hVar, oap oapVar, String str, AdminLeaveAction adminLeaveAction, String str2) {
        this.d = j7hVar;
        this.e = oapVar;
        this.c = str;
        this.g = adminLeaveAction;
        this.f = str2;
    }
}
