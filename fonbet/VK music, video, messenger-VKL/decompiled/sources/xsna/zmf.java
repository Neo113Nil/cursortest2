package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;

/* compiled from: ClipsVideoPreviewFactory.kt */
/* loaded from: classes16.dex */
public final class zmf implements VkCell.e {

    /* compiled from: ClipsVideoPreviewFactory.kt */
    public final class a implements VkCell.d {
        public final ymf a;

        public a(Context context) {
            this.a = new ymf(context);
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            if ((fVar instanceof b ? (b) fVar : null) != null) {
                b bVar = (b) fVar;
                String str = bVar.a;
                ymf ymfVar = this.a;
                ymfVar.setCover(str);
                ymfVar.setDuration(bVar.b);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: ClipsVideoPreviewFactory.kt */
    public static final class b implements VkCell.f {
        public final String a;
        public final int b;

        public b(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            String str = this.a;
            return Integer.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClipsVideoPreviewParams(url=");
            sb.append(this.a);
            sb.append(", duration=");
            return vu5.b(sb, this.b, ')');
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.e
    public final VkCell.d create(Context context) {
        return new a(context);
    }
}
