package xsna;

import com.vk.log.L;
import com.vkontakte.android.MainActivity;
import java.util.Collection;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class fd00 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fd00(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((crw) ((MainActivity) this.c).z.getValue()).onResume();
                break;
            default:
                Collection<so70> collection = (Collection) this.c;
                Runtime runtime = Runtime.getRuntime();
                float freeMemory = 1 - (runtime.freeMemory() / runtime.maxMemory());
                L.e("OOMPreventer", "checkAvailableMemory, level = " + ((int) (100 * freeMemory)) + ", " + collection.size() + " actions available");
                if (freeMemory > 0.95d) {
                    L.e("OOMPreventer", "near OOM level");
                }
                boolean z = false;
                for (so70 so70Var : collection) {
                    if (!so70Var.a && freeMemory > so70Var.b()) {
                        so70Var.a();
                        so70Var.a = true;
                        L.e("OOMPreventer", "applied " + so70Var.c());
                        z = true;
                    } else if (so70Var.a && freeMemory < so70Var.d()) {
                        so70Var.e();
                        so70Var.a = false;
                        L.e("OOMPreventer", "rollbacked " + so70Var.c());
                    }
                }
                if (z) {
                    L.e("OOMPreventer", "applied some actions, requesting gc");
                    lht.a.a();
                    break;
                }
                break;
        }
    }
}
