package com.yandex.div.evaluable;

import xsna.zcl;

/* compiled from: EvaluableException.kt */
/* loaded from: classes7.dex */
public final class TokenizingException extends EvaluableException {
    public /* synthetic */ TokenizingException(String str, Exception exc, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : exc);
    }

    public TokenizingException(String str, Exception exc) {
        super(str, exc);
    }
}
