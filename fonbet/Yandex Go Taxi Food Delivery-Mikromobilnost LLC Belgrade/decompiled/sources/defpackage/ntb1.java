package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import java.nio.charset.Charset;
import okio.ByteString;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class ntb1 {
    public static final String a(String str, String str2, Charset charset) {
        return "Basic ".concat(new ByteString(oyr.f(':', str, str2).getBytes(charset)).a());
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

    public static fj60 c(JSONObject jSONObject) {
        JSONObject f;
        String g = hbb1.g("Chat", jSONObject);
        JSONObject f2 = hbb1.f("Message", jSONObject);
        Long valueOf = (f2 == null || (f = hbb1.f("ServerMessageInfo", f2)) == null || !f.has("Timestamp")) ? null : Long.valueOf(f.getLong("Timestamp"));
        if (g == null || valueOf == null) {
            return null;
        }
        return new fj60(g, valueOf.longValue());
    }
}
