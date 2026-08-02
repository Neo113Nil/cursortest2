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

/* compiled from: DefaultDsImageController.kt */
/* loaded from: classes17.dex */
public class rdl extends cno<VKImageView> {

    /* compiled from: DefaultDsImageController.kt */
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

    public static void m(VKImageView vKImageView, VKImageController.b bVar) {
        f5h0.d dVar;
        int i = bVar.k;
        float f = bVar.j;
        VKImageController.c cVar = bVar.b;
        Integer num = bVar.l;
        vKImageView.setColorFilter(num != null ? new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_ATOP) : null);
        Double d = bVar.d;
        vKImageView.setClipPath(bVar.p);
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
        vKImageView.setActualScaleType(dVar);
        vKImageView.setRound(bVar.c);
    }

    @Override // com.vk.core.ui.image.VKImageController
    public final void a(Drawable drawable, VKImageController.b bVar) {
        n(getView(), bVar);
        m((VKImageView) getView(), bVar);
        ((VKImageView) getView()).setImageDrawable(drawable);
    }

    @Override // com.vk.core.ui.image.c, com.vk.core.ui.image.VKImageController
    public final void d(String str, VKImageController.b bVar, tcr0 tcr0Var) {
        n(getView(), bVar);
        m((VKImageView) getView(), bVar);
        ((VKImageView) getView()).setOnLoadCallback(new b(tcr0Var));
        if (bVar.n) {
            ((VKImageView) getView()).v0(str);
        } else {
            ((VKImageView) getView()).o0(str, bVar.o);
        }
    }

    @Override // com.vk.core.ui.image.VKImageController
    public final void f(String str, VKImageController.b bVar) {
        n(getView(), bVar);
        m((VKImageView) getView(), bVar);
        if (bVar.n) {
            ((VKImageView) getView()).v0(str);
        } else {
            ((VKImageView) getView()).o0(str, bVar.o);
        }
    }

    @Override // com.vk.core.ui.image.VKImageController
    public final void j(int i, VKImageController.b bVar) {
        n(getView(), bVar);
        m((VKImageView) getView(), bVar);
        ((VKImageView) getView()).setImageResource(i);
    }

    @Override // com.vk.core.ui.image.c
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public VKImageView k() {
        return new VKImageView(this.a, null, 6, 0);
    }

    public final void n(View view, VKImageController.b bVar) {
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

    /* compiled from: DefaultDsImageController.kt */
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
