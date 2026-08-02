package xsna;

import android.graphics.RectF;
import com.vk.story.viewer.api.StoryViewerRouter;
import java.util.List;
import xsna.qkc;

/* compiled from: ClickableStickerDelegateFactoryImpl.kt */
/* loaded from: classes6.dex */
public final class zjc implements yjc {
    public final StoryViewerRouter a;

    public zjc(StoryViewerRouter storyViewerRouter) {
        this.a = storyViewerRouter;
    }

    @Override // xsna.yjc
    public final xjc a(List list, RectF rectF, izs izsVar, izs izsVar2, r9k r9kVar, uoh uohVar, g6 g6Var, b1h b1hVar, m1k m1kVar, qcl qclVar) {
        return new qkc(list, rectF, new qkc.a(izsVar, izsVar2, r9kVar, uohVar, g6Var, m1kVar, qclVar, b1hVar), this.a);
    }
}
