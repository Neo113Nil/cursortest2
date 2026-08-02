package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.concurrent.Future;

/* loaded from: classes15.dex */
public final class aiv implements xav {
    public final xav a;
    public final jiu b;

    public aiv(xav xavVar, jiu jiuVar) {
        this.a = xavVar;
        this.b = jiuVar;
    }

    @Override // defpackage.xav
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.xav
    public final void b(String str, String str2) {
        this.a.b(str, str2);
    }

    @Override // defpackage.xav
    public final void c(ImageView imageView) {
        this.a.c(imageView);
    }

    @Override // defpackage.xav
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.xav
    public final void e(Bitmap bitmap, String str) {
        this.a.e(bitmap, str);
    }

    @Override // defpackage.xav
    public final void f(String str) {
        this.a.f(str);
    }

    @Override // defpackage.xav
    public final Future g() {
        return this.a.g();
    }

    @Override // defpackage.xav
    public final g9v load(String str) {
        return (g9v) this.b.invoke(this.a.load(str));
    }
}
