package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import kotlin.Metadata;
import ru.CryptoPro.XAdES.XAdESParameters;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/div/internal/spannable/NoUnderlineSpan;", "Landroid/text/style/UnderlineSpan;", "<init>", "()V", "Landroid/text/TextPaint;", XAdESParameters.XML_SIGNATURE_PREFIX, "Lzy11;", "updateDrawState", "(Landroid/text/TextPaint;)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NoUnderlineSpan extends UnderlineSpan {
    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        ds.setUnderlineText(false);
    }
}
