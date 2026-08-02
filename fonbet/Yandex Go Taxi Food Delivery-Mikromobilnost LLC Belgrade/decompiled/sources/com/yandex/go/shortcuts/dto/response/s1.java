package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.v8f0;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class s1 extends t1 {
    public static final s1 INSTANCE = new s1();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v8f0(8));

    @Override // com.yandex.go.shortcuts.dto.response.t1
    public final Mode a() {
        return Mode.UNKNOWN;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
