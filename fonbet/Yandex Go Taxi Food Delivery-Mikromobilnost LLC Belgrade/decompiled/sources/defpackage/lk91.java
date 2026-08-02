package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.core.j;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.internal.FrameworkClassParsingException;
import io.flutter.plugins.camerax.CameraXError;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public abstract class lk91 {
    public static final Object a = new Object();

    public static final void a(e541 e541Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(668806736);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(e541Var) : btsVar.e(e541Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            rzo.b(null, "default", wwg.S(-1051855764, true, new nvs0(tlsVar, e541Var, tlsVar2), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b3z0(e541Var, tlsVar, tlsVar2, i, 17);
        }
    }

    public static final Exception b(r3m r3mVar, String str, Exception exc) {
        if (exc instanceof CreatePublicKeyCredentialDomException) {
            return new CreatePublicKeyCredentialDomException(r3mVar, str);
        }
        if (exc instanceof GetPublicKeyCredentialDomException) {
            return new GetPublicKeyCredentialDomException(r3mVar, str);
        }
        throw new FrameworkClassParsingException();
    }

    public static String c(String str, Throwable th) {
        String g = g(th);
        if (TextUtils.isEmpty(g)) {
            return str;
        }
        StringBuilder v = oyr.v(str, "\n  ");
        v.append(g.replace("\n", "\n  "));
        v.append('\n');
        return v.toString();
    }

    public static void d(String str) {
        synchronized (a) {
            c(str, null);
        }
    }

    public static void e(String str, String str2) {
        synchronized (a) {
            Log.e(str, c(str2, null));
        }
    }

    public static void f(String str, String str2, Throwable th) {
        synchronized (a) {
            Log.e(str, c(str2, th));
        }
    }

    public static String g(Throwable th) {
        boolean z;
        if (th == null) {
            return null;
        }
        synchronized (a) {
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    z = false;
                    break;
                }
                try {
                    if (th2 instanceof UnknownHostException) {
                        z = true;
                        break;
                    }
                    th2 = th2.getCause();
                } finally {
                }
            }
            if (z) {
                return "UnknownHostException (no network)";
            }
            return Log.getStackTraceString(th).trim().replace("\t", Extension.TAB_CHAR);
        }
    }

    public static void h(String str, String str2) {
        synchronized (a) {
            Log.i(str, c(str2, null));
        }
    }

    public static void i(tt5 tt5Var, final n52 n52Var) {
        rs10 j = n52Var != null ? n52Var.a.j() : new bu7();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ProcessCameraProvider.getInstance", j, obj);
        if (n52Var != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: ssb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    pey m;
                    List g3;
                    List g4;
                    List g5;
                    int i2 = i;
                    boolean z = true;
                    n52 n52Var2 = n52Var;
                    switch (i2) {
                        case 0:
                            wrb0 wrb0Var = new wrb0(ce5Var, 8);
                            pbj pbjVar = n52Var2.a;
                            Context context = (Context) pbjVar.A;
                            i5f0 i5f0Var = i5f0.b;
                            o89 c = v5a1.c(context);
                            c.c(new yo90(21, c, wrb0Var), ((Context) pbjVar.A).getMainExecutor());
                            return;
                        case 1:
                            i5f0 i5f0Var2 = (i5f0) ((List) obj2).get(0);
                            try {
                                n52Var2.getClass();
                                g = Collections.singletonList(i5f0Var2.a.a());
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            return;
                        case 2:
                            List list = (List) obj2;
                            i5f0 i5f0Var3 = (i5f0) list.get(0);
                            xs7 xs7Var = (xs7) list.get(1);
                            List list2 = (List) list.get(2);
                            try {
                                m = n52Var2.a.m();
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            if (m == null) {
                                throw new IllegalStateException("LifecycleOwner must be set to get ProcessCameraProvider instance.");
                            }
                            g2 = Collections.singletonList(i5f0Var3.d(m, xs7Var, (j[]) list2.toArray(new j[0])));
                            ce5Var.a(g2);
                            return;
                        case 3:
                            List list3 = (List) obj2;
                            i5f0 i5f0Var4 = (i5f0) list3.get(0);
                            j jVar = (j) list3.get(1);
                            try {
                                n52Var2.getClass();
                                Iterator it = i5f0Var4.a.d.d().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z = false;
                                    } else if (((ody) it.next()).s(jVar)) {
                                    }
                                }
                                g3 = Collections.singletonList(Boolean.valueOf(z));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                        case 4:
                            List list4 = (List) obj2;
                            i5f0 i5f0Var5 = (i5f0) list4.get(0);
                            List list5 = (List) list4.get(1);
                            try {
                                n52Var2.getClass();
                                i5f0Var5.f((j[]) list5.toArray(new j[0]));
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        default:
                            i5f0 i5f0Var6 = (i5f0) ((List) obj2).get(0);
                            try {
                                n52Var2.getClass();
                                i5f0Var6.g();
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ProcessCameraProvider.getAvailableCameraInfos", j, obj);
        if (n52Var != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: ssb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    pey m;
                    List g3;
                    List g4;
                    List g5;
                    int i22 = i2;
                    boolean z = true;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            wrb0 wrb0Var = new wrb0(ce5Var, 8);
                            pbj pbjVar = n52Var2.a;
                            Context context = (Context) pbjVar.A;
                            i5f0 i5f0Var = i5f0.b;
                            o89 c = v5a1.c(context);
                            c.c(new yo90(21, c, wrb0Var), ((Context) pbjVar.A).getMainExecutor());
                            return;
                        case 1:
                            i5f0 i5f0Var2 = (i5f0) ((List) obj2).get(0);
                            try {
                                n52Var2.getClass();
                                g = Collections.singletonList(i5f0Var2.a.a());
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            return;
                        case 2:
                            List list = (List) obj2;
                            i5f0 i5f0Var3 = (i5f0) list.get(0);
                            xs7 xs7Var = (xs7) list.get(1);
                            List list2 = (List) list.get(2);
                            try {
                                m = n52Var2.a.m();
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            if (m == null) {
                                throw new IllegalStateException("LifecycleOwner must be set to get ProcessCameraProvider instance.");
                            }
                            g2 = Collections.singletonList(i5f0Var3.d(m, xs7Var, (j[]) list2.toArray(new j[0])));
                            ce5Var.a(g2);
                            return;
                        case 3:
                            List list3 = (List) obj2;
                            i5f0 i5f0Var4 = (i5f0) list3.get(0);
                            j jVar = (j) list3.get(1);
                            try {
                                n52Var2.getClass();
                                Iterator it = i5f0Var4.a.d.d().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z = false;
                                    } else if (((ody) it.next()).s(jVar)) {
                                    }
                                }
                                g3 = Collections.singletonList(Boolean.valueOf(z));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                        case 4:
                            List list4 = (List) obj2;
                            i5f0 i5f0Var5 = (i5f0) list4.get(0);
                            List list5 = (List) list4.get(1);
                            try {
                                n52Var2.getClass();
                                i5f0Var5.f((j[]) list5.toArray(new j[0]));
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        default:
                            i5f0 i5f0Var6 = (i5f0) ((List) obj2).get(0);
                            try {
                                n52Var2.getClass();
                                i5f0Var6.g();
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ProcessCameraProvider.bindToLifecycle", j, obj);
        if (n52Var != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: ssb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    pey m;
                    List g3;
                    List g4;
                    List g5;
                    int i22 = i3;
                    boolean z = true;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            wrb0 wrb0Var = new wrb0(ce5Var, 8);
                            pbj pbjVar = n52Var2.a;
                            Context context = (Context) pbjVar.A;
                            i5f0 i5f0Var = i5f0.b;
                            o89 c = v5a1.c(context);
                            c.c(new yo90(21, c, wrb0Var), ((Context) pbjVar.A).getMainExecutor());
                            return;
                        case 1:
                            i5f0 i5f0Var2 = (i5f0) ((List) obj2).get(0);
                            try {
                                n52Var2.getClass();
                                g = Collections.singletonList(i5f0Var2.a.a());
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            return;
                        case 2:
                            List list = (List) obj2;
                            i5f0 i5f0Var3 = (i5f0) list.get(0);
                            xs7 xs7Var = (xs7) list.get(1);
                            List list2 = (List) list.get(2);
                            try {
                                m = n52Var2.a.m();
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            if (m == null) {
                                throw new IllegalStateException("LifecycleOwner must be set to get ProcessCameraProvider instance.");
                            }
                            g2 = Collections.singletonList(i5f0Var3.d(m, xs7Var, (j[]) list2.toArray(new j[0])));
                            ce5Var.a(g2);
                            return;
                        case 3:
                            List list3 = (List) obj2;
                            i5f0 i5f0Var4 = (i5f0) list3.get(0);
                            j jVar = (j) list3.get(1);
                            try {
                                n52Var2.getClass();
                                Iterator it = i5f0Var4.a.d.d().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z = false;
                                    } else if (((ody) it.next()).s(jVar)) {
                                    }
                                }
                                g3 = Collections.singletonList(Boolean.valueOf(z));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                        case 4:
                            List list4 = (List) obj2;
                            i5f0 i5f0Var5 = (i5f0) list4.get(0);
                            List list5 = (List) list4.get(1);
                            try {
                                n52Var2.getClass();
                                i5f0Var5.f((j[]) list5.toArray(new j[0]));
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        default:
                            i5f0 i5f0Var6 = (i5f0) ((List) obj2).get(0);
                            try {
                                n52Var2.getClass();
                                i5f0Var6.g();
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ProcessCameraProvider.isBound", j, obj);
        if (n52Var != null) {
            final int i4 = 3;
            m2vVar4.G(new ee5() { // from class: ssb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    pey m;
                    List g3;
                    List g4;
                    List g5;
                    int i22 = i4;
                    boolean z = true;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            wrb0 wrb0Var = new wrb0(ce5Var, 8);
                            pbj pbjVar = n52Var2.a;
                            Context context = (Context) pbjVar.A;
                            i5f0 i5f0Var = i5f0.b;
                            o89 c = v5a1.c(context);
                            c.c(new yo90(21, c, wrb0Var), ((Context) pbjVar.A).getMainExecutor());
                            return;
                        case 1:
                            i5f0 i5f0Var2 = (i5f0) ((List) obj2).get(0);
                            try {
                                n52Var2.getClass();
                                g = Collections.singletonList(i5f0Var2.a.a());
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            return;
                        case 2:
                            List list = (List) obj2;
                            i5f0 i5f0Var3 = (i5f0) list.get(0);
                            xs7 xs7Var = (xs7) list.get(1);
                            List list2 = (List) list.get(2);
                            try {
                                m = n52Var2.a.m();
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            if (m == null) {
                                throw new IllegalStateException("LifecycleOwner must be set to get ProcessCameraProvider instance.");
                            }
                            g2 = Collections.singletonList(i5f0Var3.d(m, xs7Var, (j[]) list2.toArray(new j[0])));
                            ce5Var.a(g2);
                            return;
                        case 3:
                            List list3 = (List) obj2;
                            i5f0 i5f0Var4 = (i5f0) list3.get(0);
                            j jVar = (j) list3.get(1);
                            try {
                                n52Var2.getClass();
                                Iterator it = i5f0Var4.a.d.d().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z = false;
                                    } else if (((ody) it.next()).s(jVar)) {
                                    }
                                }
                                g3 = Collections.singletonList(Boolean.valueOf(z));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                        case 4:
                            List list4 = (List) obj2;
                            i5f0 i5f0Var5 = (i5f0) list4.get(0);
                            List list5 = (List) list4.get(1);
                            try {
                                n52Var2.getClass();
                                i5f0Var5.f((j[]) list5.toArray(new j[0]));
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        default:
                            i5f0 i5f0Var6 = (i5f0) ((List) obj2).get(0);
                            try {
                                n52Var2.getClass();
                                i5f0Var6.g();
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                    }
                }
            });
        } else {
            m2vVar4.G(null);
        }
        m2v m2vVar5 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ProcessCameraProvider.unbind", j, obj);
        if (n52Var != null) {
            final int i5 = 4;
            m2vVar5.G(new ee5() { // from class: ssb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    pey m;
                    List g3;
                    List g4;
                    List g5;
                    int i22 = i5;
                    boolean z = true;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            wrb0 wrb0Var = new wrb0(ce5Var, 8);
                            pbj pbjVar = n52Var2.a;
                            Context context = (Context) pbjVar.A;
                            i5f0 i5f0Var = i5f0.b;
                            o89 c = v5a1.c(context);
                            c.c(new yo90(21, c, wrb0Var), ((Context) pbjVar.A).getMainExecutor());
                            return;
                        case 1:
                            i5f0 i5f0Var2 = (i5f0) ((List) obj2).get(0);
                            try {
                                n52Var2.getClass();
                                g = Collections.singletonList(i5f0Var2.a.a());
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            return;
                        case 2:
                            List list = (List) obj2;
                            i5f0 i5f0Var3 = (i5f0) list.get(0);
                            xs7 xs7Var = (xs7) list.get(1);
                            List list2 = (List) list.get(2);
                            try {
                                m = n52Var2.a.m();
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            if (m == null) {
                                throw new IllegalStateException("LifecycleOwner must be set to get ProcessCameraProvider instance.");
                            }
                            g2 = Collections.singletonList(i5f0Var3.d(m, xs7Var, (j[]) list2.toArray(new j[0])));
                            ce5Var.a(g2);
                            return;
                        case 3:
                            List list3 = (List) obj2;
                            i5f0 i5f0Var4 = (i5f0) list3.get(0);
                            j jVar = (j) list3.get(1);
                            try {
                                n52Var2.getClass();
                                Iterator it = i5f0Var4.a.d.d().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z = false;
                                    } else if (((ody) it.next()).s(jVar)) {
                                    }
                                }
                                g3 = Collections.singletonList(Boolean.valueOf(z));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                        case 4:
                            List list4 = (List) obj2;
                            i5f0 i5f0Var5 = (i5f0) list4.get(0);
                            List list5 = (List) list4.get(1);
                            try {
                                n52Var2.getClass();
                                i5f0Var5.f((j[]) list5.toArray(new j[0]));
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        default:
                            i5f0 i5f0Var6 = (i5f0) ((List) obj2).get(0);
                            try {
                                n52Var2.getClass();
                                i5f0Var6.g();
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                    }
                }
            });
        } else {
            m2vVar5.G(null);
        }
        m2v m2vVar6 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ProcessCameraProvider.unbindAll", j, obj);
        if (n52Var == null) {
            m2vVar6.G(null);
        } else {
            final int i6 = 5;
            m2vVar6.G(new ee5() { // from class: ssb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    pey m;
                    List g3;
                    List g4;
                    List g5;
                    int i22 = i6;
                    boolean z = true;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            wrb0 wrb0Var = new wrb0(ce5Var, 8);
                            pbj pbjVar = n52Var2.a;
                            Context context = (Context) pbjVar.A;
                            i5f0 i5f0Var = i5f0.b;
                            o89 c = v5a1.c(context);
                            c.c(new yo90(21, c, wrb0Var), ((Context) pbjVar.A).getMainExecutor());
                            return;
                        case 1:
                            i5f0 i5f0Var2 = (i5f0) ((List) obj2).get(0);
                            try {
                                n52Var2.getClass();
                                g = Collections.singletonList(i5f0Var2.a.a());
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            return;
                        case 2:
                            List list = (List) obj2;
                            i5f0 i5f0Var3 = (i5f0) list.get(0);
                            xs7 xs7Var = (xs7) list.get(1);
                            List list2 = (List) list.get(2);
                            try {
                                m = n52Var2.a.m();
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            if (m == null) {
                                throw new IllegalStateException("LifecycleOwner must be set to get ProcessCameraProvider instance.");
                            }
                            g2 = Collections.singletonList(i5f0Var3.d(m, xs7Var, (j[]) list2.toArray(new j[0])));
                            ce5Var.a(g2);
                            return;
                        case 3:
                            List list3 = (List) obj2;
                            i5f0 i5f0Var4 = (i5f0) list3.get(0);
                            j jVar = (j) list3.get(1);
                            try {
                                n52Var2.getClass();
                                Iterator it = i5f0Var4.a.d.d().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z = false;
                                    } else if (((ody) it.next()).s(jVar)) {
                                    }
                                }
                                g3 = Collections.singletonList(Boolean.valueOf(z));
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                        case 4:
                            List list4 = (List) obj2;
                            i5f0 i5f0Var5 = (i5f0) list4.get(0);
                            List list5 = (List) list4.get(1);
                            try {
                                n52Var2.getClass();
                                i5f0Var5.f((j[]) list5.toArray(new j[0]));
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            return;
                        default:
                            i5f0 i5f0Var6 = (i5f0) ((List) obj2).get(0);
                            try {
                                n52Var2.getClass();
                                i5f0Var6.g();
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            return;
                    }
                }
            });
        }
    }

    public static void j(String str) {
        synchronized (a) {
            c(str, null);
        }
    }

    public static void k(String str, Throwable th) {
        synchronized (a) {
            c(str, th);
        }
    }
}
