package defpackage;

import android.view.ViewGroup;
import java.util.List;
import ru.yandex.taxi.communications.api.dto.StoryWidgets;
import ru.yandex.taxi.communications.ui.LabelInfoModalView;
import ru.yandex.taxi.stories.presentation.story.StoryModalView;
import ru.yandex.taxi.stories.presentation.story.g;

/* loaded from: classes6.dex */
public final class dpu0 implements oou0 {
    public final /* synthetic */ StoryModalView a;

    public dpu0(StoryModalView storyModalView) {
        this.a = storyModalView;
    }

    @Override // defpackage.oou0
    public final void a(List list) {
        g gVar = this.a.presenter;
        ViewGroup overlappingModalViewContainer = ((gpu0) gVar.a).getOverlappingModalViewContainer();
        if (overlappingModalViewContainer == null || list.isEmpty()) {
            return;
        }
        sqx sqxVar = gVar.w;
        ou4 ou4Var = new ou4(overlappingModalViewContainer, gVar, 10);
        LabelInfoModalView labelInfoModalView = new LabelInfoModalView(sqxVar.a, list);
        labelInfoModalView.setOnAppearingListener(ou4Var);
        labelInfoModalView.show(overlappingModalViewContainer, 0.0f);
    }

    @Override // defpackage.oou0
    public final void b(gqu0 gqu0Var) {
        g gVar = this.a.presenter;
        gVar.getClass();
        gVar.p(gqu0Var.d, gqu0Var.a, true, gqu0Var);
    }

    @Override // defpackage.oou0
    public final void c(StoryWidgets.c cVar) {
        g gVar = this.a.presenter;
        gVar.getClass();
        gVar.p(cVar.c, cVar.a, false, null);
    }
}
