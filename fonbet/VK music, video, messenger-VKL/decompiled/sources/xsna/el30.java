package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Parcel;
import android.util.Size;
import android.view.View;
import com.vk.api.photos.PhotosGetAlbums;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh;
import com.vk.clips.design.view.nps.internal.stars.FeedbackResult;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.uxpolls.PollAnswer;
import com.vk.feed.settings.impl.presentation.filtered.NewsfeedFilteredSourcesFragment;
import com.vk.im.engine.exceptions.NoNetworkConnectionException;
import com.vk.im.ui.components.msg_list.c;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.voip.ui.asr.ui.list.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.aex;
import xsna.e890;
import xsna.fmc0;
import xsna.h7u0;
import xsna.hfr;
import xsna.ijx;
import xsna.ikv0;
import xsna.k840;
import xsna.rwi0;
import xsna.tj50;
import xsna.tlo0;
import xsna.xn50;
import xsna.y050;
import xsna.yid0;
import xsna.zsc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class el30 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ el30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0184, code lost:
    
        if (r3 != (-1)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0187, code lost:
    
        r7 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        c.a j;
        StoryEntry b;
        ?? singletonList;
        int i;
        int i2 = this.b;
        int i3 = 6;
        Integer num = null;
        r7 = null;
        Integer num2 = null;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                Context context = ((com.vk.im.ui.components.msg_list.a) obj2).k;
                Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_negative);
                int i4 = kwg0.a;
                if (((Throwable) obj) instanceof NoNetworkConnectionException) {
                    tlo0.f h = tq.h(tlo0.Companion, R.string.vkim_msg_no_connection_error);
                    ikv0.a aVar = new ikv0.a(context);
                    aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_globe_cross_outline_20, valueOf, (Size) null, 12);
                    CharSequence a = tlo0.b.a(h, context);
                    aVar.u = new ikv0.d(new ikv0.d.c(a != null ? a.toString() : null), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                    aVar.n();
                } else {
                    tlo0.f h2 = tq.h(tlo0.Companion, R.string.vkim_msg_request_conversation_failed);
                    ikv0.a aVar2 = new ikv0.a(context);
                    float f = 28;
                    aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_triangle_outline_56, valueOf, new Size(iah0.a(f), iah0.a(f)), 8);
                    aVar2.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h2, context).toString()), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                    aVar2.n();
                }
                return s3q0.a;
            case 1:
                xl30 xl30Var = (xl30) obj;
                Pair<xl30, c.a> P0 = ((com.vk.im.ui.components.msg_list.c) obj2).f.P0();
                if (P0 != null && (j = P0.j()) != null) {
                    j.a = null;
                }
                return xl30.a(xl30Var, 0, 0, null, null, false, false, null, 243);
            case 2:
                final y440 y440Var = (y440) obj2;
                final int intValue = ((Integer) obj).intValue();
                h7u0.a aVar3 = new h7u0.a(y440Var.getRequireContext());
                aVar3.U(R.string.story_multi_delete_confirm_message);
                aVar3.c0(R.string.delete, new DialogInterface.OnClickListener() { // from class: xsna.v440
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        f440 f440Var = y440.this.S;
                        if (f440Var != null) {
                            f440Var.z5(intValue);
                        }
                    }
                });
                aVar3.W(R.string.cancel_request, new w440(r8));
                aVar3.m();
                return s3q0.a;
            case 3:
                yb40 yb40Var = (yb40) obj2;
                Playlist playlist = (Playlist) obj;
                bn40.g(mm4.class.getSimpleName(), "playlist", playlist);
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(new i8b0(playlist));
                Activity h3 = e3m.h(yb40Var.b);
                if (h3 != null) {
                    lyd.g().U().a(h3, new y050.b.a(playlist, MusicPlaybackLaunchContext.A.t(), null, null, null, 28));
                }
                return s3q0.a;
            case 4:
                ((MusicOfflineCatalogRootVh) obj2).m.b.e.b(new oon0("music_playlists_download", null, false, false, 14), false);
                return s3q0.a;
            case 5:
                r250 r250Var = (r250) obj2;
                return io.reactivex.rxjava3.core.q.I0(io.reactivex.rxjava3.core.q.T((hda) obj), r250Var.a.e.w(), new nit(new q250(2, (dja) r250Var.c.getValue(), dja.class, "transform", "transform(Lcom/vk/catalog2/common/dto/api/CatalogResponse;Ljava/util/List;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0, 0), i3));
            case 6:
                ((hz9) obj2).invoke();
                return s3q0.a;
            case 7:
                qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
                ((SwipeDrawableRefreshLayout) obj2).setProgressDrawableFactory((d2e0) obj);
                return s3q0.a;
            case 8:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                View view = ((NewsfeedFilteredSourcesFragment) obj2).T;
                (view != null ? view : null).setVisibility(booleanValue ? 0 : 8);
                return s3q0.a;
            case 9:
                sr80 sr80Var = (sr80) obj2;
                ikv0 ikv0Var = sr80Var.c;
                if (ikv0Var != null) {
                    ikv0Var.a();
                }
                sr80Var.c = null;
                return s3q0.a;
            case 10:
                awt0.r((am) obj, ((s190) obj2).a.getContext());
                return s3q0.a;
            case 11:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                ((e890.a) obj2).d.onNext(EmptyList.b);
                return s3q0.a;
            case 12:
                return io.reactivex.rxjava3.core.q.T(kg90.a((kg90) obj2, ((Boolean) obj).booleanValue() ? -16711936 : -65536, 5));
            case 13:
                return new a.C2010a(((tj50.a) obj).a(new d0k((fn90) obj2, 18), ao8.d));
            case 14:
                x2a0 x2a0Var = (x2a0) obj2;
                aex.a aVar4 = x2a0Var.y0;
                if (aVar4 != null && (b = aVar4.b()) != null) {
                    Parcel obtain = Parcel.obtain();
                    try {
                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                        Serializer.g gVar = new Serializer.g(obtain);
                        gVar.i0(b);
                        obtain.setDataPosition(0);
                        Serializer.StreamParcelable G = gVar.G(StoryEntry.class.getClassLoader());
                        obtain.recycle();
                        StoryEntry storyEntry = (StoryEntry) G;
                        if (storyEntry != null) {
                            pdx pdxVar = x2a0Var.s0;
                            Context context2 = x2a0Var.itemView.getContext();
                            pdxVar.b(context2, storyEntry);
                        }
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                }
                return s3q0.a;
            case 15:
                ?? r2 = ((mha0) obj2).c;
                ((iha0) r2).P((PhotosGetAlbums.a) obj);
                ((iha0) r2).q();
                return s3q0.a;
            case 16:
                e2b0 e2b0Var = (e2b0) obj2;
                e2b0Var.f.b(new Object[0], ((Integer) obj).intValue(), true);
                e2b0Var.k = false;
                return s3q0.a;
            case 17:
                vqb0 vqb0Var = (vqb0) obj2;
                PollAnswer pollAnswer = (PollAnswer) obj;
                ArrayList arrayList = new ArrayList(pollAnswer.b);
                if (!arrayList.remove(Integer.valueOf(vqb0Var.b.c))) {
                    arrayList.add(Integer.valueOf(vqb0Var.b.c));
                }
                return PollAnswer.a(pollAnswer, arrayList, null, 2);
            case 18:
                u6c0 u6c0Var = (u6c0) obj2;
                u6c0Var.getClass();
                u6c0.a(u6c0Var, 3);
                u6c0Var.g.clear();
                ((q9q0) u6c0Var.h.getValue()).a();
                return s3q0.a;
            case 19:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.n(tgi0Var, 0);
                qgi0.h(tgi0Var, ((cic0) obj2).c.getText(R.string.vk_video_privacy_policy_description).toString());
                return s3q0.a;
            case 20:
                enc0 enc0Var = (enc0) obj2;
                MediaPickerSelectedItem mediaPickerSelectedItem = (MediaPickerSelectedItem) obj;
                if (!((Boolean) enc0Var.f0.getValue()).booleanValue()) {
                    return s3q0.a;
                }
                xai0 xai0Var = enc0Var.W;
                if (xai0Var != null) {
                    Iterator it = xai0Var.getCurrentList().iterator();
                    int i5 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i5 = -1;
                            break;
                        } else {
                            Object next = it.next();
                            if (i5 < 0) {
                                e43.t();
                                throw null;
                            }
                            if (((zai0) next).a.equals(mediaPickerSelectedItem)) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                enc0Var.e.invoke(new fmc0.i.b(enc0Var.d(num2)));
                hb40 hb40Var = enc0Var.U;
                r8 = num2 != null ? num2.intValue() : 0;
                xai0 xai0Var2 = enc0Var.W;
                if (xai0Var2 != null) {
                    List<zai0> currentList = xai0Var2.getCurrentList();
                    singletonList = new ArrayList(c5g.u(currentList, 10));
                    Iterator it2 = currentList.iterator();
                    while (it2.hasNext()) {
                        singletonList.add(((zai0) it2.next()).a);
                    }
                } else {
                    singletonList = Collections.singletonList(mediaPickerSelectedItem);
                }
                hb40Var.invoke(new PostingAction.Navigation.OpenMiniPreviewPhotoVideoViewer(mediaPickerSelectedItem, r8, singletonList));
                return s3q0.a;
            case 21:
                isc0 isc0Var = (isc0) obj2;
                WallWithCounters wallWithCounters = (WallWithCounters) obj;
                hfr.a aVar5 = new hfr.a(rli0.j(rli0.j(new i5g(wallWithCounters), wb60.d), jsc0.b));
                if (aVar5.hasNext()) {
                    Integer valueOf2 = Integer.valueOf(((Post) aVar5.next()).r);
                    while (true) {
                        num = valueOf2;
                        while (aVar5.hasNext()) {
                            valueOf2 = Integer.valueOf(((Post) aVar5.next()).r);
                            if (num.compareTo(valueOf2) > 0) {
                                break;
                            }
                        }
                    }
                }
                if (num != null) {
                    long intValue2 = num.intValue() - (System.currentTimeMillis() / 1000);
                    if (intValue2 < 1) {
                        intValue2 = 1;
                    }
                    isc0Var.a(new zsc0.a.c(intValue2));
                }
                return wallWithCounters;
            case 22:
                yid0 yid0Var = (yid0) obj2;
                by9 by9Var = (by9) obj;
                int i6 = by9Var != null ? yid0.a.$EnumSwitchMapping$0[by9Var.ordinal()] : -1;
                if (i6 == 1) {
                    i = yid0Var.j;
                    yid0Var.j = i - 1;
                } else if (i6 != 2) {
                    i = yid0Var.j;
                } else {
                    i = yid0Var.j;
                    yid0Var.j = i + 1;
                }
                return Integer.valueOf(i);
            case 23:
                ((i18) obj).c = new qw30((kjd0) obj2, 21);
                return s3q0.a;
            case 24:
                aqe0 aqe0Var = (aqe0) obj2;
                int i7 = aqe0.m1;
                ((j2u0) aqe0Var.j1.getValue()).getClass();
                xn50.a.c(aqe0Var, new ijx.c(j2u0.a((FeedbackResult) obj)));
                xn50.a.c(aqe0Var, ijx.a.b);
                return s3q0.a;
            case 25:
                ((k6i0) obj2).f.invoke(Boolean.TRUE);
                return s3q0.a;
            case 26:
                xlb0 xlb0Var = (xlb0) obj;
                ((zdo0) obj2).d(fdi.E(xlb0Var, false));
                xlb0Var.a();
                return s3q0.a;
            case 27:
                Context context3 = (Context) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    return s3q0.a;
                }
                qni0.a.getClass();
                qni0.d(context3);
                return s3q0.a;
            case 28:
                ((mwi0) obj2).V(rwi0.c.b.a);
                return s3q0.a;
            default:
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.n(tgi0Var2, 2);
                qgi0.t(tgi0Var2, jgz.d(((zzi0) obj2).c));
                return s3q0.a;
        }
    }
}
