package com.ybsdk.core.utils;

import android.text.InputFilter;
import android.text.Spanned;
import defpackage.evu0;
import defpackage.zls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012 \u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006JA\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0004\u0010\u000fR.\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/core/utils/InputFilterHelper;", "Landroid/text/InputFilter;", "Lkotlin/Function3;", "", "filter", "<init>", "(Lzls;)V", "source", "", "start", "end", "Landroid/text/Spanned;", "dest", "dstart", "dend", "(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;", "Lzls;", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InputFilterHelper implements InputFilter {
    private final zls filter;

    public InputFilterHelper(zls zlsVar) {
        this.filter = zlsVar;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        CharSequence subSequence = source.subSequence(start, end);
        return (CharSequence) this.filter.invoke(dest.subSequence(dstart, dend), evu0.U(dstart, dend, dest, subSequence), subSequence);
    }
}
