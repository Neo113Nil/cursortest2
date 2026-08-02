package defpackage;

import android.view.View;
import androidx.core.view.b;
import java.util.WeakHashMap;

/* loaded from: classes12.dex */
public final /* synthetic */ class k2w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ l2w c;

    public /* synthetic */ k2w(View view, l2w l2wVar, int i) {
        this.a = i;
        this.b = view;
        this.c = l2wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        l2w l2wVar = this.c;
        View view = this.b;
        switch (i) {
            case 0:
                if (view.isAttachedToWindow()) {
                    try {
                        WeakHashMap weakHashMap = b.a;
                        n751 a = op31.a(view);
                        if (a != null) {
                            b.d(view, l2wVar.b(view.getContext(), a));
                        } else {
                            np31.c(view);
                        }
                        break;
                    } catch (IllegalStateException unused) {
                        return;
                    }
                }
                break;
            default:
                if (view.isAttachedToWindow()) {
                    WeakHashMap weakHashMap2 = b.a;
                    n751 a2 = op31.a(view);
                    if (a2 != null) {
                        b.d(view, l2wVar.b(view.getContext(), a2));
                        break;
                    }
                }
                break;
        }
    }
}
