package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.View;
import com.vk.bridges.ImageViewer;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PhotoController.kt */
/* loaded from: classes4.dex */
public final class v5a0 {
    public final VkImage a;
    public ImageViewer.c<AttachmentWithMedia> b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new Cnew(this, 22));
    public NewsEntry d;
    public Integer e;

    public v5a0(VkImage vkImage) {
        this.a = vkImage;
    }

    /* compiled from: PhotoController.kt */
    public final class a implements ImageViewer.a {
        public final fp7 a = new fp7();
        public io.reactivex.rxjava3.disposables.c b;
        public Integer c;

        public a() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final View c(int i) {
            v5a0 v5a0Var = v5a0.this;
            Integer num = v5a0Var.e;
            if (num != null && num.intValue() == i) {
                return v5a0Var.a;
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect d(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Integer f() {
            return this.c;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect g() {
            return bwt0.F(v5a0.this.a);
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean h() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String i() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Context j() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String m(int i, int i2) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        @SuppressLint({"CheckResult"})
        public final void o() {
            List<EntryAttachment> N7;
            io.reactivex.rxjava3.internal.operators.observable.j1 a;
            v5a0 v5a0Var = v5a0.this;
            Parcelable parcelable = v5a0Var.d;
            fsx0 fsx0Var = parcelable instanceof fsx0 ? (fsx0) parcelable : null;
            if (fsx0Var == null || (N7 = fsx0Var.N7()) == null || (a = this.a.a(fsx0Var)) == null) {
                return;
            }
            this.b = a.subscribe(new a960(new n15(N7, this, v5a0Var, 8), 4), new n240(new ux40(v5a0Var, 12), 7));
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void onDismiss() {
            io.reactivex.rxjava3.disposables.c cVar = this.b;
            if (cVar != null) {
                cVar.dispose();
            }
            v5a0 v5a0Var = v5a0.this;
            v5a0Var.b = null;
            VkImage vkImage = v5a0Var.a;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final float[] q(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final ImageViewer.d r() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean s() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void a() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void p() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void b(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void e(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void n(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void t(Photo photo) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void v(AttachForMediaViewer attachForMediaViewer, ImageViewer.SwipeDirection swipeDirection, boolean z) {
        }
    }
}
