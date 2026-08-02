package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedBlurredPhotoView;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedPhotoView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.MarketAlbumAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.lps0;
import xsna.tr00;
import xsna.y4a0;

/* compiled from: ImagesAdapter.kt */
/* loaded from: classes4.dex */
public class knw extends b6y0<de6<?>> {
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public final h170 b;
    public final fz5 c = new fz5();
    public final ArrayList d = new ArrayList();
    public boolean e = true;
    public m680 f;
    public m680 g;
    public s6o h;
    public FunctionReferenceImpl i;

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        j = gbg0.a(context.getResources(), 135.0f);
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        k = gbg0.a(context2.getResources(), 100.0f);
        Context context3 = e43.a;
        if (context3 == null) {
            context3 = null;
        }
        l = gbg0.a(context3.getResources(), 360.0f);
        Context context4 = e43.a;
        m = gbg0.a((context4 != null ? context4 : null).getResources(), 179.0f);
    }

    public knw(h170 h170Var) {
        this.b = h170Var;
    }

    @Override // xsna.b6y0
    public int a() {
        return g().size();
    }

    @Override // xsna.b6y0
    public void b(int i, e6y0 e6y0Var) {
        int i2;
        Image image;
        ArrayList arrayList;
        Attachment attachment = (Attachment) j5g.b0(i, g());
        boolean z = attachment instanceof PhotoAttachment;
        int i3 = k;
        int i4 = j;
        if (z) {
            ImageSize imageSize = (ImageSize) ixj0.b(((PhotoAttachment) attachment).l.y.b);
            int i5 = imageSize != null ? imageSize.d.b : 0;
            i2 = imageSize != null ? imageSize.d.c : 0;
            if (i5 > 0) {
                i4 = i5;
            }
            e6y0Var.a = i4;
            if (i2 > 0) {
                i3 = i2;
            }
            e6y0Var.b = i3;
            return;
        }
        if (attachment instanceof VideoAttachment) {
            VideoAttachment videoAttachment = (VideoAttachment) attachment;
            e6y0Var.a = videoAttachment.k.getWidth() > 0 ? videoAttachment.k.getWidth() : l;
            e6y0Var.b = videoAttachment.k.getHeight() > 0 ? videoAttachment.k.getHeight() : m;
            return;
        }
        r4 = null;
        r4 = null;
        ImageSize imageSize2 = null;
        if (attachment instanceof MarketAlbumAttachment) {
            Photo photo = ((MarketAlbumAttachment) attachment).f.e;
            if (photo != null && (image = photo.y) != null && (arrayList = image.b) != null) {
                imageSize2 = (ImageSize) ixj0.b(arrayList);
            }
            int i6 = imageSize2 != null ? imageSize2.d.b : 0;
            i2 = imageSize2 != null ? imageSize2.d.c : 0;
            if (i6 > 0) {
                i4 = i6;
            }
            e6y0Var.a = i4;
            if (i2 > 0) {
                i3 = i2;
            }
            e6y0Var.b = i3;
            return;
        }
        if (attachment instanceof DocumentAttachment) {
            DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
            Image image2 = documentAttachment.s;
            ImageSize imageSize3 = (ImageSize) ixj0.b(image2 != null ? image2.b : null);
            int i7 = imageSize3 != null ? imageSize3.d.b : documentAttachment.l;
            int i8 = imageSize3 != null ? imageSize3.d.c : documentAttachment.m;
            if (i7 > 0) {
                i4 = i7;
            }
            e6y0Var.a = i4;
            if (i8 > 0) {
                i3 = i8;
            }
            e6y0Var.b = i3;
        }
    }

    @Override // xsna.b6y0
    public int c(int i) {
        Attachment attachment = g().get(i);
        this.c.getClass();
        return fz5.m(attachment);
    }

    @Override // xsna.b6y0
    public final /* bridge */ /* synthetic */ void d(de6<?> de6Var, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    public List<Attachment> g() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.b6y0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void e(de6<?> de6Var, int i) {
        Attachment attachment = (Attachment) j5g.b0(i, g());
        if (attachment != null) {
            m680 m680Var = this.f;
            de6Var.d = attachment;
            de6Var.e = null;
            de6Var.f = m680Var;
            de6Var.b(attachment);
            s6o s6oVar = this.h;
            if (s6oVar != null) {
                de6Var.d(s6oVar);
            }
            if (de6Var instanceof xna0) {
                ((xna0) de6Var).a(this.g);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.b6y0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public de6 f(int i, ViewGroup viewGroup) {
        h170 h170Var = this.b;
        if (i == 0) {
            return new y9a0(viewGroup, this.e, this.i, h170Var);
        }
        if (i == 1) {
            return lps0.a.a(viewGroup, this.e);
        }
        if (i == 2) {
            return y4a0.a.a(viewGroup, this.e, this.i, h170Var);
        }
        if (i == 3) {
            return tr00.a.a(viewGroup, this.e, this.i);
        }
        if (i == 4) {
            return new ntn(new iun(viewGroup, this.e), 4);
        }
        if (i == 5) {
            return new ntn(new iun(viewGroup, this.e), 5);
        }
        int i2 = 6;
        AttributeSet attributeSet = null;
        if (i == 10) {
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            RestrictedPhotoView restrictedPhotoView = new RestrictedPhotoView(viewGroup.getContext(), attributeSet, i2, 0);
            restrictedPhotoView.setId(R.id.attach);
            frameLayout.addView(restrictedPhotoView);
            return new cba0(frameLayout);
        }
        if (i != 11) {
            return null;
        }
        FrameLayout frameLayout2 = new FrameLayout(viewGroup.getContext());
        RestrictedBlurredPhotoView restrictedBlurredPhotoView = new RestrictedBlurredPhotoView(viewGroup.getContext(), null, 6);
        restrictedBlurredPhotoView.setId(R.id.attach);
        restrictedBlurredPhotoView.c(R.drawable.vk_icon_hide_outline_56, -1, RestrictedPhotoView.u);
        int b = cn70.b(8);
        restrictedBlurredPhotoView.setPadding(b, b, b, b);
        frameLayout2.addView(restrictedBlurredPhotoView);
        return new r5a0(frameLayout2);
    }
}
