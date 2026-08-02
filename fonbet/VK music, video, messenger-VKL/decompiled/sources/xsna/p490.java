package xsna;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import androidx.constraintlayout.motion.widget.a;
import com.google.android.gms.internal.measurement.zznn;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import com.vk.dto.clips.music.MusicCatalogInfoEditor;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.MsgReaction;
import com.vk.im.engine.models.messages.MsgReactionImpl;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.VhStyle;
import com.vk.libvideo.api.ui.VideoTransitionSource;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.PollEditorUiConfig;
import com.vk.newsfeed.posting.impl.presentation.model.PollAnswerDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.video.ui.discovery.minimizable.motion.scene_dsl.transitions.MotionLayoutCurveFit;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import xsna.q630;

/* compiled from: OwnerBlockTransformer.kt */
@Deprecated
/* loaded from: classes16.dex */
public final class p490 implements q701, cvu {
    public static final jai c;
    public static final jai b = new jai(1788367463, new hne(1), false);
    public static final jai d = new jai(954987103, new hne(2), false);
    public static final p490 e = new p490();
    public static final int[][] f = {new int[]{8, 3, 8, 0}, new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}, new int[]{8, 2, 8, 2}, new int[]{8, 0, 8, 0}, new int[]{0, 0, 0, 0}, new int[]{8, 2, 8, 0}, new int[]{8, 3, 8, 0}, new int[]{8, 8, 8, 8}, new int[]{8, 8, 8, 0}, new int[]{0, 0, 0, 0}, new int[]{20, 22, 20, 24}, new int[]{4, 4, 0, 0}, new int[]{8, 4, 8, 8}, new int[]{8, 8, 8, 0}};
    public static final int[][] g = {new int[]{8, 0, 8, 0}, new int[]{8, 0, 8, 0}, new int[]{4, 0, 4, 0}, new int[]{4, 0, 4, 0}, new int[]{4, 0, 4, 0}, new int[]{0, 0, 0, 0}, new int[]{8, 0, 8, 0}, new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}, new int[]{12, 0, 8, 0}, new int[]{12, 8, 8, 0}, new int[]{12, 0, 8, 0}, new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}, new int[]{4, 0, 0, 0}, new int[]{8, 0, 8, 0}, new int[]{8, 8, 8, 0}};
    public static final int[][] h = {new int[]{0, 8, 4, 4, 4, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{6, 4, 0, 0, 0, 0, 8, 0, 0, 6, 0, 0, 4, 0, 8, 0, 0}, new int[]{4, 4, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{4, 4, 0, 0, 0, 0, 8, 0, 0, 4, 4, 4, 0, 0, 0, 0, 0}, new int[]{4, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{8, 4, 0, 0, 12, 0, 8, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0}, new int[]{0, 8, 4, 4, 4, 0, 8, 0, 0, 4, 4, 4, 4, 0, 8, 0, 0}, new int[]{0, 8, 4, 4, 4, 0, 8, 0, 0, 4, 4, 4, 0, 0, 0, 0, 0}, new int[]{0, 8, 4, 4, 4, 0, 8, 0, 0, 4, 4, 4, 0, 0, 0, 0, 0}, new int[]{0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 8, 0, 8, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 12, 0}, new int[]{0, 0, 0, 0, 0, 8, 0, 0, 0, 8, 0, 0, 0, 0, 4, 0, 0}, new int[]{0, 12, 8, 12, 0, 8, 0, 12, 0, 8, 0, 0, 0, 0, 4, 0, 0}};
    public static final int[][] i = {new int[]{0, 4, 4, 4, 8, 2, 8, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0}, new int[]{4, 4, 0, 0, 8, 2, 8, 0, 0, 0, 0, 8, 4, 0, 0, 0, 0}, new int[]{4, 0, 0, 0, 0, 2, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{4, 0, 0, 0, 0, 2, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 2, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{4, 4, 0, 0, 0, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{4, 0, 0, 0, 0, 2, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0}, new int[]{0, 4, 4, 4, 8, 0, 8, 0, 0, 0, 0, 8, 4, 0, 0, 8, 0}, new int[]{0, 4, 4, 4, 8, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 4, 4, 4, 8, 0, 8, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
    public static final /* synthetic */ p490 j = new p490();

    static {
        byte b2 = 0;
        c = new jai(1395223293, new nfi(b2, b2), false);
    }

    public static q630 A(q630 q630Var, jgh0 jgh0Var, boolean z, boolean z2) {
        Orientation orientation = z2 ? Orientation.Vertical : Orientation.Horizontal;
        tg50 tg50Var = jgh0Var.d;
        float f2 = ubd.a;
        Orientation orientation2 = Orientation.Vertical;
        q630.a aVar = q630.a.a;
        return q630Var.g(orientation == orientation2 ? rte0.d(aVar, cpr0.a) : rte0.d(aVar, qfv.a)).g(new xgh0(orientation, null, null, tg50Var, null, jgh0Var, z, true)).g(new thh0(jgh0Var, z2));
    }

    public static final dtd B(ClipsEditorMusicInfo clipsEditorMusicInfo) {
        ftd ftdVar;
        etd etdVar;
        ClipsEditorMusicTrack clipsEditorMusicTrack = clipsEditorMusicInfo.b;
        ftd ftdVar2 = new ftd(clipsEditorMusicTrack.b, clipsEditorMusicTrack.c, clipsEditorMusicTrack.d, clipsEditorMusicTrack.e, clipsEditorMusicTrack.f, clipsEditorMusicTrack.g, clipsEditorMusicTrack.h, clipsEditorMusicTrack.i, clipsEditorMusicTrack.j, clipsEditorMusicTrack.k);
        String str = clipsEditorMusicInfo.c;
        int i2 = clipsEditorMusicInfo.d;
        int i3 = clipsEditorMusicInfo.e;
        int i4 = clipsEditorMusicInfo.f;
        String str2 = clipsEditorMusicInfo.g;
        int i5 = clipsEditorMusicInfo.h;
        boolean z = clipsEditorMusicInfo.i;
        boolean z2 = clipsEditorMusicInfo.j;
        MusicCatalogInfoEditor musicCatalogInfoEditor = clipsEditorMusicInfo.k;
        if (musicCatalogInfoEditor != null) {
            ftdVar = ftdVar2;
            etdVar = new etd(musicCatalogInfoEditor.b, musicCatalogInfoEditor.c, musicCatalogInfoEditor.d, musicCatalogInfoEditor.e, musicCatalogInfoEditor.f);
        } else {
            ftdVar = ftdVar2;
            etdVar = null;
        }
        return new dtd(ftdVar, str, i2, i3, i4, str2, i5, z, z2, etdVar, clipsEditorMusicInfo.l);
    }

    public static final VideoTransitionSource C(tny tnyVar) {
        if (tnyVar == null) {
            return null;
        }
        zhf0 j2 = jgz.j(tnyVar, true);
        return new VideoTransitionSource(j2.a, j2.b, (int) (tnyVar.a() >> 32), (int) (tnyVar.a() & 4294967295L), (int) (j2.d - j2.b));
    }

    public static q630 D(q630 q630Var, jgh0 jgh0Var, int i2) {
        return A(q630Var, jgh0Var, (i2 & 2) != 0, true);
    }

    public static final zhf0 d(long j2, long j3) {
        return new zhf0(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
    }

    public static final zhf0 e(long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return new zhf0(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3));
    }

    public static final void f(kdy kdyVar, boolean z) {
        g(kdyVar, z);
        ddy ddyVar = new ddy();
        ddyVar.b = R.id.dialogContainer;
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ddyVar.i("alpha", valueOf);
        MotionLayoutCurveFit motionLayoutCurveFit = MotionLayoutCurveFit.LINEAR;
        ddyVar.i("curveFit", Integer.valueOf(motionLayoutCurveFit.ordinal()));
        ddyVar.a = 80;
        kdyVar.b(ddyVar);
        ydy ydyVar = new ydy();
        ydyVar.b = R.id.dialogContainer;
        ydyVar.e = motionLayoutCurveFit.ordinal();
        ydyVar.a = 80;
        ydyVar.i("percentX", Float.valueOf(1.0f));
        ydyVar.i("percentWidth", valueOf);
        ydyVar.i("percentHeight", valueOf);
        ydyVar.i("percentY", valueOf);
        kdyVar.b(ydyVar);
    }

    public static final void g(kdy kdyVar, boolean z) {
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ydy ydyVar = new ydy();
        ydyVar.b = R.id.playerContainer;
        MotionLayoutCurveFit motionLayoutCurveFit = MotionLayoutCurveFit.LINEAR;
        ydyVar.e = motionLayoutCurveFit.ordinal();
        ydyVar.a = 80;
        Float valueOf2 = Float.valueOf(1.0f);
        ydyVar.i("percentWidth", valueOf2);
        ydyVar.i("percentX", valueOf2);
        kdyVar.b(ydyVar);
        ddy ddyVar = new ddy();
        ddyVar.b = R.id.relatedVideoItemsBackground;
        s3j0.d(ddyVar, "alpha", valueOf2, motionLayoutCurveFit, "curveFit");
        ddyVar.a = 80;
        kdyVar.b(ddyVar);
        ydy ydyVar2 = new ydy();
        ydyVar2.b = R.id.relatedVideoItemsBackground;
        ydyVar2.e = motionLayoutCurveFit.ordinal();
        ydyVar2.a = 80;
        ydyVar2.i("percentX", valueOf2);
        ydyVar2.i("percentWidth", valueOf2);
        kdyVar.b(ydyVar2);
        if (!z) {
            ddy ddyVar2 = new ddy();
            ddyVar2.b = R.id.mainFragmentContainerShadow;
            s3j0.d(ddyVar2, "alpha", valueOf, motionLayoutCurveFit, "curveFit");
            ddyVar2.a = 80;
            kdyVar.b(ddyVar2);
        }
        ddy ddyVar3 = new ddy();
        ddyVar3.b = R.id.contentContainer;
        s3j0.d(ddyVar3, "alpha", valueOf, motionLayoutCurveFit, "curveFit");
        ddyVar3.a = 80;
        kdyVar.b(ddyVar3);
        ydy ydyVar3 = new ydy();
        ydyVar3.b = R.id.contentContainer;
        ydyVar3.e = motionLayoutCurveFit.ordinal();
        ydyVar3.a = 100;
        ydyVar3.i("percentWidth", valueOf);
        ydyVar3.i("percentX", valueOf);
        kdyVar.b(ydyVar3);
        ddy ddyVar4 = new ddy();
        ddyVar4.b = R.id.tabletRecommendationsBackground;
        s3j0.d(ddyVar4, "alpha", valueOf2, motionLayoutCurveFit, "curveFit");
        ddyVar4.a = 100;
        kdyVar.b(ddyVar4);
        ydy ydyVar4 = new ydy();
        ydyVar4.b = R.id.tabletRecommendationsBackground;
        ydyVar4.e = motionLayoutCurveFit.ordinal();
        ydyVar4.a = 80;
        ydyVar4.i("percentX", valueOf2);
        ydyVar4.i("percentHeight", valueOf);
        ydyVar4.i("percentY", valueOf);
        kdyVar.b(ydyVar4);
        ddy ddyVar5 = new ddy();
        ddyVar5.b = R.id.tabletRecommendationsContainer;
        s3j0.d(ddyVar5, "alpha", valueOf, motionLayoutCurveFit, "curveFit");
        ddyVar5.a = 80;
        kdyVar.b(ddyVar5);
        ydy ydyVar5 = new ydy();
        ydyVar5.b = R.id.tabletRecommendationsContainer;
        ydyVar5.e = motionLayoutCurveFit.ordinal();
        ydyVar5.a = 80;
        ydyVar5.i("percentX", valueOf2);
        ydyVar5.i("percentHeight", valueOf);
        ydyVar5.i("percentY", valueOf);
        kdyVar.b(ydyVar5);
        ydy ydyVar6 = new ydy();
        ydyVar6.b = R.id.tabletRecommendationsContainer;
        ydyVar6.e = motionLayoutCurveFit.ordinal();
        ydyVar6.a = 100;
        ydyVar6.i("percentHeight", valueOf);
        ydyVar6.i("percentY", valueOf);
        kdyVar.b(ydyVar6);
    }

    public static final void h(kdy kdyVar) {
        ddy ddyVar = new ddy();
        ddyVar.b = R.id.contentContainer;
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ddyVar.i("alpha", valueOf);
        ddyVar.a = 50;
        MotionLayoutCurveFit motionLayoutCurveFit = MotionLayoutCurveFit.LINEAR;
        ddyVar.i("curveFit", Integer.valueOf(motionLayoutCurveFit.ordinal()));
        kdyVar.b(ddyVar);
        ddy ddyVar2 = new ddy();
        ddyVar2.b = R.id.relatedVideoItemsBackground;
        ddyVar2.i("alpha", valueOf);
        ddyVar2.a = 50;
        ddyVar2.i("curveFit", Integer.valueOf(motionLayoutCurveFit.ordinal()));
        kdyVar.b(ddyVar2);
        ddy ddyVar3 = new ddy();
        ddyVar3.b = R.id.tabletRecommendationsContainer;
        ddyVar3.i("alpha", valueOf);
        ddyVar3.a = 50;
        ddyVar3.i("curveFit", Integer.valueOf(motionLayoutCurveFit.ordinal()));
        kdyVar.b(ddyVar3);
        ddy ddyVar4 = new ddy();
        ddyVar4.b = R.id.tabletRecommendationsBackground;
        ddyVar4.i("alpha", valueOf);
        ddyVar4.a = 50;
        ddyVar4.i("curveFit", Integer.valueOf(motionLayoutCurveFit.ordinal()));
        kdyVar.b(ddyVar4);
        ddy ddyVar5 = new ddy();
        ddyVar5.b = R.id.dialogContainer;
        ddyVar5.i("alpha", valueOf);
        ddyVar5.a = 50;
        ddyVar5.i("curveFit", Integer.valueOf(motionLayoutCurveFit.ordinal()));
        kdyVar.b(ddyVar5);
    }

    public static ArrayList i(List list, Peer peer, int i2, int i3) {
        long j2 = peer.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MsgReaction msgReaction = (MsgReaction) it.next();
            int id = msgReaction.getId();
            if (id == i3) {
                msgReaction = new MsgReactionImpl(msgReaction.getId(), j5g.v0(Long.valueOf(j2), msgReaction.u2()), msgReaction.getCount() + 1);
            } else if (id == i2) {
                int id2 = msgReaction.getId();
                int count = msgReaction.getCount() - 1;
                List<Long> u2 = msgReaction.u2();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : u2) {
                    if (((Number) obj).longValue() != j2) {
                        arrayList2.add(obj);
                    }
                }
                msgReaction = new MsgReactionImpl(id2, arrayList2, count);
            }
            if (msgReaction.getCount() <= 0) {
                msgReaction = null;
            }
            if (msgReaction != null) {
                arrayList.add(msgReaction);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((MsgReaction) it2.next()).getId() == i3) {
                    return arrayList;
                }
            }
        }
        return j5g.v0(new MsgReactionImpl(i3, Collections.singletonList(Long.valueOf(j2)), 1), arrayList);
    }

    public static final void j(ab30 ab30Var) {
        xvs0 xvs0Var = ab30Var.b;
        boolean z = xvs0Var.d;
        androidx.constraintlayout.motion.widget.a aVar = ab30Var.a;
        a.b bVar = new a.b(R.id.from_expanded_landscape_tablet_to_hidden_landscape, aVar, R.id.expanded_landscape_tablet, R.id.hidden_landscape);
        kdy kdyVar = new kdy();
        g(kdyVar, z);
        ddy ddyVar = new ddy();
        ddyVar.b = R.id.playerContainer;
        MotionLayoutCurveFit motionLayoutCurveFit = MotionLayoutCurveFit.LINEAR;
        ddyVar.i("curveFit", Integer.valueOf(motionLayoutCurveFit.ordinal()));
        ddyVar.a = 80;
        Float valueOf = Float.valueOf(1.0f);
        ddyVar.i("alpha", valueOf);
        kdyVar.b(ddyVar);
        bVar.a(kdyVar);
        LinkedHashMap linkedHashMap = ab30Var.c;
        linkedHashMap.put(Integer.valueOf(R.id.from_expanded_landscape_tablet_to_hidden_landscape), bVar);
        a.b bVar2 = new a.b(R.id.from_expanded_landscape_tablet_with_dialog_to_hidden_landscape, aVar, R.id.expanded_landscape_tablet_with_dialog, R.id.hidden_landscape);
        kdy kdyVar2 = new kdy();
        f(kdyVar2, z);
        ddy ddyVar2 = new ddy();
        ddyVar2.b = R.id.playerContainer;
        ddyVar2.a = 80;
        ddyVar2.i("curveFit", Integer.valueOf(motionLayoutCurveFit.ordinal()));
        ddyVar2.i("alpha", valueOf);
        linkedHashMap.put(dt.a(kdyVar2, ddyVar2, bVar2, kdyVar2, R.id.from_expanded_landscape_tablet_with_dialog_to_hidden_landscape), bVar2);
        a.b bVar3 = new a.b(R.id.from_expanded_landscape_tablet_to_expanded_landscape_tablet_with_dialog, aVar, R.id.expanded_landscape_tablet, R.id.expanded_landscape_tablet_with_dialog);
        kdy kdyVar3 = new kdy();
        ddy ddyVar3 = new ddy();
        ddyVar3.b = R.id.dialogContainer;
        s3j0.d(ddyVar3, "alpha", valueOf, motionLayoutCurveFit, "curveFit");
        ddyVar3.a = 0;
        linkedHashMap.put(dt.a(kdyVar3, ddyVar3, bVar3, kdyVar3, R.id.from_expanded_landscape_tablet_to_expanded_landscape_tablet_with_dialog), bVar3);
        a.b bVar4 = new a.b(R.id.from_expanded_landscape_tablet_to_fullscreen, aVar, R.id.expanded_landscape_tablet, R.id.fullscreen);
        bVar4.c(3, 0, null);
        bVar4.b(300);
        kdy kdyVar4 = new kdy();
        ddy ddyVar4 = new ddy();
        ddyVar4.b = R.id.dialogContainer;
        ddyVar4.i("alpha", valueOf);
        ddyVar4.a = 100;
        ddy a = ct.a(kdyVar4, ddyVar4);
        a.b = R.id.tabletRecommendationsContainer;
        a.i("alpha", valueOf);
        a.a = 100;
        ddy a2 = ct.a(kdyVar4, a);
        a2.b = R.id.tabletRecommendationsBackground;
        a2.i("alpha", valueOf);
        a2.a = 100;
        ddy a3 = ct.a(kdyVar4, a2);
        a3.b = R.id.contentContainer;
        a3.i("alpha", valueOf);
        a3.a = 100;
        ddy a4 = ct.a(kdyVar4, a3);
        a4.b = R.id.relatedVideoItemsBackground;
        a4.i("alpha", valueOf);
        a4.a = 100;
        linkedHashMap.put(dt.a(kdyVar4, a4, bVar4, kdyVar4, R.id.from_expanded_landscape_tablet_to_fullscreen), bVar4);
        a.b bVar5 = new a.b(R.id.from_expanded_landscape_tablet_with_dialog_to_fullscreen, aVar, R.id.expanded_landscape_tablet_with_dialog, R.id.fullscreen);
        bVar5.c(3, 0, null);
        bVar5.b(300);
        kdy kdyVar5 = new kdy();
        ddy ddyVar5 = new ddy();
        ddyVar5.b = R.id.dialogContainer;
        ddyVar5.i("alpha", valueOf);
        ddyVar5.a = 100;
        ddy a5 = ct.a(kdyVar5, ddyVar5);
        a5.b = R.id.tabletRecommendationsContainer;
        a5.i("alpha", valueOf);
        a5.a = 100;
        ddy a6 = ct.a(kdyVar5, a5);
        a6.b = R.id.tabletRecommendationsBackground;
        a6.i("alpha", valueOf);
        a6.a = 100;
        ddy a7 = ct.a(kdyVar5, a6);
        a7.b = R.id.contentContainer;
        a7.i("alpha", valueOf);
        a7.a = 100;
        ddy a8 = ct.a(kdyVar5, a7);
        a8.b = R.id.relatedVideoItemsBackground;
        a8.i("alpha", valueOf);
        a8.a = 100;
        linkedHashMap.put(dt.a(kdyVar5, a8, bVar5, kdyVar5, R.id.from_expanded_landscape_tablet_with_dialog_to_fullscreen), bVar5);
        a.b bVar6 = new a.b(R.id.from_fullscreen_with_right_promo_to_expanded_landscape_tablet_with_dialog, aVar, R.id.fullscreen_with_right_promo, R.id.expanded_landscape_tablet_with_dialog);
        bVar6.c(3, 0, null);
        bVar6.b(300);
        kdy kdyVar6 = new kdy();
        ddy ddyVar6 = new ddy();
        ddyVar6.b = R.id.dialogContainer;
        ddyVar6.i("alpha", valueOf);
        ddyVar6.a = 0;
        ddy a9 = ct.a(kdyVar6, ddyVar6);
        a9.b = R.id.tabletRecommendationsContainer;
        a9.i("alpha", valueOf);
        a9.a = 0;
        ddy a10 = ct.a(kdyVar6, a9);
        a10.b = R.id.tabletRecommendationsBackground;
        a10.i("alpha", valueOf);
        a10.a = 0;
        ddy a11 = ct.a(kdyVar6, a10);
        a11.b = R.id.contentContainer;
        a11.i("alpha", valueOf);
        a11.a = 0;
        ddy a12 = ct.a(kdyVar6, a11);
        a12.b = R.id.relatedVideoItemsBackground;
        a12.i("alpha", valueOf);
        a12.a = 0;
        linkedHashMap.put(dt.a(kdyVar6, a12, bVar6, kdyVar6, R.id.from_fullscreen_with_right_promo_to_expanded_landscape_tablet_with_dialog), bVar6);
        a.b bVar7 = new a.b(R.id.from_fullscreen_with_right_promo_to_expanded_landscape_tablet, aVar, R.id.fullscreen_with_right_promo, R.id.expanded_landscape_tablet);
        bVar7.c(3, 0, null);
        bVar7.b(300);
        kdy kdyVar7 = new kdy();
        ddy ddyVar7 = new ddy();
        ddyVar7.b = R.id.dialogContainer;
        ddyVar7.i("alpha", valueOf);
        ddyVar7.a = 0;
        ddy a13 = ct.a(kdyVar7, ddyVar7);
        a13.b = R.id.tabletRecommendationsContainer;
        a13.i("alpha", valueOf);
        a13.a = 0;
        ddy a14 = ct.a(kdyVar7, a13);
        a14.b = R.id.tabletRecommendationsBackground;
        a14.i("alpha", valueOf);
        a14.a = 0;
        ddy a15 = ct.a(kdyVar7, a14);
        a15.b = R.id.contentContainer;
        a15.i("alpha", valueOf);
        a15.a = 0;
        ddy a16 = ct.a(kdyVar7, a15);
        a16.b = R.id.relatedVideoItemsBackground;
        a16.i("alpha", valueOf);
        a16.a = 0;
        linkedHashMap.put(dt.a(kdyVar7, a16, bVar7, kdyVar7, R.id.from_fullscreen_with_right_promo_to_expanded_landscape_tablet), bVar7);
        a.b bVar8 = new a.b(R.id.from_fullscreen_with_bottom_promo_to_expanded_landscape_tablet_with_dialog, aVar, R.id.fullscreen_with_bottom_promo, R.id.expanded_landscape_tablet_with_dialog);
        bVar8.c(3, 0, null);
        bVar8.b(300);
        kdy kdyVar8 = new kdy();
        ddy ddyVar8 = new ddy();
        ddyVar8.b = R.id.dialogContainer;
        ddyVar8.i("alpha", valueOf);
        ddyVar8.a = 0;
        ddy a17 = ct.a(kdyVar8, ddyVar8);
        a17.b = R.id.tabletRecommendationsContainer;
        a17.i("alpha", valueOf);
        a17.a = 0;
        ddy a18 = ct.a(kdyVar8, a17);
        a18.b = R.id.tabletRecommendationsBackground;
        a18.i("alpha", valueOf);
        a18.a = 0;
        ddy a19 = ct.a(kdyVar8, a18);
        a19.b = R.id.contentContainer;
        a19.i("alpha", valueOf);
        a19.a = 0;
        ddy a20 = ct.a(kdyVar8, a19);
        a20.b = R.id.relatedVideoItemsBackground;
        a20.i("alpha", valueOf);
        a20.a = 0;
        linkedHashMap.put(dt.a(kdyVar8, a20, bVar8, kdyVar8, R.id.from_fullscreen_with_bottom_promo_to_expanded_landscape_tablet_with_dialog), bVar8);
        a.b bVar9 = new a.b(R.id.from_fullscreen_with_bottom_promo_to_expanded_landscape_tablet, aVar, R.id.fullscreen_with_bottom_promo, R.id.expanded_landscape_tablet);
        bVar9.c(3, 0, null);
        bVar9.b(300);
        kdy kdyVar9 = new kdy();
        ddy ddyVar9 = new ddy();
        ddyVar9.b = R.id.dialogContainer;
        ddyVar9.i("alpha", valueOf);
        ddyVar9.a = 0;
        ddy a21 = ct.a(kdyVar9, ddyVar9);
        a21.b = R.id.tabletRecommendationsContainer;
        a21.i("alpha", valueOf);
        a21.a = 0;
        ddy a22 = ct.a(kdyVar9, a21);
        a22.b = R.id.tabletRecommendationsBackground;
        a22.i("alpha", valueOf);
        a22.a = 0;
        ddy a23 = ct.a(kdyVar9, a22);
        a23.b = R.id.contentContainer;
        a23.i("alpha", valueOf);
        a23.a = 0;
        ddy a24 = ct.a(kdyVar9, a23);
        a24.b = R.id.relatedVideoItemsBackground;
        a24.i("alpha", valueOf);
        a24.a = 0;
        linkedHashMap.put(dt.a(kdyVar9, a24, bVar9, kdyVar9, R.id.from_fullscreen_with_bottom_promo_to_expanded_landscape_tablet), bVar9);
        if (xvs0Var.a) {
            a.b bVar10 = new a.b(R.id.from_expanded_landscape_tablet_to_collapsed_landscape, aVar, R.id.expanded_landscape_tablet, R.id.collapsed_landscape);
            kdy kdyVar10 = new kdy();
            g(kdyVar10, z);
            bVar10.a(kdyVar10);
            linkedHashMap.put(Integer.valueOf(R.id.from_expanded_landscape_tablet_to_collapsed_landscape), bVar10);
            a.b bVar11 = new a.b(R.id.from_expanded_landscape_tablet_with_dialog_to_collapsed_landscape, aVar, R.id.expanded_landscape_tablet_with_dialog, R.id.collapsed_landscape);
            kdy kdyVar11 = new kdy();
            f(kdyVar11, z);
            bVar11.a(kdyVar11);
            linkedHashMap.put(Integer.valueOf(R.id.from_expanded_landscape_tablet_with_dialog_to_collapsed_landscape), bVar11);
            return;
        }
        a.b bVar12 = new a.b(R.id.from_expanded_landscape_tablet_to_prepared_to_pip_landscape, aVar, R.id.expanded_landscape_tablet, R.id.prepared_to_pip_landscape);
        kdy kdyVar12 = new kdy();
        h(kdyVar12);
        bVar12.a(kdyVar12);
        linkedHashMap.put(Integer.valueOf(R.id.from_expanded_landscape_tablet_to_prepared_to_pip_landscape), bVar12);
        a.b bVar13 = new a.b(R.id.from_expanded_landscape_tablet_with_dialog_to_prepared_to_pip_landscape, aVar, R.id.expanded_landscape_tablet_with_dialog, R.id.prepared_to_pip_landscape);
        kdy kdyVar13 = new kdy();
        h(kdyVar13);
        bVar13.a(kdyVar13);
        linkedHashMap.put(Integer.valueOf(R.id.from_expanded_landscape_tablet_with_dialog_to_prepared_to_pip_landscape), bVar13);
    }

    public static void k(MediaFormat mediaFormat) {
        Integer n;
        Integer n2;
        Integer n3 = n("aac-profile", mediaFormat);
        if (n3 != null) {
            int intValue = n3.intValue();
            if ((intValue == 5 || intValue == 29) && (n = n("sample-rate", mediaFormat)) != null) {
                mediaFormat.setInteger("sample-rate", n.intValue() * 2);
            }
            if (intValue != 29 || (n2 = n("channel-count", mediaFormat)) == null) {
                return;
            }
            mediaFormat.setInteger("channel-count", n2.intValue() * 2);
        }
    }

    public static final String l(int i2, String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        return erm0.D0(i2, sb.toString());
    }

    @NonNull
    public static String m(int i2, @Nullable Context context) {
        if (context == null) {
            return "";
        }
        if (i2 == 1) {
            return context.getString(R.string.fingerprint_error_hw_not_available);
        }
        if (i2 != 7) {
            switch (i2) {
                case 9:
                    break;
                case 10:
                    return context.getString(R.string.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(R.string.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(R.string.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i2);
                    return context.getString(R.string.default_error_msg);
            }
        }
        return context.getString(R.string.fingerprint_error_lockout);
    }

    public static Integer n(String str, MediaFormat mediaFormat) {
        if (mediaFormat.containsKey(str)) {
            return Integer.valueOf(mediaFormat.getInteger(str));
        }
        return null;
    }

    public static final opg0 o(zox zoxVar) {
        Object c2 = zoxVar.c();
        if (c2 instanceof opg0) {
            return (opg0) c2;
        }
        return null;
    }

    public static int p(VhStyle vhStyle, VhStyle vhStyle2, boolean z) {
        return iah0.a(z ? h[vhStyle.index][vhStyle2.index] : i[vhStyle.index][vhStyle2.index]);
    }

    public static final float q(opg0 opg0Var) {
        return opg0Var != null ? opg0Var.a : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static q630 r(q630 q630Var, jgh0 jgh0Var, int i2) {
        return A(q630Var, jgh0Var, (i2 & 2) != 0, false);
    }

    public static final boolean s(PostingPollDto postingPollDto, PollEditorUiConfig pollEditorUiConfig) {
        String obj = drm0.p0(postingPollDto.d).toString();
        if (obj.length() == 0 || obj.length() > pollEditorUiConfig.b) {
            return false;
        }
        List<PollAnswerDto> list = postingPollDto.e;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (drm0.p0(((PollAnswerDto) it.next()).c).toString().length() > 0) {
                return true;
            }
        }
        return false;
    }

    public static final q630 t(q630 q630Var, f1z f1zVar, j1z j1zVar, gho0 gho0Var) {
        return q630Var.g(new b0z(f1zVar, j1zVar, gho0Var));
    }

    public static final PostingPollDto u(yrb0 yrb0Var, List list, List list2, Map map, Integer num, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            qv2 qv2Var = (qv2) next;
            iv2 iv2Var = (iv2) map.get(qv2Var);
            String str = iv2Var != null ? iv2Var.b : null;
            String obj = str != null ? drm0.p0(str).toString() : null;
            if (obj != null && obj.length() != 0) {
                if (list2.contains(qv2Var)) {
                    arrayList.add(next);
                }
            }
        }
        int intValue = num != null ? num.intValue() : 0;
        String obj2 = drm0.p0(yrb0Var.a).toString();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            iv2 iv2Var2 = (iv2) map.get((qv2) it2.next());
            PollAnswerDto pollAnswerDto = iv2Var2 != null ? new PollAnswerDto(iv2Var2.a, drm0.p0(iv2Var2.b).toString()) : null;
            if (pollAnswerDto != null) {
                arrayList2.add(pollAnswerDto);
            }
        }
        return new PostingPollDto(intValue, null, obj2, arrayList2, yrb0Var.b, yrb0Var.c, yrb0Var.d, yrb0Var.e, yrb0Var.f, z, false, IronSourceError.ERROR_RV_LOAD_DURING_LOAD, null);
    }

    public static final jgh0 x(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1464256199, 0, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:70)");
        }
        Object[] objArr = new Object[0];
        boolean o = aVar.o(0);
        Object x = aVar.x();
        if (o || x == a.C0011a.a) {
            x = new ap80(8);
            aVar.R(x);
        }
        jgh0 jgh0Var = (jgh0) crx0.D(objArr, jgh0.j, (gzs) x, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return jgh0Var;
    }

    public static ArrayList y(List list, Peer peer, Integer num) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MsgReaction msgReaction = (MsgReaction) it.next();
            if (msgReaction.getId() == num.intValue()) {
                int id = msgReaction.getId();
                int count = msgReaction.getCount() - 1;
                List<Long> u2 = msgReaction.u2();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : u2) {
                    if (((Number) obj).longValue() != peer.b) {
                        arrayList2.add(obj);
                    }
                }
                msgReaction = new MsgReactionImpl(id, arrayList2, count);
            }
            if (msgReaction.getCount() <= 0) {
                msgReaction = null;
            }
            if (msgReaction != null) {
                arrayList.add(msgReaction);
            }
        }
        return arrayList;
    }

    public static void z(izs izsVar, wzs wzsVar) {
        String string;
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            try {
                izsVar.invoke(mediaExtractor);
                int trackCount = mediaExtractor.getTrackCount();
                MediaFormat mediaFormat = null;
                MediaFormat mediaFormat2 = null;
                for (int i2 = 0; i2 < trackCount; i2++) {
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i2);
                    String str = "";
                    if (trackFormat.containsKey("mime") && (string = trackFormat.getString("mime")) != null) {
                        str = string;
                    }
                    if (brm0.B(str, "video/", false) && !str.equals("video/dolby-vision") && !str.equals("video/scrambled")) {
                        mediaFormat = trackFormat;
                    } else if (brm0.B(str, "audio/", false)) {
                        mediaFormat2 = trackFormat;
                    }
                }
                wzsVar.invoke(mediaFormat, mediaFormat2);
                mediaExtractor.release();
            } catch (Exception e2) {
                e2.toString();
                mediaExtractor.release();
            }
        } catch (Throwable th) {
            mediaExtractor.release();
            throw th;
        }
    }

    @Override // xsna.cvu
    public String a(Context context) {
        return "";
    }

    @Override // xsna.cvu
    public String c(Context context) {
        return "";
    }

    public m99 v() {
        m99 m99Var;
        synchronized (r99.a) {
            try {
                r99.f.add(this);
                if (r99.e == null) {
                    r99.e = new m99(r99.c, new ma9(com.vk.voip.ui.c.b), r99.d, OKVoipEngine.b);
                }
                m99Var = r99.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return m99Var;
    }

    public void w() {
        synchronized (r99.a) {
            try {
                LinkedHashSet linkedHashSet = r99.f;
                linkedHashSet.remove(this);
                if (linkedHashSet.isEmpty()) {
                    m99 m99Var = r99.e;
                    if (m99Var != null) {
                        m99Var.g();
                    }
                    r99.e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Integer.valueOf((int) zznn.zzy());
    }

    @Override // xsna.cvu
    public void b(Context context, gzs gzsVar) {
    }
}
