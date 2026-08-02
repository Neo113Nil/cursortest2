package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;

/* loaded from: classes12.dex */
public abstract class bwy0 implements t9y0 {
    public final t9y0 b;
    public z65 c;

    public bwy0(t9y0 t9y0Var, z65 z65Var) {
        this.b = t9y0Var;
        this.c = z65Var;
        t9y0Var.e(this);
        t9y0Var.d(this);
    }

    @Override // xsna.t9y0
    public boolean a() {
        return this.b.a();
    }

    @Override // xsna.t9y0
    public void b() {
        this.b.b();
    }

    @Override // xsna.t9y0
    public boolean c() {
        return this.b.c();
    }

    @Override // xsna.t9y0
    public String d() {
        return null;
    }

    @Override // xsna.t9y0
    public void destroy() {
        this.c = null;
        this.b.destroy();
    }

    @Override // xsna.t9y0
    public final String e() {
        return this.b.e();
    }

    @Override // xsna.t9y0
    public boolean f() {
        return this.b.f();
    }

    @Override // xsna.t9y0
    public Context g() {
        return this.b.g();
    }

    @Override // xsna.t9y0
    public boolean h() {
        return this.b.h();
    }

    @Override // xsna.t9y0
    public String i() {
        return null;
    }

    @Override // xsna.t9y0
    public boolean j() {
        return false;
    }

    @Override // xsna.t9y0
    public IIgniteServiceAPI k() {
        return this.b.k();
    }

    @Override // xsna.ray0
    public void onCredentialsRequestFailed(String str) {
        this.b.onCredentialsRequestFailed(str);
    }

    @Override // xsna.ray0
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.b.onCredentialsRequestSuccess(str, str2);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.b.onServiceConnected(componentName, iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.b.onServiceDisconnected(componentName);
    }

    @Override // xsna.t9y0
    public void a(String str) {
        z65 z65Var = this.c;
        if (z65Var != null) {
            z65Var.onIgniteServiceAuthenticationFailed(str);
        }
    }

    @Override // xsna.t9y0
    public void b(String str) {
        z65 z65Var = this.c;
        if (z65Var != null) {
            z65Var.onIgniteServiceConnectionFailed(str);
        }
    }

    @Override // xsna.t9y0
    public void c(String str) {
        z65 z65Var = this.c;
        if (z65Var != null) {
            z65Var.onIgniteServiceAuthenticated(str);
        }
    }

    @Override // xsna.t9y0
    public final void d(bwy0 bwy0Var) {
        this.b.d(bwy0Var);
    }

    @Override // xsna.t9y0
    public final void e(bwy0 bwy0Var) {
        this.b.e(bwy0Var);
    }

    @Override // xsna.t9y0
    public void b(ComponentName componentName, IBinder iBinder) {
        z65 z65Var = this.c;
        if (z65Var != null) {
            z65Var.onIgniteServiceConnected(componentName, iBinder);
        }
    }
}
