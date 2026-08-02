package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.channels.impl.channel_screen.profile.ChannelProfileFragment;
import com.vk.channels.impl.donut.a;
import com.vk.clips.viewer.api.routing.models.ClipFeedTransientArgumentsContainer;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridCommonClipsListFragment;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.polls.Poll;
import com.vk.music.attach.AttachMusicActivity;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;
import com.vk.pushes.dto.PushBusinessNotify;
import com.vk.pushes.notifications.im.BusinessNotifyNotification;
import com.vk.stories.design.view.polls.AbstractPollView;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.li7;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class m4 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0265, code lost:
    
        if (r2 > 0.999999f) goto L87;
     */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v74, types: [android.view.ViewGroup, xsna.tod] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        float f;
        io.reactivex.rxjava3.disposables.c cVar;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                n4 n4Var = (n4) obj;
                g7s0.m(fxc0.B(), n4Var.b, n4Var.e.e, o25.a().c(), null, null, 24);
                break;
            case 1:
                AbstractPollView abstractPollView = (AbstractPollView) obj;
                int i2 = AbstractPollView.S;
                bpn0 bpn0Var = csb0.a;
                Poll poll = abstractPollView.getPoll();
                ((ClipboardManager) abstractPollView.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(abstractPollView.getContext().getString(R.string.poll_link), csb0.a(poll.b, poll.c, poll.j)));
                cvk.u(R.string.poll_link_copied, false);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                d12 d12Var = (d12) obj;
                float c = d12Var.e().c(((zak0) d12Var.g).getValue());
                float c2 = d12Var.e().c(d12Var.i.getValue()) - c;
                float abs = Math.abs(c2);
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    f = (d12Var.g() - c) / c2;
                    if (f >= 1.0E-6f) {
                        break;
                    } else {
                        f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                    break;
                }
                f = 1.0f;
                break;
            case 6:
                ((bfm) obj).invoke();
                break;
            case 7:
                ((bq3) obj).f.getCallback();
                break;
            case 8:
                int i3 = AttachMusicActivity.N;
                break;
            case 9:
                break;
            case 10:
                BoardTopicViewFragment boardTopicViewFragment = (BoardTopicViewFragment) obj;
                ((ysg0) boardTopicViewFragment.f0.getValue()).a(new li7.c(boardTopicViewFragment.ro()));
                break;
            case 11:
                BusinessNotifyNotification businessNotifyNotification = (BusinessNotifyNotification) obj;
                CharSequence charSequence = businessNotifyNotification.n;
                if (!gz80.a(28)) {
                    if (!gz80.a(24)) {
                        NotificationCompat.f fVar = new NotificationCompat.f();
                        fVar.b = NotificationCompat.h.d(charSequence);
                        fVar.e = NotificationCompat.h.d(businessNotifyNotification.p);
                        fVar.c = NotificationCompat.h.d(enj.f(R.plurals.notification_business_notify_unread, businessNotifyNotification.D().size(), businessNotifyNotification.c));
                        fVar.d = true;
                        break;
                    } else {
                        List I0 = j5g.I0(25, businessNotifyNotification.D());
                        NotificationCompat.l lVar = new NotificationCompat.l(0);
                        lVar.i = Boolean.TRUE;
                        lVar.h = charSequence;
                        Iterator it = I0.iterator();
                        while (it.hasNext()) {
                            lVar.e(0L, ((PushBusinessNotify) it.next()).d, "");
                        }
                        break;
                    }
                } else {
                    List I02 = j5g.I0(25, businessNotifyNotification.D());
                    String str = o25.a().o().b;
                    j1a0 j1a0Var = new j1a0();
                    j1a0Var.a = str;
                    j1a0Var.b = null;
                    j1a0Var.c = null;
                    j1a0Var.d = null;
                    j1a0Var.e = false;
                    j1a0Var.f = false;
                    bpn0 bpn0Var2 = new bpn0(new v43(4, I02, businessNotifyNotification));
                    NotificationCompat.l lVar2 = new NotificationCompat.l(j1a0Var);
                    Iterator it2 = I02.iterator();
                    while (it2.hasNext()) {
                        lVar2.f(new NotificationCompat.l.d(((PushBusinessNotify) it2.next()).d, 0L, (j1a0) bpn0Var2.getValue()));
                    }
                    break;
                }
            case 12:
                ((com.vk.channels.impl.donut.c) obj).b.invoke(a.c.b);
                break;
            case 13:
                int i4 = ChannelFragment.a1;
                break;
            case 14:
                ChannelProfileFragment channelProfileFragment = (ChannelProfileFragment) obj;
                int i5 = ChannelProfileFragment.e0;
                break;
            case 15:
                tsu tsuVar = ((azb) obj).k;
                if (tsuVar != null && (cVar = ((xyb) tsuVar.b).r) != null) {
                    cVar.dispose();
                }
                break;
            case 16:
                int i6 = ClipFeedListFragment.a2;
                ((exc) obj).invoke();
                break;
            case 17:
                break;
            case 18:
                VkImage vkImage = (VkImage) ((q8d) obj).b().findViewById(R.id.video_single_clip_song_cover);
                if (vkImage != null) {
                    vkImage.setCornerRadius(q8d.p);
                    vkImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    vkImage.setColorFilter(e43.a.getColor(R.color.vk_black_alpha16));
                    break;
                }
                break;
            case 19:
                ((nad) obj).s = !r4.s;
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                int i7 = ClipsGridCommonClipsListFragment.q0;
                ((ClipsGridCommonClipsListFragment) obj).ko().a();
                break;
            case 24:
                ((naf) obj).dismiss();
                break;
            case 25:
                break;
            case 26:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) obj;
                break;
            case 27:
                ClipFeedTransientArgumentsContainer clipFeedTransientArgumentsContainer = (ClipFeedTransientArgumentsContainer) ((ClipsWrapperInputArguments) obj).b.getValue();
                if (clipFeedTransientArgumentsContainer != null) {
                    break;
                }
                break;
            case 28:
                int i8 = com.vk.attachpicker.collages.a.k1;
                ((com.vk.attachpicker.collages.a) obj).hide();
                break;
            default:
                CommentThreadFragment commentThreadFragment = (CommentThreadFragment) obj;
                ArrayList<dl60> arrayList = CommentThreadFragment.y0;
                try {
                    VkTopBar vkTopBar = commentThreadFragment.n0;
                    if (vkTopBar != null) {
                        awt0.q(vkTopBar);
                        s3q0 s3q0Var = s3q0.a;
                    }
                } catch (Throwable unused) {
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ m4(bq3 bq3Var, long j) {
        this.b = 7;
        this.c = bq3Var;
    }
}
