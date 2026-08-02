package com.yandex.go.feed_video.actions;

import defpackage.mu;
import defpackage.nu;
import defpackage.qoi0;
import defpackage.tty;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class f implements nu {
    public final tty a;

    public f(tty ttyVar) {
        this.a = ttyVar;
    }

    @Override // defpackage.nu
    public final mu create() {
        return new mu("ListVideoPlayerChangeVisibilityAction", qoi0.a(ListVideoPlayerChangeVisibilityAction.class), new ListVideoPlayerVisibilityChangeDescriptorFactory$create$1(0, ListVideoPlayerChangeVisibilityAction.Companion, c.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new ListVideoPlayerVisibilityChangeDescriptorFactory$create$2(this, f.class, "handler", "getHandler()Lcom/yandex/go/feed_video/actions/ListVideoPlayerVisibilityChangeActionHandler;", 0)), EmptyList.a, false);
    }
}
