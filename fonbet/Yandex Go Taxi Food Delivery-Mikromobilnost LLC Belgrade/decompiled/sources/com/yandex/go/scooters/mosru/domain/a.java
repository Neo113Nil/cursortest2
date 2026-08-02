package com.yandex.go.scooters.mosru.domain;

import com.yandex.go.scooters.mosru.api.domain.model.ScootersMosRuActionDialogOpenReason;
import com.yandex.go.scooters.mosru.api.domain.model.ScootersMosRuAuthStatus;
import com.yandex.go.scooters.mosru.data.b;
import com.yandex.go.scooters.mosru.data.model.ScootersMosRuIntegrationExperiment;
import defpackage.ab60;
import defpackage.fzn0;
import defpackage.io60;
import defpackage.mzn0;
import defpackage.ny61;
import defpackage.nzn0;
import defpackage.pne;
import defpackage.qzn0;
import defpackage.u5o;
import defpackage.ua41;
import defpackage.w511;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.AuthType;
import ru.yandex.taxi.am.o;

/* loaded from: classes13.dex */
public final class a {
    public final com.yandex.go.scooters.mosru.data.a a;
    public final o b;
    public final b c;

    public a(com.yandex.go.scooters.mosru.data.a aVar, o oVar, b bVar) {
        this.a = aVar;
        this.b = oVar;
        this.c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersMosRuInteractor$getRemainingRidesTriggersShowModal$1 scootersMosRuInteractor$getRemainingRidesTriggersShowModal$1;
        int i;
        if (continuationImpl instanceof ScootersMosRuInteractor$getRemainingRidesTriggersShowModal$1) {
            scootersMosRuInteractor$getRemainingRidesTriggersShowModal$1 = (ScootersMosRuInteractor$getRemainingRidesTriggersShowModal$1) continuationImpl;
            int i2 = scootersMosRuInteractor$getRemainingRidesTriggersShowModal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMosRuInteractor$getRemainingRidesTriggersShowModal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersMosRuInteractor$getRemainingRidesTriggersShowModal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMosRuInteractor$getRemainingRidesTriggersShowModal$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersMosRuInteractor$getRemainingRidesTriggersShowModal$1.label = 1;
                    obj = this.c.d(scootersMosRuInteractor$getRemainingRidesTriggersShowModal$1);
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
                return ((nzn0) obj).a;
            }
        }
        scootersMosRuInteractor$getRemainingRidesTriggersShowModal$1 = new ScootersMosRuInteractor$getRemainingRidesTriggersShowModal$1(this, continuationImpl);
        Object obj2 = scootersMosRuInteractor$getRemainingRidesTriggersShowModal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMosRuInteractor$getRemainingRidesTriggersShowModal$1.label;
        if (i != 0) {
        }
        return ((nzn0) obj2).a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ScootersMosRuInteractor$getState$1 scootersMosRuInteractor$getState$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ScootersMosRuInteractor$getState$1) {
            scootersMosRuInteractor$getState$1 = (ScootersMosRuInteractor$getState$1) continuationImpl;
            int i2 = scootersMosRuInteractor$getState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMosRuInteractor$getState$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersMosRuInteractor$getState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMosRuInteractor$getState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersMosRuInteractor$getState$1.label = 1;
                    obj = this.c.a.f(scootersMosRuInteractor$getState$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                scootersMosRuInteractor$getState$1.label = 2;
                Object a = this.a.a(scootersMosRuInteractor$getState$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        scootersMosRuInteractor$getState$1 = new ScootersMosRuInteractor$getState$1(this, continuationImpl);
        obj = scootersMosRuInteractor$getState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMosRuInteractor$getState$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        ScootersMosRuInteractor$getWrappedAuthUrl$1 scootersMosRuInteractor$getWrappedAuthUrl$1;
        int i;
        ua41 ua41Var;
        if (continuationImpl instanceof ScootersMosRuInteractor$getWrappedAuthUrl$1) {
            scootersMosRuInteractor$getWrappedAuthUrl$1 = (ScootersMosRuInteractor$getWrappedAuthUrl$1) continuationImpl;
            int i2 = scootersMosRuInteractor$getWrappedAuthUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMosRuInteractor$getWrappedAuthUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersMosRuInteractor$getWrappedAuthUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMosRuInteractor$getWrappedAuthUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AuthType authType = AuthType.COOKIES;
                    scootersMosRuInteractor$getWrappedAuthUrl$1.L$0 = str;
                    scootersMosRuInteractor$getWrappedAuthUrl$1.label = 1;
                    obj = this.b.b(str, authType, scootersMosRuInteractor$getWrappedAuthUrl$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) scootersMosRuInteractor$getWrappedAuthUrl$1.L$0;
                    kotlin.b.b(obj);
                }
                ua41Var = (ua41) obj;
                if (!(ua41Var instanceof pne)) {
                    return ((pne) ua41Var).a;
                }
                if ((ua41Var instanceof io60) || (ua41Var instanceof u5o) || (ua41Var instanceof ab60)) {
                    return str;
                }
                w511.b();
                return null;
            }
        }
        scootersMosRuInteractor$getWrappedAuthUrl$1 = new ScootersMosRuInteractor$getWrappedAuthUrl$1(this, continuationImpl);
        Object obj2 = scootersMosRuInteractor$getWrappedAuthUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMosRuInteractor$getWrappedAuthUrl$1.label;
        if (i != 0) {
        }
        ua41Var = (ua41) obj2;
        if (!(ua41Var instanceof pne)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r8.b(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ScootersMosRuInteractor$isMosRuWebViewCanceled$1 scootersMosRuInteractor$isMosRuWebViewCanceled$1;
        int i;
        if (continuationImpl instanceof ScootersMosRuInteractor$isMosRuWebViewCanceled$1) {
            scootersMosRuInteractor$isMosRuWebViewCanceled$1 = (ScootersMosRuInteractor$isMosRuWebViewCanceled$1) continuationImpl;
            int i2 = scootersMosRuInteractor$isMosRuWebViewCanceled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMosRuInteractor$isMosRuWebViewCanceled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersMosRuInteractor$isMosRuWebViewCanceled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMosRuInteractor$isMosRuWebViewCanceled$1.label;
                com.yandex.go.scooters.mosru.data.a aVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersMosRuInteractor$isMosRuWebViewCanceled$1.label = 1;
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            kotlin.b.b(obj);
                            return Boolean.valueOf(((qzn0) obj) != null);
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    scootersMosRuInteractor$isMosRuWebViewCanceled$1.label = 3;
                    obj = aVar.a(scootersMosRuInteractor$isMosRuWebViewCanceled$1);
                }
                scootersMosRuInteractor$isMosRuWebViewCanceled$1.label = 2;
            }
        }
        scootersMosRuInteractor$isMosRuWebViewCanceled$1 = new ScootersMosRuInteractor$isMosRuWebViewCanceled$1(this, continuationImpl);
        Object obj2 = scootersMosRuInteractor$isMosRuWebViewCanceled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMosRuInteractor$isMosRuWebViewCanceled$1.label;
        com.yandex.go.scooters.mosru.data.a aVar2 = this.a;
        if (i != 0) {
        }
        scootersMosRuInteractor$isMosRuWebViewCanceled$1.label = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ScootersMosRuAuthStatus scootersMosRuAuthStatus, boolean z, ContinuationImpl continuationImpl) {
        ScootersMosRuInteractor$notifyAuthStatusChange$1 scootersMosRuInteractor$notifyAuthStatusChange$1;
        int i;
        if (continuationImpl instanceof ScootersMosRuInteractor$notifyAuthStatusChange$1) {
            scootersMosRuInteractor$notifyAuthStatusChange$1 = (ScootersMosRuInteractor$notifyAuthStatusChange$1) continuationImpl;
            int i2 = scootersMosRuInteractor$notifyAuthStatusChange$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMosRuInteractor$notifyAuthStatusChange$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersMosRuInteractor$notifyAuthStatusChange$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMosRuInteractor$notifyAuthStatusChange$1.label;
                com.yandex.go.scooters.mosru.data.a aVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (z) {
                        scootersMosRuInteractor$notifyAuthStatusChange$1.L$0 = scootersMosRuAuthStatus;
                        scootersMosRuInteractor$notifyAuthStatusChange$1.Z$0 = z;
                        scootersMosRuInteractor$notifyAuthStatusChange$1.label = 1;
                        if (aVar.b(scootersMosRuInteractor$notifyAuthStatusChange$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    scootersMosRuAuthStatus = (ScootersMosRuAuthStatus) scootersMosRuInteractor$notifyAuthStatusChange$1.L$0;
                    kotlin.b.b(obj);
                }
                aVar.e.l(scootersMosRuAuthStatus);
                return zy11.a;
            }
        }
        scootersMosRuInteractor$notifyAuthStatusChange$1 = new ScootersMosRuInteractor$notifyAuthStatusChange$1(this, continuationImpl);
        Object obj2 = scootersMosRuInteractor$notifyAuthStatusChange$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMosRuInteractor$notifyAuthStatusChange$1.label;
        com.yandex.go.scooters.mosru.data.a aVar2 = this.a;
        if (i != 0) {
        }
        aVar2.e.l(scootersMosRuAuthStatus);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Integer num, ContinuationImpl continuationImpl) {
        ScootersMosRuInteractor$shouldShowInfoPanelOnDiscoveryForRemainingRides$1 scootersMosRuInteractor$shouldShowInfoPanelOnDiscoveryForRemainingRides$1;
        int i;
        if (continuationImpl instanceof ScootersMosRuInteractor$shouldShowInfoPanelOnDiscoveryForRemainingRides$1) {
            scootersMosRuInteractor$shouldShowInfoPanelOnDiscoveryForRemainingRides$1 = (ScootersMosRuInteractor$shouldShowInfoPanelOnDiscoveryForRemainingRides$1) continuationImpl;
            int i2 = scootersMosRuInteractor$shouldShowInfoPanelOnDiscoveryForRemainingRides$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMosRuInteractor$shouldShowInfoPanelOnDiscoveryForRemainingRides$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersMosRuInteractor$shouldShowInfoPanelOnDiscoveryForRemainingRides$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMosRuInteractor$shouldShowInfoPanelOnDiscoveryForRemainingRides$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (num == null) {
                        return Boolean.FALSE;
                    }
                    scootersMosRuInteractor$shouldShowInfoPanelOnDiscoveryForRemainingRides$1.L$0 = num;
                    scootersMosRuInteractor$shouldShowInfoPanelOnDiscoveryForRemainingRides$1.label = 1;
                    obj = this.c.d(scootersMosRuInteractor$shouldShowInfoPanelOnDiscoveryForRemainingRides$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    num = (Integer) scootersMosRuInteractor$shouldShowInfoPanelOnDiscoveryForRemainingRides$1.L$0;
                    kotlin.b.b(obj);
                }
                List list = ((nzn0) obj).b;
                return Boolean.valueOf(list == null && list.contains(num));
            }
        }
        scootersMosRuInteractor$shouldShowInfoPanelOnDiscoveryForRemainingRides$1 = new ScootersMosRuInteractor$shouldShowInfoPanelOnDiscoveryForRemainingRides$1(this, continuationImpl);
        Object obj2 = scootersMosRuInteractor$shouldShowInfoPanelOnDiscoveryForRemainingRides$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMosRuInteractor$shouldShowInfoPanelOnDiscoveryForRemainingRides$1.label;
        if (i != 0) {
        }
        List list2 = ((nzn0) obj2).b;
        return Boolean.valueOf(list2 == null && list2.contains(num));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0093, code lost:
    
        if (r8.contains(r10) == true) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        if (r8.contains(r10) == true) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c7, code lost:
    
        if (r8.contains(r10) == true) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0086, code lost:
    
        if (r11 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a0, code lost:
    
        if (r11 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ba, code lost:
    
        if (r11 == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ScootersMosRuActionDialogOpenReason scootersMosRuActionDialogOpenReason, Integer num, ContinuationImpl continuationImpl) {
        ScootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1 scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1;
        int i;
        if (continuationImpl instanceof ScootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1) {
            scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1 = (ScootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1) continuationImpl;
            int i2 = scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1.label;
                boolean z = false;
                if (i == 0) {
                    if (i == 1) {
                        num = (Integer) scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1.L$1;
                        kotlin.b.b(obj);
                        List list = ((mzn0) obj).a;
                        if (list != null) {
                        }
                        return Boolean.valueOf(z);
                    }
                    if (i == 2) {
                        num = (Integer) scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1.L$1;
                        kotlin.b.b(obj);
                        List list2 = ((mzn0) obj).b;
                        if (list2 != null) {
                        }
                        return Boolean.valueOf(z);
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    num = (Integer) scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1.L$1;
                    kotlin.b.b(obj);
                    List list3 = ((mzn0) obj).c;
                    if (list3 != null) {
                    }
                    return Boolean.valueOf(z);
                }
                kotlin.b.b(obj);
                if (num == null) {
                    return Boolean.FALSE;
                }
                int i3 = fzn0.a[scootersMosRuActionDialogOpenReason.ordinal()];
                if (i3 == 1) {
                    scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1.L$0 = null;
                    scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1.L$1 = num;
                    scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1.label = 1;
                    obj = a(scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1);
                } else if (i3 == 2) {
                    scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1.L$0 = null;
                    scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1.L$1 = num;
                    scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1.label = 2;
                    obj = a(scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1);
                } else {
                    if (i3 != 3) {
                        if (i3 != 4 && i3 != 5) {
                            w511.b();
                            return null;
                        }
                        z = true;
                        return Boolean.valueOf(z);
                    }
                    scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1.L$0 = null;
                    scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1.L$1 = num;
                    scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1.label = 3;
                    obj = a(scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1);
                }
                return obj2;
            }
        }
        scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1 = new ScootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1(this, continuationImpl);
        Object obj3 = scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMosRuInteractor$shouldShowModalWindowForRemainingRides$1.label;
        boolean z2 = false;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(boolean z, ScootersMosRuActionDialogOpenReason scootersMosRuActionDialogOpenReason, ContinuationImpl continuationImpl) {
        ScootersMosRuInteractor$shouldShowReauthorizationModal$1 scootersMosRuInteractor$shouldShowReauthorizationModal$1;
        int i;
        if (continuationImpl instanceof ScootersMosRuInteractor$shouldShowReauthorizationModal$1) {
            scootersMosRuInteractor$shouldShowReauthorizationModal$1 = (ScootersMosRuInteractor$shouldShowReauthorizationModal$1) continuationImpl;
            int i2 = scootersMosRuInteractor$shouldShowReauthorizationModal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMosRuInteractor$shouldShowReauthorizationModal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersMosRuInteractor$shouldShowReauthorizationModal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMosRuInteractor$shouldShowReauthorizationModal$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!z) {
                        return Boolean.FALSE;
                    }
                    scootersMosRuInteractor$shouldShowReauthorizationModal$1.L$0 = scootersMosRuActionDialogOpenReason;
                    scootersMosRuInteractor$shouldShowReauthorizationModal$1.Z$0 = z;
                    scootersMosRuInteractor$shouldShowReauthorizationModal$1.label = 1;
                    obj = this.c.g(scootersMosRuInteractor$shouldShowReauthorizationModal$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    scootersMosRuActionDialogOpenReason = (ScootersMosRuActionDialogOpenReason) scootersMosRuInteractor$shouldShowReauthorizationModal$1.L$0;
                    kotlin.b.b(obj);
                }
                List list = (List) obj;
                int i3 = fzn0.a[scootersMosRuActionDialogOpenReason.ordinal()];
                return Boolean.valueOf(i3 == 1 ? i3 != 2 ? i3 != 3 ? false : list.contains(ScootersMosRuIntegrationExperiment.ReauthorizationModalScreen.ON_FINISH) : list.contains(ScootersMosRuIntegrationExperiment.ReauthorizationModalScreen.ON_OFFER) : list.contains(ScootersMosRuIntegrationExperiment.ReauthorizationModalScreen.ON_DISCOVERY));
            }
        }
        scootersMosRuInteractor$shouldShowReauthorizationModal$1 = new ScootersMosRuInteractor$shouldShowReauthorizationModal$1(this, continuationImpl);
        Object obj2 = scootersMosRuInteractor$shouldShowReauthorizationModal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMosRuInteractor$shouldShowReauthorizationModal$1.label;
        if (i != 0) {
        }
        List list2 = (List) obj2;
        int i32 = fzn0.a[scootersMosRuActionDialogOpenReason.ordinal()];
        return Boolean.valueOf(i32 == 1 ? i32 != 2 ? i32 != 3 ? false : list2.contains(ScootersMosRuIntegrationExperiment.ReauthorizationModalScreen.ON_FINISH) : list2.contains(ScootersMosRuIntegrationExperiment.ReauthorizationModalScreen.ON_OFFER) : list2.contains(ScootersMosRuIntegrationExperiment.ReauthorizationModalScreen.ON_DISCOVERY));
    }
}
