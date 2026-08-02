package xsna;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.g;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListTabletVh;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import java.util.Calendar;
import xsna.fvz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class k1l implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k1l(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                final n1l n1lVar = (n1l) this.c;
                FragmentManager fragmentManager = (FragmentManager) this.d;
                long Hn = com.google.android.material.datepicker.g.Hn();
                CalendarConstraints.b bVar = new CalendarConstraints.b();
                bVar.a = Hn;
                bVar.e = new DateValidatorPointForward(Hn);
                CalendarConstraints a = bVar.a();
                g.d<Long> b = g.d.b();
                b.d = Long.valueOf(n1lVar.d.getTimeInMillis());
                b.b = a;
                com.google.android.material.datepicker.g<Long> a2 = b.a();
                a2.Td(fragmentManager, "datepicker");
                a2.x.add(new lm10() { // from class: xsna.l1l
                    @Override // xsna.lm10
                    public final void a(Object obj) {
                        long currentTimeMillis;
                        long currentTimeMillis2;
                        n1l n1lVar2 = n1l.this;
                        Calendar calendar = n1lVar2.d;
                        Calendar d = pvo0.d();
                        d.setTimeInMillis(((Long) obj).longValue());
                        int i = d.get(1);
                        int i2 = d.get(2);
                        int i3 = d.get(5);
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTimeInMillis(calendar.getTimeInMillis());
                        calendar2.set(i, i2, i3);
                        long timeInMillis = calendar2.getTimeInMillis();
                        boolean z = n1lVar2.e;
                        if (z) {
                            xuo0.a.getClass();
                            currentTimeMillis = xuo0.a();
                        } else {
                            currentTimeMillis = System.currentTimeMillis();
                        }
                        boolean z2 = timeInMillis < currentTimeMillis + n1lVar2.f;
                        long timeInMillis2 = calendar2.getTimeInMillis();
                        if (z) {
                            xuo0.a.getClass();
                            currentTimeMillis2 = xuo0.a();
                        } else {
                            currentTimeMillis2 = System.currentTimeMillis();
                        }
                        boolean z3 = timeInMillis2 > currentTimeMillis2 + n1lVar2.g;
                        if (z2 || z3) {
                            cvk.w(z2 ? n1lVar2.h : n1lVar2.i, false);
                        } else {
                            calendar.set(i, i2, i3);
                            n1lVar2.a();
                        }
                    }
                });
                break;
            case 1:
                ((rlz) this.c).l.invoke(((mlz) this.d).b);
                break;
            case 2:
                wzs wzsVar = (wzs) this.c;
                lvz lvzVar = (lvz) this.d;
                view.performHapticFeedback(0);
                fvz.a aVar = (fvz.a) lvzVar.m;
                wzsVar.invoke(aVar.b, Boolean.valueOf(aVar.c));
                break;
            default:
                ((VideoItemListTabletVh) this.c).e(((DonutVideoUiModel.PreviewBadge) this.d).e, DonutVideoClickSource.PAYWALL);
                break;
        }
    }
}
