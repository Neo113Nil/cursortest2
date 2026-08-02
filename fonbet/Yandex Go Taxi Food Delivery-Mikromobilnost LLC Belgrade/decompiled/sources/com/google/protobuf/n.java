package com.google.protobuf;

import com.google.protobuf.b;
import defpackage.eac;
import defpackage.evf0;
import defpackage.ny61;
import defpackage.pyo;
import defpackage.v43;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class n extends b.a {
    private final GeneratedMessageLite defaultInstance;
    protected GeneratedMessageLite instance;

    public n(GeneratedMessageLite generatedMessageLite) {
        this.defaultInstance = generatedMessageLite;
        if (generatedMessageLite.isMutable()) {
            ny61.g("Default instance must be immutable.");
            throw null;
        }
        this.instance = generatedMessageLite.newMutableInstance();
    }

    @Override // defpackage.tt10
    public final GeneratedMessageLite build() {
        GeneratedMessageLite buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw b.a.newUninitializedMessageException(buildPartial);
    }

    @Override // defpackage.tt10
    public GeneratedMessageLite buildPartial() {
        boolean isMutable = this.instance.isMutable();
        GeneratedMessageLite generatedMessageLite = this.instance;
        if (!isMutable) {
            return generatedMessageLite;
        }
        generatedMessageLite.makeImmutable();
        return this.instance;
    }

    /* renamed from: clear, reason: merged with bridge method [inline-methods] */
    public final n m124clear() {
        if (this.defaultInstance.isMutable()) {
            ny61.g("Default instance must be immutable.");
            return null;
        }
        this.instance = this.defaultInstance.newMutableInstance();
        return this;
    }

    @Override // com.google.protobuf.b.a
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public n mo116clone() {
        n newBuilderForType = getDefaultInstanceForType().newBuilderForType();
        newBuilderForType.instance = buildPartial();
        return newBuilderForType;
    }

    public final void copyOnWrite() {
        if (this.instance.isMutable()) {
            return;
        }
        copyOnWriteInternal();
    }

    public void copyOnWriteInternal() {
        GeneratedMessageLite newMutableInstance = this.defaultInstance.newMutableInstance();
        GeneratedMessageLite generatedMessageLite = this.instance;
        evf0 evf0Var = evf0.c;
        evf0Var.getClass();
        evf0Var.a(newMutableInstance.getClass()).b(newMutableInstance, generatedMessageLite);
        this.instance = newMutableInstance;
    }

    @Override // defpackage.zt10
    public final boolean isInitialized() {
        boolean c;
        c = GeneratedMessageLite.c(this.instance, false);
        return c;
    }

    @Override // com.google.protobuf.b.a
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public n m126mergeFrom(byte[] bArr, int i, int i2, pyo pyoVar) throws InvalidProtocolBufferException {
        copyOnWrite();
        try {
            evf0 evf0Var = evf0.c;
            GeneratedMessageLite generatedMessageLite = this.instance;
            evf0Var.getClass();
            evf0Var.a(generatedMessageLite.getClass()).i(this.instance, bArr, i, i + i2, new v43(pyoVar));
            return this;
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            ny61.n("Reading from byte array should not throw IOException.", e2);
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.m();
        }
    }

    @Override // defpackage.zt10
    public GeneratedMessageLite getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    @Override // com.google.protobuf.b.a
    public n internalMergeFrom(GeneratedMessageLite generatedMessageLite) {
        return mergeFrom(generatedMessageLite);
    }

    public n mergeFrom(GeneratedMessageLite generatedMessageLite) {
        if (getDefaultInstanceForType().equals(generatedMessageLite)) {
            return this;
        }
        copyOnWrite();
        GeneratedMessageLite generatedMessageLite2 = this.instance;
        evf0 evf0Var = evf0.c;
        evf0Var.getClass();
        evf0Var.a(generatedMessageLite2.getClass()).b(generatedMessageLite2, generatedMessageLite);
        return this;
    }

    @Override // com.google.protobuf.b.a
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public n m125mergeFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return m126mergeFrom(bArr, i, i2, pyo.b());
    }

    @Override // com.google.protobuf.b.a, defpackage.tt10
    public n mergeFrom(eac eacVar, pyo pyoVar) throws IOException {
        copyOnWrite();
        try {
            evf0 evf0Var = evf0.c;
            GeneratedMessageLite generatedMessageLite = this.instance;
            evf0Var.getClass();
            evf0Var.a(generatedMessageLite.getClass()).f(this.instance, i.a(eacVar), pyoVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }
}
