package xsna;

import android.os.SystemClock;
import com.vk.dto.common.GroupsSuggestions;
import com.vk.log.L;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.core.content.ContentTab;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.io.Serializable;
import xsna.arh;
import xsna.c5i;
import xsna.uv4.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class sv4 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;

    public /* synthetic */ sv4(uv4 uv4Var, Throwable th, String str, boolean z) {
        this.d = uv4Var;
        this.e = th;
        this.f = str;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        GroupsSuggestions groupsSuggestions;
        switch (this.b) {
            case 0:
                uv4 uv4Var = (uv4) this.d;
                Throwable th = (Throwable) this.e;
                String str = (String) this.f;
                boolean z = this.c;
                if (uv4Var.d.length() > 0) {
                    com.vk.metrics.eventtracking.b.a.q(new IllegalStateException(th));
                }
                if (str.length() == 0) {
                    str = String.valueOf(SystemClock.uptimeMillis());
                }
                uv4Var.d = str;
                uv4Var.b().m.add(new xu4(uv4Var.new a()));
                xq4 b = uv4Var.b();
                String str2 = uv4Var.d;
                b.getClass();
                L.e("startRecording() called");
                b.r = str2;
                b.s = Boolean.valueOf(z);
                fo4 fo4Var = b.l;
                fo4Var.a(b.b);
                fo4Var.a.d(2);
                uv4Var.f = true;
                break;
            default:
                boolean z2 = this.c;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) this.d;
                arh arhVar = (arh) this.e;
                ContentTab contentTab = (ContentTab) this.f;
                ptk ptkVar = (ptk) obj;
                T t = ptkVar.a;
                boolean z3 = ptkVar.b;
                ExtendedCommunityProfile extendedCommunityProfile2 = (ExtendedCommunityProfile) t;
                if (!z2 && extendedCommunityProfile != null && extendedCommunityProfile2.n2 == null && (groupsSuggestions = extendedCommunityProfile.n2) != null) {
                    extendedCommunityProfile2.n2 = groupsSuggestions;
                }
                extendedCommunityProfile2.v1 = arhVar.e.f.b(extendedCommunityProfile2.a.c, extendedCommunityProfile2.v1);
                ioh iohVar = arhVar.j;
                arh.b bVar = arhVar.e;
                bVar.h.d(extendedCommunityProfile2, z3, true);
                arhVar.h.invoke(new d.o.c(extendedCommunityProfile2, z3));
                arhVar.i.invoke(new d.k(extendedCommunityProfile2, true, z2, z3));
                iohVar.invoke(CommunityProfileAction.n.d.b);
                iohVar.invoke(new CommunityProfileAction.a.d(z3));
                arhVar.e(extendedCommunityProfile2);
                if (bwd0.b(extendedCommunityProfile2) || extendedCommunityProfile2.g() || (!w2h.a(extendedCommunityProfile2) && (bwd0.c(extendedCommunityProfile2) || bwd0.f(extendedCommunityProfile2)))) {
                    arhVar.a();
                } else if (!z3) {
                    cih.c(bVar.a, extendedCommunityProfile2, contentTab, null, false, 12);
                    ouh.b(bVar.c, extendedCommunityProfile2, contentTab, false, 4);
                }
                if (!z3) {
                    bVar.b.a(extendedCommunityProfile2);
                }
                bVar.e.a(true);
                arhVar.b(extendedCommunityProfile2);
                if (!epx.f(extendedCommunityProfile, extendedCommunityProfile2)) {
                    ((a5i) arhVar.b.c.getValue()).b(new c5i.c(arhVar.a.a));
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ sv4(boolean z, ExtendedCommunityProfile extendedCommunityProfile, arh arhVar, ContentTab contentTab) {
        this.c = z;
        this.d = extendedCommunityProfile;
        this.e = arhVar;
        this.f = contentTab;
    }
}
