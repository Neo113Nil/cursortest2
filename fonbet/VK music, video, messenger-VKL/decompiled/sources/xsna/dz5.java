package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.internal.measurement.zznn;
import com.ironsource.X2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.ads.dto.AdsHideReasonDto;
import com.vk.api.generated.ads.dto.AdsHideReasonsDto;
import com.vk.api.generated.places.dto.PlacesCategoryDto;
import com.vk.api.generated.places.dto.PlacesPlaceDto;
import com.vk.api.generated.places.dto.PlacesPlaceWithDistanceDto;
import com.vk.core.preference.single_pref.SinglePreferenceMigrationType;
import com.vk.dto.common.Good;
import com.vk.dto.common.MarketRejectInfo;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.geo.GeoLocation;
import com.vk.dto.music.Artist;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.superapp.api.dto.menu.BadgeInfo;
import com.vk.superapp.ext.CounterType;
import com.vk.voip.ui.groupcalls.grid.type.GridViewType;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AdHideReason;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: BadgeInfoExt.kt */
/* loaded from: classes6.dex */
public final class dz5 implements q701, androidx.media3.exoplayer.video.g, w420 {
    public static final String[] b = {"", "K", "M", "G", "T", "P"};
    public static final jai c = new jai(253275604, new nhi(2), false);
    public static final /* synthetic */ dz5 d = new dz5();

    public static long A(int i, long j, fkk0 fkk0Var) {
        fxc0.p(j >= 0);
        fxc0.p(i > 0);
        long a = fkk0Var.a(y2r0.b0(i, j));
        if (a == C.TIME_UNSET) {
            return -1L;
        }
        return y2r0.q(i, a);
    }

    public static final UserId B(VideoFile videoFile, UserId userId) {
        List<Artist> list;
        Artist artist;
        Long l;
        return (!(videoFile instanceof MusicVideoFile) || !fxc0.B().J().M0() || (list = ((MusicVideoFile) videoFile).B1) == null || (artist = (Artist) j5g.Y(list)) == null || (l = artist.l) == null) ? userId : new UserId(l.longValue());
    }

    public static GeoLocation C(PlacesPlaceWithDistanceDto placesPlaceWithDistanceDto) {
        PlacesPlaceDto e = placesPlaceWithDistanceDto.e();
        int id = e.getId();
        int l = e.l();
        Integer e2 = e.e();
        int intValue = e2 != null ? e2.intValue() : 0;
        UserId q = e.q();
        int i = (int) (q != null ? q.b : UserId.d.b);
        int d2 = placesPlaceWithDistanceDto.d();
        double j = e.j();
        double k = e.k();
        String title = e.getTitle();
        String d3 = e.d();
        String valueOf = String.valueOf(e.g());
        String valueOf2 = String.valueOf(e.i());
        PlacesCategoryDto f = e.f();
        return new GeoLocation(id, l, intValue, i, d2, j, k, title, null, d3, valueOf, valueOf2, f != null ? f.getTitle() : null, 256, null);
    }

    public static ArrayList D(AdsHideReasonsDto adsHideReasonsDto) {
        List<AdsHideReasonDto> d2 = adsHideReasonsDto.d();
        if (d2 == null) {
            return null;
        }
        List<AdsHideReasonDto> list = d2;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (AdsHideReasonDto adsHideReasonDto : list) {
            Integer d3 = adsHideReasonDto.d();
            int intValue = d3 != null ? d3.intValue() : 0;
            String e = adsHideReasonDto.e();
            if (e == null) {
                e = "";
            }
            arrayList.add(new AdHideReason(intValue, e, null, 4, null));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str = ((AdHideReason) next).c;
            if (str != null && str.length() != 0) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public static final ArrayList E(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
        }
        return arrayList;
    }

    public static final ArrayList F(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(Long.valueOf(jSONArray.getLong(i)));
        }
        return arrayList;
    }

    public static final String[] G(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.getString(i);
        }
        return strArr;
    }

    public static final ArrayList H(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj != null) {
                arrayList.add(obj.toString());
            }
        }
        return arrayList;
    }

    public static final i160 I(int i, int i2, androidx.compose.runtime.a aVar, boolean z) {
        boolean z2 = true;
        if ((i2 & 1) != 0) {
            z = true;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-600497013, i, -1, "com.vk.core.compose.modal.internal.rememberNestedScrollInViewConnection (NestedScrollInteropConnection.kt:227)");
        }
        View view = (View) aVar.r(AndroidCompositionLocals_androidKt.f);
        view.setTag("AndroidComposeView");
        boolean J = aVar.J(view);
        if ((((i & 14) ^ 6) <= 4 || !aVar.l(z)) && (i & 6) != 4) {
            z2 = false;
        }
        boolean z3 = J | z2;
        Object x = aVar.x();
        if (z3 || x == a.C0011a.a) {
            x = new i160(view, z);
            view.requestLayout();
            aVar.R(x);
        }
        i160 i160Var = (i160) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return i160Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004c A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J(Good good, TextView textView) {
        Integer valueOf;
        Integer valueOf2;
        baf0 baf0Var;
        boolean z = good.i0;
        MarketRejectInfo marketRejectInfo = good.e0;
        boolean z2 = good.g0;
        if (z2) {
            if (marketRejectInfo != null && marketRejectInfo.g) {
                valueOf = Integer.valueOf(R.drawable.vk_icon_clock_outline_16);
            } else if (z || marketRejectInfo != null) {
                valueOf = Integer.valueOf(R.drawable.vk_icon_error_circle_outline_16);
            }
            if (z2) {
                if (marketRejectInfo != null && marketRejectInfo.g) {
                    valueOf2 = Integer.valueOf(R.attr.vk_ui_accent_gray);
                } else if (z) {
                    valueOf2 = Integer.valueOf(R.attr.vk_ui_accent_red);
                } else if (marketRejectInfo != null) {
                    valueOf2 = Integer.valueOf(R.attr.vk_ui_accent_orange);
                }
                if (valueOf2 != null || valueOf == null) {
                    baf0Var = null;
                } else {
                    baf0Var = dhr0.t.b(valueOf.intValue(), valueOf2.intValue());
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, baf0Var, (Drawable) null);
                textView.setCompoundDrawablePadding(cn70.b(5));
            }
            valueOf2 = null;
            if (valueOf2 != null) {
            }
            baf0Var = null;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, baf0Var, (Drawable) null);
            textView.setCompoundDrawablePadding(cn70.b(5));
        }
        valueOf = null;
        if (z2) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        baf0Var = null;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, baf0Var, (Drawable) null);
        textView.setCompoundDrawablePadding(cn70.b(5));
    }

    public static final mk6 K(jtc0 jtc0Var) {
        return jtc0Var instanceof nhs ? ((nhs) jtc0Var).a : new lsv0(jtc0Var);
    }

    public static final List L(kvj0 kvj0Var) {
        return Collections.singletonList(kvj0Var);
    }

    public static /* synthetic */ boolean M(String str, String str2) {
        if (str != str2) {
            return str != null && str.equals(str2);
        }
        return true;
    }

    public static final void a(buw buwVar, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(-1026067504);
        int i2 = (M.l(false) ? 4 : 2) | i | X2.b.f;
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            mlg0 a = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1026067504, i2, -1, "com.vk.feed.design.compose.utils.theme.LegoSupportedVkThemeWrapper (LegoSupportedVkThemeWrapper.kt:17)");
            }
            M.K(-294314081);
            jaiVar2 = jaiVar;
            rrv0.d(null, null, null, a, jaiVar2, M, 27702, 4);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            buwVar = a;
        } else {
            jaiVar2 = jaiVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new x78(buwVar, jaiVar2, i, 3);
        }
    }

    public static final int c(long j) {
        int i = Math.abs(Float.intBitsToFloat((int) (j >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j & 4294967295L))) >= 0.5f ? i | 2 : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r9 < r8) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        if (r2 < r1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2 > r1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
    
        if (r9 > r8) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long d(long j, int[] iArr) {
        float f;
        float intBitsToFloat;
        float f2;
        float intBitsToFloat2;
        int i = (int) (j >> 32);
        if (Float.intBitsToFloat(i) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = iArr[0] * (-1.0f);
            intBitsToFloat = Float.intBitsToFloat(i);
        } else {
            f = iArr[0] * (-1.0f);
            intBitsToFloat = Float.intBitsToFloat(i);
        }
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = iArr[1] * (-1.0f);
            intBitsToFloat2 = Float.intBitsToFloat(i2);
        } else {
            f2 = iArr[1] * (-1.0f);
            intBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static void h(BadgeInfo badgeInfo, CounterType counterType, TextView textView, View view, TextView textView2, View view2, View view3, View view4, int i) {
        String str;
        if ((i & 8) != 0) {
            textView2 = null;
        }
        if ((i & 16) != 0) {
            view2 = null;
        }
        if ((i & 32) != 0) {
            view3 = null;
        }
        if ((i & 64) != 0) {
            view4 = null;
        }
        String str2 = badgeInfo != null ? badgeInfo.b : null;
        int i2 = 0;
        int i3 = badgeInfo != null ? badgeInfo.e : 0;
        boolean z = badgeInfo != null ? badgeInfo.c : false;
        boolean z2 = badgeInfo != null ? badgeInfo.d : false;
        boolean z3 = badgeInfo != null ? badgeInfo.f : false;
        boolean z4 = badgeInfo != null ? badgeInfo.g : false;
        if (i3 > 0 && textView != null) {
            if (textView2 != null) {
                f4m.j(textView2);
            }
            textView.setVisibility(0);
            if (counterType == CounterType.WITH_PLUS) {
                str = i3 > 99 ? "99+" : String.valueOf(i3);
            } else {
                while (i3 >= 1000 && i2 < 5) {
                    i3 /= 1000;
                    i2++;
                }
                str = i3 + b[i2];
            }
            textView.setText(str);
            if (view2 != null) {
                f4m.j(view2);
            }
            if (view != null) {
                f4m.j(view);
            }
            if (view3 != null) {
                f4m.j(view3);
            }
            if (view4 != null) {
                f4m.j(view4);
                return;
            }
            return;
        }
        if (z2 && view != null) {
            if (textView2 != null) {
                f4m.j(textView2);
            }
            if (textView != null) {
                f4m.j(textView);
            }
            if (view2 != null) {
                f4m.j(view2);
            }
            view.setVisibility(0);
            if (view3 != null) {
                f4m.j(view3);
            }
            if (view4 != null) {
                f4m.j(view4);
                return;
            }
            return;
        }
        if (str2 != null && !drm0.N(str2) && textView2 != null) {
            textView2.setVisibility(0);
            textView2.setText(str2);
            if (textView != null) {
                f4m.j(textView);
            }
            if (view2 != null) {
                f4m.j(view2);
            }
            if (view != null) {
                f4m.j(view);
            }
            if (view3 != null) {
                f4m.j(view3);
            }
            if (view4 != null) {
                f4m.j(view4);
                return;
            }
            return;
        }
        if (z && view2 != null) {
            if (textView2 != null) {
                f4m.j(textView2);
            }
            if (textView != null) {
                f4m.j(textView);
            }
            view2.setVisibility(0);
            if (view != null) {
                f4m.j(view);
            }
            if (view3 != null) {
                f4m.j(view3);
            }
            if (view4 != null) {
                f4m.j(view4);
                return;
            }
            return;
        }
        if (view3 != null && z3) {
            view3.setVisibility(0);
            if (textView2 != null) {
                f4m.j(textView2);
            }
            if (textView != null) {
                f4m.j(textView);
            }
            if (view2 != null) {
                f4m.j(view2);
            }
            if (view != null) {
                f4m.j(view);
            }
            if (view4 != null) {
                f4m.j(view4);
                return;
            }
            return;
        }
        if (view4 != null && z4) {
            view4.setVisibility(0);
            if (textView2 != null) {
                f4m.j(textView2);
            }
            if (textView != null) {
                f4m.j(textView);
            }
            if (view2 != null) {
                f4m.j(view2);
            }
            if (view != null) {
                f4m.j(view);
            }
            if (view3 != null) {
                f4m.j(view3);
                return;
            }
            return;
        }
        if (textView2 != null) {
            f4m.j(textView2);
        }
        if (textView != null) {
            f4m.j(textView);
        }
        if (view2 != null) {
            f4m.j(view2);
        }
        if (view != null) {
            f4m.j(view);
        }
        if (view3 != null) {
            f4m.j(view3);
        }
        if (view4 != null) {
            f4m.j(view4);
        }
    }

    public static final j9y i(JSONArray jSONArray) {
        return new j9y(new k9y(jSONArray));
    }

    public static final void k(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(efz.a(i, i2, "index: ", ", size: "));
        }
    }

    public static final void l(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(efz.a(i, i2, "index: ", ", size: "));
        }
    }

    public static final void n(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder a = odj.a(i, i2, "fromIndex: ", ", toIndex: ", ", size: ");
            a.append(i3);
            throw new IndexOutOfBoundsException(a.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(efz.a(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static GridViewType o(Context context) {
        HashSet hashSet = iah0.a;
        int i = context.getResources().getDisplayMetrics().heightPixels;
        int i2 = context.getResources().getDisplayMetrics().widthPixels;
        return ((double) ((i == 0 || i2 == 0) ? 1.0f : ((float) i) / ((float) i2))) > 1.8333333333333333d ? GridViewType.FIT_BETWEEN_CONTROLS : GridViewType.FULL_SCREEN;
    }

    public static final int p(float f) {
        return ((int) (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.ceil(f) : Math.floor(f))) * (-1);
    }

    public static zfg0 q(zfg0 zfg0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = zfg0Var.a;
        }
        if ((i & 2) != 0) {
            z2 = zfg0Var.b;
        }
        return (z == zfg0Var.a && z2 == zfg0Var.b) ? zfg0Var : new zfg0(z, z2);
    }

    public static final String r(PhotoAlbum photoAlbum) {
        int i = photoAlbum.b;
        UserId userId = photoAlbum.c;
        if (i == -9000) {
            return "https://" + a0a.d + "/tag" + userId.b;
        }
        return "https://" + a0a.d + "/album" + userId + '_' + (i != -15 ? i != -7 ? i != -6 ? String.valueOf(i) : "0" : "00" : "000");
    }

    public static final mct0 s(mct0 mct0Var, rbt0 rbt0Var, VideoFile videoFile, VideoFile videoFile2) {
        List<rbt0> list = mct0Var.e;
        k9x k9xVar = mct0Var.b;
        int i = rbt0Var.a() ? rbt0Var.c : mct0Var.d;
        int i2 = k9xVar.b;
        int i3 = k9xVar.c;
        if (rbt0Var.a()) {
            i3 += rbt0Var.b;
        }
        k9x k9xVar2 = new k9x(i2, i3, 1);
        ArrayList arrayList = new ArrayList(list);
        rbt0 rbt0Var2 = (rbt0) j5g.k0(list);
        if (rbt0Var2 == null || rbt0Var2.a()) {
            arrayList.add(rbt0Var);
        } else {
            arrayList.set(e43.h(list), rbt0Var);
        }
        return mct0.a(mct0Var, k9xVar2, i, arrayList, videoFile, videoFile2, 5);
    }

    public static final mct0 w(mct0 mct0Var, rbt0 rbt0Var) {
        List<rbt0> list = mct0Var.e;
        k9x k9xVar = mct0Var.b;
        int i = rbt0Var.a() ? rbt0Var.c : mct0Var.d;
        k9x k9xVar2 = new k9x(rbt0Var.a() ? Math.max(0, k9xVar.b - rbt0Var.b) : k9xVar.b, k9xVar.c, 1);
        ArrayList arrayList = new ArrayList(list);
        rbt0 rbt0Var2 = (rbt0) j5g.a0(list);
        if (rbt0Var2 == null || rbt0Var2.a()) {
            arrayList.add(0, rbt0Var);
        } else {
            arrayList.set(0, rbt0Var);
        }
        return mct0.a(mct0Var, k9xVar2, i, arrayList, null, null, 101);
    }

    public static final kvj0 x(List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            SinglePreferenceMigrationType singlePreferenceMigrationType = ((kvj0) obj).b;
            if (singlePreferenceMigrationType == SinglePreferenceMigrationType.TO_FULL_SINGLE || singlePreferenceMigrationType == SinglePreferenceMigrationType.TO_FULL_SINGLE_WITHOUT_CREATE) {
                break;
            }
        }
        return (kvj0) obj;
    }

    public static final kvj0 y(List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            SinglePreferenceMigrationType singlePreferenceMigrationType = ((kvj0) obj).b;
            if (singlePreferenceMigrationType == SinglePreferenceMigrationType.TO_SINGLE || singlePreferenceMigrationType == SinglePreferenceMigrationType.TO_SINGLE_WITHOUT_CREATE) {
                break;
            }
        }
        return (kvj0) obj;
    }

    public static long z(fkk0 fkk0Var, long j) {
        long j2 = 0;
        double d2 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        while (j2 < j) {
            long a = fkk0Var.a(j2);
            if (a == C.TIME_UNSET) {
                a = Long.MAX_VALUE;
            }
            fxc0.z(a > j2);
            d2 += (Math.min(a, j) - j2) / fkk0Var.b(j2);
            j2 = a;
        }
        return (long) Math.floor(d2);
    }

    @Override // xsna.w420
    public String g(vg6 vg6Var) {
        String str = vg6Var.c;
        if (!(vg6Var instanceof pgq0)) {
            return str;
        }
        return "@id" + ((pgq0) vg6Var).d + " (" + str + ')';
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Long.valueOf(zznn.zzG());
    }
}
