package yads;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import xsna.an10;

/* loaded from: classes10.dex */
public abstract class r9 {
    public static TextView a(Context context) {
        TextView textView = new TextView(context, null, R.style.Widget.TextView);
        textView.setTextSize(0, om3.a(context, t9.f.a(context)));
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(Typeface.SANS_SERIF);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setHorizontallyScrolling(false);
        textView.setHorizontalFadingEdgeEnabled(false);
        textView.setVerticalScrollBarEnabled(false);
        textView.setVerticalFadingEdgeEnabled(false);
        textView.setTextColor(context.getResources().getColor(R.color.primary_text_light));
        int b = an10.b(TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics()));
        textView.setPadding(b, 0, b, 0);
        return textView;
    }

    public static ProgressBar b(Context context) {
        ProgressBar progressBar = new ProgressBar(context, null, R.attr.progressBarStyleHorizontal);
        progressBar.setProgressDrawable(q9.b);
        progressBar.setProgress(0);
        progressBar.setMax(10000);
        return progressBar;
    }

    public static ImageView a(Context context, String str, int i) {
        ImageView imageView = new ImageView(context);
        imageView.setImageBitmap(tb.a(str));
        imageView.setAdjustViewBounds(true);
        imageView.setPadding(i, i, i, i);
        ColorDrawable colorDrawable = q9.a;
        ColorDrawable colorDrawable2 = new ColorDrawable(p9.a);
        ColorDrawable colorDrawable3 = new ColorDrawable(0);
        int[] iArr = {R.attr.state_pressed};
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(iArr, colorDrawable2);
        stateListDrawable.addState(new int[0], colorDrawable3);
        imageView.setBackgroundDrawable(stateListDrawable);
        return imageView;
    }
}
