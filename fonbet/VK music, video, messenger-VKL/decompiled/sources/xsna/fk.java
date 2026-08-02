package xsna;

import android.content.Context;
import android.os.Trace;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.p002short.ClipListView;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.MusicTrack;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vk.media.pipeline.model.timeline.VideoFragment;
import com.vk.newsfeed.impl.posting.profilefriendslists.holders.ProfileFriendsListHeaderVh;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.OneVideoPlayer;
import xsna.rqh0;
import xsna.vx70;
import xsna.wqs0;
import xsna.zlh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class fk implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fk(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction invoke$lambda$34;
        boolean z = false;
        int i = 1;
        switch (this.b) {
            case 0:
                return new SimpleDateFormat(((Context) this.c).getString(R.string.vkim_accessability_time_yesterday), ((gk) this.d).f);
            case 1:
                return ((l0h0) this.c).b(((VideoFragment) this.d).b);
            case 2:
                hna hnaVar = (hna) this.c;
                etv0 etv0Var = (etv0) this.d;
                hnaVar.c.invoke();
                etv0Var.b(false);
                return s3q0.a;
            case 3:
                ((izs) this.c).invoke(new ClipListView.b.a(((ClipListView.c) this.d).b));
                return s3q0.a;
            case 4:
                return fpj.d((View) this.d, (fpj) this.c);
            case 5:
                ((eqo) this.c).d((hqo) this.d);
                return s3q0.a;
            case 6:
                k5q k5qVar = (k5q) this.c;
                MusicTrack musicTrack = (MusicTrack) this.d;
                k5qVar.i();
                k5qVar.a = musicTrack;
                return s3q0.a;
            case 7:
                one.video.player.j jVar = (one.video.player.j) this.c;
                OneVideoPlayer oneVideoPlayer = (OneVideoPlayer) this.d;
                Iterator<OneVideoPlayer.c> it = jVar.b.iterator();
                while (it.hasNext()) {
                    it.next().j(oneVideoPlayer);
                }
                return s3q0.a;
            case 8:
                invoke$lambda$34 = HandleInvocationsFromAdViewer.invoke$lambda$34((HandleInvocationsFromAdViewer) this.c, (AdObject) this.d);
                return invoke$lambda$34;
            case 9:
                return "IM_ITEMS_LOADER ImItemWeightDb getWeightsByIds\nids -> " + j5g.g0((Collection) this.c, ", ", null, null, 0, null, 62) + "\n " + j5g.g0(((HashMap) this.d).values(), "\n", null, null, 0, new v4v(i), 30);
            case 10:
                kj20 kj20Var = (kj20) this.c;
                gy70 gy70Var = (gy70) this.d;
                vx70.a d = kj20Var.b.d(gy70Var);
                kj20Var.c(d.b(), gy70Var);
                return d;
            case 11:
                ((com.vk.im.ui.components.msg_list.c) this.c).m(new rlh((vl30) this.d, 26));
                return s3q0.a;
            case 12:
                wzs wzsVar = (wzs) this.c;
                View view = (View) this.d;
                wzsVar.invoke(Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()));
                return s3q0.a;
            case 13:
                mc90 mc90Var = (mc90) this.c;
                yvj yvjVar = (yvj) this.d;
                if (mc90Var.e()) {
                    myc0.h(yvjVar, null, null, new lb90(mc90Var, null), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                ProfileFriendsListHeaderVh profileFriendsListHeaderVh = (ProfileFriendsListHeaderVh) this.c;
                ProfileFriendsListHeaderVh.ClearButtonType clearButtonType = (ProfileFriendsListHeaderVh.ClearButtonType) this.d;
                ProfileFriendsListHeaderVh.a aVar = profileFriendsListHeaderVh.l;
                int i2 = ProfileFriendsListHeaderVh.b.$EnumSwitchMapping$0[clearButtonType.ordinal()];
                if (i2 == 1) {
                    aVar.b1();
                } else if (i2 == 2) {
                    aVar.U0();
                } else if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 15:
                s6s0 s6s0Var = (s6s0) this.c;
                y6s0 y6s0Var = (y6s0) this.d;
                VideoFile videoFile = s6s0Var.a;
                if (videoFile.F4().j() && o25.a().a(videoFile.I0())) {
                    if (y6s0Var != null) {
                        y6s0Var.b(VideoBottomSheetSideEffectOptions.REMOVE_FROM_DOWNLOADABLE, videoFile);
                    }
                } else if (y6s0Var != null) {
                    y6s0Var.b(VideoBottomSheetSideEffectOptions.REMOVE_FROM_OWNER, videoFile);
                }
                return s3q0.a;
            case 16:
                ((s210) this.c).a((pk50) this.d);
                return s3q0.a;
            case 17:
                rqh0 rqh0Var = (rqh0) this.c;
                izs izsVar = (izs) this.d;
                if (rqh0Var instanceof rqh0.b) {
                    izsVar.invoke(zlh0.c.b);
                } else {
                    if (!(rqh0Var instanceof rqh0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    izsVar.invoke(zlh0.b.b);
                }
                return s3q0.a;
            case 18:
                ((nri0) this.c).e.invoke(new UserProfileAction.p.a.b((je80) this.d));
                return s3q0.a;
            case 19:
                ((smu0) this.c).Td(((Fragment) this.d).getChildFragmentManager(), "confirmation_screen");
                return s3q0.a;
            case 20:
                bhl0 bhl0Var = (bhl0) this.c;
                izs izsVar2 = (izs) this.d;
                Trace.beginSection(ndp0.f("StorageManager.beginTransactionNonExclusive"));
                try {
                    bhl0Var.C().beginTransactionNonExclusive();
                    s3q0 s3q0Var = s3q0.a;
                    Trace.endSection();
                    try {
                        Trace.beginSection(ndp0.f("StorageManager.execTransactionModeImmediate invoke"));
                        try {
                            Object invoke = izsVar2.invoke(bhl0Var);
                            Trace.endSection();
                            bhl0Var.C().setTransactionSuccessful();
                            Trace.beginSection(ndp0.f("StorageManager.endTransaction"));
                            try {
                                bhl0Var.C().endTransaction();
                                return invoke;
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        Trace.beginSection(ndp0.f("StorageManager.endTransaction"));
                        try {
                            bhl0Var.C().endTransaction();
                            s3q0 s3q0Var2 = s3q0.a;
                            throw th;
                        } finally {
                        }
                    }
                } finally {
                }
            case 21:
                ((izs) this.c).invoke((String) this.d);
                return s3q0.a;
            case 22:
                rlq0 rlq0Var = (rlq0) this.c;
                rlq0Var.c((ExtendedUserProfile) this.d, new UserProfileAction.s.c.b(3));
                rlq0Var.f.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_FRIEND_OUT);
                return s3q0.a;
            case 23:
                hds0 hds0Var = (hds0) this.c;
                ocs ocsVar = (ocs) this.d;
                fkn0 fkn0Var = hds0Var.g;
                (fkn0Var != null ? fkn0Var : null).c(ocsVar);
                return s3q0.a;
            default:
                ((izs) this.c).invoke(new wqs0.p.b((BlockId.CompositeId) this.d));
                return s3q0.a;
        }
    }
}
