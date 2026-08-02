package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class hbi implements zzs {
    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        z37 z37Var = (z37) obj;
        te4 te4Var = (te4) obj2;
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 6) == 0) {
            i = (aVar.J(z37Var) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= aVar.J(te4Var) ? 32 : 16;
        }
        if (aVar.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(301274880, i, -1, "com.vk.music.bottomsheets.audiobook.chapter.presentation.compose.ComposableSingletons$AudioBookChapterMviComposeComponentKt.lambda$301274880.<anonymous> (AudioBookChapterMviComposeComponent.kt:54)");
            }
            rrv0.d(null, null, null, null, kai.c(-1101874331, new xx9(2, te4Var, z37Var), aVar), aVar, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }
}
