package xsna;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.stickers.photo.PhotoStickerStyle;
import com.vk.attachpicker.stickers.reply.ReplyVideoStickerStyle;
import com.vk.camera.editor.stories.impl.base.BaseCameraEditorContract$ScreenState;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.stickers.api.models.AlbumStickerStyle;
import com.vk.stickers.api.models.post.PostStickerStyle;
import com.vk.stickers.api.models.time.TimeStickerStyle;
import com.vk.stories.design.view.editor.StickerDeleteAreaView;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.i5a0;
import xsna.kba0;
import xsna.nim0;
import xsna.q4g0;

/* compiled from: StickersDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class t9l0 implements r9l0 {
    public final t76 a;
    public final u76 b;
    public final b96 c;

    public t9l0(t76 t76Var, u76 u76Var, b96 b96Var) {
        this.a = t76Var;
        this.b = u76Var;
        this.c = b96Var;
        u76Var.T2(this);
    }

    @Override // com.vk.stories.design.view.stickers.StickersDrawingViewGroup.j
    public final void a() {
        if (j()) {
            this.a.getStickerDeleteArea().a(1.0f);
        }
    }

    @Override // com.vk.stories.design.view.stickers.StickersDrawingViewGroup.j
    public final void c() {
        if (j()) {
            this.a.getStickerDeleteArea().a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x02e5, code lost:
    
        if (com.vk.toggle.b.A.a(r0) != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0328, code lost:
    
        if (com.vk.toggle.b.A.a(r0) != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0191, code lost:
    
        if (com.vk.toggle.b.A.a(r0) != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0216, code lost:
    
        if (com.vk.toggle.b.A.a(r0) != false) goto L171;
     */
    @Override // com.vk.stories.design.view.stickers.StickersDrawingViewGroup.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(nov novVar) {
        ddm0 serviceItemStickerDelegate;
        z5m0 marketItemStickerDelegate;
        kh6 musicDelegate;
        x0m0 questionDelegate;
        boolean z = novVar instanceof xlo0;
        u76 u76Var = this.b;
        t76 t76Var = this.a;
        if (z) {
            final xlo0 xlo0Var = (xlo0) novVar;
            if (j() && t76Var.getCurrentTextDialog() == null) {
                b96.c(this.c);
                final StickersDrawingViewGroup stickersDrawingView = t76Var.getStickersDrawingView();
                i0q0.d(100L, new xj3(this, xlo0Var, stickersDrawingView, 5));
                zlo0 a = t76Var.getTextStickerDialogDelegate().a(xlo0Var.k, u76Var.x3(), new hsg0(stickersDrawingView, xlo0Var, this), null, xlo0Var.l);
                ((cmo0) a).g = new DialogInterface.OnDismissListener() { // from class: xsna.s9l0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        t9l0 t9l0Var = t9l0.this;
                        t9l0Var.c.f();
                        t9l0Var.a.setCurrentTextDialog(null);
                        i0q0.d(100L, new f0(6, xlo0Var, stickersDrawingView));
                    }
                };
                t76Var.setCurrentTextDialog(a);
                a.show();
                return true;
            }
        } else if (novVar instanceof v4m0) {
            v4m0 v4m0Var = (v4m0) novVar;
            if (j() && t76Var.getHashtagDelegate() != null) {
                t4m0 t4m0Var = v4m0Var.h;
                v4m0Var.r(t4m0.a(t4m0Var, t4m0Var.a.e()));
                t76Var.getStickersDrawingView().invalidate();
                return true;
            }
        } else if (novVar instanceof x6m0) {
            x6m0 x6m0Var = (x6m0) novVar;
            if (j() && t76Var.getMentionDelegate() != null) {
                v6m0 v6m0Var = x6m0Var.h;
                x6m0Var.r(v6m0.a(v6m0Var, v6m0Var.a.e()));
                t76Var.getStickersDrawingView().invalidate();
                return true;
            }
        } else if (novVar instanceof yjm0) {
            yjm0 yjm0Var = (yjm0) novVar;
            xjm0 timeStickerDelegate = t76Var.getTimeStickerDelegate();
            if (timeStickerDelegate != null) {
                TimeStickerStyle timeStickerStyle = yjm0Var.h.c;
                List<TimeStickerStyle> list = timeStickerDelegate.c;
                int indexOf = list.indexOf(timeStickerStyle);
                TimeStickerStyle timeStickerStyle2 = indexOf < 0 ? null : list.get((indexOf + 1) % list.size());
                if (timeStickerStyle2 != null) {
                    yjm0Var.s(nvo0.a(yjm0Var.h, timeStickerStyle2));
                    timeStickerDelegate.a.invalidate();
                    return true;
                }
            }
        } else if (novVar instanceof sam0) {
            sam0 sam0Var = (sam0) novVar;
            if (j() && (questionDelegate = t76Var.getQuestionDelegate()) != null) {
                questionDelegate.h(sam0Var);
                return true;
            }
        } else if (novVar instanceof h7m0) {
            h7m0 h7m0Var = (h7m0) novVar;
            if (j() && (musicDelegate = t76Var.getMusicDelegate()) != null) {
                musicDelegate.l(h7m0Var.getInfo().b);
                musicDelegate.j = true;
                musicDelegate.h((nov) h7m0Var);
                return true;
            }
        } else {
            if (novVar instanceof z3m0) {
                z3m0 z3m0Var = (z3m0) novVar;
                d4m0 d4m0Var = z3m0Var.h;
                z3m0Var.t(new d4m0(d4m0Var.a, d4m0Var.b, d4m0Var.c.e(), d4m0Var.d, d4m0Var.e));
                t76Var.getStickersDrawingView().invalidate();
                return true;
            }
            if (novVar instanceof no6) {
                no6 no6Var = (no6) novVar;
                if (!jjc.e() && (marketItemStickerDelegate = t76Var.getMarketItemStickerDelegate()) != null) {
                    marketItemStickerDelegate.a(no6Var);
                    return true;
                }
            } else if (novVar instanceof edm0) {
                edm0 edm0Var = (edm0) novVar;
                if (!jjc.e() && (serviceItemStickerDelegate = t76Var.getServiceItemStickerDelegate()) != null) {
                    serviceItemStickerDelegate.j = true;
                    serviceItemStickerDelegate.j(edm0Var);
                    return true;
                }
            } else if (novVar instanceof lba0) {
                lba0 lba0Var = (lba0) novVar;
                if (!j()) {
                    StoriesFeatures storiesFeatures = StoriesFeatures.ST_TAB_STYLE_PICKER;
                    storiesFeatures.getClass();
                }
                f8m0 photoStickerRedesignDelegate = t76Var.getPhotoStickerRedesignDelegate();
                photoStickerRedesignDelegate.getClass();
                StoriesFeatures storiesFeatures2 = StoriesFeatures.ST_TAB_STYLE_PICKER;
                storiesFeatures2.getClass();
                if (!com.vk.toggle.b.A.a(storiesFeatures2)) {
                    kba0.a aVar = lba0Var.getInfo().c;
                    List<PhotoStickerStyle> list2 = aVar.b;
                    photoStickerRedesignDelegate.i(lba0Var, list2.get((list2.indexOf(aVar.a) + 1) % list2.size()), true);
                    return true;
                }
                if (lba0Var.getInfo().c.b.size() > 1) {
                    photoStickerRedesignDelegate.h(lba0Var);
                    return true;
                }
            } else if (novVar instanceof c8m0) {
                c8m0 c8m0Var = (c8m0) novVar;
                if (c8m0Var.s) {
                    c8m0Var.s(c8m0Var.r.n(), true);
                    t76Var.getStickersDrawingView().invalidate();
                    u76Var.o5().i(StoryEditorEvents.EDIT_STICKER);
                    s3q0 s3q0Var = s3q0.a;
                    return true;
                }
            } else if (novVar instanceof r4g0) {
                r4g0 r4g0Var = (r4g0) novVar;
                if (!j()) {
                    StoriesFeatures storiesFeatures3 = StoriesFeatures.ST_TAB_STYLE_PICKER;
                    storiesFeatures3.getClass();
                }
                obm0 replyVideoStickerDelegate = t76Var.getReplyVideoStickerDelegate();
                replyVideoStickerDelegate.getClass();
                StoriesFeatures storiesFeatures4 = StoriesFeatures.ST_TAB_STYLE_PICKER;
                storiesFeatures4.getClass();
                if (!com.vk.toggle.b.A.a(storiesFeatures4)) {
                    q4g0.a aVar2 = r4g0Var.getInfo().e;
                    List<ReplyVideoStickerStyle> list3 = aVar2.b;
                    replyVideoStickerDelegate.i(r4g0Var, list3.get((list3.indexOf(aVar2.a) + 1) % list3.size()), true);
                    return true;
                }
                if (r4g0Var.getInfo().e.b.size() > 1) {
                    replyVideoStickerDelegate.h(r4g0Var);
                    return true;
                }
            } else {
                if (novVar instanceof unm0) {
                    unm0 unm0Var = (unm0) novVar;
                    if (unm0Var.s) {
                        List<Bitmap> list4 = unm0Var.q;
                        int i = unm0Var.r + 1;
                        int i2 = i != list4.size() ? i : 0;
                        unm0Var.r = i2;
                        unm0Var.r(list4.get(i2), true);
                        t76Var.getStickersDrawingView().invalidate();
                        s3q0 s3q0Var2 = s3q0.a;
                        return true;
                    }
                } else {
                    if (novVar instanceof r8m0) {
                        t76Var.getPollStickerDelegate().a((r8m0) novVar);
                        return true;
                    }
                    if (novVar instanceof q5m0) {
                        q5m0 q5m0Var = (q5m0) novVar;
                        if (t76Var.getStoryLinkDelegate() != null) {
                            r5m0 r5m0Var = q5m0Var.h;
                            r5m0 r5m0Var2 = new r5m0(r5m0Var.a, r5m0Var.b, r5m0Var.c.e(), r5m0Var.d);
                            q5m0Var.h = r5m0Var2;
                            q5m0Var.p(r5m0Var2);
                            xaq.a(q5m0Var, new dbj0(q5m0Var, 6));
                            t76Var.getStickersDrawingView().invalidate();
                            return true;
                        }
                    } else if (novVar instanceof z7c0) {
                        z7c0 z7c0Var = (z7c0) novVar;
                        if (!j()) {
                            StoriesFeatures storiesFeatures5 = StoriesFeatures.ST_TAB_STYLE_PICKER;
                            storiesFeatures5.getClass();
                        }
                        v8m0 storyPostDelegate = t76Var.getStoryPostDelegate();
                        if (storyPostDelegate != null) {
                            storyPostDelegate.i(z7c0Var);
                            t76Var.getStickersDrawingView().invalidate();
                            return true;
                        }
                    } else if (novVar instanceof o7c0) {
                        o7c0 o7c0Var = (o7c0) novVar;
                        v8m0 storyPostDelegate2 = t76Var.getStoryPostDelegate();
                        if (storyPostDelegate2 != null) {
                            storyPostDelegate2.i(o7c0Var);
                            t76Var.getStickersDrawingView().invalidate();
                            return true;
                        }
                    } else {
                        if (!(novVar instanceof h5a0)) {
                            if (!(novVar instanceof abm0)) {
                                return false;
                            }
                            u76Var.o5().c();
                            t76Var.getReactionDelegate().h((abm0) novVar);
                            t76Var.getStickersDrawingView().invalidate();
                            return true;
                        }
                        h5a0 h5a0Var = (h5a0) novVar;
                        if (!j()) {
                            StoriesFeatures storiesFeatures6 = StoriesFeatures.ST_TAB_STYLE_PICKER;
                            storiesFeatures6.getClass();
                        }
                        y7m0 photoAlbumStickerDelegate = t76Var.getPhotoAlbumStickerDelegate();
                        if (photoAlbumStickerDelegate != null) {
                            StoriesFeatures storiesFeatures7 = StoriesFeatures.ST_TAB_STYLE_PICKER;
                            storiesFeatures7.getClass();
                            if (!com.vk.toggle.b.A.a(storiesFeatures7)) {
                                i5a0.a aVar3 = h5a0Var.f.i;
                                List<AlbumStickerStyle> list5 = aVar3.b;
                                photoAlbumStickerDelegate.i(h5a0Var, list5.get((list5.indexOf(aVar3.a) + 1) % list5.size()), true);
                            } else if (h5a0Var.f.i.b.size() > 1) {
                                photoAlbumStickerDelegate.h(h5a0Var);
                            }
                            t76Var.getStickersDrawingView().invalidate();
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // com.vk.stories.design.view.stickers.StickersDrawingViewGroup.j
    public final void e() {
        g();
    }

    @Override // xsna.sc80
    public final void f() {
        if (j()) {
            this.b.W4(false, false);
            b96 b96Var = this.c;
            b96Var.a();
            b96.c(b96Var);
        }
    }

    @Override // xsna.sc80
    public final void g() {
        this.b.W4(false, false);
        nov movingSticker = this.a.getMovingSticker();
        if (!j() || movingSticker == null) {
            return;
        }
        boolean v0 = movingSticker.v0();
        b96 b96Var = this.c;
        if (v0) {
            StickerDeleteAreaView stickerDeleteArea = b96Var.a.getStickerDeleteArea();
            stickerDeleteArea.setVisibility(0);
            stickerDeleteArea.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            stickerDeleteArea.setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            stickerDeleteArea.animate().alpha(1.0f).setInterpolator(qq2.c).setListener(null).setDuration(195L).start();
        }
        b96.c(b96Var);
    }

    @Override // xsna.sc80
    public final void h(nov novVar) {
        boolean z = true;
        this.b.W4(true, false);
        if (j()) {
            t76 t76Var = this.a;
            m4m0 hashtagDelegate = t76Var.getHashtagDelegate();
            zlo0 currentTextDialog = t76Var.getCurrentTextDialog();
            p6m0 mentionDelegate = t76Var.getMentionDelegate();
            x0m0 questionDelegate = t76Var.getQuestionDelegate();
            kh6 musicDelegate = t76Var.getMusicDelegate();
            if ((hashtagDelegate == null || hashtagDelegate.e == null) && ((mentionDelegate == null || mentionDelegate.e == null) && ((questionDelegate == null || !questionDelegate.g()) && (musicDelegate == null || !musicDelegate.g())))) {
                y7m0 photoAlbumStickerDelegate = t76Var.getPhotoAlbumStickerDelegate();
                f8m0 photoStickerRedesignDelegate = t76Var.getPhotoStickerRedesignDelegate();
                v8m0 storyPostDelegate = t76Var.getStoryPostDelegate();
                obm0 replyVideoStickerDelegate = t76Var.getReplyVideoStickerDelegate();
                if ((photoAlbumStickerDelegate == null || !photoAlbumStickerDelegate.g()) && !photoStickerRedesignDelegate.g() && ((storyPostDelegate == null || !storyPostDelegate.g()) && !replyVideoStickerDelegate.g())) {
                    z = false;
                }
            }
            b96 b96Var = this.c;
            b96Var.a();
            if (currentTextDialog != null || z) {
                return;
            }
            b96Var.f();
        }
    }

    @Override // com.vk.stories.design.view.stickers.StickersDrawingViewGroup.j
    public final void i() {
        this.b.W4(false, false);
        b96.c(this.c);
    }

    public final boolean j() {
        return this.b.getCurrentState() == BaseCameraEditorContract$ScreenState.EDITOR_MAIN_SCREEN;
    }

    public final void k(nov novVar) {
        y7m0 photoAlbumStickerDelegate;
        Integer valueOf = Integer.valueOf(R.string.repost_style_preview);
        Integer valueOf2 = Integer.valueOf(R.drawable.vk_icon_square_outline_24);
        boolean z = novVar instanceof z7c0;
        t76 t76Var = this.a;
        if (z) {
            v8m0 storyPostDelegate = t76Var.getStoryPostDelegate();
            if (storyPostDelegate != null) {
                p7c0 p7c0Var = (p7c0) novVar;
                u7c0 m = p7c0Var.m();
                List<PostStickerStyle> list = p7c0Var.m().j.b;
                u76 u76Var = storyPostDelegate.f;
                List<PostStickerStyle> list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                for (PostStickerStyle postStickerStyle : list2) {
                    arrayList.add(new mim0(nim0.d(postStickerStyle), nim0.b(postStickerStyle)));
                }
                u76Var.z1(arrayList, list.indexOf(m.j.a), new vd6(list, storyPostDelegate, p7c0Var, 4));
                return;
            }
            return;
        }
        if (novVar instanceof r4g0) {
            obm0 replyVideoStickerDelegate = t76Var.getReplyVideoStickerDelegate();
            r4g0 r4g0Var = (r4g0) novVar;
            replyVideoStickerDelegate.getClass();
            q4g0 info = r4g0Var.getInfo();
            List<ReplyVideoStickerStyle> list3 = r4g0Var.getInfo().e.b;
            u76 u76Var2 = replyVideoStickerDelegate.f;
            List<ReplyVideoStickerStyle> list4 = list3;
            ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
            for (ReplyVideoStickerStyle replyVideoStickerStyle : list4) {
                arrayList2.add(new mim0(nim0.c(replyVideoStickerStyle), nim0.a(replyVideoStickerStyle)));
            }
            u76Var2.z1(arrayList2, list3.indexOf(info.e.a), new ea3(replyVideoStickerDelegate, r4g0Var, list3, 10));
            return;
        }
        if (novVar instanceof lba0) {
            f8m0 photoStickerRedesignDelegate = t76Var.getPhotoStickerRedesignDelegate();
            lba0 lba0Var = (lba0) novVar;
            photoStickerRedesignDelegate.getClass();
            kba0 info2 = lba0Var.getInfo();
            List<PhotoStickerStyle> list5 = lba0Var.getInfo().c.b;
            u76 u76Var3 = photoStickerRedesignDelegate.f;
            List<PhotoStickerStyle> list6 = list5;
            ArrayList arrayList3 = new ArrayList(c5g.u(list6, 10));
            for (PhotoStickerStyle photoStickerStyle : list6) {
                int[] iArr = nim0.a.$EnumSwitchMapping$2;
                int i = iArr[photoStickerStyle.ordinal()];
                Integer valueOf3 = i != 1 ? i != 2 ? null : Integer.valueOf(R.drawable.vk_icon_expand_rectangle_vertical_outline_24) : valueOf2;
                int i2 = iArr[photoStickerStyle.ordinal()];
                arrayList3.add(new mim0(valueOf3, i2 != 1 ? i2 != 2 ? null : Integer.valueOf(R.string.repost_style_fullscreen) : valueOf));
            }
            u76Var3.z1(arrayList3, list5.indexOf(info2.c.a), new c2k(photoStickerRedesignDelegate, lba0Var, list5, 5));
            return;
        }
        if (!(novVar instanceof h5a0) || (photoAlbumStickerDelegate = t76Var.getPhotoAlbumStickerDelegate()) == null) {
            return;
        }
        h5a0 h5a0Var = (h5a0) novVar;
        i5a0 i5a0Var = h5a0Var.f;
        List<AlbumStickerStyle> list7 = i5a0Var.i.b;
        u76 u76Var4 = photoAlbumStickerDelegate.f;
        List<AlbumStickerStyle> list8 = list7;
        ArrayList arrayList4 = new ArrayList(c5g.u(list8, 10));
        for (AlbumStickerStyle albumStickerStyle : list8) {
            int[] iArr2 = nim0.a.$EnumSwitchMapping$3;
            int i3 = iArr2[albumStickerStyle.ordinal()];
            Integer valueOf4 = i3 != 1 ? i3 != 2 ? null : Integer.valueOf(R.drawable.vk_icon_rectangle_text_outline_24) : valueOf2;
            int i4 = iArr2[albumStickerStyle.ordinal()];
            arrayList4.add(new mim0(valueOf4, i4 != 1 ? i4 != 2 ? null : Integer.valueOf(R.string.repost_style_miniature) : valueOf));
        }
        u76Var4.z1(arrayList4, list7.indexOf(i5a0Var.i.a), new p37(photoAlbumStickerDelegate, h5a0Var, list7, 4));
    }

    @Override // com.vk.stories.design.view.stickers.StickersDrawingViewGroup.g
    public final boolean onClick() {
        if (!j()) {
            return false;
        }
        this.b.p6();
        return true;
    }
}
