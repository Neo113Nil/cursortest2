package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.core.ui.image.VKImageController;
import com.vk.dto.common.id.UserId;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.cq5;
import xsna.f5h0;
import xsna.ggn0;
import xsna.hgn0;
import xsna.p9r0;

/* compiled from: VKSuperappAvatarController.kt */
/* loaded from: classes6.dex */
public final class lgr0 extends com.vk.core.ui.image.b<ggn0> {
    public static final List<String> g = Collections.singletonList("c_uniq_tag");
    public final bpn0 c;
    public boolean d;
    public int e;
    public hgn0.a f;

    /* compiled from: VKSuperappAvatarController.kt */
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

    public lgr0(Context context, bpn0 bpn0Var) {
        super(context);
        this.c = bpn0Var;
        this.f = new hgn0.a(AvatarBorderType.CIRCLE, cq5.b.a);
    }

    public static void l(ggn0 ggn0Var, VKImageController.b bVar) {
        ImageView.ScaleType scaleType;
        int i = a.$EnumSwitchMapping$0[bVar.h.ordinal()];
        if (i == 1) {
            scaleType = ImageView.ScaleType.FIT_XY;
        } else if (i == 2) {
            scaleType = ImageView.ScaleType.CENTER_INSIDE;
        } else if (i == 3) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        ggn0Var.setScaleType(scaleType);
    }

    public static void m(ggn0 ggn0Var, VKImageController.b bVar, hgn0.a aVar) {
        int i = bVar.e;
        if (i != 0) {
            ggn0Var.H(i, aVar);
            return;
        }
        Drawable drawable = bVar.f;
        if (drawable == null) {
            return;
        }
        VKImageController.ScaleType scaleType = bVar.i;
        f5h0.d dVar = f5h0.m.a;
        if (scaleType == null) {
            ggn0Var.P(drawable, dVar, aVar);
            return;
        }
        int i2 = a.$EnumSwitchMapping$0[scaleType.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                dVar = f5h0.g.a;
            } else if (i2 == 3) {
                dVar = f5h0.f.a;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = f5h0.i.a;
            }
        }
        ggn0Var.P(drawable, dVar, aVar);
    }

    public static void n(ggn0 ggn0Var, VKImageController.b bVar) {
        m(ggn0Var, bVar, hgn0.a.c);
    }

    @Override // com.vk.core.ui.image.VKImageController
    public final void a(Drawable drawable, VKImageController.b bVar) {
        n(getView(), bVar);
        l(getView(), bVar);
        getView().N(drawable, hgn0.a.c);
    }

    @Override // com.vk.core.ui.image.b, com.vk.core.ui.image.a
    public final void b(int i) {
        getView().setTopMargin(i);
    }

    @Override // com.vk.core.ui.image.b, com.vk.core.ui.image.a
    public final void c(boolean z) {
        this.d = z;
        if (z) {
            this.f = hgn0.a.a(this.f, null, new cq5.a(new p9r0.c(this.e)), 1);
        } else {
            this.f = hgn0.a.a(this.f, null, cq5.b.a, 1);
        }
        getView().setupBorder(this.f);
    }

    @Override // com.vk.core.ui.image.b, com.vk.core.ui.image.VKImageController
    public final void d(String str, VKImageController.b bVar, tcr0 tcr0Var) {
        n(getView(), bVar);
        l(getView(), bVar);
        getView().setOnLoadCallback(new b(tcr0Var));
        String uri = str != null ? jeq0.d(Uri.parse(str), g).toString() : null;
        if (bVar.n) {
            getView().i(uri, hgn0.a.c);
        } else {
            getView().G(uri, hgn0.a.c);
        }
    }

    @Override // com.vk.core.ui.image.b, com.vk.core.ui.image.a
    public final void e(int i) {
        getView().setLeftMargin(i);
    }

    @Override // com.vk.core.ui.image.VKImageController
    public final void f(String str, VKImageController.b bVar) {
        n(getView(), bVar);
        l(getView(), bVar);
        String uri = str != null ? jeq0.d(Uri.parse(str), g).toString() : null;
        if (bVar.n) {
            getView().i(uri, hgn0.a.c);
        } else {
            getView().G(uri, hgn0.a.c);
        }
    }

    @Override // com.vk.core.ui.image.b, com.vk.core.ui.image.a
    public final void g(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        if (this.d) {
            this.f = hgn0.a.a(this.f, null, new cq5.a(new p9r0.c(i)), 1);
            getView().setupBorder(this.f);
        }
    }

    @Override // com.vk.core.ui.image.b, com.vk.core.ui.image.a
    public final void h(long j, String str, VKImageController.b bVar) {
        AvatarBorderType avatarBorderType = ((xku0) this.c.getValue()).c(new UserId(j)) ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE;
        hgn0.a aVar = this.f;
        if (aVar.a != avatarBorderType) {
            this.f = hgn0.a.a(aVar, avatarBorderType, null, 2);
        }
        m(getView(), bVar, this.f);
        l(getView(), bVar);
        getView().G(str, this.f);
    }

    @Override // com.vk.core.ui.image.b, com.vk.core.ui.image.a
    public final void i(int i) {
        getView().setBottomMargin(i);
    }

    @Override // com.vk.core.ui.image.VKImageController
    public final void j(int i, VKImageController.b bVar) {
        n(getView(), bVar);
        l(getView(), bVar);
        getView().M(i, hgn0.a.c);
    }

    @Override // com.vk.core.ui.image.b
    public final ggn0 k() {
        ggn0 ggn0Var = new ggn0(this.a, null, 0);
        ggn0Var.e = ggn0.a.e;
        return ggn0Var;
    }

    @Override // com.vk.core.ui.image.b, com.vk.core.ui.image.a
    public final void setAvatarSize(int i) {
        getView().setAvatarSize(i);
    }

    /* compiled from: VKSuperappAvatarController.kt */
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
