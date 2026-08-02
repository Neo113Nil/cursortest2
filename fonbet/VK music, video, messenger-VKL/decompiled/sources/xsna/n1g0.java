package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import com.vk.catalog.mvi.section.ui.entity.CatalogBlockData;
import com.vk.dto.common.VideoFile;
import com.vk.im.ui.components.attaches_history.attaches.pagination.PageLoadingState;
import com.vk.log.L;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsListFragment;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import ru.ok.android.externcalls.analytics.events.SdkIntervalStatEvent;
import xsna.t7z;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class n1g0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ n1g0(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [xsna.cvk] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        CharSequence string$lambda$0;
        int i = 1;
        switch (this.b) {
            case 0:
                return ((CatalogBlockData) obj).g().w().getId();
            case 1:
                List list = (List) obj;
                Object obj2 = list.get(0);
                float f = t7z.a.b;
                j2h0 j2h0Var = i2h0.D;
                Boolean bool = Boolean.FALSE;
                epx.f(obj2, bool);
                float f2 = (obj2 != null ? (t7z.a) j2h0Var.c.invoke(obj2) : null).a;
                Object obj3 = list.get(1);
                j2h0 j2h0Var2 = i2h0.E;
                epx.f(obj3, bool);
                int i2 = (obj3 != null ? (t7z.c) j2h0Var2.c.invoke(obj3) : null).a;
                Object obj4 = list.get(2);
                j2h0 j2h0Var3 = i2h0.F;
                epx.f(obj4, bool);
                return new t7z(f2, i2, (obj4 != null ? (t7z.b) j2h0Var3.c.invoke(obj4) : null).a);
            case 2:
                Uri uri = (Uri) obj;
                if (feh0.a(uri)) {
                    io.reactivex.rxjava3.disposables.b bVar = feh0.h;
                    kg90 kg90Var = feh0.d;
                    if (kg90Var == null) {
                        kg90Var = null;
                    }
                    ?? r5 = feh0.b;
                    t7z.b bVar2 = r5 != 0 ? r5 : null;
                    Context context = kg90Var.a;
                    bVar2.getClass();
                    int i3 = 12;
                    bVar.b(io.reactivex.rxjava3.internal.operators.observable.g0.b.r0(io.reactivex.rxjava3.schedulers.a.b()).L(new l340(new el30(kg90Var, i3), 4), false).subscribe(new c120(new zb60(uri, 20), 23), new be50(new y5z(uri, i), i3)));
                }
                return s3q0.a;
            case 3:
                string$lambda$0 = SdkIntervalStatEvent.toString$lambda$0((Map.Entry) obj);
                return string$lambda$0;
            case 4:
                L.g("SessionDebugInfoAggregator", (Throwable) obj);
                return s3q0.a;
            case 5:
                int i4 = SettingsListFragment.X0;
                return s3q0.a;
            case 6:
                return new mki0((ViewGroup) obj);
            case 7:
                qgi0.r((tgi0) obj, "product_card_stock_amount_title");
                return s3q0.a;
            case 8:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 9:
                return ((PageLoadingState) obj).Bb();
            case 10:
                return s3q0.a;
            case 11:
                return Integer.valueOf(((VideoFile) ((Optional) obj).get()).c1());
            case 12:
                return new ge90(R.layout.clips_feed_holder_pagination_loading, (ViewGroup) obj);
            case 13:
                return Boolean.valueOf(!drm0.N((String) obj));
            case 14:
                L.C("can't check whether ml models loaded or not", (Throwable) obj);
                return s3q0.a;
            case 15:
                return Boolean.valueOf(((it80) obj).a != null);
            default:
                return new ypw0((ViewGroup) obj);
        }
    }
}
