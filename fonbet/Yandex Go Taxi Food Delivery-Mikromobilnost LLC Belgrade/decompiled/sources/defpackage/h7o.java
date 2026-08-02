package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.platform.ui.components.errordialog.LoadErrorDialog;

/* loaded from: classes13.dex */
public final class h7o {
    public final ViewGroup a;
    public LoadErrorDialog b;
    public akf0 c;
    public akf0 d;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final uhm j = new uhm(22, this);

    public h7o(ViewGroup viewGroup) {
        this.a = viewGroup;
        this.f = viewGroup.getResources().getString(eyh0.web_app_loading_error_title);
        this.g = viewGroup.getResources().getString(eyh0.secondary_url_loading_error_title);
        this.h = viewGroup.getResources().getString(eyh0.web_view_level_error_description);
        this.i = viewGroup.getResources().getString(eyh0.update_web_view);
    }

    public final LoadErrorDialog a() {
        LoadErrorDialog loadErrorDialog = this.b;
        if (loadErrorDialog != null) {
            return loadErrorDialog;
        }
        ViewGroup viewGroup = this.a;
        LoadErrorDialog loadErrorDialog2 = new LoadErrorDialog(viewGroup.getContext(), null, 0, 6, null);
        loadErrorDialog2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        loadErrorDialog2.setOnActionClickListener(this.d);
        loadErrorDialog2.setOnCancelClickListener(this.c);
        viewGroup.addView(loadErrorDialog2);
        this.b = loadErrorDialog2;
        loadErrorDialog2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.platform.utils.ViewUtilsKt$removeCallbacksAndMessagesOnDetach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                Handler handler = v.getHandler();
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            }
        });
        return loadErrorDialog2;
    }
}
