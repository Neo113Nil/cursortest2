package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.zzor;
import com.vk.stat.scheme.MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImMessagingPerformanceMetric;
import com.vk.stat.scheme.MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance;
import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import com.vk.stat.scheme.SchemeStat$TypeAppStarts;
import com.vk.stat.scheme.SchemeStat$TypeAudioMessageTranscriptLoadingItem;
import com.vk.stat.scheme.SchemeStat$TypeInstallReferrer;
import com.vk.stat.scheme.SchemeStat$TypeMiniAppStart;
import com.vk.stat.scheme.SchemeStat$TypeOpenWithUrl;
import com.vk.stat.scheme.SchemeStat$TypePerfPowerConsumption;
import com.vk.stat.scheme.SchemeStat$TypeSuperAppWidgetLoading;
import com.vk.video.growth.api.data.VideoGrowthAppStore;
import com.vk.video.growth.api.data.VideoGrowthVideoParams;
import com.vkontakte.android.R;
import java.util.EnumMap;
import java.util.List;

/* compiled from: OwnerButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class s490 implements q701 {
    public static final /* synthetic */ s490 b = new s490();

    public s490(tgl0 tgl0Var) {
        new sgl0("edu_contact_section", x5p.class);
        int i = tgl0Var.a().getInt("edu_contact_section_storage_version", 0);
        while (i < 1) {
            i++;
            tgl0Var.a().putInt("edu_contact_section_storage_version", i);
        }
    }

    public static final void a(TextView textView, boolean z, int i) {
        if (z) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, enj.c(R.drawable.ic_explicit_28, i, textView.getContext()), (Drawable) null);
        } else {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public static final SpannableString b(String str, CharSequence charSequence, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) charSequence);
        sb.append(' ');
        sb.append((Object) str);
        String sb2 = sb.toString();
        SpannableString spannableString = new SpannableString(sb2);
        spannableString.setSpan(new ForegroundColorSpan(i), charSequence.length(), sb2.length(), 33);
        return spannableString;
    }

    public static final String c(List list) {
        String concat;
        return (list == null || (concat = "feat. ".concat(i(list))) == null) ? "" : concat;
    }

    public static final CharSequence d(Context context, CharSequence charSequence, String str, int i) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (str == null) {
            str = "";
        }
        return drm0.p0(b(str, charSequence, e3m.f(i, context)));
    }

    public static final String e(zo10 zo10Var) {
        Object c = zo10Var.c();
        e6j e6jVar = c instanceof e6j ? (e6j) c : null;
        if (e6jVar != null) {
            return e6jVar.b();
        }
        return null;
    }

    public static final VideoGrowthVideoParams f(com.vk.libvideo.autoplay.b bVar) {
        yg5 yg5Var;
        xh5 xh5Var = bVar.c;
        if (xh5Var == null || (yg5Var = xh5Var.a) == null) {
            return null;
        }
        return new VideoGrowthVideoParams(yg5Var.A().a1(), yg5Var.getPosition(), false, false, 12, null);
    }

    public static final boolean g(lrk0 lrk0Var) {
        SchemeStat$EventBenchmarkMain.b bVar = lrk0Var.a;
        return (bVar instanceof SchemeStat$TypeAppStarts) || (bVar instanceof MobileOfficialAppsImStat$TypeImMessagingPerformanceMetric) || (bVar instanceof SchemeStat$TypeMiniAppStart) || (bVar instanceof MobileOfficialAppsMiniappsStat$TypeMiniAppsPerformance) || (bVar instanceof SchemeStat$TypeSuperAppWidgetLoading) || (bVar instanceof SchemeStat$TypePerfPowerConsumption) || (bVar instanceof SchemeStat$TypeAudioMessageTranscriptLoadingItem) || (bVar instanceof SchemeStat$TypeInstallReferrer) || (bVar instanceof SchemeStat$TypeOpenWithUrl) || (bVar instanceof MobileOfficialAppsCoreAccessibilityStat$TypeAccessibilityItem) || (bVar instanceof MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem);
    }

    public static final EnumMap h(kos0 kos0Var) {
        EnumMap enumMap = new EnumMap(VideoGrowthAppStore.class);
        enumMap.put((EnumMap) VideoGrowthAppStore.GOOGLE, (VideoGrowthAppStore) kos0Var.f);
        enumMap.put((EnumMap) VideoGrowthAppStore.HUAWEI, (VideoGrowthAppStore) kos0Var.g);
        enumMap.put((EnumMap) VideoGrowthAppStore.RUSTORE, (VideoGrowthAppStore) kos0Var.h);
        enumMap.put((EnumMap) VideoGrowthAppStore.SAMSUNG, (VideoGrowthAppStore) kos0Var.i);
        enumMap.put((EnumMap) VideoGrowthAppStore.XIAOMI, (VideoGrowthAppStore) kos0Var.j);
        return enumMap;
    }

    public static final String i(List list) {
        String g0;
        return (list == null || (g0 = j5g.g0(list, ", ", null, null, 0, new ehu(7), 30)) == null) ? "" : g0;
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Double.valueOf(zzor.zzb());
    }
}
