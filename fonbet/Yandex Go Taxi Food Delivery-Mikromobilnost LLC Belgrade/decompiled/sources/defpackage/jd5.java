package defpackage;

import com.yandex.plus.webview.internal.a;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public abstract class jd5 implements in41 {
    public WeakReference a;

    @Override // defpackage.in41
    public void i(a aVar, swh swhVar) {
        this.a = new WeakReference(aVar);
    }

    public final mn41 t() {
        WeakReference weakReference = this.a;
        if (weakReference != null) {
            return (mn41) weakReference.get();
        }
        return null;
    }
}
