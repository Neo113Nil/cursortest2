package com.yandex.go.address.address_map_picker.ui;

import androidx.compose.foundation.gestures.c;
import androidx.compose.runtime.f;
import defpackage.ck11;
import defpackage.mvg;
import defpackage.n6y;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.s6y;
import defpackage.sb2;
import defpackage.t6y;
import defpackage.tig0;
import defpackage.tse;
import defpackage.vs9;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.ui.DrumsModalViewKt$DrumsModalView$2$1$1", f = "DrumsModalView.kt", l = {128, HProv.PP_ENUM_CONTAINER_EXTENSION, HProv.PP_CONTAINER_DEFAULT}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DrumsModalViewKt$DrumsModalView$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ androidx.compose.foundation.lazy.b $listState;
    final /* synthetic */ int $selectedIndex;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrumsModalViewKt$DrumsModalView$2$1$1(int i, androidx.compose.foundation.lazy.b bVar, Continuation continuation) {
        super(2, continuation);
        this.$selectedIndex = i;
        this.$listState = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DrumsModalViewKt$DrumsModalView$2$1$1(this.$selectedIndex, this.$listState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DrumsModalViewKt$DrumsModalView$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0047, code lost:
    
        if (r11 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.$selectedIndex >= 0) {
                rol0 o = f.o(new vs9(this.$listState, 3));
                DrumsModalViewKt$DrumsModalView$2$1$1$layoutInfo$2 drumsModalViewKt$DrumsModalView$2$1$1$layoutInfo$2 = new DrumsModalViewKt$DrumsModalView$2$1$1$layoutInfo$2(2, null);
                this.label = 1;
                obj = e.x(o, drumsModalViewKt$DrumsModalView$2$1$1$layoutInfo$2, this);
            }
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        s6y s6yVar = (s6y) obj;
        int i2 = s6yVar.m - s6yVar.l;
        List list = s6yVar.k;
        int i3 = this.$selectedIndex;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((t6y) ((n6y) obj2)).a == i3) {
                break;
            }
        }
        n6y n6yVar = (n6y) obj2;
        if (n6yVar != null) {
            t6y t6yVar = (t6y) n6yVar;
            int i4 = (t6yVar.p / 2) + (t6yVar.o - (i2 / 2));
            ck11 K = sb2.K(600, 0, null, 6);
            this.L$0 = null;
            this.L$1 = null;
            this.I$0 = i2;
            this.I$1 = i4;
            this.label = 2;
            return c.g(this.$listState, (float) i4, K, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        androidx.compose.foundation.lazy.b bVar = this.$listState;
        int i5 = this.$selectedIndex;
        this.L$0 = null;
        this.L$1 = null;
        this.I$0 = i2;
        this.label = 3;
        tig0 tig0Var = androidx.compose.foundation.lazy.b.y;
        if (bVar.f(i5, 0, this) == coroutineSingletons) {
        }
    }
}
