package kotlin.jvm.internal;

import xsna.dcy;
import xsna.ecy;
import xsna.pfc;

/* loaded from: classes11.dex */
public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i, ecy ecyVar, String str, String str2) {
        super(i, CallableReference.NO_RECEIVER, ((pfc) ecyVar).a(), str, str2, !(ecyVar instanceof dcy) ? 1 : 0);
    }

    public FunctionReferenceImpl(int i, Class cls, String str, String str2, int i2) {
        super(i, CallableReference.NO_RECEIVER, cls, str, str2, i2);
    }

    public FunctionReferenceImpl(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}
