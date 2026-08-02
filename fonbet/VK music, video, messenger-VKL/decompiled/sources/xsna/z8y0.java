package xsna;

import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class z8y0 {

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a extends z8y0 {
        @Override // xsna.z8y0
        public final String a(u6z0 u6z0Var, Map map, s3z0 s3z0Var, idy0 idy0Var) {
            HashMap hashMap = new HashMap(map);
            hashMap.putAll(c(u6z0Var, s3z0Var, idy0Var.a));
            udz0 udz0Var = u6z0Var.j;
            try {
                return gjz0.a(hashMap);
            } catch (Throwable th) {
                udz0Var.a(0, 1, 1001, "exception: " + gu8.b(th), null);
                return "";
            }
        }

        public int b(Context context) {
            return khy0.a;
        }

        public HashMap c(u6z0 u6z0Var, s3z0 s3z0Var, Context context) {
            HashMap hashMap = new HashMap();
            hashMap.put("formats", u6z0Var.h);
            String str = gt50.a;
            hashMap.put("adman_ver", "5.50.2");
            hashMap.put("sdk_ver_int", gt50.a);
            jgz jgzVar = new jgz(19);
            int i = u6z0Var.f;
            if (i == 0 || i == 2) {
                hashMap.put("preloadvideo", "1");
            }
            String str2 = u6z0Var.e;
            if (str2 != null) {
                hashMap.put("bid_id", str2);
            }
            qnk qnkVar = u6z0Var.a;
            if (jgzVar.u()) {
                String str3 = xr50.b.a;
                if (!TextUtils.isEmpty(str3)) {
                    hashMap.put("vk_id", str3);
                }
                synchronized (qnkVar) {
                    hashMap.putAll(qnkVar.b);
                }
            } else {
                hashMap.putAll(qnkVar.c);
            }
            pp50 pp50Var = xr50.b;
            try {
                hashMap.putAll(gpy0.l.b(pp50Var, jgzVar, s3z0Var, context));
            } catch (Throwable th) {
                gu8.c(null, "AdServiceBuilder: Error collecting data - " + th);
            }
            String a = qnkVar.a("lang");
            if (a != null) {
                hashMap.put("lang", a);
            }
            int b = b(context);
            if (b >= 0) {
                hashMap.put("sdk_flags", String.valueOf(b));
            }
            pp50Var.getClass();
            String str4 = (String) hashMap.get("instance_id");
            if (str4 != null) {
                gu8.c(null, "AdServiceBuilder: Device instanceId is " + str4 + ". Use this value in adInstance.withTestDevices() to enable test mode on this device.");
            }
            return hashMap;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0104, code lost:
        
            r1 = r16;
            r0 = null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void d(String str, u6z0 u6z0Var, Map map, s3z0 s3z0Var, idy0 idy0Var, m8z0 m8z0Var) {
            String str2;
            String str3;
            String str4;
            String b;
            iaz0 iaz0Var;
            String str5;
            j79 j79Var;
            String str6;
            String a = a(u6z0Var, map, s3z0Var, idy0Var);
            StringBuilder e = fw3.e(str);
            int i = u6z0Var.g;
            String str7 = DomExceptionUtils.SEPARATOR;
            String c = h5s.c(i, DomExceptionUtils.SEPARATOR, e);
            n8z0 n8z0Var = m8z0Var.a;
            s3z0 s3z0Var2 = m8z0Var.b;
            ArrayList arrayList = m8z0Var.c;
            b7z0 b7z0Var = m8z0Var.d;
            u6z0 u6z0Var2 = n8z0Var.b;
            if (c == null) {
                u6z0Var2.j.b(0, 1003, "adService == null");
                n8z0Var.g(null, xla.a(iaz0.o), s3z0Var2);
                return;
            }
            s3z0Var2.a(s3z0Var2.d, System.currentTimeMillis() - s3z0Var2.c);
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            HashMap hashMap = new HashMap();
            u6z0Var2.j.c(2000);
            int size = arrayList.size() - 1;
            qez0 qez0Var = null;
            int i2 = 0;
            while (true) {
                if (i2 > size) {
                    str2 = c;
                    break;
                }
                String str8 = (String) arrayList.get(i2);
                str2 = c;
                String c2 = h5s.c(u6z0Var2.g, str7, t33.a("https://", str8, "/mobile/"));
                new ArrayList();
                new ArrayList();
                String str9 = str7;
                e5z0.a(giy0.d, null);
                qez0 d = new v8z0(u6z0Var2.j).d(c2, a, hashMap);
                if (d.a) {
                    j79Var = new j79(d, (String) d.c);
                    str6 = null;
                } else {
                    str6 = null;
                    j79Var = new j79(d, null);
                }
                qez0Var = (qez0) j79Var.b;
                str3 = (String) j79Var.c;
                if (str3 != null) {
                    String trim = str3.trim();
                    if (trim.length() != 0) {
                        if (!ohz0.h(trim)) {
                            if (trim.startsWith("{") && trim.endsWith("}")) {
                                gu8.c(null, "AdResponseParser: JSON is received");
                                break;
                            }
                            gu8.c(null, "AdResponseParser: Unsupported data is received");
                        } else {
                            gu8.c(str6, "AdResponseParser: Vast is received");
                            break;
                        }
                    } else {
                        gu8.c(str6, "AdResponseParser: Empty data");
                    }
                } else {
                    gu8.c(str6, "AdResponseParser: Null data");
                }
                if (i2 == size) {
                    break;
                }
                if (sb.length() != 0) {
                    sb.append(StringUtils.COMMA);
                }
                sb.append(str8);
                hashMap.put("X-Failed-Hosts", sb.toString());
                i2++;
                c = str2;
                str7 = str9;
            }
            qez0 qez0Var2 = qez0Var;
            if (str3 == null) {
                if (qez0Var2 != null) {
                    StringBuilder sb2 = new StringBuilder("response: code=");
                    sb2.append(qez0Var2.b);
                    sb2.append(", error=");
                    b = tdj.a(sb2, qez0Var2.d, ", dataForService=", a);
                } else {
                    b = go9.b("response==null, dataForService=", a);
                }
                u6z0Var2.j.a(0, 1, 2002, b, null);
                if (qez0Var2 == null) {
                    str5 = null;
                    n8z0Var.g(null, xla.a(iaz0.c), s3z0Var2);
                } else {
                    int i3 = qez0Var2.b;
                    String str10 = i3 + " – " + qez0Var2.d;
                    if (i3 == 403) {
                        iaz0Var = iaz0.f;
                    } else if (i3 != 404) {
                        if (i3 != 408) {
                            if (i3 == 500) {
                                iaz0Var = iaz0.h;
                            } else if (i3 != 504) {
                                iaz0Var = i3 == 200 ? iaz0.j : new iaz0(str10);
                            }
                        }
                        iaz0Var = iaz0.e;
                    } else {
                        iaz0Var = iaz0.g;
                    }
                    str5 = null;
                    n8z0Var.g(null, xla.a(iaz0Var), s3z0Var2);
                }
                str4 = str5;
            } else {
                str4 = str3;
            }
            if (str4 == null) {
                return;
            }
            s3z0Var2.a(1, System.currentTimeMillis() - currentTimeMillis);
            n8z0Var.c(str2, a, str4, s3z0Var2, b7z0Var);
        }
    }

    public abstract String a(u6z0 u6z0Var, Map map, s3z0 s3z0Var, idy0 idy0Var);
}
