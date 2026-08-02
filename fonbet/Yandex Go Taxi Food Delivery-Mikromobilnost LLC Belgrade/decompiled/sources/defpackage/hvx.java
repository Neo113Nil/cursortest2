package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderStatusDto;
import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderTypeDto;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lhvx;", "", "Companion", "fvx", "gvx", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class hvx {
    public static final gvx Companion = new gvx();
    public static final i3y[] d;
    public final String a;
    public final LinkedOrderStatusDto b;
    public final LinkedOrderTypeDto c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, a.b(lazyThreadSafetyMode, new vix(17)), a.b(lazyThreadSafetyMode, new vix(18))};
    }

    public /* synthetic */ hvx(int i, String str, LinkedOrderStatusDto linkedOrderStatusDto, LinkedOrderTypeDto linkedOrderTypeDto) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = linkedOrderStatusDto;
        }
        if ((i & 4) == 0) {
            this.c = LinkedOrderTypeDto.UNKNOWN;
        } else {
            this.c = linkedOrderTypeDto;
        }
    }

    public static final /* synthetic */ void e(hvx hvxVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(hvxVar.a, "")) {
            yjdVar.o(serialDescriptor, 0, hvxVar.a);
        }
        boolean F = yjdVar.F();
        i3y[] i3yVarArr = d;
        if (F || hvxVar.b != null) {
            yjdVar.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), hvxVar.b);
        }
        if (!yjdVar.F() && hvxVar.c == LinkedOrderTypeDto.UNKNOWN) {
            return;
        }
        yjdVar.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), hvxVar.c);
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final LinkedOrderStatusDto getB() {
        return this.b;
    }

    /* renamed from: d, reason: from getter */
    public final LinkedOrderTypeDto getC() {
        return this.c;
    }

    public hvx() {
        LinkedOrderTypeDto linkedOrderTypeDto = LinkedOrderTypeDto.UNKNOWN;
        this.a = "";
        this.b = null;
        this.c = linkedOrderTypeDto;
    }
}
