package com.yandex.go.scooters.discovery;

import android.graphics.Bitmap;
import defpackage.g16;
import defpackage.m7x0;
import defpackage.min0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes13.dex */
public final class i implements vpr {
    public final /* synthetic */ j a;
    public final /* synthetic */ String b;

    public i(j jVar, String str) {
        this.a = jVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(ThemeType themeType, Continuation continuation) {
        ScootersDiscoveryPresenter$listenLogotype$1$1$emit$1 scootersDiscoveryPresenter$listenLogotype$1$1$emit$1;
        int i;
        Bitmap bitmap;
        if (continuation instanceof ScootersDiscoveryPresenter$listenLogotype$1$1$emit$1) {
            scootersDiscoveryPresenter$listenLogotype$1$1$emit$1 = (ScootersDiscoveryPresenter$listenLogotype$1$1$emit$1) continuation;
            int i2 = scootersDiscoveryPresenter$listenLogotype$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDiscoveryPresenter$listenLogotype$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDiscoveryPresenter$listenLogotype$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDiscoveryPresenter$listenLogotype$1$1$emit$1.label;
                j jVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g16 b = jVar.x.b().b(((m7x0) jVar.y).a(this.b));
                    scootersDiscoveryPresenter$listenLogotype$1$1$emit$1.L$0 = null;
                    scootersDiscoveryPresenter$listenLogotype$1$1$emit$1.L$1 = null;
                    scootersDiscoveryPresenter$listenLogotype$1$1$emit$1.label = 1;
                    obj = ru.yandex.taxi.utils.a.b(b, scootersDiscoveryPresenter$listenLogotype$1$1$emit$1);
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
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    ((min0) jVar.Dg()).Y1(bitmap);
                }
                return zy11.a;
            }
        }
        scootersDiscoveryPresenter$listenLogotype$1$1$emit$1 = new ScootersDiscoveryPresenter$listenLogotype$1$1$emit$1(this, continuation);
        Object obj2 = scootersDiscoveryPresenter$listenLogotype$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDiscoveryPresenter$listenLogotype$1$1$emit$1.label;
        j jVar2 = this.a;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap != null) {
        }
        return zy11.a;
    }
}
