package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.v0;
import com.google.common.base.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class cna1 {
    public static final Object g = new Object();
    public static volatile lja1 h;
    public static final AtomicInteger i;
    public final eid a;
    public final String b;
    public final Object c;
    public volatile int d = -1;
    public volatile Object e;
    public final /* synthetic */ int f;

    static {
        new AtomicReference();
        i = new AtomicInteger();
    }

    public /* synthetic */ cna1(eid eidVar, String str, Object obj, int i2) {
        this.f = i2;
        if (((Uri) eidVar.b) == null) {
            ny61.g("Must pass a valid SharedPreferences file name or ContentProvider URI");
            throw null;
        }
        this.a = eidVar;
        this.b = str;
        this.c = obj;
    }

    public final Object a(Object obj) {
        int i2 = this.f;
        String str = this.b;
        switch (i2) {
            case 0:
                if (obj instanceof Long) {
                    return (Long) obj;
                }
                if (obj instanceof String) {
                    try {
                        return Long.valueOf(Long.parseLong((String) obj));
                    } catch (NumberFormatException unused) {
                    }
                }
                String obj2 = obj.toString();
                Log.e("PhenotypeFlag", g8e.r(new StringBuilder(str.length() + 25 + obj2.length()), "Invalid long value for ", str, Extension.COLON_SPACE, obj2));
                return null;
            case 1:
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (uha1.b.matcher(str2).matches()) {
                        return Boolean.TRUE;
                    }
                    if (uha1.c.matcher(str2).matches()) {
                        return Boolean.FALSE;
                    }
                }
                String obj3 = obj.toString();
                Log.e("PhenotypeFlag", g8e.r(new StringBuilder(str.length() + 28 + obj3.length()), "Invalid boolean value for ", str, Extension.COLON_SPACE, obj3));
                return null;
            case 2:
                if (obj instanceof Double) {
                    return (Double) obj;
                }
                if (obj instanceof Float) {
                    return Double.valueOf(((Float) obj).doubleValue());
                }
                if (obj instanceof String) {
                    try {
                        return Double.valueOf(Double.parseDouble((String) obj));
                    } catch (NumberFormatException unused2) {
                    }
                }
                String obj4 = obj.toString();
                Log.e("PhenotypeFlag", g8e.r(new StringBuilder(str.length() + 27 + obj4.length()), "Invalid double value for ", str, Extension.COLON_SPACE, obj4));
                return null;
            default:
                if (obj instanceof String) {
                    return (String) obj;
                }
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001c, B:13:0x0028, B:16:0x0044, B:18:0x0051, B:20:0x0059, B:22:0x0069, B:24:0x0077, B:27:0x009c, B:30:0x00a4, B:31:0x00a7, B:32:0x00ab, B:33:0x0080, B:35:0x0084, B:37:0x0092, B:39:0x0098, B:43:0x00b0, B:44:0x00b2, B:48:0x00b3), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001c, B:13:0x0028, B:16:0x0044, B:18:0x0051, B:20:0x0059, B:22:0x0069, B:24:0x0077, B:27:0x009c, B:30:0x00a4, B:31:0x00a7, B:32:0x00ab, B:33:0x0080, B:35:0x0084, B:37:0x0092, B:39:0x0098, B:43:0x00b0, B:44:0x00b2, B:48:0x00b3), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001c, B:13:0x0028, B:16:0x0044, B:18:0x0051, B:20:0x0059, B:22:0x0069, B:24:0x0077, B:27:0x009c, B:30:0x00a4, B:31:0x00a7, B:32:0x00ab, B:33:0x0080, B:35:0x0084, B:37:0x0092, B:39:0x0098, B:43:0x00b0, B:44:0x00b2, B:48:0x00b3), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b() {
        String str;
        Uri uri;
        Object obj;
        String b;
        rhw0 rhw0Var;
        int i2 = i.get();
        if (this.d < i2) {
            synchronized (this) {
                try {
                    if (this.d < i2) {
                        lja1 lja1Var = h;
                        Optional a = Optional.a();
                        Object obj2 = null;
                        if (lja1Var != null && (rhw0Var = lja1Var.b) != null) {
                            a = (Optional) rhw0Var.get();
                            if (a.c()) {
                                str = ((yka1) a.b()).a((Uri) this.a.b, this.b);
                                ffx.r("Must call PhenotypeFlagInitializer.maybeInit() first", lja1Var == null);
                                eid eidVar = this.a;
                                uri = (Uri) eidVar.b;
                                if (uri != null) {
                                    Context context = lja1Var.a;
                                    throw null;
                                }
                                t0 a2 = pma1.a(lja1Var.a, uri) ? t0.a(lja1Var.a.getContentResolver(), uri, uj.M) : null;
                                if (a2 != null) {
                                    String str2 = (String) a2.b().get(this.b);
                                    if (str2 != null) {
                                        obj = a(str2);
                                        if (obj == null) {
                                            if (!eidVar.a && (b = v0.a(lja1Var.a).b(this.b)) != null) {
                                                obj2 = a(b);
                                            }
                                            obj = obj2 == null ? this.c : obj2;
                                        }
                                        if (a.c()) {
                                            obj = str == null ? this.c : a(str);
                                        }
                                        this.e = obj;
                                        this.d = i2;
                                    }
                                }
                                obj = null;
                                if (obj == null) {
                                }
                                if (a.c()) {
                                }
                                this.e = obj;
                                this.d = i2;
                            }
                        }
                        str = null;
                        ffx.r("Must call PhenotypeFlagInitializer.maybeInit() first", lja1Var == null);
                        eid eidVar2 = this.a;
                        uri = (Uri) eidVar2.b;
                        if (uri != null) {
                        }
                    }
                } finally {
                }
            }
        }
        return this.e;
    }
}
