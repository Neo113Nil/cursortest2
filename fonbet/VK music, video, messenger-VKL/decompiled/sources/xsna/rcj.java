package xsna;

import android.content.Context;
import android.graphics.RectF;
import android.widget.LinearLayout;
import android.widget.Space;
import com.vk.core.tips.Tooltip;
import com.vk.core.tips.c;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.equ0;

/* compiled from: ContactsPromoVc.kt */
/* loaded from: classes2.dex */
public final class rcj {
    public final Context a;
    public final equ0.a b;
    public com.vk.core.tips.b c;

    public rcj(Context context, equ0.a aVar) {
        this.a = context;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[LOOP:1: B:24:0x007b->B:26:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8 A[EDGE_INSN: B:27:0x00a8->B:28:0x00a8 BREAK  A[LOOP:1: B:24:0x007b->B:26:0x0082], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(RectF rectF, ArrayList arrayList, int i) {
        int childCount;
        int i2;
        Iterator it;
        int i3;
        com.vk.core.tips.b bVar = this.c;
        if (bVar != null) {
            bVar.b(false);
        }
        this.c = null;
        qcj qcjVar = new qcj(this);
        Context context = this.a;
        tcj tcjVar = new tcj(context, qcjVar);
        if (arrayList == null || arrayList.isEmpty()) {
            tcjVar.setIconVisible(true);
            tcjVar.setActionBtnVisible(true);
            tcjVar.setActionText(context.getString(R.string.vkim_contact_landing_enable_contacts));
        } else {
            boolean z = i > 0;
            tcjVar.setActionBtnVisible(z);
            if (z) {
                tcjVar.setActionText(enj.f(R.plurals.vkim_contacts_show_more, i, context));
            }
            int childCount2 = tcjVar.getChildCount();
            if (childCount2 >= 0) {
                int i4 = 0;
                while (tcjVar.getChildAt(i4).getId() != R.id.tv_subtitle) {
                    if (i4 != childCount2) {
                        i4++;
                    }
                }
                childCount = i4 + 1;
                Space space = new Space(tcjVar.getContext());
                float f = 8;
                space.setLayoutParams(new LinearLayout.LayoutParams(-1, iah0.a(f)));
                i2 = childCount + 1;
                tcjVar.addView(space, childCount);
                it = arrayList.iterator();
                while (true) {
                    i3 = i2;
                    if (it.hasNext()) {
                        break;
                    }
                    qaj qajVar = new qaj(tcjVar.getContext(), (qtd0) it.next());
                    jjc.g(qajVar, new lpd(1, tcjVar, tcj.class, "onContactClick", "onContactClick(Landroid/view/View;)V", 0, 3));
                    i2 = i3 + 1;
                    tcjVar.addView(qajVar, i3);
                }
                Space space2 = new Space(tcjVar.getContext());
                space2.setLayoutParams(new LinearLayout.LayoutParams(-1, iah0.a(f)));
                tcjVar.addView(space2, i3);
                tcjVar.setCaptionDescriptionVisible(true);
            }
            childCount = tcjVar.getChildCount();
            Space space3 = new Space(tcjVar.getContext());
            float f2 = 8;
            space3.setLayoutParams(new LinearLayout.LayoutParams(-1, iah0.a(f2)));
            i2 = childCount + 1;
            tcjVar.addView(space3, childCount);
            it = arrayList.iterator();
            while (true) {
                i3 = i2;
                if (it.hasNext()) {
                }
                qaj qajVar2 = new qaj(tcjVar.getContext(), (qtd0) it.next());
                jjc.g(qajVar2, new lpd(1, tcjVar, tcj.class, "onContactClick", "onContactClick(Landroid/view/View;)V", 0, 3));
                i2 = i3 + 1;
                tcjVar.addView(qajVar2, i3);
            }
            Space space22 = new Space(tcjVar.getContext());
            space22.setLayoutParams(new LinearLayout.LayoutParams(-1, iah0.a(f2)));
            tcjVar.addView(space22, i3);
            tcjVar.setCaptionDescriptionVisible(true);
        }
        c.b bVar2 = new c.b(0);
        float height = rectF.height() / 2;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        rectF.set(centerX - height, centerY - height, centerX + height, centerY + height);
        this.c = Tooltip.l(new Tooltip(tcjVar.getContext(), "", "", Tooltip.WindowStyle.FULLSCREEN, null, null, null, dhr0.t.c(R.attr.vk_legacy_modal_card_background), 0, null, 1.0f, null, 0, true, null, 0, false, new m2g(tcjVar, 8), null, bVar2, null, null, null, null, null, 0.3f, null, null, false, 0, null, null, null, null, -34219152, 15), tcjVar.getContext(), rectF, false, false, false, false, 248);
    }
}
