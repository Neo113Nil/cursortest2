package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Size;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.group.Group;
import com.vk.dto.market.catalog.CatalogMarketStatusOption;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.ecomm.design.compose.product_info.f;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.live.impl.base.LiveStatNew;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.metrics.trackers.my.event.SingleEvent;
import com.vk.music.offline.api.model.storage.StorageEvent;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.photos.root.photoflow.presentation.d;
import com.vk.photos.root.photoflow.tags.presentation.PhotoTagsFragment;
import com.vk.settings.impl.presentation.base.fragment.setting.NotificationSettingFragment;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.text.Regex;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import xsna.bzd0;
import xsna.cca0;
import xsna.d4p;
import xsna.dbi0;
import xsna.dda0;
import xsna.dn90;
import xsna.ejd0;
import xsna.gbi0;
import xsna.gm50;
import xsna.h7u0;
import xsna.if70;
import xsna.ifk0;
import xsna.ikv0;
import xsna.k840;
import xsna.l110;
import xsna.lh70;
import xsna.qfa0;
import xsna.qg8;
import xsna.su40;
import xsna.tj50;
import xsna.tzp0;
import xsna.uca0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class mgz implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mgz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        LiveStatNew liveStatNew;
        Dialog dialog;
        Window window;
        Dialog dialog2;
        Window window2;
        ru40 ru40Var;
        ww50<?> Y;
        FragmentImpl u;
        NewsEntry newsEntry;
        UserId userId;
        Group group;
        Object obj2;
        Owner owner;
        ejd0 ejd0Var;
        ejd0 c2819f;
        int i = 2;
        int i2 = 12;
        switch (this.b) {
            case 0:
                ngz ngzVar = (ngz) this.c;
                qg8.d dVar = qg8.d.a;
                izs<? super qg8, s3q0> izsVar = ngzVar.l;
                if (izsVar != null) {
                    izsVar.invoke(dVar);
                }
                return s3q0.a;
            case 1:
                gcp0 gcp0Var = (gcp0) this.c;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                gcp0Var.invoke(bool, Boolean.FALSE);
                return s3q0.a;
            case 2:
                piz pizVar = (piz) this.c;
                VideoFile videoFile = (VideoFile) obj;
                if (videoFile.U()) {
                    oiz presenter = pizVar.getPresenter();
                    com.vk.libvideo.live.impl.views.live.b bVar = presenter instanceof com.vk.libvideo.live.impl.views.live.b ? (com.vk.libvideo.live.impl.views.live.b) presenter : null;
                    if (bVar != null && (liveStatNew = bVar.W) != null) {
                        liveStatNew.c(videoFile.I0());
                    }
                }
                return s3q0.a;
            case 3:
                Float f = (Float) obj;
                ((v6p0) this.c).a().R0(1, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(f.floatValue()) & 4294967295L));
                return f;
            case 4:
                MarketItemCommentsFragment marketItemCommentsFragment = (MarketItemCommentsFragment) this.c;
                int i3 = MarketItemCommentsFragment.j0;
                gm50.a.a(marketItemCommentsFragment, ((l110.d) obj).a, new p010(marketItemCommentsFragment, null == true ? 1 : 0));
                marketItemCommentsFragment.fo(MarketItemCommentsFragment.b.LOADING);
                return s3q0.a;
            case 5:
                List O0 = j5g.O0(((Map) this.c).entrySet());
                ((rry) obj).a(O0.size(), new fd10(new cd10(null == true ? 1 : 0), O0), new gd10(O0, 0), new jai(-1117249557, new hd10(O0), true));
                return s3q0.a;
            case 6:
                gt20 gt20Var = (gt20) this.c;
                dt20 dt20Var = new dt20(((d4p.a) obj).a, gt20Var.j);
                gt20Var.g = dt20Var;
                return new io.reactivex.rxjava3.internal.operators.observable.q(new pj4(dt20Var, 27));
            case 7:
                nw20 nw20Var = (nw20) this.c;
                izs<? super View, s3q0> izsVar2 = nw20Var.N;
                if (izsVar2 != null) {
                    ImageView imageView = nw20Var.e0;
                    izsVar2.invoke(imageView == null ? null : imageView);
                }
                return s3q0.a;
            case 8:
                u440 u440Var = (u440) this.c;
                ListDataSet listDataSet = u440Var.C0;
                zif0 zif0Var = listDataSet != null ? (zif0) listDataSet.c(u440Var.getCurrentIndex()) : null;
                h640 h640Var = zif0Var instanceof h640 ? (h640) zif0Var : null;
                int currentIndex = u440Var.getCurrentIndex();
                tam0 tam0Var = u440Var.B0;
                if (tam0Var != null) {
                    fh9 fh9Var = u440Var.v0;
                    StoryUploadParams storyUploadParams = u440Var.l;
                    storyUploadParams.getClass();
                    u440Var.w0.b(fh9Var.b(tam0Var, new StoryUploadParams(storyUploadParams)).r0(k86.n0).a0(asu0.a.d()).subscribe(new zk30(new fs5(h640Var, u440Var, currentIndex, i), 1), kwg0.b()));
                }
                return s3q0.a;
            case 9:
                return Boolean.valueOf(epx.f(((UIBlockList) obj).b, (String) this.c));
            case 10:
                final rt40 rt40Var = (rt40) this.c;
                su40 su40Var = (su40) obj;
                tzp0.c.a aVar = rt40.s1;
                int i4 = 8;
                int i5 = 3;
                if (su40Var instanceof su40.b) {
                    su40.b bVar2 = (su40.b) su40Var;
                    if (bVar2 instanceof su40.b.a) {
                        rt40Var.hide();
                    } else if (bVar2 instanceof su40.b.C3690b) {
                        Context mo2getContext = rt40Var.mo2getContext();
                        if (mo2getContext != null && (ru40Var = rt40Var.k1) != null) {
                            MusicDto a = jq4.a(mo2getContext, ((su40.b.C3690b) bVar2).a);
                            ru40Var.c(kbc0.h(a));
                            ru40Var.f(a);
                        }
                        rt40Var.hide();
                    } else if (bVar2 instanceof su40.b.c) {
                        su40.b.c cVar = (su40.b.c) bVar2;
                        MusicDto musicDto = cVar.a;
                        ru40 ru40Var2 = rt40Var.k1;
                        if (ru40Var2 != null) {
                            List<MusicDto> list = cVar.c;
                            MusicDto musicDto2 = cVar.b;
                            if (musicDto != null) {
                                ru40Var2.c(kbc0.h(musicDto));
                                ru40Var2.f(musicDto);
                            } else if (musicDto2 != null) {
                                ru40Var2.d(kbc0.h(musicDto2));
                                ru40Var2.g(true);
                                ru40Var2.e(musicDto2);
                            } else {
                                Iterator<MusicDto> it = list.iterator();
                                while (it.hasNext()) {
                                    ru40Var2.d(kbc0.h(it.next()));
                                }
                                ru40Var2.k(list);
                            }
                        }
                        rt40Var.hide();
                    } else if (bVar2 instanceof su40.b.e) {
                        su40.b.e eVar = (su40.b.e) bVar2;
                        Context mo2getContext2 = rt40Var.mo2getContext();
                        if (mo2getContext2 != null) {
                            new gbi0.a(mo2getContext2, eVar.a, new bq00(rt40Var, 11), new o440(rt40Var, i5)).I0(null);
                        }
                    } else {
                        if (!(bVar2 instanceof su40.b.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        su40.b.d dVar2 = (su40.b.d) bVar2;
                        Context mo2getContext3 = rt40Var.mo2getContext();
                        if (mo2getContext3 != null) {
                            new dbi0.a(mo2getContext3, dVar2.b, dVar2.a, new f410(rt40Var, i2), new hb40(rt40Var, 1), new nl30(rt40Var, 4), new t210(rt40Var, i4)).I0(null);
                        }
                        ru40 ru40Var3 = rt40Var.k1;
                        if (ru40Var3 != null) {
                            ru40Var3.h();
                        }
                        ru40 ru40Var4 = rt40Var.k1;
                        if (ru40Var4 != null) {
                            ru40Var4.j();
                        }
                    }
                } else if (!(su40Var instanceof su40.c)) {
                    if (su40Var instanceof uu40) {
                        io.reactivex.rxjava3.internal.operators.completable.m mVar = new io.reactivex.rxjava3.internal.operators.completable.m(new bp0(rt40Var, i5));
                        asu0.a.getClass();
                        rt40Var.j1.b(itg0.l(mVar.q(asu0.m())));
                    } else if (su40Var instanceof vu40) {
                        ru40 ru40Var5 = rt40Var.k1;
                        if (ru40Var5 != null) {
                            ru40Var5.a(((vu40) su40Var).a);
                        }
                    } else if (su40Var instanceof su40.a) {
                        su40.a aVar2 = (su40.a) su40Var;
                        if (aVar2 instanceof su40.a.b) {
                            final su40.a.b bVar3 = (su40.a.b) aVar2;
                            Context mo2getContext4 = rt40Var.mo2getContext();
                            if (mo2getContext4 != null) {
                                int i6 = h7u0.p;
                                h7u0.a c = h7u0.b.c(mo2getContext4);
                                c.g0(R.string.music_picker_dialog_has_tracks_add_track_title);
                                c.U(R.string.music_picker_dialog_has_tracks_add_track_message);
                                c.c0(R.string.music_picker_dialog_has_tracks_add_track_positive_button, new DialogInterface.OnClickListener() { // from class: xsna.pt40
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i7) {
                                        tzp0.c.a aVar3 = rt40.s1;
                                        gs40 gs40Var = new gs40(bVar3.a, false);
                                        rt40 rt40Var2 = rt40.this;
                                        rt40Var2.getClass();
                                        xn50.a.c(rt40Var2, gs40Var);
                                    }
                                });
                                c.W(R.string.music_picker_dialog_has_tracks_add_track_negative_button, new qt40());
                                c.m();
                            }
                        } else if (aVar2 instanceof su40.a.C3689a) {
                            Context mo2getContext5 = rt40Var.mo2getContext();
                            if (mo2getContext5 != null) {
                                int i7 = h7u0.p;
                                h7u0.a c2 = h7u0.b.c(mo2getContext5);
                                c2.g0(R.string.music_picker_dialog_has_tracks_add_playlist_title);
                                c2.U(R.string.music_picker_dialog_has_tracks_add_playlist_message);
                                c2.c0(R.string.music_picker_dialog_has_tracks_add_playlist_positive_button, new gpd(rt40Var, 1));
                                c2.W(R.string.music_picker_dialog_has_tracks_add_playlist_negative_button, new nt40());
                                c2.m();
                            }
                        } else if (aVar2 instanceof su40.a.c) {
                            su40.a.c cVar2 = (su40.a.c) aVar2;
                            Context mo2getContext6 = rt40Var.mo2getContext();
                            if (mo2getContext6 != null && (dialog2 = rt40Var.s) != null && (window2 = dialog2.getWindow()) != null) {
                                ikv0.a aVar3 = new ikv0.a(mo2getContext6);
                                int i8 = ify.a;
                                if (ify.e(ify.c)) {
                                    aVar3.e(iah0.a(68) + iah0.a(8) + ify.d(3, null));
                                } else {
                                    aVar3.e(iah0.a(68) + iah0.a(8));
                                }
                                float f2 = 24;
                                aVar3.t = new ikv0.c.C3058c(R.drawable.vk_icon_info_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent), new Size(iah0.a(f2), iah0.a(f2)), 8);
                                Resources resources = mo2getContext6.getResources();
                                int i9 = cVar2.a;
                                aVar3.u = new ikv0.d(resources.getQuantityString(R.plurals.music_picker_audio_max_count_reached, i9, Integer.valueOf(i9)), (String) null, (ikv0.d.a) null, 6);
                                aVar3.p(window2);
                            }
                        } else {
                            if (!(aVar2 instanceof su40.a.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Context mo2getContext7 = rt40Var.mo2getContext();
                            if (mo2getContext7 != null && (dialog = rt40Var.s) != null && (window = dialog.getWindow()) != null) {
                                ikv0.a aVar4 = new ikv0.a(mo2getContext7);
                                int i10 = ify.a;
                                if (ify.e(ify.c)) {
                                    aVar4.e(iah0.a(68) + iah0.a(8) + ify.d(3, null));
                                } else {
                                    aVar4.e(iah0.a(68) + iah0.a(8));
                                }
                                float f3 = 24;
                                aVar4.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_negative), new Size(iah0.a(f3), iah0.a(f3)), 8);
                                aVar4.u = new ikv0.d(y8g0.e(R.string.music_picker_error_playlist_privacy), (String) null, (ikv0.d.a) null, 6);
                                aVar4.p(window);
                            }
                        }
                    } else {
                        if (!su40Var.equals(tu40.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ru40 ru40Var6 = rt40Var.k1;
                        if (ru40Var6 != null) {
                            ru40Var6.j();
                        }
                    }
                }
                return s3q0.a;
            case 11:
                UserId userId2 = (UserId) this.c;
                bn40.g("AudioUnfollowOwner", (BaseBoolIntDto) obj);
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(new v490(userId2, false));
                return s3q0.a;
            case 12:
                n850 n850Var = (n850) this.c;
                ((h850) n850Var.d.getValue()).getClass();
                ((i850) n850Var.b.getValue()).getClass();
                return s3q0.a;
            case 13:
                yi50 yi50Var = (yi50) this.c;
                return ((zi50) yi50Var.f.getValue()).a(cj50.a((List) obj, new kp1(yi50Var.e, 10))).l(new q40(new u4u(17), 25));
            case 14:
                View view = (View) obj;
                cjx cjxVar = ((kq50) this.c).J;
                if (cjxVar != null) {
                    cjxVar.p(view, "DEFAULT");
                }
                return s3q0.a;
            case 15:
                NotificationSettingFragment notificationSettingFragment = (NotificationSettingFragment) this.c;
                if70 if70Var = (if70) obj;
                qcy<Object>[] qcyVarArr = NotificationSettingFragment.W;
                if (if70Var.equals(if70.a.a)) {
                    notificationSettingFragment.finish();
                } else if (if70Var instanceof if70.b) {
                    if70.b bVar4 = (if70.b) if70Var;
                    notificationSettingFragment.kn().getSupportFragmentManager().k0(yfb.b(new Pair("setting_id", bVar4.a), new Pair("sources_count", Integer.valueOf(bVar4.b))), "notification_setting_status_change");
                } else {
                    if (!(if70Var instanceof if70.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FragmentManager supportFragmentManager = notificationSettingFragment.kn().getSupportFragmentManager();
                    NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto = ((if70.c) if70Var).a;
                    supportFragmentManager.k0(yfb.b(new Pair("setting", notificationsNotificationSettingRedesignDto)), "notification_setting_status_change");
                    notificationSettingFragment.kn().getSupportFragmentManager().k0(yfb.b(new Pair("setting", notificationsNotificationSettingRedesignDto)), "notification_section_status_change");
                }
                return s3q0.a;
            case 16:
                kh70 kh70Var = (kh70) this.c;
                tj50.a aVar5 = (tj50.a) obj;
                hh70 hh70Var = hh70.b;
                ao8 ao8Var = ao8.d;
                return new lh70.a(aVar5.a(hh70Var, ao8Var), aVar5.a(ih70.b, ao8Var), aVar5.a(new e750(kh70Var, i), ao8Var), aVar5.a(jh70.b, ao8Var), aVar5.a(new tcu(16), ao8Var), aVar5.a(new ehu(19), ao8Var), aVar5.a(new byo(14), ao8Var));
            case 17:
                j490 j490Var = (j490) this.c;
                rct0 rct0Var = j490Var.a;
                ConversationVideoTrackParticipantKey ownVideoTrack = rct0Var.getOwnVideoTrack();
                if (ownVideoTrack != null) {
                    rct0Var.setMirror(ownVideoTrack, j490Var.a());
                }
                return s3q0.a;
            case 18:
                ((bn90) this.c).T(new dn90.a.C2742a((Throwable) obj));
                return s3q0.a;
            case 19:
                ((com.vk.photos.root.photoflow.presentation.b) this.c).T(new d.m(((Boolean) obj).booleanValue()));
                return s3q0.a;
            case 20:
                final PhotoTagsFragment photoTagsFragment = (PhotoTagsFragment) this.c;
                bpn0 bpn0Var = photoTagsFragment.S;
                dda0 dda0Var = (dda0) obj;
                int i11 = PhotoTagsFragment.U;
                if (dda0Var.equals(dda0.b.a)) {
                    vca0 vca0Var = (vca0) photoTagsFragment.R.getValue();
                    FragmentActivity kn = photoTagsFragment.kn();
                    Object obj3 = uca0.a.a;
                    vca0Var.getClass();
                    if (!obj3.equals(obj3)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ey50 ey50Var = kn instanceof ey50 ? (ey50) kn : null;
                    if (ey50Var != null && (Y = ey50Var.Y()) != null && (u = Y.u()) != null) {
                        u.finish();
                    }
                } else if (dda0Var instanceof dda0.a) {
                    Set<qba0> set = ((dda0.a) dda0Var).a;
                    if (set.size() > 1) {
                        photoTagsFragment.fo(photoTagsFragment.getString(R.string.all_photo_tag_accepted));
                    } else {
                        photoTagsFragment.fo(((qba0) j5g.X(set)).d ? photoTagsFragment.getString(R.string.profile_photo_recognition_tag_added, "") : photoTagsFragment.getString(R.string.profile_photo_tag_added));
                    }
                } else if (dda0Var instanceof dda0.c) {
                    if (((dda0.c) dda0Var).a.size() > 1) {
                        photoTagsFragment.fo(photoTagsFragment.getString(R.string.all_photo_tag_deleted));
                    } else {
                        photoTagsFragment.fo(photoTagsFragment.getString(R.string.profile_photo_tag_deleted));
                    }
                } else if (dda0Var instanceof dda0.d) {
                    Context requireContext = photoTagsFragment.requireContext();
                    ikv0.a aVar6 = new ikv0.a(requireContext);
                    aVar6.t = new ikv0.c.C3058c(R.drawable.vk_icon_warning_triangle_outline_28, Integer.valueOf(R.attr.vk_ui_accent_orange), (Size) null, 12);
                    aVar6.u = new ikv0.d(j03.g(requireContext, ((dda0.d) dda0Var).a, R.string.error), (String) null, (ikv0.d.a) null, 6);
                    aVar6.n();
                } else if (dda0Var instanceof dda0.f) {
                    qba0 qba0Var = ((dda0.f) dda0Var).a;
                    ((qfa0.g) photoTagsFragment.T.getValue()).a(qba0Var.a.c);
                    ((oga0) bpn0Var.getValue()).b(photoTagsFragment.requireContext(), qba0Var);
                } else if (dda0Var instanceof dda0.g) {
                    ((oga0) bpn0Var.getValue()).c(photoTagsFragment.requireContext(), ((dda0.g) dda0Var).a);
                } else {
                    if (!(dda0Var instanceof dda0.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final qba0 qba0Var2 = ((dda0.e) dda0Var).a;
                    PhotoRestriction photoRestriction = qba0Var2.a.L;
                    int i12 = h7u0.p;
                    h7u0.a c3 = h7u0.b.c(photoTagsFragment.requireContext());
                    c3.h0(photoRestriction.b);
                    c3.a.f = photoRestriction.c;
                    RestrictionButton restrictionButton = photoRestriction.e;
                    c3.d0(restrictionButton != null ? restrictionButton.c : null, new DialogInterface.OnClickListener() { // from class: xsna.ica0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i13) {
                            int i14 = PhotoTagsFragment.U;
                            xn50.a.c(PhotoTagsFragment.this, new cca0.k(qba0Var2));
                        }
                    });
                    c3.W(R.string.restriction_cancel, null);
                    c3.m();
                }
                return s3q0.a;
            case 21:
                vja0 vja0Var = (vja0) this.c;
                xja0 xja0Var = (xja0) obj;
                synchronized (vja0Var) {
                    if (vja0Var.f) {
                        vja0Var.b.onNext(xja0Var);
                    }
                }
                return s3q0.a;
            case 22:
                ((o7c0) this.c).v();
                L.l("Error during coauthors avatars loading");
                return s3q0.a;
            case 23:
                PostViewFragment postViewFragment = (PostViewFragment) this.c;
                tgi0 tgi0Var = (tgi0) obj;
                String[] strArr = PostViewFragment.T0;
                qgi0.r(tgi0Var, "post_view_fragment_toolbar_tag");
                qgi0.h(tgi0Var, postViewFragment.q0);
                return s3q0.a;
            case 24:
                ikc0 ikc0Var = (ikc0) this.c;
                NewsEntry newsEntry2 = (NewsEntry) obj;
                ikc0Var.g.f();
                Post R = di60.R(newsEntry2);
                if (R != null && !R.pc()) {
                    ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
                    jt50.a(SingleEvent.POST);
                }
                ikc0Var.L = true;
                sbc0 sbc0Var = ikc0Var.x;
                if (sbc0Var == null) {
                    sbc0Var = null;
                }
                if (sbc0Var.k) {
                    ikc0Var.e.c();
                }
                long j = ikc0Var.u.e;
                if (j > 0) {
                    sec0.a(j);
                }
                sbc0 sbc0Var2 = ikc0Var.x;
                if (sbc0Var2 == null) {
                    sbc0Var2 = null;
                }
                if (sbc0Var2.p != null) {
                    bfc0 bfc0Var = sec0.a;
                    new b.d("posting_draft_post").e();
                }
                bkc0 bkc0Var = ikc0Var.t;
                sbc0 sbc0Var3 = ikc0Var.x;
                if (sbc0Var3 == null) {
                    sbc0Var3 = null;
                }
                PostingFragment postingFragment = bkc0Var.b;
                ikc0 ikc0Var2 = bkc0Var.a;
                int i13 = sbc0Var3 != null ? sbc0Var3.I : -1;
                if (i13 >= 0) {
                    Intent putExtra = new Intent("publishSuggestAction").putExtra("publishSuggestId", i13);
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    cuz.a(context).c(putExtra);
                }
                NewsEntry z7 = ikc0Var2.z7();
                if (z7 == null || ikc0Var2.C0) {
                    if (ikc0Var2.Um() != null) {
                        ce60.b.getClass();
                        p870.f().e(105, newsEntry2);
                        Date Um = ikc0Var2.Um();
                        postingFragment.lo(postingFragment.getString(R.string.wall_postponed, pvo0.i(false, (int) ((Um != null ? Um.getTime() : 0L) / 1000), false, false)));
                    } else if (ikc0Var2.C0) {
                        postingFragment.mo(R.string.post_edit_saved);
                    } else if (sbc0Var3 == null || sbc0Var3.i0) {
                        postingFragment.mo(R.string.wall_ok);
                    }
                    if (ikc0Var2.C0) {
                        NewsEntry newsEntry3 = sbc0Var3 != null ? sbc0Var3.q : null;
                        Post post = newsEntry3 instanceof Post ? (Post) newsEntry3 : null;
                        if (post == null || (owner = post.o) == null || (obj2 = owner.b) == null) {
                            obj2 = 0;
                        }
                        if (obj2.equals(hd60.a().a().y())) {
                            qr.d(ce60.b, 101, newsEntry2);
                        } else {
                            if (z7 != null) {
                                qr.d(ce60.b, 100, z7);
                            }
                            qr.d(ce60.b, 105, newsEntry2);
                        }
                    }
                    if (ikc0Var2.Um() == null && !ikc0Var2.C0) {
                        if (newsEntry2 instanceof Post) {
                            if (!epx.f(t11.b(), ikc0Var2.B0)) {
                                Post post2 = (Post) newsEntry2;
                                if (!epx.f(post2.m, post2.o.b)) {
                                    post2.l.Ab(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH, false);
                                }
                            }
                            Post post3 = (Post) newsEntry2;
                            Owner owner2 = post3.o;
                            if (owner2 != null && (userId = owner2.b) != null && userId.b == 0 && (group = ikc0Var2.v0) != null) {
                                newsEntry = Post.Nb(post3, null, null, 0, tsj.a(group), 0, null, null, null, null, -9);
                                qr.d(ce60.b, 105, newsEntry);
                            }
                        }
                        newsEntry = newsEntry2;
                        qr.d(ce60.b, 105, newsEntry);
                    }
                    Intent intent = new Intent();
                    Post R2 = di60.R(newsEntry2);
                    ikc0Var2.c.Mf(-1, intent.putExtra("post_id", R2 != null ? Integer.valueOf(R2.n) : null).putExtra("is_postponed", ikc0Var2.Um() != null));
                } else {
                    Post post4 = z7 instanceof Post ? (Post) z7 : null;
                    if (post4 != null) {
                        Flags flags = post4.l;
                        Post post5 = newsEntry2 instanceof Post ? (Post) newsEntry2 : null;
                        if (post5 != null && post4.n != post5.n) {
                            ce60.b.getClass();
                            p870.f().e(100, post4);
                            p870.f().e(105, post5);
                        } else if (flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) && ikc0Var2.Um() == null) {
                            qr.d(ce60.b, 100, newsEntry2);
                            flags.Ab(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH, false);
                            postingFragment.mo(R.string.wall_ok);
                        } else {
                            if (ikc0Var2.G7()) {
                                qr.d(ce60.b, 102, newsEntry2);
                            }
                            cvk.u(R.string.post_edit_saved, false);
                        }
                    }
                    if (ikc0Var2.D0) {
                        ce60.b.getClass();
                        p870.f().e(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, newsEntry2);
                        postingFragment.Mf(-1, new Intent().putExtra("comment", newsEntry2));
                    } else {
                        ce60.b.getClass();
                        p870.f().e(101, newsEntry2);
                        Intent intent2 = new Intent();
                        Post R3 = di60.R(newsEntry2);
                        postingFragment.Mf(-1, intent2.putExtra("post_id", R3 != null ? Integer.valueOf(R3.n) : null));
                    }
                }
                String str = ikc0Var.F0;
                if (str != null) {
                    String U = drm0.U(str, "file://");
                    Regex regex = com.vk.core.files.a.a;
                    vhk0.c(U);
                }
                return s3q0.a;
            case 25:
                com.vk.ecomm.design.compose.product_info.f fVar = (com.vk.ecomm.design.compose.product_info.f) obj;
                izs<ejd0, s3q0> izsVar3 = ((old0) this.c).p;
                if (fVar instanceof f.a) {
                    ejd0Var = ejd0.f.b.b;
                } else {
                    if (fVar instanceof f.b) {
                        c2819f = new ejd0.f.c(((f.b) fVar).a);
                    } else if (fVar instanceof f.d) {
                        ejd0Var = ejd0.f.e.b;
                    } else if (fVar instanceof f.c) {
                        ejd0Var = ejd0.f.d.b;
                    } else if (fVar instanceof f.e) {
                        c2819f = new ejd0.f.C2819f(((f.e) fVar).a);
                    } else {
                        if (!(fVar instanceof f.C0935f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ejd0Var = ejd0.f.g.b;
                    }
                    ejd0Var = c2819f;
                }
                izsVar3.invoke(ejd0Var);
                return s3q0.a;
            case 26:
                ifk0.a aVar7 = (ifk0.a) obj;
                ((bx9) this.c).invoke(new CatalogMarketStatusOption(aVar7.c, aVar7.b));
                return s3q0.a;
            case 27:
                String str2 = (String) obj;
                izs<String, s3q0> izsVar4 = ((g910) this.c).n;
                if (izsVar4 != null) {
                    izsVar4.invoke(str2);
                }
                return s3q0.a;
            case 28:
                return new bzd0.b((bzd0.a) this.c, (File) obj);
            default:
                PublishFragment publishFragment = (PublishFragment) this.c;
                qcy<Object>[] qcyVarArr2 = PublishFragment.Q;
                publishFragment.fo().b(new mbe0((PrivacySetting) obj, null));
                return s3q0.a;
        }
    }

    public /* synthetic */ mgz(n850 n850Var, Context context, StorageEvent storageEvent) {
        this.b = 12;
        this.c = n850Var;
    }
}
