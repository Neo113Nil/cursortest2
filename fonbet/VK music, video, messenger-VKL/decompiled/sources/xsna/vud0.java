package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.DialogButtonsOrientation;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;
import xsna.xpv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class vud0 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ vud0(MusicTrack musicTrack, com.vk.profile.core.tabs.ui.music.a aVar, String str, String str2, Boolean bool, String str3) {
        this.c = musicTrack;
        this.d = aVar;
        this.e = str;
        this.f = str2;
        this.h = bool;
        this.g = str3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.a aVar;
        String str;
        efj a;
        int i = this.b;
        String str2 = null;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (i) {
            case 0:
                MusicTrack musicTrack = (MusicTrack) obj8;
                com.vk.profile.core.tabs.ui.music.a aVar2 = (com.vk.profile.core.tabs.ui.music.a) obj7;
                String str3 = (String) obj6;
                String str4 = (String) obj5;
                Boolean bool = (Boolean) obj3;
                String str5 = (String) obj4;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2006913407, intValue, -1, "com.vk.profile.core.tabs.ui.music.ProfileContentAudioAdapter.MusicTrackViewHolder.bind.<anonymous>.<anonymous> (ProfileContentAudioAdapter.kt:100)");
                    }
                    String str6 = musicTrack.d;
                    String str7 = "";
                    if (str6 == null) {
                        str6 = "";
                    }
                    String str8 = musicTrack.e;
                    if (str8 != null && !drm0.N(str8)) {
                        str2 = str8;
                    }
                    ucp ucpVar = ucp.a;
                    StringBuilder sb = new StringBuilder();
                    List<Artist> list = musicTrack.t;
                    if (list != null) {
                        str7 = s490.i(list);
                    } else {
                        String str9 = musicTrack.h;
                        if (str9 != null) {
                            str7 = str9;
                        }
                    }
                    sb.append(str7);
                    sb.append(' ');
                    sb.append(s490.c(musicTrack.u));
                    String obj9 = ucp.i(drm0.p0(sb.toString()).toString()).toString();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(841629602, 0, -1, "com.vk.profile.core.tabs.ui.music.ProfileContentAudioAdapter.rememberImageContent (ProfileContentAudioAdapter.kt:134)");
                    }
                    if (str3 != null) {
                        aVar3.K(-1031482537);
                        a = phw.a.a(fwu0.l(str3, null, null, null, aVar3, 0, 62), null, null, null, null, aVar3, 196616, 30);
                        aVar = aVar3;
                        aVar.j();
                        str = obj9;
                    } else {
                        aVar = aVar3;
                        aVar.K(-1031367062);
                        qzu0.a.getClass();
                        lg90 s1 = qzu0.s1(aVar);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        iyk0 iyk0Var = rrv0.a;
                        ylu0 ylu0Var = (ylu0) aVar.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        str = obj9;
                        long j = ylu0Var.l().Q;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        a = xpv.a.a(s1, j, new rek0(ylu0Var2.getImage().b), aVar, 24584, 8);
                        aVar.j();
                    }
                    efj efjVar = a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    boolean Lb = musicTrack.Lb();
                    boolean z = !musicTrack.B();
                    boolean y = aVar.y(aVar2) | aVar.y(musicTrack);
                    Object x = aVar.x();
                    if (y || x == a.C0011a.a) {
                        x = new xg2(10, aVar2, musicTrack);
                        aVar.R(x);
                    }
                    ssq0.b(str6, str, str4, efjVar, null, str2, Lb, bool, z, str5, (gzs) x, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            default:
                s890 s890Var = (s890) obj8;
                jai jaiVar = (jai) obj7;
                jai jaiVar2 = (jai) obj6;
                jai jaiVar3 = (jai) obj5;
                DialogButtonsOrientation dialogButtonsOrientation = (DialogButtonsOrientation) obj4;
                s890 s890Var2 = (s890) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-260645648, intValue2, -1, "com.vk.core.compose.component.VkAlert.<anonymous> (VkAlert.kt:219)");
                    }
                    q630 f = txj0.f(s200.C(q630.a.a, s890Var), 1.0f);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar4, 0);
                    int hashCode = Long.hashCode(n34.n(aVar4));
                    sy90 D = aVar4.D();
                    q630 c = qri.c(aVar4, f);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (aVar4.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar4.H();
                    if (aVar4.L()) {
                        aVar4.I(aVar5);
                    } else {
                        aVar4.f();
                    }
                    k9q0.w(aVar4, a2, cri.a.f);
                    k9q0.w(aVar4, D, cri.a.e);
                    k9q0.w(aVar4, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar4, cri.a.h);
                    k9q0.w(aVar4, c, cri.a.d);
                    jaiVar.invoke(aVar4, 0);
                    p7u0.h(jaiVar2, jaiVar3, dialogButtonsOrientation, s890Var2, aVar4, 6);
                    aVar4.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ vud0(s890 s890Var, jai jaiVar, jai jaiVar2, jai jaiVar3, DialogButtonsOrientation dialogButtonsOrientation, s890 s890Var2) {
        this.c = s890Var;
        this.d = jaiVar;
        this.e = jaiVar2;
        this.f = jaiVar3;
        this.g = dialogButtonsOrientation;
        this.h = s890Var2;
    }
}
