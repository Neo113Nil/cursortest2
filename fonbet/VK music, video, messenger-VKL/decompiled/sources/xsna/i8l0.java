package xsna;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import com.google.android.flexbox.FlexboxLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.TintTextView;
import com.vk.dto.stickers.StickerSuggestion;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.k8l0;
import xsna.kcl0;

/* compiled from: StickerWordsView.kt */
/* loaded from: classes6.dex */
public final class i8l0 implements k8l0.a {
    public final kcl0.e a;
    public final FlexboxLayout b;
    public final Context c;
    public final TextPaint d;
    public Integer e;
    public View f;
    public final io.reactivex.rxjava3.disposables.b g;

    public i8l0(kcl0.e eVar, FlexboxLayout flexboxLayout) {
        this.a = eVar;
        this.b = flexboxLayout;
        Context context = flexboxLayout.getContext();
        this.c = context;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.g = new io.reactivex.rxjava3.disposables.b();
        com.vk.typography.b.j(textPaint, context, FontFamily.MEDIUM, Float.valueOf(15.0f), 8);
    }

    @Override // xsna.k8l0.a
    public final void a(int i) {
        Integer num = this.e;
        if (num != null && num.intValue() == i) {
            c(i);
        }
    }

    public final TintTextView b() {
        TintTextView tintTextView = new TintTextView(this.c, null, 6, 0);
        com.vk.typography.b.k(tintTextView, FontFamily.MEDIUM, Float.valueOf(15.0f), 4);
        tintTextView.setLetterSpacing(0.01f);
        his0.x(tintTextView, R.color.vk_white);
        tintTextView.setSingleLine();
        tintTextView.setClickable(true);
        tintTextView.setGravity(17);
        return tintTextView;
    }

    public final void c(int i) {
        io.reactivex.rxjava3.disposables.b bVar = this.g;
        bVar.e();
        this.e = Integer.valueOf(i);
        kcl0.e eVar = this.a;
        List<StickerSuggestion> a = eVar.a(i);
        if (a != null) {
            d(i, a);
            return;
        }
        FlexboxLayout flexboxLayout = this.b;
        flexboxLayout.setVisibility(4);
        io.reactivex.rxjava3.disposables.c subscribe = eVar.b(i).subscribe(new h8l0(new hbe(this, i, 5), 0), new xk30(new q8i0(this, 7), 21));
        hg1.b(flexboxLayout, subscribe);
        bVar.b(subscribe);
    }

    public final void d(int i, List<StickerSuggestion> list) {
        int i2;
        int i3;
        FlexboxLayout flexboxLayout = this.b;
        flexboxLayout.setVisibility(0);
        flexboxLayout.removeAllViews();
        int measuredWidth = flexboxLayout.getMeasuredWidth();
        boolean isEmpty = list.isEmpty();
        int i4 = 6;
        Context context = this.c;
        if (isEmpty) {
            i3 = 0;
            i2 = 6;
        } else {
            int a = e3m.a(R.dimen.sticker_suggest_spacing, context);
            int a2 = e3m.a(R.dimen.sticker_suggest_horizontal_padding, context);
            String string = context.getString(isEmpty ? R.string.sticker_details_overlay_suggests_settings : R.string.sticker_details_overlay_all_suggests);
            TextPaint textPaint = this.d;
            float measureText = a2 + textPaint.measureText(string) + e3m.a(R.dimen.sticker_suggest_drawable_padding, context) + cn70.b(20) + cn70.b(6);
            int i5 = a * 2;
            float f = measureText + i5;
            int i6 = measuredWidth + a;
            Iterator<StickerSuggestion> it = list.iterator();
            int i7 = 0;
            int i8 = i6;
            while (true) {
                if (!it.hasNext()) {
                    i2 = i4;
                    break;
                }
                StickerSuggestion next = it.next();
                ucp ucpVar = ucp.a;
                CharSequence i9 = ucp.i(next.b);
                i2 = i4;
                int a3 = rqi.a(a2, 2, (int) textPaint.measureText(i9, 0, i9.length()), i5);
                if (i6 > 0) {
                    i6 -= a3;
                    if (i6 < 0) {
                        i6 = -1;
                    } else {
                        continue;
                        i7++;
                        i4 = i2;
                    }
                }
                if (i6 >= 0 || i8 <= 0) {
                    break;
                }
                i8 -= a3;
                if (i8 - f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    break;
                }
                i7++;
                i4 = i2;
            }
            i3 = i7;
        }
        Iterator it2 = j5g.H0(list, i3).iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            int i10 = R.drawable.shape_suggest;
            if (!hasNext) {
                break;
            }
            StickerSuggestion stickerSuggestion = (StickerSuggestion) it2.next();
            TintTextView b = b();
            ucp ucpVar2 = ucp.a;
            b.setText(ucp.i(stickerSuggestion.b));
            if (stickerSuggestion.c) {
                i10 = R.drawable.shape_suggest_primary;
            }
            dhr0.h0(i10, b);
            int a4 = e3m.a(R.dimen.sticker_suggest_horizontal_padding, context);
            b.setPadding(a4, cn70.b(3), a4, cn70.b(i2));
            flexboxLayout.addView(b);
        }
        TintTextView b2 = b();
        b2.setText(list.isEmpty() ? R.string.sticker_details_overlay_suggests_settings : R.string.sticker_details_overlay_all_suggests);
        dhr0.h0(R.drawable.shape_suggest, b2);
        b2.setIncludeFontPadding(false);
        his0.t(b2, R.drawable.vk_icon_chevron_right_outline_20, R.color.vk_white);
        b2.setCompoundDrawablePadding(e3m.a(R.dimen.sticker_suggest_drawable_padding, context));
        b2.setPadding(e3m.a(R.dimen.sticker_suggest_horizontal_padding, context), cn70.b(4), cn70.b(i2), cn70.b(i2));
        jjc.g(b2, new mdm(this, i, list, 1));
        int size = list.size() - i3;
        if (size > 0) {
            b2.setContentDescription(context.getString(R.string.sticker_details_overlay_accessibility_suggest_settings, Integer.valueOf(size)));
        } else {
            b2.setContentDescription(context.getString(R.string.sticker_details_overlay_accessibility_suggest_settings_empty));
        }
        flexboxLayout.addView(b2);
        ucp ucpVar3 = ucp.a;
        io.reactivex.rxjava3.disposables.c subscribe = ucp.a().subscribe(new tmz(new l850(this, 16), 15));
        hg1.b(flexboxLayout, subscribe);
        this.g.b(subscribe);
    }
}
