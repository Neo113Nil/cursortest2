package xsna;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: Jdk8WithJettyBootPlatform.kt */
/* loaded from: classes8.dex */
public final class ayx extends fta0 {
    public final Method c;
    public final Method d;
    public final Method e;
    public final Class<?> f;
    public final Class<?> g;

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    public static final class a implements InvocationHandler {
        public final ArrayList a;
        public boolean b;
        public String c;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (epx.f(name, "supports") && epx.f(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (epx.f(name, "unsupported") && epx.f(Void.TYPE, returnType)) {
                this.b = true;
                return null;
            }
            boolean f = epx.f(name, "protocols");
            ArrayList arrayList = this.a;
            if (f && objArr.length == 0) {
                return arrayList;
            }
            if ((epx.f(name, "selectProtocol") || epx.f(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            String str = (String) list.get(i);
                            if (!arrayList.contains(str)) {
                                if (i == size) {
                                    break;
                                }
                                i++;
                            } else {
                                this.c = str;
                                return str;
                            }
                        }
                    }
                    String str2 = (String) arrayList.get(0);
                    this.c = str2;
                    return str2;
                }
            }
            if ((!epx.f(name, "protocolSelected") && !epx.f(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            this.c = (String) objArr[0];
            return null;
        }
    }

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    public static final class b {
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
        
            if (java.lang.Integer.parseInt(java.lang.System.getProperty("java.specification.version", "unknown")) >= 9) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static ayx a() {
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                return new ayx(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod(SignalingProtocol.KEY_REMOVE, SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                return null;
            }
        }
    }

    public ayx(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = cls;
        this.g = cls2;
    }

    @Override // xsna.fta0
    public final void a(SSLSocket sSLSocket) {
        try {
            this.e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // xsna.fta0
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Protocol) obj) != Protocol.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Protocol) it.next()).toString());
        }
        try {
            this.c.invoke(null, sSLSocket, Proxy.newProxyInstance(fta0.class.getClassLoader(), new Class[]{this.f, this.g}, new a(arrayList2)));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // xsna.fta0
    public final String f(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.d.invoke(null, sSLSocket));
            boolean z = aVar.b;
            if (!z && aVar.c == null) {
                fta0.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 6);
                return null;
            }
            if (z) {
                return null;
            }
            return aVar.c;
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
