package com.yandex.passport.sloth.command.performers;

import com.yandex.passport.sloth.SlothMetricaEvent$Event;
import com.yandex.passport.sloth.command.data.SlothAccountType;
import com.yandex.passport.sloth.command.data.g0;
import com.yandex.passport.sloth.data.SlothMode;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.data.SlothRegistrationType;
import com.yandex.passport.sloth.data.SlothVariant$BiometricVerification;
import com.yandex.passport.sloth.data.a0;
import com.yandex.passport.sloth.data.b0;
import com.yandex.passport.sloth.data.c0;
import com.yandex.passport.sloth.data.y;
import com.yandex.passport.sloth.dependencies.SlothLoginProperties;
import com.yandex.passport.sloth.n0;
import com.yandex.passport.sloth.y0;
import com.yandex.passport.sloth.z0;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.iqn;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.w511;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class l implements com.yandex.passport.sloth.command.q {
    public final SlothParams a;
    public final com.yandex.passport.sloth.v b;
    public final z0 c;
    public final y0 d;

    public l(SlothParams slothParams, com.yandex.passport.sloth.v vVar, z0 z0Var, y0 y0Var) {
        this.a = slothParams;
        this.b = vVar;
        this.c = z0Var;
        this.d = y0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0112, code lost:
    
        if (r8.b(r9, r0) == r1) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.passport.sloth.command.q
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(g0 g0Var, ContinuationImpl continuationImpl) {
        ReadyCommandPerformer$performCommand$1 readyCommandPerformer$performCommand$1;
        int i;
        l lVar;
        boolean z;
        SlothRegistrationType slothRegistrationType;
        if (continuationImpl instanceof ReadyCommandPerformer$performCommand$1) {
            readyCommandPerformer$performCommand$1 = (ReadyCommandPerformer$performCommand$1) continuationImpl;
            int i2 = readyCommandPerformer$performCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                readyCommandPerformer$performCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj = readyCommandPerformer$performCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = readyCommandPerformer$performCommand$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean l = jl40.l(g0Var.a, WriteBlocks.OK);
                    com.yandex.passport.sloth.q qVar = new com.yandex.passport.sloth.q(l);
                    readyCommandPerformer$performCommand$1.L$0 = this;
                    readyCommandPerformer$performCommand$1.Z$0 = l;
                    readyCommandPerformer$performCommand$1.label = 1;
                    if (this.b.b(qVar, readyCommandPerformer$performCommand$1) != coroutineSingletons) {
                        lVar = this;
                        z = l;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return new iqn(com.yandex.passport.sloth.command.u.c);
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = readyCommandPerformer$performCommand$1.Z$0;
                lVar = (l) readyCommandPerformer$performCommand$1.L$0;
                kotlin.b.b(obj);
                if (z) {
                    com.yandex.passport.sloth.v vVar = lVar.b;
                    com.yandex.passport.sloth.q qVar2 = new com.yandex.passport.sloth.q(z);
                    readyCommandPerformer$performCommand$1.L$0 = null;
                    readyCommandPerformer$performCommand$1.label = 2;
                } else {
                    z0 z0Var = lVar.c;
                    SlothParams slothParams = lVar.a;
                    SlothMode mode = slothParams.getVariant().getMode();
                    y0 y0Var = lVar.d;
                    c0 variant = slothParams.getVariant();
                    y0Var.getClass();
                    if (variant instanceof com.yandex.passport.sloth.data.g) {
                        SlothLoginProperties c = ((com.yandex.passport.sloth.data.g) variant).c();
                        slothRegistrationType = y0Var.a.a;
                        if (slothRegistrationType == SlothRegistrationType.Portal && c.getSupportedAccountTypes().contains(SlothAccountType.LITE)) {
                            slothRegistrationType = SlothRegistrationType.Neophonish;
                        }
                    } else {
                        if (!(variant instanceof com.yandex.passport.sloth.data.n) && !(variant instanceof com.yandex.passport.sloth.data.k) && !(variant instanceof com.yandex.passport.sloth.data.l) && !(variant instanceof com.yandex.passport.sloth.data.m) && !(variant instanceof com.yandex.passport.sloth.data.u) && !(variant instanceof b0) && !(variant instanceof com.yandex.passport.sloth.data.j) && !(variant instanceof a0) && !(variant instanceof com.yandex.passport.sloth.data.o) && !(variant instanceof com.yandex.passport.sloth.data.i) && !(variant instanceof com.yandex.passport.sloth.data.r) && !(variant instanceof com.yandex.passport.sloth.data.q) && !(variant instanceof y) && !(variant instanceof SlothVariant$BiometricVerification) && !(variant instanceof com.yandex.passport.sloth.data.v)) {
                            w511.b();
                            return null;
                        }
                        slothRegistrationType = SlothRegistrationType.Nothing;
                    }
                    z0Var.a(new n0(SlothMetricaEvent$Event.ACTIVATED, kotlin.collections.b.i(new Pair("mode", mode.getValue()), new Pair("reg_type", slothRegistrationType.getValue()))));
                }
                return new iqn(com.yandex.passport.sloth.command.u.c);
            }
        }
        readyCommandPerformer$performCommand$1 = new ReadyCommandPerformer$performCommand$1(this, continuationImpl);
        Object obj2 = readyCommandPerformer$performCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = readyCommandPerformer$performCommand$1.label;
        if (i != 0) {
        }
        if (z) {
        }
        return new iqn(com.yandex.passport.sloth.command.u.c);
    }
}
