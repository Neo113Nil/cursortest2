package com.yandex.fintechsdk.adapters.flex.sdk.impl.action;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.kr;
import defpackage.oke;
import defpackage.psq0;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.rk50;
import defpackage.vm50;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@gsq0
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/action/NestedActionImpl;", "Lvm50;", "Lkr;", "nestedAction", "<init>", "(Lkr;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(ILkr;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$impl_18_1_0_release", "(Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/action/NestedActionImpl;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lkr;", "getNestedAction", "()Lkr;", "Companion", "$serializer", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NestedActionImpl implements vm50 {
    private final kr nestedAction;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final i3y[] $childSerializers = {a.b(LazyThreadSafetyMode.PUBLICATION, new rk50(7))};

    public /* synthetic */ NestedActionImpl(int i, kr krVar, psq0 psq0Var) {
        if (1 == (i & 1)) {
            this.nestedAction = krVar;
        } else {
            qje.Z(i, 1, NestedActionImpl$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
    }

    public final kr getNestedAction() {
        return this.nestedAction;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/action/NestedActionImpl$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/action/NestedActionImpl;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer serializer() {
            return NestedActionImpl$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public NestedActionImpl(kr krVar) {
        this.nestedAction = krVar;
    }
}
