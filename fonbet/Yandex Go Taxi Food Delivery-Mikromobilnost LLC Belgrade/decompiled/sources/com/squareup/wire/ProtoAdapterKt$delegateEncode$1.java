package com.squareup.wire;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
/* loaded from: classes11.dex */
public final class ProtoAdapterKt$delegateEncode$1 implements tls {
    final /* synthetic */ ProtoAdapter<E> $this_delegateEncode;
    final /* synthetic */ E $value;

    public ProtoAdapterKt$delegateEncode$1(ProtoAdapter<E> protoAdapter, E e) {
        this.$this_delegateEncode = protoAdapter;
        this.$value = e;
    }

    @Override // defpackage.tls
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ProtoWriter) obj);
        return zy11.a;
    }

    public final void invoke(ProtoWriter protoWriter) {
        this.$this_delegateEncode.encode(protoWriter, (ProtoWriter) this.$value);
    }
}
