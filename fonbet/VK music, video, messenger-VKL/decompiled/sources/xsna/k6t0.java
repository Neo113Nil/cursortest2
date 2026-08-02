package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.vk.content.privacy.api.VideoPrivacySettingType;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.donut.DonutLevel;
import com.vk.dto.posting.FriendsListPrivacyType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.nfd0;
import xsna.tij;
import xsna.tlo0;

/* compiled from: VideoPrivacyBottomSheet.kt */
/* loaded from: classes17.dex */
public final class k6t0 extends tij implements fcn {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final nfd0 G;
    public final FriendsListPrivacyType H;
    public boolean I;
    public final PrivacySetting u;
    public final UserId v;
    public final wzs<PrivacySetting, DonutLevel, s3q0> w;
    public final boolean x;
    public final Object y;
    public final String z;

    public k6t0(Context context, VideoPrivacySettingType videoPrivacySettingType, PrivacySetting privacySetting, UserId userId, izs izsVar, wzs wzsVar, DonutLevel donutLevel) {
        super(context, izsVar, null, null);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        this.u = privacySetting;
        this.v = userId;
        this.w = wzsVar;
        VideoPrivacySettingType.VideoWatch videoWatch = VideoPrivacySettingType.VideoWatch.b;
        this.x = epx.f(videoPrivacySettingType, videoWatch);
        this.y = msy.a(LazyThreadSafetyMode.NONE, new ksq0(this, 8));
        this.z = "VideoPrivacyBottomSheet";
        this.A = R.string.privacy_bottomsheet_title;
        if (epx.f(videoPrivacySettingType, videoWatch)) {
            i = R.string.privacy_videos_allowed_group_title;
        } else if (epx.f(videoPrivacySettingType, VideoPrivacySettingType.VideoComments.b)) {
            i = R.string.privacy_comments_videos_allowed_group_title;
        } else {
            if (!epx.f(videoPrivacySettingType, VideoPrivacySettingType.PlaylistWatch.b)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.privacy_videos_playlists_allowed_group_title;
        }
        this.B = i;
        if (epx.f(videoPrivacySettingType, videoWatch)) {
            i2 = R.string.privacy_videos_forbidden_group_title;
        } else if (epx.f(videoPrivacySettingType, VideoPrivacySettingType.VideoComments.b)) {
            i2 = R.string.privacy_comments_videos_forbidden_group_title;
        } else {
            if (!epx.f(videoPrivacySettingType, VideoPrivacySettingType.PlaylistWatch.b)) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R.string.privacy_videos_playlists_forbidden_group_title;
        }
        this.C = i2;
        if (epx.f(videoPrivacySettingType, videoWatch) || epx.f(videoPrivacySettingType, VideoPrivacySettingType.VideoComments.b)) {
            i3 = R.string.privacy_videos_closed_account_card_description;
        } else {
            if (!epx.f(videoPrivacySettingType, VideoPrivacySettingType.PlaylistWatch.b)) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = R.string.privacy_videos_playlists_closed_account_card_description;
        }
        this.D = i3;
        if (epx.f(videoPrivacySettingType, videoWatch) || epx.f(videoPrivacySettingType, VideoPrivacySettingType.VideoComments.b)) {
            i4 = R.string.privacy_videos_closed_account_dialog_title;
        } else {
            if (!epx.f(videoPrivacySettingType, VideoPrivacySettingType.PlaylistWatch.b)) {
                throw new NoWhenBranchMatchedException();
            }
            i4 = R.string.privacy_videos_playlists_closed_account_dialog_title;
        }
        this.E = i4;
        if (epx.f(videoPrivacySettingType, videoWatch) || epx.f(videoPrivacySettingType, VideoPrivacySettingType.VideoComments.b)) {
            i5 = R.string.privacy_videos_closed_account_dialog_message;
        } else {
            if (!epx.f(videoPrivacySettingType, VideoPrivacySettingType.PlaylistWatch.b)) {
                throw new NoWhenBranchMatchedException();
            }
            i5 = R.string.privacy_videos_playlists_closed_account_dialog_message;
        }
        this.F = i5;
        nfd0 nfd0Var = new nfd0();
        nfd0Var.g = donutLevel;
        this.G = nfd0Var;
        this.H = FriendsListPrivacyType.VIDEO;
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // xsna.tij
    public final int U0() {
        return this.D;
    }

    @Override // xsna.tij
    public final int V0() {
        return this.F;
    }

    @Override // xsna.tij
    public final int W0() {
        return this.E;
    }

    @Override // xsna.tij
    public final int X0() {
        return this.B;
    }

    @Override // xsna.tij
    public final FriendsListPrivacyType Y0() {
        return this.H;
    }

    @Override // xsna.tij
    public final nfd0 Z0() {
        return this.G;
    }

    @Override // xsna.tij
    public final int a1() {
        return this.C;
    }

    @Override // xsna.tij
    public final String b1() {
        return this.z;
    }

    @Override // xsna.tij
    public final int c1() {
        return this.A;
    }

    @Override // xsna.tij
    public final void e1() {
        boolean z;
        nfd0 nfd0Var;
        boolean z2;
        Object obj;
        Object obj2;
        String str;
        ww50 v = s200.v(this.c);
        if (v != null) {
            v.S(this);
        }
        PrivacySetting privacySetting = this.u;
        List<String> list = privacySetting.f;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            z = this.x;
            nfd0Var = this.G;
            if (!hasNext) {
                break;
            }
            nfd0.b a = nfd0.a.a((String) it.next(), z, nfd0Var.g);
            if (a != null) {
                arrayList.add(a);
            }
        }
        int i = 0;
        List<nfd0.b> singletonList = Collections.singletonList(new nfd0.b("forbidden_some", false, new PrivacyRules.Exclude(), R.string.privacy_add_friends_or_lists, new nfd0.c.b()));
        nfd0Var.h = arrayList;
        nfd0Var.i = singletonList;
        Set y0 = rl3.y0(new PrivacyRules.PredefinedSet[]{PrivacyRules.d, PrivacyRules.g});
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (j5g.P(y0, ((nfd0.b) it2.next()).c)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        this.I = z2;
        Iterator it3 = arrayList.iterator();
        while (true) {
            AttributeSet attributeSet = null;
            if (!it3.hasNext()) {
                break;
            }
            nfd0.b bVar = (nfd0.b) it3.next();
            PrivacySetting.PrivacyRule privacyRule = bVar.c;
            nfd0.c cVar = bVar.e;
            if (epx.f(privacyRule, PrivacyRules.f)) {
                if (cVar instanceof nfd0.c.a) {
                    nfd0.c.a aVar = (nfd0.c.a) cVar;
                    boolean z3 = aVar.b;
                    str = aVar.a;
                    if (!z3) {
                        str = this.c.getString(R.string.video_donut_level_subtitle_with_higher_format, str);
                    }
                } else {
                    str = null;
                }
                VkCell vkCell = new VkCell(this.e, attributeSet, 6, i);
                vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(tq.h(tlo0.Companion, bVar.d), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), str != null ? new VkCell.Middle.d(new tlo0.h(str), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62) : null, null, 12));
                vkCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, (VkCell.Right.e) null, new VkCell.Right.ExtraAction.a(6, null, true), (VkCell.Right.b) null, 27));
                bwt0.i0(vkCell, new defpackage.b0(13, this, bVar));
                vkCell.setTag(bVar.a);
                ViewGroup viewGroup = this.k;
                if (viewGroup != null) {
                    viewGroup.addView(vkCell);
                }
            } else if (cVar instanceof nfd0.c.b) {
                T0(true, bVar);
            } else if (cVar == null) {
                S0(true, bVar);
            }
            i = 0;
        }
        List<nfd0.b> list2 = singletonList;
        for (nfd0.b bVar2 : list2) {
            if (bVar2.e == null) {
                S0(false, bVar2);
            } else {
                T0(false, bVar2);
            }
        }
        Object obj3 = EmptyList.b;
        List<PrivacySetting.PrivacyRule> list3 = privacySetting.e;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it4 = list3.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                PrivacySetting.PrivacyRule privacyRule2 = (PrivacySetting.PrivacyRule) it4.next();
                if ((privacyRule2 instanceof PrivacyRules.Exclude) && j5g.b0(0, ((PrivacyRules.Exclude) privacyRule2).zb()) != null) {
                    Iterator<T> it5 = list2.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            obj = it5.next();
                            if (((nfd0.b) obj).c instanceof PrivacyRules.Exclude) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    nfd0Var.f = (nfd0.b) obj;
                }
            }
        }
        List<PrivacySetting.PrivacyRule> list4 = privacySetting.e;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator<T> it6 = list4.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                PrivacySetting.PrivacyRule privacyRule3 = (PrivacySetting.PrivacyRule) it6.next();
                if ((privacyRule3 instanceof PrivacyRules.Include) && j5g.b0(0, ((PrivacyRules.Include) privacyRule3).zb()) != null) {
                    Iterator it7 = arrayList.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            obj2 = it7.next();
                            if (((nfd0.b) obj2).c instanceof PrivacyRules.Include) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    nfd0Var.e = (nfd0.b) obj2;
                }
            }
        }
        Object obj4 = obj3;
        Object obj5 = obj4;
        Object obj6 = obj5;
        for (PrivacySetting.PrivacyRule privacyRule4 : privacySetting.e) {
            String str2 = (String) j5g.b0(0, privacyRule4.zb());
            nfd0.b a2 = str2 != null ? nfd0.a.a(str2, z, nfd0Var.g) : null;
            if (a2 != null) {
                nfd0Var.e = a2;
            } else if (privacyRule4 instanceof PrivacyRules.Exclude) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it8 = ((ArrayList) ((PrivacyRules.UserListPrivacyRule) privacyRule4).Cb()).iterator();
                while (it8.hasNext()) {
                    UserId userId = (UserId) it8.next();
                    long j = userId.b;
                    if (j < 2000000000) {
                        arrayList2.add(userId);
                    } else {
                        arrayList3.add(Integer.valueOf((int) (j - 2000000000)));
                    }
                }
                Pair pair = new Pair(arrayList2, arrayList3);
                obj5 = pair.i();
                obj6 = pair.j();
            } else if (privacyRule4 instanceof PrivacyRules.Include) {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                Iterator it9 = ((ArrayList) ((PrivacyRules.UserListPrivacyRule) privacyRule4).Cb()).iterator();
                while (it9.hasNext()) {
                    UserId userId2 = (UserId) it9.next();
                    long j2 = userId2.b;
                    if (j2 < 2000000000) {
                        arrayList4.add(userId2);
                    } else {
                        arrayList5.add(Integer.valueOf((int) (j2 - 2000000000)));
                    }
                }
                Pair pair2 = new Pair(arrayList4, arrayList5);
                obj3 = pair2.i();
                obj4 = pair2.j();
            }
        }
        f1(new tij.a((List) obj3, (List) obj4, (List) obj5, (List) obj6));
    }

    @Override // xsna.tij
    public final void g1() {
        ww50 v = s200.v(this.c);
        if (v != null) {
            v.H(this);
        }
    }

    @Override // xsna.tij
    public final void i1() {
        nfd0 nfd0Var = this.G;
        nfd0.b bVar = nfd0Var.e;
        PrivacySetting.PrivacyRule privacyRule = bVar != null ? bVar.c : null;
        PrivacyRules.PredefinedSet predefinedSet = PrivacyRules.a;
        if (epx.f(privacyRule, PrivacyRules.f)) {
            wzs<PrivacySetting, DonutLevel, s3q0> wzsVar = this.w;
            if (wzsVar != null) {
                wzsVar.invoke(nfd0Var.c(), nfd0Var.g);
            }
        } else {
            this.f.invoke(nfd0Var.c());
        }
        d1();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @Override // xsna.tij
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n1() {
        boolean z;
        View view;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        PrivacyRules.PredefinedSet predefinedSet = PrivacyRules.a;
        Set y0 = rl3.y0(new PrivacyRules.PredefinedSet[]{PrivacyRules.a, PrivacyRules.j});
        nfd0 nfd0Var = this.G;
        List<nfd0.b> list = nfd0Var.h;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (j5g.P(y0, ((nfd0.b) obj).c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((nfd0.b) it.next()).a);
        }
        if (!this.I && (viewGroup3 = this.k) != null) {
            for (int i = 0; i < viewGroup3.getChildCount(); i++) {
                View childAt = viewGroup3.getChildAt(i);
                if (j5g.P(arrayList2, childAt.getTag()) && nfd0Var.j) {
                    f4m.j(childAt);
                }
            }
        }
        nfd0.b bVar = nfd0Var.e;
        PrivacySetting.PrivacyRule privacyRule = bVar != null ? bVar.c : null;
        PrivacyRules.PredefinedSet predefinedSet2 = PrivacyRules.a;
        if (!epx.f(privacyRule, PrivacyRules.b)) {
            nfd0.b bVar2 = nfd0Var.e;
            if (!((bVar2 != null ? bVar2.c : null) instanceof PrivacyRules.Include)) {
                z = false;
                view = this.n;
                if (view != null) {
                    view.setAlpha(z ? 0.4f : 1.0f);
                }
                viewGroup = this.m;
                if (viewGroup != null) {
                    viewGroup.setAlpha(z ? 0.4f : 1.0f);
                }
                viewGroup2 = this.m;
                if (viewGroup2 != null) {
                    for (int i2 = 0; i2 < viewGroup2.getChildCount(); i2++) {
                        viewGroup2.getChildAt(i2).setClickable(!z);
                    }
                }
                if (z) {
                    nfd0Var.f = null;
                }
                super.n1();
                if (this.I) {
                    return;
                }
                ViewGroup viewGroup4 = this.m;
                if (viewGroup4 != null) {
                    f4m.j(viewGroup4);
                }
                View view2 = this.n;
                if (view2 != null) {
                    f4m.j(view2);
                }
                VkBanner vkBanner = this.r;
                if (vkBanner != null) {
                    bwt0.p0(vkBanner, false);
                    return;
                }
                return;
            }
        }
        z = true;
        view = this.n;
        if (view != null) {
        }
        viewGroup = this.m;
        if (viewGroup != null) {
        }
        viewGroup2 = this.m;
        if (viewGroup2 != null) {
        }
        if (z) {
        }
        super.n1();
        if (this.I) {
        }
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }
}
