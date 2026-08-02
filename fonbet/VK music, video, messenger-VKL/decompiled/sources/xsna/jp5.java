package xsna;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.stickers.dto.StickersStickerRenderDto;
import com.vk.api.generated.stories.dto.StoriesBackgroundDto;
import com.vk.api.generated.vmoji.dto.VmojiGetAvatarStoryDataResponseDto;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.bridges.ImageViewer;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.camera.clips.core.drafts.ClipsDraftVkExtraData;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.feature.music.holders.search.SearchHistoryVideoVh;
import com.vk.clips.design.view.filter.HslView;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragment;
import com.vk.clips.playlists.ui.picker.f;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftMusicInfo;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.dto.clips.external.ClipsDuetInfo;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.music.Thumb;
import com.vk.dto.photo.Photo;
import com.vk.dto.search.SearchAuthorItem;
import com.vk.dto.stickers.ShareVmojiStoryParams;
import com.vk.dto.stories.entities.stat.StoryBackgroundType;
import com.vk.dto.stories.model.StoryBackground;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarDayBlockViewKt;
import com.vk.im.ui.components.chat_profile.interactors.UserProfileAvatarsInteractor;
import com.vk.lists.ListDataSet;
import com.vk.media.MediaUtils;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.music.ui.search.history.SearchHistoryItemViewParams$ActionIconParams;
import com.vk.music.ui.search.history.SearchHistoryItemViewParams$SubTitleParams;
import com.vk.newsfeed.api.posting.viewpresenter.settings.community.DonutSettingsDialogConfig;
import com.vk.profile.core.tabs.ui.music.ProfileContentAudioAlbumsAdapter;
import com.vk.pushes.receivers.c;
import com.vk.reefton.Reef;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.superapp.auth.js.bridge.api.events.OAuthDeactivate$Response;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.common.js.bridge.api.events.DeviceMotionChanged$Response;
import com.vk.toggle.features.ComFeatures;
import com.vk.voip.ui.asr.ui.list.PastAsrListFragment;
import com.vk.voip.ui.asr.ui.list.a;
import com.vkontakte.android.R;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.avh0;
import xsna.ejd0;
import xsna.f0r;
import xsna.fzd0;
import xsna.g5u;
import xsna.g9v0;
import xsna.gm50;
import xsna.ir5;
import xsna.kit0;
import xsna.oap;
import xsna.p66;
import xsna.wk50;
import xsna.xak;
import xsna.y5j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class jp5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jp5(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        xak.d a;
        oap bVar;
        UserId userId;
        ImageViewer.c<Photo> g;
        float h;
        int i = this.b;
        int i2 = 4;
        int i3 = 1;
        int i4 = 0;
        ClipsDuetInfo clipsDuetInfo = null;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                mp5 mp5Var = (mp5) obj3;
                Pair pair = (Pair) obj;
                Bitmap bitmap = (Bitmap) pair.d();
                fzd0.b bVar2 = (fzd0.b) pair.g();
                return new ir5.b((hr5) obj2, new gr5(bitmap, new fzd0.b(bVar2.a, bVar2.b, bVar2.c, bVar2.d, bVar2.e, bVar2.f, bVar2.g, bVar2.h, bVar2.i, bVar2.j, mp5Var.m)), mp5Var.d.c.a.a());
            case 1:
                List list = (List) ((mtk0) obj3).getValue();
                ((nvy) obj).e(list.size(), null, new BookingCalendarDayBlockViewKt.b(list), new jai(2039820996, new BookingCalendarDayBlockViewKt.c(list, (izs) obj2), true));
                return s3q0.a;
            case 2:
                return ((bh9) ((fh9) obj3).b).a((tam0) obj2, (StoryUploadParams) obj);
            case 3:
                wzs wzsVar = (wzs) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj2;
                List list2 = (List) obj;
                if (!list2.isEmpty()) {
                    wzsVar.invoke(list2, Boolean.valueOf(atomicBoolean.get()));
                }
                return s3q0.a;
            case 4:
                ((elb) obj3).b.h((hyg0) obj, (flb) obj2);
                return s3q0.a;
            case 5:
                final lsd lsdVar = (lsd) obj3;
                final gzs gzsVar = (gzs) obj2;
                final ClipsDraftPersistentStore clipsDraftPersistentStore = (ClipsDraftPersistentStore) obj;
                jpd jpdVar = lsdVar.d;
                ArrayList a2 = i7o0.a(jpdVar.e());
                ClipsDraftPersistentStore.b.getClass();
                String i5 = ClipsDraftPersistentStore.i();
                int i6 = jpdVar.i.b;
                ArrayList arrayList = new ArrayList(a2);
                int a3 = pvo0.a();
                String str = jpdVar.x.c;
                StoryCameraParams storyCameraParams = lsdVar.f;
                ClipsDraftCommonData clipsDraftCommonData = new ClipsDraftCommonData(i5, i6, arrayList, storyCameraParams.t, 0L, false, a3, false, null, str, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 15760, null);
                ClipsEditorMusicInfo clipsEditorMusicInfo = jpdVar.z.c;
                StoryMusicInfo d = clipsEditorMusicInfo != null ? hxd.d(clipsEditorMusicInfo) : null;
                ClipsDraftMusicInfo clipsDraftMusicInfo = d != null ? new ClipsDraftMusicInfo(hxd.a(d), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14, null) : null;
                ClipVideoFile clipVideoFile = storyCameraParams.N;
                if (clipVideoFile != null) {
                    UserId userId2 = clipVideoFile.b;
                    int i7 = clipVideoFile.c;
                    String str2 = clipVideoFile.p0;
                    clipsDuetInfo = new ClipsDuetInfo(userId2, i7, str2 != null ? str2 : "");
                }
                final ClipsDraftVk clipsDraftVk = new ClipsDraftVk(clipsDraftCommonData, new ClipsDraftVkExtraData(null, clipsDraftMusicInfo, null, null, null, null, clipsDuetInfo, null, null, null, 957, null));
                final ClipsEditorInputVideoItem clipsEditorInputVideoItem = (ClipsEditorInputVideoItem) j5g.b0(0, a2);
                if (clipsEditorInputVideoItem != null) {
                    asu0.a.getClass();
                    asu0.n().execute(new Runnable() { // from class: xsna.dsd
                        @Override // java.lang.Runnable
                        public final void run() {
                            final ClipsDraftVk clipsDraftVk2 = ClipsDraftVk.this;
                            ClipsDraftCommonData clipsDraftCommonData2 = clipsDraftVk2.b;
                            Bitmap k = MediaUtils.a.k(10L, clipsEditorInputVideoItem.b.getPath());
                            com.vk.stories.b bVar3 = com.vk.stories.b.a;
                            ClipsDraftPersistentStore.b.getClass();
                            File e = PrivateFiles.e(e8r.a, PrivateSubdir.CLIPS_PREVIEW, null, "jpg", 24);
                            bVar3.getClass();
                            File f = com.vk.stories.b.f(k, e);
                            clipsDraftCommonData2.j = f != null ? Uri.fromFile(f).toString() : null;
                            Handler handler = new Handler(Looper.getMainLooper());
                            final ClipsDraftPersistentStore clipsDraftPersistentStore2 = clipsDraftPersistentStore;
                            final lsd lsdVar2 = lsdVar;
                            final gzs gzsVar2 = gzsVar;
                            handler.post(new Runnable() { // from class: xsna.esd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ClipsDraftPersistentStore.this.getClass();
                                    ClipsDraftPersistentStore.w(clipsDraftVk2);
                                    nsd nsdVar = fvr.c;
                                    if (nsdVar != null) {
                                        nsdVar.c(1);
                                    } else {
                                        ClipsDraftPersistentStore.b.getClass();
                                        Preference.F(swe0.i(Preference.m(0L, "clips_draft_prefs", "unseen_drafts_pref") + 1, 0L, ClipsDraftPersistentStore.m().size()), "clips_draft_prefs", "unseen_drafts_pref");
                                    }
                                    ClipsDraftPersistentStore.c(false);
                                    ClipsDraftPersistentStore.s();
                                    lsd lsdVar3 = lsdVar2;
                                    StoryCameraParams storyCameraParams2 = lsdVar3.f;
                                    UserId userId3 = storyCameraParams2.g;
                                    String str3 = storyCameraParams2.c;
                                    ComFeatures comFeatures = ComFeatures.COM_POSTING_AUTHOR_SELECTION;
                                    comFeatures.getClass();
                                    if (com.vk.toggle.b.A.a(comFeatures) && str3 != null && str3.length() != 0) {
                                        Intent putExtra = new Intent("com.vk.clips.intent.DRAFT_SAVED").putExtra("extra_clips_draft_author_id", userId3.b).putExtra("extra_clips_draft_entry_point", str3);
                                        Context context = e43.a;
                                        if (context == null) {
                                            context = null;
                                        }
                                        cuz.a(context).c(putExtra);
                                    }
                                    lsdVar3.d.q(false);
                                    gzsVar2.invoke();
                                }
                            });
                        }
                    });
                } else {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 6:
                ClipsPlaylistPickerFragment.a aVar = (ClipsPlaylistPickerFragment.a) obj3;
                ClipsPlaylistPickerFragment clipsPlaylistPickerFragment = (ClipsPlaylistPickerFragment) obj2;
                int i8 = ClipsPlaylistPickerFragment.V;
                aVar.c.setVisibility(8);
                aVar.e.setVisibility(8);
                aVar.f.setVisibility(0);
                gm50.a.a(clipsPlaylistPickerFragment, ((f.b) obj).a, new g22(8, clipsPlaylistPickerFragment, aVar));
                return s3q0.a;
            case 7:
                xak xakVar = (xak) obj3;
                gcp gcpVar = (gcp) obj;
                xakVar.z = null;
                if (epx.f(xakVar.A.a, (String) obj2)) {
                    if (gcpVar.a) {
                        a = xak.d.a(xakVar.A, null);
                    } else {
                        String str3 = gcpVar.b;
                        if (str3 == null || drm0.N(str3)) {
                            str3 = xakVar.b.getString(R.string.vk_auth_create_email_error_email_busy);
                        }
                        a = xak.d.a(xakVar.A, str3);
                    }
                    xakVar.B0(a);
                }
                xakVar.D0(gcpVar.c);
                return s3q0.a;
            case 8:
                qgi0.h((tgi0) obj, ((String) obj3) + ", " + ((String) obj2));
                return s3q0.a;
            case 9:
                DonutSettingsDialogConfig.Mode mode = DonutSettingsDialogConfig.Mode.Dones;
                ((emc0) obj3).a(mode);
                ((r2o) obj2).S0(mode);
                return s3q0.a;
            case 10:
                ((nfu) obj3).getClass();
                throw null;
            case 11:
                ((f0r.g) obj3).h((wk50.a) obj2, (Throwable) obj);
                return s3q0.a;
            case 12:
                GoodFragment goodFragment = (GoodFragment) obj3;
                d210 d210Var = (d210) obj2;
                g5u g5uVar = (g5u) obj;
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                if (g5uVar instanceof g5u.f) {
                    jid0 jid0Var = goodFragment.Po().G;
                    if (jid0Var != null) {
                        jid0Var.c.clear();
                        jid0Var.notifyDataSetChanged();
                    }
                    goodFragment.Bo(EmptyList.b, false);
                    goodFragment.Go(goodFragment.getString(R.string.good_or_service_not_available));
                    goodFragment.Ro();
                    goodFragment.Ho(false);
                } else if (g5uVar instanceof g5u.b) {
                    goodFragment.invalidateOptionsMenu();
                } else if (g5uVar instanceof g5u.a) {
                    goodFragment.Ko();
                } else if (g5uVar instanceof g5u.e) {
                    String str4 = ((g5u.e) g5uVar).a;
                    jid0 jid0Var2 = goodFragment.Po().G;
                    if (jid0Var2 != null) {
                        jid0Var2.c.clear();
                        jid0Var2.notifyDataSetChanged();
                    }
                    goodFragment.Bo(EmptyList.b, false);
                    goodFragment.Go(str4);
                    goodFragment.Ro();
                    goodFragment.Ho(false);
                } else if (g5uVar instanceof g5u.d) {
                    goodFragment.Qo().b(new ejd0.c.C2817c(((g5u.d) g5uVar).a));
                } else {
                    if (!(g5uVar instanceof g5u.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ArrayList arrayList2 = ((g5u.c) g5uVar).a;
                    mnd0 mnd0Var = (mnd0) goodFragment.K0.getValue();
                    myc0.h(mnd0Var.a, null, null, new jnd0(mnd0Var, arrayList2, d210Var, null), 3);
                    goodFragment.Qo().b(ejd0.a.b.b);
                }
                return s3q0.a;
            case 13:
                HslView hslView = (HslView) obj3;
                wgv wgvVar = (wgv) obj2;
                float floatValue = ((Float) obj).floatValue();
                wgv wgvVar2 = (wgv) ((ListDataSet) hslView.t.c.c).t(new ygv(new xgv(wgvVar.a, i4), i4));
                if (wgvVar2 != null) {
                    wgvVar2.d = floatValue;
                }
                izs<? super wgv, s3q0> izsVar = hslView.x;
                if (izsVar != null) {
                    izsVar.invoke(wgvVar);
                }
                return s3q0.a;
            case 14:
                String str5 = (String) obj2;
                com.vk.superapp.base.js.bridge.b.p(((l2y) obj3).L0().a, new JsMethod("VKWebAppOAuthDeactivate"), new OAuthDeactivate$Response(null, new OAuthDeactivate$Response.Data(true, str5), str5, 1, null), null, null, false, null, 60);
                return s3q0.a;
            case 15:
                String str6 = (String) obj2;
                vkr0 vkr0Var = (vkr0) obj;
                ((e4y) obj3).b.a.n(new JsMethod("VKWebAppDeviceMotionChanged"), new DeviceMotionChanged$Response(null, new DeviceMotionChanged$Response.Data(vkr0Var.a, -vkr0Var.b, vkr0Var.c, str6), str6, 1, null));
                return s3q0.a;
            case 16:
                VideoFileOld videoFileOld = (VideoFileOld) obj3;
                videoFileOld.P0 = ((VideoFile) obj).Y6();
                return new vqk0(((kit0.a) obj2).a, videoFileOld);
            case 17:
                c.a aVar2 = com.vk.pushes.receivers.c.b;
                c.a.e((Context) obj3, (Intent) obj2, (Throwable) obj);
                return s3q0.a;
            case 18:
                int i9 = PastAsrListFragment.U;
                ((PastAsrListFragment) obj3).fo((a.b) obj, (PastAsrListFragment.b) obj2);
                return s3q0.a;
            case 19:
                PlayerTrack playerTrack = (PlayerTrack) obj;
                final yxa0 yxa0Var = ((rxa0) obj3).b;
                yxa0Var.getClass();
                final String str7 = "original_tracks_order";
                final String str8 = "actual_tracks_order";
                return io.reactivex.rxjava3.core.x.A(new io.reactivex.rxjava3.internal.operators.single.c(new io.reactivex.rxjava3.functions.n() { // from class: xsna.wxa0
                    @Override // io.reactivex.rxjava3.functions.n
                    public final Object get() {
                        String str9 = str7;
                        yxa0 yxa0Var2 = yxa0.this;
                        SQLiteDatabase readableDatabase = yxa0Var2.getReadableDatabase();
                        readableDatabase.beginTransaction();
                        try {
                            Cursor rawQuery = readableDatabase.rawQuery("SELECT mid, uuid, access_key, track_code, launch_meta FROM " + str9 + " WHERE user_id = " + yxa0.o() + " AND COL_QUEUE_TYPE = " + yxa0Var2.n(), null);
                            try {
                                ArrayList arrayList3 = new ArrayList();
                                while (rawQuery.moveToNext()) {
                                    String string = rawQuery.getString(0);
                                    String string2 = rawQuery.getString(1);
                                    String string3 = rawQuery.getString(2);
                                    String string4 = rawQuery.getString(3);
                                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(Base64.decode(rawQuery.getString(4), 0)));
                                    try {
                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                                        Serializer.StreamParcelable G = new Serializer.d(dataInputStream).G(PlaybackLaunchMeta.class.getClassLoader());
                                        dataInputStream.close();
                                        arrayList3.add(new gza0(string, string2, string3, string4, (PlaybackLaunchMeta) G));
                                    } finally {
                                    }
                                }
                                rawQuery.close();
                                readableDatabase.setTransactionSuccessful();
                                readableDatabase.endTransaction();
                                return io.reactivex.rxjava3.core.x.k(arrayList3);
                            } finally {
                            }
                        } catch (Throwable th) {
                            readableDatabase.endTransaction();
                            throw th;
                        }
                    }
                }), new io.reactivex.rxjava3.internal.operators.single.c(new io.reactivex.rxjava3.functions.n() { // from class: xsna.wxa0
                    @Override // io.reactivex.rxjava3.functions.n
                    public final Object get() {
                        String str9 = str8;
                        yxa0 yxa0Var2 = yxa0.this;
                        SQLiteDatabase readableDatabase = yxa0Var2.getReadableDatabase();
                        readableDatabase.beginTransaction();
                        try {
                            Cursor rawQuery = readableDatabase.rawQuery("SELECT mid, uuid, access_key, track_code, launch_meta FROM " + str9 + " WHERE user_id = " + yxa0.o() + " AND COL_QUEUE_TYPE = " + yxa0Var2.n(), null);
                            try {
                                ArrayList arrayList3 = new ArrayList();
                                while (rawQuery.moveToNext()) {
                                    String string = rawQuery.getString(0);
                                    String string2 = rawQuery.getString(1);
                                    String string3 = rawQuery.getString(2);
                                    String string4 = rawQuery.getString(3);
                                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(Base64.decode(rawQuery.getString(4), 0)));
                                    try {
                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                                        Serializer.StreamParcelable G = new Serializer.d(dataInputStream).G(PlaybackLaunchMeta.class.getClassLoader());
                                        dataInputStream.close();
                                        arrayList3.add(new gza0(string, string2, string3, string4, (PlaybackLaunchMeta) G));
                                    } finally {
                                    }
                                }
                                rawQuery.close();
                                readableDatabase.setTransactionSuccessful();
                                readableDatabase.endTransaction();
                                return io.reactivex.rxjava3.core.x.k(arrayList3);
                            } finally {
                            }
                        } catch (Throwable th) {
                            readableDatabase.endTransaction();
                            throw th;
                        }
                    }
                }), new io.reactivex.rxjava3.internal.operators.single.c(new io.reactivex.rxjava3.functions.n() { // from class: xsna.vxa0
                    @Override // io.reactivex.rxjava3.functions.n
                    public final Object get() {
                        yxa0 yxa0Var2 = yxa0.this;
                        SQLiteDatabase readableDatabase = yxa0Var2.getReadableDatabase();
                        readableDatabase.beginTransaction();
                        try {
                            Cursor rawQuery = readableDatabase.rawQuery("SELECT mid, music_track, launch_meta FROM cached_tracks WHERE user_id = " + yxa0.o() + " AND COL_QUEUE_TYPE = " + yxa0Var2.n(), null);
                            try {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                while (rawQuery.moveToNext()) {
                                    String string = rawQuery.getString(0);
                                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(Base64.decode(rawQuery.getString(1), 0)));
                                    try {
                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                                        Serializer.StreamParcelable G = new Serializer.d(dataInputStream).G(MusicTrack.class.getClassLoader());
                                        dataInputStream.close();
                                        MusicTrack musicTrack = (MusicTrack) G;
                                        dataInputStream = new DataInputStream(new ByteArrayInputStream(Base64.decode(rawQuery.getString(2), 0)));
                                        try {
                                            Serializer.StreamParcelable G2 = new Serializer.d(dataInputStream).G(PlaybackLaunchMeta.class.getClassLoader());
                                            dataInputStream.close();
                                            linkedHashMap.put(string, new xd50(musicTrack, (PlaybackLaunchMeta) G2));
                                        } finally {
                                        }
                                    } finally {
                                        try {
                                            throw th;
                                        } finally {
                                        }
                                    }
                                }
                                rawQuery.close();
                                readableDatabase.setTransactionSuccessful();
                                readableDatabase.endTransaction();
                                return io.reactivex.rxjava3.core.x.k(linkedHashMap);
                            } finally {
                            }
                        } catch (Throwable th) {
                            readableDatabase.endTransaction();
                            throw th;
                        }
                    }
                }), new nm3(new j150(i3, playerTrack, (com.vk.music.player.playback.e) obj2), 25));
            case 20:
                ((izs) obj3).invoke(((ProfileContentAudioAlbumsAdapter.a) obj2).m);
                return s3q0.a;
            case 21:
                aof0 b = ((Reef) obj3).d.b();
                ((com.vk.reefton.trackers.l) obj2).getClass();
                b.b();
                AtomicInteger atomicInteger = Reef.i;
                Reef.a.a((Throwable) obj);
                return s3q0.a;
            case 22:
                CatalogBlock catalogBlock = (CatalogBlock) obj3;
                bi20 bi20Var = (bi20) obj2;
                if (obj instanceof UserProfile) {
                    bVar = new oap.a(obj);
                } else {
                    if (!(obj instanceof Group)) {
                        return null;
                    }
                    bVar = new oap.b(obj);
                }
                oap oapVar = bVar;
                if (oapVar instanceof oap.b) {
                    userId = ((Group) ((oap.b) oapVar).a).c;
                } else {
                    if (!(oapVar instanceof oap.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    userId = ((UserProfile) ((oap.a) oapVar).a).c;
                }
                UserId userId3 = userId;
                Object zb = catalogBlock.m.zb(obj instanceof Group ? fkq0.e(userId3) : userId3);
                SearchAuthorItem searchAuthorItem = zb instanceof SearchAuthorItem ? (SearchAuthorItem) zb : null;
                String str9 = bi20Var.a;
                CatalogViewType catalogViewType = bi20Var.d;
                CatalogDataType catalogDataType = bi20Var.c;
                String str10 = bi20Var.k;
                List<String> list3 = bi20Var.j;
                Set<UIBlockDragDropAction> set = bi20Var.m;
                UIBlockHint uIBlockHint = bi20Var.o;
                String str11 = searchAuthorItem != null ? searchAuthorItem.c : null;
                UIBlockSearchAuthor.AuthorType.a aVar3 = UIBlockSearchAuthor.AuthorType.Companion;
                String str12 = searchAuthorItem != null ? searchAuthorItem.d : null;
                aVar3.getClass();
                return new UIBlockSearchAuthor(str9, catalogViewType, catalogDataType, str10, userId3, list3, set, uIBlockHint, new UIBlockSearchAuthor.a(str11, oapVar, UIBlockSearchAuthor.AuthorType.a.a(str12), searchAuthorItem != null ? searchAuthorItem.e : null, searchAuthorItem != null ? searchAuthorItem.f : null));
            case 23:
                SearchHistoryVideoVh searchHistoryVideoVh = (SearchHistoryVideoVh) obj3;
                VideoFile videoFile = (VideoFile) obj2;
                zuh0 zuh0Var = (zuh0) obj;
                avh0.c cVar = new avh0.c(new Thumb(videoFile.getImage()), null, "", 6);
                String title = videoFile.getTitle();
                MusicVideoFile musicVideoFile = videoFile instanceof MusicVideoFile ? (MusicVideoFile) videoFile : null;
                return zuh0.a(zuh0Var, cVar, new bvh0(title, musicVideoFile != null ? Boolean.valueOf(musicVideoFile.A1) : null), new SearchHistoryItemViewParams$SubTitleParams(searchHistoryVideoVh.e(R.string.music_search_history_video, videoFile.P()), SearchHistoryItemViewParams$SubTitleParams.IconType.Video), new SearchHistoryItemViewParams$ActionIconParams(SearchHistoryItemViewParams$ActionIconParams.IconType.More, true, Integer.valueOf(R.string.music_talkback_more), 4));
            case 24:
                s6k0 s6k0Var = (s6k0) obj3;
                s6k0Var.A.c();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.PHONE_SUCCESS_VERIFICATION, null, null, null, null, null, null, 254);
                s3q0 s3q0Var = s3q0.a;
                z2a0 z2a0Var = s6k0Var.D;
                p66.c cVar2 = s6k0Var.w;
                CodeState.SmsInbox smsInbox = s6k0Var.z;
                z2a0Var.getClass();
                z2a0.b((CheckPresenterInfo) obj2, (vbu0) obj, cVar2, smsInbox);
                return s3q0.a;
            case 25:
                ((com.vk.attachpicker.stat.data.d) obj3).b.g((hyg0) obj, (ArrayList) obj2);
                return s3q0.a;
            case 26:
                UserId userId4 = (UserId) obj3;
                UserProfileAvatarsInteractor userProfileAvatarsInteractor = (UserProfileAvatarsInteractor) obj2;
                VKList vKList = (VKList) obj;
                if (vKList.size() == 0) {
                    return io.reactivex.rxjava3.core.a.k(new UserProfileAvatarsInteractor.NoAvatarsException());
                }
                UserProfileAvatarsInteractor.a aVar4 = new UserProfileAvatarsInteractor.a(userId4, vKList.size(), vKList.i());
                g = userProfileAvatarsInteractor.b.g(0, vKList, userProfileAvatarsInteractor.a, aVar4, o25.a().c());
                aVar4.d = g;
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            case 27:
                Pair pair2 = (Pair) obj3;
                i6j i6jVar = (i6j) obj;
                float f = ((pco) pair2.d()).b;
                float f2 = ((pco) pair2.g()).b;
                s5j s5jVar = new s5j("anchor");
                s5j s5jVar2 = new s5j("balloon");
                int i10 = g9v0.a.$EnumSwitchMapping$3[((VkTooltip$BalloonTilt) obj2).ordinal()];
                int i11 = 2;
                if (i10 == 1) {
                    h = e06.Far.h();
                } else {
                    if (i10 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h = e06.Near.h();
                }
                y5j.b f3 = i6jVar.f(f / 2);
                y5j.a g2 = i6jVar.g(f2 - h);
                i6jVar.c(s5jVar, new pzt0(i11));
                i6jVar.c(s5jVar2, new rls0(i2, f3, g2));
                return s3q0.a;
            default:
                String str13 = (String) obj2;
                VmojiGetAvatarStoryDataResponseDto vmojiGetAvatarStoryDataResponseDto = (VmojiGetAvatarStoryDataResponseDto) obj;
                ((w6w0) obj3).getClass();
                List<StickersStickerRenderDto> e = vmojiGetAvatarStoryDataResponseDto.e();
                ArrayList arrayList3 = new ArrayList(c5g.u(e, 10));
                Iterator<T> it = e.iterator();
                while (it.hasNext()) {
                    arrayList3.add(lyf0.a((StickersStickerRenderDto) it.next()));
                }
                List<StoriesBackgroundDto> d2 = vmojiGetAvatarStoryDataResponseDto.d();
                ArrayList arrayList4 = new ArrayList(c5g.u(d2, 10));
                for (StoriesBackgroundDto storiesBackgroundDto : d2) {
                    arrayList4.add(new StoryBackground(StoryBackgroundType.GRAPHICS, storiesBackgroundDto.f(), storiesBackgroundDto.getUrl(), storiesBackgroundDto.g(), storiesBackgroundDto.d(), storiesBackgroundDto.e(), false, null, null, 448, null));
                }
                return new ShareVmojiStoryParams(arrayList3, arrayList4, str13);
        }
    }
}
