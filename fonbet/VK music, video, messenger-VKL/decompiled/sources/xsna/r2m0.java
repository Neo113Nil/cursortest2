package xsna;

import android.view.Window;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.picture.c;
import com.vk.dto.common.Peer;
import com.vk.dto.narratives.HighlightCover;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.stories.design.view.viewer.StoryViewHeader;
import com.vk.story.api.LoadContext;
import com.vk.story.viewer.impl.presentation.stories.view.storyview.a;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class r2m0 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r2m0(Narrative narrative, boolean z, StoryEntry storyEntry, x4m0 x4m0Var) {
        this.d = narrative;
        this.c = z;
        this.e = storyEntry;
        this.f = x4m0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        String e;
        Window window;
        StoryBottomViewGroup storyBottomViewGroup;
        StoryViewHeader storyViewHeader;
        int i2 = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        boolean z = this.c;
        Object obj4 = this.d;
        int i3 = 6;
        switch (i2) {
            case 0:
                com.vk.story.viewer.impl.presentation.stories.view.storyview.b bVar = (com.vk.story.viewer.impl.presentation.stories.view.storyview.b) obj4;
                jzl0 jzl0Var = (jzl0) obj2;
                com.vk.story.viewer.impl.presentation.stories.view.storyview.b bVar2 = jzl0Var.u;
                int intValue = ((Integer) obj).intValue();
                bVar.getClass();
                com.vk.story.viewer.impl.presentation.stories.view.storyview.a aVar = (com.vk.story.viewer.impl.presentation.stories.view.storyview.a) ((ArrayList) obj3).get(intValue);
                if (epx.f(aVar, a.C1838a.a)) {
                    if (z) {
                        nzl0 nzl0Var = jzl0Var.j;
                        (nzl0Var != null ? nzl0Var : null).c();
                    } else {
                        nzl0 nzl0Var2 = jzl0Var.j;
                        (nzl0Var2 != null ? nzl0Var2 : null).h(new w1k0(jzl0Var, 1));
                    }
                    jzl0Var.l(false);
                } else if (aVar instanceof a.b.C1842b) {
                    Narrative narrative = ((a.b.C1842b) aVar).c;
                    nzl0 nzl0Var3 = jzl0Var.j;
                    if (nzl0Var3 == null) {
                        nzl0Var3 = null;
                    }
                    MobileOfficialAppsConStoriesStat$ViewEntryPoint viewEntryPoint = nzl0Var3.getViewEntryPoint();
                    StoryEntry storyEntry = jzl0Var.h;
                    nzl0 nzl0Var4 = jzl0Var.j;
                    if (nzl0Var4 == null) {
                        nzl0Var4 = null;
                    }
                    bVar2.h(false, viewEntryPoint, storyEntry, nzl0Var4.p());
                    nzl0 nzl0Var5 = jzl0Var.j;
                    (nzl0Var5 != null ? nzl0Var5 : null).m(narrative);
                    jzl0Var.l(false);
                } else {
                    if (!(aVar instanceof a.b.InterfaceC1839a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a.b.InterfaceC1839a interfaceC1839a = (a.b.InterfaceC1839a) aVar;
                    StoryEntry storyEntry2 = jzl0Var.h;
                    if (storyEntry2 != null) {
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        xq8 xq8Var = new xq8(8, jzl0Var, new oy30(Collections.singleton(Peer.a.b(interfaceC1839a.getId())), Collections.singletonList(new AttachStory(storyEntry2, 0, null, null, null, null, null, null, 0L, 510, null)), "share"));
                        jzl0Var.w = xq8Var;
                        jzl0Var.v.postDelayed(xq8Var, 4000L);
                        String name = interfaceC1839a instanceof a.b.InterfaceC1839a.d ? ((a.b.InterfaceC1839a.d) interfaceC1839a).c : interfaceC1839a.getName();
                        StoryBottomViewGroup storyBottomViewGroup2 = jzl0Var.a;
                        nzl0 nzl0Var6 = jzl0Var.j;
                        if (nzl0Var6 == null) {
                            nzl0Var6 = null;
                        }
                        MobileOfficialAppsConStoriesStat$ViewEntryPoint viewEntryPoint2 = nzl0Var6.getViewEntryPoint();
                        StoryEntry storyEntry3 = jzl0Var.h;
                        nzl0 nzl0Var7 = jzl0Var.j;
                        if (nzl0Var7 == null) {
                            nzl0Var7 = null;
                        }
                        bVar2.h(true, viewEntryPoint2, storyEntry3, nzl0Var7.p());
                        Window c = pkv0.c(storyBottomViewGroup2.getContext(), null);
                        if (c != null) {
                            ikv0.a aVar2 = new ikv0.a(c.getContext());
                            aVar2.u = new ikv0.d(y8g0.f(R.string.story_message_sent, name), (String) null, (ikv0.d.a) null, 6);
                            aVar2.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, c.getContext().getString(R.string.cancel_request), new pod0(jzl0Var, 11));
                            int i4 = StoryBottomViewGroup.P;
                            aVar2.o = Integer.valueOf(StoryBottomViewGroup.a.a(storyBottomViewGroup2));
                            aVar2.p(c);
                        }
                        jzl0Var.l(false);
                    }
                }
                bVar.c();
                return s3q0.a;
            default:
                Narrative narrative2 = (Narrative) obj4;
                StoryEntry storyEntry4 = (StoryEntry) obj3;
                x4m0 x4m0Var = (x4m0) obj2;
                List<Integer> list = narrative2.l;
                String str = narrative2.d;
                List<Integer> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        if (((Number) it.next()).intValue() == storyEntry4.c) {
                            i = R.string.highlight_one_story_deleted_in_one_highlight_redesign;
                            if (z) {
                                storyEntry4.n0++;
                            } else {
                                storyEntry4.n0--;
                            }
                            String f = y8g0.f(i, str);
                            q7r q7rVar = x4m0Var.d;
                            mkm0 mkm0Var = x4m0Var.c;
                            Serializer.c<Narrative> cVar2 = Narrative.CREATOR;
                            float f2 = 24;
                            int a = iah0.a(f2);
                            HighlightCover highlightCover = narrative2.e;
                            e = highlightCover == null ? highlightCover.e(a) : null;
                            if (e == null) {
                                e = storyEntry4.Ib(iah0.a(f2));
                            }
                            window = mkm0Var.getWindow();
                            if (window != null) {
                                ikv0.a aVar3 = new ikv0.a(bwt0.u(mkm0Var.getContext()));
                                aVar3.u = new ikv0.d(f, (String) null, (ikv0.d.a) null, 6);
                                int i5 = StoryBottomViewGroup.P;
                                aVar3.o = Integer.valueOf(StoryBottomViewGroup.a.a(q7rVar.G));
                                if (e != null) {
                                    aVar3.t = new ikv0.c.e(new c.d(e, null), null, null, 14);
                                }
                                aVar3.p(window);
                            }
                            storyBottomViewGroup = q7rVar.G;
                            if (storyBottomViewGroup != null) {
                                storyBottomViewGroup.B.m(storyEntry4, false);
                            }
                            if (storyEntry4.n0 == 1 || !z) {
                                storyEntry4.p0 = str;
                                storyViewHeader = x4m0Var.d.P;
                                if (storyViewHeader != null) {
                                    storyViewHeader.a(storyEntry4);
                                }
                            } else {
                                x4m0Var.e.b(f1m0.a(storyEntry4.Gb(), LoadContext.Story.b).subscribe(new fl30(new com.vk.movika.sdk.base.ui.s0(28, storyEntry4, x4m0Var), 26), new h4f0(new mp3(29, x4m0Var, storyEntry4), i3)));
                            }
                            return s3q0.a;
                        }
                    }
                }
                i = R.string.highlight_one_story_added_in_one_highlight_redesign;
                if (z) {
                }
                String f3 = y8g0.f(i, str);
                q7r q7rVar2 = x4m0Var.d;
                mkm0 mkm0Var2 = x4m0Var.c;
                Serializer.c<Narrative> cVar22 = Narrative.CREATOR;
                float f22 = 24;
                int a2 = iah0.a(f22);
                HighlightCover highlightCover2 = narrative2.e;
                if (highlightCover2 == null) {
                }
                if (e == null) {
                }
                window = mkm0Var2.getWindow();
                if (window != null) {
                }
                storyBottomViewGroup = q7rVar2.G;
                if (storyBottomViewGroup != null) {
                }
                if (storyEntry4.n0 == 1) {
                }
                storyEntry4.p0 = str;
                storyViewHeader = x4m0Var.d.P;
                if (storyViewHeader != null) {
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ r2m0(com.vk.story.viewer.impl.presentation.stories.view.storyview.b bVar, ArrayList arrayList, jzl0 jzl0Var, boolean z) {
        this.d = bVar;
        this.e = arrayList;
        this.f = jzl0Var;
        this.c = z;
    }
}
