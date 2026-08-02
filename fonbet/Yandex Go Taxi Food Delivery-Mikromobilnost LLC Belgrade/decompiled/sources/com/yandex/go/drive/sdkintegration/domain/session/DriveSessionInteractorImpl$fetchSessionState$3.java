package com.yandex.go.drive.sdkintegration.domain.session;

import com.yandex.go.drive.DriveSdkExperiment;
import com.yandex.go.drive.api.models.GoDriveSessionState;
import com.yandex.go.drive.sdkintegration.source.DriveStoredRideSession;
import com.yandex.go.drive.sdkintegration.source.DriveStoredUserSession;
import defpackage.cvu0;
import defpackage.fnt;
import defpackage.jnt;
import defpackage.k4o;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tfm;
import defpackage.v3x;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.startup.launch.h;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Ljnt;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.drive.sdkintegration.domain.session.DriveSessionInteractorImpl$fetchSessionState$3", f = "DriveSessionInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class DriveSessionInteractorImpl$fetchSessionState$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriveSessionInteractorImpl$fetchSessionState$3(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DriveSessionInteractorImpl$fetchSessionState$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DriveSessionInteractorImpl$fetchSessionState$3 driveSessionInteractorImpl$fetchSessionState$3 = (DriveSessionInteractorImpl$fetchSessionState$3) create((vpr) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        driveSessionInteractorImpl$fetchSessionState$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        jnt jntVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (((r0) this.this$0.b()).getValue() == null && this.this$0.f.b() != null) {
            tfm tfmVar = this.this$0.a;
            DriveSdkExperiment driveSdkExperiment = (DriveSdkExperiment) tfmVar.c.a.c();
            DriveStoredUserSession driveStoredUserSession = (DriveStoredUserSession) tfmVar.d.c();
            Long l = driveStoredUserSession.a;
            if ((!cvu0.t(driveStoredUserSession.b, ((h) tfmVar.b).Hg(), false)) || ((tfmVar.a.d() - (l != null ? l.longValue() : 0L)) / 1000 > ((long) driveSdkExperiment.f))) {
                jntVar = null;
            } else {
                List list = driveStoredUserSession.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    String a = ((DriveStoredRideSession) obj2).getA();
                    if (a != null && a.length() != 0) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    DriveStoredRideSession driveStoredRideSession = (DriveStoredRideSession) it.next();
                    String a2 = driveStoredRideSession.getA();
                    String c = driveStoredRideSession.getC();
                    Long b = driveStoredRideSession.getB();
                    String d = driveStoredRideSession.getD();
                    String e = driveStoredRideSession.getE();
                    String f = driveStoredRideSession.getF();
                    String g = driveStoredRideSession.getG();
                    k4o a3 = GoDriveSessionState.a();
                    int h = driveStoredRideSession.getH();
                    arrayList2.add(new fnt(a2, c, b, d, e, f, g, (GoDriveSessionState) ((h < 0 || h >= a3.size()) ? GoDriveSessionState.Unrecognized : a3.get(h))));
                }
                jntVar = new jnt(arrayList2);
            }
            if (jntVar == null) {
                v3x.a.getClass();
            } else {
                v3x.a.getClass();
                r0 r0Var = (r0) this.this$0.b();
                r0Var.getClass();
                r0Var.m(null, jntVar);
            }
        }
        return zy11.a;
    }
}
