package com.yx360.design.compose.internal;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.n;
import defpackage.bts;
import defpackage.buj0;
import defpackage.cwa1;
import defpackage.e5h0;
import defpackage.eyr;
import defpackage.fid;
import defpackage.k5h0;
import defpackage.tse0;
import defpackage.udq0;
import defpackage.unr0;
import defpackage.vez0;
import defpackage.x4h0;
import defpackage.y4h0;

/* loaded from: classes4.dex */
public abstract class c {
    public static eyr a(DsFonts$FontType dsFonts$FontType, fid fidVar) {
        buj0 a;
        eyr a2;
        bts btsVar = (bts) fidVar;
        btsVar.e0(-725978387);
        if (((Boolean) btsVar.m(n.a)).booleanValue()) {
            btsVar.e0(1833338260);
            switch (b.a[dsFonts$FontType.ordinal()]) {
                case 1:
                    btsVar.e0(-1880520620);
                    btsVar.e0(-572852722);
                    btsVar.e0(1077164767);
                    int i = k5h0.ys_display_360;
                    btsVar.e0(769490092);
                    btsVar.e0(1639021349);
                    a2 = cwa1.a(((Context) btsVar.m(AndroidCompositionLocals_androidKt.b)).getResources().getFont(i));
                    btsVar.t(false);
                    btsVar.t(false);
                    break;
                case 2:
                    btsVar.e0(-1880518796);
                    btsVar.e0(859273166);
                    btsVar.e0(-786928481);
                    int i2 = y4h0.ys_text_regular;
                    btsVar.e0(769490092);
                    btsVar.e0(1639021349);
                    a2 = cwa1.a(((Context) btsVar.m(AndroidCompositionLocals_androidKt.b)).getResources().getFont(i2));
                    btsVar.t(false);
                    btsVar.t(false);
                    break;
                case 3:
                    btsVar.e0(-1880517005);
                    btsVar.e0(796681132);
                    btsVar.e0(-1033340419);
                    int i3 = x4h0.ys_text_medium;
                    btsVar.e0(769490092);
                    btsVar.e0(1639021349);
                    a2 = cwa1.a(((Context) btsVar.m(AndroidCompositionLocals_androidKt.b)).getResources().getFont(i3));
                    btsVar.t(false);
                    btsVar.t(false);
                    break;
                case 4:
                    btsVar.e0(-1880515146);
                    btsVar.e0(-2027902674);
                    btsVar.e0(-1175513601);
                    int i4 = k5h0.roboto_mono;
                    btsVar.e0(769490092);
                    btsVar.e0(1639021349);
                    a2 = cwa1.a(((Context) btsVar.m(AndroidCompositionLocals_androidKt.b)).getResources().getFont(i4));
                    btsVar.t(false);
                    btsVar.t(false);
                    break;
                case 5:
                    btsVar.e0(-1880513359);
                    btsVar.e0(-254595380);
                    btsVar.e0(-654152419);
                    int i5 = e5h0.ys_text_bold;
                    btsVar.e0(769490092);
                    btsVar.e0(1639021349);
                    a2 = cwa1.a(((Context) btsVar.m(AndroidCompositionLocals_androidKt.b)).getResources().getFont(i5));
                    btsVar.t(false);
                    btsVar.t(false);
                    break;
                case 6:
                    btsVar.e0(-1880511694);
                    btsVar.e0(1409273486);
                    btsVar.e0(1081389919);
                    int i6 = k5h0.yango_headline;
                    btsVar.e0(769490092);
                    btsVar.e0(1639021349);
                    a2 = cwa1.a(((Context) btsVar.m(AndroidCompositionLocals_androidKt.b)).getResources().getFont(i6));
                    btsVar.t(false);
                    btsVar.t(false);
                    break;
                default:
                    throw unr0.y(-1880522282, btsVar, false);
            }
            tse0.t(btsVar, false, false, false);
            btsVar.t(false);
        } else {
            btsVar.e0(1833726628);
            switch (b.a[dsFonts$FontType.ordinal()]) {
                case 1:
                    btsVar.e0(-1880507884);
                    btsVar.e0(209436471);
                    a = vez0.a(k5h0.ys_display_360, null, 0, 14);
                    btsVar.t(false);
                    btsVar.t(false);
                    break;
                case 2:
                    btsVar.e0(-1880506188);
                    btsVar.e0(385931767);
                    a = vez0.a(y4h0.ys_text_regular, null, 0, 14);
                    btsVar.t(false);
                    btsVar.t(false);
                    break;
                case 3:
                    btsVar.e0(-1880504525);
                    btsVar.e0(-1422884831);
                    a = vez0.a(x4h0.ys_text_medium, null, 0, 14);
                    btsVar.t(false);
                    btsVar.t(false);
                    break;
                case 4:
                    btsVar.e0(-1880502794);
                    btsVar.e0(-1570892713);
                    a = vez0.a(k5h0.roboto_mono, null, 0, 14);
                    btsVar.t(false);
                    btsVar.t(false);
                    break;
                case 5:
                    btsVar.e0(-1880501135);
                    btsVar.e0(-782039551);
                    a = vez0.a(e5h0.ys_text_bold, null, 0, 14);
                    btsVar.t(false);
                    btsVar.t(false);
                    break;
                case 6:
                    btsVar.e0(-1880499598);
                    btsVar.e0(722586807);
                    a = vez0.a(k5h0.yango_headline, null, 0, 14);
                    btsVar.t(false);
                    btsVar.t(false);
                    break;
                default:
                    throw unr0.y(-1880509442, btsVar, false);
            }
            a2 = udq0.a(a);
            btsVar.t(false);
        }
        btsVar.t(false);
        return a2;
    }

    public static eyr b(fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-2022319212);
        eyr a = a(DsFonts$FontType.Bold, btsVar);
        btsVar.t(false);
        return a;
    }

    public static eyr c(fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-8134638);
        eyr a = a(DsFonts$FontType.Display, btsVar);
        btsVar.t(false);
        return a;
    }

    public static eyr d(fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(384092852);
        eyr a = a(DsFonts$FontType.Medium, btsVar);
        btsVar.t(false);
        return a;
    }

    public static eyr e(fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-170325774);
        eyr a = a(DsFonts$FontType.Monospace, btsVar);
        btsVar.t(false);
        return a;
    }

    public static eyr f(fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(595895890);
        eyr a = a(DsFonts$FontType.Regular, btsVar);
        btsVar.t(false);
        return a;
    }
}
