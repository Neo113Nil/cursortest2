package com.vkontakte.android;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.themes.ThemableActivity;
import com.vk.log.L;
import com.vk.toggle.Features;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.activities.LogoutReceiver;
import io.reactivex.rxjava3.disposables.b;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.aeg0;
import xsna.asu0;
import xsna.bpn0;
import xsna.dhr0;
import xsna.fnj;
import xsna.g40;
import xsna.gej;
import xsna.iah0;
import xsna.lvo;
import xsna.o25;
import xsna.oen;
import xsna.psi;
import xsna.ruo;
import xsna.t5m;
import xsna.tb0;
import xsna.u1u0;
import xsna.uwp0;
import xsna.vbs;
import xsna.w8i;
import xsna.wyo0;
import xsna.xbs;
import xsna.xuo;

/* loaded from: classes11.dex */
public class VKActivity extends ThemableActivity implements xbs, aeg0, w8i {
    public static boolean u = false;
    public wyo0 o;
    public boolean q;
    public vbs s;
    public boolean l = false;
    public int m = 0;
    public LogoutReceiver n = null;
    public final b p = new b();
    public boolean r = true;

    @Nullable
    public CopyOnWriteArrayList t = null;

    public void Li(tb0 tb0Var) {
        if (this.t == null) {
            this.t = new CopyOnWriteArrayList();
        }
        this.t.add(new WeakReference(tb0Var));
    }

    @Override // com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity
    public void O1(Configuration configuration) {
        try {
            Trace.beginSection("VKActivity.onOverriddenConfigurationChanged");
            super.O1(configuration);
            boolean z = this.q;
            HashSet hashSet = iah0.a;
            if (z != fnj.b(this)) {
                CoreFeatures coreFeatures = CoreFeatures.FOLDABLE_FLOW;
                coreFeatures.getClass();
                if (com.vk.toggle.b.A.a(coreFeatures)) {
                    R1();
                }
            }
            this.q = fnj.b(this);
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void R1() {
        L.p("Fold device screen switched");
    }

    public vbs d4() {
        return n();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        try {
            return super.dispatchKeyEvent(keyEvent);
        } catch (Exception e) {
            uwp0.c(this, e, keyEvent);
            return false;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            uwp0.d(this, e, motionEvent);
            return false;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    @NonNull
    public final MenuInflater getMenuInflater() {
        if (this.o == null) {
            try {
                Trace.beginSection("VKActivity.getMenuInflater");
                dhr0.a.getClass();
                this.o = new wyo0(dhr0.E());
            } finally {
                Trace.endSection();
            }
        }
        return this.o;
    }

    @Override // com.vk.core.ui.themes.ThemableActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    @Nullable
    public Object getSystemService(@NonNull String str) {
        if (str.equals("connectivity")) {
            AtomicBoolean atomicBoolean = psi.b;
            if (psi.d) {
                return new psi((ConnectivityManager) super.getSystemService(str));
            }
        }
        return super.getSystemService(str);
    }

    @Override // xsna.xbs
    public final synchronized vbs n() {
        try {
            if (this.s == null) {
                try {
                    Trace.beginSection("VKActivity.getFragmentManagerImpl");
                    this.s = new vbs(this);
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.s;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        if (this.r) {
            getWindow().setStatusBarColor(this.m);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        if (this.r) {
            this.m = getWindow().getStatusBarColor();
            getWindow().setStatusBarColor(dhr0.t.c(R.attr.vk_legacy_header_background));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        try {
            Trace.beginSection("VKActivity.onActivityResult");
            super.onActivityResult(i, i2, intent);
            CopyOnWriteArrayList copyOnWriteArrayList = this.t;
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                int i3 = 0;
                while (i3 < this.t.size()) {
                    tb0 tb0Var = (tb0) ((WeakReference) this.t.get(i3)).get();
                    if (tb0Var != null) {
                        tb0Var.onActivityResult(i, i2, intent);
                    } else {
                        this.t.remove(i3);
                        i3--;
                    }
                    i3++;
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        try {
            Trace.beginSection("VKActivity.super.onAttachedToWindow");
            super.onAttachedToWindow();
            Trace.endSection();
            try {
                Trace.beginSection("VKActivity.onAttachedToWindow DisplayCutoutHelper");
                ((SharedPreferences) oen.a.getValue()).edit().putBoolean("has_display_cutout", iah0.n(this)).putInt("height_display_cutout", iah0.e(this)).putInt("top_insets_display", iah0.h(this, true)).apply();
            } finally {
            }
        } finally {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        try {
            super.onBackPressed();
        } catch (Exception e) {
            L.i(e);
        }
    }

    @Override // com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            Trace.beginSection("VKActivity.onCreate");
            super.onCreate(bundle);
            int i = 1;
            if (!u && o25.a().b() && BuildInfo.s()) {
                asu0.a.getClass();
                asu0.q().submit(new gej(i));
                u = true;
            }
            HashSet hashSet = iah0.a;
            this.q = fnj.b(this);
            if (!isTaskRoot() && getActionBar() != null) {
                getActionBar().setDisplayHomeAsUpEnabled(true);
            }
            bpn0 bpn0Var = t5m.a;
            if ("Meizu".equalsIgnoreCase(Build.MANUFACTURER)) {
                try {
                    Class.forName("com.android.internal.widget.MzActionBarView");
                    if (getActionBar() != null) {
                        getActionBar().setIcon(new ColorDrawable(0));
                        getActionBar().setDisplayShowHomeEnabled(true);
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                this.r = extras.getBoolean("repaintStatusBar", true);
            }
            try {
                Trace.beginSection("VKActivity.onCreate logoutReceiver");
                this.n = LogoutReceiver.a(this);
                Trace.endSection();
                try {
                    Trace.beginSection("VKActivity.onCreate EasterEggsComponent");
                    ruo ruoVar = (ruo) ruo.g.getValue();
                    ruoVar.getClass();
                    if (com.vk.toggle.b.A.a(Features.Type.FEATURE_EASTER_EGGS)) {
                        new lvo(this, (xuo) ruoVar.c.getValue(), ruoVar.d, ruoVar.f);
                    }
                    Trace.endSection();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.p.dispose();
        this.n.b();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        try {
            Trace.beginSection("VKActivity.onPause");
            super.onPause();
            this.l = false;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        try {
            Trace.beginSection("VKActivity.onResume");
            super.onResume();
            this.l = true;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        try {
            Trace.beginSection("VKActivity.onStart");
            super.onStart();
            Trace.beginSection("VKActivity.onStart VkTracker");
            com.vk.metrics.eventtracking.b.a.i(this);
            Trace.endSection();
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.vk.metrics.eventtracking.b.a.j(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, xsna.g23
    public final void onSupportActionModeStarted(g40 g40Var) {
        super.onSupportActionModeStarted(g40Var);
        u1u0.c(this, g40Var);
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        try {
            super.setRequestedOrientation(i);
        } catch (Exception e) {
            uwp0.b(this, e);
        }
    }

    public void yk(tb0 tb0Var) {
        if (this.t != null) {
            for (int i = 0; i < this.t.size(); i++) {
                if (((WeakReference) this.t.get(i)).get() == tb0Var) {
                    this.t.remove(i);
                    return;
                }
            }
        }
    }
}
