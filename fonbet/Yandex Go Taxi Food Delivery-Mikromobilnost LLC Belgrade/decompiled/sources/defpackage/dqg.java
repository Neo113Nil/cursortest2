package defpackage;

import com.ybsdk.core.utils.dto.common.FailDataException;

/* loaded from: classes2.dex */
public abstract class dqg {
    public final Object c() {
        if (this instanceof bqg) {
            bqg bqgVar = (bqg) this;
            throw new FailDataException(bqgVar.a, bqgVar.b, bqgVar.c, bqgVar.d, bqgVar.e, bqgVar.f);
        }
        if (this instanceof cqg) {
            return ((cqg) this).a;
        }
        w511.b();
        return null;
    }
}
