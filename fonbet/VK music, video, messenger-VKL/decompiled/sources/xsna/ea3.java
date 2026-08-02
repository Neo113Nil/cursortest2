package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.articles.ArticleFragment;
import com.vk.attachpicker.stickers.reply.ReplyVideoStickerStyle;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.screendata.MultiAccountData;
import com.vk.clips.editor.mapper.fragment.ClipsEditorFragment;
import com.vk.clips.upload.model.ClipUploadData;
import com.vk.clips.upload.model.ClipUploadParams;
import com.vk.clips.upload.vk.ui.api.ClipUploadScreenRuntimeConfig;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkComponent;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkNavigator;
import com.vk.dto.articles.Article;
import com.vk.dto.clips.external.VideoToClipInfo;
import com.vk.dto.clips.masks.MaskLight;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vk.dto.clips.morphing.AudioEffectType;
import com.vk.dto.clips.morphing.AudioMorphingTypeStat;
import com.vk.dto.clips.music.MusicCatalogInfoEditor;
import com.vk.dto.clips.upload.ClipTemplateInfo;
import com.vk.dto.clips.upload.ClipsEditorEntry;
import com.vk.dto.clips.upload.ClipsEditorUploadParams;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.SaveCustomPosterResponse;
import com.vk.dto.stories.entities.stat.StickersStatInfo;
import com.vk.dto.stories.entities.stat.StoryStatContainer;
import com.vk.dto.stories.entities.stat.TextStatInfo;
import com.vk.dto.stories.model.CanvasStickerDraft;
import com.vk.dto.stories.model.NarrativePublishEventType;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.media.pipeline.model.item.PlayableItem;
import com.vk.media.pipeline.model.source.MediaSource;
import com.vk.media.pipeline.model.source.local.TrackMediaSource;
import com.vk.media.pipeline.model.timeline.AudioFragmentItem;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vk.media.pipeline.model.timeline.VideoFragment;
import com.vk.newsfeed.impl.posting.a;
import com.vk.registration.funnels.RegistrationElementsTracker;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.upload.impl.UploadNotification;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.c2r0;
import xsna.r2c;
import xsna.w0e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ea3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ea3(androidx.appcompat.app.d dVar, s8i0 s8i0Var, String str) {
        this.b = 9;
        this.d = dVar;
        this.e = s8i0Var;
        this.c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x014e, code lost:
    
        if (r7 != (-1)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0151, code lost:
    
        r8 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0155, code lost:
    
        if (r8 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0157, code lost:
    
        r12.n(new xsna.u1s.c(r8.intValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x016f, code lost:
    
        return xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0164, code lost:
    
        r12.l = ((xsna.mb80) r11).b;
        r10.invoke();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v10, types: [xsna.god0] */
    /* JADX WARN: Type inference failed for: r12v10, types: [xsna.ar80] */
    /* JADX WARN: Type inference failed for: r3v9, types: [androidx.fragment.app.Fragment, com.vk.clips.editor.mapper.fragment.ClipsEditorFragment, com.vk.core.fragments.FragmentImpl] */
    /* JADX WARN: Type inference failed for: r6v39, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v40, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v41, types: [java.util.ArrayList] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ClipUploadParams.LicensedAudioInfo licensedAudioInfo;
        Object obj2;
        File u;
        boolean z;
        bpn0 bpn0Var;
        ?? r6;
        StickersStatInfo stickersStatInfo;
        StickersStatInfo stickersStatInfo2;
        int i;
        List<ClickableSticker> a;
        int i2 = this.b;
        int i3 = 0;
        Integer num = null;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i2) {
            case 0:
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                qyg0 V0 = ((hyg0) obj).V0("INSERT OR REPLACE INTO app_values(name, value, storage_name) VALUES(?, ?, ?)");
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
                Article article = (Article) obj5;
                ArticleFragment articleFragment = (ArticleFragment) obj4;
                FragmentActivity fragmentActivity = (FragmentActivity) obj3;
                int i4 = ArticleFragment.E0;
                article.n = !article.n;
                articleFragment.po(article);
                if (articleFragment.mo(article)) {
                    articleFragment.xo(fragmentActivity);
                }
                return s3q0.a;
            case 2:
                MultiAccountData multiAccountData = (MultiAccountData) obj4;
                SignUpRouter signUpRouter = (SignUpRouter) obj3;
                String str4 = (String) obj5;
                List list = (List) obj;
                boolean z2 = multiAccountData.c;
                List<UserId> list2 = multiAccountData.b;
                if (z2) {
                    com.vk.auth.a.b(signUpRouter, str4);
                } else {
                    List list3 = list;
                    if (list3 == null || list3.isEmpty()) {
                        com.vk.auth.a.b(signUpRouter, str4);
                    } else {
                        if (list.size() == list2.size()) {
                            List list4 = list;
                            ArrayList arrayList = new ArrayList(c5g.u(list4, 10));
                            Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((c2r0.b) it.next()).a);
                            }
                            if (epx.f(j5g.S0(arrayList), j5g.S0(list2))) {
                                com.vk.auth.a.b(signUpRouter, str4);
                            }
                        }
                        par0.a.getClass();
                        par0.a("[AuthScreenOpenerDelegate] open exchange users from MultiAccount");
                        com.vk.registration.funnels.b.a.getClass();
                        frf0.h();
                        RegistrationElementsTracker.b.clear();
                        signUpRouter.G0(multiAccountData);
                    }
                }
                return s3q0.a;
            case 3:
                ((izs) obj5).invoke(new r2c.z(((u1x) obj4).b, ((tho0) ((wh50) obj3).getValue()).a.c, r2c.z.a.b.a));
                return s3q0.a;
            case 4:
                ClipsEditorUploadParams clipsEditorUploadParams = (ClipsEditorUploadParams) obj5;
                lzd lzdVar = (lzd) obj4;
                ClipsEncoderParameters clipsEncoderParameters = (ClipsEncoderParameters) ((Pair) obj).d();
                nal0 nal0Var = lzdVar.d;
                CopyOnWriteArrayList<nov> copyOnWriteArrayList = nal0Var.d().b;
                String str5 = ((com.vk.clips.editor.state.model.a) obj3).a.c;
                bzd bzdVar = bzd.this;
                ClipsEditorFragment.b bVar = bzdVar.d;
                Context ctx = bzdVar.c.getCtx();
                ?? r3 = ClipsEditorFragment.this;
                bpn0 bpn0Var2 = r3.O;
                ClipsEncoderParameters.VideoOutputSettings videoOutputSettings = clipsEncoderParameters.c;
                int i5 = videoOutputSettings.b;
                int i6 = videoOutputSettings.c;
                ClipsEditorUploadParams.LicensedAudioInfo licensedAudioInfo2 = clipsEditorUploadParams.j;
                if (licensedAudioInfo2 != null) {
                    int i7 = licensedAudioInfo2.b;
                    UserId userId = licensedAudioInfo2.c;
                    MusicCatalogInfoEditor musicCatalogInfoEditor = licensedAudioInfo2.d;
                    licensedAudioInfo = new ClipUploadParams.LicensedAudioInfo(i7, userId, musicCatalogInfoEditor != null ? musicCatalogInfoEditor.b : null, musicCatalogInfoEditor != null ? musicCatalogInfoEditor.c : null, musicCatalogInfoEditor != null ? musicCatalogInfoEditor.d : null, musicCatalogInfoEditor != null ? musicCatalogInfoEditor.f : null);
                } else {
                    licensedAudioInfo = null;
                }
                ClipsEditorEntry clipsEditorEntry = clipsEditorUploadParams.h;
                int i8 = clipsEditorEntry == null ? -1 : w0e.a.$EnumSwitchMapping$0[clipsEditorEntry.ordinal()];
                MobileOfficialAppsClipsStat$TypeClipUploadItem.CameraType cameraType = i8 != 1 ? i8 != 2 ? i8 != 3 ? MobileOfficialAppsClipsStat$TypeClipUploadItem.CameraType.MULTI : MobileOfficialAppsClipsStat$TypeClipUploadItem.CameraType.GALLERY : MobileOfficialAppsClipsStat$TypeClipUploadItem.CameraType.FRONT : MobileOfficialAppsClipsStat$TypeClipUploadItem.CameraType.BACK;
                Iterator it2 = MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType.h().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (epx.f(((MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType) obj2).name(), clipsEditorUploadParams.g)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType duetType = (MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType) obj2;
                int i9 = clipsEditorUploadParams.b;
                String str6 = clipsEditorUploadParams.u;
                int i10 = clipsEditorUploadParams.o;
                List<AudioEffectType> list5 = clipsEditorUploadParams.m;
                AudioMorphingTypeStat audioMorphingTypeStat = list5 != null ? new AudioMorphingTypeStat(list5) : null;
                List<MaskLight> list6 = clipsEditorUploadParams.l;
                ClipTemplateInfo clipTemplateInfo = clipsEditorUploadParams.n;
                ArrayList arrayList2 = new ArrayList();
                for (nov novVar : copyOnWriteArrayList) {
                    if (aal0.h(novVar) && (a = aal0.a(novVar)) != null) {
                        arrayList2.addAll(a);
                        i9 = i9;
                    }
                }
                int i11 = i9;
                ClickableStickers clickableStickers = arrayList2.isEmpty() ? null : new ClickableStickers(i5, i6, arrayList2);
                String str7 = clipsEditorUploadParams.v;
                VideoToClipInfo videoToClipInfo = clipsEditorUploadParams.w;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (nov novVar2 : copyOnWriteArrayList) {
                    String str8 = str6;
                    int i12 = i10;
                    if (novVar2 instanceof xlo0) {
                        xlo0 xlo0Var = (xlo0) novVar2;
                        String obj6 = xlo0Var.l.toString();
                        imo0 imo0Var = xlo0Var.k;
                        String str9 = imo0Var.m;
                        int i13 = (int) (imo0Var.c / iah0.f().density);
                        String hexString = Integer.toHexString(imo0Var.g);
                        String str10 = imo0Var.n;
                        if (str10 == null) {
                            str10 = "none";
                        }
                        arrayList3.add(new TextStatInfo(obj6, str9, i13, hexString, str10, imo0.a(imo0Var.b)));
                    } else if (novVar2 instanceof c8m0) {
                        c8m0 c8m0Var = (c8m0) novVar2;
                        arrayList4.add(new StickersStatInfo(c8m0Var.q ? "photo_repost" : "photo", 0L, 0, c8m0Var.r.m()));
                    } else {
                        boolean z3 = novVar2 instanceof ad7;
                        ArrayList arrayList7 = arrayList3;
                        if (z3) {
                            ad7 ad7Var = (ad7) novVar2;
                            z = z3;
                            bpn0Var = bpn0Var2;
                            if (ad7Var.l == WebStickerType.STICKER) {
                                String str11 = ad7Var.m;
                                List c0 = drm0.c0(str11, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
                                if (c0.size() == 2) {
                                    long l = cqm0.l((String) c0.get(1));
                                    try {
                                        i = Integer.parseInt((String) c0.get(0));
                                    } catch (Throwable unused) {
                                        i = 0;
                                    }
                                    stickersStatInfo2 = new StickersStatInfo("from_pack", l, i, null, 8, null);
                                } else if (c0.size() == 1) {
                                    stickersStatInfo2 = new StickersStatInfo("individual", cqm0.l(str11), 0, null, 8, null);
                                } else {
                                    stickersStatInfo = null;
                                    arrayList4.add(stickersStatInfo);
                                    bpn0Var2 = bpn0Var;
                                    i10 = i12;
                                    str6 = str8;
                                    arrayList3 = arrayList7;
                                }
                                stickersStatInfo = stickersStatInfo2;
                                arrayList4.add(stickersStatInfo);
                                bpn0Var2 = bpn0Var;
                                i10 = i12;
                                str6 = str8;
                                arrayList3 = arrayList7;
                            }
                        } else {
                            z = z3;
                            bpn0Var = bpn0Var2;
                        }
                        if (z) {
                            ad7 ad7Var2 = (ad7) novVar2;
                            if (ad7Var2.l == WebStickerType.EMOJI) {
                                arrayList5.add(ad7Var2.m);
                                bpn0Var2 = bpn0Var;
                                i10 = i12;
                                str6 = str8;
                                arrayList3 = arrayList7;
                            }
                        }
                        if (novVar2 instanceof g4m0) {
                            arrayList4.add(new StickersStatInfo("gif", cqm0.l(((g4m0) novVar2).i), 0, null, 8, null));
                        } else if (novVar2 instanceof v800) {
                            arrayList4.add(eif.a(((v800) novVar2).j));
                        } else if (novVar2 instanceof t690) {
                            arrayList4.add(eif.a(((t690) novVar2).l));
                        } else if (aal0.h(novVar2)) {
                            List<ClickableSticker> a2 = aal0.a(novVar2);
                            if (a2 != null) {
                                List<ClickableSticker> list7 = a2;
                                r6 = new ArrayList(c5g.u(list7, 10));
                                Iterator it3 = list7.iterator();
                                while (it3.hasNext()) {
                                    r6.add(((ClickableSticker) it3.next()).zb());
                                }
                            } else {
                                r6 = EmptyList.b;
                            }
                            arrayList6.addAll(r6);
                        } else if (novVar2 instanceof yjm0) {
                            arrayList4.add(new StickersStatInfo("time", 0L, 0, null, 8, null));
                        }
                        bpn0Var2 = bpn0Var;
                        i10 = i12;
                        str6 = str8;
                        arrayList3 = arrayList7;
                    }
                    i10 = i12;
                    str6 = str8;
                }
                bpn0 bpn0Var3 = bpn0Var2;
                ClipUploadParams clipUploadParams = new ClipUploadParams(i11, str6, i10, str5, null, false, null, null, false, false, null, 0, null, null, null, null, null, null, audioMorphingTypeStat, list6, clipTemplateInfo, clickableStickers, str7, videoToClipInfo, null, null, null, null, licensedAudioInfo, new StoryStatContainer(arrayList3, j5g.V(arrayList4), EmptyList.b, arrayList5, arrayList6, null), clipsEditorUploadParams.x, clipsEditorUploadParams.y, clipsEditorUploadParams.A, clipsEditorUploadParams.e, cameraType, duetType, false, clipsEditorUploadParams.k, clipsEditorUploadParams.s, clipsEditorUploadParams.p, clipsEditorUploadParams.q, false, false, clipsEditorUploadParams.t, false, 251920368, 5648, null);
                ArrayList arrayList8 = new ArrayList();
                Iterator it4 = copyOnWriteArrayList.iterator();
                while (it4.hasNext()) {
                    CanvasStickerDraft c = v9l0.c((nov) it4.next());
                    if (c != null) {
                        arrayList8.add(c);
                    }
                }
                ClipUploadData clipUploadData = new ClipUploadData(clipUploadParams, ClipsEncoderParameters.a(clipsEncoderParameters, null, arrayList8, 63), 0, null, 12, null);
                Integer num2 = ClipsEditorFragment.W;
                ((lbk) bpn0Var3.getValue()).g(clipsEncoderParameters.toString());
                Timeline timeline = clipsEncoderParameters.b;
                List<VideoFragment> list8 = timeline.b;
                ArrayList arrayList9 = new ArrayList(c5g.u(list8, 10));
                Iterator it5 = list8.iterator();
                while (it5.hasNext()) {
                    arrayList9.add(((VideoFragment) it5.next()).b);
                }
                List<AudioFragmentItem> list9 = timeline.c.b;
                ArrayList arrayList10 = new ArrayList(c5g.u(list9, 10));
                Iterator it6 = list9.iterator();
                while (it6.hasNext()) {
                    arrayList10.add(((AudioFragmentItem) it6.next()).b);
                }
                ArrayList u0 = j5g.u0(arrayList10, arrayList9);
                ArrayList arrayList11 = new ArrayList(c5g.u(u0, 10));
                Iterator it7 = u0.iterator();
                while (it7.hasNext()) {
                    arrayList11.add(((PlayableItem) it7.next()).t());
                }
                ArrayList arrayList12 = new ArrayList();
                Iterator it8 = arrayList11.iterator();
                while (it8.hasNext()) {
                    MediaSource mediaSource = (MediaSource) it8.next();
                    String absolutePath = (!(mediaSource instanceof TrackMediaSource) || (u = up2.u(((TrackMediaSource) mediaSource).b)) == null) ? null : u.getAbsolutePath();
                    if (absolutePath != null) {
                        arrayList12.add(absolutePath);
                    }
                }
                ((lbk) bpn0Var3.getValue()).d(j5g.R(arrayList12));
                if (r3.requireArguments().getBoolean("finish_on_done", false)) {
                    Intent intent = new Intent();
                    intent.putExtra("result_upload_data", clipUploadData);
                    r3.Mf(-1, intent);
                } else {
                    ((ClipsUploadUiVkComponent) r3.N.getValue()).f().a(ctx, 811, new ClipsUploadUiVkNavigator.ClipUploadDataFull(clipUploadData, false, new ClipUploadScreenRuntimeConfig(false, false, false, 4, null)));
                }
                nal0Var.i().a(true);
                lzdVar.b.p();
                return s3q0.a;
            case 5:
                m1s m1sVar = (m1s) obj5;
                a1s a1sVar = (a1s) obj4;
                i5f i5fVar = (i5f) obj3;
                Iterator it9 = ((v1s) obj).c.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        i3 = -1;
                        break;
                    } else {
                        Object next = it9.next();
                        if (i3 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((xyr) next).getType() == ((mb80) a1sVar).b) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            case 6:
                rg50 rg50Var = (rg50) obj4;
                kg50 kg50Var = (kg50) obj3;
                tny tnyVar = (tny) obj;
                if (((Boolean) ((wh50) obj5).getValue()).booleanValue()) {
                    rg50Var.C((int) (tnyVar.a() & 4294967295L));
                    kg50Var.g(Float.intBitsToFloat((int) (tnyVar.U(0L) & 4294967295L)));
                }
                return s3q0.a;
            case 7:
                io.reactivex.rxjava3.subjects.f fVar = (io.reactivex.rxjava3.subjects.f) obj5;
                flc0 flc0Var = (flc0) obj4;
                aac0 aac0Var = (aac0) obj3;
                UploadNotification.b bVar2 = (UploadNotification.b) obj;
                int i14 = a.b.$EnumSwitchMapping$0[bVar2.b.ordinal()];
                if (i14 == 2) {
                    Throwable th2 = bVar2.f;
                    if (th2 == null) {
                        th2 = new Throwable();
                    }
                    fVar.onError(th2);
                } else if (i14 == 3) {
                    Parcelable parcelable = bVar2.e;
                    SaveCustomPosterResponse saveCustomPosterResponse = parcelable instanceof SaveCustomPosterResponse ? (SaveCustomPosterResponse) parcelable : null;
                    if (saveCustomPosterResponse != null) {
                        aac0Var.a = Integer.valueOf(saveCustomPosterResponse.e);
                        aac0Var.f = saveCustomPosterResponse.d;
                    }
                    fVar.onNext(flc0Var);
                }
                return s3q0.a;
            case 8:
                ?? r12 = (ar80) obj5;
                ?? r11 = (god0) obj4;
                FragmentActivity fragmentActivity2 = (FragmentActivity) obj3;
                wqd0 wqd0Var = (wqd0) obj;
                ArrayList<wqd0> arrayList13 = wqd0Var.e;
                if (arrayList13 == null || arrayList13.isEmpty()) {
                    r12.invoke(wqd0Var);
                } else {
                    r11.d(fragmentActivity2, wqd0Var.c, arrayList13, r12);
                }
                return s3q0.a;
            case 9:
                s8i0 s8i0Var = (s8i0) obj3;
                ((androidx.appcompat.app.d) obj4).dismiss();
                s8i0.b(s8i0Var, Collections.singletonList((Narrative) obj), false, null, 6);
                ?? r0 = s8i0Var.m;
                j6v j6vVar = (j6v) r0.getValue();
                NarrativePublishEventType narrativePublishEventType = NarrativePublishEventType.PUBLISH_NARRATIVE;
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = s8i0Var.i;
                j6v j6vVar2 = (j6v) r0.getValue();
                Long valueOf = Long.valueOf(s8i0Var.d.b);
                StoryEntry storyEntry = s8i0Var.e;
                j6vVar.f(narrativePublishEventType, mobileOfficialAppsCoreNavStat$EventScreen, j6vVar2.e(null, valueOf, (String) obj5, Collections.singletonList(Integer.valueOf(storyEntry.c)), Integer.valueOf(storyEntry.c)));
                return s3q0.a;
            default:
                ((obm0) obj5).i((r4g0) obj4, (ReplyVideoStickerStyle) ((List) obj3).get(((Integer) obj).intValue()), true);
                return s3q0.a;
        }
    }

    public /* synthetic */ ea3(MultiAccountData multiAccountData, com.vk.auth.a aVar, SignUpRouter signUpRouter, String str) {
        this.b = 2;
        this.d = multiAccountData;
        this.e = signUpRouter;
        this.c = str;
    }

    public /* synthetic */ ea3(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
