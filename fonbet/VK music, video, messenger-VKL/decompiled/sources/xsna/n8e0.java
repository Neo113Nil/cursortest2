package xsna;

import com.google.firebase.messaging.reporting.MessagingClientEvent;
import java.util.HashMap;
import xsna.y8e0;

/* compiled from: ProtoEncoderDoNotUse.java */
/* loaded from: classes13.dex */
public abstract class n8e0 {
    public static final y8e0 a;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put(n8e0.class, zi5.a);
        hashMap2.remove(n8e0.class);
        hashMap.put(dh20.class, yi5.a);
        hashMap2.remove(dh20.class);
        hashMap.put(MessagingClientEvent.class, xi5.a);
        hashMap2.remove(MessagingClientEvent.class);
        a = new y8e0(new HashMap(hashMap), new HashMap(hashMap2), y8e0.a.a);
    }

    public abstract dh20 a();
}
