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
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.b7c0;
import xsna.tlo0;

/* compiled from: PostSettingsCellItemAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class c7c0 extends p1u0<b7c0.a> {
    public final com.vk.channels.impl.post_settings.f a;

    /* compiled from: PostSettingsCellItemAdapterDelegate.kt */
    public static final class a extends FrameLayout implements ziu0 {
        public final a b;
        public final VkOnboardingHighlighter c;
        public final AppCompatTextView d;
        public CharSequence e;
        public boolean f;

        public a(Context context) {
            super(context);
            this.b = this;
            setClipChildren(false);
            VkOnboardingHighlighter vkOnboardingHighlighter = (VkOnboardingHighlighter) LayoutInflater.from(context).inflate(R.layout.im_channel_post_settings_highlighted_title, (ViewGroup) null, false);
            this.c = vkOnboardingHighlighter;
            vkOnboardingHighlighter.setAutoHighlight(false);
            addView(vkOnboardingHighlighter);
            this.d = (AppCompatTextView) findViewById(R.id.im_channel_post_settings_highlighted_cell_title);
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

    /* compiled from: PostSettingsCellItemAdapterDelegate.kt */
    public static final class b implements aju0 {
        public a a;

        @Override // xsna.aju0
        public final ziu0 create(Context context) {
            a aVar = new a(context);
            this.a = aVar;
            return aVar;
        }
    }

    /* compiled from: PostSettingsCellItemAdapterDelegate.kt */
    public static final class c extends vfz<b7c0.a> {
        public final e7c0 l;
        public b7c0.a m;
        public final b n;
        public final VkCell o;

        public c(VkCell vkCell, com.vk.channels.impl.post_settings.f fVar) {
            super(vkCell);
            this.l = fVar;
            b bVar = new b();
            this.n = bVar;
            vkCell.setMiddleTitleHolderFactory(bVar);
            bwt0.i0(vkCell, new x2y(this, 29));
            this.o = vkCell;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(b7c0.a aVar) {
            VkCell.Middle.d dVar;
            b7c0.a aVar2 = aVar;
            this.m = aVar2;
            CharSequence b = aVar2.b();
            VkCell.Right.d dVar2 = null;
            Object[] objArr = 0;
            if (b != null) {
                dVar = new VkCell.Middle.d(u11.f(tlo0.Companion, b), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62);
            } else {
                dVar = null;
            }
            String string = this.itemView.getContext().getString(aVar2.c);
            if (aVar2.c()) {
                string = zr.a("<u>", string, "</u>");
            }
            VkCell.Middle.b bVar = new VkCell.Middle.b(new VkCell.Middle.e(oq.d(tlo0.Companion, string), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), dVar, null, (VkCell.Middle.Size) null, 12);
            VkCell vkCell = this.o;
            vkCell.setMiddle(bVar);
            b7c0.a.b a = aVar2.a();
            if (a instanceof b7c0.a.b.c) {
                dVar2 = new VkCell.Right.d(new VkCell.Right.a.f(6, (gzs) (objArr == true ? 1 : 0), ((b7c0.a.b.c) a).a), null, null, (VkCell.Right.b) null, 30);
            } else if (a instanceof b7c0.a.b.C2592a) {
                ((b7c0.a.b.C2592a) a).getClass();
                tlo0.f fVar = new tlo0.f(R.string.vkim_channels_post_settings_only_visible_to_dons_with_disabled_chevron);
                dVar2 = new VkCell.Right.d(new VkCell.Right.a.e(fVar, fVar), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 30);
            } else if (!(a instanceof b7c0.a.b.C2593b)) {
                throw new NoWhenBranchMatchedException();
            }
            vkCell.setRight(dVar2);
            if (aVar2.a() instanceof b7c0.a.b.c) {
                View findViewById = vkCell.findViewById(R.id.ds_internal_cell_right_action_switch);
                findViewById.setClickable(false);
                findViewById.setFocusable(false);
            }
            boolean c = aVar2.c();
            b bVar2 = this.n;
            if (c) {
                a aVar3 = bVar2.a;
                if (aVar3 == null || aVar3.f) {
                    return;
                }
                aVar3.f = true;
                aVar3.d.post(new io.reactivex.rxjava3.android.a(aVar3, 11));
                return;
            }
            a aVar4 = bVar2.a;
            if (aVar4 == null || !aVar4.f) {
                return;
            }
            aVar4.f = false;
            aVar4.d.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
            aVar4.c.c(false);
        }
    }

    public c7c0(com.vk.channels.impl.post_settings.f fVar) {
        this.a = fVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends b7c0.a> b(ViewGroup viewGroup) {
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return new c(vkCell, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof b7c0.a;
    }
}
