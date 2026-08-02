package ru.ok.android.internal.tracer;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;
import xsna.mnh0;
import xsna.pn00;
import xsna.qta0;
import xsna.zcl;

/* compiled from: ThrowableDecorator.kt */
/* loaded from: classes9.dex */
public final class ThrowableDecorator extends Throwable {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "ThrowableDecorator";
    private final Map<String, Object> metadata;
    private final Throwable original;

    /* compiled from: ThrowableDecorator.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public ThrowableDecorator(Throwable th, Map<String, ? extends Object> map) {
        super(th.getMessage(), th);
        this.original = th;
        this.metadata = map;
        setStackTrace(th.getStackTrace());
        Iterator<T> it = qta0.a.b(th).iterator();
        while (it.hasNext()) {
            mnh0.d(this, (Throwable) it.next());
        }
    }

    private final boolean validateValueType(Object obj) {
        return (obj == null ? true : obj instanceof Boolean) || (obj instanceof String) || (obj instanceof Number);
    }

    public final ThrowableDecorator addMetadata(String str, Object obj) {
        return addMetadata(new Pair(str, obj));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        String message = this.original.getMessage();
        if (message != null) {
            sb.append(message);
        }
        if (!this.metadata.isEmpty()) {
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(new JSONObject(this.metadata).toString());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (this.metadata.isEmpty()) {
            return this.original.toString();
        }
        return this.original + "\n" + new JSONObject(this.metadata);
    }

    public final ThrowableDecorator addMetadata(Pair<String, ? extends Object>... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.metadata);
        for (Pair<String, ? extends Object> pair : pairArr) {
            String d = pair.d();
            Object g = pair.g();
            if (validateValueType(g) && this.metadata.get(d) == null) {
                linkedHashMap.put(d, g);
            } else {
                GlobalRTCLogger.log(LOG_TAG, "Metadata validation error: { " + d + "=" + g + " }");
            }
        }
        return new ThrowableDecorator(this.original, linkedHashMap);
    }

    public ThrowableDecorator(Throwable th, Pair<String, ? extends Object>... pairArr) {
        this(th, (Map<String, ? extends Object>) pn00.k((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
    }
}
