package xsna;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.money.createtransfer.input.TransferInputFieldView;
import java.util.HashSet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class kjp0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kjp0(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        int i2 = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                TransferInputFieldView transferInputFieldView = (TransferInputFieldView) obj;
                int i3 = TransferInputFieldView.p;
                Context context = transferInputFieldView.getContext();
                HashSet hashSet = iah0.a;
                if (fnj.b(context) || i2 == 1 || i2 == 9) {
                    mhy.j(transferInputFieldView.f);
                    break;
                }
                break;
            default:
                com.vk.core.view.components.context.menu.e eVar = (com.vk.core.view.components.context.menu.e) obj;
                View view = eVar.n;
                if (view == null) {
                    view = null;
                }
                View view2 = eVar.m;
                if (view2 == null) {
                    view2 = null;
                }
                epx.f(view, view2);
                View view3 = eVar.m;
                if (view3 == null) {
                    view3 = null;
                }
                eVar.k(i2, 0, view3);
                View view4 = eVar.n;
                if (view4 == null) {
                    view4 = null;
                }
                View view5 = eVar.m;
                if (view5 == null) {
                    view5 = null;
                }
                if (!epx.f(view4, view5)) {
                    View view6 = eVar.m;
                    if (view6 == null) {
                        view6 = null;
                    }
                    View view7 = eVar.m;
                    if (view7 == null) {
                        view7 = null;
                    }
                    int measuredWidth = view7.getMeasuredWidth();
                    View view8 = eVar.m;
                    if (view8 == null) {
                        view8 = null;
                    }
                    view6.setLayoutParams(new LinearLayout.LayoutParams(measuredWidth, view8.getMeasuredHeight()));
                    View view9 = eVar.m;
                    if (view9 == null) {
                        view9 = null;
                    }
                    int measuredHeight = view9.getMeasuredHeight();
                    if (measuredHeight < 0) {
                        measuredHeight = 0;
                    }
                    View view10 = eVar.n;
                    if (view10 == null) {
                        view10 = null;
                    }
                    Integer num = eVar.f.a;
                    view10.measure(View.MeasureSpec.makeMeasureSpec(num != null ? num.intValue() : eVar.d(eVar.a), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
                    View view11 = eVar.n;
                    View view12 = view11 != null ? view11 : null;
                    if (view11 == null) {
                        view11 = null;
                    }
                    int measuredWidth2 = view11.getMeasuredWidth();
                    View view13 = eVar.n;
                    if (view13 == null) {
                        view13 = null;
                    }
                    view12.layout(0, 0, measuredWidth2, view13.getMeasuredHeight());
                }
                fpj fpjVar = eVar.o;
                if (fpjVar != null) {
                    View view14 = eVar.n;
                    if (view14 == null) {
                        view14 = null;
                    }
                    int measuredWidth3 = view14.getMeasuredWidth();
                    View view15 = eVar.n;
                    fpjVar.update(measuredWidth3, (view15 != null ? view15 : null).getMeasuredHeight());
                    break;
                }
                break;
        }
    }
}
