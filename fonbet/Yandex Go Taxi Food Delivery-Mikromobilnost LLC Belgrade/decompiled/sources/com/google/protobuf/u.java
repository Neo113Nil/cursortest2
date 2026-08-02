package com.google.protobuf;

/* loaded from: classes.dex */
public final class u extends s {
    @Override // com.google.protobuf.s
    public final t a(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        t tVar = generatedMessageLite.unknownFields;
        if (tVar != t.f) {
            return tVar;
        }
        t tVar2 = new t();
        generatedMessageLite.unknownFields = tVar2;
        return tVar2;
    }

    @Override // com.google.protobuf.s
    public final void c(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (t) obj2;
    }
}
