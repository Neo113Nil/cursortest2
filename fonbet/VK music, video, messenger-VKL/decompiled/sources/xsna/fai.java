package xsna;

import android.content.Context;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.Nullable;
import androidx.compose.runtime.a;
import com.google.android.gms.internal.measurement.zznn;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.groups.dto.GroupsChatDto;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.apps.BuildInfo;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupChat;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.log.L;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.NotImplementedError;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: ComposableInvoker.jvmAndAndroid.kt */
@ozl
/* loaded from: classes11.dex */
public final class fai implements q701, a5a, d000 {
    public static final byte[] b = {0, 0, 0, 1};
    public static final bbq c = new bbq();
    public static final /* synthetic */ fai d = new fai();

    public static final Integer A(x9y x9yVar, String str) {
        b9y q = x9yVar.q(str);
        if (q == null || (q instanceof u9y)) {
            return null;
        }
        return Integer.valueOf(q.f());
    }

    public static final Long B(x9y x9yVar, String str) {
        b9y q = x9yVar.q(str);
        if (q == null || (q instanceof u9y)) {
            return null;
        }
        return Long.valueOf(q.j());
    }

    public static final String C(x9y x9yVar, String str) {
        b9y q = x9yVar.q(str);
        if (q == null || (q instanceof u9y)) {
            return null;
        }
        return q.k();
    }

    public static final Object D(String str, gzs gzsVar, boolean z, float f, SemanticsConfiguration semanticsConfiguration, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        String str2;
        gzs gzsVar2;
        boolean z2;
        float f2;
        SemanticsConfiguration semanticsConfiguration2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(902161774, i, -1, "com.vk.core.compose.component.topbar.rememberButton (ButtonImpl.kt:80)");
        }
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (x == c0012a) {
            str2 = str;
            gzsVar2 = gzsVar;
            z2 = z;
            f2 = f;
            semanticsConfiguration2 = semanticsConfiguration;
            xp8 xp8Var = new xp8(str2, gzsVar2, z2, f2, semanticsConfiguration2);
            aVar.R(xp8Var);
            x = xp8Var;
        } else {
            str2 = str;
            gzsVar2 = gzsVar;
            z2 = z;
            f2 = f;
            semanticsConfiguration2 = semanticsConfiguration;
        }
        xp8 xp8Var2 = (xp8) x;
        Object x2 = aVar.x();
        if (x2 == c0012a) {
            x2 = izsVar.invoke(xp8Var2);
            aVar.R(x2);
        }
        ((zak0) xp8Var2.a).setValue(str2);
        ((zak0) xp8Var2.b).setValue(gzsVar2);
        ((zak0) xp8Var2.c).setValue(Boolean.valueOf(z2));
        ((zak0) xp8Var2.d).setValue(Float.valueOf(f2));
        ((zak0) xp8Var2.e).setValue(semanticsConfiguration2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return x2;
    }

    public static String E(MusicTrack musicTrack) {
        StringBuilder sb = new StringBuilder();
        String str = musicTrack.e;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(s490.c(musicTrack.u));
        return drm0.p0(sb.toString()).toString();
    }

    public static final ClipsPlaylist F(ClipsPlaylist clipsPlaylist) {
        return clipsPlaylist.e == 0 ? ClipsPlaylist.a(clipsPlaylist, 1) : clipsPlaylist;
    }

    public static final boolean G() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static CharSequence d(MusicTrack musicTrack) {
        ucp ucpVar = ucp.a;
        return ucp.i(k(musicTrack));
    }

    public static boolean e(@Nullable j1a0 j1a0Var, @Nullable j1a0 j1a0Var2) {
        if (j1a0Var == null && j1a0Var2 == null) {
            return true;
        }
        if (j1a0Var == null || j1a0Var2 == null) {
            return false;
        }
        String str = j1a0Var.d;
        String str2 = j1a0Var2.d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(j1a0Var.a), Objects.toString(j1a0Var2.a)) && Objects.equals(j1a0Var.c, j1a0Var2.c) && Boolean.valueOf(j1a0Var.e).equals(Boolean.valueOf(j1a0Var2.e)) && Boolean.valueOf(j1a0Var.f).equals(Boolean.valueOf(j1a0Var2.f)) : Objects.equals(str, str2);
    }

    public static final CharSequence g(Context context, MusicTrack musicTrack) {
        CharSequence d2 = d(musicTrack);
        String str = musicTrack.d;
        String E = E(musicTrack);
        if (d2 == null) {
            d2 = "";
        }
        if (str == null) {
            str = "";
        }
        if (E == null) {
            E = "";
        }
        int f = e3m.f(R.attr.vk_ui_text_tertiary, context);
        String str2 = ((Object) d2) + " - " + ((Object) str) + ' ' + ((Object) E);
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new ForegroundColorSpan(f), k73.a(d2.length(), 3, str), str2.length(), 33);
        return drm0.p0(spannableString);
    }

    public static s6s i(s6s s6sVar, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = s6sVar.a;
        }
        if ((i & 2) != 0) {
            z2 = s6sVar.b;
        }
        return (z == s6sVar.a && z2 == s6sVar.b) ? s6sVar : new s6s(z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static Method j(Method[] methodArr, String str, Class... clsArr) {
        Method method;
        int length = methodArr.length;
        boolean z = false;
        int i = 0;
        loop0: while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = methodArr[i];
            if (str.equals(method.getName()) || brm0.B(method.getName(), str.concat("-"), z)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                if (parameterTypes.length == clsArr2.length) {
                    ArrayList arrayList = new ArrayList(parameterTypes.length);
                    int length2 = parameterTypes.length;
                    boolean z2 = z;
                    ?? r12 = z2;
                    for (?? r11 = z2; r11 < length2; r11++) {
                        Class<?> cls = parameterTypes[r11];
                        int i2 = r12 + 1;
                        Class<?> cls2 = clsArr2[r12];
                        arrayList.add(Boolean.valueOf(fpf0.a(cls).equals(fpf0.a(cls2)) || cls.isAssignableFrom(cls2)));
                        r12 = i2;
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                continue;
            }
            i++;
            z = false;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str.concat(" not found"));
    }

    public static String k(MusicTrack musicTrack) {
        String str;
        StringBuilder sb = new StringBuilder();
        List<Artist> list = musicTrack.t;
        if (list != null) {
            str = s490.i(list);
        } else {
            str = musicTrack.h;
            if (str == null) {
                str = "";
            }
        }
        sb.append(str);
        sb.append(' ');
        sb.append(s490.c(musicTrack.u));
        return drm0.p0(sb.toString()).toString();
    }

    public static ByteBuffer l(ByteBuffer byteBuffer, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        int i2 = -858993460;
        boolean z = false;
        while (byteBuffer.remaining() > 0) {
            byte b2 = byteBuffer.get();
            i2 = (i2 << 8) | (b2 & 255);
            if (i2 == 1) {
                if (z) {
                    allocate.position(allocate.position() - 3);
                }
                byte b3 = byteBuffer.get();
                boolean z2 = i == -1 || (b3 & 31) == i;
                if (z2) {
                    allocate.putInt(1);
                    allocate.put(b3);
                }
                z = z2;
            } else if (z) {
                allocate.put(b2);
            }
        }
        allocate.limit(allocate.position());
        allocate.rewind();
        ByteBuffer allocate2 = ByteBuffer.allocate(allocate.remaining());
        allocate2.put(allocate.array(), 0, allocate.remaining());
        allocate2.rewind();
        return allocate2;
    }

    public static final boolean m(x9y x9yVar, String str) {
        return x9yVar.q(str).d();
    }

    public static final float n(x9y x9yVar) {
        return x9yVar.q("ecpm").e();
    }

    public static int o(String str) {
        switch (str.hashCode()) {
            case -1927473725:
                return !str.equals("services_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_services_24_white;
            case -1874226516:
                return !str.equals("followers_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_followers_24_white;
            case -1846472030:
                return !str.equals("write_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_write_24_white;
            case -1690723974:
                return !str.equals("message_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : BuildInfo.t() ? R.drawable.vk_icon_logo_vk_me_rounded_monochrome_24 : BuildInfo.g() ? R.drawable.vk_icon_logo_vk_calls_monochrome_24 : R.drawable.vk_icon_message_24_white;
            case -1028420562:
                return !str.equals("vkpay_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_money_circle_24_white;
            case -849461013:
                return !str.equals("fire_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_fire_24_white;
            case -690647881:
                return !str.equals("mention_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_mention_24_white;
            case -683745156:
                return !str.equals("message_vkme_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_logo_vk_me_rounded_monochrome_24;
            case -680564332:
                return !str.equals("user_add_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_user_add_24_white;
            case -555951779:
                return !str.equals("podcast_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_podcast_24_white;
            case -377718055:
                return !str.equals("smile_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_smile_outline_24_white;
            case -352407378:
                return !str.equals("repost_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_repost_24_white;
            case -341993060:
                return !str.equals("camera_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_camera_24_white;
            case -265568295:
                return !str.equals("users_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_users_24_white;
            case -195608145:
                return !str.equals("game_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_game_24_white;
            case -147134666:
                return !str.equals("user_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_user_24_white;
            case -25590249:
                return !str.equals("money_transfer_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_money_transfer_24_white;
            case 27407281:
                return !str.equals("gift_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_gift_24_white;
            case 174129130:
                return !str.equals("like_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_like_24_white;
            case 660968310:
                str.equals("stat_notify_logo");
                return R.drawable.vk_icon_new_logo_vk_white_24;
            case 899148834:
                return !str.equals("comment_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_comment_24_white;
            case 918695134:
                return !str.equals("clips_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_logo_clips_outline_24;
            case 1151385734:
                return !str.equals("video_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_logo_vk_video_24;
            case 1218450980:
                return !str.equals("message_calls_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_logo_vk_calls_monochrome_24;
            case 1336814111:
                return !str.equals("missed_call_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_phone_arrow_down_left_24_white;
            case 1483288813:
                return !str.equals("videocam_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_videocam_24_white;
            case 1717752268:
                return !str.equals("story_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_story_24_white;
            case 1838579743:
                return !str.equals("done_24") ? R.drawable.vk_icon_new_logo_vk_white_24 : R.drawable.vk_icon_done_24_white;
            default:
                return R.drawable.vk_icon_new_logo_vk_white_24;
        }
    }

    public static final int p(x9y x9yVar, String str) {
        return x9yVar.q(str).f();
    }

    public static final long q(x9y x9yVar, String str) {
        return x9yVar.q(str).j();
    }

    public static int r(@Nullable j1a0 j1a0Var) {
        if (j1a0Var == null) {
            return 0;
        }
        String str = j1a0Var.d;
        return str != null ? str.hashCode() : Objects.hash(j1a0Var.a, j1a0Var.c, Boolean.valueOf(j1a0Var.e), Boolean.valueOf(j1a0Var.f));
    }

    public static final String s(x9y x9yVar, String str) {
        return x9yVar.q(str).k();
    }

    public static final rvf t(nyt0 nyt0Var) {
        rvf rvfVar;
        kotlin.coroutines.d dVar;
        synchronized (c) {
            rvfVar = (rvf) nyt0Var.g("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (rvfVar == null) {
                try {
                    bdn bdnVar = bdn.a;
                    dVar = ie00.a.U();
                } catch (IllegalStateException unused) {
                    dVar = EmptyCoroutineContext.b;
                } catch (NotImplementedError unused2) {
                    dVar = EmptyCoroutineContext.b;
                }
                rvf rvfVar2 = new rvf(dVar.plus(whn0.a()));
                nyt0Var.e("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", rvfVar2);
                rvfVar = rvfVar2;
            }
        }
        return rvfVar;
    }

    public static void u(String str, String str2, androidx.compose.runtime.a aVar, Object... objArr) {
        Method method;
        Method method2;
        Class<?> cls = Class.forName(str);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        ArrayList arrayList = new ArrayList();
        int length = copyOf.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj = copyOf[i];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                int ceil = length2 == 0 ? 1 : (int) Math.ceil(length2 / 10.0d);
                Class cls3 = Integer.TYPE;
                k9x q = swe0.q(0, ceil);
                ArrayList arrayList2 = new ArrayList(c5g.u(q, 10));
                j9x it = q.iterator();
                while (it.d) {
                    it.nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                rmk0 rmk0Var = new rmk0(3);
                ArrayList<Object> arrayList3 = rmk0Var.a;
                rmk0Var.b(clsArr);
                rmk0Var.a(androidx.compose.runtime.a.class);
                rmk0Var.b(clsArr2);
                method = j(declaredMethods, str2, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused) {
                method = null;
            }
        } catch (ReflectiveOperationException unused2) {
            Method[] declaredMethods2 = cls.getDeclaredMethods();
            int length3 = declaredMethods2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length3) {
                    method2 = null;
                    break;
                }
                method2 = declaredMethods2[i2];
                if (epx.f(method2.getName(), str2)) {
                    break;
                }
                if (brm0.B(method2.getName(), str2 + '-', false)) {
                    break;
                } else {
                    i2++;
                }
            }
            method = method2;
        }
        if (method != null) {
            method.setAccessible(true);
            if (Modifier.isStatic(method.getModifiers())) {
                v(method, null, aVar, Arrays.copyOf(objArr, objArr.length));
                return;
            } else {
                v(method, cls.getConstructor(null).newInstance(null), aVar, Arrays.copyOf(objArr, objArr.length));
                return;
            }
        }
        throw new NoSuchMethodException("Composable " + str + JwtParser.SEPARATOR_CHAR + str2 + " not found");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cf, code lost:
    
        if (r8.equals("int") == false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void v(Method method, Object obj, androidx.compose.runtime.a aVar, Object... objArr) {
        Object obj2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (epx.f(parameterTypes[length], androidx.compose.runtime.a.class)) {
                    i = length;
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        int i3 = i + 1;
        int ceil = (i != 0 ? (int) Math.ceil(((obj != null ? 1 : 0) + i) / 10.0d) : 1) + i3;
        int length2 = method.getParameterTypes().length;
        if ((length2 != ceil ? (int) Math.ceil(i / 31.0d) : 0) + ceil != length2) {
            throw new IllegalStateException("params don't add up to total params");
        }
        Object[] objArr2 = new Object[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            if (i4 < 0 || i4 >= i) {
                if (i4 == i) {
                    obj2 = aVar;
                } else {
                    if (i3 > i4 || i4 >= ceil) {
                        if (ceil > i4 || i4 >= length2) {
                            throw new IllegalStateException("Unexpected index");
                        }
                        obj2 = 2097151;
                    }
                    obj2 = 0;
                }
            } else if (i4 < 0 || i4 >= objArr.length) {
                String name = method.getParameterTypes()[i4].getName();
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            obj2 = Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
                            break;
                        }
                        obj2 = null;
                        break;
                    case 104431:
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            obj2 = (byte) 0;
                            break;
                        }
                        obj2 = null;
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            obj2 = (char) 0;
                            break;
                        }
                        obj2 = null;
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            obj2 = 0L;
                            break;
                        }
                        obj2 = null;
                        break;
                    case 64711720:
                        if (name.equals("boolean")) {
                            obj2 = Boolean.FALSE;
                            break;
                        }
                        obj2 = null;
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            obj2 = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            break;
                        }
                        obj2 = null;
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            obj2 = (short) 0;
                            break;
                        }
                        obj2 = null;
                        break;
                    default:
                        obj2 = null;
                        break;
                }
            } else {
                obj2 = objArr[i4];
            }
            objArr2[i4] = obj2;
        }
        method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    public static VerifyInfo w(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo) {
        VerifyInfo q9;
        if (dialog != null && profilesSimpleInfo != null) {
            qtd0 Ab = profilesSimpleInfo.Ab(dialog.Sb());
            if (Ab != null && (q9 = Ab.q9()) != null) {
                return q9;
            }
            ChatSettings Hb = dialog.Hb();
            qtd0 zb = profilesSimpleInfo.zb(Hb != null ? Hb.d : null);
            VerifyInfo q92 = zb != null ? zb.q9() : null;
            if (dialog.rc()) {
                return q92;
            }
        }
        return null;
    }

    public static GroupChat x(GroupsChatDto groupsChatDto) {
        Integer d2 = groupsChatDto.d();
        int intValue = d2 != null ? d2.intValue() : 0;
        long intValue2 = groupsChatDto.f() != null ? r0.intValue() : 0L;
        Integer g = groupsChatDto.g();
        int intValue3 = g != null ? g.intValue() : 0;
        UserId q = groupsChatDto.q();
        long j = q != null ? q.b : 0L;
        UserId i = groupsChatDto.i();
        long j2 = i != null ? i.b : 0L;
        int id = groupsChatDto.getId();
        String title = groupsChatDto.getTitle();
        String str = title == null ? "" : title;
        String j3 = groupsChatDto.j();
        String str2 = j3 == null ? "" : j3;
        String e = groupsChatDto.e();
        return new GroupChat(id, str, str2, e == null ? "" : e, intValue, intValue2, 0L, intValue3, j, j2, epx.f(groupsChatDto.k(), Boolean.TRUE));
    }

    public static final Boolean y(x9y x9yVar, String str) {
        b9y q = x9yVar.q(str);
        if (q == null || (q instanceof u9y)) {
            return null;
        }
        return Boolean.valueOf(q.d());
    }

    public static final Float z(x9y x9yVar, String str) {
        b9y q = x9yVar.q(str);
        if (q == null || (q instanceof u9y)) {
            return null;
        }
        return Float.valueOf(q.e());
    }

    @Override // xsna.d000
    public void b(gzs gzsVar) {
        L.c("IM_ITEMS_LOADER", gzsVar);
    }

    @Override // xsna.a5a
    public boolean c() {
        com.vk.core.utils.newtork.b.a.getClass();
        if (com.vk.core.utils.newtork.b.d()) {
            return false;
        }
        new IOException();
        return true;
    }

    public tfx f(UserId userId, Integer num, Integer num2) {
        tfx tfxVar = new tfx("articles.getOwnerPublished", new br(5), new cr(3));
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 8);
        tfxVar.f(num2.intValue(), 1, 50, "count");
        return tfxVar;
    }

    @Override // xsna.d000
    public void h(atm atmVar) {
        L.h("IM_ITEMS_LOADER", atmVar);
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Integer.valueOf((int) zznn.zzF());
    }

    @Override // xsna.a5a
    public void a() {
    }
}
