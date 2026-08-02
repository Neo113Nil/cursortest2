package xsna;

import android.os.Build;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;

/* compiled from: MusicDeviceRestrictionsConfig.kt */
/* loaded from: classes3.dex */
public final class fg40 {
    public static final ListBuilder a;
    public static wkz b;

    static {
        ListBuilder e = e43.e();
        e.add(new mcg0("realme"));
        e.add(new mcg0("xiaomi"));
        e.add(new mcg0("poco"));
        a = e.g();
    }

    public static final eg40 a() {
        Object obj;
        wkz wkzVar = b;
        if (wkzVar != null) {
            return (eg40) wkzVar.b;
        }
        String str = Build.MANUFACTURER + ' ' + Build.MODEL;
        ListIterator listIterator = a.listIterator(0);
        while (true) {
            ListBuilder.a aVar = (ListBuilder.a) listIterator;
            if (!aVar.hasNext()) {
                obj = null;
                break;
            }
            obj = aVar.next();
            if (drm0.D(str, ((mcg0) obj).a, true)) {
                break;
            }
        }
        mcg0 mcg0Var = (mcg0) obj;
        if (mcg0Var == null) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{zr.a("[MusicDeviceRestrictionsConfig] - device ", str, " not restricted")});
            }
            b = new wkz(null);
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        List<k9x> list = mcg0Var.b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((k9x) it.next()).e(i)) {
                    eg40 eg40Var = mcg0Var.c;
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.LogType logType = L.LogType.d;
                        StringBuilder b2 = xy6.b(i, "[MusicDeviceRestrictionsConfig] - device ", str, " with version ", " restricted. Config - ");
                        b2.append(eg40Var);
                        L.u(l2, logType, new Object[]{b2.toString()});
                    }
                    b = new wkz(eg40Var);
                    return eg40Var;
                }
            }
        }
        L l3 = L.a;
        l3.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l3, L.LogType.d, new Object[]{iq.a(i, "[MusicDeviceRestrictionsConfig] - device ", str, " with version ", " not restricted")});
        }
        b = new wkz(null);
        return null;
    }
}
