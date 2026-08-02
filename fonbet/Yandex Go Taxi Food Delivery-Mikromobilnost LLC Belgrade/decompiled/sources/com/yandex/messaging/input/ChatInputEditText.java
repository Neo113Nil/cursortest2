package com.yandex.messaging.input;

import android.R;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.Spanned;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import com.yandex.messaging.input.ChatInputEditText;
import com.yandex.messaging.internal.view.chat.input.InputMentionSpan;
import com.yandex.messaging.views.KeyboardAwareEmojiEditText;
import defpackage.b9c;
import defpackage.e3c;
import defpackage.e8m;
import defpackage.eua;
import defpackage.fxa1;
import defpackage.gyc;
import defpackage.h070;
import defpackage.jge;
import defpackage.jng0;
import defpackage.kge;
import defpackage.lge;
import defpackage.mge;
import defpackage.p3b;
import defpackage.sls;
import defpackage.t3b;
import defpackage.tls;
import defpackage.w511;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001@B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R0\u0010-\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\f\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R,\u00104\u001a\f\u0012\u0006\u0012\u0004\u0018\u000103\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0019\u001a\u0004\b5\u0010\u001b\"\u0004\b6\u0010\u001dR.\u00109\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u0001078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/yandex/messaging/input/ChatInputEditText;", "Lcom/yandex/messaging/views/KeyboardAwareEmojiEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "onDraw", "(Landroid/graphics/Canvas;)V", "id", "", "onTextContextMenuItem", "(I)Z", "selStart", "selEnd", "onSelectionChanged", "(II)V", "Lkotlin/Function0;", "getMarkdownInInputFeatureState", "Lsls;", "getGetMarkdownInInputFeatureState", "()Lsls;", "setGetMarkdownInInputFeatureState", "(Lsls;)V", "Lt3b;", "chatInputMentionRule", "Lt3b;", "Lb9c;", "codeBlockDrawer", "Lb9c;", "codeColor", CA20Status.STATUS_USER_I, "codeOffset", "codeLineTopOffset", "Landroid/graphics/Rect;", "clipBoundsRect", "Landroid/graphics/Rect;", "Lkotlin/Function1;", "Landroid/text/Spanned;", "copyFormattedText", "Ltls;", "getCopyFormattedText", "()Ltls;", "setCopyFormattedText", "(Ltls;)V", "", "pasteFormattedText", "getPasteFormattedText", "setPasteFormattedText", "Le3c;", "value", "clipboardAttachesSender", "Le3c;", "getClipboardAttachesSender", "()Le3c;", "setClipboardAttachesSender", "(Le3c;)V", "Companion", "p3b", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatInputEditText extends KeyboardAwareEmojiEditText {
    public static final int $stable = 8;
    public static final p3b Companion = new p3b();
    private static final String[] MIME_TYPES = {"image/*"};
    private final t3b chatInputMentionRule;
    private final Rect clipBoundsRect;
    private e3c clipboardAttachesSender;
    private final b9c codeBlockDrawer;
    private final int codeColor;
    private final int codeLineTopOffset;
    private final int codeOffset;
    private tls copyFormattedText;
    private sls getMarkdownInInputFeatureState;
    private sls pasteFormattedText;

    public ChatInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getMarkdownInInputFeatureState = new eua(16);
        this.chatInputMentionRule = new t3b();
        this.codeBlockDrawer = new b9c();
        this.codeColor = fxa1.c(jng0.messagingCommonBackgroundColor, context).data;
        this.codeOffset = e8m.a(7);
        this.codeLineTopOffset = e8m.a(6);
        this.clipBoundsRect = new Rect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mge _set_clipboardAttachesSender_$lambda$3$lambda$2(e3c e3cVar, View view, mge mgeVar) {
        jge jgeVar;
        jge jgeVar2;
        Pair create;
        e3cVar.getClass();
        lge lgeVar = mgeVar.a;
        ClipData e = lgeVar.e();
        if (e.getItemCount() == 1) {
            r2 = e.getItemAt(0).getUri() != null ? 1 : 0;
            create = Pair.create(r2 != 0 ? mgeVar : null, r2 == 0 ? mgeVar : null);
        } else {
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            while (r2 < e.getItemCount()) {
                ClipData.Item itemAt = e.getItemAt(r2);
                if (itemAt.getUri() != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(itemAt);
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(itemAt);
                }
                r2++;
            }
            Pair create2 = arrayList == null ? Pair.create(null, e) : arrayList2 == null ? Pair.create(e, null) : Pair.create(mge.a(e.getDescription(), arrayList), mge.a(e.getDescription(), arrayList2));
            if (create2.first == null) {
                create = Pair.create(null, mgeVar);
            } else if (create2.second == null) {
                create = Pair.create(mgeVar, null);
            } else {
                int i = Build.VERSION.SDK_INT;
                if (i >= 31) {
                    jgeVar = new gyc(mgeVar);
                } else {
                    kge kgeVar = new kge();
                    kgeVar.b = lgeVar.e();
                    kgeVar.c = lgeVar.getSource();
                    kgeVar.w = lgeVar.getFlags();
                    kgeVar.x = lgeVar.k();
                    kgeVar.y = lgeVar.getExtras();
                    jgeVar = kgeVar;
                }
                jgeVar.f((ClipData) create2.first);
                mge build = jgeVar.build();
                if (i >= 31) {
                    jgeVar2 = new gyc(mgeVar);
                } else {
                    kge kgeVar2 = new kge();
                    kgeVar2.b = lgeVar.e();
                    kgeVar2.c = lgeVar.getSource();
                    kgeVar2.w = lgeVar.getFlags();
                    kgeVar2.x = lgeVar.k();
                    kgeVar2.y = lgeVar.getExtras();
                    jgeVar2 = kgeVar2;
                }
                jgeVar2.f((ClipData) create2.second);
                create = Pair.create(build, jgeVar2.build());
            }
        }
        mge mgeVar2 = (mge) create.first;
        return (mgeVar2 == null || !e3cVar.a(mgeVar2.a.e())) ? mgeVar : (mge) create.second;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getMarkdownInInputFeatureState$lambda$0() {
        return false;
    }

    public final e3c getClipboardAttachesSender() {
        return this.clipboardAttachesSender;
    }

    public final tls getCopyFormattedText() {
        return this.copyFormattedText;
    }

    public final sls getGetMarkdownInInputFeatureState() {
        return this.getMarkdownInInputFeatureState;
    }

    public final sls getPasteFormattedText() {
        return this.pasteFormattedText;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (((Boolean) this.getMarkdownInInputFeatureState.invoke()).booleanValue()) {
            int save = canvas.save();
            canvas.getClipBounds(this.clipBoundsRect);
            Rect rect = this.clipBoundsRect;
            int i = rect.top;
            int i2 = this.codeOffset;
            rect.top = i + i2;
            rect.bottom -= i2;
            canvas.clipRect(rect);
            b9c b9cVar = this.codeBlockDrawer;
            Editable text = getText();
            Layout layout = getLayout();
            getPaddingLeft();
            getWidth();
            getPaddingRight();
            b9c.a(b9cVar, text, layout, 896);
            canvas.restoreToCount(save);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int selStart, int selEnd) {
        super.onSelectionChanged(selStart, selEnd);
        if (selStart == selEnd) {
            return;
        }
        Editable text = getText();
        if (text == null) {
            text = null;
        }
        if (text == null) {
            return;
        }
        this.chatInputMentionRule.getClass();
        InputMentionSpan[] inputMentionSpanArr = (InputMentionSpan[]) text.getSpans(selStart, selEnd, InputMentionSpan.class);
        int length = text.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!(i2 < inputMentionSpanArr.length)) {
                break;
            }
            int i3 = i2 + 1;
            try {
                InputMentionSpan inputMentionSpan = inputMentionSpanArr[i2];
                int spanStart = text.getSpanStart(inputMentionSpan);
                int spanEnd = text.getSpanEnd(inputMentionSpan);
                if (spanStart < length) {
                    length = spanStart;
                }
                if (spanEnd > i) {
                    i = spanEnd;
                }
                i2 = i3;
            } catch (ArrayIndexOutOfBoundsException e) {
                w511.i(e.getMessage());
                return;
            }
        }
        if (selStart <= length) {
            length = selStart;
        }
        if (selEnd >= i) {
            i = selEnd;
        }
        kotlin.Pair pair = new kotlin.Pair(Integer.valueOf(length), Integer.valueOf(i));
        int intValue = ((Number) pair.getFirst()).intValue();
        int intValue2 = ((Number) pair.getSecond()).intValue();
        if ((intValue == selStart && intValue2 == selEnd) || intValue == intValue2) {
            return;
        }
        setSelection(intValue, intValue2);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int id) {
        CharSequence charSequence;
        switch (id) {
            case R.id.cut:
            case R.id.copy:
                tls tlsVar = this.copyFormattedText;
                Editable text = getText();
                if (tlsVar == null || text == null || getSelectionStart() == getSelectionEnd()) {
                    return super.onTextContextMenuItem(id);
                }
                tlsVar.invoke((Spanned) text.subSequence(getSelectionStart(), getSelectionEnd()));
                if (id == 16908320) {
                    text.delete(getSelectionStart(), getSelectionEnd());
                }
                return true;
            case R.id.paste:
                e3c e3cVar = this.clipboardAttachesSender;
                if (e3cVar != null) {
                    ClipData primaryClip = e3cVar.b.b().getPrimaryClip();
                    if (primaryClip == null ? true : e3cVar.a(primaryClip)) {
                        clearFocus();
                        return true;
                    }
                }
                sls slsVar = this.pasteFormattedText;
                if (slsVar == null || (charSequence = (CharSequence) slsVar.invoke()) == null) {
                    return super.onTextContextMenuItem(R.id.pasteAsPlainText);
                }
                int selectionStart = getSelectionStart();
                int selectionEnd = getSelectionEnd();
                Editable text2 = getText();
                if (text2 != null) {
                    text2.replace(selectionStart, selectionEnd, charSequence);
                    return true;
                }
                return true;
            default:
                return super.onTextContextMenuItem(id);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [o3b] */
    public final void setClipboardAttachesSender(final e3c e3cVar) {
        if (this.clipboardAttachesSender != null) {
            androidx.core.view.b.s(this, MIME_TYPES, null);
        }
        this.clipboardAttachesSender = e3cVar;
        if (e3cVar != null) {
            androidx.core.view.b.s(this, MIME_TYPES, new h070() { // from class: o3b
                @Override // defpackage.h070
                public final mge a(View view, mge mgeVar) {
                    mge _set_clipboardAttachesSender_$lambda$3$lambda$2;
                    _set_clipboardAttachesSender_$lambda$3$lambda$2 = ChatInputEditText._set_clipboardAttachesSender_$lambda$3$lambda$2(e3c.this, view, mgeVar);
                    return _set_clipboardAttachesSender_$lambda$3$lambda$2;
                }
            });
        }
    }

    public final void setCopyFormattedText(tls tlsVar) {
        this.copyFormattedText = tlsVar;
    }

    public final void setGetMarkdownInInputFeatureState(sls slsVar) {
        this.getMarkdownInInputFeatureState = slsVar;
    }

    public final void setPasteFormattedText(sls slsVar) {
        this.pasteFormattedText = slsVar;
    }

    public ChatInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ChatInputEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ChatInputEditText(Context context) {
        this(context, null, 0, 6, null);
    }
}
