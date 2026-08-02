package defpackage;

import android.app.Activity;
import androidx.core.app.b;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.Session;
import com.google.ar.core.exceptions.CameraNotAvailableException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;

/* loaded from: classes11.dex */
public final class l1 implements DefaultLifecycleObserver {
    public final Activity a;
    public final Set b = EmptySet.a;
    public boolean c;
    public Session w;
    public vmz x;
    public iez y;

    public l1(Activity activity) {
        this.a = activity;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(pey peyVar) {
        Session session = this.w;
        if (session != null) {
            session.close();
        }
        this.w = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(pey peyVar) {
        Session session = this.w;
        if (session != null) {
            session.pause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onResume(pey peyVar) {
        int i;
        Session session = this.w;
        if (session == null) {
            Activity activity = this.a;
            if (qke.h(activity, "android.permission.CAMERA") == 0) {
                try {
                    i = k1.a[ArCoreApk.getInstance().requestInstall(activity, !this.c).ordinal()];
                } catch (Exception e) {
                    vmz vmzVar = this.x;
                    if (vmzVar != null) {
                        vmzVar.invoke(e);
                    }
                }
                if (i == 1) {
                    this.c = true;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    session = new Session(activity, this.b);
                    if (session == null) {
                        return;
                    }
                }
            } else {
                b.J(activity, new String[]{"android.permission.CAMERA"}, 0);
            }
            session = null;
            if (session == null) {
            }
        }
        try {
            iez iezVar = this.y;
            if (iezVar != null) {
                iezVar.invoke(session);
            }
            session.resume();
            this.w = session;
        } catch (CameraNotAvailableException e2) {
            vmz vmzVar2 = this.x;
            if (vmzVar2 != null) {
                vmzVar2.invoke(e2);
            }
        }
    }
}
