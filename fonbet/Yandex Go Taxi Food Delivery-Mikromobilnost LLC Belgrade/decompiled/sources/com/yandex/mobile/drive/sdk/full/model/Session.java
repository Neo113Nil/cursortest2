package com.yandex.mobile.drive.sdk.full.model;

import defpackage.jl40;
import defpackage.ly3;
import defpackage.ysq0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/yandex/mobile/drive/sdk/full/model/Session;", "", "Lcom/yandex/mobile/drive/sdk/full/model/User;", "user", "Lcom/yandex/mobile/drive/sdk/full/model/CarsMeta;", "carsMeta", "", "Lcom/yandex/mobile/drive/sdk/full/model/Car;", "cars", "", RemoteBioParameters.TIME, "Lcom/yandex/mobile/drive/sdk/full/model/RideSession;", "sessions", "<init>", "(Lcom/yandex/mobile/drive/sdk/full/model/User;Lcom/yandex/mobile/drive/sdk/full/model/CarsMeta;Ljava/util/List;Ljava/lang/Double;Ljava/util/List;)V", "Lcom/yandex/mobile/drive/sdk/full/model/User;", "e", "()Lcom/yandex/mobile/drive/sdk/full/model/User;", "Lcom/yandex/mobile/drive/sdk/full/model/CarsMeta;", "b", "()Lcom/yandex/mobile/drive/sdk/full/model/CarsMeta;", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "c", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Session {

    @ysq0("cars")
    private final List<Car> cars;

    @ysq0("cars_meta")
    private final CarsMeta carsMeta;

    @ysq0("sessions")
    private final List<RideSession> sessions;

    @ysq0("server_time")
    private final Double time;

    @ysq0("user")
    private final User user;

    public Session(User user, CarsMeta carsMeta, List<Car> list, Double d, List<RideSession> list2) {
        this.user = user;
        this.carsMeta = carsMeta;
        this.cars = list;
        this.time = d;
        this.sessions = list2;
    }

    /* renamed from: a, reason: from getter */
    public final List getCars() {
        return this.cars;
    }

    /* renamed from: b, reason: from getter */
    public final CarsMeta getCarsMeta() {
        return this.carsMeta;
    }

    /* renamed from: c, reason: from getter */
    public final List getSessions() {
        return this.sessions;
    }

    /* renamed from: d, reason: from getter */
    public final Double getTime() {
        return this.time;
    }

    /* renamed from: e, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Session)) {
            return false;
        }
        Session session = (Session) obj;
        return jl40.l(this.user, session.user) && jl40.l(this.carsMeta, session.carsMeta) && jl40.l(this.cars, session.cars) && jl40.l(this.time, session.time) && jl40.l(this.sessions, session.sessions);
    }

    public final boolean f() {
        Details details;
        User user = this.user;
        return jl40.l((user == null || (details = user.getDetails()) == null) ? null : details.getStatus(), ClidProvider.APP_ACTIVE);
    }

    public final int hashCode() {
        User user = this.user;
        int hashCode = (user == null ? 0 : user.hashCode()) * 31;
        CarsMeta carsMeta = this.carsMeta;
        int hashCode2 = (hashCode + (carsMeta == null ? 0 : carsMeta.hashCode())) * 31;
        List<Car> list = this.cars;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Double d = this.time;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        List<RideSession> list2 = this.sessions;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        User user = this.user;
        CarsMeta carsMeta = this.carsMeta;
        List<Car> list = this.cars;
        Double d = this.time;
        List<RideSession> list2 = this.sessions;
        StringBuilder sb = new StringBuilder("Session(user=");
        sb.append(user);
        sb.append(", carsMeta=");
        sb.append(carsMeta);
        sb.append(", cars=");
        sb.append(list);
        sb.append(", time=");
        sb.append(d);
        sb.append(", sessions=");
        return ly3.s(sb, list2, Extension.C_BRAKE);
    }
}
