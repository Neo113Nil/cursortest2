package com.yandex.go.charity.repository;

import com.yandex.go.charity.api.CharityApi;
import com.yandex.go.charity.data.MenuItemInfoResponse;
import com.yandex.go.route.interactor.b;
import defpackage.cmt;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.ffx;
import defpackage.gwk0;
import defpackage.hst;
import defpackage.i3y;
import defpackage.jst;
import defpackage.lza;
import defpackage.mdh;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.on2;
import defpackage.po21;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xdf;
import defpackage.zn1;
import defpackage.zy11;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes12.dex */
public final class a {
    public final xdf a;
    public final tse b;
    public final tt2 c;
    public final b d;
    public final po21 e;
    public final g f;
    public final i3y g;
    public final cne0 h;
    public final n0 i = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public pzt0 j;

    public a(xdf xdfVar, tse tseVar, tt2 tt2Var, b bVar, po21 po21Var, g gVar, on2 on2Var, dne0 dne0Var) {
        this.a = xdfVar;
        this.b = tseVar;
        this.c = tt2Var;
        this.d = bVar;
        this.e = po21Var;
        this.f = gVar;
        this.g = kotlin.a.a(new zn1(on2Var, 8));
        this.h = dne0Var.a("CHARITY_MENU_INFO");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d2, code lost:
    
        if (defpackage.tje.k0(r4, r5, r0) != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0069  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        CharityRepository$updateMenuItemInfoByRequest$1 charityRepository$updateMenuItemInfoByRequest$1;
        CoroutineSingletons coroutineSingletons;
        ?? r2;
        hst hstVar;
        Object obj;
        hst hstVar2;
        Object obj2;
        zzs zzsVar;
        aVar.getClass();
        try {
            if (continuationImpl instanceof CharityRepository$updateMenuItemInfoByRequest$1) {
                charityRepository$updateMenuItemInfoByRequest$1 = (CharityRepository$updateMenuItemInfoByRequest$1) continuationImpl;
                int i = charityRepository$updateMenuItemInfoByRequest$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    charityRepository$updateMenuItemInfoByRequest$1.label = i - Integer.MIN_VALUE;
                    Object obj3 = charityRepository$updateMenuItemInfoByRequest$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r2 = charityRepository$updateMenuItemInfoByRequest$1.label;
                    if (r2 == 0) {
                        try {
                        } catch (Throwable th) {
                            th = th;
                            hstVar = r2;
                        }
                        if (r2 == 1) {
                            hst hstVar3 = (hst) charityRepository$updateMenuItemInfoByRequest$1.L$0;
                            kotlin.b.b(obj3);
                            obj = obj3;
                            hstVar2 = hstVar3;
                        } else {
                            if (r2 != 2) {
                                if (r2 != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                hstVar = (hst) charityRepository$updateMenuItemInfoByRequest$1.L$0;
                                try {
                                    kotlin.b.b(obj3);
                                } catch (Throwable th2) {
                                    th = th2;
                                    hstVar.j(th);
                                    return zy11.a;
                                }
                                return zy11.a;
                            }
                            hst hstVar4 = (hst) charityRepository$updateMenuItemInfoByRequest$1.L$0;
                            kotlin.b.b(obj3);
                            obj2 = obj3;
                            hstVar2 = hstVar4;
                            lza c = aVar.c(((MenuItemInfoResponse) obj2).a);
                            aVar.c.getClass();
                            sjh sjhVar = uyj.a;
                            mdh mdhVar = mdh.b;
                            CharityRepository$updateMenuItemInfoByRequest$2$1 charityRepository$updateMenuItemInfoByRequest$2$1 = new CharityRepository$updateMenuItemInfoByRequest$2$1(aVar, c, null);
                            charityRepository$updateMenuItemInfoByRequest$1.L$0 = hstVar2;
                            charityRepository$updateMenuItemInfoByRequest$1.L$1 = null;
                            charityRepository$updateMenuItemInfoByRequest$1.L$2 = null;
                            charityRepository$updateMenuItemInfoByRequest$1.L$3 = null;
                            charityRepository$updateMenuItemInfoByRequest$1.label = 3;
                        }
                    } else {
                        kotlin.b.b(obj3);
                        hstVar2 = jst.e;
                        try {
                            zzsVar = aVar.d.d();
                            if (zzsVar == null) {
                                po21 po21Var = aVar.e;
                                charityRepository$updateMenuItemInfoByRequest$1.L$0 = hstVar2;
                                charityRepository$updateMenuItemInfoByRequest$1.label = 1;
                                obj = ((e) po21Var).h(charityRepository$updateMenuItemInfoByRequest$1);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            cmt<MenuItemInfoResponse> a = ((CharityApi) aVar.g.getValue()).a(zzsVar.b, zzsVar.a);
                            charityRepository$updateMenuItemInfoByRequest$1.L$0 = hstVar2;
                            charityRepository$updateMenuItemInfoByRequest$1.L$1 = null;
                            charityRepository$updateMenuItemInfoByRequest$1.label = 2;
                            obj2 = ru.yandex.taxi.network.api.a.a(a, null, charityRepository$updateMenuItemInfoByRequest$1);
                            if (obj2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            lza c2 = aVar.c(((MenuItemInfoResponse) obj2).a);
                            aVar.c.getClass();
                            sjh sjhVar2 = uyj.a;
                            mdh mdhVar2 = mdh.b;
                            CharityRepository$updateMenuItemInfoByRequest$2$1 charityRepository$updateMenuItemInfoByRequest$2$12 = new CharityRepository$updateMenuItemInfoByRequest$2$1(aVar, c2, null);
                            charityRepository$updateMenuItemInfoByRequest$1.L$0 = hstVar2;
                            charityRepository$updateMenuItemInfoByRequest$1.L$1 = null;
                            charityRepository$updateMenuItemInfoByRequest$1.L$2 = null;
                            charityRepository$updateMenuItemInfoByRequest$1.L$3 = null;
                            charityRepository$updateMenuItemInfoByRequest$1.label = 3;
                        } catch (Throwable th3) {
                            hst hstVar5 = hstVar2;
                            th = th3;
                            hstVar = hstVar5;
                            hstVar.j(th);
                            return zy11.a;
                        }
                    }
                    zzsVar = ((mo21) obj).a();
                    cmt<MenuItemInfoResponse> a2 = ((CharityApi) aVar.g.getValue()).a(zzsVar.b, zzsVar.a);
                    charityRepository$updateMenuItemInfoByRequest$1.L$0 = hstVar2;
                    charityRepository$updateMenuItemInfoByRequest$1.L$1 = null;
                    charityRepository$updateMenuItemInfoByRequest$1.label = 2;
                    obj2 = ru.yandex.taxi.network.api.a.a(a2, null, charityRepository$updateMenuItemInfoByRequest$1);
                    if (obj2 == coroutineSingletons) {
                    }
                    lza c22 = aVar.c(((MenuItemInfoResponse) obj2).a);
                    aVar.c.getClass();
                    sjh sjhVar22 = uyj.a;
                    mdh mdhVar22 = mdh.b;
                    CharityRepository$updateMenuItemInfoByRequest$2$1 charityRepository$updateMenuItemInfoByRequest$2$122 = new CharityRepository$updateMenuItemInfoByRequest$2$1(aVar, c22, null);
                    charityRepository$updateMenuItemInfoByRequest$1.L$0 = hstVar2;
                    charityRepository$updateMenuItemInfoByRequest$1.L$1 = null;
                    charityRepository$updateMenuItemInfoByRequest$1.L$2 = null;
                    charityRepository$updateMenuItemInfoByRequest$1.L$3 = null;
                    charityRepository$updateMenuItemInfoByRequest$1.label = 3;
                }
            }
            if (r2 == 0) {
            }
            zzsVar = ((mo21) obj).a();
            cmt<MenuItemInfoResponse> a22 = ((CharityApi) aVar.g.getValue()).a(zzsVar.b, zzsVar.a);
            charityRepository$updateMenuItemInfoByRequest$1.L$0 = hstVar2;
            charityRepository$updateMenuItemInfoByRequest$1.L$1 = null;
            charityRepository$updateMenuItemInfoByRequest$1.label = 2;
            obj2 = ru.yandex.taxi.network.api.a.a(a22, null, charityRepository$updateMenuItemInfoByRequest$1);
            if (obj2 == coroutineSingletons) {
            }
            lza c222 = aVar.c(((MenuItemInfoResponse) obj2).a);
            aVar.c.getClass();
            sjh sjhVar222 = uyj.a;
            mdh mdhVar222 = mdh.b;
            CharityRepository$updateMenuItemInfoByRequest$2$1 charityRepository$updateMenuItemInfoByRequest$2$1222 = new CharityRepository$updateMenuItemInfoByRequest$2$1(aVar, c222, null);
            charityRepository$updateMenuItemInfoByRequest$1.L$0 = hstVar2;
            charityRepository$updateMenuItemInfoByRequest$1.L$1 = null;
            charityRepository$updateMenuItemInfoByRequest$1.L$2 = null;
            charityRepository$updateMenuItemInfoByRequest$1.L$3 = null;
            charityRepository$updateMenuItemInfoByRequest$1.label = 3;
        } catch (CancellationException e) {
            throw e;
        }
        charityRepository$updateMenuItemInfoByRequest$1 = new CharityRepository$updateMenuItemInfoByRequest$1(aVar, continuationImpl);
        Object obj32 = charityRepository$updateMenuItemInfoByRequest$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = charityRepository$updateMenuItemInfoByRequest$1.label;
    }

    public final Object b(Continuation continuation) {
        g gVar = this.f;
        if (!gVar.g() || !gVar.f()) {
            return lza.f;
        }
        return kotlinx.coroutines.flow.e.y(new n(this.i, new CharityRepository$getAndUpdateMenuItemInfoByRequest$2(this, null)), continuation);
    }

    public final lza c(MenuItemInfoResponse.MenuButtonDto menuButtonDto) {
        if (menuButtonDto == null || menuButtonDto.b.length() == 0 || menuButtonDto.c.length() == 0) {
            return lza.f;
        }
        MenuItemInfoResponse.MenuButtonDto.SubtitleDto subtitleDto = menuButtonDto.a;
        return new lza(true, menuButtonDto.d, menuButtonDto.b, this.a.a(gwk0.h(subtitleDto.b), subtitleDto.a, false, true), menuButtonDto.c);
    }
}
