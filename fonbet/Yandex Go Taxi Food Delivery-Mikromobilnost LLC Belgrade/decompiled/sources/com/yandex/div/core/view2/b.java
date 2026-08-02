package com.yandex.div.core.view2;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.sls;
import defpackage.unr0;

/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final i3y d = kotlin.a.a(new sls() { // from class: com.yandex.div.core.view2.CompositeLogId$compositeLogId$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            b bVar = b.this;
            StringBuilder sb = new StringBuilder();
            sb.append(bVar.a);
            String str = bVar.b;
            sb.append(str.length() > 0 ? ShimmerDivHandler.NUMBER_SING.concat(str) : "");
            sb.append('#');
            sb.append(bVar.c);
            return sb.toString();
        }
    });

    public b(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b) && jl40.l(this.c, bVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return (String) this.d.getValue();
    }
}
