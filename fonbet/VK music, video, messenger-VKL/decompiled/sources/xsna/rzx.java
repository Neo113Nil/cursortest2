package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.ImageList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gzx;
import xsna.uzx;

/* compiled from: JoinCallReducer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class rzx extends FunctionReferenceImpl implements izs<uzx.a, gzx> {
    public static final rzx b = new rzx(1, hzx.class, "mapToViewState", "mapToViewState(Lcom/vk/voip/ui/join/directly/withpreview/feature/JoinCallState$Content;)Lcom/vk/voip/ui/join/directly/withpreview/ui/state/JoinCallContentViewState;", 1);

    @Override // xsna.izs
    public final gzx invoke(uzx.a aVar) {
        gzx.a aVar2;
        uzx.a aVar3 = aVar;
        boolean z = !drm0.N(aVar3.d);
        int i = aVar3.e;
        String str = aVar3.c;
        uzx.a.AbstractC3860a abstractC3860a = aVar3.f;
        if (abstractC3860a instanceof uzx.a.AbstractC3860a.c) {
            uzx.a.AbstractC3860a.c cVar = (uzx.a.AbstractC3860a.c) abstractC3860a;
            og0 og0Var = cVar.c;
            cn cnVar = cVar.b;
            String str2 = (String) og0Var.b;
            if (str2 == null) {
                str2 = (String) og0Var.c;
            }
            if (str2 == null) {
                str2 = cnVar.b;
            }
            Serializer.c<ImageList> cVar2 = ImageList.CREATOR;
            aVar2 = new gzx.a.c(str2, ImageList.a.c(-1, -1, cnVar.c));
        } else if (abstractC3860a instanceof uzx.a.AbstractC3860a.b) {
            uzx.a.AbstractC3860a.b bVar = (uzx.a.AbstractC3860a.b) abstractC3860a;
            String y1 = bVar.b.y1();
            if (y1 == null) {
                y1 = "";
            }
            Serializer.c<ImageList> cVar3 = ImageList.CREATOR;
            aVar2 = new gzx.a.b(y1, ImageList.a.a(bVar.b.V1()));
        } else if (abstractC3860a instanceof uzx.a.AbstractC3860a.C3861a) {
            aVar2 = new gzx.a.C2962a(((uzx.a.AbstractC3860a.C3861a) abstractC3860a).b);
        } else {
            if (!(abstractC3860a instanceof uzx.a.AbstractC3860a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar2 = gzx.a.d.a;
        }
        return new gzx(z, i, str, aVar2, aVar3.g, aVar3.i.a, aVar3.j);
    }
}
