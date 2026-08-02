package xsna;

import android.os.Parcelable;
import com.vk.dto.common.Attachment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: ImageAttachmentsPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class vfw extends de {
    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        List<Attachment> list;
        w84 w84Var = u1c0Var instanceof w84 ? (w84) u1c0Var : null;
        int i = 0;
        if (w84Var != null && (list = w84Var.q) != null) {
            List<Attachment> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return 0;
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if ((((Attachment) it.next()) instanceof tfw) && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        return i;
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        w84 w84Var = u1c0Var instanceof w84 ? (w84) u1c0Var : null;
        if ((w84Var != null ? w84Var.q : null) != null) {
            int size = w84Var.q.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Parcelable parcelable = (Attachment) w84Var.q.get(i3);
                if (parcelable instanceof tfw) {
                    if (i2 == i) {
                        return ((tfw) parcelable).h9();
                    }
                    i2++;
                }
            }
        }
        return null;
    }
}
