package defpackage;

import java.util.HashMap;
import kotlin.text.Regex;

/* loaded from: classes12.dex */
public final class fd implements ed {
    public final pj a;

    public fd(pj pjVar) {
        this.a = pjVar;
    }

    public final void c(dd ddVar) {
        String d = cia1.d(ddVar);
        if (d != null) {
            pj pjVar = this.a;
            pjVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("event_prefix", d);
            HashMap hashMap2 = new HashMap();
            Regex regex = sho.a;
            pjVar.a.a(sb2.q("${event_prefix}.didPressBackButton", hashMap), hashMap, 1, hashMap2);
        }
    }

    public final void d(dd ddVar, Boolean bool) {
        String d = cia1.d(ddVar);
        if (d != null) {
            pj pjVar = this.a;
            pjVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("event_prefix", d);
            if (bool != null) {
                hashMap.put("authorized", bool);
            }
            HashMap hashMap2 = new HashMap();
            Regex regex = sho.a;
            pjVar.a.a(sb2.q("${event_prefix}.didTapConfirmButton", hashMap), hashMap, 1, hashMap2);
        }
    }

    public final void e(dd ddVar) {
        String d = cia1.d(ddVar);
        if (d != null) {
            pj pjVar = this.a;
            pjVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("event_prefix", d);
            HashMap hashMap2 = new HashMap();
            Regex regex = sho.a;
            pjVar.a.a(sb2.q("${event_prefix}.didTapCancelButton", hashMap), hashMap, 1, hashMap2);
        }
    }

    public final void f(dd ddVar, String str) {
        String d = cia1.d(ddVar);
        if (d != null) {
            pj pjVar = this.a;
            pjVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("event_prefix", d);
            if (str != null) {
                hashMap.put("source", str);
            }
            HashMap hashMap2 = new HashMap();
            Regex regex = sho.a;
            pjVar.a.a(sb2.q("${event_prefix}.didOpenLink", hashMap), hashMap, 1, hashMap2);
        }
    }

    public final void g(dd ddVar) {
        String d = cia1.d(ddVar);
        if (d != null) {
            pj pjVar = this.a;
            pjVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("event_prefix", d);
            HashMap hashMap2 = new HashMap();
            Regex regex = sho.a;
            pjVar.a.a(sb2.q("${event_prefix}.didShowConfirmationView", hashMap), hashMap, 1, hashMap2);
        }
    }
}
