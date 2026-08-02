package com.yandex.go.favorites.router;

import com.yandex.go.address.models.FavoriteAddressDatumType;
import defpackage.edp;
import defpackage.h55;
import defpackage.ny61;
import defpackage.tdp;
import defpackage.tje;
import defpackage.x4;
import defpackage.yvf0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.favorites.edit.arguments.NewFavorite;

/* loaded from: classes12.dex */
public final class a extends h55 {
    public final x4 D;
    public final yvf0 E;
    public final ru.yandex.taxi.favorites.address.api.experiment.a F;

    public a(x4 x4Var, yvf0 yvf0Var, ru.yandex.taxi.favorites.address.api.experiment.a aVar) {
        super(null);
        this.D = x4Var;
        this.E = yvf0Var;
        this.F = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, edp edpVar, ContinuationImpl continuationImpl) {
        FavoriteAddressLaunchRouter$isNewUiEnabled$1 favoriteAddressLaunchRouter$isNewUiEnabled$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof FavoriteAddressLaunchRouter$isNewUiEnabled$1) {
            favoriteAddressLaunchRouter$isNewUiEnabled$1 = (FavoriteAddressLaunchRouter$isNewUiEnabled$1) continuationImpl;
            int i2 = favoriteAddressLaunchRouter$isNewUiEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoriteAddressLaunchRouter$isNewUiEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = favoriteAddressLaunchRouter$isNewUiEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoriteAddressLaunchRouter$isNewUiEnabled$1.label;
                if (i != 0) {
                    b.b(obj);
                    int i3 = (edpVar.a.getAddress().getDatumType() == FavoriteAddressDatumType.GEO_POINT && (edpVar.a instanceof NewFavorite)) ? 1 : 0;
                    ru.yandex.taxi.favorites.address.api.experiment.a aVar2 = aVar.F;
                    if (i3 != 0) {
                        favoriteAddressLaunchRouter$isNewUiEnabled$1.L$0 = null;
                        favoriteAddressLaunchRouter$isNewUiEnabled$1.L$1 = null;
                        favoriteAddressLaunchRouter$isNewUiEnabled$1.I$0 = i3;
                        favoriteAddressLaunchRouter$isNewUiEnabled$1.label = 1;
                        obj = aVar2.a.b(favoriteAddressLaunchRouter$isNewUiEnabled$1);
                    } else {
                        favoriteAddressLaunchRouter$isNewUiEnabled$1.L$0 = null;
                        favoriteAddressLaunchRouter$isNewUiEnabled$1.L$1 = null;
                        favoriteAddressLaunchRouter$isNewUiEnabled$1.I$0 = i3;
                        favoriteAddressLaunchRouter$isNewUiEnabled$1.label = 2;
                        Object d = aVar2.d(favoriteAddressLaunchRouter$isNewUiEnabled$1);
                        if (d != coroutineSingletons) {
                            return d;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return obj;
                }
                b.b(obj);
                return Boolean.valueOf(((tdp) obj).b);
            }
        }
        favoriteAddressLaunchRouter$isNewUiEnabled$1 = new FavoriteAddressLaunchRouter$isNewUiEnabled$1(aVar, continuationImpl);
        Object obj2 = favoriteAddressLaunchRouter$isNewUiEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoriteAddressLaunchRouter$isNewUiEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((tdp) obj2).b);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new FavoriteAddressLaunchRouter$onLaunch$1(this, (edp) obj, null), 3);
    }
}
