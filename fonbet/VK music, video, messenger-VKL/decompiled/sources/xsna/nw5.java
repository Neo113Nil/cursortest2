package xsna;

import android.os.Parcelable;
import com.vk.dto.common.DialogBackground;
import com.vk.im.engine.models.dialogs.c;
import java.util.Comparator;
import java.util.Set;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class nw5 implements Comparator {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nw5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2 = this.b;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                String str = ((mka0) obj).b;
                ow5 ow5Var = (ow5) obj3;
                int i3 = 3;
                if (epx.f(str, ow5Var.d)) {
                    i = 0;
                } else if (epx.f(str, c.h.c.a)) {
                    i = 1;
                } else {
                    Parcelable.Creator<DialogBackground> creator = DialogBackground.CREATOR;
                    i = epx.f(str, DialogBackground.e.b) ? 2 : 3;
                }
                Integer valueOf = Integer.valueOf(i);
                String str2 = ((mka0) obj2).b;
                if (epx.f(str2, ow5Var.d)) {
                    i3 = 0;
                } else if (epx.f(str2, c.h.c.a)) {
                    i3 = 1;
                } else {
                    Parcelable.Creator<DialogBackground> creator2 = DialogBackground.CREATOR;
                    if (epx.f(str2, DialogBackground.e.b)) {
                        i3 = 2;
                    }
                }
                return jw5.b(valueOf, Integer.valueOf(i3));
            case 1:
                Set set = (Set) obj3;
                return jw5.b(Boolean.valueOf(set.contains(((jge) obj2).getId())), Boolean.valueOf(set.contains(((jge) obj).getId())));
            default:
                jty jtyVar = (jty) obj3;
                return jw5.b(Integer.valueOf(jtyVar.b(((rty) obj).getKey())), Integer.valueOf(jtyVar.b(((rty) obj2).getKey())));
        }
    }
}
