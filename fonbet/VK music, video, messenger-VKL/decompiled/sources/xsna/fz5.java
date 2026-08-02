package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.internal.measurement.zznn;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseCountryDto;
import com.vk.api.generated.database.dto.DatabaseCityByIdDto;
import com.vk.api.generated.database.dto.DatabaseStationDto;
import com.vk.api.generated.groups.dto.GroupsAddressDto;
import com.vk.api.generated.groups.dto.GroupsAddressTimetableDayDto;
import com.vk.api.generated.groups.dto.GroupsAddressTimetableDto;
import com.vk.api.generated.groups.dto.GroupsAddressWorkInfoStatusDto;
import com.vk.api.generated.groups.dto.GroupsOpenStatusDto;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.core.ui.themes.VKTheme;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.group.Group;
import com.vk.dto.masks.Mask;
import com.vk.dto.photo.Photo;
import com.vk.dto.profile.Address;
import com.vk.dto.profile.MetroStation;
import com.vk.dto.profile.OpenStatus;
import com.vk.dto.profile.Timetable;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.dialogs.DialogThemeImpl;
import com.vk.superapp.api.dto.identity.WebCity;
import com.vk.superapp.api.dto.identity.WebCountry;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.MarketAlbumAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.jk80;

/* compiled from: BadgeUtils.kt */
/* loaded from: classes17.dex */
public final class fz5 implements q701, androidx.media3.exoplayer.audio.b, x420 {
    public static jk80 e;
    public static final jai b = new jai(2080136929, new pm(1), false);
    public static final jai c = new jai(1031612952, new rei(1), false);
    public static final fz5 d = new fz5();
    public static final /* synthetic */ fz5 f = new fz5();

    public static final Instant A(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        ZoneId zoneId = zoneOffset;
        if (zoneOffset == null) {
            zoneId = ZoneId.systemDefault();
        }
        return localDateTime.atZone(zoneId).toInstant();
    }

    public static final long B(long j, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-57824293, 0, -1, "com.vk.core.compose.ext.unscaled (SpExt.kt:10)");
        }
        long i0 = ((azl) aVar.r(uvi.h)).i0(fno0.d(j));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return i0;
    }

    public static final SdkImages C(Image image) {
        ArrayList<ImageSize> arrayList = image.b;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        for (ImageSize imageSize : arrayList) {
            com.vk.dto.common.im.Image image2 = imageSize.d;
            String str = image2.d;
            int[] iArr = {image2.b, image2.c};
            int i = iArr[0];
            int i2 = iArr[1];
            if (i2 > i) {
                i = i2;
            }
            arrayList2.add(new ImageUrl(str, i, imageSize.c7()));
        }
        return new SdkImages(arrayList2, image);
    }

    public static final int d(long j) {
        int i = Math.abs(Float.intBitsToFloat((int) (j >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j & 4294967295L))) >= 0.5f ? i | 2 : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        if (r0 > r13) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r0 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        if (r11 > r10) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
    
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (r11 < r10) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r0 < r13) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long e(long j, int i, int i2, int[] iArr) {
        float f2;
        float intBitsToFloat;
        float f3;
        float intBitsToFloat2;
        float intBitsToFloat3 = Math.abs(iArr[0]) == 0 ? 0.0f : Float.intBitsToFloat((int) (j >> 32)) - (i * (-1.0f));
        float intBitsToFloat4 = Math.abs(iArr[1]) == 0 ? 0.0f : Float.intBitsToFloat((int) (j & 4294967295L)) - (i2 * (-1.0f));
        int i3 = (int) (j >> 32);
        if (Float.intBitsToFloat(i3) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = (iArr[0] * (-1.0f)) + intBitsToFloat3;
            intBitsToFloat = Float.intBitsToFloat(i3);
        } else {
            f2 = (iArr[0] * (-1.0f)) + intBitsToFloat3;
            intBitsToFloat = Float.intBitsToFloat(i3);
        }
        int i4 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i4) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f3 = (iArr[1] * (-1.0f)) + intBitsToFloat4;
            intBitsToFloat2 = Float.intBitsToFloat(i4);
        } else {
            f3 = (iArr[1] * (-1.0f)) + intBitsToFloat4;
            intBitsToFloat2 = Float.intBitsToFloat(i4);
        }
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final int f(float f2) {
        return an10.b(f2) * (-1);
    }

    public static SpannableStringBuilder h(Mask mask, Context context) {
        String str;
        String obj = drm0.p0(context.getString(mask.u ? R.string.clips_dialog_listitem_effect : R.string.clips_dialog_listitem_mask)).toString();
        UserProfile userProfile = mask.b;
        if (userProfile != null) {
            str = userProfile.e;
        } else {
            Group group = mask.c;
            str = group != null ? group.d : "";
        }
        String obj2 = drm0.p0(str).toString();
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) obj);
        if (!drm0.N(obj) && !drm0.N(obj2)) {
            Drawable f2 = uko.f(R.drawable.fullscreen_clip_ui_separator, R.attr.vk_ui_text_contrast, context);
            append.append((CharSequence) " ");
            float f3 = 2;
            int i = -((int) iah0.y(f3));
            int y = (int) iah0.y(f3);
            Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
            Drawable mutate = f2.mutate();
            if (y <= 0 || y <= 0) {
                mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
            } else {
                mutate.setBounds(0, 0, y, y);
            }
            newSpannable.setSpan(new tzx0(mutate, 3, -1.0f, true, i, 0, 0), 0, 1, 33);
            append.append((CharSequence) newSpannable);
            append.append((CharSequence) " ");
        }
        return append.append((CharSequence) obj2);
    }

    public static final int[] k(p9m p9mVar, VKTheme vKTheme) {
        BubbleColors Ab;
        DialogThemeImpl dialogThemeImpl = p9mVar.b.get(vKTheme);
        if (dialogThemeImpl == null || (Ab = dialogThemeImpl.Ab(0L, false)) == null) {
            return null;
        }
        return Ab.D;
    }

    public static int m(Attachment attachment) {
        if (attachment instanceof AlbumAttachment) {
            return 2;
        }
        if (attachment instanceof PhotoAttachment) {
            Photo photo = ((PhotoAttachment) attachment).l;
            if (photo.Hb()) {
                return 11;
            }
            return photo.Ib() ? 10 : 0;
        }
        if (attachment instanceof VideoAttachment) {
            return 1;
        }
        if (attachment instanceof MarketAlbumAttachment) {
            return 3;
        }
        if (attachment instanceof DocumentAttachment) {
            return !((DocumentAttachment) attachment).V0() ? 4 : 5;
        }
        return -1;
    }

    public static final boolean u(Instant instant, cvo0 cvo0Var, ZoneOffset zoneOffset) {
        if (cvo0Var instanceof u7x) {
            u7x u7xVar = (u7x) cvo0Var;
            return !instant.isBefore(u7xVar.a) && instant.isBefore(u7xVar.b);
        }
        if (!(cvo0Var instanceof zvz)) {
            throw new NoWhenBranchMatchedException();
        }
        zvz zvzVar = (zvz) cvo0Var;
        return !instant.isBefore(A(zvzVar.a, zoneOffset)) && instant.isBefore(A(zvzVar.b, zoneOffset));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.vk.superapp.api.dto.identity.WebCountry] */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.vk.superapp.api.dto.identity.WebCity] */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.vk.superapp.api.dto.identity.WebCity] */
    /* JADX WARN: Type inference failed for: r20v2, types: [com.vk.dto.profile.OpenStatus] */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.vk.superapp.api.dto.identity.WebCountry] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.vk.dto.profile.OpenStatus] */
    public static Address v(GroupsAddressDto groupsAddressDto) {
        Timetable timetable;
        MetroStation metroStation;
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        int id = groupsAddressDto.getId();
        String title = groupsAddressDto.getTitle();
        String e2 = groupsAddressDto.e();
        String d2 = groupsAddressDto.d();
        Integer j = groupsAddressDto.j();
        int intValue = j != null ? j.intValue() : 0;
        Integer g = groupsAddressDto.g();
        int intValue2 = g != null ? g.intValue() : 0;
        Float n = groupsAddressDto.n();
        double d3 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        double floatValue = n != null ? n.floatValue() : 0.0d;
        Float o = groupsAddressDto.o();
        if (o != null) {
            d3 = o.floatValue();
        }
        GroupsAddressWorkInfoStatusDto K = groupsAddressDto.K();
        int i3 = 5;
        if (K != null && (i2 = you.$EnumSwitchMapping$0[K.ordinal()]) != 1) {
            if (i2 == 2) {
                i3 = 1;
            } else if (i2 == 3) {
                i3 = 4;
            } else if (i2 == 4) {
                i3 = 2;
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = 3;
            }
        }
        GroupsAddressTimetableDto F = groupsAddressDto.F();
        if (F != null) {
            GroupsAddressTimetableDayDto e3 = F.e();
            Timetable.WorkTime a = e3 != null ? xou.a(e3) : null;
            GroupsAddressTimetableDayDto j2 = F.j();
            Timetable.WorkTime a2 = j2 != null ? xou.a(j2) : null;
            GroupsAddressTimetableDayDto k = F.k();
            Timetable.WorkTime a3 = k != null ? xou.a(k) : null;
            GroupsAddressTimetableDayDto i4 = F.i();
            Timetable.WorkTime a4 = i4 != null ? xou.a(i4) : null;
            GroupsAddressTimetableDayDto d4 = F.d();
            Timetable.WorkTime a5 = d4 != null ? xou.a(d4) : null;
            GroupsAddressTimetableDayDto f2 = F.f();
            Timetable.WorkTime a6 = f2 != null ? xou.a(f2) : null;
            GroupsAddressTimetableDayDto g2 = F.g();
            timetable = new Timetable((List<Timetable.WorkTime>) e43.l(a, a2, a3, a4, a5, a6, g2 != null ? xou.a(g2) : null));
        } else {
            timetable = null;
        }
        DatabaseStationDto p = groupsAddressDto.p();
        if (p != null) {
            metroStation = o19.p(p);
            str = null;
        } else {
            metroStation = null;
            str = null;
        }
        String C = groupsAddressDto.C();
        DatabaseCityByIdDto f3 = groupsAddressDto.f();
        if (f3 != null) {
            ?? webCity = new WebCity();
            webCity.b = f3.getId();
            webCity.c = f3.getTitle();
            webCity.f = false;
            str2 = webCity;
        } else {
            str2 = str;
        }
        BaseCountryDto i5 = groupsAddressDto.i();
        int i6 = intValue;
        if (i5 != null) {
            ?? webCountry = new WebCountry();
            i = id;
            webCountry.b = i5.getId();
            webCountry.c = i5.getTitle();
            str3 = webCountry;
        } else {
            i = id;
            str3 = str;
        }
        new ne6();
        ?? r21 = str3;
        ImageSize Cb = ne6.a(groupsAddressDto.G()).Cb(75, true, false);
        String str7 = Cb != null ? Cb.d.d : str;
        Boolean l = groupsAddressDto.l();
        boolean booleanValue = l != null ? l.booleanValue() : false;
        Integer D = groupsAddressDto.D();
        int intValue3 = D != null ? D.intValue() : Integer.MAX_VALUE;
        GroupsOpenStatusDto B = groupsAddressDto.B();
        if (B != null) {
            GroupsOpenStatusDto.StyleDto f4 = B.f();
            if (f4 != null) {
                str = f4.i();
            }
            str4 = str7;
            int a7 = OpenStatus.a.a(str);
            String d5 = B.d();
            String str8 = d5 == null ? "" : d5;
            String e4 = B.e();
            if (e4 == null) {
                str5 = e2;
                str6 = "";
            } else {
                str5 = e2;
                str6 = e4;
            }
            str = new OpenStatus(a7, str8, str6);
        } else {
            str4 = str7;
            str5 = e2;
        }
        Integer k2 = groupsAddressDto.k();
        return new Address(i, title, str5, d2, i6, intValue2, floatValue, d3, i3, timetable, metroStation, C, str2, r21, str4, booleanValue, intValue3, str, k2 != null ? k2.intValue() : -1);
    }

    public static final o7f x(n7f n7fVar, Integer num) {
        int i = n7fVar.a;
        return new o7f(i, n7fVar.b, n7fVar.d, num != null && num.intValue() == i);
    }

    public static String y(String str, String str2) {
        if (str.length() != 0) {
            if (str.equals("wall_user")) {
                str = CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE;
            } else if (str.equals("wall_group")) {
                str = "club";
            }
        }
        return (str2 == null || str2.length() == 0 || !str2.equals("feed_lives")) ? str : "feed_lives";
    }

    public static final j160 z(View view, androidx.compose.runtime.a aVar, int i) {
        if ((i & 1) != 0) {
            view = (View) aVar.r(AndroidCompositionLocals_androidKt.f);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1075877987, 0, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.android.kt:278)");
        }
        rut0 rut0Var = (rut0) aVar.r(uvi.t);
        boolean J = aVar.J(view) | aVar.J(rut0Var);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            rut0Var.f();
            x = new j160(view);
            aVar.R(x);
        }
        j160 j160Var = (j160) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j160Var;
    }

    @Override // xsna.x420
    public vg6 b(vg6 vg6Var, Editable editable) {
        i420[] i420VarArr = (i420[]) editable.getSpans(vg6Var.a, vg6Var.b, i420.class);
        int i = 0;
        while (true) {
            if (!(i < i420VarArr.length)) {
                return vg6Var;
            }
            int i2 = i + 1;
            try {
                editable.removeSpan(i420VarArr[i]);
                i = i2;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new NoSuchElementException(e2.getMessage());
            }
        }
    }

    public ik80 j(Context context) {
        if (e == null) {
            synchronized (this) {
                try {
                    if (e == null) {
                        e = new jk80(context);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    @ozl
    public jk80.a t(Context context) {
        return ((jk80) j(context)).d;
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Integer.valueOf((int) zznn.zzg());
    }
}
