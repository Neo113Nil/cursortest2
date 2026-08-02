package com.yandex.messaging.ui.timeline;

import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class TimelineToolbarStatusUpdater$onResume$4 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((g) this.receiver).F.setHasMeeting(((Boolean) obj).booleanValue());
        return zy11.a;
    }
}
