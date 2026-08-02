package defpackage;

import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* loaded from: classes10.dex */
public final class jh41 implements WebMessagePayloadBoundaryInterface {
    public final int a;
    public final String b;
    public final byte[] c;

    public jh41(String str) {
        this.a = 0;
        this.b = str;
        this.c = null;
    }

    public final void a(int i) {
        int i2 = this.a;
        if (i2 == i) {
            return;
        }
        ny61.r(oyr.h(i, i2, "Expected ", ", but type is "));
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final byte[] getAsArrayBuffer() {
        a(1);
        byte[] bArr = this.c;
        Objects.requireNonNull(bArr);
        return bArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final String getAsString() {
        a(0);
        return this.b;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[0];
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final int getType() {
        return this.a;
    }

    public jh41(byte[] bArr) {
        this.a = 1;
        this.b = null;
        this.c = bArr;
    }
}
