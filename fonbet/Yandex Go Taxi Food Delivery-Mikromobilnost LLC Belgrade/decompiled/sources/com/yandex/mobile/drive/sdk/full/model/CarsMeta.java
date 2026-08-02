package com.yandex.mobile.drive.sdk.full.model;

import defpackage.jl40;
import defpackage.ysq0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/mobile/drive/sdk/full/model/CarsMeta;", "", "", "", "Lcom/yandex/mobile/drive/sdk/full/model/Model;", "models", "", "views", "<init>", "(Ljava/util/Map;Ljava/util/List;)V", "Ljava/util/Map;", "getModels", "()Ljava/util/Map;", "Ljava/util/List;", "a", "()Ljava/util/List;", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CarsMeta {

    @ysq0("models")
    private final Map<String, Model> models;

    @ysq0("views")
    private final List<Model> views;

    public CarsMeta(Map<String, Model> map, List<Model> list) {
        this.models = map;
        this.views = list;
    }

    /* renamed from: a, reason: from getter */
    public final List getViews() {
        return this.views;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarsMeta)) {
            return false;
        }
        CarsMeta carsMeta = (CarsMeta) obj;
        return jl40.l(this.models, carsMeta.models) && jl40.l(this.views, carsMeta.views);
    }

    public final int hashCode() {
        Map<String, Model> map = this.models;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        List<Model> list = this.views;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "CarsMeta(models=" + this.models + ", views=" + this.views + Extension.C_BRAKE;
    }
}
