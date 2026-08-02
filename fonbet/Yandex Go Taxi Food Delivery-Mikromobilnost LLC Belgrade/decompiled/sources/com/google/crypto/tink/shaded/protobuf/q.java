package com.google.crypto.tink.shaded.protobuf;

import defpackage.zbi0;

/* loaded from: classes.dex */
public abstract class q {
    public abstract r a(Object obj);

    public final boolean b(Object obj, zbi0 zbi0Var) {
        f fVar;
        int i = ((f) zbi0Var).b;
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            f fVar2 = (f) zbi0Var;
            fVar2.v(0);
            ((r) obj).d(i2 << 3, Long.valueOf(fVar2.a.r()));
            return true;
        }
        if (i3 == 1) {
            f fVar3 = (f) zbi0Var;
            fVar3.v(1);
            ((r) obj).d((i2 << 3) | 1, Long.valueOf(fVar3.a.o()));
            return true;
        }
        if (i3 == 2) {
            ((r) obj).d((i2 << 3) | 2, ((f) zbi0Var).e());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.f();
            }
            f fVar4 = (f) zbi0Var;
            fVar4.v(5);
            ((r) obj).d(5 | (i2 << 3), Integer.valueOf(fVar4.a.n()));
            return true;
        }
        r c = r.c();
        int i4 = i2 << 3;
        int i5 = i4 | 4;
        do {
            fVar = (f) zbi0Var;
            if (fVar.a() == Integer.MAX_VALUE) {
                break;
            }
        } while (b(c, fVar));
        if (i5 != fVar.b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        c.e = false;
        ((r) obj).d(i4 | 3, c);
        return true;
    }

    public abstract void c(Object obj, Object obj2);
}
