package xsna;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.Attachment;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.tracker.VideoPlayerMode;
import com.vk.media.player.VideoMode;
import com.vk.pending.PendingGraffitiAttachment;
import com.vk.toggle.features.VideoFeatures;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.GraffitiAttachment;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import xsna.fbr0;

/* compiled from: BoardTopicViewFragment.kt */
/* loaded from: classes6.dex */
public final class xi7 implements s0y0, erh0, p7f0 {
    public Object b;

    public /* synthetic */ xi7(Object obj) {
        this.b = obj;
    }

    @Override // xsna.erh0
    public void a() {
        ((jip) this.b).d.invoke();
    }

    public void b(g0a g0aVar) {
        fbr0.a aVar;
        xbc xbcVar = (xbc) this.b;
        xbcVar.f = g0aVar;
        lvf0 k = g0aVar.k();
        if (k != null) {
            k.b(xbcVar.j, 1000L);
        }
        gbr0 gbr0Var = xbcVar.c;
        fbr0 fbr0Var = gbr0Var.b;
        gzs<yg5> gzsVar = fbr0Var.b;
        xbc xbcVar2 = fbr0Var.c;
        d0a b = fbr0Var.b();
        if (b != null) {
            if (xbcVar2 != null) {
                xbcVar2.b(b);
            }
            yg5 invoke = gzsVar.invoke();
            if (invoke != null) {
                invoke.L(VideoMode.CHROMECAST);
            }
            VideoPlayerMode videoPlayerMode = VideoPlayerMode.CHROMECAST;
            yg5 invoke2 = gzsVar.invoke();
            if (invoke2 instanceof VideoAutoPlay) {
                i0q0.j(new tou(5, videoPlayerMode, invoke2));
            }
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_CHROMECAST_IN_HISTORY;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures)) {
                gbr0Var.a();
                yg5 invoke3 = gzsVar.invoke();
                if (invoke3 != null) {
                    aVar = new fbr0.a(invoke3);
                    if (xbcVar2 != null) {
                        xbcVar2.i.add(aVar);
                    }
                } else {
                    aVar = null;
                }
                fbr0Var.e = aVar;
            }
        }
    }

    public void d(g0a g0aVar) {
        xbc xbcVar = (xbc) this.b;
        lvf0 k = g0aVar.k();
        if (k != null) {
            k.u(xbcVar.j);
        }
        gbr0 gbr0Var = xbcVar.c;
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_CHROMECAST_IN_HISTORY;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            gbr0Var.a();
        }
    }

    @Override // xsna.i7f0
    public Object getValue(Object obj, qcy qcyVar) {
        WeakReference weakReference = (WeakReference) this.b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.s0y0
    public boolean i(Attachment attachment) {
        BoardTopicViewFragment boardTopicViewFragment = (BoardTopicViewFragment) this.b;
        if (!(attachment instanceof PendingGraffitiAttachment)) {
            if (!(attachment instanceof GraffitiAttachment)) {
                return false;
            }
            Pattern pattern = BoardTopicViewFragment.H0;
            boardTopicViewFragment.Co("", Collections.singletonList(attachment), false, false);
            return true;
        }
        ju90 ju90Var = (ju90) attachment;
        Pattern pattern2 = BoardTopicViewFragment.H0;
        FragmentActivity activity = boardTopicViewFragment.getActivity();
        if (activity == null) {
            return true;
        }
        ner0 ner0Var = new ner0(activity);
        ner0Var.setMessage(boardTopicViewFragment.getString(R.string.loading));
        ner0Var.setCancelable(true);
        ner0Var.setCanceledOnTouchOutside(false);
        ner0Var.show();
        final ecq0 ecq0Var = new ecq0(ju90Var.S(), new dj7(ner0Var, boardTopicViewFragment));
        final com.vk.upload.impl.b y6 = ju90Var.y6();
        ner0Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: xsna.qi7
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                Pattern pattern3 = BoardTopicViewFragment.H0;
                com.vk.upload.impl.a.b(com.vk.upload.impl.b.this.d, null);
                ecq0 ecq0Var2 = ecq0Var;
                io.reactivex.rxjava3.disposables.c cVar = ecq0Var2.c;
                if (cVar != null) {
                    cVar.dispose();
                    ecq0Var2.c = null;
                }
            }
        });
        ecq0Var.a();
        com.vk.upload.impl.a.i(y6);
        return true;
    }

    @Override // xsna.p7f0
    public void setValue(Object obj, qcy qcyVar, Object obj2) {
        this.b = new WeakReference(obj2);
    }

    @Override // xsna.s0y0
    public void e() {
    }

    @Override // xsna.s0y0
    public void f() {
    }

    @Override // xsna.s0y0
    public void g() {
    }

    @Override // xsna.s0y0
    public void c(List list, List list2) {
    }
}
