package xsna;

import androidx.recyclerview.widget.GridLayoutManager;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;

/* compiled from: TabletSpanSizeLookup.kt */
/* loaded from: classes3.dex */
public final class yxn0 extends GridLayoutManager.c {
    public final izs<Integer, hfz> d;

    /* JADX WARN: Multi-variable type inference failed */
    public yxn0(izs<? super Integer, ? extends hfz> izsVar) {
        this.d = izsVar;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i) {
        return this.d.invoke(Integer.valueOf(i)) instanceof AboutVideoItem.SimilarVideoRedesign ? 1 : 2;
    }
}
