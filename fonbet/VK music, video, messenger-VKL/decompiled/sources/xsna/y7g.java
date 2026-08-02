package xsna;

/* compiled from: ColorSourceExt.kt */
/* loaded from: classes17.dex */
public final class y7g {
    public static final long a(ipi ipiVar, androidx.compose.runtime.a aVar) {
        l5g l5gVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-386375462, 0, -1, "com.vk.core.view.interop.ext.toComposeColor (ColorSourceExt.kt:10)");
        }
        if (ipiVar == null) {
            aVar.K(1041719);
            aVar.j();
            l5gVar = null;
        } else {
            aVar.K(-1939629046);
            long a = ipiVar.a(0, aVar);
            aVar.j();
            l5gVar = new l5g(a);
        }
        long j = l5gVar != null ? l5gVar.a : l5g.k;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j;
    }
}
