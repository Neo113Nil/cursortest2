package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.e0;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.io.PrintWriter;
import xsna.lz3;
import xsna.qbk;

/* compiled from: LoaderManagerImpl.java */
/* loaded from: classes12.dex */
public final class csz extends bsz {

    @NonNull
    public final Object a;

    @NonNull
    public final c b;

    /* compiled from: LoaderManagerImpl.java */
    public static class a<D> extends ug50<D> {

        @NonNull
        public final rqz0 l;
        public Object m;
        public b<D> n;

        public a(@NonNull rqz0 rqz0Var) {
            this.l = rqz0Var;
            if (rqz0Var.a != null) {
                throw new IllegalStateException("There is already a listener registered");
            }
            rqz0Var.a = this;
        }

        @Override // androidx.lifecycle.n
        public final void g() {
            rqz0 rqz0Var = this.l;
            rqz0Var.b = true;
            rqz0Var.d = false;
            rqz0Var.c = false;
            rqz0Var.i.drainPermits();
            rqz0Var.a();
            rqz0Var.g = new lz3.a();
            rqz0Var.b();
        }

        @Override // androidx.lifecycle.n
        public final void h() {
            this.l.b = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.n
        public final void j(@NonNull fr70<? super D> fr70Var) {
            super.j(fr70Var);
            this.m = null;
            this.n = null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.f5z] */
        public final void l() {
            ?? r0 = this.m;
            b<D> bVar = this.n;
            if (r0 == 0 || bVar == null) {
                return;
            }
            super.j(bVar);
            e(r0, bVar);
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #0 : ");
            Class<?> cls = this.l.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}}");
            return sb.toString();
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    public static class b<D> implements fr70<D> {

        @NonNull
        public final f2i b;
        public boolean c = false;

        public b(@NonNull rqz0 rqz0Var, @NonNull f2i f2iVar) {
            this.b = f2iVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.fr70
        public final void a(@Nullable D d) {
            this.c = true;
            SignInHubActivity signInHubActivity = (SignInHubActivity) this.b.b;
            signInHubActivity.setResult(signInHubActivity.i, signInHubActivity.j);
            signInHubActivity.finish();
        }

        @NonNull
        public final String toString() {
            return this.b.toString();
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    public static class c extends nyt0 {
        public static final a d = new a();
        public final wik0<a> b = new wik0<>();
        public boolean c = false;

        /* compiled from: LoaderManagerImpl.java */
        public static class a implements e0.c {
            @Override // androidx.lifecycle.e0.c
            @NonNull
            public final <T extends nyt0> T a(@NonNull Class<T> cls) {
                return new c();
            }
        }

        @Override // xsna.nyt0
        public final void h() {
            wik0<a> wik0Var = this.b;
            int i = wik0Var.d;
            for (int i2 = 0; i2 < i; i2++) {
                a i3 = wik0Var.i(i2);
                rqz0 rqz0Var = i3.l;
                rqz0Var.a();
                rqz0Var.c = true;
                b<D> bVar = i3.n;
                if (bVar != 0) {
                    i3.j(bVar);
                }
                a aVar = rqz0Var.a;
                if (aVar == null) {
                    throw new IllegalStateException("No listener register");
                }
                if (aVar != i3) {
                    throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                }
                rqz0Var.a = null;
                if (bVar != 0) {
                    boolean z = bVar.c;
                }
                rqz0Var.d = true;
                rqz0Var.b = false;
                rqz0Var.c = false;
                rqz0Var.e = false;
            }
            int i4 = wik0Var.d;
            Object[] objArr = wik0Var.c;
            for (int i5 = 0; i5 < i4; i5++) {
                objArr[i5] = null;
            }
            wik0Var.d = 0;
        }
    }

    public csz(@NonNull f5z f5zVar, @NonNull wyt0 wyt0Var) {
        this.a = f5zVar;
        vyt0 vyt0Var = new vyt0(wyt0Var, c.d, qbk.a.b);
        rfc a2 = fpf0.a(c.class);
        String h = a2.h();
        if (h == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.b = (c) vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h), a2);
    }

    @Deprecated
    public final void b(String str, PrintWriter printWriter) {
        c cVar = this.b;
        if (cVar.b.d <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i = 0;
        while (true) {
            wik0<a> wik0Var = cVar.b;
            if (i >= wik0Var.d) {
                return;
            }
            a i2 = wik0Var.i(i);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(cVar.b.b[i]);
            printWriter.print(": ");
            printWriter.println(i2.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(i2.l);
            rqz0 rqz0Var = i2.l;
            String str3 = str2 + "  ";
            rqz0Var.getClass();
            printWriter.print(str3);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mListener=");
            printWriter.println(rqz0Var.a);
            if (rqz0Var.b || rqz0Var.e) {
                printWriter.print(str3);
                printWriter.print("mStarted=");
                printWriter.print(rqz0Var.b);
                printWriter.print(" mContentChanged=");
                printWriter.print(rqz0Var.e);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (rqz0Var.c || rqz0Var.d) {
                printWriter.print(str3);
                printWriter.print("mAbandoned=");
                printWriter.print(rqz0Var.c);
                printWriter.print(" mReset=");
                printWriter.println(rqz0Var.d);
            }
            if (rqz0Var.g != null) {
                printWriter.print(str3);
                printWriter.print("mTask=");
                printWriter.print(rqz0Var.g);
                printWriter.print(" waiting=");
                rqz0Var.g.getClass();
                printWriter.println(false);
            }
            if (rqz0Var.h != null) {
                printWriter.print(str3);
                printWriter.print("mCancellingTask=");
                printWriter.print(rqz0Var.h);
                printWriter.print(" waiting=");
                rqz0Var.h.getClass();
                printWriter.println(false);
            }
            if (i2.n != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(i2.n);
                b<D> bVar = i2.n;
                bVar.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(bVar.c);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            rqz0 rqz0Var2 = i2.l;
            D d = i2.d();
            rqz0Var2.getClass();
            StringBuilder sb = new StringBuilder(64);
            if (d == 0) {
                sb.append("null");
            } else {
                Class<?> cls = d.getClass();
                sb.append(cls.getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(cls)));
                sb.append("}");
            }
            printWriter.println(sb.toString());
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(i2.c > 0);
            i++;
        }
    }

    public final void c() {
        wik0<a> wik0Var = this.b.b;
        int i = wik0Var.d;
        for (int i2 = 0; i2 < i; i2++) {
            wik0Var.i(i2).l();
        }
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.a.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
