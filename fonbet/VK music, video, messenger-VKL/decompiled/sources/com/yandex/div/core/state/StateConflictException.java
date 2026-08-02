package com.yandex.div.core.state;

import xsna.zcl;

/* compiled from: DivPathUtils.kt */
/* loaded from: classes7.dex */
public final class StateConflictException extends Exception {
    public StateConflictException(String str, Throwable th) {
        super(str, th);
    }

    public /* synthetic */ StateConflictException(String str, Throwable th, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
