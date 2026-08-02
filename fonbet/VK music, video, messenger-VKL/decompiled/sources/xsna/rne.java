package xsna;

import android.content.Context;
import android.util.Size;
import com.vk.common.links.LaunchContext;
import com.vk.dto.stories.entities.OrdData;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vkontakte.android.R;
import xsna.ikv0;

/* compiled from: ClipsOrdMiniAppHandlerImpl.kt */
/* loaded from: classes16.dex */
public final class rne implements nne {
    public izs<? super OrdData, s3q0> a;
    public final ctu b = new ctu(new t40(this, 24));

    @Override // xsna.nne
    public final void a(int i, Context context, boolean z, boolean z2) {
        int i2;
        int i3;
        int i4;
        if (z) {
            i2 = R.drawable.vk_icon_check_circle_outline_28;
            i3 = R.attr.vk_ui_icon_positive;
            i4 = R.string.clips_ord_added_popup;
        } else {
            if (!z2) {
                return;
            }
            i2 = R.drawable.vk_icon_loudspeaker_slash_outline_28;
            i3 = R.attr.vk_ui_icon_negative;
            i4 = R.string.clips_ord_deleted_popup;
        }
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = new ikv0.c.C3058c(i2, Integer.valueOf(i3), (Size) null, 12);
        aVar.u = new ikv0.d(new ikv0.d.c(context.getString(i4)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar.o = Integer.valueOf(i);
        aVar.d = true;
        aVar.n();
    }

    @Override // xsna.nne
    public final void b() {
        this.b.a();
    }

    @Override // xsna.nne
    public final void c(Context context, OrdData ordData) {
        boolean z = ordData != null;
        LaunchContext launchContext = new LaunchContext(false, false, false, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_PUBLISH), null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108855);
        String str = f870.v(InternalVkMiniApps.ORD.h()) + "#service=clip";
        if (z) {
            String str2 = ordData.c;
            boolean z2 = ordData.b;
            String str3 = ordData.d;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("&ord_pred_id=");
            sb.append(str2);
            sb.append("&is_ad=");
            sb.append(z2);
            str = i5s.a(sb, "&erid=", str3);
        }
        maz.c(xwk.d().e(), context, str, launchContext, null, null, 24);
    }

    @Override // xsna.nne
    public final void d(izs<? super OrdData, s3q0> izsVar) {
        this.a = izsVar;
    }

    @Override // xsna.nne
    public final void e() {
        ctu.b();
        this.a = null;
    }
}
