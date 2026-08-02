package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.unity3d.services.UnityAdsConstants;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.dynamic_loader.b;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior;
import com.vk.im.channelcreation.impl.h;
import com.vk.newsfeed.impl.fragments.ModalReactionsFragment;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.webrtc.SurfaceTextureHelper;
import ru.ok.android.webrtc.ScreenCapturerAdapter;
import xsna.fkz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class sm9 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sm9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                com.vk.cameraui.impl.a aVar = (com.vk.cameraui.impl.a) this.c;
                List<tam0> S = aVar.S(true);
                if (S != null) {
                    com.vk.cameraui.impl.a.k0(aVar, S, true, true, 8);
                    break;
                }
                break;
            case 1:
                CameraUIView cameraUIView = (CameraUIView) this.c;
                cameraUIView.H.a();
                etv0 etv0Var = cameraUIView.j1;
                if (etv0Var != null) {
                    etv0Var.b(true);
                    break;
                }
                break;
            case 2:
                h.a aVar2 = ((com.vk.im.channelcreation.impl.h) this.c).g;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                mhy.j(aVar2.b);
                break;
            case 3:
                dw20 dw20Var = ((ord) this.c).a;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                    break;
                }
                break;
            case 4:
                CommunityAddressesFragment communityAddressesFragment = (CommunityAddressesFragment) this.c;
                VkBottomSheetBehavior<View> vkBottomSheetBehavior = communityAddressesFragment.v0;
                if (vkBottomSheetBehavior == null) {
                    vkBottomSheetBehavior = null;
                }
                vkBottomSheetBehavior.J(3);
                VkBottomSheetBehavior<View> vkBottomSheetBehavior2 = communityAddressesFragment.v0;
                (vkBottomSheetBehavior2 != null ? vkBottomSheetBehavior2 : null).w = false;
                break;
            case 5:
                uik uikVar = ((gik) this.c).n;
                if (uikVar != null) {
                    uikVar.a();
                    break;
                }
                break;
            case 6:
                ((hrk) this.c).c.invoke();
                break;
            case 7:
                ((io.reactivex.rxjava3.subjects.d) this.c).onNext(b.AbstractC0762b.a.a);
                break;
            case 8:
                ((b4i) this.c).invoke();
                break;
            case 9:
                Object obj = ((com.google.android.material.timepicker.b) this.c).F;
                if (obj instanceof com.google.android.material.timepicker.f) {
                    ((com.google.android.material.timepicker.f) obj).b();
                    break;
                }
                break;
            case 10:
                ModalBottomSheetBehavior<View> modalBottomSheetBehavior = ((ModalReactionsFragment) this.c).v0;
                if (modalBottomSheetBehavior != null && modalBottomSheetBehavior.k == 5) {
                    modalBottomSheetBehavior.O(4);
                    break;
                }
                break;
            case 11:
                ((kw70) this.c).j.countDown();
                break;
            case 12:
                androidx.media3.exoplayer.video.d dVar = (androidx.media3.exoplayer.video.d) this.c;
                dVar.u--;
                break;
            case 13:
                ((ScreenCapturerAdapter) this.c).stop();
                break;
            case 14:
                ((SurfaceTextureHelper) this.c).lambda$dispose$6();
                break;
            case 15:
                Toolbar.f fVar = ((Toolbar) this.c).N;
                androidx.appcompat.view.menu.h hVar = fVar == null ? null : fVar.c;
                if (hVar != null) {
                    hVar.collapseActionView();
                    break;
                }
                break;
            case 16:
                ((com.mbridge.msdk.config.component.common.network.retry.c) this.c).e();
                break;
            default:
                fkz0 fkz0Var = (fkz0) this.c;
                izy0 izy0Var = fkz0Var.m;
                fkz0.c cVar = fkz0Var.f;
                fkz0Var.u = null;
                if (!fkz0Var.s) {
                    HashMap hashMap = new HashMap(cVar.f);
                    cVar.b();
                    fkz0Var.s = true;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = fkz0Var.e.keySet().iterator();
                    while (it.hasNext()) {
                        ViewGroup viewGroup = (ViewGroup) ((WeakReference) it.next()).get();
                        if (viewGroup != null) {
                            arrayList.add(viewGroup);
                        }
                    }
                    gu8.c("IntrNativeAdCtrlImpl", "Start tracking");
                    j8z0 j8z0Var = fkz0Var.g;
                    ocz0 ocz0Var = fkz0Var.c;
                    ArrayList arrayList2 = j8z0Var.a;
                    ArrayList arrayList3 = j8z0Var.b;
                    if (!j8z0Var.h && (!arrayList3.isEmpty() || !j8z0Var.g)) {
                        j8z0Var.k = ocz0Var;
                        gu8.c("ViewsViewabilityTracker", "Started tracking");
                        j8z0Var.h = true;
                        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        j8z0Var.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        arrayList2.clear();
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            arrayList2.add(new WeakReference((View) obj2));
                            j8z0Var.l += r4.getWidth() * r4.getHeight();
                            f = f;
                        }
                        float f2 = f;
                        Context context = arrayList.isEmpty() ? null : ((View) arrayList.get(0)).getContext();
                        if (context != null) {
                            long j = 0;
                            for (Integer num : hashMap.keySet()) {
                                int intValue = num.intValue();
                                float f3 = j8z0Var.l;
                                float f4 = f3 == f2 ? f2 : intValue / (f3 / 100.0f);
                                boolean z = b920.b(f4, j8z0Var.d) != -1;
                                if (z) {
                                    if (j == 0) {
                                        Long l = (Long) hashMap.get(num);
                                        if (l != null) {
                                            j = l.longValue();
                                        }
                                    } else {
                                        StringBuilder sb = new StringBuilder("History View visibility ");
                                        sb.append(f4);
                                        sb.append("% (isVisible = ");
                                        sb.append(z);
                                        sb.append("). Id: ");
                                        qjk0.a(sb, ocz0Var.F, "ViewsViewabilityTracker");
                                        j8z0Var.b(z, f4, context);
                                    }
                                }
                                j = 0;
                            }
                            if (((View) arrayList.get(0)) != null) {
                                f9z0 f9z0Var = j8z0Var.c;
                                if (f9z0Var != null) {
                                    f9z0Var.b();
                                }
                                int size2 = arrayList3.size();
                                int i2 = 0;
                                while (i2 < size2) {
                                    Object obj3 = arrayList3.get(i2);
                                    i2++;
                                    ((rgz0) obj3).b();
                                }
                            }
                        }
                        j8z0Var.m = "";
                        j8z0Var.n = false;
                        j8z0Var.d();
                        j8z0Var.e.c(j8z0Var.f);
                    }
                    if (izy0Var != null) {
                        ViewGroup viewGroup2 = (ViewGroup) fkz0Var.r.get();
                        if (viewGroup2 != null) {
                            izy0Var.f(viewGroup2);
                            break;
                        } else {
                            gu8.e("IntrNativeAdCtrlImpl", "html-view is not found in InternalNativeAdBinder.getInternalHtmlViewBinder()");
                            break;
                        }
                    }
                }
                break;
        }
    }
}
