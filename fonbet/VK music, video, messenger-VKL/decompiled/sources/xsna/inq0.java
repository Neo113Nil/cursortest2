package xsna;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.soloader.MinElf;
import com.vk.dto.common.gift.GiftType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.gift.GiftItem;
import com.vk.dto.user.UserProfile;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import java.util.Collection;
import kotlin.collections.EmptyList;
import xsna.klh;
import xsna.o0r0;
import xsna.ypq0;

/* compiled from: UserProfileContentGiftsViewHolder.kt */
/* loaded from: classes5.dex */
public final class inq0 extends wjh<mzt> {
    public final oqq0 E;
    public final boolean F;
    public final mdm0 G;
    public final ypq0 H;

    /* compiled from: UserProfileContentGiftsViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GiftType.values().length];
            try {
                iArr[GiftType.IMAGE_STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GiftType.IMAGE_STATUS_PACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GiftType.GIFT_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GiftType.STICKERS_PACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GiftType.RANDOM_STICKERS_PACK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GiftType.STICKERS_PACK_FOR_CHOICES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GiftType.REGULAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public inq0(View view, UserId userId, UserProfileFragment userProfileFragment, oqq0 oqq0Var, boolean z, mdm0 mdm0Var, ygq0 ygq0Var, zgq0 zgq0Var, ahq0 ahq0Var, bhq0 bhq0Var, chq0 chq0Var) {
        super(view, userId, userProfileFragment, ygq0Var, zgq0Var, ahq0Var, bhq0Var, chq0Var, null);
        this.E = oqq0Var;
        this.F = z;
        this.G = mdm0Var;
        ypq0 ypq0Var = new ypq0(new jnq0(userId, this, userProfileFragment));
        this.H = ypq0Var;
        RecyclerView recyclerView = this.w.getRecyclerView();
        recyclerView.setItemAnimator(null);
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        awt0.x(recyclerView, 0, iah0.a(1), 0, 0, 13);
        recyclerView.setClipToPadding(false);
        this.w.setAdapter(ypq0Var);
    }

    @Override // xsna.wjh
    public final void V5(mzt mztVar) {
        mzt mztVar2 = mztVar;
        super.V5(mztVar2);
        Collection collection = mztVar2.j;
        if (collection == null) {
            collection = EmptyList.b;
        }
        this.H.setItems(collection);
        CommunityProfileContentItem.State state = mztVar2.r;
        CommunityProfileContentItem.State state2 = CommunityProfileContentItem.State.LOADING;
        RecyclerPaginatedView recyclerPaginatedView = this.w;
        if (state == state2) {
            recyclerPaginatedView.lb();
        } else if (state == CommunityProfileContentItem.State.ERROR) {
            recyclerPaginatedView.Fe();
        }
    }

    @Override // xsna.wjh
    public final boolean W5(mzt mztVar) {
        mzt mztVar2 = mztVar;
        return mztVar2 != null && mztVar2.k && mztVar2.r.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wjh
    public final klh.b b6(RecyclerView.e0 e0Var) {
        if (!(e0Var instanceof ypq0.b)) {
            return null;
        }
        ypq0.b bVar = (ypq0.b) e0Var;
        if (((GiftItem) bVar.m) != null) {
            return new klh.b(r0.c, null, bVar.getAbsoluteAdapterPosition(), null);
        }
        return null;
    }

    @Override // xsna.wjh
    public final void m6(mzt mztVar) {
        this.x.setContent(fmi.c);
    }

    public final void t6(String str) {
        Context mo2getContext = this.m.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        g2v.d().a().x(mo2getContext, str, this.F ? "gifts_own" : "gifts", this.l.b);
    }

    public final void v6(UserId userId) {
        Context mo2getContext;
        if (((int) userId.b) == 0 || (mo2getContext = this.m.mo2getContext()) == null) {
            return;
        }
        xwk.e().m(mo2getContext, userId, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
    }

    public final void x6(UserProfile userProfile) {
        Context mo2getContext = this.m.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        g2v.d().a().r(mo2getContext, (userProfile == null ? o25.a().o().b() : userProfile).c, (userProfile == null || o25.a().a(userProfile.c)) ? "gifts_own" : "gifts");
    }
}
