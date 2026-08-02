package xsna;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.hints.HintId;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.imageloader.view.VKImageView;
import com.vk.stories.design.view.stickers.StickersTabsAndIndicatorFrameLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import xsna.f5h0;

/* compiled from: StickersTabsLayout.kt */
/* loaded from: classes6.dex */
public final class gdl0 extends LinearLayout {
    public static final int m;
    public final StickersTabsAndIndicatorFrameLayout b;
    public final HorizontalScrollView c;
    public final kal0 d;
    public hgh0 e;
    public final int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final int k;
    public final int l;

    /* compiled from: StickersTabsLayout.kt */
    public interface a {
        void a(int i, boolean z);
    }

    /* compiled from: StickersTabsLayout.kt */
    public final class b implements gzs<s3q0> {
        public b() {
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            gdl0 gdl0Var = gdl0.this;
            StickersTabsAndIndicatorFrameLayout stickersTabsAndIndicatorFrameLayout = gdl0Var.b;
            float f = gdl0Var.d.b;
            float f2 = 1;
            float f3 = f % f2;
            if (f3 > 0.5f) {
                f3 -= f2;
            }
            int i = (int) (f - f3);
            float f4 = f % f2;
            if (f4 > 0.5f) {
                f4 -= f2;
            }
            stickersTabsAndIndicatorFrameLayout.d = i;
            stickersTabsAndIndicatorFrameLayout.e = f4;
            stickersTabsAndIndicatorFrameLayout.requestLayout();
            return s3q0.a;
        }
    }

    /* compiled from: StickersTabsLayout.kt */
    public static final class c extends FrameLayout implements a {
        public final /* synthetic */ gdl0 b;
        public final /* synthetic */ ImageView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FrameLayout frameLayout, gdl0 gdl0Var, ImageView imageView, Context context) {
            super(context);
            this.b = gdl0Var;
            this.c = imageView;
            int i = gdl0.m;
            addView(frameLayout, new FrameLayout.LayoutParams(i, i, 17));
        }

        @Override // xsna.gdl0.a
        public final void a(int i, boolean z) {
            gdl0 gdl0Var = this.b;
            gpo0.f(this.c, Integer.valueOf(z ? gdl0Var.k : gdl0Var.l));
        }
    }

    static {
        iah0.a(28);
        m = iah0.a(38);
    }

    public gdl0(Context context, boolean z) {
        super(context);
        StickersTabsAndIndicatorFrameLayout stickersTabsAndIndicatorFrameLayout = new StickersTabsAndIndicatorFrameLayout(context, null, 0, 14, 0);
        this.b = stickersTabsAndIndicatorFrameLayout;
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setVerticalScrollBarEnabled(false);
        float f = 12;
        bwt0.t0(horizontalScrollView, iah0.a(f), 0, iah0.a(f), 0, 10);
        this.c = horizontalScrollView;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = new kal0(new b());
        this.f = z ? 1 : 0;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = R.attr.vk_ui_icon_contrast;
        this.l = R.attr.vk_ui_icon_secondary;
        setGravity(16);
        setClipChildren(false);
        setClipToPadding(false);
        setLayoutTransition(new LayoutTransition());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        s3q0 s3q0Var = s3q0.a;
        addView(frameLayout, layoutParams);
        frameLayout.addView(horizontalScrollView, new LinearLayout.LayoutParams(-1, -2));
        horizontalScrollView.addView(stickersTabsAndIndicatorFrameLayout, new ViewGroup.LayoutParams(-2, -1));
        awt0.x(horizontalScrollView, 0, 0, 0, 0, 5);
        stickersTabsAndIndicatorFrameLayout.setGapBetweenTabs(iah0.a(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable getRippleBackground() {
        return m33.a(R.drawable.bg_tab_ripple, getContext());
    }

    public final void b(int i, int i2) {
        Integer valueOf;
        int i3 = this.g;
        this.g = i3 + 1;
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageDrawable(dhr0.w(i, imageView.getContext()));
        gpo0.f(imageView, Integer.valueOf(this.l));
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(getRippleBackground());
        frameLayout.setOnClickListener(new y7t(this, i3, 1));
        switch (i2) {
            case 0:
                valueOf = Integer.valueOf(R.string.story_accessibility_add_stickers);
                break;
            case 1:
                valueOf = Integer.valueOf(R.string.story_accessibility_smiles);
                break;
            case 2:
                valueOf = Integer.valueOf(R.string.story_accessibility_story_stickers);
                break;
            case 3:
                valueOf = Integer.valueOf(R.string.story_accessibility_favorite_stickers);
                break;
            case 4:
                valueOf = Integer.valueOf(R.string.story_accessibility_recents_stickers);
                break;
            case 5:
                valueOf = Integer.valueOf(R.string.story_accessibility_vmoji);
                break;
            case 6:
                valueOf = Integer.valueOf(R.string.story_accessibility_settings);
                break;
            case 7:
                valueOf = Integer.valueOf(R.string.accessibility_gif);
                break;
            default:
                valueOf = null;
                break;
        }
        if (valueOf != null) {
            frameLayout.setContentDescription(getContext().getString(valueOf.intValue()));
        }
        frameLayout.addView(imageView);
        this.b.b.addView(new c(frameLayout, this, imageView, getContext()));
        if (i2 == 5) {
            l7v b2 = pla.e().b();
            HintId hintId = HintId.VMOJI_KEYBOARD_ONBOARDING;
            if (b2.a(hintId.getId())) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (!frameLayout.isLaidOut()) {
                    frameLayout.addOnLayoutChangeListener(new idl0(frameLayout));
                } else {
                    pla.e().b().e(frameLayout, hintId.getId(), new jdl0(bwt0.C(frameLayout)));
                }
            }
        }
    }

    public final void c(StickerStockItem stickerStockItem) {
        final int i = this.g;
        this.g = i + 1;
        VKImageView vKImageView = new VKImageView(getContext(), null, 6, 0);
        vKImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        int a2 = iah0.a(4);
        vKImageView.setPadding(a2, a2, a2, a2);
        vKImageView.getHierarchy().o(f5h0.g.a);
        int i2 = h9l0.a;
        NotificationImage notificationImage = stickerStockItem.v;
        vKImageView.o0(notificationImage != null ? NotificationImage.Db(notificationImage, i2) : null, null);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: xsna.fdl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gdl0 gdl0Var = gdl0.this;
                hgh0 hgh0Var = gdl0Var.e;
                if (hgh0Var == null) {
                    hgh0Var = null;
                }
                hgh0Var.onPageSelected(i - gdl0Var.f);
            }
        });
        frameLayout.setBackground(getRippleBackground());
        frameLayout.setContentDescription(stickerStockItem.d);
        frameLayout.addView(vKImageView);
        d dVar = new d(getContext());
        int i3 = m;
        dVar.addView(frameLayout, new FrameLayout.LayoutParams(i3, i3, 17));
        this.b.b.addView(dVar);
    }

    public final void d(ArrayList arrayList) {
        LinkedHashMap<String, VKImageView> linkedHashMap;
        ArrayList arrayList2 = arrayList;
        int i = this.g;
        this.h = i;
        this.i = (arrayList2.size() + i) - 1;
        this.g = arrayList2.size() + this.g;
        dbw0 dbw0Var = new dbw0(getContext());
        int i2 = m;
        dbw0Var.setSelectionViewSize(i2);
        StickerStockItem stickerStockItem = (StickerStockItem) j5g.Y(arrayList2);
        LinearLayout linearLayout = dbw0Var.d;
        linearLayout.removeAllViews();
        dbw0Var.e = new ebw0(arrayList2, stickerStockItem, stickerStockItem != null);
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(String.valueOf(((StickerStockItem) it.next()).b));
        }
        if (!arrayList3.equals(dbw0Var.k)) {
            Iterable iterable = (Iterable) dbw0Var.k;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : iterable) {
                if (!arrayList3.contains((String) obj)) {
                    arrayList4.add(obj);
                }
            }
            Iterator it2 = arrayList4.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                linkedHashMap = dbw0Var.j;
                if (!hasNext) {
                    break;
                }
                View view = (VKImageView) linkedHashMap.remove((String) it2.next());
                if (view != null) {
                    linearLayout.removeView(view);
                }
            }
            Iterator it3 = arrayList3.iterator();
            int i3 = 0;
            while (it3.hasNext()) {
                Object next = it3.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    e43.t();
                    throw null;
                }
                String str = (String) next;
                View view2 = (VKImageView) linkedHashMap.get(str);
                if (view2 == null) {
                    StickerStockItem stickerStockItem2 = (StickerStockItem) arrayList2.get(i3);
                    VKImageView vKImageView = new VKImageView(dbw0Var.getContext(), null, 6, 0);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
                    layoutParams.gravity = 17;
                    vKImageView.setLayoutParams(layoutParams);
                    int i5 = dbw0Var.f;
                    vKImageView.setPadding(i5, i5, i5, i5);
                    vKImageView.getHierarchy().o(f5h0.g.a);
                    vKImageView.setContentDescription(stickerStockItem2.d);
                    int i6 = h9l0.a;
                    NotificationImage notificationImage = stickerStockItem2.v;
                    vKImageView.o0(notificationImage != null ? NotificationImage.Db(notificationImage, i6) : null, null);
                    vKImageView.setBackground(m33.a(R.drawable.bg_tab_ripple, vKImageView.getContext()));
                    bwt0.i0(vKImageView, new uva(dbw0Var, i3, 4));
                    linkedHashMap.put(str, vKImageView);
                    linearLayout.addView(vKImageView, i3);
                } else {
                    int indexOfChild = linearLayout.indexOfChild(view2);
                    if (indexOfChild != i3) {
                        linearLayout.removeViewAt(indexOfChild);
                        linearLayout.addView(view2, i3);
                    }
                    bwt0.i0(view2, new vva(dbw0Var, i3, 2));
                }
                arrayList2 = arrayList;
                i3 = i4;
            }
            dbw0Var.k = arrayList3;
        }
        dbw0Var.setChooserListener(new m3a(this));
        this.b.b.addView(new hdl0(this, dbw0Var, getContext()));
    }

    public final void e(int i) {
        int i2 = i + this.f;
        StickersTabsAndIndicatorFrameLayout stickersTabsAndIndicatorFrameLayout = this.b;
        int tabsCount = stickersTabsAndIndicatorFrameLayout.getTabsCount();
        int i3 = 0;
        while (i3 < tabsCount) {
            View childAt = stickersTabsAndIndicatorFrameLayout.b.getChildAt(i3);
            if (childAt instanceof ViewGroup) {
                ViewParent viewParent = (ViewGroup) childAt;
                if (viewParent instanceof a) {
                    ((a) viewParent).a(i2, i3 == i2);
                }
            }
            i3++;
        }
        int i4 = this.h;
        int i5 = this.i;
        kal0 kal0Var = this.d;
        if (i2 <= i5 && i4 <= i2) {
            this.j = i4;
            kal0Var.a(i4);
        } else {
            if (i2 > i5) {
                i2 -= i5 - i4;
            }
            this.j = i2;
            kal0Var.a(i2);
        }
    }

    public final int getCurrentPosition() {
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kal0 kal0Var = this.d;
        if (kal0Var.d) {
            return;
        }
        kal0Var.d = true;
        kal0Var.a.invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        kal0 kal0Var = this.d;
        if (kal0Var.d) {
            kal0Var.d = false;
            smk0 smk0Var = kal0Var.c;
            if (smk0Var != null) {
                smk0Var.d();
                kal0Var.b = (float) smk0Var.u.i;
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        StickersTabsAndIndicatorFrameLayout stickersTabsAndIndicatorFrameLayout = this.b;
        View indicatorContainer = stickersTabsAndIndicatorFrameLayout.getIndicatorContainer();
        int width = indicatorContainer.getWidth();
        int left = stickersTabsAndIndicatorFrameLayout.getLeft() + indicatorContainer.getLeft();
        HorizontalScrollView horizontalScrollView = this.c;
        horizontalScrollView.scrollTo(left - ((horizontalScrollView.getWidth() - width) / 2), horizontalScrollView.getScrollY());
    }

    public final void setDelegate(hgh0 hgh0Var) {
        this.e = hgh0Var;
    }

    /* compiled from: StickersTabsLayout.kt */
    public static final class d extends FrameLayout implements a {
        @Override // xsna.gdl0.a
        public final void a(int i, boolean z) {
        }
    }
}
