package xsna;

import com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButtonHints;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rx implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ rx(Object obj, Object obj2, Object obj3, izs izsVar, Object obj4, Object obj5, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.c = izsVar;
        this.h = obj4;
        this.i = obj5;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                yx.a((List) this.e, (ActionButtonHints) this.f, (ActionButton) this.g, (izs) this.c, (ActionsAvailabilityState.AttachmentState) this.h, (String) this.i, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((HorizontalPagerView.BlockView) this.e).b((a8a) this.f, (HorizontalPagerView.f) this.g, (izs) this.c, (ksr) this.h, (q630) this.i, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                com.vk.core.compose.component.group.header.h.a((q630) this.e, (iku) this.f, (wku) this.g, (vku) this.c, (com.vk.core.compose.component.group.header.b) this.h, (jdj0) this.i, (androidx.compose.runtime.a) obj, ne7.I(262145), this.d);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ rx(q630 q630Var, iku ikuVar, wku wkuVar, vku vkuVar, com.vk.core.compose.component.group.header.b bVar, jdj0 jdj0Var, int i, int i2) {
        this.b = 2;
        this.e = q630Var;
        this.f = ikuVar;
        this.g = wkuVar;
        this.c = vkuVar;
        this.h = bVar;
        this.i = jdj0Var;
        this.d = i2;
    }
}
