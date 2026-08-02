package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.soloader.MinElf;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog2.common.ui.holders.ErrorStateWithIconVh;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemListVh;
import com.vk.catalog2.common.ui.holders.group.GroupVh;
import com.vk.catalog2.common.ui.mvp.holder.video.AuthorsCatalogRootVh;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupLikes;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.dto.stories.model.clickable.ClickableClip;
import com.vk.dto.stories.model.clickable.ClickableMusic;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.ecomm.reviews.impl.replies.presentation.view.RepliesView;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.engine.models.users.User;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.common.recycler.holders.story.discover.InterestingStoriesHolderViewImpl;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchChannelsCatalogRootVh;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.writebar.WriteBar;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.transform.TransformController;
import xsna.aex;
import xsna.dw20;
import xsna.h2g0;
import xsna.hfk;
import xsna.m8v;
import xsna.ndw;
import xsna.nqo;
import xsna.o0r0;
import xsna.ozj;
import xsna.tj50;
import xsna.u1s;
import xsna.u6x;
import xsna.udx;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class dhh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dhh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0358  */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v110, types: [T, xsna.dw20] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v23, types: [android.view.View, androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, xsna.clm0, xsna.dw20$a] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType;
        MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType2;
        VoipViewModelState voipViewModelState;
        StoryEntry b;
        StoriesContainer l;
        int i = 17;
        int i2 = 8;
        boolean z = true;
        z = true;
        h20 h20Var = null;
        switch (this.b) {
            case 0:
                jhh jhhVar = (jhh) this.c;
                ii7 ii7Var = (ii7) obj;
                tan tanVar = (tan) jhhVar.t;
                if (tanVar != null) {
                    zih.a(jhhVar.E, tanVar, new san(ii7Var, tanVar), null, 12);
                }
                return s3q0.a;
            case 1:
                zhf0 zhf0Var = (zhf0) obj;
                iuh iuhVar = ((xph) this.c).b;
                if (zhf0Var != null) {
                    iuhVar.getClass();
                    h20Var = new h20(zhf0Var, 20);
                }
                iuhVar.m = h20Var;
                return s3q0.a;
            case 2:
                CommunityRepliesFragment communityRepliesFragment = (CommunityRepliesFragment) this.c;
                mfy mfyVar = communityRepliesFragment.Y;
                h2g0 h2g0Var = (h2g0) obj;
                int i3 = CommunityRepliesFragment.d0;
                if (h2g0Var instanceof h2g0.b) {
                    communityRepliesFragment.Mf(-1, new Intent().putExtra("COMMUNITY_REVIEWS_EXTRA", yfb.b(new Pair("reply_list_was_changed", Boolean.valueOf(((h2g0.b) h2g0Var).a)))));
                } else if (h2g0Var instanceof h2g0.a) {
                    h2g0.a aVar = (h2g0.a) h2g0Var;
                    if (aVar.a.length() == 0) {
                        return s3q0.a;
                    }
                    Context mo2getContext = communityRepliesFragment.mo2getContext();
                    Object systemService = mo2getContext != null ? mo2getContext.getSystemService("clipboard") : null;
                    String str = aVar.a;
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(str, str));
                } else if (h2g0Var instanceof h2g0.c) {
                    WriteBar writeBar = communityRepliesFragment.U;
                    EditText input = writeBar != null ? writeBar.getInput() : null;
                    mfyVar.getClass();
                    RepliesView repliesView = communityRepliesFragment.S;
                    if (repliesView != null) {
                        repliesView.e(((h2g0.c) h2g0Var).a);
                    }
                    s3q0 s3q0Var = s3q0.a;
                    if (!mfyVar.a && input != null) {
                        input.post(new rc4(input, i2));
                    }
                } else if (h2g0Var instanceof h2g0.d) {
                    WriteBar writeBar2 = communityRepliesFragment.U;
                    EditText input2 = writeBar2 != null ? writeBar2.getInput() : null;
                    mfyVar.getClass();
                    RepliesView repliesView2 = communityRepliesFragment.S;
                    if (repliesView2 != null) {
                        repliesView2.f();
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                    if (!mfyVar.a && input2 != null) {
                        input2.post(new rc4(input2, i2));
                    }
                } else if (h2g0Var instanceof h2g0.e) {
                    WriteBar writeBar3 = communityRepliesFragment.U;
                    if (writeBar3 != null) {
                        writeBar3.setText(((h2g0.e) h2g0Var).a);
                    }
                    e2g0 e2g0Var = communityRepliesFragment.Z;
                    if (e2g0Var != null) {
                        e2g0Var.j(((h2g0.e) h2g0Var).b);
                    }
                } else if (h2g0Var instanceof h2g0.f) {
                    cvk.w(((h2g0.f) h2g0Var).a.a(communityRepliesFragment.requireContext()), false);
                }
                return s3q0.a;
            case 3:
                i1j i1jVar = (i1j) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean z2 = !booleanValue;
                bwt0.p0((VkSearchView) i1jVar.p.getValue(), z2);
                bwt0.p0((View) i1jVar.i.getValue(), booleanValue);
                ?? a = i1jVar.a();
                ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                ((ViewGroup.MarginLayoutParams) bVar).topMargin = booleanValue ? 0 : cn70.b(8);
                a.setLayoutParams(bVar);
                i1jVar.a().setMinimumHeight(booleanValue ? cn70.b(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE) : cn70.b(102));
                bwt0.p0((View) i1jVar.o.getValue(), z2);
                bwt0.p0((View) i1jVar.l.getValue(), z2);
                return s3q0.a;
            case 4:
                qtd0 qtd0Var = (qtd0) obj;
                List<qtd0> list = ((com.vk.im.ui.components.contacts.b) this.c).d().g;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (qtd0 qtd0Var2 : list) {
                        if (qtd0Var.G3() != qtd0Var2.G3()) {
                            if ((qtd0Var instanceof Contact) && (qtd0Var2 instanceof User)) {
                                long j = ((Contact) qtd0Var).b;
                                Long l2 = ((User) qtd0Var2).c;
                                if (l2 != null && j == l2.longValue()) {
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                        break;
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 5:
                return new ozj.b(((tj50.a) obj).a(new g1j((nzj) this.c, z ? 1 : 0), ao8.d));
            case 6:
                hfk hfkVar = (hfk) this.c;
                ((Float) obj).floatValue();
                hfk.a aVar2 = hfkVar.F;
                if (aVar2 != null) {
                    aVar2.a(true);
                }
                return s3q0.a;
            case 7:
                uhm uhmVar = (uhm) this.c;
                sxp sxpVar = (sxp) obj;
                uhmVar.getClass();
                if (sxpVar instanceof l980) {
                    return new m8v.d(((l980) sxpVar).d);
                }
                if (sxpVar instanceof e980) {
                    return new m8v.c(((e980) sxpVar).e);
                }
                if (sxpVar instanceof p980) {
                    return new m8v.e((Collection) pn00.h(Long.valueOf(uhmVar.b), ((p980) sxpVar).d));
                }
                if (sxpVar instanceof y080) {
                    return new m8v.a(((y080) sxpVar).b);
                }
                if (sxpVar instanceof OnCacheInvalidateEvent) {
                    return m8v.b.a;
                }
                throw new IllegalArgumentException("event = " + sxpVar + " not history event");
            case 8:
                ((y6p0) this.c).c(((Number) ((zak0) ((gq2) obj).e).getValue()).floatValue());
                return s3q0.a;
            case 9:
                e4n e4nVar = (e4n) this.c;
                NewsEntriesContainer a2 = ((x960) obj).a();
                if (wn60.b(e4nVar.h.get().a)) {
                    NewsEntriesContainer.Info info = a2.b;
                    if (!info.g) {
                        info.g = true;
                    }
                }
                return s3q0.a;
            case 10:
                ErrorStateWithIconVh errorStateWithIconVh = (ErrorStateWithIconVh) this.c;
                AuthorsCatalogRootVh authorsCatalogRootVh = errorStateWithIconVh.f;
                if (authorsCatalogRootVh.A.r.a()) {
                    errorStateWithIconVh.g.invoke();
                    authorsCatalogRootVh.i8(ltz.a);
                }
                return s3q0.a;
            case 11:
                n5r n5rVar = (n5r) this.c;
                n5rVar.C.e(100, n5rVar.q6());
                return s3q0.a;
            case 12:
                q7r q7rVar = (q7r) this.c;
                nqo nqoVar = (nqo) obj;
                boolean z3 = nqoVar instanceof nqo.f;
                if (z3) {
                    eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_META_PRIVACY;
                } else if (nqoVar instanceof nqo.b) {
                    eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_META_PRIVACY;
                } else if (nqoVar instanceof nqo.n) {
                    eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_META_PRIVACY;
                } else if (nqoVar instanceof nqo.t) {
                    eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_META_FRIENDS;
                } else if (nqoVar instanceof nqo.r) {
                    eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_META_REPOST;
                } else if ((nqoVar instanceof nqo.a) || (nqoVar instanceof nqo.k)) {
                    eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_META_AD;
                } else if (nqoVar instanceof nqo.d) {
                    eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_META_CLIP;
                } else if (nqoVar instanceof nqo.l) {
                    eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_META_MOMENT;
                } else if (nqoVar instanceof nqo.j) {
                    eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_META_MUSIC;
                } else if (nqoVar instanceof nqo.i) {
                    eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_META_MASK;
                } else {
                    if (!(nqoVar instanceof nqo.q)) {
                        if (!(nqoVar instanceof nqo.e)) {
                            if (nqoVar instanceof nqo.h) {
                                eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_META_GENERATED;
                            } else if (nqoVar instanceof nqo.m) {
                                eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_META_REPOST;
                            } else if (nqoVar instanceof nqo.c) {
                                eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_META_REPOST;
                            } else if (nqoVar instanceof nqo.o) {
                                eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_META_REPOST;
                            } else if (nqoVar instanceof nqo.p) {
                                eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_META_AVATAR;
                            } else if (nqoVar instanceof nqo.g) {
                                eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_META_MEMORIES;
                            } else if (!(nqoVar instanceof nqo.u) && !(nqoVar instanceof nqo.s)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        eventType2 = null;
                        if (eventType2 != null) {
                            q7rVar.i0.getDependencies().f.q(eventType2, MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, q7rVar.i0.getViewEntryPoint(), q7rVar.i0.getCurrentStory(), q7rVar.i0.P0(), new o9(23, eventType2, q7rVar));
                        }
                        if (!(nqoVar instanceof nqo.i)) {
                            jz50 jz50Var = q7rVar.r0;
                            if (jz50Var.b.i0.getCurrentStory() != null) {
                                StoryEntry currentStory = jz50Var.b.i0.getCurrentStory();
                                if (!TextUtils.isEmpty(currentStory.v) && !currentStory.v.equals("0")) {
                                    b6m.a().a(jz50Var.b.i0.getContext(), jz50Var.b.i0.getCurrentStory().v, MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER.name().toLowerCase());
                                    jz50Var.b.i0.f1(StoryViewAction.CLICK_TO_MASK, null);
                                }
                            }
                        } else if (nqoVar instanceof nqo.j) {
                            ClickableMusic clickableMusic = ((nqo.j) nqoVar).e;
                            fmm0 fmm0Var = q7rVar.R;
                            if (fmm0Var != null) {
                                fmm0Var.a(clickableMusic);
                            }
                            if (clickableMusic.h != null) {
                                q7rVar.i0.f1(StoryViewAction.CLICK_TO_META, new g1j(clickableMusic, 7));
                            }
                        } else if (nqoVar instanceof nqo.l) {
                            nqo.l lVar = (nqo.l) nqoVar;
                            if (lVar.g) {
                                q7rVar.i0.getDependencies().g.b(q7rVar.i0.getContext(), lVar.e, lVar.f, null, MobileOfficialAppsConStoriesStat$ViewEntryPoint.NARRATIVE_STORY);
                            }
                        } else if (nqoVar instanceof nqo.b) {
                            jz50 jz50Var2 = q7rVar.r0;
                            StoryEntry currentStory2 = jz50Var2.b.i0.getCurrentStory();
                            if (currentStory2 != null && currentStory2.l0 != null) {
                                ?? clm0Var = new clm0(bwt0.u(jz50Var2.b.i0.getContext()), currentStory2.l0.Ab(iah0.a(72)), currentStory2.l0.Eb(), new ww(i, jz50Var2, currentStory2), new cty(jz50Var2, 13));
                                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                                ComposeView composeView = new ComposeView(clm0Var.c, null, 6);
                                composeView.setContent(new jai(-1372296019, new io7(11, clm0Var, ref$ObjectRef), true));
                                clm0Var.D0(composeView, false);
                                clm0Var.F0(true);
                                clm0Var.n0(0);
                                clm0Var.o0(0);
                                clm0Var.m0(0);
                                clm0Var.p0(0);
                                clm0Var.u(0);
                                clm0Var.x(0);
                                clm0Var.I(true);
                                ref$ObjectRef.element = clm0Var.I0(null);
                            }
                        } else if (nqoVar.equals(nqo.q.d)) {
                            rwi.d().m().c(q7rVar.i0.getContext());
                        } else if (nqoVar instanceof nqo.d) {
                            VideoFileOld videoFileOld = new VideoFileOld();
                            ClickableClip clickableClip = ((nqo.d) nqoVar).e;
                            videoFileOld.b = clickableClip.e;
                            videoFileOld.c = clickableClip.f;
                            fxc0.B().Y().k(q7rVar.i0.getContext(), videoFileOld, (r43 & 4) != 0 ? null : "story", (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
                        } else if (nqoVar instanceof nqo.r) {
                            xwk.e().m(q7rVar.i0.getContext(), ((nqo.r) nqoVar).e, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                        } else if (nqoVar instanceof nqo.m) {
                            g2v.c().k().t(q7rVar.i0.getContext(), ((nqo.m) nqoVar).e);
                        } else if (nqoVar instanceof nqo.c) {
                            g2v.c().k().b(q7rVar.i0.getContext(), ((nqo.c) nqoVar).e);
                        } else if (!(nqoVar instanceof nqo.a) && !(nqoVar instanceof nqo.k) && !(nqoVar instanceof nqo.t) && !z3 && !(nqoVar instanceof nqo.n) && !(nqoVar instanceof nqo.u) && !(nqoVar instanceof nqo.s) && !nqoVar.equals(nqo.e.d)) {
                            if (nqoVar.equals(nqo.h.d)) {
                                final jz50 jz50Var3 = q7rVar.r0;
                                final kbe kbeVar = new kbe(q7rVar, 20);
                                StoryEntry currentStory3 = jz50Var3.b.i0.getCurrentStory();
                                if (currentStory3 != null && currentStory3.l0 != null) {
                                    l7s u = bwt0.u(jz50Var3.b.i0.getContext());
                                    cmm0 cmm0Var = new cmm0(u);
                                    final dw20 I0 = ((dw20.b) new dw20.b(u, null).F0(true).B(iah0.b(20.0f), true, true).D0(cmm0Var, false).J()).I0("vk_story_viewer_generated_meta_info");
                                    cmm0Var.setOnCloseClickListener(new asq(I0, 4));
                                    cmm0Var.setOnOpenMemoriesClickListener(new View.OnClickListener() { // from class: xsna.iz50
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            jz50 jz50Var4 = jz50.this;
                                            jz50Var4.getClass();
                                            I0.hide();
                                            jz50Var4.b.i0.post(new iv1(kbeVar, 8));
                                        }
                                    });
                                }
                            } else if (nqoVar instanceof nqo.p) {
                                StringBuilder sb = new StringBuilder();
                                nqo.p pVar = (nqo.p) nqoVar;
                                sb.append(pVar.e);
                                sb.append('_');
                                sb.append(pVar.f);
                                r7r.a(q7rVar, Collections.singletonList(sb.toString()));
                            } else if (nqoVar instanceof nqo.o) {
                                StringBuilder sb2 = new StringBuilder();
                                nqo.o oVar = (nqo.o) nqoVar;
                                sb2.append(oVar.e);
                                sb2.append('_');
                                sb2.append(oVar.f);
                                r7r.a(q7rVar, Collections.singletonList(sb2.toString()));
                            } else {
                                if (!(nqoVar instanceof nqo.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                maz e = xwk.d().e();
                                Context context = q7rVar.i0.getContext();
                                bpn0 bpn0Var = enj.a;
                                maz.c(e, e3m.h(context), i5s.a(new StringBuilder("https://"), a0a.d, "/memories"), LaunchContext.A, null, null, 24);
                            }
                        }
                        return s3q0.a;
                    }
                    eventType = MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_META_QUESTIONS;
                }
                eventType2 = eventType;
                if (eventType2 != null) {
                }
                if (!(nqoVar instanceof nqo.i)) {
                }
                return s3q0.a;
            case 13:
                ((m1s) this.c).n(new u1s.b(((v1s) obj).d.getId()));
                return s3q0.a;
            case 14:
                ((defpackage.a0) this.c).invoke();
                return s3q0.a;
            case 15:
                ((FriendsItemListVh.a) this.c).a.invoke();
                return s3q0.a;
            case 16:
                return (UsersUserFullDto) ((dat) this.c).a.b.get(new UserId(((Long) obj).longValue()));
            case 17:
                wot wotVar = (wot) this.c;
                io.reactivex.rxjava3.disposables.b bVar2 = wotVar.d;
                fjw0 fjw0Var = (fjw0) obj;
                VoipViewModelState voipViewModelState2 = fjw0Var.a;
                VoipViewModelState voipViewModelState3 = VoipViewModelState.Idle;
                if (voipViewModelState2 == voipViewModelState3) {
                    yot yotVar = wotVar.g;
                    yotVar.g = false;
                    yotVar.h.e();
                    bVar2.e();
                }
                if (fjw0Var.a != voipViewModelState3 && ((voipViewModelState = fjw0Var.b) == voipViewModelState3 || voipViewModelState == VoipViewModelState.AboutToCallPeer)) {
                    bVar2.b(wotVar.e.a().a0(asu0.a.d()).subscribe(new pm1(new f1j(wotVar, 15), 24)));
                }
                return s3q0.a;
            case 18:
                GlobalSearchChannelsCatalogRootVh globalSearchChannelsCatalogRootVh = (GlobalSearchChannelsCatalogRootVh) this.c;
                sxp sxpVar2 = (sxp) obj;
                if (sxpVar2 instanceof r280) {
                    ((r280) sxpVar2).b.c.forEach(new y1u(r7, new b47(globalSearchChannelsCatalogRootVh, 3)));
                }
                return s3q0.a;
            case 19:
                e3u e3uVar = (e3u) this.c;
                Boolean bool = (Boolean) obj;
                e3uVar.d.l("start gms in app update checking:" + bool);
                return bool.booleanValue() ? new io.reactivex.rxjava3.internal.operators.single.b(new jo3(e3uVar, i)).q(io.reactivex.rxjava3.schedulers.a.b()) : io.reactivex.rxjava3.core.x.k(wrw.g);
            case 20:
                com.vk.ecomm.market.good.ui.restriction.a aVar3 = (com.vk.ecomm.market.good.ui.restriction.a) this.c;
                f4m.j(aVar3.g);
                aVar3.a.a();
                return s3q0.a;
            case 21:
                ((zak0) ((yju) this.c).d).setValue((String) obj);
                return s3q0.a;
            case 22:
                GroupLikes groupLikes = (GroupLikes) this.c;
                w9y w9yVar = (w9y) obj;
                w9yVar.c(Integer.valueOf(groupLikes.d), "count");
                ArrayList<UserId> arrayList = groupLikes.f;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(((UserId) it.next()).b));
                }
                w9yVar.e(arrayList2.toArray(new Long[0]), "preview");
                return s3q0.a;
            case 23:
                ((GroupVh) this.c).onClick((View) obj);
                return s3q0.a;
            case 24:
                ((qdw) this.c).d.onNext(new ndw.a((Map) obj));
                return s3q0.a;
            case 25:
                ((mgw) this.c).b((qr9) obj);
                return s3q0.a;
            case 26:
                u6x.c cVar = (u6x.c) this.c;
                u6x.b bVar3 = (u6x.b) obj;
                bVar3.b.countDown();
                return u6x.b.a(bVar3, cVar, null, null, false, null, 510);
            case 27:
                ((xcx) this.c).c = (TransformController.ScaleType) obj;
                return s3q0.a;
            case 28:
                InterestingStoriesHolderViewImpl interestingStoriesHolderViewImpl = (InterestingStoriesHolderViewImpl) this.c;
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                gex gexVar = interestingStoriesHolderViewImpl.P;
                if (gexVar != null) {
                    aex aexVar = (aex) gexVar.c.c(intValue);
                    if (aexVar instanceof aex.a) {
                        gexVar.h.i((aex.a) aexVar, num);
                        zex zexVar = gexVar.i;
                        aex.a h = zexVar.k().h();
                        if (h != null && (l = zexVar.l((b = h.b()))) != null) {
                            udx h2 = zexVar.h();
                            rdx a3 = h.a();
                            h2.getClass();
                            anm0.f(h2.a, MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.SWIPE_BLOCK, udx.a.a(), h2.b(), b, udx.a(b, l, a3), 32);
                        }
                        Integer d = zexVar.k().d();
                        if (d != null) {
                            int intValue2 = d.intValue();
                            udx h3 = zexVar.h();
                            aex.a g = zexVar.k().g();
                            StoryEntry b2 = g != null ? g.b() : null;
                            h3.getClass();
                            if (intValue2 != 0) {
                                MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType eventType3 = intValue2 > 0 ? MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.GO_TO_NEXT_AUTHOR : MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.GO_TO_PREVIOUS_AUTHOR;
                                anm0 anm0Var = h3.a;
                                Object obj2 = udx.c;
                                anm0.f(anm0Var, eventType3, udx.a.a(), h3.b(), b2, null, 48);
                            }
                        }
                    }
                }
                return s3q0.a;
            default:
                Object obj3 = ((z2z) this.c).o;
                ((x2z) (obj3 != null ? obj3 : null)).a();
                return s3q0.a;
        }
    }
}
