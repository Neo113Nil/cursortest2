package xsna;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tracer.base.ucum.UcumUtils;

/* compiled from: AnimatableTransformParser.java */
/* loaded from: classes12.dex */
public final class eg2 {
    public static final JsonReader.a a = JsonReader.a.a("a", TtmlNode.TAG_P, UcumUtils.UCUM_SECONDS, "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");
    public static final JsonReader.a b = JsonReader.a.a(CampaignEx.JSON_KEY_AD_K);

    public static void a(nf2 nf2Var, i700 i700Var) {
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        List list = (List) nf2Var.c;
        if (list.isEmpty()) {
            list.add(new nhy(i700Var, valueOf, valueOf, (Interpolator) null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(i700Var.m)));
        } else if (((nhy) list.get(0)).b == 0) {
            list.set(0, new nhy(i700Var, valueOf, valueOf, (Interpolator) null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(i700Var.m)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(nf2 nf2Var) {
        if (nf2Var != null) {
            return nf2Var.d() && ((Float) ((nhy) ((List) nf2Var.c).get(0)).b).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x011e, code lost:
    
        if (r1.b == 1.0f) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static dg2 c(com.airbnb.lottie.parser.moshi.a aVar, i700 i700Var) throws IOException {
        vf2 vf2Var;
        boolean z = aVar.q() == JsonReader.Token.BEGIN_OBJECT;
        if (z) {
            aVar.beginObject();
        }
        sf2 sf2Var = null;
        fg2 fg2Var = null;
        nf2 nf2Var = null;
        vf2 vf2Var2 = null;
        nf2 nf2Var2 = null;
        nf2 nf2Var3 = null;
        nf2 nf2Var4 = null;
        nf2 nf2Var5 = null;
        nf2 nf2Var6 = null;
        pf2 pf2Var = null;
        nf2 nf2Var7 = null;
        nf2 nf2Var8 = null;
        while (aVar.hasNext()) {
            switch (aVar.s(a)) {
                case 0:
                    aVar.beginObject();
                    while (aVar.hasNext()) {
                        if (aVar.s(b) != 0) {
                            aVar.t();
                            aVar.skipValue();
                        } else {
                            sf2Var = tf2.a(aVar, i700Var);
                        }
                    }
                    aVar.endObject();
                    break;
                case 1:
                    fg2Var = tf2.b(aVar, i700Var);
                    break;
                case 2:
                    vf2Var2 = new vf2(rhy.a(aVar, i700Var, 1.0f, c5h0.b, false), 0);
                    break;
                case 3:
                    nf2Var6 = r490.l(aVar, i700Var, false);
                    a(nf2Var6, i700Var);
                    break;
                case 4:
                    nf2Var = r490.l(aVar, i700Var, false);
                    a(nf2Var, i700Var);
                    break;
                case 5:
                    pf2Var = r490.n(aVar, i700Var);
                    break;
                case 6:
                    nf2Var7 = r490.l(aVar, i700Var, false);
                    break;
                case 7:
                    nf2Var8 = r490.l(aVar, i700Var, false);
                    break;
                case 8:
                    nf2Var2 = r490.l(aVar, i700Var, false);
                    break;
                case 9:
                    nf2Var3 = r490.l(aVar, i700Var, false);
                    break;
                case 10:
                    nf2Var4 = r490.l(aVar, i700Var, false);
                    a(nf2Var4, i700Var);
                    break;
                case 11:
                    nf2Var5 = r490.l(aVar, i700Var, false);
                    a(nf2Var5, i700Var);
                    break;
                default:
                    aVar.t();
                    aVar.skipValue();
                    break;
            }
        }
        if (z) {
            aVar.endObject();
        }
        if (sf2Var == null || (sf2Var.d() && ((PointF) ((nhy) ((ArrayList) sf2Var.b).get(0)).b).equals(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
            sf2Var = null;
        }
        fg2 fg2Var2 = (fg2Var == null || (!(fg2Var instanceof xf2) && fg2Var.d() && ((PointF) ((nhy) fg2Var.l().get(0)).b).equals(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) ? null : fg2Var;
        nf2 nf2Var9 = b(nf2Var) ? null : nf2Var;
        if (vf2Var2 != null) {
            if (vf2Var2.d()) {
                b5h0 b5h0Var = (b5h0) ((nhy) ((List) vf2Var2.c).get(0)).b;
                if (b5h0Var.a == 1.0f) {
                }
            }
            vf2Var = vf2Var2;
            return new dg2(sf2Var, fg2Var2, vf2Var, nf2Var9, pf2Var, nf2Var7, nf2Var8, (nf2Var2 != null || (nf2Var2.d() && ((Float) ((nhy) ((List) nf2Var2.c).get(0)).b).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) ? null : nf2Var2, (nf2Var3 != null || (nf2Var3.d() && ((Float) ((nhy) ((List) nf2Var3.c).get(0)).b).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) ? null : nf2Var3, !b(nf2Var4) ? null : nf2Var4, !b(nf2Var5) ? null : nf2Var5, !b(nf2Var6) ? null : nf2Var6);
        }
        vf2Var = null;
        return new dg2(sf2Var, fg2Var2, vf2Var, nf2Var9, pf2Var, nf2Var7, nf2Var8, (nf2Var2 != null || (nf2Var2.d() && ((Float) ((nhy) ((List) nf2Var2.c).get(0)).b).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) ? null : nf2Var2, (nf2Var3 != null || (nf2Var3.d() && ((Float) ((nhy) ((List) nf2Var3.c).get(0)).b).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) ? null : nf2Var3, !b(nf2Var4) ? null : nf2Var4, !b(nf2Var5) ? null : nf2Var5, !b(nf2Var6) ? null : nf2Var6);
    }
}
