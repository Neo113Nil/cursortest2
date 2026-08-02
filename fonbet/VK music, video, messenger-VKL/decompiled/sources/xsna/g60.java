package xsna;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextPaint;
import com.ironsource.C4583ua;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetAudioMetaResponseDto;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.channels.api.Channel;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorPatch;
import com.vk.clips.editor.base.api.ClipsEditorScreen;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.entrypoints.ui.a;
import com.vk.content.design.view.photo.archive.ArchiveSkeletonView;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Thumb;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.im.ui.views.counter.AnimatedCounterView;
import com.vk.log.L;
import com.vk.music.view.ThumbsImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.azb;
import xsna.bh3;
import xsna.cwb0;
import xsna.dd9;
import xsna.dya;
import xsna.eya;
import xsna.gkj;
import xsna.pv3;
import xsna.u8m;
import xsna.xij;
import xsna.xn50;
import xsna.yg8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class g60 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g60(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a0  */
    /* JADX WARN: Type inference failed for: r1v96, types: [xsna.j8i, xsna.smb$a] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        vcb vcbVar;
        vjm vjmVar;
        int i = this.b;
        r4 = null;
        r4 = null;
        Integer num = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                v30 v30Var = ((r60) obj2).a;
                v30Var.getClass();
                break;
            case 1:
                AnimatedCounterView animatedCounterView = (AnimatedCounterView) obj;
                qcy<Object>[] qcyVarArr = AnimatedCounterView.w;
                TextPaint textPaint = new TextPaint(1);
                textPaint.setColor(-1);
                textPaint.setTextSize(((AnimatedCounterView) obj2).getTextSize());
                animatedCounterView.requestLayout();
                animatedCounterView.invalidate();
                break;
            case 2:
                break;
            case 3:
                ((w43) obj2).A();
                break;
            case 4:
                zg3 zg3Var = (zg3) obj2;
                Channel channel = (Channel) obj;
                ListBuilder e = e43.e();
                p4g.a(u8m.d0.b, e, channel.k > 0);
                e.add(u8m.t0.b);
                p4g.a(u8m.c0.b, e, !channel.p);
                zg3Var.m(new bh3.b(channel.b, e.g()));
                break;
            case 5:
                nj3 nj3Var = (nj3) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ArchiveSkeletonView archiveSkeletonView = nj3Var.g;
                ShimmerFrameLayout shimmerFrameLayout = archiveSkeletonView.b;
                bwt0.p0(archiveSkeletonView, booleanValue);
                if (booleanValue) {
                    shimmerFrameLayout.c();
                } else {
                    shimmerFrameLayout.a();
                }
                bwt0.p0(nj3Var.h, !booleanValue);
                break;
            case 6:
                ((ov3) obj2).a(pv3.a.a);
                break;
            case 7:
                ThumbsImageView thumbsImageView = (ThumbsImageView) obj;
                bwt0.p0(thumbsImageView, true);
                Image image = ((nf4) obj2).a;
                thumbsImageView.setThumb(image != null ? new Thumb(image) : null);
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                xg8 xg8Var = (xg8) obj2;
                yg8.a aVar = yg8.a.a;
                if (xg8Var.k) {
                    xg8Var.i.onNext(aVar);
                }
                break;
            case 12:
                ((lj8) obj2).d.setRefreshing(((Boolean) obj).booleanValue());
                break;
            case 13:
                y6u0 y6u0Var = ((tr8) obj2).E;
                y6u0Var.b.setBackgroundColor(y6u0Var.m);
                y6u0Var.f.setTextColor(y6u0Var.k);
                y6u0Var.g.setColorFilter(y6u0Var.l);
                y6u0Var.h.setVisibility(0);
                break;
            case 14:
                ((hd9) obj2).e.onNext((dd9.a) obj);
                break;
            case 15:
                ShortVideoGetAudioMetaResponseDto shortVideoGetAudioMetaResponseDto = (ShortVideoGetAudioMetaResponseDto) obj;
                ((amc) ((bi9) obj2).f.getValue()).getClass();
                String url = shortVideoGetAudioMetaResponseDto.getUrl();
                if (url == null) {
                    url = "";
                }
                List<Integer> e2 = shortVideoGetAudioMetaResponseDto.e();
                if (e2 == null) {
                    e2 = EmptyList.b;
                }
                Integer d = shortVideoGetAudioMetaResponseDto.d();
                break;
            case 16:
                tw9 tw9Var = (tw9) obj2;
                UserId q = ((ay00) obj).q();
                if (q != null) {
                    gkj.d dVar = tw9Var.a;
                    if (dVar != null) {
                        gkj gkjVar = gkj.this;
                        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = gkjVar.b;
                        ArrayList u0 = j5g.u0(((mkj) sj50Var.getCurrentState()).d, ((mkj) sj50Var.getCurrentState()).c);
                        ArrayList arrayList = new ArrayList();
                        Iterator it = u0.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (Math.abs(((hpd0) next).b.b) == Math.abs(q.b)) {
                                arrayList.add(next);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            gkjVar.p(new xij.g((hpd0) it2.next()));
                        }
                    }
                    break;
                } else {
                    break;
                }
            case 17:
                break;
            case 18:
                kea keaVar = (kea) obj2;
                qk qkVar = keaVar.I;
                if (qkVar != null) {
                    qkVar.invoke();
                }
                UIBlockList uIBlockList = keaVar.l;
                if (uIBlockList != null && (str = uIBlockList.M) != null) {
                    jge0 jge0Var = keaVar.P;
                    jge0Var.c = str;
                    jge0Var.b = Long.valueOf(SystemClock.elapsedRealtime());
                }
                break;
            case 19:
                uwa uwaVar = (uwa) obj2;
                swa swaVar = uwaVar.n;
                if (swaVar != null) {
                    uwaVar.l.o(swaVar);
                }
                break;
            case 20:
                yxa yxaVar = (yxa) obj2;
                Throwable th = (Throwable) obj;
                yxaVar.i.b(dya.a.a);
                yxaVar.T(new eya.b(th));
                L.i(th);
                break;
            case 21:
                break;
            case 22:
                xcb xcbVar = (xcb) obj2;
                xgl0 xgl0Var = (xgl0) obj;
                uib a = xgl0Var.a();
                Integer num2 = xcbVar.e;
                w2w w2wVar = xcbVar.c;
                long j = xcbVar.g;
                Integer num3 = xcbVar.d;
                if (num3 != null && num2 != null) {
                    a.x(j, new vcb(num3.intValue(), num2.intValue(), j));
                } else if (num3 != null) {
                    a.U(num3.intValue(), j);
                } else if (num2 != null) {
                    a.V(num2.intValue(), j);
                }
                uib a2 = w2wVar.I0().a();
                bdb c = a2.c(j);
                if (num3 != null) {
                    if (c != null && (vcbVar = c.j) != null && (vjmVar = vcbVar.b) != null) {
                        num = Integer.valueOf(vjmVar.b);
                    }
                    if (epx.f(num, num3)) {
                        a2.R(j);
                        boolean n = w2wVar.getExperiments().n();
                        List singletonList = Collections.singletonList(Long.valueOf(j));
                        break;
                    }
                }
                if (num2 != null) {
                    a2.j(num2.intValue(), j);
                }
                boolean n2 = w2wVar.getExperiments().n();
                List singletonList2 = Collections.singletonList(Long.valueOf(j));
                break;
            case 23:
                ?? r1 = ((smb) obj2).c;
                if (r1 != 0) {
                    r1.I(AvatarAction.CHANGE_BY_GALLERY);
                }
                break;
            case 24:
                azb azbVar = (azb) obj2;
                AvatarAction avatarAction = (AvatarAction) obj;
                if (azb.b.$EnumSwitchMapping$0[avatarAction.ordinal()] == 1) {
                    bzb0.d(azbVar.a(), cwb0.h.l, new eb(azbVar, 11), null, null, 28);
                } else {
                    tsu tsuVar = azbVar.k;
                    if (tsuVar != null) {
                        tsuVar.g(avatarAction);
                    }
                }
                break;
            case 25:
                u2d u2dVar = ((com.vk.clips.sdk.shared.item.clip.b) obj2).e;
                u2dVar.getClass();
                break;
            case 26:
                ((bnd) obj2).T(ClipsCoauthorsSelectorPatch.a.C0554a.b);
                break;
            case 27:
                rwd rwdVar = (rwd) obj2;
                rwdVar.e.k();
                rwdVar.d.b(ClipsEditorScreen.State.VIDEO_CROPPER, null);
                break;
            case 28:
                ClipsEditorMusicTrack clipsEditorMusicTrack = (ClipsEditorMusicTrack) obj2;
                w9y w9yVar = (w9y) obj;
                w9yVar.c(Integer.valueOf(clipsEditorMusicTrack.b), C4583ua.b);
                w9yVar.d(Long.valueOf(clipsEditorMusicTrack.c.b), "owner_id");
                w9yVar.e(clipsEditorMusicTrack.d, "title");
                w9yVar.c(Integer.valueOf(clipsEditorMusicTrack.e), "duration");
                w9yVar.e(clipsEditorMusicTrack.f, "artist");
                w9yVar.e(clipsEditorMusicTrack.g, "url");
                w9yVar.e(clipsEditorMusicTrack.h, "track_code");
                Uri uri = clipsEditorMusicTrack.i;
                w9yVar.e(uri != null ? uri.toString() : null, "thumb");
                w9yVar.b(Boolean.valueOf(clipsEditorMusicTrack.j), "can_download");
                w9yVar.e(clipsEditorMusicTrack.k, "original_sound_video_id");
                break;
            default:
                ClipsEntryPointsFragment clipsEntryPointsFragment = (ClipsEntryPointsFragment) obj2;
                int i2 = ClipsEntryPointsFragment.i0;
                clipsEntryPointsFragment.getClass();
                xn50.a.c(clipsEntryPointsFragment, new a.i(EmptyList.b));
                break;
        }
        return s3q0.a;
    }
}
