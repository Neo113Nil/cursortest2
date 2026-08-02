package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.a;
import defpackage.fvf0;
import defpackage.ny61;

/* loaded from: classes.dex */
public abstract class l extends a.AbstractC0008a {
    public final GeneratedMessageLite a;
    public GeneratedMessageLite b;

    public l(GeneratedMessageLite generatedMessageLite) {
        this.a = generatedMessageLite;
        if (generatedMessageLite.j()) {
            ny61.g("Default instance must be immutable.");
            throw null;
        }
        this.b = generatedMessageLite.l();
    }

    @Override // androidx.datastore.preferences.protobuf.a.AbstractC0008a
    /* renamed from: b */
    public final l clone() {
        l lVar = (l) this.a.f(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER);
        lVar.b = d();
        return lVar;
    }

    public final GeneratedMessageLite c() {
        GeneratedMessageLite d = d();
        d.getClass();
        if (GeneratedMessageLite.i(d, true)) {
            return d;
        }
        throw new UninitializedMessageException();
    }

    @Override // androidx.datastore.preferences.protobuf.a.AbstractC0008a
    public final Object clone() {
        l lVar = (l) this.a.f(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER);
        lVar.b = d();
        return lVar;
    }

    public final GeneratedMessageLite d() {
        boolean j = this.b.j();
        GeneratedMessageLite generatedMessageLite = this.b;
        if (!j) {
            return generatedMessageLite;
        }
        generatedMessageLite.getClass();
        fvf0 fvf0Var = fvf0.c;
        fvf0Var.getClass();
        fvf0Var.a(generatedMessageLite.getClass()).c(generatedMessageLite);
        generatedMessageLite.k();
        return this.b;
    }

    public final void e() {
        if (this.b.j()) {
            return;
        }
        GeneratedMessageLite l = this.a.l();
        GeneratedMessageLite generatedMessageLite = this.b;
        fvf0 fvf0Var = fvf0.c;
        fvf0Var.getClass();
        fvf0Var.a(l.getClass()).b(l, generatedMessageLite);
        this.b = l;
    }
}
