package xsna;

import android.view.View;
import android.widget.LinearLayout;
import java.util.List;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public interface t5z0 {

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a {
        void a();

        void b();

        void c(int i, dhz0 dhz0Var);

        void d();

        void e();
    }

    View a();

    void b();

    void c();

    void d();

    View getCloseButton();

    LinearLayout getTopBar();

    void setBanner(tez0 tez0Var);

    void setDoubleBanners(List list);

    void setRemainingAllowCloseDelay(int i);
}
