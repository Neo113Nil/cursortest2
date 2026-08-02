package defpackage;

import android.app.ActivityManager;
import android.os.UserManager;
import com.google.android.gms.internal.measurement.zzmr;
import com.google.firebase.encoders.EncodingException;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.C0409i3;
import io.appmetrica.analytics.impl.C0710sg;
import io.appmetrica.analytics.impl.C0808vr;
import io.appmetrica.analytics.impl.Cg;
import io.appmetrica.analytics.impl.InterfaceC0892yo;
import io.appmetrica.analytics.impl.W0;
import java.io.EOFException;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes10.dex */
public final /* synthetic */ class ny61 implements FunctionWithThrowable, Cg {
    public final /* synthetic */ int a;

    public /* synthetic */ ny61(int i) {
        this.a = i;
    }

    public static /* synthetic */ void A() {
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void B(String str) {
        throw new zzmr(str);
    }

    public static /* synthetic */ void b() {
        throw new EOFException();
    }

    public static void c(int i) {
        throw new UnknownFieldException(oyr.i(i, "An unknown field for index "));
    }

    public static /* synthetic */ void d(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    public static /* synthetic */ void e(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void f(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void g(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void h(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static /* synthetic */ void i(StringBuilder sb, int i) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void j(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void k() {
        throw new IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    public static /* synthetic */ void m(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void n(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void o(Throwable th) {
        throw new IllegalStateException(th);
    }

    public static /* synthetic */ void p() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void q(int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "serialized size must be non-negative, was ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void r(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void s() {
        throw new IndexOutOfBoundsException();
    }

    public static /* synthetic */ void t(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void u() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void v(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void w() {
        throw new AssertionError();
    }

    public static /* synthetic */ void x(String str) {
        throw new EncodingException(str);
    }

    public static /* synthetic */ void y() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void z(String str) {
        throw new SecurityException(str);
    }

    @Override // io.appmetrica.analytics.impl.Cg
    public InterfaceC0892yo a(W0 w0) {
        return C0710sg.a(w0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public Object mo489apply(Object obj) {
        Boolean a;
        switch (this.a) {
            case 8:
                a = C0409i3.a((ActivityManager) obj);
                return a;
            default:
                return C0808vr.a((UserManager) obj);
        }
    }
}
