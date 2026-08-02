package xsna;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.MediaRouter2$TransferCallback;
import android.media.RouteDiscoveryPreference;
import android.media.RouteListingPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.bx10;
import xsna.fx10;
import xsna.h1u;
import xsna.vw10;

/* compiled from: MediaRoute2Provider.java */
/* loaded from: classes12.dex */
public final class jw10 extends bx10 {
    public final MediaRouter2 j;
    public final h1u.d k;
    public final ArrayMap l;
    public final MediaRouter2$RouteCallback m;
    public final h n;
    public final c o;
    public final az4 p;
    public boolean q;
    public ArrayList r;
    public final ArrayMap s;

    /* compiled from: MediaRoute2Provider.java */
    public static class a {
        public static void a(@NonNull MediaRouter2 mediaRouter2, @Nullable RouteListingPreference routeListingPreference) {
            mediaRouter2.setRouteListingPreference(routeListingPreference);
        }
    }

    /* compiled from: MediaRoute2Provider.java */
    public static abstract class b {
    }

    /* compiled from: MediaRoute2Provider.java */
    public class c extends MediaRouter2$ControllerCallback {
        public c() {
        }

        public final void onControllerUpdated(@NonNull MediaRouter2.RoutingController routingController) {
            jw10.this.n(routingController);
        }
    }

    /* compiled from: MediaRoute2Provider.java */
    public class d extends bx10.b {
        public final String f;
        public final MediaRouter2.RoutingController g;

        @Nullable
        public final Messenger h;

        @Nullable
        public final Messenger i;
        public final Handler k;

        @Nullable
        public vw10 o;
        public final SparseArray<fx10.c> j = new SparseArray<>();
        public final AtomicInteger l = new AtomicInteger(1);
        public final kv3 m = new kv3(this, 12);
        public int n = -1;

        /* compiled from: MediaRoute2Provider.java */
        public class a extends Handler {
            public a() {
                super(Looper.getMainLooper());
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int i = message.what;
                int i2 = message.arg1;
                Object obj = message.obj;
                Bundle peekData = message.peekData();
                SparseArray<fx10.c> sparseArray = d.this.j;
                fx10.c cVar = sparseArray.get(i2);
                if (cVar == null) {
                    return;
                }
                sparseArray.remove(i2);
                if (i == 3) {
                    cVar.b((Bundle) obj);
                } else {
                    if (i != 4) {
                        return;
                    }
                    if (peekData != null) {
                        peekData.getString("error");
                    }
                    cVar.a((Bundle) obj);
                }
            }
        }

        public d(@NonNull MediaRouter2.RoutingController routingController, @NonNull String str) {
            Bundle controlHints;
            this.g = routingController;
            this.f = str;
            controlHints = routingController.getControlHints();
            Messenger messenger = controlHints == null ? null : (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
            this.h = messenger;
            this.i = messenger != null ? new Messenger(new a()) : null;
            this.k = new Handler(Looper.getMainLooper());
        }

        @Override // xsna.bx10.e
        public final void d() {
            this.g.release();
        }

        @Override // xsna.bx10.e
        public final void f(int i) {
            MediaRouter2.RoutingController routingController = this.g;
            if (routingController == null) {
                return;
            }
            routingController.setVolume(i);
            this.n = i;
            Handler handler = this.k;
            kv3 kv3Var = this.m;
            handler.removeCallbacks(kv3Var);
            handler.postDelayed(kv3Var, 1000L);
        }

        @Override // xsna.bx10.e
        public final void i(int i) {
            int volumeMax;
            MediaRouter2.RoutingController routingController = this.g;
            if (routingController == null) {
                return;
            }
            int i2 = this.n;
            if (i2 < 0) {
                i2 = routingController.getVolume();
            }
            int i3 = i2 + i;
            volumeMax = this.g.getVolumeMax();
            int max = Math.max(0, Math.min(i3, volumeMax));
            this.n = max;
            this.g.setVolume(max);
            Handler handler = this.k;
            kv3 kv3Var = this.m;
            handler.removeCallbacks(kv3Var);
            handler.postDelayed(kv3Var, 1000L);
        }

        @Override // xsna.bx10.b
        public final void m(@NonNull String str) {
            MediaRoute2Info l;
            if (str == null || str.isEmpty() || (l = jw10.this.l(str)) == null) {
                return;
            }
            this.g.selectRoute(l);
        }

        @Override // xsna.bx10.b
        public final void n(@NonNull String str) {
            MediaRoute2Info l;
            if (str == null || str.isEmpty() || (l = jw10.this.l(str)) == null) {
                return;
            }
            this.g.deselectRoute(l);
        }

        @Override // xsna.bx10.b
        public final void o(@Nullable ArrayList arrayList) {
            if (arrayList.isEmpty()) {
                return;
            }
            String str = (String) arrayList.get(0);
            jw10 jw10Var = jw10.this;
            MediaRoute2Info l = jw10Var.l(str);
            if (l == null) {
                return;
            }
            jw10Var.j.transferTo(l);
        }
    }

    /* compiled from: MediaRoute2Provider.java */
    public class e extends bx10.e {
        public final String a;
        public final d b;

        public e(@Nullable String str, @Nullable d dVar) {
            this.a = str;
            this.b = dVar;
        }

        @Override // xsna.bx10.e
        public final void f(int i) {
            d dVar;
            boolean isReleased;
            String str = this.a;
            if (str == null || (dVar = this.b) == null) {
                return;
            }
            Messenger messenger = dVar.h;
            MediaRouter2.RoutingController routingController = dVar.g;
            if (routingController != null) {
                isReleased = routingController.isReleased();
                if (isReleased || messenger == null) {
                    return;
                }
                int andIncrement = dVar.l.getAndIncrement();
                Message obtain = Message.obtain();
                obtain.what = 7;
                obtain.arg1 = andIncrement;
                Bundle bundle = new Bundle();
                bundle.putInt("volume", i);
                bundle.putString("routeId", str);
                obtain.setData(bundle);
                obtain.replyTo = dVar.i;
                try {
                    messenger.send(obtain);
                } catch (DeadObjectException unused) {
                } catch (RemoteException e) {
                    Log.e("MR2Provider", "Could not send control request to service.", e);
                }
            }
        }

        @Override // xsna.bx10.e
        public final void i(int i) {
            d dVar;
            boolean isReleased;
            String str = this.a;
            if (str == null || (dVar = this.b) == null) {
                return;
            }
            Messenger messenger = dVar.h;
            MediaRouter2.RoutingController routingController = dVar.g;
            if (routingController != null) {
                isReleased = routingController.isReleased();
                if (isReleased || messenger == null) {
                    return;
                }
                int andIncrement = dVar.l.getAndIncrement();
                Message obtain = Message.obtain();
                obtain.what = 8;
                obtain.arg1 = andIncrement;
                Bundle bundle = new Bundle();
                bundle.putInt("volume", i);
                bundle.putString("routeId", str);
                obtain.setData(bundle);
                obtain.replyTo = dVar.i;
                try {
                    messenger.send(obtain);
                } catch (DeadObjectException unused) {
                } catch (RemoteException e) {
                    Log.e("MR2Provider", "Could not send control request to service.", e);
                }
            }
        }
    }

    /* compiled from: MediaRoute2Provider.java */
    public class f extends MediaRouter2$RouteCallback {
        public f() {
        }

        public final void onRoutesAdded(@NonNull List<MediaRoute2Info> list) {
            jw10.this.m();
        }

        public final void onRoutesChanged(@NonNull List<MediaRoute2Info> list) {
            jw10.this.m();
        }

        public final void onRoutesRemoved(@NonNull List<MediaRoute2Info> list) {
            jw10.this.m();
        }
    }

    /* compiled from: MediaRoute2Provider.java */
    public class g extends MediaRouter2$RouteCallback {
        public g() {
        }

        public final void onRoutesUpdated(@NonNull List<MediaRoute2Info> list) {
            jw10.this.m();
        }
    }

    /* compiled from: MediaRoute2Provider.java */
    public class h extends MediaRouter2$TransferCallback {
        public h() {
        }

        public final void onStop(@NonNull MediaRouter2.RoutingController routingController) {
            fx10.h c;
            bx10.e eVar = (bx10.e) jw10.this.l.remove(routingController);
            if (eVar == null) {
                Objects.toString(routingController);
                return;
            }
            h1u h1uVar = h1u.this;
            if (eVar != h1uVar.e || h1uVar.h() == (c = h1uVar.c())) {
                return;
            }
            h1uVar.m(c, 2, true);
        }

        public final void onTransfer(@NonNull MediaRouter2.RoutingController routingController, @NonNull MediaRouter2.RoutingController routingController2) {
            MediaRouter2.RoutingController systemController;
            List selectedRoutes;
            String id;
            fx10.h hVar;
            jw10.this.l.remove(routingController);
            systemController = jw10.this.j.getSystemController();
            if (routingController2 == systemController) {
                h1u h1uVar = h1u.this;
                fx10.h c = h1uVar.c();
                if (h1uVar.h() != c) {
                    h1uVar.m(c, 3, true);
                    return;
                }
                return;
            }
            selectedRoutes = routingController2.getSelectedRoutes();
            if (selectedRoutes.isEmpty()) {
                return;
            }
            id = aw10.a(selectedRoutes.get(0)).getId();
            jw10.this.l.put(routingController2, jw10.this.new d(routingController2, id));
            h1u h1uVar2 = h1u.this;
            Iterator<fx10.h> it = h1uVar2.j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hVar = null;
                    break;
                }
                hVar = it.next();
                if (hVar.c() == h1uVar2.s && TextUtils.equals(id, hVar.b)) {
                    break;
                }
            }
            if (hVar != null) {
                h1uVar2.m(hVar, 3, true);
            }
            jw10.this.n(routingController2);
        }

        public final void onTransferFailure(@NonNull MediaRoute2Info mediaRoute2Info) {
            Objects.toString(mediaRoute2Info);
        }
    }

    public jw10(@NonNull Context context, @NonNull h1u.d dVar) {
        super(context, null);
        MediaRouter2 mediaRouter2;
        this.l = new ArrayMap();
        this.n = new h();
        this.o = new c();
        this.r = new ArrayList();
        this.s = new ArrayMap();
        mediaRouter2 = MediaRouter2.getInstance(context);
        this.j = mediaRouter2;
        this.k = dVar;
        this.p = new az4(new Handler(Looper.getMainLooper()));
        if (Build.VERSION.SDK_INT >= 34) {
            this.m = new g();
        } else {
            this.m = new f();
        }
    }

    @Override // xsna.bx10
    @Nullable
    public final bx10.b a(@NonNull String str, @NonNull bx10.f fVar) {
        Iterator it = this.l.entrySet().iterator();
        while (it.hasNext()) {
            d dVar = (d) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, dVar.f)) {
                return dVar;
            }
        }
        return null;
    }

    @Override // xsna.bx10
    @Nullable
    public final bx10.e f(@NonNull String str) {
        return new e((String) this.s.get(str), null);
    }

    @Override // xsna.bx10
    @Nullable
    public final bx10.e g(@NonNull String str, @NonNull String str2) {
        String str3 = (String) this.s.get(str);
        for (d dVar : this.l.values()) {
            vw10 vw10Var = dVar.o;
            if (TextUtils.equals(str2, vw10Var != null ? vw10Var.d() : dVar.g.getId())) {
                return new e(str3, dVar);
            }
        }
        return new e(str3, null);
    }

    @Override // xsna.bx10
    public final void i(@Nullable yw10 yw10Var) {
        ArrayList<String> arrayList;
        ex10 ex10Var;
        RouteDiscoveryPreference build;
        String str;
        int i = fx10.c == null ? 0 : fx10.c().C;
        MediaRouter2$RouteCallback mediaRouter2$RouteCallback = this.m;
        c cVar = this.o;
        h hVar = this.n;
        if (i <= 0) {
            this.j.unregisterRouteCallback(mediaRouter2$RouteCallback);
            this.j.unregisterTransferCallback(hVar);
            this.j.unregisterControllerCallback(cVar);
            return;
        }
        rx10 rx10Var = fx10.c().v;
        boolean z = rx10Var == null ? false : rx10Var.c;
        if (yw10Var == null) {
            yw10Var = new yw10(ex10.c, false);
        }
        yw10Var.a();
        ArrayList c2 = yw10Var.b.c();
        if (!z) {
            c2.remove("android.media.intent.category.LIVE_AUDIO");
        } else if (!c2.contains("android.media.intent.category.LIVE_AUDIO")) {
            c2.add("android.media.intent.category.LIVE_AUDIO");
        }
        if (c2.isEmpty()) {
            arrayList = null;
        } else {
            Iterator it = c2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2 == null) {
                    throw new IllegalArgumentException("category must not be null");
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList == null) {
            ex10Var = ex10.c;
        } else {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", arrayList);
            ex10Var = new ex10(bundle, arrayList);
        }
        boolean b2 = yw10Var.b();
        if (ex10Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("selector", ex10Var.a);
        bundle2.putBoolean("activeScan", b2);
        MediaRouter2 mediaRouter2 = this.j;
        ex10Var.a();
        if (ex10Var.b.contains(null)) {
            enl.c();
            build = ox10.b(new ArrayList()).build();
        } else {
            boolean z2 = bundle2.getBoolean("activeScan");
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = ex10Var.c().iterator();
            while (it2.hasNext()) {
                str = (String) it2.next();
                str.getClass();
                switch (str) {
                    case "android.media.intent.category.REMOTE_PLAYBACK":
                        str = "android.media.route.feature.REMOTE_PLAYBACK";
                        break;
                    case "android.media.intent.category.LIVE_AUDIO":
                        str = "android.media.route.feature.LIVE_AUDIO";
                        break;
                    case "android.media.intent.category.LIVE_VIDEO":
                        str = "android.media.route.feature.LIVE_VIDEO";
                        break;
                    case "android.media.intent.category.REMOTE_AUDIO_PLAYBACK":
                        str = "android.media.route.feature.REMOTE_AUDIO_PLAYBACK";
                        break;
                    case "android.media.intent.category.REMOTE_VIDEO_PLAYBACK":
                        str = "android.media.route.feature.REMOTE_VIDEO_PLAYBACK";
                        break;
                }
                arrayList2.add(str);
            }
            build = nx10.a(arrayList2, z2).build();
        }
        az4 az4Var = this.p;
        mediaRouter2.registerRouteCallback(az4Var, mediaRouter2$RouteCallback, build);
        this.j.registerTransferCallback(az4Var, hVar);
        this.j.registerControllerCallback(az4Var, cVar);
    }

    @Nullable
    public final MediaRoute2Info l(@Nullable String str) {
        String id;
        if (str == null) {
            return null;
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            MediaRoute2Info a2 = aw10.a(it.next());
            id = a2.getId();
            if (TextUtils.equals(id, str)) {
                return a2;
            }
        }
        return null;
    }

    public final void m() {
        List routes;
        Bundle extras;
        String id;
        boolean isSystemRoute;
        String id2;
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        routes = this.j.getRoutes();
        Iterator it = routes.iterator();
        while (it.hasNext()) {
            MediaRoute2Info a2 = aw10.a(it.next());
            if (a2 != null && !arraySet.contains(a2)) {
                isSystemRoute = a2.isSystemRoute();
                if (!isSystemRoute) {
                    if (this.q) {
                        id2 = a2.getId();
                        if (!id2.startsWith(this.b.getPackageName() + DomExceptionUtils.SEPARATOR)) {
                        }
                    }
                    arraySet.add(a2);
                    arrayList.add(a2);
                }
            }
        }
        if (arrayList.equals(this.r)) {
            return;
        }
        this.r = arrayList;
        ArrayMap arrayMap = this.s;
        arrayMap.clear();
        Iterator it2 = this.r.iterator();
        while (it2.hasNext()) {
            MediaRoute2Info a3 = aw10.a(it2.next());
            extras = a3.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                a3.toString();
            } else {
                id = a3.getId();
                arrayMap.put(id, extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = this.r.iterator();
        while (it3.hasNext()) {
            vw10 b2 = px10.b(aw10.a(it3.next()));
            if (b2 != null) {
                arrayList2.add(b2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (!arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                vw10 vw10Var = (vw10) it4.next();
                if (vw10Var == null) {
                    throw new IllegalArgumentException("route must not be null");
                }
                if (arrayList3.contains(vw10Var)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                arrayList3.add(vw10Var);
            }
        }
        j(new dx10(arrayList3, true));
    }

    public final void n(MediaRouter2.RoutingController routingController) {
        List selectedRoutes;
        Bundle controlHints;
        vw10.a aVar;
        int volume;
        int volumeMax;
        int volumeHandling;
        List selectableRoutes;
        List deselectableRoutes;
        String id;
        d dVar = (d) this.l.get(routingController);
        if (dVar == null) {
            Objects.toString(routingController);
            return;
        }
        selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            routingController.toString();
            return;
        }
        ArrayList a2 = px10.a(selectedRoutes);
        vw10 b2 = px10.b(aw10.a(selectedRoutes.get(0)));
        controlHints = routingController.getControlHints();
        String string = this.b.getString(R.string.mr_dialog_default_group_name);
        vw10 vw10Var = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    vw10Var = new vw10(bundle);
                }
            } catch (Exception unused) {
            }
        }
        if (vw10Var == null) {
            id = routingController.getId();
            aVar = new vw10.a(id, string);
            Bundle bundle2 = aVar.a;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
        } else {
            aVar = new vw10.a(vw10Var);
        }
        volume = routingController.getVolume();
        Bundle bundle3 = aVar.a;
        bundle3.putInt("volume", volume);
        volumeMax = routingController.getVolumeMax();
        bundle3.putInt("volumeMax", volumeMax);
        volumeHandling = routingController.getVolumeHandling();
        bundle3.putInt("volumeHandling", volumeHandling);
        aVar.c.clear();
        aVar.a(b2.b());
        aVar.b.clear();
        if (!a2.isEmpty()) {
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("groupMemberId must not be empty");
                }
                ArrayList arrayList = aVar.b;
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        vw10 b3 = aVar.b();
        selectableRoutes = routingController.getSelectableRoutes();
        ArrayList a3 = px10.a(selectableRoutes);
        deselectableRoutes = routingController.getDeselectableRoutes();
        ArrayList a4 = px10.a(deselectableRoutes);
        dx10 dx10Var = this.h;
        if (dx10Var == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        List<vw10> list = dx10Var.a;
        if (!list.isEmpty()) {
            for (vw10 vw10Var2 : list) {
                String d2 = vw10Var2.d();
                arrayList2.add(new bx10.b.a(vw10Var2, a2.contains(d2) ? 3 : 1, a4.contains(d2), a3.contains(d2), true));
            }
        }
        dVar.o = b3;
        dVar.l(b3, arrayList2);
    }
}
