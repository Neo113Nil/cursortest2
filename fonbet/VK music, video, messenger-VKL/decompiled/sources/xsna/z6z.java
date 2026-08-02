package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.core.view.PhotoStackView;
import com.vk.dto.common.data.LikeInfo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.views.avatar.likes.LikesAvatarViewContainer;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import xsna.cq5;
import xsna.r5f0;

/* compiled from: LikesFilledFooterHolder.kt */
/* loaded from: classes4.dex */
public final class z6z extends com.vk.newsfeed.common.recycler.holders.a {
    public static final /* synthetic */ int M0 = 0;
    public final View D0;
    public final View E0;
    public final PhotoStackView F0;
    public final LikesAvatarViewContainer G0;
    public final TextView H0;
    public final View I0;
    public ArrayList<LikeInfo> J0;
    public final bpn0 K0;
    public final Object L0;

    public z6z(ViewGroup viewGroup, h3f0 h3f0Var, h170 h170Var) {
        super(viewGroup, h3f0Var, R.layout.post_view_likes, h170Var);
        this.D0 = this.itemView.findViewById(R.id.comments_wrapper);
        View findViewById = this.itemView.findViewById(R.id.wall_view_like_container);
        this.E0 = findViewById;
        PhotoStackView photoStackView = (PhotoStackView) this.itemView.findViewById(R.id.wall_view_like_photos);
        this.F0 = photoStackView;
        this.G0 = (LikesAvatarViewContainer) this.itemView.findViewById(R.id.wall_view_like_avatar);
        this.H0 = (TextView) this.itemView.findViewById(R.id.wall_view_like_label);
        this.I0 = this.itemView.findViewById(R.id.likes_panel_actions_container);
        this.K0 = new bpn0(new ml7(13));
        this.L0 = msy.a(LazyThreadSafetyMode.NONE, new m2g(this, 28));
        photoStackView.setOverlapOffset(0.8f);
        photoStackView.setMarginBetweenImages(2.0f);
        photoStackView.setDrawBorder(false);
        findViewById.setOnClickListener(this);
    }

    @Override // xsna.rp6, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        Object obj = u1c0Var.g;
        this.J0 = obj instanceof ArrayList ? (ArrayList) obj : null;
        super.a6(u1c0Var);
    }

    @Override // xsna.rp6, xsna.qi6
    public final void b6(u1c0 u1c0Var, Object obj) {
        Object obj2 = u1c0Var.g;
        this.J0 = obj2 instanceof ArrayList ? (ArrayList) obj2 : null;
        super.b6(u1c0Var, obj);
    }

    @Override // com.vk.newsfeed.common.recycler.holders.a
    public final void d7(NewsEntry newsEntry) {
        W6(newsEntry, new p6s());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.vk.feed.core.models.news.NewsEntry] */
    @Override // com.vk.newsfeed.common.recycler.holders.a, android.view.View.OnClickListener
    public final void onClick(View view) {
        ?? q6;
        if (!epx.f(view, this.E0)) {
            super.onClick(view);
        } else {
            if (jjc.b() || (q6 = q6()) == 0) {
                return;
            }
            ((c1c0) this.L0.getValue()).z(this.itemView.getContext(), q6, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.newsfeed.common.recycler.holders.a
    public final void t7(NewsEntry newsEntry) {
        LikeInfo likeInfo;
        super.t7(newsEntry);
        bwt0.p0(this.D0, false);
        s1c0 s1c0Var = this.x;
        bwt0.p0(this.I0, !(s1c0Var != null && s1c0Var.d));
        ArrayList<LikeInfo> arrayList = this.J0;
        boolean z = newsEntry instanceof c6z;
        View view = this.E0;
        if (!z || arrayList == null || arrayList.isEmpty()) {
            bwt0.p0(view, false);
            return;
        }
        String str = null;
        o2f0 o2f0Var = newsEntry instanceof o2f0 ? (o2f0) newsEntry : null;
        Object[] objArr = o2f0Var != null && o2f0Var.T8();
        s1c0 s1c0Var2 = this.x;
        if (!(s1c0Var2 != null ? s1c0Var2.m : true) || objArr == true) {
            bwt0.p0(view, false);
            return;
        }
        c6z c6zVar = (c6z) newsEntry;
        r5f0 r5f0Var = (r5f0) this.K0.getValue();
        int T9 = c6zVar.T9() - (c6zVar.J() ? 1 : 0);
        int i7 = c6zVar.i7() - (c6zVar.x1() ? 1 : 0);
        if (T9 != 0) {
            ((r5f0.a) r5f0Var.a.getValue()).getClass();
            Iterator<LikeInfo> it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().c.getBoolean("friend")) {
                    i++;
                }
            }
            int i2 = T9 - i;
            if (i != 1) {
                if (i != 2) {
                    Context context = e43.a;
                    str = (context != null ? context : null).getString(R.string.post_liked_many, (context != null ? context : null).getResources().getQuantityString(R.plurals.post_people_dat_many, T9, Integer.valueOf(T9)));
                } else if (T9 == i) {
                    Context context2 = e43.a;
                    if (context2 == null) {
                        context2 = null;
                    }
                    LikeInfo likeInfo2 = arrayList.get(0);
                    String string = likeInfo2 != null ? likeInfo2.c.getString("firstNameDat") : null;
                    LikeInfo likeInfo3 = arrayList.get(1);
                    str = context2.getString(R.string.post_liked_two, string, likeInfo3 != null ? likeInfo3.c.getString("firstNameDat") : null);
                } else {
                    Context context3 = e43.a;
                    if (context3 == null) {
                        context3 = null;
                    }
                    LikeInfo likeInfo4 = arrayList.get(0);
                    String string2 = likeInfo4 != null ? likeInfo4.c.getString("firstNameDat") : null;
                    LikeInfo likeInfo5 = arrayList.get(1);
                    String string3 = likeInfo5 != null ? likeInfo5.c.getString("firstNameDat") : null;
                    Context context4 = e43.a;
                    str = context3.getString(R.string.post_liked_two_more, string2, string3, (context4 != null ? context4 : null).getResources().getQuantityString(R.plurals.post_people_dat, i2, Integer.valueOf(i2)));
                }
            } else if (T9 == i) {
                Context context5 = e43.a;
                if (context5 == null) {
                    context5 = null;
                }
                LikeInfo likeInfo6 = arrayList.get(0);
                StringBuilder sb = new StringBuilder();
                sb.append(likeInfo6 != null ? likeInfo6.c.getString("firstNameDat") : null);
                sb.append(' ');
                sb.append(likeInfo6 != null ? likeInfo6.c.getString("lastNameDat") : null);
                str = context5.getString(R.string.post_liked_one, sb.toString());
            } else {
                Context context6 = e43.a;
                if (context6 == null) {
                    context6 = null;
                }
                LikeInfo likeInfo7 = arrayList.get(0);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(likeInfo7 != null ? likeInfo7.c.getString("firstNameDat") : null);
                sb2.append(' ');
                sb2.append(likeInfo7 != null ? likeInfo7.c.getString("lastNameDat") : null);
                String sb3 = sb2.toString();
                Context context7 = e43.a;
                str = context6.getString(R.string.post_liked_one_more, sb3, (context7 != null ? context7 : null).getResources().getQuantityString(R.plurals.post_people_dat, i2, Integer.valueOf(i2)));
            }
        } else if (i7 != 0) {
            ((r5f0.b) r5f0Var.b.getValue()).getClass();
            Iterator<LikeInfo> it2 = arrayList.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                if (it2.next().c.getBoolean("friend")) {
                    i3++;
                }
            }
            int i4 = i7 - i3;
            if (i3 != 1) {
                if (i3 != 2) {
                    Iterator<LikeInfo> it3 = arrayList.iterator();
                    int i5 = 0;
                    while (it3.hasNext()) {
                        if (it3.next().b != 1) {
                            i5++;
                        }
                    }
                    int i6 = i7 - i5;
                    if (i6 == 0) {
                        Context context8 = e43.a;
                        str = (context8 != null ? context8 : null).getResources().getQuantityString(R.plurals.post_reposted_community, i4, Integer.valueOf(i4));
                    } else if (i5 > 0) {
                        Context context9 = e43.a;
                        str = (context9 != null ? context9 : null).getResources().getQuantityString(R.plurals.post_reposted_community_more, i5, Integer.valueOf(i5), Integer.valueOf(i6));
                    } else {
                        Context context10 = e43.a;
                        str = (context10 != null ? context10 : null).getResources().getQuantityString(R.plurals.post_reposted_people, i7, Integer.valueOf(i7));
                    }
                } else if (i7 == i3) {
                    Context context11 = e43.a;
                    if (context11 == null) {
                        context11 = null;
                    }
                    LikeInfo likeInfo8 = arrayList.get(0);
                    String string4 = likeInfo8 != null ? likeInfo8.c.getString("firstName") : null;
                    LikeInfo likeInfo9 = arrayList.get(1);
                    str = context11.getString(R.string.post_reposted_two, string4, likeInfo9 != null ? likeInfo9.c.getString("firstName") : null);
                } else {
                    Context context12 = e43.a;
                    if (context12 == null) {
                        context12 = null;
                    }
                    LikeInfo likeInfo10 = arrayList.get(0);
                    String string5 = likeInfo10 != null ? likeInfo10.c.getString("firstName") : null;
                    LikeInfo likeInfo11 = arrayList.get(1);
                    str = context12.getString(R.string.post_reposted_two_more, string5, likeInfo11 != null ? likeInfo11.c.getString("firstName") : null, String.valueOf(i4));
                }
            } else if (i7 == i3) {
                Bundle bundle = arrayList.get(0).c;
                if (bundle.getBoolean(IronSourceConstants.a.b)) {
                    Context context13 = e43.a;
                    str = (context13 != null ? context13 : null).getString(R.string.post_reposted_one_male, bundle.getString("firstName") + ' ' + bundle.getString("lastName"));
                } else {
                    Context context14 = e43.a;
                    str = (context14 != null ? context14 : null).getString(R.string.post_reposted_one_female, bundle.getString("firstName") + ' ' + bundle.getString("lastName"));
                }
            } else {
                Iterator<LikeInfo> it4 = arrayList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        likeInfo = null;
                        break;
                    }
                    likeInfo = it4.next();
                    LikeInfo likeInfo12 = likeInfo;
                    if (likeInfo12.b == 1 && likeInfo12.c.getBoolean("friend")) {
                        break;
                    }
                }
                Bundle bundle2 = likeInfo.c;
                if (bundle2.getBoolean(IronSourceConstants.a.b)) {
                    Context context15 = e43.a;
                    str = (context15 != null ? context15 : null).getString(R.string.post_reposted_one_more, bundle2.getString("firstName") + ' ' + bundle2.getString("lastName"), String.valueOf(i4));
                } else {
                    Context context16 = e43.a;
                    str = (context16 != null ? context16 : null).getString(R.string.post_reposted_one_more, bundle2.getString("firstName") + ' ' + bundle2.getString("lastName"), String.valueOf(i4));
                }
            }
        } else {
            r5f0Var.getClass();
        }
        if (str == null || str.length() == 0) {
            bwt0.p0(view, false);
            return;
        }
        TextView textView = this.H0;
        textView.setText(str);
        int size = arrayList.size();
        PhotoStackView photoStackView = this.F0;
        LikesAvatarViewContainer likesAvatarViewContainer = this.G0;
        if (size > 1) {
            f4m.s(cn70.b(8), textView);
            photoStackView.setCount(arrayList.size());
            int size2 = arrayList.size();
            for (int i8 = 0; i8 < size2; i8++) {
                photoStackView.h(i8, arrayList.get(i8).c.getString("photo"));
            }
            bwt0.p0(likesAvatarViewContainer, false);
            bwt0.p0(photoStackView, true);
        } else {
            f4m.s(cn70.b(4), textView);
            likesAvatarViewContainer.a(((LikeInfo) j5g.Y(arrayList)).c.getString("photo"), AvatarBorderType.CIRCLE, cq5.b.a);
            bwt0.p0(likesAvatarViewContainer, true);
            bwt0.p0(photoStackView, false);
        }
        bwt0.p0(view, true);
    }
}
