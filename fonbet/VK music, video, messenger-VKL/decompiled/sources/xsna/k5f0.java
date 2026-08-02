package xsna;

import android.graphics.Bitmap;
import com.unity3d.ads.core.domain.RemoveUrlQuery;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.reactions.fragments.ReactionsFragment;
import com.vk.superapp.di.SuperAppServicesComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.lang.annotation.Annotation;
import java.lang.ref.SoftReference;
import java.util.List;
import kotlinx.serialization.KSerializer;
import xsna.k840;
import xsna.p2i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class k5f0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ k5f0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        RemoveUrlQuery initialize$lambda$220$lambda$53;
        p2i0 a;
        switch (this.b) {
            case 0:
                int i = ReactionsFragment.j0;
                return new int[]{R.id.reaction_tab_1, R.id.reaction_tab_2, R.id.reaction_tab_3, R.id.reaction_tab_4, R.id.reaction_tab_5, R.id.reaction_tab_6, R.id.reaction_tab_7, R.id.reaction_tab_8};
            case 1:
                return s3q0.a;
            case 2:
                return s3q0.a;
            case 3:
                initialize$lambda$220$lambda$53 = ServiceProvider.initialize$lambda$220$lambda$53();
                return initialize$lambda$220$lambda$53;
            case 4:
                return new zzq(false);
            case 5:
                return s3q0.a;
            case 6:
                return s3q0.a;
            case 7:
                qcy<Object>[] qcyVarArr = SuperAppServicesComponentImpl.f;
                return bbn0.a;
            case 8:
                return new yk3(new rpj(fpf0.a(Object.class), null, new KSerializer[0]));
            case 9:
                return s3q0.a;
            case 10:
                r5v0 r5v0Var = k840.a.h;
                if (r5v0Var != null) {
                    return r5v0Var;
                }
                return null;
            case 11:
                return Integer.valueOf((int) x5r0.a(10, 1));
            case 12:
                return new ucg0();
            case 13:
                SoftReference<Bitmap> softReference = VideoTextureView.r;
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_ANIMATION_OPTIMIZATIONS;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 14:
                return new tub0(fpf0.a(k1u0.class), new Annotation[0]);
            case 15:
                return new q7l0();
            case 16:
                mk5 mk5Var = new mk5();
                mk5Var.e(150L);
                return mk5Var;
            default:
                List<String> list = p2i0.b;
                a = p2i0.a.a(p2i0.b);
                return a;
        }
    }

    public /* synthetic */ k5f0(o3p0 o3p0Var) {
        this.b = 9;
    }
}
