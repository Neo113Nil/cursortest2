package com.yandex.go.feed_video.actions;

import defpackage.mu;
import defpackage.nu;
import defpackage.qoi0;
import defpackage.tty;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class e implements nu {
    public final tty a;

    public e(tty ttyVar) {
        this.a = ttyVar;
    }

    @Override // defpackage.nu
    public final mu create() {
        return new mu("ListVideoPlayerUpdateItemsAction", qoi0.a(ListVideoPlayerUpdateItemsAction.class), new ListVideoPlayerUpdateItemsDescriptorFactory$create$1(0, ListVideoPlayerUpdateItemsAction.Companion, d.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new ListVideoPlayerUpdateItemsDescriptorFactory$create$2(this, e.class, "handler", "getHandler()Lcom/yandex/go/feed_video/actions/ListVideoPlayerUpdateItemsActionHandler;", 0)), EmptyList.a, false);
    }
}
