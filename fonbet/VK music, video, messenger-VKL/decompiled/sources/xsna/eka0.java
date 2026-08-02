package xsna;

import android.annotation.SuppressLint;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.voip.dto.call_member.CallMember;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.avatars.VoipAvatarViewContainer;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.picture_in_picture.view.PictureInPictureViewMode;
import com.vk.voip.ui.view.VideoView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.webrtc.layout.VideoDisplayLayout;
import ru.ok.android.webrtc.participant.movie.Movie;
import xsna.el90;
import xsna.i330;
import xsna.wen;
import xsna.xja0;

/* compiled from: PictureInPictureView.kt */
/* loaded from: classes7.dex */
public final class eka0 {
    public final PictureInPictureViewMode a;

    @SuppressLint({"InflateParams"})
    public final ViewGroup b;
    public final SurfaceView c;
    public final VoipAvatarViewContainer d;
    public final VKImageView e;
    public final ImageView f;
    public final TextView g;
    public final TextView h;
    public final View i;
    public final View j;
    public final View k;
    public final View l;
    public final VideoView m;
    public final VideoView n;
    public final io.reactivex.rxjava3.subjects.f<lka0> o;
    public final i330<xja0> p;
    public boolean q;
    public boolean r;
    public final a s;
    public final dfn t;
    public final yen u;
    public final io.reactivex.rxjava3.disposables.b v;

    /* compiled from: PictureInPictureView.kt */
    public final class a implements zoa0 {
        public a() {
        }

        @Override // xsna.wen
        public final wen.a getDisplayLayouts() {
            List g;
            eka0 eka0Var = eka0.this;
            VideoView videoView = eka0Var.m;
            if (eka0Var.q) {
                int width = videoView.getWidth();
                int height = videoView.getHeight();
                if (!eka0Var.r || (width != 0 && height != 0)) {
                    xja0 xja0Var = eka0Var.p.c;
                    boolean z = xja0Var instanceof xja0.a;
                    xja0.a aVar = z ? (xja0.a) xja0Var : null;
                    cjk0 cjk0Var = aVar != null ? aVar.e : null;
                    xja0.a aVar2 = z ? (xja0.a) xja0Var : null;
                    cjk0 cjk0Var2 = aVar2 != null ? aVar2.d : null;
                    if (cjk0Var == null && cjk0Var2 == null) {
                        g = EmptyList.b;
                    } else {
                        ListBuilder e = e43.e();
                        if (cjk0Var != null) {
                            VideoDisplayLayout b = eka0.b(videoView);
                            ConversationVideoTrackParticipantKey c = eka0.c(cjk0Var.a);
                            if (b != null && c != null) {
                                e.add(new ConversationDisplayLayoutItem(c, b));
                            }
                        }
                        if (cjk0Var2 != null) {
                            VideoDisplayLayout b2 = eka0.b(eka0Var.n);
                            ConversationVideoTrackParticipantKey c2 = eka0.c(cjk0Var2.a);
                            if (b2 != null && c2 != null) {
                                e.add(new ConversationDisplayLayoutItem(c2, b2));
                            }
                        }
                        g = e.g();
                    }
                    return new wen.a.b(g);
                }
            }
            return wen.a.C3930a.a;
        }
    }

    public eka0(ContextWrapper contextWrapper, PictureInPictureViewMode pictureInPictureViewMode) {
        this.a = pictureInPictureViewMode;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(contextWrapper).inflate(R.layout.voip_picture_in_picture, (ViewGroup) null, false);
        this.b = viewGroup;
        this.c = (SurfaceView) viewGroup.findViewById(R.id.surface);
        this.d = (VoipAvatarViewContainer) viewGroup.findViewById(R.id.avatar_image);
        VKImageView vKImageView = (VKImageView) viewGroup.findViewById(R.id.avatar_blur);
        this.e = vKImageView;
        this.f = (ImageView) viewGroup.findViewById(R.id.avatar_icon);
        this.g = (TextView) viewGroup.findViewById(R.id.title);
        this.h = (TextView) viewGroup.findViewById(R.id.status);
        this.i = viewGroup.findViewById(R.id.live);
        View findViewById = viewGroup.findViewById(R.id.expand);
        this.j = findViewById;
        View findViewById2 = viewGroup.findViewById(R.id.reject);
        this.k = findViewById2;
        this.l = viewGroup.findViewById(R.id.scrim);
        VideoView videoView = (VideoView) viewGroup.findViewById(R.id.speaker_video);
        this.m = videoView;
        VideoView videoView2 = (VideoView) viewGroup.findViewById(R.id.myself_video);
        this.n = videoView2;
        this.o = new io.reactivex.rxjava3.subjects.f<>();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        arrayList.add(new i330.b(new bod(2), new x2y(this, 27), new kxa((byte) 0, 5)));
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        int i = 0;
        arrayList2.add(new i330.b(gka0.b, new ug8(1, this, eka0.class, "onAvatarChanged", "onAvatarChanged(Lcom/vk/avatar/api/AvatarImageConfig;)V", 0, 12), new pv7((byte) 0, 3)));
        arrayList2.add(new i330.b(hka0.b, new wg8(1, this, eka0.class, "onTitleChanged", "onTitleChanged(Ljava/lang/CharSequence;)V", i, 5), new pv7((byte) 0, 3)));
        arrayList2.add(new i330.b(ika0.b, new qp3(1, this, eka0.class, "onStatusChanged", "onStatusChanged(Ljava/lang/CharSequence;)V", i, 4), new pv7((byte) 0, 3)));
        arrayList2.add(new i330.b(jka0.b, new ic1(1, this, eka0.class, "onBroadcastChanged", "onBroadcastChanged(Z)V", 0, 8), new pv7((byte) 0, 3)));
        arrayList2.add(new i330.b(kka0.b, new gy(1, this, eka0.class, "onMyselfChanged", "onMyselfChanged(Lcom/vk/voip/ui/picture_in_picture/feature/SpeakerInfo;)V", 0, 14), new pv7((byte) 0, 3)));
        arrayList2.add(new i330.b(fka0.b, new ie8(1, this, eka0.class, "onSpeakerChanged", "onSpeakerChanged(Lcom/vk/voip/ui/picture_in_picture/feature/SpeakerInfo;)V", i, 9), new pv7((byte) 0, 3)));
        hashMap.put(fpf0.a(xja0.a.class), new i330(arrayList2, hashMap2));
        i330<xja0> i330Var = new i330<>(arrayList, hashMap);
        this.p = i330Var;
        this.q = true;
        a aVar = new a();
        this.s = aVar;
        com.vk.voip.ui.c.b.getClass();
        ven venVar = com.vk.voip.ui.c.m0;
        this.t = venVar.d;
        yen yenVar = venVar.e;
        this.u = yenVar;
        this.v = new io.reactivex.rxjava3.disposables.b();
        vKImageView.setPostprocessor(new hh7(iah0.a(2), Color.parseColor("#8f000000")));
        videoView.setEnabled(false);
        videoView2.setEnabled(false);
        videoView2.setClipToOutline(true);
        videoView2.setOutlineProvider(new s0w0(iah0.a(8), 6));
        bwt0.i0(findViewById, new bzw(this, 19));
        bwt0.i0(findViewById2, new fv90(this, 4));
        i330Var.b(xja0.b.a);
        bwt0.R(viewGroup, new p3i(this, 2));
        yenVar.a(aVar);
    }

    public static VideoDisplayLayout b(VideoView videoView) {
        int width = videoView.getWidth();
        int height = videoView.getHeight();
        if (width != 0 && height != 0) {
            return new VideoDisplayLayout.Builder().setFit(VideoDisplayLayout.Fit.COVER).setWidth(width).setHeight(height).build();
        }
        L.G("PictureInPictureView", "zero size when creating display layout");
        return null;
    }

    public static ConversationVideoTrackParticipantKey c(CallMemberId callMemberId) {
        GroupCallViewModel.b.getClass();
        kiu b = GroupCallViewModel.b(callMemberId);
        if (b != null) {
            ParticipantId H = mnh0.H(b.a.a);
            Movie movie = (Movie) j5g.a0(b.a.s);
            el90.e eVar = movie == null ? null : new el90.e(H, movie);
            CallMember callMember = b.a;
            el90 el90Var = (el90) j5g.a0(rl3.I(new el90[]{eVar, (!callMember.i || callMember.n) ? null : new el90.b(H), b.a.h ? new el90.a(H) : null, b.a.g ? new el90.d(H) : null}));
            if (el90Var != null) {
                return el90Var.a();
            }
        }
        return null;
    }

    public final void a() {
        if (!this.q) {
            throw new IllegalStateException("Instance is destroyed");
        }
    }
}
