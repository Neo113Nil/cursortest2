package com.yandex.div.core.state;

import xsna.zcl;

/* compiled from: DivStatePath.kt */
/* loaded from: classes7.dex */
public final class PathFormatException extends Exception {
    public PathFormatException(String str, Throwable th) {
        super(str, th);
    }

    public /* synthetic */ PathFormatException(String str, Throwable th, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
