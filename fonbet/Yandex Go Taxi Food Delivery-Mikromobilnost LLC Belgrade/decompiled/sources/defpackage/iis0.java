package defpackage;

import com.yandex.div.core.view2.Div2View;

/* loaded from: classes11.dex */
public final class iis0 {
    public sls a;

    public iis0(Div2View div2View, sls slsVar) {
        this.a = slsVar;
        if (div2View.isAttachedToWindow()) {
            b();
        }
    }

    public final void a() {
        this.a = null;
    }

    public final void b() {
        sls slsVar = this.a;
        if (slsVar != null) {
            slsVar.invoke();
        }
        this.a = null;
    }
}
