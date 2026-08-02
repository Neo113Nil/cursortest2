package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.design.view.actionlinks.holders.tip.ItemTipView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.BaseItem;
import com.vkontakte.android.actionlinks.views.holders.link.ItemLinkView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ItemsAdapter.kt */
/* loaded from: classes7.dex */
public final class svx extends zoj0<BaseItem, RecyclerView.e0> {

    /* compiled from: ItemsAdapter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BaseItem.Type.values().length];
            try {
                iArr[BaseItem.Type.HINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BaseItem.Type.USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BaseItem.Type.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BaseItem.Type.ACTION_LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BaseItem.Type.ACTION_LINK_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BaseItem.Type.ADD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BaseItem.Type.EMPTY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BaseItem.Type.TIP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BaseItem.Type.LINK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static tvx K0(FrameLayout frameLayout) {
        tvx tvxVar = new tvx(frameLayout);
        tvxVar.itemView.setLayoutParams(new RecyclerView.p(-1, -2));
        return tvxVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((BaseItem) this.c.c(i)).a.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List<Object> list) {
        if (list.isEmpty()) {
            super.onBindViewHolder(e0Var, i, list);
        } else {
            onBindViewHolder(e0Var, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (a.$EnumSwitchMapping$0[BaseItem.Type.values()[i].ordinal()]) {
            case 1:
                qux quxVar = new qux();
                rux ruxVar = new rux(viewGroup.getContext());
                ruxVar.setPresenter((oux) quxVar);
                quxVar.b = ruxVar;
                return K0(ruxVar);
            case 2:
                jvx jvxVar = new jvx();
                kvx kvxVar = new kvx(viewGroup.getContext());
                kvxVar.setPresenter((hvx) jvxVar);
                jvxVar.b = kvxVar;
                return K0(kvxVar);
            case 3:
                mux muxVar = new mux();
                nux nuxVar = new nux(viewGroup.getContext());
                nuxVar.setPresenter((kux) muxVar);
                muxVar.b = nuxVar;
                return K0(nuxVar);
            case 4:
                stx stxVar = new stx(viewGroup.getContext());
                ptx ptxVar = new ptx(new bpn0(new xrj(stxVar, 16)));
                stxVar.setPresenter((ntx) ptxVar);
                ptxVar.e = stxVar;
                return K0(stxVar);
            case 5:
                Context context = viewGroup.getContext();
                qtx qtxVar = new qtx(context, null, 0);
                LayoutInflater.from(context).inflate(R.layout.collection_item_product_action_link, (ViewGroup) qtxVar, true);
                qtxVar.c = (VkImage) qtxVar.findViewById(R.id.collection_item_action_link_photo);
                qtxVar.d = (VkText) qtxVar.findViewById(R.id.collection_item_action_link_title);
                qtxVar.e = (VkText) qtxVar.findViewById(R.id.collection_item_action_link_subtitle);
                qtxVar.setOnClickListener(new bd0(qtxVar, 6));
                ptx ptxVar2 = new ptx(new bpn0(new rkt(qtxVar, 7)));
                qtxVar.setPresenter((ntx) ptxVar2);
                ptxVar2.e = qtxVar;
                return K0(qtxVar);
            case 6:
                ytx ytxVar = new ytx();
                ztx ztxVar = new ztx(viewGroup.getContext());
                ztxVar.setPresenter((wtx) ytxVar);
                ytxVar.b = ztxVar;
                return K0(ztxVar);
            case 7:
                return K0(new FrameLayout(viewGroup.getContext()));
            case 8:
                fvx fvxVar = new fvx();
                ItemTipView itemTipView = new ItemTipView(viewGroup.getContext(), null, 6);
                itemTipView.setPresenter((dvx) fvxVar);
                fvxVar.b = itemTipView;
                return K0(itemTipView);
            case 9:
                return K0(new ItemLinkView(viewGroup.getContext(), null, 6));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        BaseItem baseItem = (BaseItem) this.c.c(i);
        switch (a.$EnumSwitchMapping$0[baseItem.a.ordinal()]) {
            case 1:
                oux ouxVar = (oux) ((pux) e0Var.itemView).getPresenter();
                if (ouxVar != null) {
                    ouxVar.c2();
                    break;
                }
                break;
            case 2:
                com.vkontakte.android.actionlinks.h hVar = (com.vkontakte.android.actionlinks.h) baseItem;
                hvx hvxVar = (hvx) ((ivx) e0Var.itemView).getPresenter();
                if (hvxVar != null) {
                    hvxVar.t7(hVar.e, hVar.b, hVar.c);
                    break;
                }
                break;
            case 3:
                com.vkontakte.android.actionlinks.e eVar = (com.vkontakte.android.actionlinks.e) baseItem;
                kux kuxVar = (kux) ((lux) e0Var.itemView).getPresenter();
                if (kuxVar != null) {
                    kuxVar.R3(eVar.e, eVar.b, eVar.c);
                    break;
                }
                break;
            case 4:
                com.vkontakte.android.actionlinks.a aVar = (com.vkontakte.android.actionlinks.a) baseItem;
                ntx ntxVar = (ntx) ((otx) e0Var.itemView).getPresenter();
                if (ntxVar != null) {
                    ntx.O3(ntxVar, aVar.e, 0, 0, aVar.b, aVar.c, aVar.f, aVar.g, aVar.d, 6);
                    break;
                }
                break;
            case 5:
                com.vkontakte.android.actionlinks.b bVar = (com.vkontakte.android.actionlinks.b) baseItem;
                ntx ntxVar2 = (ntx) ((otx) e0Var.itemView).getPresenter();
                if (ntxVar2 != null) {
                    ntx.O3(ntxVar2, bVar.e, 0, 0, bVar.b, bVar.c, false, false, bVar.d, 6);
                    break;
                }
                break;
            case 6:
                com.vkontakte.android.actionlinks.c cVar = (com.vkontakte.android.actionlinks.c) baseItem;
                wtx wtxVar = (wtx) ((xtx) e0Var.itemView).getPresenter();
                if (wtxVar != null) {
                    wtxVar.b4(cVar.e, cVar.b, cVar.c, cVar.f);
                    break;
                }
                break;
        }
    }
}
