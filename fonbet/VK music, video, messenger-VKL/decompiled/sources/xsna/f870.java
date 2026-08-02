package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.android.gms.internal.measurement.zznn;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.widget.LifecycleHandler;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupLikes;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.music.ui.common.formatting.Duration;
import com.vkontakte.android.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.RandomAccess;
import java.util.UUID;
import org.chromium.base.TimeUtils;
import org.chromium.net.NetError;
import org.json.JSONObject;

/* compiled from: NotificationButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class f870 implements q701, ahf {
    public static final jai c = new jai(558638247, new rce(2), false);
    public static final /* synthetic */ f870 d = new f870(3);
    public static final /* synthetic */ f870 e = new f870(4);
    public static int f = -1;
    public static String g = "";
    public final /* synthetic */ int b;

    public /* synthetic */ f870(int i) {
        this.b = i;
    }

    public static final zm20 A() {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-983124432, 0, -1, "com.vk.core.compose.component.defaults.<get-VkAvatarDefault> (VkAvatarDefault.kt:20)");
        }
        zm20 zm20Var = zm20.d;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return zm20Var;
    }

    public static final String B(Collection collection, String str, izs izsVar) {
        Object invoke;
        if (collection.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.setLength(0);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (izsVar != null && (invoke = izsVar.invoke(next)) != null) {
                next = invoke;
            }
            if (next instanceof Integer) {
                sb.append(((Number) next).intValue());
            } else if (next instanceof Long) {
                sb.append(((Number) next).longValue());
            } else {
                sb.append(next);
            }
            sb.append(str);
        }
        sb.setLength(sb.length() - str.length());
        return sb.toString();
    }

    public static final long D(long j, long j2, float f2) {
        fz70 fz70Var = h8g.x;
        long b = l5g.b(j, fz70Var);
        long b2 = l5g.b(j2, fz70Var);
        float e2 = l5g.e(b);
        float i = l5g.i(b);
        float h = l5g.h(b);
        float f3 = l5g.f(b);
        float e3 = l5g.e(b2);
        float i2 = l5g.i(b2);
        float h2 = l5g.h(b2);
        float f4 = l5g.f(b2);
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return l5g.b(f(q6x.z(i, i2, f2), q6x.z(h, h2, f2), q6x.z(f3, f4, f2), q6x.z(e2, e3, f2), fz70Var), l5g.g(j2));
    }

    public static final float E(long j) {
        d8g g2 = l5g.g(j);
        if (!x6g.a(g2.b, x6g.a)) {
            tzw.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) x6g.b(g2.b)));
        }
        tp1 tp1Var = ((njg0) g2).p;
        double b = tp1Var.b(l5g.i(j));
        float b2 = (float) ((tp1Var.b(l5g.f(j)) * 0.0722d) + (tp1Var.b(l5g.h(j)) * 0.7152d) + (b * 0.2126d));
        if (b2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            b2 = 0.0f;
        }
        if (b2 > 1.0f) {
            return 1.0f;
        }
        return b2;
    }

    public static final ArrayList F(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((thx) it.next()).a));
        }
        return arrayList;
    }

    public static final v4z G(LifecycleHandler lifecycleHandler, String str) {
        return new v4z(lifecycleHandler, str);
    }

    public static final int H(long j) {
        float[] fArr = h8g.a;
        return (int) (l5g.b(j, h8g.e) >>> 32);
    }

    public static final kl30 I(Dialog dialog) {
        if (dialog == null) {
            return new kl30(0);
        }
        List<Integer> mc = dialog.mc();
        boolean T8 = dialog.T8();
        List<Integer> lc = dialog.lc();
        int Jb = dialog.Jb();
        int fc = dialog.fc();
        int gc = dialog.gc();
        Peer Zb = dialog.Zb();
        boolean Jc = dialog.Jc();
        ChatSettings Hb = dialog.Hb();
        boolean z = Hb != null ? Hb.v : false;
        ChatSettings Hb2 = dialog.Hb();
        boolean z2 = Hb2 != null ? Hb2.m : false;
        ChatSettings Hb3 = dialog.Hb();
        boolean z3 = Hb3 != null ? Hb3.G : false;
        JSONObject Yb = dialog.Yb();
        ChatSettings Hb4 = dialog.Hb();
        return new kl30(mc, T8, lc, Jb, fc, gc, Zb, Jc, z, z2, z3, Yb, Hb4 != null ? Hb4.N : true);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long b(float f2, float f3, float f4, float f5, d8g d8gVar) {
        int i;
        int i2;
        int i3;
        float c2;
        float b;
        int i4;
        int i5;
        int i6;
        int i7;
        float c3;
        float b2;
        int i8;
        int i9;
        int i10;
        boolean d2 = d8gVar.d();
        float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (d2) {
            float f7 = f5 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : f5;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i11 = ((int) ((f7 * 255.0f) + 0.5f)) << 24;
            float f8 = f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i12 = i11 | (((int) ((f8 * 255.0f) + 0.5f)) << 16);
            float f9 = f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : f3;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            int i13 = i12 | (((int) ((f9 * 255.0f) + 0.5f)) << 8);
            if (f4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f6 = f4;
            }
            long j = (i13 | ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 255.0f) + 0.5f))) << 32;
            int i14 = l5g.l;
            return j;
        }
        long j2 = d8gVar.b;
        int i15 = x6g.e;
        if (((int) (j2 >> 32)) != 3) {
            tzw.a("Color only works with ColorSpaces with 3 components");
        }
        int i16 = d8gVar.c;
        if (i16 == -1) {
            tzw.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float c4 = d8gVar.c(0);
        float b3 = d8gVar.b(0);
        if (f2 >= c4) {
            c4 = f2;
        }
        if (c4 <= b3) {
            b3 = c4;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(b3);
        int i17 = floatToRawIntBits >>> 31;
        int i18 = (floatToRawIntBits >>> 23) & 255;
        int i19 = floatToRawIntBits & 8388607;
        if (i18 == 255) {
            i2 = i19 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i18 + NetError.ERR_NO_SSL_VERSIONS_ENABLED;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else if (i > 0) {
                int i20 = i19 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i20) + 1) | (i17 << 15);
                    short s = (short) i3;
                    c2 = d8gVar.c(1);
                    b = d8gVar.b(1);
                    if (f3 >= c2) {
                        c2 = f3;
                    }
                    if (c2 <= b) {
                        b = c2;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(b);
                    int i21 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & 255;
                    int i22 = floatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i22 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 + NetError.ERR_NO_SSL_VERSIONS_ENABLED;
                        if (i5 >= 31) {
                            i6 = 0;
                            i5 = 49;
                        } else if (i5 > 0) {
                            int i23 = i22 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i23) + 1) | (i21 << 15);
                                short s2 = (short) i7;
                                c3 = d8gVar.c(2);
                                b2 = d8gVar.b(2);
                                if (f4 >= c3) {
                                    c3 = f4;
                                }
                                if (c3 <= b2) {
                                    b2 = c3;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(b2);
                                int i24 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & 255;
                                int i25 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    i9 = i25 != 0 ? 512 : 0;
                                    r7 = 31;
                                } else {
                                    int i26 = i8 + NetError.ERR_NO_SSL_VERSIONS_ENABLED;
                                    if (i26 >= 31) {
                                        i9 = 0;
                                        r7 = 49;
                                    } else if (i26 > 0) {
                                        int i27 = i25 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i10 = (((i26 << 10) | i27) + 1) | (i24 << 15);
                                            short s3 = (short) i10;
                                            if (f5 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                                f6 = f5;
                                            }
                                            long j3 = (i16 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & s3) << 16) | ((((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                            int i28 = l5g.l;
                                            return j3;
                                        }
                                        i9 = i27;
                                        r7 = i26;
                                    } else if (i26 >= -10) {
                                        int i29 = (i25 | 8388608) >> (1 - i26);
                                        if ((i29 & 4096) != 0) {
                                            i29 += 8192;
                                        }
                                        i9 = i29 >> 13;
                                    } else {
                                        i9 = 0;
                                    }
                                }
                                i10 = i9 | (i24 << 15) | (r7 << 10);
                                short s32 = (short) i10;
                                if (f5 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                }
                                long j32 = (i16 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & s32) << 16) | ((((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                int i282 = l5g.l;
                                return j32;
                            }
                            i6 = i23;
                        } else if (i5 >= -10) {
                            int i30 = (i22 | 8388608) >> (1 - i5);
                            if ((i30 & 4096) != 0) {
                                i30 += 8192;
                            }
                            i6 = i30 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i21 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    c3 = d8gVar.c(2);
                    b2 = d8gVar.b(2);
                    if (f4 >= c3) {
                    }
                    if (c3 <= b2) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(b2);
                    int i242 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & 255;
                    int i252 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i10 = i9 | (i242 << 15) | (r7 << 10);
                    short s322 = (short) i10;
                    if (f5 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    }
                    long j322 = (i16 & 63) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((65535 & s322) << 16) | ((((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                    int i2822 = l5g.l;
                    return j322;
                }
                i2 = i20;
            } else if (i >= -10) {
                int i31 = (i19 | 8388608) >> (1 - i);
                if ((i31 & 4096) != 0) {
                    i31 += 8192;
                }
                i2 = i31 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i17 << 15) | (i << 10);
        short s4 = (short) i3;
        c2 = d8gVar.c(1);
        b = d8gVar.b(1);
        if (f3 >= c2) {
        }
        if (c2 <= b) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(b);
        int i212 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & 255;
        int i222 = floatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i212 << 15) | (i5 << 10);
        short s222 = (short) i7;
        c3 = d8gVar.c(2);
        b2 = d8gVar.b(2);
        if (f4 >= c3) {
        }
        if (c3 <= b2) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(b2);
        int i2422 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & 255;
        int i2522 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i10 = i9 | (i2422 << 15) | (r7 << 10);
        short s3222 = (short) i10;
        if (f5 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
        long j3222 = (i16 & 63) | ((s4 & 65535) << 48) | ((s222 & 65535) << 32) | ((65535 & s3222) << 16) | ((((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
        int i28222 = l5g.l;
        return j3222;
    }

    public static final long c(int i) {
        long j = i << 32;
        int i2 = l5g.l;
        return j;
    }

    public static final long d(long j) {
        long j2 = j << 32;
        int i = l5g.l;
        return j2;
    }

    public static long e(int i, int i2, int i3) {
        return c(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long f(float f2, float f3, float f4, float f5, d8g d8gVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (d8gVar.d()) {
            long j = ((((((int) ((f5 * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16)) | (((int) ((f3 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f4) + 0.5f))) << 32;
            int i10 = l5g.l;
            return j;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(f2);
        int i11 = floatToRawIntBits >>> 31;
        int i12 = (floatToRawIntBits >>> 23) & 255;
        int i13 = floatToRawIntBits & 8388607;
        int i14 = 49;
        int i15 = 0;
        if (i12 == 255) {
            i2 = i13 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i12 + NetError.ERR_NO_SSL_VERSIONS_ENABLED;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else if (i > 0) {
                int i16 = i13 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i16) + 1) | (i11 << 15);
                    short s = (short) i3;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    int i17 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & 255;
                    int i18 = floatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i18 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 + NetError.ERR_NO_SSL_VERSIONS_ENABLED;
                        if (i5 >= 31) {
                            i5 = 49;
                            i6 = 0;
                        } else if (i5 > 0) {
                            int i19 = i18 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i19) + 1) | (i17 << 15);
                                short s2 = (short) i7;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(f4);
                                int i20 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & 255;
                                int i21 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    i15 = i21 == 0 ? 0 : 512;
                                    i14 = 31;
                                } else {
                                    int i22 = i8 + NetError.ERR_NO_SSL_VERSIONS_ENABLED;
                                    if (i22 < 31) {
                                        if (i22 > 0) {
                                            i15 = i21 >> 13;
                                            if ((floatToRawIntBits3 & 4096) != 0) {
                                                i9 = (((i22 << 10) | i15) + 1) | (i20 << 15);
                                                long max = ((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (d8gVar.c & 63);
                                                int i23 = l5g.l;
                                                return max;
                                            }
                                            i14 = i22;
                                        } else if (i22 >= -10) {
                                            int i24 = (i21 | 8388608) >> (1 - i22);
                                            if ((i24 & 4096) != 0) {
                                                i24 += 8192;
                                            }
                                            i14 = 0;
                                            i15 = i24 >> 13;
                                        } else {
                                            i14 = 0;
                                        }
                                    }
                                }
                                i9 = (i20 << 15) | (i14 << 10) | i15;
                                long max2 = ((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (d8gVar.c & 63);
                                int i232 = l5g.l;
                                return max2;
                            }
                            i6 = i19;
                        } else if (i5 >= -10) {
                            int i25 = (i18 | 8388608) >> (1 - i5);
                            if ((i25 & 4096) != 0) {
                                i25 += 8192;
                            }
                            i6 = i25 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i17 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(f4);
                    int i202 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & 255;
                    int i212 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i9 = (i202 << 15) | (i14 << 10) | i15;
                    long max22 = ((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((((int) ((Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (d8gVar.c & 63);
                    int i2322 = l5g.l;
                    return max22;
                }
                i2 = i16;
            } else if (i >= -10) {
                int i26 = (i13 | 8388608) >> (1 - i);
                if ((i26 & 4096) != 0) {
                    i26 += 8192;
                }
                i2 = i26 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i11 << 15) | (i << 10);
        short s3 = (short) i3;
        int floatToRawIntBits22 = Float.floatToRawIntBits(f3);
        int i172 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & 255;
        int i182 = floatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i172 << 15) | (i5 << 10);
        short s222 = (short) i7;
        int floatToRawIntBits322 = Float.floatToRawIntBits(f4);
        int i2022 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & 255;
        int i2122 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i9 = (i2022 << 15) | (i14 << 10) | i15;
        long max222 = ((((short) i9) & 65535) << 16) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((((int) ((Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (d8gVar.c & 63);
        int i23222 = l5g.l;
        return max222;
    }

    public static final byte[] g(UUID uuid) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    public static final String h(tlo0 tlo0Var, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1811523376, 0, -1, "com.vk.ecomm.orders.impl.common.ui.compose.asString (TextSourceExt.kt:10)");
        }
        CharSequence b = tlo0Var.b(((Context) aVar.r(AndroidCompositionLocals_androidKt.b)).getResources());
        String obj = b != null ? b.toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return obj;
    }

    public static final long i(long j, long j2) {
        float f2;
        float f3;
        long b = l5g.b(j, l5g.g(j2));
        float e2 = l5g.e(j2);
        float e3 = l5g.e(b);
        float f4 = 1.0f - e3;
        float f5 = (e2 * f4) + e3;
        float i = l5g.i(b);
        float i2 = l5g.i(j2);
        float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f5 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = 0.0f;
        } else {
            f2 = (((i2 * e2) * f4) + (i * e3)) / f5;
        }
        float h = l5g.h(b);
        float h2 = l5g.h(j2);
        if (f5 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f3 = 0.0f;
        } else {
            f3 = (((h2 * e2) * f4) + (h * e3)) / f5;
        }
        float f7 = l5g.f(b);
        float f8 = l5g.f(j2);
        if (f5 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f6 = (((f8 * e2) * f4) + (f7 * e3)) / f5;
        }
        return f(f2, f3, f6, f5, l5g.g(j2));
    }

    public static final void j(m540 m540Var, yq9 yq9Var, yk8 yk8Var, float f2, v4j0 v4j0Var, pdo0 pdo0Var, qio qioVar) {
        ArrayList arrayList = m540Var.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ah90 ah90Var = (ah90) arrayList.get(i);
            ah90Var.a.j(yq9Var, yk8Var, f2, v4j0Var, pdo0Var, qioVar);
            yq9Var.p(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ah90Var.a.c());
        }
    }

    public static boolean k(List list, List list2) {
        if (list.size() == list2.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (epx.f(list.get(i), list2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final io.reactivex.rxjava3.internal.operators.single.y l(Object obj, lzv lzvVar, mjg mjgVar, d5w d5wVar) {
        f1e0 a = s7w.a(d5wVar.a);
        Collection<Msg> values = d5wVar.b.values();
        f1e0 f1e0Var = new f1e0();
        if ((values instanceof List) && (values instanceof RandomAccess)) {
            List list = (List) values;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                lv30.b((Msg) list.get(i), f1e0Var);
            }
        } else {
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                lv30.b((Msg) it.next(), f1e0Var);
            }
        }
        a.e(f1e0Var);
        return lzvVar.b(obj, mjgVar.d(new e1e0(a.h(), Source.CACHE, false))).l(new ga40(new exi0(d5wVar, 17), 13));
    }

    public static String m(int i) {
        if (i == f) {
            return g;
        }
        f = i;
        String format = i < 3600 ? String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2)) : String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 3600), Integer.valueOf((i / 60) % 60), Integer.valueOf(i % 60)}, 3));
        g = format;
        return format;
    }

    @NonNull
    public static String n(long j, Context context) {
        String str;
        Duration duration = Duration.HOUR;
        int h = (int) (j / duration.h());
        if (h > 0) {
            int h2 = (int) ((j - (duration.h() * h)) / Duration.MINUTE.h());
            str = context.getResources().getQuantityString(R.plurals.music_hours, h, Integer.valueOf(h));
            if (h2 > 0) {
                StringBuilder b = ho8.b(str, " ");
                b.append(context.getResources().getQuantityString(R.plurals.music_minutes, h2, Integer.valueOf(h2)));
                str = b.toString();
            }
        } else {
            int h3 = (int) (j / Duration.MINUTE.h());
            if (h3 > 0) {
                str = context.getResources().getQuantityString(R.plurals.music_minutes, h3, Integer.valueOf(h3));
            } else if (j > 0) {
                int i = (int) j;
                str = context.getResources().getQuantityString(R.plurals.music_seconds, i, Integer.valueOf(i));
            } else {
                str = null;
            }
        }
        return str == null ? "" : str;
    }

    @NonNull
    public static String o(long j, Context context) {
        Duration duration = Duration.HOUR;
        int h = (int) (j / duration.h());
        Resources resources = context.getResources();
        if (h <= 0) {
            Duration duration2 = Duration.MINUTE;
            int h2 = (int) (j / duration2.h());
            int h3 = (int) (j - (duration2.h() * h2));
            Locale.getDefault();
            return pzl.b(resources.getQuantityString(R.plurals.music_minutes, h2, Integer.valueOf(h2)), " ", resources.getQuantityString(R.plurals.music_seconds, h3, Integer.valueOf(h3)));
        }
        long j2 = h;
        long h4 = j - (duration.h() * j2);
        Duration duration3 = Duration.MINUTE;
        int h5 = (int) (h4 / duration3.h());
        int h6 = (int) ((j - (duration.h() * j2)) - (duration3.h() * h5));
        Locale.getDefault();
        return resources.getQuantityString(R.plurals.music_hours, h, Integer.valueOf(h)) + " " + resources.getQuantityString(R.plurals.music_minutes, h5, Integer.valueOf(h5)) + " " + resources.getQuantityString(R.plurals.music_seconds, h6, Integer.valueOf(h6));
    }

    @NonNull
    public static String p(Context context, long j, boolean z) {
        String str;
        if (z) {
            str = context.getResources().getString(R.string.music_talkback_explicit) + ", ";
        } else {
            str = "";
        }
        StringBuilder e2 = fw3.e(str);
        e2.append((Object) o(j, context));
        return e2.toString();
    }

    @NonNull
    public static String q(long j) {
        if (j == 0) {
            return "--:--";
        }
        Duration duration = Duration.HOUR;
        int h = (int) (j / duration.h());
        if (h <= 0) {
            Duration duration2 = Duration.MINUTE;
            int h2 = (int) (j / duration2.h());
            return String.format(Locale.getDefault(), "%d:%02d", Integer.valueOf(h2), Integer.valueOf((int) (j - (duration2.h() * h2))));
        }
        long j2 = h;
        long h3 = j - (duration.h() * j2);
        Duration duration3 = Duration.MINUTE;
        int h4 = (int) (h3 / duration3.h());
        return String.format(Locale.getDefault(), "%02d:%02d:%02d", Integer.valueOf(h), Integer.valueOf(h4), Integer.valueOf((int) ((j - (duration.h() * j2)) - (duration3.h() * h4))));
    }

    public static final long r(String str, List list) {
        Object obj;
        String path = Uri.parse(str).getPath();
        if (path == null) {
            throw new IllegalArgumentException("Empty url for vk ui");
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            thx thxVar = (thx) obj;
            if (thxVar.b != null) {
                if (brm0.B(path, DomExceptionUtils.SEPARATOR + thxVar.b, false)) {
                    break;
                }
            }
        }
        thx thxVar2 = (thx) obj;
        if (thxVar2 == null) {
            thxVar2 = uhx.a();
        }
        return thxVar2.a;
    }

    public static final String s(Group group, int i) {
        String a;
        String str = group.f;
        if (str.length() <= 0) {
            str = null;
        }
        if (str != null && (a = js5.a(i, str)) != null) {
            return a;
        }
        String str2 = group.e;
        return str2 == null ? "" : str2;
    }

    @NonNull
    public static String t(long j, Context context) {
        return j < 60 ? context.getString(R.string.music_second_short, Long.valueOf(j)) : j < TimeUtils.SECONDS_PER_HOUR ? context.getString(R.string.music_minutes_short, Long.valueOf(j / 60)) : j < 360000 ? context.getString(R.string.music_hours_minutes_short, Long.valueOf(j / TimeUtils.SECONDS_PER_HOUR), Long.valueOf((j / 60) % 60)) : context.getString(R.string.music_hours_short, Long.valueOf(j / TimeUtils.SECONDS_PER_HOUR));
    }

    public static final String v(thx thxVar) {
        return "https://" + a0a.d + '/' + w(thxVar);
    }

    public static final String w(thx thxVar) {
        return MBridgeConstans.DYNAMIC_VIEW_WX_APP + thxVar.a;
    }

    public static final Integer x(String str) {
        peq0 peq0Var = new peq0(Uri.parse(str));
        if (!peq0.p(peq0Var, laz.e(), null, null, 14)) {
            return null;
        }
        try {
            return Integer.valueOf(peq0Var.b(2));
        } catch (Exception e2) {
            L.i(e2);
            return null;
        }
    }

    public static final nzq0 y(Group group, Context context, int i) {
        String i2;
        ArrayList<UserProfile> arrayList;
        GroupLikes groupLikes = group.T;
        int i3 = groupLikes != null ? groupLikes.d : 0;
        List list = null;
        if (i3 > 0) {
            if (groupLikes != null && (arrayList = groupLikes.e) != null) {
                list = rli0.A(rli0.y(rli0.t(new i5g(arrayList), new fwh(i, 0)), 2));
            }
            i2 = enj.f(R.plurals.group_friends_members_count, i3, context);
        } else {
            i2 = uqm0.i(group.v, R.plurals.community_subscribers, R.string.community_subscribers_formatted, true);
        }
        return new nzq0(list, i2);
    }

    public static Drawable z(Context context, Group group) {
        Drawable d2;
        VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
        d2 = VerifyInfoHelper.a.d(context, false, group.y, (r14 & 8) != 0 ? false : false, (r14 & 16) != 0, (r14 & 32) != 0 ? false : false);
        return d2;
    }

    @Override // xsna.ahf
    public void a(whf whfVar, boolean z, egf egfVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        aVar.K(63232735);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(63232735, 3078, -1, "com.vk.clips.upload.ui.api.di.ClipsUploadSdkUiComponentSTUB.getComposeUploadView.<no name provided>.Content (ClipsUploadSdkUiComponent.kt:51)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    public io.reactivex.rxjava3.core.x u(String str, String str2) {
        ok60 ok60Var = new ok60("newsfeed.getSubscribersFeed");
        ok60Var.K("start_from", str);
        ok60Var.C(15, "count");
        ok60Var.C(1, "extended");
        ok60Var.K("fields", "photo_base,sex,verified,trending,can_write_private_message,can_message,is_verified,first_name_gen,last_name_gen,video_files");
        ok60Var.K("scroll_to", str2);
        return rsg0.w0(ok60Var);
    }

    @Override // xsna.q701
    public Object zza() {
        switch (this.b) {
            case 3:
                List list = s701.a;
                return Long.valueOf(zznn.zzp());
            default:
                List list2 = s701.a;
                return Integer.valueOf((int) zznn.zzD());
        }
    }

    public f870(sa30 sa30Var) {
        this.b = 15;
    }
}
