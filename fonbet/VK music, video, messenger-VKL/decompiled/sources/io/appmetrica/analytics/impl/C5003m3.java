package io.appmetrica.analytics.impl;

import xsna.vu5;

/* renamed from: io.appmetrica.analytics.impl.m3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C5003m3 implements InterfaceC5029n3 {
    public final int a;

    public C5003m3(int i) {
        this.a = i;
    }

    public static InterfaceC5029n3 a(InterfaceC5029n3... interfaceC5029n3Arr) {
        return new C5003m3(b(interfaceC5029n3Arr));
    }

    public static int b(InterfaceC5029n3... interfaceC5029n3Arr) {
        int i = 0;
        for (InterfaceC5029n3 interfaceC5029n3 : interfaceC5029n3Arr) {
            if (interfaceC5029n3 != null) {
                i = interfaceC5029n3.getBytesTruncated() + i;
            }
        }
        return i;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5029n3
    public final int getBytesTruncated() {
        return this.a;
    }

    public String toString() {
        return vu5.b(new StringBuilder("BytesTruncatedInfo{bytesTruncated="), this.a, '}');
    }
}
