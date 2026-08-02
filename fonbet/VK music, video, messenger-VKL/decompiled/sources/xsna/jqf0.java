package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import xsna.bx10;
import xsna.fx10;

/* compiled from: RegisteredMediaRouteProvider.java */
/* loaded from: classes12.dex */
public final class jqf0 extends bx10 implements ServiceConnection {
    public final ComponentName j;
    public final c k;
    public final ArrayList<b> l;
    public boolean m;
    public boolean n;
    public a o;
    public boolean p;
    public cxd0 q;

    /* compiled from: RegisteredMediaRouteProvider.java */
    public final class a implements IBinder.DeathRecipient {
        public final Messenger b;
        public final d c;
        public final Messenger d;
        public int g;
        public int h;
        public int e = 1;
        public int f = 1;
        public final SparseArray<fx10.c> i = new SparseArray<>();

        /* compiled from: RegisteredMediaRouteProvider.java */
        /* renamed from: xsna.jqf0$a$a, reason: collision with other inner class name */
        public class RunnableC3140a implements Runnable {
            public RunnableC3140a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                jqf0 jqf0Var = jqf0.this;
                if (jqf0Var.o == aVar) {
                    jqf0Var.n();
                }
            }
        }

        public a(Messenger messenger) {
            this.b = messenger;
            d dVar = new d(this);
            this.c = dVar;
            this.d = new Messenger(dVar);
        }

        public final void a(int i) {
            int i2 = this.e;
            this.e = i2 + 1;
            b(5, i2, i, null, null);
        }

        public final boolean b(int i, int i2, int i3, Bundle bundle, Bundle bundle2) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = i2;
            obtain.arg2 = i3;
            obtain.obj = bundle;
            obtain.setData(bundle2);
            obtain.replyTo = this.d;
            try {
                this.b.send(obtain);
                return true;
            } catch (DeadObjectException unused) {
                return false;
            } catch (RemoteException e) {
                if (i == 2) {
                    return false;
                }
                Log.e("MediaRouteProviderProxy", "Could not send message to service.", e);
                return false;
            }
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            jqf0.this.k.post(new RunnableC3140a());
        }

        public final void c(int i, int i2) {
            Bundle b = ar.b(i2, "volume");
            int i3 = this.e;
            this.e = i3 + 1;
            b(7, i3, i, null, b);
        }

        public final void d(int i, int i2) {
            Bundle b = ar.b(i2, "volume");
            int i3 = this.e;
            this.e = i3 + 1;
            b(8, i3, i, null, b);
        }
    }

    /* compiled from: RegisteredMediaRouteProvider.java */
    public interface b {
        void a();

        int b();

        void c(a aVar);
    }

    /* compiled from: RegisteredMediaRouteProvider.java */
    public static final class c extends Handler {
    }

    /* compiled from: RegisteredMediaRouteProvider.java */
    public static final class d extends Handler {
        public final WeakReference<a> a;

        public d(a aVar) {
            this.a = new WeakReference<>(aVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            bx10.b.a aVar;
            a aVar2 = this.a.get();
            if (aVar2 != null) {
                SparseArray<fx10.c> sparseArray = aVar2.i;
                jqf0 jqf0Var = jqf0.this;
                ArrayList<b> arrayList = jqf0Var.l;
                int i = message.what;
                int i2 = message.arg1;
                int i3 = message.arg2;
                Object obj = message.obj;
                Bundle peekData = message.peekData();
                b bVar = null;
                if (i == 0) {
                    if (i2 == aVar2.h) {
                        aVar2.h = 0;
                        if (jqf0Var.o == aVar2) {
                            jqf0Var.o();
                        }
                    }
                    fx10.c cVar = sparseArray.get(i2);
                    if (cVar != null) {
                        sparseArray.remove(i2);
                        cVar.a(null);
                        return;
                    }
                    return;
                }
                switch (i) {
                    case 2:
                        if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle = (Bundle) obj;
                            if (aVar2.g == 0 && i2 == aVar2.h && i3 >= 1) {
                                aVar2.h = 0;
                                aVar2.g = i3;
                                dx10 a = dx10.a(bundle);
                                if (jqf0Var.o == aVar2) {
                                    jqf0Var.j(a);
                                }
                                if (jqf0Var.o == aVar2) {
                                    jqf0Var.p = true;
                                    int size = arrayList.size();
                                    for (int i4 = 0; i4 < size; i4++) {
                                        arrayList.get(i4).c(jqf0Var.o);
                                    }
                                    yw10 yw10Var = jqf0Var.f;
                                    if (yw10Var != null) {
                                        a aVar3 = jqf0Var.o;
                                        int i5 = aVar3.e;
                                        aVar3.e = i5 + 1;
                                        aVar3.b(10, i5, 0, yw10Var.a, null);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle2 = (Bundle) obj;
                            fx10.c cVar2 = sparseArray.get(i2);
                            if (cVar2 != null) {
                                sparseArray.remove(i2);
                                cVar2.b(bundle2);
                                break;
                            }
                        }
                        break;
                    case 4:
                        if (obj == null || (obj instanceof Bundle)) {
                            if (peekData != null) {
                                peekData.getString("error");
                            }
                            Bundle bundle3 = (Bundle) obj;
                            fx10.c cVar3 = sparseArray.get(i2);
                            if (cVar3 != null) {
                                sparseArray.remove(i2);
                                cVar3.a(bundle3);
                                break;
                            }
                        }
                        break;
                    case 5:
                        if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle4 = (Bundle) obj;
                            if (aVar2.g != 0) {
                                dx10 a2 = dx10.a(bundle4);
                                if (jqf0Var.o == aVar2) {
                                    jqf0Var.j(a2);
                                    break;
                                }
                            }
                        }
                        break;
                    case 6:
                        if (obj instanceof Bundle) {
                            Bundle bundle5 = (Bundle) obj;
                            fx10.c cVar4 = sparseArray.get(i2);
                            if (bundle5 == null || !bundle5.containsKey("routeId")) {
                                cVar4.a(bundle5);
                                break;
                            } else {
                                sparseArray.remove(i2);
                                cVar4.b(bundle5);
                                break;
                            }
                        }
                        break;
                    case 7:
                        if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle6 = (Bundle) obj;
                            if (aVar2.g != 0) {
                                Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                vw10 vw10Var = bundle7 != null ? new vw10(bundle7) : null;
                                ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = parcelableArrayList.iterator();
                                while (it.hasNext()) {
                                    Bundle bundle8 = (Bundle) it.next();
                                    if (bundle8 == null) {
                                        aVar = null;
                                    } else {
                                        Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                        aVar = new bx10.b.a(bundle9 != null ? new vw10(bundle9) : null, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                    }
                                    arrayList2.add(aVar);
                                }
                                if (jqf0Var.o == aVar2) {
                                    Iterator<b> it2 = arrayList.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            b next = it2.next();
                                            if (next.b() == i3) {
                                                bVar = next;
                                            }
                                        }
                                    }
                                    if (bVar instanceof e) {
                                        ((e) bVar).l(vw10Var, arrayList2);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 8:
                        if (jqf0Var.o == aVar2) {
                            Iterator<b> it3 = arrayList.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    b next2 = it3.next();
                                    if (next2.b() == i3) {
                                        bVar = next2;
                                    }
                                }
                            }
                            cxd0 cxd0Var = jqf0Var.q;
                            if (cxd0Var != null && (bVar instanceof bx10.e)) {
                                bx10.e eVar = (bx10.e) bVar;
                                h1u h1uVar = ((kqf0) cxd0Var.c).b;
                                if (h1uVar.e == eVar) {
                                    h1uVar.l(h1uVar.c(), 2, true);
                                }
                            }
                            if (bVar != null) {
                                arrayList.remove(bVar);
                                bVar.a();
                                jqf0Var.p();
                                break;
                            }
                        }
                        break;
                }
            }
        }
    }

    /* compiled from: RegisteredMediaRouteProvider.java */
    public final class e extends bx10.b implements b {

        @NonNull
        public final String f;

        @NonNull
        public final bx10.f g;
        public String h;
        public String i;
        public boolean j;
        public int l;
        public a m;
        public int k = -1;
        public int n = -1;

        /* compiled from: RegisteredMediaRouteProvider.java */
        public class a extends fx10.c {
            public a() {
            }

            @Override // xsna.fx10.c
            public final void a(Bundle bundle) {
                Objects.toString(bundle);
            }

            @Override // xsna.fx10.c
            public final void b(Bundle bundle) {
                String string = bundle.getString("groupableTitle");
                e eVar = e.this;
                eVar.h = string;
                eVar.i = bundle.getString("transferableTitle");
            }
        }

        public e(@NonNull String str, @NonNull bx10.f fVar) {
            this.f = str;
            this.g = fVar;
        }

        @Override // xsna.jqf0.b
        public final void a() {
            a aVar = this.m;
            if (aVar != null) {
                int i = this.n;
                int i2 = aVar.e;
                aVar.e = i2 + 1;
                aVar.b(4, i2, i, null, null);
                this.m = null;
                this.n = 0;
            }
        }

        @Override // xsna.jqf0.b
        public final int b() {
            return this.n;
        }

        @Override // xsna.jqf0.b
        public final void c(a aVar) {
            a aVar2 = new a();
            this.m = aVar;
            int i = aVar.f;
            aVar.f = i + 1;
            int i2 = aVar.e;
            aVar.e = i2 + 1;
            Bundle a2 = q9k.a("memberRouteId", this.f);
            a2.putParcelable("routeControllerOptions", this.g.a);
            aVar.b(11, i2, i, null, a2);
            aVar.i.put(i2, aVar2);
            this.n = i;
            if (this.j) {
                aVar.a(i);
                int i3 = this.k;
                if (i3 >= 0) {
                    aVar.c(this.n, i3);
                    this.k = -1;
                }
                int i4 = this.l;
                if (i4 != 0) {
                    aVar.d(this.n, i4);
                    this.l = 0;
                }
            }
        }

        @Override // xsna.bx10.e
        public final void d() {
            jqf0 jqf0Var = jqf0.this;
            jqf0Var.l.remove(this);
            a();
            jqf0Var.p();
        }

        @Override // xsna.bx10.e
        public final void e() {
            this.j = true;
            a aVar = this.m;
            if (aVar != null) {
                aVar.a(this.n);
            }
        }

        @Override // xsna.bx10.e
        public final void f(int i) {
            a aVar = this.m;
            if (aVar != null) {
                aVar.c(this.n, i);
            } else {
                this.k = i;
                this.l = 0;
            }
        }

        @Override // xsna.bx10.e
        public final void g() {
            h(0);
        }

        @Override // xsna.bx10.e
        public final void h(int i) {
            this.j = false;
            a aVar = this.m;
            if (aVar != null) {
                int i2 = this.n;
                Bundle b = ar.b(i, "unselectReason");
                int i3 = aVar.e;
                aVar.e = i3 + 1;
                aVar.b(6, i3, i2, null, b);
            }
        }

        @Override // xsna.bx10.e
        public final void i(int i) {
            a aVar = this.m;
            if (aVar != null) {
                aVar.d(this.n, i);
            } else {
                this.l += i;
            }
        }

        @Override // xsna.bx10.b
        public final String j() {
            return this.h;
        }

        @Override // xsna.bx10.b
        public final String k() {
            return this.i;
        }

        @Override // xsna.bx10.b
        public final void m(@NonNull String str) {
            a aVar = this.m;
            if (aVar != null) {
                int i = this.n;
                Bundle a2 = q9k.a("memberRouteId", str);
                int i2 = aVar.e;
                aVar.e = i2 + 1;
                aVar.b(12, i2, i, null, a2);
            }
        }

        @Override // xsna.bx10.b
        public final void n(@NonNull String str) {
            a aVar = this.m;
            if (aVar != null) {
                int i = this.n;
                Bundle a2 = q9k.a("memberRouteId", str);
                int i2 = aVar.e;
                aVar.e = i2 + 1;
                aVar.b(13, i2, i, null, a2);
            }
        }

        @Override // xsna.bx10.b
        public final void o(@Nullable ArrayList arrayList) {
            a aVar = this.m;
            if (aVar != null) {
                int i = this.n;
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("memberRouteIds", new ArrayList<>(arrayList));
                int i2 = aVar.e;
                aVar.e = i2 + 1;
                aVar.b(14, i2, i, null, bundle);
            }
        }
    }

    /* compiled from: RegisteredMediaRouteProvider.java */
    public final class f extends bx10.e implements b {
        public final String a;

        @Nullable
        public final String b;

        @NonNull
        public final bx10.f c;
        public boolean d;
        public int e = -1;
        public int f;
        public a g;
        public int h;

        public f(String str, @Nullable String str2, @NonNull bx10.f fVar) {
            this.a = str;
            this.b = str2;
            this.c = fVar;
        }

        @Override // xsna.jqf0.b
        public final void a() {
            a aVar = this.g;
            if (aVar != null) {
                int i = this.h;
                int i2 = aVar.e;
                aVar.e = i2 + 1;
                aVar.b(4, i2, i, null, null);
                this.g = null;
                this.h = 0;
            }
        }

        @Override // xsna.jqf0.b
        public final int b() {
            return this.h;
        }

        @Override // xsna.jqf0.b
        public final void c(a aVar) {
            this.g = aVar;
            int i = aVar.f;
            aVar.f = i + 1;
            Bundle b = qr.b("routeId", this.a, "routeGroupId", this.b);
            b.putParcelable("routeControllerOptions", this.c.a);
            int i2 = aVar.e;
            aVar.e = i2 + 1;
            aVar.b(3, i2, i, null, b);
            this.h = i;
            if (this.d) {
                aVar.a(i);
                int i3 = this.e;
                if (i3 >= 0) {
                    aVar.c(this.h, i3);
                    this.e = -1;
                }
                int i4 = this.f;
                if (i4 != 0) {
                    aVar.d(this.h, i4);
                    this.f = 0;
                }
            }
        }

        @Override // xsna.bx10.e
        public final void d() {
            jqf0 jqf0Var = jqf0.this;
            jqf0Var.l.remove(this);
            a();
            jqf0Var.p();
        }

        @Override // xsna.bx10.e
        public final void e() {
            this.d = true;
            a aVar = this.g;
            if (aVar != null) {
                aVar.a(this.h);
            }
        }

        @Override // xsna.bx10.e
        public final void f(int i) {
            a aVar = this.g;
            if (aVar != null) {
                aVar.c(this.h, i);
            } else {
                this.e = i;
                this.f = 0;
            }
        }

        @Override // xsna.bx10.e
        public final void g() {
            h(0);
        }

        @Override // xsna.bx10.e
        public final void h(int i) {
            this.d = false;
            a aVar = this.g;
            if (aVar != null) {
                int i2 = this.h;
                Bundle b = ar.b(i, "unselectReason");
                int i3 = aVar.e;
                aVar.e = i3 + 1;
                aVar.b(6, i3, i2, null, b);
            }
        }

        @Override // xsna.bx10.e
        public final void i(int i) {
            a aVar = this.g;
            if (aVar != null) {
                aVar.d(this.h, i);
            } else {
                this.f += i;
            }
        }
    }

    public jqf0(Context context, ComponentName componentName) {
        super(context, new bx10.d(componentName));
        this.l = new ArrayList<>();
        this.j = componentName;
        this.k = new c();
    }

    @Override // xsna.bx10
    public final bx10.b a(@NonNull String str, @NonNull bx10.f fVar) {
        if (str == null) {
            throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
        }
        dx10 dx10Var = this.h;
        if (dx10Var == null) {
            return null;
        }
        List<vw10> list = dx10Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).d().equals(str)) {
                e eVar = new e(str, fVar);
                this.l.add(eVar);
                if (this.p) {
                    eVar.c(this.o);
                }
                p();
                return eVar;
            }
        }
        return null;
    }

    @Override // xsna.bx10
    public final bx10.e g(@NonNull String str, @NonNull String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return m(str, str2, bx10.f.b);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    @Override // xsna.bx10
    public final bx10.e h(@NonNull String str, @NonNull bx10.f fVar) {
        if (str != null) {
            return m(str, null, fVar);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // xsna.bx10
    public final void i(yw10 yw10Var) {
        if (this.p) {
            a aVar = this.o;
            int i = aVar.e;
            aVar.e = i + 1;
            aVar.b(10, i, 0, yw10Var != null ? yw10Var.a : null, null);
        }
        p();
    }

    public final void l() {
        if (this.n) {
            return;
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.j);
        try {
            this.n = this.b.bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
        } catch (SecurityException unused) {
        }
    }

    public final f m(String str, @Nullable String str2, @NonNull bx10.f fVar) {
        dx10 dx10Var = this.h;
        if (dx10Var == null) {
            return null;
        }
        List<vw10> list = dx10Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).d().equals(str)) {
                f fVar2 = new f(str, str2, fVar);
                this.l.add(fVar2);
                if (this.p) {
                    fVar2.c(this.o);
                }
                p();
                return fVar2;
            }
        }
        return null;
    }

    public final void n() {
        if (this.o != null) {
            j(null);
            this.p = false;
            ArrayList<b> arrayList = this.l;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i).a();
            }
            a aVar = this.o;
            aVar.b(2, 0, 0, null, null);
            aVar.c.a.clear();
            aVar.b.getBinder().unlinkToDeath(aVar, 0);
            jqf0.this.k.post(new iqf0(aVar));
            this.o = null;
        }
    }

    public final void o() {
        if (this.n) {
            this.n = false;
            n();
            try {
                this.b.unbindService(this);
            } catch (IllegalArgumentException e2) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e2);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.n) {
            n();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        a aVar = new a(messenger);
                        int i = aVar.e;
                        aVar.e = i + 1;
                        aVar.h = i;
                        if (aVar.b(1, i, 4, null, null)) {
                            try {
                                aVar.b.getBinder().linkToDeath(aVar, 0);
                                this.o = aVar;
                                return;
                            } catch (RemoteException unused) {
                                aVar.binderDied();
                                return;
                            }
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        n();
    }

    public final void p() {
        if (!this.m || (this.f == null && this.l.isEmpty())) {
            o();
        } else {
            l();
        }
    }

    @NonNull
    public final String toString() {
        return "Service connection " + this.j.flattenToShortString();
    }
}
