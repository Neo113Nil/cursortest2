package com.yandex.go.user_profile.ui.am;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ly1;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes14.dex */
public final class d extends g {
    public static final d INSTANCE = new d();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ly1(10));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof d);
    }

    public final int hashCode() {
        return 1456429727;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "ToggleUltimaMode";
    }
}
