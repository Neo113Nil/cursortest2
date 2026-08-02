package com.lightside.visum.layouts.constraint;

import android.view.View;
import androidx.constraintlayout.widget.e;
import defpackage.ay4;
import defpackage.b8e;
import defpackage.d8e;
import defpackage.k4o;
import defpackage.n7e;
import defpackage.p7e;
import defpackage.r7e;
import defpackage.t7e;
import defpackage.tls;
import defpackage.v7e;
import defpackage.w511;
import defpackage.x7e;
import defpackage.xz4;
import defpackage.z7e;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* loaded from: classes11.dex */
public final class ConstraintSetBuilder extends e {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/lightside/visum/layouts/constraint/ConstraintSetBuilder$Side;", "", "", "sideId", CA20Status.STATUS_USER_I, "getSideId", "()I", "LEFT", "RIGHT", "TOP", "BOTTOM", "BASELINE", "START", "END", "visum_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Side {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Side[] $VALUES;
        public static final Side BASELINE;
        public static final Side BOTTOM;
        public static final Side END;
        public static final Side LEFT;
        public static final Side RIGHT;
        public static final Side START;
        public static final Side TOP;
        private final int sideId;

        static {
            Side side = new Side("LEFT", 0, 1);
            LEFT = side;
            Side side2 = new Side("RIGHT", 1, 2);
            RIGHT = side2;
            Side side3 = new Side("TOP", 2, 3);
            TOP = side3;
            Side side4 = new Side("BOTTOM", 3, 4);
            BOTTOM = side4;
            Side side5 = new Side("BASELINE", 4, 5);
            BASELINE = side5;
            Side side6 = new Side("START", 5, 6);
            START = side6;
            Side side7 = new Side("END", 6, 7);
            END = side7;
            Side[] sideArr = {side, side2, side3, side4, side5, side6, side7};
            $VALUES = sideArr;
            $ENTRIES = kotlin.enums.a.a(sideArr);
        }

        public Side(String str, int i, int i2) {
            this.sideId = i2;
        }

        public static Side valueOf(String str) {
            return (Side) Enum.valueOf(Side.class, str);
        }

        public static Side[] values() {
            return (Side[]) $VALUES.clone();
        }
    }

    public static p7e B(n7e n7eVar, int i) {
        return new p7e((ay4) n7eVar.a, (ay4) n7eVar.b, i);
    }

    public static ay4 C(Side side, int i) {
        int i2 = 2;
        switch (b.a[side.ordinal()]) {
            case 1:
                return new x7e(i, i2);
            case 2:
                return new z7e(i, i2);
            case 3:
                return new d8e(i, i2);
            case 4:
                return new t7e(i, i2);
            case 5:
                return new r7e(i, i2);
            case 6:
                return new b8e(i, i2);
            case 7:
                return new v7e(i, i2);
            default:
                w511.b();
                return null;
        }
    }

    public final void A(tls tlsVar, View view) {
        tlsVar.invoke(new c(view.getId(), this));
    }

    public final void z(xz4... xz4VarArr) {
        ConstraintSetBuilder constraintSetBuilder;
        int length = xz4VarArr.length;
        int i = 0;
        while (i < length) {
            xz4 xz4Var = xz4VarArr[i];
            if (xz4Var instanceof p7e) {
                ay4 ay4Var = (ay4) xz4Var.a;
                int i2 = ay4Var.b;
                int e = ay4Var.e();
                ay4 ay4Var2 = (ay4) xz4Var.b;
                constraintSetBuilder = this;
                constraintSetBuilder.j(i2, e, ay4Var2.b, ay4Var2.e(), ((p7e) xz4Var).c);
            } else {
                constraintSetBuilder = this;
                if (!(xz4Var instanceof n7e)) {
                    w511.b();
                    return;
                }
                ay4 ay4Var3 = (ay4) xz4Var.a;
                int i3 = ay4Var3.b;
                int e2 = ay4Var3.e();
                ay4 ay4Var4 = (ay4) xz4Var.b;
                constraintSetBuilder.i(i3, e2, ay4Var4.b, ay4Var4.e());
            }
            i++;
            this = constraintSetBuilder;
        }
    }
}
