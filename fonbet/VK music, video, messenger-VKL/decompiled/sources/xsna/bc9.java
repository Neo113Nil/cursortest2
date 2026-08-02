package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: CallerViewTypeDelegate.kt */
/* loaded from: classes7.dex */
public final class bc9 extends p1u0<zb9> {
    public final r97 a;

    /* compiled from: CallerViewTypeDelegate.kt */
    public static final class a extends nfz<zb9> {
        public final VkCell m;

        /* compiled from: CallerViewTypeDelegate.kt */
        /* renamed from: xsna.bc9$a$a, reason: collision with other inner class name */
        public static final class C2603a implements VkCell.e {

            /* compiled from: CallerViewTypeDelegate.kt */
            /* renamed from: xsna.bc9$a$a$a, reason: collision with other inner class name */
            public static final class C2604a implements VkCell.d {
                public final VkAvatar a;

                public C2604a(Context context) {
                    VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
                    vkAvatar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    this.a = vkAvatar;
                }

                @Override // com.vk.core.view.components.cell.VkCell.d
                public final void a(VkCell.f fVar) {
                    if ((fVar instanceof b ? (b) fVar : null) != null) {
                        VkAvatar vkAvatar = this.a;
                        vkAvatar.setContent(null);
                        vkAvatar.setBorder(null);
                    }
                }

                @Override // com.vk.core.view.components.cell.VkCell.d
                public final View getView() {
                    return this.a;
                }
            }

            @Override // com.vk.core.view.components.cell.VkCell.e
            public final VkCell.d create(Context context) {
                return new C2604a(context);
            }
        }

        /* compiled from: CallerViewTypeDelegate.kt */
        public static final class b implements VkCell.f {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                ((b) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Boolean.hashCode(false);
            }

            public final String toString() {
                return "AvatarViewParams(url=null, isNft=false)";
            }
        }

        public a(VkCell vkCell, r97 r97Var) {
            super(vkCell);
            this.m = vkCell;
            vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, null, null, new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7), 23));
            vkCell.setLeftMainAvatarController(new C2603a());
            bwt0.i0(vkCell, new fo6(5, r97Var, this));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(hfz hfzVar) {
            this.l = (zb9) hfzVar;
            VkCell.Left.b a = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new b(), VkCell.Left.Main.Size.Small));
            VkCell vkCell = this.m;
            vkCell.setLeft(a);
            vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(tq.h(tlo0.Companion, R.string.vkim_call_from_your_name), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d(new tlo0.h(null), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), null, 12));
        }
    }

    public bc9(r97 r97Var) {
        this.a = r97Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends zb9> b(ViewGroup viewGroup) {
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new a(vkCell, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof zb9;
    }
}
