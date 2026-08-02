package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.superapp.api.dto.story.WebStickerType;
import xsna.nov;

/* compiled from: BitmapSticker.kt */
/* loaded from: classes6.dex */
public class ad7 extends kr9 {
    public final Paint h;
    public final RectF i;
    public Bitmap j;
    public final Rect k;
    public final WebStickerType l;
    public final String m;
    public String n;
    public int o;
    public final boolean p;

    public ad7(ad7 ad7Var) {
        this.h = new Paint(2);
        RectF rectF = new RectF();
        this.i = rectF;
        Rect rect = new Rect();
        this.k = rect;
        this.o = this.g;
        this.p = true;
        this.j = ad7Var.j;
        rect.set(ad7Var.k);
        rectF.set(ad7Var.i);
        this.l = ad7Var.l;
        this.m = ad7Var.m;
        this.n = ad7Var.n;
    }

    @Override // xsna.kr9, xsna.nov
    public nov E0(nov novVar) {
        if (novVar == null) {
            novVar = new ad7(this);
        }
        ad7 ad7Var = (ad7) novVar;
        nov.a.b(this, ad7Var);
        return ad7Var;
    }

    @Override // xsna.nov
    public void G0(Canvas canvas) {
        canvas.drawBitmap(this.j, this.k, this.i, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad7)) {
            return false;
        }
        ad7 ad7Var = (ad7) obj;
        return epx.f(this.i, ad7Var.i) && epx.f(this.k, ad7Var.k) && this.l == ad7Var.l && epx.f(this.m, ad7Var.m) && epx.f(this.n, ad7Var.n) && getOriginalWidth() == ad7Var.getOriginalWidth() && getOriginalHeight() == ad7Var.getOriginalHeight() && getStickerAlpha() == ad7Var.getStickerAlpha() && epx.f(this.c.n, ad7Var.c.n) && p() == ad7Var.p();
    }

    @Override // xsna.nov
    public float getOriginalHeight() {
        return this.i.height();
    }

    @Override // xsna.nov
    public float getOriginalWidth() {
        return this.i.width();
    }

    @Override // xsna.kr9, xsna.nov
    public int getStickerAlpha() {
        return this.o;
    }

    public final int hashCode() {
        int hashCode = (this.k.hashCode() + (this.i.hashCode() * 31)) * 31;
        WebStickerType webStickerType = this.l;
        int a = urd0.a((hashCode + (webStickerType != null ? webStickerType.hashCode() : 0)) * 31, 31, this.m);
        String str = this.n;
        return this.c.n.hashCode() + ((Boolean.hashCode(p()) + ((getStickerAlpha() + ((Float.hashCode(getOriginalHeight()) + ((Float.hashCode(getOriginalWidth()) + ((a + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public boolean p() {
        return this.p;
    }

    public void q(int i) {
        float width = (i / 2.0f) / this.k.width();
        this.i.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.j.getWidth() * width, this.j.getHeight() * width);
    }

    @Override // xsna.kr9, xsna.nov
    public void setStickerAlpha(int i) {
        this.o = i;
        this.h.setAlpha(getStickerAlpha());
    }

    public ad7(Bitmap bitmap, int i, WebStickerType webStickerType, String str) {
        this.h = new Paint(2);
        this.i = new RectF();
        Rect rect = new Rect();
        this.k = rect;
        this.o = this.g;
        this.p = true;
        bitmap = p() ? kd7.c(bitmap) : bitmap;
        this.j = bitmap;
        this.l = webStickerType;
        this.m = str;
        rect.set(0, 0, bitmap.getWidth(), this.j.getHeight());
        q(i);
    }
}
