package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public final class s extends q {
    @Override // com.google.crypto.tink.shaded.protobuf.q
    public final r a(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        r rVar = generatedMessageLite.unknownFields;
        if (rVar != r.f) {
            return rVar;
        }
        r c = r.c();
        generatedMessageLite.unknownFields = c;
        return c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    public final void c(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (r) obj2;
    }
}
