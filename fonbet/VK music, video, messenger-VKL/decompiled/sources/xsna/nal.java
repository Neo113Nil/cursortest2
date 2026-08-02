package xsna;

import com.vk.instantjobs.components.appstate.AppState;
import java.util.Iterator;
import xsna.r93;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class nal implements Runnable {
    public final /* synthetic */ oal b;
    public final /* synthetic */ AppState c;

    public /* synthetic */ nal(oal oalVar, AppState appState) {
        this.b = oalVar;
        this.c = appState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StringBuilder sb = new StringBuilder("app status is ");
        AppState appState = this.c;
        sb.append(appState);
        String sb2 = sb.toString();
        oal oalVar = this.b;
        pla plaVar = oalVar.b;
        plaVar.a(sb2);
        Iterator<r93.a> it = oalVar.i.iterator();
        while (it.hasNext()) {
            try {
                it.next().a(appState);
            } catch (Throwable th) {
                plaVar.d("unable to invoke AppStateDetector.Listener#onStateChanged(" + appState + ')', th);
            }
        }
    }
}
