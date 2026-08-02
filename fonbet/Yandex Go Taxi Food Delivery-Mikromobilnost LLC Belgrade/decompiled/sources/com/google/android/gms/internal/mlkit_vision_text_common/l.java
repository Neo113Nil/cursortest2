package com.google.android.gms.internal.mlkit_vision_text_common;

import defpackage.usb1;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes11.dex */
public abstract class l {
    public static AbstractList a(List list, usb1 usb1Var) {
        return list instanceof RandomAccess ? new zzbr(list, usb1Var) : new zzbt(list, usb1Var);
    }
}
