package xsna;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import com.vk.core.simplescreen.ScreenContainer;

/* compiled from: BaseScreen.java */
/* loaded from: classes17.dex */
public abstract class em6 {
    public final Handler b = new Handler(Looper.getMainLooper());
    public boolean c = false;
    public boolean d = false;
    public View e;
    public ScreenContainer f;

    public abstract View b(LayoutInflater layoutInflater);

    public void c() {
        ScreenContainer screenContainer;
        if (this.c || (screenContainer = this.f) == null) {
            return;
        }
        screenContainer.a();
    }

    public final Activity d() {
        ScreenContainer screenContainer = this.f;
        if (screenContainer != null) {
            return screenContainer.c;
        }
        return null;
    }

    public View e(LayoutInflater layoutInflater) {
        if (this.e == null) {
            View b = b(layoutInflater);
            this.e = b;
            b.setClickable(true);
        }
        return this.e;
    }

    public void f(int i, Intent intent) {
        ScreenContainer screenContainer = this.f;
        if (screenContainer != null) {
            screenContainer.getCurrentScreen().f(i, intent);
        }
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.c = true;
    }

    public void i() {
        this.d = false;
    }

    public void j() {
        this.d = true;
    }

    public final void l(boolean z) {
        Window window = d().getWindow();
        if (window == null) {
            return;
        }
        if (z) {
            window.addFlags(128);
        } else {
            window.clearFlags(128);
        }
    }

    public void k(int i) {
    }
}
