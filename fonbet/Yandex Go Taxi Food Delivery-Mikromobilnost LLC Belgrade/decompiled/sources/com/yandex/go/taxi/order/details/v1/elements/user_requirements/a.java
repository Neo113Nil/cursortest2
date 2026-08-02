package com.yandex.go.taxi.order.details.v1.elements.user_requirements;

import com.yandex.go.taxi.order.details.v1.ui.e;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$AccessoryResponse$AttributedText;
import com.yandex.go.taxi.order.models.api.response.i1;
import defpackage.avj0;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.zuj0;
import java.util.Collections;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class a {
    public final zuj0 a;
    public final ru.yandex.taxi.widget.c b;

    public a(zuj0 zuj0Var, ru.yandex.taxi.widget.c cVar) {
        this.a = zuj0Var;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(i1 i1Var, ContinuationImpl continuationImpl) {
        AccessoryMapper$map$1 accessoryMapper$map$1;
        int i;
        if (continuationImpl instanceof AccessoryMapper$map$1) {
            accessoryMapper$map$1 = (AccessoryMapper$map$1) continuationImpl;
            int i2 = accessoryMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accessoryMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = accessoryMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accessoryMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(i1Var instanceof OrderDetailsCardResponse$AccessoryResponse$AttributedText)) {
                        return e.b;
                    }
                    FormattedText formattedText = ((OrderDetailsCardResponse$AccessoryResponse$AttributedText) i1Var).a;
                    accessoryMapper$map$1.L$0 = null;
                    accessoryMapper$map$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(this.b, formattedText, null, accessoryMapper$map$1, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new com.yandex.go.taxi.order.details.v1.ui.b((CharSequence) obj, Collections.singletonList(new Integer(((avj0) this.a).c(mrg0.go_design_m_space))));
            }
        }
        accessoryMapper$map$1 = new AccessoryMapper$map$1(this, continuationImpl);
        Object obj2 = accessoryMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accessoryMapper$map$1.label;
        if (i != 0) {
        }
        return new com.yandex.go.taxi.order.details.v1.ui.b((CharSequence) obj2, Collections.singletonList(new Integer(((avj0) this.a).c(mrg0.go_design_m_space))));
    }
}
