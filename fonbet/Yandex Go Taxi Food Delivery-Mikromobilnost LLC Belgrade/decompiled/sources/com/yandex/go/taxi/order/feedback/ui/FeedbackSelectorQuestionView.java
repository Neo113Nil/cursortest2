package com.yandex.go.taxi.order.feedback.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.yandex.go.feedback_common.data.model.QuestionInfo;
import defpackage.ixe;
import defpackage.jl40;
import defpackage.mrg0;
import defpackage.n4h0;
import defpackage.p8h0;
import defpackage.qje;
import defpackage.qrq;
import defpackage.scc;
import defpackage.tje;
import defpackage.vng;
import defpackage.wtq;
import defpackage.xng0;
import defpackage.xtq;
import defpackage.xw31;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.DividerAwareComponent;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010\u0016J\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R$\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\f0+j\b\u0012\u0004\u0012\u00020\f`,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010/R\u0016\u00103\u001a\u0004\u0018\u0001008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/yandex/go/taxi/order/feedback/ui/FeedbackSelectorQuestionView;", "Lru/yandex/taxi/design/DividerAwareComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isLast", "Lru/yandex/taxi/design/ListItemCheckComponent;", "createButton", "(Z)Lru/yandex/taxi/design/ListItemCheckComponent;", "tappedButton", "Lzy11;", "onAnswerConfirm", "(Lru/yandex/taxi/design/ListItemCheckComponent;)V", "Lxtq;", ClidProvider.STATE, "updateButtons", "(Lxtq;)V", "button", "selected", "updateButtonState", "(Lru/yandex/taxi/design/ListItemCheckComponent;Z)V", "Lwtq;", "feedbackQuestionListener", "setAnswerListener", "(Lwtq;)V", "update", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/widget/LinearLayout;", "buttons", "Landroid/widget/LinearLayout;", "container", "Lru/yandex/taxi/design/ListTitleComponent;", "title", "Lru/yandex/taxi/design/ListTitleComponent;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "answerButtons", "Ljava/util/ArrayList;", "Lwtq;", "Landroid/graphics/drawable/Drawable;", "getBackgroundDrawable", "()Landroid/graphics/drawable/Drawable;", "backgroundDrawable", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FeedbackSelectorQuestionView extends DividerAwareComponent {
    public static final int $stable = 8;
    private final ArrayList<ListItemCheckComponent> answerButtons;
    private final LinearLayout buttons;
    private final LinearLayout container;
    private wtq feedbackQuestionListener;
    private final ListTitleComponent title;

    public FeedbackSelectorQuestionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LinearLayout linearLayout = new LinearLayout(context);
        this.buttons = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.container = linearLayout2;
        ListTitleComponent listTitleComponent = new ListTitleComponent(context, null, 0, 6, null);
        this.title = listTitleComponent;
        this.answerButtons = new ArrayList<>();
        linearLayout.setOrientation(1);
        linearLayout2.setOrientation(1);
        setBackground(getBackgroundDrawable());
        addView(linearLayout2);
        linearLayout2.addView(listTitleComponent);
        linearLayout2.addView(linearLayout);
        xw31.E(linearLayout, null, null, Integer.valueOf((int) context.getResources().getDimension(mrg0.go_design_s_space)), null);
    }

    private final ListItemCheckComponent createButton(boolean isLast) {
        ListItemCheckComponent listItemCheckComponent = new ListItemCheckComponent(getContext(), null, 0, 6, null);
        if (isLast) {
            listItemCheckComponent.setDividers(DividerPosition.NONE, DividerType.NONE);
        } else {
            listItemCheckComponent.setDividers(DividerPosition.BOTTOM, DividerType.MARGIN);
        }
        listItemCheckComponent.setCheckedChangeListener(new ixe(1, this, listItemCheckComponent));
        return listItemCheckComponent;
    }

    private final Drawable getBackgroundDrawable() {
        return vng.t(n4h0.round_line_rectangle, getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAnswerConfirm(ListItemCheckComponent tappedButton) {
        String str = (String) tappedButton.getTag(p8h0.feedback_answer_id);
        String str2 = (String) tappedButton.getTag(p8h0.feedback_question_id);
        Iterator<ListItemCheckComponent> it = this.answerButtons.iterator();
        while (it.hasNext()) {
            ListItemCheckComponent next = it.next();
            updateButtonState(next, str.equals((String) next.getTag(p8h0.feedback_answer_id)));
        }
        wtq wtqVar = this.feedbackQuestionListener;
        if (wtqVar != null) {
            wtqVar.e(new QuestionInfo(str2, str));
        }
    }

    private final void updateButtonState(ListItemCheckComponent button, boolean selected) {
        button.setChecked(selected);
    }

    private final void updateButtons(xtq state) {
        int i = 0;
        for (ListItemCheckComponent listItemCheckComponent : this.answerButtons) {
            List list = state.c;
            List list2 = state.c;
            listItemCheckComponent.setTitle(((qrq) list.get(i)).b);
            listItemCheckComponent.setTag(p8h0.feedback_question_id, state.a);
            listItemCheckComponent.setTag(p8h0.feedback_answer_id, ((qrq) list2.get(i)).a);
            updateButtonState(listItemCheckComponent, jl40.l(((qrq) list2.get(i)).a, state.d));
            i++;
        }
    }

    @Override // ru.yandex.taxi.design.DividerAwareComponent, com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.title.setTitleTextColor(qje.t(xng0.textMain, getContext()));
        setBackground(getBackgroundDrawable());
    }

    public final void setAnswerListener(wtq feedbackQuestionListener) {
        this.feedbackQuestionListener = feedbackQuestionListener;
    }

    public final void update(xtq state) {
        this.title.setTitle(state.b);
        List list = state.c;
        if (this.answerButtons.size() != list.size()) {
            this.buttons.removeAllViews();
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                boolean z = true;
                if (i != list.size() - 1) {
                    z = false;
                }
                ListItemCheckComponent createButton = createButton(z);
                this.buttons.addView(createButton);
                this.answerButtons.add(createButton);
                xw31.A(tje.u(2, getContext()), createButton);
                xw31.C(16, createButton);
                i = i2;
            }
        }
        updateButtons(state);
    }

    public FeedbackSelectorQuestionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FeedbackSelectorQuestionView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ FeedbackSelectorQuestionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
