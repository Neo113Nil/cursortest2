package xsna;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.design.view.info.VideoInfoTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.eqs0;
import xsna.oui;

/* compiled from: VideoInfoFormatterDelegate.kt */
/* loaded from: classes14.dex */
public final class dqs0 {
    public final VideoInfoTextView a;
    public int b;
    public boolean c;
    public zps0 d = new zps0("", EmptyList.b);

    public dqs0(VideoInfoTextView videoInfoTextView) {
        this.a = videoInfoTextView;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(charSequence);
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned == null) {
            return;
        }
        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
        int length2 = spannableStringBuilder.length();
        for (Object obj : spans) {
            int spanStart = spanned.getSpanStart(obj) + length;
            int spanEnd = spanned.getSpanEnd(obj) + length;
            int spanFlags = spanned.getSpanFlags(obj);
            if (spanStart <= length2) {
                spannableStringBuilder.setSpan(obj, spanStart, Math.min(spanEnd, length2), spanFlags);
            }
        }
    }

    public final StaticLayout b(int i, CharSequence charSequence) {
        int length = charSequence.length();
        VideoInfoTextView videoInfoTextView = this.a;
        return StaticLayout.Builder.obtain(charSequence, 0, length, videoInfoTextView.getPaint(), i).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(videoInfoTextView.getLineSpacingExtra(), videoInfoTextView.getLineSpacingMultiplier()).setIncludePad(false).build();
    }

    public final CharSequence c(int i) {
        this.b = i;
        zps0 zps0Var = this.d;
        List<? extends eqs0> list = zps0Var.a;
        CharSequence charSequence = zps0Var.b;
        VideoInfoTextView videoInfoTextView = this.a;
        int i2 = 0;
        int max = Math.max(0, (i - videoInfoTextView.getCompoundPaddingLeft()) - videoInfoTextView.getCompoundPaddingRight());
        if (max == 0) {
            return "";
        }
        if (this.c && (videoInfoTextView.getLineCount() == 1 || videoInfoTextView.getMaxLines() == 1)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof eqs0.c) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CharSequence charSequence2 = ((eqs0.c) it.next()).a;
                spannableStringBuilder.append(charSequence);
                spannableStringBuilder.append(charSequence2);
            }
            i2 = an10.b(spannableStringBuilder.length() == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : b(max, spannableStringBuilder).getLineWidth(0));
        }
        return d(list, max, i2, charSequence, oui.b.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x000d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence d(List<? extends eqs0> list, int i, int i2, CharSequence charSequence, oui ouiVar) {
        CharSequence d;
        CharSequence charSequence2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator<? extends eqs0> it = list.iterator();
        int i3 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            VideoInfoTextView videoInfoTextView = this.a;
            if (!hasNext) {
                if (ouiVar instanceof oui.a) {
                    int i4 = ((oui.a) ouiVar).a;
                    StaticLayout b = b(i, spannableStringBuilder);
                    if (b.getLineCount() > i4) {
                        int lineStart = b.getLineStart(i4 - 1);
                        return TextUtils.concat(spannableStringBuilder.subSequence(0, lineStart), TextUtils.ellipsize(spannableStringBuilder.subSequence(lineStart, spannableStringBuilder.length()), videoInfoTextView.getPaint(), i, TextUtils.TruncateAt.END));
                    }
                } else if (!epx.f(ouiVar, oui.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return spannableStringBuilder;
            }
            eqs0 next = it.next();
            if (next instanceof eqs0.b) {
                eqs0.b bVar = (eqs0.b) next;
                int i5 = i - i2;
                CharSequence charSequence3 = bVar.b;
                float lineWidth = charSequence3.length() == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : b(i5, charSequence3).getLineWidth(0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                a(spannableStringBuilder2, TextUtils.ellipsize(bVar.a, videoInfoTextView.getPaint(), i5 - lineWidth, TextUtils.TruncateAt.END));
                a(spannableStringBuilder2, bVar.b);
                charSequence2 = spannableStringBuilder2;
            } else if (next instanceof eqs0.c) {
                charSequence2 = ((eqs0.c) next).a;
            } else {
                if (!(next instanceof eqs0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                eqs0.a aVar = (eqs0.a) next;
                d = d(aVar.a, i, i2, charSequence, aVar.b);
                if (d.length() != 0) {
                    if (spannableStringBuilder.length() > 0) {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                        spannableStringBuilder3.append(charSequence);
                        a(spannableStringBuilder3, d);
                        int lineCount = spannableStringBuilder3.length() == 0 ? 0 : b(i, spannableStringBuilder3).getLineCount();
                        spannableStringBuilder.append((i3 >= videoInfoTextView.getMaxLines() || lineCount <= i3) ? charSequence : "\n");
                        i3 = lineCount;
                    } else {
                        i3 = d.length() == 0 ? 0 : b(i, d).getLineCount();
                    }
                    a(spannableStringBuilder, d);
                }
            }
            d = charSequence2;
            if (d.length() != 0) {
            }
        }
    }
}
