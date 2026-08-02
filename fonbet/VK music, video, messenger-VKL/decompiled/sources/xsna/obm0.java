package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.vk.attachpicker.stickers.reply.ReplyVideoStickerStyle;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.stories.design.view.stickers.photo.PhotoWithCaptionViewGroup;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.q4g0;

/* compiled from: StoryReplyVideoStickerRedesignDelegate.kt */
/* loaded from: classes16.dex */
public final class obm0 extends wyl0 {
    public final u76 f;
    public final v3l0 g;
    public iz8 h;

    /* compiled from: StoryReplyVideoStickerRedesignDelegate.kt */
    public static final class a implements zbm0 {
        public final ArrayList a;
        public final boolean b;
        public final /* synthetic */ List<ReplyVideoStickerStyle> c;
        public final /* synthetic */ obm0 d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends ReplyVideoStickerStyle> list, r4g0 r4g0Var, obm0 obm0Var) {
            this.c = list;
            this.d = obm0Var;
            List<? extends ReplyVideoStickerStyle> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (ReplyVideoStickerStyle replyVideoStickerStyle : list2) {
                arrayList.add(new mim0(nim0.c(replyVideoStickerStyle), nim0.a(replyVideoStickerStyle)));
            }
            this.a = arrayList;
            this.b = r4g0Var.getInfo().e.a == ReplyVideoStickerStyle.FULLSCREEN;
        }

        @Override // xsna.zbm0
        public final int a(nxt0 nxt0Var) {
            return this.c.indexOf(((r4g0) nxt0Var).getInfo().e.a);
        }

        @Override // xsna.zbm0
        public final boolean b() {
            return this.b;
        }

        @Override // xsna.zbm0
        public final void c(nxt0 nxt0Var, int i) {
            ReplyVideoStickerStyle replyVideoStickerStyle = this.c.get(i);
            this.d.i((r4g0) nxt0Var, replyVideoStickerStyle, false);
        }

        @Override // xsna.zbm0
        public final ArrayList d() {
            return this.a;
        }
    }

    /* compiled from: StoryReplyVideoStickerRedesignDelegate.kt */
    public static final class b implements rbm0 {
        public final /* synthetic */ List<ReplyVideoStickerStyle> a;
        public final /* synthetic */ r4g0 b;
        public final /* synthetic */ obm0 c;
        public final /* synthetic */ ReplyVideoStickerStyle d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends ReplyVideoStickerStyle> list, r4g0 r4g0Var, obm0 obm0Var, ReplyVideoStickerStyle replyVideoStickerStyle) {
            this.a = list;
            this.b = r4g0Var;
            this.c = obm0Var;
            this.d = replyVideoStickerStyle;
        }

        @Override // xsna.rbm0
        public final void a(Integer num) {
            r4g0 r4g0Var = this.b;
            this.c.i(r4g0Var, num != null ? this.a.get(num.intValue()) : r4g0Var.getInfo().e.a, this.d != r4g0Var.getInfo().e.a);
        }
    }

    public obm0(StickersDrawingViewGroup stickersDrawingViewGroup, b96 b96Var, u76 u76Var, v3l0 v3l0Var) {
        super(stickersDrawingViewGroup, b96Var);
        this.f = u76Var;
        this.g = v3l0Var;
    }

    @Override // xsna.wyl0
    public final tyl0<?> f() {
        r4g0 r4g0Var = (r4g0) this.e;
        List<ReplyVideoStickerStyle> list = r4g0Var.getInfo().e.b;
        ReplyVideoStickerStyle replyVideoStickerStyle = r4g0Var.getInfo().e.a;
        Context context = this.b.getContext();
        a aVar = new a(list, r4g0Var, this);
        return new xbm0(context, new b(list, r4g0Var, this, replyVideoStickerStyle), this.g, aVar, this.h);
    }

    public final void i(r4g0 r4g0Var, ReplyVideoStickerStyle replyVideoStickerStyle, boolean z) {
        q4g0 info = r4g0Var.getInfo();
        q4g0 q4g0Var = new q4g0(info.a, info.b, info.c, info.d, new q4g0.a(replyVideoStickerStyle, info.e.b), info.f, info.g);
        PhotoWithCaptionViewGroup photoWithCaptionViewGroup = r4g0Var.n;
        p4g0 p4g0Var = r4g0Var.g;
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_TAB_STYLE_PICKER;
        storiesFeatures.getClass();
        if (com.vk.toggle.b.A.a(storiesFeatures) && !epx.f(p4g0Var.getParent(), photoWithCaptionViewGroup)) {
            ViewParent parent = p4g0Var.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(p4g0Var);
            }
            photoWithCaptionViewGroup.addView(p4g0Var, 0);
            p4g0Var.u();
        }
        r4g0Var.f = q4g0Var;
        r4g0Var.o(t4g0.a(q4g0Var));
        p4g0Var.setFullscreen(r4g0Var.q);
        r4g0Var.s = false;
        r4g0Var.p();
        xaq.a(r4g0Var, new re40(r4g0Var, 21));
        bwt0.Q(r4g0Var, R.id.clip_sticker_style_auto_test, r4g0Var.f.e.a.i());
        u76 u76Var = this.f;
        if (z) {
            u76Var.o5().i(StoryEditorEvents.EDIT_STICKER);
        }
        if (r4g0Var.equals(this.e) || this.e == null) {
            u76Var.Y3(replyVideoStickerStyle != ReplyVideoStickerStyle.FULLSCREEN);
        }
        u76Var.p4(r4g0Var);
    }
}
