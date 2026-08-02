package xsna;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.o5z0;
import xsna.q1g;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class cw50 extends nv50 {
    public final e0g A;
    public final float u;
    public final kiw v;
    public final ArrayList w;
    public final lhv x;
    public final String y;
    public final String z;

    public cw50(x1z0 x1z0Var) {
        super(x1z0Var);
        e0g e0gVar;
        q1g.b bVar;
        this.w = new ArrayList();
        lgz0 lgz0Var = x1z0Var.W;
        this.u = lgz0Var != null ? lgz0Var.D : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        String str = x1z0Var.l;
        this.y = TextUtils.isEmpty(str) ? null : str;
        String str2 = x1z0Var.n;
        this.z = TextUtils.isEmpty(str2) ? null : str2;
        this.v = x1z0Var.t;
        pll pllVar = x1z0Var.V;
        if (pllVar != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) pllVar.b).iterator();
            while (it.hasNext()) {
                o5z0 o5z0Var = (o5z0) it.next();
                o5z0.b bVar2 = o5z0Var.d;
                if (bVar2 != null) {
                    ArrayList arrayList2 = bVar2.b;
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        o5z0.a aVar = (o5z0.a) it2.next();
                        arrayList3.add(new q1g.a(aVar.a, aVar.b, aVar.c, aVar.d));
                    }
                    bVar = new q1g.b(bVar2.a, arrayList3, bVar2.c);
                } else {
                    bVar = null;
                }
                arrayList.add(new q1g(o5z0Var.a, o5z0Var.b, o5z0Var.c, bVar));
            }
            e0gVar = new e0g(arrayList);
        } else {
            e0gVar = null;
        }
        this.A = e0gVar;
        tbz0 tbz0Var = x1z0Var.Y;
        this.x = tbz0Var != null ? new lhv(tbz0Var.B, tbz0Var.C) : null;
        if (a()) {
            return;
        }
        ArrayList s = x1z0Var.s();
        if (s.isEmpty()) {
            return;
        }
        Iterator it3 = s.iterator();
        while (it3.hasNext()) {
            this.w.add(new dw50((a5z0) it3.next()));
        }
    }

    public final boolean a() {
        return b920.b(this.u, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 1;
    }

    @Override // xsna.nv50
    @NonNull
    public final String toString() {
        return "NativePromoBanner{id=" + this.f + ", videoDuration=" + this.u + ", image=" + this.v + ", collage=" + this.A + ", html=" + this.x + ", nativePromoCards=" + this.w + ", category='" + this.y + "', subCategory='" + this.z + "', navigationType='" + this.a + "', storeType='" + this.b + "', rating=" + this.c + ", votes=" + this.d + ", hasAdChoices=" + this.e + ", title='" + this.g + "', ctaText='" + this.h + "', description='" + this.i + "', disclaimer='" + this.j + "', disclaimerInfo='" + this.k + "', ageRestrictions='" + this.l + "', erid='" + this.m + "', domain='" + this.n + "', advertisingLabel='" + this.o + "', bundleId='" + this.p + "', icon=" + this.q + ", adChoicesIcon=" + this.r + '}';
    }
}
