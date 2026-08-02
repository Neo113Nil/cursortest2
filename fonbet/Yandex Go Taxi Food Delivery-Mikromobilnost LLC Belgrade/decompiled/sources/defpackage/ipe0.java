package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.yandex.go.splash.preload.c;

/* loaded from: classes13.dex */
public final /* synthetic */ class ipe0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ ipe0(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                ViewParent parent = cVar.c.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(cVar.c);
                    break;
                }
                break;
            default:
                cVar.c.post(new ipe0(cVar, 0));
                break;
        }
    }
}
