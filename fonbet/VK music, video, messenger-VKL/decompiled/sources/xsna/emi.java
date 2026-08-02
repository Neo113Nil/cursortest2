package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.compose.LottieCancellationBehavior;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionTypeDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.media.dto.MediaPopupDto;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.auth.passkey.PasskeyCheckInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.Image;
import com.vk.dto.common.actions.Action;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.SituationalSuggest;
import com.vk.libvideo.api.quality.QualitySettingsType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.ui.VoipViewModelState;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import xsna.dv90;
import xsna.x2o0;

/* compiled from: UserProfileAdvertBannerViewHolder.kt */
/* loaded from: classes5.dex */
public final class emi implements dv90.a, u940, ea60 {
    public static final jai c = new jai(669675615, new dmi(0, 0), false);
    public static final emi d = new emi(2);
    public static final emi e = new emi(3);
    public static final emi f = new emi(4);
    public final /* synthetic */ int b;

    public /* synthetic */ emi(int i) {
        this.b = i;
    }

    public static String A(File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new IllegalArgumentException("Non-apk found in splits directory.");
        }
        String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
        return (replaceFirst.equals("base-master") || replaceFirst.equals("base-main")) ? "" : replaceFirst.startsWith("base-") ? replaceFirst.replace("base-", "config.") : replaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
    }

    public static final long j(Drawable drawable) {
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return 9205357640488583168L;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        return (Float.floatToRawIntBits(intrinsicWidth) << 32) | (Float.floatToRawIntBits(intrinsicHeight) & 4294967295L);
    }

    public static final s600 k(i700 i700Var, boolean z, boolean z2, boolean z3, h700 h700Var, float f2, int i, androidx.compose.runtime.a aVar, int i2, int i3) {
        aVar.T(683659508);
        boolean z4 = (i3 & 2) != 0 ? true : z;
        boolean z5 = (i3 & 4) != 0 ? true : z2;
        boolean z6 = (i3 & 8) != 0 ? false : z3;
        h700 h700Var2 = (i3 & 16) != 0 ? null : h700Var;
        float f3 = (i3 & 32) != 0 ? 1.0f : f2;
        int i4 = (i3 & 64) != 0 ? 1 : i;
        LottieCancellationBehavior lottieCancellationBehavior = LottieCancellationBehavior.Immediately;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(683659508, i2, -1, "com.airbnb.lottie.compose.animateLottieCompositionAsState (animateLottieCompositionAsState.kt:54)");
        }
        if (i4 <= 0) {
            throw new IllegalArgumentException(tgw.b(i4, "Iterations must be a positive number (", ").").toString());
        }
        if (Float.isInfinite(f3) || Float.isNaN(f3)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + f3 + ".").toString());
        }
        s600 a = y600.a(aVar);
        aVar.T(-180606964);
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = io.reactivex.rxjava3.internal.operators.mixed.j.d(z4, aVar);
        }
        aVar.b0();
        aVar.T(-180606834);
        float d2 = f3 / b3r0.d((Context) aVar.r(AndroidCompositionLocals_androidKt.b));
        aVar.b0();
        bap.h(new Object[]{i700Var, Boolean.valueOf(z4), h700Var2, Float.valueOf(d2), Integer.valueOf(i4)}, new kg2(z4, z5, a, i700Var, i4, z6, d2, h700Var2, lottieCancellationBehavior, false, (wh50) x, null), aVar, 72);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.b0();
        return a;
    }

    public static Bundle l(PasskeyCheckInfo passkeyCheckInfo) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(VkOAuthService.PASSKEY_WEB_AUTH_DATA, passkeyCheckInfo);
        return bundle;
    }

    public static final String o(Owner owner) {
        String str = owner.v;
        if (str == null || !brm0.B(str, "https://", false)) {
            return null;
        }
        return Uri.parse(str).getHost();
    }

    public static String p(int i, int i2) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return context.getResources().getQuantityString(i, i2, Integer.valueOf(i2));
    }

    public static final boolean q(QualitySettingsType qualitySettingsType) {
        return qualitySettingsType == QualitySettingsType.AUTO || qualitySettingsType == QualitySettingsType.WIFI_AUTO || qualitySettingsType == QualitySettingsType.MOBILE_AUTO;
    }

    public static final boolean r(QualitySettingsType qualitySettingsType) {
        return qualitySettingsType == QualitySettingsType.ECONOM || qualitySettingsType == QualitySettingsType.WIFI_ECONOM || qualitySettingsType == QualitySettingsType.MOBILE_ECONOM;
    }

    public static final boolean s(QualitySettingsType qualitySettingsType) {
        return qualitySettingsType == QualitySettingsType.HIGH || qualitySettingsType == QualitySettingsType.WIFI_HIGH || qualitySettingsType == QualitySettingsType.MOBILE_HIGH;
    }

    public static final boolean t(VoipViewModelState voipViewModelState) {
        return (voipViewModelState == VoipViewModelState.RecordingAudioMessage || voipViewModelState == VoipViewModelState.AboutToCallPeer || voipViewModelState == VoipViewModelState.WaitingRoom) ? false : true;
    }

    public static final float[] u(float[] fArr, float[] fArr2, float f2) {
        float[] fArr3 = new float[fArr.length];
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            float f3 = fArr[i];
            fArr3[i2] = u11.b(fArr2[i2], f3, f2, f3);
            i++;
            i2++;
        }
        return fArr3;
    }

    public static MusicDynamicRestriction v(MediaPopupDto mediaPopupDto) {
        Image image;
        BaseLinkButtonActionDto e2;
        BaseLinkButtonActionTypeDto C;
        BaseLinkButtonActionDto e3;
        String title = mediaPopupDto.getTitle();
        String i = mediaPopupDto.i();
        String i2 = mediaPopupDto.i();
        List<BaseImageDto> f2 = mediaPopupDto.f();
        if (f2 != null) {
            new ne6();
            image = ne6.a(f2);
        } else {
            image = Image.d;
        }
        Image image2 = image;
        BaseLinkButtonDto d2 = mediaPopupDto.d();
        String str = null;
        String title2 = d2 != null ? d2.getTitle() : null;
        BaseLinkButtonDto d3 = mediaPopupDto.d();
        String url = (d3 == null || (e3 = d3.e()) == null) ? null : e3.getUrl();
        BaseLinkButtonDto d4 = mediaPopupDto.d();
        if (d4 != null && (e2 = d4.e()) != null && (C = e2.C()) != null) {
            str = C.j();
        }
        return new MusicDynamicRestriction(title, image2, i2, title2, url, str, i);
    }

    public static io.reactivex.rxjava3.internal.operators.observable.m1 w(Context context, SituationalSuggest situationalSuggest, String str) {
        int i = situationalSuggest.b;
        ce60.b.getClass();
        ce60.g();
        wmi0.a.c("publishSuggest");
        String str2 = situationalSuggest.f;
        if (!epx.f(str2, "post")) {
            if (!epx.f(str2, "link")) {
                return null;
            }
            Action action = situationalSuggest.p;
            if (action != null) {
                di60.w(action, context, null, str, "sit_posting", null, 48);
            }
            return x(i);
        }
        int i2 = rfc0.a;
        q860 q860Var = new q860();
        zwc0 zwc0Var = q860Var.j;
        SituationalSuggest.SituationalPost situationalPost = situationalSuggest.n;
        q860Var.j = zwc0.a(zwc0Var, null, situationalPost != null ? situationalPost.b : null, situationalPost != null ? situationalPost.c : null, null, null, false, 57);
        q860Var.m = Integer.valueOf(i);
        q860Var.p(-1, context);
        return x(i);
    }

    public static io.reactivex.rxjava3.internal.operators.observable.m1 x(int i) {
        ce60.b.getClass();
        ce60.g();
        wmi0.a.c("publishSuggest");
        mvf mvfVar = new mvf("internal.closeSituationalSuggest", 0);
        mvfVar.C(i, "suggest_id");
        mvfVar.K("close_type", "open");
        mvfVar.k = true;
        return rsg0.y0(mvfVar, null, null, 3);
    }

    public static e2p0 y(String str) {
        List a = n6j.a(0, "\\W", blk.N(str.toLowerCase(Locale.ROOT)).toLowerCase(Locale.ENGLISH));
        ArrayList arrayList = new ArrayList();
        for (Object obj : a) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        List a2 = n6j.a(0, "\\W", blk.M(str.toLowerCase(Locale.ROOT)).toLowerCase(new Locale("ru")));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : a2) {
            if (((String) obj2).length() > 0) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        arrayList3.addAll(arrayList2);
        s3q0 s3q0Var = s3q0.a;
        return new e2p0(arrayList2, arrayList, arrayList3);
    }

    public static final double z(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    @Override // xsna.dv90.a
    public Object a(qdg0 qdg0Var) {
        return ((x2o0.c) qdg0Var).getStableHardwareId();
    }

    @Override // xsna.u940
    public List e(s940 s940Var) {
        return EmptyList.b;
    }

    @Override // xsna.u940
    public List f(s940 s940Var) {
        return EmptyList.b;
    }

    public void g(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1679834923);
        if ((i & 6) == 0) {
            i2 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1679834923, i2, -1, "com.vk.mvi.compose.vk.VkComposeThemeProvider.Theme (VkComposeThemeProvider.kt:13)");
            }
            rrv0.d(null, null, null, null, kai.c(1565360998, new k3m(2, jaiVar), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jh4(this, jaiVar, i, 4);
        }
    }

    public int hashCode() {
        switch (this.b) {
            case 19:
                throw null;
            default:
                return super.hashCode();
        }
    }

    public String m(int i) {
        xuo0.a.getClass();
        long a = xuo0.a() - (i * 1000);
        if (a < 0) {
            Context context = e43.a;
            return pvo0.k(i, (context != null ? context : null).getResources(), true);
        }
        if (a >= tni.l()) {
            return a < tni.k(1) ? p(R.plurals.time_ago_minute_middle, (int) TimeUnit.MILLISECONDS.toMinutes(a)) : a < tni.k(24) ? p(R.plurals.time_ago_hour_middle, (int) TimeUnit.MILLISECONDS.toHours(a)) : a < tni.f(7) ? p(R.plurals.time_ago_day_middle, (int) TimeUnit.MILLISECONDS.toDays(a)) : a < tni.f(31) ? p(R.plurals.time_ago_week_middle, (int) (TimeUnit.MILLISECONDS.toDays(a) / 7)) : a < TimeUnit.DAYS.toMillis(((long) 12) * 31) ? cdi.B(i) : cdi.C(i);
        }
        Context context2 = e43.a;
        return (context2 != null ? context2 : null).getResources().getString(R.string.vk_date_ago_now);
    }

    public MobileOfficialAppsCoreNavStat$EventScreen n() {
        UiTracker uiTracker = UiTracker.a;
        return UiTracker.c();
    }
}
