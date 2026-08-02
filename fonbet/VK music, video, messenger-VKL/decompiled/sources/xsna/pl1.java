package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.tile.VkTile;
import com.vk.dto.photo.PhotoAlbum;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.LazyThreadSafetyMode;
import xsna.tlo0;

/* compiled from: AlbumViewHolder.kt */
/* loaded from: classes4.dex */
public final class pl1 extends vif0<PhotoAlbum> {
    public final VkTile n;

    /* compiled from: AlbumViewHolder.kt */
    public static final class a implements VkTile.g {
        public final el1 a;
        public final boolean b;
        public final FrameLayout c;
        public final li1 d;
        public final VkPicture e;
        public final Object f;
        public final Object g;

        public a(Context context, el1 el1Var, boolean z) {
            this.a = el1Var;
            this.b = z;
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.content);
            li1 li1Var = new li1(context);
            li1Var.setId(R.id.cover);
            li1Var.setCornerRadius(cn70.a() * 12.0f);
            frameLayout.addView(li1Var);
            li1Var.setLayoutParams(new FrameLayout.LayoutParams(-1, cn70.b(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE)));
            this.d = li1Var;
            VkPicture vkPicture = new VkPicture(context, null, 6, 0);
            vkPicture.setId(R.id.privacy_icon);
            int b = cn70.b(24);
            vkPicture.setLayoutParams(new FrameLayout.LayoutParams(b, b, 8388691));
            int b2 = cn70.b(4);
            f4m.u(vkPicture, b2, 0, 0, b2);
            vkPicture.setImageResource(R.drawable.vk_icon_lock_shadow_24);
            frameLayout.addView(vkPicture);
            this.e = vkPicture;
            this.c = frameLayout;
            nl1 nl1Var = new nl1(context, this, 0);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            this.f = msy.a(lazyThreadSafetyMode, nl1Var);
            this.g = msy.a(lazyThreadSafetyMode, new ol1(context, this, 0));
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.core.view.components.tile.VkTile.g
        public final void a(ConstraintLayout constraintLayout, VkTile.h hVar) {
            if (hVar instanceof b) {
                b bVar = (b) hVar;
                PhotoAlbum photoAlbum = bVar.a;
                if (photoAlbum.s != null) {
                    li1 li1Var = this.d;
                    if (li1Var != null) {
                        li1Var.setPlaceholderImage((Drawable) this.g.getValue());
                        li1Var.a(myc0.f(photoAlbum.l) ? photoAlbum.l : photoAlbum.k, photoAlbum.s.d);
                    }
                } else {
                    li1 li1Var2 = this.d;
                    if (li1Var2 != null) {
                        VkPicture vkPicture = li1Var2.d;
                        li1Var2.setPlaceholderImage((Drawable) this.f.getValue());
                        vkPicture.setVkPostprocessor(null);
                        vkPicture.setActualColorFilter((ColorFilter) null);
                        vkPicture.setOverlayImage(null);
                        sr10 sr10Var = dy2.a;
                        boolean z = !(sr10Var != null ? sr10Var.c() : true) && myc0.f(photoAlbum.l);
                        boolean z2 = photoAlbum.m > 0;
                        if (z) {
                            vkPicture.o0(photoAlbum.l, null);
                        } else if (z2) {
                            vkPicture.o0(photoAlbum.k, null);
                        } else {
                            vkPicture.clear();
                        }
                    }
                }
                boolean a = this.a.a(bVar.a);
                VkPicture vkPicture2 = this.e;
                if (vkPicture2 != null) {
                    f4m.E(vkPicture2, a);
                }
                FrameLayout frameLayout = this.c;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                boolean z3 = this.b;
                layoutParams.width = z3 ? 0 : hbh0.b(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, constraintLayout.getContext());
                layoutParams.height = -2;
                frameLayout.setLayoutParams(layoutParams);
                li1 li1Var3 = this.d;
                if (li1Var3 != null) {
                    li1Var3.setQuad(z3);
                }
            }
        }

        @Override // com.vk.core.view.components.tile.VkTile.g
        public final View getView() {
            return this.c;
        }
    }

    /* compiled from: AlbumViewHolder.kt */
    public static final class b implements VkTile.h {
        public final PhotoAlbum a;

        public b(PhotoAlbum photoAlbum) {
            this.a = photoAlbum;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AlbumVisualContentParams(photoAlbum=" + this.a + ')';
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pl1(ViewGroup viewGroup, boolean z, el1 el1Var, izs<? super PhotoAlbum, s3q0> izsVar) {
        super(r1, viewGroup);
        Context context = viewGroup.getContext();
        VkTile vkTile = new VkTile(context, null, 6);
        vkTile.setVisualContentController(new a(context, el1Var, z));
        vkTile.setTextAlignment(VkTile.TextAlignment.Start);
        VkTile vkTile2 = (VkTile) this.itemView;
        vkTile2.setOnClickListener(new com.vk.im.video.c(1, izsVar, this));
        this.n = vkTile2;
    }

    @Override // xsna.vif0
    public final void i6(PhotoAlbum photoAlbum) {
        PhotoAlbum photoAlbum2 = photoAlbum;
        b bVar = new b(photoAlbum2);
        VkTile vkTile = this.n;
        vkTile.setVisualContentParams(bVar);
        vkTile.setTitle(new VkTile.e(oq.d(tlo0.Companion, photoAlbum2.g), 1, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED));
        Resources resources = this.itemView.getContext().getResources();
        int i = photoAlbum2.f;
        vkTile.setSubtitle(new VkTile.d(new tlo0.h(resources.getQuantityString(R.plurals.media_picker_album_numphotos, i, Integer.valueOf(i))), 0, null, null, null, null, 62));
    }
}
