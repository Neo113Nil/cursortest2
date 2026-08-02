package xsna;

import android.app.KeyguardManager;
import android.content.Context;
import androidx.compose.runtime.a;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.measurement.zznn;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetBreakingNewsFeedConnectionTypeDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetBreakingNewsFeedIntentDto;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.filter.ImageQuality;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.im.engine.models.InfoBar;
import com.vk.newsfeed.domain.model.DiscoverCustomIntent;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.js.bridge.events.AddToFavorites$Error;
import com.vk.superapp.js.bridge.events.EventNames;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.json.JSONObject;

/* compiled from: PointerEvent.kt */
@vby
/* loaded from: classes11.dex */
public final class wlb0 implements q701, tg60, fvp {
    public static final byte[] b = new byte[8192];
    public static final jai c = new jai(-557020952, new sa9(2), false);
    public static final /* synthetic */ wlb0 d = new wlb0();

    public static String d(StoryEntry storyEntry, boolean z, int i, int i2) {
        Image image;
        ImageSize imageSize;
        VideoFile videoFile = storyEntry.n;
        if (videoFile == null || videoFile.getWidth() == 0 || (videoFile.getWidth() < videoFile.getHeight() && !storyEntry.Lb())) {
            File file = storyEntry.x;
            return (file == null || !vhk0.g(file)) ? storyEntry.Jb(i, ImageQuality.FIT, z) : storyEntry.Eb();
        }
        VideoFile videoFile2 = storyEntry.n;
        if (videoFile2 == null || (image = videoFile2.getImage()) == null) {
            return null;
        }
        ArrayList arrayList = image.Db() ? image.c : image.b;
        if (arrayList == null || (imageSize = (ImageSize) ixj0.c(arrayList, i, i2)) == null) {
            return null;
        }
        return imageSize.d.d;
    }

    public static ByteBuffer e(ByteBuffer... byteBufferArr) {
        int i = 0;
        for (ByteBuffer byteBuffer : byteBufferArr) {
            i += byteBuffer.remaining();
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            allocate.put(byteBuffer2);
        }
        allocate.flip();
        return allocate;
    }

    public static final int f(int i, Context context) {
        return context.getResources().getDimensionPixelSize(i);
    }

    public static final boolean g(long j, long j2) {
        return j == j2;
    }

    public static ylu0 h(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return ylu0Var;
    }

    public static squ0 i(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1412929589, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-elevation> (VkTheme.kt:170)");
        }
        squ0 squ0Var = (squ0) aVar.r(rrv0.b);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return squ0Var;
    }

    public static String j(Owner owner) {
        if (!fkq0.d(owner.b)) {
            return owner.c;
        }
        String str = owner.c;
        if (str == null) {
            return null;
        }
        List c0 = drm0.c0(str, new String[]{" "}, 0, 6);
        return v1v.a(' ', (String) c0.get(0), c0.size() > 1 ? (String) c0.get(1) : "");
    }

    public static njv0 k(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(559436726, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-shadow> (VkTheme.kt:175)");
        }
        njv0 njv0Var = (njv0) aVar.r(rrv0.d);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return njv0Var;
    }

    public static wuv0 l(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
        }
        wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return wuv0Var;
    }

    public static wl20 m(String str, String str2, tl20 tl20Var, androidx.compose.runtime.a aVar, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            tl20Var = null;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-314404077, 3072, -1, "com.vk.core.compose.component.snackbar.SnackbarContent.Middle.Companion.invoke (SnackbarContent.kt:268)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1673635905, 6, -1, "com.vk.core.compose.component.snackbar.remember (MiddleImpl.kt:64)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new wl20(str, str2, tl20Var);
            aVar.R(x);
        }
        wl20 wl20Var = (wl20) x;
        ((zak0) wl20Var.a).setValue(str);
        ((zak0) wl20Var.b).setValue(str2);
        ((zak0) wl20Var.c).setValue(tl20Var);
        ((zak0) wl20Var.d).setValue(null);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return wl20Var;
    }

    public static boolean o(w2w w2wVar, String str) {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        w2wVar.I0().u(new com.vk.movika.sdk.base.logic.processor.d(13, (Object) str, (Object) ref$BooleanRef));
        return ref$BooleanRef.element;
    }

    public static boolean p(w2w w2wVar, InfoBar infoBar) {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        w2wVar.I0().u(new ng3(15, infoBar, ref$BooleanRef));
        return ref$BooleanRef.element;
    }

    public static void q(FragmentImpl fragmentImpl) {
        PermissionHelper permissionHelper = PermissionHelper.a;
        FragmentActivity activity = fragmentImpl.getActivity();
        permissionHelper.getClass();
        PermissionHelper.h(permissionHelper, activity, PermissionHelper.t, R.string.vk_permissions_intent_video, R.string.vk_permissions_intent_video_settings, new b290(fragmentImpl, 25), null, 64);
    }

    public static void r(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        inputStream.getClass();
        bArr.getClass();
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                break;
            } else {
                i3 += read;
            }
        }
        if (i3 != i2) {
            throw new EOFException(sl9.c(i3, i2, "reached end of stream after reading ", " bytes; ", " bytes expected"));
        }
    }

    public static final String s(int i, Context context) {
        return context.getResources().getString(i);
    }

    public static final String t(Context context, int i, Object... objArr) {
        return context.getResources().getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static String u(long j) {
        return q9k.d("PointerId(value=", j, ')');
    }

    public static final Object v(Object obj) {
        if (obj != null) {
            for (Annotation annotation : obj.getClass().getAnnotations()) {
                if (annotation instanceof vby) {
                    for (Field field : obj.getClass().getDeclaredFields()) {
                        if (field.getType().isPrimitive()) {
                            Field declaredField = obj.getClass().getDeclaredField(field.getName());
                            declaredField.setAccessible(true);
                            return declaredField.get(obj);
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
        }
        return obj;
    }

    public static ByteBuffer w(String str, List list) {
        int i = 8;
        for (int i2 = 0; i2 < list.size(); i2++) {
            i += ((ByteBuffer) list.get(i2)).remaining();
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.putInt(i);
        allocate.put(str.getBytes(StandardCharsets.UTF_8), 0, 4);
        for (int i3 = 0; i3 < list.size(); i3++) {
            allocate.put((ByteBuffer) list.get(i3));
        }
        allocate.flip();
        return allocate;
    }

    public static ByteBuffer x(String str, ByteBuffer byteBuffer) {
        return y(byteBuffer, str.getBytes(StandardCharsets.UTF_8));
    }

    public static ByteBuffer y(ByteBuffer byteBuffer, byte[] bArr) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining() + 8);
        allocate.putInt(byteBuffer.remaining() + 8);
        allocate.put(bArr, 0, 4);
        allocate.put(byteBuffer);
        allocate.flip();
        return allocate;
    }

    @Override // xsna.tg60
    public io.reactivex.rxjava3.internal.operators.observable.j1 a(vg60 vg60Var) {
        Object obj;
        NewsfeedGetBreakingNewsFeedIntentDto newsfeedGetBreakingNewsFeedIntentDto;
        tfx tfxVar;
        String str;
        int i;
        String str2;
        Long l;
        boolean z;
        ArrayList arrayList;
        tfx tfxVar2;
        NewsfeedGetBreakingNewsFeedIntentDto newsfeedGetBreakingNewsFeedIntentDto2;
        String str3 = vg60Var.d;
        String str4 = vg60Var.a;
        String str5 = vg60Var.b;
        DiscoverCustomIntent discoverCustomIntent = vg60Var.e;
        Integer num = vg60Var.k;
        bk60 bk60Var = new bk60(str3, str4, str5, discoverCustomIntent, num);
        bk60Var.e = vg60Var.h;
        bk60Var.f = vg60Var.i;
        bk60Var.g = vg60Var.j;
        bk60Var.j = Long.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
        bk60Var.h = vg60Var.f;
        JSONObject jSONObject = vg60Var.g;
        bk60Var.i = jSONObject != null ? jSONObject.toString() : null;
        xuo0.a.getClass();
        rfx rfxVar = new rfx(bk60Var, xuo0.a(), 1);
        String str6 = bk60Var.e;
        List O0 = str6 != null ? j5g.O0(drm0.c0(str6, new String[]{StringUtils.COMMA}, 0, 6)) : null;
        String str7 = bk60Var.g;
        Iterator<E> it = NewsfeedGetBreakingNewsFeedConnectionTypeDto.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((NewsfeedGetBreakingNewsFeedConnectionTypeDto) obj).j(), com.vk.core.utils.newtork.b.c().b())) {
                break;
            }
        }
        NewsfeedGetBreakingNewsFeedConnectionTypeDto newsfeedGetBreakingNewsFeedConnectionTypeDto = (NewsfeedGetBreakingNewsFeedConnectionTypeDto) obj;
        String a = com.vk.core.utils.newtork.b.c().a();
        String str8 = bk60Var.f;
        DiscoverCustomIntent discoverCustomIntent2 = bk60Var.d;
        if (discoverCustomIntent2 != null) {
            int i2 = ck60.$EnumSwitchMapping$0[discoverCustomIntent2.ordinal()];
            if (i2 == 1) {
                newsfeedGetBreakingNewsFeedIntentDto2 = NewsfeedGetBreakingNewsFeedIntentDto.PRELOAD;
            } else if (i2 == 2) {
                newsfeedGetBreakingNewsFeedIntentDto2 = NewsfeedGetBreakingNewsFeedIntentDto.INITIAL;
            } else if (i2 == 3) {
                newsfeedGetBreakingNewsFeedIntentDto2 = NewsfeedGetBreakingNewsFeedIntentDto.PTR;
            } else if (i2 == 4) {
                newsfeedGetBreakingNewsFeedIntentDto2 = NewsfeedGetBreakingNewsFeedIntentDto.NEXT_PAGE;
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                newsfeedGetBreakingNewsFeedIntentDto2 = NewsfeedGetBreakingNewsFeedIntentDto.FEED_BLOCK;
            }
            newsfeedGetBreakingNewsFeedIntentDto = newsfeedGetBreakingNewsFeedIntentDto2;
        } else {
            newsfeedGetBreakingNewsFeedIntentDto = null;
        }
        List<BaseUserGroupFieldsDto> list = gw60.a;
        String str9 = bk60Var.h;
        Long l2 = bk60Var.j;
        String str10 = bk60Var.i;
        tfx tfxVar3 = new tfx("newsfeed.getBreakingNewsFeed", new e630(3), new jr(24));
        if (num != null) {
            tfxVar3.f(num.intValue(), 0, 50, "count");
        }
        if (str3 != null) {
            tfx.o(tfxVar3, "start_from", str3, 0, 0, 12);
        }
        if (O0 != null) {
            tfxVar3.i("filters", O0);
        }
        if (str7 != null) {
            str = str8;
            i = 3;
            z = true;
            l = l2;
            str2 = str9;
            tfx.o(tfxVar3, "device_info", str7, 0, 0, 12);
            tfxVar = tfxVar3;
        } else {
            tfxVar = tfxVar3;
            str = str8;
            i = 3;
            str2 = str9;
            l = l2;
            z = true;
        }
        if (newsfeedGetBreakingNewsFeedConnectionTypeDto != null) {
            tfx.o(tfxVar, "connection_type", newsfeedGetBreakingNewsFeedConnectionTypeDto.j(), 0, 0, 12);
        }
        tfx tfxVar4 = tfxVar;
        tfx.o(tfxVar4, "connection_subtype", a, 0, 0, 12);
        if (str != null) {
            tfx.o(tfxVar4, "user_options", str, 0, 0, 12);
        }
        if (newsfeedGetBreakingNewsFeedIntentDto != null) {
            tfx.o(tfxVar4, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, newsfeedGetBreakingNewsFeedIntentDto.i(), 0, 0, 12);
        }
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
        if (str2 != null) {
            tfxVar2 = tfxVar4;
            tfx.o(tfxVar2, "track_code", str2, 0, 0, 12);
        } else {
            tfxVar2 = tfxVar4;
        }
        if (l != null) {
            tfx.m(tfxVar2, CommonUrlParts.REQUEST_ID, l.longValue(), 0L, 12);
        }
        if (str10 != null) {
            tfx.o(tfxVar2, "geo_data", str10, 0, 0, 12);
        }
        tfx tfxVar5 = tfxVar2;
        tfxVar5.j("extended", z);
        return rsg0.y0(yfb.z(tfxVar5, rfxVar), null, null, i).U(new oe40(new oqu(16), 2));
    }

    @Override // xsna.fvp
    public EventNames b() {
        return EventNames.AddToFavorites;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.fvp
    public com.vk.superapp.base.js.bridge.a c(Responses$ClientError responses$ClientError) {
        return new AddToFavorites$Error(null, responses$ClientError, 1, 0 == true ? 1 : 0);
    }

    public boolean n() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        boolean isKeyguardLocked = ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
        c63 c63Var = c63.a;
        return c63.f && !isKeyguardLocked;
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return zznn.zzJ();
    }
}
