package com.ybsdk.feature.qr.internal.screens.reader.presentation;

import defpackage.ds31;
import defpackage.hcg0;
import defpackage.icg0;
import defpackage.jcg0;
import defpackage.jl40;
import defpackage.kcg0;
import defpackage.lcg0;
import defpackage.mcg0;
import defpackage.pz40;
import defpackage.tje;
import defpackage.tls;
import defpackage.uc5;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class QrReaderFragment$consumeSideEffect$3 extends FunctionReferenceImpl implements tls {
    public QrReaderFragment$consumeSideEffect$3(uc5 uc5Var) {
        super(1, uc5Var, b.class, "recognizeFileQrWithResolvingRules", "recognizeFileQrWithResolvingRules(Ljava/lang/String;)V", 0);
    }

    public final void i(String str) {
        r0 r0Var;
        Object value;
        b bVar = (b) this.receiver;
        lcg0 lcg0Var = ((mcg0) bVar.X()).f;
        if (lcg0Var instanceof kcg0) {
            tje.N(ds31.a(bVar), null, null, new QrReaderViewModel$recognizeQr$1(bVar, str, ((kcg0) lcg0Var).a, null), 3);
            return;
        }
        if (lcg0Var instanceof hcg0) {
            bVar.e0();
            return;
        }
        if (lcg0Var instanceof jcg0) {
            if (bVar.N != null) {
                bVar.t0();
            }
        } else {
            if (!jl40.l(lcg0Var, icg0.a)) {
                w511.b();
                return;
            }
            bVar.t0();
            bVar.C.Y.a.a("qr.resolving_rules.loading", null);
            pz40 Y = bVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, mcg0.a((mcg0) value, false, false, 0, false, new jcg0(str), 31)));
        }
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((String) obj);
        return zy11.a;
    }
}
