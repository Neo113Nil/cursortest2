package com.google.protobuf;

import defpackage.aci0;

/* loaded from: classes.dex */
public abstract class s {
    public abstract t a(Object obj);

    public final boolean b(Object obj, aci0 aci0Var, int i) {
        i iVar = (i) aci0Var;
        int c = iVar.c();
        int i2 = c >>> 3;
        int i3 = c & 7;
        if (i3 == 0) {
            ((t) obj).f(i2 << 3, Long.valueOf(iVar.z()));
            return true;
        }
        if (i3 == 1) {
            ((t) obj).f((i2 << 3) | 1, Long.valueOf(iVar.r()));
            return true;
        }
        if (i3 == 2) {
            ((t) obj).f((i2 << 3) | 2, iVar.j());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                if (i != 0) {
                    return false;
                }
                throw InvalidProtocolBufferException.b();
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.g();
            }
            ((t) obj).f(5 | (i2 << 3), Integer.valueOf(iVar.p()));
            return true;
        }
        t tVar = new t();
        int i4 = i2 << 3;
        int i5 = i4 | 4;
        int i6 = i + 1;
        if (i6 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (iVar.b() != Integer.MAX_VALUE && b(tVar, iVar, i6)) {
        }
        if (i5 != iVar.c()) {
            throw InvalidProtocolBufferException.b();
        }
        if (tVar.e) {
            tVar.e = false;
        }
        ((t) obj).f(i4 | 3, tVar);
        return true;
    }

    public abstract void c(Object obj, Object obj2);
}
