package xsna;

import android.os.Handler;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.VkVideoPickerFragment;
import com.vk.prefui.fragments.MaterialPreferenceFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import ru.ok.media.PublisherImpl;
import ru.ok.media.video.H264Encoder;
import xsna.c8x;
import xsna.p7z0;
import xsna.x1t0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class b3m implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b3m(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                nij nijVar = ((m3r) obj).g;
                if (nijVar != null) {
                    nijVar.invoke();
                    break;
                }
                break;
            case 2:
                H264Encoder.release$lambda$8((H264Encoder) obj);
                break;
            case 3:
                ((ViewGroup) obj).setVisibility(0);
                break;
            case 4:
                MaterialPreferenceFragment.b bVar = (MaterialPreferenceFragment.b) ((MaterialPreferenceFragment.CenterLayoutManager.b) obj);
                MaterialPreferenceFragment materialPreferenceFragment = MaterialPreferenceFragment.this;
                Preference preference = materialPreferenceFragment.c0;
                Handler handler = materialPreferenceFragment.e0;
                if (preference != null) {
                    if ((preference instanceof TwoStatePreference) && materialPreferenceFragment.a0) {
                        handler.postDelayed(new qd0(bVar, 11), 500L);
                    } else {
                        handler.postDelayed(new ov(bVar, 8), 500L);
                    }
                    if (materialPreferenceFragment.Y) {
                        materialPreferenceFragment.c0.A();
                        break;
                    }
                }
                break;
            case 5:
                ((d9c0) obj).finish();
                break;
            case 6:
                ((PublisherImpl) obj).lambda$startPublishing$9();
                break;
            case 7:
                h03.b((Throwable) obj);
                break;
            case 8:
                ((gzs) obj).invoke();
                break;
            case 9:
                VkVideoPickerFragment vkVideoPickerFragment = (VkVideoPickerFragment) obj;
                int i2 = VkVideoPickerFragment.V;
                x1t0.a aVar = x1t0.a.b;
                vkVideoPickerFragment.getClass();
                xn50.a.c(vkVideoPickerFragment, aVar);
                break;
            case 10:
                ((com.mbridge.msdk.config.component.common.network.connect.socket.c) obj).c();
                break;
            default:
                faz0 faz0Var = (faz0) obj;
                p7z0.b bVar2 = faz0Var.a;
                ArrayList arrayList = faz0Var.k;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    faz0.a((WeakReference) obj2);
                }
                arrayList.clear();
                lxd lxdVar = faz0Var.d;
                if (lxdVar != null) {
                    n9c0 n9c0Var = (n9c0) lxdVar.b;
                    if (n9c0Var != null) {
                        n9c0Var.hide();
                    }
                    gu8.c("InstreamAdPostViewCtrl", "Player is hidden");
                }
                if (faz0Var.j) {
                    p7z0 p7z0Var = p7z0.this;
                    if (bVar2.a != null) {
                        c8x.c cVar = p7z0Var.a.l;
                        if (cVar != null) {
                            cVar.i();
                            cVar.f();
                        }
                        bVar2.a = null;
                    }
                    gu8.c("InstreamAdPostViewCtrl", "PostView is canceled");
                } else {
                    p7z0 p7z0Var2 = p7z0.this;
                    if (bVar2.a != null) {
                        c8x.c cVar2 = p7z0Var2.a.l;
                        if (cVar2 != null) {
                            cVar2.i();
                            cVar2.f();
                        }
                        bVar2.a = null;
                        if (p7z0Var2.t == 0) {
                            p7z0Var2.g();
                        }
                    }
                    gu8.c("InstreamAdPostViewCtrl", "PostView is completed");
                }
                faz0Var.j = false;
                faz0Var.i = false;
                faz0Var.e = 0;
                break;
        }
    }
}
