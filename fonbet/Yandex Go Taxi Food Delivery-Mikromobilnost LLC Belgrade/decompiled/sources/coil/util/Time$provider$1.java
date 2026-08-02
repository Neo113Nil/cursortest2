package coil.util;

import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class Time$provider$1 extends FunctionReferenceImpl implements sls {
    public static final Time$provider$1 b = new Time$provider$1(0, 0, System.class, "currentTimeMillis", "currentTimeMillis()J");

    @Override // defpackage.sls
    public final Object invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
