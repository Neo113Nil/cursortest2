package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ContextThemeWrapper;
import android.view.animation.LinearInterpolator;
import com.yandex.mapkit.geometry.Point;
import com.ybsdk.widgets.common.OperationProgressView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import ru.yandex.taxi.map.utils.a;
import ru.yandex.taxi.walkroute.WalkRouteInfoView;

/* loaded from: classes14.dex */
public final class o1v {
    public final Context a;
    public final b2l0 b;
    public ArrayList e;
    public final ValueAnimator g;
    public final ContextThemeWrapper h;
    public final ArrayList c = new ArrayList();
    public final LinkedHashMap d = new LinkedHashMap();
    public final float f = 21.0f;

    public o1v(Context context, b2l0 b2l0Var) {
        this.a = context;
        this.b = b2l0Var;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 1);
        ofInt.setDuration(OperationProgressView.ROTATION_ANIMATION_DURATION);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.setRepeatCount(-1);
        ofInt.addUpdateListener(new yso(6, this));
        this.g = ofInt;
        this.h = new ContextThemeWrapper(context, a2i0.Taxi_Light);
    }

    public final Bitmap a(CharSequence charSequence, boolean z) {
        ContextThemeWrapper contextThemeWrapper = this.h;
        WalkRouteInfoView walkRouteInfoView = new WalkRouteInfoView(contextThemeWrapper);
        walkRouteInfoView.setBackgroundResource(c0h0.bg_walking_route_info_corner_8_dp);
        walkRouteInfoView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        walkRouteInfoView.setTextTypeface(3);
        int u = tje.u(4, walkRouteInfoView.getContext());
        walkRouteInfoView.setPadding(u, u, u, u);
        int t = qje.t(z ? xng0.textMain : xng0.textMinor, contextThemeWrapper);
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new ForegroundColorSpan(t), 0, charSequence.length(), 33);
        walkRouteInfoView.setText(spannableString);
        xw31.r(walkRouteInfoView);
        Bitmap t2 = xw31.t(walkRouteInfoView);
        int t3 = qje.t(xng0.effectShadowBottom, this.a);
        float abs = Math.abs(0.0f);
        float abs2 = Math.abs(8.0f);
        if (abs < abs2) {
            abs = abs2;
        }
        float f = abs + 20.0f;
        int i = ((int) f) * 2;
        Bitmap createBitmap = Bitmap.createBitmap(t2.getWidth() + i, t2.getHeight() + i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(t3);
        paint.setShadowLayer(20.0f, 0.0f, 8.0f, t3);
        Bitmap extractAlpha = t2.extractAlpha();
        canvas.drawBitmap(extractAlpha, f, f, paint);
        canvas.drawBitmap(t2, f, f, (Paint) null);
        extractAlpha.recycle();
        t2.recycle();
        return createBitmap;
    }

    public final void b(xm00 xm00Var, m1v m1vVar, boolean z) {
        Point n;
        CharSequence charSequence;
        String routeId = m1vVar.a.getMetadata().getRouteId();
        if (routeId == null || (n = a.n(m1vVar.a.getGeometry())) == null || (charSequence = m1vVar.b) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.d;
        f4c0 f4c0Var = (f4c0) linkedHashMap.get(routeId);
        if (f4c0Var != null) {
            f4c0Var.o(n);
            f4c0Var.x(a(charSequence, z));
        } else {
            f4c0 r = xm00Var.r(n);
            r.x(a(charSequence, z));
            linkedHashMap.put(routeId, r);
        }
    }
}
