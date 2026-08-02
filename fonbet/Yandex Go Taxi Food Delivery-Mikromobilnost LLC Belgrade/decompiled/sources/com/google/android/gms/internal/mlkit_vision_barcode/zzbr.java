package com.google.android.gms.internal.mlkit_vision_barcode;

import defpackage.w511;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public abstract class zzbr extends f implements Serializable {
    public final transient Map c;

    public zzbr(Map map) {
        if (((zzci) map).isEmpty()) {
            this.c = map;
        } else {
            w511.q();
            throw null;
        }
    }
}
