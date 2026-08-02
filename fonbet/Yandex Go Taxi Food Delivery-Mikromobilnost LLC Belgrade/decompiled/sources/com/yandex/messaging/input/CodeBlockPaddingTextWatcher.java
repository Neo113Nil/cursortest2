package com.yandex.messaging.input;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import defpackage.evu0;
import defpackage.xxk0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\fJ1\u0010\u0016\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0019\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\bR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u0016\u0010#\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!¨\u0006$"}, d2 = {"Lcom/yandex/messaging/input/CodeBlockPaddingTextWatcher;", "Landroid/text/TextWatcher;", "<init>", "()V", "Landroid/text/Editable;", "s", "Lzy11;", "deleteEmptyCodeBlocks", "(Landroid/text/Editable;)V", "", "lastAddedIndex", "handleCursorPosition", "(ILandroid/text/Editable;)V", "spanStart", "text", "handleCursorAtSpanStart", "(IILandroid/text/Editable;)V", "updateCursorAfterInsert", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "afterTextChanged", "", "isAdjustingText", "Z", "previousText", "Ljava/lang/CharSequence;", "changeStart", CA20Status.STATUS_USER_I, "changeEnd", "newTextLength", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CodeBlockPaddingTextWatcher implements TextWatcher {
    public static final int $stable = 8;
    private int changeEnd;
    private int changeStart;
    private boolean isAdjustingText;
    private int newTextLength;
    private CharSequence previousText = "";

    private final void deleteEmptyCodeBlocks(Editable s) {
        if (s == null) {
            return;
        }
        xxk0[] xxk0VarArr = (xxk0[]) s.getSpans(0, s.length(), xxk0.class);
        if (xxk0VarArr == null || xxk0VarArr.length == 0) {
            return;
        }
        for (xxk0 xxk0Var : xxk0VarArr) {
            if (evu0.J(s.subSequence(s.getSpanStart(null), s.getSpanEnd(null)).toString())) {
                s.removeSpan(null);
            }
        }
    }

    private final void handleCursorAtSpanStart(int spanStart, int lastAddedIndex, Editable text) {
        this.isAdjustingText = true;
        if (Selection.getSelectionStart(text) <= 0) {
            this.isAdjustingText = false;
        } else {
            text.insert(spanStart, "\n");
            updateCursorAfterInsert(lastAddedIndex, text);
        }
    }

    private final void handleCursorPosition(int lastAddedIndex, Editable s) {
        if (s == null) {
            return;
        }
        int selectionStart = Selection.getSelectionStart(s);
        xxk0[] xxk0VarArr = (xxk0[]) s.getSpans(0, s.length(), xxk0.class);
        if (xxk0VarArr.length == 0) {
            return;
        }
        for (xxk0 xxk0Var : xxk0VarArr) {
            int spanStart = s.getSpanStart(null);
            if (selectionStart == spanStart) {
                handleCursorAtSpanStart(spanStart, lastAddedIndex, s);
            }
        }
    }

    private final void updateCursorAfterInsert(int lastAddedIndex, Editable text) {
        Selection.setSelection(text, lastAddedIndex + 1);
        this.isAdjustingText = false;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s) {
        int i = (this.changeStart + this.newTextLength) - 1;
        deleteEmptyCodeBlocks(s);
        if (this.isAdjustingText) {
            return;
        }
        handleCursorPosition(i, s);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        this.previousText = String.valueOf(s);
        this.changeStart = start;
        this.changeEnd = start + count;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        this.newTextLength = count;
    }
}
