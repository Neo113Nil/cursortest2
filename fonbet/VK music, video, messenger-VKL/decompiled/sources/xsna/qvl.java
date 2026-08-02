package xsna;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.tool.view.FrameLayoutSwiped;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vkontakte.android.R;
import xsna.ib6;
import xsna.ngv0;
import xsna.tlo0;

/* compiled from: DeletedByUserCommentHolderV2.kt */
/* loaded from: classes4.dex */
public final class qvl extends aa implements View.OnClickListener, FrameLayoutSwiped.a {
    public final afg o;
    public final VkRichCell p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvl(int i, ViewGroup viewGroup, afg afgVar) {
        super(ib6.a.a(i, viewGroup), viewGroup);
        int i2 = ib6.R;
        this.o = afgVar;
        VkRichCell vkRichCell = (VkRichCell) this.itemView.findViewById(R.id.vk_rich_cell);
        this.p = vkRichCell;
        FrameLayoutSwiped frameLayoutSwiped = (FrameLayoutSwiped) this.itemView.findViewById(R.id.wrapper);
        View findViewById = this.itemView.findViewById(R.id.container);
        vkRichCell.setLeftMainAvatarController(new ovl());
        findViewById.setOnClickListener(this);
        frameLayoutSwiped.setCallback(this);
    }

    @Override // com.vk.core.tool.view.FrameLayoutSwiped.a
    public final boolean Z() {
        return this.o.Z();
    }

    @Override // com.vk.core.tool.view.FrameLayoutSwiped.a
    public final void c0() {
        this.o.ei((iag) this.m, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r15.z3() == true) goto L8;
     */
    @Override // xsna.vif0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i6(iag iagVar) {
        boolean z;
        pgv0 v;
        iag iagVar2 = iagVar;
        VkCell.Left.b a = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new pvl(), VkCell.Left.Main.Size.Small));
        VkRichCell vkRichCell = this.p;
        vkRichCell.setLeft(a);
        if (iagVar2 != null) {
            z = true;
        }
        z = false;
        String string = this.itemView.getContext().getString(R.string.comment_deleted);
        int f = e3m.f(R.attr.vk_ui_text_secondary, this.itemView.getContext());
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(f), 0, spannableString.length(), 33);
        if (z) {
            String string2 = this.itemView.getContext().getString(R.string.comment_restore);
            SpannableString spannableString2 = new SpannableString(string2);
            spannableString2.setSpan(new v3i(this, 1), 0, string2.length(), 33);
            tlo0.Companion.getClass();
            v = ahn.v(new vgv0(new tlo0.h(spannableString), (ngv0.a) null, (ngv0) null, 1, 22), new ugv0(new tlo0.h(spannableString2), (ngv0.a) null, (ngv0.a) null, 1, (fy0) null, 54), null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
        } else {
            tlo0.Companion.getClass();
            v = ahn.v(new vgv0(new tlo0.h(spannableString), (ngv0.a) null, (ngv0) null, 1, 22), null, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
        }
        vkRichCell.setMiddle(v);
        vkRichCell.setOnClickListener(new ug(this, 2));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        this.o.gm((iag) this.m, this);
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
}
