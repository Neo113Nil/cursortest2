package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.requirements.models.domain.BubbleAvailability;
import ru.yandex.taxi.requirements.models.domain.PreorderBubbleAvailability;

/* loaded from: classes6.dex */
public final class bdj0 {
    public static final bdj0 k = new bdj0(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023);
    public final List a;
    public final List b;
    public final PreorderBubbleAvailability c;
    public final BubbleAvailability d;
    public final BubbleAvailability e;
    public final BubbleAvailability f;
    public final BubbleAvailability g;
    public final BubbleAvailability h;
    public final BubbleAvailability i;
    public final BubbleAvailability j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ bdj0(ArrayList arrayList, PreorderBubbleAvailability preorderBubbleAvailability, BubbleAvailability bubbleAvailability, int i) {
        this(r2, r3, r4, r5, (i & 16) != 0 ? r5 : bubbleAvailability, r5, r5, r5, r5, r5);
        int i2 = i & 2;
        List list = EmptyList.a;
        List list2 = i2 != 0 ? list : arrayList;
        PreorderBubbleAvailability preorderBubbleAvailability2 = (i & 4) != 0 ? PreorderBubbleAvailability.HIDDEN : preorderBubbleAvailability;
        BubbleAvailability bubbleAvailability2 = BubbleAvailability.HIDDEN;
    }

    public final boolean a() {
        return this.e == BubbleAvailability.UNAVAILABLE;
    }

    public final boolean b() {
        PreorderBubbleAvailability preorderBubbleAvailability = PreorderBubbleAvailability.UNAVAILABLE_SELECTED_TIME;
        PreorderBubbleAvailability preorderBubbleAvailability2 = this.c;
        return preorderBubbleAvailability2 == preorderBubbleAvailability || preorderBubbleAvailability2 == PreorderBubbleAvailability.UNAVAILABLE_IN_TARIFF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdj0)) {
            return false;
        }
        bdj0 bdj0Var = (bdj0) obj;
        return jl40.l(this.a, bdj0Var.a) && jl40.l(this.b, bdj0Var.b) && this.c == bdj0Var.c && this.d == bdj0Var.d && this.e == bdj0Var.e && this.f == bdj0Var.f && this.g == bdj0Var.g && this.h == bdj0Var.h && this.i == bdj0Var.i && this.j == bdj0Var.j;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bdj0() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023);
    }

    public bdj0(List list, List list2, PreorderBubbleAvailability preorderBubbleAvailability, BubbleAvailability bubbleAvailability, BubbleAvailability bubbleAvailability2, BubbleAvailability bubbleAvailability3, BubbleAvailability bubbleAvailability4, BubbleAvailability bubbleAvailability5, BubbleAvailability bubbleAvailability6, BubbleAvailability bubbleAvailability7) {
        this.a = list;
        this.b = list2;
        this.c = preorderBubbleAvailability;
        this.d = bubbleAvailability;
        this.e = bubbleAvailability2;
        this.f = bubbleAvailability3;
        this.g = bubbleAvailability4;
        this.h = bubbleAvailability5;
        this.i = bubbleAvailability6;
        this.j = bubbleAvailability7;
    }
}
