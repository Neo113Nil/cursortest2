package xsna;

import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.zznn;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.RequestUserProfile;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Pair;
import org.json.JSONArray;

/* compiled from: AttachType.kt */
/* loaded from: classes18.dex */
public final class n34 implements yxe, q701, kxc0, gn60 {
    public static final n34 b = new n34();
    public static final jai c = new jai(858898076, new nhi(1), false);
    public static final jai d = new jai(-1938414680, new rei(2), false);
    public static final jai e = new jai(1888130531, new tg4(0, 1), false);
    public static final /* synthetic */ n34 f = new n34();
    public static volatile boolean g;

    public static final long A(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final Image B(WebImage webImage) {
        List<WebImageSize> list = webImage.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (WebImageSize webImageSize : list) {
            arrayList.add(new ImageSize(webImageSize.b, webImageSize.d, webImageSize.c, webImageSize.g, webImageSize.e, webImageSize.f));
        }
        return new Image(arrayList);
    }

    public static final ApiApplication C(WebApiApplication webApiApplication) {
        return chx0.b(webApiApplication);
    }

    public static ArrayList E() {
        return j5g.u0(e43.l(2, 15, 10, 24), F());
    }

    public static List F() {
        return e43.l(20, 35, 18, 34, 21);
    }

    public static final long a(int i) {
        if (!(i > 0)) {
            xzw.a("The span value should be higher than 0");
        }
        return i;
    }

    public static String b(String str) {
        return go9.b("SecurityComp10201304: ", str);
    }

    public static final boolean c(Object obj, UserId userId, String str, izs izsVar) {
        RequestUserProfile requestUserProfile = (RequestUserProfile) izsVar.invoke(obj);
        if (requestUserProfile != null) {
            boolean z = fkq0.c(userId) && epx.f(requestUserProfile.c, userId);
            boolean z2 = !fkq0.c(userId) && epx.f(requestUserProfile.t0, str);
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    public static final float d(long j) {
        if (Float.intBitsToFloat((int) (j >> 32)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Float.intBitsToFloat((int) (j & 4294967295L)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r0), Float.intBitsToFloat((int) (j & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    public static void e(String str, String str2) {
        Log.e(b(str), str2);
    }

    public static final long f(plb0 plb0Var, boolean z, izs izsVar) {
        List<xlb0> list = plb0Var.a;
        int size = list.size();
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            xlb0 xlb0Var = list.get(i2);
            if (((Boolean) izsVar.invoke(xlb0Var)).booleanValue()) {
                j = ov70.f(j, z ? xlb0Var.c : xlb0Var.g);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return ov70.b(i, j);
    }

    public static final float g(plb0 plb0Var, boolean z) {
        long f2 = f(plb0Var, z, new wyn0(2));
        boolean c2 = ov70.c(f2, 9205357640488583168L);
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (c2) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        List<xlb0> list = plb0Var.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            xlb0 xlb0Var = list.get(i2);
            if (xlb0Var.d && xlb0Var.h) {
                i++;
                f3 = ov70.d(ov70.e(z ? xlb0Var.c : xlb0Var.g, f2)) + f3;
            }
        }
        return f3 / i;
    }

    public static final float h(plb0 plb0Var) {
        List<xlb0> list = plb0Var.a;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            xlb0 xlb0Var = list.get(i);
            if (!xlb0Var.h || !xlb0Var.d) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        if (i2 >= 2) {
            long f2 = f(plb0Var, true, new wyn0(2));
            long f3 = f(plb0Var, false, new wyn0(2));
            int size2 = list.size();
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (int i4 = 0; i4 < size2; i4++) {
                xlb0 xlb0Var2 = list.get(i4);
                if (xlb0Var2.d && xlb0Var2.h) {
                    long j = xlb0Var2.c;
                    long e2 = ov70.e(xlb0Var2.g, f3);
                    long e3 = ov70.e(j, f2);
                    float d2 = d(e3) - d(e2);
                    float d3 = ov70.d(ov70.f(e3, e2)) / 2.0f;
                    if (d2 > 180.0f) {
                        d2 -= 360.0f;
                    } else if (d2 < -180.0f) {
                        d2 += 360.0f;
                    }
                    f5 += d2 * d3;
                    f4 += d3;
                }
            }
            if (f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return f5 / f4;
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static boolean i(Bundle bundle) {
        return bundle.containsKey("dialog_ext_state");
    }

    public static hs8 j(hs8 hs8Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = hs8Var.a;
        }
        if ((i & 2) != 0) {
            z2 = hs8Var.b;
        }
        return (z == hs8Var.a && z2 == hs8Var.b) ? hs8Var : new hs8(z, z2);
    }

    public static final h88 k(Context context) {
        Object obj = context;
        while ((obj instanceof ContextWrapper) && !(obj instanceof i88)) {
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        i88 i88Var = obj instanceof i88 ? (i88) obj : null;
        if (i88Var != null) {
            return i88Var.Re();
        }
        return null;
    }

    public static String l(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = 60;
        long j3 = j / j2;
        sb.append(j3 < 10 ? defpackage.k0.a(j3, "0") : String.valueOf(j3));
        sb.append(':');
        long j4 = j % j2;
        sb.append(j4 < 10 ? defpackage.k0.a(j4, "0") : String.valueOf(j4));
        return sb.toString();
    }

    public static final int m(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(524444915, 0, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:252)");
        }
        int Z = aVar.Z();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return Z;
    }

    public static final long n(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-168259424, 0, -1, "androidx.compose.runtime.<get-currentCompositeKeyHashCode> (Composables.kt:268)");
        }
        long B = aVar.B();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return B;
    }

    public static final vef0 o(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(394957799, 0, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:216)");
        }
        androidx.compose.runtime.f v = aVar.v();
        if (v == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        aVar.Y(v);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return v;
    }

    public static DialogExt p(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("dialog_ext_state");
        Peer peer = (Peer) bundle2.getParcelable("dialog_id");
        long j = peer != null ? peer.b : 0L;
        DialogExt dialogExt = (DialogExt) com.vk.core.util.state.a.b(DialogExt.class, bundle2, bundle2.getString("dialog_ext_state_key"));
        if (dialogExt == null) {
            return new DialogExt(j, (ProfilesInfo) null, 2, (zcl) null);
        }
        return dialogExt;
    }

    public static final do20 q() {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-469754525, 0, -1, "com.vk.core.compose.component.button.tool.<get-VkToolButtonDefaults> (ToolButtonDefaults.kt:31)");
        }
        do20 do20Var = do20.d;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return do20Var;
    }

    public static final void r() {
        throw new IllegalStateException("Invalid applier");
    }

    public static boolean s() {
        return g;
    }

    public static final q630 t(q630 q630Var, d160 d160Var, e160 e160Var) {
        return q630Var.g(new h160(d160Var, e160Var));
    }

    public static ArrayList u(JSONArray jSONArray) {
        String str;
        int length = jSONArray != null ? jSONArray.length() : 0;
        if (jSONArray == null || length == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            String optString = jSONArray.optString(i);
            try {
                str = Uri.parse(optString).getScheme();
            } catch (Throwable unused) {
                str = null;
            }
            if (str == null || !(str.equals("http") || str.equals(HttpRequest.DEFAULT_SCHEME))) {
                return new ArrayList();
            }
            arrayList.add(optString);
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new WebImage((List<WebImageSize>) Collections.singletonList(new WebImageSize((String) it.next(), iah0.f().widthPixels, iah0.f().heightPixels, (char) 0, false, null, 56, null))));
        }
        return arrayList2;
    }

    public static final long v(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static void w(Bundle bundle, DialogExt dialogExt, f1e0 f1e0Var) {
        String a = vu5.a(']', dialogExt.e, new StringBuilder("DialogExt["));
        Dialog Cb = dialogExt.Cb();
        f1e0 a2 = Cb != null ? ijm.a(Cb) : new f1e0();
        if (f1e0Var != null) {
            a2.e(f1e0Var);
        }
        ProfilesInfo profilesInfo = new ProfilesInfo(dialogExt.b);
        profilesInfo.b.q(a2.a);
        profilesInfo.c.q(a2.b);
        profilesInfo.d.q(a2.c);
        profilesInfo.e.q(a2.d);
        profilesInfo.f.q(a2.e);
        ypp<Dialog> yppVar = dialogExt.d;
        DialogExt dialogExt2 = new DialogExt((ypp<Dialog>) new ypp(yppVar.c, yppVar.d, yppVar.a), profilesInfo, dialogExt.c);
        LinkedBlockingDeque<String> linkedBlockingDeque = com.vk.core.util.state.a.a;
        Bundle bundle2 = new Bundle();
        com.vk.core.util.state.a.c(bundle2, a, dialogExt2);
        bundle2.putString("dialog_ext_state_key", a);
        bundle2.putParcelable("dialog_id", dialogExt.f);
        bundle.putBundle("dialog_ext_state", bundle2);
    }

    public static final cvi z(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1165786124, 0, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:516)");
        }
        cvi k = aVar.k();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return k;
    }

    public List D(vp10 vp10Var) {
        NewsEntry newsEntry = vp10Var.a;
        NewsEntry newsEntry2 = vp10Var.b;
        PhotoAttachment photoAttachment = vp10Var.c;
        int i = vp10Var.d;
        Photo photo = photoAttachment.l;
        Image image = photo.y;
        PhotoRestriction photoRestriction = photo.L;
        return Collections.singletonList(new ocg0(newsEntry, newsEntry2, photoAttachment, i, image, photoRestriction != null ? photoRestriction.b : null));
    }

    @Override // xsna.kxc0
    /* renamed from: apply */
    public boolean mo429apply(Object obj) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return D((vp10) pair);
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return zznn.zzL();
    }
}
