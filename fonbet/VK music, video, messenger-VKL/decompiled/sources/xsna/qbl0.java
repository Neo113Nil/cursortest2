package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.stories.design.view.stats.tabs.stickers.question.QuestionPayload;
import java.util.List;

/* compiled from: StickersQuestionDelegate.kt */
/* loaded from: classes6.dex */
public final class qbl0 extends p1u0<val0> {
    public final com.vk.stories.design.view.stats.tabs.stickers.mvi.e a;

    public qbl0(com.vk.stories.design.view.stats.tabs.stickers.mvi.e eVar) {
        this.a = eVar;
    }

    @Override // xsna.p1u0
    public final void a(vfz<val0> vfzVar, val0 val0Var, List list) {
        val0 val0Var2 = val0Var;
        StoryQuestionEntry storyQuestionEntry = val0Var2.b;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            vfzVar.i6(val0Var2);
            return;
        }
        wbl0 wbl0Var = vfzVar instanceof wbl0 ? (wbl0) vfzVar : null;
        if (wbl0Var != null) {
            Object Y = j5g.Y(list);
            wbl0Var.l = val0Var2;
            List list3 = Y instanceof List ? (List) Y : null;
            if (list3 == null) {
                return;
            }
            if (list3.contains(QuestionPayload.FULL_NAME)) {
                wbl0Var.i6(val0Var2);
            }
            if (list3.contains(QuestionPayload.AVATAR)) {
                wbl0Var.h6(val0Var2);
            }
            if (list3.contains(QuestionPayload.DATE)) {
                wbl0Var.o.setText(mnh0.g(storyQuestionEntry.j * 1000, wbl0Var.b6()));
            }
            if (list3.contains(QuestionPayload.TEXT)) {
                wbl0Var.p.setText(storyQuestionEntry.d);
            }
            if (list3.contains(QuestionPayload.BUTTON)) {
                wbl0Var.q.setMode(storyQuestionEntry.h ? VkButton.Mode.Secondary : VkButton.Mode.Primary);
            }
            list3.contains(QuestionPayload.OPTIONS);
            if (list3.contains(QuestionPayload.SELECTION)) {
                wbl0Var.j6(val0Var2);
            }
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends val0> b(ViewGroup viewGroup) {
        return new wbl0(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof val0;
    }
}
