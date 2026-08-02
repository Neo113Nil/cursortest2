package xsna;

import android.net.Uri;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.mediapicker.VkMediaPicker;
import com.vk.imageloader.view.DefaultVkImageView;
import com.vkontakte.android.R;
import java.util.Calendar;
import kotlin.NoWhenBranchMatchedException;
import xsna.ehw;
import xsna.gt10;

/* compiled from: ImageCellViewHolder.kt */
/* loaded from: classes17.dex */
public final class ghw extends hf6<dhw> {
    public final gt10.a m;
    public final s1x n;
    public final DefaultVkImageView o;
    public final View p;
    public final View q;
    public final VkCounter r;
    public final ViewGroup s;
    public final ViewGroup t;
    public final ViewGroup u;

    public ghw(View view, VkMediaPicker.CellAspectRation cellAspectRation, VkMediaPicker vkMediaPicker, s1x s1xVar) {
        super(view);
        this.m = vkMediaPicker;
        this.n = s1xVar;
        DefaultVkImageView defaultVkImageView = (DefaultVkImageView) view.findViewById(R.id.photo_image_view);
        this.o = defaultVkImageView;
        this.p = view.findViewById(R.id.not_selected_view);
        this.q = view.findViewById(R.id.checked_view);
        this.r = (VkCounter) view.findViewById(R.id.counter_view);
        this.s = (ViewGroup) view.findViewById(R.id.top_left_container);
        this.t = (ViewGroup) view.findViewById(R.id.bottom_right_container);
        this.u = (ViewGroup) view.findViewById(R.id.bottom_left_container);
        defaultVkImageView.setAspectRatio(cellAspectRation.i());
        defaultVkImageView.setDontLoadAgainIfSameResource(true);
        defaultVkImageView.setPlaceholderColor(krv0.l(R.attr.vk_ui_background_secondary));
    }

    public static void a6(View view, ViewGroup viewGroup) {
        viewGroup.removeAllViews();
        viewGroup.post(new z6(3, viewGroup, view));
        viewGroup.setVisibility(0);
    }

    @Override // xsna.hf6
    public final void W5(dhw dhwVar) {
        final ehw ehwVar = dhwVar.a;
        this.itemView.setOnClickListener(new jkc(4, this, ehwVar));
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.fhw
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                gt10.a aVar = ghw.this.m;
                ehw ehwVar2 = ehwVar;
                aVar.G0(new uai0(ehwVar2.a, ehwVar2.b));
                return true;
            }
        });
        this.q.setOnClickListener(new lkc(3, this, ehwVar));
        this.r.setOnClickListener(new mkc(2, this, ehwVar));
        this.p.setOnClickListener(new ua7(this, ehwVar, 1));
        String str = ehwVar.d;
        ehw.a aVar = ehwVar.g;
        DefaultVkImageView defaultVkImageView = this.o;
        defaultVkImageView.setContentDescription(str);
        Uri uri = ehwVar.b;
        Size size = ehwVar.e;
        if (size == null) {
            size = ((gt10) this.n.c).g;
        }
        defaultVkImageView.m0(uri, size);
        b6(ehwVar.f);
        ehw.a.b bVar = aVar != null ? aVar.a : null;
        boolean z = bVar instanceof ehw.a.b.C2812b;
        ViewGroup viewGroup = this.s;
        if (z) {
            long j = ((ehw.a.b.C2812b) bVar).a;
            View inflate = LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.ds_image_date_label, viewGroup, false);
            TextView textView = (TextView) inflate.findViewById(R.id.day_of_month_text_view);
            TextView textView2 = (TextView) inflate.findViewById(R.id.month_text_view);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            int i = calendar.get(2);
            if (i > 11) {
                i = 11;
            }
            textView.setText(String.valueOf(calendar.get(5)));
            textView2.setText(this.itemView.getContext().getResources().getStringArray(R.array.ds_story_months_short)[i]);
            a6(inflate, viewGroup);
        } else if (bVar instanceof ehw.a.b.C2811a) {
            ((ehw.a.b.C2811a) bVar).getClass();
            a6(null, viewGroup);
        } else {
            if (bVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            f4m.j(viewGroup);
        }
        ehw.a.AbstractC2809a abstractC2809a = aVar != null ? aVar.b : null;
        boolean z2 = abstractC2809a instanceof ehw.a.AbstractC2809a.b;
        ViewGroup viewGroup2 = this.t;
        if (z2) {
            String str2 = ((ehw.a.AbstractC2809a.b) abstractC2809a).a;
            VkContentBadge vkContentBadge = new VkContentBadge(this.itemView.getContext(), null, 6);
            vkContentBadge.setAppearance(VkContentBadge.Appearance.Design.Overlay);
            vkContentBadge.setMode(VkContentBadge.Mode.Secondary);
            vkContentBadge.setSize(VkContentBadge.Size.Medium);
            vkContentBadge.setText(str2);
            s3q0 s3q0Var = s3q0.a;
            a6(vkContentBadge, viewGroup2);
        } else if (abstractC2809a instanceof ehw.a.AbstractC2809a.C2810a) {
            ((ehw.a.AbstractC2809a.C2810a) abstractC2809a).getClass();
            a6(null, viewGroup2);
        } else {
            if (abstractC2809a != null) {
                throw new NoWhenBranchMatchedException();
            }
            f4m.j(viewGroup2);
        }
        f4m.j(this.u);
    }

    public final void b6(ehw.b bVar) {
        boolean f = epx.f(bVar, ehw.b.d.a);
        View view = this.p;
        View view2 = this.q;
        VkCounter vkCounter = this.r;
        if (f) {
            f4m.j(view2);
            f4m.j(vkCounter);
            view.setVisibility(0);
            return;
        }
        if (epx.f(bVar, ehw.b.a.a)) {
            f4m.j(view);
            f4m.j(vkCounter);
            view2.setVisibility(0);
        } else {
            if (bVar instanceof ehw.b.C2813b) {
                f4m.j(view);
                f4m.j(view2);
                vkCounter.setVisibility(0);
                vkCounter.setCounterWithoutAnimation(((ehw.b.C2813b) bVar).a);
                return;
            }
            if (!epx.f(bVar, ehw.b.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f4m.j(view);
            f4m.j(view2);
            f4m.j(vkCounter);
        }
    }
}
