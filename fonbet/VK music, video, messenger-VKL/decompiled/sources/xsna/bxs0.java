package xsna;

import com.vk.api.generated.messages.dto.MessagesGetVideoMessageShapesResponseDto;
import com.vk.api.generated.messages.dto.MessagesVideoMessageShapeResponseItemDto;
import com.vk.dto.common.Source;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: VideoMsgRecordStencilGet.kt */
/* loaded from: classes2.dex */
public final class bxs0 extends le6<List<? extends e0l0>> {
    public final Source b;
    public w2w c;

    /* compiled from: VideoMsgRecordStencilGet.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public bxs0(Source source) {
        this.b = source;
    }

    @Override // xsna.le6
    public final List<? extends e0l0> e(w2w w2wVar) {
        this.c = w2wVar;
        int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            return f();
        }
        if (i != 2) {
            if (i == 3) {
                return g();
            }
            throw new NoWhenBranchMatchedException();
        }
        w2w w2wVar2 = this.c;
        if (w2wVar2 == null) {
            w2wVar2 = null;
        }
        long f1 = w2wVar2.f1();
        w2w w2wVar3 = this.c;
        if (w2wVar3 == null) {
            w2wVar3 = null;
        }
        long c = w2wVar3.I0().x().c();
        w2w w2wVar4 = this.c;
        return f1 - c >= (w2wVar4 != null ? w2wVar4 : null).getConfig().t0 ? g() : f();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bxs0) && this.b == ((bxs0) obj).b;
    }

    public final ArrayList f() {
        List<j0l0> all;
        w2w w2wVar = this.c;
        if (w2wVar == null) {
            w2wVar = null;
        }
        List<Integer> d = w2wVar.I0().x().d();
        if (d.isEmpty()) {
            w2w w2wVar2 = this.c;
            if (w2wVar2 == null) {
                w2wVar2 = null;
            }
            all = w2wVar2.I0().x().getAll();
        } else {
            w2w w2wVar3 = this.c;
            if (w2wVar3 == null) {
                w2wVar3 = null;
            }
            all = w2wVar3.I0().x().a(d);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            j0l0 j0l0Var = (j0l0) obj;
            w2w w2wVar4 = this.c;
            if (w2wVar4 == null) {
                w2wVar4 = null;
            }
            long f1 = w2wVar4.f1();
            if (f1 >= j0l0Var.c) {
                long j = j0l0Var.d;
                if (f1 <= j || j == 0) {
                    if (j0l0Var.a != 0) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j0l0 j0l0Var2 = (j0l0) it.next();
            arrayList2.add(new e0l0(j0l0Var2.a, j0l0Var2.b));
        }
        return arrayList2;
    }

    public final ArrayList g() {
        w2w w2wVar = this.c;
        if (w2wVar == null) {
            w2wVar = null;
        }
        MessagesGetVideoMessageShapesResponseDto messagesGetVideoMessageShapesResponseDto = (MessagesGetVideoMessageShapesResponseDto) bz2.c(new gts0(w2wVar.I0().x().getVersion()), null);
        w2w w2wVar2 = this.c;
        if (w2wVar2 == null) {
            w2wVar2 = null;
        }
        long f1 = w2wVar2.f1();
        w2w w2wVar3 = this.c;
        if (w2wVar3 == null) {
            w2wVar3 = null;
        }
        its0 x = w2wVar3.I0().x();
        List<Integer> d = messagesGetVideoMessageShapesResponseDto.d();
        if (d == null) {
            d = EmptyList.b;
        }
        x.f(d);
        w2w w2wVar4 = this.c;
        if (w2wVar4 == null) {
            w2wVar4 = null;
        }
        its0 x2 = w2wVar4.I0().x();
        List<MessagesVideoMessageShapeResponseItemDto> e = messagesGetVideoMessageShapesResponseDto.e();
        ArrayList arrayList = new ArrayList(c5g.u(e, 10));
        for (MessagesVideoMessageShapeResponseItemDto messagesVideoMessageShapeResponseItemDto : e) {
            arrayList.add(new j0l0(messagesVideoMessageShapeResponseItemDto.f() * 1000, messagesVideoMessageShapeResponseItemDto.d() * 1000, messagesVideoMessageShapeResponseItemDto.getId(), messagesVideoMessageShapeResponseItemDto.e()));
        }
        x2.e(arrayList);
        w2w w2wVar5 = this.c;
        if (w2wVar5 == null) {
            w2wVar5 = null;
        }
        w2wVar5.I0().x().g(messagesGetVideoMessageShapesResponseDto.f());
        w2w w2wVar6 = this.c;
        if (w2wVar6 == null) {
            w2wVar6 = null;
        }
        w2wVar6.I0().x().b(f1);
        w2w w2wVar7 = this.c;
        if (w2wVar7 == null) {
            w2wVar7 = null;
        }
        bzp S0 = w2wVar7.S0();
        w2w w2wVar8 = this.c;
        S0.h((w2wVar8 != null ? w2wVar8 : null).I0().x().getAll());
        return f();
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "VideoMsgRecordStencilGet(source=" + this.b + ')';
    }
}
