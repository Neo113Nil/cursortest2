package com.yandex.div.evaluable.function;

import defpackage.tls;
import defpackage.w610;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw610;", "it", "", "invoke", "(Lw610;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes11.dex */
final class EncodeRegex$evaluate$1 extends Lambda implements tls {
    public static final EncodeRegex$evaluate$1 w = new EncodeRegex$evaluate$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return "\\".concat(((w610) obj).a.group());
    }
}
