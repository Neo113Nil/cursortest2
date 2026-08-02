package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: ActionButtonImageBase.kt */
/* loaded from: classes7.dex */
public class wu<S, T extends ImageView> extends ku<S, T> {
    public final a d;

    /* compiled from: ActionButtonImageBase.kt */
    public interface a {
        Integer a();

        Integer b();

        Integer c();
    }

    public wu(a aVar, gzs<s3q0> gzsVar) {
        super(gzsVar);
        this.d = aVar;
    }

    public int j() {
        Integer a2;
        a aVar = this.d;
        return (aVar == null || (a2 = aVar.a()) == null) ? R.drawable.bg_voip_primary_button : a2.intValue();
    }

    public int k() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.b().intValue();
        }
        return 0;
    }

    public ImageView.ScaleType l() {
        return ImageView.ScaleType.CENTER;
    }

    public int m() {
        Integer c;
        a aVar = this.d;
        return (aVar == null || (c = aVar.c()) == null) ? R.color.voip_primary_button_icon_color : c.intValue();
    }

    public PorterDuff.Mode n() {
        return null;
    }

    @Override // xsna.ku
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public T e(Context context) {
        return new AppCompatImageView(context);
    }

    @Override // xsna.ku
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void h(T t) {
        int j = j();
        if (j != 0) {
            t.setBackgroundResource(j);
        }
        if (n() != t.getImageTintMode()) {
            t.setImageTintMode(n());
        }
        if (m() != 0) {
            t.setImageTintList(anj.b(m(), t.getContext()));
        }
        t.setScaleType(l());
        if (k() != 0) {
            t.setImageResource(k());
        }
        t.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        t.setClickable(true);
        t.setFocusable(true);
    }
}
