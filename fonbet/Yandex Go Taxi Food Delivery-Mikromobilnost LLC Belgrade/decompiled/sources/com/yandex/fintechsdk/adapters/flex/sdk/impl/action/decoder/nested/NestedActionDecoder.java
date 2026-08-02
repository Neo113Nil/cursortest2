package com.yandex.fintechsdk.adapters.flex.sdk.impl.action.decoder.nested;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.action.NestedActionImpl;
import defpackage.d6z;
import defpackage.h2f0;
import defpackage.kr;
import defpackage.vm50;
import defpackage.zw;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/action/decoder/nested/NestedActionDecoder;", "Lkotlinx/serialization/KSerializer;", "Lvm50;", "Lzw;", "actionParser", "<init>", "(Lzw;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lvm50;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lvm50;", "Lzw;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NestedActionDecoder implements KSerializer {
    private final zw actionParser;
    private final SerialDescriptor descriptor = d6z.a("NestedActionDescriptor", h2f0.o);

    public NestedActionDecoder(zw zwVar) {
        this.actionParser = zwVar;
    }

    @Override // defpackage.myi
    public vm50 deserialize(Decoder decoder) {
        return new NestedActionImpl((kr) this.actionParser.deserialize(decoder));
    }

    @Override // defpackage.myi
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, vm50 value) {
        this.actionParser.serialize(encoder, ((NestedActionImpl) value).getNestedAction());
        throw null;
    }
}
