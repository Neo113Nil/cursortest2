package xsna;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.BundleUtil;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import xsna.bx10;
import xsna.fx10;
import xsna.vw10;

/* compiled from: PlatformMediaRouter1RouteProvider.java */
/* loaded from: classes12.dex */
public abstract class xta0 extends bx10 {

    /* compiled from: PlatformMediaRouter1RouteProvider.java */
    public static class a extends b {
        @Override // xsna.xta0.b
        @SuppressLint({"WrongConstant"})
        public final void r(b.C4046b c4046b, vw10.a aVar) {
            super.r(c4046b, aVar);
            aVar.a.putInt("deviceType", c4046b.a.getDeviceType());
        }
    }

    /* compiled from: PlatformMediaRouter1RouteProvider.java */
    public static class b extends xta0 {
        public static final ArrayList<IntentFilter> t;
        public static final ArrayList<IntentFilter> u;
        public final h1u j;
        public final MediaRouter k;
        public final tx10 l;
        public final ux10 m;
        public final MediaRouter.RouteCategory n;
        public int o;
        public boolean p;
        public boolean q;
        public final ArrayList<C4046b> r;
        public final ArrayList<c> s;

        /* compiled from: PlatformMediaRouter1RouteProvider.java */
        public static final class a extends bx10.e {
            public final MediaRouter.RouteInfo a;

            public a(MediaRouter.RouteInfo routeInfo) {
                this.a = routeInfo;
            }

            @Override // xsna.bx10.e
            public final void f(int i) {
                this.a.requestSetVolume(i);
            }

            @Override // xsna.bx10.e
            public final void i(int i) {
                this.a.requestUpdateVolume(i);
            }
        }

        /* compiled from: PlatformMediaRouter1RouteProvider.java */
        /* renamed from: xsna.xta0$b$b, reason: collision with other inner class name */
        public static final class C4046b {
            public final MediaRouter.RouteInfo a;
            public final String b;
            public vw10 c;

            public C4046b(MediaRouter.RouteInfo routeInfo, String str) {
                this.a = routeInfo;
                this.b = str;
            }
        }

        /* compiled from: PlatformMediaRouter1RouteProvider.java */
        public static final class c {
            public final fx10.h a;
            public final MediaRouter.UserRouteInfo b;

            public c(fx10.h hVar, MediaRouter.UserRouteInfo userRouteInfo) {
                this.a = hVar;
                this.b = userRouteInfo;
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            ArrayList<IntentFilter> arrayList = new ArrayList<>();
            t = arrayList;
            arrayList.add(intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
            ArrayList<IntentFilter> arrayList2 = new ArrayList<>();
            u = arrayList2;
            arrayList2.add(intentFilter2);
        }

        public b(Context context, h1u h1uVar) {
            super(context, new bx10.d(new ComponentName("android", xta0.class.getName())));
            this.r = new ArrayList<>();
            this.s = new ArrayList<>();
            this.j = h1uVar;
            MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
            this.k = mediaRouter;
            a aVar = (a) this;
            this.l = new tx10(aVar);
            this.m = new ux10(aVar);
            this.n = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
            w();
        }

        public static c q(MediaRouter.RouteInfo routeInfo) {
            Object tag = routeInfo.getTag();
            if (tag instanceof c) {
                return (c) tag;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        public static void x(c cVar) {
            MediaRouter.UserRouteInfo userRouteInfo = cVar.b;
            fx10.h hVar = cVar.a;
            userRouteInfo.setName(hVar.d);
            userRouteInfo.setPlaybackType(hVar.l);
            userRouteInfo.setPlaybackStream(hVar.m);
            userRouteInfo.setVolume(hVar.p);
            userRouteInfo.setVolumeMax(hVar.q);
            userRouteInfo.setVolumeHandling((!hVar.e() || fx10.g()) ? hVar.o : 0);
            userRouteInfo.setDescription(hVar.e);
        }

        @Override // xsna.bx10
        public final bx10.e f(@NonNull String str) {
            int n = n(str);
            if (n >= 0) {
                return new a(this.r.get(n).a);
            }
            return null;
        }

        @Override // xsna.bx10
        public final void i(yw10 yw10Var) {
            boolean z;
            int i = 0;
            if (yw10Var != null) {
                yw10Var.a();
                ArrayList c2 = yw10Var.b.c();
                int size = c2.size();
                int i2 = 0;
                while (i < size) {
                    String str = (String) c2.get(i);
                    i2 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i2 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                    i++;
                }
                z = yw10Var.b();
                i = i2;
            } else {
                z = false;
            }
            if (this.o == i && this.p == z) {
                return;
            }
            this.o = i;
            this.p = z;
            w();
        }

        public final boolean l(MediaRouter.RouteInfo routeInfo) {
            String a2;
            if (q(routeInfo) != null || m(routeInfo) >= 0) {
                return false;
            }
            String format = this.k.getDefaultRoute() == routeInfo ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(p(routeInfo).hashCode()));
            if (n(format) >= 0) {
                int i = 2;
                while (true) {
                    Locale locale = Locale.US;
                    a2 = na8.a(i, format, BundleUtil.UNDERLINE_TAG);
                    if (n(a2) < 0) {
                        break;
                    }
                    i++;
                }
                format = a2;
            }
            C4046b c4046b = new C4046b(routeInfo, format);
            vw10.a aVar = new vw10.a(format, p(routeInfo));
            r(c4046b, aVar);
            c4046b.c = aVar.b();
            this.r.add(c4046b);
            return true;
        }

        public final int m(MediaRouter.RouteInfo routeInfo) {
            ArrayList<C4046b> arrayList = this.r;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i).a == routeInfo) {
                    return i;
                }
            }
            return -1;
        }

        public final int n(String str) {
            ArrayList<C4046b> arrayList = this.r;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i).b.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        public final int o(fx10.h hVar) {
            ArrayList<c> arrayList = this.s;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i).a == hVar) {
                    return i;
                }
            }
            return -1;
        }

        public final String p(MediaRouter.RouteInfo routeInfo) {
            Context context = this.b;
            CharSequence name = routeInfo.getName(context);
            if (!TextUtils.isEmpty(name)) {
                return name.toString();
            }
            if ((routeInfo.getSupportedTypes() & 8388608) != 0) {
                return "";
            }
            int deviceType = routeInfo.getDeviceType();
            return context.getString(deviceType != 1 ? deviceType != 2 ? deviceType != 3 ? R.string.mr_route_name_unknown : R.string.mr_route_name_bluetooth : R.string.mr_route_name_speaker : R.string.mr_route_name_tv);
        }

        public void r(C4046b c4046b, vw10.a aVar) {
            Bundle bundle = aVar.a;
            MediaRouter.RouteInfo routeInfo = c4046b.a;
            int supportedTypes = routeInfo.getSupportedTypes();
            if ((supportedTypes & 1) != 0) {
                aVar.a(t);
            }
            if ((supportedTypes & 2) != 0) {
                aVar.a(u);
            }
            bundle.putInt("playbackType", routeInfo.getPlaybackType());
            bundle.putInt("playbackStream", routeInfo.getPlaybackStream());
            bundle.putInt("volume", routeInfo.getVolume());
            bundle.putInt("volumeMax", routeInfo.getVolumeMax());
            bundle.putInt("volumeHandling", routeInfo.getVolumeHandling());
            bundle.putBoolean("isSystemRoute", (8388608 & supportedTypes) == 0);
            if (!routeInfo.isEnabled()) {
                bundle.putBoolean("enabled", false);
            }
            if (routeInfo.isConnecting()) {
                bundle.putInt("connectionState", 1);
            }
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            if (presentationDisplay != null) {
                bundle.putInt("presentationDisplayId", presentationDisplay.getDisplayId());
            }
            CharSequence description = routeInfo.getDescription();
            if (description != null) {
                bundle.putString("status", description.toString());
            }
        }

        public final void s(fx10.h hVar) {
            bx10 c2 = hVar.c();
            MediaRouter mediaRouter = this.k;
            if (c2 == this) {
                int m = m(mediaRouter.getSelectedRoute(8388611));
                if (m < 0 || !this.r.get(m).b.equals(hVar.b)) {
                    return;
                }
                hVar.l(false);
                return;
            }
            MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.n);
            c cVar = new c(hVar, createUserRoute);
            createUserRoute.setTag(cVar);
            createUserRoute.setVolumeCallback(this.m);
            x(cVar);
            this.s.add(cVar);
            mediaRouter.addUserRoute(createUserRoute);
        }

        public final void t(fx10.h hVar) {
            int o;
            if (hVar.c() == this || (o = o(hVar)) < 0) {
                return;
            }
            MediaRouter.UserRouteInfo userRouteInfo = this.s.remove(o).b;
            userRouteInfo.setTag(null);
            userRouteInfo.setVolumeCallback(null);
            try {
                this.k.removeUserRoute(userRouteInfo);
            } catch (IllegalArgumentException unused) {
            }
        }

        public final void u(fx10.h hVar) {
            if (hVar.g()) {
                bx10 c2 = hVar.c();
                MediaRouter mediaRouter = this.k;
                if (c2 != this) {
                    int o = o(hVar);
                    if (o >= 0) {
                        mediaRouter.selectRoute(8388611, this.s.get(o).b);
                        return;
                    }
                    return;
                }
                int n = n(hVar.b);
                if (n >= 0) {
                    mediaRouter.selectRoute(8388611, this.r.get(n).a);
                }
            }
        }

        public final void v() {
            ArrayList arrayList = new ArrayList();
            ArrayList<C4046b> arrayList2 = this.r;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                vw10 vw10Var = arrayList2.get(i).c;
                if (vw10Var == null) {
                    throw new IllegalArgumentException("route must not be null");
                }
                if (arrayList.contains(vw10Var)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                arrayList.add(vw10Var);
            }
            j(new dx10(arrayList, false));
        }

        public final void w() {
            boolean z = this.q;
            tx10 tx10Var = this.l;
            MediaRouter mediaRouter = this.k;
            if (z) {
                mediaRouter.removeCallback(tx10Var);
            }
            this.q = true;
            mediaRouter.addCallback(this.o, tx10Var, (this.p ? 1 : 0) | 2);
            int routeCount = mediaRouter.getRouteCount();
            ArrayList arrayList = new ArrayList(routeCount);
            boolean z2 = false;
            for (int i = 0; i < routeCount; i++) {
                arrayList.add(mediaRouter.getRouteAt(i));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                z2 |= l((MediaRouter.RouteInfo) it.next());
            }
            if (z2) {
                v();
            }
        }
    }
}
