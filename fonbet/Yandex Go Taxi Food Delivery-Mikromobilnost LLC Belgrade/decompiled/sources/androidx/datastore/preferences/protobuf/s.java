package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class s extends q {
    @Override // androidx.datastore.preferences.protobuf.q
    public final r a(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        r rVar = generatedMessageLite.unknownFields;
        if (rVar != r.f) {
            return rVar;
        }
        r rVar2 = new r(0, new int[8], new Object[8], true);
        generatedMessageLite.unknownFields = rVar2;
        return rVar2;
    }

    @Override // androidx.datastore.preferences.protobuf.q
    public final void c(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (r) obj2;
    }
}
