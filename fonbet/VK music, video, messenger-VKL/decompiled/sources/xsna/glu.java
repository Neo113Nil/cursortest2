package xsna;

import com.vk.api.generated.market.dto.MarketGroupForAttachDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GroupItem.kt */
/* loaded from: classes18.dex */
public final class glu implements hfz {
    public final UserId b;
    public final Image c;
    public final String d;
    public final boolean e;
    public final Boolean f;
    public final nlu g;

    /* compiled from: GroupItem.kt */
    public static final class a {
        public static ArrayList a(UserId userId, List list) {
            List<MarketGroupForAttachDto> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (MarketGroupForAttachDto marketGroupForAttachDto : list2) {
                UserId g = marketGroupForAttachDto.g();
                Image t = bu00.t(marketGroupForAttachDto.i());
                String title = marketGroupForAttachDto.getTitle();
                boolean f = epx.f(marketGroupForAttachDto.g(), userId);
                Boolean j = marketGroupForAttachDto.j();
                Boolean valueOf = Boolean.valueOf(j != null ? j.booleanValue() : false);
                Boolean k = marketGroupForAttachDto.k();
                Boolean f2 = marketGroupForAttachDto.f();
                Boolean d = marketGroupForAttachDto.d();
                String e = marketGroupForAttachDto.e();
                arrayList.add(new glu(g, t, title, f, valueOf, (k == null || f2 == null || d == null || e == null) ? null : new nlu(e, k.booleanValue(), f2.booleanValue(), d.booleanValue())));
            }
            return arrayList;
        }
    }

    public glu(UserId userId, Image image, String str, boolean z, Boolean bool, nlu nluVar) {
        this.b = userId;
        this.c = image;
        this.d = str;
        this.e = z;
        this.f = bool;
        this.g = nluVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glu)) {
            return false;
        }
        glu gluVar = (glu) obj;
        return epx.f(this.b, gluVar.b) && epx.f(this.c, gluVar.c) && epx.f(this.d, gluVar.d) && this.e == gluVar.e && epx.f(this.f, gluVar.f) && epx.f(this.g, gluVar.g);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.b.b);
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(fq.b(this.c, Long.hashCode(this.b.b) * 31, 31), 31, this.d), 31, this.e);
        Boolean bool = this.f;
        int hashCode = (b + (bool == null ? 0 : bool.hashCode())) * 31;
        nlu nluVar = this.g;
        return hashCode + (nluVar != null ? nluVar.hashCode() : 0);
    }

    public final String toString() {
        return "GroupItem(groupId=" + this.b + ", photo=" + this.c + ", title=" + this.d + ", isSelected=" + this.e + ", verified=" + this.f + ", marketInfo=" + this.g + ')';
    }
}
