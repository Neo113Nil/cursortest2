package defpackage;

/* loaded from: classes.dex */
public interface hs31 {
    default yr31 create(lfx lfxVar, y8f y8fVar) {
        return create(((zzb) lfxVar).a(), y8fVar);
    }

    default yr31 create(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
