package defpackage;

import android.app.PendingIntent;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.adjust.sdk.Constants;
import com.squareup.moshi.Moshi;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.internal.FieldOrOneOfBinding;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.FlexModule;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.DocumentEngineCreatorHolder;
import com.yandex.fintechsdk.features.error.internal.presentation.ErrorFragment;
import com.yandex.go.address.models.FavoritesInputParams$Intention;
import com.yandex.go.explorer.impl.data.database.ExplorerDatabase_Impl;
import com.yandex.go.explorer.impl.experiments.ExplorerExperiment;
import com.yandex.go.explorer.impl.experiments.g;
import com.yandex.go.explorer.impl.geofencing.ExplorerGeofenceReceiver;
import com.yandex.go.explorer.impl.geofencing.b;
import com.yandex.go.external_service.view.ExternalServiceModalView;
import com.yandex.go.navigator.favorites.f;
import com.yandex.go.superapp.api.analytics.SuperappAnalytics$PerfClass;
import com.yandex.go.vault.ui.FlexFullscreenPopupModalView;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.ErrorContentView;
import com.yandex.runtime.image.ImageProvider;
import com.ybsdk.core.common.data.cache.StoredLayoutInfo;
import flex.engine.a;
import java.io.InputStream;
import java.util.List;
import java.util.TreeSet;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.favorites.address.impl.domain.e;
import ru.yandex.taxi.favorites.edit.presenter.d;
import ru.yandex.taxi.messenger.fallback.FallbackChatModalView;
import ru.yandex.taxi.settings.main.MainMenuProcessor$MenuEntry;

/* loaded from: classes12.dex */
public final /* synthetic */ class c1o implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c1o(zrm zrmVar, nbj nbjVar) {
        this.a = 10;
        this.b = nbjVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        sao viewModel_delegate$lambda$0;
        boolean draggableHeaderBehaviour$lambda$0;
        View insetsType$lambda$0;
        ProtoAdapter adapter_delegate$lambda$0;
        View insetsType$lambda$02;
        zy11 provideErrorControllerProvider$lambda$3$lambda$1;
        boolean provideErrorControllerProvider$lambda$3$lambda$2;
        a aVar;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((d1o) ((jdj) obj).w).h();
                return zy11Var;
            case 1:
                View inflate = LayoutInflater.from(((com.yandex.messaging.internal.view.timeline.overlay.a) obj).B.getContext()).inflate(olh0.msg_v_ephemeral_label, (ViewGroup) null, false);
                if (inflate != null) {
                    TextView textView = (TextView) inflate.findViewById(e9h0.text);
                    return new j5o(inflate, textView, textView.getPaddingStart(), textView.getPaddingEnd(), textView.getCompoundDrawablePadding(), textView.getText());
                }
                ny61.t("null cannot be cast to non-null type android.view.View");
                return null;
            case 2:
                return (ClipboardManager) ((ErrorContentView) obj).getContext().getSystemService("clipboard");
            case 3:
                viewModel_delegate$lambda$0 = ErrorFragment.viewModel_delegate$lambda$0((ErrorFragment) obj);
                return viewModel_delegate$lambda$0;
            case 4:
                List list = rro.c;
                TreeSet treeSet = ((rro) obj).a;
                if (treeSet == null) {
                    return list;
                }
                treeSet.addAll(list);
                return kotlin.collections.a.J0(treeSet);
            case 5:
                return new kto((ExplorerDatabase_Impl) obj);
            case 6:
                return ((jbh) ((g) obj).a).e(ExplorerExperiment.j);
            case 7:
                Context context = ((vto) obj).a;
                return PendingIntent.getBroadcast(context, 80766, new Intent(context, (Class<?>) ExplorerGeofenceReceiver.class), (Build.VERSION.SDK_INT >= 31 ? SelfTester_JCP.DECRYPT_CFB : 0) | SelfTester_JCP.DECRYPT_CNT);
            case 8:
                return bdz.a(((b) obj).a);
            case 9:
                hhw hhwVar = ((m1p) obj).a;
                return new k930((on2) hhwVar.d, new i930(), (tt2) hhwVar.e);
            case 10:
                String d = ((com.yandex.go.performance_class.a) ((nbj) obj)).d();
                if (jl40.l(d, Constants.LOW)) {
                    return SuperappAnalytics$PerfClass.Low;
                }
                if (jl40.l(d, "medium")) {
                    return SuperappAnalytics$PerfClass.Medium;
                }
                if (jl40.l(d, Constants.HIGH)) {
                    return SuperappAnalytics$PerfClass.High;
                }
                if (jl40.l(d, "unknown")) {
                    return SuperappAnalytics$PerfClass.Unknown;
                }
                xby.l(jst.e, "EATSKIT:PERF_CLASS", null, null, "Unknown device perfomance class", 6);
                return SuperappAnalytics$PerfClass.Unknown;
            case 11:
                draggableHeaderBehaviour$lambda$0 = ExternalServiceModalView.draggableHeaderBehaviour$lambda$0((ExternalServiceModalView) obj);
                return Boolean.valueOf(draggableHeaderBehaviour$lambda$0);
            case 12:
                insetsType$lambda$0 = FallbackChatModalView.insetsType$lambda$0((FallbackChatModalView) obj);
                return insetsType$lambda$0;
            case 13:
                return new hcp((pgz) obj);
            case 14:
                ((cgp) ((d) obj).Dg()).showAddressSearchModal();
                return zy11Var;
            case 15:
                ((AnimatedListItemInputComponent) obj).clearInputFocus();
                return zy11Var;
            case 16:
                ((ru.yandex.taxi.favorites.address.impl.domain.d) obj).d.b(MainMenuProcessor$MenuEntry.MY_ADDRESSES, new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.FALSE));
                return zy11Var;
            case 17:
                ((e) obj).d.b(MainMenuProcessor$MenuEntry.MY_ADDRESSES, new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.FALSE));
                return zy11Var;
            case 18:
                return ImageProvider.fromBitmap(u8b1.g(tje.y(f1h0.route_end_point, ((f) obj).f)));
            case 19:
                return new kjp((ljp) obj);
            case 20:
                com.yandex.go.taxi.order.feed.data.a aVar2 = (com.yandex.go.taxi.order.feed.data.a) obj;
                InputStream openRawResource = aVar2.e.getResources().openRawResource(dxh0.zero_document);
                ndx a = ((d0m) aVar2.a.get()).a(new l0o(27));
                zcx a2 = tje.a(a.a, new sx(a, 2));
                return (ywl) ((jg90) new odx(a2, gtq0.B(a2.b, qoi0.a(ywl.class))).a(openRawResource)).a;
            case 21:
                c231 g = ((frq) obj).a.g("need_to_hide_feed_container");
                if (g instanceof u131) {
                    return (u131) g;
                }
                return null;
            case 22:
                adapter_delegate$lambda$0 = FieldOrOneOfBinding.adapter_delegate$lambda$0((FieldOrOneOfBinding) obj);
                return adapter_delegate$lambda$0;
            case 23:
                return ((Moshi) ((m) obj).a).adapter(StoredLayoutInfo.class);
            case 24:
                return ((at2) ((jdj) obj).c).n();
            case 25:
                return Integer.valueOf(((yx40) obj).getIntValue());
            case 26:
                insetsType$lambda$02 = FlexFullscreenPopupModalView.insetsType$lambda$0((FlexFullscreenPopupModalView) obj);
                return insetsType$lambda$02;
            case 27:
                provideErrorControllerProvider$lambda$3$lambda$1 = FlexModule.provideErrorControllerProvider$lambda$3$lambda$1((p85) obj);
                return provideErrorControllerProvider$lambda$3$lambda$1;
            case 28:
                provideErrorControllerProvider$lambda$3$lambda$2 = FlexModule.provideErrorControllerProvider$lambda$3$lambda$2((c190) obj);
                return Boolean.valueOf(provideErrorControllerProvider$lambda$3$lambda$2);
            default:
                aVar = ((DocumentEngineCreatorHolder) obj).get();
                return aVar;
        }
    }

    public /* synthetic */ c1o(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
