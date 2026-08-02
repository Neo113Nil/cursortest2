package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.FlowLayout;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.view.PhotoStackView;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.stat.scheme.SchemeStat$TypeUniversalWidget;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.bridges.SuperappUiDesignBridge;
import com.vk.superapp.ui.uniwidgets.blocks.AvatarStackBlock;
import com.vk.superapp.ui.uniwidgets.blocks.AvatarsBlock;
import com.vk.superapp.ui.uniwidgets.blocks.BadgeBlock;
import com.vk.superapp.ui.uniwidgets.blocks.BaseBlock;
import com.vk.superapp.ui.uniwidgets.blocks.ButtonBlock;
import com.vk.superapp.ui.uniwidgets.blocks.IconBlock;
import com.vk.superapp.ui.uniwidgets.blocks.ImageBlock;
import com.vk.superapp.ui.uniwidgets.blocks.InformerRowBlock;
import com.vk.superapp.ui.uniwidgets.blocks.TextBlock;
import com.vk.superapp.ui.uniwidgets.blocks.VerticalAlign;
import com.vk.superapp.ui.uniwidgets.config.SuperappTextStylesBridge;
import com.vk.superapp.ui.uniwidgets.dto.InformerUniWidget;
import com.vk.superapp.ui.uniwidgets.dto.UniversalWidget;
import com.vk.superapp.ui.views.NoTrackingLinearLayoutManager;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.g4q0;
import xsna.j3q0;
import xsna.ler0;
import xsna.u7n0;
import xsna.w1w0;
import xsna.xhn0;

/* compiled from: InformerUniConstructor.kt */
/* loaded from: classes6.dex */
public final class tww extends j3q0<InformerUniWidget> {
    public static final int m = iah0.a(12);
    public static final int n = iah0.a(8);
    public static final int o = iah0.a(16);
    public final g4q0.a h;
    public final w1w0.a i;
    public View j;
    public RecyclerView k;
    public View l;

    /* compiled from: InformerUniConstructor.kt */
    public final class a extends RecyclerView.Adapter<b> {
        public final List<InformerRowBlock> c;

        public a(List<InformerRowBlock> list) {
            this.c = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(b bVar, int i) {
            b bVar2 = bVar;
            InformerRowBlock informerRowBlock = this.c.get(i);
            tww twwVar = tww.this;
            UniversalWidget universalWidget = twwVar.b;
            if (universalWidget == null) {
                universalWidget = null;
            }
            bVar2.a6(informerRowBlock, universalWidget, twwVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final b onCreateViewHolder(ViewGroup viewGroup, int i) {
            ConstraintLayout constraintLayout = new ConstraintLayout(viewGroup.getContext());
            constraintLayout.setLayoutParams(new ConstraintLayout.b(-1, -2));
            return new b(constraintLayout, tww.this.i);
        }
    }

    /* compiled from: InformerUniConstructor.kt */
    public static final class b extends pfh0<InformerRowBlock> {
        public final TextView A;
        public final TextView B;
        public s570 C;
        public FlowLayout D;
        public final TextView E;
        public final VKImageController<? extends View> F;
        public final ConstraintLayout m;
        public final u7n0 n;
        public final VKImageController<View> o;
        public final VKImageController<View> p;
        public WebAction q;
        public final int r;
        public final int s;
        public final View t;
        public final View u;
        public TextView v;
        public TextView w;
        public vbn0 x;
        public xhn0 y;
        public final TextView z;

        /* compiled from: InformerUniConstructor.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VerticalAlign.values().length];
                try {
                    iArr[VerticalAlign.TOP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VerticalAlign.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[VerticalAlign.BOTTOM.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b(ConstraintLayout constraintLayout, w1w0.a aVar) {
            super(constraintLayout);
            this.m = constraintLayout;
            this.n = aVar;
            ifx0 ifx0Var = e370.c;
            VKImageController<View> create = (ifx0Var == null ? null : ifx0Var).b().create(constraintLayout.getContext());
            this.o = create;
            ifx0 ifx0Var2 = e370.c;
            VKImageController<View> create2 = (ifx0Var2 == null ? null : ifx0Var2).b().create(constraintLayout.getContext());
            this.p = create2;
            int generateViewId = View.generateViewId();
            this.r = generateViewId;
            this.s = View.generateViewId();
            View view = ((com.vk.core.ui.image.c) create).getView();
            view.setId(R.id.vk_uni_widget_informer_left_image);
            constraintLayout.addView(view);
            androidx.constraintlayout.widget.b a2 = pq.a(constraintLayout);
            a2.k(view.getId(), 3, 0, 3);
            a2.k(view.getId(), 4, 0, 4);
            int id = view.getId();
            int i = tww.m;
            a2.l(id, 6, 0, 6, i);
            a2.b(constraintLayout);
            this.t = view;
            View view2 = ((com.vk.core.ui.image.c) create2).getView();
            view2.setId(R.id.vk_uni_widget_informer_right_image);
            view2.setContentDescription(view2.getContext().getString(R.string.vk_accessibility_role_button));
            constraintLayout.addView(view2);
            W5(view2);
            g6(view2);
            this.u = view2;
            androidx.constraintlayout.widget.b a3 = pq.a(constraintLayout);
            a3.r(generateViewId, 6, iah0.a(12), view.getId());
            a3.b(constraintLayout);
            this.z = h6(R.id.vk_uni_widget_informer_title);
            this.A = h6(R.id.vk_uni_widget_informer_subtitle);
            this.B = h6(R.id.vk_uni_widget_informer_second_subtitle);
            int i2 = j3q0.d;
            TextView c = j3q0.a.c(constraintLayout.getContext());
            constraintLayout.addView(c);
            androidx.constraintlayout.widget.b a4 = pq.a(constraintLayout);
            a4.l(c.getId(), 3, view.getId(), 3, j3q0.f);
            int id2 = c.getId();
            int i3 = j3q0.g;
            a4.l(id2, 7, generateViewId, 7, i3);
            a4.l(c.getId(), 6, 0, 6, i3);
            a4.b(constraintLayout);
            this.E = c;
            ifx0 ifx0Var3 = e370.c;
            VKImageController<View> create3 = (ifx0Var3 != null ? ifx0Var3 : null).b().create(constraintLayout.getContext());
            this.F = create3;
            constraintLayout.setPadding(0, 0, i, 0);
            View view3 = ((com.vk.core.ui.image.c) create3).getView();
            view3.setId(R.id.vk_uni_widget_scroll_item_icon_badge);
            constraintLayout.addView(view3);
            androidx.constraintlayout.widget.b a5 = pq.a(constraintLayout);
            a5.l(view3.getId(), 6, view.getId(), 6, 0);
            a5.l(view3.getId(), 7, view.getId(), 7, 0);
            a5.l(view3.getId(), 3, view.getId(), 3, 0);
            a5.l(view3.getId(), 4, view.getId(), 4, 0);
            a5.p(view3.getId(), 0);
            a5.n(view3.getId(), 0);
            a5.b(constraintLayout);
        }

        public static void i6(androidx.constraintlayout.widget.b bVar, ArrayList arrayList, ArrayList arrayList2) {
            bVar.l(((Number) arrayList.get(0)).intValue(), 3, 0, 3, iah0.a(1));
            int size = arrayList.size();
            for (int i = 1; i < size; i++) {
                bVar.l(((Number) arrayList.get(i)).intValue(), 3, ((Number) arrayList.get(i - 1)).intValue(), 4, iah0.a(((Number) arrayList2.get(r2)).intValue()));
            }
        }

        @Override // xsna.pfh0
        public final /* bridge */ /* synthetic */ void V5(InformerRowBlock informerRowBlock, UniversalWidget universalWidget, j3q0 j3q0Var, u7n0 u7n0Var) {
            a6(informerRowBlock, universalWidget, j3q0Var);
        }

        public final void W5(View view) {
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            ConstraintLayout constraintLayout = this.m;
            bVar.i(constraintLayout);
            bVar.k(view.getId(), 3, 0, 3);
            bVar.k(view.getId(), 4, 0, 4);
            bVar.k(view.getId(), 7, 0, 7);
            bVar.o(view.getId(), iah0.a(120));
            bVar.m(view.getId(), 1);
            bVar.b(constraintLayout);
        }

        public final void a6(InformerRowBlock informerRowBlock, UniversalWidget universalWidget, j3q0 j3q0Var) {
            int i;
            int i2;
            int i3;
            WebAction webAction;
            WebImageSize e;
            SuperappTextStylesBridge.a i4;
            androidx.constraintlayout.widget.b bVar;
            this.q = informerRowBlock.e;
            InformerUniWidget.LeftData leftData = informerRowBlock.b;
            TextView textView = this.E;
            ConstraintLayout constraintLayout = this.m;
            VKImageController<? extends View> vKImageController = this.F;
            View view = this.t;
            if (leftData != null) {
                view.setVisibility(0);
                if (leftData instanceof InformerUniWidget.LeftData.Icon) {
                    InformerUniWidget.LeftData.Icon icon = (InformerUniWidget.LeftData.Icon) leftData;
                    IconBlock iconBlock = icon.b;
                    int i5 = j3q0.d;
                    IconBlock.Style style = iconBlock.c;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    IconBlock.Size size = style.b;
                    i3 = 2;
                    IconBlock.Size size2 = style.b;
                    layoutParams.width = iah0.a(z6j.b(size).a);
                    layoutParams.height = iah0.a(z6j.b(size2).b);
                    view.setLayoutParams(layoutParams);
                    j3q0Var.g(view, this.o, iconBlock);
                    j3q0.d(style.d, view, constraintLayout);
                    BadgeBlock badgeBlock = icon.c;
                    if (Math.min(iah0.a(z6j.b(size2).a), iah0.a(z6j.b(size2).b)) / 2 < tww.o) {
                        vKImageController = null;
                    }
                    int a2 = iah0.a(z6j.b(size2).a);
                    float f = z6j.b(size2).c;
                    if (badgeBlock != null) {
                        j3q0.c(badgeBlock, vKImageController, textView, constraintLayout, new j3q0.c(a2, f));
                    } else {
                        f4m.j(textView);
                        if (vKImageController != null) {
                            vKImageController.clear();
                        }
                    }
                    i = 0;
                } else {
                    i3 = 2;
                    if (!(leftData instanceof InformerUniWidget.LeftData.Image)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InformerUniWidget.LeftData.Image image = (InformerUniWidget.LeftData.Image) leftData;
                    ImageBlock imageBlock = image.b;
                    int i6 = j3q0.d;
                    ImageBlock.Style style2 = imageBlock.e;
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    int f2 = z6j.f(style2);
                    ImageBlock.Style.Size size3 = style2.b;
                    layoutParams2.width = f2;
                    layoutParams2.height = iah0.a(z6j.e(size3, z6j.c(style2)) != null ? r7.b : 0);
                    view.setLayoutParams(layoutParams2);
                    i = 0;
                    j3q0.h(j3q0Var, this.o, imageBlock, null, null, 12);
                    j3q0.d(style2.d, view, constraintLayout);
                    BadgeBlock badgeBlock2 = image.c;
                    if (Math.min(z6j.f(style2), iah0.a(z6j.e(size3, z6j.c(style2)) != null ? r6.b : 0)) / 2 < tww.o) {
                        vKImageController = null;
                    }
                    int f3 = z6j.f(style2);
                    float d = z6j.d(style2);
                    if (badgeBlock2 != null) {
                        j3q0.c(badgeBlock2, vKImageController, textView, constraintLayout, new j3q0.c(f3, d));
                    } else {
                        f4m.j(textView);
                        if (vKImageController != null) {
                            vKImageController.clear();
                        }
                    }
                }
                i2 = 8;
            } else {
                i = 0;
                i2 = 8;
                i3 = 2;
                view.setVisibility(8);
                vKImageController.clear();
                f4m.j(textView);
            }
            InformerUniWidget.MiddleData middleData = informerRowBlock.c;
            Integer valueOf = Integer.valueOf(i2);
            if (middleData != null) {
                AvatarsBlock avatarsBlock = middleData.e;
                TextBlock textBlock = middleData.d;
                TextBlock textBlock2 = middleData.c;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                TextBlock textBlock3 = middleData.b;
                SuperappTextStylesBridge superappTextStylesBridge = m3q0.c;
                if (superappTextStylesBridge == null) {
                    superappTextStylesBridge = null;
                }
                SuperappTextStylesBridge.a i7 = superappTextStylesBridge.i();
                TextView textView2 = this.z;
                j3q0Var.i(textView2, textBlock3, i7);
                arrayList.add(Integer.valueOf(textView2.getId()));
                arrayList2.add(Integer.valueOf(i));
                TextView textView3 = this.A;
                if (textBlock2 != null) {
                    textView3.setVisibility(i);
                    arrayList.add(Integer.valueOf(textView3.getId()));
                    arrayList2.add(1);
                    SuperappTextStylesBridge superappTextStylesBridge2 = m3q0.c;
                    if (superappTextStylesBridge2 == null) {
                        superappTextStylesBridge2 = null;
                    }
                    j3q0Var.i(textView3, textBlock2, superappTextStylesBridge2.g());
                } else {
                    textView3.setVisibility(8);
                }
                TextView textView4 = this.B;
                if (textBlock != null) {
                    textView4.setVisibility(0);
                    SuperappTextStylesBridge superappTextStylesBridge3 = m3q0.c;
                    if (superappTextStylesBridge3 == null) {
                        superappTextStylesBridge3 = null;
                    }
                    j3q0Var.i(textView4, textBlock, superappTextStylesBridge3.g());
                    arrayList.add(Integer.valueOf(textView4.getId()));
                    arrayList2.add(valueOf);
                } else {
                    textView4.setVisibility(8);
                }
                if (avatarsBlock != null) {
                    if (this.C == null) {
                        s570 s570Var = new s570(constraintLayout.getContext());
                        s570Var.setId(R.id.vk_uni_widget_recycler);
                        s570Var.setClipToPadding(false);
                        s570Var.getContext();
                        s570Var.setLayoutManager(new LinearLayoutManager(0, false));
                        s570Var.addItemDecoration(new ehk0(iah0.a(8)));
                        s570Var.setLayoutParams(new ConstraintLayout.b(0, -2));
                        constraintLayout.addView(s570Var);
                        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
                        bVar2.i(constraintLayout);
                        b6(s570Var, bVar2);
                        bVar2.m(s570Var.getId(), 1);
                        bVar2.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, s570Var.getId());
                        bVar2.b(constraintLayout);
                        this.C = s570Var;
                    }
                    s570 s570Var2 = this.C;
                    if (s570Var2 != null) {
                        s570Var2.getContext();
                        s570Var2.setLayoutManager(new LinearLayoutManager(0, false));
                        s570Var2.addItemDecoration(new ehk0(iah0.a(8)));
                    }
                    s570 s570Var3 = this.C;
                    if (s570Var3 != null) {
                        arrayList.add(Integer.valueOf(s570Var3.getId()));
                        arrayList2.set(e43.h(arrayList2), valueOf);
                        arrayList2.add(valueOf);
                        s570Var3.setAdapter(new zs5(avatarsBlock, j3q0Var));
                    }
                } else {
                    s570 s570Var4 = this.C;
                    if (s570Var4 != null) {
                        s570Var4.setVisibility(8);
                    }
                }
                List<ButtonBlock> list = middleData.f;
                if (list != null) {
                    if (this.D == null) {
                        androidx.constraintlayout.widget.b bVar3 = new androidx.constraintlayout.widget.b();
                        FlowLayout flowLayout = new FlowLayout(constraintLayout.getContext());
                        flowLayout.setId(R.id.vk_uni_widget_informer_button_list);
                        flowLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
                        constraintLayout.addView(flowLayout);
                        bVar3.i(constraintLayout);
                        b6(flowLayout, bVar3);
                        bVar3.m(flowLayout.getId(), 1);
                        bVar3.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, flowLayout.getId());
                        bVar3.b(constraintLayout);
                        this.D = flowLayout;
                    }
                    FlowLayout flowLayout2 = this.D;
                    if (flowLayout2 != null) {
                        flowLayout2.removeAllViews();
                        flowLayout2.setVisibility(0);
                        for (ButtonBlock buttonBlock : list) {
                            TextView textView5 = new TextView(constraintLayout.getContext());
                            textView5.setId(View.generateViewId());
                            int i8 = epx.f(buttonBlock, j5g.i0(list)) ? 0 : tww.n;
                            List<ButtonBlock> list2 = list;
                            FlowLayout.a aVar = new FlowLayout.a(i8, i8);
                            aVar.c = -2;
                            aVar.d = -2;
                            j3q0Var.f(textView5, buttonBlock);
                            flowLayout2.addView(textView5, aVar);
                            list = list2;
                        }
                    }
                    arrayList.add(Integer.valueOf(this.D.getId()));
                    arrayList2.set(e43.h(arrayList2), valueOf);
                } else {
                    FlowLayout flowLayout3 = this.D;
                    if (flowLayout3 != null) {
                        flowLayout3.setVisibility(8);
                    }
                }
                InformerUniWidget.MiddleData.Style style3 = middleData.g;
                if (style3 != null) {
                    androidx.constraintlayout.widget.b a3 = pq.a(constraintLayout);
                    int i9 = a.$EnumSwitchMapping$0[style3.g.ordinal()];
                    if (i9 == 1) {
                        bVar = a3;
                        i6(bVar, arrayList, arrayList2);
                    } else if (i9 == i3) {
                        bVar = a3;
                        if (arrayList.size() > 1) {
                            int[] N0 = j5g.N0(arrayList);
                            if (N0.length < 2) {
                                throw new IllegalArgumentException("must have 2 or more widgets in a chain");
                            }
                            bVar.u(N0[0]).e.X = 2;
                            bVar.l(N0[0], 3, 0, 3, 0);
                            for (int i10 = 1; i10 < N0.length; i10++) {
                                int i11 = i10 - 1;
                                bVar.l(N0[i10], 3, N0[i11], 4, 0);
                                bVar.l(N0[i11], 4, N0[i10], 3, 0);
                            }
                            bVar.l(N0[N0.length - 1], 4, 0, 4, 0);
                            bVar = bVar;
                        } else {
                            bVar.k(((Number) arrayList.get(0)).intValue(), 3, 0, 3);
                            bVar.k(((Number) arrayList.get(0)).intValue(), 4, 0, 4);
                        }
                        i6(bVar, arrayList, arrayList2);
                    } else {
                        if (i9 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int size4 = arrayList.size() - 1;
                        int i12 = 0;
                        while (i12 < size4) {
                            int i13 = i12 + 1;
                            a3.l(((Number) arrayList.get(i12)).intValue(), 4, ((Number) arrayList.get(i13)).intValue(), 3, ((Number) arrayList2.get(i12)).intValue());
                            i12 = i13;
                        }
                        bVar = a3;
                        bVar.k(((Number) j5g.i0(arrayList)).intValue(), 4, 0, 4);
                    }
                    bVar.b(constraintLayout);
                }
            }
            InformerUniWidget.RightData rightData = informerRowBlock.d;
            TextView textView6 = this.v;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            View view2 = this.u;
            view2.setVisibility(8);
            TextView textView7 = this.w;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            vbn0 vbn0Var = this.x;
            if (vbn0Var != null) {
                vbn0Var.setVisibility(8);
            }
            xhn0 xhn0Var = this.y;
            if (xhn0Var != null) {
                xhn0Var.setVisibility(8);
            }
            if (rightData instanceof InformerUniWidget.RightData.Icon) {
                view2.setVisibility(0);
                IconBlock iconBlock2 = ((InformerUniWidget.RightData.Icon) rightData).b;
                int i14 = j3q0.d;
                IconBlock.Style style4 = iconBlock2.c;
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                layoutParams3.width = iah0.a(z6j.b(style4.b).a);
                layoutParams3.height = iah0.a(z6j.b(style4.b).b);
                view2.setLayoutParams(layoutParams3);
                j3q0Var.g(view2, this.p, iconBlock2);
            } else if (rightData instanceof InformerUniWidget.RightData.Counter) {
                TextView textView8 = this.v;
                if (textView8 != null) {
                    textView8.setVisibility(0);
                } else {
                    TextView textView9 = new TextView(constraintLayout.getContext());
                    textView9.setId(R.id.vk_uni_widget_informer_right_counter);
                    textView9.setSingleLine();
                    textView9.setLayoutParams(new ConstraintLayout.b(0, -2));
                    gfx0 gfx0Var = e370.b;
                    if (gfx0Var == null) {
                        gfx0Var = null;
                    }
                    gfx0Var.b(textView9, SuperappUiDesignBridge.FontFamily.REGULAR);
                    constraintLayout.addView(textView9);
                    W5(textView9);
                    g6(textView9);
                    this.v = textView9;
                }
                InformerUniWidget.RightData.Counter counter = (InformerUniWidget.RightData.Counter) rightData;
                TextBlock textBlock4 = counter.b;
                if (counter.c == InformerUniWidget.RightData.Style.CounterSize.LARGE) {
                    SuperappTextStylesBridge superappTextStylesBridge4 = m3q0.c;
                    i4 = (superappTextStylesBridge4 != null ? superappTextStylesBridge4 : null).d();
                } else {
                    SuperappTextStylesBridge superappTextStylesBridge5 = m3q0.c;
                    i4 = (superappTextStylesBridge5 != null ? superappTextStylesBridge5 : null).i();
                }
                j3q0Var.i(this.v, textBlock4, i4);
            } else if (rightData instanceof InformerUniWidget.RightData.Button) {
                TextView textView10 = this.w;
                if (textView10 != null) {
                    textView10.setVisibility(0);
                } else {
                    TextView textView11 = new TextView(constraintLayout.getContext());
                    textView11.setId(R.id.vk_uni_widget_informer_right_button);
                    textView11.setSingleLine();
                    textView11.setLayoutParams(new ConstraintLayout.b(0, -2));
                    gfx0 gfx0Var2 = e370.b;
                    (gfx0Var2 != null ? gfx0Var2 : null).b(textView11, SuperappUiDesignBridge.FontFamily.REGULAR);
                    constraintLayout.addView(textView11);
                    W5(textView11);
                    g6(textView11);
                    this.w = textView11;
                }
                j3q0Var.f(this.w, ((InformerUniWidget.RightData.Button) rightData).b);
            } else if (rightData instanceof InformerUniWidget.RightData.Avatars) {
                vbn0 vbn0Var2 = this.x;
                if (vbn0Var2 != null) {
                    vbn0Var2.setVisibility(0);
                } else {
                    vbn0 vbn0Var3 = new vbn0(constraintLayout.getContext());
                    vbn0Var3.setId(R.id.vk_uni_widget_informer_right_avatars);
                    constraintLayout.addView(vbn0Var3);
                    W5(vbn0Var3);
                    g6(vbn0Var3);
                    this.x = vbn0Var3;
                }
                vbn0 vbn0Var4 = this.x;
                AvatarStackBlock avatarStackBlock = ((InformerUniWidget.RightData.Avatars) rightData).b;
                int i15 = j3q0.d;
                j3q0Var.e(vbn0Var4, avatarStackBlock, null);
            } else if (rightData instanceof InformerUniWidget.RightData.ImageStack) {
                xhn0 xhn0Var2 = this.y;
                if (xhn0Var2 != null) {
                    xhn0Var2.setVisibility(0);
                } else {
                    xhn0 xhn0Var3 = new xhn0(constraintLayout.getContext(), null, 0);
                    xhn0Var3.b = true;
                    xhn0Var3.c = 8.0f;
                    xhn0Var3.e = new xhn0.a(0);
                    xhn0Var3.f = 17.0f;
                    xhn0Var3.g = FontFamily.REGULAR;
                    xhn0Var3.setId(R.id.vk_uni_widget_informer_right_image_stack);
                    constraintLayout.addView(xhn0Var3);
                    androidx.constraintlayout.widget.b bVar4 = new androidx.constraintlayout.widget.b();
                    bVar4.i(constraintLayout);
                    bVar4.k(xhn0Var3.getId(), 3, 0, 3);
                    bVar4.k(xhn0Var3.getId(), 4, 0, 4);
                    bVar4.k(xhn0Var3.getId(), 7, 0, 7);
                    bVar4.m(xhn0Var3.getId(), 1);
                    bVar4.b(constraintLayout);
                    g6(xhn0Var3);
                    this.y = xhn0Var3;
                }
                xhn0 xhn0Var4 = this.y;
                AvatarStackBlock avatarStackBlock2 = ((InformerUniWidget.RightData.ImageStack) rightData).b;
                defpackage.y yVar = new defpackage.y(12, this, universalWidget);
                List<ImageBlock> list3 = avatarStackBlock2.b;
                ArrayList arrayList3 = new ArrayList();
                for (ImageBlock imageBlock2 : list3) {
                    WebImage webImage = imageBlock2.b;
                    String str = (webImage == null || (e = webImage.e(48)) == null) ? null : e.b;
                    Pair pair = (str == null || str.length() == 0) ? null : new Pair(str, imageBlock2.f);
                    if (pair != null) {
                        arrayList3.add(pair);
                    }
                }
                xhn0Var4.setCircle(false);
                float f4 = 48;
                xhn0Var4.setOverlapOffset(new xhn0.a(42.0f, f4));
                xhn0Var4.setBorderWidth(Float.valueOf(0.5f));
                int i16 = avatarStackBlock2.c;
                ifx0 ifx0Var = e370.c;
                if (ifx0Var == null) {
                    ifx0Var = null;
                }
                tgr0 create = ((vcr0) ifx0Var.c.getValue()).create(xhn0Var4.getContext());
                xhn0Var4.addView(create.a(), new FrameLayout.LayoutParams(-2, iah0.a(f4)));
                boolean z = xhn0Var4.b;
                Float f5 = xhn0Var4.d;
                float f6 = xhn0Var4.c;
                xhn0.a aVar2 = xhn0Var4.e;
                ler0 ler0Var = new ler0(z, f5, f6, i16 > 0 ? new ler0.a(i16, xhn0Var4.f, xhn0Var4.g) : null, new ler0.b(aVar2.a, aVar2.b, aVar2.c));
                Pair pair2 = (Pair) j5g.a0(arrayList3);
                WebAction g = (pair2 == null || (webAction = (WebAction) pair2.j()) == null) ? null : webAction.g();
                if (g != null) {
                    jjc.g(create.a(), new xzk0(3, yVar, g));
                }
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add((String) ((Pair) it.next()).i());
                }
                ler0.b bVar5 = ler0Var.f;
                create.a().v(bVar5.a, bVar5.b, bVar5.c);
                PhotoStackView a4 = create.a();
                boolean z2 = ler0Var.b;
                a4.setRoundedImages(z2);
                create.a().setRoundedCut(z2);
                create.a().setCornerRadiusImages(ler0Var.d);
                Float f7 = ler0Var.c;
                if (f7 != null) {
                    float floatValue = f7.floatValue();
                    create.a().setDrawBorder(true);
                    create.a().setBorderWidth(floatValue);
                }
                ler0.a aVar3 = ler0Var.e;
                if (aVar3 != null) {
                    create.a().setExtraCounterTextSize(aVar3.b);
                    create.a().setExtraCounterTextFontFamily(aVar3.c);
                    PhotoStackView a5 = create.a();
                    int i17 = aVar3.a;
                    a5.L = !a5.z;
                    a5.m(i17);
                    a5.requestLayout();
                    a5.invalidate();
                }
                create.a().r(ler0Var.a, arrayList4);
            }
            l3q0.a(constraintLayout, this.q, new u7n0.a(universalWidget, SchemeStat$TypeUniversalWidget.ElementUiType.ITEM, getAdapterPosition(), 8), this.n);
        }

        public final void b6(View view, androidx.constraintlayout.widget.b bVar) {
            bVar.k(view.getId(), 6, this.r, 7);
            bVar.k(view.getId(), 7, this.s, 6);
        }

        public final void g6(View view) {
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            ConstraintLayout constraintLayout = this.m;
            bVar.i(constraintLayout);
            bVar.r(this.s, 5, -iah0.a(12), view.getId());
            bVar.b(constraintLayout);
        }

        public final TextView h6(int i) {
            TextView textView = new TextView(this.itemView.getContext());
            textView.setId(i);
            textView.setFilters(new lbp[]{new lbp()});
            gfx0 gfx0Var = e370.b;
            if (gfx0Var == null) {
                gfx0Var = null;
            }
            gfx0Var.b(textView, SuperappUiDesignBridge.FontFamily.REGULAR);
            ConstraintLayout constraintLayout = this.m;
            constraintLayout.addView(textView);
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.i(constraintLayout);
            bVar.p(textView.getId(), 0);
            b6(textView, bVar);
            bVar.b(constraintLayout);
            return textView;
        }
    }

    public tww(g4q0.a aVar, w1w0.a aVar2) {
        this.h = aVar;
        this.i = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [xsna.j3q0, xsna.tww] */
    @Override // xsna.j3q0
    public final cpx0 k(Context context) {
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.vk_uni_widget_informer);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        a(constraintLayout);
        b(constraintLayout);
        Object obj = this.b;
        BaseBlock baseBlock = ((InformerUniWidget) (obj != null ? obj : null)).s;
        Object obj2 = obj;
        if (obj == null) {
            obj2 = null;
        }
        j3q0.b t = t(baseBlock, ((InformerUniWidget) obj2).v, context, constraintLayout);
        this.j = t.a;
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.vk_uni_widget_recycler);
        recyclerView.setLayoutParams(new ConstraintLayout.b(-1, -2));
        Object obj3 = this.b;
        if (obj3 == null) {
            obj3 = null;
        }
        recyclerView.setAdapter(new a(((InformerUniWidget) obj3).t));
        recyclerView.setClipToPadding(false);
        recyclerView.setLayoutManager(new NoTrackingLinearLayoutManager(1, false));
        constraintLayout.addView(recyclerView);
        bVar.i(constraintLayout);
        int id = recyclerView.getId();
        View view = this.j;
        if (view == null) {
            view = null;
        }
        bVar.k(id, 3, view.getId(), 4);
        bVar.k(recyclerView.getId(), 4, 0, 4);
        bVar.k(recyclerView.getId(), 6, 0, 6);
        bVar.k(recyclerView.getId(), 7, 0, 7);
        bVar.b(constraintLayout);
        float f = 4;
        awt0.b(iah0.a(f), recyclerView);
        awt0.a(iah0.a(f), recyclerView);
        this.k = recyclerView;
        Object obj4 = this.b;
        BaseBlock baseBlock2 = ((InformerUniWidget) (obj4 != null ? obj4 : null)).u;
        Object obj5 = obj4;
        if (obj4 == null) {
            obj5 = null;
        }
        View s = s(baseBlock2, context, constraintLayout, ((InformerUniWidget) obj5).r.f.d, true);
        this.l = s;
        androidx.constraintlayout.widget.b a2 = pq.a(constraintLayout);
        RecyclerView recyclerView2 = this.k;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        a2.h(recyclerView2.getId(), 4);
        int id2 = s.getId();
        RecyclerView recyclerView3 = this.k;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        a2.k(id2, 3, recyclerView3.getId(), 4);
        a2.b(constraintLayout);
        View view2 = this.j;
        return new cpx0(constraintLayout, view2 == null ? null : view2, t.b, t.c, null);
    }

    @Override // xsna.j3q0
    public final u7n0 o() {
        return this.i;
    }

    @Override // xsna.j3q0
    public final g4q0.a r() {
        return this.h;
    }
}
