package com.yandex.messaging.ui.auth;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import defpackage.ccg;
import defpackage.fcg;
import defpackage.h1u;
import defpackage.kt11;
import defpackage.lt11;
import defpackage.mt11;
import defpackage.ny61;
import defpackage.oo90;
import defpackage.q5z;
import defpackage.th40;
import defpackage.vbb;
import defpackage.x22;
import defpackage.z83;
import defpackage.zy11;
import java.util.Iterator;

/* loaded from: classes15.dex */
public class ProxyPassportActivity extends AppCompatActivity {
    public static final String ACTION_BIND_PHONE = "BIND_PHONE";
    static final String ACTION_LOGIN = "LOGIN";
    private static final int BIND_PHONE_REQUEST = 2;
    private static final String EXTRA_ACTION = "action";
    public static final String KEY_PHONE_NUMBER = "phone_number";
    private static final int LOGIN_REQUEST_CODE = 1;
    private lt11 mAppComponent;

    private boolean isActionProcessed(Bundle bundle, String str) {
        return bundle != null && bundle.containsKey("action") && str.equals(bundle.getString("action"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zy11 lambda$onActivityResult$1(int i, int i2, Intent intent, kt11 kt11Var) {
        x22 t = ((fcg) this.mAppComponent).a.t();
        q5z.h(t);
        vbb vbbVar = new vbb(((ccg) kt11Var).b, this, false);
        String resultCodeToAnswer = resultCodeToAnswer(i);
        if (i2 == 1) {
            t.c("am account answer", "answer", resultCodeToAnswer);
            vbbVar.Q().b(i, intent);
        }
        if (i2 == 2) {
            t.c("am phone number answer", "answer", resultCodeToAnswer);
            vbbVar.Q().a(i);
        }
        setResult(i);
        finish();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zy11 lambda$onCreate$0(Bundle bundle, String str, kt11 kt11Var) {
        oo90 R = new vbb(((ccg) kt11Var).b, this, false).R();
        if (!isActionProcessed(bundle, str)) {
            str.getClass();
            if (str.equals(ACTION_BIND_PHONE)) {
                Intent a = R.a(getIntent().getStringExtra(KEY_PHONE_NUMBER));
                if (a != null) {
                    startActivityForResult(a, 2);
                }
            } else {
                if (!str.equals(ACTION_LOGIN)) {
                    ny61.r("known action is expected, action = ".concat(str));
                    return null;
                }
                Intent b = R.b("action_login");
                if (b != null) {
                    startActivityForResult(b, 1);
                }
            }
        }
        return zy11.a;
    }

    private String resultCodeToAnswer(int i) {
        return i == -1 ? "success" : "fail";
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        z83.d(this.mAppComponent, null);
        ((fcg) this.mAppComponent).b().a(new h1u(i2, i, 1, this, intent));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (action == null) {
            ny61.r("null action isn't expected");
            return;
        }
        lt11 a = mt11.a(this);
        this.mAppComponent = a;
        getTheme().applyStyle(((fcg) a).c().b(), false);
        Iterator it = ((fcg) this.mAppComponent).c().a().iterator();
        while (it.hasNext()) {
            getTheme().applyStyle(((Integer) it.next()).intValue(), false);
        }
        ((fcg) this.mAppComponent).b().a(new th40(this, bundle, action, 20));
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("action", getIntent().getAction());
        super.onSaveInstanceState(bundle);
    }
}
