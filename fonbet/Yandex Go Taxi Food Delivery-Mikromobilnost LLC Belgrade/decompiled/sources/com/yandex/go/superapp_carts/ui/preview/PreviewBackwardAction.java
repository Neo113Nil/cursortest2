package com.yandex.go.superapp_carts.ui.preview;

import defpackage.gsq0;
import defpackage.kr;
import defpackage.qje;
import defpackage.s9i0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp_carts/ui/preview/PreviewBackwardAction;", "Lkr;", "Companion", "$serializer", "com/yandex/go/superapp_carts/ui/preview/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PreviewBackwardAction extends kr {
    public static final a Companion = new a();
    public final Boolean a;
    public final s9i0 b;

    public PreviewBackwardAction(int i, Boolean bool, s9i0 s9i0Var) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, PreviewBackwardAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = bool;
        if ((i & 2) != 0) {
            this.b = s9i0Var;
        } else {
            s9i0.Companion.getClass();
            this.b = s9i0.b;
        }
    }
}
