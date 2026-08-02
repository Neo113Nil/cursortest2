package com.yandex.go.ultima_mode.ui.header.state;

import android.graphics.drawable.Drawable;
import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import defpackage.bvf0;
import defpackage.ief;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.xdf;
import defpackage.yu11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class a {
    public final xdf a;
    public final e b;
    public final yu11 c;

    public a(xdf xdfVar, e eVar, yu11 yu11Var) {
        this.a = xdfVar;
        this.b = eVar;
        this.c = yu11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, ContinuationImpl continuationImpl) {
        UltimaModeHeaderUiStateMapper$loadIconIfValid$1 ultimaModeHeaderUiStateMapper$loadIconIfValid$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof UltimaModeHeaderUiStateMapper$loadIconIfValid$1) {
            ultimaModeHeaderUiStateMapper$loadIconIfValid$1 = (UltimaModeHeaderUiStateMapper$loadIconIfValid$1) continuationImpl;
            int i2 = ultimaModeHeaderUiStateMapper$loadIconIfValid$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ultimaModeHeaderUiStateMapper$loadIconIfValid$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ultimaModeHeaderUiStateMapper$loadIconIfValid$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ultimaModeHeaderUiStateMapper$loadIconIfValid$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (str == null) {
                        return null;
                    }
                    e eVar = aVar.b;
                    ultimaModeHeaderUiStateMapper$loadIconIfValid$1.L$0 = str;
                    ultimaModeHeaderUiStateMapper$loadIconIfValid$1.label = 1;
                    obj = e.f(eVar, str, null, ultimaModeHeaderUiStateMapper$loadIconIfValid$1, 6);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) ultimaModeHeaderUiStateMapper$loadIconIfValid$1.L$0;
                    b.b(obj);
                }
                return pkf.g((Drawable) obj, str, null);
            }
        }
        ultimaModeHeaderUiStateMapper$loadIconIfValid$1 = new UltimaModeHeaderUiStateMapper$loadIconIfValid$1(aVar, continuationImpl);
        Object obj2 = ultimaModeHeaderUiStateMapper$loadIconIfValid$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ultimaModeHeaderUiStateMapper$loadIconIfValid$1.label;
        if (i != 0) {
        }
        return pkf.g((Drawable) obj2, str, null);
    }

    public final Object b(UltimaModeResponse.Title title, UltimaModeResponse.Subtitle subtitle, ief iefVar, SuspendLambda suspendLambda) {
        return bvf0.n(new UltimaModeHeaderUiStateMapper$map$2(title, subtitle, this, iefVar, null), suspendLambda);
    }
}
