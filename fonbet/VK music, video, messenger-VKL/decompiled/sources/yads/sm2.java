package yads;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class sm2 extends ll3 {
    public final jp2 c;

    public sm2(View view, jp2 jp2Var) {
        super(view);
        this.c = jp2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.ll3
    public final void a(View view) {
        ((um2) view).setRating(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setVisibility(8);
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        view.setSelected(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.ll3
    public final void b(View view, Object obj) {
        String str = (String) obj;
        try {
            float parseFloat = Float.parseFloat(str);
            um2 um2Var = (um2) view;
            if (parseFloat < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                parseFloat = 0.0f;
            }
            um2Var.setRating(parseFloat);
        } catch (NumberFormatException e) {
            String.format("Could not parse rating value. Rating value is %s", Arrays.copyOf(new Object[]{str}, 1));
            this.c.reportError("Could not parse rating value", e);
        }
    }

    @Override // yads.ll3
    public final /* bridge */ /* synthetic */ boolean a(View view, Object obj) {
        return true;
    }
}
