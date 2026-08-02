package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.pushes.dto.PushMessage;
import java.util.Comparator;

/* compiled from: OnPositionedDispatcher.kt */
/* loaded from: classes11.dex */
public final class fa80 implements Comparator {
    public static final fa80 c = new fa80(0);
    public final /* synthetic */ int b;

    public /* synthetic */ fa80(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                LayoutNode layoutNode = (LayoutNode) obj;
                LayoutNode layoutNode2 = (LayoutNode) obj2;
                int g = epx.g(layoutNode2.q, layoutNode.q);
                return g != 0 ? g : epx.g(layoutNode.hashCode(), layoutNode2.hashCode());
            case 1:
                return jw5.b(Long.valueOf(((lj30) obj).n), Long.valueOf(((lj30) obj2).n));
            case 2:
                yu20 yu20Var = (yu20) obj;
                ModalActionSheetListItem modalActionSheetListItem = yu20Var instanceof ModalActionSheetListItem ? (ModalActionSheetListItem) yu20Var : null;
                Integer valueOf = Integer.valueOf(modalActionSheetListItem != null ? modalActionSheetListItem.a : -1);
                yu20 yu20Var2 = (yu20) obj2;
                ModalActionSheetListItem modalActionSheetListItem2 = yu20Var2 instanceof ModalActionSheetListItem ? (ModalActionSheetListItem) yu20Var2 : null;
                return jw5.b(valueOf, Integer.valueOf(modalActionSheetListItem2 != null ? modalActionSheetListItem2.a : -1));
            default:
                return jw5.b(Integer.valueOf(((PushMessage) obj).b), Integer.valueOf(((PushMessage) obj2).b));
        }
    }
}
