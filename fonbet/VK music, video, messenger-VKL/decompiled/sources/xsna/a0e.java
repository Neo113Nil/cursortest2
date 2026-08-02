package xsna;

import com.vk.superapp.api.dto.story.WebStickerType;
import xsna.c0e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class a0e implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ a0e(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                c0e.a aVar = new c0e.a(WebStickerType.LOTTIE, null, null, (i700) obj, null, null, this.d, 246);
                String str = this.c;
                if (str != null) {
                    c0e.a.a(aVar, str);
                }
                return aVar;
            default:
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                return new io.reactivex.rxjava3.internal.operators.single.d0(vdx0Var.x().a(this.c, dgn0.e(), this.d).l(new h7(new t810(1), 27)), new v11(17), null);
        }
    }

    public /* synthetic */ a0e(no10 no10Var, String str, String str2) {
        this.c = str;
        this.d = str2;
    }
}
