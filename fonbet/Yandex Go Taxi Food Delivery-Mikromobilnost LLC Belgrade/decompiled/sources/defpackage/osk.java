package defpackage;

import com.yandex.div.core.view2.Div2View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class osk extends k25 {
    public final String a;
    public final WeakReference b;

    public osk(Div2View div2View) {
        this.a = div2View.getLogId();
        this.b = new WeakReference(div2View);
    }

    @Override // defpackage.btk
    public final String a() {
        return this.a;
    }

    @Override // defpackage.btk
    public void d(Throwable th) {
        Div2View div2View;
        if (th == null || (div2View = (Div2View) this.b.get()) == null) {
            return;
        }
        div2View.logError(th);
    }
}
