package com.yandex.go.places.impl.ui.organizations;

import com.yandex.go.places.impl.analytics.DiscoveryOrganizationsListAnalyticsProxy$ShortcutChipType;
import defpackage.bn80;
import defpackage.ci80;
import defpackage.cn80;
import defpackage.di80;
import defpackage.ei80;
import defpackage.fi80;
import defpackage.jdj;
import defpackage.jio;
import defpackage.m950;
import defpackage.no80;
import defpackage.nw70;
import defpackage.oo80;
import defpackage.p1j0;
import defpackage.po80;
import defpackage.qm80;
import defpackage.tls;
import defpackage.w511;
import defpackage.xp80;
import defpackage.xx20;
import defpackage.yx20;
import defpackage.zx20;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class OrganizationsModalView$chipsAdapter$2$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        fi80 fi80Var = (fi80) obj;
        d dVar = (d) this.receiver;
        cn80 cn80Var = dVar.Q;
        jdj jdjVar = dVar.P;
        if (fi80Var instanceof ei80) {
            bn80 bn80Var = (bn80) cn80Var.a.getValue();
            String str = bn80Var != null ? bn80Var.a : null;
            DiscoveryOrganizationsListAnalyticsProxy$ShortcutChipType discoveryOrganizationsListAnalyticsProxy$ShortcutChipType = DiscoveryOrganizationsListAnalyticsProxy$ShortcutChipType.SHORTCUT_MODAL_CHIP;
            ei80 ei80Var = (ei80) fi80Var;
            String str2 = ei80Var.a;
            jio jioVar = (jio) jdjVar.c;
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put("type", discoveryOrganizationsListAnalyticsProxy$ShortcutChipType.getAnalyticsName());
            mapBuilder.put("chip_id", str2);
            jioVar.e(str, mapBuilder.j());
            zx20 zx20Var = ei80Var.e;
            if (zx20Var != null) {
                nw70 nw70Var = dVar.D;
                boolean z = zx20Var instanceof xx20;
                p1j0 p1j0Var = p1j0.a;
                if (z) {
                    OrganizationsPresenter$openSearchOptionsModal$1 organizationsPresenter$openSearchOptionsModal$1 = new OrganizationsPresenter$openSearchOptionsModal$1(0, dVar, d.class, "reloadStartPageApplyingSearchOptions", "reloadStartPageApplyingSearchOptions()V", 0);
                    po80 po80Var = (po80) nw70Var.b;
                    po80Var.B((m950) po80Var.G.get(), new qm80((xx20) zx20Var), new no80(organizationsPresenter$openSearchOptionsModal$1), p1j0Var);
                } else {
                    if (!(zx20Var instanceof yx20)) {
                        w511.b();
                        return null;
                    }
                    OrganizationsPresenter$openSearchOptionsModal$2 organizationsPresenter$openSearchOptionsModal$2 = new OrganizationsPresenter$openSearchOptionsModal$2(0, dVar, d.class, "reloadStartPageApplyingSearchOptions", "reloadStartPageApplyingSearchOptions()V", 0);
                    po80 po80Var2 = (po80) nw70Var.b;
                    po80Var2.B((m950) po80Var2.H.get(), new xp80((yx20) zx20Var), new oo80(organizationsPresenter$openSearchOptionsModal$2), p1j0Var);
                }
            }
        } else if (fi80Var instanceof di80) {
            bn80 bn80Var2 = (bn80) cn80Var.a.getValue();
            String str3 = bn80Var2 != null ? bn80Var2.a : null;
            DiscoveryOrganizationsListAnalyticsProxy$ShortcutChipType discoveryOrganizationsListAnalyticsProxy$ShortcutChipType2 = DiscoveryOrganizationsListAnalyticsProxy$ShortcutChipType.SHORTCUT_FILTER_CHIP;
            di80 di80Var = (di80) fi80Var;
            String str4 = di80Var.a;
            jio jioVar2 = (jio) jdjVar.c;
            MapBuilder mapBuilder2 = new MapBuilder();
            mapBuilder2.put("type", discoveryOrganizationsListAnalyticsProxy$ShortcutChipType2.getAnalyticsName());
            mapBuilder2.put("chip_id", str4);
            jioVar2.e(str3, mapBuilder2.j());
            dVar.L.d.a(di80Var.e);
            dVar.Qg();
        } else if (!(fi80Var instanceof ci80)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
