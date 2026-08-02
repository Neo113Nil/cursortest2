package xsna;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public interface jaz0 {

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a {
        void a(double d);

        void a(boolean z);

        void b(xey0 xey0Var, String str, int i, fiz0 fiz0Var, Context context);

        void e(xey0 xey0Var);

        void f(xey0 xey0Var);

        void j(xey0 xey0Var, View view);
    }

    void destroy();

    View getCloseButton();

    View i();

    void pause();

    void resume();

    void stop();
}
