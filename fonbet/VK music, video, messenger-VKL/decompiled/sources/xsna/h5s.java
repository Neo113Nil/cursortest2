package xsna;

import android.os.HandlerThread;
import com.vk.metrics.eventtracking.Event;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h5s {
    public static HandlerThread a(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return handlerThread;
    }

    public static Event.a b(String str) {
        Event.a aVar = new Event.a();
        aVar.g(str);
        return aVar;
    }

    public static String c(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String d(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }
}
