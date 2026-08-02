package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.design.view.actionlinks.holders.tip.ItemTipView;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.bottomsheet.actionsheet.a;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.products_multipicker.api.di.ProductsMultipickerComponent;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.SourceType;
import com.vkontakte.android.actionlinks.views.fragments.ItemsDialogWrapper;
import com.vkontakte.android.actionlinks.views.fragments.add.AddLinkPresenter;
import com.vkontakte.android.actionlinks.views.fragments.addpoll.AddPollView;
import com.vkontakte.android.actionlinks.views.fragments.wall.AddGridView;
import com.vkontakte.android.actionlinks.views.fragments.wall.AddWall$Type;
import com.vkontakte.android.actionlinks.views.holders.link.ItemLinkView;
import com.vkontakte.android.actionlinks.views.selection.SelectionActionType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.dw20;
import xsna.qbi0;

/* compiled from: Selection.kt */
/* loaded from: classes7.dex */
public final class qbi0 {

    /* compiled from: Selection.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SourceType.values().length];
            try {
                iArr[SourceType.Live.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SourceType.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(final Context context, final dm0 dm0Var, final UserId userId, final SourceType sourceType, dz20 dz20Var, sbi0 sbi0Var, int i) {
        final dz20 dz20Var2 = (i & 16) != 0 ? null : dz20Var;
        final sbi0 sbi0Var2 = (i & 32) != 0 ? null : sbi0Var;
        ArrayList o = e43.o(SelectionActionType.LINK, SelectionActionType.POST, SelectionActionType.POLL);
        int i2 = a.$EnumSwitchMapping$0[sourceType.ordinal()];
        if (i2 == 1) {
            o.add(2, SelectionActionType.ADD_GOOD);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (fkq0.b(userId)) {
                o.add(2, SelectionActionType.ADD_GOOD);
            }
        }
        ArrayList arrayList = new ArrayList(c5g.u(o, 10));
        Iterator it = o.iterator();
        while (it.hasNext()) {
            SelectionActionType selectionActionType = (SelectionActionType) it.next();
            arrayList.add(new ModalActionSheetListItem(selectionActionType.ordinal(), null, context.getString(selectionActionType.i()), null, null, selectionActionType.h(), null, false, false, 474));
        }
        a.C0785a c0785a = new a.C0785a();
        c0785a.b = arrayList;
        c0785a.c = new izs() { // from class: xsna.pbi0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                int i3;
                int i4;
                int i5;
                int i6 = ((ModalActionSheetListItem) obj).a;
                int ordinal = SelectionActionType.LINK.ordinal();
                Context context2 = context;
                dm0 dm0Var2 = dm0Var;
                SourceType sourceType2 = sourceType;
                dz20 dz20Var3 = dz20Var2;
                if (i6 == ordinal) {
                    cm0 cm0Var = new cm0(context2, dz20Var3);
                    AddLinkPresenter addLinkPresenter = new AddLinkPresenter();
                    addLinkPresenter.g = dm0Var2;
                    addLinkPresenter.i = sourceType2;
                    addLinkPresenter.e = cm0Var;
                    cm0Var.d = addLinkPresenter;
                    dw20.b bVar = new dw20.b(context2, null);
                    View inflate = LayoutInflater.from(context2).inflate(R.layout.collection_items_fragment_view, (ViewGroup) null, false);
                    cm0Var.i = (RecyclerPaginatedView) inflate.findViewById(R.id.collection_items_fragment_recycler);
                    cm0Var.e = (ItemTipView) inflate.findViewById(R.id.collection_items_fragment_tip);
                    cm0Var.g = (ItemLinkView) inflate.findViewById(R.id.collection_items_fragment_link);
                    cm0Var.h = (VkText) inflate.findViewById(R.id.collection_items_fragment_validation);
                    RecyclerPaginatedView recyclerPaginatedView = cm0Var.i;
                    if (recyclerPaginatedView == null) {
                        recyclerPaginatedView = null;
                    }
                    AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
                    recyclerPaginatedView.getClass();
                    new AbstractPaginatedView.d(layoutType, recyclerPaginatedView).a();
                    VkSearchView vkSearchView = (VkSearchView) inflate.findViewById(R.id.item_search_view);
                    cm0Var.f = vkSearchView;
                    vkSearchView.X4(false);
                    VkSearchView vkSearchView2 = cm0Var.f;
                    if (vkSearchView2 == null) {
                        vkSearchView2 = null;
                    }
                    vkSearchView2.setHint(R.string.collection_link_add_link_input_hint);
                    VkSearchView vkSearchView3 = cm0Var.f;
                    if (vkSearchView3 == null) {
                        vkSearchView3 = null;
                    }
                    vkSearchView3.j5(new r7g(R.drawable.vk_icon_mention_24, R.string.accessibility_user_or_group_link, 0));
                    VkSearchView vkSearchView4 = cm0Var.f;
                    if (vkSearchView4 == null) {
                        vkSearchView4 = null;
                    }
                    vkSearchView4.setSecondaryActionListener(new na(cm0Var, 2));
                    VkSearchView vkSearchView5 = cm0Var.f;
                    if (vkSearchView5 == null) {
                        vkSearchView5 = null;
                    }
                    vkSearchView5.getEditView().addTextChangedListener(new bm0(cm0Var));
                    AddLinkPresenter addLinkPresenter2 = cm0Var.d;
                    if (addLinkPresenter2 != null) {
                        cm0 cm0Var2 = addLinkPresenter2.e;
                        if (cm0Var2 == null) {
                            cm0Var2 = null;
                        }
                        ItemTipView itemTipView = cm0Var2.e;
                        if (itemTipView == null) {
                            itemTipView = null;
                        }
                        fvx fvxVar = new fvx();
                        if (itemTipView != null) {
                            fvxVar.b = itemTipView;
                        }
                        addLinkPresenter2.k = fvxVar;
                        if (itemTipView != null) {
                            itemTipView.setPresenter((ItemTipView) fvxVar);
                        }
                        fvx fvxVar2 = addLinkPresenter2.k;
                        if (fvxVar2 == null) {
                            fvxVar2 = null;
                        }
                        fvxVar2.getClass();
                        cm0 cm0Var3 = addLinkPresenter2.e;
                        if (cm0Var3 == null) {
                            cm0Var3 = null;
                        }
                        int i7 = AddLinkPresenter.a.$EnumSwitchMapping$0[addLinkPresenter2.i.ordinal()];
                        if (i7 == 1) {
                            i5 = R.string.collection_add_link_hint;
                        } else {
                            if (i7 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i5 = R.string.video_action_link_attach_link_description;
                        }
                        cm0Var3.j = i5;
                        if (addLinkPresenter2.i == SourceType.Live) {
                            fvx fvxVar3 = addLinkPresenter2.k;
                            dvx.v6(fvxVar3 != null ? fvxVar3 : null, Integer.valueOf(R.drawable.tip_sharing_content), Integer.valueOf(R.string.collection_add_link_tip), null, null, 28);
                        } else {
                            fvx fvxVar4 = addLinkPresenter2.k;
                            if (fvxVar4 == null) {
                                fvxVar4 = null;
                            }
                            evx evxVar = fvxVar4.b;
                            if (evxVar == null) {
                                evxVar = null;
                            }
                            evxVar.setHintVisibility(false);
                            fvx fvxVar5 = addLinkPresenter2.k;
                            if (fvxVar5 == null) {
                                fvxVar5 = null;
                            }
                            evx evxVar2 = fvxVar5.b;
                            if (evxVar2 == null) {
                                evxVar2 = null;
                            }
                            evxVar2.setActionVisibility(false);
                        }
                        cm0 cm0Var4 = addLinkPresenter2.e;
                        if (cm0Var4 == null) {
                            cm0Var4 = null;
                        }
                        ItemLinkView itemLinkView = cm0Var4.g;
                        if (itemLinkView == null) {
                            itemLinkView = null;
                        }
                        wux wuxVar = new wux();
                        wuxVar.b = itemLinkView;
                        addLinkPresenter2.l = wuxVar;
                        itemLinkView.setPresenter((ItemLinkView) wuxVar);
                        wux wuxVar2 = addLinkPresenter2.l;
                        (wuxVar2 != null ? wuxVar2 : null).c = new ca(addLinkPresenter2, 1);
                        if (wuxVar2 == null) {
                            wuxVar2 = null;
                        }
                        wuxVar2.getClass();
                        cm0 cm0Var5 = addLinkPresenter2.e;
                        if (cm0Var5 == null) {
                            cm0Var5 = null;
                        }
                        cm0Var5.i(false);
                        cm0 cm0Var6 = addLinkPresenter2.e;
                        if (cm0Var6 == null) {
                            cm0Var6 = null;
                        }
                        cm0Var6.b(false);
                        cm0 cm0Var7 = addLinkPresenter2.e;
                        if (cm0Var7 == null) {
                            cm0Var7 = null;
                        }
                        cm0Var7.c(false);
                        cm0 cm0Var8 = addLinkPresenter2.e;
                        (cm0Var8 != null ? cm0Var8 : null).f(false);
                    }
                    AddLinkPresenter addLinkPresenter3 = cm0Var.d;
                    if (addLinkPresenter3 != null) {
                        RecyclerPaginatedView recyclerPaginatedView2 = cm0Var.i;
                        RecyclerPaginatedView recyclerPaginatedView3 = recyclerPaginatedView2 != null ? recyclerPaginatedView2 : null;
                        recyclerPaginatedView3.setAdapter(addLinkPresenter3.m);
                        recyclerPaginatedView3.setSwipeRefreshEnabled(true);
                        c.h hVar = new c.h(addLinkPresenter3.n);
                        hVar.i = 20;
                        hVar.l = false;
                        hVar.q = true;
                        hVar.g = true;
                        com.vk.lists.c a2 = com.vk.lists.f.a(hVar, recyclerPaginatedView3);
                        addLinkPresenter3.d = a2;
                        a2.p(false);
                    }
                    cm0Var.k = bVar.D0(inflate, false).d0(new vf0(cm0Var, 1)).a0(new b3(cm0Var, 2)).c(new ts90(1.0f, 2)).v0(R.string.collection_add_link).r0(cm0Var.j).t().I0("AddLinkView");
                } else {
                    int ordinal2 = SelectionActionType.POST.ordinal();
                    UserId userId2 = userId;
                    if (i6 == ordinal2) {
                        sp0 sp0Var = new sp0(dz20Var3);
                        int i8 = qbi0.a.$EnumSwitchMapping$0[sourceType2.ordinal()];
                        if (i8 == 1) {
                            i4 = R.string.collection_add_wall_to_list_hint;
                        } else {
                            if (i8 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i4 = R.string.video_action_link_attach_post_description;
                        }
                        sp0Var.d = i4;
                        rp0 rp0Var = new rp0();
                        rp0Var.k = dm0Var2;
                        rp0Var.i = userId2;
                        rp0Var.h = AddWall$Type.POST;
                        rp0Var.j = sp0Var;
                        sp0Var.e = rp0Var;
                        dw20.b bVar2 = new dw20.b(context2, null);
                        View inflate2 = LayoutInflater.from(context2).inflate(R.layout.collection_items_add_wall_fragment_view, (ViewGroup) null, false);
                        sp0Var.f = (RecyclerPaginatedView) inflate2.findViewById(R.id.collection_items_add_wall_fragment_recycler);
                        sp0Var.c = (ItemTipView) inflate2.findViewById(R.id.collection_items_add_wall_fragment_tip);
                        RecyclerPaginatedView recyclerPaginatedView4 = sp0Var.f;
                        if (recyclerPaginatedView4 == null) {
                            recyclerPaginatedView4 = null;
                        }
                        AbstractPaginatedView.LayoutType layoutType2 = AbstractPaginatedView.LayoutType.LINEAR;
                        recyclerPaginatedView4.getClass();
                        new AbstractPaginatedView.d(layoutType2, recyclerPaginatedView4).a();
                        ItemTipView itemTipView2 = sp0Var.c;
                        if (itemTipView2 == null) {
                            itemTipView2 = null;
                        }
                        f4m.j(itemTipView2);
                        rp0 rp0Var2 = sp0Var.e;
                        if (rp0Var2 != null) {
                            RecyclerPaginatedView recyclerPaginatedView5 = sp0Var.f;
                            rp0Var2.b(recyclerPaginatedView5 != null ? recyclerPaginatedView5 : null);
                        }
                        sp0Var.g = bVar2.D0(inflate2, false).d0(new vf0(sp0Var, 2)).a0(new b3(sp0Var, 3)).c(new ts90(1.0f, 2)).v0(R.string.collection_add_post).r0(sp0Var.d).t().I0("AddWallView");
                    } else if (i6 == SelectionActionType.POLL.ordinal()) {
                        Activity h = e3m.h(context2);
                        FragmentActivity fragmentActivity = h instanceof FragmentActivity ? (FragmentActivity) h : null;
                        if (fragmentActivity != null) {
                            AddPollView addPollView = new AddPollView();
                            addPollView.O = dz20Var3;
                            fn0 fn0Var = new fn0();
                            fn0Var.c = UserId.d;
                            new svx();
                            fn0Var.e = dm0Var2;
                            fn0Var.c = userId2;
                            fn0Var.d = addPollView;
                            addPollView.P = fn0Var;
                            ItemsDialogWrapper itemsDialogWrapper = new ItemsDialogWrapper();
                            itemsDialogWrapper.N = addPollView;
                            itemsDialogWrapper.O = Integer.valueOf(R.string.collection_add_poll);
                            addPollView.N = itemsDialogWrapper;
                            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                            androidx.fragment.app.a b = tk5.b(supportFragmentManager, supportFragmentManager);
                            b.f(0, itemsDialogWrapper, "AddPollView", 1);
                            b.k(false);
                        }
                    } else if (i6 == SelectionActionType.ADD_GOOD.ordinal()) {
                        int[] iArr = qbi0.a.$EnumSwitchMapping$0;
                        int i9 = iArr[sourceType2.ordinal()];
                        if (i9 == 1) {
                            sbi0 sbi0Var3 = sbi0Var2;
                            if (sbi0Var3 != null) {
                                int i10 = sbi0Var3.a;
                                UserId a3 = fkq0.b(userId2) ? fkq0.a(userId2) : null;
                                atd0 a4 = ((ProductsMultipickerComponent) ((k7m) m7m.f(new rbi0())).a(fpf0.a(ProductsMultipickerComponent.class))).a();
                                String f = enj.f(R.plurals.collection_link_limit_plural, i10, context2);
                                dhr0.a.getClass();
                                a4.a(context2, new g910(null, i10, f, a3, new w620(dm0Var2, 23), dhr0.u().c, null, null, new io60(dz20Var3, 24), new f880(dz20Var3, 19), null, null, 13185));
                            } else {
                                Activity h2 = e3m.h(context2);
                                FragmentActivity fragmentActivity2 = h2 instanceof FragmentActivity ? (FragmentActivity) h2 : null;
                                if (fragmentActivity2 != null) {
                                    AddGridView addGridView = new AddGridView();
                                    addGridView.O = dz20Var3;
                                    rp0 rp0Var3 = new rp0();
                                    rp0Var3.k = dm0Var2;
                                    rp0Var3.i = userId2;
                                    rp0Var3.h = AddWall$Type.PRODUCT;
                                    rp0Var3.c = true;
                                    rp0Var3.f = Integer.valueOf(R.string.collection_add_empty_product_action);
                                    int i11 = iArr[sourceType2.ordinal()];
                                    if (i11 == 1) {
                                        i3 = R.string.collection_add_empty_product;
                                    } else {
                                        if (i11 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        i3 = R.string.video_action_link_attach_product_title;
                                    }
                                    rp0Var3.d = Integer.valueOf(i3);
                                    rp0Var3.e = Integer.valueOf(R.drawable.ic_market_outline_56_white);
                                    rp0Var3.g = new gkc0(addGridView, 6);
                                    rp0Var3.j = addGridView;
                                    addGridView.P = rp0Var3;
                                    ItemsDialogWrapper itemsDialogWrapper2 = new ItemsDialogWrapper();
                                    itemsDialogWrapper2.N = addGridView;
                                    itemsDialogWrapper2.O = Integer.valueOf(R.string.collection_add_good);
                                    addGridView.N = itemsDialogWrapper2;
                                    FragmentManager supportFragmentManager2 = fragmentActivity2.getSupportFragmentManager();
                                    androidx.fragment.app.a b2 = tk5.b(supportFragmentManager2, supportFragmentManager2);
                                    b2.f(0, itemsDialogWrapper2, "AddGridView", 1);
                                    b2.k(false);
                                }
                            }
                        } else {
                            if (i9 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ((ProductsMultipickerComponent) ((k7m) m7m.f(new y69())).a(fpf0.a(ProductsMultipickerComponent.class))).a().a(context2, new g910(null, 0, null, null, new qm90(8, dm0Var2, context2), 0, null, null, new g880(dz20Var3, 18), new m960(dz20Var3, 25), null, null, 13279));
                        }
                    }
                }
                return s3q0.a;
            }
        };
        c0785a.a(context, "AddSelectionActionSheet");
    }
}
