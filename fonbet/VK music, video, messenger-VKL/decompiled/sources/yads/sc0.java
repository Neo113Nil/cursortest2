package yads;

import android.net.Uri;
import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.monetization.ads.exo.source.dash.offline.DashDownloader;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes10.dex */
public final class sc0 implements tj0 {
    public static final SparseArray c;
    public final qr a;
    public final Executor b;

    static {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, a(DashDownloader.class));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, a(Class.forName("com.monetization.ads.exo.source.hls.offline.HlsDownloader")));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, a(Class.forName("com.monetization.ads.exo.source.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        c = sparseArray;
    }

    public sc0(qr qrVar, ExecutorService executorService) {
        this.a = (qr) ni.a(qrVar);
        this.b = (Executor) ni.a(executorService);
    }

    public final sj0 a(qj0 qj0Var) {
        bn1 bn1Var;
        bn1 bn1Var2;
        int a = mc3.a(qj0Var.c, qj0Var.d);
        if (a != 0 && a != 1 && a != 2) {
            if (a != 4) {
                throw new IllegalArgumentException(nh2.a("Unsupported type: ", a));
            }
            tm1 tm1Var = new tm1();
            wm1 wm1Var = new wm1();
            List list = Collections.EMPTY_LIST;
            tn2 tn2Var = tn2.f;
            dn1 dn1Var = dn1.d;
            Uri uri = qj0Var.c;
            String str = qj0Var.g;
            if (wm1Var.b != null && wm1Var.a == null) {
                throw new IllegalStateException();
            }
            if (uri != null) {
                bn1Var2 = new bn1(uri, null, wm1Var.a != null ? new xm1(wm1Var) : null, list, str, tn2Var, null);
            } else {
                bn1Var2 = null;
            }
            return new yk2(new gn1("", new vm1(tm1Var), bn1Var2, new zm1(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f), kn1.H, dn1Var), this.a, this.b);
        }
        Constructor constructor = (Constructor) c.get(a);
        if (constructor == null) {
            throw new IllegalStateException(nh2.a("Module missing for content type ", a));
        }
        tm1 tm1Var2 = new tm1();
        wm1 wm1Var2 = new wm1();
        tn2 tn2Var2 = tn2.f;
        dn1 dn1Var2 = dn1.d;
        Uri uri2 = qj0Var.c;
        List list2 = qj0Var.e;
        List unmodifiableList = (list2 == null || list2.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list2));
        String str2 = qj0Var.g;
        if (wm1Var2.b != null && wm1Var2.a == null) {
            throw new IllegalStateException();
        }
        if (uri2 != null) {
            bn1Var = new bn1(uri2, null, wm1Var2.a != null ? new xm1(wm1Var2) : null, unmodifiableList, str2, tn2Var2, null);
        } else {
            bn1Var = null;
        }
        try {
            return (sj0) constructor.newInstance(new gn1("", new vm1(tm1Var2), bn1Var, new zm1(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f), kn1.H, dn1Var2), this.a, this.b);
        } catch (Exception unused) {
            throw new IllegalStateException(nh2.a("Failed to instantiate downloader for content type ", a));
        }
    }

    public static Constructor a(Class cls) {
        try {
            return cls.asSubclass(sj0.class).getConstructor(gn1.class, qr.class, Executor.class);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Downloader constructor missing", e);
        }
    }
}
