package xsna;

import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.ViewManager;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEventSource;
import com.vk.sharing.api.dto.Target;
import java.util.List;
import xsna.ify;

/* compiled from: ViewForGroupPicker.kt */
/* loaded from: classes5.dex */
public interface ext0 extends Drawable.Callback, KeyEvent.Callback, AccessibilityEventSource, ViewParent, ViewManager, ify.a {

    /* compiled from: ViewForGroupPicker.kt */
    public interface a {
        void a();

        void b();

        void c();

        boolean d();

        void e(Target target, int i);

        int f();

        void h2();

        void i2();
    }

    void D0(int i);

    void I1();

    void Qd();

    int S1(Target target);

    void Tj();

    void e0();

    void f0();

    void g0();

    a getPresenter();

    List<Target> getTargets();

    void h0(boolean z);

    void hide();

    void setEmptyText(String str);

    void setErrorMessage(String str);

    void setTargets(List<Target> list);

    void u0(String str, boolean z);

    void ve();
}
