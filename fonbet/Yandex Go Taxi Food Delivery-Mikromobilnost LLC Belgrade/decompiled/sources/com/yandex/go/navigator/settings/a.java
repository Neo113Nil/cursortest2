package com.yandex.go.navigator.settings;

import android.graphics.drawable.Drawable;
import defpackage.aa5;
import defpackage.ebr0;
import defpackage.ny61;
import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ aa5 a;
    public final /* synthetic */ ebr0 b;

    public a(aa5 aa5Var, ebr0 ebr0Var) {
        this.a = aa5Var;
        this.b = ebr0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (r10 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BaseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1 baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1;
        int i;
        Drawable drawable;
        if (continuation instanceof BaseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1) {
            baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1 = (BaseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1) continuation;
            int i2 = baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1.label;
                aa5 aa5Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ru.yandex.taxi.design.utils.b bVar = aa5Var.y;
                    baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$0 = null;
                    baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$1 = null;
                    baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$2 = null;
                    baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1.label = 1;
                    obj2 = bVar.g(24, baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        drawable = (Drawable) baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$3;
                        kotlin.b.b(obj2);
                        this.b.q(drawable, (Drawable) obj2);
                        return zy11.a;
                    }
                    kotlin.b.b(obj2);
                }
                drawable = (Drawable) obj2;
                ru.yandex.taxi.design.utils.b bVar2 = aa5Var.y;
                baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$0 = null;
                baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$1 = null;
                baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$2 = null;
                baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$3 = drawable;
                baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1.label = 2;
                obj2 = bVar2.a(tje.u(24, bVar2.a), false, baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1);
            }
        }
        baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1 = new BaseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1(this, continuation);
        Object obj22 = baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1.label;
        aa5 aa5Var2 = this.a;
        if (i != 0) {
        }
        drawable = (Drawable) obj22;
        ru.yandex.taxi.design.utils.b bVar22 = aa5Var2.y;
        baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$0 = null;
        baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$1 = null;
        baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$2 = null;
        baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1.L$3 = drawable;
        baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1.label = 2;
        obj22 = bVar22.a(tje.u(24, bVar22.a), false, baseSettingsPresenter$attachView$$inlined$safeCollectIn$1$2$1);
    }
}
