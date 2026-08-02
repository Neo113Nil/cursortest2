package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.net.taxi.dto.response.NearestZoneResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public class pv0 {
    public final Address a;
    public final k56 b;
    public final mq40 c;
    public final NearestZoneResponse d;
    public final List e;
    public final String f;
    public final yuf0 g;
    public final List h;
    public final dub0 i;
    public zzs j;
    public boolean k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pv0(Address address, k56 k56Var, mq40 mq40Var, NearestZoneResponse nearestZoneResponse, List list, String str, yuf0 yuf0Var, dub0 dub0Var, int i) {
        this(address, r5, r6, r7, r1 != 0 ? r3 : list, (i & 32) != 0 ? "default_tag" : str, (i & 64) != 0 ? null : yuf0Var, null, (i & 256) != 0 ? null : r3, (i & 512) != 0 ? null : dub0Var);
        k56 k56Var2 = (i & 2) != 0 ? new k56(0) : k56Var;
        mq40 mq40Var2 = (i & 4) != 0 ? mq40.f : mq40Var;
        NearestZoneResponse nearestZoneResponse2 = (i & 8) != 0 ? null : nearestZoneResponse;
        int i2 = i & 16;
        EmptyList emptyList = EmptyList.a;
    }

    public final zzs a() {
        Object obj;
        List list = this.h;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                v7v0 v7v0Var = (v7v0) obj;
                if (!jl40.l(v7v0Var != null ? v7v0Var.a : null, this.a.B())) {
                    break;
                }
            }
            v7v0 v7v0Var2 = (v7v0) obj;
            if (v7v0Var2 != null) {
                return v7v0Var2.a;
            }
        }
        return null;
    }

    public final boolean b() {
        String zoneName = this.a.getZoneName();
        return (zoneName == null || zoneName.length() == 0) ? false : true;
    }

    public final pv0 c(Address address) {
        return new pv0(address, this.b, this.c, this.d, this.e, this.f, this.g, null, 896);
    }

    public pv0(Address address, k56 k56Var, mq40 mq40Var, NearestZoneResponse nearestZoneResponse, List list, String str, yuf0 yuf0Var, seu seuVar, List list2, dub0 dub0Var) {
        this.a = address;
        this.b = k56Var;
        this.c = mq40Var;
        this.d = nearestZoneResponse;
        this.e = list;
        this.f = str;
        this.g = yuf0Var;
        this.h = list2;
        this.i = dub0Var;
    }
}
