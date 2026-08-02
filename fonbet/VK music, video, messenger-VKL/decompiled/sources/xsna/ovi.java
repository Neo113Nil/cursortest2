package xsna;

/* compiled from: CompositionLocalConsumerModifierNode.kt */
/* loaded from: classes11.dex */
public final class ovi {
    public static final <T> T a(nvi nviVar, lvi<T> lviVar) {
        if (!nviVar.z().o) {
            uzw.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return (T) itl.f(nviVar).C.a(lviVar);
    }
}
