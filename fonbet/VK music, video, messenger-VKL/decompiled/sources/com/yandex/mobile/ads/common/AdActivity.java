package com.yandex.mobile.ads.common;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.activity.ComponentActivity;
import java.util.Iterator;
import xsna.s3q0;
import yads.a2;
import yads.b2;
import yads.c2;
import yads.gb2;
import yads.h2;
import yads.i2;
import yads.jb2;
import yads.k2;
import yads.lm3;
import yads.q2;
import yads.w1;
import yads.x1;
import yads.y1;
import yads.z1;
import yads.z9;

/* loaded from: classes8.dex */
public final class AdActivity extends ComponentActivity {
    private gb2 a;
    private w1 b;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        w1 w1Var = this.b;
        if (w1Var == null || w1Var.c.d()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w1 w1Var = this.b;
        if (w1Var != null) {
            b2 b2Var = w1Var.d;
            b2Var.getClass();
            int i = configuration.orientation;
            if (i != b2Var.c) {
                Iterator it = b2Var.a.iterator();
                if (it.hasNext()) {
                    a2.a(it.next());
                    throw null;
                }
                b2Var.c = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        if (r9 == (-1)) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008b  */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        Long l;
        z9 z9Var;
        k2 a;
        Throwable th;
        h2 a2;
        AdActivity adActivity;
        w1 w1Var;
        gb2 a3;
        super.onCreate(bundle);
        b2 b2Var = new b2(this);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        Intent intent = getIntent();
        s3q0 s3q0Var = null;
        if (intent != null) {
            Window window = getWindow();
            z1 a4 = y1.a();
            try {
                if (intent.hasExtra("data_identifier")) {
                    long longExtra = intent.getLongExtra("data_identifier", -1L);
                    l = Long.valueOf(longExtra);
                }
            } catch (Exception unused) {
            }
            l = null;
            x1 a5 = l != null ? a4.a(l.longValue()) : null;
            if (a5 != null) {
                try {
                    z9Var = a5.c;
                } catch (Exception unused2) {
                }
                q2 q2Var = new q2(this, z9Var);
                a = k2.b.a();
                synchronized (a) {
                    try {
                        String stringExtra = intent.getStringExtra("window_type");
                        if (stringExtra != null) {
                            try {
                                i2 i2Var = (i2) a.a.get(stringExtra);
                                if (i2Var != null) {
                                    a2 = i2Var.a(this, relativeLayout, q2Var, b2Var, intent, window, a5);
                                    if (a2 == null) {
                                        adActivity = this;
                                        w1Var = new w1(adActivity, relativeLayout, a2, b2Var, new lm3());
                                    } else {
                                        adActivity = this;
                                        w1Var = null;
                                    }
                                    adActivity.b = w1Var;
                                    if (w1Var != null) {
                                        w1Var.c.f();
                                        w1Var.c.c();
                                        RelativeLayout relativeLayout2 = w1Var.b;
                                        w1Var.e.getClass();
                                        relativeLayout2.setTag(lm3.a("root_layout"));
                                        w1Var.a.setContentView(w1Var.b);
                                        s3q0Var = s3q0.a;
                                    }
                                    if (s3q0Var == null) {
                                        finish();
                                    }
                                    a3 = jb2.a(this, adActivity.b);
                                    adActivity.a = a3;
                                    if (a3 == null) {
                                        a3.a();
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
            z9Var = null;
            q2 q2Var2 = new q2(this, z9Var);
            a = k2.b.a();
            synchronized (a) {
            }
        }
        a2 = null;
        if (a2 == null) {
        }
        adActivity.b = w1Var;
        if (w1Var != null) {
        }
        if (s3q0Var == null) {
        }
        a3 = jb2.a(this, adActivity.b);
        adActivity.a = a3;
        if (a3 == null) {
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        w1 w1Var = this.b;
        if (w1Var != null) {
            w1Var.c.onAdClosed();
            w1Var.c.g();
            w1Var.b.removeAllViews();
        }
        gb2 gb2Var = this.a;
        if (gb2Var != null) {
            gb2Var.destroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        w1 w1Var = this.b;
        if (w1Var != null) {
            w1Var.c.b();
            Iterator it = w1Var.d.b.iterator();
            while (it.hasNext()) {
                ((c2) it.next()).b();
            }
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        w1 w1Var = this.b;
        if (w1Var != null) {
            w1Var.c.a();
            Iterator it = w1Var.d.b.iterator();
            while (it.hasNext()) {
                ((c2) it.next()).a();
            }
        }
    }
}
