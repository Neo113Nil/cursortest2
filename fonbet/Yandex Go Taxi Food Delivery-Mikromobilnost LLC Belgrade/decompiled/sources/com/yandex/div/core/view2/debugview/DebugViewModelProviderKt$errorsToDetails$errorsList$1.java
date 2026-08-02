package com.yandex.div.core.view2.debugview;

import com.yandex.div.json.ParsingException;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
final class DebugViewModelProviderKt$errorsToDetails$errorsList$1 extends Lambda implements tls {
    public static final DebugViewModelProviderKt$errorsToDetails$errorsList$1 w = new DebugViewModelProviderKt$errorsToDetails$errorsList$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (!(th instanceof ParsingException)) {
            return " - ".concat(c.b(th));
        }
        return " - " + ((ParsingException) th).getReason() + Extension.COLON_SPACE + c.b(th);
    }
}
