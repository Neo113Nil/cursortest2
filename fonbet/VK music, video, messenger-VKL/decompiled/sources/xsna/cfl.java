package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.catalog.mvi.legacy.api.CatalogLegacyComponent;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Peer;
import com.vk.dto.music.Playlist;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.im.ui.fragments.ImCreateChatControlParamsFragment;
import com.vk.music.fragment.api.di.MusicFragmentComponent;
import com.vk.music.fragment.impl.MusicOfflineCatalogFragment;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.restriction.di.VideoRestrictionManagerComponent;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.VkEcosystemProfileButtonView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.ejd0;
import xsna.ga60;
import xsna.kbb0;
import xsna.pb20;
import xsna.s1c0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class cfl implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cfl(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x02ac, code lost:
    
        if ((r3 + (r4 != null ? r4.getSize() : 0)) <= r0.h()) goto L120;
     */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        xuy xuyVar;
        ExposedFunction invoke$lambda$32;
        Object obj;
        Object parcelable;
        x64 x64Var;
        Context mo2getContext;
        Resources resources;
        Configuration configuration;
        int i = this.b;
        boolean z = true;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(((efl) obj2).a);
                return mediaMetadataRetriever;
            case 1:
                return new k2l((View) ((cil) obj2).b.getValue());
            case 2:
                egm egmVar = (egm) obj2;
                VkImageSimple vkImageSimple = new VkImageSimple(egmVar.d, null, 6, 0);
                omw.d(vkImageSimple, R.drawable.vk_icon_message_cross_16, R.attr.vk_ui_icon_tertiary);
                vkImageSimple.setContentDescription(null);
                vkImageSimple.setLayoutParams(egm.W(egmVar, cn70.b(16), cn70.b(16), cn70.b(4), (int) (cn70.a() * 1.8f), 0, 0, 48));
                egmVar.b.addView(vkImageSimple);
                return vkImageSimple;
            case 3:
                View inflate = LayoutInflater.from(((r2o) obj2).e).inflate(R.layout.view_posting_donut_item, (ViewGroup) null, false);
                ((TextView) inflate.findViewById(R.id.posting_donut_item_text)).setText(R.string.newsfeed_settings_donut_visibility_dones);
                return inflate;
            case 4:
                RecyclerView recyclerView = (RecyclerView) ((g7o) obj2).b.get();
                if (recyclerView != null) {
                    return recyclerView.getResources();
                }
                return null;
            case 5:
                return Integer.valueOf(((wak0) ((jgh0) obj2).a).getIntValue());
            case 6:
                return (VkEcosystemProfileButtonView) ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f) obj2).c.findViewById(R.id.vk_id_lk_button);
            case 7:
                return new e9l(((Number) ((EntriesListPresenter) obj2).x.getValue()).intValue());
            case 8:
                fvy j = ((xvy) obj2).j();
                xuy xuyVar2 = (xuy) j5g.k0(j.f());
                if (xuyVar2 != null && xuyVar2.getIndex() == j.d() - 1 && (xuyVar = (xuy) j5g.k0(j.f())) != null) {
                    int offset = xuyVar.getOffset();
                    xuy xuyVar3 = (xuy) j5g.k0(j.f());
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            case 9:
                com.vk.core.view.components.tabs.e eVar = ((t1s) obj2).s;
                (eVar != null ? eVar : null).c();
                return s3q0.a;
            case 10:
                t4t t4tVar = ((GalleryFragmentImpl) obj2).R;
                return new c6a0(t4tVar.l, t4tVar.E);
            case 11:
                yct yctVar = (yct) obj2;
                yctVar.j1.invoke();
                yctVar.dismiss();
                return s3q0.a;
            case 12:
                j3u j3uVar = (j3u) obj2;
                s1c0.a aVar = new s1c0.a();
                aVar.b = true;
                aVar.a = true;
                aVar.q = true;
                sf2 sf2Var = new sf2();
                Context context = e43.a;
                sf2Var.b = context != null ? context : null;
                aVar.s = sf2Var.a();
                aVar.w = true;
                aVar.E = ((Boolean) j3uVar.d.getValue()).booleanValue();
                int i2 = y1z.a;
                LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                aVar.J = false;
                return aVar.a();
            case 13:
                GoodFragment goodFragment = (GoodFragment) obj2;
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                goodFragment.Qo().b(ejd0.c.b.b);
                goodFragment.Fo();
                return s3q0.a;
            case 14:
                invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32((HandleInvocationsFromAdViewer) obj2);
                return invoke$lambda$32;
            case 15:
                HighlightEditFragment highlightEditFragment = (HighlightEditFragment) obj2;
                int i3 = HighlightEditFragment.h0;
                ((u4v) highlightEditFragment.S).o4(((tho0) ((zak0) highlightEditFragment.a0).getValue()).a.c);
                return s3q0.a;
            case 16:
                return ((View) obj2).getContext().getString(R.string.accessibility_open_notifications);
            case 17:
                int i4 = ImCreateChatControlParamsFragment.b0;
                Bundle arguments = ((ImCreateChatControlParamsFragment) obj2).getArguments();
                if (arguments != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = arguments.getParcelable("owner_id", Peer.class);
                        obj = (Parcelable) parcelable;
                    } else {
                        Object parcelable2 = arguments.getParcelable("owner_id");
                        obj = (Peer) (parcelable2 instanceof Peer ? parcelable2 : null);
                    }
                    Peer peer = (Peer) obj;
                    if (peer != null) {
                        return peer;
                    }
                }
                return Peer.Unknown.e;
            case 18:
                io2 io2Var = ((com.vk.im.video.g) obj2).u;
                if (io2Var != null) {
                    io2Var.C();
                }
                return s3q0.a;
            case 19:
                ykw ykwVar = (ykw) obj2;
                Attachment attachment = ykwVar.c;
                if (attachment != null && (x64Var = ykwVar.q) != null) {
                    x64Var.f(attachment);
                }
                return s3q0.a;
            case 20:
                return new ov70(((nc00) obj2).D);
            case 21:
                pb20 pb20Var = (pb20) obj2;
                pb20.a aVar2 = pb20.k1;
                vyt0 vyt0Var = new vyt0(pb20Var.getViewModelStore(), new qyt0(wb20.class, new bih(pb20Var, 26)), pb20Var.getDefaultViewModelCreationExtras());
                rfc a = fpf0.a(wb20.class);
                String h = a.h();
                if (h != null) {
                    return (wb20) vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h), a);
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            case 22:
                Context context2 = ((up30) obj2).e;
                return new ek30(context2 != null ? context2 : null, 0);
            case 23:
                return ((VideoRestrictionManagerComponent) ((k7m) m7m.f((vf40) obj2)).a(fpf0.a(VideoRestrictionManagerComponent.class))).n2();
            case 24:
                return ((CatalogLegacyComponent) ((k7m) m7m.f((uo40) obj2)).a(fpf0.a(CatalogLegacyComponent.class))).qf();
            case 25:
                int i5 = MusicOfflineCatalogFragment.X;
                return ((MusicFragmentComponent) m7m.d((MusicOfflineCatalogFragment) obj2).a(fpf0.a(MusicFragmentComponent.class))).v2();
            case 26:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj2;
                StringBuilder sb = new StringBuilder("Albums to import: ");
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    arrayList.add(((Number) entry.getKey()).intValue() + " -> " + ((Playlist) entry.getValue()).Ib());
                }
                sb.append(j5g.g0(arrayList, null, null, null, 0, null, 63));
                return sb.toString();
            case 27:
                return Boolean.valueOf(((k150) obj2).j.getValue() instanceof kbb0.a);
            case 28:
                m760 m760Var = (m760) obj2;
                int i6 = m760.A;
                Bundle arguments2 = m760Var.getArguments();
                Integer d = arguments2 != null ? bo8.d(arguments2, "APP_ORIENTATION_KEY") : null;
                if ((d == null || d.intValue() != 1) && (d == null || d.intValue() != 0 || (mo2getContext = m760Var.mo2getContext()) == null || (resources = mo2getContext.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                return ((NewsFeedComponent) ((k7m) m7m.f((ga60.a) obj2)).a(fpf0.a(NewsFeedComponent.class))).l0();
        }
    }
}
