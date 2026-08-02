package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;

/* compiled from: EnhancedView.kt */
/* loaded from: classes4.dex */
public final class kmp extends LinearLayout {
    public static final float m = (int) Math.floor(24 * Resources.getSystem().getDisplayMetrics().density);
    public izs<? super Boolean, s3q0> b;
    public final ConstraintLayout c;
    public final ConstraintLayout d;
    public final ConstraintLayout e;
    public final ImageView f;
    public final ImageView g;
    public final ConstraintLayout h;
    public final ConstraintLayout i;
    public final TextView j;
    public final TextView k;
    public float l;

    public kmp(Context context) {
        super(context, null, 0);
        ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(context).inflate(R.layout.ml_enhanced, (ViewGroup) this, false);
        this.c = constraintLayout;
        addView(constraintLayout);
        this.d = (ConstraintLayout) findViewById(R.id.photoWrapperSize);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) findViewById(R.id.photoWrapper);
        constraintLayout2.setClipToOutline(true);
        this.e = constraintLayout2;
        ImageView imageView = (ImageView) findViewById(R.id.photoOriginal);
        imageView.setOnClickListener(new imp(0));
        this.f = imageView;
        this.g = (ImageView) findViewById(R.id.photoEnhanced);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) findViewById(R.id.divider);
        constraintLayout3.setVisibility(8);
        this.h = constraintLayout3;
        this.i = (ConstraintLayout) findViewById(R.id.beforeAfter);
        this.j = (TextView) findViewById(R.id.tvBefore);
        this.k = (TextView) findViewById(R.id.tvAfter);
        constraintLayout2.setOnClickListener(new imp(0));
        setContentDescription(context.getString(R.string.editor_ml_enhance_accessibility_enhanced));
    }

    public final izs<Boolean, s3q0> getOnDividerMoved() {
        return this.b;
    }

    public final void setOnDividerMoved(izs<? super Boolean, s3q0> izsVar) {
        this.b = izsVar;
    }
}
