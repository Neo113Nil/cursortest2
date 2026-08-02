package com.yandex.messaging.views;

import android.text.InputFilter;
import android.text.Spanned;
import defpackage.sls;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/messaging/views/ExceededMaxLengthInterceptor;", "Landroid/text/InputFilter$LengthFilter;", "", "maxLength", "Lkotlin/Function0;", "Lzy11;", "onMaxLengthExceeded", "<init>", "(ILsls;)V", "start", "end", "Landroid/text/Spanned;", "dest", "dstart", "dend", "", "isMaxMessageLengthExceeded", "(IILandroid/text/Spanned;II)Z", "", "source", "filter", "(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;", "Lsls;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ExceededMaxLengthInterceptor extends InputFilter.LengthFilter {
    public static final int $stable = 0;
    private final sls onMaxLengthExceeded;

    public ExceededMaxLengthInterceptor(int i, sls slsVar) {
        super(i);
        this.onMaxLengthExceeded = slsVar;
    }

    private final boolean isMaxMessageLengthExceeded(int start, int end, Spanned dest, int dstart, int dend) {
        return (end - start) + (dest.length() - (dend - dstart)) > getMax();
    }

    @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        if (isMaxMessageLengthExceeded(start, end, dest, dstart, dend)) {
            this.onMaxLengthExceeded.invoke();
        }
        return super.filter(source, start, end, dest, dstart, dend);
    }
}
