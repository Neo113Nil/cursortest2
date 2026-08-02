package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.api.generated.stickers.dto.StickersStickerRenderDto;
import com.vk.api.generated.vmoji.dto.VmojiCharacterDto;
import com.vk.api.generated.vmoji.dto.VmojiCharacterPreviewDto;
import com.vk.api.generated.vmoji.dto.VmojiGetCharacterByIdResponseDto;
import com.vk.dto.stickers.StickerRender;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stickers.views.VKStickerImageView;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.dw20;
import xsna.tzp0;

/* compiled from: TryOnDialogController.kt */
/* loaded from: classes7.dex */
public final class msp0 implements fcn {
    public static final int g = cn70.b(184);
    public static final int h = cn70.b(104);
    public dw20 b;
    public VKStickerImageView c;
    public VKStickerImageView d;
    public VKStickerImageView e;
    public VKStickerImageView f;

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r18v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v5, types: [xsna.zjt] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    public final void a(Context context, VmojiProductModel vmojiProductModel, VmojiGetCharacterByIdResponseDto vmojiGetCharacterByIdResponseDto, izs<? super VmojiProductModel, s3q0> izsVar) {
        List list;
        ?? r9;
        Object obj;
        SchemeStat$EventItem schemeStat$EventItem;
        Object obj2;
        VmojiCharacterPreviewDto d;
        List<String> g2;
        VmojiCharacterPreviewDto d2;
        SchemeStat$EventItem schemeStat$EventItem2 = null;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.vmoji_character_try_on_dialog, (ViewGroup) null);
        TextView textView = (TextView) viewGroup.findViewById(R.id.title);
        this.c = (VKStickerImageView) viewGroup.findViewById(R.id.preview);
        this.d = (VKStickerImageView) viewGroup.findViewById(R.id.sticker1);
        this.e = (VKStickerImageView) viewGroup.findViewById(R.id.sticker2);
        this.f = (VKStickerImageView) viewGroup.findViewById(R.id.sticker3);
        baf0 x = dhr0.x(R.drawable.vmoji_preview_portrait, R.attr.vk_ui_skeleton_from, context);
        baf0 x2 = dhr0.x(R.drawable.vmoji_preview, R.attr.vk_ui_skeleton_from, context);
        VKStickerImageView vKStickerImageView = this.c;
        if (vKStickerImageView == null) {
            vKStickerImageView = null;
        }
        vKStickerImageView.setImageDrawable(x);
        VKStickerImageView vKStickerImageView2 = this.d;
        if (vKStickerImageView2 == null) {
            vKStickerImageView2 = null;
        }
        vKStickerImageView2.setImageDrawable(x2);
        VKStickerImageView vKStickerImageView3 = this.e;
        if (vKStickerImageView3 == null) {
            vKStickerImageView3 = null;
        }
        vKStickerImageView3.setImageDrawable(x2);
        VKStickerImageView vKStickerImageView4 = this.f;
        if (vKStickerImageView4 == null) {
            vKStickerImageView4 = null;
        }
        vKStickerImageView4.setImageDrawable(x2);
        VmojiCharacterDto d3 = vmojiGetCharacterByIdResponseDto.d();
        String e = (d3 == null || (d2 = d3.d()) == null) ? null : d2.e();
        VmojiCharacterDto d4 = vmojiGetCharacterByIdResponseDto.d();
        if (d4 == null || (d = d4.d()) == null || (g2 = d.g()) == null || (list = j5g.H0(g2, 3)) == null) {
            list = EmptyList.b;
        }
        List<StickersStickerRenderDto> e2 = vmojiGetCharacterByIdResponseDto.e();
        if (e2 != null) {
            List<StickersStickerRenderDto> list2 = e2;
            r9 = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                r9.add(lyf0.a((StickersStickerRenderDto) it.next()));
            }
        } else {
            r9 = EmptyList.b;
        }
        Iterable iterable = (Iterable) r9;
        Iterator it2 = iterable.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it2.next();
                if (epx.f(((StickerRender) obj).b, e)) {
                    break;
                }
            }
        }
        StickerRender stickerRender = (StickerRender) obj;
        if (stickerRender != null) {
            VKStickerImageView vKStickerImageView5 = this.c;
            if (vKStickerImageView5 == null) {
                vKStickerImageView5 = null;
            }
            vKStickerImageView5.W0(stickerRender, g);
        }
        VKStickerImageView vKStickerImageView6 = this.d;
        if (vKStickerImageView6 == null) {
            vKStickerImageView6 = null;
        }
        VKStickerImageView vKStickerImageView7 = this.e;
        if (vKStickerImageView7 == null) {
            vKStickerImageView7 = null;
        }
        VKStickerImageView vKStickerImageView8 = this.f;
        if (vKStickerImageView8 == null) {
            vKStickerImageView8 = null;
        }
        Iterator it3 = e43.a(vKStickerImageView6, vKStickerImageView7, vKStickerImageView8).iterator();
        int i = 0;
        while (it3.hasNext()) {
            Object next = it3.next();
            int i2 = i + 1;
            if (i < 0) {
                ?? r16 = schemeStat$EventItem2;
                e43.t();
                throw r16;
            }
            VKStickerImageView vKStickerImageView9 = (VKStickerImageView) next;
            Iterator it4 = iterable.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    schemeStat$EventItem = schemeStat$EventItem2;
                    obj2 = schemeStat$EventItem;
                    break;
                } else {
                    obj2 = it4.next();
                    schemeStat$EventItem = schemeStat$EventItem2;
                    if (epx.f(((StickerRender) obj2).b, list.get(i))) {
                        break;
                    } else {
                        schemeStat$EventItem2 = schemeStat$EventItem;
                    }
                }
            }
            StickerRender stickerRender2 = (StickerRender) obj2;
            if (stickerRender2 != null) {
                vKStickerImageView9.W0(stickerRender2, h);
            }
            i = i2;
            schemeStat$EventItem2 = schemeStat$EventItem;
        }
        SchemeStat$EventItem schemeStat$EventItem3 = schemeStat$EventItem2;
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.buy);
        textView.setText(context.getString(R.string.vmoji_character_try_title, vmojiProductModel.c));
        VKStickerImageView vKStickerImageView10 = this.c;
        ?? r4 = vKStickerImageView10;
        if (vKStickerImageView10 == null) {
            r4 = schemeStat$EventItem3;
        }
        r4.setPaintFilterBitmap(true);
        jjc.g(textView2, new zu1(izsVar, vmojiProductModel, this, 4));
        p8w0.d(textView2, vmojiProductModel.h);
        this.b = new dw20.b(context, new tzp0.c(schemeStat$EventItem3, false)).D0(viewGroup, false).a0(new dvk0(this, context)).I0(msp0.class.getName());
        if (context instanceof ey50) {
            ((ey50) context).Y().S(this);
        }
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        dw20 dw20Var = this.b;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
    }

    @Override // xsna.fcn
    public final void dismiss() {
        b(false);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }
}
