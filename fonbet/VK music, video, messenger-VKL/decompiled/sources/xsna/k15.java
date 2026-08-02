package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.google.android.gms.internal.measurement.zznn;
import com.ironsource.X3;
import com.vk.catalog2.common.dto.api.style.MusicTrackCatalogViewStyle;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.activities.CommentsActivity;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.profile.community.impl.livecover.LiveCoverType;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$LiveCoverEvent;
import com.vk.superapp.multiaccount.api.AgeGroup;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.utils.UserNameIconType;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Triple;
import kotlin.collections.builders.ListBuilder;
import xsna.e3m;

/* compiled from: AudiosBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class k15 implements q701, o2u0 {
    public static final /* synthetic */ k15 b = new k15();

    public static final VideoFile A(SdkVideoFile sdkVideoFile) {
        if (sdkVideoFile instanceof VideoFileAdapter) {
            return ((VideoFileAdapter) sdkVideoFile).d();
        }
        throw new IllegalStateException("There is shouldn't be other adapter other then VideoFileAdapter");
    }

    public static final VideoFileAdapter B(VideoFile videoFile) {
        return videoFile instanceof ClipVideoFile ? new ClipVideoFileAdapter((ClipVideoFile) videoFile) : new VideoFileAdapter(videoFile);
    }

    public static Object C(@NonNull Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalStateException(i5s.a(xe9.a("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), X3.j.e));
    }

    public static void D(@NonNull Bundle bundle, @NonNull Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static final void b(TextView textView, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            textView.setText("");
            textView.setVisibility(4);
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }

    public static final void c(io.reactivex.rxjava3.disposables.b bVar, io.reactivex.rxjava3.disposables.c cVar) {
        bVar.b(cVar);
    }

    public static final void e(io.reactivex.rxjava3.disposables.c cVar, j8i j8iVar) {
        j8iVar.c.b(cVar);
    }

    public static void g(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(cqi.c(obj2, "null key in entry: null="));
        }
        if (obj2 == null) {
            throw new NullPointerException(so.a(obj, "null value in entry: ", "=null"));
        }
    }

    public static void h(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(na8.a(i, str, " cannot be negative but was: "));
        }
    }

    public static SpannableString i(Context context, Spannable spannable, Boolean bool, Boolean bool2, boolean z) {
        UserNameIconType userNameIconType;
        if (z) {
            userNameIconType = UserNameIconType.LOCKED;
        } else {
            Boolean bool3 = Boolean.TRUE;
            userNameIconType = (epx.f(bool2, bool3) && epx.f(bool, bool3)) ? UserNameIconType.CELEBRITY : (epx.f(bool2, bool3) && epx.f(bool, Boolean.FALSE)) ? UserNameIconType.VERIFIED : null;
        }
        if (userNameIconType == null) {
            return new SpannableString(spannable);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) spannable);
        spannableStringBuilder.append((CharSequence) "   ");
        int length = spannable.length() + 1;
        int length2 = spannable.length() + 2;
        int h = userNameIconType.h();
        e3m.a aVar = e3m.a;
        Drawable a = m33.a(h, context);
        if (a != null) {
            float f = 16;
            a.setBounds(0, 0, iah0.a(f), iah0.a(f));
            a.setTint(userNameIconType.i(context));
            spannableStringBuilder.setSpan(new ImageSpan(a, 2), length, length2, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public static UUID j(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.BIG_ENDIAN);
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    public static byte[] k(UUID uuid) {
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        byte[] bArr = new byte[16];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) (mostSignificantBits >>> ((7 - i) * 8));
        }
        for (int i2 = 8; i2 < 16; i2++) {
            bArr[i2] = (byte) (leastSignificantBits >>> ((7 - i2) * 8));
        }
        return bArr;
    }

    public static hn80 m(hn80 hn80Var, g2b0 g2b0Var, fzi fziVar) {
        boolean z = g2b0Var != null && g2b0Var.h;
        boolean z2 = g2b0Var != null && g2b0Var.j;
        sox soxVar = fziVar.k;
        long j = g2b0Var != null ? g2b0Var.g : 0L;
        if (z) {
            if (!(g2b0Var != null ? g2b0Var.i : false)) {
                j = -j;
            }
        }
        int i = (int) j;
        long j2 = g2b0Var != null ? g2b0Var.e : 0L;
        long j3 = g2b0Var != null ? g2b0Var.g : 0L;
        if (z) {
            if (!(g2b0Var != null ? g2b0Var.i : false)) {
                j2 -= j3;
            }
        }
        int i2 = (int) j2;
        long j4 = g2b0Var != null ? g2b0Var.e : 0L;
        long j5 = g2b0Var != null ? g2b0Var.f : 0L;
        long j6 = g2b0Var != null ? g2b0Var.g : 0L;
        if (z) {
            if (!(g2b0Var != null ? g2b0Var.i : false)) {
                j5 = j4 - j6;
            }
        }
        int i3 = (int) j5;
        return (z == hn80Var.a && z2 == hn80Var.b && epx.f(soxVar, hn80Var.c) && i == hn80Var.d && i2 == hn80Var.e && i3 == hn80Var.f) ? hn80Var : new hn80(z, z2, soxVar, i, i2, i3);
    }

    public static u1c0 n(int i, Post post, Comment comment) {
        Activity activity = post.C;
        Triple triple = new Triple(post, activity instanceof CommentsActivity ? (CommentsActivity) activity : null, comment);
        u1c0 u1c0Var = new u1c0(60, post);
        u1c0Var.h = (ol60) j5g.a0(new yiz().q(i, triple));
        return u1c0Var;
    }

    public static Spannable o(Context context, String str, AgeGroup ageGroup) {
        if (ageGroup == AgeGroup.NO_AGE_GROUP) {
            return new SpannableString("");
        }
        String str2 = " · " + ageGroup.h() + "+ ";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append((CharSequence) str2);
        int K = drm0.K(0, 6, spannableStringBuilder, str2, false);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(e3m.f(R.attr.vk_ui_text_secondary, context)), K, str2.length() + K, 33);
        return spannableStringBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int p(eng0 eng0Var, x9g0 x9g0Var, rip ripVar, int i) {
        float f;
        int max;
        float f2;
        double d;
        int i2;
        int i3;
        int i4;
        int i5 = 1;
        if (!rip.v(ripVar)) {
            return 1;
        }
        if (!rip.v(ripVar)) {
            throw new IllegalStateException("Check failed.");
        }
        int i6 = 2;
        if (x9g0Var != null) {
            int i7 = x9g0Var.a;
            int i8 = x9g0Var.b;
            if (i8 > 0 && i7 > 0) {
                ripVar.y();
                if (ripVar.f != 0) {
                    ripVar.y();
                    if (ripVar.g != 0) {
                        if (eng0Var.a == -1) {
                            ripVar.y();
                            i2 = ripVar.d;
                            if (i2 != 0 && i2 != 90 && i2 != 180 && i2 != 270) {
                                throw new IllegalStateException("Check failed.");
                            }
                        } else {
                            i2 = 0;
                        }
                        boolean z = i2 == 90 || i2 == 270;
                        if (z) {
                            ripVar.y();
                            i3 = ripVar.g;
                        } else {
                            ripVar.y();
                            i3 = ripVar.f;
                        }
                        if (z) {
                            ripVar.y();
                            i4 = ripVar.f;
                        } else {
                            ripVar.y();
                            i4 = ripVar.g;
                        }
                        float f3 = i7 / i3;
                        float f4 = i8 / i4;
                        f = f3 < f4 ? f4 : f3;
                        Object[] objArr = {Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f)};
                        if (ahq.a.a(2)) {
                            bhq.b(2, "DownsampleUtil", String.format(null, "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", objArr));
                        }
                        ripVar.y();
                        if (ripVar.c != hgl.a) {
                            if (f <= 0.6666667f) {
                                do {
                                    i5 = i6;
                                    i6 = i5 * 2;
                                    d = 1.0d / i6;
                                } while ((0.33333334f * d) + d > f);
                            }
                        } else if (f <= 0.6666667f) {
                            while (true) {
                                double d2 = i6;
                                if (((1.0d / (Math.pow(d2, 2.0d) - d2)) * 0.33333334f) + (1.0d / d2) <= f) {
                                    break;
                                }
                                i6++;
                            }
                            i5 = i6 - 1;
                        }
                        ripVar.y();
                        int i9 = ripVar.g;
                        ripVar.y();
                        max = Math.max(i9, ripVar.f);
                        f2 = x9g0Var == null ? x9g0Var.c : i;
                        while (max / i5 > f2) {
                            ripVar.y();
                            i5 = ripVar.c == hgl.a ? i5 * 2 : i5 + 1;
                        }
                        return i5;
                    }
                }
            }
        }
        f = 1.0f;
        ripVar.y();
        if (ripVar.c != hgl.a) {
        }
        ripVar.y();
        int i92 = ripVar.g;
        ripVar.y();
        max = Math.max(i92, ripVar.f);
        if (x9g0Var == null) {
        }
        while (max / i5 > f2) {
        }
        return i5;
    }

    public static void q(View view) {
        if (f4m.h(view)) {
            d3m.e(view, 300L, 0L, null, null, true);
        }
    }

    public static final boolean r(Fragment fragment) {
        Bundle arguments = fragment.getArguments();
        if (arguments != null ? arguments.getBoolean("no_bottom_navigation", false) : false) {
            return true;
        }
        Fragment parentFragment = fragment.getParentFragment();
        return parentFragment != null ? r(parentFragment) : false;
    }

    public static Image s(String str, String str2, String str3, String str4) {
        ListBuilder e = e43.e();
        if (str != null) {
            e.add(new ImageSize(str, 50, 50, Boolean.FALSE, (char) 0, false, 48, null));
        }
        if (str2 != null) {
            e.add(new ImageSize(str2, 100, 100, Boolean.FALSE, (char) 0, false, 48, null));
        }
        if (str3 != null) {
            e.add(new ImageSize(str3, 200, 200, Boolean.FALSE, (char) 0, false, 48, null));
        }
        if (str4 != null) {
            e.add(new ImageSize(str4, 400, 400, Boolean.FALSE, (char) 0, false, 48, null));
        }
        return new Image(e.g());
    }

    public static final void u(p3t p3tVar, s3t s3tVar) {
        p3tVar.ef(new u3k(s3tVar, 15));
        p3tVar.D4(new fre(s3tVar, 26));
        p3tVar.i9(new g4g(s3tVar, 19));
        p3tVar.yl(new drg(s3tVar, 16));
        p3tVar.zd(new xwq(s3tVar, 2));
    }

    public static void v(TextView textView, boolean z) {
        Drawable a;
        if (z) {
            Context context = textView.getRootView().getContext();
            int f = e3m.f(R.attr.vk_ui_field_background, context);
            int f2 = e3m.f(R.attr.vk_ui_field_background, context);
            int f3 = e3m.f(R.attr.vk_ui_stroke_accent, context);
            int f4 = e3m.f(R.attr.vk_ui_field_border_alpha, context);
            int i = wvv0.a;
            a = wvv0.a(context, R.drawable.vkui_bg_edittext, f, f2, f3, f4);
        } else {
            Context context2 = textView.getRootView().getContext();
            int color = textView.getContext().getColor(R.color.vk_gray_850);
            int color2 = textView.getContext().getColor(R.color.vk_gray_850);
            int color3 = textView.getContext().getColor(R.color.vk_lavender_A300);
            int color4 = textView.getContext().getColor(R.color.vk_white_alpha12);
            int i2 = wvv0.a;
            a = wvv0.a(context2, R.drawable.vkui_bg_edittext, color, color2, color3, color4);
        }
        textView.setBackground(a);
    }

    public static final UIBlockMusicTrack w(bi20 bi20Var, MusicTrack musicTrack, MusicTrackCatalogViewStyle musicTrackCatalogViewStyle, String str) {
        com.vk.catalog2.common.dto.api.ui.a a = com.vk.catalog2.common.dto.api.ui.a.a(bi20Var.b(), null, null, null, null, null, musicTrackCatalogViewStyle, 7679);
        String str2 = bi20Var.n;
        if (str == null) {
            str = "";
        }
        return new UIBlockMusicTrack(a, musicTrack, str2, str, null, bi20Var.s, false, null, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, null);
    }

    public static /* synthetic */ UIBlockMusicTrack x(bi20 bi20Var, MusicTrack musicTrack, MusicTrackCatalogViewStyle musicTrackCatalogViewStyle, int i) {
        if ((i & 4) != 0) {
            musicTrackCatalogViewStyle = null;
        }
        return w(bi20Var, musicTrack, musicTrackCatalogViewStyle, null);
    }

    public static void y(LiveCoverType liveCoverType, Long l, boolean z, long j, float f) {
        int i = (int) (f * 100);
        siz.b(l, MobileOfficialAppsGroupsStat$LiveCoverEvent.LiveCoverEventType.STOP_PLAY, siz.a(liveCoverType), Integer.valueOf((i == 0 && z) ? 100 : i), Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(j)));
    }

    public static final ClipVideoFile z(SdkClipVideoFile sdkClipVideoFile) {
        if (sdkClipVideoFile instanceof ClipVideoFileAdapter) {
            return ((ClipVideoFileAdapter) sdkClipVideoFile).m;
        }
        throw new IllegalStateException("There is shouldn't be other adapter other then SdkClipVideoFile");
    }

    public void t(g0a g0aVar) {
        CopyOnWriteArrayList<ez9> copyOnWriteArrayList = xsi0.a;
        xsi0.c(g0aVar);
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Long.valueOf(zznn.zze());
    }

    @Override // xsna.o2u0
    public void F2(String str) {
    }

    @Override // xsna.o2u0
    public void a(io.reactivex.rxjava3.disposables.c cVar) {
    }

    @Override // xsna.o2u0
    public void fg(NewsEntry newsEntry, NewsEntry newsEntry2, int i) {
    }
}
