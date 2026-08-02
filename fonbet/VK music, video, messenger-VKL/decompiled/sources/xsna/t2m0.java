package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Peer;
import com.vk.dto.narratives.HighlightCover;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.story.viewer.impl.presentation.stories.view.storyview.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.base.version_info.VersionConstants;
import xsna.amq;
import xsna.xlq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class t2m0 implements izs {
    public final /* synthetic */ com.vk.story.viewer.impl.presentation.stories.view.storyview.b b;
    public final /* synthetic */ View c;
    public final /* synthetic */ jzl0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ StoryEntry f;

    public /* synthetic */ t2m0(com.vk.story.viewer.impl.presentation.stories.view.storyview.b bVar, View view, jzl0 jzl0Var, boolean z, StoryEntry storyEntry) {
        this.b = bVar;
        this.c = view;
        this.d = jzl0Var;
        this.e = z;
        this.f = storyEntry;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        StoryBottomViewGroup storyBottomViewGroup;
        int i;
        Iterator it;
        xlq bVar;
        Drawable drawable;
        Dialog x2;
        boolean z;
        List list = (List) obj;
        com.vk.story.viewer.impl.presentation.stories.view.storyview.b bVar2 = this.b;
        StoryBottomViewGroup storyBottomViewGroup2 = bVar2.a;
        boolean isEmpty = list.isEmpty();
        View view = this.c;
        if (isEmpty) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
            bVar2.f();
        } else {
            a.C1838a c1838a = a.C1838a.a;
            ArrayList v0 = j5g.v0(c1838a, list);
            int i2 = this.f.c;
            ArrayList arrayList = new ArrayList(c5g.u(v0, 10));
            Iterator it2 = v0.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    e43.t();
                    throw null;
                }
                com.vk.story.viewer.impl.presentation.stories.view.storyview.a aVar = (com.vk.story.viewer.impl.presentation.stories.view.storyview.a) next;
                if (aVar instanceof a.b.C1842b) {
                    a.b.C1842b c1842b = (a.b.C1842b) aVar;
                    String str = c1842b.a;
                    Narrative narrative = c1842b.c;
                    HighlightCover highlightCover = narrative.e;
                    String f = highlightCover != null ? highlightCover.f() : null;
                    List<Integer> list2 = narrative.l;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            if (i2 == ((Number) it3.next()).intValue()) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    bVar = new xlq.a(i3, str, f, z);
                    storyBottomViewGroup = storyBottomViewGroup2;
                    i = i2;
                    it = it2;
                } else if (aVar instanceof a.b) {
                    a.b bVar3 = (a.b) aVar;
                    String name = bVar3.getName();
                    String a = bVar3.a();
                    if (drm0.N(bVar3.a())) {
                        Context context = storyBottomViewGroup2.getContext();
                        storyBottomViewGroup = storyBottomViewGroup2;
                        a.b.InterfaceC1839a interfaceC1839a = bVar3 instanceof a.b.InterfaceC1839a ? (a.b.InterfaceC1839a) bVar3 : null;
                        if (interfaceC1839a == null || (x2 = interfaceC1839a.x2()) == null) {
                            i = i2;
                        } else {
                            i = i2;
                            if (x2.Jc()) {
                                it = it2;
                                drawable = new qmm(iah0.a(40));
                            }
                        }
                        it = it2;
                        com.vk.im.ui.views.avatars.a aVar2 = new com.vk.im.ui.views.avatars.a(context, null, 6);
                        aVar2.setTint(context.getColor(R.color.vk_gray_850));
                        aVar2.c(bVar3.getName(), Peer.Type.CONTACT);
                        drawable = aVar2;
                    } else {
                        storyBottomViewGroup = storyBottomViewGroup2;
                        i = i2;
                        it = it2;
                        drawable = null;
                    }
                    bVar = new xlq.c(i3, name, a, drawable);
                } else {
                    storyBottomViewGroup = storyBottomViewGroup2;
                    i = i2;
                    it = it2;
                    if (!epx.f(aVar, c1838a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = new xlq.b(i3, storyBottomViewGroup.getContext().getString(R.string.more));
                }
                arrayList.add(bVar);
                i3 = i4;
                it2 = it;
                storyBottomViewGroup2 = storyBottomViewGroup;
                i2 = i;
            }
            StoryBottomViewGroup storyBottomViewGroup3 = storyBottomViewGroup2;
            Context context2 = storyBottomViewGroup3.getContext();
            View rootView = storyBottomViewGroup3.getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup != null) {
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(android.R.id.content);
                ViewGroup viewGroup3 = viewGroup2 == null ? viewGroup : viewGroup2;
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                frameLayout.setClickable(true);
                frameLayout.setFocusable(true);
                frameLayout.setOnClickListener(new l44(bVar2, 12));
                frameLayout.setBackground(null);
                bVar2.c = frameLayout;
                zlq zlqVar = new zlq(context2);
                zlqVar.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                zlqVar.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                zlqVar.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                zlqVar.setLayoutParams(new FrameLayout.LayoutParams(-2, iah0.a(VersionConstants.PRODUCT_MAJOR_VERSION)));
                bVar2.b = zlqVar;
                frameLayout.addView(zlqVar);
                viewGroup3.addView(frameLayout);
                if (!zlqVar.isLaidOut() || zlqVar.isLayoutRequested()) {
                    zlqVar.addOnLayoutChangeListener(new u2m0(bVar2, view, zlqVar, viewGroup3, frameLayout));
                } else {
                    com.vk.story.viewer.impl.presentation.stories.view.storyview.b.a(bVar2, view, zlqVar, viewGroup3);
                    com.vk.story.viewer.impl.presentation.stories.view.storyview.b.b(bVar2, zlqVar, frameLayout);
                }
            }
            jzl0 jzl0Var = this.d;
            bVar2.e = new q2m0(0, view, jzl0Var);
            zlq zlqVar2 = bVar2.b;
            if (zlqVar2 != null) {
                zlqVar2.setState(new amq.b(arrayList));
                zlqVar2.setOnSuccess(new r2m0(bVar2, v0, jzl0Var, this.e));
                zlqVar2.setOnCancel(new wt30(bVar2, 23));
            }
            jzl0Var.l(true);
        }
        return s3q0.a;
    }
}
