package xsna;

import com.vk.dto.narratives.HighlightCover;
import com.vk.dto.narratives.HighlightLocalStoryCover;
import java.util.ArrayList;
import xsna.jv60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class z4v implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z4v(boolean z, Object obj, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                b5v b5vVar = (b5v) this.d;
                ArrayList arrayList = b5vVar.l;
                ppt pptVar = (ppt) obj;
                if (this.c) {
                    arrayList.clear();
                }
                b5vVar.k.l(pptVar.a.i());
                arrayList.addAll(pptVar.a);
                HighlightCover highlightCover = b5vVar.n;
                if (highlightCover instanceof HighlightLocalStoryCover) {
                    HighlightLocalStoryCover highlightLocalStoryCover = (HighlightLocalStoryCover) highlightCover;
                    b5vVar.R4(highlightLocalStoryCover.b.c, highlightLocalStoryCover.c);
                }
                b5vVar.j7();
                break;
            default:
                dv60 dv60Var = (dv60) this.d;
                lu60 lu60Var = (lu60) obj;
                if (epx.f(lu60Var.c(), Boolean.TRUE) && this.c && sua.n(lu60Var)) {
                    dv60Var.e(new jv60.a.C3147a(true));
                }
                break;
        }
        return s3q0.a;
    }
}
