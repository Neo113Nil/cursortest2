package com.yandex.go.trusted_contacts.share_settings;

import android.content.Context;
import com.yandex.go.trusted_contacts.data.entities.network.ShareSettingsDto;
import com.yandex.go.trusted_contacts.data.entities.network.ShareSettingsSwitches;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactDto;
import com.yandex.go.trusted_contacts.domain.entities.ShareSettingsMode;
import defpackage.a201;
import defpackage.ad5;
import defpackage.bvf0;
import defpackage.g92;
import defpackage.glr0;
import defpackage.ilr0;
import defpackage.jl40;
import defpackage.mth;
import defpackage.o7r0;
import defpackage.og11;
import defpackage.pgk0;
import defpackage.plr0;
import defpackage.skr0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.vkr0;
import defpackage.w511;
import defpackage.wlr0;
import defpackage.xlr0;
import defpackage.yce;
import defpackage.ykr0;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class a extends ad5 {
    public final TrustedContactDto A;
    public final ShareSettingsMode B;
    public final a201 C;
    public final pgk0 D;
    public final zuj0 E;
    public final r0 F;
    public TrustedContactDto G;
    public xlr0 H;
    public String I;
    public final r0 J;
    public final Context x;
    public final vkr0 y;
    public final ykr0 z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    public a(Context context, vkr0 vkr0Var, ykr0 ykr0Var, TrustedContactDto trustedContactDto, ShareSettingsMode shareSettingsMode, a201 a201Var, pgk0 pgk0Var, zuj0 zuj0Var) {
        super(ilr0.class);
        ?? r3;
        skr0 skr0Var;
        List list;
        this.x = context;
        this.y = vkr0Var;
        this.z = ykr0Var;
        this.A = trustedContactDto;
        this.B = shareSettingsMode;
        this.C = a201Var;
        this.D = pgk0Var;
        this.E = zuj0Var;
        this.F = bvf0.c(trustedContactDto);
        this.G = trustedContactDto;
        this.H = wlr0.a;
        this.I = "";
        int i = plr0.a[shareSettingsMode.ordinal()];
        if (i == 1) {
            og11 og11Var = vkr0Var.a.i;
            ShareSettingsDto shareSettingsDto = og11Var != null ? og11Var.e : null;
            if (shareSettingsDto == null || (list = shareSettingsDto.e) == null) {
                r3 = EmptyList.a;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((ShareSettingsSwitches) obj).c) {
                        arrayList.add(obj);
                    }
                }
                r3 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r3.add(((ShareSettingsSwitches) it.next()).a);
                }
            }
            skr0Var = new skr0(shareSettingsDto != null ? shareSettingsDto.c : null, r3);
        } else {
            if (i != 2) {
                w511.b();
                throw null;
            }
            String str = this.G.d;
            if (str.length() == 0) {
                og11 og11Var2 = vkr0Var.a.i;
                ShareSettingsDto shareSettingsDto2 = og11Var2 != null ? og11Var2.e : null;
                str = shareSettingsDto2 != null ? shareSettingsDto2.c : null;
            }
            skr0Var = new skr0(str, new ArrayList(this.G.e));
        }
        this.J = bvf0.c(skr0Var);
    }

    public final void Kg() {
        r0 r0Var = this.F;
        og11 og11Var = this.y.a.i;
        tje.N(Jg(), null, null, new ShareSettingsPresenter$loadContact$$inlined$collectIn$1(new o(new n(e.n(r0Var, e.t(new mth(new g92(2, og11Var != null ? og11Var.e : null), 6)), this.J, new ShareSettingsPresenter$loadContact$1(this, null)), new ShareSettingsPresenter$loadContact$2(this, null)), new ShareSettingsPresenter$loadContact$3(this, null)), null, this), 3);
    }

    public final void Lg() {
        o7r0 o7r0Var = (o7r0) this.C.c;
        o7r0Var.getClass();
        o7r0Var.a.a("TrustedContacts.Edit.ActionButtonTapped", new HashMap(), 1, new HashMap());
        if (this.B != ShareSettingsMode.ADD) {
            skr0 skr0Var = (skr0) this.J.getValue();
            TrustedContactDto trustedContactDto = this.G;
            if (jl40.l(skr0Var.a, trustedContactDto.d) && jl40.l(skr0Var.b, trustedContactDto.e) && jl40.l(this.A.b, this.G.b)) {
                ((glr0) this.D.b).r(new yce(false, 26));
                return;
            }
        }
        tje.N(Jg(), null, null, new ShareSettingsPresenter$saveContact$1(this, null), 3);
    }
}
