package com.yandex.go.places.common.flex.actions.deeplink;

import android.content.Context;
import com.yandex.go.flex.common.api.actions.DeeplinkNavigationAction;
import defpackage.dw;
import defpackage.f3h;
import defpackage.kr;
import defpackage.n3h;
import defpackage.n6u;
import defpackage.tje;
import defpackage.tse;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes13.dex */
public final class a implements dw {
    public final Context a;
    public final tse b;
    public final n3h c;
    public final DeeplinkSource w;
    public final f3h x;

    public a(Context context, tse tseVar, n3h n3hVar, DeeplinkSource deeplinkSource, f3h f3hVar) {
        this.a = context;
        this.b = tseVar;
        this.c = n3hVar;
        this.w = deeplinkSource;
        this.x = f3hVar;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        tje.N(this.b, null, null, new DeeplinkPlacesNavigationActionHandler$handle$1((DeeplinkNavigationAction) krVar, this, null), 3);
    }
}
