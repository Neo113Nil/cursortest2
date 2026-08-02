package com.yandex.go.summary.interactor.expanded.action;

import defpackage.alj0;
import defpackage.b8r;
import defpackage.c4r0;
import defpackage.caj0;
import defpackage.czi0;
import defpackage.gde;
import defpackage.gmi;
import defpackage.hoi;
import defpackage.jha1;
import defpackage.jl40;
import defpackage.kci;
import defpackage.lci;
import defpackage.maj0;
import defpackage.ngi;
import defpackage.ny61;
import defpackage.o3i;
import defpackage.oci;
import defpackage.oiv0;
import defpackage.paj0;
import defpackage.pj;
import defpackage.s421;
import defpackage.saj0;
import defpackage.tpr;
import defpackage.uio0;
import defpackage.w3i;
import defpackage.wiq0;
import defpackage.wt90;
import defpackage.ylj0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.summary.requirements.list.interactors.h0;

/* loaded from: classes14.dex */
public final class c {
    public final h0 a;
    public final s421 b;
    public final w3i c;
    public final uio0 d;
    public final c4r0 e;
    public final b8r f;
    public final maj0 g;
    public final caj0 h;
    public final wiq0 i;
    public final lci j;
    public final oci k;
    public final wt90 l;
    public final gde m;
    public final ru.yandex.taxi.delivery.impl.paid_insurance.d n;
    public final ngi o;
    public final o3i p;
    public final pj q;
    public final czi0 r;
    public final gmi s;

    public c(h0 h0Var, s421 s421Var, w3i w3iVar, uio0 uio0Var, c4r0 c4r0Var, b8r b8rVar, maj0 maj0Var, caj0 caj0Var, wiq0 wiq0Var, lci lciVar, oci ociVar, wt90 wt90Var, gde gdeVar, ru.yandex.taxi.delivery.impl.paid_insurance.d dVar, ngi ngiVar, o3i o3iVar, pj pjVar, czi0 czi0Var, gmi gmiVar) {
        this.a = h0Var;
        this.b = s421Var;
        this.c = w3iVar;
        this.d = uio0Var;
        this.e = c4r0Var;
        this.f = b8rVar;
        this.g = maj0Var;
        this.h = caj0Var;
        this.i = wiq0Var;
        this.j = lciVar;
        this.k = ociVar;
        this.l = wt90Var;
        this.m = gdeVar;
        this.n = dVar;
        this.o = ngiVar;
        this.p = o3iVar;
        this.q = pjVar;
        this.r = czi0Var;
        this.s = gmiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[EDGE_INSN: B:30:0x0085->B:17:0x0085 BREAK  A[LOOP:0: B:11:0x006f->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(alj0 alj0Var, oiv0 oiv0Var, ContinuationImpl continuationImpl) {
        RequirementUiActionInteractor$handleDeliveryIntervalsClicked$1 requirementUiActionInteractor$handleDeliveryIntervalsClicked$1;
        int i;
        wiq0 wiq0Var;
        caj0 caj0Var;
        String str;
        oiv0 oiv0Var2;
        String str2;
        Iterator it;
        saj0 saj0Var;
        zy11 zy11Var;
        kci kciVar;
        boolean isEmpty;
        oci ociVar;
        if (continuationImpl instanceof RequirementUiActionInteractor$handleDeliveryIntervalsClicked$1) {
            requirementUiActionInteractor$handleDeliveryIntervalsClicked$1 = (RequirementUiActionInteractor$handleDeliveryIntervalsClicked$1) continuationImpl;
            int i2 = requirementUiActionInteractor$handleDeliveryIntervalsClicked$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementUiActionInteractor$handleDeliveryIntervalsClicked$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requirementUiActionInteractor$handleDeliveryIntervalsClicked$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementUiActionInteractor$handleDeliveryIntervalsClicked$1.label;
                Object obj2 = null;
                wiq0Var = this.i;
                caj0Var = this.h;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str3 = alj0Var.a;
                    str = alj0Var.b;
                    tpr a = caj0Var.a(jha1.e(wiq0Var));
                    requirementUiActionInteractor$handleDeliveryIntervalsClicked$1.L$0 = null;
                    requirementUiActionInteractor$handleDeliveryIntervalsClicked$1.L$1 = oiv0Var;
                    requirementUiActionInteractor$handleDeliveryIntervalsClicked$1.L$2 = str3;
                    requirementUiActionInteractor$handleDeliveryIntervalsClicked$1.L$3 = str;
                    requirementUiActionInteractor$handleDeliveryIntervalsClicked$1.label = 1;
                    Object y = e.y(a, requirementUiActionInteractor$handleDeliveryIntervalsClicked$1);
                    if (y == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    oiv0Var2 = oiv0Var;
                    str2 = str3;
                    obj = y;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) requirementUiActionInteractor$handleDeliveryIntervalsClicked$1.L$3;
                    str2 = (String) requirementUiActionInteractor$handleDeliveryIntervalsClicked$1.L$2;
                    oiv0Var2 = (oiv0) requirementUiActionInteractor$handleDeliveryIntervalsClicked$1.L$1;
                    kotlin.b.b(obj);
                }
                it = ((paj0) obj).a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (jl40.l(((saj0) next).d, str2)) {
                        obj2 = next;
                        break;
                    }
                }
                saj0Var = (saj0) obj2;
                zy11Var = zy11.a;
                if (saj0Var != null && (kciVar = saj0Var.f) != null) {
                    hoi hoiVar = new hoi(str2, kciVar.c, new b(caj0Var.a(jha1.e(wiq0Var)), str2));
                    isEmpty = kciVar.d.isEmpty();
                    ociVar = this.k;
                    ociVar.f = isEmpty;
                    if (isEmpty && ociVar.a.a()) {
                        ociVar.d.g(zy11Var);
                    }
                    oiv0Var2.y(hoiVar, new ylj0(this, str2, str));
                }
                return zy11Var;
            }
        }
        requirementUiActionInteractor$handleDeliveryIntervalsClicked$1 = new RequirementUiActionInteractor$handleDeliveryIntervalsClicked$1(this, continuationImpl);
        Object obj3 = requirementUiActionInteractor$handleDeliveryIntervalsClicked$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementUiActionInteractor$handleDeliveryIntervalsClicked$1.label;
        Object obj22 = null;
        wiq0Var = this.i;
        caj0Var = this.h;
        if (i != 0) {
        }
        it = ((paj0) obj3).a.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        saj0Var = (saj0) obj22;
        zy11Var = zy11.a;
        if (saj0Var != null) {
            hoi hoiVar2 = new hoi(str2, kciVar.c, new b(caj0Var.a(jha1.e(wiq0Var)), str2));
            isEmpty = kciVar.d.isEmpty();
            ociVar = this.k;
            ociVar.f = isEmpty;
            if (isEmpty) {
                ociVar.d.g(zy11Var);
            }
            oiv0Var2.y(hoiVar2, new ylj0(this, str2, str));
        }
        return zy11Var;
    }
}
