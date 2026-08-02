package xsna;

import android.content.Context;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;
import xsna.bx10;
import xsna.h1u;
import xsna.h1u.d;
import xsna.jpg0;
import xsna.jw10;

/* compiled from: MediaRouter.java */
/* loaded from: classes12.dex */
public final class fx10 {
    public static h1u c;
    public final Context a;
    public final ArrayList<b> b = new ArrayList<>();

    /* compiled from: MediaRouter.java */
    public static abstract class a {
        @Deprecated
        public void onRouteSelected(@NonNull fx10 fx10Var, @NonNull h hVar) {
        }

        @Deprecated
        public void onRouteUnselected(@NonNull fx10 fx10Var, @NonNull h hVar) {
        }

        public void onRouteSelected(@NonNull fx10 fx10Var, @NonNull h hVar, int i) {
            onRouteSelected(fx10Var, hVar);
        }

        public void onRouteUnselected(@NonNull fx10 fx10Var, @NonNull h hVar, int i) {
            onRouteUnselected(fx10Var, hVar);
        }

        public void onRouteSelected(@NonNull fx10 fx10Var, @NonNull h hVar, int i, @NonNull h hVar2) {
            onRouteSelected(fx10Var, hVar, i);
        }

        public void onProviderAdded(@NonNull fx10 fx10Var, @NonNull g gVar) {
        }

        public void onProviderChanged(@NonNull fx10 fx10Var, @NonNull g gVar) {
        }

        public void onProviderRemoved(@NonNull fx10 fx10Var, @NonNull g gVar) {
        }

        public void onRouteAdded(@NonNull fx10 fx10Var, @NonNull h hVar) {
        }

        public void onRouteChanged(@NonNull fx10 fx10Var, @NonNull h hVar) {
        }

        public void onRoutePresentationDisplayChanged(@NonNull fx10 fx10Var, @NonNull h hVar) {
        }

        public void onRouteRemoved(@NonNull fx10 fx10Var, @NonNull h hVar) {
        }

        public void onRouteVolumeChanged(@NonNull fx10 fx10Var, @NonNull h hVar) {
        }

        public void onRouterParamsChanged(@NonNull fx10 fx10Var, @Nullable rx10 rx10Var) {
        }

        public void onRouteConnected(@NonNull fx10 fx10Var, @NonNull h hVar, @NonNull h hVar2) {
        }

        public void onRouteDisconnected(@NonNull fx10 fx10Var, @Nullable h hVar, @NonNull h hVar2, int i) {
        }
    }

    /* compiled from: MediaRouter.java */
    public static final class b {
        public final fx10 a;
        public final a b;
        public ex10 c = ex10.c;
        public int d;
        public long e;

        public b(fx10 fx10Var, a aVar) {
            this.a = fx10Var;
            this.b = aVar;
        }
    }

    /* compiled from: MediaRouter.java */
    public static class d extends h {

        @NonNull
        public final ArrayList w;

        @NonNull
        public final zk3 x;

        public d(g gVar, String str, String str2) {
            super(gVar, str, str2, false);
            this.w = new ArrayList();
            this.x = new zk3();
        }

        public final boolean n() {
            fx10.b();
            return fx10.c().e().contains(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean o(@NonNull h hVar) {
            bx10.b.a aVar = (bx10.b.a) this.x.get(hVar.c);
            return aVar != null && aVar.d;
        }

        public final void p(Collection<bx10.b.a> collection) {
            h hVar;
            this.v.clear();
            ArrayList arrayList = this.w;
            arrayList.clear();
            zk3 zk3Var = this.x;
            zk3Var.clear();
            for (bx10.b.a aVar : collection) {
                String d = aVar.a.d();
                Iterator it = this.a.b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        hVar = (h) it.next();
                        if (hVar.b.equals(d)) {
                            break;
                        }
                    } else {
                        hVar = null;
                        break;
                    }
                }
                if (hVar != null) {
                    arrayList.add(hVar);
                    zk3Var.put(hVar.c, aVar);
                    int i = aVar.b;
                    if (i == 2 || i == 3) {
                        this.v.add(hVar);
                    }
                }
            }
            fx10.c().a.b(259, this);
        }
    }

    /* compiled from: MediaRouter.java */
    public interface e {
        @Nullable
        ugz<Void> onPrepareTransfer(@NonNull h hVar, @NonNull h hVar2);
    }

    /* compiled from: MediaRouter.java */
    public static final class f {
        public final bx10.e a;
        public final int b;
        public final boolean c;
        public final h d;
        public final h e;
        public final h f;

        @Nullable
        public final ArrayList g;
        public final WeakReference<h1u> h;
        public ugz<Void> i = null;
        public boolean j = false;
        public boolean k = false;

        public f(h1u h1uVar, h hVar, @Nullable bx10.e eVar, int i, boolean z, @Nullable h hVar2, @Nullable Collection<bx10.b.a> collection) {
            this.h = new WeakReference<>(h1uVar);
            this.e = hVar;
            this.a = eVar;
            this.b = i;
            this.c = z;
            this.d = h1uVar.d;
            this.f = hVar2;
            this.g = collection != null ? new ArrayList(collection) : null;
            h1uVar.a.postDelayed(new cs2(this, 13), 15000L);
        }

        public final void a() {
            if (this.j || this.k) {
                return;
            }
            this.k = true;
            bx10.e eVar = this.a;
            if (eVar != null) {
                eVar.h(0);
                eVar.d();
            }
        }

        public final void b() {
            ugz<Void> ugzVar;
            d a;
            fx10.b();
            if (this.j || this.k) {
                return;
            }
            WeakReference<h1u> weakReference = this.h;
            h1u h1uVar = weakReference.get();
            if (h1uVar == null || h1uVar.g != this || ((ugzVar = this.i) != null && ugzVar.isCancelled())) {
                a();
                return;
            }
            this.j = true;
            h1uVar.g = null;
            h1u h1uVar2 = weakReference.get();
            h hVar = this.d;
            int i = this.b;
            if (h1uVar2 != null) {
                HashMap hashMap = h1uVar2.b;
                if (h1uVar2.d == hVar) {
                    Message obtainMessage = h1uVar2.a.obtainMessage(263, hVar);
                    obtainMessage.arg1 = i;
                    obtainMessage.sendToTarget();
                    bx10.e eVar = h1uVar2.e;
                    if (eVar != null) {
                        eVar.h(i);
                        h1uVar2.e.d();
                    }
                    if (!hashMap.isEmpty()) {
                        for (bx10.e eVar2 : hashMap.values()) {
                            eVar2.h(i);
                            eVar2.d();
                        }
                        hashMap.clear();
                    }
                    h1uVar2.e = null;
                }
            }
            h1u h1uVar3 = weakReference.get();
            if (h1uVar3 == null) {
                return;
            }
            h1u.b bVar = h1uVar3.a;
            h hVar2 = this.e;
            h1uVar3.d = hVar2;
            h1uVar3.e = this.a;
            boolean z = this.c;
            h hVar3 = this.f;
            if (hVar3 == null) {
                bVar.getClass();
                Message obtainMessage2 = bVar.obtainMessage(262, new h1u.i(hVar, hVar2, z));
                obtainMessage2.arg1 = i;
                obtainMessage2.sendToTarget();
            } else {
                bVar.getClass();
                Message obtainMessage3 = bVar.obtainMessage(264, new h1u.i(hVar3, hVar2, z));
                obtainMessage3.arg1 = i;
                obtainMessage3.sendToTarget();
            }
            h1uVar3.b.clear();
            h1uVar3.j();
            h1uVar3.o();
            ArrayList arrayList = this.g;
            if (arrayList == null || (a = h1uVar3.d.a()) == null) {
                return;
            }
            a.p(arrayList);
        }
    }

    /* compiled from: MediaRouter.java */
    public static final class g {
        public final bx10 a;
        public final ArrayList b = new ArrayList();
        public final boolean c;
        public final bx10.d d;
        public dx10 e;

        public g(bx10 bx10Var, boolean z) {
            this.a = bx10Var;
            this.d = bx10Var.c;
            this.c = z;
        }

        @NonNull
        public final String toString() {
            return "MediaRouter.RouteProviderInfo{ packageName=" + this.d.a.getPackageName() + " }";
        }
    }

    /* compiled from: MediaRouter.java */
    public static class h {
        public final g a;
        public final String b;
        public final String c;
        public String d;
        public String e;
        public Uri f;
        public boolean g;
        public final boolean h;
        public int i;
        public boolean j;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public Bundle s;
        public IntentSender t;
        public vw10 u;
        public final ArrayList<IntentFilter> k = new ArrayList<>();
        public int r = -1;

        @NonNull
        public ArrayList v = new ArrayList();

        public h(g gVar, String str, String str2, boolean z) {
            this.a = gVar;
            this.b = str;
            this.c = str2;
            this.h = z;
        }

        @Nullable
        public static bx10.b b() {
            fx10.b();
            bx10.e eVar = fx10.c().e;
            if (eVar instanceof bx10.b) {
                return (bx10.b) eVar;
            }
            return null;
        }

        @Nullable
        public final d a() {
            if (this instanceof d) {
                return (d) this;
            }
            return null;
        }

        @NonNull
        public final bx10 c() {
            g gVar = this.a;
            gVar.getClass();
            fx10.b();
            return gVar.a;
        }

        public final boolean d() {
            fx10.b();
            h hVar = fx10.c().w;
            if (hVar == null) {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            }
            if (hVar == this || this.n == 3) {
                return true;
            }
            return TextUtils.equals(c().c.a.getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO");
        }

        public final boolean e() {
            return !this.v.isEmpty();
        }

        public final boolean f() {
            return this.u != null && this.g;
        }

        public final boolean g() {
            fx10.b();
            return fx10.c().h() == this;
        }

        public final boolean h(@NonNull ex10 ex10Var) {
            if (ex10Var == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            fx10.b();
            ArrayList<IntentFilter> arrayList = this.k;
            if (arrayList == null) {
                return false;
            }
            ex10Var.a();
            if (ex10Var.b.isEmpty()) {
                return false;
            }
            Iterator<IntentFilter> it = arrayList.iterator();
            while (it.hasNext()) {
                IntentFilter next = it.next();
                if (next != null) {
                    Iterator<String> it2 = ex10Var.b.iterator();
                    while (it2.hasNext()) {
                        if (next.hasCategory(it2.next())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x00fe, code lost:
        
            if (r3.hasNext() == false) goto L69;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int i(vw10 vw10Var) {
            int i;
            h hVar;
            int countActions;
            if (this.u != vw10Var) {
                this.u = vw10Var;
                if (vw10Var != null) {
                    Bundle bundle = vw10Var.a;
                    if (Objects.equals(this.d, bundle.getString("name"))) {
                        i = 0;
                    } else {
                        this.d = bundle.getString("name");
                        i = 1;
                    }
                    if (!Objects.equals(this.e, bundle.getString("status"))) {
                        this.e = bundle.getString("status");
                        i = 1;
                    }
                    Uri uri = this.f;
                    String string = bundle.getString("iconUri");
                    if (!Objects.equals(uri, string == null ? null : Uri.parse(string))) {
                        String string2 = bundle.getString("iconUri");
                        this.f = string2 == null ? null : Uri.parse(string2);
                        i = 1;
                    }
                    if (this.g != bundle.getBoolean("enabled", true)) {
                        this.g = bundle.getBoolean("enabled", true);
                        i = 1;
                    }
                    if (this.i != bundle.getInt("connectionState", 0)) {
                        this.i = bundle.getInt("connectionState", 0);
                        i = 1;
                    }
                    ArrayList<IntentFilter> b = vw10Var.b();
                    ArrayList<IntentFilter> arrayList = this.k;
                    if (arrayList != b) {
                        if (arrayList != null) {
                            ListIterator<IntentFilter> listIterator = arrayList.listIterator();
                            ListIterator<IntentFilter> listIterator2 = b.listIterator();
                            loop0: while (listIterator.hasNext() && listIterator2.hasNext()) {
                                IntentFilter next = listIterator.next();
                                IntentFilter next2 = listIterator2.next();
                                if (next != next2) {
                                    if (next == null || next2 == null || (countActions = next.countActions()) != next2.countActions()) {
                                        break;
                                    }
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= countActions) {
                                            int countCategories = next.countCategories();
                                            if (countCategories != next2.countCategories()) {
                                                break;
                                            }
                                            for (int i3 = 0; i3 < countCategories; i3++) {
                                                if (!next.getCategory(i3).equals(next2.getCategory(i3))) {
                                                    break loop0;
                                                }
                                            }
                                        } else {
                                            if (!next.getAction(i2).equals(next2.getAction(i2))) {
                                                break loop0;
                                            }
                                            i2++;
                                        }
                                    }
                                }
                            }
                            if (!listIterator.hasNext()) {
                            }
                        }
                        arrayList.clear();
                        arrayList.addAll(vw10Var.b());
                        i = 1;
                    }
                    if (this.l != bundle.getInt("playbackType", 1)) {
                        this.l = bundle.getInt("playbackType", 1);
                        i = 1;
                    }
                    if (this.m != bundle.getInt("playbackStream", -1)) {
                        this.m = bundle.getInt("playbackStream", -1);
                        i = 1;
                    }
                    if (this.n != bundle.getInt("deviceType")) {
                        this.n = bundle.getInt("deviceType");
                        i = 1;
                    }
                    int i4 = 3;
                    if (this.o != bundle.getInt("volumeHandling", 0)) {
                        this.o = bundle.getInt("volumeHandling", 0);
                        i = 3;
                    }
                    if (this.p != bundle.getInt("volume")) {
                        this.p = bundle.getInt("volume");
                        i = 3;
                    }
                    if (this.q != bundle.getInt("volumeMax")) {
                        this.q = bundle.getInt("volumeMax");
                    } else {
                        i4 = i;
                    }
                    if (this.r != bundle.getInt("presentationDisplayId", -1)) {
                        this.r = bundle.getInt("presentationDisplayId", -1);
                        i4 |= 5;
                    }
                    if (!Objects.equals(this.s, bundle.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS))) {
                        this.s = bundle.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS);
                        i4 |= 1;
                    }
                    if (!Objects.equals(this.t, (IntentSender) bundle.getParcelable("settingsIntent"))) {
                        this.t = (IntentSender) bundle.getParcelable("settingsIntent");
                        i4 |= 1;
                    }
                    if (this.j != bundle.getBoolean("canDisconnect", false)) {
                        this.j = bundle.getBoolean("canDisconnect", false);
                        i4 |= 5;
                    }
                    ArrayList c = vw10Var.c();
                    ArrayList arrayList2 = new ArrayList();
                    boolean z = c.size() != this.v.size();
                    if (!c.isEmpty()) {
                        h1u c2 = fx10.c();
                        Iterator it = c.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            c2.getClass();
                            String str2 = (String) c2.l.get(new qg90(this.a.d.a.flattenToShortString(), str));
                            Iterator<h> it2 = c2.j.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    hVar = null;
                                    break;
                                }
                                hVar = it2.next();
                                if (hVar.c.equals(str2)) {
                                    break;
                                }
                            }
                            if (hVar != null) {
                                arrayList2.add(hVar);
                                if (!z && !this.v.contains(hVar)) {
                                    z = true;
                                }
                            }
                        }
                    }
                    if (!z) {
                        return i4;
                    }
                    this.v = arrayList2;
                    return i4 | 1;
                }
            }
            return 0;
        }

        public final void j(int i) {
            fx10.b();
            h1u c = fx10.c();
            int min = Math.min(this.q, Math.max(0, i));
            bx10.e g = c.g(this);
            if (g != null) {
                g.f(min);
            }
        }

        public final void k(int i) {
            bx10.e g;
            fx10.b();
            if (i == 0 || (g = fx10.c().g(this)) == null) {
                return;
            }
            g.i(i);
        }

        public final void l(boolean z) {
            fx10.b();
            fx10.c().l(this, 3, z);
        }

        public final boolean m(@NonNull String str) {
            fx10.b();
            Iterator<IntentFilter> it = this.k.iterator();
            while (it.hasNext()) {
                if (it.next().hasCategory(str)) {
                    return true;
                }
            }
            return false;
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
            sb.append(this.c);
            sb.append(", name=");
            sb.append(this.d);
            sb.append(", description=");
            sb.append(this.e);
            sb.append(", iconUri=");
            sb.append(this.f);
            sb.append(", enabled=");
            sb.append(this.g);
            sb.append(", isSystemRoute=");
            sb.append(this.h);
            sb.append(", connectionState=");
            sb.append(this.i);
            sb.append(", canDisconnect=");
            sb.append(this.j);
            sb.append(", playbackType=");
            sb.append(this.l);
            sb.append(", playbackStream=");
            sb.append(this.m);
            sb.append(", deviceType=");
            sb.append(this.n);
            sb.append(", volumeHandling=");
            sb.append(this.o);
            sb.append(", volume=");
            sb.append(this.p);
            sb.append(", volumeMax=");
            sb.append(this.q);
            sb.append(", presentationDisplayId=");
            sb.append(this.r);
            sb.append(", extras=");
            sb.append(this.s);
            sb.append(", settingsIntent=");
            sb.append(this.t);
            sb.append(", providerPackageName=");
            sb.append(this.a.d.a.getPackageName());
            if (e()) {
                sb.append(", members=[");
                int size = this.v.size();
                for (int i = 0; i < size; i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    if (this.v.get(i) != this) {
                        sb.append(((h) this.v.get(i)).c);
                    }
                }
                sb.append(']');
            }
            sb.append(" }");
            return sb.toString();
        }
    }

    public fx10(Context context) {
        this.a = context;
    }

    public static void b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    @NonNull
    public static h1u c() {
        h1u h1uVar = c;
        if (h1uVar != null) {
            return h1uVar;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    @NonNull
    public static fx10 d(@NonNull Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        b();
        if (c == null) {
            c = new h1u(context.getApplicationContext());
        }
        ArrayList<WeakReference<fx10>> arrayList = c.i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                fx10 fx10Var = new fx10(context);
                arrayList.add(new WeakReference<>(fx10Var));
                return fx10Var;
            }
            fx10 fx10Var2 = arrayList.get(size).get();
            if (fx10Var2 == null) {
                arrayList.remove(size);
            } else if (fx10Var2.a == context) {
                return fx10Var2;
            }
        }
    }

    @Nullable
    public static MediaSessionCompat.Token e() {
        h1u h1uVar = c;
        if (h1uVar == null) {
            return null;
        }
        h1u.c cVar = h1uVar.D;
        if (cVar != null) {
            return cVar.a.getSessionToken();
        }
        MediaSessionCompat mediaSessionCompat = h1uVar.E;
        if (mediaSessionCompat != null) {
            return mediaSessionCompat.getSessionToken();
        }
        return null;
    }

    @NonNull
    public static h f() {
        b();
        return c().h();
    }

    public static boolean g() {
        Bundle bundle;
        if (c == null) {
            return false;
        }
        rx10 rx10Var = c().v;
        return rx10Var == null || (bundle = rx10Var.e) == null || bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
    }

    public static void i(@Nullable jpg0 jpg0Var) {
        b();
        jw10 jw10Var = c().s;
        if (jw10Var == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        jw10.a.a(jw10Var.j, jpg0Var != null ? jpg0.a.a(jpg0Var) : null);
    }

    public static void j(@Nullable rx10 rx10Var) {
        b();
        h1u c2 = c();
        rx10 rx10Var2 = c2.v;
        h1u.b bVar = c2.a;
        c2.v = rx10Var;
        if (c2.i()) {
            if (c2.s == null) {
                jw10 jw10Var = new jw10(c2.h, c2.new d());
                c2.s = jw10Var;
                c2.a(jw10Var, true);
                c2.n();
            }
            boolean z = rx10Var.d;
            jw10 jw10Var2 = c2.s;
            jw10Var2.q = z;
            jw10Var2.m();
            kqf0 kqf0Var = c2.c;
            kqf0Var.f = z;
            kqf0Var.c.post(kqf0Var.i);
            if ((rx10Var2 != null && rx10Var2.c) != rx10Var.c) {
                jw10 jw10Var3 = c2.s;
                jw10Var3.f = c2.B;
                if (!jw10Var3.g) {
                    jw10Var3.g = true;
                    jw10Var3.d.sendEmptyMessage(2);
                }
            }
        } else {
            jw10 jw10Var4 = c2.s;
            if (jw10Var4 != null) {
                g d2 = c2.d(jw10Var4);
                if (d2 != null) {
                    b();
                    jw10Var4.e = null;
                    jw10Var4.k(null);
                    c2.p(d2, null);
                    bVar.b(514, d2);
                    c2.m.remove(d2);
                }
                c2.s = null;
                kqf0 kqf0Var2 = c2.c;
                kqf0Var2.c.post(kqf0Var2.i);
            }
        }
        bVar.b(769, rx10Var);
    }

    public static void k(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        b();
        h1u c2 = c();
        h c3 = c2.c();
        if (c2.h() != c3) {
            c2.l(c3, i, true);
        }
    }

    public final void a(@NonNull ex10 ex10Var, @NonNull a aVar, int i) {
        b bVar;
        ex10 ex10Var2;
        if (ex10Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        b();
        ArrayList<b> arrayList = this.b;
        int size = arrayList.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (arrayList.get(i2).b == aVar) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            bVar = new b(this, aVar);
            arrayList.add(bVar);
        } else {
            bVar = arrayList.get(i2);
        }
        boolean z2 = true;
        if (i != bVar.d) {
            bVar.d = i;
            z = true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if ((i & 1) != 0) {
            z = true;
        }
        bVar.e = elapsedRealtime;
        ex10 ex10Var3 = bVar.c;
        ex10Var3.a();
        ex10Var.a();
        if (ex10Var3.b.containsAll(ex10Var.b)) {
            z2 = z;
        } else {
            ex10 ex10Var4 = bVar.c;
            if (ex10Var4 == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            ex10Var4.a();
            ArrayList<String> arrayList2 = !ex10Var4.b.isEmpty() ? new ArrayList<>(ex10Var4.b) : null;
            ArrayList c2 = ex10Var.c();
            if (!c2.isEmpty()) {
                Iterator it = c2.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    if (!arrayList2.contains(str)) {
                        arrayList2.add(str);
                    }
                }
            }
            if (arrayList2 == null) {
                ex10Var2 = ex10.c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList2);
                ex10Var2 = new ex10(bundle, arrayList2);
            }
            bVar.c = ex10Var2;
        }
        if (z2) {
            c().n();
        }
    }

    public final void h(@NonNull a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        b();
        ArrayList<b> arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (arrayList.get(i).b == aVar) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.remove(i);
            c().n();
        }
    }

    /* compiled from: MediaRouter.java */
    public static abstract class c {
        public void a(@Nullable Bundle bundle) {
        }

        public void b(@Nullable Bundle bundle) {
        }
    }
}
