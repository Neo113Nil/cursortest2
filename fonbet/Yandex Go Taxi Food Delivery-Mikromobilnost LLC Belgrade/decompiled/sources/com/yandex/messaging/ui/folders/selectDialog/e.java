package com.yandex.messaging.ui.folders.selectDialog;

import com.yandex.messaging.internal.g;
import defpackage.acu;
import defpackage.bu11;
import defpackage.cc0;
import defpackage.ds31;
import defpackage.e3n;
import defpackage.gci0;
import defpackage.iyj0;
import defpackage.jwr;
import defpackage.jx81;
import defpackage.k5c;
import defpackage.kp50;
import defpackage.mbq0;
import defpackage.mwr;
import defpackage.myj0;
import defpackage.ny61;
import defpackage.o430;
import defpackage.o4t;
import defpackage.oyh0;
import defpackage.oyj0;
import defpackage.p8b;
import defpackage.qbq0;
import defpackage.sbq0;
import defpackage.sc5;
import defpackage.t7t;
import defpackage.twi0;
import defpackage.twr;
import defpackage.v4t;
import defpackage.w511;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;

/* loaded from: classes15.dex */
public final class e extends sc5 {
    public final com.yandex.messaging.internal.backendconfig.a A;
    public final gci0 B;
    public final gci0 C;
    public final mbq0 w;
    public final o4t x;
    public final com.yandex.messaging.domain.folders.a y;
    public final twi0 z;

    public e(mbq0 mbq0Var, t7t t7tVar, o4t o4tVar, com.yandex.messaging.domain.folders.a aVar, twi0 twi0Var, g gVar, com.yandex.messaging.internal.backendconfig.a aVar2) {
        this.w = mbq0Var;
        this.x = o4tVar;
        this.y = aVar;
        this.z = twi0Var;
        this.A = aVar2;
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(t7tVar.a(zy11.a), new SelectFolderViewModel$special$$inlined$flatMapLatest$1(this, null));
        k5c a = ds31.a(this);
        wsr0 wsr0Var = xsr0.a;
        o430 o430Var = e3n.b;
        this.B = kotlinx.coroutines.flow.e.R(X, a, jx81.a(2, kp50.U(5, DurationUnit.SECONDS)), new sbq0(0));
        acu acuVar = new acu(gVar.a(new v4t(p8b.a(mbq0Var.b))), 22);
        k5c a2 = ds31.a(this);
        wsr0Var.getClass();
        this.C = kotlinx.coroutines.flow.e.R(acuVar, a2, wsr0.b, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0066, code lost:
    
        if (r13 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Y(e eVar, twr twrVar, ContinuationImpl continuationImpl) {
        SelectFolderViewModel$handleFolderSelection$1 selectFolderViewModel$handleFolderSelection$1;
        int i;
        oyj0 oyj0Var;
        Object obj;
        eVar.getClass();
        if (continuationImpl instanceof SelectFolderViewModel$handleFolderSelection$1) {
            selectFolderViewModel$handleFolderSelection$1 = (SelectFolderViewModel$handleFolderSelection$1) continuationImpl;
            int i2 = selectFolderViewModel$handleFolderSelection$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectFolderViewModel$handleFolderSelection$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = selectFolderViewModel$handleFolderSelection$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectFolderViewModel$handleFolderSelection$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    selectFolderViewModel$handleFolderSelection$1.L$0 = eVar;
                    selectFolderViewModel$handleFolderSelection$1.L$1 = twrVar;
                    selectFolderViewModel$handleFolderSelection$1.label = 1;
                    obj2 = eVar.y.a(new cc0(twrVar.c, twrVar.a, eVar.w.b), selectFolderViewModel$handleFolderSelection$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj2);
                            return zy11Var;
                        }
                        if (i == 3) {
                            kotlin.b.b(obj2);
                            return zy11Var;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    twrVar = (twr) selectFolderViewModel$handleFolderSelection$1.L$1;
                    eVar = (e) selectFolderViewModel$handleFolderSelection$1.L$0;
                    kotlin.b.b(obj2);
                }
                oyj0Var = (oyj0) obj2;
                if (!(oyj0Var instanceof myj0)) {
                    selectFolderViewModel$handleFolderSelection$1.L$0 = null;
                    selectFolderViewModel$handleFolderSelection$1.L$1 = null;
                    selectFolderViewModel$handleFolderSelection$1.label = 2;
                    Object W = eVar.W(new qbq0(new bu11(oyh0.chat_added_to_folder_success, eVar.C.a.getValue(), twrVar.b)), selectFolderViewModel$handleFolderSelection$1);
                    if (W != coroutineSingletons) {
                        W = zy11Var;
                    }
                    return W == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                if (!(oyj0Var instanceof iyj0)) {
                    w511.b();
                    return null;
                }
                mwr mwrVar = (mwr) ((iyj0) oyj0Var).a;
                selectFolderViewModel$handleFolderSelection$1.L$0 = null;
                selectFolderViewModel$handleFolderSelection$1.L$1 = null;
                selectFolderViewModel$handleFolderSelection$1.label = 3;
                eVar.getClass();
                if (!(mwrVar instanceof jwr) || (obj = eVar.W(new qbq0(new bu11(oyh0.folder_overflow_error)), selectFolderViewModel$handleFolderSelection$1)) != coroutineSingletons) {
                    obj = zy11Var;
                }
                if (obj == coroutineSingletons) {
                }
            }
        }
        selectFolderViewModel$handleFolderSelection$1 = new SelectFolderViewModel$handleFolderSelection$1(eVar, continuationImpl);
        Object obj22 = selectFolderViewModel$handleFolderSelection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectFolderViewModel$handleFolderSelection$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        oyj0Var = (oyj0) obj22;
        if (!(oyj0Var instanceof myj0)) {
        }
    }
}
