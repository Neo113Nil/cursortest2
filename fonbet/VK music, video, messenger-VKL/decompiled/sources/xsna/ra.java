package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.attachpicker.impl.fragment.StoryFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsSelectorInputParams;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.edit.api.di.ClipViewerEditSdkComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.dynamic_loader.DynamicTask;
import com.vk.dto.common.Source;
import com.vk.dto.common.VideoFile;
import com.vk.feed.design.view.newsfeed.avatar_stack.AvatarAnimatedStack;
import com.vk.feed.design.view.newsfeed.avatar_stack.AvatarAnimatedStack.b;
import com.vk.friends.impl.followers.presentation.fragments.AbsFollowersListFragment;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.profile.community.impl.ui.widget.CommunityWidgetPreviewFragment;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.storycamera.utils.CatalogModalBottomSheetFragment;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.members.VoipDataProvider;
import com.vk.writebar.attach.AttachmentsEditorView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.bo0;
import xsna.ef6.h;
import xsna.g73;
import xsna.gdn;
import xsna.h7u0;
import xsna.nle;
import xsna.pdg0;
import xsna.qr6;
import xsna.u3s;
import xsna.v68.a;
import xsna.zn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ra implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ra(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        EmptyList emptyList;
        wpp wppVar;
        Object obj;
        Object parcelable;
        int i = this.b;
        boolean z = false;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((AbsFollowersListFragment) obj2).S.c(u3s.b.a);
                return s3q0.a;
            case 1:
                return (ViewGroup) ((com.vk.libvideo.design.view.actionlink.a) obj2).findViewById(R.id.vkl_action_link_product_portrait);
            case 2:
                g73 g73Var = (g73) obj2;
                return new eqo(g73Var.a, DynamicTask.APPLOVIN, (g73.b) g73Var.e.getValue(), g73Var.b, g73Var.c);
            case 3:
                com.vk.attachpicker.impl.a aVar = (com.vk.attachpicker.impl.a) obj2;
                aVar.getClass();
                StoryFragment storyFragment = new StoryFragment();
                Bundle bundle = new Bundle();
                bundle.putLong("peer_id", aVar.W);
                storyFragment.setArguments(bundle);
                return storyFragment;
            case 4:
                int i2 = AttachmentsEditorView.C;
                fxc0.B().d((VideoFile) obj2);
                return s3q0.a;
            case 5:
                ((f15) obj2).k.a.invoke(gdn.e.d.b);
                return s3q0.a;
            case 6:
                int i3 = AvatarAnimatedStack.q;
                return ((AvatarAnimatedStack) obj2).new b();
            case 7:
                ((View) obj2).performClick();
                return s3q0.a;
            case 8:
                return ((ef6) obj2).new h();
            case 9:
                ((h7u0.a) obj2).m();
                return s3q0.a;
            case 10:
                qr6.b bVar = (qr6.b) obj2;
                return "UPLOAD_TRACE convertSimple: originFile=" + bVar + ", size=" + bVar.c;
            case 11:
                rjo0 rjo0Var = (rjo0) obj2;
                return Boolean.valueOf(rjo0Var != null ? ((Boolean) new qjo0(rjo0Var, z ? 1 : 0).invoke()).booleanValue() : false);
            case 12:
                return ((v68) obj2).new a();
            case 13:
                Set set = (Set) obj2;
                dhw0 L = com.vk.voip.ui.c.b.L();
                if (L == null) {
                    return new bo0.c(Collections.singleton(zn0.d.a), EmptySet.b);
                }
                Set<CallMemberId> set2 = L.h;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(((CallMemberId) it.next()).b);
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : set) {
                    if (arm0.n((String) obj3) == null) {
                        arrayList.add(obj3);
                    } else {
                        arrayList2.add(obj3);
                    }
                }
                Pair pair = new Pair(arrayList, arrayList2);
                List list = (List) pair.d();
                List list2 = (List) pair.g();
                com.vk.voip.ui.c.b.getClass();
                VoipDataProvider voipDataProvider = com.vk.voip.ui.c.d0;
                if (voipDataProvider == null) {
                    voipDataProvider = null;
                }
                Set S0 = j5g.S0(voipDataProvider.g(list2, true).values());
                VoipDataProvider voipDataProvider2 = com.vk.voip.ui.c.d0;
                if (voipDataProvider2 == null) {
                    voipDataProvider2 = null;
                }
                com.vk.voip.ui.members.a aVar2 = voipDataProvider2.e;
                aVar2.getClass();
                com.vk.im.engine.commands.contacts.a aVar3 = new com.vk.im.engine.commands.contacts.a(Source.CACHE, r3, 14);
                a1w a1wVar = aVar2.a;
                pdg0 n = a1wVar.n(aVar2, aVar3);
                if (n instanceof pdg0.a) {
                    emptyList = EmptyList.b;
                } else {
                    if (!(n instanceof pdg0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    emptyList = ((pdg0.b) n).a;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : emptyList) {
                    qtd0 qtd0Var = (qtd0) obj4;
                    if ((qtd0Var instanceof Contact) && j5g.P(list, ((Contact) qtd0Var).p)) {
                        arrayList3.add(obj4);
                    }
                }
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Long.valueOf(((qtd0) it2.next()).id()));
                }
                pdg0 n2 = a1wVar.n(aVar2, new abj(arrayList4, Source.NETWORK, false, null));
                if (n2 instanceof pdg0.a) {
                    wppVar = new wpp();
                } else {
                    if (!(n2 instanceof pdg0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wppVar = ((pdg0.b) n2).a;
                }
                Collection values = wppVar.c.values();
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = values.iterator();
                while (it3.hasNext()) {
                    whr0 a = aVar2.a((Contact) it3.next());
                    if (a != null) {
                        arrayList5.add(a);
                    }
                }
                LinkedHashSet j = izi0.j(S0, arrayList5);
                ArrayList arrayList6 = new ArrayList();
                el3 el3Var = new el3(0);
                ArrayList arrayList7 = new ArrayList();
                for (Object obj5 : j) {
                    if (linkedHashSet.contains(((whr0) obj5).a)) {
                        arrayList7.add(obj5);
                    }
                }
                if (!arrayList7.isEmpty()) {
                    el3Var.add(new zn0.a(arrayList7));
                }
                Set g = izi0.g(j, arrayList7);
                ArrayList arrayList8 = new ArrayList();
                for (Object obj6 : g) {
                    if (!((whr0) obj6).f) {
                        arrayList8.add(obj6);
                    }
                }
                arrayList6.addAll(izi0.g(g, arrayList8));
                if (!arrayList8.isEmpty()) {
                    el3Var.add(new zn0.f(arrayList8));
                }
                return new bo0.c(el3Var, arrayList6);
            case 14:
                LinearLayout linearLayout = ((com.vk.cameraui.impl.a) obj2).b.S0;
                if (linearLayout != null) {
                    linearLayout.removeAllViews();
                }
                return s3q0.a;
            case 15:
                int i4 = CatalogModalBottomSheetFragment.X;
                return ((CatalogModalBottomSheetFragment.Content) ((CatalogModalBottomSheetFragment) obj2).T.getValue()) == CatalogModalBottomSheetFragment.Content.CLIPS ? new nle() : new nle.a();
            case 16:
                int i5 = ChannelFragment.a1;
                return ((StoryViewerComponent) m7m.d((ChannelFragment) obj2).a(fpf0.a(StoryViewerComponent.class))).tb();
            case 17:
                return new a2e0(new com.vk.movika.sdk.base.logic.processor.actions.g((mbc) obj2, 19));
            case 18:
                qcy<Object>[] qcyVarArr = isc.t1;
                return ((ClipViewerEditSdkComponent) m7m.d((isc) obj2).mo408a(fpf0.a(ClipViewerEditSdkComponent.class))).k();
            case 19:
                int i6 = ClipFeedListFragment.a2;
                return (ClipsViewerComponentImpl) m7m.d((ClipFeedListFragment) obj2).a(fpf0.a(ClipsViewerComponent.class));
            case 20:
                qcy<Object>[] qcyVarArr2 = wmd.l1;
                Bundle requireArguments = ((wmd) obj2).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("input_params", ClipsCoauthorsSelectorInputParams.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("input_params");
                    obj = (ClipsCoauthorsSelectorInputParams) (parcelable2 instanceof ClipsCoauthorsSelectorInputParams ? parcelable2 : null);
                }
                ClipsCoauthorsSelectorInputParams clipsCoauthorsSelectorInputParams = (ClipsCoauthorsSelectorInputParams) obj;
                if (clipsCoauthorsSelectorInputParams != null) {
                    return clipsCoauthorsSelectorInputParams;
                }
                throw new IllegalArgumentException("You must provide input params via bundle. See ClipsPlaylistContentLaunchParams.kt");
            case 21:
                return ((CameraClipsComponent) ((k7m) m7m.f((atd) obj2)).a(fpf0.a(CameraClipsComponent.class))).c4();
            case 22:
                return ((h0e) obj2).b.inflate();
            case 23:
                ((Ref$ObjectRef) obj2).element = null;
                return s3q0.a;
            case 24:
                ((fef) obj2).j();
                return s3q0.a;
            case 25:
                return ((NewsfeedOptionalAdsComponent) ((k7m) m7m.f((vvh) obj2)).mo408a(fpf0.a(NewsfeedOptionalAdsComponent.class))).d5();
            case 26:
                return ((ClipViewerEditSdkComponent) ((n0i) obj2).a.mo408a(fpf0.a(ClipViewerEditSdkComponent.class))).a();
            case 27:
                z1i z1iVar = (z1i) obj2;
                dw20 dw20Var = z1iVar.d;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                z1iVar.d = null;
                return s3q0.a;
            case 28:
                int i7 = CommunityWidgetPreviewFragment.U;
                return ((BridgeComponent) m7m.d((CommunityWidgetPreviewFragment) obj2).a(fpf0.a(BridgeComponent.class))).p().e();
            default:
                return ((Contact) obj2).c.toLowerCase(Locale.ROOT);
        }
    }
}
