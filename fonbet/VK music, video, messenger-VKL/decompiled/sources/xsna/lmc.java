package xsna;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.compose.runtime.a;
import com.google.gson.internal.LinkedTreeMap;
import com.vk.catalog2.common.dto.api.style.MusicTrackCatalogViewStyle;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: ClipBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class lmc implements zag0, jp70, io.reactivex.rxjava3.functions.g {
    public static final lmc b = new lmc();
    public static final doq c = new doq();

    public static final int b(int i, Object obj) {
        return (i * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public static void c(TextView textView, String str, String str2, boolean z, boolean z2) {
        Context context = textView.getContext();
        Float valueOf = Float.valueOf(textView.getTextSize());
        ucp ucpVar = ucp.a;
        CharSequence j = ucp.j(s490.d(context, str, str2, R.attr.vk_ui_text_secondary), valueOf);
        if (epx.f(j.toString(), textView.getText().toString())) {
            return;
        }
        textView.setText(j);
        textView.setSelected(true);
        if (z2) {
            Drawable a = m33.a(R.drawable.vk_icon_error_circle_fill_gray_24, textView.getContext());
            textView.setCompoundDrawablePadding(iah0.a(4.0f));
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, a, (Drawable) null);
        } else {
            if (!z) {
                z2 = false;
            }
            s490.a(textView, z2, textView.getContext().getColor(R.color.vk_gray_400));
        }
    }

    public static gkg0 e(lg90 lg90Var, long j, String str, gzs gzsVar, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i) {
        if ((i & 2) != 0) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var.getIcon().l;
        }
        long j2 = j;
        String str2 = (i & 4) != 0 ? null : str;
        gzs gzsVar2 = (i & 8) != 0 ? null : gzsVar;
        com.vk.core.compose.component.semantics.a aVar3 = (i & 16) != 0 ? null : aVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-810136157, 196616, -1, "com.vk.core.compose.component.search.Search.Right.Icon.Companion.invoke (Search.kt:51)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-328741276, 70, -1, "com.vk.core.compose.component.search.right.remember (RightIconImpl.kt:55)");
        }
        Object x = aVar2.x();
        if (x == a.C0011a.a) {
            gkg0 gkg0Var = new gkg0(j2, aVar3, str2, gzsVar2, lg90Var);
            aVar2.R(gkg0Var);
            x = gkg0Var;
        }
        gkg0 gkg0Var2 = (gkg0) x;
        ((zak0) gkg0Var2.a).setValue(lg90Var);
        ((zak0) gkg0Var2.b).setValue(new l5g(j2));
        ((zak0) gkg0Var2.c).setValue(str2);
        ((zak0) gkg0Var2.d).setValue(gzsVar2);
        ((zak0) gkg0Var2.e).setValue(aVar3);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return gkg0Var2;
    }

    public static ow6 f(lg90 lg90Var, l5g l5gVar, androidx.compose.runtime.a aVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            l5gVar = null;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1328360577, i, -1, "com.vk.core.compose.component.contentbadge.ContentBadge.Before.Icon.Companion.invoke (ContentBadge.kt:58)");
        }
        int i3 = ((i >> 6) & 14) | 64;
        int i4 = i << 3;
        int i5 = (i4 & 896) | i3 | (i4 & 112);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(457675998, i5, -1, "com.vk.core.compose.component.contentbadge.remember (BeforeIconImpl.kt:53)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new ow6(lg90Var, l5gVar);
            aVar.R(x);
        }
        ow6 ow6Var = (ow6) x;
        ((zak0) ow6Var.a).setValue(lg90Var);
        ((zak0) ow6Var.b).setValue(l5gVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return ow6Var;
    }

    public static final UIBlockMusicTrack g(bi20 bi20Var, MusicTrack musicTrack, MusicTrackCatalogViewStyle musicTrackCatalogViewStyle, String str) {
        com.vk.catalog2.common.dto.api.ui.a a = com.vk.catalog2.common.dto.api.ui.a.a(bi20Var.b(), null, null, null, null, null, musicTrackCatalogViewStyle, 7679);
        String str2 = bi20Var.n;
        if (str == null) {
            str = "";
        }
        return new UIBlockMusicTrack(a, musicTrack, str2, str, null, bi20Var.s, false, null, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, null);
    }

    @Override // xsna.zag0
    public void a(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().recycle();
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return com.vk.voip.ui.c.b.e0();
    }

    @Override // xsna.jp70
    public Object h() {
        return new LinkedTreeMap();
    }
}
