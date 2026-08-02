package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.flexbox.FlexboxLayout;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.stickers.ContextUser;
import com.vk.stickers.popup.PopupStickerView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.bbl0;
import xsna.kcl0;

/* compiled from: StickerDetailsLongtapView.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes6.dex */
public final class q3l0 extends FrameLayout implements f8l0, ViewPager.j {
    public final View b;
    public final NestedScrollView c;
    public final ViewPager d;
    public final bbl0 e;
    public final FrameLayout f;
    public final s820 g;
    public final q5n0 h;
    public final i8l0 i;
    public f600 j;
    public View k;
    public final TextView l;
    public n1l0 m;
    public PopupStickerView n;
    public bbl0.c o;

    public q3l0(Context context) {
        super(context, null, 0);
        t6g0 t6g0Var = t6g0.b;
        kcl0 d = t6g0.d();
        setFocusable(false);
        setFocusableInTouchMode(false);
        View inflate = LayoutInflater.from(context).inflate(R.layout.sticker_details_overlay, (ViewGroup) this, true);
        this.b = inflate.findViewById(R.id.background);
        NestedScrollView nestedScrollView = (NestedScrollView) inflate.findViewById(R.id.scroll_view);
        this.c = nestedScrollView;
        View findViewById = inflate.findViewById(R.id.sticker_container);
        ViewPager viewPager = (ViewPager) inflate.findViewById(R.id.stickers_pager);
        this.d = viewPager;
        this.f = (FrameLayout) inflate.findViewById(R.id.preview_container);
        bbl0 bbl0Var = new bbl0(d, new m3l0(this, context), 4);
        this.e = bbl0Var;
        viewPager.setAdapter(bbl0Var);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.menu);
        TextView textView = (TextView) linearLayout.findViewById(R.id.open_pack_button);
        this.l = textView;
        s820 s820Var = new s820(linearLayout, (TextView) linearLayout.findViewById(R.id.send_button), (TextView) linearLayout.findViewById(R.id.favorites_button), linearLayout.findViewById(R.id.gift_button), (TextView) linearLayout.findViewById(R.id.gift_button_subtitle), textView);
        this.g = s820Var;
        s820Var.b(false);
        View findViewById2 = inflate.findViewById(R.id.similar_container);
        this.h = new q5n0(d, findViewById2, (RecyclerPaginatedView) inflate.findViewById(R.id.similar_list), inflate.findViewById(R.id.similar_show_all));
        findViewById2.setVisibility(4);
        FlexboxLayout flexboxLayout = (FlexboxLayout) inflate.findViewById(R.id.suggests);
        this.i = new i8l0(d.r(), flexboxLayout);
        viewPager.addOnPageChangeListener(this);
        ub90 ub90Var = new ub90(context, new g880(this, 26));
        nestedScrollView.setOnTouchListener(ub90Var);
        viewPager.setOnTouchListener(ub90Var);
        tn20 tn20Var = new tn20(linearLayout, findViewById2, inflate, this, flexboxLayout, findViewById, 1);
        s820Var.h = new i5(19, tn20Var, linearLayout);
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = linearLayout.getMeasuredWidth();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = linearLayout.getMeasuredHeight();
        f4m.a(linearLayout, new n3l0(linearLayout, ref$IntRef, ref$IntRef2, tn20Var));
        Ref$IntRef ref$IntRef3 = new Ref$IntRef();
        ref$IntRef3.element = flexboxLayout.getMeasuredWidth();
        Ref$IntRef ref$IntRef4 = new Ref$IntRef();
        ref$IntRef4.element = flexboxLayout.getMeasuredHeight();
        f4m.a(flexboxLayout, new o3l0(flexboxLayout, ref$IntRef3, ref$IntRef4, tn20Var));
        Ref$IntRef ref$IntRef5 = new Ref$IntRef();
        ref$IntRef5.element = getMeasuredWidth();
        Ref$IntRef ref$IntRef6 = new Ref$IntRef();
        ref$IntRef6.element = getMeasuredHeight();
        f4m.a(this, new p3l0(this, ref$IntRef5, ref$IntRef6, this, tn20Var));
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
        List<? extends n1l0> list = this.e.f;
        if (list != null && i < list.size()) {
            n1l0 n1l0Var = list.get(i);
            this.m = n1l0Var;
            s820 s820Var = this.g;
            s820Var.q = n1l0Var;
            boolean z = n1l0Var instanceof UGCStickerModel;
            if (z) {
                s820Var.e();
            } else if (s820Var.c(n1l0Var) && (n1l0Var instanceof StickerItem)) {
                StickerItem stickerItem = (StickerItem) n1l0Var;
                s820Var.f(stickerItem);
                if (s820Var.o) {
                    s820Var.d(stickerItem);
                }
            } else {
                s820Var.b(s820Var.f);
                if (s820Var.f) {
                    s820Var.o = true;
                }
            }
            q5n0 q5n0Var = this.h;
            i8l0 i8l0Var = this.i;
            if (z) {
                i8l0Var.b.setVisibility(4);
                q5n0Var.c.setVisibility(4);
                return;
            }
            i8l0Var.c(n1l0Var.o2());
            int o2 = n1l0Var.o2();
            q5n0Var.k.e();
            com.vk.lists.c cVar = q5n0Var.g;
            cVar.s(null);
            q5n0Var.d.getRecyclerView().scrollToPosition(0);
            q5n0Var.h = Integer.valueOf(o2);
            kcl0.b bVar = q5n0Var.e;
            List<StickerStockItemWithStickerId> a = bVar.a(o2);
            if (a == null) {
                q5n0Var.c.setVisibility(4);
                cVar.p(false);
            } else {
                cVar.s(bVar.c(o2));
                q5n0Var.a(a);
            }
        }
    }

    @Override // xsna.f8l0
    public void setContextUser(ContextUser contextUser) {
        this.g.j = contextUser;
        this.h.i = contextUser;
    }

    @Override // xsna.f8l0
    public void setMenuListener(f600 f600Var) {
        this.j = f600Var;
        irc0 irc0Var = new irc0(this, 11);
        s820 s820Var = this.g;
        s820Var.m = f600Var;
        s820Var.n = irc0Var;
    }

    public void setStickerChecker(s2l0 s2l0Var) {
        this.g.i = s2l0Var;
    }

    @Override // xsna.e8l0
    public View getView() {
        return this;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
    }
}
