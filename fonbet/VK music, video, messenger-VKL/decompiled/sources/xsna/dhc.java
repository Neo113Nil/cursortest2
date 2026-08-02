package xsna;

import android.content.Context;
import com.vk.core.fragments.FragmentImpl;
import xsna.dw20;

/* compiled from: ClassifiedsRouter.kt */
/* loaded from: classes18.dex */
public interface dhc {
    dw20 a(Context context, dz00 dz00Var, izs izsVar, g3b g3bVar, yte yteVar, a23 a23Var);

    Class<? extends FragmentImpl> b();

    void c(Context context, cgc cgcVar);

    void d(Context context, ngc ngcVar);

    /* compiled from: ClassifiedsRouter.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final dhc STUB = new C2733a();

        public final dhc getSTUB() {
            return STUB;
        }

        /* compiled from: ClassifiedsRouter.kt */
        /* renamed from: xsna.dhc$a$a, reason: collision with other inner class name */
        public static final class C2733a implements dhc {
            @Override // xsna.dhc
            public final dw20 a(Context context, dz00 dz00Var, izs izsVar, g3b g3bVar, yte yteVar, a23 a23Var) {
                return new dw20.b(context, null).a();
            }

            @Override // xsna.dhc
            public final Class<? extends FragmentImpl> b() {
                return null;
            }

            @Override // xsna.dhc
            public final void c(Context context, cgc cgcVar) {
            }

            @Override // xsna.dhc
            public final void d(Context context, ngc ngcVar) {
            }
        }
    }
}
