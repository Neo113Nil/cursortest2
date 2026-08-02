package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* compiled from: GalleryChangeObserver.kt */
/* loaded from: classes4.dex */
public final class c3t {
    public final int a;
    public final Object b;

    public c3t(ArrayList arrayList, int i) {
        this.b = arrayList;
        this.a = i;
    }

    public c3t(int i) {
        this.a = i;
        this.b = new Handler(Looper.getMainLooper());
    }
}
