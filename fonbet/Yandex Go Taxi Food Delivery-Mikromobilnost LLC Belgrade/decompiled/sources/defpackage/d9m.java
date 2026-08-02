package defpackage;

import android.view.View;
import androidx.compose.ui.semantics.f;
import ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.ReorderHapticFeedbackType;

/* loaded from: classes5.dex */
public final class d9m implements tls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ oz40 c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public d9m(View view, oz40 oz40Var, yx40 yx40Var, int i, yx40 yx40Var2) {
        this.w = view;
        this.c = oz40Var;
        this.x = yx40Var;
        this.b = i;
        this.y = yx40Var2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.x;
        oz40 oz40Var = this.c;
        Object obj3 = this.y;
        int i2 = this.b;
        Object obj4 = this.w;
        switch (i) {
            case 0:
                long j = ((wu60) obj).a;
                t791.h((View) obj4, ReorderHapticFeedbackType.START);
                oz40Var.setValue(Boolean.FALSE);
                ((yx40) obj2).setIntValue(i2);
                ((yx40) obj3).setIntValue(i2);
                break;
            default:
                wls wlsVar = (wls) obj3;
                f.m((mnq0) obj, scc.g(new nif(new f9m(i2, wlsVar, oz40Var, 0), (String) obj4), new nif(new f9m(i2, wlsVar, oz40Var, 1), (String) obj2)));
                break;
        }
        return zy11Var;
    }

    public d9m(String str, String str2, int i, wls wlsVar, oz40 oz40Var) {
        this.w = str;
        this.x = str2;
        this.b = i;
        this.y = wlsVar;
        this.c = oz40Var;
    }
}
