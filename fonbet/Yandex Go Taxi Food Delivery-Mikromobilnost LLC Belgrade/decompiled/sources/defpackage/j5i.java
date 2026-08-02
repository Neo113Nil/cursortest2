package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import com.yandex.delivery.mapper.model.Font;
import com.yandex.delivery.mapper.model.LocalIconName;
import com.yandex.delivery.mapper.model.PartialProgressBarStyleSidesModel;
import ru.yandex.taxi.logistics.sdk.dashboard.model.common.HorizontalAlignmentModel;
import ru.yandex.taxi.logistics.sdk.dashboard.model.common.ImagePositionModel;
import ru.yandex.taxi.logistics.sdk.dashboard.model.common.TextFormat;
import ru.yandex.taxi.logistics.sdk.dashboard.model.common.TileStyle;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.BackgroundDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.IconDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.LocalIconDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.PaddingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.PartialProgressBarStyleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ProgressBarDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ProgressBarStyleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.RemoteIconDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.BadgeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.BorderDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.ButtonStyleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.ButtonTileFooterDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.CornerBadgeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.HorizontalAlignmentDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.IconButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.MiddleElementDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.ProgressTileFooterDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.PromoTileFooterDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.QuantityGraphColorsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.QuantityGraphTileFooterDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.StyledTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.TariffTileFooterDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.TextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.TextStyleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.TileAttributedHeaderDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.TileDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.TileFooterDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.TileHeaderDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.ToggleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.TrailButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.TrailElementDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.a;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.b;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.c;
import ru.yandex.taxi.logistics.sdk.ui_models.badge.dashboard.BadgeAnchor;

/* loaded from: classes5.dex */
public final class j5i {
    public final m4v a;
    public final jhg b;
    public final vdc c;
    public final bh4 d;
    public final tj20 e;
    public final gd3 f;
    public final whf0 g;

    public j5i(m4v m4vVar, jhg jhgVar, vdc vdcVar, bh4 bh4Var, tj20 tj20Var, gd3 gd3Var, whf0 whf0Var) {
        this.a = m4vVar;
        this.b = jhgVar;
        this.c = vdcVar;
        this.d = bh4Var;
        this.e = tj20Var;
        this.f = gd3Var;
        this.g = whf0Var;
    }

    public static qqn a(MiddleElementDto middleElementDto) {
        if (middleElementDto instanceof MiddleElementDto.MiddleElement_LocalIconDto) {
            LocalIconDto localIconDto = ((MiddleElementDto.MiddleElement_LocalIconDto) middleElementDto).b;
            String name = localIconDto.getName();
            LocalIconName.Companion.getClass();
            return new h3z(i3z.a(name), localIconDto.getAccessibilityLabel(), localIconDto.getMonochrome());
        }
        if (middleElementDto instanceof MiddleElementDto.MiddleElement_RemoteIconDto) {
            RemoteIconDto remoteIconDto = ((MiddleElementDto.MiddleElement_RemoteIconDto) middleElementDto).b;
            return new mvi0(remoteIconDto.getTagDay(), remoteIconDto.getTagNight(), remoteIconDto.getUrl(), remoteIconDto.getAccessibilityLabel(), remoteIconDto.getMonochrome(), 8);
        }
        if (!(middleElementDto instanceof MiddleElementDto.MiddleElement_TextDto)) {
            if (middleElementDto instanceof MiddleElementDto.Unknown_MiddleElementDto) {
                return null;
            }
            w511.b();
            return null;
        }
        TextDto textDto = ((MiddleElementDto.MiddleElement_TextDto) middleElementDto).b;
        String content = textDto.getContent();
        Font d = d(textDto.getTextStyle());
        Integer fontSize = textDto.getFontSize();
        return new rry0(content, d, fontSize != null ? fontSize.intValue() : 24, 8);
    }

    public static Font d(TextStyleDto textStyleDto) {
        switch (i5i.b[textStyleDto.ordinal()]) {
            case 1:
                return Font.BOLD;
            case 2:
                return Font.BOLD_ITALIC;
            case 3:
                return Font.LIGHT;
            case 4:
                return Font.LIGHT_ITALIC;
            case 5:
                return Font.REGULAR;
            case 6:
                return Font.REGULAR_ITALIC;
            case 7:
                return Font.MEDIUM;
            case 8:
                return Font.MEDIUM_ITALIC;
            case 9:
                return Font.LOGOTYPE_REGULAR;
            case 10:
                return Font.HEADER;
            case 11:
                return Font.HEADER_ITALIC;
            default:
                w511.b();
                return null;
        }
    }

    public final rry0 b(StyledTextDto styledTextDto) {
        qfc qfcVar;
        String content = styledTextDto.getContent();
        Font d = d(styledTextDto.getTextStyle());
        int fontSize = styledTextDto.getFontSize();
        ColorDto textColor = styledTextDto.getTextColor();
        if (textColor != null) {
            this.c.getClass();
            qfcVar = vdc.a(textColor);
        } else {
            qfcVar = null;
        }
        return new rry0(content, d, fontSize, qfcVar);
    }

    public final y4z0 c(TileDto tileDto) {
        yau yauVar;
        yau yauVar2;
        s4z0 s4z0Var;
        int i;
        z3b1 z3b1Var;
        ImagePositionModel imagePositionModel;
        z3b1 z3b1Var2;
        qfc qfcVar;
        qfc qfcVar2;
        BadgeAnchor badgeAnchor;
        FormattedText formattedText;
        eif0 eif0Var;
        FormattedText formattedText2;
        o690 o690Var;
        bif0 bif0Var;
        o37 o37Var;
        s4z0 r37Var;
        qfc qfcVar3;
        qfc qfcVar4;
        qfc qfcVar5;
        qfc qfcVar6;
        ColorDto graphColorAccent;
        ColorDto graphColor;
        ColorDto captionColor;
        ColorDto quantityColor;
        qfc qfcVar7;
        HorizontalAlignmentModel horizontalAlignmentModel;
        yau yauVar3;
        qfc qfcVar8;
        qfc qfcVar9;
        TileDto.HeaderDto header = tileDto.getHeader();
        gd3 gd3Var = this.f;
        vdc vdcVar = this.c;
        if (header != null) {
            if (header instanceof a) {
                TileHeaderDto tileHeaderDto = ((a) header).a;
                String title = tileHeaderDto.getTitle();
                String subtitle = tileHeaderDto.getSubtitle();
                ColorDto titleColor = tileHeaderDto.getTitleColor();
                if (titleColor != null) {
                    vdcVar.getClass();
                    qfcVar8 = vdc.a(titleColor);
                } else {
                    qfcVar8 = null;
                }
                ColorDto subtitleColor = tileHeaderDto.getSubtitleColor();
                if (subtitleColor != null) {
                    vdcVar.getClass();
                    qfcVar9 = vdc.a(subtitleColor);
                } else {
                    qfcVar9 = null;
                }
                TileHeaderDto.TextFormatDto textFormat = tileHeaderDto.getTextFormat();
                yauVar3 = new v4z0(title, subtitle, qfcVar8, qfcVar9, (textFormat == null ? -1 : i5i.h[textFormat.ordinal()]) == 1 ? TextFormat.MARKDOWN : TextFormat.PLAIN_TEXT);
            } else if (header instanceof b) {
                TileAttributedHeaderDto tileAttributedHeaderDto = ((b) header).a;
                AttributedTextDto title2 = tileAttributedHeaderDto.getTitle();
                gd3Var.getClass();
                FormattedText b = gd3.b(title2);
                AttributedTextDto subtitle2 = tileAttributedHeaderDto.getSubtitle();
                FormattedText b2 = subtitle2 != null ? gd3.b(subtitle2) : null;
                AttributedTextDto trailTitle = tileAttributedHeaderDto.getTrailTitle();
                yauVar3 = new m4z0(b, b2, trailTitle != null ? gd3.b(trailTitle) : null);
            } else {
                if (!header.equals(c.a)) {
                    w511.b();
                    return null;
                }
                yauVar3 = l121.a;
            }
            yauVar = yauVar3;
        } else {
            yauVar = null;
        }
        TileFooterDto footer = tileDto.getFooter();
        jhg jhgVar = this.b;
        m4v m4vVar = this.a;
        if (footer == null) {
            yauVar2 = yauVar;
            s4z0Var = null;
        } else if (footer instanceof TileFooterDto.TileFooter_OptionTileFooterDto) {
            s4z0Var = new df70(m4vVar.a(((TileFooterDto.TileFooter_OptionTileFooterDto) footer).b.getOptionIcon()));
            yauVar2 = yauVar;
        } else if (footer instanceof TileFooterDto.TileFooter_PromoTileFooterDto) {
            PromoTileFooterDto promoTileFooterDto = ((TileFooterDto.TileFooter_PromoTileFooterDto) footer).b;
            String text = promoTileFooterDto.getText();
            ColorDto textColor = promoTileFooterDto.getTextColor();
            if (textColor != null) {
                vdcVar.getClass();
                qfcVar7 = vdc.a(textColor);
            } else {
                qfcVar7 = null;
            }
            HorizontalAlignmentDto horizontalAlignment = promoTileFooterDto.getHorizontalAlignment();
            if (horizontalAlignment != null) {
                int i2 = i5i.e[horizontalAlignment.ordinal()];
                if (i2 == 1) {
                    horizontalAlignmentModel = HorizontalAlignmentModel.BEGIN;
                } else if (i2 == 2) {
                    horizontalAlignmentModel = HorizontalAlignmentModel.CENTER;
                } else {
                    if (i2 != 3) {
                        w511.b();
                        return null;
                    }
                    horizontalAlignmentModel = HorizontalAlignmentModel.END;
                }
            } else {
                horizontalAlignmentModel = null;
            }
            yauVar2 = yauVar;
            s4z0Var = new jqf0(text, qfcVar7, horizontalAlignmentModel, Boolean.valueOf(promoTileFooterDto.getLocked()));
        } else if (footer instanceof TileFooterDto.TileFooter_QuantityGraphTileFooterDto) {
            QuantityGraphTileFooterDto quantityGraphTileFooterDto = ((TileFooterDto.TileFooter_QuantityGraphTileFooterDto) footer).b;
            String quantity = quantityGraphTileFooterDto.getTotal().getQuantity();
            String caption = quantityGraphTileFooterDto.getTotal().getCaption();
            String quantity2 = quantityGraphTileFooterDto.getPart().getQuantity();
            String caption2 = quantityGraphTileFooterDto.getPart().getCaption();
            yauVar2 = yauVar;
            float ratio = (float) quantityGraphTileFooterDto.getRatio();
            QuantityGraphColorsDto colors = quantityGraphTileFooterDto.getColors();
            if (colors == null || (quantityColor = colors.getQuantityColor()) == null) {
                qfcVar3 = null;
            } else {
                vdcVar.getClass();
                qfcVar3 = vdc.a(quantityColor);
            }
            QuantityGraphColorsDto colors2 = quantityGraphTileFooterDto.getColors();
            if (colors2 == null || (captionColor = colors2.getCaptionColor()) == null) {
                qfcVar4 = null;
            } else {
                vdcVar.getClass();
                qfcVar4 = vdc.a(captionColor);
            }
            QuantityGraphColorsDto colors3 = quantityGraphTileFooterDto.getColors();
            if (colors3 == null || (graphColor = colors3.getGraphColor()) == null) {
                qfcVar5 = null;
            } else {
                vdcVar.getClass();
                qfcVar5 = vdc.a(graphColor);
            }
            QuantityGraphColorsDto colors4 = quantityGraphTileFooterDto.getColors();
            if (colors4 == null || (graphColorAccent = colors4.getGraphColorAccent()) == null) {
                qfcVar6 = null;
            } else {
                vdcVar.getClass();
                qfcVar6 = vdc.a(graphColorAccent);
            }
            s4z0Var = new tgg0(quantity, caption, quantity2, caption2, ratio, qfcVar3, qfcVar4, qfcVar5, qfcVar6);
        } else {
            yauVar2 = yauVar;
            if (footer instanceof TileFooterDto.TileFooter_TariffTileFooterDto) {
                TariffTileFooterDto tariffTileFooterDto = ((TileFooterDto.TileFooter_TariffTileFooterDto) footer).b;
                w4v a = m4vVar.a(tariffTileFooterDto.getTariffIcon());
                IconDto optionIcon = tariffTileFooterDto.getOptionIcon();
                r37Var = new mox0(a, optionIcon != null ? m4vVar.a(optionIcon) : null);
            } else if (footer instanceof TileFooterDto.TileFooter_AttributedTextTileFooterDto) {
                AttributedTextDto title3 = ((TileFooterDto.TileFooter_AttributedTextTileFooterDto) footer).b.getTitle();
                gd3Var.getClass();
                r37Var = new jd3(gd3.b(title3));
            } else if (footer instanceof TileFooterDto.TileFooter_ButtonTileFooterDto) {
                ButtonTileFooterDto buttonTileFooterDto = ((TileFooterDto.TileFooter_ButtonTileFooterDto) footer).b;
                AttributedTextDto title4 = buttonTileFooterDto.getTitle();
                gd3Var.getClass();
                FormattedText b3 = gd3.b(title4);
                ButtonStyleDto style = buttonTileFooterDto.getStyle();
                if (style != null) {
                    String backgroundColor = style.getBackgroundColor();
                    int cornerRadius = style.getCornerRadius();
                    BorderDto border = style.getBorder();
                    o37Var = new o37(backgroundColor, cornerRadius, border != null ? new qa6(border.getColor(), border.getWidth()) : null);
                } else {
                    o37Var = null;
                }
                r37Var = new r37(b3, jhgVar.a(buttonTileFooterDto.getAction()), o37Var, buttonTileFooterDto.getMetricaLabel());
            } else if (footer instanceof TileFooterDto.TileFooter_ProgressTileFooterDto) {
                ProgressTileFooterDto progressTileFooterDto = ((TileFooterDto.TileFooter_ProgressTileFooterDto) footer).b;
                AttributedTextDto text2 = progressTileFooterDto.getText();
                if (text2 != null) {
                    gd3Var.getClass();
                    formattedText = gd3.b(text2);
                } else {
                    formattedText = null;
                }
                ProgressBarDto progressBar = progressTileFooterDto.getProgressBar();
                whf0 whf0Var = this.g;
                whf0Var.getClass();
                ProgressBarStyleDto progressBarStyle = progressBar.getProgressBarStyle();
                if (progressBarStyle instanceof ProgressBarStyleDto.Unknown_ProgressBarStyleDto) {
                    eif0Var = null;
                } else {
                    if (!(progressBarStyle instanceof ProgressBarStyleDto.ProgressBarStyle_PartialDto)) {
                        w511.b();
                        return null;
                    }
                    PartialProgressBarStyleDto partialProgressBarStyleDto = ((ProgressBarStyleDto.ProgressBarStyle_PartialDto) progressBarStyle).b;
                    String progressBarColor = partialProgressBarStyleDto.getProgressBarColor();
                    String progressBarFillColor = partialProgressBarStyleDto.getProgressBarFillColor();
                    int partialsCount = partialProgressBarStyleDto.getPartialsCount();
                    PartialProgressBarStyleDto.PartialsSidesStyleDto partialsSidesStyle = partialProgressBarStyleDto.getPartialsSidesStyle();
                    eif0Var = new eif0(progressBarColor, progressBarFillColor, partialsCount, (partialsSidesStyle == null ? -1 : thf0.a[partialsSidesStyle.ordinal()]) == 1 ? PartialProgressBarStyleSidesModel.SQUARE : PartialProgressBarStyleSidesModel.ROUNDED, partialProgressBarStyleDto.getSpaceBetweenPartials());
                }
                if (eif0Var == null) {
                    bif0Var = null;
                } else {
                    PaddingsDto paddings = progressBar.getPaddings();
                    AttributedTextDto progressText = progressBar.getProgressText();
                    if (progressText != null) {
                        whf0Var.a.getClass();
                        formattedText2 = gd3.b(progressText);
                    } else {
                        formattedText2 = null;
                    }
                    double progress = progressBar.getProgress();
                    String accessibilityLabel = progressBar.getAccessibilityLabel();
                    if (paddings == null) {
                        o690Var = o690.e;
                    } else {
                        whf0Var.b.getClass();
                        Integer lead = paddings.getLead();
                        int intValue = lead != null ? lead.intValue() : 0;
                        Integer trail = paddings.getTrail();
                        int intValue2 = trail != null ? trail.intValue() : 0;
                        Integer top = paddings.getTop();
                        int intValue3 = top != null ? top.intValue() : 0;
                        Integer bottom = paddings.getBottom();
                        o690Var = new o690(intValue, intValue2, intValue3, bottom != null ? bottom.intValue() : 0);
                    }
                    bif0Var = new bif0(formattedText2, progress, accessibilityLabel, eif0Var, o690Var);
                }
                s4z0Var = new wjf0(bif0Var, formattedText);
            } else {
                if (!(footer instanceof TileFooterDto.Unknown_TileFooterDto)) {
                    w511.b();
                    return null;
                }
                s4z0Var = c221.a;
            }
            s4z0Var = r37Var;
        }
        BackgroundDto background = tileDto.getBackground();
        u3b1 b4 = background != null ? this.d.b(background) : null;
        BadgeDto badge = tileDto.getBadge();
        if (badge != null) {
            if (badge instanceof BadgeDto.Badge_CornerBadgeDto) {
                CornerBadgeDto cornerBadgeDto = ((BadgeDto.Badge_CornerBadgeDto) badge).b;
                String text3 = cornerBadgeDto.getText();
                ColorDto backgroundColor2 = cornerBadgeDto.getBackgroundColor();
                if (backgroundColor2 != null) {
                    vdcVar.getClass();
                    qfcVar = vdc.a(backgroundColor2);
                } else {
                    qfcVar = null;
                }
                ColorDto textColor2 = cornerBadgeDto.getTextColor();
                if (textColor2 != null) {
                    vdcVar.getClass();
                    qfcVar2 = vdc.a(textColor2);
                } else {
                    qfcVar2 = null;
                }
                CornerBadgeDto.AnchorDto anchor = cornerBadgeDto.getAnchor();
                int i3 = anchor == null ? -1 : i5i.f[anchor.ordinal()];
                i = -1;
                if (i3 != -1) {
                    if (i3 == 1) {
                        badgeAnchor = BadgeAnchor.UPPER_LEFT;
                    } else if (i3 == 2) {
                        badgeAnchor = BadgeAnchor.LOWER_LEFT;
                    } else if (i3 == 3) {
                        badgeAnchor = BadgeAnchor.LOWER_RIGHT;
                    } else if (i3 != 4) {
                        w511.b();
                        return null;
                    }
                    z3b1Var2 = new sre(text3, qfcVar, qfcVar2, badgeAnchor);
                }
                badgeAnchor = BadgeAnchor.UPPER_RIGHT;
                z3b1Var2 = new sre(text3, qfcVar, qfcVar2, badgeAnchor);
            } else {
                i = -1;
                if (badge instanceof BadgeDto.Badge_RedBadgeDto) {
                    z3b1Var2 = new nki0(((BadgeDto.Badge_RedBadgeDto) badge).b.getText());
                } else {
                    if (!(badge instanceof BadgeDto.Unknown_BadgeDto)) {
                        w511.b();
                        return null;
                    }
                    z3b1Var2 = p121.a;
                }
            }
            z3b1Var = z3b1Var2;
        } else {
            i = -1;
            z3b1Var = null;
        }
        ActionDto action = tileDto.getAction();
        hhg a2 = action != null ? jhgVar.a(action) : null;
        IconDto image = tileDto.getImage();
        w4v a3 = image != null ? m4vVar.a(image) : null;
        int i4 = i5i.g[tileDto.getImagePosition().ordinal()];
        if (i4 == 1) {
            imagePositionModel = ImagePositionModel.TOP;
        } else {
            if (i4 != 2) {
                w511.b();
                return null;
            }
            imagePositionModel = ImagePositionModel.TRAIL;
        }
        TileDto.StyleDto style2 = tileDto.getStyle();
        return new y4z0(yauVar2, s4z0Var, b4, z3b1Var, a2, a3, imagePositionModel, (style2 == null ? i : i5i.d[style2.ordinal()]) == 1 ? TileStyle.IMAGE : TileStyle.REGULAR, tileDto.getMeta(), tileDto.getMetricaLabel());
    }

    public final lrb1 e(TrailElementDto trailElementDto) {
        qfc qfcVar;
        qfc qfcVar2;
        qfc qfcVar3;
        boolean z = trailElementDto instanceof TrailElementDto.TrailElement_ButtonDto;
        vdc vdcVar = this.c;
        qfc qfcVar4 = null;
        jhg jhgVar = this.b;
        if (z) {
            TrailButtonDto trailButtonDto = ((TrailElementDto.TrailElement_ButtonDto) trailElementDto).b;
            String text = trailButtonDto.getText();
            hhg a = jhgVar.a(trailButtonDto.getAction());
            ColorDto textColor = trailButtonDto.getTextColor();
            if (textColor != null) {
                vdcVar.getClass();
                qfcVar3 = vdc.a(textColor);
            } else {
                qfcVar3 = null;
            }
            ColorDto color = trailButtonDto.getColor();
            if (color != null) {
                vdcVar.getClass();
                qfcVar4 = vdc.a(color);
            }
            return new z901(text, a, qfcVar3, qfcVar4, trailButtonDto.getMeta(), trailButtonDto.getMetricaLabel());
        }
        if (trailElementDto instanceof TrailElementDto.TrailElement_IconButtonDto) {
            IconButtonDto iconButtonDto = ((TrailElementDto.TrailElement_IconButtonDto) trailElementDto).b;
            return new i4v(jhgVar.a(iconButtonDto.getAction()), this.a.a(iconButtonDto.getIcon()));
        }
        if (!(trailElementDto instanceof TrailElementDto.TrailElement_ToggleDto)) {
            if (trailElementDto instanceof TrailElementDto.Unknown_TrailElementDto) {
                return t121.a;
            }
            w511.b();
            return null;
        }
        ToggleDto toggleDto = ((TrailElementDto.TrailElement_ToggleDto) trailElementDto).b;
        String leadText = toggleDto.getLeadText();
        hhg a2 = jhgVar.a(toggleDto.getAction());
        ColorDto checkedTrackColor = toggleDto.getCheckedTrackColor();
        if (checkedTrackColor != null) {
            vdcVar.getClass();
            qfcVar = vdc.a(checkedTrackColor);
        } else {
            qfcVar = null;
        }
        ColorDto uncheckedTrackColor = toggleDto.getUncheckedTrackColor();
        if (uncheckedTrackColor != null) {
            vdcVar.getClass();
            qfcVar2 = vdc.a(uncheckedTrackColor);
        } else {
            qfcVar2 = null;
        }
        ColorDto thumbColor = toggleDto.getThumbColor();
        if (thumbColor != null) {
            vdcVar.getClass();
            qfcVar4 = vdc.a(thumbColor);
        }
        return new xkz0(leadText, a2, toggleDto.isChecked(), qfcVar, qfcVar2, qfcVar4, toggleDto.getMeta(), toggleDto.getMetricaLabel());
    }

    public final pau f(String str, StyledTextDto styledTextDto, IconDto iconDto) {
        return new pau(styledTextDto != null ? b(styledTextDto) : new rry0(str, Font.HEADER, 0, 12), iconDto != null ? this.a.a(iconDto) : null, 2);
    }
}
