package com.caverock.androidsvg;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class n {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SVGParser$SVGAttr.values().length];
        b = iArr;
        try {
            iArr[SVGParser$SVGAttr.x.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[SVGParser$SVGAttr.y.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[SVGParser$SVGAttr.width.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[SVGParser$SVGAttr.height.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            b[SVGParser$SVGAttr.version.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            b[SVGParser$SVGAttr.href.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            b[SVGParser$SVGAttr.preserveAspectRatio.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            b[SVGParser$SVGAttr.d.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            b[SVGParser$SVGAttr.pathLength.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            b[SVGParser$SVGAttr.rx.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            b[SVGParser$SVGAttr.ry.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            b[SVGParser$SVGAttr.cx.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            b[SVGParser$SVGAttr.cy.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            b[SVGParser$SVGAttr.r.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            b[SVGParser$SVGAttr.x1.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            b[SVGParser$SVGAttr.y1.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            b[SVGParser$SVGAttr.x2.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            b[SVGParser$SVGAttr.y2.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            b[SVGParser$SVGAttr.dx.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            b[SVGParser$SVGAttr.dy.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            b[SVGParser$SVGAttr.requiredFeatures.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            b[SVGParser$SVGAttr.requiredExtensions.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            b[SVGParser$SVGAttr.systemLanguage.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            b[SVGParser$SVGAttr.requiredFormats.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            b[SVGParser$SVGAttr.requiredFonts.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            b[SVGParser$SVGAttr.refX.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            b[SVGParser$SVGAttr.refY.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            b[SVGParser$SVGAttr.markerWidth.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            b[SVGParser$SVGAttr.markerHeight.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            b[SVGParser$SVGAttr.markerUnits.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            b[SVGParser$SVGAttr.orient.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            b[SVGParser$SVGAttr.gradientUnits.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            b[SVGParser$SVGAttr.gradientTransform.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            b[SVGParser$SVGAttr.spreadMethod.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            b[SVGParser$SVGAttr.fx.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            b[SVGParser$SVGAttr.fy.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            b[SVGParser$SVGAttr.offset.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            b[SVGParser$SVGAttr.clipPathUnits.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            b[SVGParser$SVGAttr.startOffset.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            b[SVGParser$SVGAttr.patternUnits.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            b[SVGParser$SVGAttr.patternContentUnits.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            b[SVGParser$SVGAttr.patternTransform.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            b[SVGParser$SVGAttr.maskUnits.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            b[SVGParser$SVGAttr.maskContentUnits.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            b[SVGParser$SVGAttr.style.ordinal()] = 45;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            b[SVGParser$SVGAttr.CLASS.ordinal()] = 46;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            b[SVGParser$SVGAttr.fill.ordinal()] = 47;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            b[SVGParser$SVGAttr.fill_rule.ordinal()] = 48;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            b[SVGParser$SVGAttr.fill_opacity.ordinal()] = 49;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            b[SVGParser$SVGAttr.stroke.ordinal()] = 50;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            b[SVGParser$SVGAttr.stroke_opacity.ordinal()] = 51;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            b[SVGParser$SVGAttr.stroke_width.ordinal()] = 52;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            b[SVGParser$SVGAttr.stroke_linecap.ordinal()] = 53;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            b[SVGParser$SVGAttr.stroke_linejoin.ordinal()] = 54;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            b[SVGParser$SVGAttr.stroke_miterlimit.ordinal()] = 55;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            b[SVGParser$SVGAttr.stroke_dasharray.ordinal()] = 56;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            b[SVGParser$SVGAttr.stroke_dashoffset.ordinal()] = 57;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            b[SVGParser$SVGAttr.opacity.ordinal()] = 58;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            b[SVGParser$SVGAttr.color.ordinal()] = 59;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            b[SVGParser$SVGAttr.font.ordinal()] = 60;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            b[SVGParser$SVGAttr.font_family.ordinal()] = 61;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            b[SVGParser$SVGAttr.font_size.ordinal()] = 62;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            b[SVGParser$SVGAttr.font_weight.ordinal()] = 63;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            b[SVGParser$SVGAttr.font_style.ordinal()] = 64;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            b[SVGParser$SVGAttr.text_decoration.ordinal()] = 65;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            b[SVGParser$SVGAttr.direction.ordinal()] = 66;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            b[SVGParser$SVGAttr.text_anchor.ordinal()] = 67;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            b[SVGParser$SVGAttr.overflow.ordinal()] = 68;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            b[SVGParser$SVGAttr.marker.ordinal()] = 69;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            b[SVGParser$SVGAttr.marker_start.ordinal()] = 70;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            b[SVGParser$SVGAttr.marker_mid.ordinal()] = 71;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            b[SVGParser$SVGAttr.marker_end.ordinal()] = 72;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            b[SVGParser$SVGAttr.display.ordinal()] = 73;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            b[SVGParser$SVGAttr.visibility.ordinal()] = 74;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            b[SVGParser$SVGAttr.stop_color.ordinal()] = 75;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            b[SVGParser$SVGAttr.stop_opacity.ordinal()] = 76;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            b[SVGParser$SVGAttr.clip.ordinal()] = 77;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            b[SVGParser$SVGAttr.clip_path.ordinal()] = 78;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            b[SVGParser$SVGAttr.clip_rule.ordinal()] = 79;
        } catch (NoSuchFieldError unused79) {
        }
        try {
            b[SVGParser$SVGAttr.mask.ordinal()] = 80;
        } catch (NoSuchFieldError unused80) {
        }
        try {
            b[SVGParser$SVGAttr.solid_color.ordinal()] = 81;
        } catch (NoSuchFieldError unused81) {
        }
        try {
            b[SVGParser$SVGAttr.solid_opacity.ordinal()] = 82;
        } catch (NoSuchFieldError unused82) {
        }
        try {
            b[SVGParser$SVGAttr.viewport_fill.ordinal()] = 83;
        } catch (NoSuchFieldError unused83) {
        }
        try {
            b[SVGParser$SVGAttr.viewport_fill_opacity.ordinal()] = 84;
        } catch (NoSuchFieldError unused84) {
        }
        try {
            b[SVGParser$SVGAttr.vector_effect.ordinal()] = 85;
        } catch (NoSuchFieldError unused85) {
        }
        try {
            b[SVGParser$SVGAttr.image_rendering.ordinal()] = 86;
        } catch (NoSuchFieldError unused86) {
        }
        try {
            b[SVGParser$SVGAttr.viewBox.ordinal()] = 87;
        } catch (NoSuchFieldError unused87) {
        }
        try {
            b[SVGParser$SVGAttr.type.ordinal()] = 88;
        } catch (NoSuchFieldError unused88) {
        }
        try {
            b[SVGParser$SVGAttr.media.ordinal()] = 89;
        } catch (NoSuchFieldError unused89) {
        }
        int[] iArr2 = new int[SVGParser$SVGElem.values().length];
        a = iArr2;
        try {
            iArr2[SVGParser$SVGElem.svg.ordinal()] = 1;
        } catch (NoSuchFieldError unused90) {
        }
        try {
            a[SVGParser$SVGElem.g.ordinal()] = 2;
        } catch (NoSuchFieldError unused91) {
        }
        try {
            a[SVGParser$SVGElem.a.ordinal()] = 3;
        } catch (NoSuchFieldError unused92) {
        }
        try {
            a[SVGParser$SVGElem.defs.ordinal()] = 4;
        } catch (NoSuchFieldError unused93) {
        }
        try {
            a[SVGParser$SVGElem.use.ordinal()] = 5;
        } catch (NoSuchFieldError unused94) {
        }
        try {
            a[SVGParser$SVGElem.path.ordinal()] = 6;
        } catch (NoSuchFieldError unused95) {
        }
        try {
            a[SVGParser$SVGElem.rect.ordinal()] = 7;
        } catch (NoSuchFieldError unused96) {
        }
        try {
            a[SVGParser$SVGElem.circle.ordinal()] = 8;
        } catch (NoSuchFieldError unused97) {
        }
        try {
            a[SVGParser$SVGElem.ellipse.ordinal()] = 9;
        } catch (NoSuchFieldError unused98) {
        }
        try {
            a[SVGParser$SVGElem.line.ordinal()] = 10;
        } catch (NoSuchFieldError unused99) {
        }
        try {
            a[SVGParser$SVGElem.polyline.ordinal()] = 11;
        } catch (NoSuchFieldError unused100) {
        }
        try {
            a[SVGParser$SVGElem.polygon.ordinal()] = 12;
        } catch (NoSuchFieldError unused101) {
        }
        try {
            a[SVGParser$SVGElem.text.ordinal()] = 13;
        } catch (NoSuchFieldError unused102) {
        }
        try {
            a[SVGParser$SVGElem.tspan.ordinal()] = 14;
        } catch (NoSuchFieldError unused103) {
        }
        try {
            a[SVGParser$SVGElem.tref.ordinal()] = 15;
        } catch (NoSuchFieldError unused104) {
        }
        try {
            a[SVGParser$SVGElem.SWITCH.ordinal()] = 16;
        } catch (NoSuchFieldError unused105) {
        }
        try {
            a[SVGParser$SVGElem.symbol.ordinal()] = 17;
        } catch (NoSuchFieldError unused106) {
        }
        try {
            a[SVGParser$SVGElem.marker.ordinal()] = 18;
        } catch (NoSuchFieldError unused107) {
        }
        try {
            a[SVGParser$SVGElem.linearGradient.ordinal()] = 19;
        } catch (NoSuchFieldError unused108) {
        }
        try {
            a[SVGParser$SVGElem.radialGradient.ordinal()] = 20;
        } catch (NoSuchFieldError unused109) {
        }
        try {
            a[SVGParser$SVGElem.stop.ordinal()] = 21;
        } catch (NoSuchFieldError unused110) {
        }
        try {
            a[SVGParser$SVGElem.title.ordinal()] = 22;
        } catch (NoSuchFieldError unused111) {
        }
        try {
            a[SVGParser$SVGElem.desc.ordinal()] = 23;
        } catch (NoSuchFieldError unused112) {
        }
        try {
            a[SVGParser$SVGElem.clipPath.ordinal()] = 24;
        } catch (NoSuchFieldError unused113) {
        }
        try {
            a[SVGParser$SVGElem.textPath.ordinal()] = 25;
        } catch (NoSuchFieldError unused114) {
        }
        try {
            a[SVGParser$SVGElem.pattern.ordinal()] = 26;
        } catch (NoSuchFieldError unused115) {
        }
        try {
            a[SVGParser$SVGElem.image.ordinal()] = 27;
        } catch (NoSuchFieldError unused116) {
        }
        try {
            a[SVGParser$SVGElem.view.ordinal()] = 28;
        } catch (NoSuchFieldError unused117) {
        }
        try {
            a[SVGParser$SVGElem.mask.ordinal()] = 29;
        } catch (NoSuchFieldError unused118) {
        }
        try {
            a[SVGParser$SVGElem.style.ordinal()] = 30;
        } catch (NoSuchFieldError unused119) {
        }
        try {
            a[SVGParser$SVGElem.solidColor.ordinal()] = 31;
        } catch (NoSuchFieldError unused120) {
        }
    }
}
