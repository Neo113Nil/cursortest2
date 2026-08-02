package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.emoji2.emojipicker.EmojiView;
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.ImmutableIntArray;
import java.util.List;

/* loaded from: classes10.dex */
public final class dun extends bun {
    public static final ImmutableIntArray k = new ImmutableIntArray(new int[]{d0i0.emoji_skin_tone_light_content_desc, d0i0.emoji_skin_tone_medium_light_content_desc, d0i0.emoji_skin_tone_medium_content_desc, d0i0.emoji_skin_tone_medium_dark_content_desc, d0i0.emoji_skin_tone_dark_content_desc});
    public static final ImmutableIntArray l = new ImmutableIntArray(new int[]{c2i0.EmojiSkintoneSelectorLight, c2i0.EmojiSkintoneSelectorMediumLight, c2i0.EmojiSkintoneSelectorMedium, c2i0.EmojiSkintoneSelectorMediumDark, c2i0.EmojiSkintoneSelectorDark});
    public static final ImmutableMap m;
    public final Context b;
    public final View c;
    public final List d;
    public final LinearLayout e;
    public final View.OnClickListener f;
    public final LayoutInflater g;
    public final LinearLayout h;
    public int i;
    public int j;

    static {
        ImmutableMap.a aVar = new ImmutableMap.a();
        aVar.b("🤝", ImmutableIntArray.b(l3h0.handshake_skintone_shadow, l3h0.handshake_shadow_skintone));
        aVar.b("👭", ImmutableIntArray.b(l3h0.holding_women_skintone_shadow, l3h0.holding_women_shadow_skintone));
        aVar.b("👫", ImmutableIntArray.b(l3h0.holding_woman_man_skintone_shadow, l3h0.holding_woman_man_shadow_skintone));
        aVar.b("👬", ImmutableIntArray.b(l3h0.holding_men_skintone_shadow, l3h0.holding_men_shadow_skintone));
        aVar.b("🧑\u200d🤝\u200d🧑", ImmutableIntArray.b(l3h0.holding_people_skintone_shadow, l3h0.holding_people_shadow_skintone));
        aVar.b("💏", ImmutableIntArray.b(l3h0.kiss_people_skintone_shadow, l3h0.kiss_people_shadow_skintone));
        aVar.b("👩\u200d❤️\u200d💋\u200d👨", ImmutableIntArray.b(l3h0.kiss_woman_man_skintone_shadow, l3h0.kiss_woman_man_shadow_skintone));
        aVar.b("👨\u200d❤️\u200d💋\u200d👨", ImmutableIntArray.b(l3h0.kiss_men_skintone_shadow, l3h0.kiss_men_shadow_skintone));
        aVar.b("👩\u200d❤️\u200d💋\u200d👩", ImmutableIntArray.b(l3h0.kiss_women_skintone_shadow, l3h0.kiss_women_shadow_skintone));
        aVar.b("💑", ImmutableIntArray.b(l3h0.couple_heart_people_skintone_shadow, l3h0.couple_heart_people_shadow_skintone));
        aVar.b("👩\u200d❤️\u200d👨", ImmutableIntArray.b(l3h0.couple_heart_woman_man_skintone_shadow, l3h0.couple_heart_woman_man_shadow_skintone));
        aVar.b("👨\u200d❤️\u200d👨", ImmutableIntArray.b(l3h0.couple_heart_men_skintone_shadow, l3h0.couple_heart_men_shadow_skintone));
        aVar.b("👩\u200d❤️\u200d👩", ImmutableIntArray.b(l3h0.couple_heart_women_skintone_shadow, l3h0.couple_heart_women_shadow_skintone));
        m = aVar.a();
    }

    public dun(Context context, View view, List list, LinearLayout linearLayout, View.OnClickListener onClickListener, String str) {
        this.b = context;
        this.c = view;
        this.d = list;
        this.e = linearLayout;
        this.f = onClickListener;
        this.g = LayoutInflater.from(context);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.h = linearLayout2;
        this.i = -1;
        this.j = -1;
        int indexOf = list.indexOf(str);
        if (indexOf > 0) {
            this.i = (indexOf - 1) / 5;
            this.j = (indexOf - (r2 * 5)) - 1;
        }
    }

    @Override // defpackage.bun
    public final void a() {
        int i = gth0.emoji_picker_popup_emoji_view;
        LayoutInflater layoutInflater = this.g;
        LinearLayout linearLayout = this.h;
        layoutInflater.inflate(i, linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(0);
        EmojiView emojiView = (EmojiView) linearLayout2.findViewById(f7h0.emoji_picker_popup_emoji_view);
        emojiView.setWillDrawVariantIndicator$emoji2_emojipicker_release(false);
        emojiView.setEmoji((CharSequence) this.d.get(0));
        View view = this.c;
        emojiView.setLayoutParams(new LinearLayout.LayoutParams(view.getWidth(), view.getHeight()));
        emojiView.setClickable(true);
        emojiView.setOnClickListener(this.f);
        ((LinearLayout) linearLayout2.findViewById(f7h0.emoji_picker_popup_emoji_view_wrapper)).setLayoutParams(new LinearLayout.LayoutParams((view.getWidth() * 5) / 2, view.getHeight()));
        m();
        this.e.addView(linearLayout);
    }

    @Override // defpackage.bun
    public final void c() {
        int i;
        int i2 = 0;
        while (i2 < 2) {
            LinearLayout linearLayout = new LinearLayout(this.b);
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            int i3 = 0;
            while (i3 < 5) {
                this.g.inflate(gth0.emoji_picker_popup_image_view, linearLayout);
                ImageView imageView = (ImageView) linearLayout.getChildAt(i3);
                View view = this.c;
                imageView.setLayoutParams(new LinearLayout.LayoutParams(view.getWidth(), view.getHeight()));
                imageView.setClickable(true);
                Context context = imageView.getContext();
                int i4 = d0i0.emoji_variant_content_desc_template;
                ImmutableIntArray immutableIntArray = k;
                imageView.setContentDescription(context.getString(i4, context.getString(i3 == -1 ? d0i0.emoji_skin_tone_shadow_content_desc : i2 == 0 ? immutableIntArray.a(i3) : d0i0.emoji_skin_tone_shadow_content_desc), context.getString(i3 == -1 ? d0i0.emoji_skin_tone_shadow_content_desc : i2 == 0 ? d0i0.emoji_skin_tone_shadow_content_desc : immutableIntArray.a(i3))));
                int i5 = this.i;
                if ((i5 != -1 && i2 == 0 && i5 == i3) || ((i = this.j) != -1 && i2 == 1 && i == i3)) {
                    imageView.setSelected(true);
                    imageView.setClickable(false);
                }
                imageView.setImageDrawable(this.l(imageView.getContext(), i2, i3));
                imageView.setOnClickListener(new cun(i2, this, linearLayout, i3, imageView));
                i3++;
            }
            dun dunVar = this;
            dunVar.e.addView(linearLayout);
            i2++;
            this = dunVar;
        }
    }

    @Override // defpackage.bun
    public final Context d() {
        return this.b;
    }

    @Override // defpackage.bun
    public final View.OnClickListener e() {
        return this.f;
    }

    @Override // defpackage.bun
    public final int f() {
        return 5;
    }

    @Override // defpackage.bun
    public final int g() {
        return 3;
    }

    @Override // defpackage.bun
    public final LinearLayout h() {
        return this.e;
    }

    @Override // defpackage.bun
    public final View i() {
        return this.c;
    }

    @Override // defpackage.bun
    public final List j() {
        return this.d;
    }

    public final void k(int i, int i2, boolean z) {
        ImageView imageView = (ImageView) this.g.inflate(gth0.emoji_picker_popup_image_view, this.h).findViewById(f7h0.emoji_picker_popup_image_view);
        int i3 = 0;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(0, this.c.getHeight(), 1.0f));
        imageView.setImageDrawable(l(imageView.getContext(), i, i2));
        if (z) {
            imageView.setImageTintList(ColorStateList.valueOf(-7829368));
        }
        int i4 = this.i;
        int i5 = this.j;
        if (i4 == -1) {
            i3 = i5 != -1 ? 1 : i4;
            i4 = i5;
        }
        Context context = imageView.getContext();
        int i6 = d0i0.emoji_variant_content_desc_template;
        ImmutableIntArray immutableIntArray = k;
        imageView.setContentDescription(context.getString(i6, context.getString(i4 == -1 ? d0i0.emoji_skin_tone_shadow_content_desc : i3 == 0 ? immutableIntArray.a(i4) : d0i0.emoji_skin_tone_shadow_content_desc), context.getString(i4 == -1 ? d0i0.emoji_skin_tone_shadow_content_desc : i3 == 0 ? d0i0.emoji_skin_tone_shadow_content_desc : immutableIntArray.a(i4))));
    }

    public final Drawable l(Context context, int i, int i2) {
        ImmutableIntArray immutableIntArray = (ImmutableIntArray) m.get(this.d.get(0));
        if (immutableIntArray == null) {
            return null;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, l.a(i2));
        Resources resources = context.getResources();
        int a = immutableIntArray.a(i);
        Resources.Theme theme = contextThemeWrapper.getTheme();
        ThreadLocal threadLocal = wuj0.a;
        return resources.getDrawable(a, theme);
    }

    public final void m() {
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        if (childCount < 1 || childCount > 2) {
            Log.e("MultiSkintoneDesign", "processResultEmojiForRectangleLayout(): unexpected emoji result row size");
            return;
        }
        if (childCount == 2) {
            linearLayout.removeViewAt(1);
        }
        int i = this.i;
        if (i == -1 || this.j == -1) {
            if (i != -1) {
                k(0, i, false);
                return;
            }
            int i2 = this.j;
            if (i2 != -1) {
                k(1, i2, false);
                return;
            } else {
                k(0, 0, true);
                return;
            }
        }
        this.g.inflate(gth0.emoji_picker_popup_emoji_view, linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(1);
        EmojiView emojiView = (EmojiView) linearLayout2.findViewById(f7h0.emoji_picker_popup_emoji_view);
        emojiView.setWillDrawVariantIndicator$emoji2_emojipicker_release(false);
        emojiView.setClickable(true);
        emojiView.setEmoji((CharSequence) this.d.get((this.i * 5) + this.j + 1));
        emojiView.setOnClickListener(this.f);
        View view = this.c;
        emojiView.setLayoutParams(new LinearLayout.LayoutParams(view.getWidth(), view.getHeight()));
        ((LinearLayout) linearLayout2.findViewById(f7h0.emoji_picker_popup_emoji_view_wrapper)).setLayoutParams(new LinearLayout.LayoutParams((view.getWidth() * 5) / 2, view.getHeight()));
    }
}
