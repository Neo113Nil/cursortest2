package kotlin.jvm.internal;

import xsna.dcy;
import xsna.ecy;
import xsna.pfc;

/* loaded from: classes11.dex */
public class PropertyReference1Impl extends PropertyReference1 {
    public PropertyReference1Impl(ecy ecyVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((pfc) ecyVar).a(), str, str2, !(ecyVar instanceof dcy) ? 1 : 0);
    }

    public Object get(Object obj) {
        mo289getGetter();
        throw null;
    }

    public PropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public PropertyReference1Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
