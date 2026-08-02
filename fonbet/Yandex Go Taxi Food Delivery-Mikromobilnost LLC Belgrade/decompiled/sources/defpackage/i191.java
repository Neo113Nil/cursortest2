package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import com.monetization.ads.exo.source.dash.offline.DashDownloader;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import yads.rj0;
import yads.t31;
import yads.wk2;

/* loaded from: classes7.dex */
public final class i191 {
    public static final SparseArray c;
    public final ly61 a;
    public final ExecutorService b;

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

    public i191(ly61 ly61Var, ExecutorService executorService) {
        this.a = ly61Var;
        executorService.getClass();
        this.b = executorService;
    }

    public static Constructor a(Class cls) {
        try {
            return cls.asSubclass(ic81.class).getConstructor(op81.class, ly61.class, Executor.class);
        } catch (NoSuchMethodException e) {
            ny61.h("Downloader constructor missing", e);
            return null;
        }
    }

    public final ic81 b(rj0 rj0Var) {
        int c2 = rf71.c(rj0Var.c, rj0Var.d);
        ExecutorService executorService = this.b;
        ly61 ly61Var = this.a;
        if (c2 != 0 && c2 != 1 && c2 != 2) {
            if (c2 != 4) {
                ny61.g(q8a1.c(c2, "Unsupported type: "));
                return null;
            }
            wp71 wp71Var = new wp71();
            p481 p481Var = t31.b;
            wk2 wk2Var = wk2.x;
            List list = Collections.EMPTY_LIST;
            wk2 wk2Var2 = wk2.x;
            qf81 qf81Var = qf81.c;
            Uri uri = rj0Var.c;
            return new xp61(new op81("", new dw71(wp71Var), uri != null ? new d981(uri, list, rj0Var.g, wk2Var2) : null, new q581(-3.4028235E38f, -3.4028235E38f, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L), oi61.b0, qf81Var), ly61Var, executorService);
        }
        Constructor constructor = (Constructor) c.get(c2);
        if (constructor == null) {
            ny61.r(q8a1.c(c2, "Module missing for content type "));
            return null;
        }
        wp71 wp71Var2 = new wp71();
        p481 p481Var2 = t31.b;
        wk2 wk2Var3 = wk2.x;
        qf81 qf81Var2 = qf81.c;
        Uri uri2 = rj0Var.c;
        List list2 = rj0Var.e;
        try {
            return (ic81) constructor.newInstance(new op81("", new dw71(wp71Var2), uri2 != null ? new d981(uri2, (list2 == null || list2.isEmpty()) ? Collections.EMPTY_LIST : ly3.w(list2), rj0Var.g, wk2Var3) : null, new q581(-3.4028235E38f, -3.4028235E38f, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L), oi61.b0, qf81Var2), ly61Var, executorService);
        } catch (Exception unused) {
            ny61.r(q8a1.c(c2, "Failed to instantiate downloader for content type "));
            return null;
        }
    }
}
