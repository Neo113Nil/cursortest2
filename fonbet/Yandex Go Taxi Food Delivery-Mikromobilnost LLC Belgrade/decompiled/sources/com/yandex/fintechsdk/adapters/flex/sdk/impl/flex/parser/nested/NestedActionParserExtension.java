package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.parser.nested;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.action.decoder.nested.NestedActionDecoder;
import defpackage.qoi0;
import defpackage.r1m;
import defpackage.vm50;
import defpackage.zw;
import kotlin.Metadata;
import kotlinx.serialization.modules.a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/parser/nested/NestedActionParserExtension;", "Lr1m;", "Lzw;", "actionParser", "<init>", "(Lzw;)V", "Lkotlinx/serialization/modules/a;", "builder", "Lzy11;", "extendDocumentParser", "(Lkotlinx/serialization/modules/a;)V", "Lzw;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NestedActionParserExtension implements r1m {
    private final zw actionParser;

    public NestedActionParserExtension(zw zwVar) {
        this.actionParser = zwVar;
    }

    @Override // defpackage.r1m
    public void extendDocumentParser(a builder) {
        builder.g(qoi0.a(vm50.class), new NestedActionDecoder(this.actionParser));
    }
}
