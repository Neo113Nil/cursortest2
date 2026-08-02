package xsna;

import com.vkontakte.android.attachments.ShitAttachment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: CardUiDto.kt */
/* loaded from: classes4.dex */
public final class wt9 extends ol60 {
    public final List<ShitAttachment.Card> h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wt9(List list) {
        super(r0, 0, 0, 0, null);
        int i;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((ShitAttachment.Card) it.next()).r) {
                    i = 8;
                    break;
                }
            }
        }
        i = 15;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wt9) && epx.f(this.h, ((wt9) obj).h);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (this.h.hashCode() * 31);
    }

    public final String toString() {
        return vp.b(", seqId=0)", new StringBuilder("CardUiDto(cards="), this.h);
    }
}
