package defpackage;

import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.e;
import java.util.List;

/* loaded from: classes.dex */
public final class ed2 extends e {
    public final /* synthetic */ AndroidViewHolder a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed2(AndroidViewHolder androidViewHolder) {
        super(1);
        this.a = androidViewHolder;
    }

    @Override // androidx.core.view.e
    public final n751 onProgress(n751 n751Var, List list) {
        n751 insetToLayoutPosition;
        insetToLayoutPosition = this.a.insetToLayoutPosition(n751Var);
        return insetToLayoutPosition;
    }

    @Override // androidx.core.view.e
    public final q651 onStart(u651 u651Var, q651 q651Var) {
        q651 insetBounds;
        insetBounds = this.a.insetBounds(q651Var);
        return insetBounds;
    }
}
