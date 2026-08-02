package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: InputCustomAddressBottomSheet.kt */
/* loaded from: classes18.dex */
public final class q1x extends dw20 {
    public static final /* synthetic */ int f1 = 0;

    /* compiled from: InputCustomAddressBottomSheet.kt */
    public static final class a extends kmu0 {
        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new q1x();
        }
    }

    /* compiled from: InputCustomAddressBottomSheet.kt */
    public static final class b {
        /* JADX WARN: Type inference failed for: r5v4, types: [T, xsna.dw20] */
        public static void a(izs izsVar, gzs gzsVar, String str, Context context) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            s53 s53Var = new s53(20, izsVar, ref$ObjectRef);
            r1x r1xVar = new r1x(ref$ObjectRef, 0);
            a aVar = new a(context, new p1x());
            aVar.T0();
            aVar.c(new d5j(aVar.S0()));
            aVar.F0(true);
            aVar.x(0);
            aVar.w();
            aVar.D();
            aVar.l(e3m.f(R.attr.vk_ui_transparent, context));
            aVar.U0(new jai(2130251682, new be0(str, s53Var, r1xVar, 2), true));
            aVar.X(gzsVar);
            ref$ObjectRef.element = aVar.I0(null);
        }
    }

    @Override // xsna.dw20
    public final nw20 Fn(int i, Context context) {
        return new npi(context, i);
    }
}
