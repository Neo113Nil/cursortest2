package xsna;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import xsna.a1n0;

/* compiled from: DashUtil.java */
/* loaded from: classes12.dex */
public final class ctk {
    public static evk a(e7g0 e7g0Var, String str, rwe0 rwe0Var, int i, com.google.common.collect.h hVar) {
        Map map = Collections.EMPTY_MAP;
        Uri d = neq0.d(str, rwe0Var.c);
        long j = rwe0Var.a;
        long j2 = rwe0Var.b;
        String c = c(e7g0Var, rwe0Var);
        fxc0.t(d, "The uri must be set.");
        return new evk(d, 0L, 1, null, hVar, j, j2, c, i, null);
    }

    @Nullable
    public static fcc b(androidx.media3.datasource.cache.a aVar, int i, e7g0 e7g0Var) throws IOException {
        androidx.media3.datasource.cache.a aVar2;
        ImmutableList<tp6> immutableList = e7g0Var.c;
        rwe0 rwe0Var = e7g0Var.h;
        if (rwe0Var == null) {
            return null;
        }
        androidx.media3.common.a aVar3 = e7g0Var.b;
        String str = aVar3.m;
        a1n0.a.C2516a c2516a = a1n0.a.a;
        co8 co8Var = new co8((str == null || !(str.startsWith("video/webm") || str.startsWith(MimeTypes.AUDIO_WEBM))) ? new mes(c2516a, 32) : new xn10(c2516a, 2), i, aVar3);
        try {
            rwe0Var.getClass();
            rwe0 g = e7g0Var.g();
            if (g != null) {
                rwe0 a = rwe0Var.a(g, immutableList.get(0).a);
                if (a == null) {
                    aVar2 = aVar;
                    new izw(aVar2, a(e7g0Var, immutableList.get(0).a, rwe0Var, 0, com.google.common.collect.h.h), e7g0Var.b, 0, null, co8Var).load();
                } else {
                    aVar2 = aVar;
                    g = a;
                }
                new izw(aVar2, a(e7g0Var, immutableList.get(0).a, g, 0, com.google.common.collect.h.h), e7g0Var.b, 0, null, co8Var).load();
            }
            co8Var.release();
            return co8Var.a();
        } catch (Throwable th) {
            co8Var.release();
            throw th;
        }
    }

    public static String c(e7g0 e7g0Var, rwe0 rwe0Var) {
        String c = e7g0Var.c();
        return c != null ? c : neq0.d(e7g0Var.c.get(0).a, rwe0Var.c).toString();
    }
}
