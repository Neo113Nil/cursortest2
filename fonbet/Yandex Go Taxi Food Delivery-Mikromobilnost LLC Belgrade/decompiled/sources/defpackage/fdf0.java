package defpackage;

import com.yandex.messaging.core.db.AppDatabaseRoom;
import com.yandex.messaging.core.db.AppDatabaseRoom_Impl;

/* loaded from: classes15.dex */
public final /* synthetic */ class fdf0 implements tls {
    public final /* synthetic */ int a;

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        AppDatabaseRoom appDatabaseRoom = (AppDatabaseRoom) obj;
        switch (this.a) {
            case 0:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).b();
            case 1:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).K();
            case 2:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).d();
            case 3:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).u();
            case 4:
                return Long.valueOf(appDatabaseRoom.t());
            case 5:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).C();
            case 6:
                return appDatabaseRoom.startTransaction();
            case 7:
                return appDatabaseRoom.takeSnapshot();
            case 8:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).s0();
            case 9:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).k0();
            case 10:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).E();
            case 11:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).L();
            case 12:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).Y();
            case 13:
                return appDatabaseRoom.U();
            case 14:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).h0();
            case 15:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).R();
            case 16:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).Z();
            case 17:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).m0();
            case 18:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).z();
            case 19:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).J();
            case 20:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).j0();
            case 21:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).g0();
            case 22:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).F();
            case 23:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).G();
            case 24:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).S();
            case 25:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).B();
            case 26:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).a0();
            case 27:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).x();
            case 28:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).o();
            default:
                return ((AppDatabaseRoom_Impl) appDatabaseRoom).v();
        }
    }
}
