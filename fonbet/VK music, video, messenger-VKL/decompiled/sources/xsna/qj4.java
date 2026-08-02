package xsna;

import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.vk.content.design.view.camera.a;
import com.vk.core.serialize.Serializer;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.newsfeed.impl.discover.media.DiscoverMediaTabFragment;
import com.vk.superapp.api.dto.menu.BadgeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import ru.ok.android.sdk.api.login.LoginRequest;
import ru.ok.gleffects.EffectRegistry;
import xsna.c2n;
import xsna.hxo;
import xsna.ihz;
import xsna.jza0;
import xsna.prt;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class qj4 implements io.reactivex.rxjava3.functions.l, zm, pcs, io.reactivex.rxjava3.functions.m, Preference.c, c2n.a, ihz.a, prt.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qj4(a.InterfaceC0730a interfaceC0730a, com.vk.content.design.view.camera.a aVar) {
        this.b = 1;
        this.c = interfaceC0730a;
    }

    @Override // xsna.zm
    public boolean a(View view) {
        BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) this.c;
        int i = BottomSheetDragHandleView.k;
        return bottomSheetDragHandleView.U();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                return (AudioBook) ((g53) this.c).invoke(obj);
            case 1:
                Integer num = (Integer) obj;
                if (((a.InterfaceC0730a) this.c).k(num.intValue())) {
                    if (num.intValue() != (-EffectRegistry.EffectId.RANDOM_MUSIC.id)) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 2:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13:
            case 14:
            default:
                return (olc0) ((c230) this.c).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.t) ((td0) this.c).invoke(obj);
            case 4:
                return (List) ((g53) this.c).invoke(obj);
            case 5:
                return (Pair) ((vdb) this.c).invoke(obj);
            case 6:
                return ((vhe) this.c).invoke(obj);
            case 10:
                return (gcw) ((td0) this.c).invoke(obj);
            case 15:
                return (ts) ((g53) this.c).invoke(obj);
            case 16:
                return (BadgeInfo) ((sop) this.c).invoke(obj);
            case 17:
                return (it80) ((sop) this.c).invoke(obj);
            case 18:
                return (io.reactivex.rxjava3.core.t) ((g53) this.c).invoke(obj);
            case 19:
                return (Integer) ((g53) this.c).invoke(obj);
            case 20:
                return (io.reactivex.rxjava3.core.o) ((u320) this.c).invoke(obj);
            case 21:
                return (List) ((t3v) this.c).invoke(obj);
            case 22:
                return (io.reactivex.rxjava3.core.t) ((td0) this.c).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.t) ((c230) this.c).invoke(obj);
            case 24:
                return (dts) ((c230) this.c).invoke(obj);
            case 25:
                return (io.reactivex.rxjava3.core.t) ((c230) this.c).invoke(obj);
            case 26:
                return (List) ((jz30) this.c).invoke(obj);
            case 27:
                return (Map) ((qm90) this.c).invoke(obj);
            case 28:
                return (com.vk.newsfeed.api.posting.author.a) ((kti) this.c).invoke(obj);
        }
    }

    @Override // xsna.c2n.a
    public void b(c2n.b bVar) {
        DiscoverMediaTabFragment discoverMediaTabFragment = (DiscoverMediaTabFragment) this.c;
        int i = DiscoverMediaTabFragment.t0;
        if (bVar.a) {
            return;
        }
        discoverMediaTabFragment.ko().Nb(true);
    }

    @Override // xsna.prt.b
    public List d(ArrayList arrayList) {
        return (List) ((izs) this.c).invoke(arrayList);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        debugDevSettingsFragment.o0.x(new y580(rsr.x("Test", new Serializer.DeserializationError("Test", null)), LoginRequest.CLIENT_NAME, false));
        return true;
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((jza0.b) obj).y(androidx.media3.exoplayer.c.this.U);
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 7:
                int i2 = CommunityReviewsFragment.o0;
                xn50.a.c((CommunityReviewsFragment) obj, new c.j(false));
                break;
            default:
                txo txoVar = (txo) obj;
                int i3 = txo.q1;
                UserId userId = (UserId) bundle.getParcelable("arg_user_to_switch");
                if (userId == null) {
                    txoVar.getFeature().C(hxo.b.b);
                    break;
                } else {
                    txoVar.getFeature().C(new hxo.j(userId));
                    break;
                }
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((g53) this.c).invoke(obj)).booleanValue();
    }

    public /* synthetic */ qj4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
