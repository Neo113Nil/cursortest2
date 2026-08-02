package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.semantics.f;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderFeedback;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.mapkit.maps.core.utils.ExperimentStringParser;
import com.yandex.payment.sdk.ui.view.ExpirationDateView;
import com.yandex.payment.sdk.ui.view.card.ExpirationDateInput;
import com.yandex.quark.js.event.h;
import com.yandex.xplat.payment.sdk.FamilyInfo;
import defpackage.v4j0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes13.dex */
public final /* synthetic */ class l0o implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ l0o(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        List pointsFromExperiment$lambda$0;
        List pointsFromExperiment$lambda$1;
        boolean pointsFromExperiment$lambda$2;
        zy11 callback$lambda$0;
        zy11 inputEventListener$lambda$0;
        zy11 inputEventListener$lambda$02;
        switch (this.a) {
            case 0:
                m0o m0oVar = new m0o((View) obj, r3);
                aiy aiyVar = aiy.a;
                m0oVar.T = aiyVar;
                m0oVar.U = aiyVar;
                ListItemComponent listItemComponent = (ListItemComponent) ((View) m0oVar.R);
                m0oVar.V = new dpu(listItemComponent.getLeadImageView(), null);
                fh4.g(listItemComponent.subtitle());
                return m0oVar;
            case 1:
                f.p((mnq0) obj, 0);
                return zy11.a;
            case 2:
                f.p((mnq0) obj, 0);
                return zy11.a;
            case 3:
                return Long.valueOf(((Long) obj).longValue() * 2);
            case 4:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 5:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 6:
                return new h();
            case 7:
                ((v4j0.a) obj).a = false;
                return zy11.a;
            case 8:
                return new epo((bex0) obj);
            case 9:
                pointsFromExperiment$lambda$0 = ExperimentStringParser.toPointsFromExperiment$lambda$0((String) obj);
                return pointsFromExperiment$lambda$0;
            case 10:
                pointsFromExperiment$lambda$1 = ExperimentStringParser.toPointsFromExperiment$lambda$1((List) obj);
                return pointsFromExperiment$lambda$1;
            case 11:
                pointsFromExperiment$lambda$2 = ExperimentStringParser.toPointsFromExperiment$lambda$2((List) obj);
                return Boolean.valueOf(pointsFromExperiment$lambda$2);
            case 12:
                try {
                    ((oll0) obj).T0("DELETE FROM experiments").q();
                    return null;
                } finally {
                }
            case 13:
                callback$lambda$0 = ExpirationDateInput.callback$lambda$0(((Boolean) obj).booleanValue());
                return callback$lambda$0;
            case 14:
                inputEventListener$lambda$0 = ExpirationDateInput.inputEventListener$lambda$0((czv) obj);
                return inputEventListener$lambda$0;
            case 15:
                inputEventListener$lambda$02 = ExpirationDateView.inputEventListener$lambda$0((czv) obj);
                return inputEventListener$lambda$02;
            case 16:
                ull0 T0 = ((oll0) obj).T0("SELECT hexId FROM explorer_discovered_hex WHERE isViewed = 1");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        arrayList.add(Long.valueOf(T0.getLong(0)));
                    }
                    return arrayList;
                } finally {
                }
            case 17:
                ull0 T02 = ((oll0) obj).T0("SELECT COUNT(*) FROM explorer_discovered_hex WHERE isViewed = 0");
                try {
                    r3 = T02.q() ? (int) T02.getLong(0) : 0;
                    T02.close();
                    return Integer.valueOf(r3);
                } finally {
                }
            case 18:
                ull0 T03 = ((oll0) obj).T0("DELETE FROM explorer_discovered_hex WHERE isConfirmed = 0");
                try {
                    T03.q();
                    T03.close();
                    return zy11.a;
                } finally {
                }
            case 19:
                ull0 T04 = ((oll0) obj).T0("SELECT * FROM explorer_discovered_hex");
                try {
                    int r = eja1.r(T04, "hexId");
                    int r2 = eja1.r(T04, "unlockedAt");
                    int r3 = eja1.r(T04, "isConfirmed");
                    int r4 = eja1.r(T04, "isViewed");
                    ArrayList arrayList2 = new ArrayList();
                    while (T04.q()) {
                        arrayList2.add(new ito(T04.getLong(r), T04.getLong(r2), ((int) T04.getLong(r3)) != 0, ((int) T04.getLong(r4)) != 0));
                    }
                    return arrayList2;
                } finally {
                }
            case 20:
                ull0 T05 = ((oll0) obj).T0("SELECT * FROM explorer_discovered_hex WHERE isViewed = 0 ORDER BY unlockedAt ASC");
                try {
                    int r5 = eja1.r(T05, "hexId");
                    int r6 = eja1.r(T05, "unlockedAt");
                    int r7 = eja1.r(T05, "isConfirmed");
                    int r8 = eja1.r(T05, "isViewed");
                    ArrayList arrayList3 = new ArrayList();
                    while (T05.q()) {
                        arrayList3.add(new ito(T05.getLong(r5), T05.getLong(r6), ((int) T05.getLong(r7)) != 0, ((int) T05.getLong(r8)) != 0));
                    }
                    return arrayList3;
                } finally {
                }
            case 21:
                ull0 T06 = ((oll0) obj).T0("UPDATE explorer_discovered_hex SET isViewed = 1 WHERE isViewed = 0");
                try {
                    T06.q();
                    T06.close();
                    return zy11.a;
                } finally {
                }
            case 22:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case 23:
                ViewGroup viewGroup = (ViewGroup) obj;
                return qdj0.o(LayoutInflater.from(viewGroup.getContext()), viewGroup).b;
            case 24:
                wj00 b2 = ((y3x) obj).b();
                String p = b2.p("uid");
                wj00 b3 = b2.l("family_info").b();
                String p2 = b3.p("family_id");
                int o = b3.o("expenses");
                int o2 = b3.o("limit");
                String p3 = b3.p("currency");
                String p4 = b3.p("frame");
                Boolean f = b3.f("unlimited");
                return new FamilyInfo(p, p2, o, o2, p3, p4, f != null ? f.booleanValue() : false);
            case 25:
                ListItemComponent listItemComponent2 = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemComponent2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                listItemComponent2.setMinimumHeight(tje.u(56, listItemComponent2.getContext()));
                listItemComponent2.setSubTitleEllipsizeMode(1);
                listItemComponent2.setSubtitleMaxLines(2);
                listItemComponent2.setSubtitleTextSizePx((int) tje.b0(listItemComponent2.getContext(), 13.0f));
                listItemComponent2.setSubtitleTypeface(0);
                listItemComponent2.setTitleEllipsizeMode(1);
                listItemComponent2.setTitleMaxLines(1);
                listItemComponent2.setTitleTextSizePx((int) tje.b0(listItemComponent2.getContext(), 16.0f));
                listItemComponent2.setTitleTypeface(0);
                listItemComponent2.setTrailMode(1);
                listItemComponent2.setTrailImage(izg0.ic_three_vertical_dots);
                return listItemComponent2;
            case 26:
                return zy11.a;
            case 27:
                return zy11.a;
            case 28:
                TaxiOrder taxiOrder = (TaxiOrder) obj;
                taxiOrder.getClass();
                synchronized (taxiOrder) {
                    TaxiOrderLocalData taxiOrderLocalData = taxiOrder.l;
                    TaxiOrderFeedback taxiOrderFeedback = taxiOrderLocalData.W;
                    taxiOrderFeedback.getClass();
                    taxiOrder.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, TaxiOrderFeedback.a(taxiOrderFeedback, null, null, null, null, null, null, null, null, HProv.PP_VERSION_TIMESTAMP), false, null, false, null, null, null, -1, 16711679);
                }
                return zy11.a;
            default:
                return ((mfz0) obj).a();
        }
    }
}
