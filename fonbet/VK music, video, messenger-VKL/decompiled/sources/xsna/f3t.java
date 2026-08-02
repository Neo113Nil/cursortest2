package xsna;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.masks.Mask;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.masks.MasksController;
import com.vk.media.ok.b;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GalleryDataAdapter.kt */
/* loaded from: classes16.dex */
public final class f3t extends sxm {
    public final szj0 i;
    public final n9b j;
    public b.f k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o = -1;

    /* compiled from: GalleryDataAdapter.kt */
    public abstract class a<LI extends hfz> extends vfz<LI> implements View.OnClickListener {
        public final VKImageView l;
        public final View m;
        public LI n;

        /* compiled from: GalleryDataAdapter.kt */
        /* renamed from: xsna.f3t$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2848a extends FunctionReferenceImpl implements izs<View, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(View view) {
                ((a) this.receiver).onClick(view);
                return s3q0.a;
            }
        }

        public a(int i, ViewGroup viewGroup) {
            super(i, viewGroup);
            VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.item_preview_image);
            this.l = vKImageView;
            this.m = this.itemView.findViewById(R.id.view_selected_foreground);
            jjc.g(vKImageView, new C2848a(1, this, a.class, "onClick", "onClick(Landroid/view/View;)V", 0));
            vKImageView.getHierarchy().p(new ColorDrawable(-7829368), 1);
            vKImageView.setCornerRadius((y8g0.b(R.dimen.effect_list_item_size) / 2) - y8g0.b(R.dimen.effect_list_item_margin_dp));
        }

        @Override // xsna.vfz
        public void V5() {
            this.m.setVisibility(getAdapterPosition() == f3t.this.o ? 0 : 8);
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public void i6(LI li) {
            this.n = li;
            this.m.setVisibility(getAdapterPosition() == f3t.this.o ? 0 : 8);
            i6(this.l, li);
        }

        @Override // xsna.vfz
        public void a6() {
            this.m.setVisibility(getAdapterPosition() == f3t.this.o ? 0 : 8);
        }

        public void h6() {
            this.m.setVisibility(8);
        }

        public abstract void i6(VKImageView vKImageView, LI li);
    }

    /* compiled from: GalleryDataAdapter.kt */
    public final class b extends a<oml> {
        public final CircularProgressIndicator p;
        public io.reactivex.rxjava3.disposables.c q;

        public b(ViewGroup viewGroup) {
            super(R.layout.item_default_sky_clips_gallery, viewGroup);
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) this.itemView.findViewById(R.id.view_circular_progress);
            this.p = circularProgressIndicator;
            Resources resources = circularProgressIndicator.getContext().getResources();
            circularProgressIndicator.setIndicatorSize(resources.getDimensionPixelSize(R.dimen.effect_list_item_size) - (resources.getDimensionPixelSize(R.dimen.effect_list_item_margin_dp) * 2));
        }

        @Override // xsna.f3t.a, xsna.vfz
        public final void V5() {
            int adapterPosition = getAdapterPosition();
            f3t f3tVar = f3t.this;
            this.m.setVisibility((adapterPosition != f3tVar.o || f3tVar.n) ? 8 : 0);
        }

        @Override // xsna.f3t.a, xsna.vfz
        /* renamed from: W5 */
        public final void i6(hfz hfzVar) {
            oml omlVar = (oml) hfzVar;
            this.n = omlVar;
            NotificationImage notificationImage = omlVar.b.l;
            if (notificationImage != null) {
                ImageScreenSize imageScreenSize = ImageScreenSize.SIZE_56DP;
                this.l.O0(NotificationImage.Db(notificationImage, imageScreenSize.h()), imageScreenSize);
            }
        }

        @Override // xsna.f3t.a, xsna.vfz
        public final void a6() {
            int adapterPosition = getAdapterPosition();
            f3t f3tVar = f3t.this;
            this.m.setVisibility((adapterPosition != f3tVar.o || f3tVar.n) ? 8 : 0);
        }

        @Override // xsna.f3t.a
        public final void h6() {
            super.h6();
            hg1.f(this.q);
            f3t.this.n = false;
            CircularProgressIndicator circularProgressIndicator = this.p;
            f4m.j(circularProgressIndicator);
            circularProgressIndicator.b(0, false);
        }

        @Override // xsna.f3t.a
        public final void i6(VKImageView vKImageView, oml omlVar) {
            NotificationImage notificationImage = omlVar.b.l;
            if (notificationImage != null) {
                ImageScreenSize imageScreenSize = ImageScreenSize.SIZE_56DP;
                vKImageView.O0(NotificationImage.Db(notificationImage, imageScreenSize.h()), imageScreenSize);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Mask mask;
            f3t f3tVar = f3t.this;
            int i = f3tVar.o;
            int adapterPosition = getAdapterPosition();
            CircularProgressIndicator circularProgressIndicator = this.p;
            if (i == adapterPosition) {
                hg1.f(this.q);
                f3tVar.n = false;
                f3tVar.o = -1;
                f4m.j(this.m);
                f4m.j(circularProgressIndicator);
                circularProgressIndicator.b(0, false);
                b.f fVar = f3tVar.k;
                if (fVar != null) {
                    fVar.b();
                    return;
                }
                return;
            }
            oml omlVar = (oml) this.n;
            if (omlVar == null || (mask = omlVar.b) == null) {
                return;
            }
            b.f fVar2 = f3tVar.k;
            if (fVar2 != null) {
                fVar2.b();
            }
            hg1.f(this.q);
            f3tVar.n = true;
            circularProgressIndicator.setVisibility(0);
            f3tVar.i.getClass();
            this.q = MasksController.f().g(mask).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new fsq(new udo(this, 10), 3));
            f3tVar.j.invoke(Integer.valueOf(f3tVar.o));
            f3tVar.o = getAdapterPosition();
        }
    }

    /* compiled from: GalleryDataAdapter.kt */
    public class c extends e<i3t> {
        public c(ViewGroup viewGroup) {
            super(R.layout.item_image_clips_gallery, viewGroup);
        }

        @Override // xsna.f3t.e
        public final boolean j6(i3t i3tVar) {
            Uri uri;
            i3t i3tVar2 = i3tVar;
            b.f fVar = f3t.this.k;
            if (fVar == null) {
                return true;
            }
            fVar.a(i3tVar2 != null ? i3tVar2.c : -1, String.valueOf((i3tVar2 == null || (uri = i3tVar2.b) == null) ? null : uri.getPath()));
            return true;
        }
    }

    /* compiled from: GalleryDataAdapter.kt */
    public class d extends e<i4t> {
        public d(ViewGroup viewGroup) {
            super(R.layout.item_image_clips_gallery, viewGroup);
        }

        @Override // xsna.f3t.e
        public final boolean j6(i4t i4tVar) {
            Uri uri;
            i4t i4tVar2 = i4tVar;
            b.f fVar = f3t.this.k;
            if (fVar == null) {
                return true;
            }
            fVar.a(-1, String.valueOf((i4tVar2 == null || (uri = i4tVar2.b) == null) ? null : uri.getPath()));
            return true;
        }
    }

    /* compiled from: GalleryDataAdapter.kt */
    public abstract class e<Item extends r4t> extends a<Item> {
        public e(int i, ViewGroup viewGroup) {
            super(i, viewGroup);
        }

        /* JADX WARN: Type inference failed for: r6v4, types: [REQUEST, com.facebook.imagepipeline.request.ImageRequest] */
        @Override // xsna.f3t.a
        public final void i6(VKImageView vKImageView, hfz hfzVar) {
            Uri uri = ((r4t) hfzVar).b;
            int a = iah0.a(52);
            x9g0 x9g0Var = new x9g0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a, a, 12);
            ImageRequestBuilder h = ImageRequestBuilder.h(uri);
            h.h = true;
            h.d = x9g0Var;
            ?? a2 = h.a();
            lpa0 lpa0Var = vgs.a.get();
            lpa0Var.c = a2;
            lpa0Var.l = vKImageView.getController();
            vKImageView.setController(lpa0Var.b());
        }

        public abstract boolean j6(Item item);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            f3t f3tVar = f3t.this;
            if (f3tVar.l) {
                int i = f3tVar.o;
                int adapterPosition = getAdapterPosition();
                View view2 = this.m;
                if (i != adapterPosition) {
                    if (j6((r4t) this.n)) {
                        f3tVar.j.invoke(Integer.valueOf(f3tVar.o));
                        f3tVar.o = getAdapterPosition();
                        view2.setVisibility(0);
                        return;
                    }
                    return;
                }
                if (f3tVar.m) {
                    f3tVar.o = -1;
                    view2.setVisibility(8);
                    b.f fVar = f3tVar.k;
                    if (fVar != null) {
                        fVar.b();
                    }
                }
            }
        }
    }

    /* compiled from: GalleryDataAdapter.kt */
    public class f extends e<m5t> {
        public final TextView q;

        public f(ViewGroup viewGroup) {
            super(R.layout.item_video_clips_gallery, viewGroup);
            this.q = (TextView) this.itemView.findViewById(R.id.duration_text);
        }

        @Override // xsna.f3t.a, xsna.vfz
        /* renamed from: W5 */
        public final void i6(hfz hfzVar) {
            super.i6((m5t) hfzVar);
            this.q.setText(i35.k(r3.c / 1000, 1) + y8g0.e(R.string.live_seconds_unit));
        }

        @Override // xsna.f3t.e
        public final boolean j6(m5t m5tVar) {
            Uri uri;
            m5t m5tVar2 = m5tVar;
            return f3t.this.J0(String.valueOf((m5tVar2 == null || (uri = m5tVar2.b) == null) ? null : uri.getPath()));
        }
    }

    public f3t(szj0 szj0Var, n9b n9bVar) {
        this.i = szj0Var;
        this.j = n9bVar;
        x0(i4t.class, new wik(this, 10));
        x0(i3t.class, new wcj(this, 14));
        x0(m5t.class, new srg(this, 16));
        x0(oml.class, new wzf(this, 21));
    }

    public final boolean J0(String str) {
        try {
            b.f fVar = this.k;
            if (fVar == null) {
                return true;
            }
            com.vk.media.ok.b.this.H.handleVideoTexture(str);
            return true;
        } catch (RuntimeException unused) {
            cvk.u(R.string.masks_file_error, false);
            return false;
        }
    }
}
