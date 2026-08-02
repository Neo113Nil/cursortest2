package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import xsna.o1i;
import xsna.ybh;

/* compiled from: CommunityProfileLegoNavigationSideEffectDelegate.kt */
/* loaded from: classes5.dex */
public final class cqh {
    public final com.vk.profile.community.impl.ui.profile.c a;
    public final CommunityProfileFragment b;
    public final orh c;

    public cqh(com.vk.profile.community.impl.ui.profile.c cVar, CommunityProfileFragment communityProfileFragment, orh orhVar) {
        this.a = cVar;
        this.b = communityProfileFragment;
        this.c = orhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(d.j.y yVar) {
        ListBuilder g;
        View view;
        View view2;
        VkContextMenu l;
        String str;
        com.vk.profile.community.impl.ui.profile.c cVar = this.a;
        ynh ynhVar = cVar.d;
        CommunityProfileFragment communityProfileFragment = cVar.a;
        com.vk.profile.community.impl.ui.profile.b bVar = cVar.e;
        if (yVar instanceof d.j.y.c) {
            d.j.y.c cVar2 = (d.j.y.c) yVar;
            if (!(cVar2 instanceof d.j.y.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            d.j.y.c.a aVar = (d.j.y.c.a) cVar2;
            ExtendedCommunityProfile extendedCommunityProfile = aVar.a;
            int i = aVar.b;
            if (bwd0.c(extendedCommunityProfile)) {
                return;
            }
            bVar.f.b.a(communityProfileFragment.requireContext(), extendedCommunityProfile, i);
            return;
        }
        String str2 = "without_cover";
        if (yVar instanceof d.j.y.a) {
            d.j.y.a aVar2 = (d.j.y.a) yVar;
            if (aVar2 instanceof d.j.y.a.C1605a) {
                d.j.y.a.C1605a c1605a = (d.j.y.a.C1605a) aVar2;
                cVar.c(c1605a.a).n(c1605a.c, c1605a.b);
                return;
            }
            if (aVar2 instanceof d.j.y.a.b) {
                d.j.y.a.b bVar2 = (d.j.y.a.b) aVar2;
                View view3 = bVar2.b;
                Rect rect = bVar2.c;
                d3h c = cVar.c(bVar2.a);
                lbh.a(c.b, c, new o1i.a.InterfaceC3433a.C3434a(rect, view3));
                return;
            }
            if (!(aVar2 instanceof d.j.y.a.e)) {
                if (aVar2 instanceof d.j.y.a.c) {
                    cVar.h(((d.j.y.a.c) aVar2).a);
                    return;
                } else {
                    if (!(aVar2 instanceof d.j.y.a.C1606d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.j(((d.j.y.a.C1606d) aVar2).a);
                    return;
                }
            }
            d.j.y.a.e eVar = (d.j.y.a.e) aVar2;
            View view4 = eVar.b;
            Rect rect2 = eVar.c;
            ExtendedCommunityProfile extendedCommunityProfile2 = eVar.a;
            d3h c2 = cVar.c(extendedCommunityProfile2);
            ArrayList<StoriesContainer> arrayList = extendedCommunityProfile2.d2;
            if (arrayList != null && !arrayList.isEmpty()) {
                str2 = bVar.f.f.b != null ? "opened_live_cover" : "live_cover";
            }
            c2.e(view4, str2, rect2);
            return;
        }
        if (yVar instanceof d.j.y.b) {
            d.j.y.b bVar3 = (d.j.y.b) yVar;
            if (bVar3 instanceof d.j.y.b.g) {
                cVar.j(((d.j.y.b.g) bVar3).a);
                return;
            }
            if (bVar3 instanceof d.j.y.b.f) {
                cVar.g(((d.j.y.b.f) bVar3).a);
                return;
            }
            if (bVar3 instanceof d.j.y.b.C1607b) {
                UserId userId = ((d.j.y.b.C1607b) bVar3).a;
                rmh rmhVar = (rmh) ynhVar.D0.getValue();
                rmhVar.b.a().c(rmhVar.a, new z63(rmhVar, userId, "onboarding_2025", 5));
                return;
            }
            if (bVar3 instanceof d.j.y.b.a) {
                cVar.a(((d.j.y.b.a) bVar3).a);
                return;
            }
            if (bVar3 instanceof d.j.y.b.c) {
                d.j.y.b.c cVar3 = (d.j.y.b.c) bVar3;
                View view5 = cVar3.b;
                Rect rect3 = cVar3.c;
                ExtendedCommunityProfile extendedCommunityProfile3 = cVar3.a;
                d3h c3 = cVar.c(extendedCommunityProfile3);
                ArrayList<StoriesContainer> arrayList2 = extendedCommunityProfile3.d2;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    str2 = bVar.f.f.b != null ? "opened_live_cover" : "live_cover";
                }
                c3.e(view5, str2, rect3);
                return;
            }
            if (bVar3 instanceof d.j.y.b.C1608d) {
                String str3 = ((d.j.y.b.C1608d) bVar3).a;
                Context mo2getContext = communityProfileFragment.mo2getContext();
                if (mo2getContext == null) {
                    return;
                }
                wk40.d(((fl4) ynhVar.y0.getValue()).g(), mo2getContext, str3, null, MusicPlaybackLaunchContext.l.t(), null, 48);
                return;
            }
            if (!(bVar3 instanceof d.j.y.b.e)) {
                throw new NoWhenBranchMatchedException();
            }
            String str4 = ((d.j.y.b.e) bVar3).a;
            Context mo2getContext2 = communityProfileFragment.mo2getContext();
            if (mo2getContext2 == null) {
                return;
            }
            ((gd60) ynhVar.z0.getValue()).s1(mo2getContext2, str4, MusicPlaybackLaunchContext.l.t());
            return;
        }
        if (!(yVar instanceof d.j.y.AbstractC1609d)) {
            throw new NoWhenBranchMatchedException();
        }
        d.j.y.AbstractC1609d abstractC1609d = (d.j.y.AbstractC1609d) yVar;
        if (abstractC1609d instanceof d.j.y.AbstractC1609d.a) {
            this.c.invoke(Boolean.valueOf(((d.j.y.AbstractC1609d.a) abstractC1609d).a));
            return;
        }
        boolean z = abstractC1609d instanceof d.j.y.AbstractC1609d.c;
        CommunityProfileFragment communityProfileFragment2 = this.b;
        if (!z) {
            if (!(abstractC1609d instanceof d.j.y.AbstractC1609d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            d.j.y.AbstractC1609d.b bVar4 = (d.j.y.AbstractC1609d.b) abstractC1609d;
            ExtendedCommunityProfile extendedCommunityProfile4 = bVar4.a;
            Rect rect4 = bVar4.b;
            View k = cVar.k(communityProfileFragment2);
            if (k == null) {
                return;
            }
            srh srhVar = new srh(cVar.b(extendedCommunityProfile4, communityProfileFragment2));
            if (rect4.width() <= 0 || rect4.height() <= 0) {
                return;
            }
            Context context = k.getContext();
            ListBuilder e = e43.e();
            String string = context.getString(extendedCommunityProfile4.j1 ? R.string.community_notify_posts_off : R.string.community_notify_posts_on);
            abg0 abg0Var = dhr0.t;
            e.add(new VkContextMenu.a(string, abg0Var.b(R.drawable.vk_icon_lego_text_rectangle_outline_24, R.attr.vk_ui_icon_primary), null, false, false, new dne(srhVar, 7), 28));
            if (extendedCommunityProfile4.h1 && !extendedCommunityProfile4.g() && (extendedCommunityProfile4.k1 == null || extendedCommunityProfile4.i1)) {
                e.add(new VkContextMenu.a(context.getString(extendedCommunityProfile4.i1 ? R.string.group_video_live_notify_off : R.string.group_video_live_notify_on), abg0Var.b(R.drawable.vk_icon_lego_live_outline_24, R.attr.vk_ui_icon_primary), null, false, false, new h9(srhVar, 27), 28));
            }
            ListBuilder g2 = e.g();
            if (g2.isEmpty()) {
                return;
            }
            int l2 = krv0.l(R.attr.vk_ui_icon_accent);
            k.getContext();
            e.c cVar4 = new e.c(null, rect4, k, l2, 1);
            cVar4.h(g2);
            cVar4.m = cn70.b(4);
            cVar4.l(false);
            return;
        }
        d.j.y.AbstractC1609d.c cVar5 = (d.j.y.AbstractC1609d.c) abstractC1609d;
        ExtendedCommunityProfile extendedCommunityProfile5 = cVar5.a;
        Rect rect5 = cVar5.b;
        View k2 = cVar.k(communityProfileFragment2);
        if (k2 == null) {
            return;
        }
        o1i b = cVar.b(extendedCommunityProfile5, communityProfileFragment2);
        if (rect5.width() <= 0 || rect5.height() <= 0) {
            return;
        }
        if (w2h.b(extendedCommunityProfile5)) {
            ListBuilder e2 = e43.e();
            e2.add(ybh.f.d);
            p4g.a(new ybh.c(extendedCommunityProfile5.l), e2, !bwd0.f(extendedCommunityProfile5));
            e2.add(ybh.i.d);
            p4g.a(ybh.d.d, e2, !extendedCommunityProfile5.g() && (extendedCommunityProfile5.Z == 0 || extendedCommunityProfile5.a0 >= 1));
            e2.add(ybh.b.d);
            e2.add(ybh.g.d);
            p4g.a(ybh.k.d, e2, w2h.a(extendedCommunityProfile5));
            p4g.a(new ybh.a(extendedCommunityProfile5.c2), e2, extendedCommunityProfile5.e0);
            ybh.e eVar2 = ybh.e.d;
            int i2 = extendedCommunityProfile5.a1;
            p4g.a(eVar2, e2, i2 == 1 || i2 == 2);
            p4g.a(ybh.h.d, e2, extendedCommunityProfile5.m2);
            g = e2.g();
        } else {
            ListBuilder e3 = e43.e();
            p4g.a(new ybh.c(extendedCommunityProfile5.l), e3, !bwd0.f(extendedCommunityProfile5));
            e3.add(ybh.i.d);
            p4g.a(ybh.d.d, e3, !extendedCommunityProfile5.g() && (extendedCommunityProfile5.Z == 0 || extendedCommunityProfile5.a0 >= 1));
            e3.add(ybh.b.d);
            e3.add(ybh.g.d);
            p4g.a(new ybh.a(extendedCommunityProfile5.c2), e3, extendedCommunityProfile5.e0);
            p4g.a(ybh.j.d, e3, extendedCommunityProfile5.p2);
            ybh.e eVar3 = ybh.e.d;
            int i3 = extendedCommunityProfile5.a1;
            p4g.a(eVar3, e3, i3 == 1 || i3 == 2);
            p4g.a(ybh.h.d, e3, extendedCommunityProfile5.m2);
            g = e3.g();
        }
        if (g.isEmpty()) {
            return;
        }
        Context context2 = k2.getContext();
        int c4 = dhr0.t.c(R.attr.vk_ui_text_negative);
        ArrayList arrayList3 = new ArrayList(c5g.u(g, 10));
        ListIterator listIterator = g.listIterator(0);
        while (true) {
            ListBuilder.a aVar3 = (ListBuilder.a) listIterator;
            Integer num = null;
            if (!aVar3.hasNext()) {
                break;
            }
            ybh ybhVar = (ybh) aVar3.next();
            int i4 = ybhVar.a;
            boolean z2 = ybhVar.c;
            String string2 = context2.getString(i4);
            if (z2) {
                SpannableString spannableString = new SpannableString(string2);
                spannableString.setSpan(new ForegroundColorSpan(c4), 0, spannableString.length(), 33);
                str = spannableString;
            } else {
                str = string2;
            }
            int i5 = z2 ? R.attr.vk_ui_icon_negative : R.attr.vk_ui_icon_primary;
            Integer num2 = ybhVar.b;
            baf0 b2 = num2 != null ? dhr0.t.b(num2.intValue(), i5) : null;
            if (z2) {
                num = Integer.valueOf(c4);
            }
            arrayList3.add(new VkContextMenu.a(str, b2, num, false, false, new com.vk.movika.tools.controls.seekbar.f(4, ybhVar, b), 24));
        }
        ViewParent parent = k2.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            view = null;
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationInWindow(iArr);
            int width = rect5.width();
            if (width < 1) {
                width = 1;
            }
            int height = rect5.height();
            if (height < 1) {
                height = 1;
            }
            int i6 = rect5.left - iArr[0];
            int i7 = rect5.top - iArr[1];
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(width, height);
            marginLayoutParams.leftMargin = i6;
            marginLayoutParams.topMargin = i7;
            View view6 = new View(k2.getContext());
            view6.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view6.setImportantForAccessibility(2);
            viewGroup.addView(view6, marginLayoutParams);
            view6.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
            view6.layout(i6, i7, width + i6, height + i7);
            view = view6;
        }
        if (view != null) {
            int l3 = krv0.l(R.attr.vk_ui_icon_accent);
            view.getContext();
            e.b bVar5 = new e.b(view, null, null, l3, 6);
            view2 = view;
            bVar5.w = R.layout.ds_internal_context_menu_item;
            bVar5.h(arrayList3);
            bVar5.m = cn70.b(4);
            l = bVar5.l(false);
        } else {
            view2 = view;
            int[] iArr2 = new int[2];
            k2.getLocationInWindow(iArr2);
            int i8 = rect5.left;
            int i9 = iArr2[0];
            int i10 = rect5.top;
            int i11 = iArr2[1];
            Rect rect6 = new Rect(i8 - i9, i10 - i11, rect5.right - i9, rect5.bottom - i11);
            int l4 = krv0.l(R.attr.vk_ui_icon_accent);
            k2.getContext();
            e.c cVar6 = new e.c(null, rect6, k2, l4, 1);
            cVar6.h(arrayList3);
            cVar6.m = cn70.b(4);
            l = cVar6.l(false);
        }
        if (view2 != null) {
            l.e(new xbh(view2, 0));
        }
        Pair pair = new Pair(l, view2);
        VkContextMenu vkContextMenu = (VkContextMenu) pair.d();
        View view7 = (View) pair.g();
        if (vkContextMenu.c()) {
            return;
        }
        ViewParent parent2 = view7 != null ? view7.getParent() : null;
        ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? parent2 : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(view7);
        }
    }
}
