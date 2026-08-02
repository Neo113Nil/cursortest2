package com.google.android.gms.common.internal;

import android.content.Intent;
import defpackage.dey;

/* loaded from: classes11.dex */
final class zaf extends zag {
    final /* synthetic */ Intent zaa;
    final /* synthetic */ dey zab;

    public zaf(Intent intent, dey deyVar, int i) {
        this.zaa = intent;
        this.zab = deyVar;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            this.zab.startActivityForResult(intent, 2);
        }
    }
}
