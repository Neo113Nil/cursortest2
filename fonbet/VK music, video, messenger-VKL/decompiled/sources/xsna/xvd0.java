package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.cell.VkCell;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: ProfileDraftCoverPreviewFactory.kt */
/* loaded from: classes16.dex */
public final class xvd0 implements VkCell.e {

    /* compiled from: ProfileDraftCoverPreviewFactory.kt */
    public final class a extends ConstraintLayout {
        public final VKImageView t;
        public final View u;

        public a(Context context) {
            super(context, null, 0);
            LayoutInflater.from(context).inflate(R.layout.draft_small_item_cover_preview, (ViewGroup) this, true);
            this.t = (VKImageView) findViewById(R.id.draft_cover_preview);
            this.u = findViewById(R.id.draft_template_icon);
        }

        public final void setCover(String str) {
            VKImageView vKImageView = this.t;
            if (str != null) {
                vKImageView.L0(Uri.parse(str), ImageScreenSize.VERY_SMALL);
            } else {
                vKImageView.W();
            }
        }

        public final void setIsTemplateDraft(boolean z) {
            awt0.v(this.u, z);
        }
    }

    /* compiled from: ProfileDraftCoverPreviewFactory.kt */
    public final class b implements VkCell.d {
        public final a a;

        public b(xvd0 xvd0Var, Context context) {
            this.a = new a(context);
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            if ((fVar instanceof c ? (c) fVar : null) != null) {
                c cVar = (c) fVar;
                String str = cVar.a;
                a aVar = this.a;
                aVar.setCover(str);
                aVar.setIsTemplateDraft(cVar.b);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: ProfileDraftCoverPreviewFactory.kt */
    public static final class c implements VkCell.f {
        public final String a;
        public final boolean b;

        public c(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            String str = this.a;
            return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DraftPreviewParams(url=");
            sb.append(this.a);
            sb.append(", isTemplateDraft=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.e
    public final VkCell.d create(Context context) {
        return new b(this, context);
    }
}
