package xsna;

import android.util.Size;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicSelectorCatalogEmbeddedTabsVh;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.stories.model.clickable.ClickableQuestion;
import com.vk.dto.stories.model.clickable.ClickableReaction;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.imageloader.ImageScreenSize;
import com.vk.stories.design.view.ReactionView;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.OpinionStickerState;
import com.vk.superapp.api.dto.story.actions.WebActionQuestion;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import one.video.controls.views.preview.VideoPreview;
import xsna.dt80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class m50 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f3  */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        zbx zbxVar;
        int i;
        ClickableReaction a;
        List<ClickableSticker> list;
        String str;
        int hashCode;
        dt80 dt80Var;
        String str2;
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                q7r q7rVar = ((q50) obj).a;
                StoryEntry currentStory = q7rVar.i0.getCurrentStory();
                if (currentStory != null && (zbxVar = q7rVar.l0) != null) {
                    zbxVar.a().removeAllViews();
                    uov uovVar = zbxVar.a;
                    com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.a aVar = zbxVar.c;
                    if (aVar != null) {
                        elm0 callback = uovVar.getCallback();
                        if (callback == null || (str2 = callback.getRef()) == null) {
                            str2 = "unknown";
                        }
                        ClickableStickers clickableStickers = currentStory.X;
                        if (clickableStickers != null && !((List) clickableStickers.i.getValue()).isEmpty()) {
                            String str3 = currentStory.u;
                            VideoFile videoFile = currentStory.n;
                            aVar.a(clickableStickers, str2, str3, true ^ ((videoFile == null || videoFile.getWidth() == 0 || (videoFile.getWidth() < videoFile.getHeight() && !currentStory.Lb())) ? false : true));
                        }
                    }
                    mbx mbxVar = zbxVar.d;
                    if (mbxVar != null) {
                        bpn0 bpn0Var = mbxVar.g;
                        elm0 callback2 = uovVar.getCallback();
                        if (callback2 != null) {
                            callback2.getRef();
                        }
                        ClickableStickers clickableStickers2 = currentStory.X;
                        if (clickableStickers2 != null) {
                            bpn0 bpn0Var2 = clickableStickers2.j;
                            if (!((List) bpn0Var2.getValue()).isEmpty()) {
                                mbxVar.a().removeAllViews();
                                ClickableQuestion clickableQuestion = (ClickableQuestion) j5g.Y((List) bpn0Var2.getValue());
                                mbxVar.b.addView((FrameLayout) bpn0Var.getValue());
                                ((FrameLayout) bpn0Var.getValue()).setVisibility(4);
                                VkImage vkImage = (VkImage) mbxVar.h.getValue();
                                vkImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                vkImage.setVkPostprocessor(mbxVar.f);
                                String Cb = currentStory.Cb(false);
                                String Bb = currentStory.Bb(iah0.v());
                                if (Cb != null) {
                                    if (Cb.length() <= 0) {
                                        Cb = null;
                                    }
                                    if (Cb != null) {
                                        Bb = Cb;
                                        if (Bb != null) {
                                            ImageScreenSize imageScreenSize = ImageScreenSize.BIG;
                                            vkImage.o0(Bb, new Size(imageScreenSize.h(), imageScreenSize.h()));
                                        }
                                        ykm0 ykm0Var = new ykm0(mbxVar.a);
                                        StoryOwner storyOwner = currentStory.l0;
                                        String Cb2 = storyOwner == null ? storyOwner.Cb() : null;
                                        UserId userId = currentStory.d;
                                        int i3 = currentStory.c;
                                        boolean z = currentStory.H;
                                        boolean z2 = currentStory.I;
                                        boolean z3 = clickableQuestion.f;
                                        WebActionQuestion webActionQuestion = clickableQuestion.e;
                                        eu3 eu3Var = new eu3(clickableQuestion, Cb2, userId, i3, z, z2, z3);
                                        String str4 = webActionQuestion.d;
                                        w2l0 w2l0Var = mbxVar.c;
                                        y2l0 a2 = w2l0Var == null ? w2l0Var.a(webActionQuestion.e) : null;
                                        bt80 bt80Var = new bt80(ykm0Var, eu3Var, str4, a2);
                                        kbx a3 = mbxVar.a();
                                        a3.getClass();
                                        str = webActionQuestion.b;
                                        Object obj2 = "";
                                        if (str != null) {
                                            ucp ucpVar = ucp.a;
                                            Object i4 = ucp.i(str);
                                            if (i4 != null) {
                                                obj2 = i4;
                                            }
                                        }
                                        String obj3 = obj2.toString();
                                        OpinionStickerState.OpinionPrivacy opinionPrivacy = !z3 ? OpinionStickerState.OpinionPrivacy.HIDDEN_EXCEPT_AUTHOR : OpinionStickerState.OpinionPrivacy.PUBLIC;
                                        hashCode = str4.hashCode();
                                        if (hashCode != 3075958) {
                                            if (str4.equals("dark")) {
                                                dt80Var = dt80.c.a;
                                                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.b bVar = new com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.b(new com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.d(new OpinionStickerState(obj3, "", opinionPrivacy, false, null, dt80Var, !z2 ? e43.l(OpinionStickerState.OpinionPrivacy.HIDDEN_EXCEPT_AUTHOR, OpinionStickerState.OpinionPrivacy.HIDDEN, OpinionStickerState.OpinionPrivacy.PUBLIC) : e43.l(OpinionStickerState.OpinionPrivacy.HIDDEN_EXCEPT_AUTHOR, OpinionStickerState.OpinionPrivacy.PUBLIC))), bt80Var);
                                                int i5 = 0;
                                                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.f fVar = new com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.f(bVar, a3, a3, new acd(0, a3, kbx.class, "prepareView", "prepareView()V", i5, 1), new ug8(1, a3, kbx.class, "render", "render(Lcom/vk/story/viewer/impl/presentation/stories/view/dynstickers/opinion/OpinionViewData;)V", i5, 7));
                                                bVar.g.a(new iou(a3, 7), a3);
                                                a3.e = fVar;
                                            }
                                            if (a2 != null) {
                                            }
                                            com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.b bVar2 = new com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.b(new com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.d(new OpinionStickerState(obj3, "", opinionPrivacy, false, null, dt80Var, !z2 ? e43.l(OpinionStickerState.OpinionPrivacy.HIDDEN_EXCEPT_AUTHOR, OpinionStickerState.OpinionPrivacy.HIDDEN, OpinionStickerState.OpinionPrivacy.PUBLIC) : e43.l(OpinionStickerState.OpinionPrivacy.HIDDEN_EXCEPT_AUTHOR, OpinionStickerState.OpinionPrivacy.PUBLIC))), bt80Var);
                                            int i52 = 0;
                                            com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.f fVar2 = new com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.f(bVar2, a3, a3, new acd(0, a3, kbx.class, "prepareView", "prepareView()V", i52, 1), new ug8(1, a3, kbx.class, "render", "render(Lcom/vk/story/viewer/impl/presentation/stories/view/dynstickers/opinion/OpinionViewData;)V", i52, 7));
                                            bVar2.g.a(new iou(a3, 7), a3);
                                            a3.e = fVar2;
                                        } else if (hashCode != 93818879) {
                                            if (hashCode == 102970646 && str4.equals("light")) {
                                                dt80Var = dt80.d.a;
                                                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.b bVar22 = new com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.b(new com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.d(new OpinionStickerState(obj3, "", opinionPrivacy, false, null, dt80Var, !z2 ? e43.l(OpinionStickerState.OpinionPrivacy.HIDDEN_EXCEPT_AUTHOR, OpinionStickerState.OpinionPrivacy.HIDDEN, OpinionStickerState.OpinionPrivacy.PUBLIC) : e43.l(OpinionStickerState.OpinionPrivacy.HIDDEN_EXCEPT_AUTHOR, OpinionStickerState.OpinionPrivacy.PUBLIC))), bt80Var);
                                                int i522 = 0;
                                                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.f fVar22 = new com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.f(bVar22, a3, a3, new acd(0, a3, kbx.class, "prepareView", "prepareView()V", i522, 1), new ug8(1, a3, kbx.class, "render", "render(Lcom/vk/story/viewer/impl/presentation/stories/view/dynstickers/opinion/OpinionViewData;)V", i522, 7));
                                                bVar22.g.a(new iou(a3, 7), a3);
                                                a3.e = fVar22;
                                            }
                                            dt80Var = a2 != null ? new dt80.a(a2) : dt80.d.a;
                                            com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.b bVar222 = new com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.b(new com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.d(new OpinionStickerState(obj3, "", opinionPrivacy, false, null, dt80Var, !z2 ? e43.l(OpinionStickerState.OpinionPrivacy.HIDDEN_EXCEPT_AUTHOR, OpinionStickerState.OpinionPrivacy.HIDDEN, OpinionStickerState.OpinionPrivacy.PUBLIC) : e43.l(OpinionStickerState.OpinionPrivacy.HIDDEN_EXCEPT_AUTHOR, OpinionStickerState.OpinionPrivacy.PUBLIC))), bt80Var);
                                            int i5222 = 0;
                                            com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.f fVar222 = new com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.f(bVar222, a3, a3, new acd(0, a3, kbx.class, "prepareView", "prepareView()V", i5222, 1), new ug8(1, a3, kbx.class, "render", "render(Lcom/vk/story/viewer/impl/presentation/stories/view/dynstickers/opinion/OpinionViewData;)V", i5222, 7));
                                            bVar222.g.a(new iou(a3, 7), a3);
                                            a3.e = fVar222;
                                        } else {
                                            if (str4.equals("black")) {
                                                dt80Var = dt80.b.a;
                                                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.b bVar2222 = new com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.b(new com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.d(new OpinionStickerState(obj3, "", opinionPrivacy, false, null, dt80Var, !z2 ? e43.l(OpinionStickerState.OpinionPrivacy.HIDDEN_EXCEPT_AUTHOR, OpinionStickerState.OpinionPrivacy.HIDDEN, OpinionStickerState.OpinionPrivacy.PUBLIC) : e43.l(OpinionStickerState.OpinionPrivacy.HIDDEN_EXCEPT_AUTHOR, OpinionStickerState.OpinionPrivacy.PUBLIC))), bt80Var);
                                                int i52222 = 0;
                                                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.f fVar2222 = new com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.f(bVar2222, a3, a3, new acd(0, a3, kbx.class, "prepareView", "prepareView()V", i52222, 1), new ug8(1, a3, kbx.class, "render", "render(Lcom/vk/story/viewer/impl/presentation/stories/view/dynstickers/opinion/OpinionViewData;)V", i52222, 7));
                                                bVar2222.g.a(new iou(a3, 7), a3);
                                                a3.e = fVar2222;
                                            }
                                            if (a2 != null) {
                                            }
                                            com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.b bVar22222 = new com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.b(new com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.d(new OpinionStickerState(obj3, "", opinionPrivacy, false, null, dt80Var, !z2 ? e43.l(OpinionStickerState.OpinionPrivacy.HIDDEN_EXCEPT_AUTHOR, OpinionStickerState.OpinionPrivacy.HIDDEN, OpinionStickerState.OpinionPrivacy.PUBLIC) : e43.l(OpinionStickerState.OpinionPrivacy.HIDDEN_EXCEPT_AUTHOR, OpinionStickerState.OpinionPrivacy.PUBLIC))), bt80Var);
                                            int i522222 = 0;
                                            com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.f fVar22222 = new com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.f(bVar22222, a3, a3, new acd(0, a3, kbx.class, "prepareView", "prepareView()V", i522222, 1), new ug8(1, a3, kbx.class, "render", "render(Lcom/vk/story/viewer/impl/presentation/stories/view/dynstickers/opinion/OpinionViewData;)V", i522222, 7));
                                            bVar22222.g.a(new iou(a3, 7), a3);
                                            a3.e = fVar22222;
                                        }
                                    }
                                }
                                if (Bb == null || Bb.length() <= 0) {
                                    Bb = null;
                                }
                                if (Bb != null) {
                                }
                                ykm0 ykm0Var2 = new ykm0(mbxVar.a);
                                StoryOwner storyOwner2 = currentStory.l0;
                                if (storyOwner2 == null) {
                                }
                                UserId userId2 = currentStory.d;
                                int i32 = currentStory.c;
                                boolean z4 = currentStory.H;
                                boolean z22 = currentStory.I;
                                boolean z32 = clickableQuestion.f;
                                WebActionQuestion webActionQuestion2 = clickableQuestion.e;
                                eu3 eu3Var2 = new eu3(clickableQuestion, Cb2, userId2, i32, z4, z22, z32);
                                String str42 = webActionQuestion2.d;
                                w2l0 w2l0Var2 = mbxVar.c;
                                if (w2l0Var2 == null) {
                                }
                                bt80 bt80Var2 = new bt80(ykm0Var2, eu3Var2, str42, a2);
                                kbx a32 = mbxVar.a();
                                a32.getClass();
                                str = webActionQuestion2.b;
                                Object obj22 = "";
                                if (str != null) {
                                }
                                String obj32 = obj22.toString();
                                OpinionStickerState.OpinionPrivacy opinionPrivacy2 = !z32 ? OpinionStickerState.OpinionPrivacy.HIDDEN_EXCEPT_AUTHOR : OpinionStickerState.OpinionPrivacy.PUBLIC;
                                hashCode = str42.hashCode();
                                if (hashCode != 3075958) {
                                }
                            }
                        }
                    }
                    e2f0 e2f0Var = zbxVar.e;
                    if (e2f0Var != null) {
                        bpn0 bpn0Var3 = e2f0Var.i;
                        if (((FrameLayout) bpn0Var3.getValue()).getParent() == null) {
                            e2f0Var.c.addView((FrameLayout) bpn0Var3.getValue());
                        }
                        FrameLayout frameLayout = (FrameLayout) bpn0Var3.getValue();
                        ClickableStickers clickableStickers3 = currentStory.X;
                        if (clickableStickers3 != null && (list = clickableStickers3.d) != null) {
                            List<ClickableSticker> list2 = list;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator<T> it = list2.iterator();
                                while (it.hasNext()) {
                                    if (((ClickableSticker) it.next()) instanceof ClickableReaction) {
                                        i = 0;
                                        frameLayout.setVisibility(i);
                                        e2f0Var.f = currentStory;
                                        a = e2f0Var.a();
                                        if (a != null) {
                                            e2f0Var.d.dispose();
                                            e2f0Var.b().setBubbleBackground(ReactionView.Background.BLACK);
                                            int i6 = 27;
                                            e2f0Var.d = ktr.d(((fbm0) e2f0Var.e.getValue()).a().l(new dnz(new qw30(e2f0Var, i6), 10))).subscribe(new m330(new ut6(i6, e2f0Var, a), 18), new gl30(new xpt(23), 19));
                                            e2f0Var.b().setVisibility(0);
                                        }
                                        e2f0Var.c();
                                        break;
                                    }
                                }
                            }
                        }
                        i = 8;
                        frameLayout.setVisibility(i);
                        e2f0Var.f = currentStory;
                        a = e2f0Var.a();
                        if (a != null) {
                        }
                        e2f0Var.c();
                    }
                }
                break;
            case 1:
                qcy<Object>[] qcyVarArr = ClipsMusicSelectorCatalogEmbeddedTabsVh.p;
                ((ClipsMusicSelectorCatalogEmbeddedTabsVh) obj).b();
                break;
            case 2:
                j3k j3kVar = (j3k) obj;
                j3kVar.a.setBackgroundColor(((Number) j3kVar.d.getValue()).intValue());
                break;
            case 3:
                p0m p0mVar = (p0m) obj;
                p0mVar.b.invoke(Boolean.FALSE);
                p0mVar.c = true;
                break;
            case 4:
                ((nfb0) obj).a.fullScroll(130);
                break;
            case 5:
                ((mwb0) obj).requestLayout();
                break;
            case 6:
                u1u0.b((ner0) obj);
                cvk.u(R.string.error, false);
                break;
            case 7:
                ((b1z) obj).invoke();
                break;
            case 8:
                ((tcm0) obj).j.c(true);
                break;
            case 9:
                ((VideoPreview) obj).v.setVisibility(0);
                break;
            case 10:
                ((wx0) obj).invoke();
                break;
            default:
                pbz0 pbz0Var = (pbz0) obj;
                int i7 = pbz0Var.h;
                if (i7 != 0) {
                    if (i7 == 1) {
                        pbz0Var.s -= 200;
                    }
                    if (pbz0Var.s > 0) {
                        pbz0Var.u();
                        break;
                    }
                }
                pbz0Var.m();
                break;
        }
    }
}
