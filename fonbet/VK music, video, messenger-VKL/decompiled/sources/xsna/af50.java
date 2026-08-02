package xsna;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.attachpicker.fragment.gallery.PostingAttachGalleryFragment;
import com.vk.catalog2.common.dto.api.hint.CatalogHintType;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.ui.holders.search.SearchSuggestionVh;
import com.vk.clips.design.view.seek.ClipsSeekBar;
import com.vk.core.serialize.Serializer;
import com.vk.documents.impl.SearchDocumentsListFragment;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet;
import com.vk.feed.settings.api.domain.model.FilteredSourceType;
import com.vk.feed.settings.impl.presentation.filtered.c;
import com.vk.feed.settings.impl.presentation.filtered.e;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixCategory;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixSettings;
import com.vk.music.mixsettings.MixCategoryType;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.newsfeed.common.recycler.holders.headers.DisplayMode;
import com.vk.newsfeed.impl.posting.profilefriendslists.a;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.reefton.ReefEvent;
import com.vk.reefton.dto.ReefRequestReason;
import com.vkontakte.android.R;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.ab0;
import xsna.gmi0;
import xsna.j0j;
import xsna.msf0;
import xsna.s6a0;
import xsna.tca0;
import xsna.w3c0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class af50 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ af50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        VKApiExecutionException vKApiExecutionException;
        List<VKApiExecutionException> v;
        VKApiExecutionException vKApiExecutionException2;
        s0j s0jVar;
        int i = this.b;
        int i2 = 22;
        int i3 = 6;
        int i4 = 4;
        int i5 = 3;
        int i6 = 0;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                bf50 bf50Var = (bf50) obj3;
                MixSettings mixSettings = (MixSettings) obj;
                if (mixSettings == null) {
                    return s3q0.a;
                }
                List<MixCategory> list = mixSettings.e;
                bf50Var.e.setText(mixSettings.b);
                bf50Var.f.setText(mixSettings.c);
                e4v0 e4v0Var = bf50Var.n;
                if (e4v0Var == null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        if (((MixCategory) obj4).d != MixCategoryType.HIDDEN) {
                            arrayList.add(obj4);
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList.size());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        linkedHashMap.put(((MixCategory) next).b, next);
                    }
                    bf50Var.n = new e4v0(linkedHashMap, mixSettings.d, new z77(bf50Var, 8));
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj5 : list) {
                        if (((MixCategory) obj5).d != MixCategoryType.HIDDEN) {
                            arrayList2.add(obj5);
                        }
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(arrayList2.size());
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        linkedHashMap2.put(((MixCategory) next2).b, next2);
                    }
                    e4v0Var.f = linkedHashMap2;
                }
                bf50Var.j.setAdapter(bf50Var.n);
                e4v0 e4v0Var2 = bf50Var.n;
                if (e4v0Var2 != null) {
                    bwt0.i0(bf50Var.h, new ut30(e4v0Var2, i5));
                    bwt0.i0(bf50Var.g, new jbo(bf50Var, mixSettings, e4v0Var2, i4));
                }
                return s3q0.a;
            case 1:
                yos yosVar = (yos) obj;
                return ((zi50) obj3).a(yosVar.a).l(new oyr(new eqq(yosVar, i2), 10));
            case 2:
                ((z9z) ((fh9) obj3).c).a((String) obj);
                return s3q0.a;
            case 3:
                m760 m760Var = (m760) obj3;
                Bundle bundle = (Bundle) obj;
                int i7 = m760.A;
                m760Var.getClass();
                bundle.putBoolean("DIALOG_IS_BANNER_AD_EVENT", true);
                s3q0 s3q0Var = s3q0.a;
                m760Var.getParentFragmentManager().k0(bundle, "GAMES_CONFIRM_EXIT_DIALOG_KEY");
                return s3q0.a;
            case 4:
                com.vk.feed.settings.impl.presentation.filtered.b bVar = (com.vk.feed.settings.impl.presentation.filtered.b) obj3;
                afr afrVar = (afr) obj;
                EnumMap enumMap = new EnumMap(FilteredSourceType.class);
                int i8 = afrVar.b;
                if (i8 > 0) {
                    enumMap.put((EnumMap) FilteredSourceType.GROUP, (FilteredSourceType) Integer.valueOf(i8));
                }
                int i9 = afrVar.a;
                if (i9 > 0) {
                    enumMap.put((EnumMap) FilteredSourceType.USER, (FilteredSourceType) Integer.valueOf(i9));
                }
                bVar.T(new c.C1058c(enumMap));
                bVar.g.b(e.a.c.a);
                return s3q0.a;
            case 5:
                cvk.w(j03.g((Context) obj3, (Throwable) obj, R.string.error), false);
                return s3q0.a;
            case 6:
                ib80 ib80Var = (ib80) obj3;
                if (!((Boolean) obj).booleanValue()) {
                    if (!ib80Var.n) {
                        Iterator<T> it3 = ib80Var.m().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj2 = it3.next();
                                UIBlockHint uIBlockHint = ((d7a) obj2).a;
                                if (uIBlockHint.B == CatalogHintType.HIGHLIGHT || !ib80Var.b.a(uIBlockHint.y)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        d7a d7aVar = (d7a) obj2;
                        ib80Var.c.b(nsp0.a, false);
                        if (d7aVar == null) {
                            ib80Var.o = false;
                        } else {
                            View view = d7aVar.b;
                            ib80Var.g = b7a.c(ib80Var.b, view.getContext(), ib80Var.l(d7aVar.a, Collections.singletonList(view)), d7aVar.a, new ufk(ib80Var, i2), null, 16);
                        }
                    }
                    io.reactivex.rxjava3.disposables.c cVar = ib80Var.p;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    ib80Var.p = null;
                }
                return s3q0.a;
            case 7:
                s6a0 s6a0Var = (s6a0) obj3;
                u6a0 u6a0Var = s6a0Var.n;
                if (u6a0Var != null) {
                    u6a0Var.f(((s6a0.a) s6a0Var.m).a);
                }
                return s3q0.a;
            case 8:
                tca0 tca0Var = (tca0) obj3;
                tca0.a.b bVar2 = (tca0.a.b) obj;
                if (bVar2.a) {
                    tca0Var.c.clear();
                }
                return tca0Var.a.c(bVar2.c, bVar2.b, bVar2.d).s0(new vx6(new w910(tca0Var, 12), 27));
            case 9:
                rxa0 rxa0Var = (rxa0) obj3;
                final yxa0 yxa0Var = rxa0Var.b;
                yxa0Var.getClass();
                return new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.maybe.l0(new io.reactivex.rxjava3.internal.operators.maybe.d(new io.reactivex.rxjava3.functions.n() { // from class: xsna.uxa0
                    @Override // io.reactivex.rxjava3.functions.n
                    public final Object get() {
                        yxa0 yxa0Var2 = yxa0.this;
                        SQLiteDatabase readableDatabase = yxa0Var2.getReadableDatabase();
                        readableDatabase.beginTransaction();
                        try {
                            SQLiteDatabase readableDatabase2 = yxa0Var2.getReadableDatabase();
                            PlayerTrack playerTrack = null;
                            Cursor rawQuery = readableDatabase2.rawQuery("SELECT uuid, position, progress_ms, music_track, launch_meta FROM current_track WHERE user_id = " + yxa0.o() + " AND COL_QUEUE_TYPE = " + yxa0Var2.n(), null);
                            try {
                                if (rawQuery.moveToFirst()) {
                                    String string = rawQuery.getString(0);
                                    int i10 = rawQuery.getInt(1);
                                    long j = rawQuery.getLong(2);
                                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(Base64.decode(rawQuery.getString(3), 0)));
                                    try {
                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                                        Serializer.StreamParcelable G = new Serializer.d(dataInputStream).G(MusicTrack.class.getClassLoader());
                                        dataInputStream.close();
                                        MusicTrack musicTrack = (MusicTrack) G;
                                        dataInputStream = new DataInputStream(new ByteArrayInputStream(Base64.decode(rawQuery.getString(4), 0)));
                                        try {
                                            Serializer.StreamParcelable G2 = new Serializer.d(dataInputStream).G(PlaybackLaunchMeta.class.getClassLoader());
                                            dataInputStream.close();
                                            playerTrack = new PlayerTrack(musicTrack, (PlaybackLaunchMeta) G2, i10, j, string);
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
                                return playerTrack == null ? io.reactivex.rxjava3.internal.operators.maybe.i.b : io.reactivex.rxjava3.core.k.i(playerTrack);
                            } finally {
                            }
                        } finally {
                            readableDatabase.endTransaction();
                        }
                    }
                }), new PlayerTrack(new MusicTrack(0, null, null, null, 0, 0, null, null, null, 0, false, false, 0, null, false, null, null, false, null, null, null, null, null, null, 0L, 0, false, 0L, null, false, false, false, null, null, null, null, false, false, 0, null, false, 0, false, null, null, false, 0, null, false, null, null, null, -1, 1048575, null), null, 0, 0L, null, 30, null)), new je40(new jp5(19, rxa0Var, (com.vk.music.player.playback.e) obj), i3));
            case 10:
                ymb0 ymb0Var = (ymb0) ((hpb0) obj3).n;
                ymb0Var.setItems((List) obj);
                ymb0Var.N0(ymb0Var.k);
                return s3q0.a;
            case 11:
                tub0 tub0Var = (tub0) obj3;
                sfc sfcVar = (sfc) obj;
                sfc.a(sfcVar, "type", oqm0.b);
                sfc.a(sfcVar, "value", cmi0.c("kotlinx.serialization.Polymorphic<" + tub0Var.a.l() + '>', gmi0.a.a, new SerialDescriptor[0]));
                sfcVar.b = tub0Var.b;
                return s3q0.a;
            case 12:
                w3c0 w3c0Var = (w3c0) obj3;
                kym0 kym0Var = (kym0) obj;
                N q6 = w3c0Var.q6();
                Post post = q6 instanceof Post ? (Post) q6 : null;
                if (post == null) {
                    return s3q0.a;
                }
                if (!post.l.zb(PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED) || !epx.f(post.m, kym0Var.b)) {
                    return s3q0.a;
                }
                int i10 = w3c0.d.$EnumSwitchMapping$1[kym0Var.a.ordinal()];
                if (i10 == 1) {
                    rwm0 rwm0Var = w3c0Var.H;
                    Context context = w3c0Var.itemView.getContext();
                    UserId userId = kym0Var.b;
                    DisplayMode displayMode = w3c0Var.E;
                    int i11 = rwm0.g;
                    rwm0Var.a(context, userId, post, displayMode, false, false);
                    post.J = false;
                } else if (i10 == 2) {
                    rwm0 rwm0Var2 = w3c0Var.H;
                    Context context2 = w3c0Var.itemView.getContext();
                    UserId userId2 = kym0Var.b;
                    DisplayMode displayMode2 = w3c0Var.E;
                    int i12 = rwm0.g;
                    rwm0Var2.b(context2, userId2, post, displayMode2, false, false);
                    post.J = false;
                }
                return s3q0.a;
            case 13:
                u6c0 u6c0Var = (u6c0) obj3;
                Throwable th = (Throwable) obj;
                if ((th instanceof VKApiExecutionException) && (!((v = (vKApiExecutionException = (VKApiExecutionException) th).v()) == null || v.isEmpty()) || vKApiExecutionException.s() > 0)) {
                    List<VKApiExecutionException> v2 = vKApiExecutionException.v();
                    if (v2 != null && (vKApiExecutionException2 = (VKApiExecutionException) j5g.a0(v2)) != null) {
                        vKApiExecutionException = vKApiExecutionException2;
                    }
                    u6c0Var.a.io(Integer.valueOf(vKApiExecutionException.s()), vKApiExecutionException.getMessage());
                } else if (th instanceof IOException) {
                    u6c0.a(u6c0Var, 3);
                } else {
                    u6c0Var.a.io(-100, null);
                }
                return s3q0.a;
            case 14:
                hb0<nha0> hb0Var = ((PostingAttachGalleryFragment) obj3).j0;
                if (hb0Var != null) {
                    hb0Var.a(oha0.a(ab0.c.a));
                }
                return s3q0.a;
            case 15:
                Post post2 = (Post) obj3;
                Post post3 = (Post) obj;
                if (epx.f(post3.m, post3.o.b)) {
                    ce60.b.getClass();
                    p870.f().e(101, post2);
                }
                cvk.u(R.string.post_edit_saved, false);
                return s3q0.a;
            case 16:
                iui iuiVar = (iui) obj;
                iuiVar.a = new hp7(i3, iuiVar.a(new kwc0(((lwc0) obj3).d, new rr60())), iuiVar.a(new tvc0()));
                return s3q0.a;
            case 17:
                f9d0 f9d0Var = (f9d0) obj3;
                nvy nvyVar = (nvy) obj;
                wh50 wh50Var = f9d0Var.e;
                List list2 = ((sa10) ((zak0) wh50Var).getValue()).a;
                wow wowVar = new wow(list2);
                nvyVar.e(list2.size(), new d9d0(new x9d(4), wowVar), new rrv(wowVar, 2), new jai(2039820996, new e9d0(i6, f9d0Var, wowVar), true));
                if (((sa10) ((zak0) wh50Var).getValue()).c) {
                    nvy.g(nvyVar, null, null, new jai(1352692584, new x8d0(f9d0Var, i6), true), 3);
                }
                if (((sa10) ((zak0) wh50Var).getValue()).d) {
                    nvy.g(nvyVar, null, null, new jai(-719567585, new nrv(f9d0Var, i5), true), 3);
                }
                return s3q0.a;
            case 18:
                List<? extends hfz> list3 = (List) obj;
                kai0 kai0Var = ((ProductsSelectionBottomSheet) obj3).k1;
                (kai0Var != null ? kai0Var : null).setItems(list3);
                return s3q0.a;
            case 19:
                return new w7k((ViewGroup) obj, (a.InterfaceC1385a) obj3);
            case 20:
                com.vk.reefton.trackers.a aVar = (com.vk.reefton.trackers.a) obj3;
                ReefEvent reefEvent = (ReefEvent) obj;
                if (reefEvent instanceof ReefEvent.c) {
                    ReefEvent.c cVar2 = (ReefEvent.c) reefEvent;
                    aVar.getClass();
                    aVar.g(cVar2.b);
                    aVar.a.a(aVar, ReefRequestReason.AUDIO_FRAGMENT_LOADED, cVar2.a);
                } else if (reefEvent instanceof ReefEvent.d) {
                    ReefEvent.d dVar = (ReefEvent.d) reefEvent;
                    aVar.getClass();
                    aVar.g(dVar.b);
                    aVar.a.a(aVar, ReefRequestReason.AUDIO_FRAGMENT_STALLED, dVar.a);
                }
                return s3q0.a;
            case 21:
                nsf0 nsf0Var = (nsf0) obj3;
                Throwable th2 = (Throwable) obj;
                VKApiExecutionException vKApiExecutionException3 = th2 instanceof VKApiExecutionException ? (VKApiExecutionException) th2 : null;
                if (vKApiExecutionException3 == null) {
                    Throwable cause = th2.getCause();
                    vKApiExecutionException3 = cause instanceof VKApiExecutionException ? (VKApiExecutionException) cause : null;
                }
                nsf0Var.C((vKApiExecutionException3 == null || vKApiExecutionException3.s() != 9) ? (vKApiExecutionException3 == null || vKApiExecutionException3.s() != -1) ? th2 instanceof TimeoutException ? new msf0.m(null) : msf0.b.b : new msf0.m(vKApiExecutionException3.t()) : msf0.f.b);
                return s3q0.a;
            case 22:
                return new ejg0((ViewGroup) obj, ((djg0) obj3).i);
            case 23:
                ClipsSeekBar clipsSeekBar = (ClipsSeekBar) obj3;
                clipsSeekBar.setOnSeekBarChangeListener(null);
                clipsSeekBar.setStateListener(null);
                return s3q0.a;
            case 24:
                ((SearchDocumentsListFragment) obj3).a0 = (String) obj;
                return s3q0.a;
            case 25:
                Map<String, Integer> map = SearchSuggestionVh.g;
                ((SearchSuggestionVh) obj3).onClick((View) obj);
                return s3q0.a;
            case 26:
                k6i0 k6i0Var = (k6i0) obj3;
                AlbumsRepository.a aVar2 = (AlbumsRepository.a) obj;
                VKList<PhotoAlbum> vKList = aVar2.a;
                ArrayList arrayList3 = new ArrayList();
                for (PhotoAlbum photoAlbum : vKList) {
                    int i13 = photoAlbum.b;
                    if (i13 >= 0 || k6i0Var.e.contains(Integer.valueOf(i13))) {
                        arrayList3.add(photoAlbum);
                    }
                }
                return new AlbumsRepository.a(new VKList(arrayList3), aVar2.b);
            case 27:
                nvi0 nvi0Var = (nvi0) obj3;
                ParticipantId participantId = nvi0Var.g1;
                if (participantId != null && (s0jVar = nvi0Var.f1) != null) {
                    s0jVar.C(new j0j.f(participantId, SessionRoomId.MainCall.INSTANCE));
                }
                nvi0Var.tn();
                return s3q0.a;
            case 28:
                x9j0 x9j0Var = (x9j0) obj3;
                qsm qsmVar = (qsm) obj;
                vtm f = x9j0Var.f();
                if (f != null) {
                    f.k(x9j0Var, qsmVar);
                }
                return s3q0.a;
            default:
                ((Float) obj).floatValue();
                return Float.valueOf(((Number) ((gzs) obj3).invoke()).floatValue());
        }
    }
}
