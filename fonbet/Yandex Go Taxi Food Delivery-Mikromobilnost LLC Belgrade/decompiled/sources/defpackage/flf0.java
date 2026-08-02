package defpackage;

import com.yandex.xplat.common.YSError;

/* loaded from: classes2.dex */
public final class flf0 extends hlf0 {
    public final YSError a;

    public flf0(YSError ySError) {
        this.a = ySError;
    }

    public final String toString() {
        return oyr.p("Error[", this.a.getMessage(), "]");
    }
}
