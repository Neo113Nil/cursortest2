package com.yandex.mobile.ads.common;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.activity.ComponentActivity;
import defpackage.br81;
import defpackage.c881;
import defpackage.cf71;
import defpackage.ch81;
import defpackage.cl81;
import defpackage.hz61;
import defpackage.kb81;
import defpackage.la71;
import defpackage.lk81;
import defpackage.m271;
import defpackage.o3;
import defpackage.ow81;
import defpackage.qe81;
import defpackage.s871;
import defpackage.unr0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/mobile/ads/common/AdActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdActivity extends ComponentActivity {
    private c881 a;
    private ch81 b;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ch81 ch81Var = this.b;
        if (ch81Var == null || ch81Var.c.d()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ch81 ch81Var = this.b;
        if (ch81Var != null) {
            o3 o3Var = ch81Var.d;
            int i = configuration.orientation;
            if (i != o3Var.b) {
                Iterator it = ((Set) o3Var.w).iterator();
                if (it.hasNext()) {
                    throw unr0.i(it);
                }
                o3Var.b = i;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(1:3)(11:30|(2:32|22)|43|44|(2:46|47)|75|(1:50)(1:73)|(17:69|70|53|70|(1:6)(1:29)|7|(1:9)|(1:11)|12|13|14|(1:16)(1:25)|17|18|(1:20)|21|22)|52|53|70)|4|(0)(0)|7|(0)|(0)|12|13|14|(0)(0)|17|18|(0)|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ce, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d7, code lost:
    
        r12 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004c, code lost:
    
        if (r9 == (-1)) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c8 A[Catch: all -> 0x00ce, TryCatch #2 {all -> 0x00ce, blocks: (B:14:0x00c2, B:16:0x00c8, B:25:0x00d1), top: B:13:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1 A[Catch: all -> 0x00ce, TRY_LEAVE, TryCatch #2 {all -> 0x00ce, blocks: (B:14:0x00c2, B:16:0x00c8, B:25:0x00d1), top: B:13:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009d  */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        Long l;
        cl81 cl81Var;
        s871 a;
        AdActivity adActivity;
        m271 m271Var;
        hz61 a2;
        ch81 ch81Var;
        Object failure;
        super.onCreate(bundle);
        o3 o3Var = new o3(this);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        Intent intent = getIntent();
        zy11 zy11Var = null;
        if (intent == null) {
            adActivity = this;
        } else {
            Window window = getWindow();
            br81 br81Var = br81.c;
            if (br81Var == null) {
                synchronized (br81.b) {
                    br81Var = br81.c;
                    if (br81Var == null) {
                        br81Var = new br81();
                        br81.c = br81Var;
                    }
                }
            }
            try {
                if (intent.hasExtra("data_identifier")) {
                    long longExtra = intent.getLongExtra("data_identifier", -1L);
                    l = Long.valueOf(longExtra);
                }
            } catch (Exception unused) {
            }
            l = null;
            lk81 a3 = l != null ? br81Var.a(l.longValue()) : null;
            if (a3 != null) {
                try {
                    cl81Var = a3.c;
                } catch (Exception unused2) {
                }
                cf71 cf71Var = new cf71((Object) this, (Object) cl81Var, false, 11);
                a = s871.b.a();
                synchronized (a) {
                    String stringExtra = intent.getStringExtra("window_type");
                    if (stringExtra == null || (m271Var = (m271) a.a.get(stringExtra)) == null) {
                        adActivity = this;
                    } else {
                        adActivity = this;
                        a2 = m271Var.a(adActivity, relativeLayout, cf71Var, o3Var, intent, window, a3);
                    }
                }
                ch81Var = a2 == null ? new ch81(adActivity, relativeLayout, a2, o3Var) : null;
                adActivity.b = ch81Var;
                if (ch81Var != null) {
                    ch81Var.c.f();
                    ch81Var.c.c();
                    ch81Var.b.setTag(la71.a("root_layout"));
                    ch81Var.a.setContentView(ch81Var.b);
                    zy11Var = zy11.a;
                }
                if (zy11Var == null) {
                    adActivity.finish();
                }
                failure = Build.VERSION.SDK_INT < 33 ? new qe81(adActivity, adActivity.b) : new kb81();
                if (Result.a(failure) != null) {
                    failure = new kb81();
                }
                c881 c881Var = (c881) failure;
                adActivity.a = c881Var;
                c881Var.a();
            }
            cl81Var = null;
            cf71 cf71Var2 = new cf71((Object) this, (Object) cl81Var, false, 11);
            a = s871.b.a();
            synchronized (a) {
            }
        }
        a2 = null;
        if (a2 == null) {
        }
        adActivity.b = ch81Var;
        if (ch81Var != null) {
        }
        if (zy11Var == null) {
        }
        if (Build.VERSION.SDK_INT < 33) {
        }
        if (Result.a(failure) != null) {
        }
        c881 c881Var2 = (c881) failure;
        adActivity.a = c881Var2;
        c881Var2.a();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        ch81 ch81Var = this.b;
        if (ch81Var != null) {
            hz61 hz61Var = ch81Var.c;
            hz61Var.o();
            hz61Var.g();
            ch81Var.b.removeAllViews();
        }
        c881 c881Var = this.a;
        if (c881Var != null) {
            c881Var.destroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        ch81 ch81Var = this.b;
        if (ch81Var != null) {
            ch81Var.c.mo493b();
            Iterator it = ((Set) ch81Var.d.c).iterator();
            while (it.hasNext()) {
                ((ow81) it.next()).b();
            }
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        ch81 ch81Var = this.b;
        if (ch81Var != null) {
            ch81Var.c.mo492a();
            Iterator it = ((Set) ch81Var.d.c).iterator();
            while (it.hasNext()) {
                ((ow81) it.next()).a();
            }
        }
    }
}
