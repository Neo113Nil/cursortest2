package one.video.controls.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.vkontakte.android.R;
import java.util.Arrays;
import one.video.controls.view.CurrentIntervalTitleView;
import xsna.lup0;
import xsna.m33;
import xsna.o7j;
import xsna.sox;
import xsna.x5r0;
import xsna.y3j;

/* compiled from: CurrentIntervalTitleView.kt */
/* loaded from: classes8.dex */
public final class CurrentIntervalTitleView extends AppCompatTextView {
    public static final /* synthetic */ int e = 0;
    public final int b;
    public final int c;
    public final y3j d;

    /* compiled from: CurrentIntervalTitleView.kt */
    public static final class a {
        public static final Spannable a(int i) {
            int i2 = CurrentIntervalTitleView.e;
            Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
            newSpannable.setSpan(new one.video.controls.view.a(i), 0, 1, 0);
            return newSpannable;
        }
    }

    public CurrentIntervalTitleView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public CurrentIntervalTitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public CurrentIntervalTitleView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ CurrentIntervalTitleView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    public CurrentIntervalTitleView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        setCompoundDrawablePadding(x5r0.c());
        setEllipsize(TextUtils.TruncateAt.END);
        setTypeface((Typeface) lup0.a.getValue());
        setLines(1);
        setTextColor(-1);
        setTextSize(2, 13.0f);
        Drawable a2 = m33.a(R.drawable.one_video_icon_chevron_outline_16, context);
        if (a2 != null) {
            a2.setTint(context.getColor(R.color.one_video_white_alpha60));
            setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, a2, (Drawable) null);
        }
        this.b = context.getColor(R.color.one_video_white);
        this.c = context.getColor(R.color.one_video_white_alpha60);
        this.d = new y3j(new o7j() { // from class: xsna.hlk
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // xsna.o7j
            public final void accept(Object obj) {
                CharSequence charSequence;
                String str;
                ilk ilkVar = (ilk) obj;
                int i3 = CurrentIntervalTitleView.e;
                boolean z = ilkVar.b;
                CurrentIntervalTitleView currentIntervalTitleView = CurrentIntervalTitleView.this;
                if (!z) {
                    currentIntervalTitleView.setVisibility(ilkVar.a ? 0 : 8);
                }
                if (currentIntervalTitleView.getVisibility() == 0) {
                    int i4 = currentIntervalTitleView.c;
                    sox.a aVar = ilkVar.c;
                    int i5 = ilkVar.d;
                    int i6 = ilkVar.e;
                    if (aVar == null || (str = aVar.c) == null) {
                        charSequence = "";
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        Integer num = ilkVar.h;
                        spannableStringBuilder.append((CharSequence) CurrentIntervalTitleView.a.a(num != null ? num.intValue() : ((Number) x5r0.h.getValue()).intValue()));
                        spannableStringBuilder.append(ilkVar.g, new ForegroundColorSpan(i4), 33);
                        Integer num2 = ilkVar.i;
                        spannableStringBuilder.append((CharSequence) CurrentIntervalTitleView.a.a(num2 != null ? num2.intValue() : ((Number) x5r0.h.getValue()).intValue()));
                        spannableStringBuilder.append(str, new ForegroundColorSpan(currentIntervalTitleView.b), 33);
                        spannableStringBuilder.append((CharSequence) CurrentIntervalTitleView.a.a(((Number) x5r0.h.getValue()).intValue()));
                        if (ilkVar.f) {
                            spannableStringBuilder.append(String.format("%s/%s", Arrays.copyOf(new Object[]{Integer.valueOf(i5 + 1), Integer.valueOf(i6)}, 2)), new ForegroundColorSpan(i4), 33);
                        }
                        charSequence = new SpannedString(spannableStringBuilder);
                    }
                    currentIntervalTitleView.setText(charSequence);
                }
            }
        });
    }
}
