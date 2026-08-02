package com.yandex.go.flex.main_screen.interactors;

import com.yandex.go.flex.main_screen.data.sticky.SectionUpdaterRepository;
import defpackage.v4r0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class MainScreenFlexLoadInteractor$listenUpdateLabels$3 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Set set = (Set) obj;
        r0 r0Var = ((SectionUpdaterRepository) this.receiver).a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, v4r0.g((Set) value, set)));
        return zy11.a;
    }
}
