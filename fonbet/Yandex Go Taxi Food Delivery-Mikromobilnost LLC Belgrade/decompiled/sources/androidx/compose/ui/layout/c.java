package androidx.compose.ui.layout;

import androidx.compose.ui.layout.o;
import defpackage.cji0;
import defpackage.j73;
import defpackage.wls;

/* loaded from: classes.dex */
public final class c implements cji0 {
    public final cji0[] a;
    public final u b;
    public final b c;
    public final u d;
    public final b e;

    public c(cji0[] cji0VarArr) {
        this.a = cji0VarArr;
        int length = cji0VarArr.length;
        final u[] uVarArr = new u[length];
        for (int i = 0; i < length; i++) {
            uVarArr[i] = this.a[i].c();
        }
        this.b = new u(new wls() { // from class: androidx.compose.ui.layout.VerticalRuler$Companion$maxOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return Float.valueOf(s.a((o.a) obj, true, uVarArr, ((Number) obj2).floatValue()));
            }
        });
        int length2 = this.a.length;
        final b[] bVarArr = new b[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            bVarArr[i2] = this.a[i2].d();
        }
        this.c = new b(new wls() { // from class: androidx.compose.ui.layout.HorizontalRuler$Companion$maxOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return Float.valueOf(s.a((o.a) obj, true, bVarArr, ((Number) obj2).floatValue()));
            }
        });
        int length3 = this.a.length;
        final u[] uVarArr2 = new u[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            uVarArr2[i3] = this.a[i3].b();
        }
        this.d = new u(new wls() { // from class: androidx.compose.ui.layout.VerticalRuler$Companion$minOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return Float.valueOf(s.a((o.a) obj, false, uVarArr2, ((Number) obj2).floatValue()));
            }
        });
        int length4 = this.a.length;
        final b[] bVarArr2 = new b[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            bVarArr2[i4] = this.a[i4].a();
        }
        this.e = new b(new wls() { // from class: androidx.compose.ui.layout.HorizontalRuler$Companion$minOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return Float.valueOf(s.a((o.a) obj, false, bVarArr2, ((Number) obj2).floatValue()));
            }
        });
    }

    @Override // defpackage.cji0
    public final b a() {
        return this.e;
    }

    @Override // defpackage.cji0
    public final u b() {
        return this.d;
    }

    @Override // defpackage.cji0
    public final u c() {
        return this.b;
    }

    @Override // defpackage.cji0
    public final b d() {
        return this.c;
    }

    public final String toString() {
        return j73.L(this.a, null, "innermostOf(", null, 57);
    }
}
