package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class o081 {
    public final mt81 a;
    public final ks81 b;
    public final ao61 c;
    public final HashMap d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01de, code lost:
    
        if (r4.equals("string") == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ec, code lost:
    
        if ((r8 instanceof android.widget.TextView) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ee, code lost:
    
        r4 = (android.widget.TextView) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01f3, code lost:
    
        if (r4 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f5, code lost:
    
        r4 = new defpackage.l881(new defpackage.t271((android.widget.TextView) r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01f2, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01e7, code lost:
    
        if (r4.equals("number") == false) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o081(aj31 aj31Var, fe81 fe81Var, v981 v981Var, v881 v881Var, bl61 bl61Var, ck61 ck61Var, ui21 ui21Var, rr41 rr41Var, ml71 ml71Var, d881 d881Var, hlx0 hlx0Var, nr41 nr41Var, j981 j981Var, ak81 ak81Var, jzz jzzVar, ks81 ks81Var) {
        i281 i281Var;
        mt81 mt81Var = mt81.a;
        xg81 xg81Var = (xg81) aj31Var.b;
        pk61 pk61Var = new pk61(xg81Var.c, xg81Var.d);
        pk61Var.b = xg81Var.a;
        pk61Var.c = xg81Var.b;
        pk61Var.e = xg81Var.e;
        ao61 ao61Var = new ao61(pk61Var);
        w040 w040Var = new w040(ui21Var, fe81Var, bl61Var, ck61Var.d, nr41Var, j981Var, new tf81(ao61Var), ak81Var);
        Context context = ((n291) v981Var).a;
        ge71 c = wha1.c(context, context);
        fp71 fp71Var = new fp71(d881Var, v881Var, w040Var, rr41Var, ml71Var, jzzVar);
        HashMap hashMap = new HashMap();
        View b = ao61Var.b("close_button");
        TextView textView = b instanceof TextView ? (TextView) b : null;
        nq81 nq81Var = textView != null ? new nq81(textView) : null;
        hashMap.put("close_button", nq81Var != null ? new l881(nq81Var) : null);
        View b2 = ao61Var.b("feedback");
        ImageView imageView = b2 instanceof ImageView ? (ImageView) b2 : null;
        jj61 jj61Var = imageView != null ? new jj61(imageView, new no6(imageView.getContext(), new w7o(d881Var), v881Var)) : null;
        hashMap.put("feedback", jj61Var != null ? new i481(jj61Var) : null);
        kgx[] kgxVarArr = ao61.g;
        kgx kgxVar = kgxVarArr[1];
        ImageView imageView2 = (ImageView) ao61Var.b.a.get();
        View b3 = ao61Var.b("media");
        hashMap.put("media", fp71Var.d(imageView2, b3 instanceof CustomizableMediaView ? (CustomizableMediaView) b3 : null));
        View b4 = ao61Var.b("rating");
        zl81 zl81Var = b4 instanceof kp81 ? new zl81(b4, c) : null;
        hashMap.put("rating", zl81Var != null ? new l881(zl81Var) : null);
        View a = ao61Var.a();
        r471 r471Var = a != null ? new r471(a) : null;
        hashMap.put("root_container", r471Var != null ? new l881(r471Var) : null);
        kgx kgxVar2 = kgxVarArr[4];
        List list = (List) ao61Var.e.a.get();
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw unr0.i(it);
            }
        }
        for (uy71 uy71Var : (List) hlx0Var.b) {
            String str = uy71Var.a;
            View b5 = ao61Var.b(str);
            if (b5 != null && !hashMap.containsKey(str)) {
                String str2 = uy71Var.b;
                switch (str2.hashCode()) {
                    case -1034364087:
                        break;
                    case -891985903:
                        break;
                    case -410956671:
                        if (str2.equals("container")) {
                            i281Var = new l881(new r471(b5));
                            break;
                        }
                        i281Var = null;
                        break;
                    case 100313435:
                        if (str2.equals("image")) {
                            if ((b5 instanceof ImageView ? (ImageView) b5 : null) != null) {
                                i281Var = new i481(new v871((ImageView) b5, (v881) fp71Var.b, (d881) fp71Var.a));
                                break;
                            }
                        }
                        i281Var = null;
                        break;
                    case 103772132:
                        if (str2.equals("media")) {
                            if ((b5 instanceof CustomizableMediaView ? (CustomizableMediaView) b5 : null) != null) {
                                i281Var = fp71Var.d(null, (CustomizableMediaView) b5);
                                break;
                            }
                        }
                        i281Var = null;
                        break;
                    case 1124446108:
                        if (str2.equals("warning")) {
                            if ((b5 instanceof TextView ? (TextView) b5 : null) != null) {
                                i281Var = new l881(new yj71((TextView) b5));
                                break;
                            }
                        }
                        i281Var = null;
                        break;
                    default:
                        i281Var = null;
                        break;
                }
                hashMap.put(str, i281Var == null ? new l881(new sv71(b5)) : i281Var);
            }
        }
        for (Map.Entry entry : ao61Var.f.entrySet()) {
            String str3 = (String) entry.getKey();
            View view = (View) ((WeakReference) entry.getValue()).get();
            if (view != null && !hashMap.containsKey(str3)) {
                hashMap.put(str3, new l881(new sv71(view)));
            }
        }
        this.a = mt81Var;
        this.b = ks81Var;
        this.c = ao61Var;
        this.d = hashMap;
    }

    public final i281 a(uy71 uy71Var) {
        if (uy71Var != null) {
            return (i281) this.d.get(uy71Var.a);
        }
        return null;
    }

    public final void b() {
        for (i281 i281Var : this.d.values()) {
            if (i281Var != null) {
                i281Var.a();
            }
        }
    }
}
