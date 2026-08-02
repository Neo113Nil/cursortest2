package com.yandex.messaging.ui.auth;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.yandex.bricks.BrickSlotView;
import com.yandex.messaging.internal.authorized.h;
import defpackage.do3;
import defpackage.ecg;
import defpackage.fcg;
import defpackage.gc;
import defpackage.i5m;
import defpackage.jc60;
import defpackage.kgx;
import defpackage.mt11;
import defpackage.n3w;
import defpackage.nb11;
import defpackage.nf;
import defpackage.qp3;
import defpackage.v8c0;
import defpackage.z83;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\nJ)\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/messaging/ui/auth/AuthorizeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "outState", "onSaveInstanceState", "", "requestCode", "resultCode", "Landroid/content/Intent;", Constants.KEY_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "Ldo3;", "activityBrick", "Ldo3;", "Lcom/yandex/messaging/internal/authorized/h;", "userActionFailedController", "Lcom/yandex/messaging/internal/authorized/h;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AuthorizeActivity extends AppCompatActivity {
    public static final int $stable = 8;
    private do3 activityBrick;
    private final h userActionFailedController = new h(this);

    private final Bundle getArguments() {
        Bundle extras = getIntent().getExtras();
        return extras == null ? new Bundle() : extras;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        do3 do3Var = this.activityBrick;
        if (do3Var != null) {
            do3Var.onActivityResult(requestCode, resultCode, data);
        } else {
            z83.i();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fcg fcgVar = (fcg) mt11.a(this);
        getTheme().applyStyle(fcgVar.c().b(), false);
        Iterator it = fcgVar.c().a().iterator();
        while (it.hasNext()) {
            getTheme().applyStyle(((Number) it.next()).intValue(), false);
        }
        fcg fcgVar2 = fcgVar.b;
        Bundle arguments = getArguments();
        arguments.getClass();
        if (savedInstanceState == null) {
            savedInstanceState = new Bundle();
        }
        n3w a = n3w.a(this);
        v8c0 v8c0Var = new v8c0(a, 4);
        ecg ecgVar = fcgVar2.f;
        nb11 nb11Var = new nb11(ecgVar, 27);
        ecg ecgVar2 = fcgVar2.g;
        this.activityBrick = (do3) i5m.b(new gc(v8c0Var, a, nb11Var, fcgVar2.e, fcgVar2.f, new nf(ecgVar2, new jc60(ecgVar2, fcgVar2.h, ecgVar, 22), 12), fcgVar2.i, n3w.a(arguments), n3w.a(savedInstanceState))).get();
        BrickSlotView brickSlotView = new BrickSlotView(this);
        setContentView(brickSlotView, new ViewGroup.LayoutParams(-1, -1));
        do3 do3Var = this.activityBrick;
        if (do3Var != null) {
            brickSlotView.insert(do3Var);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        h hVar = this.userActionFailedController;
        qp3 qp3Var = hVar.c;
        kgx[] kgxVarArr = h.g;
        kgx kgxVar = kgxVarArr[0];
        qp3Var.b(null);
        qp3 qp3Var2 = hVar.d;
        kgx kgxVar2 = kgxVarArr[1];
        qp3Var2.b(null);
        qp3 qp3Var3 = hVar.e;
        kgx kgxVar3 = kgxVarArr[2];
        qp3Var3.b(null);
        qp3 qp3Var4 = hVar.f;
        kgx kgxVar4 = kgxVarArr[3];
        qp3Var4.b(null);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.userActionFailedController.a();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        do3 do3Var = this.activityBrick;
        if (do3Var != null) {
            outState.putBoolean("extra_auth_in_progress", do3Var.B);
        } else {
            z83.i();
        }
    }
}
