package xsna;

import android.content.Context;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.feature.music.configuration.MusicSearchCatalogConfiguration;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.paging.list.VkErrorView;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.music.analytics.api.di.MusicAnalyticsComponent;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.newsfeed.posting.api.di.Posting2Component;
import com.vk.newsfeed.posting.geo_picker.presentation.a;
import com.vk.poll.fragments.PollVotersFragment;
import com.vk.profile.core.scheduled_clips.g;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment;
import com.vkontakte.android.R;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import xsna.nn20;
import xsna.pn60;
import xsna.tmd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class pp00 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pp00(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v76, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v83, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = true;
        int i2 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                return com.vk.clips.sdk.shared.item.market_ads.b.l((com.vk.clips.sdk.shared.item.market_ads.b) obj);
            case 1:
                ((j210) obj).h6();
                return s3q0.a;
            case 2:
                return Integer.valueOf(((List) obj).size());
            case 3:
                f910 f910Var = (f910) obj;
                Context context = f910Var.c;
                c810 c810Var = f910Var.b;
                TypedValue typedValue = krv0.a;
                return up2.e(f910Var, context, c810Var, epx.f(krv0.i(context), Boolean.TRUE));
            case 4:
                ((zak0) ((nn20.a) obj).h).setValue(Boolean.valueOf(!((Boolean) ((zak0) r1).getValue()).booleanValue()));
                return s3q0.a;
            case 5:
                hk30 hk30Var = (hk30) obj;
                TextPaint textPaint = new TextPaint();
                textPaint.setColor(-16777216);
                com.vk.typography.b.c(textPaint, hk30Var.a, FontFamily.REGULAR, Float.valueOf(hk30Var.b.b(R.dimen.vkim_msg_part_snippet_description_size)), TextSizeUnit.PX);
                return textPaint;
            case 6:
                vm30 vm30Var = (vm30) obj;
                boolean z2 = vm30Var.q0;
                RecyclerView recyclerView = vm30Var.u;
                if (z2) {
                    vm30Var.L.l(null);
                }
                lgh0 lgh0Var = vm30Var.a0;
                recyclerView.removeOnScrollListener(lgh0Var.d);
                recyclerView.removeOnScrollListener(lgh0Var.e);
                if (lgh0Var.a.isInitialized()) {
                    lgh0Var.b.g(lgh0Var.a());
                }
                lgh0Var.g = 0;
                lgh0Var.h = false;
                lgh0Var.i = false;
                lgh0Var.j = false;
                vci0 remove = vci0.p.remove(recyclerView);
                if (remove != null) {
                    recyclerView.removeItemDecoration(remove);
                }
                yau remove2 = yau.l.remove(recyclerView);
                if (remove2 != null) {
                    recyclerView.removeItemDecoration(remove2);
                }
                recyclerView.swapAdapter(null, false);
                return s3q0.a;
            case 7:
                return new xcj((a1w) obj);
            case 8:
                MusicCatalogRootVh musicCatalogRootVh = (MusicCatalogRootVh) obj;
                if (com.vk.toggle.d.K() && musicCatalogRootVh.i0()) {
                    musicCatalogRootVh.B.a().a(false, true);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                return ((MusicAnalyticsComponent) ((k7m) m7m.f((MusicMyAudiosCatalogRootVh) obj)).a(fpf0.a(MusicAnalyticsComponent.class))).Bd();
            case 10:
                return ((MarketComponent) ((k7m) m7m.f((MusicSearchCatalogConfiguration) obj)).a(fpf0.a(MarketComponent.class))).U1();
            case 11:
                return new q650((l650) obj);
            case 12:
                AppCompatTextView appCompatTextView = new AppCompatTextView(((j660) obj).a);
                appCompatTextView.setId(R.id.title);
                appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                appCompatTextView.setTextColor(-16777216);
                com.vk.typography.b.k(appCompatTextView, FontFamily.REGULAR, Float.valueOf(14.0f), 4);
                appCompatTextView.setGravity(8388611);
                int a = iah0.a(8);
                int a2 = iah0.a(12);
                appCompatTextView.setPadding(a2, a, a2, a);
                return appCompatTextView;
            case 13:
                return ((Posting2Component) ((k7m) m7m.f((q860) obj)).mo408a(fpf0.a(Posting2Component.class))).w8();
            case 14:
                return ((NewsfeedFragment) obj).o0;
            case 15:
                sra0 sra0Var = (sra0) obj;
                if (!jjc.b()) {
                    sra0Var.c.yi(a.b.C1408a.b);
                }
                return s3q0.a;
            case 16:
                return ((PlayerAnalyticsComponent) ((k7m) m7m.f((vva0) obj)).a(fpf0.a(PlayerAnalyticsComponent.class))).mb();
            case 17:
                qcy<Object>[] qcyVarArr = PlaylistScreenFragment.T;
                PlaylistScreenFragmentInternalComponent go = ((PlaylistScreenFragment) obj).go();
                go.getClass();
                return new cn50(up2.d(new m130(go, 20), new scb0(go, i2), svj.b));
            case 18:
                gjb0 gjb0Var = ((cib0) obj).c;
                if (gjb0Var != null) {
                    gjb0Var.E1();
                }
                return s3q0.a;
            case 19:
                return (ViewGroup) ((hpb0) obj).g(R.id.poll_option_container);
            case 20:
                ((VkErrorView) ((ee) obj)).a();
                return s3q0.a;
            case 21:
                mc90 mc90Var = (mc90) obj;
                int i3 = PollVotersFragment.a0;
                return Integer.valueOf((mc90Var.l() < 0.5f || mc90Var.k() >= mc90Var.o() - 1) ? mc90Var.k() : mc90Var.k() + 1);
            case 22:
                ((bzb0) obj).d = null;
                return s3q0.a;
            case 23:
                r1c0 r1c0Var = (r1c0) obj;
                mo60 mo60Var = r1c0Var.a;
                return new hv50(mo60Var.X, mo60Var.Y, ((NewsFeedComponent) r1c0Var.c.getValue()).cc());
            case 24:
                y8c0 y8c0Var = (y8c0) obj;
                qn60 qn60Var = new qn60(new zyp0());
                y8c0Var.n = qn60Var;
                ?? r1 = y8c0Var.a().b;
                s1c0 s1c0Var = (s1c0) y8c0Var.l.getValue();
                String str = (String) ((AtomicReference) y8c0Var.j.getValue()).get();
                bpn0 bpn0Var = y8c0Var.k;
                pn60 pn60Var = new pn60(new pn60.a(s1c0Var, str, (String) ((AtomicReference) bpn0Var.getValue()).get()), r1);
                y8c0Var.o = pn60Var;
                r1c0 a3 = y8c0Var.a();
                AtomicReference atomicReference = (AtomicReference) bpn0Var.getValue();
                f0c0 f0c0Var = y8c0Var.a;
                eh60 eh60Var = new eh60(((NewsFeedBridgeComponent) a3.b.getValue()).Ad().a().p());
                rn60.a(qn60Var);
                f8c0 f8c0Var = new f8c0(atomicReference);
                UiTracker uiTracker = UiTracker.a;
                com.vk.channels.impl.channel_screen.send_msg.c cVar = new com.vk.channels.impl.channel_screen.send_msg.c((bin0) f8c0Var);
                s1v s1vVar = new s1v();
                zq70 zq70Var = new zq70();
                mo60 mo60Var2 = a3.a;
                return new r5c0(new s5c0(qn60Var, pn60Var, eh60Var, s1vVar, mo60Var2, new AtomicReference(new wn60((byte) 0)), zq70Var, f0c0Var, cVar, new g5c0(new c6c0(), new k5c0(), new f5c0()), fs60.a(qn60Var, pn60Var, cVar, mo60Var2)));
            case 25:
                com.vk.newsfeed.impl.items.posting.item.modals.b bVar = (com.vk.newsfeed.impl.items.posting.item.modals.b) obj;
                bVar.b.L3(bVar.a.h);
                return s3q0.a;
            case 26:
                return ((ClassifiedsComponent) ((rkd0) obj).b.getValue()).dc();
            case 27:
                ((ml1) obj).invoke(tmd0.b.a);
                return s3q0.a;
            case 28:
                return LayoutInflater.from((Context) obj).inflate(R.layout.dialog_profile_tab_options, (ViewGroup) null);
            default:
                ((dee0) obj).c.a(g.c.a);
                return s3q0.a;
        }
    }
}
