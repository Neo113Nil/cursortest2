package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.text.Layout;
import android.text.Spanned;
import android.widget.LinearLayout;
import com.google.android.gms.internal.measurement.zznz;
import com.vk.api.generated.base.dto.BasePropertyExistsDto;
import com.vk.api.generated.video.dto.VideoVideoImageDto;
import com.vk.attachpicker.widget.CustomSpinner;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.CameraBounds;
import com.vk.geo.impl.model.MutableBoundingBox;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DownloadAllButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class q7o implements wq5, q701, l5t {
    public static final q7o b = new q7o();
    public static final q7o c = new q7o();
    public static final /* synthetic */ q7o d = new q7o();

    public static final tg50 f() {
        return new tg50();
    }

    public static final List g(Layout layout) {
        CharSequence text = layout.getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        List A = spanned != null ? rli0.A(rli0.o(rl3.D(spanned.getSpans(0, spanned.length(), p0m0.class)), new apg(spanned, layout, new Rect(), 5))) : null;
        if (A == null || !(!A.isEmpty())) {
            return null;
        }
        return A;
    }

    public static Image i(List list) {
        boolean z;
        List<VideoVideoImageDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (VideoVideoImageDto videoVideoImageDto : list2) {
            String url = videoVideoImageDto.getUrl();
            int width = videoVideoImageDto.getWidth();
            int height = videoVideoImageDto.getHeight();
            Boolean e = videoVideoImageDto.e();
            BasePropertyExistsDto d2 = videoVideoImageDto.d();
            if (d2 != null) {
                z = true;
                if (d2.i() == 1) {
                    arrayList.add(new ImageSize(url, width, height, e, (char) 0, z, 16, null));
                }
            }
            z = false;
            arrayList.add(new ImageSize(url, width, height, e, (char) 0, z, 16, null));
        }
        return new Image(arrayList);
    }

    public static void j(h570 h570Var, org.jsoup.nodes.j jVar) {
        org.jsoup.nodes.j jVar2 = jVar;
        int i = 0;
        while (jVar2 != null) {
            org.jsoup.nodes.j jVar3 = jVar2.b;
            int j = jVar3 != null ? jVar3.j() : 0;
            org.jsoup.nodes.j r = jVar2.r();
            h570Var.b(jVar2, i);
            if (jVar3 != null && jVar2.b == null) {
                if (j == jVar3.j()) {
                    jVar2 = jVar3.n().get(jVar2.c);
                } else if (r == null) {
                    i--;
                    jVar2 = jVar3;
                } else {
                    jVar2 = r;
                }
            }
            if (jVar2.j() > 0) {
                jVar2 = jVar2.n().get(0);
                i++;
            } else {
                while (jVar2.r() == null && i > 0) {
                    h570Var.a(jVar2, i);
                    jVar2 = jVar2.b;
                    i--;
                }
                h570Var.a(jVar2, i);
                if (jVar2 == jVar) {
                    return;
                } else {
                    jVar2 = jVar2.r();
                }
            }
        }
    }

    public static final void k(BoundingBox boundingBox) {
        if (boundingBox instanceof CameraBounds) {
            xf9.e.f(boundingBox);
            return;
        }
        y98 y98Var = y98.e;
        y98Var.getClass();
        MutableBoundingBox mutableBoundingBox = boundingBox instanceof MutableBoundingBox ? (MutableBoundingBox) boundingBox : null;
        if (mutableBoundingBox != null) {
            y98Var.c(mutableBoundingBox);
        }
    }

    @Override // xsna.wq5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void e(String str, yzs yzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        String str2;
        androidx.compose.runtime.a M = aVar.M(782839565);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(yzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(782839565, i2, -1, "com.vk.ecomm.market.good.good2.presentation.community.market.ProductCardCommunityMarketInfoHolder.onBind.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (ProductCardCommunityMarketInfoHolder.kt:65)");
            }
            str2 = str;
            if (as.a((i2 & 112) | 8, yzsVar, fwu0.l(str2, null, null, null, M, i2 & 14, 62), M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            str2 = str;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yzg(this, str2, yzsVar, i);
        }
    }

    @Override // xsna.l5t
    public LinearLayout b(Context context, p3h p3hVar, nwk nwkVar, cws cwsVar) {
        LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(0, context);
        a.setMinimumHeight((int) a.getResources().getDimension(R.dimen.picker_toolbar_height));
        a.setPadding(cn70.b(16), 0, cn70.b(16), 0);
        a.setBackgroundColor(dhr0.t.c(R.attr.vk_ui_background_modal));
        return a;
    }

    @Override // xsna.l5t
    public void h(CustomSpinner customSpinner) {
        customSpinner.setDropDownWidth((int) (iah0.v() * 0.6666667f));
        abg0 abg0Var = dhr0.t;
        customSpinner.setBackgroundTintList(ColorStateList.valueOf(abg0Var.c(R.attr.vk_ui_text_muted)));
        customSpinner.setPopupBackgroundDrawable(new ColorDrawable(abg0Var.c(R.attr.vk_ui_background_modal)));
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zznz.zze());
    }

    @Override // xsna.l5t
    public void c(LinearLayout linearLayout) {
    }
}
