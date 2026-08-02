package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import jason.statham.interpreter.error.a;
import jason.statham.utils.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class nrb1 {
    public static final ArrayList a(Map map, tls tlsVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            x450 x450Var = (x450) entry.getValue();
            if (!(x450Var != null ? Boolean.valueOf(x450Var.b) : null).booleanValue() && !x450Var.c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) tlsVar.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final View b(View view) {
        Context context = view.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            return activity.getWindow().getDecorView();
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            return b(view2);
        }
        return null;
    }

    public static boolean c(Object obj) {
        if (!(obj instanceof String)) {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            throw oyr.y(obj, "Function \"bool\" is not defined for ");
        }
        try {
            return evu0.i0((String) obj);
        } catch (Exception unused) {
            throw a.f("String \"" + obj + "\" cannot be parsed as boolean");
        }
    }

    public static LinkedHashMap d(Object obj) {
        if (!(obj instanceof String)) {
            throw oyr.y(obj, "Function \"dict\" is not defined for ");
        }
        hif hifVar = new hif(((String) obj).toCharArray());
        Character e = jason.statham.utils.a.e(hifVar);
        if (e != null && e.charValue() == '{') {
            return jason.statham.utils.a.a.d(hifVar);
        }
        b.a("Expecting '{', got '" + e + '\'');
        throw null;
    }

    public static double e(Object obj) {
        if (obj instanceof Long) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof String) {
            return Double.parseDouble((String) obj);
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? 1.0d : 0.0d;
        }
        if (obj instanceof Double) {
            return ((Number) obj).doubleValue();
        }
        throw oyr.y(obj, "Function \"float\" is not defined for ");
    }

    public static long f(Object obj) {
        if (obj instanceof Double) {
            return (long) ((Number) obj).doubleValue();
        }
        if (obj instanceof String) {
            return Long.parseLong((String) obj);
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? 1L : 0L;
        }
        if (obj instanceof Long) {
            return ((Number) obj).longValue();
        }
        throw oyr.y(obj, "Function \"int\" is not defined for ");
    }

    public static String g(Object obj) {
        StringBuilder sb = new StringBuilder();
        jason.statham.utils.a.a(sb, obj);
        return sb.toString();
    }

    public static ArrayList h(Object obj) {
        if (!(obj instanceof String)) {
            throw oyr.y(obj, "Function \"list\" is not defined for ");
        }
        hif hifVar = new hif(((String) obj).toCharArray());
        Character e = jason.statham.utils.a.e(hifVar);
        if (e != null && e.charValue() == '[') {
            return jason.statham.utils.a.a.b(hifVar);
        }
        b.a("Expecting '[', got '" + e + '\'');
        throw null;
    }

    public static String i(Object obj) {
        if (!(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof Boolean)) {
            if (obj instanceof List) {
                StringBuilder sb = new StringBuilder();
                jason.statham.utils.a.a(sb, obj);
                return sb.toString();
            }
            if (obj instanceof Map) {
                StringBuilder sb2 = new StringBuilder();
                jason.statham.utils.a.a(sb2, obj);
                return sb2.toString();
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            throw oyr.y(obj, "Function \"str\" is not defined for ");
        }
        return obj.toString();
    }
}
