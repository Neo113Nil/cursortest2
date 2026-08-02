package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import xsna.aup0;
import xsna.o5s;

/* compiled from: FontsContractCompat.java */
/* loaded from: classes11.dex */
public final class d6s {

    /* compiled from: FontsContractCompat.java */
    public static class c {
    }

    public static Typeface a(Context context, List list, int i, boolean z, int i2, Handler handler, aup0.a aVar) {
        q7g0 q7g0Var = new q7g0(handler);
        yb9 yb9Var = new yb9(aVar, q7g0Var);
        if (!z) {
            String a2 = o5s.a(i, list);
            Typeface typeface = o5s.a.get(a2);
            if (typeface != null) {
                q7g0Var.execute(new wb9(aVar, typeface));
                return typeface;
            }
            l5s l5sVar = new l5s(yb9Var);
            synchronized (o5s.c) {
                try {
                    dpj0<String, ArrayList<o7j<o5s.a>>> dpj0Var = o5s.d;
                    ArrayList<o7j<o5s.a>> arrayList = dpj0Var.get(a2);
                    if (arrayList != null) {
                        arrayList.add(l5sVar);
                        return null;
                    }
                    ArrayList<o7j<o5s.a>> arrayList2 = new ArrayList<>();
                    arrayList2.add(l5sVar);
                    dpj0Var.put(a2, arrayList2);
                    m5s m5sVar = new m5s(context, list, a2, i);
                    ThreadPoolExecutor threadPoolExecutor = o5s.b;
                    n5s n5sVar = new n5s(a2);
                    Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                    r7g0 r7g0Var = new r7g0();
                    r7g0Var.b = m5sVar;
                    r7g0Var.c = n5sVar;
                    r7g0Var.d = handler2;
                    threadPoolExecutor.execute(r7g0Var);
                    return null;
                } finally {
                }
            }
        }
        if (list.size() > 1) {
            throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
        }
        j5s j5sVar = (j5s) list.get(0);
        m900<String, Typeface> m900Var = o5s.a;
        ArrayList arrayList3 = new ArrayList(1);
        Object obj = new Object[]{j5sVar}[0];
        Objects.requireNonNull(obj);
        arrayList3.add(obj);
        String a3 = o5s.a(i, Collections.unmodifiableList(arrayList3));
        Typeface typeface2 = o5s.a.get(a3);
        if (typeface2 != null) {
            q7g0Var.execute(new wb9(aVar, typeface2));
            return typeface2;
        }
        if (i2 == -1) {
            ArrayList arrayList4 = new ArrayList(1);
            Object obj2 = new Object[]{j5sVar}[0];
            Objects.requireNonNull(obj2);
            arrayList4.add(obj2);
            o5s.a b2 = o5s.b(context, Collections.unmodifiableList(arrayList4), a3, i);
            yb9Var.a(b2);
            return b2.a;
        }
        try {
            try {
                o5s.a aVar2 = (o5s.a) o5s.b.submit(new k5s(a3, context, j5sVar, i)).get(i2, TimeUnit.MILLISECONDS);
                yb9Var.a(aVar2);
                return aVar2.a;
            } catch (InterruptedException e) {
                throw e;
            } catch (ExecutionException e2) {
                throw new RuntimeException(e2);
            } catch (TimeoutException unused) {
                throw new InterruptedException("timeout");
            }
        } catch (InterruptedException unused2) {
            yb9Var.b.execute(new xb9(yb9Var.a, -3));
            return null;
        }
    }

    /* compiled from: FontsContractCompat.java */
    public static class a {
        public final int a;
        public final List<b[]> b;

        @Deprecated
        public a() {
            this.a = 1;
            this.b = Collections.singletonList(null);
        }

        public a(ArrayList arrayList) {
            this.a = 0;
            this.b = arrayList;
        }
    }

    /* compiled from: FontsContractCompat.java */
    public static class b {
        public final Uri a;
        public final int b;
        public final int c;
        public final boolean d;
        public final String e;
        public final int f;

        public b(Uri uri, int i, int i2, boolean z, String str, int i3) {
            uri.getClass();
            this.a = uri;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = str;
            this.f = i3;
        }

        public final String a() {
            if (g()) {
                return this.a.getAuthority();
            }
            return null;
        }

        public final int b() {
            return this.b;
        }

        public final Uri c() {
            return this.a;
        }

        public final String d() {
            return this.e;
        }

        public final int e() {
            return this.c;
        }

        public final boolean f() {
            return this.d;
        }

        public final boolean g() {
            return Objects.equals(this.a.getScheme(), "systemfont");
        }

        public b(String str, String str2) {
            this.a = new Uri.Builder().scheme("systemfont").authority(str).build();
            this.b = 0;
            this.c = 400;
            this.d = false;
            this.e = str2;
            this.f = 0;
        }
    }
}
