package androidx.browser.customtabs;

import android.os.Bundle;
import defpackage.e1o;

/* loaded from: classes10.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1o b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Bundle w;

    public /* synthetic */ i(e1o e1oVar, boolean z, Bundle bundle, int i) {
        this.a = i;
        this.b = e1oVar;
        this.c = z;
        this.w = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.onSessionEnded(this.c, this.w);
                break;
            case 1:
                this.b.onVerticalScrollEvent(this.c, this.w);
                break;
            case 2:
                this.b.onVerticalScrollEvent(this.c, this.w);
                break;
            default:
                this.b.onSessionEnded(this.c, this.w);
                break;
        }
    }
}
