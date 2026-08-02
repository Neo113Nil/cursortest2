package xsna;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import xsna.h8z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public abstract class h8z0 {
    public static a a;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class a {
        public static final List b = Arrays.asList("urlResolved", "webviewShown", "pageLoaded", "pageLoadFailed", "webviewClosed");
        public static Pattern c = null;
        public static Pattern d = null;
        public final jfz0 a;

        public a(jfz0 jfz0Var) {
            this.a = jfz0Var;
            try {
                c = Pattern.compile("^https://[a-z]+\\.((mail\\.ru)|(mradx\\.net))/pixel/.*$");
                d = Pattern.compile("^https://vk.com/ads_light.php.*$");
            } catch (PatternSyntaxException e) {
                gu8.e(null, "StatResolver: " + e.getLocalizedMessage());
            }
        }

        public final void a(final b6z0 b6z0Var, final HashMap hashMap, int i, final b bVar) {
            if (b6z0Var.c.isEmpty()) {
                gu8.c(null, "No stats here, nothing to send");
                return;
            }
            final e7z0 e7z0Var = new e7z0(b6z0Var.d, i);
            final long H = be.H();
            Runnable runnable = new Runnable() { // from class: xsna.f8z0
                @Override // java.lang.Runnable
                public final void run() {
                    b6z0 b6z0Var2 = b6z0Var;
                    for (z1z0 z1z0Var : b6z0Var2.c) {
                        String str = z1z0Var.a;
                        String str2 = z1z0Var.a;
                        String str3 = z1z0Var.b;
                        StringBuilder a = t33.a("statType=", str, ", needDecode=");
                        a.append(z1z0Var.e);
                        a.append(", statUrl=");
                        a.append(str3);
                        String sb = a.toString();
                        if (z1z0Var instanceof e9z0) {
                            gu8.c(null, "StatResolver: Tracking progress stat value - " + ((e9z0) z1z0Var).f + ", url - " + str3);
                        } else if (z1z0Var instanceof ghy0) {
                            ghy0 ghy0Var = (ghy0) z1z0Var;
                            gu8.c(null, "StatResolver: Tracking ovv stat percent - " + ghy0Var.f + ", value - " + ghy0Var.i + ", ovv - " + ghy0Var.h + ", url - " + str3);
                        } else if (z1z0Var instanceof oiz0) {
                            oiz0 oiz0Var = (oiz0) z1z0Var;
                            int i2 = oiz0Var.f;
                            float f = oiz0Var.h;
                            StringBuilder sb2 = new StringBuilder("StatResolver: Tracking mrc stat percent - , percent - ");
                            sb2.append(i2);
                            sb2.append(", duration - ");
                            sb2.append(f);
                            sb2.append(", url - ");
                            qjk0.a(sb2, str3, null);
                        } else {
                            gu8.c(null, "StatResolver: Tracking stat type - " + str2 + ", url - " + str3);
                        }
                        bqz0 bqz0Var = b6z0Var2.b;
                        HashMap hashMap2 = new HashMap();
                        Map map = hashMap;
                        if (map != null) {
                            hashMap2.putAll(map);
                        }
                        String b2 = z1z0Var.e ? s770.b(str3) : str3;
                        HashMap hashMap3 = new HashMap();
                        if (bqz0Var != null) {
                            Map map2 = (Map) ((HashMap) bqz0Var.b).get(z1z0Var.c);
                            if (map2 != null) {
                                hashMap3.putAll(map2);
                            }
                        }
                        Pattern pattern = h8z0.a.c;
                        boolean z = (pattern != null ? pattern.matcher(b2).matches() : false) && h8z0.a.b.contains(str2);
                        Pattern pattern2 = h8z0.a.d;
                        boolean matches = pattern2 != null ? pattern2.matcher(b2).matches() : false;
                        long j = H;
                        if (z || matches) {
                            hashMap3.put("client_timestamp", String.valueOf(j));
                        }
                        hashMap2.putAll(hashMap3);
                        String a2 = h8z0.a(str3, hashMap2, z1z0Var.e);
                        e7z0 e7z0Var2 = e7z0Var;
                        if (a2 == null) {
                            e7z0Var2.a("url is null for " + sb);
                        } else {
                            h8z0.b bVar2 = bVar;
                            if (bVar2 != null && z1z0Var.d) {
                                bVar2.a();
                            }
                            h8z0.a.this.a.a(a2, str, j, new e7z0(e7z0Var2.a, e7z0Var2.b, e7z0Var2.c, sb), b6z0Var2.a);
                        }
                    }
                }
            };
            Handler handler = this.a.g;
            Objects.requireNonNull(handler);
            handler.post(runnable);
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    /* loaded from: classes14.dex */
    public interface b {
        void a();
    }

    public static String a(String str, Map map, boolean z) {
        if (z) {
            str = s770.b(str);
        }
        if (!URLUtil.isNetworkUrl(str)) {
            wga0.b("StatResolver: Invalid stat url: ", str, null);
            return null;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }

    public static void b(final String str) {
        final a aVar = a;
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        jfz0 jfz0Var = aVar.a;
        Runnable runnable = new Runnable() { // from class: xsna.g8z0
            @Override // java.lang.Runnable
            public final void run() {
                h8z0.a aVar2 = h8z0.a.this;
                aVar2.getClass();
                String a2 = h8z0.a(str, Collections.EMPTY_MAP, true);
                if (a2 != null) {
                    aVar2.a.a(a2, "", currentTimeMillis, e7z0.e, null);
                }
            }
        };
        Handler handler = jfz0Var.g;
        Objects.requireNonNull(handler);
        handler.post(runnable);
    }

    public static void c(ArrayList arrayList, udz0 udz0Var, bqz0 bqz0Var) {
        if (a != null) {
            udz0Var.getClass();
            a.a(b6z0.b(e5z0.b(new giy0(udz0Var, g9y0.g), bqz0Var), arrayList), null, 0, null);
        }
    }

    public static void d(e5z0 e5z0Var, String str) {
        a aVar = a;
        if (aVar != null) {
            aVar.a(e5z0Var.d(str), null, 1, null);
        }
    }

    public static void e(e5z0 e5z0Var, String str, int i, b bVar) {
        a aVar = a;
        if (aVar != null) {
            aVar.a(e5z0Var.j(str), null, i, bVar);
        }
    }

    public static void f(e5z0 e5z0Var, String str, HashMap hashMap, int i) {
        b6z0 j = e5z0Var.j(str);
        a aVar = a;
        if (aVar != null) {
            aVar.a(j, hashMap, i, null);
        }
    }

    public static void g(b6z0 b6z0Var, int i, b bVar) {
        a aVar = a;
        if (aVar != null) {
            aVar.a(b6z0Var, null, i, bVar);
        }
    }

    public static void h(b6z0 b6z0Var, b bVar) {
        if (a == null || b6z0Var.c.isEmpty()) {
            return;
        }
        a.a(b6z0Var, null, 1, bVar);
    }
}
