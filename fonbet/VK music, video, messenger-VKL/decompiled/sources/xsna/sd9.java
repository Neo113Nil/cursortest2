package xsna;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.compose.runtime.a;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.android.gms.internal.measurement.zznn;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.media.dto.MediaRestrictionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemColorDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderImageDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.api.generated.video.dto.VideoRestrictionButtonDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.main.SilentAuthSource;
import com.vk.clips.viewer.impl.grid.repository.cache.GridHeaderMemCache;
import com.vk.dto.common.Image;
import com.vk.dto.common.ThemedColor;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.newsfeed.Owner;
import com.vk.feed.core.models.ImagePhoto;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: Cam16.java */
/* loaded from: classes13.dex */
public final class sd9 implements ita, q701, jp70, pfu {
    public static final double[][] b = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};
    public static final StackTraceElement[] c = new StackTraceElement[0];
    public static final sd9 d = new sd9();
    public static final /* synthetic */ sd9 e = new sd9();

    public /* synthetic */ sd9(boolean z) {
    }

    public static final oib d() {
        return new oib();
    }

    public static boolean e(Iterable iterable, jxc0 jxc0Var) {
        Iterator it = iterable.iterator();
        fxc0.t(jxc0Var, "predicate");
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (jxc0Var.apply(it.next())) {
                break;
            }
            i++;
        }
        return i != -1;
    }

    public static final Object f(io.reactivex.rxjava3.core.x xVar, ContinuationImpl continuationImpl) {
        lq9 lq9Var = new lq9(1, s7s0.c(continuationImpl));
        lq9Var.o();
        xVar.subscribe(new ssg0(lq9Var));
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
    }

    public static Object g(io.reactivex.rxjava3.core.t tVar, q230 q230Var, ContinuationImpl continuationImpl) {
        lq9 lq9Var = new lq9(1, s7s0.c(continuationImpl));
        lq9Var.o();
        tVar.subscribe(new tsg0(lq9Var, q230Var));
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
    }

    public static long i(androidx.compose.runtime.a aVar) {
        aVar.K(1804502653);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1804502653, 0, -1, "com.vk.core.compose.component.defaults.InputSelectDefaults.closeIconColor (InputSelectDefaults.kt:32)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = ylu0Var.getIcon().l;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return j;
    }

    @TargetApi(9)
    public static String j(String str) {
        if (TextUtils.isEmpty(str)) {
            Pattern pattern = z200.a;
            if (TextUtils.isEmpty("url is null")) {
                return str;
            }
            z200.a("url is null");
            return str;
        }
        try {
            if (URLUtil.isNetworkUrl(str)) {
                return new URL(str.replaceAll("[\\\\#]", DomExceptionUtils.SEPARATOR)).getHost();
            }
            z200.b("UriUtil", "url don't starts with http or https");
            return "";
        } catch (MalformedURLException e2) {
            z200.b("UriUtil", "getHostByURI error  MalformedURLException : " + e2.getMessage());
            return "";
        }
    }

    public static Object k(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return ji.a(1, list);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static boolean l(Throwable th) {
        if (th instanceof IOException) {
            return true;
        }
        return (th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == -1;
    }

    public static final void m(String str) {
        throw new IllegalArgumentException(zr.a("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static VideoRestriction n(MediaRestrictionDto mediaRestrictionDto) {
        String str;
        boolean z;
        int i;
        Image image;
        RestrictionButton restrictionButton;
        String str2;
        VideoRestrictionButtonDto.ActionDto d2;
        String title = mediaRestrictionDto.getTitle();
        String n = mediaRestrictionDto.n();
        if (n == null) {
            n = "";
        }
        BaseBoolIntDto d3 = mediaRestrictionDto.d();
        BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
        if (d3 == baseBoolIntDto) {
            str = "";
            z = true;
        } else {
            str = "";
            z = false;
        }
        VideoRestrictionButtonDto e2 = mediaRestrictionDto.e();
        String i2 = (e2 == null || (d2 = e2.d()) == null) ? null : d2.i();
        if (i2 == null) {
            i2 = str;
        }
        String title2 = e2 != null ? e2.getTitle() : null;
        if (title2 == null) {
            title2 = str;
        }
        RestrictionButton restrictionButton2 = (i2.length() == 0 && title2.length() == 0) ? null : new RestrictionButton(i2, title2, e2 != null ? e2.e() : null);
        boolean z2 = mediaRestrictionDto.f() == baseBoolIntDto;
        new ne6();
        Image a = ne6.a(mediaRestrictionDto.g());
        new ne6();
        Image a2 = ne6.a(mediaRestrictionDto.j());
        Integer i3 = mediaRestrictionDto.i();
        int intValue = i3 != null ? i3.intValue() : 0;
        String k = mediaRestrictionDto.k();
        if (k == null) {
            RestrictionButton restrictionButton3 = restrictionButton2;
            str2 = str;
            restrictionButton = restrictionButton3;
            i = intValue;
            image = a2;
        } else {
            i = intValue;
            image = a2;
            restrictionButton = restrictionButton2;
            str2 = k;
        }
        return new VideoRestriction(title, n, z, restrictionButton, z2, a, image, i, str2);
    }

    public static ImagePhoto o(NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, LinkedHashMap linkedHashMap) {
        ThemedColor themedColor;
        List<PhotosPhotoSizesDto> g = newsfeedNewsfeedItemHeaderImageDto.g();
        Image a = g != null ? qz2.a(g) : null;
        String e2 = newsfeedNewsfeedItemHeaderImageDto.e();
        String f = newsfeedNewsfeedItemHeaderImageDto.f();
        UserId i = newsfeedNewsfeedItemHeaderImageDto.i();
        if (i == null) {
            i = UserId.d;
        }
        Owner owner = (Owner) linkedHashMap.get(i);
        NewsfeedNewsfeedItemColorDto d2 = newsfeedNewsfeedItemHeaderImageDto.d();
        if (d2 != null) {
            String e3 = d2.e();
            Integer a2 = e3 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", e3) : null;
            String d3 = d2.d();
            themedColor = new ThemedColor(a2, d3 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", d3) : null);
        } else {
            themedColor = null;
        }
        return new ImagePhoto(a, e2, f, owner, themedColor);
    }

    public static long p(androidx.compose.runtime.a aVar) {
        aVar.K(1682526638);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1682526638, 0, -1, "com.vk.core.compose.component.defaults.InputSelectDefaults.placeholderTextColor (InputSelectDefaults.kt:26)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = ylu0Var.getText().p;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return j;
    }

    public static final x17 q(boolean z, boolean z2, int i, int i2, int i3, androidx.compose.runtime.a aVar) {
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        int i6;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(86615420, 0, -1, "com.vk.music.stickyplayer.presentation.components.rememberBigPlayerSeekbarState (BigPlayerSeekbarState.kt:32)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            z3 = z;
            z4 = z2;
            i4 = i;
            i5 = i2;
            i6 = i3;
            x17 x17Var = new x17(z3, z4, i4, i5, i6);
            aVar.R(x17Var);
            x = x17Var;
        } else {
            z3 = z;
            z4 = z2;
            i4 = i;
            i5 = i2;
            i6 = i3;
        }
        x17 x17Var2 = (x17) x;
        ((zak0) x17Var2.a).setValue(Boolean.valueOf(z3));
        ((zak0) x17Var2.b).setValue(Boolean.valueOf(z4));
        ((zak0) x17Var2.c).setValue(Integer.valueOf(i4));
        ((zak0) x17Var2.d).setValue(Integer.valueOf(i5));
        ((zak0) x17Var2.e).setValue(Integer.valueOf(i6));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return x17Var2;
    }

    public static final void r(Bundle bundle, SilentAuthSource silentAuthSource) {
        if (silentAuthSource != null) {
            bundle.putInt("silent_auth_source_key", silentAuthSource.ordinal());
        }
    }

    public static void s(List list, jxc0 jxc0Var, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (jxc0Var.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static ufx t(String str) {
        ufx ufxVar = new ufx("stats.trackEvents", new ck70(9), new zyk0(0));
        ufx.n(ufxVar, "events", str, 0, 12);
        return ufxVar;
    }

    public static long u(androidx.compose.runtime.a aVar) {
        aVar.K(1723381893);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1723381893, 0, -1, "com.vk.core.compose.component.defaults.InputSelectDefaults.textColor (InputSelectDefaults.kt:29)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = ylu0Var.getText().m;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return j;
    }

    public static Object[] v(Iterable iterable) {
        Collection collection;
        if (iterable instanceof Collection) {
            collection = (Collection) iterable;
        } else {
            Iterator it = iterable.iterator();
            ArrayList arrayList = new ArrayList();
            lwx.a(arrayList, it);
            collection = arrayList;
        }
        return collection.toArray();
    }

    @Override // xsna.ita
    public boolean b(Object obj, Object obj2) {
        return obj != obj2;
    }

    @Override // xsna.pfu
    public mwu c(String str) {
        return null;
    }

    @Override // xsna.jp70
    public Object h() {
        return new LinkedHashSet();
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return zznn.zzK();
    }

    @Override // xsna.pfu
    public void a(String str, GridHeaderMemCache.HeaderCache.OwnerCache ownerCache) {
    }
}
