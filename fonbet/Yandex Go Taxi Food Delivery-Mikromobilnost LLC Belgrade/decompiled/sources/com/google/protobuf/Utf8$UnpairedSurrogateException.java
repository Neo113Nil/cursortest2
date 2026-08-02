package com.google.protobuf;

import defpackage.oyr;

/* loaded from: classes11.dex */
class Utf8$UnpairedSurrogateException extends IllegalArgumentException {
    public Utf8$UnpairedSurrogateException(int i, int i2) {
        super(oyr.h(i, i2, "Unpaired surrogate at index ", " of "));
    }
}
