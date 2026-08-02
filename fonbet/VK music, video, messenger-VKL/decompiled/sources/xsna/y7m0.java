package xsna;

import android.content.Context;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.stickers.api.models.AlbumStickerStyle;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.i5a0;
import xsna.nim0;

/* compiled from: StoryPhotoAlbumStickerDelegate.kt */
/* loaded from: classes16.dex */
public final class y7m0 extends wyl0 {
    public final u76 f;
    public final v3l0 g;
    public iz8 h;

    /* compiled from: StoryPhotoAlbumStickerDelegate.kt */
    public static final class a implements zbm0 {
        public final ArrayList a;
        public final /* synthetic */ List<AlbumStickerStyle> b;
        public final /* synthetic */ y7m0 c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends AlbumStickerStyle> list, y7m0 y7m0Var) {
            this.b = list;
            this.c = y7m0Var;
            List<? extends AlbumStickerStyle> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (AlbumStickerStyle albumStickerStyle : list2) {
                int[] iArr = nim0.a.$EnumSwitchMapping$3;
                int i = iArr[albumStickerStyle.ordinal()];
                Integer num = null;
                Integer valueOf = i != 1 ? i != 2 ? null : Integer.valueOf(R.drawable.vk_icon_rectangle_text_outline_24) : Integer.valueOf(R.drawable.vk_icon_square_outline_24);
                int i2 = iArr[albumStickerStyle.ordinal()];
                if (i2 == 1) {
                    num = Integer.valueOf(R.string.repost_style_preview);
                } else if (i2 == 2) {
                    num = Integer.valueOf(R.string.repost_style_miniature);
                }
                arrayList.add(new mim0(valueOf, num));
            }
            this.a = arrayList;
        }

        @Override // xsna.zbm0
        public final int a(nxt0 nxt0Var) {
            return this.b.indexOf(((h5a0) nxt0Var).f.i.a);
        }

        @Override // xsna.zbm0
        public final boolean b() {
            return false;
        }

        @Override // xsna.zbm0
        public final void c(nxt0 nxt0Var, int i) {
            AlbumStickerStyle albumStickerStyle = this.b.get(i);
            this.c.i((h5a0) nxt0Var, albumStickerStyle, false);
        }

        @Override // xsna.zbm0
        public final ArrayList d() {
            return this.a;
        }
    }

    /* compiled from: StoryPhotoAlbumStickerDelegate.kt */
    public static final class b implements rbm0 {
        public final /* synthetic */ h5a0 b;
        public final /* synthetic */ List<AlbumStickerStyle> c;
        public final /* synthetic */ AlbumStickerStyle d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(h5a0 h5a0Var, List<? extends AlbumStickerStyle> list, AlbumStickerStyle albumStickerStyle) {
            this.b = h5a0Var;
            this.c = list;
            this.d = albumStickerStyle;
        }

        @Override // xsna.rbm0
        public final void a(Integer num) {
            if (num != null) {
                AlbumStickerStyle albumStickerStyle = this.c.get(num.intValue());
                h5a0 h5a0Var = this.b;
                y7m0.this.i(h5a0Var, albumStickerStyle, this.d != h5a0Var.getStickerInfo().i.a);
            }
        }
    }

    public y7m0(StickersDrawingViewGroup stickersDrawingViewGroup, b96 b96Var, u76 u76Var, v3l0 v3l0Var) {
        super(stickersDrawingViewGroup, b96Var);
        this.f = u76Var;
        this.g = v3l0Var;
    }

    @Override // xsna.wyl0
    public final tyl0<?> f() {
        h5a0 h5a0Var = (h5a0) this.e;
        List<AlbumStickerStyle> list = h5a0Var.f.i.b;
        AlbumStickerStyle albumStickerStyle = h5a0Var.getStickerInfo().i.a;
        Context context = this.b.getContext();
        a aVar = new a(list, this);
        return new xbm0(context, new b(h5a0Var, list, albumStickerStyle), this.g, aVar, this.h);
    }

    public final void i(h5a0 h5a0Var, AlbumStickerStyle albumStickerStyle, boolean z) {
        i5a0 i5a0Var = h5a0Var.f;
        h5a0Var.p(i5a0.a(i5a0Var, null, null, new i5a0.a(albumStickerStyle, i5a0Var.i.b), 255), true);
        if (z) {
            this.f.o5().i(StoryEditorEvents.EDIT_STICKER);
        }
    }
}
