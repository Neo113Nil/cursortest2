package xsna;

import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import java.util.Comparator;
import xsna.k1v;

/* compiled from: Comparisons.kt */
/* loaded from: classes5.dex */
public final class h0i implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ h0i(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                yu20 yu20Var = (yu20) obj;
                ModalActionSheetListItem modalActionSheetListItem = yu20Var instanceof ModalActionSheetListItem ? (ModalActionSheetListItem) yu20Var : null;
                Integer valueOf = Integer.valueOf(modalActionSheetListItem != null ? modalActionSheetListItem.a : -1);
                yu20 yu20Var2 = (yu20) obj2;
                ModalActionSheetListItem modalActionSheetListItem2 = yu20Var2 instanceof ModalActionSheetListItem ? (ModalActionSheetListItem) yu20Var2 : null;
                return jw5.b(valueOf, Integer.valueOf(modalActionSheetListItem2 != null ? modalActionSheetListItem2.a : -1));
            default:
                return jw5.b(((k1v.a) obj).a, ((k1v.a) obj2).a);
        }
    }
}
