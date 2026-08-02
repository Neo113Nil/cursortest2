package xsna;

import android.content.Context;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.compose.runtime.a;
import androidx.datastore.core.CorruptionException;
import com.google.android.gms.internal.measurement.zznn;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.utils.dto.UtilsResolveScreenNameWithDataPlatformDto;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.stories.model.clickable.ClickableChannelPost;
import com.vk.im.engine.models.attaches.AttachUgcSticker;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.p4p;

/* compiled from: MusicMixTransitionConfig.kt */
@vby
/* loaded from: classes3.dex */
public final class po40 implements twj, q701, h5p {
    public static final jai b = new jai(-1359139913, new yji(0), false);
    public static final jai c = new jai(194177842, new zji(0), false);
    public static final jai d = new jai(575826551, new aki(0, 0), false);
    public static final po40 e = new po40();
    public static final po40 f = new po40();
    public static final /* synthetic */ po40 g = new po40();

    public po40(int i) {
        switch (i) {
            case 22:
                rdq.a.getClass();
                rdq.a();
                break;
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        androidx.compose.runtime.a M = aVar.M(-709502251);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-709502251, i, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:39)");
            }
            iyk0 iyk0Var = o1h0.a;
            m1h0 m1h0Var = (m1h0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(15454635, 0, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:57)");
            }
            M.K(1967007413);
            Object[] objArr = new Object[0];
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new ap80(7);
                M.R(x);
            }
            l1h0 l1h0Var = (l1h0) crx0.D(objArr, l1h0.f, (gzs) x, M, 384);
            l1h0Var.d = (m1h0) M.r(iyk0Var);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object[] objArr2 = {m1h0Var};
            fh9 fh9Var = new fh9(new wni(4), new defpackage.s(20, m1h0Var, l1h0Var));
            boolean y = M.y(m1h0Var) | M.y(l1h0Var);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new defpackage.u(18, m1h0Var, l1h0Var);
                M.R(x2);
            }
            jwy jwyVar = (jwy) crx0.D(objArr2, fh9Var, (gzs) x2, M, 0);
            rvi.a(iyk0Var.b(jwyVar), kai.c(-412824043, new q85(4, jaiVar, jwyVar), M), M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ce0(jaiVar, i, 6);
        }
    }

    public static final void d(final long j, final nmo0 nmo0Var, final wzs wzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-684938728);
        if ((i & 6) == 0) {
            i2 = (M.p(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(nmo0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(wzsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-684938728, i2, -1, "androidx.compose.material3.internal.ProvideContentColorTextStyle (ProvideContentColorTextStyle.kt:38)");
            }
            pqo pqoVar = cjo0.a;
            rvi.b(new c9e0[]{vcl0.b(j, zfj.a), pqoVar.b(((nmo0) M.r(pqoVar)).d(nmo0Var))}, wzsVar, M, ((i2 >> 3) & 112) | 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.b9e0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    po40.d(j, nmo0Var, wzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static fvj e(yzs yzsVar) {
        return new fvj(new hvj(zvj.a(sfp.a.plus(whn0.a()))), yzsVar);
    }

    @NonNull
    public static float[] g(int i, @NonNull float[] fArr) {
        float[] fArr2 = new float[fArr.length];
        int i2 = ((-i) / 90) * 2;
        for (int i3 = 0; i3 < fArr.length; i3++) {
            int length = (i3 + i2) % fArr.length;
            if (length < 0) {
                length += fArr.length;
            }
            fArr2[length] = fArr[i3];
        }
        return fArr2;
    }

    public static final boolean h(int i, int i2) {
        return i == i2;
    }

    public static final PhotoRestriction i(com.vk.im.engine.models.messages.a aVar, Context context) {
        Object a0 = j5g.a0(aVar.K0());
        AttachUgcSticker attachUgcSticker = a0 instanceof AttachUgcSticker ? (AttachUgcSticker) a0 : null;
        if (attachUgcSticker != null && attachUgcSticker.f.B()) {
            return new PhotoRestriction(context.getString(R.string.vkim_accessibility_sticker), context.getString(R.string.vkim_accessibility_sticker), false, null);
        }
        if (!aVar.K0().isEmpty()) {
            Object a02 = j5g.a0(aVar.K0());
            AttachImage attachImage = a02 instanceof AttachImage ? (AttachImage) a02 : null;
            if (attachImage != null) {
                ahn.e();
                if (ddg0.a.c(attachImage)) {
                    return attachImage.v;
                }
            }
        }
        return null;
    }

    public static final String j(ClickableChannelPost clickableChannelPost) {
        return "https://" + a0a.d + "/im/channels/" + clickableChannelPost.f.b + "?cmid=" + clickableChannelPost.g;
    }

    public static int k(int i) {
        return Integer.hashCode(i);
    }

    public static boolean l(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        throw new IllegalArgumentException(lhg.a(i, "Invalid rotation degrees: "));
    }

    public static xy2 m(po40 po40Var, float f2, float f3, String str, Integer num, Integer num2, int i) {
        String str2 = (i & 4) != 0 ? null : str;
        Integer num3 = (i & 32) == 0 ? num : null;
        po40Var.getClass();
        tfx tfxVar = new tfx("places.search", new fr(29), new gr(27));
        tfxVar.h("latitude", f2, -1.7976931348623157E308d, Double.MAX_VALUE);
        tfxVar.h("longitude", f3, -1.7976931348623157E308d, Double.MAX_VALUE);
        if (str2 != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str2, 0, 50, 4);
            tfxVar = tfxVar;
        }
        if (num3 != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num3.intValue(), 0, 0, 8);
        }
        if (num2 != null) {
            tfxVar.f(num2.intValue(), 0, 100, "count");
        }
        return tfxVar;
    }

    public static long n(xi90 xi90Var, int i, int i2) {
        xi90Var.P(i);
        if (xi90Var.a() < 5) {
            return C.TIME_UNSET;
        }
        int p = xi90Var.p();
        if ((8388608 & p) != 0 || ((2096896 & p) >> 8) != i2 || (p & 32) == 0 || xi90Var.C() < 7 || xi90Var.a() < 7 || (xi90Var.C() & 16) != 16) {
            return C.TIME_UNSET;
        }
        xi90Var.n(new byte[6], 0, 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }

    @NonNull
    public static float[] o(@NonNull Size size) {
        return new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, size.getWidth(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, size.getWidth(), size.getHeight(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, size.getHeight()};
    }

    public static String p(int i) {
        return uqi.a("DialogFlagsModel(flags=", i, ')');
    }

    public static /* synthetic */ xy2 s(po40 po40Var, String str, UtilsResolveScreenNameWithDataPlatformDto utilsResolveScreenNameWithDataPlatformDto, String str2, Integer num, String str3, ArrayList arrayList, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        return po40Var.r(str, utilsResolveScreenNameWithDataPlatformDto, str2, null, num, str3, (i & 64) != 0 ? null : arrayList);
    }

    public void b(izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1212540462);
        int i2 = (M.y(izsVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1212540462, i2, -1, "com.vk.importcontacts.impl.presentation.main.view.ImportContactsView.Content (ImportContactsView.kt:32)");
            }
            rrv0.d(null, null, null, null, kai.c(-1411405335, new ae1(izsVar, 2, (byte) 0), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new r85(this, izsVar, i, 5);
        }
    }

    @Override // xsna.h5p
    public Object f(i4p i4pVar, ota0 ota0Var, Integer num, g5p g5pVar, p4p.b bVar) {
        nf10 nf10Var = (nf10) g5pVar;
        if (ota0Var == null) {
            return null;
        }
        if (nf10Var.I()) {
            return ota0Var;
        }
        lyk0 lyk0Var = alg.a;
        return alg.a(ota0Var, nf10Var.a);
    }

    public tfx q() {
        return new tfx("utils.getServerTime", new umq0(1), new itj0(6));
    }

    public tfx r(String str, UtilsResolveScreenNameWithDataPlatformDto utilsResolveScreenNameWithDataPlatformDto, String str2, Integer num, Integer num2, String str3, List list) {
        tfx tfxVar = new tfx("utils.resolveScreenNameWithData", new zq(27), new com.vk.movika.sdk.android.defaultplayer.interactive.c(29));
        tfx.o(tfxVar, "screen_name", str, 0, 0, 12);
        tfx.o(tfxVar, "platform", utilsResolveScreenNameWithDataPlatformDto.i(), 0, 0, 12);
        if (str2 != null) {
            tfx.o(tfxVar, "ref", str2, 0, 0, 12);
        }
        if (num != null) {
            tfx.l(tfxVar, "ref_id", num.intValue(), 0, 0, 12);
        }
        if (num2 != null) {
            tfx.l(tfxVar, "ref_section_id", num2.intValue(), 0, 0, 12);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "url", str3, 0, 0, 12);
        }
        if (list != null) {
            tfxVar.i("app_fields", list);
        }
        return tfxVar;
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Integer.valueOf((int) zznn.zzf());
    }

    @Override // xsna.twj
    public Object a(CorruptionException corruptionException) throws CorruptionException {
        throw corruptionException;
    }
}
