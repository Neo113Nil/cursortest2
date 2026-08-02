package xsna;

import android.content.Context;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.zzac;
import com.google.android.gms.cast.zzao;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.core.view.components.button.VkButton;
import one.video.exo.diskcache.Action;
import xsna.bx8;
import xsna.m8v0;

/* compiled from: View.kt */
/* loaded from: classes16.dex */
public final class w9c implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w9c(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z0d0 z0d0Var;
        boolean z;
        boolean z2;
        boolean z3 = true;
        switch (this.b) {
            case 0:
                int i = m8v0.M;
                VkButton vkButton = (VkButton) this.c;
                String str = ((UIBlockHint) this.d).z;
                if (str == null) {
                    str = "";
                }
                m8v0.a.a(vkButton, str, null, VkTooltip$MarkerStyle.Style6, VkTooltip$MarkerSize.Size64, VkOnboarding$TintColor.Lime, VkTooltip$BalloonPosition.BottomLeft, null, qg5.d, v9c.b, null, null, null, null, null, 0, false, null, null, false, null, false, 16776324);
                break;
            case 1:
                io.reactivex.rxjava3.subjects.e eVar = frd.a;
                if (frd.a() && (z0d0Var = frd.b) != null && z0d0Var.d) {
                    z0d0Var.c.obtainMessage(Action.DOWNLOAD.ordinal(), new h8o((Context) this.c, (dbn) this.d, new bx8.a(frd.d.a))).sendToTarget();
                    break;
                }
                break;
            default:
                a401 a401Var = ((y301) this.c).a;
                zzac zzacVar = (zzac) this.d;
                vr01 vr01Var = a401Var.t;
                ApplicationMetadata applicationMetadata = zzacVar.e;
                zzao zzaoVar = zzacVar.g;
                if (!o0a.c(applicationMetadata, a401Var.j)) {
                    a401Var.j = applicationMetadata;
                    vr01Var.onApplicationMetadataChanged(applicationMetadata);
                }
                double d = zzacVar.b;
                if (Double.isNaN(d) || Math.abs(d - a401Var.l) <= 1.0E-7d) {
                    z = false;
                } else {
                    a401Var.l = d;
                    z = true;
                }
                boolean z4 = zzacVar.c;
                if (z4 != a401Var.m) {
                    a401Var.m = z4;
                    z = true;
                }
                o100 o100Var = a401.w;
                o100Var.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(a401Var.c));
                if (vr01Var != null && (z || a401Var.c)) {
                    vr01Var.onVolumeChanged();
                }
                Double.isNaN(zzacVar.h);
                int i2 = zzacVar.d;
                if (i2 != a401Var.n) {
                    a401Var.n = i2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                o100Var.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(a401Var.c));
                if (vr01Var != null && (z2 || a401Var.c)) {
                    vr01Var.onActiveInputStateChanged(a401Var.n);
                }
                int i3 = zzacVar.f;
                if (i3 != a401Var.o) {
                    a401Var.o = i3;
                } else {
                    z3 = false;
                }
                o100Var.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(a401Var.c));
                if (vr01Var != null && (z3 || a401Var.c)) {
                    vr01Var.onStandbyStateChanged(a401Var.o);
                }
                if (!o0a.c(a401Var.p, zzaoVar)) {
                    a401Var.p = zzaoVar;
                }
                a401Var.c = false;
                break;
        }
    }
}
