package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.models.SdkClipOrdData;
import com.vk.clips.models.VideoUrlPack;
import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.playlists.model.PlaylistRawId;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkCoOwnerItem;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.sdk.shared.api.playlist.SdkClipsDraftablePlaylist;
import com.vk.clips.viewer.edit.api.domain.model.ClipCoauthorSdkItem;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditAttachedVideo;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditSdkItem;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditSdkThumbsItem;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.OrdAdInfo;
import com.vk.dto.common.OrdAdvertiser;
import com.vk.dto.common.TimelineThumbs;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.g8d;
import xsna.wlc;
import xsna.xtc;

/* compiled from: ClipActionsHandlerImpl.kt */
/* loaded from: classes17.dex */
public final class ylc implements xlc {
    public final qwe a;
    public final gxh b;
    public final xtc c;
    public final ClipsPlaylistsComponent d;
    public final syk0 e;
    public final bpn0 f = new bpn0(new i70(this, 17));
    public final bpn0 g = new bpn0(new j70(this, 16));
    public final bpn0 h = new bpn0(new defpackage.r(this, 23));
    public final bpn0 i = new bpn0(new yh(this, 21));
    public final bpn0 j = new bpn0(new x0(4));

    public ylc(qwe qweVar, gxh gxhVar, xtc xtcVar, ClipsPlaylistsComponent clipsPlaylistsComponent, syk0 syk0Var) {
        this.a = qweVar;
        this.b = gxhVar;
        this.c = xtcVar;
        this.d = clipsPlaylistsComponent;
        this.e = syk0Var;
        new bpn0(new uz(5));
        new bpn0(new pr1(6));
        new bpn0(new i9(12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v9, types: [kotlin.collections.EmptyList] */
    @Override // xsna.xlc
    public final void a(Activity activity, wlc.a aVar) {
        ?? r5;
        boolean z;
        boolean z2;
        List<SdkCoOwnerItem> P1;
        final zo0 zo0Var = (zo0) this.g.getValue();
        SdkVideoFile B = k15.B(aVar.b);
        final ikd ikdVar = new ikd(B, (String) null, (UserId) null, (dz20) null, (g8d.a) null, false, (sih0) null, aVar.c, 254);
        zo0Var.getClass();
        ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.SinglePick singlePick = new ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.SinglePick(null, null);
        Collection singletonList = B.t0() ? Collections.singletonList(B.I0()) : EmptyList.b;
        SdkClipVideoFile sdkClipVideoFile = B instanceof SdkClipVideoFile ? (SdkClipVideoFile) B : null;
        if (sdkClipVideoFile == null || (P1 = sdkClipVideoFile.P1()) == null) {
            r5 = 0;
        } else {
            r5 = new ArrayList();
            for (SdkCoOwnerItem sdkCoOwnerItem : P1) {
                UserId userId = (sdkCoOwnerItem.d() && sdkCoOwnerItem.d) ? sdkCoOwnerItem.b : null;
                if (userId != null) {
                    r5.add(userId);
                }
            }
        }
        if (r5 == 0) {
            r5 = EmptyList.b;
        }
        ClipsPlaylistsFolderLaunchParams clipsPlaylistsFolderLaunchParams = new ClipsPlaylistsFolderLaunchParams(singlePick, ikdVar.i, "playlist_request_result", j5g.u0((Iterable) r5, singletonList));
        Context context = activity;
        while (true) {
            z = context instanceof FragmentActivity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        final FragmentManager supportFragmentManager = ((FragmentActivity) (z ? (Activity) context : null)).getSupportFragmentManager();
        Object obj = activity;
        while (true) {
            z2 = obj instanceof FragmentActivity;
            if (z2 || !(obj instanceof ContextWrapper)) {
                break;
            } else {
                obj = ((ContextWrapper) obj).getBaseContext();
            }
        }
        supportFragmentManager.l0("playlist_request_result", (f5z) (z2 ? (Activity) obj : null), new pcs() { // from class: xsna.yo0
            @Override // xsna.pcs
            public final void p(Bundle bundle, String str) {
                Parcelable parcelable;
                Object parcelable2;
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = bundle.getParcelable("playlist_selected", ClipsPlaylist.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = bundle.getParcelable("playlist_selected");
                    if (!(parcelable3 instanceof ClipsPlaylist)) {
                        parcelable3 = null;
                    }
                    parcelable = (ClipsPlaylist) parcelable3;
                }
                ClipsPlaylist clipsPlaylist = (ClipsPlaylist) parcelable;
                if (clipsPlaylist != null) {
                    zo0Var.a.b().b(clipsPlaylist, k15.A(ikdVar.a));
                }
                FragmentManager.this.f("playlist_request_result");
            }
        });
        zo0Var.a.e().e(clipsPlaylistsFolderLaunchParams, supportFragmentManager);
    }

    @Override // xsna.xlc
    public final void b(Context context, wlc.e eVar) {
        mjj0 mjj0Var = (mjj0) this.i.getValue();
        VideoFileAdapter B = k15.B(eVar.b);
        UserId.b bVar = UserId.c;
        mjj0Var.getClass();
        if (o25.a().a(B.I0())) {
            mjj0Var.a.b(B.I0(), Integer.valueOf(B.o0()));
        } else {
            g620.f().m().b(context, B.I0(), B.a1(), false);
        }
    }

    @Override // xsna.xlc
    public final boolean c(VideoFile videoFile) {
        return ci90.k(new ikd((SdkVideoFile) k15.B(videoFile), (String) null, (UserId) null, (dz20) null, (g8d.a) null, false, (sih0) null, false, 510));
    }

    @Override // xsna.xlc
    public final boolean d(VideoFile videoFile) {
        return ci90.f(new ikd((SdkVideoFile) k15.B(videoFile), (String) null, (UserId) null, (dz20) null, (g8d.a) null, false, (sih0) null, false, 510));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v9, types: [kotlin.collections.EmptyList] */
    @Override // xsna.xlc
    public final void e(Activity activity, wlc.c cVar) {
        Set set;
        ?? r3;
        boolean z;
        boolean z2;
        List<SdkCoOwnerItem> P1;
        List<SdkClipsDraftablePlaylist> d0;
        c0p c0pVar = (c0p) this.h.getValue();
        SdkVideoFile B = k15.B(cVar.b);
        ikd ikdVar = new ikd(B, (String) null, (UserId) null, (dz20) null, (g8d.a) null, false, (sih0) null, cVar.c, 254);
        c0pVar.getClass();
        String a1 = B.a1();
        boolean z3 = B instanceof SdkClipVideoFile;
        SdkClipVideoFile sdkClipVideoFile = z3 ? (SdkClipVideoFile) B : null;
        if (sdkClipVideoFile == null || (d0 = sdkClipVideoFile.d0()) == null) {
            set = null;
        } else {
            List<SdkClipsDraftablePlaylist> list = d0;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            for (SdkClipsDraftablePlaylist sdkClipsDraftablePlaylist : list) {
                arrayList.add(new PlaylistRawId(sdkClipsDraftablePlaylist.e, sdkClipsDraftablePlaylist.b));
            }
            set = j5g.S0(arrayList);
        }
        if (set == null) {
            set = EmptySet.b;
        }
        ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.SinglePick singlePick = new ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.SinglePick(a1, set);
        Collection singletonList = B.t0() ? Collections.singletonList(B.I0()) : EmptyList.b;
        SdkClipVideoFile sdkClipVideoFile2 = z3 ? (SdkClipVideoFile) B : null;
        if (sdkClipVideoFile2 == null || (P1 = sdkClipVideoFile2.P1()) == null) {
            r3 = 0;
        } else {
            r3 = new ArrayList();
            for (SdkCoOwnerItem sdkCoOwnerItem : P1) {
                UserId userId = (sdkCoOwnerItem.d() && sdkCoOwnerItem.d) ? sdkCoOwnerItem.b : null;
                if (userId != null) {
                    r3.add(userId);
                }
            }
        }
        if (r3 == 0) {
            r3 = EmptyList.b;
        }
        ClipsPlaylistsFolderLaunchParams clipsPlaylistsFolderLaunchParams = new ClipsPlaylistsFolderLaunchParams(singlePick, ikdVar.i, "playlist_request_result", j5g.u0((Iterable) r3, singletonList));
        Context context = activity;
        while (true) {
            z = context instanceof FragmentActivity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        FragmentManager supportFragmentManager = ((FragmentActivity) (z ? (Activity) context : null)).getSupportFragmentManager();
        Object obj = activity;
        while (true) {
            z2 = obj instanceof FragmentActivity;
            if (z2 || !(obj instanceof ContextWrapper)) {
                break;
            } else {
                obj = ((ContextWrapper) obj).getBaseContext();
            }
        }
        supportFragmentManager.l0("playlist_request_result", (f5z) (z2 ? (Activity) obj : null), new oo5(supportFragmentManager, c0pVar, ikdVar));
        c0pVar.a.e().e(clipsPlaylistsFolderLaunchParams, supportFragmentManager);
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [T, androidx.appcompat.app.d] */
    @Override // xsna.xlc
    public final void f(final Activity activity, wlc.d dVar) {
        List<SdkCoOwnerItem> P1;
        final uwf0 uwf0Var = (uwf0) this.j.getValue();
        SdkVideoFile B = k15.B(dVar.b);
        final ikd ikdVar = new ikd(B, (String) null, (UserId) null, (dz20) null, (g8d.a) null, false, (sih0) null, dVar.c, 254);
        final gzs<s3q0> gzsVar = dVar.d;
        final izs<Throwable, s3q0> izsVar = dVar.e;
        uwf0Var.getClass();
        SdkClipVideoFile sdkClipVideoFile = B instanceof SdkClipVideoFile ? (SdkClipVideoFile) B : null;
        int i = 0;
        if (sdkClipVideoFile != null && (P1 = sdkClipVideoFile.P1()) != null) {
            List<SdkCoOwnerItem> list = P1;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((SdkCoOwnerItem) it.next()).e == SdkCoOwnerItem.Status.APPROVED && (i = i + 1) < 0) {
                        e43.s();
                        throw null;
                    }
                }
            }
        }
        int i2 = i > 0 ? R.string.delete_clip_with_coauthors_confirm : R.string.delete_clip_confirm;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = bfs0.c(ikdVar.i ? bwt0.u(activity) : activity, Integer.valueOf(R.string.video_alert_title), i2, rdi.p(activity, new wm80(ref$ObjectRef, 11)), new gzs() { // from class: xsna.twf0
            @Override // xsna.gzs
            public final Object invoke() {
                uwf0.this.getClass();
                SdkVideoFile sdkVideoFile = ikdVar.a;
                int o0 = sdkVideoFile.o0();
                gzs<s3q0> gzsVar2 = gzsVar;
                if (o0 == 0) {
                    gzsVar2.invoke();
                } else {
                    fxc0.B().g0(activity, k15.A(sdkVideoFile), sdkVideoFile.I0(), gzsVar2, izsVar);
                }
                return s3q0.a;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ee, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ac, code lost:
    
        if (r1.i(16) == false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a6  */
    @Override // xsna.xlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Activity activity, wlc.b bVar) {
        SdkImages sdkImages;
        ClipEditSdkThumbsItem clipEditSdkThumbsItem;
        SdkClipOrdData sdkClipOrdData;
        String str;
        boolean z;
        Owner owner;
        Owner owner2;
        int i;
        boolean z2;
        Context context;
        Context context2;
        boolean z3;
        Context context3;
        boolean z4;
        UserId userId;
        Group C0;
        xyo xyoVar = (xyo) this.f.getValue();
        Parcelable B = k15.B(bVar.b);
        boolean z5 = bVar.c;
        UserId.b bVar2 = UserId.c;
        gzs<s3q0> gzsVar = bVar.d;
        xyoVar.getClass();
        ClipVideoFile z6 = k15.z((SdkClipVideoFile) B);
        xtc xtcVar = xyoVar.a;
        String valueOf = String.valueOf(z6.c);
        UserId userId2 = z6.b;
        VideoUrlPack a = yot0.a(z6);
        int i2 = z6.m0;
        int i3 = z6.n0;
        String str2 = z6.m;
        String str3 = str2 == null ? "" : str2;
        ArrayList arrayList = z6.I0.b;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ImageSize imageSize = (ImageSize) it.next();
            Iterator it2 = it;
            Image image = imageSize.d;
            arrayList2.add(new ImageUrl(image.d, Math.max(image.b, image.c), imageSize.c7()));
            it = it2;
            valueOf = valueOf;
        }
        String str4 = valueOf;
        SdkImages sdkImages2 = new SdkImages(arrayList2, z6.I0);
        TimelineThumbs timelineThumbs = z6.K0;
        if (timelineThumbs != null) {
            sdkImages = sdkImages2;
            clipEditSdkThumbsItem = new ClipEditSdkThumbsItem(timelineThumbs.b, timelineThumbs.c, timelineThumbs.d, timelineThumbs.e, timelineThumbs.f, timelineThumbs.i);
        } else {
            sdkImages = sdkImages2;
            clipEditSdkThumbsItem = ClipEditSdkThumbsItem.h;
        }
        OrdAdInfo ordAdInfo = z6.d0;
        if (ordAdInfo != null) {
            String str5 = ordAdInfo.b;
            boolean z7 = str5.length() > 0;
            OrdAdvertiser ordAdvertiser = (OrdAdvertiser) j5g.a0(ordAdInfo.c);
            sdkClipOrdData = new SdkClipOrdData(z7, null, ordAdvertiser != null ? ordAdvertiser.c : null, str5);
        } else {
            sdkClipOrdData = null;
        }
        ActionLink actionLink = z6.Y;
        if (actionLink != null) {
            if (!epx.f(actionLink.c, "video")) {
                actionLink = null;
            }
            if (actionLink != null) {
                str = actionLink.d;
            }
        }
        str = null;
        ClipEditAttachedVideo.RawId rawId = str != null ? new ClipEditAttachedVideo.RawId(str) : null;
        List<CoOwnerItem> list = z6.N1;
        ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            CoOwnerItem coOwnerItem = (CoOwnerItem) it3.next();
            Iterator it4 = it3;
            UserId userId3 = coOwnerItem.b;
            Owner owner3 = coOwnerItem.d;
            ClipEditAttachedVideo.RawId rawId2 = rawId;
            String str6 = owner3.c;
            String str7 = str6 == null ? "" : str6;
            String str8 = owner3.d;
            arrayList3.add(new ClipCoauthorSdkItem(userId3, str7, str8 == null ? "" : str8, null, coOwnerItem.Ab(), coOwnerItem.e));
            it3 = it4;
            rawId = rawId2;
        }
        ClipEditAttachedVideo.RawId rawId3 = rawId;
        Owner owner4 = z6.v0;
        if (owner4 == null || !fkq0.b(owner4.b)) {
            qwe qweVar = xyoVar.b;
            PrivacySetting privacySetting = new PrivacySetting();
            privacySetting.e = z6.x0;
            s3q0 s3q0Var = s3q0.a;
            if (qweVar.p(privacySetting) != PostingVisibilityMode.ALL) {
                z = false;
                owner = z6.v0;
                if (owner == null && fkq0.b(owner.b)) {
                    Owner owner5 = z6.v0;
                    if (owner5 == null || (userId = owner5.b) == null || (C0 = xyoVar.c.C0(userId)) == null || C0.m != 0) {
                        i = 16;
                        z2 = true;
                    }
                    i = 16;
                    z2 = false;
                } else {
                    owner2 = z6.v0;
                    if (owner2 != null) {
                        i = 16;
                    }
                    i = 16;
                    z2 = false;
                }
                int i4 = i;
                ClipEditSdkItem clipEditSdkItem = new ClipEditSdkItem(str4, userId2, null, a, i2, i3, str3, sdkImages, clipEditSdkThumbsItem, sdkClipOrdData, rawId3, arrayList3, z, z2, z6.W);
                if (z5) {
                    context = activity;
                } else {
                    dhr0.a.getClass();
                    context = new l7s(activity, dhr0.u().c);
                }
                context2 = activity;
                while (true) {
                    z3 = context2 instanceof FragmentActivity;
                    if (z3 || !(context2 instanceof ContextWrapper)) {
                        break;
                    } else {
                        context2 = ((ContextWrapper) context2).getBaseContext();
                    }
                }
                FragmentManager supportFragmentManager = ((FragmentActivity) (!z3 ? (Activity) context2 : null)).getSupportFragmentManager();
                context3 = activity;
                while (true) {
                    z4 = context3 instanceof FragmentActivity;
                    if (z4 || !(context3 instanceof ContextWrapper)) {
                        break;
                    } else {
                        context3 = ((ContextWrapper) context3).getBaseContext();
                    }
                }
                xtcVar.a(clipEditSdkItem, new xtc.a(context, supportFragmentManager, (f5z) (z4 ? (Activity) context3 : null), z5), new defpackage.c(i4, z6, gzsVar), new fy7(xyoVar, activity, z6, 5));
            }
        }
        z = true;
        owner = z6.v0;
        if (owner == null) {
        }
        owner2 = z6.v0;
        if (owner2 != null) {
        }
        i = 16;
        z2 = false;
        int i42 = i;
        ClipEditSdkItem clipEditSdkItem2 = new ClipEditSdkItem(str4, userId2, null, a, i2, i3, str3, sdkImages, clipEditSdkThumbsItem, sdkClipOrdData, rawId3, arrayList3, z, z2, z6.W);
        if (z5) {
        }
        context2 = activity;
        while (true) {
            z3 = context2 instanceof FragmentActivity;
            if (z3) {
                break;
            } else {
                break;
            }
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        FragmentManager supportFragmentManager2 = ((FragmentActivity) (!z3 ? (Activity) context2 : null)).getSupportFragmentManager();
        context3 = activity;
        while (true) {
            z4 = context3 instanceof FragmentActivity;
            if (z4) {
                break;
            } else {
                break;
            }
            context3 = ((ContextWrapper) context3).getBaseContext();
        }
        xtcVar.a(clipEditSdkItem2, new xtc.a(context, supportFragmentManager2, (f5z) (z4 ? (Activity) context3 : null), z5), new defpackage.c(i42, z6, gzsVar), new fy7(xyoVar, activity, z6, 5));
    }
}
