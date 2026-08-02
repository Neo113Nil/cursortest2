package com.yandex.go.flex.main_screen.shared_data;

import defpackage.bnr0;
import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/shared_data/SuperAppMainScreenFeatures;", "Lbnr0;", "Companion", "com/yandex/go/flex/main_screen/shared_data/e", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuperAppMainScreenFeatures implements bnr0 {
    public static final e Companion = new e();
    public final boolean a;

    public /* synthetic */ SuperAppMainScreenFeatures(int i, boolean z) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
    }

    @Override // defpackage.bnr0
    public final bnr0 a(bnr0 bnr0Var) {
        SuperAppMainScreenFeatures superAppMainScreenFeatures = bnr0Var instanceof SuperAppMainScreenFeatures ? (SuperAppMainScreenFeatures) bnr0Var : null;
        return superAppMainScreenFeatures != null ? superAppMainScreenFeatures : this;
    }

    public SuperAppMainScreenFeatures(boolean z) {
        this.a = z;
    }

    public SuperAppMainScreenFeatures() {
        this(false);
    }
}
