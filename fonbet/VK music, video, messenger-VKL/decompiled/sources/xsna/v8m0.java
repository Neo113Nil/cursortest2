package xsna;

import android.content.Context;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.stickers.api.models.post.PostStickerStyle;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.toggle.features.StoriesFeatures;
import java.util.ArrayList;
import java.util.List;
import xsna.u7c0;

/* compiled from: StoryPostStickerDelegate.kt */
/* loaded from: classes16.dex */
public final class v8m0 extends wyl0 {
    public final u76 f;
    public final v3l0 g;
    public iz8 h;

    /* compiled from: StoryPostStickerDelegate.kt */
    public static final class a implements zbm0 {
        public final ArrayList a;
        public final boolean b;
        public final /* synthetic */ List<PostStickerStyle> c;
        public final /* synthetic */ v8m0 d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends PostStickerStyle> list, p7c0 p7c0Var, v8m0 v8m0Var) {
            this.c = list;
            this.d = v8m0Var;
            List<? extends PostStickerStyle> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (PostStickerStyle postStickerStyle : list2) {
                arrayList.add(new mim0(nim0.d(postStickerStyle), nim0.b(postStickerStyle)));
            }
            this.a = arrayList;
            this.b = p7c0Var.m().j.a == PostStickerStyle.FULLSCREEN;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.zbm0
        public final int a(nxt0 nxt0Var) {
            return this.c.indexOf(((p7c0) nxt0Var).m().j.a);
        }

        @Override // xsna.zbm0
        public final boolean b() {
            return this.b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.zbm0
        public final void c(nxt0 nxt0Var, int i) {
            PostStickerStyle postStickerStyle = this.c.get(i);
            this.d.j((p7c0) nxt0Var, postStickerStyle, false);
        }

        @Override // xsna.zbm0
        public final ArrayList d() {
            return this.a;
        }
    }

    /* compiled from: StoryPostStickerDelegate.kt */
    public static final class b implements rbm0 {
        public final /* synthetic */ p7c0 b;
        public final /* synthetic */ List<PostStickerStyle> c;
        public final /* synthetic */ PostStickerStyle d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(p7c0 p7c0Var, List<? extends PostStickerStyle> list, PostStickerStyle postStickerStyle) {
            this.b = p7c0Var;
            this.c = list;
            this.d = postStickerStyle;
        }

        @Override // xsna.rbm0
        public final void a(Integer num) {
            if (num != null) {
                PostStickerStyle postStickerStyle = this.c.get(num.intValue());
                p7c0 p7c0Var = this.b;
                v8m0.this.j(p7c0Var, postStickerStyle, this.d != p7c0Var.m().j.a);
            }
        }
    }

    public v8m0(StickersDrawingViewGroup stickersDrawingViewGroup, b96 b96Var, u76 u76Var, v3l0 v3l0Var) {
        super(stickersDrawingViewGroup, b96Var);
        this.f = u76Var;
        this.g = v3l0Var;
    }

    @Override // xsna.wyl0
    public final tyl0<?> f() {
        p7c0 p7c0Var = (p7c0) this.e;
        List<PostStickerStyle> list = p7c0Var.m().j.b;
        PostStickerStyle postStickerStyle = p7c0Var.m().j.a;
        Context context = this.b.getContext();
        a aVar = new a(list, p7c0Var, this);
        return new xbm0(context, new b(p7c0Var, list, postStickerStyle), this.g, aVar, this.h);
    }

    public final void i(p7c0 p7c0Var) {
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_TAB_STYLE_PICKER;
        storiesFeatures.getClass();
        if (com.vk.toggle.b.A.a(storiesFeatures) && (p7c0Var instanceof z7c0)) {
            if (((z7c0) p7c0Var).f.j.b.size() > 1) {
                h((nov) p7c0Var);
            }
        } else {
            u7c0.e eVar = p7c0Var.m().j;
            List<PostStickerStyle> list = eVar.b;
            j(p7c0Var, list.get((list.indexOf(eVar.a) + 1) % list.size()), true);
        }
    }

    public final void j(p7c0 p7c0Var, PostStickerStyle postStickerStyle, boolean z) {
        u7c0 m = p7c0Var.m();
        p7c0Var.update(new u7c0(m.a, m.b, m.c, m.d, m.e, m.f, m.g, m.h, m.i, new u7c0.e(postStickerStyle, m.j.b)));
        u76 u76Var = this.f;
        if (z) {
            u76Var.o5().i(StoryEditorEvents.EDIT_STICKER);
        }
        if (p7c0Var.equals(this.e) || this.e == null) {
            u76Var.Y3(postStickerStyle != PostStickerStyle.FULLSCREEN);
        }
        u76Var.p4((nov) p7c0Var);
    }
}
