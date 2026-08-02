package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.profile.design.compose.user.FriendsAndFollowersBlockData;
import com.vk.profile.user.impl.ui.adapter.MergeMode;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.q630;

/* compiled from: UserProfileFriendsAndFollowersInfoViewHolder.kt */
/* loaded from: classes5.dex */
public final class rpq0 extends dri<UserProfileAdapterItem.h> {
    public static final a t = new a();
    public final slq0 n;
    public final wh50<FriendsAndFollowersBlockData> o;
    public final wh50<FriendsAndFollowersBlockData> p;
    public final wh50<MergeMode> q;
    public final wh50<Boolean> r;
    public final ppq0 s;

    /* compiled from: UserProfileFriendsAndFollowersInfoViewHolder.kt */
    public static final class a extends eri<rpq0> {
        @Override // xsna.eri
        public final dri a(ComposeView composeView, slq0 slq0Var, zuq0 zuq0Var) {
            return new rpq0(composeView, slq0Var);
        }
    }

    /* compiled from: UserProfileFriendsAndFollowersInfoViewHolder.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FriendsAndFollowersBlockData.BlockType.values().length];
            try {
                iArr[FriendsAndFollowersBlockData.BlockType.ALL_FRIENDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FriendsAndFollowersBlockData.BlockType.MUTUAL_FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FriendsAndFollowersBlockData.BlockType.FOLLOWERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public rpq0(ComposeView composeView, slq0 slq0Var) {
        super(composeView);
        this.n = slq0Var;
        this.o = androidx.compose.runtime.k.b(null);
        this.p = androidx.compose.runtime.k.b(null);
        this.q = androidx.compose.runtime.k.b(MergeMode.Default);
        this.r = androidx.compose.runtime.k.b(Boolean.FALSE);
        this.s = new ppq0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [com.vk.profile.design.compose.user.FriendsAndFollowersBlockData] */
    /* JADX WARN: Type inference failed for: r12v13, types: [com.vk.profile.design.compose.user.FriendsAndFollowersBlockData] */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.vk.profile.design.compose.user.FriendsAndFollowersBlockData] */
    @Override // xsna.vif0
    public final void i6(Object obj) {
        s8u0 s8u0Var;
        s8u0 s8u0Var2;
        int i;
        s8u0 s8u0Var3;
        int h;
        String quantityString;
        UserProfileAdapterItem.h hVar = (UserProfileAdapterItem.h) obj;
        if (hVar != null) {
            ((zak0) this.q).setValue(hVar.b);
            Context context = this.itemView.getContext();
            ppq0 ppq0Var = this.s;
            sdi sdiVar = ppq0Var.a;
            sdi sdiVar2 = ppq0Var.a;
            ListBuilder e = e43.e();
            boolean z = hVar instanceof UserProfileAdapterItem.h.a;
            s8u0 s8u0Var4 = null;
            if (z) {
                UserProfileAdapterItem.h.a aVar = (UserProfileAdapterItem.h.a) hVar;
                FriendsAndFollowersBlockData a2 = ppq0Var.a(context, aVar.c, aVar.e, true);
                if (a2 != null) {
                    e.add(a2);
                }
                int i2 = aVar.d;
                List<String> list = aVar.f;
                if (i2 != 0) {
                    s8u0 f = sdi.f(sdiVar2, context, i2, false);
                    s8u0Var = new s8u0(0);
                    VkTypographyToken vkTypographyToken = VkTypographyToken.FootnoteNormal;
                    h = s8u0Var.h(new uav0(vkTypographyToken));
                    try {
                        i = s8u0Var.i(new klv0(vkTypographyToken, VkColorToken.TextSecondary));
                        try {
                            s8u0Var.e(drm0.p0(context.getResources().getQuantityString(R.plurals.followers_count, i2, "")).toString());
                            s3q0 s3q0Var = s3q0.a;
                            s8u0Var.f(h);
                            s8u0Var4 = new FriendsAndFollowersBlockData(f, s8u0Var, ppq0.b(list), FriendsAndFollowersBlockData.BlockType.FOLLOWERS, true);
                        } finally {
                            s8u0Var.f(i);
                        }
                    } finally {
                    }
                }
                if (s8u0Var4 != null) {
                    e.add(s8u0Var4);
                }
            } else if (hVar instanceof UserProfileAdapterItem.h.b.C1702b) {
                UserProfileAdapterItem.h.b.C1702b c1702b = (UserProfileAdapterItem.h.b.C1702b) hVar;
                int i3 = c1702b.c + c1702b.d;
                if (i3 != 0) {
                    int i4 = c1702b.i + c1702b.h;
                    s8u0 f2 = sdi.f(sdiVar2, context, i3, true);
                    String str = (String) j5g.a0(c1702b.j);
                    if (str == null) {
                        str = c1702b.g;
                    }
                    if (i4 > 0 && str != null) {
                        s8u0Var = new s8u0(0);
                        VkTypographyToken vkTypographyToken2 = VkTypographyToken.FootnoteNormal;
                        h = s8u0Var.h(new uav0(vkTypographyToken2));
                        try {
                            i = s8u0Var.i(new klv0(vkTypographyToken2, VkColorToken.TextSecondary));
                            try {
                                if (i4 > 1) {
                                    int i5 = i4 - 1;
                                    quantityString = context.getResources().getQuantityString(R.plurals.user_profile_celebrity_friends_following, i5, str, String.valueOf(i5));
                                } else {
                                    quantityString = context.getResources().getQuantityString(R.plurals.user_profile_celebrity_friends_count_following, i4, String.valueOf(i4));
                                }
                                if (quantityString.length() > 0) {
                                    quantityString = ((Object) String.valueOf(quantityString.charAt(0)).toUpperCase(Locale.ROOT)) + quantityString.substring(1);
                                }
                                s8u0Var.e(quantityString);
                                s3q0 s3q0Var2 = s3q0.a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        } finally {
                        }
                    }
                    s8u0Var4 = new FriendsAndFollowersBlockData(f2, s8u0Var4, ppq0.b(j5g.u0(c1702b.e, c1702b.f)), FriendsAndFollowersBlockData.BlockType.FOLLOWERS, c1702b.k || i4 > 0);
                }
                if (s8u0Var4 != null) {
                    e.add(s8u0Var4);
                }
            } else {
                if (!(hVar instanceof UserProfileAdapterItem.h.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                UserProfileAdapterItem.h.b.a aVar2 = (UserProfileAdapterItem.h.b.a) hVar;
                List<String> list2 = aVar2.f;
                List<String> list3 = list2;
                List<String> H0 = j5g.H0(j5g.u0(list3, j5g.t0(aVar2.e, j5g.S0(list3))), 3);
                ArrayList arrayList = new ArrayList(j5g.t0(list3, j5g.S0(H0)));
                for (String str2 : list2) {
                    if (arrayList.size() < 3 && !arrayList.contains(str2)) {
                        arrayList.add(str2);
                    }
                }
                FriendsAndFollowersBlockData a3 = ppq0Var.a(context, aVar2.c, H0, aVar2.g);
                if (a3 != null) {
                    e.add(a3);
                }
                int i6 = aVar2.d;
                if (i6 != 0) {
                    s8u0Var = new s8u0(0);
                    VkTypographyToken vkTypographyToken3 = VkTypographyToken.Headline2Medium;
                    int h2 = s8u0Var.h(new uav0(vkTypographyToken3));
                    try {
                        i = s8u0Var.i(new klv0(vkTypographyToken3, VkColorToken.TextPrimary));
                        try {
                            s8u0Var.e(String.valueOf(i6));
                            s3q0 s3q0Var3 = s3q0.a;
                            s8u0Var.f(h2);
                            s8u0Var = new s8u0(0);
                            VkTypographyToken vkTypographyToken4 = VkTypographyToken.FootnoteNormal;
                            int h3 = s8u0Var.h(new uav0(vkTypographyToken4));
                            try {
                                i = s8u0Var.i(new klv0(vkTypographyToken4, VkColorToken.TextSecondary));
                                try {
                                    s8u0Var.e(drm0.p0(context.getResources().getQuantityString(R.plurals.user_profile_followers_mode_friends_mutual, i6, "")).toString());
                                    s8u0Var.f(h3);
                                    s8u0Var4 = new FriendsAndFollowersBlockData(s8u0Var, s8u0Var, ppq0.b(arrayList), FriendsAndFollowersBlockData.BlockType.MUTUAL_FRIENDS, true);
                                } catch (Throwable th2) {
                                    s8u0Var3 = s8u0Var;
                                    try {
                                        s8u0Var3.f(i);
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        s8u0Var3.f(h3);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                s8u0Var3 = s8u0Var;
                            }
                        } catch (Throwable th5) {
                            s8u0Var2 = s8u0Var;
                            try {
                                s8u0Var2.f(i);
                                throw th5;
                            } catch (Throwable th6) {
                                th = th6;
                                s8u0Var2.f(h2);
                                throw th;
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        s8u0Var2 = s8u0Var;
                    }
                }
                if (s8u0Var4 != null) {
                    e.add(s8u0Var4);
                }
            }
            ListBuilder g = e.g();
            ((zak0) this.o).setValue(j5g.b0(0, g));
            ((zak0) this.p).setValue(j5g.b0(1, g));
            if (z) {
                ((zak0) this.r).setValue(Boolean.valueOf(((UserProfileAdapterItem.h.a) hVar).g));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [androidx.compose.runtime.a] */
    /* JADX WARN: Type inference failed for: r1v26, types: [xsna.q630] */
    @Override // xsna.dri
    public final void q6(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> k87Var;
        q630.a aVar2;
        ?? M = aVar.M(1696070792);
        int i2 = (M.y(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1696070792, i2, -1, "com.vk.profile.user.impl.ui.adapter.holders.UserProfileFriendsAndFollowersInfoViewHolder.Content (UserProfileFriendsAndFollowersInfoViewHolder.kt:68)");
            }
            zak0 zak0Var = (zak0) this.o;
            Object value = zak0Var.getValue();
            wh50<FriendsAndFollowersBlockData> wh50Var = this.p;
            if (value == null && ((zak0) wh50Var).getValue() == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    k87Var = new oa5(this, i, 12);
                    s.d = k87Var;
                }
                return;
            }
            Boolean bool = (Boolean) ((zak0) this.r).getValue();
            boolean booleanValue = bool.booleanValue();
            boolean y = M.y(this);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (y || x == obj) {
                x = new i0b0(this, 23);
                M.R(x);
            }
            buv0 z = rdi.z(false, (izs) x, null, M, 0, 5);
            boolean l = M.l(booleanValue) | M.y(z);
            Object x2 = M.x();
            if (l || x2 == obj) {
                x2 = new spq0(booleanValue, z, null);
                M.R(x2);
            }
            bap.g(bool, (wzs) x2, M, 0);
            q630.a aVar3 = q630.a.a;
            if (booleanValue) {
                M.K(1650419389);
                String string = this.itemView.getContext().getString(R.string.user_profile_friends_catalog_onboarding);
                VkTooltip$MarkerStyle vkTooltip$MarkerStyle = VkTooltip$MarkerStyle.Style6;
                VkTooltip$MarkerSize vkTooltip$MarkerSize = VkTooltip$MarkerSize.Size146;
                VkOnboarding$TintColor vkOnboarding$TintColor = VkOnboarding$TintColor.Lime;
                VkTooltip$BalloonPosition vkTooltip$BalloonPosition = VkTooltip$BalloonPosition.Top;
                VkTooltip$BalloonTilt vkTooltip$BalloonTilt = VkTooltip$BalloonTilt.Left;
                boolean y2 = M.y(z);
                Object x3 = M.x();
                if (y2 || x3 == obj) {
                    x3 = new wt30(z, 29);
                    M.R(x3);
                }
                gzs gzsVar = (gzs) x3;
                boolean y3 = M.y(z);
                Object x4 = M.x();
                if (y3 || x4 == obj) {
                    x4 = new ajd0(z, 14);
                    M.R(x4);
                }
                ?? g = o9v0.g(string, z, vkTooltip$MarkerStyle, vkTooltip$MarkerSize, vkOnboarding$TintColor, vkTooltip$BalloonPosition, vkTooltip$BalloonTilt, gzsVar, (gzs) x4, !dhr0.M(), 261632);
                M.j();
                aVar2 = g;
            } else {
                M.K(1651099994);
                M.j();
                aVar2 = aVar3;
            }
            FriendsAndFollowersBlockData friendsAndFollowersBlockData = (FriendsAndFollowersBlockData) zak0Var.getValue();
            FriendsAndFollowersBlockData friendsAndFollowersBlockData2 = (FriendsAndFollowersBlockData) ((zak0) wh50Var).getValue();
            uog0 O = znk0.O((MergeMode) ((zak0) this.q).getValue());
            boolean y4 = M.y(this);
            Object x5 = M.x();
            if (y4 || x5 == obj) {
                tpq0 tpq0Var = new tpq0(1, this, rpq0.class, "onBlockClick", "onBlockClick(Lcom/vk/profile/design/compose/user/FriendsAndFollowersBlockData$BlockType;)V", 0);
                M.R(tpq0Var);
                x5 = tpq0Var;
            }
            com.vk.profile.design.compose.user.a.c(friendsAndFollowersBlockData, friendsAndFollowersBlockData2, O, (izs) ((fcy) x5), txj0.z(txj0.f(aVar3, 1.0f), null, 3), aVar2, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            k87Var = new k87(this, i, 13);
            s.d = k87Var;
        }
    }
}
