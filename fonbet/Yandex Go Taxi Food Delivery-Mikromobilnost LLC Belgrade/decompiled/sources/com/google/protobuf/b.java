package com.google.protobuf;

import defpackage.EvgenDiagnostic$SubscriptionPaymentType;
import defpackage.eac;
import defpackage.hvf0;
import defpackage.i7y;
import defpackage.j2f0;
import defpackage.ny61;
import defpackage.oo31;
import defpackage.pyo;
import defpackage.rqw;
import defpackage.som0;
import defpackage.tt10;
import defpackage.wt10;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class b implements wt10 {
    protected int memoizedHashCode = 0;

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        a.addAll((Iterable) iterable, (List) list);
    }

    public static void checkByteStringIsUtf8(ByteString byteString) throws IllegalArgumentException {
        if (byteString.j()) {
            return;
        }
        ny61.g("Byte string is not UTF-8.");
    }

    public final String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(som0 som0Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int e = som0Var.e(this);
        setMemoizedSerializedSize(e);
        return e;
    }

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException();
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = l.b;
            j jVar = new j(bArr, serializedSize);
            writeTo(jVar);
            if (jVar.A() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            ny61.n(a("byte array"), e);
            return null;
        }
    }

    @Override // defpackage.wt10
    public ByteString toByteString() {
        try {
            int serializedSize = getSerializedSize();
            ByteString byteString = ByteString.a;
            e eVar = new e(serializedSize);
            writeTo(eVar.b());
            return eVar.a();
        } catch (IOException e) {
            ny61.n(this.a("ByteString"), e);
            return null;
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int g = l.g(serializedSize) + serializedSize;
        if (g > 4096) {
            g = 4096;
        }
        k kVar = new k(outputStream, g);
        kVar.x(serializedSize);
        writeTo(kVar);
        kVar.G();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        Logger logger = l.b;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        k kVar = new k(outputStream, serializedSize);
        writeTo(kVar);
        kVar.G();
    }

    public static abstract class a implements tt10 {
        public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            Charset charset = rqw.a;
            iterable.getClass();
            if (iterable instanceof i7y) {
                List c = ((i7y) iterable).c();
                i7y i7yVar = (i7y) list;
                int size = list.size();
                for (Object obj : c) {
                    if (obj == null) {
                        String str = "Element at index " + (i7yVar.size() - size) + " is null.";
                        for (int size2 = i7yVar.size() - 1; size2 >= size; size2--) {
                            i7yVar.remove(size2);
                        }
                        ny61.t(str);
                        return;
                    }
                    if (obj instanceof ByteString) {
                        i7yVar.u0();
                    } else if (obj instanceof byte[]) {
                        byte[] bArr = (byte[]) obj;
                        ByteString.f(0, bArr.length, bArr);
                        i7yVar.u0();
                    } else {
                        i7yVar.add((String) obj);
                    }
                }
                return;
            }
            if (iterable instanceof j2f0) {
                list.addAll((Collection) iterable);
                return;
            }
            if (iterable instanceof Collection) {
                int size3 = ((Collection) iterable).size();
                if (list instanceof ArrayList) {
                    ((ArrayList) list).ensureCapacity(list.size() + size3);
                } else if (list instanceof hvf0) {
                    hvf0 hvf0Var = (hvf0) list;
                    int i = hvf0Var.c + size3;
                    Object[] objArr = hvf0Var.b;
                    if (i > objArr.length) {
                        if (objArr.length == 0) {
                            hvf0Var.b = new Object[Math.max(i, 10)];
                        } else {
                            int length = objArr.length;
                            while (length < i) {
                                length = oo31.c(length, 3, 2, 1, 10);
                            }
                            hvf0Var.b = Arrays.copyOf(hvf0Var.b, length);
                        }
                    }
                }
            }
            int size4 = list.size();
            if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
                for (Object obj2 : iterable) {
                    if (obj2 == null) {
                        b(size4, list);
                        throw null;
                    }
                    list.add(obj2);
                }
                return;
            }
            List list2 = (List) iterable;
            int size5 = list2.size();
            for (int i2 = 0; i2 < size5; i2++) {
                EvgenDiagnostic$SubscriptionPaymentType evgenDiagnostic$SubscriptionPaymentType = (Object) list2.get(i2);
                if (evgenDiagnostic$SubscriptionPaymentType == null) {
                    b(size4, list);
                    throw null;
                }
                list.add(evgenDiagnostic$SubscriptionPaymentType);
            }
        }

        public static void b(int i, List list) {
            String str = "Element at index " + (list.size() - i) + " is null.";
            for (int size = list.size() - 1; size >= i; size--) {
                list.remove(size);
            }
            throw new NullPointerException(str);
        }

        public static UninitializedMessageException newUninitializedMessageException(wt10 wt10Var) {
            return new UninitializedMessageException();
        }

        public final String a(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        @Override // 
        /* renamed from: clone */
        public abstract a mo116clone();

        public abstract a internalMergeFrom(b bVar);

        public boolean mergeDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            int read = inputStream.read();
            if (read == -1) {
                return false;
            }
            m121mergeFrom((InputStream) new com.google.protobuf.a(eac.s(read, inputStream), inputStream), pyoVar);
            return true;
        }

        @Override // defpackage.tt10
        public abstract a mergeFrom(eac eacVar, pyo pyoVar);

        @Override // defpackage.tt10
        public a mergeFrom(wt10 wt10Var) {
            if (getDefaultInstanceForType().getClass().isInstance(wt10Var)) {
                return internalMergeFrom((b) wt10Var);
            }
            ny61.g("mergeFrom(MessageLite) can only merge messages of the same type.");
            return null;
        }

        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            return mergeDelimitedFrom(inputStream, pyo.b());
        }

        /* renamed from: mergeFrom */
        public a m125mergeFrom(byte[] bArr, int i, int i2) {
            try {
                f g = eac.g(bArr, 0, i2, false);
                m119mergeFrom((eac) g);
                g.a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                ny61.n(a("byte array"), e2);
                return null;
            }
        }

        /* renamed from: mergeFrom */
        public a m126mergeFrom(byte[] bArr, int i, int i2, pyo pyoVar) {
            try {
                f g = eac.g(bArr, 0, i2, false);
                mergeFrom((eac) g, pyoVar);
                g.a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                ny61.n(a("byte array"), e2);
                return null;
            }
        }

        /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public a m119mergeFrom(eac eacVar) throws IOException {
            return mergeFrom(eacVar, pyo.b());
        }

        /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public a m117mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            try {
                eac k = byteString.k();
                m119mergeFrom(k);
                k.a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                ny61.n(a("ByteString"), e2);
                return null;
            }
        }

        /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public a m118mergeFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
            try {
                eac k = byteString.k();
                mergeFrom(k, pyoVar);
                k.a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                ny61.n(a("ByteString"), e2);
                return null;
            }
        }

        /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public a m122mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return m125mergeFrom(bArr, 0, bArr.length);
        }

        /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public a m123mergeFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
            return m126mergeFrom(bArr, 0, bArr.length, pyoVar);
        }

        /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public a m120mergeFrom(InputStream inputStream) throws IOException {
            eac f = eac.f(inputStream);
            m119mergeFrom(f);
            f.a(0);
            return this;
        }

        /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public a m121mergeFrom(InputStream inputStream, pyo pyoVar) throws IOException {
            eac f = eac.f(inputStream);
            mergeFrom(f, pyoVar);
            f.a(0);
            return this;
        }

        @Deprecated
        public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll((Iterable) iterable, (List) collection);
        }
    }
}
