package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.b;
import com.yandex.div.core.view2.Div2View;
import flex.utils.android.DimensionUnit;
import java.util.WeakHashMap;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final /* synthetic */ class phd implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ phd(c8c0 c8c0Var, View view, View view2) {
        this.a = 1;
        this.b = view;
        this.c = view2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                oz40 oz40Var = (oz40) obj2;
                WeakHashMap weakHashMap = b.a;
                n751 a = op31.a((View) obj);
                oz40Var.setValue(Boolean.valueOf(a != null ? a.a.q(8) : false));
                break;
            case 1:
                c8c0.b((View) obj, (View) obj2);
                break;
            case 2:
                hlx0 hlx0Var = (hlx0) obj;
                ((tls) hlx0Var.w).invoke(new pkj((int) (((g690) ((h690) obj2)).a * ((Div2View) hlx0Var.b).getHeight()), DimensionUnit.PX));
                hlx0Var.o();
                break;
            case 3:
                View view = (View) obj;
                tls tlsVar = (tls) obj2;
                int visibility = view.getVisibility();
                int visibility2 = ((ViewGroup) view.getParent()).getVisibility();
                Object tag = view.getTag();
                Pair pair = tag instanceof Pair ? (Pair) tag : null;
                if (pair == null) {
                    pair = new Pair(null, null);
                }
                Integer num = (Integer) pair.getFirst();
                Integer num2 = (Integer) pair.getSecond();
                if (num == null || num.intValue() != visibility || num2 == null || visibility2 != num2.intValue()) {
                    view.setTag(new Pair(Integer.valueOf(visibility), Integer.valueOf(visibility2)));
                    tlsVar.invoke(view);
                    break;
                }
                break;
            default:
                x6f0 x6f0Var = (x6f0) ((y6f0) obj2);
                x6f0Var.getClass();
                x6f0Var.d((View) obj);
                break;
        }
    }

    public /* synthetic */ phd(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ phd(y6f0 y6f0Var, View view) {
        this.a = 4;
        this.c = y6f0Var;
        this.b = view;
    }
}
