package com.vkontakte.android;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.FitSystemWindowsFragmentWrapperFrameLayout;
import com.vk.metrics.eventtracking.b;
import com.vk.navigation.NavigationDelegateActivity;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.dhr0;
import xsna.fes;
import xsna.fnj;
import xsna.iah0;
import xsna.mnh0;
import xsna.o0q0;
import xsna.o25;
import xsna.oz50;
import xsna.rsr;
import xsna.tb0;
import xsna.wwc0;
import xsna.xdr0;
import xsna.z4g;

@SuppressLint({"Registered"})
/* loaded from: classes11.dex */
public class FragmentWrapperActivity extends NavigationDelegateActivity implements o0q0 {
    public CopyOnWriteArrayList w;
    public boolean x = false;
    public FragmentEntry y = null;

    @Override // com.vkontakte.android.VKActivity, xsna.aeg0
    public final void Li(tb0 tb0Var) {
        if (this.w == null) {
            this.w = new CopyOnWriteArrayList();
        }
        this.w.add(tb0Var);
    }

    @Override // com.vk.navigation.NavigationDelegateActivity
    public final boolean V1() {
        return false;
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.x) {
            overridePendingTransition(0, 0);
        }
    }

    @Override // xsna.o0q0
    public final Fragment getUiTrackingFragment() {
        FragmentEntry fragmentEntry = this.y;
        Class<? extends FragmentImpl> cls = fragmentEntry != null ? fragmentEntry.b : null;
        if (cls != null) {
            return Y().p(cls);
        }
        return null;
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        CopyOnWriteArrayList copyOnWriteArrayList = this.w;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((tb0) it.next()).onActivityResult(i, i2, intent);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ed, code lost:
    
        if (xsna.fnj.d(r7) == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013d  */
    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle bundle) {
        FragmentEntry c;
        Intent intent = getIntent();
        intent.setExtrasClassLoader(getClassLoader());
        String type = intent.getType();
        if (type != null && type.equals("push_type_key")) {
            z4g.d().J(this, intent);
        }
        try {
            Bundle bundleExtra = getIntent().getBundleExtra("args");
            getIntent().getBooleanExtra("initialize_camera", true);
            if (bundleExtra != null && bundleExtra.getBoolean("fullscreen", false)) {
                requestWindowFeature(1);
                getWindow().setFlags(1024, 1024);
            }
            if (bundleExtra != null && bundleExtra.containsKey(X3.i.n)) {
                int i = bundleExtra.getInt(X3.i.n);
                if (i == 0) {
                    setRequestedOrientation(11);
                } else if (i == 1) {
                    setRequestedOrientation(12);
                }
            }
            if (bundleExtra != null) {
                boolean z = bundleExtra.getBoolean("withoutAnimation", false);
                this.x = z;
                if (z) {
                    overridePendingTransition(0, 0);
                }
            }
            super.onCreate(bundle);
            Window window = getWindow();
            if (window != null) {
                int c2 = dhr0.t.c(R.attr.vk_legacy_background_content);
                if (bundleExtra != null && bundleExtra.getBoolean("transparent_background", false)) {
                    c2 = 0;
                }
                window.setBackgroundDrawable(new ColorDrawable(c2));
                HashSet hashSet = iah0.a;
                if (fnj.d(this)) {
                    mnh0.w(window.getDecorView(), true);
                }
            }
            FitSystemWindowsFragmentWrapperFrameLayout fitSystemWindowsFragmentWrapperFrameLayout = new FitSystemWindowsFragmentWrapperFrameLayout(this, 0);
            fitSystemWindowsFragmentWrapperFrameLayout.setId(R.id.fragment_wrapper);
            Intent intent2 = getIntent();
            Bundle extras = intent2 != null ? intent2.getExtras() : null;
            rsr rsrVar = oz50.k;
            FragmentEntry c3 = oz50.b.c(extras);
            Class<? extends FragmentImpl> cls = c3 != null ? c3.b : null;
            boolean z2 = cls != null && wwc0.class.isAssignableFrom(cls);
            if (!o25.a().b()) {
                if (z2) {
                    HashSet hashSet2 = iah0.a;
                }
                setContentView(fitSystemWindowsFragmentWrapperFrameLayout);
                c = oz50.b.c(getIntent().getExtras());
                this.y = c;
                if (c != null && bundle == null) {
                    if (fes.class.isAssignableFrom(c.b)) {
                        fitSystemWindowsFragmentWrapperFrameLayout.setFitsSystemWindows(false);
                    }
                    boolean z3 = getIntent().getExtras().getBoolean("key_clear_top", false);
                    xdr0<NavigationDelegateActivity> Y = Y();
                    FragmentEntry fragmentEntry = this.y;
                    Y.t(fragmentEntry.b, fragmentEntry.c, z3);
                }
                HashSet hashSet3 = iah0.a;
                if (fnj.d(this)) {
                    mnh0.w(window.getDecorView(), dhr0.C().b);
                }
                dhr0.r0(this);
            }
            Y().k0(fitSystemWindowsFragmentWrapperFrameLayout);
            c = oz50.b.c(getIntent().getExtras());
            this.y = c;
            if (c != null) {
                if (fes.class.isAssignableFrom(c.b)) {
                }
                boolean z32 = getIntent().getExtras().getBoolean("key_clear_top", false);
                xdr0<NavigationDelegateActivity> Y2 = Y();
                FragmentEntry fragmentEntry2 = this.y;
                Y2.t(fragmentEntry2.b, fragmentEntry2.c, z32);
            }
            HashSet hashSet32 = iah0.a;
            if (fnj.d(this)) {
            }
            dhr0.r0(this);
        } catch (Exception e) {
            b.a.a(new Serializer.DeserializationError("Error while unboxing bundle", e));
            super.onCreate(bundle);
            finish();
        }
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        CopyOnWriteArrayList copyOnWriteArrayList = this.w;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public final void setTitle(int i) {
        setTitle(getString(i));
    }

    @Override // com.vkontakte.android.VKActivity, xsna.aeg0
    public final void yk(tb0 tb0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.w;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(tb0Var);
        }
    }
}
