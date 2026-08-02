package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;

/* loaded from: classes15.dex */
public abstract class mtb1 {
    public static yh60 a(Bundle bundle) {
        int i = 0;
        if (bundle == null) {
            return new yh60(i);
        }
        long[] longArray = bundle.getLongArray("message_timestamps");
        if (longArray == null) {
            longArray = new long[0];
        }
        return new yh60(longArray, bundle.getBoolean("is_inapp"), (bundle.getBoolean("has_xiva_data") ? bundle : null) != null ? new m5g0(bundle.getString("transit_id"), bundle.getLong("receive_ts"), bundle.getLong("receive_ts_uptime")) : null, bundle.getString("override_url"));
    }

    public static BitmapDrawable b(View view) {
        boolean z = false;
        if (view.getMeasuredWidth() == 0 || view.getMeasuredHeight() == 0) {
            view.measure(0, 0);
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
        if (view.getMeasuredWidth() == 0 || view.getMeasuredHeight() == 0) {
            return new BitmapDrawable();
        }
        int left = view.getLeft();
        int right = view.getRight();
        int top = view.getTop();
        int bottom = view.getBottom();
        if (view.getWidth() != view.getMeasuredWidth() || view.getHeight() != view.getMeasuredHeight()) {
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            z = true;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        if (z) {
            view.layout(left, top, right, bottom);
        }
        return new BitmapDrawable(view.getResources(), createBitmap);
    }
}
