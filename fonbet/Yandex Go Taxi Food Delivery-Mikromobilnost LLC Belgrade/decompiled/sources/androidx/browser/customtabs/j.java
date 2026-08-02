package androidx.browser.customtabs;

import android.os.Bundle;
import defpackage.e1o;

/* loaded from: classes10.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1o b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Bundle w;

    public /* synthetic */ j(e1o e1oVar, int i, Bundle bundle, int i2) {
        this.a = i2;
        this.b = e1oVar;
        this.c = i;
        this.w = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.onGreatestScrollPercentageIncreased(this.c, this.w);
                break;
            default:
                this.b.onGreatestScrollPercentageIncreased(this.c, this.w);
                break;
        }
    }
}
