package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import defpackage.ny61;
import defpackage.rom0;
import defpackage.ut10;
import defpackage.vt10;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class a implements vt10 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0031a implements ut10 {
        @Override // 
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public abstract k clone();
    }

    public int a() {
        throw new UnsupportedOperationException();
    }

    public int b(rom0 rom0Var) {
        int a = a();
        if (a != -1) {
            return a;
        }
        int g = rom0Var.g(this);
        d(g);
        return g;
    }

    public final String c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public void d(int i) {
        throw new UnsupportedOperationException();
    }

    public final byte[] e() {
        try {
            int b = ((GeneratedMessageLite) this).b(null);
            byte[] bArr = new byte[b];
            g gVar = new g(bArr, b);
            ((GeneratedMessageLite) this).v(gVar);
            if (gVar.c - gVar.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            ny61.n(c("byte array"), e);
            return null;
        }
    }

    public final ByteString f() {
        try {
            int b = ((GeneratedMessageLite) this).b(null);
            ByteString byteString = ByteString.a;
            byte[] bArr = new byte[b];
            g gVar = new g(bArr, b);
            ((GeneratedMessageLite) this).v(gVar);
            if (gVar.c - gVar.d == 0) {
                return new ByteString.LiteralByteString(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            ny61.n(c("ByteString"), e);
            return null;
        }
    }
}
