package com.yandex.passport.internal.ui.sloth.webcard;

import android.os.Bundle;
import android.os.SystemClock;
import com.yandex.passport.api.exception.PassportChallengeRequiredException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.report.reporters.k1;
import com.yandex.passport.internal.report.sc;
import com.yandex.passport.internal.report.zd;
import com.yandex.passport.internal.usecase.h1;
import com.yandex.passport.internal.usecase.i1;
import com.yandex.passport.sloth.data.PicturePushState;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.ds31;
import defpackage.eci0;
import defpackage.ffx;
import defpackage.ny61;
import defpackage.tje;
import defpackage.w511;
import defpackage.yr31;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class d1 extends yr31 {
    public final zd A;
    public com.yandex.passport.sloth.c1 B;
    public SlothParams C;
    public final kotlinx.coroutines.flow.n0 D;
    public final eci0 E;
    public final kotlinx.coroutines.flow.n0 F;
    public final eci0 G;
    public final kotlinx.coroutines.flow.n0 H;
    public final eci0 I;
    public final kotlinx.coroutines.flow.n0 J;
    public final eci0 K;
    public final k0 b;
    public final a c;
    public final com.yandex.passport.internal.push.h w;
    public final com.yandex.passport.internal.sloth.performers.webcard.g x;
    public final k1 y;
    public final i1 z;

    public d1(k0 k0Var, a aVar, com.yandex.passport.internal.push.h hVar, com.yandex.passport.internal.sloth.performers.webcard.g gVar, k1 k1Var, i1 i1Var) {
        this.b = k0Var;
        this.c = aVar;
        this.w = hVar;
        this.x = gVar;
        this.y = k1Var;
        this.z = i1Var;
        zd zdVar = new zd();
        this.A = zdVar;
        kotlinx.coroutines.flow.n0 c = ffx.c(1, 0, null, 6);
        this.D = c;
        this.E = kotlinx.coroutines.flow.e.c(c);
        kotlinx.coroutines.flow.n0 c2 = ffx.c(1, 0, null, 6);
        this.F = c2;
        this.G = kotlinx.coroutines.flow.e.c(c2);
        kotlinx.coroutines.flow.n0 c3 = ffx.c(1, 0, null, 6);
        this.H = c3;
        this.I = kotlinx.coroutines.flow.e.c(c3);
        kotlinx.coroutines.flow.n0 c4 = ffx.c(1, 0, null, 6);
        this.J = c4;
        this.K = kotlinx.coroutines.flow.e.c(c4);
        zdVar.d();
        zdVar.a = SystemClock.elapsedRealtime();
        tje.N(ds31.a(this), new c1(this), null, new WebCardSlothViewModel$1(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object W(d1 d1Var, ContinuationImpl continuationImpl) {
        WebCardSlothViewModel$getSlothParams$1 webCardSlothViewModel$getSlothParams$1;
        int i;
        Object X;
        com.yandex.passport.sloth.data.u uVar;
        d1 d1Var2;
        PicturePushState.Picture picture;
        Throwable a;
        com.yandex.passport.sloth.data.u uVar2;
        com.yandex.passport.internal.push.h hVar = d1Var.w;
        k0 k0Var = d1Var.b;
        if (continuationImpl instanceof WebCardSlothViewModel$getSlothParams$1) {
            webCardSlothViewModel$getSlothParams$1 = (WebCardSlothViewModel$getSlothParams$1) continuationImpl;
            int i2 = webCardSlothViewModel$getSlothParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webCardSlothViewModel$getSlothParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webCardSlothViewModel$getSlothParams$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webCardSlothViewModel$getSlothParams$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(k0Var instanceof i0)) {
                        if (!(k0Var instanceof j0)) {
                            w511.b();
                            return null;
                        }
                        SlothParams slothParams = ((j0) k0Var).a;
                        if (slothParams.getVariant() instanceof com.yandex.passport.sloth.data.u) {
                            com.yandex.passport.sloth.data.u uVar3 = (com.yandex.passport.sloth.data.u) slothParams.getVariant();
                            hVar.d(uVar3.y);
                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "variant: " + uVar3, 8);
                            }
                            PicturePushState picturePushState = uVar3.b;
                            PicturePushState.Picture picture2 = picturePushState instanceof PicturePushState.Picture ? (PicturePushState.Picture) picturePushState : null;
                            if (picture2 != null) {
                                int selectedPicture = picture2.getSelectedPicture();
                                webCardSlothViewModel$getSlothParams$1.L$0 = d1Var;
                                webCardSlothViewModel$getSlothParams$1.L$1 = uVar3;
                                webCardSlothViewModel$getSlothParams$1.L$2 = picture2;
                                webCardSlothViewModel$getSlothParams$1.label = 2;
                                X = d1Var.X(uVar3, selectedPicture, webCardSlothViewModel$getSlothParams$1);
                                if (X != coroutineSingletons) {
                                    uVar = uVar3;
                                    d1Var2 = d1Var;
                                    picture = picture2;
                                }
                            }
                        }
                        return slothParams;
                    }
                    Bundle bundle = ((i0) k0Var).a;
                    webCardSlothViewModel$getSlothParams$1.label = 1;
                    Object h = hVar.h(bundle, webCardSlothViewModel$getSlothParams$1);
                    if (h != coroutineSingletons) {
                        return h;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                picture = (PicturePushState.Picture) webCardSlothViewModel$getSlothParams$1.L$2;
                uVar = (com.yandex.passport.sloth.data.u) webCardSlothViewModel$getSlothParams$1.L$1;
                d1Var2 = (d1) webCardSlothViewModel$getSlothParams$1.L$0;
                kotlin.b.b(obj);
                X = ((Result) obj).getValue();
                a = Result.a(X);
                if (a != null) {
                    uVar2 = com.yandex.passport.sloth.data.u.b(uVar, new PicturePushState.Success(picture.getSelectedPicture()));
                } else {
                    if (a instanceof PassportChallengeRequiredException) {
                        uVar = com.yandex.passport.sloth.data.u.b(uVar, PicturePushState.Number.INSTANCE);
                    }
                    uVar2 = uVar;
                }
                return SlothParams.copy$default(((j0) d1Var2.b).a, uVar2, null, null, null, 14, null);
            }
        }
        webCardSlothViewModel$getSlothParams$1 = new WebCardSlothViewModel$getSlothParams$1(d1Var, continuationImpl);
        Object obj2 = webCardSlothViewModel$getSlothParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webCardSlothViewModel$getSlothParams$1.label;
        if (i != 0) {
        }
        a = Result.a(X);
        if (a != null) {
        }
        return SlothParams.copy$default(((j0) d1Var2.b).a, uVar2, null, null, null, 14, null);
    }

    @Override // defpackage.yr31
    public final void V() {
        zd zdVar = this.A;
        if (!zdVar.b.isEmpty()) {
            LinkedHashMap b = zdVar.b();
            ArrayList a = zdVar.a();
            Map c = zdVar.c();
            k1 k1Var = this.y;
            k1Var.getClass();
            k1Var.b(sc.w, kotlin.collections.b.n(kotlin.collections.b.i(new Pair("last_events", b), new Pair("all_events", a)), c));
        }
        zdVar.d();
        com.yandex.passport.sloth.c1 c1Var = this.B;
        if (c1Var != null) {
            c1Var.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object X(com.yandex.passport.sloth.data.u uVar, int i, ContinuationImpl continuationImpl) {
        WebCardSlothViewModel$processSelectedPicture$1 webCardSlothViewModel$processSelectedPicture$1;
        int i2;
        if (continuationImpl instanceof WebCardSlothViewModel$processSelectedPicture$1) {
            webCardSlothViewModel$processSelectedPicture$1 = (WebCardSlothViewModel$processSelectedPicture$1) continuationImpl;
            int i3 = webCardSlothViewModel$processSelectedPicture$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                webCardSlothViewModel$processSelectedPicture$1.label = i3 - Integer.MIN_VALUE;
                Object obj = webCardSlothViewModel$processSelectedPicture$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = webCardSlothViewModel$processSelectedPicture$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "selected picture: " + i, 8);
                    }
                    h1 h1Var = new h1(i, uVar.w, uVar.a);
                    webCardSlothViewModel$processSelectedPicture$1.label = 1;
                    obj = this.z.a(h1Var, webCardSlothViewModel$processSelectedPicture$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        webCardSlothViewModel$processSelectedPicture$1 = new WebCardSlothViewModel$processSelectedPicture$1(this, continuationImpl);
        Object obj2 = webCardSlothViewModel$processSelectedPicture$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = webCardSlothViewModel$processSelectedPicture$1.label;
        if (i2 != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
