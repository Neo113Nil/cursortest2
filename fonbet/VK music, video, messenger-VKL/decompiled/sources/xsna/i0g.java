package xsna;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: CollageColorsAdapter.kt */
/* loaded from: classes4.dex */
public final class i0g extends RecyclerView.e0 {
    public final View l;
    public final View m;
    public final ImageView n;
    public final ImageView o;
    public final ImageView p;
    public final ImageView q;

    public i0g(View view) {
        super(view);
        this.l = view;
        this.m = view.findViewById(R.id.color);
        this.n = (ImageView) view.findViewById(R.id.ivBorderOutside);
        this.o = (ImageView) view.findViewById(R.id.ivBorderOutsideSelected);
        this.p = (ImageView) view.findViewById(R.id.ivBorderInsideSelectedWhite);
        this.q = (ImageView) view.findViewById(R.id.ivBorderInsideSelectedBlack);
        view.findViewById(R.id.colorRoundedWrapper).setClipToOutline(true);
    }
}
