package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import com.vk.profile.user.impl.ui.adapter.MergeMode;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;

/* compiled from: UserProfileRecommendationsViewHolder.kt */
/* loaded from: classes5.dex */
public final class duq0 extends aq6<UserProfileAdapterItem.p> {
    public final slq0 n;
    public final ta60<ProfilesRecommendations> o;
    public MergeMode p;
    public final int q;
    public final int r;

    /* compiled from: UserProfileRecommendationsViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MergeMode.values().length];
            try {
                iArr[MergeMode.MergeBoth.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MergeMode.MergeTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MergeMode.MergeBottom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public duq0() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public duq0(ViewGroup viewGroup, hpq0 hpq0Var) {
        super(r1.itemView);
        xe8 t0 = hd60.a().t0();
        t0.getClass();
        cuq0 cuq0Var = new cuq0(viewGroup, (h170) t0.b.getValue());
        String a2 = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE);
        this.q = this.itemView.getResources().getDimensionPixelSize(R.dimen.profile_card_corner_radius_small);
        this.r = this.itemView.getResources().getDimensionPixelSize(R.dimen.profile_card_corner_radius);
        this.n = hpq0Var;
        this.o = cuq0Var;
        cuq0Var.u = a2;
        cuq0Var.P = new in60(hpq0Var, 28);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        UserProfileAdapterItem.p pVar = (UserProfileAdapterItem.p) obj;
        View view = this.itemView;
        int h = pVar.b.h();
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.h0(h, view);
        MergeMode mergeMode = pVar.b;
        if (this.p != mergeMode) {
            this.p = mergeMode;
            int i = mergeMode == null ? -1 : a.$EnumSwitchMapping$0[mergeMode.ordinal()];
            int i2 = this.q;
            if (i != 1) {
                int i3 = this.r;
                if (i == 2 || i != 3) {
                    i2 = i3;
                }
            }
            this.itemView.setOutlineProvider(new euq0(i2));
            this.itemView.setClipToOutline(true);
        }
        this.o.D3(pVar.c);
    }
}
