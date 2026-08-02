package xsna;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.impl.location.LocationFragment;
import com.vk.attachpicker.impl.location.LocationFragment.c;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.folders.impl.configure.g;
import com.vk.log.L;
import com.vk.mediapicker.impl.presentation.mvi.a;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.notifications.list.impl.presentation.base.fragment.grouped.GroupedNotificationListFragment;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class m2j implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m2j(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction invoke$lambda$22;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b2;
        int i = this.b;
        boolean z = true;
        int i2 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                ((baj) obj).invoke();
                break;
            case 2:
                int i3 = com.vk.channelrestrictions.b.h1;
                ((com.vk.channelrestrictions.b) obj).co(true);
                break;
            case 3:
                egm egmVar = (egm) obj;
                VkImageSimple vkImageSimple = new VkImageSimple(egmVar.d, null, 6, 0);
                vkImageSimple.setContentDescription(null);
                vkImageSimple.setScaleType(ImageView.ScaleType.CENTER);
                vkImageSimple.setLayoutParams(egm.W(egmVar, cn70.b(26), cn70.b(26), 0, 0, 0, 0, 60));
                vkImageSimple.setTranslationY(cn70.a() * 2.0f);
                vkImageSimple.setTranslationX(cn70.a() * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                egmVar.b.addView(vkImageSimple);
                break;
            case 4:
                vtm vtmVar = (vtm) obj;
                vtmVar.l.setVisibility(8);
                vtmVar.w.e(false);
                vtmVar.x.c(false);
                vtmVar.y.c(true);
                vtmVar.z.c(false);
                vtmVar.A.c(false);
                vtmVar.B.c(false);
                vtmVar.n.setVisibility(4);
                vtmVar.r.submitList(vtmVar.D.a);
                break;
            case 5:
                qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                break;
            case 6:
                hbn hbnVar = (hbn) obj;
                break;
            case 7:
                com.vk.im.ui.components.chat_profile.a aVar = ((b6p) obj).l;
                aVar.getClass();
                aVar.t(zxd0.i.a);
                break;
            case 8:
                break;
            case 9:
                String b3 = ((ztq) obj).b();
                Preference.H("fcm_toast", "fcm_error_key_cold", b3);
                Preference.H("fcm_toast", "fcm_error_key_notification", b3);
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                ((jpr) obj).b.requestLayout();
                break;
            case 13:
                ((com.vk.folders.impl.configure.h) obj).O(g.f.b);
                break;
            case 14:
                ((evs) obj).T(false);
                break;
            case 15:
                int i4 = GroupedNotificationListFragment.Y;
                break;
            case 16:
                invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22((HandleInvocationsFromAdViewer) obj);
                break;
            case 17:
                zbv zbvVar = (zbv) obj;
                int i5 = (int) zbvVar.a.getRightExtraRect().a;
                int i6 = (int) zbvVar.a.getRightMainRect().d;
                wzs<Integer, Integer, s3q0> wzsVar = zbvVar.c.j;
                if (wzsVar != null) {
                    wzsVar.invoke(Integer.valueOf(i5), Integer.valueOf(i6));
                }
                break;
            case 18:
                com.vk.im.ui.components.contacts.a aVar2 = (com.vk.im.ui.components.contacts.a) obj;
                aVar2.W0();
                aVar2.H0();
                aVar2.G0();
                break;
            case 19:
                break;
            case 20:
                L.A("IncomingCallNotifierInitializer", HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT);
                break;
            case 21:
                break;
            case 22:
                ((p7y) obj).a.A(JsApiMethodType.SECURE_TOKEN_REQUEST_ACCESS, VkAppsErrors.Client.i(VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, 7));
                break;
            case 23:
                LocationFragment locationFragment = (LocationFragment) obj;
                int i7 = LocationFragment.h0;
                if (locationFragment.getActivity() != null) {
                    locationFragment.S = new nxz(locationFragment.getActivity(), locationFragment.new c(), new p63(new kkm(i2)), false);
                }
                nxz nxzVar = locationFragment.S;
                View X0 = nxzVar != null ? nxzVar.X0(locationFragment.X) : null;
                FrameLayout frameLayout = locationFragment.X;
                if (frameLayout != null) {
                    frameLayout.addView(X0);
                }
                nxz nxzVar2 = locationFragment.S;
                if (nxzVar2 != null) {
                    nxzVar2.c1();
                }
                wvv.b(wvv.a, locationFragment.g0, 0L, 500L, 8);
                break;
            case 24:
                break;
            case 25:
                ((pt10) obj).m().b(a.j.b);
                break;
            case 26:
                ((gm20) obj).l.m();
                break;
            case 27:
                break;
            case 28:
                ((zak0) ((az20) obj).p).setValue(Boolean.FALSE);
                break;
            default:
                vm30 vm30Var = (vm30) obj;
                RecyclerView recyclerView = vm30Var.u;
                ok30 ok30Var = vm30Var.H;
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    int v = linearLayoutManager.v();
                    int x = linearLayoutManager.x();
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b4 = qk30.b(v, ok30Var);
                    Object[] objArr = (b4 != null && b4.N0()) || ((b = qk30.b(v - 1, ok30Var)) != null && b.N0());
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b5 = qk30.b(x, ok30Var);
                    Object[] objArr2 = (b5 != null && b5.N0()) || ((b2 = qk30.b(x + 1, ok30Var)) != null && b2.N0());
                    i2n0 i2n0Var = vm30Var.j;
                    if (objArr == false && objArr2 == false) {
                        z = false;
                    }
                    i2n0Var.e(z);
                    break;
                } else {
                    break;
                }
                break;
        }
        return s3q0.a;
    }
}
