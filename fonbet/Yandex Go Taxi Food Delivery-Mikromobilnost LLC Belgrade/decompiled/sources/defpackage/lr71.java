package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.a;
import kotlin.sequences.b;
import yads.ab3;
import yads.k43;
import yads.za3;

/* loaded from: classes7.dex */
public final class lr71 {
    public final Set a;

    public /* synthetic */ lr71(Set set) {
        this.a = set;
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Iterator it = b.q(new h73(4, ((ji81) obj).c), 50).iterator();
            while (true) {
                if (it.hasNext()) {
                    String str = (String) it.next();
                    if (cvu0.x(evu0.k0(str).toString(), "at ", false)) {
                        Set set = kl71.a;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            Iterator it2 = set.iterator();
                            while (it2.hasNext()) {
                                if (evu0.y(str, (String) it2.next(), false)) {
                                    arrayList.add(obj);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:6:0x0015, B:11:0x003e, B:19:0x002a, B:21:0x0034), top: B:5:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0009 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList a(ArrayList arrayList) {
        hx81 hx81Var;
        LinkedHashMap a;
        Thread thread;
        StackTraceElement[] stackTraceElementArr;
        boolean b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ji81 ji81Var = (ji81) it.next();
            try {
                i3y i3yVar = kp61.a;
                a = kp61.a(ji81Var.c);
                thread = (Thread) a.Q(a.keySet());
            } catch (Throwable unused) {
            }
            if (thread != null && (stackTraceElementArr = (StackTraceElement[]) a.get(thread)) != null) {
                Set set = kl71.a;
                b = kl71.b(stackTraceElementArr, this.a);
                if (b) {
                    hx81Var = new hx81(ji81Var, a);
                    if (hx81Var != null) {
                        arrayList2.add(hx81Var);
                    }
                }
                hx81Var = null;
                if (hx81Var != null) {
                }
            }
            b = false;
            if (b) {
            }
            hx81Var = null;
            if (hx81Var != null) {
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r6 <= 100.0f) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ab3 c(String str) {
        Long l;
        Integer num;
        int parseInt;
        Float f;
        k43 k43Var = k43.d;
        Set set = this.a;
        if (set.contains(k43Var) && "start".equals(str)) {
            return new ab3(za3.b, 0.0f);
        }
        if (set.contains(k43.e) && "end".equals(str)) {
            return new ab3(za3.c, 100.0f);
        }
        if (set.contains(k43.c) && cvu0.s(str, "%", false)) {
            try {
                f = avu0.j(str.substring(0, evu0.C(str)));
                if (f != null) {
                    float floatValue = f.floatValue();
                    if (0.0f <= floatValue) {
                    }
                }
            } catch (Throwable unused) {
            }
            f = null;
            if (f != null) {
                return new ab3(za3.c, f.floatValue());
            }
            return null;
        }
        if (!set.contains(k43.f) || !cvu0.x(str, ShimmerDivHandler.NUMBER_SING, false)) {
            if (!set.contains(k43.b)) {
                return null;
            }
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
                l = Long.valueOf(simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse("00:00:00").getTime());
            } catch (ParseException unused2) {
                l = null;
            }
            if (l != null) {
                return new ab3(za3.b, l.longValue());
            }
            return null;
        }
        try {
            parseInt = Integer.parseInt(str.substring(1));
        } catch (Exception unused3) {
        }
        if (parseInt >= 1) {
            num = Integer.valueOf(parseInt);
            if (num == null) {
                return new ab3(za3.d, num.intValue());
            }
            return null;
        }
        num = null;
        if (num == null) {
        }
    }
}
