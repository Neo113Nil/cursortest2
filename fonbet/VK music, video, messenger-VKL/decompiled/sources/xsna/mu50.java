package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.Owner;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.imageloader.view.VKImageView;
import com.vk.narratives.core.NarrativeCoverView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.NarrativeAttachment;
import kotlin.LazyThreadSafetyMode;
import xsna.e3m;
import xsna.f5h0;

/* compiled from: NarrativeHolder.kt */
/* loaded from: classes4.dex */
public final class mu50 extends m56<NarrativeAttachment> implements View.OnClickListener, blc0 {
    public static final Object O = msy.a(LazyThreadSafetyMode.NONE, new sv0(29));
    public final VKImageView D;
    public final NarrativeCoverView E;
    public final ImageView F;
    public final TextView G;
    public final TextView H;
    public final View I;
    public final TextView J;
    public Narrative K;
    public View.OnClickListener L;
    public e6o M;
    public e6o N;

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    public mu50(ViewGroup viewGroup) {
        super(R.layout.attach_narrative, viewGroup);
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.background);
        this.D = vKImageView;
        NarrativeCoverView narrativeCoverView = (NarrativeCoverView) this.itemView.findViewById(R.id.cover);
        this.E = narrativeCoverView;
        this.F = (ImageView) this.itemView.findViewById(R.id.fave_button);
        this.G = (TextView) this.itemView.findViewById(R.id.title);
        this.H = (TextView) this.itemView.findViewById(R.id.author_text);
        this.I = this.itemView.findViewById(R.id.posting_remove);
        this.J = (TextView) this.itemView.findViewById(R.id.state);
        narrativeCoverView.setBorderType(NarrativeCoverView.BorderType.BLUE);
        ojt ojtVar = new ojt(this.itemView.getResources());
        ojtVar.l = f5h0.f.a;
        ojtVar.q = RoundingParams.b(iah0.b(8.0f));
        vKImageView.setHierarchy(ojtVar.a());
        vKImageView.setColorFilter((PorterDuffColorFilter) O.getValue());
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.narrative_root);
        Context context = this.itemView.getContext();
        e3m.a aVar = e3m.a;
        frameLayout.setForeground(m33.a(R.drawable.ripple_8dp, context));
        Y6();
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        this.I.setVisibility(z ? 0 : 8);
        this.F.setVisibility(z ? 8 : 0);
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        ba baVar = s6oVar.e;
        this.M = s6oVar.a(this, baVar);
        View.OnClickListener onClickListener = this.L;
        if (onClickListener != null) {
            this.N = s6oVar.a(onClickListener, baVar);
        }
        Y6();
    }

    @Override // xsna.m56
    public final void T6(NarrativeAttachment narrativeAttachment) {
        NarrativeAttachment narrativeAttachment2 = narrativeAttachment;
        NewsEntry q6 = q6();
        FaveEntry faveEntry = q6 instanceof FaveEntry ? (FaveEntry) q6 : null;
        if (faveEntry != null) {
            gmq gmqVar = faveEntry.i.f;
            Narrative narrative = gmqVar instanceof Narrative ? (Narrative) gmqVar : null;
            if (narrative != null) {
                X6(narrative);
            }
        } else {
            X6(narrativeAttachment2.f);
        }
        f4m.q(faveEntry != null ? iah0.a(8) : 0, this.itemView);
    }

    public final void X6(Narrative narrative) {
        this.K = narrative;
        this.E.a(narrative);
        boolean Ab = narrative.Ab();
        VKImageView vKImageView = this.D;
        TextView textView = this.J;
        TextView textView2 = this.H;
        TextView textView3 = this.G;
        if (Ab) {
            textView.setText(R.string.attach_narrative);
            abg0 abg0Var = dhr0.t;
            textView.setTextColor(abg0Var.c(R.attr.vk_ui_text_secondary));
            textView3.setTextColor(abg0Var.c(R.attr.vk_ui_text_primary));
            textView2.setTextColor(abg0Var.c(R.attr.vk_ui_text_secondary));
            vKImageView.clear();
            vKImageView.getHierarchy().p(null, 1);
            vKImageView.setBackgroundResource(R.drawable.narrative_background);
            this.F.setImageTintList(ColorStateList.valueOf(abg0Var.c(R.attr.vk_ui_icon_secondary)));
        } else {
            jno0.c(textView, R.attr.vk_ui_text_secondary);
            jno0.c(textView3, R.attr.vk_ui_text_secondary);
            jno0.c(textView2, R.attr.vk_ui_text_secondary);
            vKImageView.clear();
            vKImageView.getHierarchy().p(null, 1);
            vKImageView.setBackgroundResource(R.drawable.narrative_background);
            if (narrative.h) {
                textView.setText(R.string.narrative_deleted);
            } else {
                textView.setText(R.string.narrative_private);
            }
        }
        this.itemView.setClickable(narrative.Ab());
        Owner owner = narrative.f;
        textView2.setText(owner != null ? owner.c : null);
        textView3.setText(narrative.d);
        b7();
    }

    public final void Y6() {
        View.OnClickListener onClickListener = this.M;
        if (onClickListener == null) {
            onClickListener = this;
        }
        this.itemView.setOnClickListener(onClickListener);
        this.F.setOnClickListener(onClickListener);
        View.OnClickListener onClickListener2 = this.L;
        if (onClickListener2 != null) {
            e6o e6oVar = this.N;
            if (e6oVar != null) {
                onClickListener2 = e6oVar;
            }
            this.I.setOnClickListener(onClickListener2);
        }
    }

    public final void b7() {
        Narrative narrative = this.K;
        ImageView imageView = this.F;
        if (narrative != null) {
            if (narrative.Ab() && !(t6() instanceof FaveEntry) && hd60.a().U0()) {
                imageView.setVisibility(0);
                Narrative narrative2 = this.K;
                boolean z = narrative2 != null && narrative2.k;
                imageView.setActivated(z);
                imageView.setContentDescription(z ? this.itemView.getContext().getString(R.string.favorites_remove) : this.itemView.getContext().getString(R.string.favorites_add));
                return;
            }
        }
        f4m.j(imageView);
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
        this.L = onClickListener;
        s6o s6oVar = this.q;
        this.N = s6oVar != null ? s6oVar.a(onClickListener, s6oVar.e) : null;
        Y6();
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        Narrative narrative;
        if (jjc.b()) {
            return;
        }
        if (epx.f(view, this.itemView)) {
            W6(this.E);
        } else {
            if (!epx.f(view, this.F) || (narrative = this.K) == null) {
                return;
            }
            gd60.X0(hd60.a(), this.itemView.getContext(), narrative, new pqq(this.u, null, null, null, 14), new ed4(5, narrative, this), new wqb(16, narrative, this), 32);
        }
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
    }
}
