package xsna;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.profile.design.compose.user.ViewType;
import com.vk.profile.user.impl.ui.adapter.MergeMode;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.q630;
import xsna.upq0;

/* compiled from: UserProfileFriendsInfoViewHolder.kt */
/* loaded from: classes5.dex */
public final class xpq0 extends dri<UserProfileAdapterItem.i> {
    public static final a w = new a();
    public final slq0 n;
    public final wh50<Boolean> o;
    public final wh50<Integer> p;
    public final wh50<s8u0> q;
    public final wh50<s8u0> r;
    public final wh50<ViewType> s;
    public final wh50<MergeMode> t;
    public final wh50<wow<String>> u;
    public final upq0 v;

    /* compiled from: UserProfileFriendsInfoViewHolder.kt */
    public static final class a extends eri<xpq0> {
        @Override // xsna.eri
        public final dri a(ComposeView composeView, slq0 slq0Var, zuq0 zuq0Var) {
            return new xpq0(composeView, slq0Var);
        }
    }

    public xpq0(ComposeView composeView, slq0 slq0Var) {
        super(composeView);
        this.n = slq0Var;
        this.o = androidx.compose.runtime.k.b(Boolean.TRUE);
        this.p = androidx.compose.runtime.k.b(null);
        this.q = androidx.compose.runtime.k.b(null);
        this.r = androidx.compose.runtime.k.b(null);
        this.s = androidx.compose.runtime.k.b(ViewType.ONE_LINE);
        this.t = androidx.compose.runtime.k.b(MergeMode.Default);
        this.u = androidx.compose.runtime.k.b(new wow(EmptyList.b));
        this.v = new upq0();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vif0
    public final void i6(Object obj) {
        upq0.a aVar;
        upq0.a aVar2;
        s8u0 s8u0Var;
        s8u0 s8u0Var2;
        s8u0 s8u0Var3;
        s8u0 s8u0Var4;
        UserProfileAdapterItem.i iVar = (UserProfileAdapterItem.i) obj;
        if (iVar != null) {
            ((zak0) this.t).setValue(iVar.b);
            Context context = this.itemView.getContext();
            this.v.getClass();
            boolean z = false;
            if (iVar instanceof UserProfileAdapterItem.i.a) {
                UserProfileAdapterItem.i.a aVar3 = (UserProfileAdapterItem.i.a) iVar;
                String str = aVar3.d;
                s8u0 s8u0Var5 = new s8u0(0);
                int i = aVar3.c;
                String d = uqm0.d(i);
                VkTypographyToken vkTypographyToken = VkTypographyToken.Headline2Medium;
                int h = s8u0Var5.h(new uav0(vkTypographyToken));
                try {
                    int i2 = s8u0Var5.i(new klv0(vkTypographyToken, VkColorToken.TextPrimary));
                    try {
                        s8u0Var5.e(i < 1000 ? context.getResources().getQuantityString(R.plurals.followers_count, i, d) : context.getResources().getString(R.string.user_profile_celebrity_followers_formatted, d));
                        s3q0 s3q0Var = s3q0.a;
                        s8u0Var5.f(h);
                        boolean g = aVar3.g();
                        int i3 = aVar3.e;
                        if (g) {
                            s8u0Var4 = new s8u0(0);
                            if (str != null && i3 > 1) {
                                z = true;
                            }
                            if (z) {
                                i3--;
                            }
                            String quantityString = z ? context.getResources().getQuantityString(R.plurals.user_profile_celebrity_friends_following, i3, str, String.valueOf(i3)) : context.getResources().getQuantityString(R.plurals.user_profile_celebrity_friends_count_following, i3, String.valueOf(i3));
                            VkTypographyToken vkTypographyToken2 = VkTypographyToken.FootnoteNormal;
                            int h2 = s8u0Var4.h(new uav0(vkTypographyToken2));
                            try {
                                int i4 = s8u0Var4.i(new klv0(vkTypographyToken2, VkColorToken.TextSecondary));
                                try {
                                    s8u0Var4.e(quantityString);
                                } finally {
                                }
                            } finally {
                            }
                        } else {
                            s8u0Var4 = null;
                        }
                        aVar2 = new upq0.a(s8u0Var5, s8u0Var4, ViewType.MULTILINE, !aVar3.f, 4);
                    } catch (Throwable th) {
                        s8u0Var3 = s8u0Var5;
                        try {
                            s8u0Var3.f(i2);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            s8u0Var3.f(h);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    s8u0Var3 = s8u0Var5;
                }
            } else {
                if (iVar instanceof UserProfileAdapterItem.i.c.b) {
                    UserProfileAdapterItem.i.c.b bVar = (UserProfileAdapterItem.i.c.b) iVar;
                    int i5 = bVar.e;
                    s8u0 s8u0Var6 = new s8u0(0);
                    VkTypographyToken vkTypographyToken3 = VkTypographyToken.Headline2Medium;
                    int h3 = s8u0Var6.h(new uav0(vkTypographyToken3));
                    try {
                        int i6 = s8u0Var6.i(new klv0(vkTypographyToken3, VkColorToken.TextPrimary));
                    } catch (Throwable th4) {
                        th = th4;
                        s8u0Var = s8u0Var6;
                    }
                    try {
                        try {
                            Resources resources = context.getResources();
                            int i7 = bVar.c;
                            s8u0Var6.e(resources.getQuantityString(R.plurals.friends_quantity, i7, String.valueOf(i7)));
                            s3q0 s3q0Var2 = s3q0.a;
                            if (i5 == 0) {
                                int i8 = s8u0Var6.i(new klv0(VkTypographyToken.SubheadNormal, VkColorToken.TextSecondary));
                                try {
                                    s8u0Var6.e(" · ");
                                    s8u0Var6.e(context.getString(R.string.user_profile_no_mutual_friends));
                                } catch (Throwable th5) {
                                    throw th5;
                                }
                            } else if (i5 == 1 || i5 == 2) {
                                int i9 = s8u0Var6.i(new klv0(VkTypographyToken.SubheadNormal, VkColorToken.TextSecondary));
                                try {
                                    s8u0Var6.e(" · ");
                                    s8u0Var6.e(context.getResources().getQuantityString(R.plurals.friends_mutual, i5, Integer.valueOf(i5)));
                                    s8u0Var6.f(i9);
                                } finally {
                                }
                            }
                            s8u0Var6.f(h3);
                            boolean g2 = bVar.g();
                            List<String> list = bVar.d;
                            if (g2) {
                                s8u0Var2 = new s8u0(0);
                                int size = i5 - list.size();
                                VkTypographyToken vkTypographyToken4 = VkTypographyToken.FootnoteNormal;
                                int h4 = s8u0Var2.h(new uav0(vkTypographyToken4));
                                try {
                                    int i10 = s8u0Var2.i(new klv0(vkTypographyToken4, VkColorToken.TextSecondary));
                                    try {
                                        s8u0Var2.e(context.getResources().getQuantityString(R.plurals.user_profile_mutual_friends_text, size, list.get(0), list.get(1), Integer.valueOf(size)));
                                        s8u0Var2.f(i10);
                                        s8u0Var2.f(h4);
                                    } finally {
                                    }
                                } finally {
                                }
                            } else {
                                s8u0Var2 = null;
                            }
                            aVar = new upq0.a(s8u0Var6, s8u0Var2, ViewType.MULTILINE, false, 20);
                        } finally {
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        s8u0Var = i5;
                        s8u0Var.f(h3);
                        throw th;
                    }
                } else if (iVar instanceof UserProfileAdapterItem.i.c.a) {
                    UserProfileAdapterItem.i.c.a aVar4 = (UserProfileAdapterItem.i.c.a) iVar;
                    s8u0 s8u0Var7 = new s8u0(0);
                    VkTypographyToken vkTypographyToken5 = VkTypographyToken.Headline2Medium;
                    int h5 = s8u0Var7.h(new uav0(vkTypographyToken5));
                    try {
                        int i11 = s8u0Var7.i(new klv0(vkTypographyToken5, VkColorToken.TextPrimary));
                        try {
                            Resources resources2 = context.getResources();
                            int i12 = aVar4.c;
                            s8u0Var7.e(resources2.getQuantityString(R.plurals.friends_quantity, i12, String.valueOf(i12)));
                            s3q0 s3q0Var3 = s3q0.a;
                            s8u0Var7.f(i11);
                            int i13 = s8u0Var7.i(new klv0(VkTypographyToken.SubheadNormal, VkColorToken.TextSecondary));
                            try {
                                s8u0Var7.e(" · ");
                                s8u0Var7.e(context.getString(R.string.user_profile_no_mutual_friends));
                                s8u0Var7.f(i13);
                                s8u0Var7.f(h5);
                                aVar = new upq0.a(s8u0Var7, null, null, false, 14);
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } else if (iVar.equals(UserProfileAdapterItem.i.b.a.c)) {
                    s8u0 s8u0Var8 = new s8u0(0);
                    VkTypographyToken vkTypographyToken6 = VkTypographyToken.TextNormal;
                    int h6 = s8u0Var8.h(new uav0(vkTypographyToken6));
                    try {
                        int i14 = s8u0Var8.i(new klv0(vkTypographyToken6, VkColorToken.TextPrimary));
                        try {
                            s8u0Var8.e(context.getString(R.string.user_profile_find_friends_title));
                            s3q0 s3q0Var4 = s3q0.a;
                            s8u0Var8.f(h6);
                            s8u0 s8u0Var9 = new s8u0(0);
                            VkTypographyToken vkTypographyToken7 = VkTypographyToken.FootnoteNormal;
                            int h7 = s8u0Var9.h(new uav0(vkTypographyToken7));
                            try {
                                int i15 = s8u0Var9.i(new klv0(vkTypographyToken7, VkColorToken.TextLink));
                                try {
                                    s8u0Var9.e(context.getString(R.string.user_profile_find_friends_subtitle));
                                    s8u0Var9.f(i15);
                                    s8u0Var9.f(h7);
                                    aVar = new upq0.a(s8u0Var8, s8u0Var9, ViewType.FIND_FRIENDS, false, 16);
                                } finally {
                                }
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } else if (iVar instanceof UserProfileAdapterItem.i.b.C1703b) {
                    int i16 = ((UserProfileAdapterItem.i.b.C1703b) iVar).c;
                    s8u0 s8u0Var10 = new s8u0(0);
                    VkTypographyToken vkTypographyToken8 = VkTypographyToken.Headline2Medium;
                    int h8 = s8u0Var10.h(new uav0(vkTypographyToken8));
                    try {
                        int i17 = s8u0Var10.i(new klv0(vkTypographyToken8, VkColorToken.TextPrimary));
                        try {
                            s8u0Var10.e(context.getResources().getQuantityString(R.plurals.user_profile_friend_requests_extended, i16, String.valueOf(i16)));
                            s3q0 s3q0Var5 = s3q0.a;
                            s8u0Var10.f(i17);
                            int i18 = s8u0Var10.i(new klv0(VkTypographyToken.SubheadNormal, VkColorToken.TextSecondary));
                            try {
                                s8u0Var10.e(" · ");
                                int i19 = i16 == 1 ? R.string.user_profile_friend_requests_one_extended : R.string.user_profile_friend_requests_many_extended;
                                int i20 = s8u0Var10.i(new klv0(VkTypographyToken.SubheadMedium, VkColorToken.TextLink));
                                try {
                                    s8u0Var10.e(context.getString(i19));
                                    s8u0Var10.f(i20);
                                    s8u0Var10.f(h8);
                                    aVar = new upq0.a(s8u0Var10, null, null, false, 30);
                                } finally {
                                }
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } else {
                    if (!(iVar instanceof UserProfileAdapterItem.i.b.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    UserProfileAdapterItem.i.b.c cVar = (UserProfileAdapterItem.i.b.c) iVar;
                    s8u0 s8u0Var11 = new s8u0(0);
                    VkTypographyToken vkTypographyToken9 = VkTypographyToken.Headline2Medium;
                    int h9 = s8u0Var11.h(new uav0(vkTypographyToken9));
                    try {
                        int i21 = s8u0Var11.i(new klv0(vkTypographyToken9, VkColorToken.TextPrimary));
                        try {
                            Resources resources3 = context.getResources();
                            int i22 = cVar.c;
                            int i23 = cVar.d;
                            s8u0Var11.e(resources3.getQuantityString(R.plurals.friends_quantity, i22, String.valueOf(i22)));
                            s3q0 s3q0Var6 = s3q0.a;
                            if (i23 != 0) {
                                VkTypographyToken vkTypographyToken10 = VkTypographyToken.SubheadMedium;
                                int i24 = s8u0Var11.i(new klv0(vkTypographyToken10, VkColorToken.TextSecondary));
                                try {
                                    s8u0Var11.e(" · ");
                                    s8u0Var11.f(i24);
                                    int i25 = s8u0Var11.i(new klv0(vkTypographyToken10, VkColorToken.TextLink));
                                    try {
                                        s8u0Var11.e(context.getResources().getQuantityString(R.plurals.user_profile_friend_requests, i23, String.valueOf(i23)));
                                        s8u0Var11.f(i25);
                                    } finally {
                                    }
                                } finally {
                                }
                            }
                            s8u0Var11.f(h9);
                            aVar = new upq0.a(s8u0Var11, null, null, false, 30);
                        } finally {
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
                aVar2 = aVar;
            }
            ((zak0) this.o).setValue(Boolean.valueOf(aVar2.e));
            ((zak0) this.p).setValue(aVar2.c);
            ((zak0) this.q).setValue(aVar2.a);
            ((zak0) this.r).setValue(aVar2.b);
            ((zak0) this.s).setValue(aVar2.d);
            ((zak0) this.u).setValue(new wow(iVar.f()));
        }
    }

    @Override // xsna.dri
    public final void q6(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wa5Var;
        gzs gzsVar;
        us2 us2Var;
        androidx.compose.runtime.a M = aVar.M(776680644);
        int i2 = (M.y(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(776680644, i2, -1, "com.vk.profile.user.impl.ui.adapter.holders.UserProfileFriendsInfoViewHolder.Content (UserProfileFriendsInfoViewHolder.kt:52)");
            }
            s8u0 s8u0Var = (s8u0) ((zak0) this.q).getValue();
            if (s8u0Var == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    wa5Var = new nx7(this, i, 14);
                    s.d = wa5Var;
                }
                return;
            }
            if (((Boolean) ((zak0) this.o).getValue()).booleanValue()) {
                M.K(1104459722);
                boolean y = M.y(this);
                Object x = M.x();
                if (y || x == a.C0011a.a) {
                    x = new u110(this, 24);
                    M.R(x);
                }
                M.j();
                gzsVar = (gzs) x;
            } else {
                M.K(1104546521);
                M.j();
                gzsVar = null;
            }
            s8u0 s8u0Var2 = (s8u0) ((zak0) this.r).getValue();
            Integer num = (Integer) ((zak0) this.p).getValue();
            us2 j = s8u0Var.j(8, M);
            if (s8u0Var2 == null) {
                M.K(1104811850);
                M.j();
                us2Var = null;
            } else {
                M.K(-934192233);
                us2 j2 = s8u0Var2.j(8, M);
                M.j();
                us2Var = j2;
            }
            zdv0.c(j, us2Var, num, znk0.O((MergeMode) ((zak0) this.t).getValue()), ((wow) ((zak0) this.u).getValue()).b, txj0.z(txj0.f(q630.a.a, 1.0f), null, 3), (ViewType) ((zak0) this.s).getValue(), gzsVar, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            wa5Var = new wa5(this, i, 13);
            s.d = wa5Var;
        }
    }
}
