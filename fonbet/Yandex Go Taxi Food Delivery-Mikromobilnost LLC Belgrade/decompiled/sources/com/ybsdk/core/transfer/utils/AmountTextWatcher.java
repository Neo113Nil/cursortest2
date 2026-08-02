package com.ybsdk.core.transfer.utils;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import defpackage.f22;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0012\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0007\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\"\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/core/transfer/utils/AmountTextWatcher;", "Landroid/text/TextWatcher;", "Landroid/widget/EditText;", "editText", "Lkotlin/Function1;", "Landroid/text/Editable;", "Lzy11;", "onTextChanged", "<init>", "(Landroid/widget/EditText;Ltls;)V", "s", "afterTextChanged", "(Landroid/text/Editable;)V", "", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "Landroid/widget/EditText;", "Ltls;", "", "beforeText", "Ljava/lang/String;", "", "isSelfEdit", "Z", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AmountTextWatcher implements TextWatcher {
    private String beforeText;
    private final EditText editText;
    private boolean isSelfEdit;
    private final tls onTextChanged;

    public /* synthetic */ AmountTextWatcher(EditText editText, tls tlsVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(editText, (i & 2) != 0 ? new f22(0) : tlsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(Editable editable) {
        return zy11.a;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s) {
        if (this.isSelfEdit) {
            return;
        }
        this.onTextChanged.invoke(s);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        if (this.isSelfEdit) {
            return;
        }
        this.beforeText = String.valueOf(s);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (this.isSelfEdit) {
            return;
        }
        int i = start + before;
        if (i != 1 || count >= 2) {
            String str = this.beforeText;
            int length = str.substring(i, str.length()).length();
            this.isSelfEdit = true;
            this.editText.setSelection(String.valueOf(s).length() - length);
            this.isSelfEdit = false;
        }
    }

    public AmountTextWatcher(EditText editText, tls tlsVar) {
        this.editText = editText;
        this.onTextChanged = tlsVar;
        this.beforeText = "";
    }
}
