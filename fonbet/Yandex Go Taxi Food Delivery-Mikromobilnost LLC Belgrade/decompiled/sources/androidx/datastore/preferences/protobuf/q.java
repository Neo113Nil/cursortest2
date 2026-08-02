package androidx.datastore.preferences.protobuf;

import defpackage.bci0;

/* loaded from: classes.dex */
public abstract class q {
    public abstract r a(Object obj);

    public final boolean b(Object obj, bci0 bci0Var, int i) {
        f fVar;
        int i2 = ((f) bci0Var).b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            f fVar2 = (f) bci0Var;
            fVar2.w(0);
            ((r) obj).c(i3 << 3, Long.valueOf(fVar2.a.r()));
            return true;
        }
        if (i4 == 1) {
            f fVar3 = (f) bci0Var;
            fVar3.w(1);
            ((r) obj).c((i3 << 3) | 1, Long.valueOf(fVar3.a.o()));
            return true;
        }
        if (i4 == 2) {
            ((r) obj).c((i3 << 3) | 2, ((f) bci0Var).e());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            f fVar4 = (f) bci0Var;
            fVar4.w(5);
            ((r) obj).c(5 | (i3 << 3), Integer.valueOf(fVar4.a.n()));
            return true;
        }
        r rVar = new r(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        do {
            fVar = (f) bci0Var;
            if (fVar.a() == Integer.MAX_VALUE) {
                break;
            }
        } while (b(rVar, fVar, i7));
        if (i6 != fVar.b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (rVar.e) {
            rVar.e = false;
        }
        ((r) obj).c(i5 | 3, rVar);
        return true;
    }

    public abstract void c(Object obj, Object obj2);
}
