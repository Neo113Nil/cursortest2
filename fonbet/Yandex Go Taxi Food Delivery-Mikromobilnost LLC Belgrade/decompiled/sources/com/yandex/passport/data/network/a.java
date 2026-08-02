package com.yandex.passport.data.network;

import com.yandex.passport.data.models.UserInfoData;
import defpackage.ncx;
import defpackage.ny61;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes8.dex */
public final class a implements KSerializer {
    public final SerialDescriptor a = UserInfoData.Companion.serializer().getDescriptor();
    public final com.yandex.passport.common.a b = new com.yandex.passport.common.a();

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        kotlinx.serialization.json.b t;
        ncx ncxVar = decoder instanceof ncx ? (ncx) decoder : null;
        if (ncxVar == null || (t = ncxVar.t()) == null) {
            ny61.r("Can be deserialized only by JSON");
            return null;
        }
        com.yandex.passport.data.models.t tVar = UserInfoData.Companion;
        String obj = t.toString();
        this.b.getClass();
        long a = com.yandex.passport.common.a.a();
        tVar.getClass();
        return com.yandex.passport.data.models.t.a(a, obj, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        UserInfoData.Companion.serializer().serialize(encoder, (UserInfoData) obj);
    }
}
