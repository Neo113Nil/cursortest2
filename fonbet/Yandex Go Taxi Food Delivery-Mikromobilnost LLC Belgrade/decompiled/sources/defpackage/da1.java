package defpackage;

import android.widget.TextView;
import com.yandex.div.core.expression.local.b;
import com.yandex.div.core.view2.Div2View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final /* synthetic */ class da1 implements yvf0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ da1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (e52) ((h3y) ((ea1) obj).c).get();
            case 1:
                return (jv2) ((ea1) obj).c;
            case 2:
                return (zco) obj;
            case 3:
                WeakReference weakReference = ((b) obj).j;
                if (weakReference != null) {
                    return (Div2View) weakReference.get();
                }
                return null;
            default:
                return ((TextView) obj).getLayout();
        }
    }
}
