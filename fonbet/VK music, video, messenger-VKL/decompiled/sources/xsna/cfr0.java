package xsna;

import java.util.concurrent.ExecutorService;
import xsna.ext;

/* compiled from: VKSessionDataHandler.java */
/* loaded from: classes7.dex */
public final class cfr0 {
    public static final ExecutorService a;

    static {
        asu0.a.getClass();
        a = asu0.l();
    }

    public static void a(ext.b bVar, boolean z) {
        a.execute(new zer0(bVar, z, 0));
    }
}
