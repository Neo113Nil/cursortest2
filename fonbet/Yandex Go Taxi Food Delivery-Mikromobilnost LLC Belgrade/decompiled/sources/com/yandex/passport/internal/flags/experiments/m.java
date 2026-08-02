package com.yandex.passport.internal.flags.experiments;

import defpackage.oyr;
import defpackage.w511;

/* loaded from: classes8.dex */
public final class m extends n {
    public final ExperimentsOperator a;
    public final int b;

    public m(ExperimentsOperator experimentsOperator, int i) {
        this.a = experimentsOperator;
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        return !r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
    
        if (75501 >= r4) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (75501 <= r4) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if (75501 == r4) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (75501 != r4) goto L11;
     */
    @Override // com.yandex.passport.internal.flags.experiments.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(d dVar) {
        int i = c.a[this.a.ordinal()];
        int i2 = this.b;
        boolean z = false;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        w511.b();
                        return false;
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a == mVar.a && this.b == mVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VersionRestriction(operator=");
        sb.append(this.a);
        sb.append(", version=");
        return oyr.s(sb, this.b, ')');
    }
}
