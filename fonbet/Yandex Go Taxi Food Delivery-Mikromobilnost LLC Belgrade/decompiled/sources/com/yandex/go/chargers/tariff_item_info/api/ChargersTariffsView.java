package com.yandex.go.chargers.tariff_item_info.api;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.payment.common.result.ResultType;
import defpackage.bya;
import defpackage.bys;
import defpackage.cma1;
import defpackage.f3x;
import defpackage.fxa;
import defpackage.hh8;
import defpackage.i3y;
import defpackage.j3x;
import defpackage.kya;
import defpackage.mrg0;
import defpackage.n5;
import defpackage.n8a;
import defpackage.ny61;
import defpackage.o1h0;
import defpackage.o990;
import defpackage.sls;
import defpackage.swa;
import defpackage.tj9;
import defpackage.tje;
import defpackage.tls;
import defpackage.tn9;
import defpackage.twa;
import defpackage.umb1;
import defpackage.uwa;
import defpackage.vng;
import defpackage.vwa;
import defpackage.whh0;
import defpackage.wwa;
import defpackage.wxs;
import defpackage.x1h0;
import defpackage.xsh0;
import defpackage.zxs;
import defpackage.zy11;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\u0014*\u00020\r2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001cH\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u00020\u0014*\u00020$2\u0006\u0010 \u001a\u00020\u001cH\u0002¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0014¢\u0006\u0004\b'\u0010(J#\u0010,\u001a\u00020\u00142\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0014\u0018\u00010)¢\u0006\u0004\b,\u0010-J#\u0010/\u001a\u00020\u00142\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0014\u0018\u00010)¢\u0006\u0004\b/\u0010-J\u0017\u00102\u001a\u00020\u00142\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010;\u001a\n\u0012\u0006\b\u0000\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR$\u0010C\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0014\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010E\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0014\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010D¨\u0006F"}, d2 = {"Lcom/yandex/go/chargers/tariff_item_info/api/ChargersTariffsView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "viewGroup", "Lbya;", "createChargersTariffsBlockItemBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lbya;", "", "showShimmer", "Lzy11;", "displayContentOrShimmer", "(Z)V", "Ltn9;", "attribute", "setupBadge", "(Ltn9;)V", "", "Lwwa;", "items", "bindBlockItems", "(Landroid/view/ViewGroup;Ljava/util/List;)V", "item", "Lru/yandex/taxi/design/ListItemComponent;", "createItemView", "(Lwwa;)Lru/yandex/taxi/design/ListItemComponent;", "Landroid/view/View;", "updateItem", "(Landroid/view/View;Lwwa;)V", ResultType.RESULT_TYPE_LOADING, "()V", "Lkotlin/Function1;", "Lvwa;", "listener", "setOnTariffDetailItemTitleClickListener", "(Ltls;)V", "Luj9;", "setOnTariffDetailItemValueClickListener", "Lswa;", "model", "success", "(Lswa;)V", "Lkya;", "binding", "Lkya;", "currentModel", "Lswa;", "Lbys;", "", "blocksAdapter", "Lbys;", "Landroid/graphics/drawable/Drawable;", "infoDrawable$delegate", "Li3y;", "getInfoDrawable", "()Landroid/graphics/drawable/Drawable;", "infoDrawable", "tariffDetailItemTitleClickListener", "Ltls;", "tariffDetailItemValueClickListener", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersTariffsView extends GoLinearLayout {
    public static final int $stable = 8;
    private final kya binding;
    private final bys blocksAdapter;
    private swa currentModel;

    /* renamed from: infoDrawable$delegate, reason: from kotlin metadata */
    private final i3y infoDrawable;
    private tls tariffDetailItemTitleClickListener;
    private tls tariffDetailItemValueClickListener;

    public ChargersTariffsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.infoDrawable = a.b(LazyThreadSafetyMode.NONE, new n5(context, 9));
        setOrientation(1);
        LayoutInflater.from(context).inflate(xsh0.chargers_tariffs_view, this);
        int i3 = whh0.badge;
        BadgeView badgeView = (BadgeView) cma1.O(i3, this);
        if (badgeView != null) {
            i3 = whh0.blocks_recycler_view;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i3, this);
            if (recyclerView != null) {
                i3 = whh0.header;
                LinearLayout linearLayout = (LinearLayout) cma1.O(i3, this);
                if (linearLayout != null) {
                    i3 = whh0.shimmering_block;
                    ShimmeringBar shimmeringBar = (ShimmeringBar) cma1.O(i3, this);
                    if (shimmeringBar != null) {
                        i3 = whh0.title;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, this);
                        if (robotoTextView != null) {
                            this.binding = new kya(this, badgeView, recyclerView, linearLayout, shimmeringBar, robotoTextView);
                            setPadding(tje.r(mrg0.go_design_m_space, getContext()), tje.r(mrg0.go_design_m_space, getContext()), tje.r(mrg0.go_design_m_space, getContext()), 0);
                            recyclerView.setLayoutManager(new LinearLayoutManager(context));
                            j3x j3xVar = new j3x();
                            _init_$lambda$0(this, j3xVar);
                            LinearLayoutManager linearLayoutManager = j3xVar.b;
                            recyclerView.setLayoutManager(linearLayoutManager == null ? new LinearLayoutManager(recyclerView.getContext(), 1, false) : linearLayoutManager);
                            bys bysVar = new bys(new wxs(), j3xVar.a);
                            recyclerView.setAdapter(bysVar);
                            this.blocksAdapter = bysVar;
                            recyclerView.setAdapter(bysVar);
                            return;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
        throw null;
    }

    private static final zy11 _init_$lambda$0(ChargersTariffsView chargersTariffsView, j3x j3xVar) {
        ChargersTariffsView$1$1 chargersTariffsView$1$1 = new ChargersTariffsView$1$1(2, chargersTariffsView, ChargersTariffsView.class, "createChargersTariffsBlockItemBinding", "createChargersTariffsBlockItemBinding(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/yandex/go/chargers/tariff_item_info/api/databinding/ChargersTariffsBlockItemBinding;", 0);
        j3xVar.getClass();
        j3xVar.a.add(new zxs(twa.class, 0, null, EmptyList.a, null, new o990(13, new f3x(twa.class, j3xVar, chargersTariffsView$1$1), new hh8(28, chargersTariffsView))));
        return zy11.a;
    }

    private final void bindBlockItems(ViewGroup viewGroup, List<wwa> list) {
        int childCount = viewGroup.getChildCount();
        int size = list.size();
        int min = Math.min(childCount, size);
        for (int i = 0; i < min; i++) {
            updateItem(viewGroup.getChildAt(i), list.get(i));
        }
        if (size > childCount) {
            while (childCount < size) {
                viewGroup.addView(createItemView(list.get(childCount)));
                childCount++;
            }
        } else if (size < childCount) {
            viewGroup.removeViews(size, childCount - size);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bya createChargersTariffsBlockItemBinding(LayoutInflater inflater, ViewGroup viewGroup) {
        View inflate = inflater.inflate(xsh0.chargers_tariffs_block_item, viewGroup, false);
        GoLinearLayout goLinearLayout = (GoLinearLayout) inflate;
        int i = whh0.header;
        GoLinearLayout goLinearLayout2 = (GoLinearLayout) cma1.O(i, inflate);
        if (goLinearLayout2 != null) {
            i = whh0.header_title;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = whh0.header_value;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView2 != null) {
                    i = whh0.items;
                    GoLinearLayout goLinearLayout3 = (GoLinearLayout) cma1.O(i, inflate);
                    if (goLinearLayout3 != null) {
                        return new bya(goLinearLayout, goLinearLayout, goLinearLayout2, robotoTextView, robotoTextView2, goLinearLayout3);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    private final ListItemComponent createItemView(wwa item) {
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        listItemComponent.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        updateItem(listItemComponent, item);
        return listItemComponent;
    }

    private final void displayContentOrShimmer(boolean showShimmer) {
        this.binding.d.setVisibility(!showShimmer ? 0 : 8);
        this.binding.c.setVisibility(!showShimmer ? 0 : 8);
        this.binding.e.setVisibility(showShimmer ? 0 : 8);
    }

    private final Drawable getInfoDrawable() {
        return (Drawable) this.infoDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable infoDrawable_delegate$lambda$0(Context context) {
        return tje.y(o1h0.ic_chargers_info, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 lambda$0$0(ChargersTariffsView chargersTariffsView, bya byaVar, twa twaVar) {
        uwa uwaVar = twaVar.a;
        if (uwaVar != null) {
            byaVar.b.setBackground(c.k(x1h0.chargers_bg_rectangle_round_20_controlminor, chargersTariffsView));
            byaVar.f.setBackground(vng.t(x1h0.chargers_tariff_block_bg_padding1dp, chargersTariffsView.getContext()));
        } else {
            byaVar.b.setBackground(null);
            byaVar.f.setBackground(c.k(x1h0.chargers_tariff_block_bg, chargersTariffsView));
        }
        GoLinearLayout goLinearLayout = byaVar.c;
        RobotoTextView robotoTextView = byaVar.e;
        goLinearLayout.setVisibility(uwaVar != null ? 0 : 8);
        byaVar.d.setText(uwaVar != null ? uwaVar.a : null);
        robotoTextView.setVisibility((uwaVar != null ? uwaVar.b : null) != null ? 0 : 8);
        robotoTextView.setText(uwaVar != null ? uwaVar.b : null);
        chargersTariffsView.bindBlockItems(byaVar.f, twaVar.b);
        return zy11.a;
    }

    private final void setupBadge(tn9 attribute) {
        this.binding.b.setVisibility(attribute != null ? 0 : 8);
        if (attribute == null) {
            return;
        }
        int i = attribute.b;
        BadgeView badgeView = this.binding.b;
        badgeView.setText(attribute.a);
        badgeView.setTintColor(i);
        badgeView.setOutlineSpotShadowColor(i);
    }

    private final void updateItem(View view, wwa wwaVar) {
        if (view instanceof ListItemComponent) {
            vwa vwaVar = wwaVar.f;
            CharSequence charSequence = wwaVar.b;
            if (vwaVar != null) {
                ListItemComponent listItemComponent = (ListItemComponent) view;
                listItemComponent.setTitle(umb1.a(charSequence, getInfoDrawable()));
                c.z(new n8a(10, this, vwaVar), listItemComponent.title());
            } else {
                ListItemComponent listItemComponent2 = (ListItemComponent) view;
                listItemComponent2.setTitle(charSequence);
                listItemComponent2.title().setOnClickListener(null);
            }
            ListItemComponent listItemComponent3 = (ListItemComponent) view;
            listItemComponent3.setSubtitle(wwaVar.c);
            CharSequence charSequence2 = wwaVar.d;
            if (charSequence2 != null) {
                listItemComponent3.setTrailCompanionMode(0);
                listItemComponent3.setTrailCompanionText(charSequence2);
                fxa fxaVar = wwaVar.e;
                if (fxaVar == null || fxaVar.equals(tj9.a)) {
                    listItemComponent3.trailFrame.setDebounceClickListener((sls) null);
                } else {
                    listItemComponent3.trailFrame.setDebounceClickListener(new n8a(11, this, fxaVar));
                }
            }
            if (wwaVar.g) {
                listItemComponent3.setMinHeight(tje.u(40, view.getContext()));
                listItemComponent3.setDividers(DividerPosition.TOP, DividerType.MARGIN);
            } else {
                listItemComponent3.setMinHeight(tje.u(36, view.getContext()));
            }
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), tje.u(wwaVar.h, view.getContext()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 updateItem$lambda$0(ChargersTariffsView chargersTariffsView, vwa vwaVar) {
        tls tlsVar = chargersTariffsView.tariffDetailItemTitleClickListener;
        if (tlsVar != null) {
            tlsVar.invoke(vwaVar);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 updateItem$lambda$1$0(ChargersTariffsView chargersTariffsView, fxa fxaVar) {
        tls tlsVar = chargersTariffsView.tariffDetailItemValueClickListener;
        if (tlsVar != null) {
            tlsVar.invoke(fxaVar);
        }
        return zy11.a;
    }

    public final void loading() {
        displayContentOrShimmer(true);
    }

    public final void setOnTariffDetailItemTitleClickListener(tls listener) {
        this.tariffDetailItemTitleClickListener = listener;
    }

    public final void setOnTariffDetailItemValueClickListener(tls listener) {
        this.tariffDetailItemValueClickListener = listener;
    }

    public final void success(swa model) {
        displayContentOrShimmer(false);
        this.currentModel = model;
        kya kyaVar = this.binding;
        if (model == null) {
            kyaVar.a.setVisibility(8);
            return;
        }
        tn9 tn9Var = model.b;
        CharSequence charSequence = model.a;
        kyaVar.f.setText(charSequence);
        this.binding.f.setVisibility(charSequence != null ? 0 : 8);
        this.binding.d.setVisibility((charSequence == null && tn9Var == null) ? 8 : 0);
        setupBadge(tn9Var);
        this.blocksAdapter.submitList(model.c, null);
        this.binding.a.setVisibility(0);
    }

    public ChargersTariffsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public ChargersTariffsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public ChargersTariffsView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ ChargersTariffsView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
