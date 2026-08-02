package com.yandex.go.trusted_contacts.data.repositories;

import com.yandex.go.trusted_contacts.data.entities.network.DeleteSettingsDto;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactDto;
import defpackage.a22;
import defpackage.bvf0;
import defpackage.cjw0;
import defpackage.cyi0;
import defpackage.ffx;
import defpackage.gci0;
import defpackage.gdj;
import defpackage.i3y;
import defpackage.i47;
import defpackage.ish;
import defpackage.jl40;
import defpackage.lh11;
import defpackage.lr40;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.og11;
import defpackage.on2;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u7q0;
import defpackage.uyj;
import defpackage.wls;
import defpackage.xrh;
import defpackage.yg11;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class a {
    public final yg11 a;
    public final ish b;
    public final i47 c;
    public final xrh d;
    public final a22 e;
    public final cjw0 f;
    public final tt2 g;
    public final i3y h;
    public volatile og11 i;
    public final r0 j;
    public final gci0 k;
    public final n0 l;
    public final n0 m;

    public a(on2 on2Var, yg11 yg11Var, ish ishVar, i47 i47Var, xrh xrhVar, a22 a22Var, cjw0 cjw0Var, tt2 tt2Var) {
        this.a = yg11Var;
        this.b = ishVar;
        this.c = i47Var;
        this.d = xrhVar;
        this.e = a22Var;
        this.f = cjw0Var;
        this.g = tt2Var;
        this.h = kotlin.a.a(new lr40(on2Var, 17));
        r0 c = bvf0.c(null);
        this.j = c;
        this.k = e.d(c);
        n0 c2 = ffx.c(0, 0, null, 7);
        this.l = c2;
        this.m = c2;
    }

    public static final Object a(a aVar, og11 og11Var, SuspendLambda suspendLambda) {
        aVar.g.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new TrustedContactsRepository$deleteMarkedContacts$2(og11Var, aVar, null), suspendLambda);
    }

    public final Object b(Continuation continuation) {
        return h(this.i, new TrustedContactsRepository$cancelDeleteMode$2(2, null), (ContinuationImpl) continuation);
    }

    public final Object c(Continuation continuation) {
        return h(this.i, new TrustedContactsRepository$confirmDeletion$2(this, null), (ContinuationImpl) continuation);
    }

    public final TrustedContactDto d(String str) {
        u7q0 u7q0Var;
        Object obj;
        og11 og11Var = this.i;
        if (og11Var != null && (u7q0Var = og11Var.c) != null) {
            Iterator it = u7q0Var.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((TrustedContactDto) ((cyi0) obj).d).a, str)) {
                    break;
                }
            }
            cyi0 cyi0Var = (cyi0) obj;
            if (cyi0Var != null) {
                return (TrustedContactDto) cyi0Var.d;
            }
        }
        return null;
    }

    public final Object e(SuspendLambda suspendLambda) {
        this.j.l(null);
        TrustedContactsRepository$loadTrustedContactsInfo$2 trustedContactsRepository$loadTrustedContactsInfo$2 = new TrustedContactsRepository$loadTrustedContactsInfo$2(this, null);
        this.g.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new TrustedContactsRepository$safeUpdateTrustedContactsData$2(trustedContactsRepository$loadTrustedContactsInfo$2, this, null), suspendLambda);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object f(String str, SuspendLambda suspendLambda) {
        return h(this.i, new TrustedContactsRepository$markContactAsDeleted$2(this, str, null), suspendLambda);
    }

    public final Object g(String str, Continuation continuation) {
        return h(this.i, new TrustedContactsRepository$onDeleteTrustingContactButtonClicked$2(this, str, null), (ContinuationImpl) continuation);
    }

    public final Object h(og11 og11Var, wls wlsVar, ContinuationImpl continuationImpl) {
        TrustedContactsRepository$requireSafeUpdateTrustedContactsData$2 trustedContactsRepository$requireSafeUpdateTrustedContactsData$2 = new TrustedContactsRepository$requireSafeUpdateTrustedContactsData$2(wlsVar, og11Var, null);
        this.g.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new TrustedContactsRepository$safeUpdateTrustedContactsData$2(trustedContactsRepository$requireSafeUpdateTrustedContactsData$2, this, null), continuationImpl);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object i(Continuation continuation) {
        return h(this.i, new TrustedContactsRepository$tryEnableDeleteMode$2(2, null), (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, ContinuationImpl continuationImpl) {
        TrustedContactsRepository$tryToShowDialogDeleteWarning$1 trustedContactsRepository$tryToShowDialogDeleteWarning$1;
        int i;
        gdj gdjVar;
        if (continuationImpl instanceof TrustedContactsRepository$tryToShowDialogDeleteWarning$1) {
            trustedContactsRepository$tryToShowDialogDeleteWarning$1 = (TrustedContactsRepository$tryToShowDialogDeleteWarning$1) continuationImpl;
            int i2 = trustedContactsRepository$tryToShowDialogDeleteWarning$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trustedContactsRepository$tryToShowDialogDeleteWarning$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trustedContactsRepository$tryToShowDialogDeleteWarning$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trustedContactsRepository$tryToShowDialogDeleteWarning$1.label;
                if (i != 0) {
                    b.b(obj);
                    xrh xrhVar = this.d;
                    og11 og11Var = this.i;
                    DeleteSettingsDto deleteSettingsDto = og11Var != null ? og11Var.f : null;
                    xrhVar.getClass();
                    gdj gdjVar2 = deleteSettingsDto != null ? new gdj(deleteSettingsDto.a, null, deleteSettingsDto.b, deleteSettingsDto.c, deleteSettingsDto.d) : null;
                    if (gdjVar2 == null) {
                        return zy11.a;
                    }
                    og11 og11Var2 = this.i;
                    wls trustedContactsRepository$tryToShowDialogDeleteWarning$2 = new TrustedContactsRepository$tryToShowDialogDeleteWarning$2(str, null);
                    trustedContactsRepository$tryToShowDialogDeleteWarning$1.L$0 = null;
                    trustedContactsRepository$tryToShowDialogDeleteWarning$1.L$1 = gdjVar2;
                    trustedContactsRepository$tryToShowDialogDeleteWarning$1.label = 1;
                    if (h(og11Var2, trustedContactsRepository$tryToShowDialogDeleteWarning$2, trustedContactsRepository$tryToShowDialogDeleteWarning$1) != obj2) {
                        gdjVar = gdjVar2;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return obj;
                }
                gdjVar = (gdj) trustedContactsRepository$tryToShowDialogDeleteWarning$1.L$1;
                b.b(obj);
                n0 n0Var = this.l;
                lh11 lh11Var = new lh11(gdjVar);
                trustedContactsRepository$tryToShowDialogDeleteWarning$1.L$0 = null;
                trustedContactsRepository$tryToShowDialogDeleteWarning$1.L$1 = null;
                trustedContactsRepository$tryToShowDialogDeleteWarning$1.label = 2;
                Object emit = n0Var.emit(lh11Var, trustedContactsRepository$tryToShowDialogDeleteWarning$1);
                return emit != obj2 ? obj2 : emit;
            }
        }
        trustedContactsRepository$tryToShowDialogDeleteWarning$1 = new TrustedContactsRepository$tryToShowDialogDeleteWarning$1(this, continuationImpl);
        Object obj3 = trustedContactsRepository$tryToShowDialogDeleteWarning$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trustedContactsRepository$tryToShowDialogDeleteWarning$1.label;
        if (i != 0) {
        }
        n0 n0Var2 = this.l;
        lh11 lh11Var2 = new lh11(gdjVar);
        trustedContactsRepository$tryToShowDialogDeleteWarning$1.L$0 = null;
        trustedContactsRepository$tryToShowDialogDeleteWarning$1.L$1 = null;
        trustedContactsRepository$tryToShowDialogDeleteWarning$1.label = 2;
        Object emit2 = n0Var2.emit(lh11Var2, trustedContactsRepository$tryToShowDialogDeleteWarning$1);
        if (emit2 != obj22) {
        }
    }

    public final Object k(TrustedContactDto trustedContactDto, boolean z, Continuation continuation) {
        this.g.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new TrustedContactsRepository$updateContact$2(z, this, trustedContactDto, null), continuation);
    }
}
