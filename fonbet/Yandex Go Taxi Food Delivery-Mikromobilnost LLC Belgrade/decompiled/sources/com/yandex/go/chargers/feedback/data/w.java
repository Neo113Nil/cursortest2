package com.yandex.go.chargers.feedback.data;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.nba;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class w extends x {
    public static final w INSTANCE = new w();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nba(1));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
