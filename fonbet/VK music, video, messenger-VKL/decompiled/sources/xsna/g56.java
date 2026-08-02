package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: BaseArchivedCommunityPostCommentViewHolder.kt */
/* loaded from: classes4.dex */
public class g56 extends aa {
    public final afg o;
    public final ViewGroup p;
    public final Object q;

    /* compiled from: BaseArchivedCommunityPostCommentViewHolder.kt */
    public static final class a {
        public final int a;
        public final String b;

        public a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommentAction(actionId=");
            sb.append(this.a);
            sb.append(", title=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public g56(int i, ViewGroup viewGroup, afg afgVar) {
        super(viewGroup, i, 0);
        this.o = afgVar;
        this.p = (ViewGroup) this.itemView.findViewById(R.id.actions_container);
        this.q = msy.a(LazyThreadSafetyMode.NONE, new af0(3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.aa
    public final void t6() {
        boolean a4 = this.o.a4(this.n);
        View view = this.itemView;
        view.setAlpha(a4 ? 1.0f : 0.4f);
        if (view instanceof c0n) {
            ((c0n) view).setTouchEnabled(a4);
        }
    }

    public final void v6(ViewGroup viewGroup, a aVar, int i, iag iagVar) {
        boolean z = aVar.a != -1;
        String str = aVar.b;
        f56 f56Var = new f56(this, aVar, iagVar, 0);
        if (i <= this.p.getChildCount() - 1) {
            View childAt = viewGroup.getChildAt(i);
            VkButton vkButton = childAt instanceof VkButton ? (VkButton) childAt : null;
            if (vkButton != null) {
                vkButton.setVisibility(0);
                vkButton.setEnabled(z);
                vkButton.setText(str);
                bwt0.i0(vkButton, new tl0(f56Var, 11));
                return;
            }
            return;
        }
        VkButton vkButton2 = new VkButton(this.itemView.getContext(), null, 6, 0);
        vkButton2.setSize(VkButton.Size.Small);
        vkButton2.setMode(VkButton.Mode.Secondary);
        vkButton2.setAppearance(VkButton.Appearance.Neutral);
        vkButton2.setEnabled(z);
        vkButton2.setText(str);
        bwt0.i0(vkButton2, new ns1(f56Var, 7));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, iah0.a(8));
        vkButton2.setLayoutParams(layoutParams);
        viewGroup.addView(vkButton2);
    }

    public void x6(iag iagVar) {
        afg afgVar = this.o;
        boolean sd = afgVar.sd(iagVar);
        boolean F4 = afgVar.F4(iagVar);
        boolean tf = afgVar.tf(iagVar);
        int i = 1;
        boolean z = !iagVar.z3() && afgVar.Xa(iagVar);
        boolean Rf = afgVar.Rf(iagVar);
        a aVar = iagVar.i3() ? new a(19, this.itemView.getContext().getString(R.string.comment_action_restore_all)) : iagVar.z3() ? new a(20, this.itemView.getContext().getString(R.string.comment_action_restore_thread_and_root_comment)) : new a(12, this.itemView.getContext().getString(R.string.comment_restore));
        ViewGroup viewGroup = this.p;
        v6(viewGroup, aVar, 0, iagVar);
        if (Rf) {
            v6(viewGroup, new a(21, viewGroup.getContext().getString(R.string.comment_action_delete_all_for_week)), 1, iagVar);
            i = 2;
        }
        if (z) {
            v6(viewGroup, new a(15, viewGroup.getContext().getString(R.string.comment_action_delete_thread)), i, iagVar);
            i++;
        }
        if (sd || F4) {
            v6(viewGroup, new a(!iagVar.d5() ? 14 : -1, this.itemView.getContext().getString(R.string.comment_action_add_to_blacklist)), i, iagVar);
            i++;
        }
        if (tf) {
            v6(viewGroup, new a(iagVar.isReported() ? -1 : 9, this.itemView.getContext().getString(R.string.report_content)), i, iagVar);
            i++;
        }
        if (i < viewGroup.getChildCount()) {
            int childCount = viewGroup.getChildCount();
            while (i < childCount) {
                View childAt = viewGroup.getChildAt(i);
                VkButton vkButton = childAt instanceof VkButton ? (VkButton) childAt : null;
                if (vkButton != null) {
                    f4m.j(vkButton);
                }
                i++;
            }
        }
    }

    /* compiled from: BaseArchivedCommunityPostCommentViewHolder.kt */
    public static final class b implements VkCell.d {
        public final VkAvatar a;

        public b(Context context) {
            VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
            vkAvatar.setPlaceholderImage(R.drawable.vk_icon_avatar_placeholder_anonim_150);
            this.a = vkAvatar;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
        }
    }
}
