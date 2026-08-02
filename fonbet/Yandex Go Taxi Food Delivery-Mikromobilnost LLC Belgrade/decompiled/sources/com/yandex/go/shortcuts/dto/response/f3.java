package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.z121;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class f3 extends w2 {
    public static final f3 INSTANCE = new f3();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z121(1));

    @Override // com.yandex.go.shortcuts.dto.response.w2
    public final j0 a() {
        return c3.INSTANCE;
    }

    @Override // com.yandex.go.shortcuts.dto.response.w2
    public final int b() {
        return 0;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
