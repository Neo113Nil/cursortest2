package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.g;
import com.google.android.material.timepicker.b;
import com.unity3d.services.UnityAdsConstants;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.channels.impl.post_settings.c;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.attaches.Attach;
import com.vk.dto.music.Playlist;
import com.vk.dto.polls.Poll;
import com.vk.dto.stories.entities.StoryCameraGalleryData;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.ecomm.reviews.ui.reviewheader.ReviewHeaderView;
import com.vk.log.L;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.newsfeed_backstage.task_executors.NewsfeedExternalEventsTaskExecutor$updatePhotoReceiver$1;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.poll_editor.presentation.base.fragment.PollEditorModalBottomSheet;
import com.vk.polls.entities.exceptions.UserDidntVoteException;
import com.vk.sharing.core.view.l;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.storycamera.picker.feature.b;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ala0;
import xsna.bhg0;
import xsna.dof0;
import xsna.er9;
import xsna.gbf0;
import xsna.hic0;
import xsna.ikv0;
import xsna.osb0;
import xsna.pnb0;
import xsna.qpb0;
import xsna.qr60;
import xsna.tzp0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class uh40 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uh40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v66, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.vk.dto.polls.Poll] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        TextView Jn;
        StoryCameraParams storyCameraParams;
        Object obj2;
        WebStoryBox webStoryBox;
        int i = this.b;
        int i2 = 11;
        int i3 = 2;
        int i4 = 1;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                return j5g.t0(((Playlist) obj3).y, (List) obj);
            case 1:
                ni60 ni60Var = (ni60) obj3;
                qg50 qg50Var = ni60Var.o;
                int[] iArr = qg50Var.b;
                long[] jArr = qg50Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((255 & j) < 128) {
                                    ((NewsFeedComponent) ni60Var.h.getValue()).w().b(iArr[(i5 << 3) + i7], (rt60) ni60Var.i.getValue());
                                }
                                j >>= 8;
                            }
                            if (i6 != 8) {
                            }
                        }
                        if (i5 != length) {
                            i5++;
                        }
                    }
                }
                ni60Var.s().b(102, ni60Var.j);
                ni60Var.s().b(100, ni60Var.k);
                ni60Var.s().b(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, ni60Var.l);
                ni60Var.s().b(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, ni60Var.m);
                Context context = e43.a;
                r7 = context != null ? context : 0;
                NewsfeedExternalEventsTaskExecutor$updatePhotoReceiver$1 newsfeedExternalEventsTaskExecutor$updatePhotoReceiver$1 = ni60Var.n;
                IntentFilter a = z23.a("com.vkontakte.android.ACTION_PROFILE_UPDATED");
                s3q0 s3q0Var = s3q0.a;
                anj.d(r7, newsfeedExternalEventsTaskExecutor$updatePhotoReceiver$1, a, hf8.a, 4);
                return s3q0.a;
            case 2:
                ((jt60) obj3).c.e();
                ((gzs) obj).invoke();
                return EmptyDisposable.INSTANCE;
            case 3:
                return ((py60) obj3).b.e(new ux60((qr60.a) obj));
            case 4:
                ((d070) obj3).f = ((GetStoriesResponse) obj).h;
                return s3q0.a;
            case 5:
                ((yp80) obj3).onError((Throwable) obj);
                return s3q0.a;
            case 6:
                return Boolean.valueOf(agc0.d((ImageCropArea) obj, ((hic0.a) obj3).b));
            case 7:
                ((com.vk.photos.root.photoflow.presentation.b) obj3).T((com.vk.photos.root.photoflow.presentation.d) obj);
                return s3q0.a;
            case 8:
                f9a0 f9a0Var = (f9a0) obj3;
                return Boolean.valueOf(f9a0Var.getAbsoluteAdapterPosition() != -1 ? f9a0Var.o.c((y7a0) f9a0Var.m, f9a0Var.getAbsoluteAdapterPosition()) : false);
            case 9:
                ala0 ala0Var = (ala0) obj3;
                ((zak0) ala0Var.l).setValue((ala0.d) ala0Var.g.get((String) obj));
                return s3q0.a;
            case 10:
                Throwable th = (Throwable) obj;
                PodcastEpisodeFragment podcastEpisodeFragment = ((com.vk.music.podcast.impl.ui.episode.b) obj3).b;
                mzp0 mzp0Var = podcastEpisodeFragment.J;
                if (mzp0Var != null) {
                    mzp0Var.f();
                }
                if (((Boolean) podcastEpisodeFragment.q0.getValue()).booleanValue() && zq70.B(th)) {
                    FragmentActivity activity = podcastEpisodeFragment.getActivity();
                    if (activity != null) {
                        ComposeView composeView = podcastEpisodeFragment.i0;
                        if (composeView != null) {
                            bwt0.p0(composeView, true);
                        }
                        ComposeView composeView2 = podcastEpisodeFragment.i0;
                        if (composeView2 != null) {
                            composeView2.setContent(new jai(-213395363, new g06(i2, podcastEpisodeFragment, activity), true));
                        }
                    }
                } else {
                    Context context2 = e43.a;
                    cvk.w(j03.g(context2 != null ? context2 : null, th, R.string.error), false);
                }
                return s3q0.a;
            case 11:
                PollEditorModalBottomSheet pollEditorModalBottomSheet = (PollEditorModalBottomSheet) obj3;
                qpb0 qpb0Var = (qpb0) obj;
                if (qpb0Var instanceof qpb0.a) {
                    final tob0 tob0Var = pollEditorModalBottomSheet.i1;
                    qpb0.a aVar = (qpb0.a) qpb0Var;
                    PollEditorModalBottomSheet pollEditorModalBottomSheet2 = tob0Var.b;
                    if (aVar instanceof qpb0.a.g) {
                        long j2 = ((qpb0.a.g) aVar).a;
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(j2);
                        long Hn = com.google.android.material.datepicker.g.Hn();
                        CalendarConstraints.b bVar = new CalendarConstraints.b();
                        bVar.a = Hn;
                        bVar.e = new DateValidatorPointForward(Hn);
                        CalendarConstraints a2 = bVar.a();
                        g.d<Long> b = g.d.b();
                        b.d = Long.valueOf(calendar.getTimeInMillis());
                        b.b = a2;
                        com.google.android.material.datepicker.g<Long> a3 = b.a();
                        a3.Td(pollEditorModalBottomSheet2.getParentFragmentManager(), "datepicker");
                        final defpackage.y yVar = new defpackage.y(20, calendar, tob0Var);
                        a3.x.add(new lm10() { // from class: xsna.rob0
                            @Override // xsna.lm10
                            public final void a(Object obj4) {
                                defpackage.y.this.invoke(obj4);
                            }
                        });
                    } else if (aVar instanceof qpb0.a.h) {
                        long j3 = ((qpb0.a.h) aVar).a;
                        final Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTimeInMillis(j3);
                        FragmentActivity activity2 = pollEditorModalBottomSheet2.getActivity();
                        if (activity2 != null) {
                            b.d dVar = new b.d();
                            dVar.d(DateFormat.is24HourFormat(activity2) ? 1 : 0);
                            dVar.b(calendar2.get(11));
                            dVar.c(calendar2.get(12));
                            final com.google.android.material.timepicker.b a4 = dVar.a();
                            a4.Td(pollEditorModalBottomSheet2.getParentFragmentManager(), "timepicker");
                            a4.x.add(new View.OnClickListener() { // from class: xsna.sob0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    com.google.android.material.timepicker.b bVar2 = com.google.android.material.timepicker.b.this;
                                    int Dn = bVar2.Dn();
                                    int En = bVar2.En();
                                    Calendar calendar3 = Calendar.getInstance();
                                    Calendar calendar4 = calendar2;
                                    calendar3.setTime(calendar4.getTime());
                                    calendar3.set(11, Dn);
                                    calendar3.set(12, En);
                                    long timeInMillis = calendar3.getTimeInMillis();
                                    xuo0 xuo0Var = xuo0.a;
                                    xuo0Var.getClass();
                                    boolean z = timeInMillis < TimeUnit.MINUTES.toMillis(5L) + xuo0.a();
                                    long timeInMillis2 = calendar3.getTimeInMillis();
                                    xuo0Var.getClass();
                                    boolean z2 = timeInMillis2 > TimeUnit.DAYS.toMillis(30L) + xuo0.a();
                                    if (z || z2) {
                                        cvk.u(z ? R.string.poll_start_limit_error : R.string.poll_end_limit_error, false);
                                        return;
                                    }
                                    calendar4.set(11, Dn);
                                    calendar4.set(12, En);
                                    xn50.a.c(tob0Var.a, new pnb0.a.d(calendar4.getTimeInMillis()));
                                }
                            });
                        }
                    } else if (aVar instanceof qpb0.a.i) {
                        qpb0.a.i iVar = (qpb0.a.i) aVar;
                        Throwable th2 = iVar.a;
                        int i8 = iVar.b;
                        Context mo2getContext = pollEditorModalBottomSheet2.mo2getContext();
                        if (mo2getContext != null) {
                            com.vk.core.utils.newtork.b.a.getClass();
                            tob0.a(mo2getContext, com.vk.core.utils.newtork.b.d() ? i8 == 0 ? j03.g(mo2getContext, th2, R.string.error) : mo2getContext.getString(i8) : mo2getContext.getString(R.string.posting_common_network_error));
                        }
                    } else if (aVar instanceof qpb0.a.C3567a) {
                        kob0 kob0Var = tob0Var.e;
                        if (kob0Var != null) {
                            kob0Var.a(((qpb0.a.C3567a) aVar).a);
                        }
                        tob0Var.d.invoke();
                    } else if (aVar instanceof qpb0.a.c) {
                        kob0 kob0Var2 = tob0Var.e;
                        if (kob0Var2 != null) {
                            kob0Var2.a(((qpb0.a.c) aVar).b);
                        }
                        kob0 kob0Var3 = tob0Var.e;
                        if (kob0Var3 != null) {
                            kob0Var3.b(((qpb0.a.c) aVar).a);
                        }
                        pollEditorModalBottomSheet2.hide();
                    } else if (aVar instanceof qpb0.a.b) {
                        kob0 kob0Var4 = tob0Var.e;
                        if (kob0Var4 != null) {
                            kob0Var4.a(((qpb0.a.b) aVar).a);
                        }
                        kob0 kob0Var5 = tob0Var.e;
                        if (kob0Var5 != null) {
                            kob0Var5.c();
                        }
                        pollEditorModalBottomSheet2.hide();
                    } else if (aVar instanceof qpb0.a.e) {
                        kob0 kob0Var6 = tob0Var.e;
                        if (kob0Var6 != null) {
                            kob0Var6.a(((qpb0.a.e) aVar).a);
                        }
                        pollEditorModalBottomSheet2.hide();
                    } else if (aVar instanceof qpb0.a.f) {
                        tob0Var.c.invoke();
                    } else {
                        if (!(aVar instanceof qpb0.a.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        kob0 kob0Var7 = tob0Var.e;
                        if (kob0Var7 != null) {
                            kob0Var7.a(((qpb0.a.d) aVar).a);
                        }
                        pollEditorModalBottomSheet2.dismiss();
                    }
                } else {
                    tzp0.c.a aVar2 = PollEditorModalBottomSheet.o1;
                    if (!(qpb0Var instanceof rpb0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new cwk(pollEditorModalBottomSheet, i4));
                    asu0.a.getClass();
                    io.reactivex.rxjava3.internal.operators.single.f0 q = vVar.q(asu0.m());
                    int i9 = kwg0.a;
                    io.reactivex.rxjava3.disposables.c subscribe = q.subscribe(new iwg0(), new c120(new r8(com.vk.metrics.eventtracking.b.a, 9), 17));
                    if (subscribe != null) {
                        pollEditorModalBottomSheet.j1.b(subscribe);
                    }
                }
                return s3q0.a;
            case 12:
                lsb0 lsb0Var = (lsb0) obj3;
                Throwable th3 = (Throwable) obj;
                L.i(th3);
                if (th3 instanceof UserDidntVoteException) {
                    lsb0Var.T(new osb0.a((Poll) r7, i3));
                }
                return s3q0.a;
            case 13:
                com.vk.channels.impl.post_settings.b bVar2 = (com.vk.channels.impl.post_settings.b) obj3;
                bVar2.s(((j7c0) obj).a, Boolean.TRUE);
                bVar2.m(c.a.a);
                return s3q0.a;
            case 14:
                Context context3 = (Context) obj3;
                Throwable th4 = (Throwable) obj;
                iuc0 iuc0Var = iuc0.b;
                if (!((o2i) iuc0.h.getValue()).d(th4, true)) {
                    j03.j(context3, th4);
                }
                return s3q0.a;
            case 15:
                dad0 dad0Var = (dad0) obj3;
                GroupCallViewModel groupCallViewModel = GroupCallViewModel.b;
                CallMemberId a5 = ((k490) dad0Var.a.f).a();
                groupCallViewModel.getClass();
                dad0Var.a(GroupCallViewModel.b(a5));
                return s3q0.a;
            case 16:
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj3).element;
                if (dw20Var != null && (Jn = dw20Var.Jn()) != null) {
                    f4m.t(com.vk.qrcode.d.f, Jn);
                    Jn.setTextSize(16.0f);
                    Jn.setMovementMethod(LinkMovementMethod.getInstance());
                }
                return s3q0.a;
            case 17:
                Context requireContext = ((com.vk.profile.questions.impl.h) obj3).c.requireContext();
                ikv0.a aVar3 = new ikv0.a(requireContext);
                aVar3.u = new ikv0.d(requireContext.getString(R.string.questions_report_sent), (String) null, (ikv0.d.a) null, 6);
                aVar3.n();
                return s3q0.a;
            case 18:
                return new ndf0((ViewGroup) obj, ((gbf0.a) obj3).i);
            case 19:
                cof0 cof0Var = (cof0) obj;
                Iterator<dof0.a> it = ((dof0) obj3).g.iterator();
                while (it.hasNext()) {
                    it.next().a(cof0Var);
                }
                return s3q0.a;
            case 20:
                return Boolean.valueOf(((Attach) obj).xb() == ((c8g0) obj3).c);
            case 21:
                ((Boolean) obj).booleanValue();
                eig0<bhg0> eig0Var = ((ReviewHeaderView) obj3).j;
                if (eig0Var != null) {
                    eig0Var.a(bhg0.e.a);
                }
                return s3q0.a;
            case 22:
                ((o7j) obj3).accept(Float.valueOf(((Integer) obj).intValue() / 100.0f));
                return s3q0.a;
            case 23:
                return new e6h0((ViewGroup) obj, ((u6h0) obj3).i);
            case 24:
                u4a u4aVar = (u4a) obj;
                return new umh0(com.vk.catalog2.common.ui.mvp.configuration.a.e(u4aVar), u4aVar.b.I, (AudienceResearchComponent) ((smh0) obj3).E.getValue());
            case 25:
                ggj ggjVar = (ggj) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (ggjVar.d() & 4294967295L)) - ((Number) ((c1h) obj3).p.getValue()).floatValue();
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ggjVar.d() >> 32));
                er9.b a0 = ggjVar.a0();
                long d = a0.d();
                a0.a().e();
                try {
                    a0.a.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat2, intBitsToFloat, 1);
                    ggjVar.s1();
                    nq.b(a0, d);
                    return s3q0.a;
                } catch (Throwable th5) {
                    nq.b(a0, d);
                    throw th5;
                }
            case 26:
                return Boolean.valueOf(((Collection) obj3).contains(obj));
            case 27:
                l.a aVar4 = ((com.vk.sharing.core.view.f) obj3).D;
                if (aVar4 != null) {
                    aVar4.E2(true);
                }
                return s3q0.a;
            case 28:
                f3l0 f3l0Var = (f3l0) obj3;
                f3l0Var.getClass();
                return new v690(f3l0Var.i, (ViewGroup) obj);
            default:
                com.vk.storycamera.picker.feature.b bVar3 = (com.vk.storycamera.picker.feature.b) obj;
                int i10 = StoryMediaPickerFragment.d0;
                com.vk.storycamera.picker.feature.c cVar = (com.vk.storycamera.picker.feature.c) ((StoryMediaPickerFragment) obj3).Y.getValue();
                FragmentImpl fragmentImpl = cVar.a;
                if (bVar3 instanceof b.a) {
                    fragmentImpl.finish();
                } else if (bVar3 instanceof b.c) {
                    List<MediaStoreEntry> list = ((b.c) bVar3).a;
                    StoriesFeatures storiesFeatures = StoriesFeatures.TRIM_VIDEO;
                    storiesFeatures.getClass();
                    if (com.vk.toggle.b.A.a(storiesFeatures) && list.size() == 1) {
                        MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) j5g.Y(list);
                        if ((mediaStoreEntry instanceof MediaStoreVideoEntry) && ((MediaStoreVideoEntry) mediaStoreEntry).q > 5000 && ((storyCameraParams = cVar.b) == null || (webStoryBox = storyCameraParams.u) == null || !webStoryBox.Db())) {
                            nf9.b.l(((MediaStoreVideoEntry) j5g.Y(list)).q);
                            Iterator it2 = fragmentImpl.getChildFragmentManager().c.f().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = it2.next();
                                    if (((Fragment) obj2) instanceof p3t) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            p3t p3tVar = obj2 instanceof p3t ? (p3t) obj2 : null;
                            if (p3tVar != null) {
                                p3tVar.C7((MediaStoreEntry) j5g.Y(list), new zyl0(cVar, i4), new zzl0(i4));
                            }
                        }
                    }
                    Bundle c = com.vk.storycamera.picker.feature.c.c(list);
                    Intent intent = new Intent();
                    intent.putExtra("result_attachments", c);
                    cVar.b(intent);
                } else {
                    if (!(bVar3 instanceof b.C1845b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b.C1845b c1845b = (b.C1845b) bVar3;
                    MediaStoreEntry mediaStoreEntry2 = c1845b.a;
                    List<MediaStoreEntry> list2 = c1845b.b;
                    Bundle bundle = c1845b.c;
                    Bundle c2 = com.vk.storycamera.picker.feature.c.c(Collections.singletonList(mediaStoreEntry2));
                    Bundle c3 = com.vk.storycamera.picker.feature.c.c(list2);
                    Intent intent2 = new Intent();
                    intent2.putExtra("result_attachments", c2);
                    intent2.putExtra("PRESELECTED_FILES", c3);
                    intent2.putExtra("FROM_COLLAGE", true);
                    intent2.putExtra("COLLAGE_PARAMS", bundle);
                    cVar.d(Collections.singletonList(new StoryCameraGalleryData(mediaStoreEntry2.f(), !(mediaStoreEntry2 instanceof MediaStoreVideoEntry), false, false, 12, null)), intent2.getBundleExtra("TRANSITION_BUNDLE"), true);
                }
                return s3q0.a;
        }
    }
}
