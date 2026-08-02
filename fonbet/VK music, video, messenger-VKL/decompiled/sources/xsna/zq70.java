package xsna;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zzpm;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.attaches.AttachDisplayConfig;
import com.vk.dto.attaches.AttachmentsArrangementConfig;
import com.vk.dto.attaches.CarouselRatio;
import com.vk.dto.common.Direction;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.messages.Msg;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.MediaOwner;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.Publisher;
import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vkontakte.android.R;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.gy2;

/* compiled from: ObservableScopeInvalidator.kt */
@vby
/* loaded from: classes11.dex */
public final class zq70 implements bbg0, q701, qge0, gn60 {
    public static final float[] b = new float[91];
    public static final jai c = new jai(1847917110, new uki(0), false);
    public static final zq70 d = new zq70();
    public static final zq70 e = new zq70();
    public static final /* synthetic */ zq70 f = new zq70();

    public static final void A(wh50 wh50Var) {
        wh50Var.setValue(s3q0.a);
    }

    public static final boolean B(Throwable th) {
        Boolean bool;
        boolean z;
        if (th instanceof VKApiExecutionException) {
            List<VKApiExecutionException> v = ((VKApiExecutionException) th).v();
            if (v != null) {
                List<VKApiExecutionException> list = v;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (VKApiExecutionException vKApiExecutionException : list) {
                        j03.a.getClass();
                        if (j03.a(17101, vKApiExecutionException)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                bool = Boolean.valueOf(z);
            } else {
                bool = null;
            }
            if (epx.f(bool, Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    public static boolean C(@NonNull String str) {
        gy2.b bVar = oix0.a;
        Set<ywi> unmodifiableSet = Collections.unmodifiableSet(gy2.c);
        HashSet hashSet = new HashSet();
        for (ywi ywiVar : unmodifiableSet) {
            if (ywiVar.a().equals(str)) {
                hashSet.add(ywiVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((ywi) it.next()).isSupported()) {
                return true;
            }
        }
        return false;
    }

    public static final io.reactivex.rxjava3.internal.operators.single.t D(doa0 doa0Var, long j) {
        return new io.reactivex.rxjava3.internal.operators.single.t(doa0Var.c().f(j, TimeUnit.MILLISECONDS), new tp1(new eoa0(j), 23));
    }

    public static final void E(VkImage vkImage, double d2, float f2, int i) {
        kci.o(vkImage, new gnk0(d2, f2, i));
    }

    public static final void G(View view) {
        iut0.q(view, new ryu());
        hut0 hut0Var = new hut0();
        Boolean bool = Boolean.TRUE;
        hut0Var.d(view, bool);
        new eut0().d(view, bool);
        view.setImportantForAccessibility(1);
    }

    public static xy2 I(zq70 zq70Var, Integer num, String str, int i) {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        Boolean bool3 = (i & 4) != 0 ? null : bool;
        Boolean bool4 = (i & 8) != 0 ? null : bool;
        Integer num2 = (i & 64) != 0 ? null : num;
        String str2 = (i & 128) != 0 ? null : str;
        if ((i & 256) != 0) {
            bool2 = null;
        }
        if ((i & 512) != 0) {
            bool = null;
        }
        zq70Var.getClass();
        tfx tfxVar = new tfx("store.getStickersKeywords", new hub0(6), new zy60(11));
        if (bool3 != null) {
            tfxVar.j("aliases", bool3.booleanValue());
        }
        if (bool4 != null) {
            tfxVar.j("all_products", bool4.booleanValue());
        }
        if (num2 != null) {
            tfx.l(tfxVar, "chunk", num2.intValue(), 0, 0, 8);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "chunks_hash", str2, 0, 100, 4);
        }
        if (bool2 != null) {
            tfxVar.j("need_stickers", bool2.booleanValue());
        }
        if (bool != null) {
            tfxVar.j("vmoji_promo", bool.booleanValue());
        }
        return tfxVar;
    }

    public static float a(float f2) {
        return f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float b(float f2) {
        return f2 <= 0.0031308f ? f2 * 12.92f : (float) ((Math.pow(f2, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final max0 d() {
        return new max0();
    }

    public static final Object[] e(Object obj, Object obj2, Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length + 2];
        jw5.k(objArr, 0, objArr2, i, 6);
        jw5.h(objArr, i + 2, objArr2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] f(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        jw5.k(objArr, 0, objArr2, i, 6);
        jw5.h(objArr, i, objArr2, i + 2, objArr.length);
        return objArr2;
    }

    public static List h() {
        return e43.l("full", "compact");
    }

    public static PostingContext j(PostingContext postingContext, PostingSettings postingSettings) {
        boolean z = postingSettings.f;
        PostingContext a = (postingContext.e == null && z) ? PostingContext.a(postingContext, null, false, new Publisher(postingContext.b.b, "", ""), null, null, 32759) : postingContext;
        PostingContext a2 = PostingContext.a(a, null, false, null, null, new MediaOwner(z ? a.b.b : UserId.d), 32735);
        if (!fkq0.b(a2.b.b)) {
            z = a2.c;
        }
        return PostingContext.a(a2, null, z, null, null, null, 32763);
    }

    public static String l(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                sb.append(ImageSizeKey.SIZE_KEY_UNDEFINED);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0105, code lost:
    
        if ((r17[r6] & 192) == 128) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m(int i, byte[] bArr) {
        byte b2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 1;
        int i10 = (i & 1) != 0 ? 0 : 1;
        int length = bArr.length;
        if (i10 < 0 || length > bArr.length || i10 > length) {
            StringBuilder sb = new StringBuilder("size=");
            cgn.a(bArr.length, i10, " beginIndex=", " endIndex=", sb);
            sb.append(length);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        char[] cArr = new char[length - i10];
        int i11 = 0;
        while (i10 < length) {
            byte b3 = bArr[i10];
            if (b3 >= 0) {
                int i12 = i11 + 1;
                cArr[i11] = (char) b3;
                i10++;
                while (true) {
                    i11 = i12;
                    if (i10 < length && (b2 = bArr[i10]) >= 0) {
                        i10++;
                        i12 = i11 + 1;
                        cArr[i11] = (char) b2;
                    }
                }
            } else if ((b3 >> 5) == -2) {
                int i13 = i10 + 1;
                if (length <= i13) {
                    i2 = i11 + 1;
                    cArr[i11] = (char) 65533;
                } else {
                    byte b4 = bArr[i13];
                    if ((b4 & 192) == 128) {
                        int i14 = (b3 << 6) ^ (b4 ^ 3968);
                        if (i14 < 128) {
                            i3 = i11 + 1;
                            cArr[i11] = (char) 65533;
                        } else {
                            i3 = i11 + 1;
                            cArr[i11] = (char) i14;
                        }
                        s3q0 s3q0Var = s3q0.a;
                        i11 = i3;
                        i4 = 2;
                        i10 += i4;
                    } else {
                        i2 = i11 + 1;
                        cArr[i11] = (char) 65533;
                    }
                }
                s3q0 s3q0Var2 = s3q0.a;
                i4 = i9;
                i11 = i2;
                i10 += i4;
            } else if ((b3 >> 4) == -2) {
                int i15 = i10 + 2;
                if (length <= i15) {
                    int i16 = i11 + 1;
                    cArr[i11] = (char) 65533;
                    s3q0 s3q0Var3 = s3q0.a;
                    int i17 = i10 + 1;
                    if (length <= i17 || (bArr[i17] & 192) != 128) {
                        i7 = i9;
                        i11 = i16;
                        i10 += i7;
                        i9 = 1;
                    } else {
                        i11 = i16;
                    }
                } else {
                    byte b5 = bArr[i10 + 1];
                    if ((b5 & 192) == 128) {
                        byte b6 = bArr[i15];
                        if ((b6 & 192) == 128) {
                            int i18 = ((b6 ^ (-123008)) ^ (b5 << 6)) ^ (b3 << AmfConstants.TYPE_LONG_STRING_MARKER);
                            if (i18 < 2048) {
                                i8 = i11 + 1;
                                cArr[i11] = (char) 65533;
                            } else if (55296 > i18 || i18 >= 57344) {
                                i8 = i11 + 1;
                                cArr[i11] = (char) i18;
                            } else {
                                i8 = i11 + 1;
                                cArr[i11] = (char) 65533;
                            }
                            s3q0 s3q0Var4 = s3q0.a;
                            i11 = i8;
                            i7 = 3;
                            i10 += i7;
                            i9 = 1;
                        } else {
                            cArr[i11] = (char) 65533;
                            s3q0 s3q0Var5 = s3q0.a;
                            i11++;
                        }
                    } else {
                        cArr[i11] = (char) 65533;
                        s3q0 s3q0Var6 = s3q0.a;
                        i11++;
                        i7 = 1;
                        i10 += i7;
                        i9 = 1;
                    }
                }
                i7 = 2;
                i10 += i7;
                i9 = 1;
            } else if ((b3 >> 3) == -2) {
                int i19 = i10 + 3;
                if (length <= i19) {
                    i5 = i11 + 1;
                    cArr[i11] = 65533;
                    s3q0 s3q0Var7 = s3q0.a;
                    int i20 = i10 + 1;
                    if (length > i20 && (bArr[i20] & 192) == 128) {
                        int i21 = i10 + 2;
                        if (length > i21) {
                        }
                        i11 = i5;
                        i7 = 2;
                    }
                    i11 = i5;
                    i7 = 1;
                } else {
                    byte b7 = bArr[i10 + 1];
                    if ((b7 & 192) == 128) {
                        byte b8 = bArr[i10 + 2];
                        if ((b8 & 192) == 128) {
                            byte b9 = bArr[i19];
                            if ((b9 & 192) == 128) {
                                int i22 = (((b9 ^ 3678080) ^ (b8 << 6)) ^ (b7 << AmfConstants.TYPE_LONG_STRING_MARKER)) ^ (b3 << 18);
                                if (i22 > 1114111) {
                                    i6 = i11 + 1;
                                    cArr[i11] = 65533;
                                } else if (55296 <= i22 && i22 < 57344) {
                                    i6 = i11 + 1;
                                    cArr[i11] = 65533;
                                } else if (i22 < 65536) {
                                    i6 = i11 + 1;
                                    cArr[i11] = 65533;
                                } else if (i22 != 65533) {
                                    cArr[i11] = (char) ((i22 >>> 10) + 55232);
                                    cArr[i11 + 1] = (char) ((i22 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + 56320);
                                    i6 = i11 + 2;
                                } else {
                                    i6 = i11 + 1;
                                    cArr[i11] = 65533;
                                }
                                s3q0 s3q0Var8 = s3q0.a;
                                i7 = 4;
                                i11 = i6;
                            } else {
                                i5 = i11 + 1;
                                cArr[i11] = 65533;
                                s3q0 s3q0Var9 = s3q0.a;
                                i11 = i5;
                                i7 = 3;
                            }
                        } else {
                            i5 = i11 + 1;
                            cArr[i11] = 65533;
                            s3q0 s3q0Var10 = s3q0.a;
                            i11 = i5;
                            i7 = 2;
                        }
                    } else {
                        i5 = i11 + 1;
                        cArr[i11] = 65533;
                        s3q0 s3q0Var11 = s3q0.a;
                        i11 = i5;
                        i7 = 1;
                    }
                }
                i10 += i7;
                i9 = 1;
            } else {
                cArr[i11] = 65533;
                i10++;
                i11++;
                i9 = 1;
            }
        }
        return brm0.q(cArr, 0, i11);
    }

    public static wh50 n() {
        return androidx.compose.runtime.k.a(s3q0.a, w65.e);
    }

    public static final x8v o(gj30 gj30Var) {
        if (!gj30Var.m()) {
            return null;
        }
        int size = gj30Var.k().size();
        int i = size - 1;
        int i2 = i;
        while (true) {
            if (-1 >= i2) {
                i2 = -1;
                break;
            }
            if (gj30Var.n(Integer.valueOf(gj30Var.k().get(i2).b))) {
                break;
            }
            i2--;
        }
        if (i2 < 0) {
            return null;
        }
        if (i2 != i) {
            int i3 = i2 + 1;
            return new x8v(gj30Var.k().get(i3).p, Direction.BEFORE, size, gj30Var.k().get(i3).b);
        }
        if (gj30Var.e) {
            return new x8v(gj30Var.k().get(i2).p, Direction.BEFORE, size, gj30Var.k().get(i2).b);
        }
        return new x8v(gkx0.e, Direction.BEFORE, size, Integer.MAX_VALUE);
    }

    public static int p(float f2, int i, int i2) {
        if (i == i2 || f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return i;
        }
        if (f2 >= 1.0f) {
            return i2;
        }
        float f3 = ((i >> 24) & 255) / 255.0f;
        float f4 = ((i2 >> 24) & 255) / 255.0f;
        float a = a(((i >> 16) & 255) / 255.0f);
        float a2 = a(((i >> 8) & 255) / 255.0f);
        float a3 = a((i & 255) / 255.0f);
        float a4 = a(((i2 >> 16) & 255) / 255.0f);
        float a5 = a(((i2 >> 8) & 255) / 255.0f);
        float a6 = a((i2 & 255) / 255.0f);
        float b2 = u11.b(f4, f3, f2, f3);
        float b3 = u11.b(a4, a, f2, a);
        float b4 = u11.b(a5, a2, f2, a2);
        float b5 = u11.b(a6, a3, f2, a3);
        float b6 = b(b3) * 255.0f;
        float b7 = b(b4) * 255.0f;
        return Math.round(b(b5) * 255.0f) | (Math.round(b6) << 16) | (Math.round(b2 * 255.0f) << 24) | (Math.round(b7) << 8);
    }

    public static final gkx0 q(gj30 gj30Var) {
        gkx0 gkx0Var;
        if (gj30Var.c && !gj30Var.k().isEmpty()) {
            Iterator<T> it = gj30Var.k().iterator();
            if (it.hasNext()) {
                gkx0 gkx0Var2 = ((Msg) it.next()).p;
                while (it.hasNext()) {
                    gkx0 gkx0Var3 = ((Msg) it.next()).p;
                    gkx0Var2.getClass();
                    if (gkx0Var2.compareTo(gkx0Var3) > 0) {
                        gkx0Var2 = gkx0Var3;
                    }
                }
                gkx0Var = gkx0Var2;
            } else {
                gkx0Var = null;
            }
            if (gkx0Var != null) {
                return gkx0Var;
            }
        }
        return gkx0.d;
    }

    public static final gkx0 r(gj30 gj30Var) {
        gkx0 gkx0Var;
        if (gj30Var.e && !gj30Var.k().isEmpty()) {
            Iterator<T> it = gj30Var.k().iterator();
            if (it.hasNext()) {
                gkx0 gkx0Var2 = ((Msg) it.next()).p;
                while (it.hasNext()) {
                    gkx0 gkx0Var3 = ((Msg) it.next()).p;
                    gkx0Var2.getClass();
                    if (gkx0Var2.compareTo(gkx0Var3) < 0) {
                        gkx0Var2 = gkx0Var3;
                    }
                }
                gkx0Var = gkx0Var2;
            } else {
                gkx0Var = null;
            }
            if (gkx0Var != null) {
                return gkx0Var;
            }
        }
        return gkx0.e;
    }

    public static final dcy s(SerialDescriptor serialDescriptor) {
        if (serialDescriptor instanceof bnj) {
            return ((bnj) serialDescriptor).b;
        }
        if (serialDescriptor instanceof yli0) {
            return s(((yli0) serialDescriptor).a);
        }
        return null;
    }

    public static final b1s t(yj50 yj50Var, String str, a1w a1wVar) {
        return (b1s) yj50Var.e(b1s.class, str, new fgm(a1wVar, 9));
    }

    public static final long u(KeyEvent keyEvent) {
        return x1o0.b(keyEvent.getKeyCode());
    }

    public static Pair v(boolean z, boolean z2) {
        Integer valueOf = Integer.valueOf(R.string.profile_subscribe);
        return (z && z2) ? new Pair(Integer.valueOf(R.string.post_header_make_friend), Integer.valueOf(R.string.profile_accessibility_send_friend_request)) : (z || !z2) ? z ? new Pair(valueOf, valueOf) : new Pair(Integer.valueOf(R.string.community_status_button_public_subscribed), Integer.valueOf(R.string.accessibility_subscribed)) : new Pair(Integer.valueOf(R.string.post_header_remove_friend_request), Integer.valueOf(R.string.accessibility_cancel_friend_request));
    }

    public static final int w(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static byte[] y(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            String upperCase = str.toUpperCase(Locale.ENGLISH);
            int length = upperCase.length() / 2;
            byte[] bArr = new byte[length];
            try {
                byte[] bytes = upperCase.getBytes(C.UTF8_NAME);
                for (int i = 0; i < length; i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("0x");
                    int i2 = i * 2;
                    sb.append(new String(new byte[]{bytes[i2]}, C.UTF8_NAME));
                    bArr[i] = (byte) (((byte) (Byte.decode(sb.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i2 + 1]}, C.UTF8_NAME)).byteValue());
                }
                return bArr;
            } catch (UnsupportedEncodingException | NumberFormatException e2) {
                c2f0.b("HexUtil", "hex string 2 byte array exception : " + e2.getMessage());
                return new byte[0];
            }
        } catch (Throwable th) {
            c2f0.b("HexUtil", "hex string toUpperCase exception : " + th.getMessage());
            return new byte[0];
        }
    }

    public static final int z(int i, int i2) {
        return (i >> i2) & 31;
    }

    public tfx H(String str, List list) {
        tfx tfxVar = new tfx("store.getStickers", new oyh0(3), new iub0(3));
        tfxVar.i("sticker_ids", list);
        if (str != null) {
            tfx.o(tfxVar, "vmoji_character_id", str, 0, 0, 12);
        }
        return tfxVar;
    }

    public tfx J(Integer num, String str, String str2) {
        tfx tfxVar = new tfx("store.hasNewItems", new wcl0(1), new gub0(3));
        tfx.o(tfxVar, "type", "stickers", 0, 0, 12);
        tfx.o(tfxVar, "merchant", AndroidStaticDeviceInfoDataSource.STORE_GOOGLE, 0, 0, 12);
        if (str != null) {
            tfx.o(tfxVar, "version_hash", str, 0, 0, 12);
        }
        if (num != null) {
            tfx.l(tfxVar, "version", num.intValue(), 0, 0, 8);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "keyboard_recommendation_hash", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    public tfx K(Integer num) {
        tfx tfxVar = new tfx("store.markStickerPackAsViewed", new sf3(25), new s11(28));
        tfx.l(tfxVar, "pack_id", num.intValue(), 0, 0, 8);
        return tfxVar;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public java.util.List L(int r32, kotlin.Pair r33, xsna.wm60 r34) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.zq70.L(int, kotlin.Pair, xsna.wm60):java.util.List");
    }

    public AttachmentsArrangementConfig k() {
        List<Pair> singletonList = Collections.singletonList(new Pair("photo", Collections.singletonList("full")));
        ArrayList arrayList = new ArrayList(c5g.u(singletonList, 10));
        for (Pair pair : singletonList) {
            arrayList.add(new AttachDisplayConfig((String) pair.i(), (List) pair.j()));
        }
        List singletonList2 = Collections.singletonList(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : e43.l("video", "album", "photo", "market_album", "document_image")) {
            linkedHashMap.put(str, new AttachDisplayConfig(str, Collections.singletonList("full")));
        }
        Iterable<Pair> iterable = (Iterable) new com.vk.movika.sdk.base.logic.interactor.m(this).invoke();
        ArrayList arrayList2 = new ArrayList(c5g.u(iterable, 10));
        for (Pair pair2 : iterable) {
            arrayList2.add(new AttachDisplayConfig((String) pair2.i(), (List) pair2.j()));
        }
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        return new AttachmentsArrangementConfig(-1L, singletonList2, linkedHashMap, arrayList2, new CarouselRatio(f2, f2, 3, null));
    }

    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return L(0, pair, bp5Var);
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zzpm.zzc());
    }

    @Override // xsna.qge0
    public void g() {
    }

    @Override // xsna.bbg0
    @Nullable
    public hag0 c(@NonNull hag0 hag0Var, @NonNull au80 au80Var) {
        return hag0Var;
    }

    @Override // xsna.qge0
    public void i(int i, int i2) {
    }
}
