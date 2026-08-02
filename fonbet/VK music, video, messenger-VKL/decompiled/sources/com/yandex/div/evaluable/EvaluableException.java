package com.yandex.div.evaluable;

import xsna.zcl;

/* compiled from: EvaluableException.kt */
/* loaded from: classes7.dex */
public class EvaluableException extends RuntimeException {
    public /* synthetic */ EvaluableException(String str, Exception exc, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : exc);
    }

    public EvaluableException(String str, Exception exc) {
        super(str, exc);
    }
}
