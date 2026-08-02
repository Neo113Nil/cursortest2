package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.articles.ArticleFragment;
import com.vk.dto.articles.Article;
import com.vk.dto.newsfeed.Owner;
import xsna.ykr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ho3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ho3(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                yh yhVar = (yh) obj2;
                int i2 = ArticleFragment.E0;
                ((Owner) obj5).g(4, false);
                if (!((ArticleFragment) obj4).mo((Article) obj3)) {
                    break;
                } else {
                    yhVar.invoke();
                    break;
                }
            case 1:
                l7v l7vVar = (l7v) obj5;
                String str = (String) obj3;
                h7v.t(l7vVar, (View) obj4, str, (izs) obj2, new com.vk.movika.sdk.base.flow.binding.j(12, l7vVar, str), 8);
                break;
            default:
                ykr0.d dVar = (ykr0.d) obj4;
                Bitmap bitmap = (Bitmap) obj3;
                Drawable drawable = (Drawable) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                Canvas canvas = new Canvas(bitmap2);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                ((zkr0) obj5).getClass();
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                paint.setXfermode(new PorterDuffXfermode(dVar.e ? PorterDuff.Mode.OVERLAY : PorterDuff.Mode.SRC_OVER));
                paint.setAlpha(swe0.g((int) (dVar.d * 255), 0, 255));
                new Canvas(bitmap).drawBitmap(bitmap2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
                break;
        }
        return s3q0.a;
    }
}
