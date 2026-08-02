package xsna;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.imageloader.view.VKImageView;
import kotlin.NoWhenBranchMatchedException;
import xsna.f5h0;

/* compiled from: VKImageSnackbarController.kt */
/* loaded from: classes17.dex */
public final class ucr0 extends com.vk.core.ui.image.c<VKImageView> {

    /* compiled from: VKImageSnackbarController.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VKImageController.ScaleType.values().length];
            try {
                iArr[VKImageController.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VKImageController.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VKImageController.ScaleType.CENTER_CROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VKImageController.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void l(VKImageView vKImageView, VKImageController.b bVar) {
        Integer num = bVar.l;
        int i = bVar.k;
        float f = bVar.j;
        VKImageController.c cVar = bVar.b;
        vKImageView.setColorFilter(num != null ? new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_ATOP) : null);
        Double d = bVar.d;
        if (d == null || d.doubleValue() < 2.0d) {
            vKImageView.z0(iah0.b(cVar.a), iah0.b(cVar.b), iah0.b(cVar.c), iah0.b(cVar.d));
            vKImageView.setPostprocessor(null);
            vKImageView.y0(f, i);
        } else {
            vKImageView.setCornerRadius(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            vKImageView.setPostprocessor(new gnk0(d.doubleValue(), f, i));
        }
        vKImageView.setRound(bVar.c);
    }

    @Override // com.vk.core.ui.image.VKImageController
    public final void a(Drawable drawable, VKImageController.b bVar) {
        m(getView(), bVar);
        l(getView(), bVar);
        getView().setImageDrawable(drawable);
    }

    @Override // com.vk.core.ui.image.VKImageController
    public final void f(String str, VKImageController.b bVar) {
        m(getView(), bVar);
        l(getView(), bVar);
        if (bVar.n) {
            getView().v0(str);
        } else {
            getView().load(str);
        }
    }

    @Override // com.vk.core.ui.image.VKImageController
    public final void j(int i, VKImageController.b bVar) {
        m(getView(), bVar);
        l(getView(), bVar);
        getView().q0(i);
    }

    @Override // com.vk.core.ui.image.c
    public final VKImageView k() {
        return new VKImageView(this.a, null, 6, 0);
    }

    public final void m(View view, VKImageController.b bVar) {
        f5h0.d dVar;
        if (view instanceof VKImageView) {
            int i = bVar.e;
            if (i != 0) {
                ((VKImageView) view).setPlaceholderImage(i);
                return;
            }
            Drawable drawable = bVar.f;
            if (drawable == null) {
                return;
            }
            VKImageController.ScaleType scaleType = bVar.i;
            if (scaleType == null) {
                ((VKImageView) view).setPlaceholderImage(drawable);
                return;
            }
            VKImageView vKImageView = (VKImageView) view;
            int i2 = a.$EnumSwitchMapping$0[scaleType.ordinal()];
            if (i2 == 1) {
                dVar = f5h0.m.a;
            } else if (i2 == 2) {
                dVar = f5h0.g.a;
            } else if (i2 == 3) {
                dVar = f5h0.f.a;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = f5h0.i.a;
            }
            vKImageView.Q0(drawable, dVar);
        }
    }
}
