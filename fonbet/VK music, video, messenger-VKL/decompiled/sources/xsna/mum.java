package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DialogsListViewController.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class mum extends FunctionReferenceImpl implements wzs<LinearLayoutManager, View, Boolean> {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if ((r4.getChildViewHolder(r5) instanceof xsna.gm20) != false) goto L11;
     */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke(LinearLayoutManager linearLayoutManager, View view) {
        View view2 = view;
        fum fumVar = (fum) this.receiver;
        fumVar.getClass();
        boolean z = true;
        if (((RecyclerView.p) view2.getLayoutParams()).b.getAbsoluteAdapterPosition() == linearLayoutManager.getItemCount() - 1) {
            RecyclerView recyclerView = fumVar.i;
            if (recyclerView == null) {
                recyclerView = null;
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
