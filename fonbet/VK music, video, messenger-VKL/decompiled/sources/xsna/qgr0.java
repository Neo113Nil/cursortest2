package xsna;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.imageloader.view.VKImageView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.f5h0;

/* compiled from: VKSuperappImageController.kt */
/* loaded from: classes6.dex */
public final class qgr0 extends com.vk.core.ui.image.c<VKImageView> {
    public static final List<String> c = e43.l("c_uniq_tag", "u");

    /* compiled from: VKSuperappImageController.kt */
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
        ImageView.ScaleType scaleType;
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
        int i2 = a.$EnumSwitchMapping$0[bVar.h.ordinal()];
        if (i2 == 1) {
            scaleType = ImageView.ScaleType.FIT_XY;
        } else if (i2 == 2) {
            scaleType = ImageView.ScaleType.CENTER_INSIDE;
        } else if (i2 == 3) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        vKImageView.setScaleType(scaleType);
        vKImageView.setRound(bVar.c);
    }

    @Override // com.vk.core.ui.image.VKImageController
    public final void a(Drawable drawable, VKImageController.b bVar) {
        m(getView(), bVar);
        l(getView(), bVar);
        getView().setImageDrawable(drawable);
    }

    @Override // com.vk.core.ui.image.c, com.vk.core.ui.image.VKImageController
    public final void d(String str, VKImageController.b bVar, tcr0 tcr0Var) {
        m(getView(), bVar);
        l(getView(), bVar);
        getView().setOnLoadCallback(new b(tcr0Var));
        String uri = str != null ? jeq0.d(Uri.parse(str), c).toString() : null;
        if (bVar.n) {
            getView().v0(uri);
        } else {
            getView().o0(uri, new Size(getView().getWidth(), getView().getHeight()));
        }
    }

    @Override // com.vk.core.ui.image.VKImageController
    public final void f(String str, VKImageController.b bVar) {
        m(getView(), bVar);
        l(getView(), bVar);
        getView().setPaintFilterBitmap(bVar.m);
        String uri = str != null ? jeq0.d(Uri.parse(str), c).toString() : null;
        if (bVar.n) {
            getView().v0(uri);
            return;
        }
        VKImageView view = getView();
        Size size = bVar.o;
        if (size == null) {
            size = new Size(getView().getWidth(), getView().getHeight());
        }
        view.o0(uri, size);
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

    /* compiled from: VKSuperappImageController.kt */
    public static final class b implements b780 {
        public final /* synthetic */ tcr0 b;

        public b(tcr0 tcr0Var) {
            this.b = tcr0Var;
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
            this.b.B4(th);
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
            this.b.onSuccess();
        }

        @Override // xsna.b780
        public final void g(String str) {
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }
    }
}
