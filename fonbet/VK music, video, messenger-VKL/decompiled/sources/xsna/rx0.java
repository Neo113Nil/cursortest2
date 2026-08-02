package xsna;

import android.view.View;
import androidx.preference.Preference;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import com.vk.clips.sdk.shared.api.domain.HashtagParseMode;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.clips.sdk.shared.item.common.description.c;
import com.vk.debug.ui.dev.DebugDevHintsFragment;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.profile.Address;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.money.createtransfer.people.CreatePeopleTransferFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.ui.CheckableRelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.pattern.keypoints.KeypointPatternMatcher;
import ru.ok.tensorflow.util.Function;
import xsna.d6p;
import xsna.drz;
import xsna.fkh;
import xsna.qdd;
import xsna.xod;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class rx0 implements r2m, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.c, t4d0, CheckableRelativeLayout.b, Preference.c, io.reactivex.rxjava3.functions.b, io.reactivex.rxjava3.functions.m, Function {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rx0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.t4d0
    public void a(MediaStoreEntry mediaStoreEntry) {
        t4d0 t4d0Var = ((com.vk.preview.presentation.view.a) this.c).w;
        if (t4d0Var != null) {
            t4d0Var.a(mediaStoreEntry);
        }
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        ((nw6) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 9:
                eoe eoeVar = (eoe) this.c;
                List list = (List) obj;
                List list2 = (List) obj2;
                List list3 = list;
                int e = on00.e(c5g.u(list3, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (Object obj3 : list3) {
                    linkedHashMap.put(((uee) obj3).a.a1(), obj3);
                }
                Set keySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                long j = 0;
                while (true) {
                    uee ueeVar = null;
                    if (!it.hasNext()) {
                        eoeVar.c = list.size() - j;
                        ArrayList u0 = j5g.u0(arrayList, list);
                        Iterator it2 = u0.iterator();
                        while (it2.hasNext()) {
                            ClipVideoFile clipVideoFile = ((uee) it2.next()).a;
                            clipVideoFile.U1 = xod.a.a(eoeVar.d, clipVideoFile.m, HashtagParseMode.NONE, false, 4);
                            ibr0 ibr0Var = eoeVar.d;
                            MusicTrack musicTrack = clipVideoFile.D1;
                            clipVideoFile.V1 = ibr0Var.b(musicTrack != null ? musicTrack.d : null);
                            clipVideoFile.W1 = eoeVar.d.c(clipVideoFile.D1);
                        }
                        return u0;
                    }
                    ClipVideoFile clipVideoFile2 = (ClipVideoFile) it.next();
                    if (keySet.contains(clipVideoFile2.a1())) {
                        j++;
                    } else {
                        ueeVar = new uee(clipVideoFile2, null, null);
                    }
                    if (ueeVar != null) {
                        arrayList.add(ueeVar);
                    }
                }
            case 20:
                return (d6p.a) ((c6p) this.c).invoke(obj, obj2);
            default:
                return (drz.a) ((oq2) this.c).invoke(obj, obj2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vkontakte.android.ui.CheckableRelativeLayout.b
    public void b(View view, boolean z) {
        CreatePeopleTransferFragment createPeopleTransferFragment = (CreatePeopleTransferFragment) this.c;
        int i = CreatePeopleTransferFragment.B0;
        if (z) {
            int id = view.getId();
            if (id == R.id.card_receiver_checkbox_parent) {
                Object obj = createPeopleTransferFragment.m0;
                ((h9k) (obj != null ? obj : null)).z();
            } else if (id == R.id.vkpay_receiver_checkbox_parent) {
                Object obj2 = createPeopleTransferFragment.m0;
                ((h9k) (obj2 != null ? obj2 : null)).s();
            } else if (id == R.id.sbp_receiver_checkbox_parent) {
                Object obj3 = createPeopleTransferFragment.m0;
                ((h9k) (obj3 != null ? obj3 : null)).y();
            }
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        new DebugDevHintsFragment.a(DebugDevHintsFragment.class, null, null).k(debugDevSettingsFragment.mo2getContext());
        return false;
    }

    @Override // xsna.r2m
    public void g(com.vk.clips.sdk.shared.item.common.description.c cVar) {
        AdsItemViewEvent sz0Var;
        AdsItemViewEvent adsItemViewEvent;
        ux0 ux0Var = ((tx0) this.c).b;
        if (cVar instanceof c.b) {
            adsItemViewEvent = qz0.b;
        } else if (cVar instanceof c.a) {
            adsItemViewEvent = pz0.b;
        } else {
            if (cVar instanceof c.C0669c) {
                sz0Var = new rz0(((c.C0669c) cVar).a);
            } else if (cVar instanceof c.e) {
                sz0Var = new tz0(((c.e) cVar).a);
            } else {
                if (!(cVar instanceof c.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                sz0Var = new sz0(((c.d) cVar).a);
            }
            adsItemViewEvent = sz0Var;
        }
        ux0Var.a(adsItemViewEvent);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((gmj) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        hlb0 lambda$findHomography$1;
        switch (this.b) {
            case 1:
                return (VKList) ((vs) this.c).invoke(obj);
            case 2:
                return (Pair) ((zw) this.c).invoke(obj);
            case 3:
                return (DialogExt) ((r6) this.c).invoke(obj);
            case 4:
                return (CatalogReplacementResponse) ((rw) this.c).invoke(obj);
            case 5:
                return (Optional) ((r6) this.c).invoke(obj);
            case 6:
                return (com.vk.ecomm.cart.impl.checkout.feature.state.f) ((com.vk.channels.impl.channel_screen.send_msg.e) this.c).invoke(obj);
            case 7:
                return (qdd.c) ((c2) this.c).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.t) ((n9e) this.c).invoke(obj);
            case 9:
            case 12:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 22:
            default:
                lambda$findHomography$1 = KeypointPatternMatcher.lambda$findHomography$1((List) this.c, (yrk) obj);
                return lambda$findHomography$1;
            case 10:
                return (io.reactivex.rxjava3.core.b0) ((k3f) this.c).invoke(obj);
            case 11:
                return (StoryMusicInfo) ((r6) this.c).invoke(obj);
            case 13:
                return (npf) ((xd8) this.c).invoke(obj);
            case 14:
                return (Address) ((v5b) this.c).invoke(obj);
            case 15:
                return ((fkh.f) this.c).invoke(obj);
            case 21:
                return (Boolean) ((b1a) this.c).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.e) ((gmj) this.c).invoke(obj);
            case 24:
                return (List) ((o8) this.c).invoke(obj);
            case 25:
                return (String) ((ept) this.c).invoke(obj);
            case 26:
                return (it80) ((yza) this.c).invoke(obj);
            case 27:
                return (io.reactivex.rxjava3.core.b0) ((ept) this.c).invoke(obj);
            case 28:
                return (io.reactivex.rxjava3.core.b0) ((gmj) this.c).invoke(obj);
        }
    }
}
