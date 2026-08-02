package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.ironsource.B;
import com.ironsource.C;
import com.ironsource.C4299ec;
import com.ironsource.E;
import com.ironsource.I;
import com.vk.clips.sdk.shared.api.deps.clips.ShortVideoUserSettings;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.checkbox.VkCheckboxItem;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.posting.FriendsListPrivacyType;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.ui.components.dialogs_list.k;
import com.vk.log.L;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.common.PostActions;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.ComFeatures;
import com.vk.video.ui.upload.impl.publish.presentation.description.fragment.DescriptionResult;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import ru.ok.gl.objects.SimpleGLProgram;
import ru.ok.segmentation_full.segmentation.SegmenterRecurrent;
import ru.ok.tensorflow.tflite.InterpreterWrapper;
import xsna.bzp0;
import xsna.dbe0;
import xsna.ngl;
import xsna.rew0;
import xsna.ykb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class xq70 implements io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.l, z960, pcs, ptk0, VkCheckboxItem.a, InterpreterWrapper.RunnableOnGPU, io.reactivex.rxjava3.functions.b, i0u0, io.reactivex.rxjava3.functions.c, ngl.a, E {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xq70(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.ironsource.E
    public B a(C c, I i) {
        B a;
        a = C4299ec.a((C4299ec) this.c, c, i);
        return a;
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        com.vk.im.ui.components.dialogs_list.k kVar = (com.vk.im.ui.components.dialogs_list.k) this.c;
        k.b bVar = (k.b) obj;
        Throwable th = (Throwable) obj2;
        if (th == null) {
            kVar.h(bVar);
        } else {
            kVar.g(th);
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return (kr5) ((lw20) this.c).invoke(obj);
            case 2:
                return (Boolean) ((lw20) this.c).invoke(obj);
            case 3:
                return (List) ((lw20) this.c).invoke(obj);
            case 4:
                return (ykb0.a) ((amp) this.c).invoke(obj);
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 17:
            case 18:
            case 19:
            case 25:
            default:
                return (s6x0) ((m4k0) this.c).invoke(obj);
            case 8:
                return (utk) ((amp) this.c).invoke(obj);
            case 11:
                return (Pair) ((qyi0) this.c).invoke(obj);
            case 12:
                return (ArrayList) ((n9) this.c).invoke(obj);
            case 13:
                return (ShortVideoUserSettings) ((amp) this.c).invoke(obj);
            case 14:
                return (String) ((m4k0) this.c).invoke(obj);
            case 15:
                return (Map) ((qyi0) this.c).invoke(obj);
            case 16:
                return (io.reactivex.rxjava3.core.e) ((lmm0) this.c).invoke(obj);
            case 20:
                return (Clips) ((qyi0) this.c).invoke(obj);
            case 21:
                return (List) ((qyi0) this.c).invoke(obj);
            case 22:
                return (List) ((qyi0) this.c).invoke(obj);
            case 23:
                return (xbu0) ((m4k0) this.c).invoke(obj);
            case 24:
                return (Boolean) ((l4k0) this.c).invoke(obj);
            case 26:
                return (it80) ((wss0) this.c).invoke(obj);
        }
    }

    @Override // com.vk.core.view.components.checkbox.VkCheckboxItem.a
    public void b(boolean z) {
        bth0 bth0Var = (bth0) this.c;
        bth0Var.z.setChecked(z);
        bth0Var.v.f = z;
        bth0Var.Q4();
        bth0Var.B.setAlpha(!z ? 1.0f : 0.64f);
        bth0Var.D.setAlpha(!z ? 1.0f : 0.64f);
        bth0Var.H.setAlpha(!z ? 1.0f : 0.64f);
        bth0Var.F.setAlpha(z ? 0.64f : 1.0f);
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        tkx0 tkx0Var = (tkx0) ((xkx0) this.c).a;
        if (tkx0Var != null) {
            tkx0Var.wa(cVar.a, null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z960
    public void g(VkContextMenu vkContextMenu, int i) {
        Context h;
        Context context;
        VideoAttachment Nb;
        VideoFile videoFile;
        VideoAttachment Nb2;
        VideoFile videoFile2;
        Context mo2getContext;
        int i2 = i;
        PostViewFragment postViewFragment = (PostViewFragment) this.c;
        String[] strArr = PostViewFragment.T0;
        c9c0 Co = postViewFragment.Co();
        if (Co != null) {
            com.vk.newsfeed.impl.presenters.b bVar = (com.vk.newsfeed.impl.presenters.b) Co;
            ?? r3 = bVar.a0;
            ?? r4 = bVar.g;
            Context context2 = bVar.i0().getContext();
            if (context2 != null && (h = e3m.h(context2)) != null) {
                Object i0 = bVar.i0();
                NewsEntry newsEntry = bVar.l;
                if (newsEntry != 0) {
                    if (i2 == PostActions.ACTION_WRITE_OWNER.h()) {
                        i2 = R.id.write_owner;
                    } else if (i2 == PostActions.ACTION_ADD_TO_ARCHIVE.h()) {
                        i2 = R.id.add_to_archive;
                    } else if (i2 == PostActions.ACTION_REMOVE_FROM_ARCHIVE.h()) {
                        i2 = R.id.remove_from_archive;
                    } else if (i2 == PostActions.ACTION_REMOVE.h()) {
                        i2 = R.id.delete;
                    } else if (i2 == PostActions.ACTION_EDIT.h()) {
                        i2 = R.id.edit;
                    } else if (i2 == PostActions.ACTION_COPY_LINK.h()) {
                        i2 = R.id.copy_link;
                    } else if (i2 == PostActions.ACTION_OPEN_ORIGINAL_POST.h()) {
                        i2 = R.id.show_original_post;
                    } else if (i2 == PostActions.ACTION_SHOW_STATS.h()) {
                        i2 = R.id.post_stats;
                    } else if (i2 == PostActions.ACTION_DOUBT_CATEGORY.h()) {
                        i2 = R.id.doubt_category;
                    } else if (i2 == PostActions.ACTION_REPORT.h()) {
                        i2 = R.id.report;
                    } else if (i2 == PostActions.ACTION_PUBLISH_POSTPONED.h()) {
                        i2 = R.id.publish_now;
                    } else if (i2 == PostActions.ACTION_PUBLISH_FREE_COPY.h()) {
                        i2 = R.id.publish_free_copy;
                    } else if (i2 == PostActions.ACTION_PUBLISH_DRAFT.h()) {
                        i2 = R.id.publish_draft;
                    } else if (i2 == PostActions.ACTION_TOGGLE_PINNED.h()) {
                        i2 = R.id.toggle_fix;
                    } else if (i2 == PostActions.ACTION_TOGGLE_COMMENTS.h()) {
                        i2 = R.id.toggle_comments;
                    } else if (i2 == PostActions.ACTION_TOGGLE_FAVE.h()) {
                        i2 = R.id.toggle_fave;
                    } else if (i2 == PostActions.ACTION_SEND_BADGE.h()) {
                        i2 = R.id.send_badge;
                    } else if (i2 == PostActions.ACTION_SHOW_ADVERTISER_INFO.h()) {
                        i2 = R.id.show_advertiser_info;
                    } else if (i2 == PostActions.ACTION_COPY_AD_MARKER.h()) {
                        i2 = R.id.copy_ad_marker;
                    }
                    if (i2 == R.id.write_owner) {
                        com.vk.movika.sdk.android.defaultplayer.utils.d.b(h, newsEntry, false);
                    } else if (i2 == R.id.add_to_archive) {
                        if (newsEntry instanceof Post) {
                            iuc0.b.r(h, (Post) newsEntry);
                        }
                    } else if (i2 == R.id.remove_from_archive) {
                        if (newsEntry instanceof Post) {
                            iuc0.b.M(h, (Post) newsEntry);
                        }
                    } else if (i2 == R.id.delete) {
                        iuc0.b.H(h, newsEntry, false, null);
                    } else if (i2 == R.id.edit) {
                        if (newsEntry instanceof Post) {
                            Post post = (Post) newsEntry;
                            if (BuildInfo.t()) {
                                bVar.i0().Mj(post);
                            } else {
                                bVar.i0().Db(post, PostingCreationEntryPoint.PostThreeDotMenuEditItem);
                            }
                        }
                    } else if (i2 == R.id.copy_link) {
                        iuc0.b.B(newsEntry, null);
                    } else if (i2 == R.id.show_original_post) {
                        if (newsEntry instanceof Post) {
                            iuc0.b.w(h, (Post) newsEntry);
                        }
                    } else if (i2 == R.id.post_stats) {
                        if ((newsEntry instanceof Post) && (i0 instanceof FragmentImpl) && (mo2getContext = ((FragmentImpl) i0).mo2getContext()) != null) {
                            Post post2 = (Post) newsEntry;
                            int i3 = post2.n;
                            UserId userId = post2.m;
                            if (!o25.a().a(userId)) {
                                hd60.a().i1(i3, mo2getContext, userId);
                            } else if (!post2.gc() || di60.i(post2) == null) {
                                ComFeatures comFeatures = ComFeatures.COM_POST_STATISTICS;
                                comFeatures.getClass();
                                if (com.vk.toggle.b.A.a(comFeatures)) {
                                    ((syk0) r3.getValue()).a(i3, userId);
                                } else {
                                    hd60.a().i1(i3, mo2getContext, userId);
                                }
                            } else {
                                VideoAttachment i4 = di60.i(post2);
                                if (i4 != null) {
                                    ((syk0) r3.getValue()).b(userId, Integer.valueOf(i4.k.o0()));
                                }
                            }
                        }
                    } else if (i2 == R.id.doubt_category) {
                        iuc0.b.a(di60.R(newsEntry));
                    } else if (i2 == R.id.report) {
                        iuc0.b.R(h, newsEntry, bVar.o, -1, 0);
                    } else {
                        int i5 = 5;
                        if (i2 != R.id.publish_now) {
                            int i6 = 3;
                            if (i2 == R.id.publish_draft) {
                                if (newsEntry instanceof Post) {
                                    iuc0.b.G(h, (Post) newsEntry, new z6c0(false, null, UiTracker.d(), 3), new b3m(bVar.i0(), i5));
                                }
                            } else if (i2 != R.id.publish_free_copy) {
                                int i7 = 15;
                                if (i2 != R.id.toggle_fix) {
                                    int i8 = 1;
                                    if (i2 == R.id.toggle_comments) {
                                        if (newsEntry instanceof Post) {
                                            Post post3 = (Post) newsEntry;
                                            Context context3 = bVar.i0().getContext();
                                            if (context3 != null) {
                                                bVar.i0().a(iuc0.b.O(context3, post3).subscribe(new gca0(i8, post3, bVar), new cx00(new quz(i7), 16)));
                                            }
                                        }
                                    } else if (i2 == R.id.add) {
                                        if (newsEntry instanceof Videos) {
                                            Videos videos = (Videos) newsEntry;
                                            Context context4 = bVar.i0().getContext();
                                            if (context4 != null && (Nb2 = videos.Nb()) != null && (videoFile2 = Nb2.k) != null) {
                                                bVar.i0().a(hg1.m(rsg0.y0(new ros(videoFile2.I0(), videoFile2.o0(), bVar.o, null), null, null, 3), context4, 0L, false, 62).subscribe(new ow40(new m9(28, videoFile2, context4), 10), new pw40(new e750(6), i5)));
                                            }
                                        }
                                    } else if (i2 == R.id.add_to_playlist) {
                                        if ((newsEntry instanceof Videos) && (Nb = ((Videos) newsEntry).Nb()) != null && (videoFile = Nb.k) != null) {
                                            bVar.i0().P6(videoFile);
                                        }
                                    } else if (i2 == R.id.youtube) {
                                        if (newsEntry instanceof fsx0) {
                                            Attachment R1 = ((fsx0) newsEntry).R1();
                                            if (R1 instanceof VideoAttachment) {
                                                try {
                                                    bVar.i0().a7(((VideoAttachment) R1).k);
                                                } catch (Throwable th) {
                                                    L.i(th);
                                                    cvk.u(R.string.error, false);
                                                }
                                            }
                                        }
                                    } else if (i2 == R.id.toggle_fave) {
                                        iuc0.b.P(context2, newsEntry, bVar.o, bVar.u);
                                    } else if (i2 == R.id.edit_best_friends) {
                                        new ProfileFriendsFragment.a(FriendsListParams.BestFriendsList.b, FriendsListPrivacyType.POST, null, null, false, 56).k(context2);
                                        ((jbc0) bVar.d.getValue()).a(MobileOfficialAppsCoreNavStat$EventScreen.FEED);
                                    } else if (i2 == R.id.send_badge) {
                                        if (newsEntry instanceof Badgeable) {
                                            ((NewsfeedRouter) bVar.f.getValue()).v(context2, (Badgeable) newsEntry);
                                        }
                                    } else if (i2 == R.id.show_advertiser_info) {
                                        ((c1c0) r4.getValue()).p(context2, newsEntry, null);
                                    } else if (i2 == R.id.copy_ad_marker) {
                                        ((c1c0) r4.getValue()).h(newsEntry, null);
                                    } else if (i2 == PostActions.ACTION_PUSH_SUBSCRIBE.h()) {
                                        ((c1c0) r4.getValue()).U(context2, newsEntry, true);
                                    } else if (i2 == PostActions.ACTION_PUSH_UNSUBSCRIBE.h()) {
                                        ((c1c0) r4.getValue()).U(context2, newsEntry, false);
                                    } else if (i2 == PostActions.ACTION_IGNORE.h() && (context = bVar.i0().getContext()) != null) {
                                        bVar.i0().finish();
                                        ((c1c0) r4.getValue()).T(context, newsEntry, null, bVar.o, bVar.A);
                                    }
                                } else if (newsEntry instanceof Post) {
                                    Post post4 = (Post) newsEntry;
                                    Context context5 = bVar.i0().getContext();
                                    if (context5 != null) {
                                        bVar.i0().a(iuc0.b.L(context5, post4).subscribe(new z2t(i6, post4, bVar), new oo20(new e420(12), i7)));
                                    }
                                }
                            } else if (newsEntry instanceof Post) {
                                iuc0.b.x(h, (Post) newsEntry);
                            }
                        } else if (newsEntry instanceof Post) {
                            iuc0.b.Z(h, (Post) newsEntry, new b3m(bVar.i0(), i5));
                        }
                    }
                }
            }
        }
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
    }

    @Override // xsna.i0u0
    public View get() {
        return (View) new WeakReference((VkButton) this.c).get();
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
        PublishFragment publishFragment = (PublishFragment) this.c;
        qcy<Object>[] qcyVarArr = PublishFragment.Q;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("DescriptionResult.MODAL_KEY_RESULT", DescriptionResult.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("DescriptionResult.MODAL_KEY_RESULT");
            if (!(parcelable3 instanceof DescriptionResult)) {
                parcelable3 = null;
            }
            parcelable = (DescriptionResult) parcelable3;
        }
        DescriptionResult descriptionResult = (DescriptionResult) parcelable;
        if (descriptionResult != null) {
            publishFragment.fo().b(new dbe0.g.b(descriptionResult.b));
        }
    }

    @Override // ru.ok.tensorflow.tflite.InterpreterWrapper.RunnableOnGPU
    public void run(SimpleGLProgram simpleGLProgram) {
        ((SegmenterRecurrent) this.c).lambda$segmentGPU$0(simpleGLProgram);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 0:
                return ((Boolean) ((sec) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((qyi0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // xsna.ptk0
    public void a(lm50 lm50Var) {
        ((ReactionsFeedFragment) this.c).T.a(s3q0.a, (j5f0) lm50Var);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (rew0.a) ((bv4) this.c).invoke(obj, obj2);
    }
}
