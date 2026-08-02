package com.yandex.dsl.views.layouts.constraint;

import android.view.View;
import androidx.constraintlayout.widget.e;
import defpackage.a8e;
import defpackage.ay4;
import defpackage.c8e;
import defpackage.m7e;
import defpackage.o7e;
import defpackage.q7e;
import defpackage.s7e;
import defpackage.tls;
import defpackage.u7e;
import defpackage.w511;
import defpackage.w7e;
import defpackage.xz4;
import defpackage.y7e;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* loaded from: classes11.dex */
public final class ConstraintSetBuilder extends e {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/dsl/views/layouts/constraint/ConstraintSetBuilder$Side;", "", "", "sideId", CA20Status.STATUS_USER_I, "a", "()I", "LEFT", "RIGHT", "TOP", "BOTTOM", "BASELINE", "START", "END", "core-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Side {
        LEFT(1),
        RIGHT(2),
        TOP(3),
        BOTTOM(4),
        BASELINE(5),
        START(6),
        END(7);

        private final int sideId;

        Side(int i) {
            this.sideId = i;
        }

        /* renamed from: a, reason: from getter */
        public final int getSideId() {
            return this.sideId;
        }
    }

    public static o7e C(m7e m7eVar, int i) {
        return new o7e((ay4) m7eVar.a, (ay4) m7eVar.b, i);
    }

    public static ay4 D(Side side, int i) {
        int i2 = 1;
        switch (c.a[side.ordinal()]) {
            case 1:
                return new w7e(i, i2);
            case 2:
                return new y7e(i, i2);
            case 3:
                return new c8e(i, i2);
            case 4:
                return new s7e(i, i2);
            case 5:
                return new q7e(i, i2);
            case 6:
                return new a8e(i, i2);
            case 7:
                return new u7e(i, i2);
            default:
                w511.b();
                return null;
        }
    }

    public final void A(tls tlsVar, View view) {
        tlsVar.invoke(new d(view.getId(), this));
    }

    public final void B(com.yandex.bricks.c cVar, tls tlsVar) {
        A(tlsVar, cVar.a);
    }

    public final void z(xz4... xz4VarArr) {
        ConstraintSetBuilder constraintSetBuilder;
        int length = xz4VarArr.length;
        int i = 0;
        while (i < length) {
            xz4 xz4Var = xz4VarArr[i];
            if (xz4Var instanceof o7e) {
                ay4 ay4Var = (ay4) xz4Var.a;
                int i2 = ay4Var.b;
                int e = ay4Var.e();
                ay4 ay4Var2 = (ay4) xz4Var.b;
                constraintSetBuilder = this;
                constraintSetBuilder.j(i2, e, ay4Var2.b, ay4Var2.e(), ((o7e) xz4Var).c);
            } else {
                constraintSetBuilder = this;
                if (xz4Var instanceof m7e) {
                    ay4 ay4Var3 = (ay4) xz4Var.a;
                    int i3 = ay4Var3.b;
                    int e2 = ay4Var3.e();
                    ay4 ay4Var4 = (ay4) xz4Var.b;
                    constraintSetBuilder.i(i3, e2, ay4Var4.b, ay4Var4.e());
                }
            }
            i++;
            this = constraintSetBuilder;
        }
    }
}
