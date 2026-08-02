package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.coauthors.di.ClipsCoauthorsInternalComponent;
import com.vk.clips.design.view.component.description.ClipDescription;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.clips.viewer.api.di.ClipActionsComponent;
import com.vk.clips.viewer.impl.grid.a;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridOwnerClipsListFragment;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.dzenarticle.impl.ui.DzenArticleFragment;
import com.vk.dzenarticle.impl.ui.store.DzenArticleInlineActor;
import com.vk.eduauth.di.ImEduAuthComponent;
import com.vk.im.reporters.api.dialog.OpenChatListReporter;
import com.vk.im.ui.fragments.DialogsFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.messages.chat_invite.accept.ChatInviteFragment;
import ru.ok.android.webrtc.Call;
import xsna.gdn;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h20 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 0;
        int i3 = 1;
        View view = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                return (ViewGroup) ((com.vk.libvideo.design.view.actionlink.a) obj).findViewById(R.id.vkl_action_link_product_landscape);
            case 1:
                ((com.vk.clips.sdk.shared.item.ads.c) obj).B.a(AdsItemViewEvent.e.b);
                return s3q0.a;
            case 2:
                s21.v().a(StoryViewAction.CLICK_DEEPLINK, (StoryEntry) obj);
                return s3q0.a;
            case 3:
                ((ly3) obj).b.clear();
                return s3q0.a;
            case 4:
                ((f15) obj).k.a.invoke(gdn.e.d.b);
                return s3q0.a;
            case 5:
                return ((Call) obj).e();
            case 6:
                return new androidx.lifecycle.m((f5z) ((CatalogBasePaginatedListVh) obj).l.getValue(), true);
            case 7:
                int i4 = ChannelFragment.a1;
                return ((ImEduAuthComponent) m7m.d((ChannelFragment) obj).a(fpf0.a(ImEduAuthComponent.class))).w2();
            case 8:
                return new a6b(((com.vk.channels.impl.channel_screen.send_msg.a) obj).d);
            case 9:
                return (FragmentImpl) ((Fragment) obj);
            case 10:
                ChatInviteFragment.b bVar = ((bsb) obj).o;
                if (bVar != null) {
                    bVar.b();
                }
                return s3q0.a;
            case 11:
                return ((BridgeComponent) ((r4c) obj).a.a(fpf0.a(BridgeComponent.class))).p();
            case 12:
                return new wcl(((mbc) obj).requireContext());
            case 13:
                int i5 = ClipDescription.M;
                return new ndd((ViewGroup) ((ClipDescription) obj).getParent());
            case 14:
                isc iscVar = (isc) obj;
                qcy<Object>[] qcyVarArr = isc.t1;
                fof eo = iscVar.eo();
                iscVar.requireContext();
                return eo.f();
            case 15:
                qcy<Object>[] qcyVarArr2 = wmd.l1;
                return ((ClipsCoauthorsInternalComponent) ((k7m) m7m.f((wmd) obj)).mo408a(fpf0.a(ClipsCoauthorsInternalComponent.class))).Ef();
            case 16:
                return ((View) ((h0e) obj).h.getValue()).findViewById(R.id.video_overlay_view);
            case 17:
                ClipsEntryPointsFragment clipsEntryPointsFragment = (ClipsEntryPointsFragment) obj;
                int i6 = ClipsEntryPointsFragment.i0;
                mzp0 mzp0Var = clipsEntryPointsFragment.J;
                if (mzp0Var != null) {
                    mzp0Var.d(null);
                }
                clipsEntryPointsFragment.On().a();
                return s3q0.a;
            case 18:
                ClipsGridOwnerClipsListFragment.a aVar = new ClipsGridOwnerClipsListFragment.a(ClipsGridOwnerClipsListFragment.class, null, null);
                aVar.j.putBoolean("ClipsGridListFragment.force_dark_theme_for_placeholder", ((a.C0712a) obj).a);
                return aVar.f();
            case 19:
                Object obj2 = ClipsOwnerSwipeFragment.k0;
                ((ViewPager2) obj).setCurrentItem(0);
                return s3q0.a;
            case 20:
                return (zhf0) obj;
            case 21:
                return ((ClipActionsComponent) ((k7m) m7m.f((vvh) obj)).mo408a(fpf0.a(ClipActionsComponent.class))).q5();
            case 22:
                return new p0h((n0i) obj, i3);
            case 23:
                ((x2j) obj).b = null;
                return s3q0.a;
            case 24:
                return ((DialogsFragment) obj).a0.a(OpenChatListReporter.Span.ON_CREATE_VIEW);
            case 25:
                qcy<Object>[] qcyVarArr3 = DzenArticleFragment.R;
                final DzenArticleFragment.c cVar = (DzenArticleFragment.c) ((DzenArticleFragment) obj).N.getValue();
                return new cn50(up2.d(new z3i(cVar, 9), new wb0() { // from class: xsna.bso
                    @Override // xsna.izs
                    /* renamed from: j */
                    public final qj50 invoke(sj50 sj50Var) {
                        return new DzenArticleInlineActor(cVar, sj50Var);
                    }
                }, svj.b));
            case 26:
                ((ysp) obj).k.invoke();
                return s3q0.a;
            case 27:
                err errVar = (err) obj;
                errVar.c = true;
                FrameLayout frameLayout = errVar.b;
                if (frameLayout != null) {
                    while (true) {
                        if (i2 < frameLayout.getChildCount()) {
                            int i7 = i2 + 1;
                            View childAt = frameLayout.getChildAt(i2);
                            if (childAt == null) {
                                throw new IndexOutOfBoundsException();
                            }
                            if (epx.f(childAt.getTag(), err.e)) {
                                view = childAt;
                            } else {
                                i2 = i7;
                            }
                        }
                    }
                    if (view != null) {
                        bwt0.p0(view, true);
                    }
                }
                return s3q0.a;
            case 28:
                return "dialogs list event : " + ((zsm) obj);
            default:
                return ((androidx.compose.runtime.c) obj).i0();
        }
    }
}
