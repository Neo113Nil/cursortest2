package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.compose.runtime.a;
import androidx.compose.ui.unit.LayoutDirection;
import com.bumptech.glide.load.EncodeStrategy;
import com.google.android.gms.internal.measurement.zznh;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ironsource.B5;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.audio.dto.AudioGenreDto;
import com.vk.api.generated.audio.dto.AudioPhotosByTypeDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetSimilarNewsConnectionTypeDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetSimilarNewsIntentDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Genre;
import com.vk.im.engine.models.account.BaseRule;
import com.vk.im.engine.models.account.PrivacySetting;
import com.vk.im.engine.models.account.UserListRule;
import com.vk.im.engine.models.account.UserListType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.log.L;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.domain.model.DiscoverCustomIntent;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AccountParser.kt */
/* loaded from: classes2.dex */
public final class sp implements pag0, q701, br90, vv60, hkx0 {
    public static final jai c = new jai(639498344, new ac1(0, 1), false);
    public static final jai d = new jai(1661980563, new j89(2), false);
    public static final jai e = new jai(1500624533, new j89(4), false);
    public static final jai f = new jai(1890101041, new dih(1), false);
    public static final sp g = new sp(6);
    public static final /* synthetic */ sp h = new sp(8);
    public final /* synthetic */ int b;

    public /* synthetic */ sp(int i) {
        this.b = i;
    }

    public static final zi10 e(bpn0 bpn0Var, bpn0 bpn0Var2) {
        return new zi10(bpn0Var, bpn0Var2);
    }

    public static final boolean f(u2b0 u2b0Var) {
        return (u2b0Var.T0() || u2b0Var.A0() || u2b0Var.E0() || u2b0Var.z0()) ? false : true;
    }

    public static final boolean g(ViewFlipper viewFlipper, int i) {
        if (viewFlipper.getDisplayedChild() == i) {
            return false;
        }
        viewFlipper.setDisplayedChild(i);
        return true;
    }

    public static void i(DataInputStream dataInputStream) {
        try {
            try {
                dataInputStream.close();
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IOException | InvocationTargetException unused) {
        } catch (IncompatibleClassChangeError unused2) {
            dataInputStream.getClass().getMethod(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, null).invoke(dataInputStream, null);
        }
    }

    public static qso0 k(qso0 qso0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = qso0Var.a;
        }
        if ((i & 2) != 0) {
            z2 = qso0Var.b;
        }
        return (z == qso0Var.a && z2 == qso0Var.b) ? qso0Var : new qso0(z, z2);
    }

    public static final void l() {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2041502249, 0, -1, "com.vk.core.compose.component.defaults.<get-VkRichCellDefaults> (RichCellDefaults.kt:47)");
        }
        wn20 wn20Var = wn20.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static final boolean m(Throwable th) {
        return ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == -1) || (th instanceof IOException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b6, code lost:
    
        if (r0 == null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Artist n(AudioArtistDto audioArtistDto, boolean z) {
        ArrayList arrayList;
        Image image;
        String id = audioArtistDto.getId();
        String str = id == null ? "" : id;
        String k = audioArtistDto.k();
        String d2 = audioArtistDto.d();
        List<AudioGenreDto> i = audioArtistDto.i();
        if (i != null) {
            List<AudioGenreDto> list = i;
            arrayList = new ArrayList(c5g.u(list, 10));
            for (AudioGenreDto audioGenreDto : list) {
                arrayList.add(new Genre(audioGenreDto.getId(), audioGenreDto.d()));
            }
        } else {
            arrayList = null;
        }
        List<AudioPhotosByTypeDto> n = audioArtistDto.n();
        if (n != null) {
            AudioPhotosByTypeDto audioPhotosByTypeDto = (AudioPhotosByTypeDto) j5g.a0(n);
            if (audioPhotosByTypeDto == null) {
                image = null;
            } else {
                Character y0 = erm0.y0(audioPhotosByTypeDto.getType());
                char charValue = y0 != null ? y0.charValue() : ImageSizeKey.SIZE_M_0130.i();
                List<BaseImageDto> d3 = audioPhotosByTypeDto.d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d3, 10));
                for (BaseImageDto baseImageDto : d3) {
                    arrayList2.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), charValue, false, 32, null));
                }
                image = new Image(arrayList2);
            }
        }
        List<BaseImageDto> l = audioArtistDto.l();
        if (l != null) {
            if (!z) {
                l = null;
            }
            if (l != null) {
                List<BaseImageDto> list2 = l;
                ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
                for (BaseImageDto baseImageDto2 : list2) {
                    arrayList3.add(new ImageSize(baseImageDto2.getUrl(), baseImageDto2.getWidth(), baseImageDto2.getHeight(), baseImageDto2.e(), (char) 0, false, 48, null));
                }
                image = new Image(arrayList3);
                Boolean p = audioArtistDto.p();
                boolean booleanValue = p == null ? p.booleanValue() : false;
                Boolean e2 = audioArtistDto.e();
                boolean booleanValue2 = e2 == null ? e2.booleanValue() : true;
                Boolean u = audioArtistDto.u();
                boolean booleanValue3 = u == null ? u.booleanValue() : false;
                String r = audioArtistDto.r();
                String str2 = r != null ? r : "";
                Boolean f2 = audioArtistDto.f();
                boolean booleanValue4 = f2 != null ? f2.booleanValue() : true;
                Integer g2 = audioArtistDto.g();
                int intValue = g2 == null ? g2.intValue() : 0;
                Integer j = audioArtistDto.j();
                int intValue2 = j != null ? j.intValue() : 0;
                UserId o = audioArtistDto.o();
                return new Artist(str, k, d2, arrayList, image, booleanValue, booleanValue2, booleanValue3, str2, booleanValue4, o != null ? Long.valueOf(o.b) : null, intValue, Integer.valueOf(intValue2));
            }
        }
        image = null;
        Boolean p2 = audioArtistDto.p();
        if (p2 == null) {
        }
        Boolean e22 = audioArtistDto.e();
        if (e22 == null) {
        }
        Boolean u2 = audioArtistDto.u();
        if (u2 == null) {
        }
        String r2 = audioArtistDto.r();
        if (r2 != null) {
        }
        Boolean f22 = audioArtistDto.f();
        boolean booleanValue42 = f22 != null ? f22.booleanValue() : true;
        Integer g22 = audioArtistDto.g();
        if (g22 == null) {
        }
        Integer j2 = audioArtistDto.j();
        if (j2 != null) {
        }
        UserId o2 = audioArtistDto.o();
        return new Artist(str, k, d2, arrayList, image, booleanValue, booleanValue2, booleanValue3, str2, booleanValue42, o2 != null ? Long.valueOf(o2.b) : null, intValue, Integer.valueOf(intValue2));
    }

    public static String p(Object obj, Object... objArr) {
        if (objArr.length % 2 != 0) {
            throw new InvalidParameterException("Number of parameters must be even");
        }
        StringBuilder sb = new StringBuilder(obj.getClass().getName());
        sb.append(X3.j.d);
        for (int i = 0; i < objArr.length; i += 2) {
            sb.append(objArr[i]);
            sb.append(B5.U);
            sb.append(objArr[i + 1]);
            if (i < objArr.length - 2) {
                sb.append(", ");
            }
        }
        sb.append(X3.j.e);
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    public static ArrayList q(JSONArray jSONArray) {
        BaseRule baseRule;
        List list;
        List list2;
        List list3;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("key");
            String string2 = jSONObject.getString("title");
            String string3 = jSONObject.getString("section");
            JSONObject jSONObject2 = jSONObject.getJSONObject("value");
            String C = f370.C("category", "", jSONObject2);
            switch (C.hashCode()) {
                case -2018487259:
                    if (C.equals("friends_and_contacts")) {
                        baseRule = BaseRule.g;
                        break;
                    }
                    baseRule = BaseRule.e;
                    break;
                case -1942494185:
                    if (C.equals("friends_of_friends")) {
                        baseRule = BaseRule.h;
                        break;
                    }
                    baseRule = BaseRule.e;
                    break;
                case -1313660149:
                    if (C.equals("only_me")) {
                        baseRule = BaseRule.d;
                        break;
                    }
                    baseRule = BaseRule.e;
                    break;
                case -1144722732:
                    if (C.equals("friends_of_friends_only")) {
                        baseRule = BaseRule.i;
                        break;
                    }
                    baseRule = BaseRule.e;
                    break;
                case -1040220445:
                    if (C.equals("nobody")) {
                        baseRule = BaseRule.e;
                        break;
                    }
                    baseRule = BaseRule.e;
                    break;
                case -600094315:
                    if (C.equals("friends")) {
                        baseRule = BaseRule.f;
                        break;
                    }
                    baseRule = BaseRule.e;
                    break;
                case 96673:
                    if (C.equals("all")) {
                        baseRule = BaseRule.c;
                        break;
                    }
                    baseRule = BaseRule.e;
                    break;
                default:
                    baseRule = BaseRule.e;
                    break;
            }
            ArrayList arrayList2 = new ArrayList();
            if (!epx.f(baseRule, BaseRule.e) || "nobody".equals(C)) {
                arrayList2.add(baseRule);
            }
            if (jSONObject2.has("owners")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("owners");
                JSONArray optJSONArray = jSONObject3.optJSONArray("excluded");
                if (optJSONArray != null) {
                    ArrayList arrayList3 = new ArrayList(optJSONArray.length());
                    int length2 = optJSONArray.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        arrayList3.add(Long.valueOf(optJSONArray.getLong(i2)));
                    }
                    list2 = j5g.O0(arrayList3);
                } else {
                    list2 = null;
                }
                if (list2 == null) {
                    list2 = EmptyList.b;
                }
                JSONArray optJSONArray2 = jSONObject3.optJSONArray("allowed");
                if (optJSONArray2 != null) {
                    ArrayList arrayList4 = new ArrayList(optJSONArray2.length());
                    int length3 = optJSONArray2.length();
                    for (int i3 = 0; i3 < length3; i3++) {
                        arrayList4.add(Long.valueOf(optJSONArray2.getLong(i3)));
                    }
                    list3 = j5g.O0(arrayList4);
                } else {
                    list3 = null;
                }
                if (list3 == null) {
                    list3 = EmptyList.b;
                }
                List list4 = list3;
                if (!list4.isEmpty()) {
                    arrayList2.add(new UserListRule(UserListType.INCLUDE, list4));
                }
                List list5 = list2;
                if (!list5.isEmpty()) {
                    arrayList2.add(new UserListRule(UserListType.EXCLUDE, list5));
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2.add(BaseRule.c);
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("supported_categories");
            if (optJSONArray3 != null) {
                list = new ArrayList(optJSONArray3.length());
                int length4 = optJSONArray3.length();
                for (int i4 = 0; i4 < length4; i4 = wq.b(optJSONArray3, i4, list, i4, 1)) {
                }
            } else {
                list = EmptyList.b;
            }
            arrayList.add(new PrivacySetting(string, string2, string3, arrayList2, list));
        }
        return arrayList;
    }

    public static final zzf0 r(wzs wzsVar, xvy xvyVar, wzs wzsVar2, wzs wzsVar3, androidx.compose.runtime.a aVar, int i, int i2) {
        xvy a = (i2 & 2) != 0 ? zvy.a(0, 3, aVar) : xvyVar;
        wzs wzsVar4 = (i2 & 8) != 0 ? null : wzsVar3;
        float f2 = 20;
        umk0 umk0Var = new umk0();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-779567251, i, -1, "com.vk.core.compose.reorder.rememberReorderableLazyListState (ReorderableLazyListState.kt:27)");
        }
        float I0 = ((azl) aVar.r(uvi.h)).I0(f2);
        Object x = aVar.x();
        Object obj = a.C0011a.a;
        if (x == obj) {
            x = bap.j(EmptyCoroutineContext.b, aVar);
            aVar.R(x);
        }
        yvj yvjVar = (yvj) x;
        int i3 = (i & 112) ^ 48;
        boolean z = true;
        boolean z2 = (i3 > 32 && aVar.J(a)) || (i & 48) == 32;
        Object x2 = aVar.x();
        if (z2 || x2 == obj) {
            Object zzf0Var = new zzf0(a, yvjVar, I0, wzsVar, wzsVar2, wzsVar4, umk0Var);
            aVar.R(zzf0Var);
            x2 = zzf0Var;
        }
        zzf0 zzf0Var2 = (zzf0) x2;
        boolean z3 = aVar.r(uvi.n) == LayoutDirection.Rtl;
        boolean J = aVar.J(zzf0Var2);
        Object x3 = aVar.x();
        if (J || x3 == obj) {
            x3 = new a0g0(zzf0Var2, null);
            aVar.R(x3);
        }
        bap.g(zzf0Var2, (wzs) x3, aVar, 0);
        if ((i3 <= 32 || !aVar.J(a)) && (i & 48) != 32) {
            z = false;
        }
        boolean l = aVar.l(z3) | z | aVar.J(zzf0Var2);
        Object x4 = aVar.x();
        if (l || x4 == obj) {
            x4 = new b0g0(a, z3, zzf0Var2, null);
            aVar.R(x4);
        }
        bap.g(zzf0Var2, (wzs) x4, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return zzf0Var2;
    }

    public static float s(boolean z) {
        return z ? 1.0f : 0.64f;
    }

    public static void t(View view) {
        float b = iah0.b(8.0f);
        Context context = view.getContext();
        Drawable background = view.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        view.setBackground(vjo.a(context, colorDrawable != null ? colorDrawable.getColor() : -1, 0, 0, b, null, b, 188));
    }

    public static final void u(View view, boolean z) {
        if (view == null || !gz80.a(23)) {
            return;
        }
        Context context = view.getContext();
        HashSet hashSet = iah0.a;
        if (fnj.d(context)) {
            return;
        }
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    public static final void v(x65 x65Var, Context context, gzs gzsVar) {
        if (x65Var != null) {
            com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
            bVar.getClass();
            com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.ALERT_KEYS_NOT_SUPPORTED, null, null, null, 30);
            x65Var.U2(context.getString(R.string.vk_passkey_not_supported_on_device), context.getString(R.string.vk_passkey_try_another_device_or_restore), context.getString(R.string.vk_auth_accessibility_close), new ef4(3, gzsVar), null, null, true, new v05(1, gzsVar), new k3(2, gzsVar));
        }
    }

    public static final void w(sjm sjmVar, Context context, gzs gzsVar) {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        bVar.getClass();
        com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.ALERT_KEYS_NOT_SUPPORTED, null, null, null, 30);
        if (sjmVar != null) {
            sjmVar.U2(context.getString(R.string.vk_passkey_not_supported_on_device), context.getString(R.string.vk_passkey_try_another_device_or_restore), context.getString(R.string.vk_auth_accessibility_close), new ef4(3, gzsVar), null, null, true, new v05(1, gzsVar), new k3(2, gzsVar));
        }
    }

    public static final void x(int i, int i2, SerialDescriptor serialDescriptor) {
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(serialDescriptor.d(i4));
            }
            i3 >>>= 1;
        }
        String f2 = serialDescriptor.f();
        throw new MissingFieldException(arrayList, arrayList.size() == 1 ? h5s.d(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", f2, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + f2 + "', but they were missing", null);
    }

    public static final MobileOfficialAppsVideoStat$TypeScreenMode y(VideoMinimizableState videoMinimizableState) {
        if (videoMinimizableState instanceof VideoMinimizableState.Expanded) {
            return MobileOfficialAppsVideoStat$TypeScreenMode.DISCOVERY;
        }
        if (videoMinimizableState instanceof VideoMinimizableState.Collapsed) {
            return MobileOfficialAppsVideoStat$TypeScreenMode.MINIMIZED;
        }
        if (videoMinimizableState instanceof VideoMinimizableState.FullscreenVertical) {
            return MobileOfficialAppsVideoStat$TypeScreenMode.FULLSCREEN_PORTRAIT;
        }
        if (videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal) {
            return MobileOfficialAppsVideoStat$TypeScreenMode.FULLSCREEN_LANDSCAPE;
        }
        if (videoMinimizableState instanceof VideoMinimizableState.Pip) {
            return MobileOfficialAppsVideoStat$TypeScreenMode.PIP;
        }
        if ((videoMinimizableState instanceof VideoMinimizableState.Animating) || (videoMinimizableState instanceof VideoMinimizableState.Hidden) || (videoMinimizableState instanceof VideoMinimizableState.PreparedToPip)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void z(ViewFlipper viewFlipper) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        alphaAnimation.setDuration(200L);
        viewFlipper.setInAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        alphaAnimation2.setDuration(200L);
        viewFlipper.setOutAnimation(alphaAnimation2);
    }

    @Override // xsna.br90
    public void a(d5 d5Var) {
        L.F(d5Var);
    }

    @Override // xsna.hkx0
    public gkx0 b(MsgFromChannel msgFromChannel, int i) {
        return new gkx0((msgFromChannel.d * 512) + (msgFromChannel.I.s * 33554432) + msgFromChannel.b);
    }

    @Override // xsna.vv60
    public io.reactivex.rxjava3.internal.operators.observable.j1 c(vg60 vg60Var) {
        Object obj;
        NewsfeedGetSimilarNewsIntentDto newsfeedGetSimilarNewsIntentDto;
        String str;
        tfx tfxVar;
        ArrayList arrayList;
        tfx tfxVar2;
        NewsfeedGetSimilarNewsIntentDto newsfeedGetSimilarNewsIntentDto2;
        Long l = vg60Var.l;
        UserId userId = l != null ? new UserId(l.longValue()) : UserId.d;
        Integer num = vg60Var.m;
        int intValue = num != null ? num.intValue() : 0;
        String str2 = vg60Var.d;
        String str3 = vg60Var.a;
        String str4 = vg60Var.b;
        DiscoverCustomIntent discoverCustomIntent = vg60Var.e;
        Integer num2 = vg60Var.k;
        final lk60 lk60Var = new lk60(str2, str3, userId, intValue, str4, discoverCustomIntent, num2);
        int i = intValue;
        lk60Var.e = vg60Var.h;
        lk60Var.f = vg60Var.i;
        lk60Var.g = vg60Var.j;
        lk60Var.j = Long.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
        lk60Var.h = vg60Var.f;
        JSONObject jSONObject = vg60Var.g;
        lk60Var.i = jSONObject != null ? jSONObject.toString() : null;
        xuo0.a.getClass();
        final long a = xuo0.a();
        izs izsVar = new izs() { // from class: xsna.kk60
            @Override // xsna.izs
            public final Object invoke(Object obj2) {
                NewsEntriesContainer.NewsPageCacheConfig newsPageCacheConfig;
                JSONObject optJSONObject = ((JSONObject) obj2).optJSONObject("response");
                if (optJSONObject == null) {
                    throw new NullPointerException("response is null");
                }
                String a2 = cqm0.a(optJSONObject.optString("next_from"));
                String optString = optJSONObject.optString("news_custom_title");
                lk60 lk60Var2 = lk60.this;
                String optString2 = optJSONObject.optString("referer", lk60Var2.c);
                String str5 = lk60Var2.b;
                String str6 = lk60Var2.a;
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("cache_config");
                if (optJSONObject2 != null) {
                    Serializer.c<NewsEntriesContainer.NewsPageCacheConfig> cVar = NewsEntriesContainer.NewsPageCacheConfig.CREATOR;
                    newsPageCacheConfig = NewsEntriesContainer.NewsPageCacheConfig.a.a(optJSONObject2);
                } else {
                    newsPageCacheConfig = null;
                }
                NewsEntriesContainer newsEntriesContainer = new NewsEntriesContainer(new NewsEntriesContainer.Info(a2, optString, str5, optString2, 0L, false, 0L, 0L, a, 0L, str6, newsPageCacheConfig, 752, null), null, 2, null);
                com.vk.dto.newsfeed.a.b(optJSONObject, null, newsEntriesContainer.c, null, 10);
                return newsEntriesContainer;
            }
        };
        String str5 = lk60Var.e;
        List O0 = str5 != null ? j5g.O0(drm0.c0(str5, new String[]{StringUtils.COMMA}, 0, 6)) : null;
        String str6 = lk60Var.g;
        Iterator<E> it = NewsfeedGetSimilarNewsConnectionTypeDto.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((NewsfeedGetSimilarNewsConnectionTypeDto) obj).j(), com.vk.core.utils.newtork.b.c().b())) {
                break;
            }
        }
        NewsfeedGetSimilarNewsConnectionTypeDto newsfeedGetSimilarNewsConnectionTypeDto = (NewsfeedGetSimilarNewsConnectionTypeDto) obj;
        String a2 = com.vk.core.utils.newtork.b.c().a();
        String str7 = lk60Var.f;
        DiscoverCustomIntent discoverCustomIntent2 = lk60Var.d;
        if (discoverCustomIntent2 != null) {
            int i2 = mk60.$EnumSwitchMapping$0[discoverCustomIntent2.ordinal()];
            if (i2 == 1) {
                newsfeedGetSimilarNewsIntentDto2 = NewsfeedGetSimilarNewsIntentDto.PRELOAD;
            } else if (i2 == 2) {
                newsfeedGetSimilarNewsIntentDto2 = NewsfeedGetSimilarNewsIntentDto.INITIAL;
            } else if (i2 == 3) {
                newsfeedGetSimilarNewsIntentDto2 = NewsfeedGetSimilarNewsIntentDto.PTR;
            } else if (i2 == 4) {
                newsfeedGetSimilarNewsIntentDto2 = NewsfeedGetSimilarNewsIntentDto.NEXT_PAGE;
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                newsfeedGetSimilarNewsIntentDto2 = NewsfeedGetSimilarNewsIntentDto.FEED_BLOCK;
            }
            newsfeedGetSimilarNewsIntentDto = newsfeedGetSimilarNewsIntentDto2;
        } else {
            newsfeedGetSimilarNewsIntentDto = null;
        }
        List<BaseUserGroupFieldsDto> list = gw60.a;
        String str8 = lk60Var.h;
        Long l2 = lk60Var.j;
        String str9 = lk60Var.i;
        tfx tfxVar3 = new tfx("newsfeed.getSimilarNews", new sr(20), new tr(18));
        tfx.n(tfxVar3, "anchor_owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar3, "anchor_item_id", i, 1, 0, 8);
        if (num2 != null) {
            tfxVar3.f(num2.intValue(), 0, 50, "count");
        }
        if (str2 != null) {
            str = str6;
            tfx.o(tfxVar3, "start_from", str2, 0, 0, 12);
        } else {
            str = str6;
        }
        if (O0 != null) {
            tfxVar3.i("filters", O0);
        }
        if (str != null) {
            tfxVar = tfxVar3;
            tfx.o(tfxVar, "device_info", str, 0, 0, 12);
        } else {
            tfxVar = tfxVar3;
        }
        if (newsfeedGetSimilarNewsConnectionTypeDto != null) {
            tfx.o(tfxVar, "connection_type", newsfeedGetSimilarNewsConnectionTypeDto.j(), 0, 0, 12);
        }
        tfx.o(tfxVar, "connection_subtype", a2, 0, 0, 12);
        if (str7 != null) {
            tfx.o(tfxVar, "user_options", str7, 0, 0, 12);
        }
        if (newsfeedGetSimilarNewsIntentDto != null) {
            tfx.o(tfxVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, newsfeedGetSimilarNewsIntentDto.i(), 0, 0, 12);
        }
        tfx tfxVar4 = tfxVar;
        if (list != null) {
            List<BaseUserGroupFieldsDto> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((BaseUserGroupFieldsDto) it2.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar4.i("fields", arrayList);
        }
        if (str8 != null) {
            tfxVar2 = tfxVar4;
            tfx.o(tfxVar2, "track_code", str8, 0, 0, 12);
        } else {
            tfxVar2 = tfxVar4;
        }
        if (l2 != null) {
            tfx.m(tfxVar2, CommonUrlParts.REQUEST_ID, l2.longValue(), 0L, 12);
        }
        if (str9 != null) {
            tfx.o(tfxVar2, "geo_data", str9, 0, 0, 12);
        }
        tfx tfxVar5 = tfxVar2;
        tfxVar5.j("extended", true);
        return rsg0.y0(yfb.z(tfxVar5, izsVar), null, null, 3).U(new o7(new k220(9), 28));
    }

    @Override // xsna.hkx0
    public gkx0 d(Msg msg) {
        MsgFromChannel msgFromChannel = msg instanceof MsgFromChannel ? (MsgFromChannel) msg : null;
        if (msgFromChannel == null) {
            return gkx0.c;
        }
        return new gkx0((msgFromChannel.d * 512) + (msgFromChannel.I.s * 33554432) + msgFromChannel.b);
    }

    @Override // xsna.yip
    public boolean h(@NonNull Object obj, @NonNull File file, @NonNull au80 au80Var) {
        try {
            du8.d(file, ((gyt) ((hag0) obj).get()).b.a.a.d.asReadOnlyBuffer());
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public int hashCode() {
        switch (this.b) {
            case 17:
                throw null;
            default:
                return super.hashCode();
        }
    }

    @Override // xsna.pag0
    @NonNull
    public EncodeStrategy j(@NonNull au80 au80Var) {
        return EncodeStrategy.SOURCE;
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zznh.zzc());
    }

    public sp(ssk0 ssk0Var) {
        this.b = 24;
    }
}
