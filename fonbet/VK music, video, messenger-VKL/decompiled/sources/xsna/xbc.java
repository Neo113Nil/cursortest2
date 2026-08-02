package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import xsna.lvf0;

/* compiled from: ChromeCastManager.kt */
/* loaded from: classes8.dex */
public final class xbc {
    public d0a a;
    public final avj0 b;
    public final gbr0 c;
    public final hbr0 d;
    public final uz9 e;
    public g0a f;
    public final m0g0 g;
    public final v20 h;
    public final LinkedHashSet i;
    public final wbc j;

    /* compiled from: ChromeCastManager.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaRouteConnectStatus.values().length];
            try {
                iArr[MediaRouteConnectStatus.NO_DEVICES_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaRouteConnectStatus.NOT_CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaRouteConnectStatus.CONNECTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaRouteConnectStatus.CONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [xsna.wbc] */
    public xbc(Context context, d0a d0aVar, avj0 avj0Var, gbr0 gbr0Var, hbr0 hbr0Var) {
        hui0 d;
        hui0 d2;
        hui0 d3;
        g0a c;
        hui0 d4;
        this.a = d0aVar;
        this.b = avj0Var;
        this.c = gbr0Var;
        this.d = hbr0Var;
        uz9 e = uz9.e(context.getApplicationContext());
        this.e = e;
        this.f = (e == null || (d4 = e.d()) == null) ? null : d4.c();
        this.g = new m0g0(new xi7(this));
        this.h = new v20(this, 11);
        this.i = new LinkedHashSet();
        this.j = new lvf0.d() { // from class: xsna.wbc
            @Override // xsna.lvf0.d
            public final void onProgressUpdated(long j, long j2) {
                Iterator it = xbc.this.i.iterator();
                while (it.hasNext()) {
                    ((y2e0) it.next()).a(j);
                }
            }
        };
        CopyOnWriteArrayList<ez9> copyOnWriteArrayList = xsi0.a;
        if (e != null) {
            e.a(xsi0.f);
        }
        if (e != null && (d3 = e.d()) != null && (c = d3.c()) != null) {
            xsi0.c(c);
        }
        if (e != null) {
            int b = e.b();
            xsi0.b(b != 1 ? b != 2 ? b != 3 ? b != 4 ? MediaRouteConnectStatus.NO_DEVICES_AVAILABLE : MediaRouteConnectStatus.CONNECTED : MediaRouteConnectStatus.CONNECTING : MediaRouteConnectStatus.NOT_CONNECTED : MediaRouteConnectStatus.NO_DEVICES_AVAILABLE);
        }
        qus qusVar = new qus(new k15());
        if (e != null && (d2 = e.d()) != null) {
            d2.e(qusVar);
        }
        if (e != null && (d = e.d()) != null) {
            d.a(qusVar);
        }
        Integer valueOf = e != null ? Integer.valueOf(e.b()) : null;
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            a(intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? MediaRouteConnectStatus.NO_DEVICES_AVAILABLE : MediaRouteConnectStatus.CONNECTED : MediaRouteConnectStatus.CONNECTING : MediaRouteConnectStatus.NOT_CONNECTED : MediaRouteConnectStatus.NO_DEVICES_AVAILABLE);
        }
    }

    public final void a(MediaRouteConnectStatus mediaRouteConnectStatus) {
        int i = a.$EnumSwitchMapping$0[mediaRouteConnectStatus.ordinal()];
        hbr0 hbr0Var = this.d;
        if (i == 1) {
            hbr0Var.b();
            return;
        }
        if (i == 2) {
            hbr0Var.c();
        } else if (i == 3) {
            hbr0Var.a();
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            hbr0Var.onConnected();
        }
    }

    public final void b(d0a d0aVar) {
        lvf0 k;
        this.a = d0aVar;
        g0a g0aVar = this.f;
        if (g0aVar == null || (k = g0aVar.k()) == null) {
            return;
        }
        k.t(new ybc(k, this));
        if (this.a == null) {
            throw new IllegalStateException("set media item before build media info");
        }
        MediaMetadata mediaMetadata = new MediaMetadata(1);
        d0a d0aVar2 = this.a;
        String str = d0aVar2.a;
        Bundle bundle = mediaMetadata.c;
        if (str != null) {
            MediaMetadata.i(1, "com.google.android.gms.cast.metadata.TITLE");
            bundle.putString("com.google.android.gms.cast.metadata.TITLE", str);
        }
        String str2 = d0aVar2.b;
        if (str2 != null) {
            MediaMetadata.i(1, "com.google.android.gms.cast.metadata.SUBTITLE");
            bundle.putString("com.google.android.gms.cast.metadata.SUBTITLE", str2);
        }
        String str3 = d0aVar2.c;
        if (str3 != null) {
            mediaMetadata.b.add(new WebImage(Uri.parse(str3)));
        }
        int i = d0aVar2.g ? 2 : 1;
        String str4 = d0aVar2.d;
        if (i < -1 || i > 2) {
            throw new IllegalArgumentException("invalid stream type");
        }
        String str5 = d0aVar2.e;
        long j = d0aVar2.f;
        if (j < 0 && j != -1) {
            throw new IllegalArgumentException("Invalid stream duration");
        }
        MediaInfo mediaInfo = new MediaInfo(str4, i, str5, mediaMetadata, j, null, null, d0aVar2.h.toString(), null, null, null, null, -1L, null, null, null, null);
        Boolean bool = Boolean.TRUE;
        long longValue = ((Number) this.b.invoke()).longValue();
        MediaLoadRequestData mediaLoadRequestData = new MediaLoadRequestData(mediaInfo, null, bool, longValue < 0 ? 0L : longValue, 1.0d, null, null, null, null, null, null, 0L);
        exc0.e("Must be called from the main thread.");
        if (k.H()) {
            lvf0.J(new cyz0(k, mediaLoadRequestData));
        } else {
            lvf0.G();
        }
    }
}
