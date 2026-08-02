package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.lists.ListDataSet;
import com.vk.subscription.api.SubscribeStatus;
import com.vkontakte.android.R;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

/* compiled from: SuperAppAdapter.kt */
/* loaded from: classes6.dex */
public final class c7n0 extends ksl<zif0> {
    public final ayu0 j;
    public final u7n0 k;
    public final pcn0 l;
    public final s530 m;
    public final rru n;

    /* compiled from: SuperAppAdapter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscribeStatus.values().length];
            try {
                iArr[SubscribeStatus.MEMBER_STATUS_NOT_MEMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscribeStatus.MEMBER_STATUS_MEMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubscribeStatus.MEMBER_STATUS_SENT_REQUEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c7n0(ayu0 ayu0Var, u7n0 u7n0Var, pcn0 pcn0Var, s530 s530Var) {
        super(new com.vk.lists.a(w8n0.a));
        this.j = ayu0Var;
        this.k = u7n0Var;
        this.l = pcn0Var;
        this.m = s530Var;
        this.n = new rru(10);
    }

    public static void U0(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.setMotionEventSplittingEnabled(false);
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                U0(viewGroup.getChildAt(i));
            }
        }
    }

    @Override // xsna.gf6
    public final hf6 K0(int i, View view) {
        pcn0 pcn0Var = this.l;
        u7n0 u7n0Var = this.k;
        if (i == R.layout.vk_super_app_showcase_menu_item) {
            return new nbn0(view, u7n0Var, pcn0Var);
        }
        if (i == R.layout.vk_super_app_showcase_footer_menu_item) {
            return new mbn0(view, u7n0Var, pcn0Var);
        }
        if (i == R.layout.vk_super_app_showcase_menu_stub) {
            return new pbn0(view);
        }
        if (i == R.layout.vk_super_app_new_widget_section_button) {
            return new gdn0(view, u7n0Var);
        }
        if (i == R.layout.vk_super_app_showcase_section_button_v2) {
            return new tcn0(view, u7n0Var);
        }
        if (i == R.layout.vk_super_app_mini_widgets_scroll) {
            return new ean0(view, this.j, u7n0Var);
        }
        if (i == R.layout.vk_super_app_onboarding_panel) {
            return new kan0(view, u7n0Var);
        }
        if (i == R.layout.vk_super_app_mini_widgets_stub) {
            return new gan0(view);
        }
        if (i == R.layout.vk_super_app_tile_widget_background_icon) {
            return new hcn0(view, u7n0Var);
        }
        if (i == R.layout.vk_super_app_tile_widget_big_icon) {
            return new jcn0(view, u7n0Var);
        }
        if (i == R.layout.vk_super_app_tile_widget_overlaped_icon) {
            return new lcn0(view, u7n0Var);
        }
        if (i == R.layout.vk_super_app_tile_widget_grid_icons) {
            return new kcn0(view, u7n0Var);
        }
        if (i == R.layout.vk_super_app_showcase_promo_widget) {
            return new pdn0(view, u7n0Var);
        }
        if (i == R.layout.vk_super_app_showcase_scroll_in_grid_widget) {
            return new udn0(view, u7n0Var);
        }
        if (i == R.layout.vk_super_app_text_widget) {
            return new ccn0(view);
        }
        rru rruVar = this.n;
        if (i == R.layout.vk_super_app_tile_widgets_container) {
            return new ncn0(view, u7n0Var, rruVar);
        }
        if (i == R.layout.vk_super_app_showcase_section_scroll_widget) {
            return new zdn0(view, u7n0Var, rruVar, this.m);
        }
        if (i == R.layout.vk_super_app_widget_scroll_stub) {
            return new ddn0(view);
        }
        if (i == R.layout.vk_super_app_widget_tile_stub) {
            return new oen0(view);
        }
        if (i == R.layout.vk_super_app_widget_section_stub) {
            return new idn0(view);
        }
        if (i == R.layout.vk_super_app_showcase_section_poster_widget) {
            return new wdn0(view, u7n0Var);
        }
        if (i == R.layout.vk_super_app_widget_redesign_v6_stub) {
            return new bdn0(view);
        }
        if (i == R.layout.vk_super_app_showcase_expandable_menu_holder) {
            return new b8n0(view, u7n0Var);
        }
        if (i == R.layout.vk_super_app_showcase_expandable_menu_stub_holder) {
            return new e8n0(view);
        }
        if (i == R.layout.vk_super_app_showcase_confirm_number_widget) {
            return new kdn0(view, u7n0Var);
        }
        throw new IllegalStateException(lhg.a(i, "Unsupported viewType = "));
    }

    @Override // xsna.gf6, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: N0 */
    public final hf6 onCreateViewHolder(int i, ViewGroup viewGroup) {
        hf6 onCreateViewHolder = super.onCreateViewHolder(i, viewGroup);
        U0(onCreateViewHolder.itemView);
        return onCreateViewHolder;
    }

    @Override // xsna.ksl
    public final void P0(jsl jslVar) {
        jslVar.invoke();
    }

    public final int R0() {
        Iterator it = ((ListDataSet) this.c).d.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((zif0) it.next()) instanceof a9n0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int S0() {
        ArrayList arrayList = ((ListDataSet) this.c).d;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            if (((zif0) listIterator.previous()) instanceof a9n0) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public final int T0() {
        AbstractCollection abstractCollection = ((ListDataSet) this.c).d;
        int i = 0;
        if (abstractCollection.isEmpty()) {
            return 0;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            if ((((zif0) it.next()) instanceof a9n0) && (i = i + 1) < 0) {
                e43.s();
                throw null;
            }
        }
        return i;
    }

    @Override // xsna.ksl, xsna.zoj0, xsna.uuk
    public final void setItems(List<? extends zif0> list) {
        int T0 = T0();
        super.setItems(list);
        int T02 = T0();
        if (T02 != T0) {
            final l140 l140Var = new l140(18);
            notifyItemRangeChanged(((ListDataSet) this.c).w(new Predicate() { // from class: xsna.b7n0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Boolean) l140.this.invoke(obj)).booleanValue();
                }
            }), T02);
        }
    }
}
