package xsna;

import android.util.ArraySet;
import com.ironsource.X3;
import com.vk.channels.api.Channel;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: ChannelsHistory.kt */
/* loaded from: classes2.dex */
public final class qfb extends x7v<Channel, qfb> {
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final ArrayList f;
    public final LinkedHashMap g;

    public qfb() {
        this(0);
    }

    @Override // xsna.x7v
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return qfb.class.equals(obj != null ? obj.getClass() : null) && super.equals(obj) && epx.f(this.g, ((qfb) obj).g);
    }

    @Override // xsna.x7v
    public final boolean g() {
        return this.d;
    }

    @Override // xsna.x7v
    public final boolean h() {
        return this.e;
    }

    @Override // xsna.x7v
    public final int hashCode() {
        return this.g.hashCode() + (super.hashCode() * 31);
    }

    @Override // xsna.x7v
    public final boolean i() {
        return this.b;
    }

    @Override // xsna.x7v
    public final boolean j() {
        return this.c;
    }

    @Override // xsna.x7v
    public final List<Channel> k() {
        return this.f;
    }

    public final qfb r() {
        qfb qfbVar = new qfb(0);
        ArrayList arrayList = qfbVar.f;
        arrayList.clear();
        qfbVar.d().clear();
        LinkedHashMap linkedHashMap = qfbVar.g;
        linkedHashMap.clear();
        qfbVar.b = false;
        qfbVar.c = false;
        qfbVar.d = false;
        qfbVar.e = false;
        arrayList.addAll(this.f);
        qfbVar.d().addAll((ArraySet<? extends Number>) d());
        linkedHashMap.putAll(this.g);
        qfbVar.d = this.d;
        qfbVar.e = this.e;
        qfbVar.b = this.b;
        qfbVar.c = this.c;
        return qfbVar;
    }

    public final LinkedHashMap s() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsHistory{ channels_");
        StringBuilder sb2 = new StringBuilder();
        j5g.f0(this.f, sb2, null, "ids=[", X3.j.e, new gt(6), 50);
        sb.append(sb2.toString());
        sb.append(", hasHistoryAfter=");
        sb.append(this.d);
        sb.append(", hasHistoryAfterCached=");
        sb.append(this.e);
        sb.append(", hasHistoryBefore=");
        sb.append(this.b);
        sb.append(", hasHistoryBeforeCached=");
        sb.append(this.c);
        sb.append(", latestMessages=");
        sb.append(this.g);
        sb.append(", expired=");
        sb.append(d());
        sb.append('}');
        return sb.toString();
    }

    public qfb(List<Channel> list, Map<Long, ? extends Msg> map, boolean z, boolean z2, boolean z3, boolean z4) {
        super(list.size(), z, z2, z3, z4);
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = new ArrayList(list);
        this.g = new LinkedHashMap(map);
    }

    public qfb(int i) {
        this(EmptyList.b, jgp.b, false, false, false, false);
    }
}
