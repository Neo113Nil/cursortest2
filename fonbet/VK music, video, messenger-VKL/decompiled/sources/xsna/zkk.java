package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.modal.base.ModalAuthHostActivity;
import com.vk.auth.modal.base.ModalAuthOpenerInterface$AuthParams;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vk.ecomm.market.api.search.filters.dto.MarketCatalogFilterVM;
import com.vk.music.bottomsheets.tracker.MusicBottomSheetActionTracker;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ctb0;
import xsna.gm50;
import xsna.q640;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class zkk implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zkk(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        if (com.vk.core.apps.BuildInfo.s() == false) goto L36;
     */
    /* JADX WARN: Type inference failed for: r1v19, types: [T, xsna.wqd0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        MarketBridgeCategory b;
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj5;
                gzs gzsVar = (gzs) obj4;
                izs izsVar = (izs) obj3;
                com.vk.music.analytics.api.collector.strategy.a aVar = (com.vk.music.analytics.api.collector.strategy.a) obj2;
                v940 v940Var = (v940) obj;
                if (!ref$BooleanRef.element) {
                    ref$BooleanRef.element = true;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                }
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    izsVar.invoke(v940Var);
                } else {
                    ((Handler) aVar.g.getValue()).post(new ku5(1, izsVar, v940Var));
                }
                break;
            case 1:
                sv20 sv20Var = (sv20) obj5;
                Context context = (Context) obj4;
                ModalAuthOpenerInterface$AuthParams modalAuthOpenerInterface$AuthParams = (ModalAuthOpenerInterface$AuthParams) obj3;
                tv20 tv20Var = (tv20) obj2;
                vgg vggVar = (vgg) obj;
                Throwable th = vggVar.a;
                if (th instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                    if (vKApiExecutionException.s() == 15) {
                        if (vKApiExecutionException.C() == 1174) {
                            break;
                        }
                    }
                }
                List<String> list = ModalAuthHostActivity.h;
                Intent intent = new Intent(context, (Class<?>) ModalAuthHostActivity.class);
                intent.setFlags(603979776);
                intent.putExtra("close_required", true);
                context.startActivity(intent);
                qv20.i(context, vggVar.a, modalAuthOpenerInterface$AuthParams.c, null, modalAuthOpenerInterface$AuthParams.e, vggVar, null, new a94(sv20Var, vggVar, context), false, 576);
                tv20Var.a(th);
                break;
            case 2:
                ((q640) obj5).c((View) obj, ((q640.a) obj4).b, (prq0) obj3, (wmd0) obj2);
                break;
            case 3:
                ji80 ji80Var = (ji80) obj5;
                int i2 = ji80.n1;
                gm50.a.a(ji80Var, ((ctb0.a) obj).a, new ii80((TextView) obj4, ji80Var, (uqb0) obj3, (ViewPager2) obj2, 0));
                break;
            case 4:
                fxf0 fxf0Var = (fxf0) obj5;
                fxf0Var.a.f1((Context) obj4, (MusicTrack) obj3, (Playlist) obj2);
                MusicBottomSheetActionTracker musicBottomSheetActionTracker = fxf0Var.b;
                if (musicBottomSheetActionTracker != null) {
                    musicBottomSheetActionTracker.b(MusicBottomSheetActionTracker.Action.RemoveFromMyMusic);
                }
                break;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj4;
                MarketBridgeCategory marketBridgeCategory = (MarketBridgeCategory) obj3;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj2;
                ?? r1 = (wqd0) obj;
                int i3 = r1.a;
                MarketCatalogFilterVM marketCatalogFilterVM = ((gml0) obj5).c;
                MarketCatalogFilterVM.c b2 = marketCatalogFilterVM.b(marketCatalogFilterVM.a);
                if (b2 != null && (b = b2.b()) != null && i3 == b.b && i3 != 9000) {
                    ref$ObjectRef.element = r1;
                }
                if (i3 == marketBridgeCategory.b) {
                    ref$ObjectRef2.element = r1;
                }
                break;
        }
        return s3q0.a;
    }
}
