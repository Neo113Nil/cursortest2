package com.yandex.go.feed_video.actions;

import defpackage.gw;
import defpackage.mu;
import defpackage.nu;
import defpackage.qoi0;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class b implements nu {
    public final gw a;

    public b(gw gwVar) {
        this.a = gwVar;
    }

    @Override // defpackage.nu
    public final mu create() {
        return new mu("ListVideoPlayerBugReportAction", qoi0.a(ListVideoPlayerBugReportAction.class), new ListVideoPlayerBugReportActionDescriptorFactory$create$1(0, ListVideoPlayerBugReportAction.Companion, a.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new ListVideoPlayerBugReportActionDescriptorFactory$create$2(this, b.class, "handler", "getHandler()Lcom/yandex/go/feed_video/actions/ListVideoPlayerBugReportActionHandler;", 0)), EmptyList.a, false);
    }
}
