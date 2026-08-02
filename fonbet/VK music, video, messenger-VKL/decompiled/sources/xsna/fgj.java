package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.api.base.Document;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkPicture;
import com.vkontakte.android.R;
import java.util.Locale;
import xsna.tlo0;

/* compiled from: ContentDocumentAdapter.kt */
/* loaded from: classes5.dex */
public final class fgj extends zoj0<Document, b> {
    public final yve e;

    /* compiled from: ContentDocumentAdapter.kt */
    public static final class a extends m.e<Document> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(Document document, Document document2) {
            Document document3 = document;
            Document document4 = document2;
            return document3.c == document4.c && epx.f(document3.l, document4.l) && document3.g == document4.g && epx.f(document3.m, document4.m);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(Document document, Document document2) {
            return document.b == document2.b;
        }
    }

    /* compiled from: ContentDocumentAdapter.kt */
    public static final class b extends vif0<Document> {
        public final VkCell n;

        /* compiled from: ContentDocumentAdapter.kt */
        public static final class a implements VkCell.d {
            public final VkPicture a;

            public a(Context context) {
                VkPicture vkPicture = new VkPicture(context, null, 6, 0);
                vkPicture.setScaleType(ImageView.ScaleType.CENTER_CROP);
                vkPicture.setCornerRadius(VkPicture.CornerRadius.Large);
                vkPicture.setBackgroundImage(new ColorDrawable(krv0.m(R.attr.vk_ui_background_secondary, context)));
                this.a = vkPicture;
            }

            @Override // com.vk.core.view.components.cell.VkCell.d
            public final void a(VkCell.f fVar) {
                c cVar = fVar instanceof c ? (c) fVar : null;
                if (cVar != null) {
                    String str = cVar.a;
                    Drawable drawable = cVar.b;
                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                    VkPicture vkPicture = this.a;
                    vkPicture.J0(drawable, scaleType);
                    if (str == null || drm0.N(str)) {
                        vkPicture.clear();
                    } else {
                        vkPicture.o0(str, null);
                    }
                }
            }

            @Override // com.vk.core.view.components.cell.VkCell.d
            public final View getView() {
                return this.a;
            }
        }

        /* compiled from: ContentDocumentAdapter.kt */
        /* renamed from: xsna.fgj$b$b, reason: collision with other inner class name */
        public static final class C2869b implements VkCell.e {
            @Override // com.vk.core.view.components.cell.VkCell.e
            public final VkCell.d create(Context context) {
                return new a(context);
            }
        }

        /* compiled from: ContentDocumentAdapter.kt */
        public static final class c implements VkCell.f {
            public final String a;
            public final Drawable b;

            public c(Drawable drawable, String str) {
                this.a = str;
                this.b = drawable;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
            }

            public final int hashCode() {
                String str = this.a;
                return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public final String toString() {
                return "ImageViewParams(thumb=" + this.a + ", placeholderIcon=" + this.b + ')';
            }
        }

        public b(VkCell vkCell, yve yveVar) {
            super(vkCell);
            this.n = vkCell;
            bwt0.i0(vkCell, new j20(9, yveVar, this));
            vkCell.setLeftMainPictureController(new C2869b());
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            if (r1.equals("jpeg") == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
        
            if (r1.equals("flac") == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x00ae, code lost:
        
            r1 = com.vkontakte.android.R.drawable.vk_icon_song_outline_28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        
            if (r1.equals(io.jsonwebtoken.Header.COMPRESSION_ALGORITHM) == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
        
            r1 = com.vkontakte.android.R.drawable.vk_icon_zip_outline_28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            if (r1.equals("wav") == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        
            if (r1.equals("rar") == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
        
            if (r1.equals("png") == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
        
            if (r1.equals("mov") == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
        
            r1 = com.vkontakte.android.R.drawable.vk_icon_video_circle_outline_28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
        
            if (r1.equals("mp4") == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
        
            if (r1.equals("mp3") == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
        
            if (r1.equals("jpg") == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
        
            if (r1.equals("gif") == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
        
            if (r1.equals("avi") == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
        
            if (r1.equals("aac") == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
        
            if (r1.equals("webp") == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0091, code lost:
        
            r1 = com.vkontakte.android.R.drawable.vk_icon_picture_outline_28;
         */
        @Override // xsna.vif0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void i6(Document document) {
            int i;
            Document document2 = document;
            Context context = this.itemView.getContext();
            String str = document2.m;
            switch (str.hashCode()) {
                case 96323:
                    break;
                case 96980:
                    break;
                case 102340:
                    break;
                case 105441:
                    break;
                case 108272:
                    break;
                case 108273:
                    break;
                case 108308:
                    break;
                case 111145:
                    break;
                case 112675:
                    break;
                case 117484:
                    break;
                case 120609:
                    break;
                case 3145576:
                    break;
                case 3268712:
                    break;
                case 3645340:
                    break;
                default:
                    i = R.drawable.vk_icon_document_text_outline_28;
                    break;
            }
            VkCell.Left.b a2 = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.d(new c(uko.f(i, R.attr.vk_ui_icon_tertiary, context), document2.n), VkCell.Left.Main.Size.Medium));
            VkCell vkCell = this.n;
            vkCell.setLeft(a2);
            String upperCase = dun.s6(document2.g, b6()).toUpperCase(Locale.ROOT);
            String str2 = cqm0.n(document2.m) + " · " + pvo0.o(document2.c, true, false) + " · " + upperCase;
            tlo0.h d = oq.d(tlo0.Companion, document2.l);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(d, 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d(new tlo0.h(str2), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
        }
    }

    public fgj(yve yveVar) {
        super(new com.vk.lists.a(new a()));
        this.e = yveVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((b) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new b(vkCell, this.e);
    }
}
