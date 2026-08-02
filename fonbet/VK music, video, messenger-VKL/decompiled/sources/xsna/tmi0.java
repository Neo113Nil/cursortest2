package xsna;

import com.vk.core.serialize.Serializer;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class tmi0 implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public /* synthetic */ tmi0(boolean z, String str) {
        this.b = z;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Serializer.StreamParcelable streamParcelable = (Serializer.StreamParcelable) obj;
        if (this.b) {
            ConcurrentHashMap concurrentHashMap = wmi0.e;
            if (concurrentHashMap == null) {
                concurrentHashMap = null;
            }
            concurrentHashMap.put(this.c, new SoftReference(streamParcelable));
        }
        return s3q0.a;
    }
}
