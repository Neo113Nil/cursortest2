package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.internal.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class my81 extends yst {
    public final String b = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";
    public final ust c;

    public my81(ust ustVar) {
        this.c = ustVar;
    }

    @Override // defpackage.yst
    public final lta0 a() {
        throw new UnsupportedOperationException(this.b);
    }

    @Override // defpackage.yst
    public final void b() {
        throw new UnsupportedOperationException(this.b);
    }

    @Override // defpackage.yst
    public final void c() {
        throw new UnsupportedOperationException(this.b);
    }

    @Override // defpackage.yst
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw new UnsupportedOperationException(this.b);
    }

    @Override // defpackage.yst
    public final a e(a aVar) {
        ust ustVar = this.c;
        ustVar.getClass();
        aVar.l();
        ustVar.j.zau(ustVar, 1, aVar);
        return aVar;
    }

    @Override // defpackage.yst
    public final Context h() {
        return this.c.a;
    }

    @Override // defpackage.yst
    public final Looper i() {
        return this.c.f;
    }

    @Override // defpackage.yst
    public final void m(xz81 xz81Var) {
        throw new UnsupportedOperationException(this.b);
    }

    @Override // defpackage.yst
    public final void n(wst wstVar) {
        throw new UnsupportedOperationException(this.b);
    }

    @Override // defpackage.yst
    public final void p(xz81 xz81Var) {
        throw new UnsupportedOperationException(this.b);
    }
}
