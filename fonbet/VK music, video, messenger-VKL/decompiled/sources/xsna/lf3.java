package xsna;

import android.location.Location;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.profile.PlainAddress;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.superapp.miniapps.picker.AppsPickerFragment;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.ikv0;
import xsna.izh;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class lf3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lf3(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = false;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                AppsPickerFragment appsPickerFragment = (AppsPickerFragment) obj3;
                bpn0 bpn0Var = AppsPickerFragment.V;
                ((com.vk.superapp.miniapps.picker.j) obj4).dismiss();
                ikv0.a aVar = new ikv0.a(appsPickerFragment.requireContext());
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12);
                aVar.u = new ikv0.d(appsPickerFragment.getString(R.string.vk_picker_something_went_wrong), (String) null, (ikv0.d.a) null, 6);
                aVar.f = (View) obj2;
                aVar.n();
                return s3q0.a;
            case 1:
                ClipsGridDraftsListFragment clipsGridDraftsListFragment = (ClipsGridDraftsListFragment) obj4;
                tce tceVar = (tce) obj3;
                int i2 = ClipsGridDraftsListFragment.l0;
                ((v8f) obj2).c(clipsGridDraftsListFragment.requireContext(), (Throwable) obj, tceVar.a, new qd1(7, clipsGridDraftsListFragment, tceVar));
                return s3q0.a;
            case 2:
                CommunityAddressesFragment communityAddressesFragment = (CommunityAddressesFragment) obj4;
                PlainAddress plainAddress = (PlainAddress) obj3;
                oj00 oj00Var = (oj00) obj2;
                it80 it80Var = (it80) obj;
                int i3 = CommunityAddressesFragment.E0;
                if (it80Var.a()) {
                    Location location = (Location) it80Var.a;
                    if (communityAddressesFragment.y0 == 0) {
                        u9h0 u9h0Var = new u9h0(new edr0(Math.min(location.getLatitude(), plainAddress.c), Math.min(location.getLongitude(), plainAddress.d)), new edr0(Math.max(location.getLatitude(), plainAddress.c), Math.max(location.getLongitude(), plainAddress.d)));
                        communityAddressesFragment.y0 = 1;
                        communityAddressesFragment.z0 = true;
                        vj00 vj00Var = ofx.a;
                        if (vj00Var == null) {
                            vj00Var = null;
                        }
                        vj00Var.getClass();
                        vj00 vj00Var2 = ofx.a;
                        nt0.a(u9h0Var, oj00Var, uar0.a, new mrg(4, vj00Var2 != null ? vj00Var2 : null, uj00.class, "createCameraPosition", "createCameraPosition(Lcom/vk/maps/common/model/VKLatLng;FFF)Lcom/vk/maps/common/interfaces/CameraPosition;", 0), new nrg(communityAddressesFragment));
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 3:
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a aVar2 = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a) obj4;
                vzh vzhVar = (vzh) obj2;
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a.d((wk50.a) obj3, false);
                aVar2.d.b(new izh.a((String) obj));
                Integer num = vzhVar.F;
                if (num != null) {
                    aVar2.f.b(num.intValue(), vzhVar.b.b);
                }
                return s3q0.a;
            case 4:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj3;
                w2w w2wVar = (w2w) obj2;
                Attach b = ((xgl0) obj).o().b(((b4v) obj4).c);
                if (b instanceof AttachWithTranscription) {
                    AttachWithTranscription attachWithTranscription = (AttachWithTranscription) b;
                    if (attachWithTranscription.m4()) {
                        ref$BooleanRef.element = true;
                        attachWithTranscription.k9(false);
                        w2wVar.I0().o().s0(b);
                        return s3q0.a;
                    }
                }
                return s3q0.a;
            case 5:
                kjz kjzVar = (kjz) obj4;
                FrameLayout frameLayout = (FrameLayout) obj3;
                yjk0 yjk0Var = (yjk0) obj2;
                wzs h = kjzVar.a.h();
                if (h != null) {
                    h.invoke(frameLayout, yjk0Var);
                }
                return new ijz(kjzVar);
            case 6:
                String str = (String) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                qyg0 V0 = ((hyg0) obj).V0("UPDATE playlists_to_tracks SET music_track_id = ? WHERE music_track_id == ? AND playlist_id == ?");
                try {
                    V0.D3(1, str);
                    V0.D3(2, str2);
                    V0.D3(3, str3);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            default:
                WebApiApplication webApiApplication = (WebApiApplication) obj3;
                bqu0 bqu0Var = (bqu0) obj;
                bqu0Var.show();
                ((mov0) obj4).k(bqu0Var, webApiApplication.b, webApiApplication.w, (vu80) obj2);
                return s3q0.a;
        }
    }
}
