package defpackage;

import android.view.View;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.experiment.a;
import ru.yandex.taxi.address.experiment.r;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.g;

/* loaded from: classes6.dex */
public final /* synthetic */ class fct0 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ View.OnFocusChangeListener c;

    public /* synthetic */ fct0(g gVar, View.OnFocusChangeListener onFocusChangeListener, int i) {
        this.a = i;
        this.b = gVar;
        this.c = onFocusChangeListener;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        String str = "";
        View.OnFocusChangeListener onFocusChangeListener = this.c;
        g gVar = this.b;
        switch (i) {
            case 0:
                r0 r0Var = gVar.c;
                if (z) {
                    str = ((avj0) gVar.b).h(kyh0.point_on_map);
                }
                String str2 = str;
                r rVar = (r) r0Var.getValue();
                r a = r.a(rVar, a.a(rVar.a, null, null, null, null, null, null, str2, null, false, false, false, false, 524159), null, 2);
                r0Var.getClass();
                r0Var.m(null, a);
                if (z) {
                    gVar.g(PointType.SOURCE);
                }
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(view, z);
                    break;
                }
                break;
            default:
                r0 r0Var2 = gVar.c;
                if (z) {
                    str = ((avj0) gVar.b).h(kyh0.point_on_map);
                }
                String str3 = str;
                r rVar2 = (r) r0Var2.getValue();
                r a2 = r.a(rVar2, null, a.a(rVar2.b, null, null, null, null, null, null, str3, null, false, false, false, false, 524159), 1);
                r0Var2.getClass();
                r0Var2.m(null, a2);
                if (z) {
                    gVar.g(PointType.DESTINATION);
                }
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(view, z);
                    break;
                }
                break;
        }
    }
}
