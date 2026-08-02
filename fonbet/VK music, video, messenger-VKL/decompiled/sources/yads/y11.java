package yads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import ru.ok.android.commons.http.Http;

/* loaded from: classes10.dex */
public final class y11 {
    public final o30 a;
    public final String b;
    public final boolean c;
    public final HashMap d;

    public y11(String str, boolean z, pd0 pd0Var) {
        ni.a((z && TextUtils.isEmpty(str)) ? false : true);
        this.a = pd0Var;
        this.b = str;
        this.c = z;
        this.d = new HashMap();
    }

    public final byte[] a(UUID uuid, ln0 ln0Var) {
        String str = ln0Var.b;
        if (this.c || TextUtils.isEmpty(str)) {
            str = this.b;
        }
        if (TextUtils.isEmpty(str)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            ni.a(uri, "The uri must be set.");
            throw new im1(new u30(uri, 0L, 1, null, map, 0L, -1L, null, 0, null), uri, yn2.h, 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = jr.e;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : jr.c.equals(uuid) ? "application/json" : Http.ContentType.APPLICATION_OCTET_STREAM);
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.d) {
            hashMap.putAll(this.d);
        }
        return a(this.a, str, ln0Var.a, hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [yads.u30] */
    /* JADX WARN: Type inference failed for: r5v3, types: [yads.u30] */
    public static byte[] a(o30 o30Var, String str, byte[] bArr, Map map) {
        Exception exc;
        Map map2;
        List list;
        v43 v43Var = new v43(o30Var.createDataSource());
        Uri parse = Uri.parse(str);
        ni.a(parse, "The uri must be set.");
        String str2 = "The uri must be set.";
        ?? u30Var = new u30(parse, 0L, 2, bArr, map, 0L, -1L, null, 1, null);
        int i = 0;
        u30 u30Var2 = u30Var;
        int i2 = 0;
        String str3 = u30Var;
        while (true) {
            try {
                r30 r30Var = new r30(v43Var, u30Var2);
                try {
                    try {
                        int i3 = mc3.a;
                        byte[] bArr2 = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int read = r30Var.read(bArr2);
                            if (read != -1) {
                                byteArrayOutputStream.write(bArr2, i, read);
                            } else {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                try {
                                    mc3.a((Closeable) r30Var);
                                    return byteArray;
                                } catch (Exception e) {
                                    exc = e;
                                    str = str3;
                                    Uri uri = v43Var.c;
                                    uri.getClass();
                                    throw new im1(str, uri, v43Var.a.getResponseHeaders(), v43Var.b, exc);
                                }
                            }
                        }
                    } catch (u11 e2) {
                        int i4 = e2.e;
                        String str4 = ((i4 != 307 && i4 != 308) || i2 >= 5 || (map2 = e2.f) == null || (list = (List) map2.get("Location")) == null || list.isEmpty()) ? null : (String) list.get(i);
                        if (str4 != null) {
                            i2++;
                            long j = u30Var2.b;
                            int i5 = u30Var2.c;
                            byte[] bArr3 = u30Var2.d;
                            Map map3 = u30Var2.e;
                            long j2 = u30Var2.f;
                            long j3 = u30Var2.g;
                            String str5 = u30Var2.h;
                            int i6 = u30Var2.i;
                            Object obj = u30Var2.j;
                            Uri parse2 = Uri.parse(str4);
                            str = str3;
                            String str6 = str2;
                            try {
                                ni.a(parse2, str6);
                                u30 u30Var3 = new u30(parse2, j, i5, bArr3, map3, j2, j3, str5, i6, obj);
                                try {
                                    mc3.a((Closeable) r30Var);
                                    str2 = str6;
                                    u30Var2 = u30Var3;
                                    i = 0;
                                    str3 = str;
                                } catch (Exception e3) {
                                    e = e3;
                                    exc = e;
                                    Uri uri2 = v43Var.c;
                                    uri2.getClass();
                                    throw new im1(str, uri2, v43Var.a.getResponseHeaders(), v43Var.b, exc);
                                }
                            } catch (Throwable th) {
                                th = th;
                                mc3.a((Closeable) r30Var);
                                throw th;
                            }
                        } else {
                            throw e2;
                        }
                        th = th;
                        mc3.a((Closeable) r30Var);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    mc3.a((Closeable) r30Var);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                str = str3;
            }
        }
    }

    public final byte[] a(on0 on0Var) {
        return a(this.a, on0Var.b + "&signedRequest=" + mc3.a(on0Var.a), null, Collections.EMPTY_MAP);
    }
}
