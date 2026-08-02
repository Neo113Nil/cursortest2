package com.yandex.passport.internal.methods;

import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.passport.internal.entities.TrackId;
import defpackage.oo31;
import defpackage.xfo;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class d0 extends x2 {
    public final h3 b;
    public final List c;
    public final o d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Bundle bundle) {
        super(MethodRef.AuthorizeByTrackId);
        Parcelable e = oo31.e(bundle, com.yandex.passport.internal.util.p.class, "track_id");
        if (e == null) {
            xfo.g("can't get required parcelable track_id");
            throw null;
        }
        h3 h3Var = new h3((TrackId) e);
        this.b = h3Var;
        this.c = Collections.singletonList(h3Var);
        this.d = o.y;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final List b() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final f c() {
        return this.d;
    }
}
