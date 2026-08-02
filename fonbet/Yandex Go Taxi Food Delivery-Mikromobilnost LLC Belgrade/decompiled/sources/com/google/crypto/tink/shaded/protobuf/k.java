package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a;
import defpackage.cvf0;
import defpackage.ny61;

/* loaded from: classes.dex */
public abstract class k extends a.AbstractC0031a {
    public final GeneratedMessageLite a;
    public GeneratedMessageLite b;

    public k(GeneratedMessageLite generatedMessageLite) {
        this.a = generatedMessageLite;
        if (generatedMessageLite.n()) {
            ny61.g("Default instance must be immutable.");
            throw null;
        }
        this.b = generatedMessageLite.q();
    }

    public static void f(Object obj, Object obj2) {
        cvf0 cvf0Var = cvf0.c;
        cvf0Var.getClass();
        cvf0Var.a(obj.getClass()).b(obj, obj2);
    }

    public final GeneratedMessageLite b() {
        GeneratedMessageLite buildPartial = buildPartial();
        buildPartial.getClass();
        if (GeneratedMessageLite.m(buildPartial, true)) {
            return buildPartial;
        }
        throw new UninitializedMessageException();
    }

    @Override // defpackage.ut10
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final GeneratedMessageLite buildPartial() {
        boolean n = this.b.n();
        GeneratedMessageLite generatedMessageLite = this.b;
        if (!n) {
            return generatedMessageLite;
        }
        generatedMessageLite.getClass();
        cvf0 cvf0Var = cvf0.c;
        cvf0Var.getClass();
        cvf0Var.a(generatedMessageLite.getClass()).c(generatedMessageLite);
        generatedMessageLite.o();
        return this.b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a.AbstractC0031a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final k clone() {
        k newBuilderForType = this.a.newBuilderForType();
        newBuilderForType.b = buildPartial();
        return newBuilderForType;
    }

    public final void e() {
        if (this.b.n()) {
            return;
        }
        GeneratedMessageLite q = this.a.q();
        f(q, this.b);
        this.b = q;
    }
}
