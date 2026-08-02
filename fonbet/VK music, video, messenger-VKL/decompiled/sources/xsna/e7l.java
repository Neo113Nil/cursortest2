package xsna;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.util.Timer;

/* compiled from: UiTrackerDebugViewer.kt */
/* loaded from: classes17.dex */
public final class e7l extends LinearLayout {
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public long g;
    public final int h;
    public final int i;
    public final Timer j;
    public d7l k;

    public e7l(Context context) {
        super(context);
        this.g = System.currentTimeMillis();
        int color = context.getColor(R.color.debug_view_bg);
        this.h = color;
        this.i = context.getColor(R.color.debug_view_error_bg);
        this.j = new Timer();
        setOrientation(1);
        TextView a = a();
        this.b = a;
        addView(a);
        TextView a2 = a();
        this.c = a2;
        addView(a2);
        TextView a3 = a();
        this.d = a3;
        addView(a3);
        TextView a4 = a();
        this.e = a4;
        addView(a4);
        TextView a5 = a();
        this.f = a5;
        addView(a5);
        a5.setText(getResources().getString(R.string.report_screen));
        a5.setVisibility(8);
        setBackgroundColor(color);
    }

    public final TextView a() {
        TextView textView = new TextView(getContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.debug_view_padding_vertical);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.debug_view_padding_horizontal);
        textView.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        textView.setTextSize(2, 14.0f);
        textView.setTextColor(-1);
        textView.setClickable(false);
        return textView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
