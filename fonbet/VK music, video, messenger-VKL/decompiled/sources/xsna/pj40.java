package xsna;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import xsna.mut0;

/* compiled from: MusicDynamicGridItemVh.kt */
/* loaded from: classes16.dex */
public final class pj40 extends RecyclerView.e0 {
    public static final float n = 4;
    public static final float o = 8;
    public static final float p = 16;
    public final ComposeView l;
    public final wzs<View, UIBlockLink, View.OnClickListener> m;

    public pj40(ComposeView composeView, w69 w69Var) {
        super(composeView);
        this.l = composeView;
        this.m = w69Var;
        composeView.setViewCompositionStrategy(mut0.c.a);
    }
}
