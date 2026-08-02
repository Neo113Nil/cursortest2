package com.yandex.passport.internal.sloth;

import com.yandex.passport.common.core.FrontendUrlType;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.network.r;
import com.yandex.passport.internal.usecase.ui.d0;
import com.yandex.passport.internal.usecase.ui.e0;
import com.yandex.passport.internal.usecase.ui.j0;
import com.yandex.passport.internal.usecase.ui.k0;
import com.yandex.passport.internal.usecase.ui.m0;
import com.yandex.passport.internal.usecase.ui.n0;
import com.yandex.passport.internal.usecase.ui.o0;
import com.yandex.passport.internal.usecase.w;
import com.yandex.passport.internal.usecase.y;
import com.yandex.passport.sloth.data.u;
import defpackage.ny61;
import java.util.Locale;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class o implements com.yandex.passport.sloth.dependencies.h {
    public final y a;
    public final com.yandex.passport.internal.usecase.ui.i b;
    public final o0 c;
    public final j0 d;
    public final m0 e;
    public final e0 f;
    public final r g;

    public o(y yVar, com.yandex.passport.internal.usecase.ui.i iVar, o0 o0Var, j0 j0Var, m0 m0Var, e0 e0Var, r rVar) {
        this.a = yVar;
        this.b = iVar;
        this.c = o0Var;
        this.d = j0Var;
        this.e = m0Var;
        this.f = e0Var;
        this.g = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Uid uid, String str, ContinuationImpl continuationImpl) {
        SlothUrlProviderImpl$getAuthCodeUrl$1 slothUrlProviderImpl$getAuthCodeUrl$1;
        int i;
        if (continuationImpl instanceof SlothUrlProviderImpl$getAuthCodeUrl$1) {
            slothUrlProviderImpl$getAuthCodeUrl$1 = (SlothUrlProviderImpl$getAuthCodeUrl$1) continuationImpl;
            int i2 = slothUrlProviderImpl$getAuthCodeUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothUrlProviderImpl$getAuthCodeUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothUrlProviderImpl$getAuthCodeUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothUrlProviderImpl$getAuthCodeUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n0 n0Var = new n0(uid, str);
                    slothUrlProviderImpl$getAuthCodeUrl$1.label = 1;
                    obj = this.c.a(n0Var, slothUrlProviderImpl$getAuthCodeUrl$1);
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
                return ((Result) obj).getValue();
            }
        }
        slothUrlProviderImpl$getAuthCodeUrl$1 = new SlothUrlProviderImpl$getAuthCodeUrl$1(this, continuationImpl);
        Object obj2 = slothUrlProviderImpl$getAuthCodeUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothUrlProviderImpl$getAuthCodeUrl$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Uid uid, String str, ContinuationImpl continuationImpl) {
        SlothUrlProviderImpl$getAuthQrUrl$1 slothUrlProviderImpl$getAuthQrUrl$1;
        int i;
        if (continuationImpl instanceof SlothUrlProviderImpl$getAuthQrUrl$1) {
            slothUrlProviderImpl$getAuthQrUrl$1 = (SlothUrlProviderImpl$getAuthQrUrl$1) continuationImpl;
            int i2 = slothUrlProviderImpl$getAuthQrUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothUrlProviderImpl$getAuthQrUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothUrlProviderImpl$getAuthQrUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothUrlProviderImpl$getAuthQrUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.usecase.ui.h hVar = new com.yandex.passport.internal.usecase.ui.h(uid, str);
                    slothUrlProviderImpl$getAuthQrUrl$1.label = 1;
                    obj = this.b.a(hVar, slothUrlProviderImpl$getAuthQrUrl$1);
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
                return ((Result) obj).getValue();
            }
        }
        slothUrlProviderImpl$getAuthQrUrl$1 = new SlothUrlProviderImpl$getAuthQrUrl$1(this, continuationImpl);
        Object obj2 = slothUrlProviderImpl$getAuthQrUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothUrlProviderImpl$getAuthQrUrl$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(com.yandex.passport.sloth.data.n nVar, ContinuationImpl continuationImpl) {
        SlothUrlProviderImpl$getAuthSdkUrl$1 slothUrlProviderImpl$getAuthSdkUrl$1;
        int i;
        if (continuationImpl instanceof SlothUrlProviderImpl$getAuthSdkUrl$1) {
            slothUrlProviderImpl$getAuthSdkUrl$1 = (SlothUrlProviderImpl$getAuthSdkUrl$1) continuationImpl;
            int i2 = slothUrlProviderImpl$getAuthSdkUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothUrlProviderImpl$getAuthSdkUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothUrlProviderImpl$getAuthSdkUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothUrlProviderImpl$getAuthSdkUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k0 k0Var = new k0(nVar.x, nVar.a, nVar.b, nVar.w, nVar.y, nVar.z, nVar.A);
                    slothUrlProviderImpl$getAuthSdkUrl$1.label = 1;
                    obj = this.d.a(k0Var, slothUrlProviderImpl$getAuthSdkUrl$1);
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
                return ((Result) obj).getValue();
            }
        }
        slothUrlProviderImpl$getAuthSdkUrl$1 = new SlothUrlProviderImpl$getAuthSdkUrl$1(this, continuationImpl);
        Object obj2 = slothUrlProviderImpl$getAuthSdkUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothUrlProviderImpl$getAuthSdkUrl$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Uid uid, Locale locale, String str, FrontendUrlType frontendUrlType, ContinuationImpl continuationImpl) {
        SlothUrlProviderImpl$getAuthorizationUrl$1 slothUrlProviderImpl$getAuthorizationUrl$1;
        int i;
        if (continuationImpl instanceof SlothUrlProviderImpl$getAuthorizationUrl$1) {
            slothUrlProviderImpl$getAuthorizationUrl$1 = (SlothUrlProviderImpl$getAuthorizationUrl$1) continuationImpl;
            int i2 = slothUrlProviderImpl$getAuthorizationUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothUrlProviderImpl$getAuthorizationUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothUrlProviderImpl$getAuthorizationUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothUrlProviderImpl$getAuthorizationUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    w wVar = new w(uid, locale, str, (String) null, (Map) null, frontendUrlType, 56);
                    slothUrlProviderImpl$getAuthorizationUrl$1.label = 1;
                    obj = this.a.a(wVar, slothUrlProviderImpl$getAuthorizationUrl$1);
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
                return ((Result) obj).getValue();
            }
        }
        slothUrlProviderImpl$getAuthorizationUrl$1 = new SlothUrlProviderImpl$getAuthorizationUrl$1(this, continuationImpl);
        Object obj2 = slothUrlProviderImpl$getAuthorizationUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothUrlProviderImpl$getAuthorizationUrl$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(u uVar, ContinuationImpl continuationImpl) {
        SlothUrlProviderImpl$getPicturePushUrl$1 slothUrlProviderImpl$getPicturePushUrl$1;
        int i;
        if (continuationImpl instanceof SlothUrlProviderImpl$getPicturePushUrl$1) {
            slothUrlProviderImpl$getPicturePushUrl$1 = (SlothUrlProviderImpl$getPicturePushUrl$1) continuationImpl;
            int i2 = slothUrlProviderImpl$getPicturePushUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothUrlProviderImpl$getPicturePushUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothUrlProviderImpl$getPicturePushUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothUrlProviderImpl$getPicturePushUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d0 d0Var = new d0(uVar.a, uVar.b, uVar.c, uVar.w);
                    slothUrlProviderImpl$getPicturePushUrl$1.label = 1;
                    obj = this.f.a(d0Var, slothUrlProviderImpl$getPicturePushUrl$1);
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
                return ((Result) obj).getValue();
            }
        }
        slothUrlProviderImpl$getPicturePushUrl$1 = new SlothUrlProviderImpl$getPicturePushUrl$1(this, continuationImpl);
        Object obj2 = slothUrlProviderImpl$getPicturePushUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothUrlProviderImpl$getPicturePushUrl$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(com.yandex.passport.sloth.data.n nVar, ContinuationImpl continuationImpl) {
        SlothUrlProviderImpl$getUnauthorizedAuthSdkUrl$1 slothUrlProviderImpl$getUnauthorizedAuthSdkUrl$1;
        int i;
        if (continuationImpl instanceof SlothUrlProviderImpl$getUnauthorizedAuthSdkUrl$1) {
            slothUrlProviderImpl$getUnauthorizedAuthSdkUrl$1 = (SlothUrlProviderImpl$getUnauthorizedAuthSdkUrl$1) continuationImpl;
            int i2 = slothUrlProviderImpl$getUnauthorizedAuthSdkUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                slothUrlProviderImpl$getUnauthorizedAuthSdkUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = slothUrlProviderImpl$getUnauthorizedAuthSdkUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = slothUrlProviderImpl$getUnauthorizedAuthSdkUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k0 k0Var = new k0(nVar.x, nVar.a, nVar.b, nVar.w, nVar.y, nVar.z, nVar.A);
                    slothUrlProviderImpl$getUnauthorizedAuthSdkUrl$1.label = 1;
                    obj = this.e.a(k0Var, slothUrlProviderImpl$getUnauthorizedAuthSdkUrl$1);
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
                return ((Result) obj).getValue();
            }
        }
        slothUrlProviderImpl$getUnauthorizedAuthSdkUrl$1 = new SlothUrlProviderImpl$getUnauthorizedAuthSdkUrl$1(this, continuationImpl);
        Object obj2 = slothUrlProviderImpl$getUnauthorizedAuthSdkUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = slothUrlProviderImpl$getUnauthorizedAuthSdkUrl$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
