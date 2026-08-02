package xsna;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DefaultExtractorsFactory.java */
/* loaded from: classes12.dex */
public final class uel implements tgq {
    public static final int[] g = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final a h = new a(new ur(13));
    public static final a i = new a(new vr(11));

    @Nullable
    public com.google.common.collect.g b;
    public int e;
    public int f;
    public anl d = new anl();
    public boolean c = true;

    /* compiled from: DefaultExtractorsFactory.java */
    public static final class a {
        public final InterfaceC3800a a;
        public final AtomicBoolean b = new AtomicBoolean(false);

        /* compiled from: DefaultExtractorsFactory.java */
        /* renamed from: xsna.uel$a$a, reason: collision with other inner class name */
        public interface InterfaceC3800a {
            @Nullable
            Constructor<? extends pgq> a() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException;
        }

        public a(InterfaceC3800a interfaceC3800a) {
            this.a = interfaceC3800a;
        }

        @Nullable
        public final pgq a(Object... objArr) {
            Constructor<? extends pgq> a;
            synchronized (this.b) {
                if (!this.b.get()) {
                    try {
                        a = this.a.a();
                    } catch (ClassNotFoundException unused) {
                        this.b.set(true);
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                }
                a = null;
            }
            if (a == null) {
                return null;
            }
            try {
                return a.newInstance(objArr);
            } catch (Exception e2) {
                throw new IllegalStateException("Unexpected error creating extractor", e2);
            }
        }
    }

    @Override // xsna.tgq
    public final void a(anl anlVar) {
        synchronized (this) {
            this.d = anlVar;
        }
    }

    @Override // xsna.tgq
    public final void b() {
        synchronized (this) {
        }
    }

    @Override // xsna.tgq
    @Deprecated
    public final void c(boolean z) {
        synchronized (this) {
            this.c = z;
        }
    }

    @Override // xsna.tgq
    public final synchronized pgq[] createExtractors() {
        return createExtractors(Uri.EMPTY, new HashMap());
    }

    public final void d(int i2, ArrayList arrayList) {
        switch (i2) {
            case 0:
                arrayList.add(new li());
                break;
            case 1:
                arrayList.add(new pi());
                break;
            case 2:
                arrayList.add(new u21(0));
                break;
            case 3:
                arrayList.add(new hw1());
                break;
            case 4:
                pgq a2 = h.a(0);
                if (a2 == null) {
                    arrayList.add(new onr());
                    break;
                } else {
                    arrayList.add(a2);
                    break;
                }
            case 5:
                arrayList.add(new rur());
                break;
            case 6:
                arrayList.add(new xn10(this.d, this.c ? 0 : 2));
                break;
            case 7:
                arrayList.add(new pf30(0));
                break;
            case 8:
                arrayList.add(new mes(this.d, this.c ? 0 : 32));
                arrayList.add(new uf30(this.d, 0 | (this.c ? 0 : 16)));
                break;
            case 9:
                arrayList.add(new bw70());
                break;
            case 10:
                arrayList.add(new uae0());
                break;
            case 11:
                if (this.b == null) {
                    ImmutableList.b bVar = ImmutableList.c;
                    this.b = com.google.common.collect.g.f;
                }
                arrayList.add(new ssp0(1, !this.c ? 1 : 0, this.d, new txo0(0L), new bql(0, this.b)));
                break;
            case 12:
                arrayList.add(new edx0());
                break;
            case 14:
                arrayList.add(new v0y(this.e));
                break;
            case 15:
                pgq a3 = i.a(new Object[0]);
                if (a3 != null) {
                    arrayList.add(a3);
                    break;
                }
                break;
            case 16:
                arrayList.add(new jt5(!this.c ? 1 : 0, this.d));
                break;
            case 17:
                arrayList.add(new zfb0());
                break;
            case 18:
                arrayList.add(new ojx0());
                break;
            case 19:
                arrayList.add(new rh7());
                break;
            case 20:
                arrayList.add(new r1v(this.f));
                break;
            case 21:
                arrayList.add(new mt5());
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x0031, B:15:0x0039, B:18:0x003f, B:21:0x0045, B:23:0x0048, B:27:0x004b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x0031, B:15:0x0039, B:18:0x003f, B:21:0x0045, B:23:0x0048, B:27:0x004b), top: B:2:0x0001 }] */
    @Override // xsna.tgq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized pgq[] createExtractors(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        String str;
        int z;
        int A;
        int i2;
        try {
            int[] iArr = g;
            arrayList = new ArrayList(21);
            List<String> list = map.get("Content-Type");
            if (list != null && !list.isEmpty()) {
                str = list.get(0);
                z = xa4.z(str);
                if (z != -1) {
                    d(z, arrayList);
                }
                A = xa4.A(uri);
                if (A != -1 && A != z) {
                    d(A, arrayList);
                }
                for (i2 = 0; i2 < 21; i2++) {
                    int i3 = iArr[i2];
                    if (i3 != z && i3 != A) {
                        d(i3, arrayList);
                    }
                }
            }
            str = null;
            z = xa4.z(str);
            if (z != -1) {
            }
            A = xa4.A(uri);
            if (A != -1) {
                d(A, arrayList);
            }
            while (i2 < 21) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return (pgq[]) arrayList.toArray(new pgq[0]);
    }
}
