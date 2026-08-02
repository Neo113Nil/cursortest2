package xsna;

import android.content.Context;
import android.util.Log;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.dto.common.id.UserId;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import java.util.HashSet;
import java.util.Iterator;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: ReactionSet.kt */
/* loaded from: classes18.dex */
public final class c2f0 {
    public static String a(String str) {
        return "SecurityComp10201304: ".concat(str);
    }

    public static void b(String str, String str2) {
        Log.e("SecurityComp10201304: ".concat(str), str2);
    }

    public static int c(int i, int i2, Context context) {
        HashSet hashSet = iah0.a;
        if (fnj.d(context)) {
            return (int) (context.getResources().getDisplayMetrics().density * 420.0f);
        }
        boolean z = false;
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return 0;
        }
        if (1 <= i2 && i2 < i) {
            z = true;
        }
        float f = z ? 1.5625f : 0.89285713f;
        if (i != 0) {
            int i3 = (int) (i / f);
            if (!z || i2 <= 0 || i3 <= i2) {
                return i3;
            }
        }
        return i2;
    }

    public static final ReactionMeta d(ReactionSet reactionSet, int i) {
        if (reactionSet == null) {
            return null;
        }
        Iterator<ReactionMeta> it = reactionSet.c.iterator();
        while (it.hasNext()) {
            ReactionMeta next = it.next();
            if (next.getId() == i) {
                return next;
            }
        }
        return null;
    }

    public static /* synthetic */ boolean f(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public io.reactivex.rxjava3.core.x e(String str, String str2, String str3, int i, UserId userId, String str4) {
        int i2 = 0;
        if (str2 != null) {
            if (str4 != null && str4.length() != 0) {
                bpn0 bpn0Var = cqm0.a;
                try {
                    i2 = Integer.parseInt(str4);
                } catch (Throwable unused) {
                }
            }
            iax0 iax0Var = new iax0("wall.search");
            iax0Var.s = str;
            s3q0 s3q0Var = s3q0.a;
            iax0Var.K("query", str);
            iax0Var.K(X3.j.D, str2);
            iax0Var.C(i2, SignalingProtocol.KEY_OFFSET);
            iax0Var.C(i, "count");
            iax0Var.C(1, "extended");
            iax0Var.C(1, "photo_sizes");
            iax0Var.K("fields", iax0.v);
            iax0Var.t = i2;
            iax0Var.u = i;
            return rsg0.W(iax0Var, 7);
        }
        if (userId == null) {
            zw60 zw60Var = new zw60("newsfeed.search");
            zw60Var.s = str;
            s3q0 s3q0Var2 = s3q0.a;
            zw60Var.K(CampaignEx.JSON_KEY_AD_Q, str);
            if (str3 != null) {
                zw60Var.K("situational_suggest_id", str3);
            }
            zw60Var.C(i, "count");
            zw60Var.K("start_from", str4);
            zw60Var.C(1, "extended");
            zw60Var.C(1, "photo_sizes");
            zw60Var.K("fields", zw60.t);
            return rsg0.W(zw60Var, 7);
        }
        if (str4 != null && str4.length() != 0) {
            bpn0 bpn0Var2 = cqm0.a;
            try {
                i2 = Integer.parseInt(str4);
            } catch (Throwable unused2) {
            }
        }
        iax0 iax0Var2 = new iax0("wall.search");
        iax0Var2.s = str;
        s3q0 s3q0Var3 = s3q0.a;
        iax0Var2.K("query", str);
        iax0Var2.F(userId, "owner_id");
        iax0Var2.C(i2, SignalingProtocol.KEY_OFFSET);
        iax0Var2.C(i, "count");
        iax0Var2.C(1, "extended");
        iax0Var2.C(1, "photo_sizes");
        iax0Var2.K("fields", iax0.v);
        iax0Var2.t = i2;
        iax0Var2.u = i;
        return rsg0.W(iax0Var2, 7);
    }
}
