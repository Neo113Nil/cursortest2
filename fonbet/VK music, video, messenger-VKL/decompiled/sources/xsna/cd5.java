package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.horizontal.HorizontalListItem$Size;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;
import com.vkontakte.android.R;
import xsna.iev;
import xsna.phw;
import xsna.wkj;

/* compiled from: AuthorVideoHorizontalListItem.kt */
/* loaded from: classes16.dex */
public final class cd5 extends rpo0 {
    public final wh50<rlw> m;
    public final wh50<ob5> n;

    public cd5(Context context) {
        super(context, null, 0);
        this.m = androidx.compose.runtime.k.b(new slw(new ColorDrawable()));
        this.n = androidx.compose.runtime.k.b(new ob5((String) null, false, 7));
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        azo0 azo0Var;
        azo0 azo0Var2;
        androidx.compose.runtime.a M = aVar.M(-963310560);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-963310560, i2, -1, "com.vk.catalog2.common.ui.holders.author.AuthorVideoHorizontalListItem.ThemedContent (AuthorVideoHorizontalListItem.kt:36)");
            }
            Drawable drawable = ((Context) M.r(AndroidCompositionLocals_androidKt.b)).getDrawable(R.drawable.vk_icon_verified_16);
            HorizontalListItem$Size.WithPicture withPicture = HorizontalListItem$Size.WithPicture.Medium;
            phw a = phw.a.a(tlw.a((rlw) ((zak0) this.m).getValue(), M, 0), null, wkj.a.a, null, null, M, 197000, 26);
            HorizontalListItem$VisualContent.Type type = HorizontalListItem$VisualContent.Type.Picture;
            zak0 zak0Var = (zak0) this.n;
            String str = ((ob5) zak0Var.getValue()).a;
            if (((ob5) zak0Var.getValue()).b) {
                M.K(987249723);
                if (drawable == null) {
                    M.K(987283760);
                    M.j();
                    azo0Var2 = null;
                } else {
                    M.K(1971510513);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1734204283, 0, -1, "com.vk.core.view.components.list.horizontal.asTintedPainter (DrawableExt.kt:8)");
                    }
                    azo0Var2 = new azo0(w65.p(drawable, M, 0), null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                }
                M.j();
                azo0Var = azo0Var2;
            } else {
                M.K(987325270);
                M.j();
                azo0Var = null;
            }
            azu0.a(withPicture, a, iev.b.a(str, null, null, null, azo0Var, null, ((ob5) zak0Var.getValue()).c, null, null, null, null, null, M, 0, 4014), null, type, null, new gev(null, s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 5), null, 13), M, 24582);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ce0(this, i, 1);
        }
    }

    public final void setImage(rlw rlwVar) {
        ((zak0) this.m).setValue(rlwVar);
    }

    public final void setSubtitle(String str) {
        zak0 zak0Var = (zak0) this.n;
        zak0Var.setValue(ob5.a((ob5) zak0Var.getValue(), null, str, 3));
    }

    public final void setTextContent(ob5 ob5Var) {
        ((zak0) this.n).setValue(ob5Var);
    }

    public final void setTitle(String str) {
        zak0 zak0Var = (zak0) this.n;
        zak0Var.setValue(ob5.a((ob5) zak0Var.getValue(), str, null, 6));
    }
}
