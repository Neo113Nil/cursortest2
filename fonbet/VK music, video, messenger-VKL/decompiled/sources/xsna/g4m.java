package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.picture.c;
import xsna.tlo0;

/* compiled from: DetailsCareerItem.kt */
/* loaded from: classes5.dex */
public final class g4m extends we6 {
    public final String g;
    public final String h;
    public final String i;
    public final Runnable j;
    public final int k = -1007;

    /* compiled from: DetailsCareerItem.kt */
    public static final class a implements VkCell.d {
        public final VkPicture a;

        public a(Context context) {
            VkPicture vkPicture = new VkPicture(context, null, 6, 0);
            vkPicture.setOutlineProvider(p0w0.a);
            vkPicture.setClipToOutline(true);
            this.a = vkPicture;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar != null) {
                this.a.setContent(new c.d(cVar.a, null));
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: DetailsCareerItem.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: DetailsCareerItem.kt */
    public static final class c implements VkCell.f {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("AvatarViewParams(avatarUri="), this.a, ')');
        }
    }

    /* compiled from: DetailsCareerItem.kt */
    public static final class d extends vif0<g4m> {
        @Override // xsna.vif0
        public final void i6(g4m g4mVar) {
            g4m g4mVar2 = g4mVar;
            VkCell vkCell = (VkCell) this.itemView;
            vkCell.setRightExtraActionPictureController(new b());
            VkCell.Middle.a aVar = VkCell.Middle.Companion;
            VkCell.Middle.e eVar = new VkCell.Middle.e(oq.d(tlo0.Companion, g4mVar2.g), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62);
            String str = g4mVar2.h;
            vkCell.setMiddle(VkCell.Middle.a.a(aVar, eVar, str.length() > 0 ? new VkCell.Middle.d(new tlo0.h(str), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62) : null, null, 12));
            String str2 = g4mVar2.i;
            vkCell.setRight(str2 != null ? VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.e(new c(str2), null), null, 27) : null);
        }
    }

    public g4m(String str, String str2, String str3, mhq0 mhq0Var) {
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = mhq0Var;
    }

    @Override // xsna.we6
    public final vif0<g4m> a(ViewGroup viewGroup) {
        d dVar = new d(new VkCell(viewGroup.getContext(), null, 6, 0), viewGroup);
        dVar.itemView.setOnClickListener(new gi8(dVar, 2));
        u11.h(-1, -2, dVar.itemView);
        return dVar;
    }

    @Override // xsna.we6
    public final int h() {
        return this.k;
    }
}
