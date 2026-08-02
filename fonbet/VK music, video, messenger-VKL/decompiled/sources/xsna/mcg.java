package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;
import java.util.ArrayList;
import xsna.yrn;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class mcg implements yrn.a {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yrn.a
    public final boolean Z(RecyclerView.e0 e0Var) {
        ArrayList<dl60> arrayList = CommentThreadFragment.y0;
        dsx0 dsx0Var = e0Var instanceof dsx0 ? (dsx0) e0Var : null;
        int a3 = dsx0Var != null ? dsx0Var.a3() : 0;
        if (e0Var.getBindingAdapterPosition() != 0 && a3 > 1) {
            if (ogg.b.contains(Integer.valueOf(e0Var.getItemViewType()))) {
                return true;
            }
        }
        return false;
    }
}
