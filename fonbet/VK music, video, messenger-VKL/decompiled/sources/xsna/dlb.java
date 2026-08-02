package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.search.CatalogSearchEntityAnswer;
import com.vk.catalog2.common.dto.api.search.CatalogSearchEntityPerson;
import com.vk.catalog2.common.dto.api.search.CatalogSearchEntityVideoPlaylist;
import com.vk.catalog2.common.dto.api.search.SearchEntity;
import com.vk.catalog2.common.dto.api.style.SearchEntityCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFollow;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayVideosFromBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionToggleAlbumSubscription;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchEntityPerson;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchEntityVideoPlaylist;
import com.vk.debug.design.MockType;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoAlbum;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.itemlist.impl.presentation.fragment.ImItemListFragment;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.hs50;
import xsna.jnh0;
import xsna.oap;
import xsna.t5e;
import xsna.ylm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class dlb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dlb(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [android.view.View, androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r2v81, types: [xsna.oap$b] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        kbz0 kbz0Var;
        ArrayList arrayList;
        oap.a aVar;
        Object uIBlockSearchEntityPerson;
        VideoAlbum videoAlbum;
        Object obj2;
        List<String> list;
        int i;
        int i2;
        int i3 = this.b;
        int i4 = 2;
        r4 = null;
        r4 = null;
        UIBlockActionPlayVideosFromBlock uIBlockActionPlayVideosFromBlock = null;
        UIBlockActionFollow uIBlockActionFollow = null;
        r4 = null;
        Bitmap bitmap = null;
        int i5 = 0;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i3) {
            case 0:
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                qyg0 V0 = ((hyg0) obj).V0("UPDATE audio_book_chapter SET manifest_url = ? WHERE uid = ? AND chapter_id = ?");
                try {
                    V0.D3(1, str);
                    V0.D3(2, str2);
                    V0.D3(3, str3);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 1:
                ((h5e) obj5).b.d(t5e.a.a, (Context) obj4);
                h5e.j((VideoFile) obj3, false);
                return s3q0.a;
            case 2:
                wh50 wh50Var = (wh50) obj5;
                wh50 wh50Var2 = (wh50) obj4;
                Context context = (Context) obj3;
                Uri uri = (Uri) obj;
                int intValue = ((Number) wh50Var.getValue()).intValue();
                wh50Var.setValue(-1);
                if (uri != null && intValue >= 0 && intValue < r6l.b(wh50Var2).size()) {
                    try {
                        context.getContentResolver().takePersistableUriPermission(uri, 1);
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable unused) {
                    }
                    ArrayList arrayList2 = new ArrayList(new wow(((wow) wh50Var2.getValue()).b));
                    arrayList2.set(intValue, uu20.a((uu20) arrayList2.get(intValue), null, MockType.FILE, uri.toString(), r6l.k(context, uri), null, 17));
                    wh50Var2.setValue(new wow(arrayList2));
                }
                return s3q0.a;
            case 3:
                pdm pdmVar = (pdm) obj5;
                Peer peer = (Peer) obj4;
                ArrayList a = pdmVar.g().a(peer);
                long j = peer.b;
                Set S0 = j5g.S0(a);
                Set S02 = j5g.S0((ArrayList) obj3);
                if (epx.f(S02, S0)) {
                    return s3q0.a;
                }
                Set g = izi0.g(S02, S0);
                Set g2 = izi0.g(S0, S02);
                ylm g3 = pdmVar.g();
                Set set = g2;
                g3.getClass();
                if (!set.isEmpty()) {
                    g3.b.b().f(g3.a.a, ylm.a.DIALOG_ID.getKey() + " = " + j + " AND " + ylm.a.SUBLIST_TYPE.getKey() + " in " + j5g.g0(set, null, "(", ")", 0, new la2(23), 25), new Object[0]);
                }
                ylm g4 = pdmVar.g();
                Set set2 = g;
                g4.getClass();
                if (!set2.isEmpty()) {
                    String g0 = j5g.g0(set2, null, null, null, 0, new n4b(j, i4), 31);
                    g4.b.b().j("INSERT OR REPLACE INTO " + g4.a.a + " (" + ylm.a.DIALOG_ID.getKey() + ", " + ylm.a.SUBLIST_TYPE.getKey() + ") VALUES " + g0);
                }
                Iterator it = pdmVar.l().a(set2).iterator();
                while (it.hasNext()) {
                    pdmVar.p(((Number) it.next()).intValue(), Collections.singletonList(peer));
                }
                Iterator it2 = izi0.g(j5g.S0(pdmVar.l().a(set)), j5g.S0(pdmVar.d().b(peer))).iterator();
                while (it2.hasNext()) {
                    pdmVar.d.c(Collections.singletonList(peer), ((Number) it2.next()).intValue());
                }
                return s3q0.a;
            case 4:
                kmp kmpVar = (kmp) obj5;
                androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                ConstraintLayout constraintLayout = kmpVar.c;
                bVar.i(constraintLayout);
                ConstraintLayout constraintLayout2 = kmpVar.e;
                bVar.p(R.id.content, constraintLayout2.getWidth());
                bVar.n(R.id.content, constraintLayout2.getHeight() + ((int) Math.floor(60.0f * Resources.getSystem().getDisplayMetrics().density)));
                bVar.b(constraintLayout);
                kmpVar.l = constraintLayout2.getWidth();
                Matrix matrix = new Matrix();
                matrix.setScale(constraintLayout2.getWidth() / r8.getWidth(), constraintLayout2.getHeight() / r8.getHeight());
                ImageView imageView = kmpVar.f;
                imageView.setImageMatrix(matrix);
                imageView.setImageBitmap((Bitmap) obj4);
                kmpVar.g.setImageBitmap((Bitmap) obj3);
                androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
                bVar2.i(constraintLayout2);
                bVar2.p(R.id.photoOriginal, an10.b(kmpVar.l));
                bVar2.b(constraintLayout2);
                ?? r0 = kmpVar.h;
                r0.setVisibility(4);
                r0.setTranslationX(kmpVar.l);
                rrn rrnVar = new rrn(r0, constraintLayout2, new jmp(2, kmpVar, kmp.class, "onDividerMove", "onDividerMove(FZ)V", 0));
                r0.setOnTouchListener(rrnVar);
                k6k k6kVar = new k6k(kmpVar, 6);
                r0.setVisibility(0);
                d0u0.a(r0.animate().setInterpolator(new AccelerateDecelerateInterpolator()).setStartDelay(500L).setDuration(1100L).translationX(rrnVar.f).setUpdateListener(new hl7(rrnVar, 1)), new defpackage.u(13, rrnVar, k6kVar)).start();
                return s3q0.a;
            case 5:
                final ImItemListFragment imItemListFragment = (ImItemListFragment) obj5;
                final p7w p7wVar = (p7w) obj3;
                com.vk.mvi.binder.c cVar = (com.vk.mvi.binder.c) obj;
                qcy<Object>[] qcyVarArr = ImItemListFragment.S;
                com.vk.mvi.binder.c.b(cVar, f9t.F(f9t.z(imItemListFragment.eo()), new wik((r7w) obj4, 16)), new np1(imItemListFragment, p7wVar));
                com.vk.mvi.binder.c.a(cVar, f9t.w(imItemListFragment.eo()), new iyp(imItemListFragment, p7wVar) { // from class: xsna.s5w
                    public final /* synthetic */ p7w b;

                    {
                        this.b = p7wVar;
                    }

                    @Override // xsna.iyp
                    public final void a(pk50 pk50Var) {
                        qcy<Object>[] qcyVarArr2 = ImItemListFragment.S;
                        try {
                            new com.vk.movika.sdk.base.ui.p(9, (l6w) pk50Var, this.b).invoke();
                        } catch (Throwable th2) {
                            com.vk.metrics.eventtracking.b.a.q(th2);
                        }
                    }
                });
                return s3q0.a;
            case 6:
                st10 st10Var = (st10) obj4;
                LocalMediaEntry localMediaEntry = (LocalMediaEntry) obj;
                st10Var.e(((PostingState.Editing) ((PostingState) obj5)).c.b.b.b, localMediaEntry);
                st10Var.a.a(new e.b.h.C1425b(new MediaPickerSelectedItem.LocalMedia(localMediaEntry), (Integer) obj3));
                return s3q0.a;
            case 7:
                de40 de40Var = (de40) obj5;
                UIBlockLink uIBlockLink = (UIBlockLink) obj4;
                View view = (View) obj3;
                b5a b5aVar = de40Var.e;
                Meta meta = uIBlockLink.y.g;
                b5aVar.a(new cfp0(uIBlockLink, meta != null ? meta.c : null));
                de40Var.h.invoke(view, uIBlockLink);
                return s3q0.a;
            case 8:
                hs50 hs50Var = (hs50) obj5;
                zu50 zu50Var = (zu50) obj4;
                gjx gjxVar = (gjx) obj3;
                NewsEntry t6 = hs50Var.t6();
                if (t6 instanceof MyTargetNativeAdEntry) {
                    hs50Var.c7().E6(t6);
                    if (zu50Var != null) {
                        Drawable drawable = hs50Var.G.getImageView().getDrawable();
                        if (drawable != null) {
                            hs50Var.f7(drawable);
                        } else {
                            hs50.b bVar3 = hs50Var.Y;
                            zu50Var.k = bVar3;
                            ckz0 ckz0Var = zu50Var.h;
                            if (ckz0Var != null) {
                                ckz0Var.m(bVar3);
                            }
                        }
                    } else if (gjxVar != null) {
                        wjz0 content = gjxVar.getContent();
                        if (content != null && (kbz0Var = content.e) != null) {
                            bitmap = kbz0Var.a.a();
                        }
                        if (bitmap != null) {
                            hs50Var.e7(bitmap);
                        }
                    }
                }
                return s3q0.a;
            case 9:
                e2b0 e2b0Var = (e2b0) obj5;
                gzs gzsVar = (gzs) obj4;
                PlaybackActionMeta playbackActionMeta = (PlaybackActionMeta) obj3;
                lqk0 lqk0Var = (lqk0) obj;
                e2b0Var.getClass();
                if (lqk0Var != null) {
                    List<MusicTrack> list2 = lqk0Var.c;
                    boolean z = (list2 == null || list2.isEmpty()) ? false : true;
                    if (!z) {
                        list2 = Collections.EMPTY_LIST;
                    }
                    e2b0Var.D(list2, z ? 0 : null, lqk0Var.d, 0, false, null, lqk0Var.a, playbackActionMeta, null);
                } else if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            default:
                bi20 bi20Var = (bi20) obj5;
                CatalogExtendedData catalogExtendedData = (CatalogExtendedData) obj4;
                List list3 = (List) obj3;
                CatalogSearchEntityAnswer catalogSearchEntityAnswer = (CatalogSearchEntityAnswer) obj;
                CatalogSearchEntityAnswer.EntityType entityType = catalogSearchEntityAnswer.b;
                SearchEntity searchEntity = catalogSearchEntityAnswer.c;
                int i6 = jnh0.a.$EnumSwitchMapping$1[entityType.ordinal()];
                if (i6 == 1) {
                    CatalogSearchEntityPerson catalogSearchEntityPerson = searchEntity instanceof CatalogSearchEntityPerson ? (CatalogSearchEntityPerson) searchEntity : null;
                    if (catalogSearchEntityPerson == null) {
                        return null;
                    }
                    UserId userId = catalogSearchEntityPerson.c;
                    List<UserId> list4 = catalogSearchEntityPerson.j;
                    if (list4 != null) {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = list4.iterator();
                        while (it3.hasNext()) {
                            UserProfile userProfile = catalogExtendedData.Gb((UserId) it3.next()).a;
                            if (userProfile != null) {
                                arrayList3.add(userProfile);
                            }
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = null;
                    }
                    rba Gb = catalogExtendedData.Gb(userId);
                    Group group = Gb.b;
                    if (group != null) {
                        aVar = new oap.b(group);
                    } else {
                        UserProfile userProfile2 = Gb.a;
                        if (userProfile2 == null) {
                            return null;
                        }
                        aVar = new oap.a(userProfile2);
                    }
                    Bundle bundle = bi20Var.p;
                    List<UIBlockAction> list5 = bi20Var.l;
                    String string = bundle.getString(CatalogCustomAttributes$Keys.STYLE.h());
                    com.vk.catalog2.common.dto.api.ui.a aVar2 = new com.vk.catalog2.common.dto.api.ui.a(bi20Var.a, bi20Var.b, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, string != null ? new SearchEntityCatalogViewStyle(string, CatalogSearchEntityAnswer.EntityType.Person) : null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7168);
                    List<UIBlockAction> list6 = list5;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj6 : list6) {
                        if (obj6 instanceof UIBlockActionFollow) {
                            arrayList4.add(obj6);
                        }
                    }
                    Iterator it4 = arrayList4.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            ?? next = it4.next();
                            if (epx.f(((UIBlockActionFollow) next).g, userId)) {
                                uIBlockActionFollow = next;
                            }
                        }
                    }
                    UIBlockActionFollow uIBlockActionFollow2 = uIBlockActionFollow;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj7 : list6) {
                        if (obj7 instanceof UIBlockActionPlayAudiosFromBlock) {
                            arrayList5.add(obj7);
                        }
                    }
                    uIBlockSearchEntityPerson = new UIBlockSearchEntityPerson(aVar2, catalogSearchEntityPerson, aVar, uIBlockActionFollow2, arrayList, (UIBlockActionPlayAudiosFromBlock) j5g.a0(arrayList5));
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CatalogSearchEntityVideoPlaylist catalogSearchEntityVideoPlaylist = searchEntity instanceof CatalogSearchEntityVideoPlaylist ? (CatalogSearchEntityVideoPlaylist) searchEntity : null;
                    if (catalogSearchEntityVideoPlaylist == null) {
                        return null;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(catalogSearchEntityVideoPlaylist.c.b);
                    sb.append('_');
                    sb.append(catalogSearchEntityVideoPlaylist.d);
                    String sb2 = sb.toString();
                    if (sb2 != null) {
                        videoAlbum = catalogExtendedData.i.get(sb2);
                    } else {
                        catalogExtendedData.getClass();
                        videoAlbum = null;
                    }
                    if (videoAlbum == null) {
                        return null;
                    }
                    Bundle bundle2 = bi20Var.p;
                    List<UIBlockAction> list7 = bi20Var.l;
                    String string2 = bundle2.getString(CatalogCustomAttributes$Keys.STYLE.h());
                    SearchEntityCatalogViewStyle searchEntityCatalogViewStyle = string2 != null ? new SearchEntityCatalogViewStyle(string2, CatalogSearchEntityAnswer.EntityType.VideoPlaylist) : null;
                    List<UIBlockAction> list8 = list7;
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj8 : list8) {
                        if (obj8 instanceof UIBlockActionPlayVideosFromBlock) {
                            arrayList6.add(obj8);
                        }
                    }
                    UIBlockActionPlayVideosFromBlock uIBlockActionPlayVideosFromBlock2 = (UIBlockActionPlayVideosFromBlock) j5g.a0(arrayList6);
                    if (uIBlockActionPlayVideosFromBlock2 != null) {
                        Iterator it5 = list3.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                obj2 = it5.next();
                                if (epx.f(((CatalogBlock) obj2).b, uIBlockActionPlayVideosFromBlock2.B)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        CatalogBlock catalogBlock = (CatalogBlock) obj2;
                        if (catalogBlock == null) {
                            Iterator it6 = list3.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    i5 = -1;
                                } else if (!epx.f(((CatalogBlock) it6.next()).b, bi20Var.a)) {
                                    i5++;
                                }
                            }
                            catalogBlock = (i5 == -1 || list3.size() <= (i = i5 + 1)) ? null : (((CatalogBlock) list3.get(i)).c != CatalogDataType.DATA_TYPE_NONE || list3.size() <= (i2 = i5 + 2)) ? (CatalogBlock) list3.get(i) : (CatalogBlock) list3.get(i2);
                        }
                        if (catalogBlock != null && (list = catalogBlock.m.c) != null) {
                            ArrayList arrayList7 = new ArrayList();
                            Iterator it7 = list.iterator();
                            while (it7.hasNext()) {
                                Object Ab = catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_VIDEO_VIDEOS, (String) it7.next());
                                VideoFile videoFile = Ab instanceof VideoFile ? (VideoFile) Ab : null;
                                if (videoFile != null) {
                                    arrayList7.add(videoFile);
                                }
                            }
                            uIBlockActionPlayVideosFromBlock = uIBlockActionPlayVideosFromBlock2.Rb(arrayList7);
                        }
                    }
                    UIBlockActionPlayVideosFromBlock uIBlockActionPlayVideosFromBlock3 = uIBlockActionPlayVideosFromBlock;
                    com.vk.catalog2.common.dto.api.ui.a aVar3 = new com.vk.catalog2.common.dto.api.ui.a(bi20Var.a, bi20Var.b, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, searchEntityCatalogViewStyle, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7168);
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj9 : list8) {
                        if (obj9 instanceof UIBlockActionToggleAlbumSubscription) {
                            arrayList8.add(obj9);
                        }
                    }
                    uIBlockSearchEntityPerson = new UIBlockSearchEntityVideoPlaylist(aVar3, catalogSearchEntityVideoPlaylist, (UIBlockActionToggleAlbumSubscription) j5g.a0(arrayList8), uIBlockActionPlayVideosFromBlock3, videoAlbum);
                }
                return uIBlockSearchEntityPerson;
        }
    }
}
