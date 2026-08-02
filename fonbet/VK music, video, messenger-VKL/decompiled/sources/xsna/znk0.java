package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.ironsource.O6;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.businessGroups.dto.BusinessGroupsGetShieldSettingsScreenDto;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryUserProfile;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.profile.user.impl.ui.adapter.MergeMode;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: Stack.kt */
@vby
/* loaded from: classes11.dex */
public final class znk0 implements q701 {
    public static com.google.android.gms.internal.maps.zzi c;
    public static final jai d;
    public static final jai e;
    public static final jai f;
    public static final jai g;
    public static final Comparator[] j;
    public static jgs m;
    public static u6g0 n;
    public static hhd0 o;
    public static final int[] b = {0, 0};
    public static final znk0 h = new znk0();
    public static final znk0 i = new znk0();
    public static final zlk0 k = new zlk0();
    public static final /* synthetic */ znk0 l = new znk0();

    static {
        int i2 = 0;
        int i3 = 2;
        d = new jai(-2143225303, new t8c(i3), false);
        int i4 = 1;
        e = new jai(18381451, new n21(i4), false);
        f = new jai(735267983, new ugi(i2), false);
        g = new jai(165279142, new n21(i3), false);
        j = new Comparator[]{new wlk0(), new kp6(i4), new xlk0(i2), new ylk0()};
    }

    public static final int A(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        int hashCode = (serialDescriptor.f().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        int c2 = serialDescriptor.c();
        int i2 = 1;
        while (true) {
            int i3 = 0;
            if (!(c2 > 0)) {
                break;
            }
            int i4 = c2 - 1;
            int i5 = i2 * 31;
            String f2 = serialDescriptor.h(serialDescriptor.c() - c2).f();
            if (f2 != null) {
                i3 = f2.hashCode();
            }
            i2 = i5 + i3;
            c2 = i4;
        }
        int c3 = serialDescriptor.c();
        int i6 = 1;
        while (true) {
            if (!(c3 > 0)) {
                return (((hashCode * 31) + i2) * 31) + i6;
            }
            int i7 = c3 - 1;
            int i8 = i6 * 31;
            gmi0 kind = serialDescriptor.h(serialDescriptor.c() - c3).getKind();
            i6 = i8 + (kind != null ? kind.hashCode() : 0);
            c3 = i7;
        }
    }

    public static lqv B(lg90 lg90Var, long j2, long j3, androidx.compose.runtime.a aVar, int i2, int i3) {
        if ((i3 & 2) != 0) {
            j2 = wnj.a(aVar);
        }
        long j4 = j2;
        if ((i3 & 4) != 0) {
            j3 = 9205357640488583168L;
        }
        long j5 = j3;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1621674158, i2, -1, "com.vk.core.compose.component.context.menu.ContextMenuItem.Left.Icon.Companion.invoke (ContextMenuItem.kt:166)");
        }
        int i4 = ((i2 << 3) & 7168) | 70;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1456007674, i4, -1, "com.vk.core.compose.component.context.menu.remember (IconImpl.kt:57)");
        }
        lqv a = qqv.a(lg90Var, j4, j5, aVar, 8 | ((i4 >> 3) & 896));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }

    public static final boolean C() {
        return (m == null || n == null || o == null) ? false : true;
    }

    public static boolean D(String str) {
        return str.length() >= 3;
    }

    public static final boolean E(ArrayList arrayList) {
        return !arrayList.isEmpty();
    }

    public static final double F(float f2, long j2) {
        float sin = (float) Math.sin(sdi.x(f2));
        float f3 = 1;
        double log = 0.5d - (((float) Math.log((f3 + sin) / (f3 - sin))) / 12.566370614359172d);
        double d2 = j2;
        return Math.min(Math.max(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, log * d2), d2);
    }

    public static StoryUserProfile G(rhm0 rhm0Var) {
        UserProfile userProfile = new UserProfile();
        userProfile.c = rhm0Var.a;
        userProfile.e = rhm0Var.b;
        userProfile.d = rhm0Var.c;
        userProfile.O = rhm0Var.d;
        userProfile.h = rhm0Var.e;
        boolean z = rhm0Var.i;
        VerifyInfo verifyInfo = userProfile.B;
        verifyInfo.b = z;
        verifyInfo.c = rhm0Var.j;
        verifyInfo.d = rhm0Var.k;
        userProfile.a0(rhm0Var.f);
        return new StoryUserProfile(userProfile, rhm0Var.g, rhm0Var.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean H(UserProfileAdapterItem userProfileAdapterItem, UserProfileAdapterItem userProfileAdapterItem2) {
        if (userProfileAdapterItem2 == null) {
            return false;
        }
        c920 c920Var = userProfileAdapterItem instanceof c920 ? (c920) userProfileAdapterItem : null;
        if (c920Var == null) {
            return false;
        }
        List<Class<? extends UserProfileAdapterItem>> a = c920Var.a();
        if ((a instanceof Collection) && a.isEmpty()) {
            return false;
        }
        Iterator<T> it = a.iterator();
        while (it.hasNext()) {
            if (((Class) it.next()).isInstance(userProfileAdapterItem2)) {
                return true;
            }
        }
        return false;
    }

    public static final CatalogDataType I(String str) {
        Object obj;
        try {
            Iterator<E> it = CatalogDataType.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((CatalogDataType) obj).getId(), str)) {
                    break;
                }
            }
            CatalogDataType catalogDataType = (CatalogDataType) obj;
            return catalogDataType == null ? R(str) : catalogDataType;
        } catch (Exception unused) {
            return R(str);
        }
    }

    public static final Object J(ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    public static gns0 K(int i2, UserId userId, String str) {
        return new gns0(userId, i2, str);
    }

    public static ins0 L(int i2, UserId userId) {
        return new ins0(userId, i2);
    }

    public static final UIBlockActionTextButton N(bi20 bi20Var, CatalogViewType catalogViewType, UserId userId, String str, String str2) {
        return new UIBlockActionTextButton(new com.vk.catalog2.common.dto.api.ui.a(bi20Var.a, bi20Var.b, catalogViewType, bi20Var.c, bi20Var.k, userId, bi20Var.j, bi20Var.m, bi20Var.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680), str2, str, bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h()));
    }

    public static final uog0 O(MergeMode mergeMode) {
        float f2 = (mergeMode == MergeMode.MergeTop || mergeMode == MergeMode.MergeBoth) ? 8 : 20;
        float f3 = (mergeMode == MergeMode.MergeBottom || mergeMode == MergeMode.MergeBoth) ? 8 : 20;
        return vog0.c(f2, f2, f3, f3);
    }

    public static final io.reactivex.rxjava3.core.q P(io.reactivex.rxjava3.core.q qVar, b3k0 b3k0Var, io.reactivex.rxjava3.core.w wVar) {
        if (b3k0Var == null) {
            return qVar;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        cp50 cp50Var = new cp50(new v63(ref$ObjectRef, b3k0Var, wVar, 11), 14);
        qVar.getClass();
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.c0 c0Var = new io.reactivex.rxjava3.internal.operators.observable.c0(qVar, cp50Var, kVar);
        y730 y730Var = new y730(new vc00(ref$ObjectRef, 2), 13);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        return new io.reactivex.rxjava3.internal.operators.observable.c0(c0Var.E(y730Var, lVar, kVar, kVar).F(new jsv(new c3k0(ref$ObjectRef, 0), 23)), lVar, new jad(ref$ObjectRef, 5));
    }

    public static io.reactivex.rxjava3.core.x Q(io.reactivex.rxjava3.core.x xVar, com.vk.video.profile.presentation.b bVar) {
        if (bVar == null) {
            return xVar;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        return new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(xVar, new m330(new twi0(2, ref$ObjectRef, bVar), 24)), new gl30(new xc50(ref$ObjectRef, 21), 25)).h(new afs(new ece0(ref$ObjectRef, 7), 23)), new eki0(ref$ObjectRef, 1));
    }

    public static final CatalogDataType R(String str) {
        L.l("Catalog", air.b('\"', "UNKNOWN DATA_TYPE=\"", str));
        return CatalogDataType.UNKNOWN;
    }

    public static final void a(UserProfileAdapterItem userProfileAdapterItem, UserProfileAdapterItem userProfileAdapterItem2, UserProfileAdapterItem userProfileAdapterItem3) {
        userProfileAdapterItem.b = (j(userProfileAdapterItem, userProfileAdapterItem3) || j(userProfileAdapterItem, userProfileAdapterItem2)) ? MergeMode.FlatMerge : (H(userProfileAdapterItem, userProfileAdapterItem2) && H(userProfileAdapterItem, userProfileAdapterItem3)) ? MergeMode.MergeBoth : H(userProfileAdapterItem, userProfileAdapterItem2) ? MergeMode.MergeTop : H(userProfileAdapterItem, userProfileAdapterItem3) ? MergeMode.MergeBottom : MergeMode.Default;
    }

    public static String g(String str, String str2) {
        return pzl.b(str, " · ", str2);
    }

    public static g3e0 h(g3e0 g3e0Var, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = g3e0Var.a;
        }
        if ((i2 & 2) != 0) {
            z2 = g3e0Var.b;
        }
        return (z == g3e0Var.a && z2 == g3e0Var.b) ? g3e0Var : new g3e0(z, z2);
    }

    public static final io.reactivex.rxjava3.disposables.c i(b3k0 b3k0Var, io.reactivex.rxjava3.core.w wVar) {
        io.reactivex.rxjava3.core.x rVar = new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new od60(b3k0Var, 2)), new xhb0(new p6e0(5), 6));
        if (wVar != null) {
            rVar = rVar.m(wVar);
        }
        return rVar.subscribe(new uu60(new i0b0(b3k0Var, 13), 15), new qf(new nyq(28), 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean j(UserProfileAdapterItem userProfileAdapterItem, UserProfileAdapterItem userProfileAdapterItem2) {
        if (userProfileAdapterItem2 == null) {
            return false;
        }
        bor borVar = userProfileAdapterItem instanceof bor ? (bor) userProfileAdapterItem : null;
        if (borVar == null) {
            return false;
        }
        List<Class<? extends UserProfileAdapterItem>> b2 = borVar.b();
        if ((b2 instanceof Collection) && b2.isEmpty()) {
            return false;
        }
        Iterator<T> it = b2.iterator();
        while (it.hasNext()) {
            if (((Class) it.next()).isInstance(userProfileAdapterItem2)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public static tb7 k(@NonNull Bitmap bitmap) {
        exc0.j(bitmap, "image must not be null");
        try {
            com.google.android.gms.internal.maps.zzi zziVar = c;
            exc0.j(zziVar, "IBitmapDescriptorFactory is not initialized");
            return new tb7(zziVar.zzg(bitmap));
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public static Integer l(Context context, String str) {
        Integer num;
        try {
            num = Integer.valueOf(context.getResources().getIdentifier(str, "attr", context.getPackageName()));
        } catch (Throwable th) {
            L.e(th);
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            return null;
        }
        return num;
    }

    public static int m(Context context, String str) {
        Integer p = p(context, "vk_icon_".concat(str));
        if (p != null) {
            return p.intValue();
        }
        Integer d2 = wp.d(context, "vk_icon_", str, "_outline");
        if (d2 != null) {
            return d2.intValue();
        }
        return 0;
    }

    public static final Context n() {
        Context context = e43.a;
        if (context != null) {
            return context;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r3.equals("hieroglyph_character") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        return java.lang.Integer.valueOf(com.vkontakte.android.R.drawable.vk_icon_hieroglyph_character_outline_12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r3.equals("hieroglyph_character_outline") == false) goto L29;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer o(Context context, String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1848512776:
                    break;
                case -940047115:
                    break;
                case 3143222:
                    if (str.equals("fire")) {
                        return Integer.valueOf(R.drawable.vk_icon_fire_12);
                    }
                    break;
                case 3145580:
                    if (str.equals("flag")) {
                        return Integer.valueOf(R.drawable.vk_icon_flag_12);
                    }
                    break;
                case 1625568464:
                    if (str.equals("flash_12")) {
                        return Integer.valueOf(R.drawable.vk_icon_flash_12);
                    }
                    break;
            }
        }
        Integer d2 = wp.d(context, "vk_icon_", str, "_12");
        return d2 == null ? wp.d(context, "vk_icon_", str, "_outline_12") : d2;
    }

    public static Integer p(Context context, String str) {
        Integer num;
        try {
            num = Integer.valueOf(context.getResources().getIdentifier(str, "drawable", context.getPackageName()));
        } catch (Throwable th) {
            L.e(th);
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            return null;
        }
        return num;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int q(Context context, String str) {
        switch (str.hashCode()) {
            case 97513456:
                if (str.equals("flash")) {
                    return R.drawable.vk_icon_flash_16;
                }
                break;
            case 111578632:
                if (str.equals("users")) {
                    return R.drawable.vk_icon_users_16;
                }
                break;
            case 1050790300:
                if (str.equals("favorite")) {
                    return R.drawable.vk_icon_favorite_16;
                }
                break;
            case 1828606158:
                if (str.equals("star_circle_fill_yellow")) {
                    return R.drawable.vk_icon_donut_color_16;
                }
                break;
        }
        Integer d2 = wp.d(context, "vk_icon_", str, "_16");
        if (d2 != null) {
            return d2.intValue();
        }
        Integer d3 = wp.d(context, "vk_icon_", str, "_outline_16");
        if (d3 != null) {
            return d3.intValue();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r3.equals("donut_circle_fill_yellow") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r3.equals("star_circle_fill_yellow") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        return r0;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer r(Context context, String str) {
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_donut_color_20);
        if (str != null) {
            switch (str.hashCode()) {
                case -1842295000:
                    if (str.equals("prometey_circle_fill_red")) {
                        return Integer.valueOf(R.drawable.vk_icon_prometey_circle_fill_red_20);
                    }
                    break;
                case -1562868162:
                    if (str.equals("users_circle_fill_blue")) {
                        return Integer.valueOf(R.drawable.vk_icon_users_circle_fill_blue_20);
                    }
                    break;
                case -1493310376:
                    if (str.equals("picture_stack_shadow")) {
                        return Integer.valueOf(R.drawable.vk_icon_picture_stack_20);
                    }
                    break;
                case 851719219:
                    if (str.equals("favorite_circle_fill_green")) {
                        return Integer.valueOf(R.drawable.vk_icon_favorite_circle_fill_green_20);
                    }
                    break;
                case 1050790300:
                    if (str.equals("favorite")) {
                        return Integer.valueOf(R.drawable.vk_icon_favorite_20);
                    }
                    break;
                case 1491613182:
                    break;
                case 1828606158:
                    break;
            }
        }
        Integer d2 = wp.d(context, "vk_icon_", str, "_20");
        return d2 == null ? wp.d(context, "vk_icon_", str, "_outline_20") : d2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01be, code lost:
    
        if (r3.equals("voice_room") == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014b, code lost:
    
        if (r3.equals("podcast") == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c1, code lost:
    
        return r0;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Integer s(Context context, String str) {
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_podcast_24);
        if (str != null) {
            switch (str.hashCode()) {
                case -2027582223:
                    if (str.equals("external_link_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_external_link_outline_24);
                    }
                    break;
                case -1681218393:
                    if (str.equals("notebook_check_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_notebook_check_outline_24);
                    }
                    break;
                case -1514911800:
                    break;
                case -1045144784:
                    if (str.equals("music_mic_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_music_mic_outline_24);
                    }
                    break;
                case -865642066:
                    if (str.equals("delete_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_delete_outline_24);
                    }
                    break;
                case -780170804:
                    if (str.equals("music_note")) {
                        return Integer.valueOf(R.drawable.vk_icon_music_note_24);
                    }
                    break;
                case -748939326:
                    if (str.equals("poll_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_poll_outline_24);
                    }
                    break;
                case -672885104:
                    if (str.equals("block_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_block_outline_24);
                    }
                    break;
                case -472697570:
                    if (str.equals("document_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_document_outline_24);
                    }
                    break;
                case -405568764:
                    break;
                case -307380456:
                    if (str.equals("song_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_song_outline_24);
                    }
                    break;
                case -282243371:
                    if (str.equals("location_map_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_location_map_outline_24);
                    }
                    break;
                case -180834573:
                    if (str.equals("flash_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_flash_outline_24);
                    }
                    break;
                case -96599653:
                    if (str.equals("list_like_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_list_like_outline_24);
                    }
                    break;
                case 57052225:
                    if (str.equals("calendar_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_calendar_outline_24);
                    }
                    break;
                case 919107376:
                    if (str.equals("text_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_text_outline_24);
                    }
                    break;
                case 920459390:
                    if (str.equals("video_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_video_outline_24);
                    }
                    break;
                case 968255937:
                    if (str.equals("text_live_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_text_live_outline_24);
                    }
                    break;
                case 1014209541:
                    if (str.equals("article_box_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_article_box_outline_24);
                    }
                    break;
                case 1050710251:
                    if (str.equals("storefront_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_storefront_outline_24);
                    }
                    break;
                case 1274686977:
                    if (str.equals("picture_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_picture_outline_24);
                    }
                    break;
                case 1358913932:
                    if (str.equals("book_spread_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_book_spread_outline_24);
                    }
                    break;
                case 1749559877:
                    if (str.equals("hide_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_hide_outline_24);
                    }
                    break;
                case 1891122901:
                    if (str.equals("playlist_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_playlist_outline_24);
                    }
                    break;
                case 1895845453:
                    if (str.equals("photos_stack_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_photos_stack_outline_24);
                    }
                    break;
                case 1929686469:
                    if (str.equals("archive_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_archive_outline_24);
                    }
                    break;
                case 1986639882:
                    if (str.equals("message_outline")) {
                        return Integer.valueOf(R.drawable.vk_icon_message_outline_24);
                    }
                    break;
            }
        }
        Integer d2 = wp.d(context, "vk_icon_", str, "_24");
        return d2 == null ? wp.d(context, "vk_icon_", str, "_outline_24") : d2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static Integer t(Context context, String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -2063493082:
                if (str.equals("settings_outline")) {
                    return Integer.valueOf(R.drawable.vk_icon_settings_outline_28);
                }
                break;
            case -966288111:
                if (str.equals("clock_outline")) {
                    return Integer.valueOf(R.drawable.vk_icon_clock_outline_28);
                }
                break;
            case 241321791:
                if (str.equals("market_outline")) {
                    return Integer.valueOf(R.drawable.vk_icon_market_outline_28);
                }
                break;
            case 1749559877:
                if (str.equals("hide_outline")) {
                    return Integer.valueOf(R.drawable.vk_icon_hide_outline_28);
                }
                break;
        }
        Integer d2 = wp.d(context, "vk_icon_", str, "_28");
        return d2 == null ? wp.d(context, "vk_icon_", str, "_outline_28") : d2;
    }

    public static Integer u(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1817724039:
                if (!str.equals("logo_vk_clip_shadow")) {
                    return null;
                }
                return Integer.valueOf(R.string.accessibility_discover_media_clip);
            case -1493310376:
                if (!str.equals("picture_stack_shadow")) {
                    return null;
                }
                return Integer.valueOf(R.string.accessibility_discover_media_stack);
            case -5406694:
                if (!str.equals("logo_vk_video_shadow")) {
                    return null;
                }
                return Integer.valueOf(R.string.accessibility_discover_media_video);
            case 109770997:
                if (!str.equals("story")) {
                    return null;
                }
                return Integer.valueOf(R.string.accessibility_discover_media_story);
            case 201508870:
                if (!str.equals("logo_vk_clip")) {
                    return null;
                }
                return Integer.valueOf(R.string.accessibility_discover_media_clip);
            case 1197231760:
                if (!str.equals("live_badge")) {
                    return null;
                }
                return Integer.valueOf(R.string.accessibility_discover_media_live);
            case 1408322567:
                if (!str.equals("picture_stack")) {
                    return null;
                }
                return Integer.valueOf(R.string.accessibility_discover_media_stack);
            case 1673686954:
                if (!str.equals("story_shadow")) {
                    return null;
                }
                return Integer.valueOf(R.string.accessibility_discover_media_story);
            case 1863165359:
                if (!str.equals("live_badge_shadow")) {
                    return null;
                }
                return Integer.valueOf(R.string.accessibility_discover_media_live);
            case 1969260165:
                if (!str.equals("logo_vk_video")) {
                    return null;
                }
                return Integer.valueOf(R.string.accessibility_discover_media_video);
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int v(Context context, String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1817724039:
                    if (str.equals("logo_vk_clip_shadow")) {
                        return R.drawable.vk_icon_logo_clips_outline_20;
                    }
                    break;
                case -5406694:
                    if (str.equals("logo_vk_video_shadow")) {
                        return R.drawable.vk_icon_logo_vk_video_outline_20;
                    }
                    break;
                case 201508870:
                    if (str.equals("logo_vk_clip")) {
                        return R.drawable.vk_icon_logo_clips_outline_20;
                    }
                    break;
                case 1197231760:
                    if (str.equals("live_badge")) {
                        return R.drawable.vk_icon_live_badge_20;
                    }
                    break;
                case 1863165359:
                    if (str.equals("live_badge_shadow")) {
                        return R.drawable.vk_icon_live_badge_20;
                    }
                    break;
                case 1969260165:
                    if (str.equals("logo_vk_video")) {
                        return R.drawable.vk_icon_logo_vk_video_outline_20;
                    }
                    break;
            }
        }
        Integer d2 = wp.d(context, "vk_icon_", str, "_20");
        if (d2 != null) {
            return d2.intValue();
        }
        Integer d3 = wp.d(context, "vk_icon_", str, "_outline_20");
        if (d3 != null) {
            return d3.intValue();
        }
        return 0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int w(Context context, String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1817724039:
                    if (str.equals("logo_vk_clip_shadow")) {
                        return R.drawable.vk_icon_logo_clips_outline_shadow_20;
                    }
                    break;
                case -1493310376:
                    if (str.equals("picture_stack_shadow")) {
                        return R.drawable.vk_icon_picture_on_square_outline_shadow_28;
                    }
                    break;
                case -5406694:
                    if (str.equals("logo_vk_video_shadow")) {
                        return R.drawable.vk_icon_logo_vk_video_outline_shadow_28;
                    }
                    break;
                case 201508870:
                    if (str.equals("logo_vk_clip")) {
                        return R.drawable.vk_icon_logo_clips_outline_shadow_20;
                    }
                    break;
                case 1197231760:
                    if (str.equals("live_badge")) {
                        return R.drawable.vk_icon_live_badge_18;
                    }
                    break;
                case 1408322567:
                    if (str.equals("picture_stack")) {
                        return R.drawable.vk_icon_picture_on_square_outline_shadow_28;
                    }
                    break;
                case 1863165359:
                    if (str.equals("live_badge_shadow")) {
                        return R.drawable.vk_icon_live_badge_18;
                    }
                    break;
                case 1969260165:
                    if (str.equals("logo_vk_video")) {
                        return R.drawable.vk_icon_logo_vk_video_outline_shadow_28;
                    }
                    break;
            }
        }
        Integer d2 = wp.d(context, "vk_icon_", str, "_28");
        if (d2 != null) {
            return d2.intValue();
        }
        Integer d3 = wp.d(context, "vk_icon_", str, "_shadow_28");
        if (d3 != null) {
            return d3.intValue();
        }
        Integer d4 = wp.d(context, "vk_icon_", str, "_outline_28");
        if (d4 != null) {
            return d4.intValue();
        }
        return 0;
    }

    public static final glx x(@NonNull Context context) {
        return new glx(context, glx.a, a.d.U6, b.a.c);
    }

    public static final Rect y(View view) {
        int[] iArr = b;
        view.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        return new Rect(i2, i3, (int) ((view.getScaleX() * view.getMeasuredWidth()) + i2), (int) ((view.getScaleY() * view.getMeasuredHeight()) + i3));
    }

    public static final com.vk.core.compose.component.topbar.b z() {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(255575348, 0, -1, "com.vk.core.compose.component.defaults.<get-VkTopBarDefaults> (VkTopBarDefaults.kt:25)");
        }
        com.vk.core.compose.component.topbar.b bVar = com.vk.core.compose.component.topbar.b.e;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return bVar;
    }

    public yfz M(int i2, ArrayList arrayList) {
        float f2 = Float.MAX_VALUE;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        for (int i3 = 0; i3 < 4; i3++) {
            Comparator comparator = j[i3];
            if (arrayList3 == null) {
                arrayList3 = new ArrayList(arrayList);
            }
            g5g.L(arrayList3, comparator);
            ArrayList arrayList4 = new ArrayList((arrayList3.size() - (i2 * 2)) + 1);
            int size = (arrayList3.size() - i2) + 1;
            for (int i4 = i2; i4 < size; i4++) {
                arrayList4.add(new yfz(arrayList3.subList(0, i4), arrayList3.subList(i4, arrayList3.size())));
            }
            Iterator it = arrayList4.iterator();
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            while (it.hasNext()) {
                f3 += ((Number) ((yfz) it.next()).d.getValue()).floatValue();
            }
            if (f3 < f2) {
                arrayList3 = null;
                arrayList2 = arrayList4;
                f2 = f3;
            }
        }
        if (arrayList2 != null) {
            return (yfz) j5g.r0(k, arrayList2);
        }
        return null;
    }

    public ufx b(int i2) {
        ufx ufxVar = new ufx("auth.getCredentialsForApp", new gp(6), new eq0(4));
        ufx.k(ufxVar, "app_id", i2, 0, 8);
        return ufxVar;
    }

    public ufx c(String str, String str2, String str3) {
        ufx ufxVar = new ufx("auth.onSuccessValidation", new rr(6), new zn(6));
        ufx.n(ufxVar, O6.e1, str, 0, 12);
        ufx.n(ufxVar, "lang", str2, 0, 12);
        if (str3 != null) {
            ufx.n(ufxVar, "max_messenger_hash", str3, 0, 12);
        }
        return ufxVar;
    }

    public ufx d(int i2, String str, String str2) {
        ufx ufxVar = new ufx("auth.validateEmail", new vr(6), new wr(7));
        ufx.n(ufxVar, O6.e1, str, 0, 12);
        ufx.k(ufxVar, "client_id", i2, 0, 12);
        if (str2 != null) {
            ufx.n(ufxVar, "email", str2, 0, 12);
        }
        return ufxVar;
    }

    public ufx e(String str) {
        ufx ufxVar = new ufx("auth.validatePhoneCheckSkip", new as(5), new p11(5));
        ufx.n(ufxVar, O6.e1, str, 0, 12);
        return ufxVar;
    }

    public tfx f(UserId userId, BusinessGroupsGetShieldSettingsScreenDto businessGroupsGetShieldSettingsScreenDto) {
        tfx tfxVar = new tfx("businessGroups.getShieldSettings", new vp(5), new wp(4));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfx.o(tfxVar, "screen", businessGroupsGetShieldSettingsScreenDto.i(), 0, 0, 12);
        return tfxVar;
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zzpd.zzg());
    }
}
