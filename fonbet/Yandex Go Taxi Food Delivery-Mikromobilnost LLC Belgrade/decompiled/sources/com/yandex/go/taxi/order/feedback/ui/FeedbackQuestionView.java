package com.yandex.go.taxi.order.feedback.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.yandex.go.feedback_common.data.model.QuestionInfo;
import defpackage.bdc;
import defpackage.jl40;
import defpackage.mrg0;
import defpackage.n4h0;
import defpackage.p8h0;
import defpackage.qpo;
import defpackage.qrq;
import defpackage.tje;
import defpackage.vng;
import defpackage.wtq;
import defpackage.xng0;
import defpackage.xtq;
import defpackage.xw31;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\f2\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b!\u0010\u0012J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\b0)j\b\u0012\u0004\u0012\u00020\b`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00102\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100R\u0014\u00103\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00100R\u0016\u00107\u001a\u0004\u0018\u0001048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lcom/yandex/go/taxi/order/feedback/ui/FeedbackQuestionView;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lru/yandex/taxi/design/ButtonComponent;", "createButton", "()Lru/yandex/taxi/design/ButtonComponent;", "tappedButton", "Lzy11;", "onAnswerConfirm", "(Lru/yandex/taxi/design/ButtonComponent;)V", "Lxtq;", ClidProvider.STATE, "updateButtons", "(Lxtq;)V", "button", "", "selected", "updateButtonState", "(Lru/yandex/taxi/design/ButtonComponent;Z)V", "", "margin", "setRightMarginButtons", "(I)V", "setLeftMarginButtons", "Lwtq;", "feedbackQuestionListener", "setAnswerListener", "(Lwtq;)V", "update", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/widget/LinearLayout;", "buttons", "Landroid/widget/LinearLayout;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "answerButtons", "Ljava/util/ArrayList;", "Lwtq;", "Lbdc;", "defaultButtonColor", "Lbdc;", "selectedButtonColor", "defaultTitleColor", "selectedTitleColor", "Landroid/graphics/drawable/Drawable;", "getBackgroundDrawable", "()Landroid/graphics/drawable/Drawable;", "backgroundDrawable", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FeedbackQuestionView extends ListItemComponent {
    public static final int $stable = 8;
    private final ArrayList<ButtonComponent> answerButtons;
    private LinearLayout buttons;
    private final bdc defaultButtonColor;
    private final bdc defaultTitleColor;
    private wtq feedbackQuestionListener;
    private final bdc selectedButtonColor;
    private final bdc selectedTitleColor;

    public FeedbackQuestionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        this.buttons = new LinearLayout(context);
        this.answerButtons = new ArrayList<>();
        this.defaultButtonColor = new bdc(xng0.controlMinor);
        this.selectedButtonColor = new bdc(xng0.controlMain);
        this.defaultTitleColor = new bdc(xng0.textOnControlMinor);
        this.selectedTitleColor = new bdc(xng0.textOnControl);
        this.buttons.setOrientation(0);
        setBackground(getBackgroundDrawable());
        setTrailView(this.buttons);
        xw31.E(this.buttons, null, null, Integer.valueOf(tje.r(mrg0.go_design_s_space, getContext())), null);
        setTitleTextSizePx(tje.u(13, getContext()));
    }

    private final ButtonComponent createButton() {
        ButtonComponent buttonComponent = new ButtonComponent(getContext(), null, 0, 6, null);
        buttonComponent.setButtonSize(1);
        buttonComponent.setButtonTitleColor(this.defaultTitleColor);
        buttonComponent.setButtonBackground(this.defaultButtonColor);
        buttonComponent.setTextSize(0, tje.u(13, getContext()));
        buttonComponent.setOnClickListener(new qpo(5, this, buttonComponent));
        return buttonComponent;
    }

    private final Drawable getBackgroundDrawable() {
        return vng.t(n4h0.round_line_rectangle, getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAnswerConfirm(ButtonComponent tappedButton) {
        String str = (String) tappedButton.getTag(p8h0.feedback_answer_id);
        String str2 = (String) tappedButton.getTag(p8h0.feedback_question_id);
        wtq wtqVar = this.feedbackQuestionListener;
        if (wtqVar != null) {
            wtqVar.e(new QuestionInfo(str2, str));
        }
    }

    private final void updateButtonState(ButtonComponent button, boolean selected) {
        if (selected != button.isSelected()) {
            button.setSelected(selected);
            if (selected) {
                button.setButtonBackground(this.selectedButtonColor);
                button.setButtonTitleColor(this.selectedTitleColor);
            } else {
                button.setButtonBackground(this.defaultButtonColor);
                button.setButtonTitleColor(this.defaultTitleColor);
            }
        }
    }

    private final void updateButtons(xtq state) {
        int i = 0;
        for (ButtonComponent buttonComponent : this.answerButtons) {
            List list = state.c;
            List list2 = state.c;
            buttonComponent.setText(((qrq) list.get(i)).b);
            buttonComponent.setTag(p8h0.feedback_question_id, state.a);
            buttonComponent.setTag(p8h0.feedback_answer_id, ((qrq) list2.get(i)).a);
            updateButtonState(buttonComponent, jl40.l(((qrq) list2.get(i)).a, state.d));
            i++;
        }
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, ru.yandex.taxi.design.DividerAwareComponent, com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        setBackground(getBackgroundDrawable());
    }

    public final void setAnswerListener(wtq feedbackQuestionListener) {
        this.feedbackQuestionListener = feedbackQuestionListener;
    }

    public final void setLeftMarginButtons(int margin) {
        xw31.E(this.buttons, Integer.valueOf(margin), null, null, null);
    }

    public final void setRightMarginButtons(int margin) {
        xw31.E(this.buttons, null, null, Integer.valueOf(margin), null);
    }

    public final void update(xtq state) {
        setTitle(state.b);
        List<qrq> list = state.c;
        if (this.answerButtons.size() != list.size()) {
            this.buttons.removeAllViews();
            for (qrq qrqVar : list) {
                ButtonComponent createButton = createButton();
                this.buttons.addView(createButton);
                this.answerButtons.add(createButton);
                xw31.A(tje.u(2, getContext()), createButton);
                xw31.C(16, createButton);
            }
        }
        updateButtons(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeedbackQuestionView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ FeedbackQuestionView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
