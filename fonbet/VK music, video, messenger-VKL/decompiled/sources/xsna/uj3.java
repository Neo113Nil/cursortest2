package xsna;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.button.Appearance;
import com.vk.core.view.components.cell.button.IconBackgroundStyle;
import com.vk.core.view.components.cell.button.IconSize;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.builders.ListBuilder;
import ru.ok.android.commons.http.Http;
import xsna.ngv0;
import xsna.tlo0;

/* compiled from: ArchivedCommentViewHolderV2.kt */
/* loaded from: classes4.dex */
public final class uj3 extends aa implements dsx0 {
    public final afg o;
    public final View p;
    public final ViewGroup q;
    public final VkRichCell r;
    public int s;
    public final Object t;

    /* compiled from: ArchivedCommentViewHolderV2.kt */
    public static final class a implements VkCell.f {
    }

    public uj3(int i, ViewGroup viewGroup, afg afgVar) {
        super(viewGroup, R.layout.archived_comment_v2, 0);
        this.o = afgVar;
        ViewGroup viewGroup2 = (ViewGroup) this.itemView.findViewById(R.id.archived_comment_container);
        View inflate = LayoutInflater.from(this.itemView.getContext()).inflate(i, viewGroup2, false);
        viewGroup2.addView(inflate, 0);
        this.p = inflate;
        this.q = (ViewGroup) this.itemView.findViewById(R.id.actions_container);
        VkRichCell vkRichCell = (VkRichCell) inflate.findViewById(R.id.vk_rich_cell);
        this.r = vkRichCell;
        vkRichCell.setLeftMainAvatarController(new tj3());
        this.t = msy.a(LazyThreadSafetyMode.NONE, new z4(this, 4));
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    public final void A6(int i, String str) {
        ugv0 ugv0Var;
        VkCell.Left.b a2 = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new a(), getItemViewType() == 411 ? VkCell.Left.Main.Size.Small : VkCell.Left.Main.Size.ExtraSmall));
        VkRichCell vkRichCell = this.r;
        vkRichCell.setLeft(a2);
        switch (getItemViewType()) {
            case 413:
            case 414:
            case 415:
            case Http.StatusCode.RANGE_NOT_SATISFIABLE /* 416 */:
                f4m.x(((Number) this.t.getValue()).intValue(), vkRichCell);
                break;
        }
        String string = this.itemView.getContext().getString(i);
        int f = e3m.f(R.attr.vk_ui_text_secondary, this.itemView.getContext());
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(f), 0, spannableString.length(), 33);
        if (str != null) {
            SpannableString spannableString2 = new SpannableString(str);
            spannableString2.setSpan(new b(), 0, str.length(), 33);
            tlo0.Companion.getClass();
            ugv0Var = new ugv0(new tlo0.h(spannableString2), (ngv0.a) null, (ngv0.a) null, 1, (fy0) null, 54);
        } else {
            ugv0Var = null;
        }
        ugv0 ugv0Var2 = ugv0Var;
        tlo0.Companion.getClass();
        vkRichCell.setMiddle(ahn.v(new vgv0(new tlo0.h(spannableString), (ngv0.a) null, (ngv0) null, 1, 22), ugv0Var2, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED));
    }

    @Override // xsna.dsx0
    public final int a3() {
        return this.s;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vif0
    public final void i6(iag iagVar) {
        final iag iagVar2 = iagVar;
        boolean z3 = iagVar2.z3();
        int i = R.string.comment_deleted;
        int i2 = z3 ? R.string.comment_thread_deleted : R.string.comment_deleted;
        List<qj3> x6 = iagVar2.z3() ? x6() : v6(iagVar2);
        this.s = x6.size();
        int size = x6.size();
        ViewGroup viewGroup = this.q;
        if (size == 1) {
            final qj3 qj3Var = (qj3) j5g.Y(x6);
            bwt0.p0(viewGroup, false);
            if (iagVar2.z3()) {
                i = R.string.comment_thread_deleted;
            }
            A6(i, qj3Var.d);
            this.r.setOnClickListener(new View.OnClickListener() { // from class: xsna.rj3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (jjc.b()) {
                        return;
                    }
                    uj3 uj3Var = uj3.this;
                    uj3Var.o.f8(qj3Var.a, iagVar2, uj3Var);
                }
            });
        } else {
            bwt0.p0(viewGroup, true);
            int i3 = 0;
            for (Object obj : x6) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    e43.t();
                    throw null;
                }
                final qj3 qj3Var2 = (qj3) obj;
                View childAt = viewGroup.getChildAt(i3);
                VkCellButton vkCellButton = (VkCellButton) childAt.findViewById(R.id.action_vk_cell_button);
                int itemViewType = getItemViewType();
                if (itemViewType == 413 || itemViewType == 415) {
                    f4m.x(((Number) this.t.getValue()).intValue(), childAt);
                }
                int i5 = qj3Var2.b;
                int i6 = qj3Var2.a;
                vkCellButton.a(true, Integer.valueOf(i5));
                vkCellButton.setTitle(qj3Var2.c);
                vkCellButton.setAppearance(i6 == -1 ? Appearance.Neutral : Appearance.Neutral);
                vkCellButton.setIconSize(IconSize.Small);
                vkCellButton.setIconTint(R.attr.vk_ui_icon_secondary);
                vkCellButton.setIconBackgroundStyle(IconBackgroundStyle.None);
                vkCellButton.setAlpha(i6 == -1 ? 0.4f : 1.0f);
                vkCellButton.setClickable(i6 != -1);
                vkCellButton.setOnClickListener(new View.OnClickListener() { // from class: xsna.sj3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (jjc.b()) {
                            return;
                        }
                        uj3 uj3Var = uj3.this;
                        uj3Var.o.f8(qj3Var2.a, iagVar2, uj3Var);
                    }
                });
                i3 = i4;
            }
            int childCount = viewGroup.getChildCount();
            for (int size2 = x6.size(); size2 < childCount; size2++) {
                viewGroup.getChildAt(size2).setVisibility(8);
            }
        }
        A6(i2, this.s == 1 ? (iagVar2.z3() ? (qj3) j5g.Y(x6()) : (qj3) j5g.Y(v6(iagVar2))).d : null);
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

    public final ListBuilder v6(iag iagVar) {
        String string;
        ListBuilder e = e43.e();
        afg afgVar = this.o;
        boolean sd = afgVar.sd(iagVar);
        boolean F4 = afgVar.F4(iagVar);
        boolean tf = afgVar.tf(iagVar);
        boolean Xa = afgVar.Xa(iagVar);
        e.add(new qj3(12, R.drawable.vk_icon_comment_outline_24, this.itemView.getContext().getString(R.string.comment_action_restore_comment), this.itemView.getContext().getString(R.string.comment_restore)));
        if (tf) {
            Context context = this.itemView.getContext();
            String N1 = iagVar.N1();
            if (N1 == null) {
                N1 = iagVar.y1();
            }
            String string2 = context.getString(R.string.comment_action_report_user, N1);
            e.add(new qj3(13, R.drawable.vk_icon_report_outline_24, string2, string2));
        }
        if (sd || F4) {
            int i = !iagVar.d5() ? 14 : 17;
            if (iagVar.d5()) {
                Context context2 = this.itemView.getContext();
                String N12 = iagVar.N1();
                if (N12 == null) {
                    N12 = iagVar.y1();
                }
                string = context2.getString(R.string.comment_action_unban_user, N12);
            } else {
                Context context3 = this.itemView.getContext();
                String N13 = iagVar.N1();
                if (N13 == null) {
                    N13 = iagVar.y1();
                }
                string = context3.getString(R.string.comment_action_ban_user, N13);
            }
            e.add(new qj3(i, R.drawable.vk_icon_block_outline_24, string, string));
        }
        if (Xa) {
            String string3 = this.itemView.getContext().getString(R.string.comment_action_delete_thread);
            e.add(new qj3(15, R.drawable.vk_icon_delete_outline_24, string3, string3));
        }
        return e.g();
    }

    public final List<qj3> x6() {
        return Collections.singletonList(new qj3(16, R.drawable.vk_icon_comment_outline_24, this.itemView.getContext().getString(R.string.comment_action_restore_thread), this.itemView.getContext().getString(R.string.comment_restore)));
    }

    /* compiled from: ArchivedCommentViewHolderV2.kt */
    public static final class b extends ClickableSpan {
        public b() {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(e3m.f(R.attr.vk_ui_text_link, uj3.this.itemView.getContext()));
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
        }
    }
}
