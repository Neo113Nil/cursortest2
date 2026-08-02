package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.zznn;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.api.generated.wall.dto.WallActionButtonVkTicketDto;
import com.vk.api.generated.wall.dto.WallActionButtonVkTicketSeanceDto;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.dto.photo.Photo;
import com.vk.log.L;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.push.common.HostInfoProvider;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import okhttp3.Interceptor;
import xsna.e3m;

/* compiled from: VideoTime.kt */
@vby
/* loaded from: classes7.dex */
public final class his0 implements q701, HostInfoProvider {
    public static final /* synthetic */ his0 b = new his0();
    public static io.reactivex.rxjava3.disposables.c c;
    public static int d;

    public static final Interceptor A(Interceptor interceptor, wdp0 wdp0Var) {
        if (interceptor instanceof nz80) {
            return interceptor;
        }
        if (interceptor instanceof sz80) {
            return interceptor;
        }
        return new nz80(wdp0Var, interceptor instanceof uz80 ? ((uz80) interceptor).getTag() : null, interceptor);
    }

    public static final qzw a(String str, KSerializer kSerializer) {
        return new qzw(str, new rzw(kSerializer));
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        androidx.compose.runtime.a M = aVar.M(-1931446309);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1931446309, i, -1, "com.vk.core.compose.modal.VkThemeWithoutOverscroll (VkThemeWithoutOverscroll.kt:11)");
            }
            rrv0.d(null, null, null, null, kai.c(-357101162, new com.vk.movika.tools.controls.seekbar.h(jaiVar, 14), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.i(jaiVar, i, 23);
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        androidx.compose.runtime.a M = aVar.M(-1448999113);
        if (M.t(i & 1, (i & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1448999113, i, -1, "com.vk.core.compose.modal.VkThemeWithoutOverscroll (VkThemeWithoutOverscroll.kt:24)");
            }
            rrv0.e(true, null, null, null, null, null, kai.c(-1690567820, new com.vk.movika.tools.controls.seekbar.k(jaiVar, 14), M), M, 1572870, 62);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.l(jaiVar, i, 18);
        }
    }

    public static final void d(a1w a1wVar) {
        a1wVar.a.getClass();
        vdw.a.d();
    }

    public static mbu e(mbu mbuVar, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = mbuVar.a;
        }
        if ((i & 2) != 0) {
            z2 = mbuVar.b;
        }
        return (z == mbuVar.a && z2 == mbuVar.b) ? mbuVar : new mbu(z, z2);
    }

    public static final String f(WallActionButtonVkTicketDto wallActionButtonVkTicketDto) {
        String d2;
        String f;
        Pair g;
        StringBuilder sb = new StringBuilder();
        sb.append(wallActionButtonVkTicketDto.getTitle());
        WallActionButtonVkTicketSeanceDto d3 = wallActionButtonVkTicketDto.d();
        if (d3 != null && (f = d3.f()) != null && (g = g(f)) != null) {
            sb.append(" · " + ((String) g.d()) + ' ' + ((String) g.g()));
        }
        WallActionButtonVkTicketSeanceDto d4 = wallActionButtonVkTicketDto.d();
        if (d4 != null && (d2 = d4.d()) != null) {
            sb.append(" · ".concat(d2));
        }
        return sb.toString();
    }

    public static final Pair g(String str) {
        try {
            LocalDateTime parse = LocalDateTime.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
            int dayOfMonth = parse.getDayOfMonth();
            return new Pair(String.valueOf(dayOfMonth), parse.getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault()).substring(0, 3));
        } catch (Exception e) {
            L.i(e);
            return null;
        }
    }

    public static final String h(long j, Context context) {
        return j == -1 ? context.getString(R.string.voip_video_live) : j == -2 ? context.getString(R.string.video_live_upcoming) : bkt0.a(j);
    }

    public static final Class i(NavigationDelegateActivity navigationDelegateActivity) {
        if (navigationDelegateActivity != null) {
            return navigationDelegateActivity.getClass();
        }
        return null;
    }

    public static final ImageSize j(Photo photo) {
        ImageSize imageSize = photo.J;
        return imageSize == null ? (ImageSize) ixj0.b(photo.y.b) : imageSize;
    }

    public static final ImageSize k(PhotoAttachment photoAttachment) {
        Photo photo = photoAttachment.l;
        ImageSize imageSize = photo.K;
        return imageSize == null ? j(photo) : imageSize;
    }

    public static final Float l(Photo photo) {
        Image image;
        int i;
        ImageSize j = j(photo);
        if (j == null || (i = (image = j.d).c) <= 0) {
            return null;
        }
        return Float.valueOf(image.b / i);
    }

    public static final boolean m(float f, float f2) {
        return Math.abs(f - f2) <= 0.04f;
    }

    public static final void n(TextView textView, String str, Integer num, gzs gzsVar) {
        SpannableString spannableString = new SpannableString(textView.getText());
        ino0 ino0Var = new ino0(num.intValue(), gzsVar);
        int K = drm0.K(0, 6, spannableString, str, false);
        spannableString.setSpan(ino0Var, K, str.length() + K, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(num.intValue());
        textView.setClickable(true);
    }

    public static boolean o(xgl0 xgl0Var, final long j, final int i) {
        return ((Boolean) xgl0Var.u(new izs() { // from class: xsna.ejm
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                boolean z;
                boolean z2;
                hpm e = ((xgl0) obj).b().e();
                long j2 = j;
                com.vk.im.engine.models.dialogs.b c2 = e.c(j2);
                boolean z3 = false;
                if (c2 != null) {
                    if (epx.f(c2.n, Boolean.FALSE)) {
                        e.q(j2, null);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i2 = c2.k;
                    if (i2 <= c2.g || i2 != i) {
                        z2 = false;
                    } else {
                        e.c.a(Long.valueOf(j2), new vt1(19), new n3i(e, 7));
                        z2 = true;
                    }
                    if (z || z2) {
                        z3 = true;
                    }
                }
                return Boolean.valueOf(z3);
            }
        })).booleanValue();
    }

    public static boolean p(long j, xgl0 xgl0Var) {
        return ((Boolean) xgl0Var.u(new q72(j, 1))).booleanValue();
    }

    public static SpannableStringBuilder q(String str) {
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Stack stack = new Stack();
        Stack stack2 = new Stack();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int indexOf = str.indexOf(47, i2);
            if (indexOf == -1) {
                break;
            }
            int i4 = indexOf - i2;
            if (i4 > 0) {
                spannableStringBuilder.append((CharSequence) str.substring(i2, indexOf));
                i3 += i4;
            }
            char charAt = str.charAt(indexOf + 1);
            int i5 = indexOf + 2;
            if (charAt == '/') {
                spannableStringBuilder.append('/');
                i3++;
            } else if (charAt == 'e') {
                spannableStringBuilder.setSpan(stack.pop(), ((Integer) stack2.pop()).intValue(), i3, 0);
            } else if (charAt == 'i') {
                stack.push(new StyleSpan(2));
                stack2.push(Integer.valueOf(i3));
            } else if (charAt == 'm') {
                Typeface a = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, e43.a);
                TextSizeUnit textSizeUnit = TextSizeUnit.SP;
                stack.push(new qup0(a));
                stack2.push(Integer.valueOf(i3));
            } else if (charAt == 's') {
                stack.push(new StrikethroughSpan());
                stack2.push(Integer.valueOf(i3));
            } else if (charAt != 'u') {
                if (charAt == 'z') {
                    i = indexOf + 5;
                    stack.push(new AbsoluteSizeSpan(Integer.parseInt(str.substring(i5, i)), true));
                    stack2.push(Integer.valueOf(i3));
                } else if (charAt == 'b') {
                    stack.push(new StyleSpan(1));
                    stack2.push(Integer.valueOf(i3));
                } else if (charAt == 'c') {
                    i = indexOf + 10;
                    stack.push(new ForegroundColorSpan((int) Long.parseLong(str.substring(i5, i), 16)));
                    stack2.push(Integer.valueOf(i3));
                }
                i2 = i;
            } else {
                stack.push(new UnderlineSpan());
                stack2.push(Integer.valueOf(i3));
            }
            i2 = i5;
        }
        if (i2 < str.length()) {
            spannableStringBuilder.append((CharSequence) str.substring(i2));
        }
        if (stack.size() <= 0) {
            return spannableStringBuilder;
        }
        throw new IllegalArgumentException("Some spans don't have their ends defined with /e");
    }

    public static float r(boolean z) {
        return z ? 1.0f : 0.64f;
    }

    public static final boolean s(TextView textView) {
        return textView == null || TextUtils.isEmpty(textView.getEditableText());
    }

    public static final void t(TextView textView, int i, int i2) {
        if (i == 0) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (i2 == 0) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, m33.a(i, textView.getContext()), (Drawable) null);
        } else {
            u(textView, m33.a(i, textView.getContext()), anj.b(i2, textView.getContext()));
        }
    }

    public static final void u(TextView textView, Drawable drawable, ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (drawable != null) {
                drawable = drawable.mutate();
                drawable.setTintList(colorStateList);
            } else {
                drawable = null;
            }
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }

    public static final void v(TextView textView, int i, int i2) {
        if (i == 0) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        if (i2 == 0) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(m33.a(i, textView.getContext()), (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Drawable a = m33.a(i, textView.getContext());
        ColorStateList b2 = anj.b(i2, textView.getContext());
        if (b2 != null) {
            if (a != null) {
                a = a.mutate();
                a.setTintList(b2);
            } else {
                a = null;
            }
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(a, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public static final void w(TextView textView, int i, int i2) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(enj.c(i, e3m.f(i2, textView.getContext()), textView.getContext()), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public static final void x(TextView textView, int i) {
        Context context = textView.getContext();
        e3m.a aVar = e3m.a;
        textView.setTextColor(context.getColor(i));
    }

    public static final jxp0 y(String str) {
        int i;
        ro.d(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        if (epx.g(charAt, 48) < 0) {
            i = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i3 = 119304647;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i2, i3) > 0) {
                if (i3 != 119304647) {
                    return null;
                }
                i3 = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i2, i3) > 0) {
                    return null;
                }
            }
            int i4 = i2 * 10;
            int i5 = digit + i4;
            if (Integer.compareUnsigned(i5, i4) < 0) {
                return null;
            }
            i++;
            i2 = i5;
        }
        return new jxp0(i2);
    }

    public static final oxp0 z(String str) {
        ro.d(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char charAt = str.charAt(0);
        if (epx.g(charAt, 48) < 0) {
            i = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long j = 10;
        long j2 = 0;
        long j3 = 512409557603043100L;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j2, j3) > 0) {
                if (j3 != 512409557603043100L) {
                    return null;
                }
                j3 = Long.divideUnsigned(-1L, j);
                if (Long.compareUnsigned(j2, j3) > 0) {
                    return null;
                }
            }
            long j4 = j2 * j;
            long j5 = (digit & 4294967295L) + j4;
            if (Long.compareUnsigned(j5, j4) < 0) {
                return null;
            }
            i++;
            j2 = j5;
        }
        return new oxp0(j2);
    }

    @Override // com.vk.push.common.HostInfoProvider
    public String getHost() {
        return "auth.vkpns.rustore.ru";
    }

    @Override // com.vk.push.common.HostInfoProvider
    public Integer getPort() {
        return HostInfoProvider.DefaultImpls.getPort(this);
    }

    @Override // com.vk.push.common.HostInfoProvider
    public String getScheme() {
        return HttpRequest.DEFAULT_SCHEME;
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Long.valueOf(zznn.zzl());
    }
}
