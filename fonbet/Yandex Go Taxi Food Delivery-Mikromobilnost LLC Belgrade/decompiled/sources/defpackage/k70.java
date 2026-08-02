package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.rt.ebs.cryptosdk.core.common.entities.models.ISdkDispatchers;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage;
import ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.IAdapterController;
import ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.a;
import ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.c;
import ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.d;
import ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.e;
import ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.f;
import ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.g;
import ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.h;
import ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.i;
import ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.j;
import ru.rt.ebs.cryptosdk.core.verification.adapter.entities.exceptions.AdapterVerificationEbsException;
import ru.rt.ebs.cryptosdk.core.verification.adapter.entities.models.EsiaAuthenticationUrl;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.EbsToken;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.VerificationRequestScheme;

/* loaded from: classes4.dex */
public final class k70 implements IAdapterController {
    public final z70 a;
    public final IVerificationSessionController b;
    public final ISdkDispatchers c;

    public k70(z70 z70Var, IVerificationSessionController iVerificationSessionController, ISdkDispatchers iSdkDispatchers) {
        this.a = z70Var;
        this.b = iVerificationSessionController;
        this.c = iSdkDispatchers;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.IAdapterController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object finishEsiaAuthentication(Continuation continuation) {
        a aVar;
        int i;
        try {
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i2 = aVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.c = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.a;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = aVar.c;
                    if (i != 0) {
                        b.b(obj);
                        jse io2 = this.c.io();
                        ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.b bVar = new ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.b(this, null);
                        aVar.c = 1;
                        if (tje.k0(io2, bVar, aVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (Exception e) {
            throw new AdapterVerificationEbsException(e);
        }
        aVar = new a(this, continuation);
        Object obj2 = aVar.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.IAdapterController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object finishExtEsiaAuthentication(Continuation continuation) {
        c cVar;
        int i;
        try {
            if (continuation instanceof c) {
                cVar = (c) continuation;
                int i2 = cVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cVar.c = i2 - Integer.MIN_VALUE;
                    Object obj = cVar.a;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = cVar.c;
                    if (i != 0) {
                        b.b(obj);
                        jse io2 = this.c.io();
                        d dVar = new d(this, null);
                        cVar.c = 1;
                        if (tje.k0(io2, dVar, cVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (Exception e) {
            throw new AdapterVerificationEbsException(e);
        }
        cVar = new c(this, continuation);
        Object obj2 = cVar.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cVar.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.IAdapterController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object finishVerification(Continuation continuation) {
        e eVar;
        int i;
        try {
            if (continuation instanceof e) {
                eVar = (e) continuation;
                int i2 = eVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eVar.c = i2 - Integer.MIN_VALUE;
                    Object obj = eVar.a;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = eVar.c;
                    if (i != 0) {
                        b.b(obj);
                        jse io2 = this.c.io();
                        f fVar = new f(this, null);
                        eVar.c = 1;
                        if (tje.k0(io2, fVar, eVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (Exception e) {
            throw new AdapterVerificationEbsException(e);
        }
        eVar = new e(this, continuation);
        Object obj2 = eVar.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eVar.c;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.IAdapterController
    public final Token getEbsSessionId() {
        try {
            VerificationRequestScheme verificationRequestScheme = this.b.getVerificationRequestScheme();
            if (verificationRequestScheme instanceof VerificationRequestScheme.FZ115) {
                return new Token(this.a.b.getString("adapter.ebs_session_id", ""));
            }
            if (verificationRequestScheme instanceof VerificationRequestScheme.WithoutEsia) {
                return ((VerificationRequestScheme.WithoutEsia) verificationRequestScheme).getVrfSessionId();
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e) {
            throw new AdapterVerificationEbsException(e);
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.IAdapterController
    public final EsiaAuthenticationUrl getEsiaAuthenticationUrl() {
        try {
            IKeyStorage iKeyStorage = this.a.b;
            return new EsiaAuthenticationUrl(iKeyStorage.getString("adapter.esia_authentication_url_esia_url", ""), iKeyStorage.getString("adapter.esia_authentication_url_reirect_url", ""));
        } catch (Exception e) {
            throw new AdapterVerificationEbsException(e);
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.IAdapterController
    public final EsiaAuthenticationUrl getExtEsiaAuthenticationUrl() {
        try {
            IKeyStorage iKeyStorage = this.a.b;
            return new EsiaAuthenticationUrl(iKeyStorage.getString("adapter.ext_esia_authentication_url_esia_url", ""), iKeyStorage.getString("adapter.ext_esia_authentication_url_reirect_url", ""));
        } catch (Exception e) {
            throw new AdapterVerificationEbsException(e);
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.IAdapterController
    public final void removeEbsRedirectUrl() {
        try {
            this.a.b.remove("adapter.ebs_redirect_url").save();
        } catch (Exception e) {
            throw new AdapterVerificationEbsException(e);
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.IAdapterController
    public final void setEbsRedirectUrl(String str) {
        try {
            this.a.b.putString("adapter.ebs_redirect_url", str).save();
        } catch (Exception e) {
            throw new AdapterVerificationEbsException(e);
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.IAdapterController
    public final void setEbsToken(EbsToken ebsToken) {
        try {
            this.a.b.putString("adapter.ebs_token_token", ebsToken.getVerificationToken()).putString("adapter.ebs_token_expired_at", ebsToken.getTokenExpires()).save();
        } catch (Exception e) {
            throw new AdapterVerificationEbsException(e);
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.IAdapterController
    public final void setEsiaAuthenticationSessionRedirectUrl(String str) {
        try {
            this.a.b.putString("adapter.esia_authentication_session_redirect_url", str).save();
        } catch (Exception e) {
            throw new AdapterVerificationEbsException(e);
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.IAdapterController
    public final void setExtEsiaAuthenticationRedirectUrl(String str) {
        try {
            this.a.b.putString("adapter.ext_esia_authentication_redirect_url", str).save();
        } catch (Exception e) {
            throw new AdapterVerificationEbsException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.IAdapterController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startEsiaAuthentication(Continuation continuation) {
        g gVar;
        int i;
        try {
            if (continuation instanceof g) {
                gVar = (g) continuation;
                int i2 = gVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gVar.c = i2 - Integer.MIN_VALUE;
                    Object obj = gVar.a;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = gVar.c;
                    if (i != 0) {
                        b.b(obj);
                        jse io2 = this.c.io();
                        h hVar = new h(this, null);
                        gVar.c = 1;
                        if (tje.k0(io2, hVar, gVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (Exception e) {
            throw new AdapterVerificationEbsException(e);
        }
        gVar = new g(this, continuation);
        Object obj2 = gVar.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gVar.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.IAdapterController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startExtEsiaAuthentication(Continuation continuation) {
        i iVar;
        int i;
        try {
            if (continuation instanceof i) {
                iVar = (i) continuation;
                int i2 = iVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    iVar.c = i2 - Integer.MIN_VALUE;
                    Object obj = iVar.a;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = iVar.c;
                    if (i != 0) {
                        b.b(obj);
                        jse io2 = this.c.io();
                        j jVar = new j(this, null);
                        iVar.c = 1;
                        if (tje.k0(io2, jVar, iVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (Exception e) {
            throw new AdapterVerificationEbsException(e);
        }
        iVar = new i(this, continuation);
        Object obj2 = iVar.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = iVar.c;
    }
}
