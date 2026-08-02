package com.yandex.plus.home.common.utils;

import android.text.Editable;
import android.text.TextWatcher;
import defpackage.x6f0;
import defpackage.y6f0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u000f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"com/yandex/plus/home/common/utils/EditTextExtKt$textFlow$1$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "text", "Lzy11;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "p0", "", "p1", "p2", "p3", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "onTextChanged", "homeless-core-android-extensions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EditTextExtKt$textFlow$1$textWatcher$1 implements TextWatcher {
    final /* synthetic */ y6f0 $$this$callbackFlow;

    public EditTextExtKt$textFlow$1$textWatcher$1(y6f0 y6f0Var) {
        this.$$this$callbackFlow = y6f0Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable text) {
        y6f0 y6f0Var = this.$$this$callbackFlow;
        String obj = text != null ? text.toString() : null;
        if (obj == null) {
            obj = "";
        }
        ((x6f0) y6f0Var).d(obj);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
    }
}
