package xsna;

import android.content.res.Resources;
import com.vk.attachpicker.stat.data.GraffityParamsEntity;
import com.vk.attachpicker.stat.data.PhotoParamsEntity;
import com.vk.attachpicker.stat.data.StickerParamsEntity;
import com.vk.attachpicker.stat.data.TextParamsEntity;
import com.vk.attachpicker.stat.models.VkStickerMeta;
import com.vk.photo.editor.features.crop.models.stat.CropStatEvent;
import com.vk.photo.editor.features.markup.draw.model.stat.DrawStatEvent;
import com.vk.photo.editor.features.markup.text.model.stat.TextStatEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.y8g;

/* compiled from: PhotoParamsStorage.kt */
/* loaded from: classes15.dex */
public final class naa0 {
    public final iaa0 a;
    public final r5l0 b;
    public final gko0 c;
    public final fdu d;

    public naa0(iaa0 iaa0Var, r5l0 r5l0Var, gko0 gko0Var, fdu fduVar) {
        this.a = iaa0Var;
        this.b = r5l0Var;
        this.c = gko0Var;
        this.d = fduVar;
    }

    public final paa0 a(String str) {
        VkStickerMeta.Type type;
        TextStatEvent.Align align;
        DrawStatEvent.BrushType brushType;
        oaa0 c = this.a.c(str);
        CropStatEvent.Format format = null;
        if (c == null) {
            return null;
        }
        PhotoParamsEntity photoParamsEntity = c.a;
        String str2 = photoParamsEntity.c;
        boolean z = photoParamsEntity.d;
        boolean z2 = photoParamsEntity.e;
        boolean z3 = photoParamsEntity.f;
        Integer num = photoParamsEntity.j;
        Integer num2 = photoParamsEntity.k;
        boolean z4 = photoParamsEntity.l;
        Integer num3 = photoParamsEntity.m;
        boolean z5 = photoParamsEntity.n;
        String str3 = photoParamsEntity.o;
        Integer num4 = photoParamsEntity.p;
        PhotoParamsEntity.Ratio ratio = photoParamsEntity.q;
        if (ratio != null) {
            switch (mn00.$EnumSwitchMapping$1[ratio.ordinal()]) {
                case 1:
                    format = CropStatEvent.Format.CropOriginal;
                    break;
                case 2:
                    format = CropStatEvent.Format.CropFree;
                    break;
                case 3:
                    format = CropStatEvent.Format.CropSquare;
                    break;
                case 4:
                    format = CropStatEvent.Format.Crop3X4;
                    break;
                case 5:
                    format = CropStatEvent.Format.Crop4X3;
                    break;
                case 6:
                    format = CropStatEvent.Format.Crop16X9;
                    break;
                case 7:
                    format = CropStatEvent.Format.Crop9X16;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        CropStatEvent.Format format2 = format;
        int i = Resources.getSystem().getDisplayMetrics().heightPixels;
        int i2 = Resources.getSystem().getDisplayMetrics().widthPixels;
        String str4 = photoParamsEntity.t;
        Integer num5 = photoParamsEntity.u;
        Integer num6 = photoParamsEntity.v;
        String str5 = photoParamsEntity.w;
        List<GraffityParamsEntity> list = c.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GraffityParamsEntity graffityParamsEntity = (GraffityParamsEntity) it.next();
            int i3 = graffityParamsEntity.c;
            Iterator it2 = it;
            boolean z6 = z2;
            y8g.c cVar = new y8g.c(graffityParamsEntity.d);
            int i4 = mn00.$EnumSwitchMapping$5[graffityParamsEntity.e.ordinal()];
            if (i4 == 1) {
                brushType = DrawStatEvent.BrushType.Pen;
            } else if (i4 == 2) {
                brushType = DrawStatEvent.BrushType.Arrow;
            } else if (i4 == 3) {
                brushType = DrawStatEvent.BrushType.Marker;
            } else if (i4 == 4) {
                brushType = DrawStatEvent.BrushType.Glow;
            } else {
                if (i4 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                brushType = DrawStatEvent.BrushType.Eraser;
            }
            arrayList.add(new DrawStatEvent.b(cVar, i3, brushType));
            it = it2;
            z2 = z6;
        }
        boolean z7 = z2;
        List<TextParamsEntity> list2 = c.c;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            TextParamsEntity textParamsEntity = (TextParamsEntity) it3.next();
            int i5 = mn00.$EnumSwitchMapping$7[textParamsEntity.d.ordinal()];
            Iterator it4 = it3;
            if (i5 == 1) {
                align = TextStatEvent.Align.Start;
            } else if (i5 == 2) {
                align = TextStatEvent.Align.Center;
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                align = TextStatEvent.Align.End;
            }
            TextStatEvent.Align align2 = align;
            arrayList2.add(new TextStatEvent.e(align2, textParamsEntity.e, textParamsEntity.c, textParamsEntity.f, new y8g.c(textParamsEntity.g), new y8g.c(textParamsEntity.h)));
            it3 = it4;
            arrayList = arrayList;
        }
        ArrayList arrayList3 = arrayList;
        List<StickerParamsEntity> list3 = c.d;
        ArrayList arrayList4 = new ArrayList(c5g.u(list3, 10));
        Iterator it5 = list3.iterator();
        while (it5.hasNext()) {
            StickerParamsEntity stickerParamsEntity = (StickerParamsEntity) it5.next();
            Integer num7 = stickerParamsEntity.d;
            Long l = stickerParamsEntity.e;
            switch (mn00.$EnumSwitchMapping$3[stickerParamsEntity.c.ordinal()]) {
                case 1:
                    type = VkStickerMeta.Type.Individual;
                    break;
                case 2:
                    type = VkStickerMeta.Type.FromPack;
                    break;
                case 3:
                    type = VkStickerMeta.Type.Animated;
                    break;
                case 4:
                    type = VkStickerMeta.Type.GIF;
                    break;
                case 5:
                    type = VkStickerMeta.Type.Vmoji;
                    break;
                case 6:
                    type = VkStickerMeta.Type.Emoji;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            Iterator it6 = it5;
            arrayList4.add(new VkStickerMeta(type, num7, l));
            it5 = it6;
        }
        List list4 = photoParamsEntity.x;
        if (list4 == null) {
            list4 = EmptyList.b;
        }
        List list5 = list4;
        List list6 = photoParamsEntity.y;
        if (list6 == null) {
            list6 = EmptyList.b;
        }
        return new paa0(str2, new haa0(z, z7, z3, num, num2, z4, num3, z5, str3, num4, format2, str4, num5, num6, str5, arrayList4, arrayList2, arrayList3, i, i2, list5, list6, photoParamsEntity.z, 4096));
    }

    public final void b(String str, paa0 paa0Var) {
        PhotoParamsEntity.Ratio ratio;
        GraffityParamsEntity.BrushType brushType;
        TextParamsEntity.Align align;
        StickerParamsEntity.Type type;
        StickerParamsEntity stickerParamsEntity;
        PhotoParamsEntity.Ratio ratio2;
        String str2 = paa0Var.a;
        haa0 haa0Var = paa0Var.b;
        List<TextStatEvent.e> list = haa0Var.r;
        List<f5l0> list2 = haa0Var.q;
        List<DrawStatEvent.b> list3 = haa0Var.s;
        boolean z = haa0Var.a;
        boolean z2 = haa0Var.b;
        boolean z3 = haa0Var.c;
        Integer num = haa0Var.d;
        Integer num2 = haa0Var.e;
        boolean z4 = haa0Var.f;
        Integer num3 = haa0Var.g;
        boolean z5 = haa0Var.h;
        String str3 = haa0Var.i;
        Integer num4 = haa0Var.j;
        CropStatEvent.Format format = haa0Var.k;
        if (format != null) {
            switch (mn00.$EnumSwitchMapping$0[format.ordinal()]) {
                case 1:
                    ratio2 = PhotoParamsEntity.Ratio.CropOriginal;
                    break;
                case 2:
                    ratio2 = PhotoParamsEntity.Ratio.CropFree;
                    break;
                case 3:
                    ratio2 = PhotoParamsEntity.Ratio.CropSquare;
                    break;
                case 4:
                    ratio2 = PhotoParamsEntity.Ratio.Crop3X4;
                    break;
                case 5:
                    ratio2 = PhotoParamsEntity.Ratio.Crop4X3;
                    break;
                case 6:
                    ratio2 = PhotoParamsEntity.Ratio.Crop16X9;
                    break;
                case 7:
                    ratio2 = PhotoParamsEntity.Ratio.Crop9X16;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            ratio = ratio2;
        } else {
            ratio = null;
        }
        int i = haa0Var.t;
        int i2 = haa0Var.u;
        String str4 = haa0Var.l;
        Integer num5 = haa0Var.n;
        Integer num6 = haa0Var.o;
        String str5 = haa0Var.p;
        boolean z6 = !list3.isEmpty();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            List<f5l0> list4 = list2;
            String str6 = str2;
            if (obj instanceof VkStickerMeta) {
                arrayList.add(obj);
            }
            list2 = list4;
            str2 = str6;
        }
        PhotoParamsEntity photoParamsEntity = new PhotoParamsEntity(null, str, str2, z, z2, z3, z6, !arrayList.isEmpty(), !list.isEmpty(), num, num2, z4, num3, z5, str3, num4, ratio, i, i2, str4, num5, num6, str5, haa0Var.v, haa0Var.w, haa0Var.x);
        iaa0 iaa0Var = this.a;
        int b = (int) iaa0Var.b(photoParamsEntity);
        ArrayList arrayList2 = new ArrayList();
        for (f5l0 f5l0Var : list2) {
            if (f5l0Var instanceof VkStickerMeta) {
                VkStickerMeta vkStickerMeta = (VkStickerMeta) f5l0Var;
                Integer num7 = vkStickerMeta.b;
                Long l = vkStickerMeta.c;
                switch (mn00.$EnumSwitchMapping$2[vkStickerMeta.a.ordinal()]) {
                    case 1:
                        type = StickerParamsEntity.Type.Individual;
                        break;
                    case 2:
                        type = StickerParamsEntity.Type.FromPack;
                        break;
                    case 3:
                        type = StickerParamsEntity.Type.Animated;
                        break;
                    case 4:
                        type = StickerParamsEntity.Type.GIF;
                        break;
                    case 5:
                        type = StickerParamsEntity.Type.Vimoji;
                        break;
                    case 6:
                        type = StickerParamsEntity.Type.Emoji;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                stickerParamsEntity = new StickerParamsEntity(null, b, type, num7, l);
            } else {
                stickerParamsEntity = null;
            }
            if (stickerParamsEntity != null) {
                arrayList2.add(stickerParamsEntity);
            }
        }
        this.b.a(arrayList2);
        List<TextStatEvent.e> list5 = list;
        ArrayList arrayList3 = new ArrayList(c5g.u(list5, 10));
        for (TextStatEvent.e eVar : list5) {
            int i3 = mn00.$EnumSwitchMapping$6[eVar.a.ordinal()];
            if (i3 == 1) {
                align = TextParamsEntity.Align.Start;
            } else if (i3 == 2) {
                align = TextParamsEntity.Align.Center;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                align = TextParamsEntity.Align.End;
            }
            arrayList3.add(new TextParamsEntity(null, b, eVar.c, align, eVar.b, eVar.d, eVar.e.a(), eVar.f.a()));
        }
        this.c.a(arrayList3);
        List<DrawStatEvent.b> list6 = list3;
        ArrayList arrayList4 = new ArrayList(c5g.u(list6, 10));
        for (DrawStatEvent.b bVar : list6) {
            int i4 = bVar.b;
            int i5 = bVar.a.b;
            int i6 = mn00.$EnumSwitchMapping$4[bVar.c.ordinal()];
            if (i6 == 1) {
                brushType = GraffityParamsEntity.BrushType.Pen;
            } else if (i6 == 2) {
                brushType = GraffityParamsEntity.BrushType.Arrow;
            } else if (i6 == 3) {
                brushType = GraffityParamsEntity.BrushType.Marker;
            } else if (i6 == 4) {
                brushType = GraffityParamsEntity.BrushType.Glow;
            } else {
                if (i6 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                brushType = GraffityParamsEntity.BrushType.Eraser;
            }
            arrayList4.add(new GraffityParamsEntity(null, b, i4, i5, brushType));
        }
        this.d.a(arrayList4);
        iaa0Var.a();
    }
}
