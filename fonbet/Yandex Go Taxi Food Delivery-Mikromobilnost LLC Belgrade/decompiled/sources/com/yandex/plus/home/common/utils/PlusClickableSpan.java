package com.yandex.plus.home.common.utils;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import defpackage.sls;
import kotlin.Metadata;
import ru.CryptoPro.XAdES.XAdESParameters;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0006\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/plus/home/common/utils/PlusClickableSpan;", "Landroid/text/style/ClickableSpan;", "", "withUnderline", "Lkotlin/Function0;", "Lzy11;", "onClick", "<init>", "(ZLsls;)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/text/TextPaint;", XAdESParameters.XML_SIGNATURE_PREFIX, "updateDrawState", "(Landroid/text/TextPaint;)V", "Z", "Lsls;", "homeless-core-android-extensions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusClickableSpan extends ClickableSpan {
    private final sls onClick;
    private final boolean withUnderline;

    public PlusClickableSpan(boolean z, sls slsVar) {
        this.withUnderline = z;
        this.onClick = slsVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        this.onClick.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        ds.setUnderlineText(this.withUnderline);
    }
}
