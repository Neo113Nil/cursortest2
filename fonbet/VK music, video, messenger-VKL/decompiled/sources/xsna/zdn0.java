package xsna;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.lists.ListDataSet;
import com.vk.superapp.api.dto.ad.AdInfo;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.holders.TileScrollLayoutManager;
import com.vk.superapp.ui.widgets.SuperAppShowcaseSectionScrollWidget;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.menu.ExpandableMenuState;
import com.vk.superapp.ui.widgets.subscribe_tile.SuperAppWidgetSubscribeTile;
import com.vk.superapp.ui.widgets.tile.SuperAppMoreTile;
import com.vk.superapp.ui.widgets.tile.SuperAppWidgetMarketProductTile;
import com.vk.superapp.ui.widgets.tile.SuperAppWidgetTile;
import com.vk.superapp.ui.widgets.tile.TileBackground;
import com.vk.superapp.ui.widgets.tile.TileBackgroundImage;
import com.vkontakte.android.R;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import xsna.u7n0;

/* compiled from: SuperAppWidgetShowcaseSectionScrollHolder.kt */
/* loaded from: classes6.dex */
public final class zdn0 extends ucn0<den0> implements w160 {
    public static final int w = iah0.a(16);
    public static final int x = iah0.a(8);
    public static final int y = 3;
    public final u7n0 p;
    public final VkGroupHeader q;
    public final ComposeView r;
    public final wh50 s;
    public final a t;
    public final RecyclerView u;
    public final RecyclerView v;

    /* compiled from: SuperAppWidgetShowcaseSectionScrollHolder.kt */
    public static final class b implements u7n0 {
        public final /* synthetic */ u7n0 b;

        public b() {
            this.b = zdn0.this.p;
        }

        @Override // xsna.u7n0
        public final void D0(yk ykVar, m84 m84Var) {
            this.b.D0(ykVar, m84Var);
        }

        @Override // xsna.u7n0
        public final void Y0(String str) {
            this.b.Y0(str);
        }

        @Override // xsna.u7n0
        public final void Z(Context context, WebAction webAction, SuperAppWidget superAppWidget) {
            this.b.Z(context, webAction, superAppWidget);
        }

        @Override // xsna.u7n0
        public final void b(Context context, WebAction webAction, f9n0 f9n0Var, Integer num) {
            zdn0 zdn0Var = zdn0.this;
            zdn0Var.p.b(context, webAction, f9n0Var, Integer.valueOf(((ListDataSet) zdn0Var.t.c).v(f9n0Var)));
        }

        @Override // xsna.u7n0
        public final void d0(SuperAppWidget superAppWidget) {
            this.b.d0(superAppWidget);
        }

        @Override // xsna.u7n0
        public final void e0(WidgetIds widgetIds, int i) {
            this.b.e0(widgetIds, i);
        }

        @Override // xsna.u7n0
        public final void f0(String str) {
            this.b.f0(str);
        }

        @Override // xsna.u7n0
        public final void g(CharSequence charSequence, CharSequence charSequence2) {
            this.b.g(charSequence, charSequence2);
        }

        @Override // xsna.u7n0
        public final void g0(String str) {
            this.b.g0(str);
        }

        @Override // xsna.u7n0
        public final void h0(Context context, b9n0 b9n0Var) {
            this.b.h0(context, b9n0Var);
        }

        @Override // xsna.u7n0
        public final void h1(j8q j8qVar, ExpandableMenuState expandableMenuState) {
            this.b.h1(j8qVar, expandableMenuState);
        }

        @Override // xsna.u7n0
        public final void i0(WidgetIds widgetIds) {
            this.b.i0(widgetIds);
        }

        @Override // xsna.u7n0
        public final void i1(obn0 obn0Var) {
            this.b.i1(obn0Var);
        }

        @Override // xsna.u7n0
        public final void u0(Context context, u7n0.a aVar, WebAction webAction) {
            this.b.u0(context, aVar, webAction);
        }

        @Override // xsna.u7n0
        public final void x(Context context, z8n0 z8n0Var, WebAction webAction, int i, boolean z) {
            this.b.x(context, z8n0Var, webAction, i, z);
        }

        @Override // xsna.u7n0
        public final void x0(String str) {
            this.b.x0(str);
        }

        @Override // xsna.u7n0
        public final void z(SuperAppWidget superAppWidget) {
            this.b.z(superAppWidget);
        }
    }

    public zdn0(View view, u7n0 u7n0Var, RecyclerView.u uVar, s530 s530Var) {
        super(view, null);
        this.p = u7n0Var;
        this.q = (VkGroupHeader) this.itemView.findViewById(R.id.header);
        this.r = (ComposeView) this.itemView.findViewById(R.id.context_menu_container);
        this.s = androidx.compose.runtime.k.b(Boolean.FALSE);
        a aVar = new a(new b(), s530Var);
        this.t = aVar;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.tiles_horizontal_recycler_view);
        recyclerView.setClipToPadding(false);
        recyclerView.setRecycledViewPool(uVar);
        TileScrollLayoutManager tileScrollLayoutManager = new TileScrollLayoutManager(recyclerView.getContext());
        tileScrollLayoutManager.l = true;
        tileScrollLayoutManager.p = y;
        recyclerView.setLayoutManager(tileScrollLayoutManager);
        recyclerView.setAdapter(aVar);
        recyclerView.addItemDecoration(new a1x(x, w));
        awt0.g(recyclerView);
        this.u = recyclerView;
        this.v = recyclerView;
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        e9n0 ycn0Var;
        SuperAppShowcaseSectionScrollWidget.Payload payload = ((den0) zif0Var).e.o;
        VkGroupHeader vkGroupHeader = this.q;
        vkGroupHeader.getContext();
        vkGroupHeader.setSize(VkGroupHeader.Size.Large);
        String str = payload.b;
        AdInfo adInfo = payload.e;
        vkGroupHeader.setTitle(new VkGroupHeader.d(str, null, null, null, 0, null, 510));
        String str2 = payload.c;
        vkGroupHeader.setSubtitle((str2 == null || str2.length() == 0) ? null : new VkGroupHeader.c(str2, null, null, 14));
        VkGroupHeader.Right.ExtraContent.c cVar = adInfo != null ? new VkGroupHeader.Right.ExtraContent.c(new v43(18, this, adInfo), tq.h(tlo0.Companion, R.string.common_actions)) : null;
        VkGroupHeader.Right.a.C0841a c0841a = new VkGroupHeader.Right.a.C0841a(new p78(payload, this, vkGroupHeader, 3), oq.d(tlo0.Companion, payload.b));
        if (adInfo != null || payload.d == null) {
            c0841a = null;
        }
        vkGroupHeader.setRight(new VkGroupHeader.Right(cVar, null, c0841a, 2));
        List<SuperAppWidget> list = payload.f;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (SuperAppWidget superAppWidget : list) {
                if (superAppWidget instanceof SuperAppWidgetTile) {
                    SuperAppWidgetTile superAppWidgetTile = (SuperAppWidgetTile) superAppWidget;
                    SuperAppWidgetTile.Payload payload2 = superAppWidgetTile.o;
                    TileBackground tileBackground = payload2.b;
                    if ((tileBackground != null ? tileBackground.d : null) != null) {
                        ycn0Var = new jen0(superAppWidgetTile);
                    } else if ((tileBackground != null ? tileBackground.c : null) != null) {
                        ycn0Var = new ken0(superAppWidgetTile);
                    } else {
                        List<TileBackgroundImage> list2 = tileBackground != null ? tileBackground.b : null;
                        if (list2 == null || list2.isEmpty()) {
                            TileBackground tileBackground2 = payload2.b;
                            ycn0Var = (tileBackground2 != null ? tileBackground2.e : null) != null ? new nen0(superAppWidgetTile) : null;
                        } else {
                            ycn0Var = new len0(superAppWidgetTile);
                        }
                    }
                } else if (superAppWidget instanceof SuperAppWidgetSubscribeTile) {
                    ycn0Var = new ien0((SuperAppWidgetSubscribeTile) superAppWidget);
                } else if (superAppWidget instanceof SuperAppWidgetMarketProductTile) {
                    ycn0Var = new wcn0((SuperAppWidgetMarketProductTile) superAppWidget);
                } else {
                    if (!(superAppWidget instanceof SuperAppMoreTile)) {
                        throw new IllegalStateException("Unsupported item " + superAppWidget.getType());
                    }
                    ycn0Var = new ycn0((SuperAppMoreTile) superAppWidget);
                }
                if (ycn0Var != null) {
                    arrayList.add(ycn0Var);
                }
            }
            RecyclerView recyclerView = this.u;
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            Parcelable onSaveInstanceState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
            this.t.O0(arrayList, null, null);
            RecyclerView.o layoutManager2 = recyclerView.getLayoutManager();
            if (layoutManager2 != null) {
                layoutManager2.onRestoreInstanceState(onSaveInstanceState);
            }
        }
    }

    @Override // xsna.w160
    public final RecyclerView v4() {
        return this.v;
    }

    /* compiled from: SuperAppWidgetShowcaseSectionScrollHolder.kt */
    public static final class a extends ksl<zif0> implements g530 {
        public final b j;
        public final s530 k;
        public q530 l;

        public a(b bVar, s530 s530Var) {
            super(new com.vk.lists.a(w8n0.a));
            this.j = bVar;
            this.k = s530Var;
        }

        @Override // xsna.g530
        public final void H2() {
            AbstractList abstractList = ((ListDataSet) this.c).d;
            for (int i = 0; i < abstractList.size(); i++) {
                zif0 zif0Var = (zif0) abstractList.get(i);
                if ((zif0Var instanceof wcn0) && ((wcn0) zif0Var).h.o.e) {
                    notifyItemChanged(i);
                }
                s3q0 s3q0Var = s3q0.a;
            }
        }

        @Override // xsna.gf6
        public final hf6 K0(int i, View view) {
            b bVar = this.j;
            if (i == R.layout.vk_super_app_tile_widget_background_icon) {
                return new hcn0(view, bVar);
            }
            if (i == R.layout.vk_super_app_tile_widget_big_icon) {
                return new jcn0(view, bVar);
            }
            if (i == R.layout.vk_super_app_tile_widget_overlaped_icon) {
                return new lcn0(view, bVar);
            }
            if (i == R.layout.vk_super_app_tile_widget_grid_icons) {
                return new kcn0(view, bVar);
            }
            if (i == R.layout.vk_super_app_subscribe_tile_widget) {
                return new acn0(view, bVar);
            }
            if (i != R.layout.vk_super_app_market_product_tile_widget) {
                if (i == R.layout.vk_super_app_more_tile_widget) {
                    return new xcn0(view, bVar);
                }
                throw new IllegalStateException("Unsupported viewType");
            }
            q530 q530Var = this.l;
            if (q530Var == null) {
                q530 b = this.k.b(view.getContext(), (f5z) e3m.h(view.getContext()), false);
                this.l = b;
                b.d(this);
                q530Var = this.l;
            }
            return new vcn0(view, bVar, q530Var);
        }

        @Override // xsna.g530
        public final void g3() {
        }
    }
}
