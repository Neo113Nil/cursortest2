package com.yandex.go.places.models.data.entities.network.map;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qxz;
import defpackage.zzs;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class d extends e {
    public static final d INSTANCE = new d();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qxz(20));

    @Override // com.yandex.go.places.models.data.entities.network.map.e
    /* renamed from: a */
    public final zzs getB() {
        return zzs.f;
    }

    @Override // com.yandex.go.places.models.data.entities.network.map.e
    /* renamed from: b */
    public final String getA() {
        return "";
    }

    @Override // com.yandex.go.places.models.data.entities.network.map.e
    /* renamed from: c */
    public final List getD() {
        return EmptyList.a;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
