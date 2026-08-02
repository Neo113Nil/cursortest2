package xsna;

import android.content.Intent;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: LibverifyCheckMethodSelectorFragment.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class a3z extends FunctionReferenceImpl implements wzs<Intent, Integer, s3q0> {
    @Override // xsna.wzs
    public final s3q0 invoke(Intent intent, Integer num) {
        int intValue = num.intValue();
        ((c3z) this.receiver).startActivityForResult(intent, intValue);
        return s3q0.a;
    }
}
