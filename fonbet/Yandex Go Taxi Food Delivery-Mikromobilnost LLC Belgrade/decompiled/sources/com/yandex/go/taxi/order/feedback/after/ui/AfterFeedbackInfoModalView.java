package com.yandex.go.taxi.order.feedback.after.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.cma1;
import defpackage.fj1;
import defpackage.gj1;
import defpackage.hj1;
import defpackage.jg;
import defpackage.k4o;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.w511;
import defpackage.zkh0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0007B!\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/yandex/go/taxi/order/feedback/after/ui/AfterFeedbackInfoModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lfj1;", "Landroid/content/Context;", "context", "Lcom/yandex/go/taxi/order/feedback/after/ui/AfterFeedbackInfoModalView$MessageType;", "messageType", "Lgj1;", "callback", "<init>", "(Landroid/content/Context;Lcom/yandex/go/taxi/order/feedback/after/ui/AfterFeedbackInfoModalView$MessageType;Lgj1;)V", "Lzy11;", "setTitleAndText", "(Lcom/yandex/go/taxi/order/feedback/after/ui/AfterFeedbackInfoModalView$MessageType;)V", "onBackPressed", "()V", "onTouchOutside", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lfj1;", "Lgj1;", "MessageType", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AfterFeedbackInfoModalView extends SlideableBindingModalView<fj1> {
    public static final int $stable = 8;
    private final gj1 callback;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/feedback/after/ui/AfterFeedbackInfoModalView$MessageType;", "", "MESSAGE_DONE", "MESSAGE_DRIVE_DISABLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class MessageType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ MessageType[] $VALUES;
        public static final MessageType MESSAGE_DONE;
        public static final MessageType MESSAGE_DRIVE_DISABLE;

        static {
            MessageType messageType = new MessageType("MESSAGE_DONE", 0);
            MESSAGE_DONE = messageType;
            MessageType messageType2 = new MessageType("MESSAGE_DRIVE_DISABLE", 1);
            MESSAGE_DRIVE_DISABLE = messageType2;
            MessageType[] messageTypeArr = {messageType, messageType2};
            $VALUES = messageTypeArr;
            $ENTRIES = kotlin.enums.a.a(messageTypeArr);
        }

        public static MessageType valueOf(String str) {
            return (MessageType) Enum.valueOf(MessageType.class, str);
        }

        public static MessageType[] values() {
            return (MessageType[]) $VALUES.clone();
        }
    }

    public AfterFeedbackInfoModalView(Context context, MessageType messageType, gj1 gj1Var) {
        super(context, 3);
        this.callback = gj1Var;
        setTitleAndText(messageType);
        getBinding().b.setDebounceClickListener(new jg(9, this));
    }

    private final void setTitleAndText(MessageType messageType) {
        int i;
        int i2;
        int i3 = a.a[messageType.ordinal()];
        if (i3 == 1) {
            i = kyh0.after_feedback_driver_title_disable;
            i2 = kyh0.after_feedback_driver_text_disable;
        } else if (i3 != 2) {
            w511.b();
            return;
        } else {
            i = kyh0.after_feedback_title_done;
            i2 = kyh0.after_feedback_text_done;
        }
        getBinding().d.setTitle(i);
        getBinding().c.setText(getContext().getString(i2));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public fj1 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(zkh0.after_feedback_info, parent, false);
        int i = p8h0.confirm_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = p8h0.subtitle;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = p8h0.title;
                ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
                if (listHeaderComponent != null) {
                    return new fj1((LinearLayout) inflate, buttonComponent, robotoTextView, listHeaderComponent);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        ((hj1) this.callback).a.run();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        ((hj1) this.callback).a.run();
    }
}
