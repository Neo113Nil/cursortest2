package xsna;

import android.app.Application;
import android.view.WindowManager;
import android.widget.TextView;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;

/* compiled from: UiTrackerDebugViewer.kt */
/* loaded from: classes17.dex */
public final class l0q0 {
    public e7l a;
    public final WindowManager b;

    public l0q0(Application application) {
        this.b = (WindowManager) application.getApplicationContext().getSystemService("window");
        application.registerActivityLifecycleCallbacks(new k0q0(this, application.getApplicationContext()));
    }

    public final void a(UiTrackingScreen uiTrackingScreen, UiTrackingScreen uiTrackingScreen2) {
        e7l e7lVar = this.a;
        if (e7lVar != null) {
            TextView textView = e7lVar.f;
            d7l d7lVar = e7lVar.k;
            if (d7lVar != null) {
                d7lVar.cancel();
            }
            d7l d7lVar2 = new d7l(e7lVar);
            e7lVar.k = d7lVar2;
            e7lVar.j.scheduleAtFixedRate(d7lVar2, 0L, 250L);
            e7lVar.b.setText(e7lVar.getResources().getString(R.string.current_screen_name, uiTrackingScreen2.a));
            e7lVar.c.setText(e7lVar.getResources().getString(R.string.previous_screen_name, uiTrackingScreen.a));
            e7lVar.e.setText(e7lVar.getResources().getString(R.string.previous_time_spent, Long.valueOf(System.currentTimeMillis() - e7lVar.g)));
            e7lVar.d.setText(e7lVar.getResources().getString(R.string.current_time_spent, 0));
            e7lVar.g = System.currentTimeMillis();
            if (uiTrackingScreen2.e()) {
                textView.setVisibility(0);
                e7lVar.setBackgroundColor(e7lVar.i);
            } else {
                textView.setVisibility(8);
                e7lVar.setBackgroundColor(e7lVar.h);
            }
        }
    }
}
