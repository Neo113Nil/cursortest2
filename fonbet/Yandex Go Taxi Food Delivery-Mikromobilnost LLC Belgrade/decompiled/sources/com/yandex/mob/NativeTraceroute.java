package com.yandex.mob;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.slc;
import defpackage.x4e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\f\u0010\u0010J\u001e\u0010\u0012\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0086 ¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/mob/NativeTraceroute;", "", "<init>", "()V", "Lzy11;", "clearResult", "", "text", "appendResult", "(Ljava/lang/String;)V", "hostname", "Lslc;", "traceRoute", "(Ljava/lang/String;)Lslc;", "", "args", "([Ljava/lang/String;)Lslc;", "", "execute", "([Ljava/lang/String;)I", "resultUpdateLock", "Ljava/lang/Object;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", TarifficatorScenarioActivity.RESULT_KEY, "Ljava/lang/StringBuilder;", "traceroute_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NativeTraceroute {
    public static final NativeTraceroute INSTANCE = new NativeTraceroute();
    private static volatile StringBuilder result;
    private static final Object resultUpdateLock;

    static {
        try {
            System.loadLibrary("traceroute");
        } catch (Throwable unused) {
        }
        resultUpdateLock = new Object();
    }

    private NativeTraceroute() {
    }

    public final void appendResult(String text) {
        synchronized (resultUpdateLock) {
            try {
                if (result == null) {
                    result = new StringBuilder();
                }
                StringBuilder sb = result;
                if (sb != null) {
                    sb.append(text);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clearResult() {
        synchronized (resultUpdateLock) {
            result = null;
        }
    }

    public final native int execute(String[] args);

    public final slc traceRoute(String[] args) {
        slc slcVar = new slc();
        slcVar.a = -1;
        slcVar.b = "";
        int execute = execute(args);
        slcVar.a = execute;
        if (execute == 0) {
            slcVar.b = String.valueOf(result);
            return slcVar;
        }
        slcVar.b = x4e.g("Traceroute failed: ", result);
        return slcVar;
    }

    public final slc traceRoute(String hostname) {
        return traceRoute(new String[]{"traceroute", hostname});
    }
}
