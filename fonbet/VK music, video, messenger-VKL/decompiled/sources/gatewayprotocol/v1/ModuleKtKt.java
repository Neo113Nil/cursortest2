package gatewayprotocol.v1;

import gatewayprotocol.v1.ModuleKt;
import gatewayprotocol.v1.ModuleOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ModuleKt.kt */
/* loaded from: classes8.dex */
public final class ModuleKtKt {
    /* renamed from: -initializemodule, reason: not valid java name */
    public static final ModuleOuterClass.Module m250initializemodule(izs<? super ModuleKt.Dsl, s3q0> izsVar) {
        ModuleKt.Dsl _create = ModuleKt.Dsl.Companion._create(ModuleOuterClass.Module.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final ModuleOuterClass.Module copy(ModuleOuterClass.Module module, izs<? super ModuleKt.Dsl, s3q0> izsVar) {
        ModuleKt.Dsl _create = ModuleKt.Dsl.Companion._create(module.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}
