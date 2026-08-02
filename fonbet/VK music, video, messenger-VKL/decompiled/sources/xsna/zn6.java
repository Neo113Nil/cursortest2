package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vk.clips.design.view.nps.internal.stars.FeedbackResult;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: BaseStarsFeedbackView.kt */
/* loaded from: classes16.dex */
public abstract class zn6 extends LinearLayout {
    public final ImageView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public final ImageView f;
    public izs<? super FeedbackResult, s3q0> g;
    public final y01 h;

    public zn6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(i, (ViewGroup) this, true);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(17);
        float f = 12;
        setPadding(iah0.a(f), iah0.a(f), iah0.a(f), iah0.a(f));
        ImageView imageView = (ImageView) findViewById(R.id.stars_feedback_0);
        this.b = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.stars_feedback_1);
        this.c = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.stars_feedback_2);
        this.d = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.stars_feedback_3);
        this.e = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.stars_feedback_4);
        this.f = imageView5;
        y01 y01Var = new y01(this, 4);
        this.h = y01Var;
        imageView.setOnClickListener(y01Var);
        imageView2.setOnClickListener(y01Var);
        imageView3.setOnClickListener(y01Var);
        imageView4.setOnClickListener(y01Var);
        imageView5.setOnClickListener(y01Var);
    }

    public final void a(int i, gzs<s3q0> gzsVar) {
        int i2 = 0;
        for (Object obj : rl3.I(new ImageView[]{this.b, i > 0 ? this.c : null, i > 1 ? this.d : null, i > 2 ? this.e : null, i > 3 ? this.f : null})) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            ImageView imageView = (ImageView) obj;
            imageView.animate().setDuration(150L).scaleX(0.9f).scaleY(0.9f).setListener(new yn6(imageView, i2 == 0 ? gzsVar : null)).start();
            Context context = getContext();
            int starColor = getStarColor();
            e3m.a aVar = e3m.a;
            Drawable a = m33.a(R.drawable.vk_icon_favorite_28, context);
            sjo.b(a, context.getColor(starColor), PorterDuff.Mode.SRC_IN);
            imageView.setImageDrawable(a);
            i2 = i3;
        }
    }

    public abstract boolean getNeedToDropListenerAfterStarClick();

    public abstract int getStarColor();

    public final void setFeedbackListener(izs<? super FeedbackResult, s3q0> izsVar) {
        this.g = izsVar;
    }
}
