package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import yads.t32;
import yads.xz;

/* loaded from: classes7.dex */
public final class oy61 {
    public static in61 a(Context context, fe81 fe81Var, fw81 fw81Var) {
        String decode;
        HashMap hashMap;
        new yc81();
        y381 y381Var = new y381(context);
        mj31 mj31Var = fe81Var.b;
        hh61 hh61Var = fe81Var.c;
        in61 b = b(context, fw81Var, mj31Var, y381Var);
        nl61 nl61Var = fe81Var.e;
        if (nl61Var != null) {
            b.R = null;
            if ("".length() == 0) {
                decode = null;
            } else {
                String encode = Uri.encode("");
                if (encode != null && encode.length() > 2048) {
                    rj71.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 2048, 2048);
                    String encode2 = Uri.encode("\n");
                    encode = encode.substring(0, 2048);
                    int L = evu0.L(encode2, encode, 6);
                    if (!cvu0.s(encode, encode2, false) && L >= 0) {
                        encode = encode.substring(0, L);
                    }
                }
                decode = Uri.decode(encode);
            }
            b.S = decode;
            b.t0 = null;
            b.u0 = null;
            Map map = nl61Var.b;
            if (map != null && !map.isEmpty()) {
                hashMap = new HashMap();
                StringBuilder sb = new StringBuilder();
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    sb.append("&");
                    sb.append(Uri.encode(str));
                    sb.append("=");
                    sb.append(Uri.encode(str2));
                    if (sb.length() > 61440) {
                        rj71.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 61440, 61440);
                        break;
                    }
                    hashMap.put(str, str2);
                }
            } else {
                hashMap = null;
            }
            if (hashMap != null) {
                b.h.putAll(hashMap);
            }
        }
        xz xzVar = fe81Var.a;
        if (xzVar != null) {
            b.v = xzVar.b;
        }
        b.m = fe81Var.j;
        b.u = hh61Var.a;
        t32 t32Var = fe81Var.f;
        if (t32Var != null) {
            b.U = t32Var.b;
        }
        a271 a271Var = fe81Var.d.a;
        if (a271Var != null) {
            jd81 jd81Var = (jd81) a271Var;
            b.y = jd81Var.a.b;
            b.w = Integer.valueOf(jd81Var.b(context));
            b.x = Integer.valueOf(jd81Var.a(context));
        }
        b.X = fe81Var.h;
        b.Y = fe81Var.i;
        int i = fe81Var.n;
        b.z = 1 == i ? "portrait" : "landscape";
        String str3 = hh61Var.a;
        if (str3 != null) {
            new oq81();
            String string = oq81.a(context, "ViewSizeInfoStorage").getString(str3 + "-" + i, null);
            if (string != null) {
                b.z0 = string;
            }
        }
        return b;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:286:0x0201
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0203 A[Catch: Exception -> 0x0201, TryCatch #20 {Exception -> 0x0201, blocks: (B:82:0x01ef, B:287:0x0203, B:289:0x0209, B:290:0x020e), top: B:81:0x01ef }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x014d A[Catch: Exception -> 0x01a2, TryCatch #19 {Exception -> 0x01a2, blocks: (B:57:0x013a, B:296:0x014d, B:298:0x0153, B:299:0x0155, B:301:0x0164, B:303:0x0178, B:307:0x0199, B:311:0x019d), top: B:56:0x013a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0112 A[Catch: Exception -> 0x0118, TRY_LEAVE, TryCatch #2 {Exception -> 0x0118, blocks: (B:47:0x00fe, B:49:0x0112), top: B:46:0x00fe }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012f A[Catch: Exception -> 0x0136, TRY_LEAVE, TryCatch #3 {Exception -> 0x0136, blocks: (B:52:0x011b, B:54:0x012f), top: B:51:0x011b }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static defpackage.in61 b(android.content.Context r16, defpackage.fw81 r17, defpackage.mj31 r18, defpackage.y381 r19) {
        /*
            Method dump skipped, instructions count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oy61.b(android.content.Context, fw81, mj31, y381):in61");
    }
}
