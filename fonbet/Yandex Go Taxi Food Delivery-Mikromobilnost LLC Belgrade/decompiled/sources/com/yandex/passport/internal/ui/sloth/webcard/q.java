package com.yandex.passport.internal.ui.sloth.webcard;

import android.os.Bundle;
import com.yandex.passport.api.exception.PassportChallengeRequiredException;
import com.yandex.passport.api.exception.PassportHostProcessedException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.report.rc;
import com.yandex.passport.internal.report.reporters.WebAmReporter$Companion$EventPlace;
import com.yandex.passport.internal.report.reporters.WebCardReporter$Source2Fa;
import com.yandex.passport.internal.report.reporters.i1;
import com.yandex.passport.internal.report.reporters.k1;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.usecase.h1;
import com.yandex.passport.sloth.data.PicturePushState;
import com.yandex.passport.sloth.data.PushType;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.w511;
import defpackage.zy11;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class q extends com.yandex.passport.common.mvi.g {
    public final k1 c;
    public final k0 d;
    public final i1 e;
    public final com.yandex.passport.internal.push.h f;
    public final com.yandex.passport.internal.usecase.i1 g;

    public q(k1 k1Var, k0 k0Var, i1 i1Var, com.yandex.passport.internal.push.h hVar, com.yandex.passport.internal.usecase.i1 i1Var2) {
        this.c = k1Var;
        this.d = k0Var;
        this.e = i1Var;
        this.f = hVar;
        this.g = i1Var2;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object h(Object obj, Continuation continuation) {
        h0 h0Var;
        Object l;
        n nVar = (n) obj;
        boolean l2 = jl40.l(nVar, l.a);
        zy11 zy11Var = zy11.a;
        if (l2) {
            if (jl40.l(g(), new b0(null, null, null)) && (l = l((ContinuationImpl) continuation)) == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return l;
            }
        } else {
            if (!(nVar instanceof m)) {
                w511.b();
                return null;
            }
            com.yandex.passport.internal.sloth.performers.webcard.f fVar = ((m) nVar).a;
            if (fVar instanceof com.yandex.passport.internal.sloth.performers.webcard.d) {
                com.yandex.passport.internal.sloth.performers.webcard.d dVar = (com.yandex.passport.internal.sloth.performers.webcard.d) fVar;
                String str = dVar.a;
                if (jl40.l(str, "fullscreen")) {
                    h0Var = new h0(0);
                } else {
                    Float f = dVar.b;
                    int floatValue = f != null ? (int) f.floatValue() : 0;
                    Float f2 = dVar.c;
                    int floatValue2 = f2 != null ? (int) f2.floatValue() : 0;
                    Float f3 = dVar.d;
                    int floatValue3 = f3 != null ? (int) f3.floatValue() : 0;
                    Float f4 = dVar.e;
                    h0Var = new h0(floatValue, floatValue2, floatValue3, f4 != null ? (int) f4.floatValue() : 0, jl40.l(str, "bottom") ? WebCardMode.Bottom : jl40.l(str, "top") ? WebCardMode.Top : WebCardMode.Middle);
                }
                f(new y(h0Var, dVar.f));
                return zy11Var;
            }
            if (!(fVar instanceof com.yandex.passport.internal.sloth.performers.webcard.c)) {
                if (fVar instanceof com.yandex.passport.internal.sloth.performers.webcard.e) {
                    a(new r(((com.yandex.passport.internal.sloth.performers.webcard.e) fVar).a));
                    return zy11Var;
                }
                w511.b();
                return null;
            }
            Object obj2 = ((com.yandex.passport.internal.sloth.performers.webcard.c) fVar).a;
            if (!(obj2 instanceof Result.Failure)) {
                f(new x((com.yandex.passport.internal.ui.f) obj2));
            }
            Throwable a = Result.a(obj2);
            if (a != null) {
                a(new r(a));
            }
        }
        return zy11Var;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object i(Object obj, Continuation continuation) {
        f0 f0Var = (f0) obj;
        l0 l0Var = l0.b;
        boolean z = f0Var instanceof c0;
        i1 i1Var = this.e;
        if (z) {
            com.yandex.passport.sloth.i0 i0Var = ((c0) f0Var).a;
            if (i0Var instanceof com.yandex.passport.sloth.x) {
                a(new t(l0.a));
            } else if (i0Var instanceof com.yandex.passport.sloth.c0) {
                a(new t(new p0(((com.yandex.passport.sloth.c0) i0Var).a)));
            } else if (i0Var instanceof com.yandex.passport.sloth.a0) {
                Throwable th = ((com.yandex.passport.sloth.a0) i0Var).a;
                if (com.yandex.passport.internal.ui.sloth.e.j(th)) {
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Internet connection is lost in Sloth.", 8);
                    }
                } else {
                    a(new t(new n0(th)));
                }
            } else {
                i1Var.j(i0Var.toString(), WebAmReporter$Companion$EventPlace.WEB_CARD);
            }
        } else if (f0Var instanceof d0) {
            int i = p.a[((d0) f0Var).a.ordinal()];
            if (i == 1 || i == 2) {
                a(new t(l0Var));
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                a(new t(l0.c));
            }
        } else {
            if (!(f0Var instanceof e0)) {
                w511.b();
                return null;
            }
            com.yandex.passport.sloth.a1 a1Var = ((e0) f0Var).a;
            if (a1Var instanceof com.yandex.passport.sloth.d) {
                a(new t(l0Var));
            } else if (a1Var instanceof com.yandex.passport.sloth.m0) {
                a(new t(l0Var));
            } else if (a1Var instanceof com.yandex.passport.sloth.b) {
                a(new r(new Exception("Failed to process current authentication.")));
            } else if (a1Var instanceof com.yandex.passport.sloth.m) {
                com.yandex.passport.api.exception.b bVar = PassportHostProcessedException.Companion;
                List list = ((com.yandex.passport.sloth.m) a1Var).a;
                bVar.getClass();
                PassportHostProcessedException a = com.yandex.passport.api.exception.b.a(list);
                k1 k1Var = this.c;
                k1Var.getClass();
                k1Var.f(rc.w, new yd(a));
                bVar.getClass();
                a(new t(new n0(com.yandex.passport.api.exception.b.a(list))));
            } else if (a1Var instanceof com.yandex.passport.sloth.x0) {
                com.yandex.passport.sloth.x0 x0Var = (com.yandex.passport.sloth.x0) a1Var;
                a(new t(new o0(x0Var.a, x0Var.b)));
            } else if (a1Var instanceof com.yandex.passport.sloth.w) {
                a(new t(new m0(((com.yandex.passport.sloth.w) a1Var).a)));
            } else {
                i1Var.j(com.yandex.passport.sloth.j.b(a1Var), WebAmReporter$Companion$EventPlace.WEB_CARD);
            }
        }
        return zy11.a;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final void j(Throwable th) {
        a(new r(th));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(ContinuationImpl continuationImpl) {
        WebCardComposeStoreFactory$ExecutorImpl$getSlothParams$1 webCardComposeStoreFactory$ExecutorImpl$getSlothParams$1;
        int i;
        com.yandex.passport.sloth.data.u uVar;
        Object obj;
        q qVar;
        PicturePushState.Picture picture;
        Throwable a;
        com.yandex.passport.sloth.data.u uVar2;
        if (continuationImpl instanceof WebCardComposeStoreFactory$ExecutorImpl$getSlothParams$1) {
            webCardComposeStoreFactory$ExecutorImpl$getSlothParams$1 = (WebCardComposeStoreFactory$ExecutorImpl$getSlothParams$1) continuationImpl;
            int i2 = webCardComposeStoreFactory$ExecutorImpl$getSlothParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webCardComposeStoreFactory$ExecutorImpl$getSlothParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = webCardComposeStoreFactory$ExecutorImpl$getSlothParams$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webCardComposeStoreFactory$ExecutorImpl$getSlothParams$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    k0 k0Var = this.d;
                    boolean z = k0Var instanceof i0;
                    com.yandex.passport.internal.push.h hVar = this.f;
                    if (!z) {
                        if (!(k0Var instanceof j0)) {
                            w511.b();
                            return null;
                        }
                        SlothParams slothParams = ((j0) k0Var).a;
                        if (!(slothParams.getVariant() instanceof com.yandex.passport.sloth.data.u)) {
                            return slothParams;
                        }
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
                            webCardComposeStoreFactory$ExecutorImpl$getSlothParams$1.L$0 = this;
                            webCardComposeStoreFactory$ExecutorImpl$getSlothParams$1.L$1 = uVar3;
                            webCardComposeStoreFactory$ExecutorImpl$getSlothParams$1.L$2 = picture2;
                            webCardComposeStoreFactory$ExecutorImpl$getSlothParams$1.label = 2;
                            Object m = m(uVar3, selectedPicture, webCardComposeStoreFactory$ExecutorImpl$getSlothParams$1);
                            if (m != coroutineSingletons) {
                                uVar = uVar3;
                                obj = m;
                                qVar = this;
                                picture = picture2;
                            }
                        }
                        return ((j0) this.d).a;
                    }
                    Bundle bundle = ((i0) k0Var).a;
                    webCardComposeStoreFactory$ExecutorImpl$getSlothParams$1.label = 1;
                    Object h = hVar.h(bundle, webCardComposeStoreFactory$ExecutorImpl$getSlothParams$1);
                    if (h != coroutineSingletons) {
                        return h;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj2);
                    return obj2;
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                picture = (PicturePushState.Picture) webCardComposeStoreFactory$ExecutorImpl$getSlothParams$1.L$2;
                uVar = (com.yandex.passport.sloth.data.u) webCardComposeStoreFactory$ExecutorImpl$getSlothParams$1.L$1;
                qVar = (q) webCardComposeStoreFactory$ExecutorImpl$getSlothParams$1.L$0;
                kotlin.b.b(obj2);
                obj = ((Result) obj2).getValue();
                a = Result.a(obj);
                if (a != null) {
                    uVar2 = com.yandex.passport.sloth.data.u.b(uVar, new PicturePushState.Success(picture.getSelectedPicture()));
                } else {
                    if (a instanceof PassportChallengeRequiredException) {
                        uVar = com.yandex.passport.sloth.data.u.b(uVar, PicturePushState.Number.INSTANCE);
                    }
                    uVar2 = uVar;
                }
                SlothParams.copy$default(((j0) qVar.d).a, uVar2, null, null, null, 14, null);
                this = qVar;
                return ((j0) this.d).a;
            }
        }
        webCardComposeStoreFactory$ExecutorImpl$getSlothParams$1 = new WebCardComposeStoreFactory$ExecutorImpl$getSlothParams$1(this, continuationImpl);
        Object obj22 = webCardComposeStoreFactory$ExecutorImpl$getSlothParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webCardComposeStoreFactory$ExecutorImpl$getSlothParams$1.label;
        if (i != 0) {
        }
        a = Result.a(obj);
        if (a != null) {
        }
        SlothParams.copy$default(((j0) qVar.d).a, uVar2, null, null, null, 14, null);
        this = qVar;
        return ((j0) this.d).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(ContinuationImpl continuationImpl) {
        WebCardComposeStoreFactory$ExecutorImpl$onInit$1 webCardComposeStoreFactory$ExecutorImpl$onInit$1;
        int i;
        int i2;
        if (continuationImpl instanceof WebCardComposeStoreFactory$ExecutorImpl$onInit$1) {
            webCardComposeStoreFactory$ExecutorImpl$onInit$1 = (WebCardComposeStoreFactory$ExecutorImpl$onInit$1) continuationImpl;
            int i3 = webCardComposeStoreFactory$ExecutorImpl$onInit$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                webCardComposeStoreFactory$ExecutorImpl$onInit$1.label = i3 - Integer.MIN_VALUE;
                Object obj = webCardComposeStoreFactory$ExecutorImpl$onInit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webCardComposeStoreFactory$ExecutorImpl$onInit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    webCardComposeStoreFactory$ExecutorImpl$onInit$1.L$0 = this;
                    webCardComposeStoreFactory$ExecutorImpl$onInit$1.label = 1;
                    obj = k(webCardComposeStoreFactory$ExecutorImpl$onInit$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (q) webCardComposeStoreFactory$ExecutorImpl$onInit$1.L$0;
                    kotlin.b.b(obj);
                }
                SlothParams slothParams = (SlothParams) obj;
                k1 k1Var = this.c;
                com.yandex.passport.sloth.data.c0 variant = slothParams.getVariant();
                com.yandex.passport.sloth.data.b0 b0Var = !(variant instanceof com.yandex.passport.sloth.data.b0) ? (com.yandex.passport.sloth.data.b0) variant : null;
                PushType pushType = b0Var != null ? b0Var.w : null;
                i2 = pushType != null ? -1 : p.b[pushType.ordinal()];
                if (i2 != 1) {
                    k1Var.j(WebCardReporter$Source2Fa.NotificationPush);
                } else if (i2 == 2) {
                    k1Var.j(WebCardReporter$Source2Fa.DataPush);
                }
                this.a(new s(slothParams));
                return zy11.a;
            }
        }
        webCardComposeStoreFactory$ExecutorImpl$onInit$1 = new WebCardComposeStoreFactory$ExecutorImpl$onInit$1(this, continuationImpl);
        Object obj2 = webCardComposeStoreFactory$ExecutorImpl$onInit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webCardComposeStoreFactory$ExecutorImpl$onInit$1.label;
        if (i != 0) {
        }
        SlothParams slothParams2 = (SlothParams) obj2;
        k1 k1Var2 = this.c;
        com.yandex.passport.sloth.data.c0 variant2 = slothParams2.getVariant();
        if (!(variant2 instanceof com.yandex.passport.sloth.data.b0)) {
        }
        if (b0Var != null) {
        }
        if (pushType != null) {
        }
        if (i2 != 1) {
        }
        this.a(new s(slothParams2));
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(com.yandex.passport.sloth.data.u uVar, int i, ContinuationImpl continuationImpl) {
        WebCardComposeStoreFactory$ExecutorImpl$processSelectedPicture$1 webCardComposeStoreFactory$ExecutorImpl$processSelectedPicture$1;
        int i2;
        if (continuationImpl instanceof WebCardComposeStoreFactory$ExecutorImpl$processSelectedPicture$1) {
            webCardComposeStoreFactory$ExecutorImpl$processSelectedPicture$1 = (WebCardComposeStoreFactory$ExecutorImpl$processSelectedPicture$1) continuationImpl;
            int i3 = webCardComposeStoreFactory$ExecutorImpl$processSelectedPicture$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                webCardComposeStoreFactory$ExecutorImpl$processSelectedPicture$1.label = i3 - Integer.MIN_VALUE;
                Object obj = webCardComposeStoreFactory$ExecutorImpl$processSelectedPicture$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = webCardComposeStoreFactory$ExecutorImpl$processSelectedPicture$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "selected picture: " + i, 8);
                    }
                    h1 h1Var = new h1(i, uVar.w, uVar.a);
                    webCardComposeStoreFactory$ExecutorImpl$processSelectedPicture$1.label = 1;
                    obj = this.g.a(h1Var, webCardComposeStoreFactory$ExecutorImpl$processSelectedPicture$1);
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
        webCardComposeStoreFactory$ExecutorImpl$processSelectedPicture$1 = new WebCardComposeStoreFactory$ExecutorImpl$processSelectedPicture$1(this, continuationImpl);
        Object obj2 = webCardComposeStoreFactory$ExecutorImpl$processSelectedPicture$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = webCardComposeStoreFactory$ExecutorImpl$processSelectedPicture$1.label;
        if (i2 != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
