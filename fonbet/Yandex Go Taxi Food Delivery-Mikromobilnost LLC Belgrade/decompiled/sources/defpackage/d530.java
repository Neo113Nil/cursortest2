package defpackage;

/* loaded from: classes.dex */
public interface d530 extends f530 {
    @Override // defpackage.f530
    default Object b(Object obj, wls wlsVar) {
        return wlsVar.invoke(obj, this);
    }

    @Override // defpackage.f530
    default boolean c(tls tlsVar) {
        return ((Boolean) tlsVar.invoke(this)).booleanValue();
    }

    @Override // defpackage.f530
    default boolean h(tls tlsVar) {
        return ((Boolean) tlsVar.invoke(this)).booleanValue();
    }
}
