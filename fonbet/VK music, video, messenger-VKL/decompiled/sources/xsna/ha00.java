package xsna;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: LyricsGradientDecoration.kt */
/* loaded from: classes3.dex */
public final class ha00 extends RecyclerView.n {
    public int b;
    public boolean c;
    public final float d = iah0.a(100);
    public final Paint e;

    public ha00() {
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setStyle(Paint.Style.FILL);
        this.e = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int s = ((LinearLayoutManager) recyclerView.getLayoutManager()).s();
        Paint paint = this.e;
        if (s > 0 && this.c) {
            int i = this.b;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            float f = this.d;
            paint.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, i, 0, tileMode));
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, recyclerView.getWidth(), f, paint);
        }
        if (((LinearLayoutManager) recyclerView.getLayoutManager()).w() < recyclerView.getAdapter().getItemCount() - 1) {
            float height = recyclerView.getHeight() - this.d;
            float height2 = recyclerView.getHeight();
            paint.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, height, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, height2, 0, this.b, Shader.TileMode.CLAMP));
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, height, recyclerView.getWidth(), height2, paint);
        }
    }
}
