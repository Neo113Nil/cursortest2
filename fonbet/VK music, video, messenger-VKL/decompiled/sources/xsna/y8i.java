package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import com.vkontakte.android.R;

/* compiled from: ComponentDialog.kt */
/* loaded from: classes.dex */
public class y8i extends Dialog implements f5z, r180, ky50, z1h0 {
    public androidx.lifecycle.m b;
    public final w1h0 c;
    public final bpn0 d;
    public final bpn0 e;

    public y8i(Context context, int i) {
        super(context, i);
        this.c = new w1h0(new y1h0(this, new gat(this, 9)));
        this.d = new bpn0(new z0h(this, 3));
        this.e = new bpn0(new drg(this, 5));
    }

    public static void d(y8i y8iVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        super.addContentView(view, layoutParams);
    }

    public void b(boolean z) {
        dismiss();
    }

    public void c() {
        dismiss();
    }

    public final androidx.lifecycle.m e() {
        androidx.lifecycle.m mVar = this.b;
        if (mVar != null) {
            return mVar;
        }
        androidx.lifecycle.m mVar2 = new androidx.lifecycle.m(this, true);
        this.b = mVar2;
        return mVar2;
    }

    public final void g() {
        gqo.f(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        lyd.h(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // xsna.f5z
    public final Lifecycle getLifecycle() {
        return e();
    }

    @Override // xsna.ky50
    public final jy50 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().c().c;
    }

    @Override // xsna.r180
    public final p180 getOnBackPressedDispatcher() {
        return (p180) this.e.getValue();
    }

    @Override // xsna.z1h0
    public final v1h0 getSavedStateRegistry() {
        return this.c.b;
    }

    @Override // android.app.Dialog
    @ozl
    public void onBackPressed() {
        ((nzm) this.d.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            p180 onBackPressedDispatcher = getOnBackPressedDispatcher();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackPressedDispatcher.e(onBackInvokedDispatcher);
        }
        this.c.a(bundle);
        e().c(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        this.c.b(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        e().c(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        e().c(Lifecycle.Event.ON_DESTROY);
        this.b = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        g();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        g();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        super.setContentView(view, layoutParams);
    }
}
