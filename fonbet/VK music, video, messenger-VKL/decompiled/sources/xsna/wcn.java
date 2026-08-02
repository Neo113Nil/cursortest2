package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class wcn implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wcn(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.Lambda, xsna.gzs] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((Lambda) this.c).invoke();
                break;
            case 1:
                ((io.reactivex.rxjava3.core.v) this.c).onComplete();
                break;
            default:
                Context context = (Context) this.c;
                PackageManager packageManager = context.getPackageManager();
                Iterator<T> it = pmr0.d.iterator();
                while (it.hasNext()) {
                    ComponentName componentName = new ComponentName(context, (String) it.next());
                    int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
                    if (componentEnabledSetting == 0 || componentEnabledSetting == 1) {
                        packageManager.setComponentEnabledSetting(componentName, 2, 1);
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ wcn(gzs gzsVar) {
        this.b = 0;
        this.c = (Lambda) gzsVar;
    }
}
