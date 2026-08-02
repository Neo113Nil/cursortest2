package xsna;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONException;

/* compiled from: ConfigGetParameterHandler.java */
/* loaded from: classes.dex */
public final class pxi {
    public static final Pattern e;
    public static final Pattern f;
    public final HashSet a = new HashSet();
    public final Executor b;
    public final ixi c;
    public final ixi d;

    static {
        Charset.forName(C.UTF8_NAME);
        e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public pxi(Executor executor, ixi ixiVar, ixi ixiVar2) {
        this.b = executor;
        this.c = ixiVar;
        this.d = ixiVar2;
    }

    @Nullable
    public static com.google.firebase.remoteconfig.internal.a b(ixi ixiVar) {
        synchronized (ixiVar) {
            try {
                Task<com.google.firebase.remoteconfig.internal.a> task = ixiVar.c;
                if (task != null && task.isSuccessful()) {
                    return ixiVar.c.getResult();
                }
                try {
                    Task<com.google.firebase.remoteconfig.internal.a> b = ixiVar.b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (com.google.firebase.remoteconfig.internal.a) ixi.a(b);
                } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static HashSet c(ixi ixiVar) {
        HashSet hashSet = new HashSet();
        com.google.firebase.remoteconfig.internal.a b = b(ixiVar);
        if (b != null) {
            Iterator<String> keys = b.b().keys();
            while (keys.hasNext()) {
                hashSet.add(keys.next());
            }
        }
        return hashSet;
    }

    @Nullable
    public static String d(ixi ixiVar, String str) {
        com.google.firebase.remoteconfig.internal.a b = b(ixiVar);
        if (b == null) {
            return null;
        }
        try {
            return b.b().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void a(com.google.firebase.remoteconfig.internal.a aVar, String str) {
        if (aVar == null) {
            return;
        }
        synchronized (this.a) {
            try {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    this.b.execute(new wu6((ry6) it.next(), str, aVar, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
