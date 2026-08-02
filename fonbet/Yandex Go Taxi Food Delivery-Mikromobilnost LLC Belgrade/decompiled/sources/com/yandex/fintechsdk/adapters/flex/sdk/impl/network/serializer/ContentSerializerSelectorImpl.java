package com.yandex.fintechsdk.adapters.flex.sdk.impl.network.serializer;

import defpackage.jks0;
import defpackage.phe;
import defpackage.qtl;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/network/serializer/ContentSerializerSelectorImpl;", "Lphe;", "<init>", "()V", "", "typeName", "Lkotlinx/serialization/KSerializer;", "Lsee;", "select", "(Ljava/lang/String;)Lkotlinx/serialization/KSerializer;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ContentSerializerSelectorImpl implements phe {
    @Override // defpackage.dtq0
    public KSerializer select(String typeName) {
        if (typeName.equals("divkit")) {
            return qtl.a;
        }
        if (typeName.equals("skeleton")) {
            return jks0.a;
        }
        return null;
    }
}
