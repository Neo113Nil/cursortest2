package defpackage;

import com.yandex.div.core.view2.Div2View;

/* loaded from: classes11.dex */
public final /* synthetic */ class e3l implements eg90 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Div2View d;

    public /* synthetic */ e3l(Div2View div2View, int i) {
        this.c = i;
        this.d = div2View;
    }

    @Override // defpackage.eg90
    public final void a(Exception exc) {
        int i = this.c;
        Div2View div2View = this.d;
        switch (i) {
            case 0:
                div2View.logError(exc);
                break;
            default:
                div2View.logError(exc);
                break;
        }
    }
}
