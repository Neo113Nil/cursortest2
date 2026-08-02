package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class ihc implements bxy0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ihc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bxy0
    public final void a(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((jhc) obj).b.invoke(Integer.valueOf(i));
                break;
            default:
                ((View) ((nfh) obj).b).setBackgroundColor(i);
                break;
        }
    }
}
