package xsna;

import android.content.Context;
import com.vk.attachpicker.stickers.photo.PhotoStickerStyle;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.kba0;
import xsna.nim0;

/* compiled from: StoryPhotoStickerRedesignDelegate.kt */
/* loaded from: classes16.dex */
public final class f8m0 extends wyl0 {
    public final u76 f;
    public final v3l0 g;
    public iz8 h;

    /* compiled from: StoryPhotoStickerRedesignDelegate.kt */
    public static final class a implements zbm0 {
        public final ArrayList a;
        public final boolean b;
        public final /* synthetic */ List<PhotoStickerStyle> c;
        public final /* synthetic */ f8m0 d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends PhotoStickerStyle> list, lba0 lba0Var, f8m0 f8m0Var) {
            this.c = list;
            this.d = f8m0Var;
            List<? extends PhotoStickerStyle> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PhotoStickerStyle photoStickerStyle = (PhotoStickerStyle) it.next();
                int[] iArr = nim0.a.$EnumSwitchMapping$2;
                int i = iArr[photoStickerStyle.ordinal()];
                Integer num = null;
                Integer valueOf = i != 1 ? i != 2 ? null : Integer.valueOf(R.drawable.vk_icon_expand_rectangle_vertical_outline_24) : Integer.valueOf(R.drawable.vk_icon_square_outline_24);
                int i2 = iArr[photoStickerStyle.ordinal()];
                if (i2 == 1) {
                    num = Integer.valueOf(R.string.repost_style_preview);
                } else if (i2 == 2) {
                    num = Integer.valueOf(R.string.repost_style_fullscreen);
                }
                arrayList.add(new mim0(valueOf, num));
            }
            this.a = arrayList;
            this.b = lba0Var.getInfo().c.a == PhotoStickerStyle.FULLSCREEN;
        }

        @Override // xsna.zbm0
        public final int a(nxt0 nxt0Var) {
            return this.c.indexOf(((lba0) nxt0Var).getInfo().c.a);
        }

        @Override // xsna.zbm0
        public final boolean b() {
            return this.b;
        }

        @Override // xsna.zbm0
        public final void c(nxt0 nxt0Var, int i) {
            PhotoStickerStyle photoStickerStyle = this.c.get(i);
            this.d.i((lba0) nxt0Var, photoStickerStyle, false);
        }

        @Override // xsna.zbm0
        public final ArrayList d() {
            return this.a;
        }
    }

    /* compiled from: StoryPhotoStickerRedesignDelegate.kt */
    public static final class b implements rbm0 {
        public final /* synthetic */ lba0 b;
        public final /* synthetic */ List<PhotoStickerStyle> c;
        public final /* synthetic */ PhotoStickerStyle d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(lba0 lba0Var, List<? extends PhotoStickerStyle> list, PhotoStickerStyle photoStickerStyle) {
            this.b = lba0Var;
            this.c = list;
            this.d = photoStickerStyle;
        }

        @Override // xsna.rbm0
        public final void a(Integer num) {
            if (num != null) {
                PhotoStickerStyle photoStickerStyle = this.c.get(num.intValue());
                lba0 lba0Var = this.b;
                f8m0.this.i(lba0Var, photoStickerStyle, this.d != lba0Var.getInfo().c.a);
            }
        }
    }

    public f8m0(StickersDrawingViewGroup stickersDrawingViewGroup, b96 b96Var, u76 u76Var, v3l0 v3l0Var) {
        super(stickersDrawingViewGroup, b96Var);
        this.f = u76Var;
        this.g = v3l0Var;
    }

    @Override // xsna.wyl0
    public final tyl0<?> f() {
        lba0 lba0Var = (lba0) this.e;
        List<PhotoStickerStyle> list = lba0Var.getInfo().c.b;
        PhotoStickerStyle photoStickerStyle = lba0Var.getInfo().c.a;
        Context context = this.b.getContext();
        a aVar = new a(list, lba0Var, this);
        return new xbm0(context, new b(lba0Var, list, photoStickerStyle), this.g, aVar, this.h);
    }

    public final void i(lba0 lba0Var, PhotoStickerStyle photoStickerStyle, boolean z) {
        kba0 info = lba0Var.getInfo();
        kba0 a2 = kba0.a(info, null, new kba0.a(photoStickerStyle, info.c.b), null, null, 1019);
        lba0Var.f = a2;
        lba0Var.o(nba0.a(lba0Var.getContext(), a2));
        lba0Var.p = false;
        lba0Var.q();
        xaq.a(lba0Var, new gzv(lba0Var, 27));
        u76 u76Var = this.f;
        if (z) {
            u76Var.o5().i(StoryEditorEvents.EDIT_STICKER);
        }
        if (lba0Var.equals(this.e) || this.e == null) {
            u76Var.Y3(photoStickerStyle != PhotoStickerStyle.FULLSCREEN);
        }
        u76Var.p4(lba0Var);
    }
}
