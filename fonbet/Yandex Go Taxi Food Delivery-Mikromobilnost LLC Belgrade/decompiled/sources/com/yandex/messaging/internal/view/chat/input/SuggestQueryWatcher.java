package com.yandex.messaging.internal.view.chat.input;

import android.text.Editable;
import android.text.TextWatcher;
import defpackage.fjg0;
import defpackage.gj10;
import defpackage.jqr;
import defpackage.kgx;
import defpackage.pzt0;
import defpackage.rp3;
import defpackage.t1s;
import defpackage.u8t;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
class SuggestQueryWatcher implements TextWatcher {
    private final InputTextController mInputTextController;
    private String mLastQuery;
    private final a mSuggestBrick;

    public SuggestQueryWatcher(a aVar, InputTextController inputTextController) {
        this.mSuggestBrick = aVar;
        this.mInputTextController = inputTextController;
    }

    private void clearSuggest() {
        updateSuggest(null, new fjg0(-1, -1));
    }

    private boolean isValidMentionPrefix(CharSequence charSequence, int i, int i2) {
        if (i < 0 || charSequence.charAt(i) != '@') {
            return false;
        }
        return (i == 0 || Character.isWhitespace(charSequence.charAt(i + (-1)))) && !this.mInputTextController.hasAnyMentionAtPosition(i) && i2 < 2;
    }

    private void updateSuggest(String str, fjg0 fjg0Var) {
        if (Objects.equals(str, this.mLastQuery)) {
            return;
        }
        this.mLastQuery = str;
        a aVar = this.mSuggestBrick;
        gj10 gj10Var = aVar.c;
        rp3 rp3Var = aVar.E;
        gj10Var.getClass();
        gj10Var.c = new t1s(gj10Var);
        aVar.F = fjg0Var;
        kgx[] kgxVarArr = a.J;
        kgx kgxVar = kgxVarArr[1];
        rp3Var.a(null);
        if (str == null) {
            aVar.G = EmptyList.a;
            aVar.r();
        } else {
            pzt0 H = e.H(aVar.getBrickScope(), new jqr(aVar.b.a(new u8t(aVar.a, str)), new MentionSuggestBrick$onSuggestQueryChanged$1(aVar, null), 3));
            kgx kgxVar2 = kgxVarArr[1];
            rp3Var.a(H);
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = i4 - 1;
        int i6 = 0;
        while (i5 >= 0 && charSequence.charAt(i5) != '@' && (!Character.isWhitespace(charSequence.charAt(i5)) || (i6 = i6 + 1) <= 1)) {
            i5--;
        }
        if (!isValidMentionPrefix(charSequence, i5, i6)) {
            clearSuggest();
        } else {
            fjg0 fjg0Var = new fjg0(i5, i4);
            updateSuggest(charSequence.subSequence(fjg0Var.b, i4).toString(), fjg0Var);
        }
    }
}
