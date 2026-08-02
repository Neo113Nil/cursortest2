package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.UxPollsEntry;
import com.vk.fullscreenbanners.api.dto.blocks.FullScreenBannerBlock;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AbstractEncoder.kt */
/* loaded from: classes8.dex */
public abstract class de implements Encoder, cti, i7d0 {
    public static boolean I(Context context, String str, String str2) {
        return L(str, str2, null, null, context);
    }

    public static boolean K(String str, Context context) {
        return L(str, null, null, null, context);
    }

    public static boolean L(String str, String str2, Intent intent, Bundle bundle, Context context) {
        if (intent == null) {
            try {
                intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
            } catch (Throwable th) {
                eb3.a(null, new StringBuilder("IntentUtils: Unable to open link - "), th);
                return false;
            }
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (str2 != null) {
            intent.setPackage(str2);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        context.startActivity(intent);
        return true;
    }

    public static final int P(de deVar, XmlPullParser xmlPullParser, String str) {
        deVar.getClass();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public static gtv0 o0(long j, long j2, long j3, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1444445641, i, -1, "com.vk.core.compose.component.defaults.TooltipDefaults.tooltipColors (VkTooltipDefaults.kt:42)");
        }
        boolean z = ((((i & 14) ^ 6) > 4 && aVar.p(j)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && aVar.p(j2)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && aVar.p(j3)) || (i & 384) == 256);
        Object x = aVar.x();
        if (z || x == a.C0011a.a) {
            gtv0 gtv0Var = new gtv0(j, j2, j3);
            aVar.R(gtv0Var);
            x = gtv0Var;
        }
        gtv0 gtv0Var2 = (gtv0) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return gtv0Var2;
    }

    public static int v(int i, int i2) {
        return shy.a(i, i2, 31);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (r0.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static sdy x(JSONObject jSONObject) {
        boolean z;
        String optString = jSONObject.optString("x");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        String optString2 = jSONObject.optString("y");
        if (TextUtils.isEmpty(optString2)) {
            return null;
        }
        optString2.getClass();
        char c = 2;
        switch (optString2.hashCode()) {
            case -1383228885:
                if (optString2.equals("bottom")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case -1364013995:
                if (optString2.equals(TtmlNode.CENTER)) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            case 115029:
                if (optString2.equals("top")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        switch (z) {
            case false:
            case true:
            case true:
                optString.getClass();
                switch (optString.hashCode()) {
                    case -1364013995:
                        if (optString.equals(TtmlNode.CENTER)) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3317767:
                        if (optString.equals(TtmlNode.LEFT)) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 108511772:
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                    case 2:
                        return new sdy();
                    default:
                        return null;
                }
            default:
                return null;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void A(byte b) {
        W(Byte.valueOf(b));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void B(mmi0 mmi0Var, Object obj) {
        mmi0Var.serialize(this, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void C(float f) {
        W(Float.valueOf(f));
    }

    @Override // xsna.cti
    public Encoder D(ebd0 ebd0Var, int i) {
        V(ebd0Var, i);
        return i(ebd0Var.h(i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public cti F(SerialDescriptor serialDescriptor) {
        return d(serialDescriptor);
    }

    @Override // xsna.cti
    public void G(ebd0 ebd0Var, int i, short s) {
        V(ebd0Var, i);
        j(s);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void H(double d) {
        W(Double.valueOf(d));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void J() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // xsna.cti
    public void M(int i, int i2, SerialDescriptor serialDescriptor) {
        V(serialDescriptor, i);
        o(i2);
    }

    @Override // xsna.cti
    public void O(ebd0 ebd0Var, int i, char c) {
        V(ebd0Var, i);
        y(c);
    }

    @Override // xsna.cti
    public void Q(SerialDescriptor serialDescriptor, int i, double d) {
        V(serialDescriptor, i);
        H(d);
    }

    public abstract void R(FullScreenBannerBlock fullScreenBannerBlock);

    public float S(androidx.compose.runtime.a aVar) {
        aVar.K(-1537031036);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1537031036, 6, -1, "com.vk.core.compose.component.defaults.TooltipDefaults.contentPadding (VkTooltipDefaults.kt:72)");
        }
        float f = 0;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return f;
    }

    public abstract View T(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract void U(uub0 uub0Var);

    public void W(Object obj) {
        throw new SerializationException("Non-serializable " + fpf0.a(obj.getClass()) + " is not supported by " + fpf0.a(getClass()) + " encoder");
    }

    public abstract KSerializer X(dcy dcyVar, List list);

    public abstract boolean Y();

    public Html5Entry Z(u1c0 u1c0Var) {
        return null;
    }

    public abstract int b0(u1c0 u1c0Var);

    public ktc0 c0(u1c0 u1c0Var, int i) {
        return null;
    }

    public abstract String d0(u1c0 u1c0Var, int i);

    public io.reactivex.rxjava3.core.q e0(String str, NewsEntry newsEntry) {
        return null;
    }

    public io.reactivex.rxjava3.core.q f0(u1c0 u1c0Var) {
        return null;
    }

    public String g0(u1c0 u1c0Var, int i) {
        return null;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void h(SerialDescriptor serialDescriptor, int i) {
        W(Integer.valueOf(i));
    }

    public int h0(u1c0 u1c0Var) {
        return 0;
    }

    public abstract a3m i0(String str, dcy dcyVar);

    @Override // kotlinx.serialization.encoding.Encoder
    public void j(short s) {
        W(Short.valueOf(s));
    }

    public abstract mmi0 j0(dcy dcyVar, Object obj);

    @Override // kotlinx.serialization.encoding.Encoder
    public void k(boolean z) {
        W(Boolean.valueOf(z));
    }

    public UxPollsEntry k0(u1c0 u1c0Var) {
        return null;
    }

    @Override // xsna.cti
    public void l(SerialDescriptor serialDescriptor, int i, boolean z) {
        V(serialDescriptor, i);
        k(z);
    }

    public boolean l0() {
        return false;
    }

    @Override // xsna.cti
    public void m(SerialDescriptor serialDescriptor, int i, String str) {
        V(serialDescriptor, i);
        r(str);
    }

    public abstract void m0(int i);

    @Override // xsna.cti
    public void n(SerialDescriptor serialDescriptor, int i, mmi0 mmi0Var, Object obj) {
        V(serialDescriptor, i);
        B(mmi0Var, obj);
    }

    public abstract void n0(Typeface typeface, boolean z);

    @Override // kotlinx.serialization.encoding.Encoder
    public void o(int i) {
        W(Integer.valueOf(i));
    }

    @Override // xsna.cti
    public void p(ebd0 ebd0Var, int i, byte b) {
        V(ebd0Var, i);
        A(b);
    }

    public abstract void p0();

    @Override // xsna.cti
    public void q(SerialDescriptor serialDescriptor, int i, long j) {
        V(serialDescriptor, i);
        u(j);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void r(String str) {
        W(str);
    }

    @Override // xsna.cti
    public void s(SerialDescriptor serialDescriptor, int i, mmi0 mmi0Var, Object obj) {
        V(serialDescriptor, i);
        if (mmi0Var.getDescriptor().b()) {
            B(mmi0Var, obj);
        } else if (obj == null) {
            J();
        } else {
            B(mmi0Var, obj);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void u(long j) {
        W(Long.valueOf(j));
    }

    @Override // xsna.cti
    public void w(SerialDescriptor serialDescriptor, int i, float f) {
        V(serialDescriptor, i);
        C(f);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void y(char c) {
        W(Character.valueOf(c));
    }

    @Override // xsna.cti
    public boolean z() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void N() {
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public cti d(SerialDescriptor serialDescriptor) {
        return this;
    }

    @Override // xsna.cti
    public void e(SerialDescriptor serialDescriptor) {
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder i(SerialDescriptor serialDescriptor) {
        return this;
    }

    public void V(SerialDescriptor serialDescriptor, int i) {
    }
}
