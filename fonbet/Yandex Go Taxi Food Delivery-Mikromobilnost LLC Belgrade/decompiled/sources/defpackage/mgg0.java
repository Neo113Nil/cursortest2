package defpackage;

import android.view.View;
import com.yandex.go.taxi.order.quality_question.ui.QualityQuestionButton;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public final class mgg0 implements zo31 {
    public final QualityQuestionButton a;
    public final ListItemComponent b;

    public mgg0(QualityQuestionButton qualityQuestionButton, ListItemComponent listItemComponent) {
        this.a = qualityQuestionButton;
        this.b = listItemComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
