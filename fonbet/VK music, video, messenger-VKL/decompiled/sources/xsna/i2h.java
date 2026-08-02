package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vkontakte.android.R;
import java.util.Calendar;
import org.chromium.net.NetError;
import xsna.tlo0;

/* compiled from: CommunityEventDateItem.kt */
/* loaded from: classes5.dex */
public final class i2h extends we6 {
    public final j2h g;
    public final sdz h;
    public final int i = NetError.ERR_CERT_WEAK_SIGNATURE_ALGORITHM;

    /* compiled from: CommunityEventDateItem.kt */
    public static final class a extends vif0<i2h> {
        public static final /* synthetic */ int p = 0;
        public final VkMiniInfoCell n;
        public i2h o;

        public a(VkMiniInfoCell vkMiniInfoCell) {
            super(vkMiniInfoCell);
            VkMiniInfoCell vkMiniInfoCell2 = (VkMiniInfoCell) this.itemView;
            this.n = vkMiniInfoCell2;
            vkMiniInfoCell2.setMode(VkMiniInfoCell.Mode.BaseAccent);
        }

        @Override // xsna.vif0
        public final void i6(i2h i2hVar) {
            String b;
            i2h i2hVar2 = i2hVar;
            j2h j2hVar = i2hVar2.g;
            if (epx.f(this.o, i2hVar2)) {
                return;
            }
            this.o = i2hVar2;
            VkMiniInfoCell.d dVar = new VkMiniInfoCell.d(new gko(R.drawable.vk_icon_calendar_outline_20), null, 6);
            VkMiniInfoCell vkMiniInfoCell = this.n;
            vkMiniInfoCell.setIcon(dVar);
            tlo0.a aVar = tlo0.Companion;
            int i = j2hVar.b;
            int i2 = j2hVar.c;
            if (i > pvo0.a() || i2 > pvo0.a()) {
                StringBuilder sb = new StringBuilder();
                if (i > 0) {
                    sb.append(pvo0.i(true, i, false, false));
                }
                if (i2 > 0) {
                    sb.append(" - ");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(i * 1000);
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(i2 * 1000);
                    if (c09.c(calendar, calendar2)) {
                        sb.append(pvo0.c(i2));
                    } else {
                        sb.append(pvo0.i(true, i2, false, false));
                    }
                }
                b = cqm0.b(sb.toString());
            } else {
                b = i2 == 0 ? this.itemView.getContext().getString(R.string.community_event_past, pvo0.i(false, i, false, false)) : this.itemView.getContext().getString(R.string.community_event_past_with_end_date, pvo0.i(false, i2, false, false));
            }
            vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(oq.d(aVar, b), false, false, false, false, null, 62));
            h2h h2hVar = (j2hVar.b > pvo0.a() || i2 > pvo0.a()) ? new h2h(0, j2hVar, this) : null;
            if (h2hVar != null) {
                qcy<Object>[] qcyVarArr = bwt0.a;
                vkMiniInfoCell.setOnClickListener(new uvt0(1000L, h2hVar));
            } else {
                qcy<Object>[] qcyVarArr2 = bwt0.a;
                vkMiniInfoCell.setOnClickListener(null);
            }
        }
    }

    public i2h(j2h j2hVar, sdz sdzVar) {
        this.g = j2hVar;
        this.h = sdzVar;
    }

    @Override // xsna.we6
    public final vif0<i2h> a(ViewGroup viewGroup) {
        int i = a.p;
        Context context = viewGroup.getContext();
        VkMiniInfoCell vkMiniInfoCell = new VkMiniInfoCell(context, null, 6);
        vkMiniInfoCell.setId(R.id.vk_community_event_date_info_item);
        vkMiniInfoCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vkMiniInfoCell.setBackgroundColor(krv0.m(R.attr.vk_ui_background_content, context));
        return new a(vkMiniInfoCell);
    }

    @Override // xsna.we6
    public final int h() {
        return this.i;
    }
}
