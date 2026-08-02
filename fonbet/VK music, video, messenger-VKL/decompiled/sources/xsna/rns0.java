package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import com.vk.dialogstoolbar.impl.di.VkAppDialogsToolbarInternalFeatureComponent;
import com.vk.dto.common.VideoFile;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.photoviewer.ClippingImageView;
import com.vk.photoviewer.PhotoViewer;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment;
import one.video.transform.TransformController;
import xsna.f5h0;
import xsna.phw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class rns0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rns0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Parcelable parcelable;
        Object parcelable2;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                sns0 sns0Var = (sns0) obj;
                int i2 = iah0.f().widthPixels;
                int i3 = iah0.f().heightPixels;
                PhotoViewer.n nVar = sns0Var.d;
                VideoTextureView videoTextureView = sns0Var.h;
                double width = nVar.getWidth();
                double d = width / i2;
                double height = nVar.getHeight();
                double d2 = height / i3;
                Size size = d > d2 ? new Size(i2, (int) (height / d)) : new Size((int) (width / d2), i3);
                videoTextureView.getMatrixProvider().l(size.getWidth(), size.getHeight());
                videoTextureView.i(TransformController.ScaleType.FIT, false);
                ClippingImageView clippingImageView = sns0Var.f;
                clippingImageView.getHierarchy().o(f5h0.i.a);
                clippingImageView.setClipX(0);
                clippingImageView.setClipBottom(0);
                clippingImageView.setClipTop(0);
                clippingImageView.setCorners(new float[8]);
                break;
            case 1:
                fxc0.B().d((VideoFile) obj);
                break;
            case 2:
                int i4 = VideoMinimizableDiscoveryFragment.p1;
                break;
            case 3:
                break;
            case 4:
                int i5 = VideoProfileFragmentOld.p0;
                Bundle requireArguments = ((VideoProfileFragmentOld) obj).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("VideoProfileFragment.search_stats_logging_info", SearchStatsLoggingInfo.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = requireArguments.getParcelable("VideoProfileFragment.search_stats_logging_info");
                    parcelable = (SearchStatsLoggingInfo) (parcelable3 instanceof SearchStatsLoggingInfo ? parcelable3 : null);
                }
                break;
            case 5:
                break;
            case 6:
                VkAppDialogsToolbarInternalFeatureComponent vkAppDialogsToolbarInternalFeatureComponent = (VkAppDialogsToolbarInternalFeatureComponent) obj;
                qcy<Object>[] qcyVarArr = VkAppDialogsToolbarInternalFeatureComponent.d;
                break;
            case 7:
                break;
            case 8:
                s3q0 s3q0Var = s3q0.a;
                ((io.reactivex.rxjava3.subjects.d) obj).onNext(s3q0Var);
                break;
            case 9:
                phw0.b bVar = (phw0.b) obj;
                Context context = bVar.a.get();
                if (context != null) {
                    boolean z = bVar.b;
                    VoipCreateScheduleCallFragment.a aVar = new VoipCreateScheduleCallFragment.a(VoipCreateScheduleCallFragment.class, null, null);
                    aVar.s(z);
                    aVar.k(context);
                    break;
                } else {
                    break;
                }
            default:
                ((mjw0) obj).o.bringToFront();
                break;
        }
        return s3q0.a;
    }
}
