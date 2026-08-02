package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.CompositeDateValidator;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.g;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSearchQueryVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.id.UserId;
import com.vk.dto.donut.DonutLevel;
import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.activities.LikesActivity;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.stickers.StickerItem;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.permission.PermissionHelper;
import com.vk.photos.ui.postingpicker.PostingPhotoAlbumFragment;
import com.vk.photos.ui.postingpicker.PostingPickerPhotosFragment;
import com.vk.posting.data.PickerTechMetricsSession;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stickers.keyboard.navigation.KeyboardNavigationButton;
import com.vk.storycamera.screen.StoryGalleryActivity;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import com.vk.translate.impl.views.TranslateFailedView;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.b;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallRecurrence;
import com.vk.voip.ui.group_selector.VoipGroupSelectorConfig;
import com.vk.voip.ui.group_selector.ui.VoipGroupSelectorFragment;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;
import com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment;
import com.vk.voip.ui.scheduled.creation.ui.settings.VoipScheduledCallSettingsConfig;
import com.vk.voip.ui.scheduled.creation.ui.settings.VoipScheduledCallSettingsFragment;
import com.vk.voip.userid.CallsUserId;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsListFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.av20;
import xsna.bpw0;
import xsna.c2x0;
import xsna.dw20;
import xsna.e3m;
import xsna.fxk0;
import xsna.k0g0;
import xsna.ljk0;
import xsna.m3p0;
import xsna.nfd0;
import xsna.oyw0;
import xsna.qqw0;
import xsna.s7d0;
import xsna.sww0;
import xsna.tj50;
import xsna.u8r0;
import xsna.uqw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class r9c0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r9c0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v143, types: [T, xsna.dw20] */
    /* JADX WARN: Type inference failed for: r1v153, types: [T, xsna.dw20] */
    /* JADX WARN: Type inference failed for: r1v171, types: [T, xsna.dw20] */
    /* JADX WARN: Type inference failed for: r1v180, types: [T, xsna.dw20] */
    /* JADX WARN: Type inference failed for: r25v0, types: [xsna.xww0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ww50<?> Y;
        FragmentImpl u;
        o3c0 o3c0Var;
        Activity activity;
        Object obj2;
        String message;
        dw20.a i;
        Bundle b;
        int i2 = this.b;
        int i3 = 14;
        int i4 = 12;
        int i5 = 4;
        int i6 = 3;
        int i7 = 10;
        int i8 = 1;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                ((com.vk.newsfeed.impl.presenters.b) obj3).i0().S8();
                return s3q0.a;
            case 1:
                PostingPickerPhotosFragment postingPickerPhotosFragment = (PostingPickerPhotosFragment) obj3;
                PhotoAlbum photoAlbum = (PhotoAlbum) obj;
                int i9 = PostingPickerPhotosFragment.I0;
                FragmentActivity activity2 = postingPickerPhotosFragment.getActivity();
                ey50 ey50Var = activity2 instanceof ey50 ? (ey50) activity2 : null;
                if (ey50Var != null && (Y = ey50Var.Y()) != null && (u = Y.u()) != null) {
                    PostingPhotoAlbumFragment.a aVar = new PostingPhotoAlbumFragment.a(postingPickerPhotosFragment.y0.f, photoAlbum);
                    fkl fklVar = postingPickerPhotosFragment.G0;
                    aVar.j.putParcelable("PICKER_TECH_METRICS_SESSION", new PickerTechMetricsSession(fklVar.a, fklVar.b));
                    aVar.g(44, u);
                }
                return s3q0.a;
            case 2:
                Post post = (Post) obj3;
                post.l.Ab(549755813888L, false);
                ce60.b.getClass();
                p870.f().e(156, post);
                return s3q0.a;
            case 3:
                ((Boolean) obj).booleanValue();
                ((m8d0) obj3).g().invoke(s7d0.d.a);
                return s3q0.a;
            case 4:
                xle0 xle0Var = (xle0) obj3;
                NewsEntry newsEntry = (NewsEntry) obj;
                if (((Boolean) xle0Var.e.getValue()).booleanValue() && (activity = (Activity) xle0Var.c.a.get(new Pair(Long.valueOf(k9q0.o(newsEntry).b), Integer.valueOf(di60.n(newsEntry))))) != null && (newsEntry instanceof Post) && (activity instanceof LikesActivity)) {
                    LikesActivity likesActivity = (LikesActivity) activity;
                    if (likesActivity.f == LikesActivity.Position.DEFAULT) {
                        o3c0Var = new o3c0((Post) newsEntry, likesActivity);
                        return pn60.c(xle0Var.d, newsEntry, o3c0Var, null, 12);
                    }
                }
                o3c0Var = null;
                return pn60.c(xle0Var.d, newsEntry, o3c0Var, null, 12);
            case 5:
                Throwable th = (Throwable) obj;
                l1w0 l1w0Var = ((fah0) obj3).d;
                (l1w0Var == null ? null : l1w0Var).a(th);
                return s3q0.a;
            case 6:
                ((tdu) obj).b(((Number) ((c1h) obj3).u.getValue()).floatValue());
                return s3q0.a;
            case 7:
                ((SettingsListFragment) obj3).L0 = (Long) obj;
                return s3q0.a;
            case 8:
                return Boolean.valueOf(epx.f(((qiq) obj).a, (k7k0) obj3));
            case 9:
                return eck0.p((eck0) obj3, (bck0) obj);
            case 10:
                pjk0 pjk0Var = (pjk0) obj3;
                a2e0 a2e0Var = pjk0Var.d;
                if (a2e0Var != null) {
                    a2e0Var.a();
                }
                pjk0Var.d = null;
                pjk0Var.c = null;
                if (pjk0Var.g) {
                    pjk0Var.e = false;
                }
                pjk0Var.i = ljk0.a.a;
                return s3q0.a;
            case 11:
                ((com.vk.clips.sdk.shared.item.static_ads.d) obj3).d.getClass();
                return new fxk0.a(((tj50.a) obj).a(new ha40(i3), ao8.d));
            case 12:
                StickersView stickersView = (StickersView) obj3;
                List<StickerItem> list = (List) obj;
                ral0 ral0Var = stickersView.z;
                sal0 sal0Var = ral0Var.c;
                if (sal0Var != null) {
                    com.vk.stickers.keyboard.page.a aVar2 = sal0Var.c;
                    aVar2.getClass();
                    List<StickerItem> list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(aVar2.L0((StickerItem) it.next(), -1, null, "recent"));
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    int i10 = aVar2.p;
                    if (aVar2.o < list.size() + 1) {
                        aVar2.J0(i10 + 1, arrayList2.subList(0, (list.size() + 1) - aVar2.o));
                        aVar2.o = com.vk.stickers.keyboard.page.a.N0() != null ? list.size() + 2 : list.size() + 1;
                    }
                    aVar2.K0(i10 + 1, arrayList2);
                    aVar2.R0();
                }
                ral0Var.g = list;
                com.vk.stickers.keyboard.navigation.a aVar3 = stickersView.v;
                boolean isEmpty = list.isEmpty();
                boolean z = !isEmpty;
                if (aVar3.n != z) {
                    if (isEmpty) {
                        ArrayList arrayList3 = new ArrayList(aVar3.h);
                        arrayList3.remove(1);
                        aVar3.setItems(arrayList3);
                    } else {
                        igy igyVar = new igy(KeyboardNavigationButton.RECENT, false);
                        ArrayList arrayList4 = new ArrayList(aVar3.h);
                        arrayList4.add(0, igyVar);
                        aVar3.setItems(arrayList4);
                    }
                    aVar3.n = z;
                }
                return s3q0.a;
            case 13:
                WeakReference<View> weakReference = StoryGalleryActivity.F;
                ((fda0) obj3).invoke(Boolean.FALSE);
                return s3q0.a;
            case 14:
                m3p0 m3p0Var = (m3p0) obj3;
                tho0 tho0Var = (tho0) obj;
                m3p0.a a = m3p0.a.a(m3p0Var.j, null, false, tho0Var, false, 11);
                m3p0Var.j = a;
                m3p0Var.e.invoke(a);
                m3p0Var.l.onNext(tho0Var.a.c);
                return s3q0.a;
            case 15:
                TranslateFailedView.a aVar4 = ((TranslateFailedView) obj3).b;
                if (aVar4 != null) {
                    ((com.vk.translate.impl.views.b) ((tp1) aVar4).c).a.f1();
                }
                return s3q0.a;
            case 16:
                g7q0 g7q0Var = (g7q0) obj3;
                if (g7q0Var.m <= 0) {
                    pgn pgnVar = g7q0Var.i;
                    qcy<Object> qcyVar = g7q0.q[0];
                    io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) pgnVar.b;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    a7q0 a7q0Var = g7q0Var.b;
                    a7q0Var.Z(false);
                    a7q0Var.S3();
                    g7q0Var.h.invoke();
                }
                return s3q0.a;
            case 17:
                ((fpq0) obj3).T((com.vk.profile.user.impl.ui.b) obj);
                return s3q0.a;
            case 18:
                Throwable th2 = (Throwable) obj;
                if (((u8r0) obj3).i) {
                    return new u8r0.a.C3791a(th2);
                }
                throw th2;
            case 19:
                ((edd) obj3).invoke((Throwable) obj);
                return s3q0.a;
            case 20:
                k6t0 k6t0Var = (k6t0) obj3;
                DonutLevel donutLevel = (DonutLevel) obj;
                nfd0 nfd0Var = k6t0Var.G;
                Iterator<T> it2 = nfd0Var.h.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (epx.f(((nfd0.b) next).c, PrivacyRules.f)) {
                            obj2 = next;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                nfd0.b bVar = (nfd0.b) obj2;
                if (bVar == null) {
                    return s3q0.a;
                }
                nfd0Var.g = donutLevel;
                nfd0Var.e = nfd0.a.a(bVar.a, true, donutLevel);
                k6t0Var.n1();
                return s3q0.a;
            case 21:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i11 = VideoRelatedVideosFragment.n0;
                xn50.a.c((VideoRelatedVideosFragment) obj3, new b.c(booleanValue));
                return s3q0.a;
            case 22:
                efj0 efj0Var = new efj0(((ViewGroup) obj).getContext(), (dfj0) ((uxt0) obj3).a0.getValue());
                efj0Var.l.getContentView();
                return efj0Var;
            case 23:
                xbv0 xbv0Var = (xbv0) obj3;
                Throwable th3 = (Throwable) obj;
                if ((th3 instanceof VKApiExecutionException) && (message = ((VKApiExecutionException) th3).getMessage()) != null) {
                    xbv0Var.f.getClass();
                    cvk.w(message, false);
                }
                xbv0Var.a7();
                return s3q0.a;
            case 24:
                return Boolean.valueOf(((ufv0) obj).a(((rfv0) obj3).a));
            case 25:
                gzs<s3q0> gzsVar = ((VkSearchQueryVh) obj3).e;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 26:
                zxv0 zxv0Var = (zxv0) obj3;
                LinkedHashSet linkedHashSet = zxv0Var.g;
                UserId userId = ((WebUserShortInfo) obj).b;
                if (linkedHashSet.contains(userId)) {
                    linkedHashSet.remove(userId);
                } else {
                    linkedHashSet.add(userId);
                }
                zxv0Var.e.invoke(linkedHashSet);
                return s3q0.a;
            case 27:
                VoipCreateScheduleCallFragment voipCreateScheduleCallFragment = (VoipCreateScheduleCallFragment) obj3;
                sww0 sww0Var = (sww0) obj;
                int i12 = VoipCreateScheduleCallFragment.S;
                if (sww0Var instanceof sww0.a) {
                    voipCreateScheduleCallFragment.close();
                } else if (sww0Var instanceof sww0.e) {
                    CallsUserId callsUserId = ((sww0.e) sww0Var).a;
                    VoipGroupSelectorConfig voipGroupSelectorConfig = new VoipGroupSelectorConfig("REQUEST_KEY_SCHEDULE_AS", callsUserId != null ? com.vk.voip.userid.a.b(callsUserId) : null, new VoipGroupSelectorConfig.TitleConfig.ResId(R.string.voip_call_by_link_call_as), new VoipGroupSelectorConfig.ButtonConfig.ResId(R.string.voip_call_by_link_call_as_button), true, false, 32, null);
                    vbs In = voipCreateScheduleCallFragment.In();
                    VoipGroupSelectorFragment voipGroupSelectorFragment = new VoipGroupSelectorFragment();
                    voipGroupSelectorFragment.setArguments(yfb.b(new Pair("arg_config", voipGroupSelectorConfig)));
                    voipGroupSelectorFragment.Fn(In, "VoipGroupSelectorFragment");
                } else if (sww0Var instanceof sww0.h) {
                    Context requireContext = voipCreateScheduleCallFragment.requireContext();
                    sww0.h hVar = (sww0.h) sww0Var;
                    CallId callId = hVar.a;
                    g1x0 g1x0Var = hVar.b;
                    f1x0 f1x0Var = hVar.c;
                    String str = hVar.d;
                    oyw0 oyw0Var = new oyw0(requireContext, callId, g1x0Var, f1x0Var, str, new mcd(voipCreateScheduleCallFragment, 7), new dnw0(2, voipCreateScheduleCallFragment, VoipCreateScheduleCallFragment.class, "sendActionAnalytics", "sendActionAnalytics(Lcom/vk/voip/api/id/CallId;Lcom/vk/stat/scheme/MobileOfficialAppsCallsStat$TypeVoipCallItem$SharingChannel;)V", 0));
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ylw ylwVar = new ylw(R.drawable.vk_icon_mail_outline_24);
                    ylwVar.e = -1.0f;
                    ylwVar.d = true;
                    ylwVar.c = 3;
                    float f = 2;
                    ylwVar.f = iah0.a(f);
                    spannableStringBuilder.append((CharSequence) ylwVar.b(requireContext));
                    spannableStringBuilder.append((CharSequence) "  ");
                    spannableStringBuilder.append((CharSequence) requireContext.getString(R.string.voip_schedule_call_share_by_email));
                    SpannedString spannedString = new SpannedString(spannableStringBuilder);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    ylw ylwVar2 = new ylw(R.drawable.vk_icon_calendar_outline_24);
                    ylwVar2.e = -1.0f;
                    ylwVar2.d = true;
                    ylwVar2.c = 3;
                    ylwVar2.f = iah0.a(f);
                    spannableStringBuilder2.append((CharSequence) ylwVar2.b(requireContext));
                    spannableStringBuilder2.append((CharSequence) "  ");
                    spannableStringBuilder2.append((CharSequence) requireContext.getString(R.string.voip_schedule_call_add_to_calendar));
                    SpannedString spannedString2 = new SpannedString(spannableStringBuilder2);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    ylw ylwVar3 = new ylw(R.drawable.vk_icon_share_outline_24);
                    ylwVar3.e = -1.0f;
                    ylwVar3.d = true;
                    ylwVar3.c = 3;
                    ylwVar3.f = iah0.a(f);
                    spannableStringBuilder3.append((CharSequence) ylwVar3.b(requireContext));
                    spannableStringBuilder3.append((CharSequence) "  ");
                    spannableStringBuilder3.append((CharSequence) requireContext.getString(R.string.voip_schedule_call_share_link));
                    SpannedString spannedString3 = new SpannedString(spannableStringBuilder3);
                    View inflate = LayoutInflater.from(requireContext).inflate(R.layout.modal_dialog_bottom_sheet_tertiary_button, (ViewGroup) null);
                    ((TextView) hvt0.a(R.id.button, inflate, new q7a0(15, ref$ObjectRef2, oyw0Var))).setText(spannedString3);
                    ref$ObjectRef.element = ((dw20.b) ((dw20.b) new oyw0.a.C3479a(requireContext, f1x0Var.h).M(R.drawable.vk_icon_check_circle_outline_56, Integer.valueOf(R.attr.vk_ui_icon_accent)).w0(requireContext.getString(R.string.voip_schedule_call_success_title)).s0(str).j0(spannedString, new km1(26, ref$ObjectRef2, oyw0Var)).V(spannedString2, new q34(ref$ObjectRef2, oyw0Var, ref$ObjectRef, 9)).z(inflate).o()).q(false).p(false).F(dhr0.t.b(R.drawable.vk_icon_cancel_outline_28, R.attr.vk_ui_icon_accent_themed), null)).b0(new jad0(ref$ObjectRef, i8)).M0().d0(new m5o0(oyw0Var, 16)).a0(new defpackage.t(ref$ObjectRef2, oyw0Var, ref$ObjectRef, 5)).I0("VoipScheduledCallShareDialog");
                } else if (sww0Var instanceof sww0.b) {
                    sww0.b bVar2 = (sww0.b) sww0Var;
                    new qqw0.a(bVar2.a, bVar2.b, voipCreateScheduleCallFragment.requireContext()).I0("VoipInviteToScheduledCallBottomSheet");
                    voipCreateScheduleCallFragment.close();
                } else if (sww0Var instanceof sww0.g) {
                    Context requireContext2 = voipCreateScheduleCallFragment.requireContext();
                    sww0.g gVar = (sww0.g) sww0Var;
                    ScheduledCallRecurrence scheduledCallRecurrence = gVar.a;
                    k7l0 k7l0Var = new k7l0(voipCreateScheduleCallFragment, 26);
                    Calendar calendar = gVar.b;
                    bxw0 bxw0Var = new bxw0(requireContext2, scheduledCallRecurrence, k7l0Var, calendar);
                    Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                    av20.a aVar5 = new av20.a();
                    aVar5.d(R.layout.voip_repeat_end_item_view, LayoutInflater.from(requireContext2));
                    aVar5.d = new zww0(bxw0Var, calendar);
                    aVar5.e = new axw0(bxw0Var, ref$ObjectRef3);
                    av20 b2 = aVar5.b();
                    b2.setItems(rl3.u0(ScheduledCallRecurrence.values()));
                    RecyclerView recyclerView = new RecyclerView(requireContext2);
                    recyclerView.setId(R.id.recycler);
                    recyclerView.setAdapter(b2);
                    recyclerView.getContext();
                    recyclerView.setLayoutManager(new LinearLayoutManager());
                    Context context = recyclerView.getContext();
                    e3m.a aVar6 = e3m.a;
                    Drawable a2 = m33.a(R.drawable.voip_bottom_sheet_dialog_top_separator, context);
                    if (a2 != null) {
                        recyclerView.addItemDecoration(new x8p0(a2, cn70.b(16)));
                    }
                    ref$ObjectRef3.element = ((dw20.b) new dw20.b(requireContext2, null).w0(requireContext2.getString(R.string.voip_schedule_call_repeat_title)).c(new cpo(false, 0, 7)).A(cn70.b(14)).J().D0(recyclerView, false)).I0("VoipScheduleCallRepeatPicker");
                } else if (sww0Var instanceof sww0.f) {
                    final Context requireContext3 = voipCreateScheduleCallFragment.requireContext();
                    sww0.f fVar = (sww0.f) sww0Var;
                    final long j = fVar.a;
                    final mvo0 mvo0Var = fVar.b;
                    tzq0 tzq0Var = new tzq0(voipCreateScheduleCallFragment, i7);
                    Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                    final hmj0 hmj0Var = new hmj0(i7, tzq0Var, ref$ObjectRef4);
                    dw20.b c = new dw20.b(requireContext3, null).w0(requireContext3.getString(R.string.voip_schedule_call_repeat_end_title)).c(new cpo(false, iah0.a(150), 3));
                    boolean z2 = mvo0Var != null;
                    List<? extends hfz> l = e43.l(new k0g0.a(!z2), new k0g0.b(z2, mvo0Var));
                    afl0 afl0Var = new afl0(hmj0Var, 29);
                    ?? r25 = new gzs() { // from class: xsna.xww0
                        @Override // xsna.gzs
                        public final Object invoke() {
                            boolean z3;
                            FragmentManager supportFragmentManager;
                            mvo0 mvo0Var2 = mvo0Var;
                            long j2 = mvo0Var2 != null ? mvo0Var2.a : j;
                            Context context2 = requireContext3;
                            while (true) {
                                z3 = context2 instanceof AppCompatActivity;
                                if (z3 || !(context2 instanceof ContextWrapper)) {
                                    break;
                                }
                                context2 = ((ContextWrapper) context2).getBaseContext();
                            }
                            AppCompatActivity appCompatActivity = (AppCompatActivity) (z3 ? (android.app.Activity) context2 : null);
                            if (appCompatActivity != null && (supportFragmentManager = appCompatActivity.getSupportFragmentManager()) != null) {
                                long Hn = com.google.android.material.datepicker.g.Hn();
                                Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                                calendar2.setTimeInMillis(Hn);
                                calendar2.set(1, calendar2.get(1) + 1);
                                calendar2.add(5, -1);
                                long timeInMillis = calendar2.getTimeInMillis();
                                CompositeDateValidator compositeDateValidator = new CompositeDateValidator(e43.l(new DateValidatorPointForward(Hn), new DateValidatorPointBackward(timeInMillis)), CompositeDateValidator.e);
                                CalendarConstraints.b bVar3 = new CalendarConstraints.b();
                                bVar3.a = Hn;
                                bVar3.b = timeInMillis;
                                bVar3.e = compositeDateValidator;
                                CalendarConstraints a3 = bVar3.a();
                                g.d<Long> b3 = g.d.b();
                                b3.d = Long.valueOf(j2);
                                b3.b = a3;
                                com.google.android.material.datepicker.g<Long> a4 = b3.a();
                                a4.Td(supportFragmentManager, com.google.android.material.datepicker.g.class.getName());
                                final sxl0 sxl0Var = new sxl0(hmj0Var, 18);
                                a4.x.add(new lm10() { // from class: xsna.yww0
                                    @Override // xsna.lm10
                                    public final void a(Object obj4) {
                                        sxl0.this.invoke(obj4);
                                    }
                                });
                            }
                            return s3q0.a;
                        }
                    };
                    i0g0 i0g0Var = new i0g0();
                    i0g0Var.y0(new j0g0(afl0Var));
                    i0g0Var.y0(new l0g0(r25));
                    i0g0Var.setItems(l);
                    i = c.i(i0g0Var, (r3 & 2) == 0, false);
                    ref$ObjectRef4.element = ((dw20.b) ((dw20.b) i).J()).A(cn70.b(10)).I0("VoipScheduleCallRepeatEndPicker");
                } else if (sww0Var instanceof sww0.i) {
                    int i13 = hxw0.D;
                    Context requireContext4 = voipCreateScheduleCallFragment.requireContext();
                    sww0.i iVar = (sww0.i) sww0Var;
                    List<VoipScheduleCallTimeZone> list3 = iVar.b;
                    VoipScheduleCallTimeZone voipScheduleCallTimeZone = iVar.a;
                    u5p0 u5p0Var = new u5p0(voipCreateScheduleCallFragment, 20);
                    Ref$ObjectRef ref$ObjectRef5 = new Ref$ObjectRef();
                    hxw0 hxw0Var = new hxw0(requireContext4, voipScheduleCallTimeZone, list3, u5p0Var, new qwf0(ref$ObjectRef5, i8));
                    hxw0Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    ref$ObjectRef5.element = new dw20.b(requireContext4, null).w0(requireContext4.getString(R.string.voip_schedule_call_utc_title)).c(new ts90(1.0f, 2)).D0(hxw0Var, false).I0("TIMEZONE_PICKER_FRAGMENT_TAG");
                } else if (sww0Var instanceof sww0.j) {
                    new qyw0(voipCreateScheduleCallFragment.requireContext(), ((sww0.j) sww0Var).a, new qzl0(voipCreateScheduleCallFragment, 22)).a();
                } else if (sww0Var instanceof sww0.d) {
                    new uxw0(voipCreateScheduleCallFragment.requireContext(), ((sww0.d) sww0Var).a, new olt0(voipCreateScheduleCallFragment, 5)).a();
                } else {
                    if (!(sww0Var instanceof sww0.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context requireContext5 = voipCreateScheduleCallFragment.requireContext();
                    VoipScheduledCallSettingsConfig voipScheduledCallSettingsConfig = ((sww0.c) sww0Var).a;
                    VoipScheduledCallSettingsFragment.a aVar7 = new VoipScheduledCallSettingsFragment.a(VoipScheduledCallSettingsFragment.class, null, null);
                    aVar7.j.putParcelable("KEY_SCHEDULED_CALL_SETTINGS_CONFIG", voipScheduledCallSettingsConfig);
                    aVar7.s(true);
                    aVar7.k(requireContext5);
                }
                return s3q0.a;
            case 28:
                VoipGroupSelectorFragment voipGroupSelectorFragment2 = (VoipGroupSelectorFragment) obj3;
                bpw0 bpw0Var = (bpw0) obj;
                int i14 = VoipGroupSelectorFragment.R;
                if (bpw0Var instanceof bpw0.a) {
                    b = yfb.b(new Pair("result_key_group_id", UserId.d));
                } else if (bpw0Var instanceof bpw0.b) {
                    b = yfb.b(new Pair("result_key_group_id", null));
                } else {
                    if (!(bpw0Var instanceof bpw0.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b = yfb.b(new Pair("result_key_group_id", ((bpw0.c) bpw0Var).b));
                }
                voipGroupSelectorFragment2.getParentFragmentManager().k0(b, bpw0Var.a());
                return s3q0.a;
            default:
                qqw0 qqw0Var = (qqw0) obj3;
                uqw0 uqw0Var = (uqw0) obj;
                int i15 = qqw0.j1;
                if (uqw0Var instanceof uqw0.c) {
                    nr4.b().k(qqw0Var.requireContext(), ((uqw0.c) uqw0Var).a);
                } else if (uqw0Var instanceof uqw0.b) {
                    g1x0 g1x0Var2 = ((uqw0.b) uqw0Var).a;
                    Uri uriForFile = FileProvider.getUriForFile(qqw0Var.requireContext(), BuildInfo.f, g1x0Var2.c);
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("application/ics");
                    intent.putExtra("android.intent.extra.SUBJECT", g1x0Var2.a);
                    intent.putExtra("android.intent.extra.TEXT", brm0.y(g1x0Var2.b, "\\n", "\n"));
                    intent.putExtra("android.intent.extra.STREAM", uriForFile);
                    intent.addFlags(1);
                    List<ResolveInfo> queryIntentActivities = qqw0Var.requireContext().getPackageManager().queryIntentActivities(intent, 0);
                    ArrayList arrayList5 = new ArrayList();
                    for (ResolveInfo resolveInfo : queryIntentActivities) {
                        String str2 = resolveInfo.activityInfo.packageName;
                        if (!rl3.G(new String[]{"com.google.android.gm", "com.my.mail", "ru.yandex.mail", "com.vk.mail", "ru.mail.mailapp", "com.microsoft.office.outlook"}, str2)) {
                            arrayList5.add(new ComponentName(str2, resolveInfo.activityInfo.name));
                        }
                    }
                    if (arrayList5.size() == queryIntentActivities.size()) {
                        cvk.w("No apps to share!", false);
                    } else {
                        Intent createChooser = Intent.createChooser(intent, null);
                        createChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", (Parcelable[]) arrayList5.toArray(new ComponentName[0]));
                        s3q0 s3q0Var = s3q0.a;
                        qqw0Var.startActivity(createChooser);
                    }
                } else if (uqw0Var instanceof uqw0.a) {
                    com.vk.im.video.f fVar2 = new com.vk.im.video.f(qqw0Var, ((uqw0.a) uqw0Var).a, new w7w0(qqw0Var, i6), i5);
                    tzq0 tzq0Var2 = new tzq0(fVar2, i4);
                    PermissionHelper permissionHelper = PermissionHelper.a;
                    Context mo2getContext = qqw0Var.mo2getContext();
                    permissionHelper.getClass();
                    permissionHelper.d(mo2getContext, PermissionHelper.w, R.string.voip_schedule_call_calendar_permission_rationale, R.string.voip_schedule_call_calendar_permission_settings_rationale, fVar2, tzq0Var2);
                } else {
                    if (!(uqw0Var instanceof uqw0.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    new c2x0.a(((uqw0.d) uqw0Var).a, qqw0Var.requireContext()).I0("VoipShareQRCodeModalDialog");
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ r9c0(edd eddVar, abs0 abs0Var, android.app.Activity activity) {
        this.b = 19;
        this.c = eddVar;
    }
}
