package xsna;

import kotlin.NotImplementedError;

/* compiled from: ImageSourceExt.kt */
/* loaded from: classes.dex */
public final class tlw {
    public static zzs<? super String, ? super qhv0, ? super androidx.compose.runtime.a, ? super Integer, ? extends lg90> a = a.b;

    /* compiled from: ImageSourceExt.kt */
    public static final class a implements zzs {
        public static final a b = new a();

        @Override // xsna.zzs
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            int intValue = ((Number) obj4).intValue();
            ((androidx.compose.runtime.a) obj3).K(-1071767122);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1071767122, intValue, -1, "com.vk.core.view.model._urlPainterFactory.<anonymous> (ImageSourceExt.kt:9)");
            }
            throw new NotImplementedError();
        }
    }

    public static final lg90 a(rlw rlwVar, androidx.compose.runtime.a aVar, int i) {
        lg90 invoke;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(392973815, i, -1, "com.vk.core.view.model.toPainter (ImageSourceExt.kt:19)");
        }
        if (rlwVar instanceof slw) {
            aVar.K(-309282760);
            invoke = w65.p(((slw) rlwVar).a(), aVar, 0);
            aVar.j();
        } else if (rlwVar instanceof ulw) {
            aVar.K(-309280880);
            invoke = pg90.a(((ulw) rlwVar).a(), 0, aVar);
            aVar.j();
        } else {
            if (!(rlwVar instanceof vlw)) {
                throw alb0.c(-309284000, aVar);
            }
            aVar.K(-309278856);
            vlw vlwVar = (vlw) rlwVar;
            invoke = a.invoke(vlwVar.b(), vlwVar.a(), aVar, 0);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return invoke;
    }
}
