package xsna;

import com.vk.api.generated.donut.dto.DonutGetLevelsResponseDto;
import com.vk.api.generated.donut.dto.DonutLevelDto;
import com.vk.dto.common.Peer;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: LoadGroupDonutsCmd.kt */
/* loaded from: classes2.dex */
public final class hpz extends le6<a> {
    public final boolean b;

    /* compiled from: LoadGroupDonutsCmd.kt */
    public static final class a {
        public final List<e0o> a;

        public a(List<e0o> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Result(levels="), this.a);
        }
    }

    public hpz() {
        this(0);
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        Peer Q0 = w2wVar.Q0();
        Q0.getClass();
        if (!Q0.Ab(Peer.Type.GROUP)) {
            Q0 = null;
        }
        if (Q0 == null) {
            return new a(EmptyList.b);
        }
        List<DonutLevelDto> e = ((DonutGetLevelsResponseDto) bz2.l(dy2.c(new dy2(), com.vk.dto.common.a.b(Q0), null, 26), this.b)).e();
        ArrayList arrayList = new ArrayList(c5g.u(e, 10));
        for (DonutLevelDto donutLevelDto : e) {
            arrayList.add(new e0o(donutLevelDto.getId(), donutLevelDto.getTitle(), donutLevelDto.d(), !donutLevelDto.f()));
        }
        return new a(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hpz) && this.b == ((hpz) obj).b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return defpackage.q0.a(new StringBuilder("LoadGroupDonutsCmd(awaitNetwork="), this.b, ')');
    }

    public hpz(int i) {
        this.b = true;
    }
}
