package kotlin.jvm.internal;

import xsna.dcy;
import xsna.ecy;
import xsna.pfc;

/* loaded from: classes11.dex */
public class MutablePropertyReference0Impl extends MutablePropertyReference0 {
    public MutablePropertyReference0Impl(ecy ecyVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((pfc) ecyVar).a(), str, str2, !(ecyVar instanceof dcy) ? 1 : 0);
    }

    public Object get() {
        mo287getGetter();
        throw null;
    }

    public void set(Object obj) {
        mo288getSetter();
        throw null;
    }

    public MutablePropertyReference0Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public MutablePropertyReference0Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
