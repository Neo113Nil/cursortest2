package com.yandex.go.preorder.source.altpins;

import com.yandex.go.preorder.source.altpins.Alternatives;
import defpackage.gsq0;
import defpackage.hy1;
import defpackage.i3y;
import defpackage.ro1;
import defpackage.yjd;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
/* loaded from: classes13.dex */
public abstract class l0 {
    public static final hy1 Companion = new hy1();
    public static final i3y[] b;
    public static final i3y c;
    public final Alternatives.PinIconAnnotationTypes a;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        b = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new ro1(21))};
        c = kotlin.a.b(lazyThreadSafetyMode, new ro1(22));
    }

    public /* synthetic */ l0(int i, Alternatives.PinIconAnnotationTypes pinIconAnnotationTypes) {
        if ((i & 1) == 0) {
            this.a = Alternatives.PinIconAnnotationTypes.UNKNOWN;
        } else {
            this.a = pinIconAnnotationTypes;
        }
    }

    public static final /* synthetic */ void b(l0 l0Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (!yjdVar.F() && l0Var.a() == Alternatives.PinIconAnnotationTypes.UNKNOWN) {
            return;
        }
        yjdVar.e(serialDescriptor, 0, (KSerializer) b[0].getValue(), l0Var.a());
    }

    public Alternatives.PinIconAnnotationTypes a() {
        return this.a;
    }

    public l0() {
        this.a = Alternatives.PinIconAnnotationTypes.UNKNOWN;
    }
}
