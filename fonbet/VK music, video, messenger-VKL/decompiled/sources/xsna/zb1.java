package xsna;

import com.vk.catalog2.common.ui.mvp.holder.video.assistant.c;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.newsfeed.impl.items.posting.item.modals.d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zb1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zb1(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                c.d dVar = (c.d) this.d;
                bfb0 bfb0Var = (bfb0) this.e;
                izs izsVar = (izs) this.f;
                ((Integer) obj2).getClass();
                int I = ne7.I(this.c | 1);
                androidx.compose.runtime.a M = ((androidx.compose.runtime.a) obj).M(-1416904636);
                int i = (M.J(dVar) ? 4 : 2) | I | (M.J(bfb0Var) ? 32 : 16);
                if ((I & 384) == 0) {
                    i |= M.y(izsVar) ? 256 : 128;
                }
                if (M.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1416904636, i, -1, "com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantCardPlaylistSliderContent (AiAssistantCard.kt:282)");
                    }
                    throw null;
                }
                M.h();
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new zb1(I, 0, dVar, bfb0Var, izsVar);
                }
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ybo.k((cco) this.d, (gzs) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                return s3q0.a;
            default:
                ((Integer) obj2).intValue();
                ((d.a) this.d).c((q630) this.e, (Cell$Middle.Size) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                return s3q0.a;
        }
    }
}
