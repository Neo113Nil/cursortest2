package org.tensorflow.lite;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Interpreter.java */
/* loaded from: classes8.dex */
public final class a implements AutoCloseable {
    public NativeInterpreterWrapper b;

    /* compiled from: Interpreter.java */
    /* renamed from: org.tensorflow.lite.a$a, reason: collision with other inner class name */
    public static class C2187a {
        public Boolean b;
        public int a = -1;
        public final ArrayList c = new ArrayList();
    }

    public a(ByteBuffer byteBuffer, C2187a c2187a) {
        this.b = new NativeInterpreterWrapper(byteBuffer, c2187a);
    }

    public final Tensor b(int i) {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.b;
        if (nativeInterpreterWrapper != null) {
            return nativeInterpreterWrapper.b(i);
        }
        throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.b;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.close();
            this.b = null;
        }
    }

    public final void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public final Long m() {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.b;
        if (nativeInterpreterWrapper != null) {
            return nativeInterpreterWrapper.m();
        }
        throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
    }

    public final Tensor n(int i) {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.b;
        if (nativeInterpreterWrapper != null) {
            return nativeInterpreterWrapper.n(i);
        }
        throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
    }

    public final void o(Object[] objArr, Map<Integer, Object> map) {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.b;
        if (nativeInterpreterWrapper == null) {
            throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
        nativeInterpreterWrapper.o(objArr, map);
    }
}
