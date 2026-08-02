package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.soloader.MinElf;
import com.vk.channels.impl.donut.ChannelDonutSupportFragment;
import com.vk.clips.design.view.floatingbutton.FloatingButtonView;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridCommonClipsListFragment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.upload.ResumableAttachUploadInfo;
import com.vk.profile.community.suggestions.impl.ui.suggestions.a;
import com.vk.profile.core.scheduled_clips.g;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.o0r0;
import xsna.srr;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ey0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ey0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v105, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        Object parcelable;
        ChatSettings Hb;
        Peer peer;
        boolean z = false;
        switch (this.b) {
            case 0:
                ((com.vk.clips.sdk.shared.item.ads.c) this.c).B.a(AdsItemViewEvent.a.b);
                break;
            case 1:
                com.vk.profile.questions.impl.a aVar = (com.vk.profile.questions.impl.a) this.c;
                int i = com.vk.profile.questions.impl.a.o1;
                break;
            case 2:
                List<fqj0<?>> delegates = ((pb6) this.c).getDelegates();
                hqe0 hqe0Var = new hqe0();
                Iterator<fqj0<?>> it = delegates.iterator();
                while (it.hasNext()) {
                    hqe0Var.y0(it.next());
                }
                break;
            case 3:
                qr6 qr6Var = (qr6) this.c;
                StringBuilder sb = new StringBuilder("UPLOAD_TRACE doUpload: file already prepared, targetFile=");
                ResumableAttachUploadInfo resumableAttachUploadInfo = qr6Var.p;
                sb.append((resumableAttachUploadInfo != null ? resumableAttachUploadInfo : null).l());
                break;
            case 4:
                ikv0 ikv0Var = (ikv0) this.c;
                if (ikv0Var != null) {
                    ikv0Var.a();
                }
                break;
            case 5:
                break;
            case 6:
                s1v s1vVar = ((yqe0) this.c).a;
                break;
            case 7:
                ((bi9) this.c).b.setClipsContentLoadingProgress(1.0f);
                break;
            case 8:
                ((com.vk.cameraui.impl.a) this.c).h.d(StoryPublishEvent.CLOSE_SETTINGS);
                break;
            case 9:
                break;
            case 10:
                ChannelDonutSupportFragment channelDonutSupportFragment = (ChannelDonutSupportFragment) this.c;
                int i2 = ChannelDonutSupportFragment.V;
                Bundle arguments = channelDonutSupportFragment.getArguments();
                if (arguments != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = arguments.getParcelable("owner_id_key", UserId.class);
                        obj = (Parcelable) parcelable;
                    } else {
                        Object parcelable2 = arguments.getParcelable("owner_id_key");
                        obj = (UserId) (parcelable2 instanceof UserId ? parcelable2 : null);
                    }
                    UserId userId = (UserId) obj;
                    if (userId != null) {
                    }
                }
                break;
            case 11:
                x8b x8bVar = (x8b) this.c;
                Dialog Cb = x8bVar.c.Cb();
                if (Cb != null && (Hb = Cb.Hb()) != null && (peer = Hb.d) != null) {
                    Peer peer2 = peer.Ab(Peer.Type.UNKNOWN) ? null : peer;
                    if (peer2 != null) {
                        x8bVar.g.d().m(x8bVar.b, com.vk.dto.common.a.b(peer2), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                    }
                }
                break;
            case 12:
                break;
            case 13:
                tsu tsuVar = ((azb) this.c).k;
                if (tsuVar != null) {
                    xyb xybVar = (xyb) tsuVar.b;
                    if (!hg1.d(xybVar.u)) {
                        xybVar.u = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(xybVar.l.b(xybVar, new lgm(xybVar.q.a.f, true, true, xyb.D)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new mp0(new wl0(xybVar, 15), 7)), new vyb(xybVar, z ? 1 : 0)).subscribe(new f50(new com.vk.movika.sdk.base.logic.interactor.e(xybVar, 16), 11), new lf1(new kf1(xybVar, 14), 9));
                    }
                }
                break;
            case 14:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
                int i3 = ClipFeedListFragment.a2;
                break;
            case 15:
                q0e q0eVar = (q0e) this.c;
                break;
            case 16:
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) this.c;
                int i4 = ClipsFavoriteFolderContentListFragment.W;
                break;
            case 17:
                ClipsGridCommonClipsListFragment clipsGridCommonClipsListFragment = (ClipsGridCommonClipsListFragment) this.c;
                int i5 = ClipsGridCommonClipsListFragment.q0;
                break;
            case 18:
                FloatingButtonView floatingButtonView = (FloatingButtonView) ((xle) this.c).findViewById(R.id.clips_select_music_template);
                floatingButtonView.setMiddle(new srr.a(tq.h(tlo0.Companion, R.string.clips_use_template_button_text)));
                floatingButtonView.setVisibility(4);
                break;
            case 19:
                roe roeVar = (roe) this.c;
                ClipsWrapperInputArguments.a aVar2 = ClipsWrapperInputArguments.r;
                Bundle a = roeVar.a();
                aVar2.getClass();
                break;
            case 20:
                ClipsWrapperInputArguments clipsWrapperInputArguments = (ClipsWrapperInputArguments) this.c;
                ClipsWrapperInputArguments.a aVar3 = ClipsWrapperInputArguments.r;
                Bundle a2 = clipsWrapperInputArguments.a();
                List<ClipFeedTab> c = clipsWrapperInputArguments.c();
                aVar3.getClass();
                break;
            case 21:
                break;
            case 22:
                ((com.vk.profile.core.scheduled_clips.e) this.c).e.a(g.d.a);
                break;
            case 23:
                ((com.vk.profile.community.suggestions.impl.ui.suggestions.g) this.c).c.invoke(a.c.b);
                break;
            case 24:
                q5i q5iVar = (q5i) this.c;
                q5iVar.W6(q5iVar.F);
                break;
            case 25:
                break;
            case 26:
                ((io.reactivex.rxjava3.core.y) this.c).onSuccess(Boolean.FALSE);
                break;
            case 27:
                ((ddj) this.c).f();
                break;
            default:
                ((dz20) ((vjj) this.c).d.getValue()).Ff("ProductsInContentDialog");
                break;
        }
        return s3q0.a;
    }
}
