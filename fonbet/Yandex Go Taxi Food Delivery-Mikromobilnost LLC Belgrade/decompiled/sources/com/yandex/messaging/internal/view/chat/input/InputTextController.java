package com.yandex.messaging.internal.view.chat.input;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.widget.TextView;
import com.yandex.messaging.internal.c0;
import com.yandex.messaging.views.KeyboardAwareEmojiEditText;
import defpackage.c18;
import defpackage.fxa1;
import defpackage.jng0;
import defpackage.kgx;
import defpackage.lqo;
import defpackage.mqu;
import defpackage.noy0;
import defpackage.ny61;
import defpackage.q0w;
import defpackage.qoi0;
import defpackage.qp3;
import defpackage.rmt0;
import defpackage.smt0;
import defpackage.tmt0;
import defpackage.tz10;
import defpackage.v3k0;
import defpackage.vmt0;
import defpackage.w511;
import defpackage.x08;
import defpackage.x4k0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0010¢\u0006\u0004\b$\u0010\u0012J%\u0010%\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b%\u0010 J/\u0010(\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u0015H\u0016¢\u0006\u0004\b(\u0010)J/\u0010+\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0015H\u0016¢\u0006\u0004\b+\u0010)J\u0017\u0010-\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0010¢\u0006\u0004\b/\u0010\u0012J\u0015\u00101\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u0001¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u0002032\u0006\u00100\u001a\u00020\u0001¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0010¢\u0006\u0004\b6\u0010\u0012J%\u00107\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0019¢\u0006\u0004\b7\u0010 J\u0015\u0010:\u001a\u0002092\u0006\u00108\u001a\u00020\u0015¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010@R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010AR/\u0010J\u001a\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010B8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0011\u0010!\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0019\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010M8F¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lcom/yandex/messaging/internal/view/chat/input/InputTextController;", "Landroid/text/TextWatcher;", "Lcom/yandex/messaging/views/KeyboardAwareEmojiEditText;", "input", "Ltmt0;", "spannableMessageObservable", "Lq0w;", "inputSpanCreator", "Lx4k0;", "richTextParser", "Lnoy0;", "messageFormatter", "Llqo;", "experimentConfig", "<init>", "(Lcom/yandex/messaging/views/KeyboardAwareEmojiEditText;Ltmt0;Lq0w;Lx4k0;Lnoy0;Llqo;)V", "Lzy11;", "requestFocusAndOpenKeyboard", "()V", "", "s", "", "selection", "setText", "(Ljava/lang/CharSequence;I)V", "", "createDecodedText", "()Ljava/lang/String;", "start", "end", "guid", "onSuggestTapped", "(IILjava/lang/String;)V", "text", "appendText", "(Ljava/lang/CharSequence;)V", "clear", "onRecreatedMentions", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "onAttach", "textWatcher", "addTextChangedListener", "(Landroid/text/TextWatcher;)V", "Lx08;", "subscribeForTextChanges", "(Landroid/text/TextWatcher;)Lx08;", "onDetach", "replaceText", "position", "", "hasAnyMentionAtPosition", "(I)Z", "Lcom/yandex/messaging/views/KeyboardAwareEmojiEditText;", "Ltmt0;", "Lq0w;", "Lx4k0;", "Lnoy0;", "Llqo;", "Lvmt0;", "<set-?>", "messageSubscription$delegate", "Lqp3;", "getMessageSubscription", "()Lvmt0;", "setMessageSubscription", "(Lvmt0;)V", "messageSubscription", "getText", "()Ljava/lang/CharSequence;", "", "getMentionedUsers", "()[Ljava/lang/String;", "mentionedUsers", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InputTextController implements TextWatcher {
    static final /* synthetic */ kgx[] $$delegatedProperties;
    public static final int $stable;
    private final lqo experimentConfig;
    private final KeyboardAwareEmojiEditText input;
    private final q0w inputSpanCreator;
    private final noy0 messageFormatter;

    /* renamed from: messageSubscription$delegate, reason: from kotlin metadata */
    private final qp3 messageSubscription = new qp3();
    private final x4k0 richTextParser;
    private final tmt0 spannableMessageObservable;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("messageSubscription", 0, "getMessageSubscription()Lcom/yandex/messaging/internal/SpannableMessageSubscription;", InputTextController.class);
        qoi0.a.getClass();
        $$delegatedProperties = new kgx[]{mutablePropertyReference1Impl};
        $stable = 8;
    }

    public InputTextController(KeyboardAwareEmojiEditText keyboardAwareEmojiEditText, tmt0 tmt0Var, q0w q0wVar, x4k0 x4k0Var, noy0 noy0Var, lqo lqoVar) {
        this.input = keyboardAwareEmojiEditText;
        this.spannableMessageObservable = tmt0Var;
        this.inputSpanCreator = q0wVar;
        this.richTextParser = x4k0Var;
        this.messageFormatter = noy0Var;
        this.experimentConfig = lqoVar;
        keyboardAwareEmojiEditText.addTextChangedListener(this);
        q0wVar.a = fxa1.c(jng0.messagingOutgoingLinkColor, keyboardAwareEmojiEditText.getContext()).data;
    }

    private final vmt0 getMessageSubscription() {
        qp3 qp3Var = this.messageSubscription;
        kgx kgxVar = $$delegatedProperties[0];
        return (vmt0) qp3Var.a();
    }

    private final void setMessageSubscription(vmt0 vmt0Var) {
        qp3 qp3Var = this.messageSubscription;
        kgx kgxVar = $$delegatedProperties[0];
        qp3Var.b(vmt0Var);
    }

    public static /* synthetic */ void setText$default(InputTextController inputTextController, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = inputTextController.input.getSelectionStart();
        }
        inputTextController.setText(charSequence, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 subscribeForTextChanges$lambda$2(InputTextController inputTextController, TextWatcher textWatcher) {
        inputTextController.input.removeTextChangedListener(textWatcher);
        return zy11.a;
    }

    public final void addTextChangedListener(TextWatcher textWatcher) {
        this.input.addTextChangedListener(textWatcher);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s) {
    }

    public final void appendText(CharSequence text) {
        this.input.append(text);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        c0 c0Var;
        Editable editableText = this.input.getEditableText();
        for (InputMentionSpan inputMentionSpan : (InputMentionSpan[]) editableText.getSpans(0, s.length(), InputMentionSpan.class)) {
            int spanStart = editableText.getSpanStart(inputMentionSpan);
            if (editableText.getSpanEnd(inputMentionSpan) > start && start + count > spanStart) {
                editableText.removeSpan(inputMentionSpan);
                vmt0 messageSubscription = getMessageSubscription();
                if (messageSubscription != null && (c0Var = (c0) ((smt0) messageSubscription).x.remove(inputMentionSpan)) != null) {
                    c0Var.close();
                }
            }
        }
    }

    public final void clear() {
        this.input.getEditableText().clear();
    }

    public final String createDecodedText() {
        Editable editableText = this.input.getEditableText();
        int i = 0;
        InputMentionSpan[] inputMentionSpanArr = (InputMentionSpan[]) editableText.getSpans(0, editableText.length(), InputMentionSpan.class);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editableText);
        int i2 = 0;
        while (i2 < inputMentionSpanArr.length) {
            int i3 = i2 + 1;
            try {
                InputMentionSpan inputMentionSpan = inputMentionSpanArr[i2];
                spannableStringBuilder.setSpan(inputMentionSpan, editableText.getSpanStart(inputMentionSpan), editableText.getSpanEnd(inputMentionSpan), editableText.getSpanFlags(inputMentionSpan));
                i2 = i3;
            } catch (ArrayIndexOutOfBoundsException e) {
                w511.i(e.getMessage());
                return null;
            }
        }
        while (i < inputMentionSpanArr.length) {
            int i4 = i + 1;
            try {
                InputMentionSpan inputMentionSpan2 = inputMentionSpanArr[i];
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(inputMentionSpan2), spannableStringBuilder.getSpanEnd(inputMentionSpan2), (CharSequence) ("@" + inputMentionSpan2.getGuid()));
                i = i4;
            } catch (ArrayIndexOutOfBoundsException e2) {
                w511.i(e2.getMessage());
                return null;
            }
        }
        return this.experimentConfig.a(tz10.D) ? this.richTextParser.a(spannableStringBuilder) : spannableStringBuilder.toString();
    }

    public final String[] getMentionedUsers() {
        Editable editableText = this.input.getEditableText();
        InputMentionSpan[] inputMentionSpanArr = (InputMentionSpan[]) editableText.getSpans(0, editableText.length(), InputMentionSpan.class);
        if (inputMentionSpanArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(inputMentionSpanArr.length);
        for (InputMentionSpan inputMentionSpan : inputMentionSpanArr) {
            arrayList.add(inputMentionSpan.getGuid());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final CharSequence getText() {
        return this.input.getEditableText();
    }

    public final boolean hasAnyMentionAtPosition(int position) {
        return !(((InputMentionSpan[]) this.input.getEditableText().getSpans(position, position + 1, InputMentionSpan.class)).length == 0);
    }

    public final void onAttach() {
        tmt0 tmt0Var = this.spannableMessageObservable;
        Editable editableText = this.input.getEditableText();
        q0w q0wVar = this.inputSpanCreator;
        tmt0Var.getClass();
        setMessageSubscription(new smt0(tmt0Var, null, editableText, q0wVar, false));
    }

    public final void onDetach() {
        setMessageSubscription(null);
    }

    public final void onRecreatedMentions(int start, int end, String guid) {
        this.input.setSelection(end);
        vmt0 messageSubscription = getMessageSubscription();
        if (messageSubscription == null) {
            ny61.g("Required value was null.");
            return;
        }
        smt0 smt0Var = (smt0) messageSubscription;
        Object d = smt0Var.c.d(guid);
        Editable editable = smt0Var.b;
        editable.setSpan(d, start, end, 33);
        smt0Var.x.put(d, new c0(smt0Var, d, guid));
        LinkedHashSet linkedHashSet = smt0Var.y;
        linkedHashSet.remove(d);
        rmt0 rmt0Var = smt0Var.a;
        if (rmt0Var == null || !linkedHashSet.isEmpty()) {
            return;
        }
        rmt0Var.o(editable);
    }

    public final void onSuggestTapped(int start, int end, String guid) {
        this.input.getEditableText().insert(end, " ");
        this.input.setSelection(end + 1);
        vmt0 messageSubscription = getMessageSubscription();
        if (messageSubscription == null) {
            ny61.g("Required value was null.");
            return;
        }
        smt0 smt0Var = (smt0) messageSubscription;
        Object d = smt0Var.c.d(guid);
        Editable editable = smt0Var.b;
        editable.setSpan(d, start, end, 33);
        smt0Var.x.put(d, new c0(smt0Var, d, guid));
        LinkedHashSet linkedHashSet = smt0Var.y;
        linkedHashSet.remove(d);
        rmt0 rmt0Var = smt0Var.a;
        if (rmt0Var == null || !linkedHashSet.isEmpty()) {
            return;
        }
        rmt0Var.o(editable);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }

    public final void replaceText(int start, int end, String text) {
        this.input.getEditableText().replace(start, end, text);
    }

    public final void requestFocusAndOpenKeyboard() {
        this.input.requestFocusAndOpenKeyboard();
    }

    public final void setText(CharSequence s, int selection) {
        setMessageSubscription(null);
        CharSequence charSequence = s;
        if (this.experimentConfig.a(tz10.D)) {
            SpannableStringBuilder b = ((v3k0) this.messageFormatter).b(2, s);
            selection = b.length();
            charSequence = b;
        }
        this.input.setText(charSequence, TextView.BufferType.EDITABLE);
        this.input.setSelection(selection);
        tmt0 tmt0Var = this.spannableMessageObservable;
        Editable editableText = this.input.getEditableText();
        q0w q0wVar = this.inputSpanCreator;
        tmt0Var.getClass();
        setMessageSubscription(new smt0(tmt0Var, null, editableText, q0wVar, false));
    }

    public final x08 subscribeForTextChanges(TextWatcher textWatcher) {
        this.input.addTextChangedListener(textWatcher);
        return new c18(0, new mqu(9, this, textWatcher));
    }
}
