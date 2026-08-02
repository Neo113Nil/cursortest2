package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.core.view.components.cell.VkCell;
import com.vk.im.ui.components.chat_profile.ChatProfileListItem;
import com.vkontakte.android.R;
import xsna.gko;
import xsna.k1u0;
import xsna.nwb;
import xsna.tlo0;

/* compiled from: ChatProfileCellItemDelegate.kt */
/* loaded from: classes2.dex */
public final class owb extends p1u0<nwb.b> {
    public final w9b a;

    /* compiled from: ChatProfileCellItemDelegate.kt */
    public static final class a extends vfz<nwb.b> {
        public final VkCell l;
        public final InterfaceC3475a m;
        public final c n;

        /* compiled from: ChatProfileCellItemDelegate.kt */
        /* renamed from: xsna.owb$a$a, reason: collision with other inner class name */
        public interface InterfaceC3475a {
            void e(ChatProfileListItem chatProfileListItem);
        }

        public a(VkCell vkCell, w9b w9bVar) {
            super(vkCell);
            this.l = vkCell;
            this.m = w9bVar;
            c cVar = new c();
            this.n = cVar;
            vkCell.setMiddleTitleHolderFactory(cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(nwb.b bVar) {
            nwb.b bVar2 = bVar;
            VkCell.Left.a aVar = VkCell.Left.Companion;
            ChatProfileListItem chatProfileListItem = bVar2.b;
            int i = chatProfileListItem.c;
            CharSequence charSequence = chatProfileListItem.b;
            gko.b bVar3 = gko.Companion;
            VkCell.Left.b a = VkCell.Left.a.a(aVar, new VkCell.Left.Main.c(new gko(i), VkCell.Left.Main.Size.ExtraSmall, new k1u0.a(new x7g(R.attr.vk_ui_icon_accent_themed)), 8));
            VkCell vkCell = this.l;
            vkCell.setLeft(a);
            boolean z = chatProfileListItem.f;
            if (z) {
                charSequence = "<u>" + ((Object) charSequence) + "</u>";
            }
            vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(u11.f(tlo0.Companion, charSequence), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, (VkCell.Middle.Size) (0 == true ? 1 : 0), 14));
            vkCell.setRight(new VkCell.Right.d((VkCell.Right.a) (0 == true ? 1 : 0), (VkCell.Right.e) (0 == true ? 1 : 0), (VkCell.Right.ExtraAction.a) (0 == true ? 1 : 0), new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7), 23));
            bwt0.i0(this.itemView, new du0(6, this, bVar2));
            c cVar = this.n;
            if (z) {
                b bVar4 = cVar.a;
                if (bVar4 == null || bVar4.f) {
                    return;
                }
                bVar4.f = true;
                bVar4.d.post(new gs2(bVar4, 6));
                return;
            }
            b bVar5 = cVar.a;
            if (bVar5 == null || !bVar5.f) {
                return;
            }
            bVar5.f = false;
            bVar5.d.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
            bVar5.c.c(false);
        }
    }

    /* compiled from: ChatProfileCellItemDelegate.kt */
    public static final class b extends FrameLayout implements ziu0 {
        public final b b;
        public final VkOnboardingHighlighter c;
        public final AppCompatTextView d;
        public CharSequence e;
        public boolean f;

        public b(Context context) {
            super(context);
            this.b = this;
            setClipChildren(false);
            VkOnboardingHighlighter vkOnboardingHighlighter = (VkOnboardingHighlighter) LayoutInflater.from(context).inflate(R.layout.vkim_chat_profile_highlighted_title, (ViewGroup) null, false);
            this.c = vkOnboardingHighlighter;
            vkOnboardingHighlighter.setAutoHighlight(false);
            addView(vkOnboardingHighlighter);
            this.d = (AppCompatTextView) findViewById(R.id.vkim_chat_profile_highlighted_cell_title);
        }

        @Override // xsna.ziu0
        public final AppCompatTextView a() {
            return this.d;
        }

        @Override // xsna.ziu0
        public final View getView() {
            return this.b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0010, code lost:
        
            r0 = null;
         */
        @Override // android.view.ViewGroup, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onAttachedToWindow() {
            ViewGroup viewGroup;
            super.onAttachedToWindow();
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
                while (viewGroup != null && !(viewGroup instanceof VkCell)) {
                    viewGroup.setClipChildren(false);
                    ViewParent parent2 = viewGroup.getParent();
                    if (parent2 instanceof ViewGroup) {
                        viewGroup = (ViewGroup) parent2;
                    }
                }
                return;
            }
            viewGroup = null;
        }

        @Override // xsna.ziu0
        public final void setText(CharSequence charSequence) {
            this.e = charSequence;
            this.c.setText(charSequence);
        }
    }

    /* compiled from: ChatProfileCellItemDelegate.kt */
    public static final class c implements aju0 {
        public b a;

        @Override // xsna.aju0
        public final ziu0 create(Context context) {
            b bVar = new b(context);
            this.a = bVar;
            return bVar;
        }
    }

    public owb(w9b w9bVar) {
        this.a = w9bVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends nwb.b> b(ViewGroup viewGroup) {
        return new a((VkCell) bwt0.I(R.layout.vkim_chat_profile_adapter_cell_item, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof nwb.b;
    }
}
