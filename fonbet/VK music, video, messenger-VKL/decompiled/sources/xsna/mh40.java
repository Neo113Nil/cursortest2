package xsna;

import android.util.Size;
import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.k0;
import com.vk.attachpicker.b;
import com.vk.attachpicker.fragment.gallery.PostingAttachGalleryFragment;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.push.common.Logger;
import com.vk.stories.design.view.stickers.selection.SelectionStickerView;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.sensor.NetworkAvailabilitySensor;
import xsna.eda;
import xsna.l5v0;
import xsna.t8a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh40 implements io.reactivex.rxjava3.functions.l, eda.a, k0.a, io.reactivex.rxjava3.functions.d, b.d, hgh0, Preference.b, NetworkAvailabilitySensor.Listener, io.reactivex.rxjava3.functions.m, i0u0, io.reactivex.rxjava3.core.d, io.reactivex.rxjava3.functions.b, io.reactivex.rxjava3.core.s, io.reactivex.rxjava3.functions.c, b680, yads.vq2 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mh40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        String str = (String) this.c;
        int i = SettingsGeneralFragment.z0;
        String str2 = (String) obj;
        if (str.equals(str2)) {
            l23.A(mwz.b);
            return true;
        }
        l23.A(mwz.a(str2));
        return true;
    }

    @Override // yads.vq2
    public void a(Object obj) {
        yads.ex1.a((yads.dx1) this.c, (String) obj);
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        ((mq2) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (VoipActionsFeatureState.s) ((e6g) this.c).invoke(obj, obj2);
    }

    @Override // xsna.eda.a
    public io.reactivex.rxjava3.core.q b(wba wbaVar, List list, String str) {
        uo40 uo40Var = (uo40) this.c;
        return rsg0.T(yfb.x(wga.n(uo40Var.G, list, null, uo40Var.A0(), 10))).U(new adz(new vo40(1, uo40Var.J, ada.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogReplaceBlocksDto;)Lcom/vk/catalog2/common/dto/api/replacement/CatalogReplacementResponse;", 0), 5));
    }

    @Override // com.vk.attachpicker.b.d
    public List e() {
        com.vk.attachpicker.fragment.gallery.a aVar = ((PostingAttachGalleryFragment) this.c).U;
        ArrayList arrayList = null;
        if (aVar != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((ArrayList) aVar.y0()).iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                if ((next instanceof MediaStoreEntry) && aVar.e.q((MediaStoreEntry) next)) {
                    arrayList2.add(Integer.valueOf(i));
                }
                i = i2;
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? EmptyList.b : arrayList;
    }

    @Override // xsna.i0u0
    public View get() {
        switch (this.b) {
            case 16:
                return (View) new WeakReference(((olq0) this.c).d).get();
            default:
                return (View) new WeakReference(((ptq0) this.c).a).get();
        }
    }

    @Override // xsna.b680
    public void onFailure(Throwable th) {
        Logger.DefaultImpls.info$default(((ru.rustore.sdk.pushclient.u.d) this.c).g, m5k.b(th, new StringBuilder("Re-subscription is completed with exception ")), null, 2, null);
    }

    @Override // ru.ok.android.webrtc.signaling.sensor.NetworkAvailabilitySensor.Listener
    public void onNetworkAvailable() {
        ((Signaling.Transport) this.c).tryReconnectNow();
    }

    @Override // xsna.hgh0
    public void onPageSelected(int i) {
        SelectionStickerView selectionStickerView = (SelectionStickerView) this.c;
        if (i == selectionStickerView.E) {
            selectionStickerView.R.a().p(selectionStickerView.getContext(), true);
            return;
        }
        if (i != -1) {
            selectionStickerView.S.setCurrentItem(i, true);
            return;
        }
        if (o25.a().b()) {
            selectionStickerView.R.a().u(selectionStickerView.getContext(), true, Collections.EMPTY_LIST, null, "story_create_keyboard");
            selectionStickerView.W.q();
        } else {
            if (g620.f().k0().a(selectionStickerView.getContext())) {
                return;
            }
            selectionStickerView.W.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$OnLayoutChangeListener, xsna.snt0] */
    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(final io.reactivex.rxjava3.core.r rVar) {
        final View view = (View) this.c;
        final ?? r1 = new View.OnLayoutChangeListener() { // from class: xsna.snt0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                View view3 = view;
                rVar.onNext(new Size(view3.getWidth(), view3.getHeight()));
            }
        };
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new znt0(rVar, r1, view));
        } else {
            rVar.onNext(new Size(view.getWidth(), view.getHeight()));
            if (!rVar.h()) {
                view.addOnLayoutChangeListener(r1);
            }
        }
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.tnt0
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                view.removeOnLayoutChangeListener(r1);
            }
        });
    }

    @Override // io.reactivex.rxjava3.functions.d
    public boolean test(Object obj, Object obj2) {
        return ((Boolean) ((e6g) this.c).invoke(obj, obj2)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (io.reactivex.rxjava3.core.t) ((bp7) this.c).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.b0) ((uo3) this.c).invoke(obj);
            case 4:
                return (t8a0.a) ((pf40) this.c).invoke(obj);
            case 6:
                return (Boolean) ((b4r) this.c).invoke(obj);
            case 7:
                return (lna0) ((b4r) this.c).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.b0) ((bp7) this.c).invoke(obj);
            case 19:
                return (List) ((mcl0) this.c).invoke(obj);
            case 22:
                return (com.vk.auth.ui.consent.g) ((kvm0) this.c).invoke(obj);
            case 23:
                return (l5v0.a.C3235a) ((mcl0) this.c).invoke(obj);
            default:
                return (qtd0) ((kvm0) this.c).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 14:
                int i2 = StreamInfoFragment.S;
                return ((Boolean) ((mcl0) obj2).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((kvm0) obj2).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        final zuk zukVar = (zuk) ((Callable) this.c).call();
        zukVar.d(new scr0(bVar), ac9.b);
        if (mcr0.b) {
            bVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.jcr0
                @Override // io.reactivex.rxjava3.functions.e
                public final void cancel() {
                    zuk.this.close();
                }
            });
        }
    }
}
