package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.ui.ad.AdvertBannerView;

/* compiled from: AdvertBannerDelegate.kt */
/* loaded from: classes2.dex */
public final class e31 extends p1u0<AboutVideoItem.c> {
    public final c4 a;
    public final hqa0 b;
    public final wc0 c;

    /* compiled from: AdvertBannerDelegate.kt */
    public final class a extends vfz<AboutVideoItem.c> {
        public final c4 l;
        public AboutVideoItem.c m;
        public AdvertBannerView n;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(ViewGroup viewGroup, c4 c4Var) {
            super(r3);
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            this.l = c4Var;
        }

        @Override // xsna.vfz
        public final void W5(AboutVideoItem.c cVar) {
            AboutVideoItem.c cVar2 = cVar;
            if (this.n == null) {
                AdvertBannerView.c cVar3 = AdvertBannerView.f;
                Context context = this.itemView.getContext();
                d31 d31Var = new d31(this);
                cVar3.getClass();
                AdvertBannerView b = AdvertBannerView.c.b(context, d31Var);
                if (b != null) {
                    this.n = b;
                    View view = this.itemView;
                    ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                    if (viewGroup != null) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams.gravity = 48;
                        s3q0 s3q0Var = s3q0.a;
                        viewGroup.addView(b, layoutParams);
                    }
                }
            }
            if (cVar2.equals(this.m)) {
                return;
            }
            this.m = cVar2;
            if (!(cVar2 instanceof AboutVideoItem.c.a)) {
                AdvertBannerView advertBannerView = this.n;
                if (advertBannerView == null || !advertBannerView.c) {
                    return;
                }
                bwt0.p0(advertBannerView, false);
                advertBannerView.a();
                return;
            }
            AboutVideoItem.c.a aVar = (AboutVideoItem.c.a) cVar2;
            AdvertBannerView advertBannerView2 = this.n;
            if (advertBannerView2 != null) {
                String str = aVar.b.a.a;
                advertBannerView2.setWebViewClient(new com.vk.libvideo.ui.ad.a(advertBannerView2, AdvertBannerView.Style.VERTICAL, new a31(this, e31.this, aVar, 0)));
                advertBannerView2.loadDataWithBaseURL(null, str, "text/html", C.UTF8_NAME, null);
            }
        }
    }

    public e31(c4 c4Var, hqa0 hqa0Var, wc0 wc0Var) {
        this.a = c4Var;
        this.b = hqa0Var;
        this.c = wc0Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.c> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.c;
    }
}
