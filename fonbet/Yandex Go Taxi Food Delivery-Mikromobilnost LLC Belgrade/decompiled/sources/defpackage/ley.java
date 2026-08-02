package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;

/* loaded from: classes9.dex */
public class ley implements q {
    public final iey a;

    public ley(iey ieyVar) {
        this.a = ieyVar;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        if (a()) {
            return;
        }
        int i = key.a[event.ordinal()];
        iey ieyVar = this.a;
        switch (i) {
            case 1:
                ieyVar.onCreate();
                break;
            case 2:
                ieyVar.onStart();
                break;
            case 3:
                ieyVar.onResume();
                break;
            case 4:
                ieyVar.onPause();
                break;
            case 5:
                ieyVar.onStop();
                break;
            case 6:
                ieyVar.onDestroy();
                break;
            case 7:
                break;
            default:
                w511.b();
                break;
        }
    }

    public boolean a() {
        return false;
    }
}
