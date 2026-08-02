package xsna;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.google.android.material.appbar.NonBouncedAppBarShadowView;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.vk.dto.common.RecommendedProfile;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.media.MediaUtils;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vkontakte.android.VKActivity;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import one.video.transform.TransformController;
import ru.ok.android.webrtc.protocol.screenshare.send.ControlThread;
import xsna.z0e0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class df6 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ df6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [xsna.jlu0] */
    /* JADX WARN: Type inference failed for: r3v22, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v23, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v29 */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        switch (this.b) {
            case 0:
                ef6 ef6Var = (ef6) this.c;
                VideoFile videoFile = (VideoFile) this.d;
                ef6Var.K();
                int width = videoFile.getWidth();
                int height = videoFile.getHeight();
                View view = ef6Var.getView();
                if (width != 0 && height != 0) {
                    if (ef6Var.b) {
                        int measuredHeight = view.getMeasuredHeight();
                        Integer valueOf = Integer.valueOf(measuredHeight);
                        if (measuredHeight <= 0) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            i2 = valueOf.intValue();
                            i = an10.b((width * i2) / height);
                            r2 = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
                        }
                    } else {
                        int measuredWidth = view.getMeasuredWidth();
                        Integer valueOf2 = Integer.valueOf(measuredWidth);
                        if (measuredWidth <= 0) {
                            valueOf2 = null;
                        }
                        if (valueOf2 != null) {
                            int intValue = valueOf2.intValue();
                            int b = an10.b((height * intValue) / width);
                            i = intValue;
                            i2 = b;
                            r2 = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
                        }
                    }
                }
                if (r2 != null) {
                    int intValue2 = ((Number) r2.d()).intValue();
                    int intValue3 = ((Number) r2.g()).intValue();
                    VideoTextureView z = ef6Var.z();
                    TransformController.ScaleType scaleType = TransformController.ScaleType.FIT;
                    SoftReference<Bitmap> softReference = VideoTextureView.r;
                    z.i(scaleType, false);
                    ef6Var.z().getMatrixProvider().l(intValue2, intValue3);
                    break;
                }
                break;
            case 1:
                ol6 ol6Var = (ol6) this.c;
                RecommendedProfile recommendedProfile = (RecommendedProfile) this.d;
                j1e0 b7 = ol6Var.b7();
                int itemCount = b7.getItemCount();
                if (itemCount >= 0) {
                    for (int i3 = 0; !(b7.c(i3) instanceof z0e0.d); i3++) {
                        if (i3 != itemCount) {
                        }
                    }
                    ol6Var.f7(recommendedProfile);
                    break;
                }
                ol6Var.e7();
                break;
            case 2:
                sk9 sk9Var = (sk9) this.c;
                MediaUtils.d dVar = (MediaUtils.d) this.d;
                Objects.toString(sk9Var.d);
                Objects.toString(dVar);
                break;
            case 3:
                ((ControlThread) this.c).a((Runnable) this.d);
                break;
            case 4:
                NonBouncedAppBarShadowView.a aVar = (NonBouncedAppBarShadowView.a) this.c;
                NonBouncedAppBarShadowView nonBouncedAppBarShadowView = (NonBouncedAppBarShadowView) this.d;
                CoordinatorLayout coordinatorLayout = aVar.l;
                NonBouncedAppBarLayout nonBouncedAppBarLayout = aVar.m;
                View view2 = aVar.n;
                if (coordinatorLayout != null && nonBouncedAppBarLayout != null && view2 != null) {
                    NonBouncedAppBarShadowView.U(nonBouncedAppBarShadowView, view2);
                    break;
                }
                break;
            case 5:
                File file = (File) this.c;
                com.vk.media.ok.b bVar = (com.vk.media.ok.b) this.d;
                if (file != null) {
                    bVar.queueEvent(new nl6(5, bVar, file));
                    break;
                }
                break;
            case 6:
                VKActivity vKActivity = (VKActivity) this.c;
                m6r0 m6r0Var = (m6r0) this.d;
                ?? a = ((VkClientMultiAccountComponent) m7m.a(vKActivity).a(fpf0.a(VkClientMultiAccountComponent.class))).a();
                c63 c63Var = c63.a;
                Activity b2 = c63.b();
                ?? r3 = b2;
                if (b2 == null) {
                    ?? r32 = e43.a;
                    r3 = r32 != 0 ? r32 : null;
                }
                boolean e = m6r0Var.e(m6r0.s1);
                String u = m6r0Var.u();
                String str = (String) m6r0Var.a(m6r0.j);
                if (str == null) {
                    str = "";
                }
                if (drm0.N(str)) {
                    str = m6r0Var.r();
                }
                a.k(r3, new wku0(str, u, e));
                break;
            case 7:
                UnityAdsImplementation.lambda$load$1((IUnityAdsLoadListener) this.c, (String) this.d);
                break;
            case 8:
                grg0 grg0Var = (grg0) this.c;
                ki4 ki4Var = (ki4) this.d;
                boolean z2 = pmr0.a;
                grg0Var.b(new y310(new r6i0(ki4Var, 14), 3));
                break;
            case 9:
                ner0 ner0Var = (ner0) this.c;
                Activity activity = (Activity) this.d;
                o25.a().O(new t200(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null, "user", null, false, false, false));
                pro0.f(new o7k0(7, ner0Var, activity));
                break;
            case 10:
                ((com.my.tracker.obfuscated.e0) this.c).b((List) this.d);
                break;
            case 11:
                break;
            default:
                ((yads.pk0) this.c).a((yads.qk0) this.d);
                break;
        }
    }

    public /* synthetic */ df6(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
    }
}
