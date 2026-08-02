package xsna;

import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink;
import com.vk.newsfeed.posting.crop_editor.domain.model.LocalImageLink;
import com.vk.newsfeed.posting.impl.domain.model.CropFitContainerMode;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;

/* compiled from: CropEditorState.kt */
/* loaded from: classes4.dex */
public abstract class bhk implements km50 {

    /* compiled from: CropEditorState.kt */
    public static final class a extends bhk {
        public final ImageLink b;
        public final PostingPreviewRatio c;
        public final ImageCropArea d;
        public final ImageCropArea e;
        public final boolean f;
        public final boolean g;
        public final CropFitContainerMode h;
        public final boolean i;
        public final MediaStoreEntry j;
        public final boolean k;

        public a(ImageLink imageLink, PostingPreviewRatio postingPreviewRatio, ImageCropArea imageCropArea, ImageCropArea imageCropArea2, boolean z, boolean z2, CropFitContainerMode cropFitContainerMode, boolean z3, MediaStoreEntry mediaStoreEntry, boolean z4) {
            this.b = imageLink;
            this.c = postingPreviewRatio;
            this.d = imageCropArea;
            this.e = imageCropArea2;
            this.f = z;
            this.g = z2;
            this.h = cropFitContainerMode;
            this.i = z3;
            this.j = mediaStoreEntry;
            this.k = z4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v13, types: [com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink] */
        public static a w(a aVar, LocalImageLink localImageLink, PostingPreviewRatio postingPreviewRatio, ImageCropArea imageCropArea, ImageCropArea imageCropArea2, CropFitContainerMode cropFitContainerMode, int i) {
            LocalImageLink localImageLink2 = localImageLink;
            if ((i & 1) != 0) {
                localImageLink2 = aVar.b;
            }
            LocalImageLink localImageLink3 = localImageLink2;
            if ((i & 2) != 0) {
                postingPreviewRatio = aVar.c;
            }
            PostingPreviewRatio postingPreviewRatio2 = postingPreviewRatio;
            ImageCropArea imageCropArea3 = (i & 4) != 0 ? aVar.d : imageCropArea;
            ImageCropArea imageCropArea4 = (i & 8) != 0 ? aVar.e : imageCropArea2;
            boolean z = aVar.f;
            boolean z2 = aVar.g;
            CropFitContainerMode cropFitContainerMode2 = (i & 64) != 0 ? aVar.h : cropFitContainerMode;
            boolean z3 = aVar.i;
            MediaStoreEntry mediaStoreEntry = aVar.j;
            boolean z4 = (i & 512) != 0 ? aVar.k : true;
            aVar.getClass();
            return new a(localImageLink3, postingPreviewRatio2, imageCropArea3, imageCropArea4, z, z2, cropFitContainerMode2, z3, mediaStoreEntry, z4);
        }

        @Override // xsna.bhk
        public final ImageCropArea a() {
            return this.d;
        }

        @Override // xsna.bhk
        public final CropFitContainerMode b() {
            return this.h;
        }

        @Override // xsna.bhk
        public final boolean c() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && epx.f(this.j, aVar.j) && this.k == aVar.k;
        }

        @Override // xsna.bhk
        public final ImageLink h() {
            return this.b;
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
            ImageCropArea imageCropArea = this.d;
            int hashCode2 = (hashCode + (imageCropArea == null ? 0 : imageCropArea.hashCode())) * 31;
            ImageCropArea imageCropArea2 = this.e;
            int b = qoy.b((this.h.hashCode() + qoy.b(qoy.b((hashCode2 + (imageCropArea2 == null ? 0 : imageCropArea2.hashCode())) * 31, 31, this.f), 31, this.g)) * 31, 31, this.i);
            MediaStoreEntry mediaStoreEntry = this.j;
            return Boolean.hashCode(this.k) + ((b + (mediaStoreEntry != null ? mediaStoreEntry.hashCode() : 0)) * 31);
        }

        @Override // xsna.bhk
        public final ImageCropArea m() {
            return this.e;
        }

        @Override // xsna.bhk
        public final MediaStoreEntry o() {
            return this.j;
        }

        @Override // xsna.bhk
        public final PostingPreviewRatio r() {
            return this.c;
        }

        @Override // xsna.bhk
        public final boolean s() {
            return this.g;
        }

        @Override // xsna.bhk
        public final boolean t() {
            return this.k;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Editing(imageLink=");
            sb.append(this.b);
            sb.append(", ratio=");
            sb.append(this.c);
            sb.append(", cropArea=");
            sb.append(this.d);
            sb.append(", initialCropArea=");
            sb.append(this.e);
            sb.append(", isNeedRecalculateRatio=");
            sb.append(this.f);
            sb.append(", isEditEnabled=");
            sb.append(this.g);
            sb.append(", fitContainerMode=");
            sb.append(this.h);
            sb.append(", hasGoods=");
            sb.append(this.i);
            sb.append(", originalMediaEntry=");
            sb.append(this.j);
            sb.append(", isImageEdited=");
            return defpackage.q0.a(sb, this.k, ')');
        }

        @Override // xsna.bhk
        public final boolean v() {
            return this.f;
        }
    }

    /* compiled from: CropEditorState.kt */
    public static final class b extends bhk {
        public final ImageLink b;
        public final PostingPreviewRatio c;
        public final ImageCropArea d;
        public final ImageCropArea e;
        public final boolean f;
        public final boolean g;
        public final CropFitContainerMode h;
        public final boolean i;
        public final MediaStoreEntry j;
        public final boolean k;

        public b(ImageLink imageLink, PostingPreviewRatio postingPreviewRatio, ImageCropArea imageCropArea, ImageCropArea imageCropArea2, boolean z, boolean z2, CropFitContainerMode cropFitContainerMode, boolean z3, MediaStoreEntry mediaStoreEntry, boolean z4) {
            this.b = imageLink;
            this.c = postingPreviewRatio;
            this.d = imageCropArea;
            this.e = imageCropArea2;
            this.f = z;
            this.g = z2;
            this.h = cropFitContainerMode;
            this.i = z3;
            this.j = mediaStoreEntry;
            this.k = z4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v13, types: [com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink] */
        public static b w(b bVar, LocalImageLink localImageLink, PostingPreviewRatio postingPreviewRatio, ImageCropArea imageCropArea, ImageCropArea imageCropArea2, CropFitContainerMode cropFitContainerMode, int i) {
            LocalImageLink localImageLink2 = localImageLink;
            if ((i & 1) != 0) {
                localImageLink2 = bVar.b;
            }
            LocalImageLink localImageLink3 = localImageLink2;
            if ((i & 2) != 0) {
                postingPreviewRatio = bVar.c;
            }
            PostingPreviewRatio postingPreviewRatio2 = postingPreviewRatio;
            ImageCropArea imageCropArea3 = (i & 4) != 0 ? bVar.d : imageCropArea;
            ImageCropArea imageCropArea4 = (i & 8) != 0 ? bVar.e : imageCropArea2;
            boolean z = bVar.f;
            boolean z2 = bVar.g;
            CropFitContainerMode cropFitContainerMode2 = (i & 64) != 0 ? bVar.h : cropFitContainerMode;
            boolean z3 = bVar.i;
            MediaStoreEntry mediaStoreEntry = bVar.j;
            boolean z4 = (i & 512) != 0 ? bVar.k : true;
            bVar.getClass();
            return new b(localImageLink3, postingPreviewRatio2, imageCropArea3, imageCropArea4, z, z2, cropFitContainerMode2, z3, mediaStoreEntry, z4);
        }

        @Override // xsna.bhk
        public final ImageCropArea a() {
            return this.d;
        }

        @Override // xsna.bhk
        public final CropFitContainerMode b() {
            return this.h;
        }

        @Override // xsna.bhk
        public final boolean c() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i && epx.f(this.j, bVar.j) && this.k == bVar.k;
        }

        @Override // xsna.bhk
        public final ImageLink h() {
            return this.b;
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
            ImageCropArea imageCropArea = this.d;
            int hashCode2 = (hashCode + (imageCropArea == null ? 0 : imageCropArea.hashCode())) * 31;
            ImageCropArea imageCropArea2 = this.e;
            int b = qoy.b((this.h.hashCode() + qoy.b(qoy.b((hashCode2 + (imageCropArea2 == null ? 0 : imageCropArea2.hashCode())) * 31, 31, this.f), 31, this.g)) * 31, 31, this.i);
            MediaStoreEntry mediaStoreEntry = this.j;
            return Boolean.hashCode(this.k) + ((b + (mediaStoreEntry != null ? mediaStoreEntry.hashCode() : 0)) * 31);
        }

        @Override // xsna.bhk
        public final ImageCropArea m() {
            return this.e;
        }

        @Override // xsna.bhk
        public final MediaStoreEntry o() {
            return this.j;
        }

        @Override // xsna.bhk
        public final PostingPreviewRatio r() {
            return this.c;
        }

        @Override // xsna.bhk
        public final boolean s() {
            return this.g;
        }

        @Override // xsna.bhk
        public final boolean t() {
            return this.k;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loading(imageLink=");
            sb.append(this.b);
            sb.append(", ratio=");
            sb.append(this.c);
            sb.append(", cropArea=");
            sb.append(this.d);
            sb.append(", initialCropArea=");
            sb.append(this.e);
            sb.append(", isNeedRecalculateRatio=");
            sb.append(this.f);
            sb.append(", isEditEnabled=");
            sb.append(this.g);
            sb.append(", fitContainerMode=");
            sb.append(this.h);
            sb.append(", hasGoods=");
            sb.append(this.i);
            sb.append(", originalMediaEntry=");
            sb.append(this.j);
            sb.append(", isImageEdited=");
            return defpackage.q0.a(sb, this.k, ')');
        }

        @Override // xsna.bhk
        public final boolean v() {
            return this.f;
        }
    }

    public abstract ImageCropArea a();

    public abstract CropFitContainerMode b();

    public abstract boolean c();

    public abstract ImageLink h();

    public abstract ImageCropArea m();

    public abstract MediaStoreEntry o();

    public abstract PostingPreviewRatio r();

    public abstract boolean s();

    public abstract boolean t();

    public abstract boolean v();
}
