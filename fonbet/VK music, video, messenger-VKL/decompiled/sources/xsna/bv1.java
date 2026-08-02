package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.net.Uri;
import android.view.View;
import com.vk.api.generated.market.dto.MarketGetItemsForReviewResponseDto;
import com.vk.api.generated.market.dto.MarketGetItemsForReviewViewTypeDto;
import com.vk.api.generated.market.dto.MarketItemsForReviewConfigDto;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.view.search.ModernSearchView;
import com.vk.dto.common.Source;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.PodcastInfo;
import com.vk.dto.polls.Poll;
import com.vk.im.engine.models.SelectedMembers;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.mvicomponent.MviComponentFragment;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.timer.LiveTimerView;
import com.vk.log.L;
import com.vk.polls.entities.exceptions.UserDidntVoteException;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.pushes.receivers.c;
import com.vk.settings.GetAccountSettingsRequest;
import com.vkontakte.android.R;
import com.vkontakte.android.ValidationActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.as30;
import xsna.bcw0;
import xsna.cwb0;
import xsna.d8w;
import xsna.f610;
import xsna.h7u0;
import xsna.k840;
import xsna.nbu;
import xsna.osb0;
import xsna.u1s;
import xsna.x7a;
import xsna.ybb;
import xsna.ykb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class bv1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bv1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        VKImageView vKImageView;
        String name;
        int i = 2;
        Poll poll = null;
        int i2 = 1;
        switch (this.b) {
            case 0:
                ((dv1) this.c).d.b((String) this.d, (Throwable) obj);
                return s3q0.a;
            case 1:
                c23 c23Var = (c23) this.c;
                w13 w13Var = (w13) this.d;
                c23Var.c(((x7a.d.a) w13Var.getItem()).e.b, ((x7a.d.a) w13Var.getItem()).d, null);
                return s3q0.a;
            case 2:
                us6 us6Var = (us6) this.c;
                ModernSearchView modernSearchView = (ModernSearchView) this.d;
                us6Var.l1.dispose();
                String str = ((bcw0.a) obj).a;
                if (str != null) {
                    modernSearchView.setQuery(str);
                }
                return s3q0.a;
            case 3:
                ((ubb) this.c).u((Throwable) obj, ((ybb.f) this.d).d);
                return s3q0.a;
            case 4:
                nuw nuwVar = (nuw) this.c;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.d;
                z = ref$BooleanRef.element || ((dot) obj).S0(nuwVar);
                ref$BooleanRef.element = z;
                return Boolean.valueOf(!z);
            case 5:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
                q8e q8eVar = (q8e) this.d;
                int i3 = ClipFeedListFragment.a2;
                clipFeedListFragment.Mo(q8eVar.getContext(), (SdkClipVideoFile) obj);
                return s3q0.a;
            case 6:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                ((Boolean) obj).getClass();
                cm70 cm70Var = clipsWrapperFragment.D0;
                if (cm70Var != null) {
                    String str2 = (String) ref$ObjectRef.element;
                    io.reactivex.rxjava3.disposables.c subscribe = cm70Var.g.a.t0(1L).subscribe(new skz(new wcj(cm70Var, 28), 11));
                    pgn pgnVar = cm70Var.h;
                    qcy<Object>[] qcyVarArr = cm70.j;
                    qcy<Object> qcyVar = qcyVarArr[0];
                    pgnVar.b(subscribe);
                    int i4 = 10;
                    io.reactivex.rxjava3.disposables.c subscribe2 = cm70Var.b.a().subscribe(new bdz(new h630(cm70Var, i4), i4));
                    pgn pgnVar2 = cm70Var.i;
                    qcy<Object> qcyVar2 = qcyVarArr[1];
                    pgnVar2.b(subscribe2);
                    if (str2 != null && (vKImageView = (VKImageView) cm70Var.d.findViewById(R.id.clip_photo)) != null) {
                        vKImageView.load(str2);
                    }
                    cm70Var.a.postDelayed(new oo6(cm70Var, 5), 2000L);
                }
                return s3q0.a;
            case 7:
                vvr vvrVar = (vvr) this.c;
                nek0 nek0Var = (nek0) this.d;
                vvrVar.y(false);
                if (nek0Var != null) {
                    nek0Var.hide();
                }
                return s3q0.a;
            case 8:
                chh chhVar = (chh) this.c;
                tan tanVar = (tan) this.d;
                List<ii7> list = tanVar.j;
                if (list == null || list.isEmpty()) {
                    chh.v(chhVar, tanVar, CommunityProfileContentItem.State.ERROR, null, 4);
                } else {
                    chh.v(chhVar, tanVar, null, CommunityProfileContentItem.State.ERROR, 2);
                }
                return s3q0.a;
            case 9:
                j2j j2jVar = (j2j) this.c;
                e2j e2jVar = (e2j) this.d;
                Context context = j2jVar.itemView.getContext();
                int i5 = e2jVar.c;
                int i6 = h7u0.p;
                h7u0.a c = h7u0.b.c(context);
                c.h0(context.getString(R.string.voip_session_room_admin_spread_participants_randomly_dialog_title, Integer.valueOf(i5)));
                c.U(R.string.voip_session_room_admin_spread_participants_randomly_dialog_description);
                c.c0(R.string.voip_session_room_admin_spread_participants_randomly_dialog_confirm, new qdf(j2jVar, 1));
                c.W(R.string.voip_session_room_admin_spread_participants_randomly_dialog_cancel, null);
                c.m();
                return s3q0.a;
            case 10:
                com.vk.im.ui.components.contacts.a aVar = (com.vk.im.ui.components.contacts.a) this.c;
                a1w a1wVar = aVar.i;
                SelectedMembers selectedMembers = aVar.y;
                return a1wVar.C(aVar, new z5p((Source) this.d, izi0.j(selectedMembers.b, (Iterable) selectedMembers.c), (List) obj, aVar.E));
            case 11:
                ((wzs) this.c).invoke((View) obj, (kkm) this.d);
                return s3q0.a;
            case 12:
                ((asm) this.c).e().c(new cwb0.v0((DialogExt) this.d), new q5f((io.reactivex.rxjava3.disposables.c) obj, 13));
                return s3q0.a;
            case 13:
                a1s a1sVar = (a1s) this.c;
                m1s m1sVar = (m1s) this.d;
                e580 e580Var = (e580) a1sVar;
                xyr xyrVar = ((v1s) obj).a.get(Integer.valueOf(e580Var.b));
                if (xyrVar != null && (name = xyrVar.getName()) != null) {
                    m1sVar.n(new u1s.d(e580Var.b, name, ((Number) j5g.X(e580Var.c)).longValue()));
                }
                return s3q0.a;
            case 14:
                t2u t2uVar = (t2u) this.c;
                Path path = (Path) this.d;
                Canvas canvas = (Canvas) obj;
                canvas.drawPath(path, t2uVar.k);
                canvas.drawPath(path, t2uVar.j);
                return s3q0.a;
            case 15:
                ((lcu) this.c).T(new qcu(new ghq0(((nbu.d) this.d).b, (Bitmap) obj)));
                return s3q0.a;
            case 16:
                Context context2 = (Context) this.c;
                Uri uri = (Uri) this.d;
                Intent intent = new Intent(context2, (Class<?>) ValidationActivity.class);
                intent.putExtra("url", ((GetAccountSettingsRequest.Result) obj).c);
                intent.putExtra("ref_url", uri.toString());
                context2.startActivity(intent);
                return s3q0.a;
            case 17:
                l4w l4wVar = (l4w) this.c;
                as30.a aVar2 = (as30.a) this.d;
                j4w j4wVar = l4wVar.K;
                if (j4wVar == null) {
                    j4wVar = null;
                }
                if (j4wVar.s()) {
                    aVar2.b();
                } else {
                    fh5 fh5Var = l4wVar.A;
                    (fh5Var == null ? null : fh5Var).n0();
                }
                return s3q0.a;
            case 18:
                i5w i5wVar = (i5w) this.c;
                w2w w2wVar = (w2w) this.d;
                ((Integer) obj).getClass();
                return (d8w.b) fo50.v(new d8w(i5wVar.a, i5wVar.b, i5wVar.d), w2wVar, "ImItemsGetApiCmd", 2);
            case 19:
                wh50 wh50Var = (wh50) this.c;
                wh50 wh50Var2 = (wh50) this.d;
                tny tnyVar = (tny) obj;
                wh50Var.setValue(new ov70(tnyVar.k(0L)));
                wh50Var2.setValue(new q9x(tnyVar.a()));
                return s3q0.a;
            case 20:
                ((com.vk.stickers.keyboard.navigation.d) this.c).l.a(((kgy) this.d).b.b);
                return s3q0.a;
            case 21:
                LiveTimerView liveTimerView = (LiveTimerView) this.c;
                Ref$LongRef ref$LongRef = (Ref$LongRef) this.d;
                int i7 = LiveTimerView.y;
                long j = ref$LongRef.element;
                liveTimerView.getClass();
                long j2 = j / 1000;
                long j3 = 60;
                long j4 = j2 / j3;
                long j5 = j4 / j3;
                long j6 = 24;
                liveTimerView.u.setText(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5 / j6)}, 1)));
                liveTimerView.v.setText(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5 % j6)}, 1)));
                liveTimerView.w.setText(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4 % j3)}, 1)));
                liveTimerView.x.setText(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 % j3)}, 1)));
                return s3q0.a;
            case 22:
                f610 f610Var = (f610) this.c;
                MarketGetItemsForReviewViewTypeDto marketGetItemsForReviewViewTypeDto = (MarketGetItemsForReviewViewTypeDto) this.d;
                MarketGetItemsForReviewResponseDto marketGetItemsForReviewResponseDto = (MarketGetItemsForReviewResponseDto) obj;
                synchronized (f610Var) {
                    f610Var.d = marketGetItemsForReviewResponseDto;
                    f610Var.c = marketGetItemsForReviewViewTypeDto;
                }
                MarketItemsForReviewConfigDto d = marketGetItemsForReviewResponseDto.d();
                t510 t510Var = f610Var.b;
                if (d != null) {
                    t510Var.e().edit().putInt("community_config_value", d.d()).apply();
                    t510Var.e().edit().putInt("requests_delay_config_value", d.e()).apply();
                }
                if (f610.a.$EnumSwitchMapping$0[marketGetItemsForReviewViewTypeDto.ordinal()] == 1) {
                    f610Var.b.e().edit().putLong("date_of_last_success_get_item_reviews_api_response", new Date().getTime()).apply();
                }
                return s3q0.a;
            case 23:
                rw40 rw40Var = (rw40) this.c;
                MusicTrack musicTrack = (MusicTrack) this.d;
                ArrayList arrayList = rw40Var.z;
                if (arrayList.contains(musicTrack.Fb())) {
                    arrayList.remove(musicTrack.Fb());
                    rw40Var.v.b(new hw40(musicTrack));
                }
                return s3q0.a;
            case 24:
                ow2 ow2Var = (ow2) this.c;
                fsv fsvVar = (fsv) this.d;
                View view = (View) obj;
                T t = ow2Var.l;
                if (t != 0) {
                    fsvVar.Ig(view.getId(), t);
                }
                return s3q0.a;
            case 25:
                ((MviComponentFragment) this.c).Q.put((yj50) this.d, (mk50) obj);
                return s3q0.a;
            case 26:
                Context context3 = (Context) this.c;
                Intent intent2 = (Intent) this.d;
                c.a aVar3 = com.vk.pushes.receivers.c.b;
                c.a.f(context3, intent2, true);
                return s3q0.a;
            case 27:
                String str3 = (String) this.d;
                String str4 = (String) this.c;
                qyg0 V0 = ((hyg0) obj).V0("UPDATE playlist SET json_raw = ? WHERE pid = ?");
                try {
                    V0.D3(1, str3);
                    V0.D3(2, str4);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 28:
                sib0 sib0Var = (sib0) this.c;
                b140 b140Var = (b140) this.d;
                PodcastInfo podcastInfo = ((ykb0.a) obj).a;
                sib0Var.g = !(podcastInfo != null ? podcastInfo.l : false);
                boolean z2 = podcastInfo != null ? podcastInfo.l : false;
                sib0Var.i = z2;
                z = podcastInfo != null ? podcastInfo.m : false;
                sib0Var.h = z;
                PodcastInfo podcastInfo2 = sib0Var.k;
                sib0Var.k = podcastInfo2 != null ? new PodcastInfo(podcastInfo2.b, podcastInfo2.c, podcastInfo2.d, podcastInfo2.e, podcastInfo2.f, podcastInfo2.g, podcastInfo2.h, podcastInfo2.i, z2, podcastInfo2.k, z, podcastInfo2.m, podcastInfo2.n, podcastInfo2.o) : null;
                for (yj40 yj40Var : !sib0Var.g ? Collections.singletonList(xo50.a) : Collections.singletonList(yo50.a)) {
                    r5v0 r5v0Var = k840.a.h;
                    if (r5v0Var == null) {
                        r5v0Var = null;
                    }
                    r5v0Var.b(yj40Var);
                }
                b140Var.invoke(Boolean.valueOf(!sib0Var.g));
                return s3q0.a;
            default:
                lsb0 lsb0Var = (lsb0) this.c;
                Poll poll2 = (Poll) this.d;
                Throwable th2 = (Throwable) obj;
                L.i(th2);
                if (th2 instanceof UserDidntVoteException) {
                    lsb0Var.T(new osb0.a(poll, i));
                } else {
                    lsb0Var.T(new osb0.a(Poll.zb(poll2, null, null, null, 0, 0L, false, null, null, null, 4194303), i2));
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ bv1(String str, String str2) {
        this.b = 27;
        this.d = str;
        this.c = str2;
    }
}
