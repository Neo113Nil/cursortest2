package com.yandex.go.agreement.photoupload;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.zone.repository.o;
import defpackage.tse;
import defpackage.vw60;

/* loaded from: classes.dex */
public final class c implements vw60 {
    public final Lifecycle a;
    public final tse b;
    public final o c;
    public final a d;

    public c(Lifecycle lifecycle, tse tseVar, o oVar, a aVar) {
        this.a = lifecycle;
        this.b = tseVar;
        this.c = oVar;
        this.d = aVar;
    }

    @Override // defpackage.vw60
    public final void c() {
        com.yandex.go.coroutines.b.g(this.b, null, null, new PhotoUploadEulaZoneReplayListener$onActivityCreate$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "photo-upload-eula-zone-replay";
    }
}
