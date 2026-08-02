package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import com.yandex.delivery.attrbutedtext.api.c;
import com.yandex.delivery.attrbutedtext.api.d;
import com.yandex.delivery.attrbutedtext.api.e;
import com.yandex.delivery.attrbutedtext.api.g;
import com.yandex.delivery.attrbutedtext.api.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.ATContainerDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.ATImagePropertyDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.ATLinkPropertyDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.ATTextPropertyDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.ATUnitDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AnyTextDecorationDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.TextDecorationLineThroughDto;
import ru.yandex.taxi.logistics.sdk.ui.theme.fonts.TextMetaStyle;

/* loaded from: classes.dex */
public final class gd3 {
    public static b8s a(AnyTextDecorationDto anyTextDecorationDto) {
        FormattedText.LineThroughStyle lineThroughStyle;
        if (!(anyTextDecorationDto instanceof AnyTextDecorationDto.AnyTextDecoration_LineThroughDto)) {
            if (anyTextDecorationDto instanceof AnyTextDecorationDto.AnyTextDecoration_UnderlineDto) {
                return z7s.a;
            }
            if (anyTextDecorationDto instanceof AnyTextDecorationDto.Unknown_AnyTextDecorationDto) {
                return a8s.a;
            }
            w511.b();
            return null;
        }
        TextDecorationLineThroughDto textDecorationLineThroughDto = ((AnyTextDecorationDto.AnyTextDecoration_LineThroughDto) anyTextDecorationDto).b;
        int i = fd3.b[textDecorationLineThroughDto.getStyle().ordinal()];
        if (i == 1) {
            lineThroughStyle = FormattedText.LineThroughStyle.DIAGONALLY;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            lineThroughStyle = FormattedText.LineThroughStyle.DEFAULT;
        }
        String color = textDecorationLineThroughDto.getColor();
        if (color == null) {
            color = "";
        }
        return new c(lineThroughStyle, color);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    public static FormattedText b(AttributedTextDto attributedTextDto) {
        i8s i8sVar;
        Iterator it;
        i8s dVar;
        Iterator it2;
        Iterator it3;
        i8s i8sVar2;
        FormattedText.VerticalAlignment verticalAlignment;
        FormattedText.FontStyle fontStyle;
        ArrayList arrayList;
        FormattedText.FontStyle fontStyle2;
        TextMetaStyle textMetaStyle;
        ArrayList arrayList2;
        FormattedText.VerticalAlignment verticalAlignment2;
        FormattedText.FontStyle fontStyle3;
        FormattedText.FontStyle fontStyle4;
        List<ATUnitDto> items = attributedTextDto.getItems();
        int i = 10;
        ArrayList arrayList3 = new ArrayList(tcc.n(items, 10));
        Iterator it4 = items.iterator();
        while (it4.hasNext()) {
            ATUnitDto aTUnitDto = (ATUnitDto) it4.next();
            boolean z = aTUnitDto instanceof ATUnitDto.ATUnit_TextDto;
            ?? r6 = EmptyList.a;
            if (z) {
                ATTextPropertyDto aTTextPropertyDto = ((ATUnitDto.ATUnit_TextDto) aTUnitDto).b;
                String text = aTTextPropertyDto.getText();
                ATTextPropertyDto.FontStyleDto fontStyle5 = aTTextPropertyDto.getFontStyle();
                if (fontStyle5 == null || (fontStyle4 = c(fontStyle5)) == null) {
                    fontStyle4 = FormattedText.FontStyle.NORMAL;
                }
                FormattedText.FontStyle fontStyle6 = fontStyle4;
                ATTextPropertyDto.FontWeightDto fontWeight = aTTextPropertyDto.getFontWeight();
                FormattedText.FontWeight d = fontWeight != null ? d(fontWeight) : null;
                Integer fontSize = aTTextPropertyDto.getFontSize();
                List f = f(aTTextPropertyDto.getTextDecoration());
                List<AnyTextDecorationDto> detailedTextDecoration = aTTextPropertyDto.getDetailedTextDecoration();
                if (detailedTextDecoration != null) {
                    List<AnyTextDecorationDto> list = detailedTextDecoration;
                    r6 = new ArrayList(tcc.n(list, i));
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        r6.add(a((AnyTextDecorationDto) it5.next()));
                    }
                }
                List list2 = r6;
                String color = aTTextPropertyDto.getColor();
                String str = color == null ? "" : color;
                String metaColor = aTTextPropertyDto.getMetaColor();
                ATTextPropertyDto.MetaStyleDto metaStyle = aTTextPropertyDto.getMetaStyle();
                dVar = new h(text, fontStyle6, d, fontSize, f, list2, str, metaColor, metaStyle != null ? e(metaStyle) : null, HProv.ALG_TYPE_BLOCK);
                it = it4;
            } else if (aTUnitDto instanceof ATUnitDto.ATUnit_LinkDto) {
                ATLinkPropertyDto aTLinkPropertyDto = ((ATUnitDto.ATUnit_LinkDto) aTUnitDto).b;
                String link = aTLinkPropertyDto.getLink();
                ATTextPropertyDto text2 = aTLinkPropertyDto.getText();
                String text3 = text2.getText();
                ATTextPropertyDto.FontStyleDto fontStyle7 = text2.getFontStyle();
                if (fontStyle7 == null || (fontStyle3 = c(fontStyle7)) == null) {
                    fontStyle3 = FormattedText.FontStyle.NORMAL;
                }
                FormattedText.FontStyle fontStyle8 = fontStyle3;
                ATTextPropertyDto.FontWeightDto fontWeight2 = text2.getFontWeight();
                FormattedText.FontWeight d2 = fontWeight2 != null ? d(fontWeight2) : null;
                Integer fontSize2 = text2.getFontSize();
                List f2 = f(text2.getTextDecoration());
                List<AnyTextDecorationDto> detailedTextDecoration2 = text2.getDetailedTextDecoration();
                if (detailedTextDecoration2 != null) {
                    List<AnyTextDecorationDto> list3 = detailedTextDecoration2;
                    r6 = new ArrayList(tcc.n(list3, i));
                    Iterator it6 = list3.iterator();
                    while (it6.hasNext()) {
                        r6.add(a((AnyTextDecorationDto) it6.next()));
                    }
                }
                List list4 = r6;
                String color2 = text2.getColor();
                String str2 = color2 == null ? "" : color2;
                String metaColor2 = text2.getMetaColor();
                ATTextPropertyDto.MetaStyleDto metaStyle2 = text2.getMetaStyle();
                it = it4;
                dVar = new g(link, new h(text3, fontStyle8, d2, fontSize2, f2, list4, str2, metaColor2, metaStyle2 != null ? e(metaStyle2) : null, HProv.ALG_TYPE_BLOCK));
            } else {
                if (aTUnitDto instanceof ATUnitDto.ATUnit_ImageDto) {
                    ATImagePropertyDto aTImagePropertyDto = ((ATUnitDto.ATUnit_ImageDto) aTUnitDto).b;
                    String imageTag = aTImagePropertyDto.getImageTag();
                    ATImagePropertyDto.VerticalAlignmentDto verticalAlignment3 = aTImagePropertyDto.getVerticalAlignment();
                    if (verticalAlignment3 == null || (verticalAlignment2 = g(verticalAlignment3)) == null) {
                        verticalAlignment2 = FormattedText.VerticalAlignment.BASELINE;
                    }
                    FormattedText.VerticalAlignment verticalAlignment4 = verticalAlignment2;
                    Double baselineOffset = aTImagePropertyDto.getBaselineOffset();
                    Float valueOf = baselineOffset != null ? Float.valueOf((float) baselineOffset.doubleValue()) : null;
                    String color3 = aTImagePropertyDto.getColor();
                    String str3 = color3 == null ? "" : color3;
                    Integer width = aTImagePropertyDto.getWidth();
                    int intValue = width != null ? width.intValue() : 0;
                    Integer height = aTImagePropertyDto.getHeight();
                    i8sVar = new e(imageTag, verticalAlignment4, str3, intValue, height != null ? height.intValue() : 0, valueOf, 64);
                    it = it4;
                } else {
                    boolean z2 = aTUnitDto instanceof ATUnitDto.ATUnit_ContainerDto;
                    i8sVar = g8s.a;
                    if (z2) {
                        ATContainerDto aTContainerDto = ((ATUnitDto.ATUnit_ContainerDto) aTUnitDto).b;
                        FormattedText.a aVar = new FormattedText.a(aTContainerDto.getGroupAttributes().getMetaColor());
                        List<ATContainerDto.ItemsDto> items2 = aTContainerDto.getItems();
                        ArrayList arrayList4 = new ArrayList(tcc.n(items2, i));
                        Iterator it7 = items2.iterator();
                        while (it7.hasNext()) {
                            ATContainerDto.ItemsDto itemsDto = (ATContainerDto.ItemsDto) it7.next();
                            if (itemsDto instanceof ATContainerDto.ItemsDto.Items_TextDto) {
                                ATTextPropertyDto aTTextPropertyDto2 = ((ATContainerDto.ItemsDto.Items_TextDto) itemsDto).b;
                                String text4 = aTTextPropertyDto2.getText();
                                ATTextPropertyDto.FontStyleDto fontStyle9 = aTTextPropertyDto2.getFontStyle();
                                if (fontStyle9 == null || (fontStyle2 = c(fontStyle9)) == null) {
                                    fontStyle2 = FormattedText.FontStyle.NORMAL;
                                }
                                FormattedText.FontStyle fontStyle10 = fontStyle2;
                                ATTextPropertyDto.FontWeightDto fontWeight3 = aTTextPropertyDto2.getFontWeight();
                                FormattedText.FontWeight d3 = fontWeight3 != null ? d(fontWeight3) : null;
                                Integer fontSize3 = aTTextPropertyDto2.getFontSize();
                                List f3 = f(aTTextPropertyDto2.getTextDecoration());
                                List<AnyTextDecorationDto> detailedTextDecoration3 = aTTextPropertyDto2.getDetailedTextDecoration();
                                if (detailedTextDecoration3 != null) {
                                    List<AnyTextDecorationDto> list5 = detailedTextDecoration3;
                                    textMetaStyle = null;
                                    ArrayList arrayList5 = new ArrayList(tcc.n(list5, i));
                                    Iterator it8 = list5.iterator();
                                    while (it8.hasNext()) {
                                        arrayList5.add(a((AnyTextDecorationDto) it8.next()));
                                    }
                                    arrayList2 = arrayList5;
                                } else {
                                    textMetaStyle = null;
                                    arrayList2 = r6;
                                }
                                String color4 = aTTextPropertyDto2.getColor();
                                String str4 = color4 == null ? "" : color4;
                                String metaColor3 = aTTextPropertyDto2.getMetaColor();
                                ATTextPropertyDto.MetaStyleDto metaStyle3 = aTTextPropertyDto2.getMetaStyle();
                                i8sVar2 = new h(text4, fontStyle10, d3, fontSize3, f3, arrayList2, str4, metaColor3, metaStyle3 != null ? e(metaStyle3) : textMetaStyle, HProv.ALG_TYPE_BLOCK);
                                it2 = it4;
                                it3 = it7;
                            } else if (itemsDto instanceof ATContainerDto.ItemsDto.Items_LinkDto) {
                                ATLinkPropertyDto aTLinkPropertyDto2 = ((ATContainerDto.ItemsDto.Items_LinkDto) itemsDto).b;
                                String link2 = aTLinkPropertyDto2.getLink();
                                ATTextPropertyDto text5 = aTLinkPropertyDto2.getText();
                                String text6 = text5.getText();
                                ATTextPropertyDto.FontStyleDto fontStyle11 = text5.getFontStyle();
                                if (fontStyle11 == null || (fontStyle = c(fontStyle11)) == null) {
                                    fontStyle = FormattedText.FontStyle.NORMAL;
                                }
                                FormattedText.FontStyle fontStyle12 = fontStyle;
                                ATTextPropertyDto.FontWeightDto fontWeight4 = text5.getFontWeight();
                                FormattedText.FontWeight d4 = fontWeight4 != null ? d(fontWeight4) : null;
                                Integer fontSize4 = text5.getFontSize();
                                List f4 = f(text5.getTextDecoration());
                                List<AnyTextDecorationDto> detailedTextDecoration4 = text5.getDetailedTextDecoration();
                                if (detailedTextDecoration4 != null) {
                                    List<AnyTextDecorationDto> list6 = detailedTextDecoration4;
                                    it2 = it4;
                                    it3 = it7;
                                    ArrayList arrayList6 = new ArrayList(tcc.n(list6, i));
                                    Iterator it9 = list6.iterator();
                                    while (it9.hasNext()) {
                                        arrayList6.add(a((AnyTextDecorationDto) it9.next()));
                                    }
                                    arrayList = arrayList6;
                                } else {
                                    it2 = it4;
                                    it3 = it7;
                                    arrayList = r6;
                                }
                                String color5 = text5.getColor();
                                String str5 = color5 == null ? "" : color5;
                                String metaColor4 = text5.getMetaColor();
                                ATTextPropertyDto.MetaStyleDto metaStyle4 = text5.getMetaStyle();
                                i8sVar2 = new g(link2, new h(text6, fontStyle12, d4, fontSize4, f4, arrayList, str5, metaColor4, metaStyle4 != null ? e(metaStyle4) : null, HProv.ALG_TYPE_BLOCK));
                            } else {
                                it2 = it4;
                                it3 = it7;
                                if (itemsDto instanceof ATContainerDto.ItemsDto.Items_ImageDto) {
                                    ATImagePropertyDto aTImagePropertyDto2 = ((ATContainerDto.ItemsDto.Items_ImageDto) itemsDto).b;
                                    String imageTag2 = aTImagePropertyDto2.getImageTag();
                                    ATImagePropertyDto.VerticalAlignmentDto verticalAlignment5 = aTImagePropertyDto2.getVerticalAlignment();
                                    if (verticalAlignment5 == null || (verticalAlignment = g(verticalAlignment5)) == null) {
                                        verticalAlignment = FormattedText.VerticalAlignment.BASELINE;
                                    }
                                    FormattedText.VerticalAlignment verticalAlignment6 = verticalAlignment;
                                    String color6 = aTImagePropertyDto2.getColor();
                                    String str6 = color6 == null ? "" : color6;
                                    Integer width2 = aTImagePropertyDto2.getWidth();
                                    int intValue2 = width2 != null ? width2.intValue() : 0;
                                    Integer height2 = aTImagePropertyDto2.getHeight();
                                    int intValue3 = height2 != null ? height2.intValue() : 0;
                                    Double baselineOffset2 = aTImagePropertyDto2.getBaselineOffset();
                                    i8sVar2 = new e(imageTag2, verticalAlignment6, str6, intValue2, intValue3, baselineOffset2 != null ? Float.valueOf((float) baselineOffset2.doubleValue()) : null, 64);
                                } else {
                                    if (!(itemsDto instanceof ATContainerDto.ItemsDto.Unknown_ItemsDto)) {
                                        w511.b();
                                        return null;
                                    }
                                    i8sVar2 = i8sVar;
                                }
                            }
                            arrayList4.add(i8sVar2);
                            it4 = it2;
                            it7 = it3;
                            i = 10;
                        }
                        it = it4;
                        dVar = new d(aVar, arrayList4);
                    } else {
                        it = it4;
                        if (!(aTUnitDto instanceof ATUnitDto.Unknown_ATUnitDto)) {
                            w511.b();
                            return null;
                        }
                    }
                }
                dVar = i8sVar;
            }
            arrayList3.add(dVar);
            it4 = it;
            i = 10;
        }
        return new FormattedText(arrayList3);
    }

    public static FormattedText.FontStyle c(ATTextPropertyDto.FontStyleDto fontStyleDto) {
        int i = fd3.d[fontStyleDto.ordinal()];
        if (i == 1) {
            return FormattedText.FontStyle.NORMAL;
        }
        if (i == 2) {
            return FormattedText.FontStyle.ITALIC;
        }
        w511.b();
        return null;
    }

    public static FormattedText.FontWeight d(ATTextPropertyDto.FontWeightDto fontWeightDto) {
        int i = fd3.c[fontWeightDto.ordinal()];
        if (i == 1) {
            return FormattedText.FontWeight.BOLD;
        }
        if (i == 2) {
            return FormattedText.FontWeight.LIGHT;
        }
        if (i == 3) {
            return FormattedText.FontWeight.MEDIUM;
        }
        if (i == 4) {
            return FormattedText.FontWeight.REGULAR;
        }
        if (i == 5) {
            return FormattedText.FontWeight.HEAVY;
        }
        w511.b();
        return null;
    }

    public static TextMetaStyle e(ATTextPropertyDto.MetaStyleDto metaStyleDto) {
        int i = fd3.g[metaStyleDto.ordinal()];
        if (i == 1) {
            return TextMetaStyle.HeadlineTitle1;
        }
        if (i == 2) {
            return TextMetaStyle.HeadlineTitle2;
        }
        if (i == 3) {
            return TextMetaStyle.HeadlineTitle3;
        }
        if (i == 4) {
            return TextMetaStyle.HeadlineTitle4;
        }
        if (i != 5) {
            return null;
        }
        return TextMetaStyle.HeadlineTitle5;
    }

    public static List f(List list) {
        FormattedText.TextDecoration textDecoration;
        if (list == null) {
            return EmptyList.a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int i = fd3.e[((ATTextPropertyDto.TextDecorationDto) it.next()).ordinal()];
            if (i == 1) {
                textDecoration = FormattedText.TextDecoration.UNDERLINE;
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                textDecoration = FormattedText.TextDecoration.LINE_THROUGH;
            }
            arrayList.add(textDecoration);
        }
        return arrayList;
    }

    public static FormattedText.VerticalAlignment g(ATImagePropertyDto.VerticalAlignmentDto verticalAlignmentDto) {
        int i = fd3.f[verticalAlignmentDto.ordinal()];
        if (i == 1) {
            return FormattedText.VerticalAlignment.BOTTOM;
        }
        if (i == 2) {
            return FormattedText.VerticalAlignment.CENTER;
        }
        if (i == 3) {
            return FormattedText.VerticalAlignment.BASELINE;
        }
        w511.b();
        return null;
    }
}
