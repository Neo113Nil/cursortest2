package xsna;

import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButtonHints;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nx implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ nx(int i, Alert$Button alert$Button, Alert$Button alert$Button2, jai jaiVar, xim ximVar, izs izsVar, q630 q630Var) {
        this.b = 2;
        this.c = izsVar;
        this.e = alert$Button;
        this.f = jaiVar;
        this.g = q630Var;
        this.h = alert$Button2;
        this.i = ximVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                yx.a((List) this.e, (ActionButtonHints) this.f, (ActionButton) this.g, this.c, (ActionsAvailabilityState.AttachmentState) this.h, (String) this.i, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((zbq0) this.e).c((a8a) this.f, (acq0) this.g, this.c, (ksr) this.h, (q630) this.i, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                Alert$Button alert$Button = (Alert$Button) this.e;
                jai jaiVar = (jai) this.f;
                q630 q630Var = (q630) this.g;
                Alert$Button alert$Button2 = (Alert$Button) this.h;
                xim ximVar = (xim) this.i;
                ((Integer) obj2).getClass();
                t7u0.e(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, alert$Button, alert$Button2, jaiVar, ximVar, this.c, q630Var);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ nx(Object obj, Object obj2, Object obj3, izs izsVar, Object obj4, Object obj5, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.c = izsVar;
        this.h = obj4;
        this.i = obj5;
        this.d = i;
    }
}
