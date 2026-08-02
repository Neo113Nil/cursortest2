package com.yandex.go.taxi.order.models.api.response;

import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class x3 extends xqt {
    public static final x3 e = new x3();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Single.Companion.serializer(), qoi0.a(RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Single.class));
    }

    @Override // defpackage.h9
    public final String e() {
        return "announcement_type";
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("single", RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Single.Companion.serializer(), qoi0.a(RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Single.class)), new f9("interval", RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Interval.Companion.serializer(), qoi0.a(RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Interval.class)));
    }
}
