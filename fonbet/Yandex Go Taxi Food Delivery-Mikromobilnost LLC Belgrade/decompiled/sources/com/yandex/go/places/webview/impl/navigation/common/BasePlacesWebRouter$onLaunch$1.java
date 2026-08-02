package com.yandex.go.places.webview.impl.navigation.common;

import com.yandex.go.places.webview.api.navigation.PlacesWebAuthType;
import com.yandex.go.places.webview.impl.navigation.PlacesWebJsApi;
import defpackage.ab60;
import defpackage.d82;
import defpackage.hf41;
import defpackage.io60;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pne;
import defpackage.tse;
import defpackage.u5o;
import defpackage.u75;
import defpackage.ua41;
import defpackage.ugc0;
import defpackage.w511;
import defpackage.wls;
import defpackage.wnt;
import defpackage.ymu;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.am.AuthType;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.webview.impl.navigation.common.BasePlacesWebRouter$onLaunch$1", f = "BasePlacesWebRouter.kt", l = {67}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BasePlacesWebRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ ugc0 $payload;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePlacesWebRouter$onLaunch$1(b bVar, ugc0 ugc0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$payload = ugc0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BasePlacesWebRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BasePlacesWebRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009c A[Catch: all -> 0x00a1, CancellationException -> 0x00a4, TryCatch #5 {CancellationException -> 0x00a4, all -> 0x00a1, blocks: (B:10:0x0098, B:12:0x009c, B:13:0x00c6, B:20:0x00a7, B:22:0x00ab, B:23:0x00ae, B:25:0x00b2, B:29:0x00bd, B:30:0x00c2, B:31:0x00c3), top: B:9:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7 A[Catch: all -> 0x00a1, CancellationException -> 0x00a4, TryCatch #5 {CancellationException -> 0x00a4, all -> 0x00a1, blocks: (B:10:0x0098, B:12:0x009c, B:13:0x00c6, B:20:0x00a7, B:22:0x00ab, B:23:0x00ae, B:25:0x00b2, B:29:0x00bd, B:30:0x00c2, B:31:0x00c3), top: B:9:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006e A[Catch: all -> 0x0027, CancellationException -> 0x002a, TryCatch #4 {CancellationException -> 0x002a, all -> 0x0027, blocks: (B:6:0x0022, B:7:0x008e, B:42:0x003a, B:49:0x0053, B:50:0x005d, B:52:0x006e, B:57:0x0056, B:58:0x005b, B:60:0x0044), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.yandex.go.places.webview.impl.navigation.common.b, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b bVar;
        AuthType authType;
        ugc0 ugc0Var;
        b bVar2;
        ua41 ua41Var;
        AuthType authType2;
        b bVar3;
        String str;
        SimpleSpinnerModalView simpleSpinnerModalView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            try {
                try {
                    if (r1 == 0) {
                        kotlin.b.b(obj);
                        bVar = this.this$0;
                        ugc0 ugc0Var2 = this.$payload;
                        PlacesWebAuthType placesWebAuthType = ugc0Var2.b;
                        bVar.getClass();
                        int i = placesWebAuthType == null ? -1 : u75.a[placesWebAuthType.ordinal()];
                        if (i != -1) {
                            if (i == 1) {
                                authType = AuthType.COOKIES;
                            } else if (i == 2) {
                                authType = AuthType.OAUTH;
                            } else {
                                w511.b();
                            }
                            bVar.E = bVar.U().b(new d82(1));
                            if (authType != null) {
                                ugc0Var = ugc0Var2;
                                bVar2 = bVar;
                                ua41Var = null;
                                if (!(ua41Var instanceof pne)) {
                                    str = ((pne) ua41Var).a;
                                } else if (ua41Var instanceof io60) {
                                    str = ugc0Var.a;
                                } else {
                                    if (!(ua41Var instanceof u5o) && !jl40.l(ua41Var, ab60.a) && ua41Var != null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    str = ugc0Var.a;
                                    authType = null;
                                }
                                PlacesWebJsApi placesWebJsApi = new PlacesWebJsApi((wnt) bVar.W().a.a.get(), new ymu((Object) bVar, (Object) ugc0Var, false, 19));
                                hf41 hf41Var = new hf41(str, authType, placesWebJsApi, bVar.Q(str, authType, placesWebJsApi));
                                simpleSpinnerModalView = bVar2.E;
                                if (simpleSpinnerModalView != null) {
                                    simpleSpinnerModalView.dismiss();
                                }
                                bVar2.E = null;
                                b bVar4 = this.this$0;
                                bVar4.getClass();
                                bVar4.a0(hf41Var, new a(hf41Var, bVar4));
                                return zy11.a;
                            }
                            o S = bVar.S();
                            String str2 = ugc0Var2.a;
                            this.L$0 = bVar;
                            this.L$1 = ugc0Var2;
                            this.L$2 = bVar;
                            this.L$3 = null;
                            this.L$4 = authType;
                            this.L$5 = null;
                            this.label = 1;
                            Object b = S.b(str2, authType, this);
                            if (b == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            ugc0Var = ugc0Var2;
                            obj = b;
                            authType2 = authType;
                            bVar3 = bVar;
                        }
                        authType = null;
                        bVar.E = bVar.U().b(new d82(1));
                        if (authType != null) {
                        }
                    } else {
                        if (r1 != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        authType2 = (AuthType) this.L$4;
                        bVar = (b) this.L$2;
                        ugc0Var = (ugc0) this.L$1;
                        bVar3 = (b) this.L$0;
                        kotlin.b.b(obj);
                    }
                    if (!(ua41Var instanceof pne)) {
                    }
                    PlacesWebJsApi placesWebJsApi2 = new PlacesWebJsApi((wnt) bVar.W().a.a.get(), new ymu((Object) bVar, (Object) ugc0Var, false, 19));
                    hf41 hf41Var2 = new hf41(str, authType, placesWebJsApi2, bVar.Q(str, authType, placesWebJsApi2));
                    simpleSpinnerModalView = bVar2.E;
                    if (simpleSpinnerModalView != null) {
                    }
                    bVar2.E = null;
                    b bVar42 = this.this$0;
                    bVar42.getClass();
                    bVar42.a0(hf41Var2, new a(hf41Var2, bVar42));
                    return zy11.a;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    throw th;
                }
                ua41Var = (ua41) obj;
                b bVar5 = bVar3;
                authType = authType2;
                bVar2 = bVar;
                bVar = bVar5;
            } catch (Throwable th2) {
                SimpleSpinnerModalView simpleSpinnerModalView2 = r1.E;
                if (simpleSpinnerModalView2 != null) {
                    simpleSpinnerModalView2.dismiss();
                }
                r1.E = null;
                throw th2;
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
