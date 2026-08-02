package ru.ok.tracer.crash.report;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import xsna.jgp;
import xsna.ohk0;
import xsna.pn00;
import xsna.qhk0;
import xsna.rdp0;

/* compiled from: OpenTelemetryHelper.kt */
/* loaded from: classes9.dex */
public final class OpenTelemetryHelper {
    public static final OpenTelemetryHelper INSTANCE = new OpenTelemetryHelper();
    private static final String PROPERTY_KEY_SPAN_ID = "spanId";
    private static final String PROPERTY_KEY_TRACE_FLAGS = "traceFlags";
    private static final String PROPERTY_KEY_TRACE_ID = "traceId";
    private static Method asHex;
    private static boolean available;
    private static Method current;
    private static Method getSpanContext;
    private static Method getSpanId;
    private static Method getTraceFlags;
    private static Method getTraceId;
    private static Method isValid;

    static {
        try {
            current = ohk0.class.getDeclaredMethod("current", null);
            getSpanContext = ohk0.class.getDeclaredMethod("getSpanContext", null);
            isValid = qhk0.class.getDeclaredMethod("isValid", null);
            getTraceId = qhk0.class.getDeclaredMethod("getTraceId", null);
            getSpanId = qhk0.class.getDeclaredMethod("getSpanId", null);
            getTraceFlags = qhk0.class.getDeclaredMethod("getTraceFlags", null);
            asHex = rdp0.class.getDeclaredMethod("asHex", null);
            available = true;
        } catch (Exception unused) {
            available = false;
        }
    }

    private OpenTelemetryHelper() {
    }

    private final Object invoke(Object obj, Method method, Object... objArr) {
        return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    private final Object invokeStatic(Method method, Object... objArr) {
        return method.invoke(null, Arrays.copyOf(objArr, objArr.length));
    }

    public final Map<String, String> collectContext() {
        boolean z = available;
        jgp jgpVar = jgp.b;
        if (!z) {
            return jgpVar;
        }
        try {
            Method method = current;
            Method method2 = null;
            if (method == null) {
                method = null;
            }
            Object invokeStatic = invokeStatic(method, new Object[0]);
            Method method3 = getSpanContext;
            if (method3 == null) {
                method3 = null;
            }
            Object invoke = invoke(invokeStatic, method3, new Object[0]);
            Method method4 = isValid;
            if (method4 == null) {
                method4 = null;
            }
            if (!((Boolean) invoke(invoke, method4, new Object[0])).booleanValue()) {
                return jgpVar;
            }
            Method method5 = getTraceId;
            if (method5 == null) {
                method5 = null;
            }
            String str = (String) invoke(invoke, method5, new Object[0]);
            Method method6 = getSpanId;
            if (method6 == null) {
                method6 = null;
            }
            String str2 = (String) invoke(invoke, method6, new Object[0]);
            Method method7 = getTraceFlags;
            if (method7 == null) {
                method7 = null;
            }
            Object invoke2 = invoke(invoke, method7, new Object[0]);
            Method method8 = asHex;
            if (method8 != null) {
                method2 = method8;
            }
            return pn00.k(new Pair(PROPERTY_KEY_TRACE_ID, str), new Pair(PROPERTY_KEY_SPAN_ID, str2), new Pair(PROPERTY_KEY_TRACE_FLAGS, (String) invoke(invoke2, method2, new Object[0])));
        } catch (Exception unused) {
            available = false;
            return jgpVar;
        }
    }
}
