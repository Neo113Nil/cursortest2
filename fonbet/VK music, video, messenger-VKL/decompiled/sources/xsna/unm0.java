package xsna;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.List;
import xsna.nov;

/* compiled from: StoryVmojiSticker.kt */
/* loaded from: classes15.dex */
public final class unm0 extends ad7 {
    public final List<Bitmap> q;
    public int r;
    public final boolean s;
    public final Paint t;
    public float u;
    public float v;
    public int w;

    public unm0() {
        throw null;
    }

    public unm0(List list) {
        super((Bitmap) list.get(0), (iah0.f().widthPixels * 4) / 3, WebStickerType.PHOTO, "");
        this.s = true;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.t = paint;
        this.w = this.o;
        this.r = 0;
        this.q = list;
        this.c.q = true;
        this.s = true;
        r((Bitmap) list.get(0), false);
    }

    @Override // xsna.ad7, xsna.kr9, xsna.nov
    public final nov E0(nov novVar) {
        return super.E0(new unm0(this));
    }

    @Override // xsna.ad7, xsna.nov
    public final float getOriginalHeight() {
        return this.v;
    }

    @Override // xsna.ad7, xsna.nov
    public final float getOriginalWidth() {
        return this.u;
    }

    @Override // xsna.ad7, xsna.kr9, xsna.nov
    public final int getStickerAlpha() {
        return this.w;
    }

    @Override // xsna.ad7
    public final boolean p() {
        return false;
    }

    public final void r(Bitmap bitmap, boolean z) {
        this.j = bitmap;
        float f = this.u;
        float f2 = this.v;
        RectF rectF = this.i;
        this.u = rectF.width();
        float height = rectF.height();
        this.v = height;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f3 = (f - this.u) / 2.0f;
            float o = o();
            float f4 = this.c.l;
            y0(o, this.u / 2.0f, this.v / 2.0f, true);
            nov.a.f(this, 1 / f4, this.u / 2.0f, this.v / 2.0f);
            nov.a.i(this, f3, (f2 - height) / 2.0f);
            y0(-o, this.u / 2.0f, this.v / 2.0f, true);
            nov.a.f(this, f4, this.u / 2.0f, this.v / 2.0f);
        }
        if (z) {
            xaq.a(this, new nid0(this, 13));
            return;
        }
        o1l0 o1l0Var = this.f;
        if (o1l0Var != null) {
            ((kdl0) o1l0Var).a(this);
        }
    }

    @Override // xsna.ad7, xsna.kr9, xsna.nov
    public final void setStickerAlpha(int i) {
        this.w = i;
        super.setStickerAlpha(i);
        this.t.setAlpha(this.w);
    }

    public unm0(unm0 unm0Var) {
        super(unm0Var);
        this.s = true;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.t = paint;
        this.w = this.o;
        this.r = 0;
        List<Bitmap> list = unm0Var.q;
        this.q = list;
        this.c.q = unm0Var.c.q;
        r(list.get(0), false);
    }
}
