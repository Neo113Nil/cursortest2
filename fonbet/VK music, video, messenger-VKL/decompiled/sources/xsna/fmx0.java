package xsna;

import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: WhitelistTracker.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class fmx0 extends FunctionReferenceImpl implements yzs<String, Map<String, ? extends Boolean>, Boolean, s3q0> {
    public fmx0(Object obj) {
        super(3, obj, dmx0.class, "updateStatusBy", "updateStatusBy(Ljava/lang/String;Ljava/util/Map;Z)V", 0);
    }

    @Override // xsna.yzs
    public final s3q0 invoke(String str, Map<String, ? extends Boolean> map, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        dmx0.b((dmx0) this.receiver, map, booleanValue);
        return s3q0.a;
    }
}
