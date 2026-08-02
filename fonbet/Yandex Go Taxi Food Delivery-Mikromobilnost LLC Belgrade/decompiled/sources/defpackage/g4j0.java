package defpackage;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes4.dex */
public abstract class g4j0 {
    public static ea20 a;
    public static final ArrayList b = new ArrayList();
    public static boolean c;

    public static void a(String str, Map map) {
        ea20 ea20Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        linkedHashMap.put(RemoteBioParameters.TIME, simpleDateFormat.format(new Date()));
        if (c && (ea20Var = a) != null) {
            ea20Var.a(str, linkedHashMap, null);
            return;
        }
        f69 f69Var = xi7.a;
        xi7.a.m("sendEvent. flutter is not ready -> store event", null, Collections.singletonList("Reporter"));
        b.add(new f4j0(str, linkedHashMap));
    }
}
