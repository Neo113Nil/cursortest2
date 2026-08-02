package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;

/* compiled from: ClipsLogoDrawer.kt */
/* loaded from: classes3.dex */
public final class zke extends cdx0 {
    public final ShapeDrawable f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zke(String str, int i, dqz0 dqz0Var) {
        super(str, 2.0f, 0.02f, r4, i, ply.a().contentEquals("ru") ? 4.6666665f : 4.1944447f, m33.a(ply.a().contentEquals("ru") ? R.drawable.vk_icon_logo_clips_with_text_dark_ru_36h : R.drawable.vk_icon_logo_clips_with_text_dark_eng_36h, e43.a), dqz0Var);
        Context context = e43.a;
        Typeface a = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, context == null ? null : context);
        TextSizeUnit textSizeUnit = TextSizeUnit.SP;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setBounds(0, 0, this.c, (int) (this.b * 0.7f));
        shapeDrawable.getPaint().setColor(0);
        shapeDrawable.getPaint().setShadowLayer(20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e43.a.getColor(R.color.vk_black_alpha12));
        this.f = shapeDrawable;
    }

    @Override // xsna.og6, xsna.gr9
    public final void draw(Canvas canvas) {
        this.f.draw(canvas);
        this.a.draw(canvas);
    }
}
