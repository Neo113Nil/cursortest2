package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.soloader.MinElf;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.attachpicker.widget.CustomSpinner;
import com.vk.catalog2.common.dto.api.news.CatalogNewsEntry;
import com.vk.catalog2.common.dto.api.style.SearchFeedCatalogViewStyle;
import com.vk.catalog2.feature.news.model.UIBlockFeed;
import com.vk.community.design.view.components.catalog.CommunityCardView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.search.ModernSearchView;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.group.Group;
import com.vk.dto.music.Playlist;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoTag;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;
import com.vk.dto.stories.model.web.StoryBoxPrepared;
import com.vk.feed.core.models.feedback.ButtonsFeedback;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.groups.MemberStatus;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.music.ui.bottomsheet.MusicPlayerPersistentBottomSheet;
import com.vk.newsfeed.common.util.j;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts.ModalPostRepostsTabFragment;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts.b;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.photo.editor.markup.view.tools.utils.Anchor;
import com.vk.photoviewer.PhotoViewer;
import com.vk.search.fragment.a;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeClickItem;
import com.vk.stat.scheme.t0;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import io.reactivex.rxjava3.internal.operators.single.r;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.SetBuilder;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.webrtc.opengl.CallOpenGLContext;
import ru.ok.android.webrtc.opengl.CallOpenGLDrawer;
import ru.ok.android.webrtc.opengl.CallOpenGLRenderer;
import xsna.a7y;
import xsna.asu0;
import xsna.aue;
import xsna.bc6;
import xsna.bi20;
import xsna.bug;
import xsna.c5g;
import xsna.d1v;
import xsna.d9;
import xsna.dha;
import xsna.ds8;
import xsna.e370;
import xsna.e43;
import xsna.e8v0;
import xsna.eag0;
import xsna.ee60;
import xsna.efc0;
import xsna.enj;
import xsna.eoe;
import xsna.epx;
import xsna.etv0;
import xsna.f870;
import xsna.fkq0;
import xsna.fm1;
import xsna.g2v;
import xsna.gcu;
import xsna.ge60;
import xsna.gj1;
import xsna.gtq;
import xsna.gzs;
import xsna.h2g0;
import xsna.hdo;
import xsna.hg1;
import xsna.his0;
import xsna.hmv0;
import xsna.i1s;
import xsna.ih7;
import xsna.itg0;
import xsna.itm;
import xsna.iyu0;
import xsna.izi0;
import xsna.izs;
import xsna.j41;
import xsna.j5g;
import xsna.j7h;
import xsna.j7k0;
import xsna.jcu;
import xsna.jwh;
import xsna.jyu0;
import xsna.k5;
import xsna.kwg0;
import xsna.le60;
import xsna.lkf0;
import xsna.mju;
import xsna.mxq;
import xsna.nh3;
import xsna.nlh;
import xsna.o0r0;
import xsna.oap;
import xsna.olh;
import xsna.q8b0;
import xsna.r1q0;
import xsna.rh3;
import xsna.s1c0;
import xsna.s3q0;
import xsna.se50;
import xsna.sf2;
import xsna.sm;
import xsna.ste;
import xsna.td0;
import xsna.tlo0;
import xsna.tq;
import xsna.tr0;
import xsna.u1c0;
import xsna.uee;
import xsna.uic;
import xsna.vfe;
import xsna.vh40;
import xsna.vte;
import xsna.vwh;
import xsna.w0v;
import xsna.wb40;
import xsna.x6y;
import xsna.xde;
import xsna.xus;
import xsna.ysg0;
import xsna.z520;
import xsna.z6y;
import xsna.zaa0;
import xsna.zi3;
import xsna.zjw;
import xsna.zwp;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class m implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, xsna.kte$b] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        MobileOfficialAppsCoreNavStat$EventScreen a;
        int i;
        int i2;
        switch (this.b) {
            case 0:
                l0 l0Var = (l0) this.c;
                Boolean bool = (Boolean) this.d;
                eag0 eag0Var = (eag0) obj;
                z6y z6yVar = l0Var.g;
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                x6y x6yVar = z6yVar.a;
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                (superappUiRouterBridge != null ? superappUiRouterBridge : null).c0(eag0Var.c, eag0Var.a, new a7y(x6yVar, booleanValue), Integer.valueOf(ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED), eag0Var.b);
                return s3q0.a;
            case 1:
                g2v.c().k().v((bc6) this.c, (StoryBoxPrepared) obj, (String) this.d);
                return s3q0.a;
            case 2:
                rh3 rh3Var = (rh3) this.c;
                rh3Var.o.b(new zi3.g(new j7k0(tq.h(tlo0.Companion, R.string.photo_flow_delete_photo_error), Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), Integer.valueOf(R.attr.vk_ui_accent_orange), new tlo0.f(R.string.photos_retry), new nh3(0, rh3Var, (Photo) this.d), null, 32)));
                kwg0.b().accept((Throwable) obj);
                return s3q0.a;
            case 3:
                ((ds8) this.c).T6((ButtonsFeedback) this.d);
                return s3q0.a;
            case 4:
                return CallOpenGLRenderer.a((CallOpenGLDrawer) this.c, (CallOpenGLRenderer) this.d, (CallOpenGLContext) obj);
            case 5:
                a aVar = (a) this.c;
                VkOnboardingCampaign vkOnboardingCampaign = (VkOnboardingCampaign) this.d;
                ((etv0) obj).b(false);
                aVar.g.a(vkOnboardingCampaign, VkOnboardingType.Tooltip, e8v0.e.b);
                return s3q0.a;
            case 6:
                eoe eoeVar = (eoe) this.c;
                xde xdeVar = (xde) this.d;
                Pair pair = (Pair) obj;
                Boolean bool2 = (Boolean) pair.d();
                bool2.getClass();
                List list = (List) pair.g();
                List singletonList = Collections.singletonList(new ClipsGridHeaderEntry.b(eoeVar.a));
                if (xdeVar.b) {
                    singletonList = null;
                }
                if (singletonList == null) {
                    singletonList = EmptyList.b;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                int i3 = 0;
                for (Object obj2 : list2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        e43.t();
                        throw null;
                    }
                    arrayList.add(uee.b((uee) obj2, null, Integer.valueOf(i3), 3));
                    i3 = i4;
                }
                return new Pair(bool2, j5g.u0(arrayList, singletonList));
            case 7:
                ((ste) this.c).T(new vte.d(((aue.b) ((aue) this.d)).e.a));
                return s3q0.a;
            case 8:
                Group group = (Group) this.c;
                CommunityCardView communityCardView = ((bug) this.d).o;
                communityCardView.setCardImage(new CommunityCardView.b(f870.s(group, communityCardView.getWidth())));
                return s3q0.a;
            case 9:
                j7h j7hVar = (j7h) this.c;
                itg0.n(j7hVar.d.C(j7hVar, new mju(xus.t((oap) this.d).b, MemberStatus.NO)));
                j7hVar.b.a();
                return s3q0.a;
            case 10:
                olh olhVar = (olh) this.c;
                nlh.b.a aVar2 = (nlh.b.a) this.d;
                VkImage vkImage = olhVar.b;
                ImageSize Cb = aVar2.b.Cb(vkImage.getWidth(), true, false);
                vkImage.o0(Cb != null ? Cb.d.d : null, null);
                return s3q0.a;
            case 11:
                jwh jwhVar = (jwh) this.c;
                jwhVar.Z(false, (vwh) this.d);
                jwhVar.k.b(new h2g0.f(zwp.a((Throwable) obj)));
                return s3q0.a;
            case 12:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
                hmv0 hmv0Var = (hmv0) this.d;
                iyu0 iyu0Var = (iyu0) obj;
                String[] strArr = DebugDevSettingsFragment.t0;
                if (jyu0.b(iyu0Var) || jyu0.c(iyu0Var) || jyu0.d(iyu0Var)) {
                    hmv0Var.c("10:00; 10:30; 11:00; 11:30; 12:00; 12:30; 13:00; 13:30; 14:00; 14:30; 15:00; 15:30; 16:00; 16:30; 17:00; 17:30; 18:00");
                } else {
                    enj.r(debugDevSettingsFragment.requireContext(), "Отсутствуют разрешения для получения активности", 0);
                }
                return null;
            case 13:
                Source source = (Source) this.c;
                itm itmVar = (itm) this.d;
                ProfilesInfo profilesInfo = (ProfilesInfo) obj;
                if (source == Source.CACHE) {
                    SetBuilder h = profilesInfo.zb().h();
                    synchronized (itmVar) {
                        try {
                            Set<? extends Peer> g = izi0.g(h, itmVar.d);
                            if (!profilesInfo.isEmpty()) {
                                itmVar.d.addAll(profilesInfo.Db().h());
                                itmVar.j(profilesInfo);
                            }
                            if (!g.isEmpty()) {
                                itmVar.i(itmVar, Source.NETWORK, g);
                            }
                            s3q0 s3q0Var = s3q0.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    itmVar.j(profilesInfo);
                }
                return s3q0.a;
            case 14:
                hdo hdoVar = (hdo) this.c;
                PostingAction.Init.LoadLocalDraft loadLocalDraft = (PostingAction.Init.LoadLocalDraft) this.d;
                efc0.a aVar3 = hdoVar.a;
                PostingAction.Init.NewPost newPost = new PostingAction.Init.NewPost(loadLocalDraft.b, PostEditableData.a(PostEditableData.D, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new AdditionalSettingsConfiguration(false, false, false, null, loadLocalDraft.d, 15, null), null, null, null, null, null, null, false, null, 268402687));
                aVar3.getClass();
                aVar3.d(newPost);
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.e, new Object[]{"Draft couldn't load by draftId:" + loadLocalDraft.c});
                }
                return s3q0.a;
            case 15:
                return gtq.e((gtq) this.c, (ArrayList) this.d);
            case 16:
                mxq mxqVar = (mxq) this.c;
                bi20 bi20Var = (bi20) this.d;
                NewsEntry newsEntry = ((CatalogNewsEntry) obj).c;
                j jVar = mxqVar.d;
                s1c0.a aVar4 = new s1c0.a();
                sf2 sf2Var = new sf2();
                sf2Var.b = mxqVar.c;
                aVar4.s = sf2Var.a();
                aVar4.B = true;
                aVar4.v = true;
                s1c0 a2 = aVar4.a();
                dha dhaVar = mxqVar.b;
                ArrayList g2 = j.g(jVar, newsEntry, a2, "", (dhaVar == null || (a = dhaVar.a()) == null) ? null : t0.a(a));
                ArrayList arrayList2 = new ArrayList(c5g.u(g2, 10));
                Iterator it = g2.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        e43.t();
                        throw null;
                    }
                    u1c0 u1c0Var = (u1c0) next;
                    arrayList2.add(new UIBlockFeed(com.vk.catalog2.common.dto.api.ui.a.a(bi20Var.b(), null, null, null, null, null, new SearchFeedCatalogViewStyle(u1c0Var.c), 7679), bi20Var.o, u1c0Var, g2.size(), i6, 0L, 0L, 96, null));
                    i5 = i6;
                }
                return arrayList2;
            case 17:
                ((i1s) this.c).k.a(((i1s.c) this.d).a, VkOnboardingType.Tooltip, e8v0.m.b);
                return s3q0.a;
            case 18:
                fm1 fm1Var = (fm1) this.c;
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) this.d;
                List list3 = (List) obj;
                int i7 = GalleryFragmentImpl.R0;
                gj1 gj1Var = fm1Var.e;
                int i8 = fm1Var.a;
                boolean z = fm1Var.b;
                AlbumEntry albumEntry = gj1.f;
                AlbumEntry albumEntry2 = gj1.g;
                ArrayList<AlbumEntry> arrayList3 = gj1Var.d;
                arrayList3.clear();
                arrayList3.addAll(list3);
                if (z) {
                    if (i8 == 111) {
                        arrayList3.add(albumEntry);
                        arrayList3.add(albumEntry2);
                    } else if (i8 == 222) {
                        arrayList3.add(albumEntry);
                    } else if (i8 == 333) {
                        arrayList3.add(albumEntry2);
                    }
                }
                gj1Var.notifyDataSetChanged();
                fm1Var.g = Math.max(-1, 0);
                CustomSpinner customSpinner = fm1Var.f.get();
                if (customSpinner != null) {
                    customSpinner.setSelection(fm1Var.g);
                }
                if (list3.size() > fm1Var.d) {
                    AlbumEntry b = fm1Var.b();
                    galleryFragmentImpl.m0 = b != null ? b.f : galleryFragmentImpl.m0;
                }
                return s3q0.a;
            case 19:
                jcu jcuVar = (jcu) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                AnimatorSet animatorSet = new AnimatorSet();
                jcuVar.t.a(true);
                animatorSet.playTogether(lkf0.a(jcuVar.n, jcuVar.r, r6.getWidth(), frameLayout, Anchor.Start), lkf0.b(jcuVar.o, jcuVar.t, r6.getWidth(), jcuVar.s, Anchor.End));
                animatorSet.addListener(new gcu((gzs) obj));
                animatorSet.start();
                return s3q0.a;
            case 20:
                d1v d1vVar = (d1v) this.c;
                VKApplication vKApplication = (VKApplication) this.d;
                if (jyu0.a((iyu0) obj)) {
                    int i9 = 18;
                    hg1.e(d1vVar.e, new r(new v(new w0v()).q(asu0.a.c()), new d9(new sm(29), i9)).subscribe(new k5(new s(17, d1vVar, vKApplication), 22), new j41(new tr0(21), i9)));
                }
                return s3q0.a;
            case 21:
                Photo photo = (Photo) this.c;
                z520 z520Var = (z520) this.d;
                ysg0.b.a(new zaa0(photo.d, photo.e, photo.c));
                PhotoViewer photoViewer = z520Var.m;
                if (photoViewer != null) {
                    RectF rectF = PhotoViewer.U;
                    photoViewer.g(true);
                }
                return s3q0.a;
            case 22:
                ModalPostRepostsTabFragment modalPostRepostsTabFragment = (ModalPostRepostsTabFragment) this.c;
                b.d dVar = (b.d) this.d;
                int intValue = ((Integer) obj).intValue();
                int i10 = ModalPostRepostsTabFragment.Y;
                boolean f = epx.f(dVar.d.a(), Boolean.TRUE);
                TextView textView = modalPostRepostsTabFragment.U;
                if (textView != null) {
                    if (f) {
                        textView.setText(enj.f(R.plurals.post_reactions_modal_reposts_count, intValue, textView.getContext()));
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                }
                return s3q0.a;
            case 23:
                ModernSearchView modernSearchView = (ModernSearchView) this.c;
                gzs gzsVar = (gzs) this.d;
                if (his0.s(modernSearchView.j)) {
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                    r1q0.a.a(SchemeStat$TypeClickItem.Subtype.VOICE_SEARCH_ICON);
                } else {
                    modernSearchView.a();
                    gzs<s3q0> gzsVar2 = modernSearchView.t;
                    if (gzsVar2 != null) {
                        gzsVar2.invoke();
                    }
                }
                return s3q0.a;
            case 24:
                ((q8b0) ((vh40) this.c).k.getValue()).a((Playlist) this.d).b((Throwable) obj);
                return s3q0.a;
            case 25:
                MusicPlayerPersistentBottomSheet musicPlayerPersistentBottomSheet = (MusicPlayerPersistentBottomSheet) this.c;
                wb40 wb40Var = (wb40) this.d;
                com.vk.music.player.domain.state.a aVar5 = (com.vk.music.player.domain.state.a) obj;
                int i11 = MusicPlayerPersistentBottomSheet.u0;
                if (musicPlayerPersistentBottomSheet.getState() == 3) {
                    int i12 = se50.m;
                    wb40Var.V5("", false, -1, aVar5);
                }
                return s3q0.a;
            case 26:
                return (uic) ((izs) ((vfe) this.c).b).invoke(new td0(27, (izs) obj, (izs) this.d));
            case 27:
                ge60 ge60Var = (ge60) this.c;
                le60 le60Var = (le60) this.d;
                int i13 = ge60.l1;
                ge60Var.getFeature().C(new ee60.e(((le60.b) le60Var).a.b));
                return s3q0.a;
            case 28:
                ih7[] ih7VarArr = (ih7[]) this.c;
                zjw.a aVar6 = (zjw.a) this.d;
                Bitmap bitmap = (Bitmap) obj;
                int length = ih7VarArr.length;
                int i14 = 0;
                while (i14 < length) {
                    ih7VarArr[i14].getClass();
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int i15 = width * height;
                    int[] iArr = new int[i15];
                    bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                    int i16 = width - 1;
                    int i17 = height - 1;
                    int[] iArr2 = new int[i15];
                    int[] iArr3 = new int[i15];
                    int[] iArr4 = new int[i15];
                    int[] iArr5 = new int[Math.max(width, height)];
                    ih7[] ih7VarArr2 = ih7VarArr;
                    int[] iArr6 = new int[173056];
                    int i18 = 0;
                    for (int i19 = 173056; i18 < i19; i19 = 173056) {
                        iArr6[i18] = i18 / 676;
                        i18++;
                    }
                    int[][] iArr7 = new int[51][];
                    int i20 = length;
                    int i21 = 0;
                    for (int i22 = 51; i21 < i22; i22 = i22) {
                        int i23 = i21;
                        iArr7[i23] = new int[3];
                        i21 = i23 + 1;
                    }
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    while (true) {
                        int i27 = i25;
                        if (i24 < height) {
                            int i28 = i24;
                            int i29 = -25;
                            int i30 = 0;
                            int i31 = 0;
                            int i32 = 0;
                            int i33 = 0;
                            int i34 = 0;
                            int i35 = 0;
                            int i36 = 0;
                            int i37 = 0;
                            int i38 = 0;
                            for (int i39 = 25; i29 <= i39; i39 = 25) {
                                int[] iArr8 = iArr4;
                                int i40 = iArr[Math.min(i16, Math.max(i29, 0)) + i27];
                                int[] iArr9 = iArr7[i29 + 25];
                                iArr9[0] = (i40 & 16711680) >> 16;
                                iArr9[1] = (i40 & 65280) >> 8;
                                iArr9[2] = i40 & 255;
                                int abs = 26 - Math.abs(i29);
                                int i41 = iArr9[0];
                                i30 = (i41 * abs) + i30;
                                int i42 = iArr9[1];
                                i31 = (i42 * abs) + i31;
                                int i43 = iArr9[2];
                                i32 = (abs * i43) + i32;
                                if (i29 > 0) {
                                    i36 += i41;
                                    i37 += i42;
                                    i38 += i43;
                                } else {
                                    i33 += i41;
                                    i34 += i42;
                                    i35 += i43;
                                }
                                i29++;
                                iArr4 = iArr8;
                            }
                            int[] iArr10 = iArr4;
                            i25 = i27;
                            int i44 = 0;
                            int i45 = 25;
                            while (i44 < width) {
                                iArr2[i25] = iArr6[i30];
                                iArr3[i25] = iArr6[i31];
                                iArr10[i25] = iArr6[i32];
                                int i46 = i30 - i33;
                                int i47 = i31 - i34;
                                int i48 = i32 - i35;
                                int[] iArr11 = iArr7[(i45 + 26) % 51];
                                int i49 = i33 - iArr11[0];
                                int i50 = i34 - iArr11[1];
                                int i51 = i35 - iArr11[2];
                                if (i28 == 0) {
                                    i2 = i44;
                                    iArr5[i2] = Math.min(i2 + 26, i16);
                                } else {
                                    i2 = i44;
                                }
                                int i52 = iArr[i26 + iArr5[i2]];
                                int i53 = (i52 & 16711680) >> 16;
                                iArr11[0] = i53;
                                int i54 = (i52 & 65280) >> 8;
                                iArr11[1] = i54;
                                int i55 = i52 & 255;
                                iArr11[2] = i55;
                                int i56 = i36 + i53;
                                int i57 = i37 + i54;
                                int i58 = i38 + i55;
                                i30 = i46 + i56;
                                i31 = i47 + i57;
                                i32 = i48 + i58;
                                i45 = (i45 + 1) % 51;
                                int[] iArr12 = iArr7[i45 % 51];
                                int i59 = iArr12[0];
                                i33 = i49 + i59;
                                int i60 = iArr12[1];
                                i34 = i50 + i60;
                                int i61 = iArr12[2];
                                i35 = i51 + i61;
                                i36 = i56 - i59;
                                i37 = i57 - i60;
                                i38 = i58 - i61;
                                i25++;
                                i44 = i2 + 1;
                            }
                            i26 += width;
                            i24 = i28 + 1;
                            iArr4 = iArr10;
                        } else {
                            int[] iArr13 = iArr4;
                            int i62 = 0;
                            while (i62 < width) {
                                int i63 = (-25) * width;
                                int i64 = i62;
                                int i65 = 0;
                                int i66 = 0;
                                int i67 = 0;
                                int i68 = 0;
                                int i69 = 0;
                                int i70 = 0;
                                int i71 = 0;
                                int i72 = 0;
                                int i73 = 0;
                                for (int i74 = -25; i74 <= 25; i74++) {
                                    int max = Math.max(0, i63) + i64;
                                    int[] iArr14 = iArr7[i74 + 25];
                                    iArr14[0] = iArr2[max];
                                    iArr14[1] = iArr3[max];
                                    iArr14[2] = iArr13[max];
                                    int abs2 = 26 - Math.abs(i74);
                                    i73 = (iArr2[max] * abs2) + i73;
                                    i65 = (iArr3[max] * abs2) + i65;
                                    i66 = (iArr13[max] * abs2) + i66;
                                    if (i74 > 0) {
                                        i70 += iArr14[0];
                                        i71 += iArr14[1];
                                        i72 += iArr14[2];
                                    } else {
                                        i67 += iArr14[0];
                                        i68 += iArr14[1];
                                        i69 += iArr14[2];
                                    }
                                    if (i74 < i17) {
                                        i63 += width;
                                    }
                                }
                                int i75 = i64;
                                int i76 = i73;
                                int i77 = 0;
                                int i78 = 25;
                                while (i77 < height) {
                                    iArr[i75] = (iArr[i75] & (-16777216)) | (iArr6[i76] << 16) | (iArr6[i65] << 8) | iArr6[i66];
                                    int i79 = i76 - i67;
                                    int i80 = i65 - i68;
                                    int i81 = i66 - i69;
                                    int[] iArr15 = iArr7[(i78 + 26) % 51];
                                    int i82 = i67 - iArr15[0];
                                    int i83 = i68 - iArr15[1];
                                    int i84 = i69 - iArr15[2];
                                    if (i64 == 0) {
                                        i = i77;
                                        iArr5[i] = Math.min(i + 26, i17) * width;
                                    } else {
                                        i = i77;
                                    }
                                    int i85 = i64 + iArr5[i];
                                    int i86 = iArr2[i85];
                                    iArr15[0] = i86;
                                    int i87 = iArr3[i85];
                                    iArr15[1] = i87;
                                    int i88 = iArr13[i85];
                                    iArr15[2] = i88;
                                    int i89 = i70 + i86;
                                    int i90 = i71 + i87;
                                    int i91 = i72 + i88;
                                    i76 = i79 + i89;
                                    i65 = i80 + i90;
                                    i66 = i81 + i91;
                                    i78 = (i78 + 1) % 51;
                                    int[] iArr16 = iArr7[i78];
                                    int i92 = iArr16[0];
                                    i67 = i82 + i92;
                                    int i93 = iArr16[1];
                                    i68 = i83 + i93;
                                    int i94 = iArr16[2];
                                    i69 = i84 + i94;
                                    i70 = i89 - i92;
                                    i71 = i90 - i93;
                                    i72 = i91 - i94;
                                    i75 += width;
                                    i77 = i + 1;
                                }
                                i62 = i64 + 1;
                            }
                            bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
                            i14++;
                            length = i20;
                            ih7VarArr = ih7VarArr2;
                        }
                    }
                }
                aVar6.a(bitmap);
                return s3q0.a;
            default:
                o0r0 o0r0Var = (o0r0) this.c;
                Context context = (Context) this.d;
                PhotoTag photoTag = (PhotoTag) obj;
                if (fkq0.c(photoTag.c)) {
                    o0r0Var.m(context, photoTag.c, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                }
                return s3q0.a;
        }
    }
}
