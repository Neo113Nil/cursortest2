package com.ybsdk.navigation;

import android.animation.AnimatorInflater;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.adjust.sdk.Constants;
import com.ybsdk.api.YBSdk;
import com.ybsdk.api.YBSdkVisualParams;
import com.ybsdk.api.entities.YBSdkTheme;
import com.ybsdk.common.InternalSdkState;
import com.ybsdk.common.StartSessionCallSource;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.CommonEvents$LaunchScreenRequested;
import com.ybsdk.core.analytics.generated.delegates.HidingBalancesEvents$HidingBalancesInitiatedAction;
import com.ybsdk.core.common.domain.entities.BuildFlavor;
import com.ybsdk.core.design.theme.ThemeType;
import com.ybsdk.core.design.theme.ThemedParams;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.core.presentation.BaseThemeFragment;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.sensors.RotationDetectorProvider;
import com.ybsdk.di.modules.features.CardFeatureModule;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinFragment;
import com.ybsdk.feature.pin.internal.screens.checkpin.CheckType;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.rconfig.configs.CustomInsetsHandlingConfig;
import com.ybsdk.screens.initial.InitialFragment;
import com.ybsdk.screens.initial.InitialFragmentScreenParams;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.modal.RootSlideableModalView;
import com.ybsdk.widgets.common.FrameLayoutAddViewAware;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import defpackage.ah40;
import defpackage.b64;
import defpackage.be4;
import defpackage.bkf;
import defpackage.bnp0;
import defpackage.bvf0;
import defpackage.c4u0;
import defpackage.c90;
import defpackage.ce4;
import defpackage.cg91;
import defpackage.ckf;
import defpackage.cpn;
import defpackage.cs6;
import defpackage.ctb;
import defpackage.d8u0;
import defpackage.d9u0;
import defpackage.dab1;
import defpackage.des;
import defpackage.du2;
import defpackage.dxj0;
import defpackage.dy2;
import defpackage.dy31;
import defpackage.dzh0;
import defpackage.e8u0;
import defpackage.ee4;
import defpackage.eja1;
import defpackage.em3;
import defpackage.ew2;
import defpackage.f8u0;
import defpackage.fcy0;
import defpackage.fjg;
import defpackage.g8e;
import defpackage.gff;
import defpackage.ggp0;
import defpackage.ggs;
import defpackage.gp51;
import defpackage.gs51;
import defpackage.gsl;
import defpackage.gwy0;
import defpackage.h2b1;
import defpackage.h7u;
import defpackage.h9g;
import defpackage.hep0;
import defpackage.hs51;
import defpackage.htt0;
import defpackage.i3d0;
import defpackage.i3y;
import defpackage.i5;
import defpackage.igp0;
import defpackage.ihm0;
import defpackage.j3h;
import defpackage.j50;
import defpackage.jah0;
import defpackage.jl40;
import defpackage.jp51;
import defpackage.jqr;
import defpackage.jx81;
import defpackage.jxs;
import defpackage.k650;
import defpackage.k6v;
import defpackage.kg51;
import defpackage.kgx;
import defpackage.kh90;
import defpackage.kp51;
import defpackage.kwt0;
import defpackage.l3h;
import defpackage.l650;
import defpackage.l8x;
import defpackage.lcb1;
import defpackage.li91;
import defpackage.lia1;
import defpackage.lqs;
import defpackage.luq0;
import defpackage.m650;
import defpackage.mg;
import defpackage.mu31;
import defpackage.n2h;
import defpackage.n860;
import defpackage.nkp;
import defpackage.nlp0;
import defpackage.nop0;
import defpackage.ny61;
import defpackage.o6;
import defpackage.ok31;
import defpackage.orp0;
import defpackage.p5t0;
import defpackage.p860;
import defpackage.pt11;
import defpackage.pz40;
import defpackage.q59;
import defpackage.qg6;
import defpackage.qmh0;
import defpackage.qoi0;
import defpackage.qv10;
import defpackage.r5t0;
import defpackage.r751;
import defpackage.r90;
import defpackage.ri90;
import defpackage.rje;
import defpackage.rt1;
import defpackage.s0h;
import defpackage.s39;
import defpackage.s400;
import defpackage.s750;
import defpackage.s861;
import defpackage.scc;
import defpackage.sd90;
import defpackage.sf30;
import defpackage.sls;
import defpackage.smg0;
import defpackage.sw51;
import defpackage.t750;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tp41;
import defpackage.tv3;
import defpackage.tvt0;
import defpackage.tw51;
import defpackage.u400;
import defpackage.u470;
import defpackage.u750;
import defpackage.udp0;
import defpackage.ung0;
import defpackage.uu01;
import defpackage.uvt0;
import defpackage.v40;
import defpackage.v50;
import defpackage.v5c0;
import defpackage.v750;
import defpackage.vg10;
import defpackage.vru;
import defpackage.vvg0;
import defpackage.vvt0;
import defpackage.vzt;
import defpackage.w511;
import defpackage.w750;
import defpackage.wa8;
import defpackage.wdp0;
import defpackage.wlp;
import defpackage.wop0;
import defpackage.wqq0;
import defpackage.wu4;
import defpackage.x4c;
import defpackage.x4e;
import defpackage.x750;
import defpackage.x8g;
import defpackage.xa8;
import defpackage.xqq0;
import defpackage.xvz;
import defpackage.y6u;
import defpackage.y750;
import defpackage.y770;
import defpackage.ya8;
import defpackage.ycp0;
import defpackage.yfl0;
import defpackage.yli0;
import defpackage.yqq0;
import defpackage.z1x0;
import defpackage.za8;
import defpackage.zgv;
import defpackage.zqq0;
import defpackage.zva0;
import defpackage.zvt0;
import defpackage.zy11;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0096\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n*\u0004Ö\u0001Ù\u0001\b\u0000\u0018\u0000 õ\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f:\u0004ö\u0001÷\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\t\b\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u001e2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020%H\u0016¢\u0006\u0004\b*\u0010(J+\u00100\u001a\u00020/2\u0006\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b0\u00101J!\u00103\u001a\u00020\u001e2\u0006\u00102\u001a\u00020/2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001eH\u0016¢\u0006\u0004\b5\u0010\u0016J\u000f\u00106\u001a\u00020\u001eH\u0016¢\u0006\u0004\b6\u0010\u0016J\u000f\u00107\u001a\u00020\u001eH\u0016¢\u0006\u0004\b7\u0010\u0016J\u000f\u00108\u001a\u00020\u001eH\u0016¢\u0006\u0004\b8\u0010\u0016J\u000f\u00109\u001a\u00020\u0019H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u001eH\u0016¢\u0006\u0004\b;\u0010\u0016J\u000f\u0010<\u001a\u00020\u001eH\u0016¢\u0006\u0004\b<\u0010\u0016J\u000f\u0010=\u001a\u00020\u001eH\u0016¢\u0006\u0004\b=\u0010\u0016J\u000f\u0010>\u001a\u00020\u001eH\u0016¢\u0006\u0004\b>\u0010\u0016J\u000f\u0010?\u001a\u00020\u001eH\u0016¢\u0006\u0004\b?\u0010\u0016J\u0017\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u001eH\u0016¢\u0006\u0004\bE\u0010\u0016J\u0017\u0010G\u001a\u00020F2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bG\u0010HJ\u0019\u0010K\u001a\u00020\u001e2\b\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\u001e2\u0006\u0010M\u001a\u00020\u0019H\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u001eH\u0016¢\u0006\u0004\bP\u0010\u0016J\u0017\u0010Q\u001a\u00020\u001e2\u0006\u0010M\u001a\u00020\u0019H\u0016¢\u0006\u0004\bQ\u0010OJ\u000f\u0010R\u001a\u00020\u001eH\u0002¢\u0006\u0004\bR\u0010\u0016J\u000f\u0010S\u001a\u00020\u001eH\u0002¢\u0006\u0004\bS\u0010\u0016J\u000f\u0010T\u001a\u00020\u001eH\u0002¢\u0006\u0004\bT\u0010\u0016J\u000f\u0010U\u001a\u00020\u001eH\u0002¢\u0006\u0004\bU\u0010\u0016J\u0017\u0010X\u001a\u00020\u001e2\u0006\u0010W\u001a\u00020VH\u0002¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u001eH\u0002¢\u0006\u0004\bZ\u0010\u0016J\u000f\u0010[\u001a\u00020\u001eH\u0002¢\u0006\u0004\b[\u0010\u0016J\u000f\u0010]\u001a\u00020\\H\u0002¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u001eH\u0002¢\u0006\u0004\b_\u0010\u0016J\u000f\u0010`\u001a\u00020\\H\u0002¢\u0006\u0004\b`\u0010^J\u000f\u0010a\u001a\u00020\u001eH\u0002¢\u0006\u0004\ba\u0010\u0016J\u000f\u0010b\u001a\u00020\u001eH\u0002¢\u0006\u0004\bb\u0010\u0016J\u000f\u0010c\u001a\u00020\u0019H\u0002¢\u0006\u0004\bc\u0010:J\u001d\u0010g\u001a\u0010\u0012\f\u0012\n f*\u0004\u0018\u00010e0e0dH\u0002¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u001eH\u0002¢\u0006\u0004\bi\u0010\u0016J\u0017\u0010l\u001a\u00020\u00192\u0006\u0010k\u001a\u00020jH\u0002¢\u0006\u0004\bl\u0010mJ\u0017\u0010n\u001a\u00020\u001e2\u0006\u0010k\u001a\u00020jH\u0002¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020\u0019H\u0002¢\u0006\u0004\bp\u0010:J\u000f\u0010q\u001a\u00020\u001eH\u0002¢\u0006\u0004\bq\u0010\u0016J\u000f\u0010r\u001a\u00020\u001eH\u0002¢\u0006\u0004\br\u0010\u0016J\u0017\u0010s\u001a\u00020\u00192\u0006\u0010k\u001a\u00020jH\u0002¢\u0006\u0004\bs\u0010mJ\u000f\u0010t\u001a\u00020\u001eH\u0002¢\u0006\u0004\bt\u0010\u0016J\u000f\u0010u\u001a\u00020\u001eH\u0002¢\u0006\u0004\bu\u0010\u0016J\u000f\u0010v\u001a\u00020\u0019H\u0002¢\u0006\u0004\bv\u0010:J\u000f\u0010w\u001a\u00020\u001eH\u0002¢\u0006\u0004\bw\u0010\u0016J\u000f\u0010x\u001a\u00020\u001eH\u0002¢\u0006\u0004\bx\u0010\u0016J\u000f\u0010y\u001a\u00020\u001eH\u0002¢\u0006\u0004\by\u0010\u0016J\u000f\u0010z\u001a\u00020\u001eH\u0002¢\u0006\u0004\bz\u0010\u0016J\u000f\u0010{\u001a\u00020\u0019H\u0002¢\u0006\u0004\b{\u0010:R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010|R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010}R\u001f\u0010\u0083\u0001\u001a\u00020~8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R!\u0010\u0088\u0001\u001a\u00030\u0084\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0080\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R!\u0010\u0090\u0001\u001a\u00030\u008c\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u0080\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R!\u0010\u0095\u0001\u001a\u00030\u0091\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0080\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R!\u0010\u009a\u0001\u001a\u00030\u0096\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0080\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R!\u0010\u009f\u0001\u001a\u00030\u009b\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u0080\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R!\u0010¤\u0001\u001a\u00030 \u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¡\u0001\u0010\u0080\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R\u001c\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R(\u0010\u00ad\u0001\u001a\n\u0012\u0005\u0012\u00030©\u00010¨\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bª\u0001\u0010\u0080\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R\u0019\u0010®\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R&\u0010±\u0001\u001a\t\u0012\u0004\u0012\u00020\u001e0°\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R(\u0010º\u0001\u001a\n\u0012\u0005\u0012\u00030¶\u00010µ\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b·\u0001\u0010\u0080\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001R!\u0010¿\u0001\u001a\u00030»\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¼\u0001\u0010\u0080\u0001\u001a\u0006\b½\u0001\u0010¾\u0001R!\u0010Ä\u0001\u001a\u00030À\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÁ\u0001\u0010\u0080\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u001a\u0010Æ\u0001\u001a\u00030Å\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u001b\u0010È\u0001\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u001c\u0010Ë\u0001\u001a\u0005\u0018\u00010Ê\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R*\u0010Ð\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b0Î\u0001R\u00030Ï\u00010Í\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u001c\u0010Ó\u0001\u001a\u0005\u0018\u00010Ò\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R\u0019\u0010Õ\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010¯\u0001R\u0018\u0010×\u0001\u001a\u00030Ö\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0001\u0010Ø\u0001R\u0018\u0010Ú\u0001\u001a\u00030Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u001b\u0010Ü\u0001\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u001b\u0010Þ\u0001\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010Ý\u0001R\u0018\u0010á\u0001\u001a\u00030©\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bß\u0001\u0010à\u0001R\u0018\u0010å\u0001\u001a\u00030â\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bã\u0001\u0010ä\u0001R\u0016\u0010ç\u0001\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bæ\u0001\u0010:R\u0016\u0010è\u0001\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bè\u0001\u0010:R\u0016\u0010é\u0001\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bé\u0001\u0010:R\u0018\u0010í\u0001\u001a\u00030ê\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bë\u0001\u0010ì\u0001R\u0018\u0010ñ\u0001\u001a\u00030î\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bï\u0001\u0010ð\u0001R\u0019\u0010ô\u0001\u001a\u0004\u0018\u00010e8BX\u0082\u0004¢\u0006\b\u001a\u0006\bò\u0001\u0010ó\u0001¨\u0006ø\u0001"}, d2 = {"Lcom/ybsdk/navigation/NavigationFragment;", "Lcom/ybsdk/core/presentation/BaseThemeFragment;", "Lyfl0;", "Lgwy0;", "Lce4;", "Lee4;", "Lbnp0;", "Lzqq0;", "Lr5t0;", "Lf8u0;", "Lm650;", "Lnkp;", "Ljp51;", "", "Ly6u;", "Lbkf;", "Ldxj0;", "accountFacade", "Ly750;", "navigationHelper", "<init>", "(Ldxj0;Ly750;)V", "()V", "", "fragmentTag", "", "isNewFragmentInsetsHandlingEnabled", "(Ljava/lang/String;)Z", "Lcom/ybsdk/feature/deeplink/api/Deeplink;", Constants.DEEPLINK, "Lzy11;", "handleDeeplink", "(Lcom/ybsdk/feature/deeplink/api/Deeplink;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroyView", "onDetach", "onBackPressed", "()Z", "exitFromRoot", "onDestroy", "invalidateBackButton", "updateSoftInputMode", "updateStatusBarColor", "Lz1x0;", "colors", "Le8u0;", "overrideStatusBarColor", "(Lz1x0;)Le8u0;", "updateNavigationBarColor", "Ll650;", "overrideNavigationBarColor", "(Lz1x0;)Ll650;", "Lwqq0;", "sensitiveDataConfig", "updateSensitiveDataMode", "(Lwqq0;)V", "visible", "setGripVisible", "(Z)V", "updateBackground", "setBottomSheetBackgroundVisible", "initEducationsIgnoreShadowTags", "restoreWindowFlags", "enableScreenshots", "disableScreenshots", "Lza8;", C0553n3.g, "setBackground", "(Lza8;)V", "initDetector", "localOnDeviceRotation", "Ll8x;", "observeStartSessionResponse", "()Ll8x;", "observePassportAuth", "observeUserPassportUidChanging", "observeThemeChanging", "safeClearFragments", "checkAllChildFragmentsShouldBeRestored", "", "Landroidx/fragment/app/Fragment;", "kotlin.jvm.PlatformType", "reattachFragmentsIfPossible", "()Ljava/util/List;", "invalidateNavigationFragmentComponents", "Lcom/ybsdk/common/InternalSdkState;", ClidProvider.STATE, "shouldSkipInitialState", "(Lcom/ybsdk/common/InternalSdkState;)Z", "processInternalState", "(Lcom/ybsdk/common/InternalSdkState;)V", "closeBottomSheet", "closeAllBottomSheets", "closeTopActivity", "shouldOpenPinOnReturningToApp", "reportOpened", "reportClosed", "backButtonCanBeShown", "initBottomSheetAccessibility", "checkForRootedDevice", "warmUpWebViewPassportCookies", "closePlusHomeBottomSheet", "onPlusHomeBottomSheetBackPressed", "Ldxj0;", "Ly750;", "Lcom/ybsdk/navigation/NavigationFragment$NavigationFragmentArguments;", "fragmentArguments$delegate", "Li3y;", "getFragmentArguments", "()Lcom/ybsdk/navigation/NavigationFragment$NavigationFragmentArguments;", "fragmentArguments", "Ltw51;", "sdkViewComponent$delegate", "getSdkViewComponent", "()Ltw51;", "sdkViewComponent", "Lqg6;", "bottomSheetShownAware", "Lqg6;", "Lcom/ybsdk/core/analytics/generated/AppAnalyticsReporter;", "reporter$delegate", "getReporter", "()Lcom/ybsdk/core/analytics/generated/AppAnalyticsReporter;", "reporter", "Ludp0;", "childFragmentFactory$delegate", "getChildFragmentFactory", "()Ludp0;", "childFragmentFactory", "Lkp51;", "navigator$delegate", "getNavigator", "()Lkp51;", "navigator", "Lhs51;", "ybInsetsHandlingHelper$delegate", "getYbInsetsHandlingHelper", "()Lhs51;", "ybInsetsHandlingHelper", "Luvt0;", "spoilerManager$delegate", "getSpoilerManager", "()Luvt0;", "spoilerManager", "Ltvt0;", "spoilerGestureDetector", "Ltvt0;", "Lctb;", "Ltfl0;", "cicerone$delegate", "getCicerone", "()Lctb;", "cicerone", "hasDeepLinkBeenHandled", "Z", "Lkotlin/Function0;", "changeSpoilerState", "Lsls;", "getChangeSpoilerState", "()Lsls;", "Lpz40;", "Lcom/ybsdk/core/design/theme/ThemeType;", "themeType$delegate", "getThemeType", "()Lpz40;", "themeType", "Ligp0;", "screenshotsDetector$delegate", "getScreenshotsDetector", "()Ligp0;", "screenshotsDetector", "Lhep0;", "screenRecordingDetector$delegate", "getScreenRecordingDetector", "()Lhep0;", "screenRecordingDetector", "Ls861;", "binding", "Ls861;", "hostFragment", "Landroidx/fragment/app/Fragment;", "Lcom/ybsdk/screens/modal/RootSlideableModalView;", "slideableModalView", "Lcom/ybsdk/screens/modal/RootSlideableModalView;", "", "Lzva0;", "Lawa0;", "fragmentTraces", "Ljava/util/Map;", "", "initialWindowFlags", "Ljava/lang/Integer;", "hasRestoredChildFragments", "v750", "childLifecycleCallbacks", "Lv750;", "x750", "onBackPressedCallback", "Lx750;", "navigationBarColorOverride", "Lz1x0;", "statusBarColorsOverride", "getRouter", "()Ltfl0;", "router", "Lcom/ybsdk/core/utils/ext/d;", "getHapticFeedbackHelper", "()Lcom/ybsdk/core/utils/ext/d;", "hapticFeedbackHelper", "getDrawSdkUnderSafeArea", "drawSdkUnderSafeArea", "isShownAsSlidableView", "isNewBottomSheetInsetsHandlingEnabled", "Lcom/ybsdk/screens/initial/a;", "getInitialScreenFactory", "()Lcom/ybsdk/screens/initial/a;", "initialScreenFactory", "Lr751;", "getInsetsController", "()Lr751;", "insetsController", "getLastVisibleFragment", "()Landroidx/fragment/app/Fragment;", "lastVisibleFragment", "Companion", "NavigationFragmentArguments", "com/ybsdk/navigation/b", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavigationFragment extends BaseThemeFragment implements yfl0, gwy0, ce4, ee4, bnp0, zqq0, r5t0, f8u0, m650, nkp, jp51, y6u, bkf {
    public static final b Companion = new b();
    private static final String FRAGMENT_TAG;
    private static final String KEY_ARGUMENTS = "fragment_arguments";
    private static final String KEY_SHOULD_RESTORE_CHILD_FRAGMENTS = "should_restore_child_fragments";
    private static final int TRANSPARENT_BACKGROUND = 0;
    private final dxj0 accountFacade;
    private s861 binding;
    private final qg6 bottomSheetShownAware;
    private final sls changeSpoilerState;

    /* renamed from: childFragmentFactory$delegate, reason: from kotlin metadata */
    private final i3y childFragmentFactory;
    private final v750 childLifecycleCallbacks;

    /* renamed from: cicerone$delegate, reason: from kotlin metadata */
    private final i3y cicerone;

    /* renamed from: fragmentArguments$delegate, reason: from kotlin metadata */
    private final i3y fragmentArguments;
    private final Map<String, zva0> fragmentTraces;
    private boolean hasDeepLinkBeenHandled;
    private boolean hasRestoredChildFragments;
    private Fragment hostFragment;
    private Integer initialWindowFlags;
    private z1x0 navigationBarColorOverride;
    private final y750 navigationHelper;

    /* renamed from: navigator$delegate, reason: from kotlin metadata */
    private final i3y navigator;
    private final x750 onBackPressedCallback;

    /* renamed from: reporter$delegate, reason: from kotlin metadata */
    private final i3y reporter;

    /* renamed from: screenRecordingDetector$delegate, reason: from kotlin metadata */
    private final i3y screenRecordingDetector;

    /* renamed from: screenshotsDetector$delegate, reason: from kotlin metadata */
    private final i3y screenshotsDetector;

    /* renamed from: sdkViewComponent$delegate, reason: from kotlin metadata */
    private final i3y sdkViewComponent;
    private RootSlideableModalView slideableModalView;
    private tvt0 spoilerGestureDetector;

    /* renamed from: spoilerManager$delegate, reason: from kotlin metadata */
    private final i3y spoilerManager;
    private z1x0 statusBarColorsOverride;

    /* renamed from: themeType$delegate, reason: from kotlin metadata */
    private final i3y themeType;

    /* renamed from: ybInsetsHandlingHelper$delegate, reason: from kotlin metadata */
    private final i3y ybInsetsHandlingHelper;

    static {
        String canonicalName = NavigationFragment.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        FRAGMENT_TAG = canonicalName;
    }

    private NavigationFragment(dxj0 dxj0Var, y750 y750Var) {
        this.accountFacade = dxj0Var;
        this.navigationHelper = y750Var;
        this.fragmentArguments = kotlin.a.a(new s750(this, 8));
        this.sdkViewComponent = kotlin.a.a(new s750(this, 9));
        this.bottomSheetShownAware = new qg6();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.reporter = kotlin.a.b(lazyThreadSafetyMode, new s750(this, 0));
        this.childFragmentFactory = kotlin.a.a(new s750(this, 1));
        this.navigator = kotlin.a.a(new s750(this, 2));
        this.ybInsetsHandlingHelper = kotlin.a.a(new s750(this, 3));
        this.spoilerManager = kotlin.a.a(new s750(this, 4));
        this.cicerone = kotlin.a.a(new s750(this, 5));
        this.changeSpoilerState = new NavigationFragment$changeSpoilerState$1(0, this, NavigationFragment.class, "localOnDeviceRotation", "localOnDeviceRotation()V", 0);
        this.themeType = kotlin.a.a(new ah40(17));
        this.screenshotsDetector = kotlin.a.b(lazyThreadSafetyMode, new ah40(18));
        this.screenRecordingDetector = kotlin.a.b(lazyThreadSafetyMode, new ah40(19));
        this.fragmentTraces = new LinkedHashMap();
        this.childLifecycleCallbacks = new v750(this);
        this.onBackPressedCallback = new x750(this);
    }

    private final boolean backButtonCanBeShown() {
        if (isShownAsSlidableView()) {
            return true;
        }
        this.navigationHelper.getClass();
        return getChildFragmentManager().K() > 0 && !isShownAsSlidableView();
    }

    private final boolean checkAllChildFragmentsShouldBeRestored() {
        List f = getChildFragmentManager().c.f();
        if (f.isEmpty()) {
            return false;
        }
        List list = f;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return true;
        }
        return false;
    }

    private final void checkForRootedDevice() {
        tje.N(eja1.s(this), null, null, new NavigationFragment$checkForRootedDevice$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final udp0 childFragmentFactory_delegate$lambda$3(NavigationFragment navigationFragment) {
        return (udp0) ((h9g) navigationFragment.getSdkViewComponent()).v1.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ctb cicerone_delegate$lambda$7(NavigationFragment navigationFragment) {
        return new ctb(((h9g) navigationFragment.getSdkViewComponent()).t());
    }

    private final void closeAllBottomSheets() {
        closePlusHomeBottomSheet();
        s861 s861Var = this.binding;
        if (s861Var == null) {
            return;
        }
        FrameLayoutAddViewAware frameLayoutAddViewAware = s861Var.g;
        int i = 0;
        while (true) {
            if (!(i < frameLayoutAddViewAware.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = frameLayoutAddViewAware.getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return;
            }
            BottomSheetDialogView bottomSheetDialogView = childAt instanceof BottomSheetDialogView ? (BottomSheetDialogView) childAt : null;
            if (bottomSheetDialogView != null) {
                bottomSheetDialogView.setPreviousFocusRequired(false);
            }
            if (bottomSheetDialogView != null) {
                bottomSheetDialogView.dismiss();
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean closeBottomSheet() {
        View childAt;
        s861 s861Var = this.binding;
        if (s861Var != null) {
            FrameLayoutAddViewAware frameLayoutAddViewAware = s861Var.g;
            if (frameLayoutAddViewAware.getChildCount() > 0) {
                childAt = frameLayoutAddViewAware.getChildAt(0);
                if (childAt == null) {
                    ny61.s();
                }
            } else {
                childAt = null;
            }
            BottomSheetDialogView bottomSheetDialogView = childAt instanceof BottomSheetDialogView ? (BottomSheetDialogView) childAt : null;
            if (bottomSheetDialogView != null) {
                bottomSheetDialogView.setPreviousFocusRequired(true);
            }
            if (bottomSheetDialogView != null) {
                bottomSheetDialogView.dismiss();
            }
            if (bottomSheetDialogView != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closePlusHomeBottomSheet() {
        ((h9g) getSdkViewComponent()).n().getClass();
    }

    private final void closeTopActivity() {
        ComponentName componentName;
        String className;
        List<ActivityManager.AppTask> appTasks;
        ActivityManager.AppTask appTask;
        try {
            ActivityManager activityManager = (ActivityManager) requireContext().getSystemService(ActivityManager.class);
            ActivityManager.RecentTaskInfo taskInfo = (activityManager == null || (appTasks = activityManager.getAppTasks()) == null || (appTask = appTasks.get(0)) == null) ? null : appTask.getTaskInfo();
            if (jl40.l(taskInfo != null ? taskInfo.topActivity : null, requireActivity().getComponentName())) {
                return;
            }
            if (taskInfo != null && (componentName = taskInfo.topActivity) != null && (className = componentName.getClassName()) != null) {
                em3 em3Var = getReporter().S;
                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                linkedHashMap.put("activityClass", className);
                em3Var.a.a("enter_pin.close_top_screen", linkedHashMap);
            }
            FragmentActivity requireActivity = requireActivity();
            Intent intent = new Intent(getContext(), requireActivity().getClass());
            intent.addFlags(SelfTester_JCP.DECRYPT_CBC);
            rje.k(requireActivity, intent);
        } catch (Throwable th) {
            x4c.g("Failed to close top activity", th, null, null, 12);
        }
    }

    private final void disableScreenshots() {
        Window window;
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setFlags(8192, 8192);
    }

    private final void enableScreenshots() {
        Window window;
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.clearFlags(8192);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void exitFromRoot$lambda$24(NavigationFragment navigationFragment) {
        navigationFragment.navigationHelper.a.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavigationFragmentArguments fragmentArguments_delegate$lambda$0(NavigationFragment navigationFragment) {
        Parcelable parcelable = navigationFragment.requireArguments().getParcelable(KEY_ARGUMENTS);
        if (parcelable != null) {
            return (NavigationFragmentArguments) parcelable;
        }
        vg10.d("No parcelable by name ".concat(KEY_ARGUMENTS));
        return null;
    }

    private final udp0 getChildFragmentFactory() {
        return (udp0) this.childFragmentFactory.getValue();
    }

    private final ctb getCicerone() {
        return (ctb) this.cicerone.getValue();
    }

    private final NavigationFragmentArguments getFragmentArguments() {
        return (NavigationFragmentArguments) this.fragmentArguments.getValue();
    }

    private final com.ybsdk.screens.initial.a getInitialScreenFactory() {
        return ((h9g) getSdkViewComponent()).l();
    }

    private final r751 getInsetsController() {
        Window window = requireActivity().getWindow();
        return new r751(window, window.getDecorView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Fragment getLastVisibleFragment() {
        Object obj;
        try {
            List f = getChildFragmentManager().c.f();
            ListIterator listIterator = f.listIterator(f.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((Fragment) obj).isVisible()) {
                    break;
                }
            }
            return (Fragment) obj;
        } catch (Exception e) {
            x4c.g("Couldn't get lastVisibleFragment in NavigationFragment", e, null, null, 12);
            return null;
        }
    }

    private final kp51 getNavigator() {
        return (kp51) this.navigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppAnalyticsReporter getReporter() {
        return (AppAnalyticsReporter) this.reporter.getValue();
    }

    private final hep0 getScreenRecordingDetector() {
        return (hep0) this.screenRecordingDetector.getValue();
    }

    private final igp0 getScreenshotsDetector() {
        return (igp0) this.screenshotsDetector.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uvt0 getSpoilerManager() {
        return (uvt0) this.spoilerManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hs51 getYbInsetsHandlingHelper() {
        return (hs51) this.ybInsetsHandlingHelper.getValue();
    }

    private final void initBottomSheetAccessibility() {
        s861 s861Var = this.binding;
        if (s861Var == null) {
            s861Var = null;
        }
        FrameLayout frameLayout = s861Var.a;
        frameLayout.setImportantForAccessibility(1);
        com.ybsdk.core.utils.ext.view.b.n(2, frameLayout);
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new o6(10, s861Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBottomSheetAccessibility$lambda$39$lambda$38(s861 s861Var) {
        FrameLayoutAddViewAware frameLayoutAddViewAware = s861Var.g;
        ImageView imageView = s861Var.e;
        int childCount = frameLayoutAddViewAware.getChildCount();
        FrameLayout frameLayout = s861Var.b;
        if (childCount == 0) {
            frameLayout.setImportantForAccessibility(1);
            imageView.setImportantForAccessibility(1);
        } else {
            frameLayout.setImportantForAccessibility(4);
            imageView.setImportantForAccessibility(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDetector() {
        NavigationFragment navigationFragment;
        vvt0 vvt0Var = (vvt0) getSpoilerManager();
        if (vvt0Var.a.a() && ((CommonFeatureFlag) vvt0Var.b.d(wlp.C).getData()).isEnabled()) {
            if (this.spoilerGestureDetector == null) {
                navigationFragment = this;
                NavigationFragment$initDetector$1 navigationFragment$initDetector$1 = new NavigationFragment$initDetector$1(0, navigationFragment, NavigationFragment.class, "localOnDeviceRotation", "localOnDeviceRotation()V", 0);
                h9g h9gVar = (h9g) navigationFragment.getSdkViewComponent();
                h9gVar.getClass();
                Object systemService = h9gVar.v.a.getSystemService("sensor");
                SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
                if (sensorManager == null) {
                    return;
                } else {
                    navigationFragment.spoilerGestureDetector = new RotationDetectorProvider(navigationFragment$initDetector$1, sensorManager, new tv3((com.ybsdk.rconfig.b) ((h9g) navigationFragment.getSdkViewComponent()).v.A.get()));
                }
            } else {
                navigationFragment = this;
            }
            tvt0 tvt0Var = navigationFragment.spoilerGestureDetector;
            if (tvt0Var != null) {
                tvt0Var.changeDetectorEnable(navigationFragment.getViewLifecycleOwner());
            }
        }
    }

    private final void initEducationsIgnoreShadowTags() {
        s861 s861Var = this.binding;
        if (s861Var == null) {
            s861Var = null;
        }
        View view = s861Var.c;
        li91.i(view, String.valueOf(view.getId()));
        ImageView imageView = s861Var.e;
        li91.i(imageView, String.valueOf(imageView.getId()));
        View view2 = s861Var.i;
        li91.i(view2, String.valueOf(view2.getId()));
        View view3 = s861Var.f;
        li91.i(view3, String.valueOf(view3.getId()));
        FrameLayoutAddViewAware frameLayoutAddViewAware = s861Var.g;
        li91.i(frameLayoutAddViewAware, String.valueOf(frameLayoutAddViewAware.getId()));
        FrameLayout frameLayout = s861Var.h;
        li91.i(frameLayout, String.valueOf(frameLayout.getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateNavigationFragmentComponents() {
        View navigationSliderRoot;
        View navigationSliderRoot2;
        s861 s861Var = this.binding;
        Drawable drawable = null;
        if (s861Var == null) {
            s861Var = null;
        }
        ((View) s861Var.d.c).getBackground().setTint(rje.a(requireContext(), ung0.ybColor_fill_default_200));
        RootSlideableModalView rootSlideableModalView = this.slideableModalView;
        boolean z = ((rootSlideableModalView == null || (navigationSliderRoot2 = rootSlideableModalView.getNavigationSliderRoot()) == null) ? null : navigationSliderRoot2.getBackground()) instanceof ColorDrawable;
        RootSlideableModalView rootSlideableModalView2 = this.slideableModalView;
        if (!z) {
            if (rootSlideableModalView2 == null) {
                s861Var.a.setBackgroundColor(rje.a(requireContext(), ung0.ybColor_background_primary));
                return;
            }
            return;
        }
        if (rootSlideableModalView2 != null && (navigationSliderRoot = rootSlideableModalView2.getNavigationSliderRoot()) != null) {
            drawable = navigationSliderRoot.getBackground();
        }
        if (((ColorDrawable) drawable).getColor() == 0) {
            setBackground(ya8.a);
        } else {
            setBackground(xa8.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void localOnDeviceRotation() {
        uvt0 spoilerManager = getSpoilerManager();
        Context requireContext = requireContext();
        requireActivity();
        s861 s861Var = this.binding;
        if (s861Var == null) {
            s861Var = null;
        }
        FrameLayout frameLayout = s861Var.a;
        v40 lastVisibleFragment = getLastVisibleFragment();
        vvt0 vvt0Var = (vvt0) spoilerManager;
        AppAnalyticsReporter appAnalyticsReporter = vvt0Var.c;
        com.ybsdk.persistence.b bVar = vvt0Var.a;
        rt1 rt1Var = appAnalyticsReporter.C;
        kwt0 kwt0Var = lastVisibleFragment instanceof kwt0 ? (kwt0) lastVisibleFragment : null;
        boolean z = false;
        boolean z2 = (kwt0Var == null || kwt0Var.shouldActivateSpoilers()) ? false : true;
        if (bVar.a() && ((CommonFeatureFlag) vvt0Var.b.d(wlp.C).getData()).isEnabled()) {
            z = true;
        }
        if (!z || z2) {
            rt1Var.q(null, Boolean.FALSE, Boolean.valueOf(!z2), Boolean.valueOf(z));
            return;
        }
        boolean z3 = !vvt0Var.a();
        ew2 ew2Var = bVar.d;
        kgx kgxVar = com.ybsdk.persistence.b.l[1];
        ew2Var.d(z3);
        boolean a = vvt0Var.a();
        HidingBalancesEvents$HidingBalancesInitiatedAction hidingBalancesEvents$HidingBalancesInitiatedAction = a ? HidingBalancesEvents$HidingBalancesInitiatedAction.ON : HidingBalancesEvents$HidingBalancesInitiatedAction.OFF;
        Boolean bool = Boolean.TRUE;
        rt1Var.q(hidingBalancesEvents$HidingBalancesInitiatedAction, bool, bool, bool);
        qv10.B(a, vvt0Var.d, null);
        cg91.c(frameLayout, ok31.c);
        if (a) {
            vvt0Var.e.g(zy11.a);
        } else {
            androidx.core.view.b.r(frameLayout, requireContext.getString(dzh0.ybsdk_spoilers_accessibility_show_balances));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kp51 navigator_delegate$lambda$4(NavigationFragment navigationFragment) {
        return new kp51(navigationFragment.requireActivity(), jah0.childNavigationContainer, navigationFragment.getChildFragmentManager(), navigationFragment.getChildFragmentFactory(), Collections.singletonList(ggs.a), navigationFragment);
    }

    private final void observePassportAuth() {
        com.ybsdk.core.utils.ext.c.a(((gff) ((x8g) YBSdk.INSTANCE.getDaggerSdkComponent$yb_sdk_sdkRelease()).X.get()).e, eja1.s(getViewLifecycleOwner()), new w750(this, 0));
    }

    private final l8x observeStartSessionResponse() {
        return tje.N(eja1.s(this), null, null, new NavigationFragment$observeStartSessionResponse$1(this, null), 3);
    }

    private final void observeThemeChanging() {
        YBSdk yBSdk = YBSdk.INSTANCE;
        eja1.s(getViewLifecycleOwner()).d(new NavigationFragment$observeThemeChanging$1(((x8g) yBSdk.getDaggerSdkComponent$yb_sdk_sdkRelease()).c, this, ((x8g) yBSdk.getDaggerSdkComponent$yb_sdk_sdkRelease()).a, null));
    }

    private final l8x observeUserPassportUidChanging() {
        return tje.N(eja1.s(getViewLifecycleOwner()), null, null, new NavigationFragment$observeUserPassportUidChanging$1(this, null), 3);
    }

    private final boolean onPlusHomeBottomSheetBackPressed() {
        ((h9g) getSdkViewComponent()).n().getClass();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$21$lambda$19(NavigationFragment navigationFragment) {
        navigationFragment.onBackPressed();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$21$lambda$20(NavigationFragment navigationFragment) {
        navigationFragment.navigationHelper.a.a(null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void overrideNavigationBarColor$lambda$26(NavigationFragment navigationFragment, z1x0 z1x0Var) {
        navigationFragment.navigationBarColorOverride = z1x0Var;
        navigationFragment.updateNavigationBarColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void overrideStatusBarColor$lambda$25(NavigationFragment navigationFragment, z1x0 z1x0Var) {
        navigationFragment.statusBarColorsOverride = z1x0Var;
        navigationFragment.updateStatusBarColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processInternalState(InternalSdkState state) {
        if (shouldSkipInitialState(state)) {
            return;
        }
        if (!jl40.l(state.getSource(), StartSessionCallSource.AuthInterceptor.INSTANCE) || (state instanceof InternalSdkState.Ok)) {
            if (shouldOpenPinOnReturningToApp(state)) {
                getReporter().d.a.a("authentication.show_pin_on_return_to_app", null);
                closeAllBottomSheets();
                closeTopActivity();
                tfl0 router = getRouter();
                ycp0 ycp0Var = ((com.ybsdk.feature.pin.internal.a) ((h9g) getSdkViewComponent()).O.get()).b;
                String str = "CheckPinCodeEnterScreen";
                boolean z = false;
                router.h(new FragmentScreen(str, z, new CheckPinFragment.CheckPinScreenParams(CheckType.VALIDATE_PIN_ON_RETURN, null, false, 6, null), TransitionPolicyType.POPUP, qoi0.a(CheckPinFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 2, null));
                return;
            }
            return;
        }
        com.ybsdk.rconfig.b q = ((h9g) getSdkViewComponent()).q();
        q.getClass();
        if (((CommonFeatureFlag) q.d(wlp.A).getData()).isEnabled()) {
            com.ybsdk.feature.pin.internal.a aVar = (com.ybsdk.feature.pin.internal.a) ((h9g) getSdkViewComponent()).O.get();
            kp51 navigator = getNavigator();
            FragmentManager fragmentManager = navigator.i;
            fragmentManager.C();
            Fragment E = fragmentManager.E(navigator.h);
            aVar.getClass();
            if (E instanceof CheckPinFragment) {
                getReporter().d.a.a("authentication.internal_pin_auth_interceptor_ignored", null);
                return;
            }
        }
        getReporter().d.a.a("authentication.internal_pin_auth_interceptor_error", g8e.w(1, "value", com.ybsdk.common.c.b(state)));
        tfl0 router2 = getRouter();
        com.ybsdk.screens.initial.a initialScreenFactory = getInitialScreenFactory();
        InitialFragmentScreenParams.ResponsePreloaded responsePreloaded = new InitialFragmentScreenParams.ResponsePreloaded(state, true);
        initialScreenFactory.getClass();
        router2.j(com.ybsdk.screens.initial.a.b(responsePreloaded));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Fragment> reattachFragmentsIfPossible() {
        List f = getChildFragmentManager().c.f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : f) {
            if (((Fragment) obj).isVisible()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            try {
                FragmentManager childFragmentManager = getChildFragmentManager();
                childFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
                aVar.e(fragment);
                aVar.d();
                FragmentManager childFragmentManager2 = getChildFragmentManager();
                childFragmentManager2.getClass();
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(childFragmentManager2);
                aVar2.b(new des(fragment, 7));
                aVar2.d();
            } catch (Exception e) {
                x4c.g("Exception in reattachFragmentsIfPossible() in NavigationFragment", e, b64.l("Tag: ", fragment.getTag(), "; Name: ", fragment.getClass().getName()), null, 8);
                FragmentManager childFragmentManager3 = getChildFragmentManager();
                childFragmentManager3.getClass();
                androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(childFragmentManager3);
                aVar3.e(fragment);
                aVar3.l(true, true);
                FragmentManager childFragmentManager4 = getChildFragmentManager();
                androidx.fragment.app.a h = g8e.h(childFragmentManager4, childFragmentManager4);
                h.b(new des(fragment, 7));
                h.l(true, true);
            }
        }
        return arrayList;
    }

    private final void reportClosed() {
        ((h9g) getSdkViewComponent()).r().o.a.a("quit", null);
    }

    private final void reportOpened() {
        em3 em3Var = ((h9g) getSdkViewComponent()).r().o;
        Deeplink deeplink = getFragmentArguments().getScreenIntent().getDeeplink();
        String packageName = requireContext().getPackageName();
        String a = ((sw51) ((h9g) getSdkViewComponent()).v.p.get()).a();
        CommonEvents$LaunchScreenRequested requestedScreen = getFragmentArguments().getScreenIntent().getRequestedScreen();
        String obj = deeplink.getAction().toString();
        String m = sd90.m(deeplink.getParsedUri());
        Map d = sd90.d(deeplink.getParsedUri());
        Boolean valueOf = Boolean.valueOf(lia1.g(requireContext()));
        boolean z = false;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) ((h9g) getSdkViewComponent()).v.a.getSystemService(ConnectivityManager.class);
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                z = networkCapabilities.hasTransport(4);
            }
        } catch (Throwable th) {
            x4c.g("Error in VpnConnectionInfoHelper", th, null, Collections.singletonList(orp0.g), 4);
        }
        Boolean valueOf2 = Boolean.valueOf(z);
        LinkedHashMap t = x4e.t(8, "launch_source", packageName, "user_agent", a);
        t.put("screen_requested", requestedScreen.getOriginalValue());
        if (obj != null) {
            t.put("deeplink_action", obj);
        }
        t.put("deeplink_uri", m);
        t.put("deeplink_params", d);
        t.put("is_screen_reader_active", valueOf);
        t.put("is_vpn_enabled", valueOf2);
        em3Var.a.a("launch", t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppAnalyticsReporter reporter_delegate$lambda$2(NavigationFragment navigationFragment) {
        return ((h9g) navigationFragment.getSdkViewComponent()).r();
    }

    private final void restoreWindowFlags() {
        Window window;
        WindowManager.LayoutParams attributes;
        int intValue;
        Window window2;
        Window window3;
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return;
        }
        int i = attributes.flags;
        Integer num = this.initialWindowFlags;
        if (num == null || (intValue = num.intValue() & 8192) == (i & 8192)) {
            return;
        }
        if (intValue == 8192) {
            FragmentActivity activity2 = getActivity();
            if (activity2 == null || (window3 = activity2.getWindow()) == null) {
                return;
            }
            window3.setFlags(8192, 8192);
            return;
        }
        FragmentActivity activity3 = getActivity();
        if (activity3 == null || (window2 = activity3.getWindow()) == null) {
            return;
        }
        window2.clearFlags(8192);
    }

    private final void safeClearFragments() {
        try {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(getChildFragmentManager());
            Iterator it = getChildFragmentManager().c.f().iterator();
            while (it.hasNext()) {
                aVar.p((Fragment) it.next());
            }
            aVar.m();
        } catch (Exception e) {
            x4c.g("Can't safe clear fragments in NavigationFragment", null, e.getMessage(), null, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hep0 screenRecordingDetector_delegate$lambda$10() {
        return new hep0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final igp0 screenshotsDetector_delegate$lambda$9() {
        return new igp0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tw51 sdkViewComponent_delegate$lambda$1(NavigationFragment navigationFragment) {
        BuildFlavor buildFlavor;
        YBSdk yBSdk = YBSdk.INSTANCE;
        x8g x8gVar = ((x8g) yBSdk.getDaggerSdkComponent$yb_sdk_sdkRelease()).g;
        dxj0 dxj0Var = navigationFragment.accountFacade;
        InternalScreenIntent screenIntent = navigationFragment.getFragmentArguments().getScreenIntent();
        wdp0 wdp0Var = new wdp0();
        wdp0Var.a = screenIntent;
        InternalScreenIntent screenIntent2 = navigationFragment.getFragmentArguments().getScreenIntent();
        v5c0 v5c0Var = new v5c0(24);
        v5c0Var.b = screenIntent2;
        YBSdkVisualParams visualParams = navigationFragment.getFragmentArguments().getVisualParams();
        FragmentActivity requireActivity = navigationFragment.requireActivity();
        mu31 mu31Var = new mu31(navigationFragment);
        y750 y750Var = navigationFragment.navigationHelper;
        qg6 qg6Var = navigationFragment.bottomSheetShownAware;
        int i = cs6.a[((x8g) yBSdk.getDaggerSdkComponent$yb_sdk_sdkRelease()).e.d.ordinal()];
        if (i == 1) {
            buildFlavor = BuildFlavor.DEV;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            buildFlavor = BuildFlavor.PROD;
        }
        BuildFlavor buildFlavor2 = buildFlavor;
        dxj0Var.getClass();
        visualParams.getClass();
        y750Var.getClass();
        qg6Var.getClass();
        buildFlavor2.getClass();
        return new h9g(x8gVar, new vzt(), new tp41(), new s39(), new i5(), new u400(), new k6v(), new CardFeatureModule(), new wu4(), new i3d0(), new kh90(), new ri90(), new uu01(), new h7u(), new yli0(), new s0h(), new lqs(), new ihm0(), new d9u0(), new gsl(), new fjg(), new cpn(), new htt0(), new du2(), new luq0(), new pt11(), new q59(), new n2h(), new jxs(), dxj0Var, wdp0Var, v5c0Var, visualParams, requireActivity, mu31Var, y750Var, qg6Var, buildFlavor2);
    }

    private final void setBackground(za8 background) {
        RootSlideableModalView rootSlideableModalView = this.slideableModalView;
        View navigationSliderRoot = rootSlideableModalView != null ? rootSlideableModalView.getNavigationSliderRoot() : null;
        if (background instanceof wa8) {
            if (navigationSliderRoot != null) {
                navigationSliderRoot.setBackgroundColor(((wa8) background).a);
            }
        } else if (jl40.l(background, xa8.a)) {
            if (navigationSliderRoot != null) {
                com.ybsdk.core.utils.ext.view.b.x(ung0.ybColor_background_primary, navigationSliderRoot);
            }
        } else if (!jl40.l(background, ya8.a)) {
            w511.b();
        } else if (navigationSliderRoot != null) {
            com.ybsdk.core.utils.ext.view.b.x(0, navigationSliderRoot);
        }
    }

    private final boolean shouldOpenPinOnReturningToApp(InternalSdkState state) {
        OpenScreenRequirement openScreenRequirement;
        Iterable iterable;
        Fragment F;
        OpenScreenRequirement openScreenRequirement2;
        List f = getChildFragmentManager().c.f();
        if (!(f instanceof Collection) || !f.isEmpty()) {
            Iterator it = f.iterator();
            while (it.hasNext()) {
                Bundle arguments = ((Fragment) it.next()).getArguments();
                if (arguments == null || (openScreenRequirement = (OpenScreenRequirement) arguments.getParcelable("KEY_SCREEN_REQUIREMENT")) == null) {
                    openScreenRequirement = OpenScreenRequirement.WithBuid.INSTANCE;
                }
                if (com.ybsdk.core.navigation.cicerone.a.c(openScreenRequirement)) {
                    break;
                }
            }
        }
        kp51 navigator = getNavigator();
        FragmentManager fragmentManager = navigator.i;
        Fragment F2 = fragmentManager.F(navigator.e);
        if (fragmentManager.K() < 0) {
            iterable = EmptyList.a;
        } else if (fragmentManager.K() == 0) {
            iterable = scc.h(F2);
        } else {
            ArrayList arrayList = new ArrayList();
            if (F2 != null) {
                arrayList.add(F2);
            }
            int K = fragmentManager.K();
            for (int i = 0; i < K; i++) {
                String str = ((androidx.fragment.app.a) fragmentManager.J(i)).i;
                if (str != null && (F = fragmentManager.F(str)) != null) {
                    arrayList.add(F);
                }
            }
            iterable = arrayList;
        }
        Iterable iterable2 = iterable;
        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
            Iterator it2 = iterable2.iterator();
            while (it2.hasNext()) {
                Bundle arguments2 = ((Fragment) it2.next()).getArguments();
                if (arguments2 == null || (openScreenRequirement2 = (OpenScreenRequirement) arguments2.getParcelable("KEY_SCREEN_REQUIREMENT")) == null) {
                    openScreenRequirement2 = OpenScreenRequirement.WithBuid.INSTANCE;
                }
                if (com.ybsdk.core.navigation.cicerone.a.c(openScreenRequirement2)) {
                    if (jl40.l(state.getSource(), StartSessionCallSource.PinTokenCacheManager.INSTANCE) && (state instanceof InternalSdkState.PinInput.PinTokenRetry)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final boolean shouldSkipInitialState(InternalSdkState state) {
        getLastVisibleFragment();
        boolean z = getLastVisibleFragment() == null;
        if (jl40.l(state.getSource(), StartSessionCallSource.AuthInterceptor.INSTANCE) && z && (state instanceof InternalSdkState.Unauthenticated)) {
            kg51 kg51Var = ((x8g) YBSdk.INSTANCE.getDaggerSdkComponent$yb_sdk_sdkRelease()).e;
        }
        return jl40.l(getFragmentArguments().getScreenIntent().getDeeplink().getAction(), DeeplinkAction.ShowPin.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uvt0 spoilerManager_delegate$lambda$6(NavigationFragment navigationFragment) {
        return (uvt0) ((h9g) navigationFragment.getSdkViewComponent()).v.O1.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pz40 themeType_delegate$lambda$8() {
        return bvf0.c(jx81.K((YBSdkTheme) ((x8g) YBSdk.INSTANCE.getDaggerSdkComponent$yb_sdk_sdkRelease()).c.h.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void warmUpWebViewPassportCookies() {
        tje.N(eja1.s(this), null, null, new NavigationFragment$warmUpWebViewPassportCookies$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs51 ybInsetsHandlingHelper_delegate$lambda$5(NavigationFragment navigationFragment) {
        boolean drawSdkUnderSafeArea = navigationFragment.getDrawSdkUnderSafeArea();
        return new hs51(((h9g) navigationFragment.getSdkViewComponent()).v().b(), (int) navigationFragment.getResources().getDimension(vvg0.ybsdk_back_button_margin_top_fullscreen), navigationFragment.isShownAsSlidableView(), drawSdkUnderSafeArea, navigationFragment.isNewBottomSheetInsetsHandlingEnabled());
    }

    @Override // defpackage.jp51
    public void exitFromRoot() {
        s861 s861Var = this.binding;
        if (s861Var == null) {
            s861Var = null;
        }
        lcb1.d(s861Var.a);
        RootSlideableModalView rootSlideableModalView = this.slideableModalView;
        if (rootSlideableModalView != null) {
            rootSlideableModalView.dismissWithAction(new sf30(8, this));
        } else {
            this.navigationHelper.a.a(null);
        }
    }

    public sls getChangeSpoilerState() {
        return this.changeSpoilerState;
    }

    @Override // defpackage.nkp
    public tw51 getDivFeatureDependencies() {
        return getSdkViewComponent();
    }

    @Override // defpackage.bkf
    public boolean getDrawSdkUnderSafeArea() {
        return getFragmentArguments().getVisualParams().getDrawSdkUnderSafeArea();
    }

    @Override // defpackage.y6u
    public com.ybsdk.core.utils.ext.d getHapticFeedbackHelper() {
        return (com.ybsdk.core.utils.ext.d) ((h9g) getSdkViewComponent()).z1.get();
    }

    @Override // defpackage.yfl0
    public tfl0 getRouter() {
        return ((h9g) getSdkViewComponent()).t();
    }

    @Override // defpackage.nkp
    public tw51 getSdkViewComponent() {
        return (tw51) this.sdkViewComponent.getValue();
    }

    @Override // defpackage.gwy0
    public pz40 getThemeType() {
        return (pz40) this.themeType.getValue();
    }

    public final void handleDeeplink(Deeplink deeplink) {
        ((l3h) ((h9g) getSdkViewComponent()).h()).d(deeplink);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    @Override // defpackage.ee4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void invalidateBackButton() {
        boolean z;
        s861 s861Var;
        s861 s861Var2;
        Integer backButtonColor;
        v40 lastVisibleFragment = getLastVisibleFragment();
        be4 be4Var = lastVisibleFragment instanceof be4 ? (be4) lastVisibleFragment : null;
        if (backButtonCanBeShown()) {
            if (be4Var != null ? be4Var.getIsBackButtonVisible() : true) {
                z = true;
                int a = (be4Var != null || (backButtonColor = be4Var.getBackButtonColor()) == null) ? rje.a(requireContext(), ung0.ybColor_textIcon_primary) : backButtonColor.intValue();
                s861Var = this.binding;
                if (s861Var == null) {
                    s861Var = null;
                }
                com.ybsdk.core.utils.ext.view.b.z(s861Var.e, a);
                s861Var2 = this.binding;
                if (s861Var2 == null) {
                    s861Var2 = null;
                }
                s861Var2.e.setVisibility(z ? 0 : 8);
                s861 s861Var3 = this.binding;
                (s861Var3 != null ? s861Var3 : null).e.setEnabled(be4Var != null ? be4Var.getIsBackButtonEnabled() : true);
            }
        }
        z = false;
        if (be4Var != null) {
        }
        s861Var = this.binding;
        if (s861Var == null) {
        }
        com.ybsdk.core.utils.ext.view.b.z(s861Var.e, a);
        s861Var2 = this.binding;
        if (s861Var2 == null) {
        }
        s861Var2.e.setVisibility(z ? 0 : 8);
        s861 s861Var32 = this.binding;
        (s861Var32 != null ? s861Var32 : null).e.setEnabled(be4Var != null ? be4Var.getIsBackButtonEnabled() : true);
    }

    @Override // defpackage.bkf
    public boolean isNewBottomSheetInsetsHandlingEnabled() {
        com.ybsdk.rconfig.b q = ((h9g) getSdkViewComponent()).q();
        q.getClass();
        return ((CustomInsetsHandlingConfig) q.d(ckf.a).getData()).isNewBottomSheetInsetsHandlingEnabled();
    }

    @Override // defpackage.bkf
    public boolean isNewFragmentInsetsHandlingEnabled(String fragmentTag) {
        com.ybsdk.rconfig.b q = ((h9g) getSdkViewComponent()).q();
        q.getClass();
        CustomInsetsHandlingConfig customInsetsHandlingConfig = (CustomInsetsHandlingConfig) q.d(ckf.a).getData();
        return customInsetsHandlingConfig.isNewFragmentInsetsHandlingEnabled() && !kotlin.collections.a.G(customInsetsHandlingConfig.getNewFragmentInsetsHandlingBlackList(), fragmentTag);
    }

    @Override // defpackage.bkf
    public boolean isShownAsSlidableView() {
        return getFragmentArguments().getVisualParams().getShowAsSlidableView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        String localeList = context.getResources().getConfiguration().getLocales().toString();
        fcy0 fcy0Var = getReporter().m0;
        String a = ((wop0) ((h9g) getSdkViewComponent()).v.r0.get()).a();
        String locale = context.getResources().getConfiguration().locale.toString();
        String string = context.getString(dzh0.ybsdk_ui_language);
        String string2 = context.getApplicationContext().getString(dzh0.ybsdk_ui_language);
        String locale2 = Resources.getSystem().getConfiguration().locale.toString();
        LinkedHashMap t = x4e.t(6, "api_provided_locale", a, "strings_resolving_locale", locale);
        t.put("ui_language", string);
        t.put("application_context_language", string2);
        t.put("system_locale", locale2);
        t.put("user_defined_locales", localeList);
        fcy0Var.a.a("tech.application_locale", t);
        fcy0 fcy0Var2 = getReporter().m0;
        int i = 1;
        fcy0Var2.a.a("tech.font_scale", g8e.w(1, "font_scale", String.valueOf(context.getResources().getConfiguration().fontScale)));
        igp0 screenshotsDetector = getScreenshotsDetector();
        FragmentActivity requireActivity = requireActivity();
        screenshotsDetector.a = (dy2) ((h9g) getSdkViewComponent()).v.i0.get();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34 && rje.g(requireActivity, "android.permission.DETECT_SCREEN_CAPTURE")) {
            ggp0 ggp0Var = new ggp0(i, screenshotsDetector);
            requireActivity.registerScreenCaptureCallback(requireActivity.getMainExecutor(), ggp0Var);
            screenshotsDetector.b = ggp0Var;
        }
        hep0 screenRecordingDetector = getScreenRecordingDetector();
        FragmentActivity requireActivity2 = requireActivity();
        screenRecordingDetector.getClass();
        if (i2 < 35 || !rje.g(requireActivity2, "android.permission.DETECT_SCREEN_RECORDING")) {
            return;
        }
        try {
            c90 c90Var = new c90(17, screenRecordingDetector);
            requireActivity2.getWindowManager().addScreenRecordingCallback(requireActivity2.getMainExecutor(), c90Var);
            screenRecordingDetector.a = c90Var;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    @Override // defpackage.ce4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onBackPressed() {
        View view;
        Lifecycle.State state;
        Lifecycle lifecycle;
        if (onPlusHomeBottomSheetBackPressed() || closeBottomSheet()) {
            return true;
        }
        if ((kotlin.collections.a.b0(getParentFragmentManager().c.f()) instanceof NavigationFragment) && (getLastVisibleFragment() instanceof InitialFragment) && getChildFragmentManager().K() == 1) {
            getRouter().f();
        }
        kp51 navigator = getNavigator();
        FragmentManager fragmentManager = navigator.i;
        fragmentManager.C();
        Fragment E = fragmentManager.E(navigator.h);
        Lifecycle.State b = (E == 0 || (lifecycle = E.getLifecycle()) == null) ? null : lifecycle.b();
        if (E != 0) {
            try {
                view = E.getView();
            } catch (Throwable th) {
                x4c.g("Can't safe get view lifecycle state", th, "fragmentLifecycleState=" + b, null, 8);
            }
        } else {
            view = null;
        }
        if (view != null) {
            state = E.getViewLifecycleOwner().getLifecycle().b();
            if (b != null) {
                Lifecycle.State state2 = Lifecycle.State.CREATED;
                if (b.a(state2) && state != null && state.a(state2)) {
                    ce4 ce4Var = E instanceof ce4 ? (ce4) E : null;
                    if (ce4Var != null && ce4Var.onBackPressed()) {
                        return true;
                    }
                }
            }
            getRouter().e();
            return false;
        }
        state = null;
        if (b != null) {
        }
        getRouter().e();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Window window;
        WindowManager.LayoutParams attributes;
        getLifecycle().a((nop0) ((h9g) getSdkViewComponent()).H.get());
        ((vru) ((h9g) getSdkViewComponent()).I.get()).a.g(requireActivity());
        ((h9g) getSdkViewComponent()).r().a.resumeSession();
        y770 y770Var = (y770) ((h9g) getSdkViewComponent()).v.a2.get();
        Map<String, String> origin = getFragmentArguments().getOrigin();
        AppAnalyticsReporter appAnalyticsReporter = y770Var.a;
        Map map = y770Var.b;
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                appAnalyticsReporter.a("origin." + ((String) ((Map.Entry) it.next()).getKey()), null);
            }
        }
        if (origin != null) {
            for (Map.Entry<String, String> entry : origin.entrySet()) {
                String key = entry.getKey();
                appAnalyticsReporter.a("origin." + key, entry.getValue());
            }
        }
        y770Var.b = origin;
        r90 r90Var = (r90) ((h9g) getSdkViewComponent()).x0.get();
        r90Var.getClass();
        r90Var.e = registerForActivityResult(new j50(), new v50(1, r90Var));
        ((com.ybsdk.utils.b) ((zvt0) ((h9g) getSdkViewComponent()).h0.get())).a();
        ((h9g) getSdkViewComponent()).e().a();
        r0 r0Var = com.ybsdk.core.design.spoiler.d.a;
        com.ybsdk.core.design.spoiler.d.a(getSpoilerManager(), eja1.s(this), this);
        getChildFragmentManager().B = getChildFragmentFactory();
        observeStartSessionResponse();
        boolean z = savedInstanceState != null ? savedInstanceState.getBoolean(KEY_SHOULD_RESTORE_CHILD_FRAGMENTS) : false;
        if (!z) {
            savedInstanceState = null;
        }
        super.onCreate(savedInstanceState);
        this.hasRestoredChildFragments = checkAllChildFragmentsShouldBeRestored();
        FragmentActivity activity = getActivity();
        this.initialWindowFlags = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : Integer.valueOf(attributes.flags);
        if (!isShownAsSlidableView()) {
            getInsetsController().b(true);
        }
        if (!this.hasRestoredChildFragments) {
            if (z) {
                x4c.g("Can't restore child fragments in NavigationFragment", null, null, null, 14);
            }
            safeClearFragments();
        }
        e.H(eja1.s(this), new jqr(((p860) ((n860) ((h9g) getSdkViewComponent()).B0.get())).b(), new NavigationFragment$onCreate$1(2, null), 3));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FrameLayout frameLayout;
        int i = 0;
        if (isShownAsSlidableView()) {
            RootSlideableModalView rootSlideableModalView = new RootSlideableModalView(inflater.getContext(), null, 0, 6, null);
            this.binding = s861.o(rootSlideableModalView);
            this.slideableModalView = rootSlideableModalView;
            frameLayout = rootSlideableModalView;
        } else {
            s861 o = s861.o(getLayoutInflater().inflate(qmh0.ybsdk_slideable_modal_view_content, container, false));
            this.binding = o;
            setGripVisible(false);
            frameLayout = o.a;
        }
        hs51 ybInsetsHandlingHelper = getYbInsetsHandlingHelper();
        s861 s861Var = this.binding;
        if (s861Var == null) {
            s861Var = null;
        }
        boolean z = ybInsetsHandlingHelper.b;
        FrameLayout frameLayout2 = s861Var.a;
        if (!ybInsetsHandlingHelper.a) {
            com.ybsdk.core.utils.ext.view.b.w(frameLayout2, new gs51(i, s861Var, ybInsetsHandlingHelper));
        } else if (z) {
            com.ybsdk.core.utils.ext.view.b.w(frameLayout2, new gp51(2, s861Var));
        } else {
            frameLayout2.setFitsSystemWindows(true);
        }
        if (z && !ybInsetsHandlingHelper.c) {
            com.ybsdk.core.utils.ext.view.b.w(s861Var.g, new dy31(12));
        }
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ((h9g) getSdkViewComponent()).r().a.pauseSession();
    }

    @Override // com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view;
        lcb1.d(requireView());
        reportClosed();
        Fragment fragment = this.hostFragment;
        if (fragment != null && (view = fragment.getView()) != null) {
            view.setImportantForAccessibility(1);
        }
        getChildFragmentManager().r0(this.childLifecycleCallbacks);
        this.fragmentTraces.clear();
        this.spoilerGestureDetector = null;
        ((h9g) getSdkViewComponent()).n().getClass();
        super.onDestroyView();
        restoreWindowFlags();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        ggp0 ggp0Var;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            igp0 screenshotsDetector = getScreenshotsDetector();
            screenshotsDetector.getClass();
            if (Build.VERSION.SDK_INT >= 34 && rje.g(activity, "android.permission.DETECT_SCREEN_CAPTURE") && (ggp0Var = screenshotsDetector.b) != null) {
                activity.unregisterScreenCaptureCallback(ggp0Var);
            }
            screenshotsDetector.a = null;
            screenshotsDetector.b = null;
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            hep0 screenRecordingDetector = getScreenRecordingDetector();
            if (Build.VERSION.SDK_INT >= 35) {
                screenRecordingDetector.getClass();
                if (rje.g(activity2, "android.permission.DETECT_SCREEN_RECORDING")) {
                    try {
                        c90 c90Var = screenRecordingDetector.a;
                        if (c90Var != null) {
                            activity2.getWindowManager().removeScreenRecordingCallback(c90Var);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            screenRecordingDetector.getClass();
            screenRecordingDetector.a = null;
        }
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getCicerone().a.a.a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getCicerone().a.a.b(getNavigator());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        outState.putBoolean(KEY_SHOULD_RESTORE_CHILD_FRAGMENTS, checkAllChildFragmentsShouldBeRestored());
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Object obj;
        observeThemeChanging();
        observeUserPassportUidChanging();
        observePassportAuth();
        requireActivity().getOnBackPressedDispatcher().a(getViewLifecycleOwner(), this.onBackPressedCallback);
        s861 s861Var = this.binding;
        if (s861Var == null) {
            s861Var = null;
        }
        s861Var.e.setOnClickListener(new zgv(19, this));
        s861 s861Var2 = this.binding;
        if (s861Var2 == null) {
            s861Var2 = null;
        }
        s861Var2.e.setStateListAnimator(AnimatorInflater.loadStateListAnimator(view.getContext(), smg0.ybsdk_click_scale_animator));
        s861 s861Var3 = this.binding;
        if (s861Var3 == null) {
            s861Var3 = null;
        }
        s861Var3.g.setListener(this.bottomSheetShownAware);
        s861 s861Var4 = this.binding;
        if (s861Var4 == null) {
            s861Var4 = null;
        }
        s861Var4.e.setVisibility(backButtonCanBeShown() ? 0 : 8);
        s861 s861Var5 = this.binding;
        if (s861Var5 == null) {
            s861Var5 = null;
        }
        androidx.core.view.b.p(s861Var5.e, new mg(25, this));
        getChildFragmentManager().d0(this.childLifecycleCallbacks, true);
        initBottomSheetAccessibility();
        r0 r0Var = ((vvt0) getSpoilerManager()).d;
        Boolean valueOf = Boolean.valueOf(((vvt0) getSpoilerManager()).a());
        r0Var.getClass();
        r0Var.m(null, valueOf);
        initDetector();
        view.setClickable(true);
        List f = getParentFragmentManager().c.f();
        ListIterator listIterator = f.listIterator(f.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            Fragment fragment = (Fragment) obj;
            if (fragment.getView() != null && !fragment.equals(this)) {
                break;
            }
        }
        Fragment fragment2 = (Fragment) obj;
        this.hostFragment = fragment2;
        if (fragment2 != null) {
            eja1.s(fragment2).c(new NavigationFragment$onViewCreated$3(this, null));
        }
        ((com.ybsdk.rconfig.d) ((h9g) getSdkViewComponent()).v.E1.get()).b();
        reportOpened();
        com.ybsdk.rconfig.b q = ((h9g) getSdkViewComponent()).q();
        q.getClass();
        if (((CommonFeatureFlag) q.d(wlp.E0).getData()).isEnabled()) {
            tje.N(eja1.s(this), null, null, new NavigationFragment$onViewCreated$4(this, null), 3);
        }
        if (!this.hasRestoredChildFragments) {
            x8g x8gVar = ((h9g) getSdkViewComponent()).v;
            if (savedInstanceState == null) {
                y750 y750Var = this.navigationHelper;
                InternalScreenIntent screenIntent = getFragmentArguments().getScreenIntent();
                j3h h = ((h9g) getSdkViewComponent()).h();
                y750Var.getClass();
                BaseDeeplinkAction action = screenIntent.getDeeplink().getAction();
                ((h9g) getSdkViewComponent()).t().i(((action instanceof DeeplinkAction.OpenEsia) && ((DeeplinkAction.OpenEsia) action).isCredit()) ? ((l3h) h).f(screenIntent.getDeeplink()) : ((l3h) h).f(screenIntent.getDeeplink()));
                this.hasDeepLinkBeenHandled = true;
            } else {
                h9g h9gVar = (h9g) getSdkViewComponent();
                h9gVar.getClass();
                ((h9g) getSdkViewComponent()).t().i(((l3h) ((h9g) getSdkViewComponent()).h()).f(new u470((com.ybsdk.rconfig.b) h9gVar.v.A.get()).a()));
            }
        }
        getReporter().d.a.a("authentication.opening_screens_after_screen_intent_process", null);
        super.onViewCreated(view, null);
        getViewLifecycleOwner().getLifecycle().a((c4u0) ((x8g) YBSdk.INSTANCE.getDaggerSdkComponent$yb_sdk_sdkRelease()).f1.get());
        checkForRootedDevice();
        RootSlideableModalView rootSlideableModalView = this.slideableModalView;
        if (rootSlideableModalView != null) {
            rootSlideableModalView.setOnBackPressedListener(new s750(this, 6));
            rootSlideableModalView.setOnDismissManuallyListener(new s750(this, 7));
        }
        initEducationsIgnoreShadowTags();
        ((h9g) getSdkViewComponent()).n().getClass();
    }

    @Override // defpackage.m650
    public l650 overrideNavigationBarColor(z1x0 colors) {
        z1x0 z1x0Var = this.navigationBarColorOverride;
        this.navigationBarColorOverride = colors;
        updateNavigationBarColor();
        return new t750(this, z1x0Var);
    }

    @Override // defpackage.f8u0
    public e8u0 overrideStatusBarColor(z1x0 colors) {
        z1x0 z1x0Var = this.statusBarColorsOverride;
        this.statusBarColorsOverride = colors;
        updateStatusBarColor();
        return new t750(this, z1x0Var);
    }

    @Override // defpackage.bnp0
    public void setBottomSheetBackgroundVisible(boolean visible) {
        RootSlideableModalView rootSlideableModalView = this.slideableModalView;
        if (rootSlideableModalView != null) {
            rootSlideableModalView.setBottomSheetBackgroundVisible(visible);
        }
    }

    @Override // defpackage.bnp0
    public void setGripVisible(boolean visible) {
        s861 s861Var = this.binding;
        if (s861Var == null) {
            s861Var = null;
        }
        ((View) s861Var.d.c).setVisibility((isShownAsSlidableView() && visible) ? 0 : 8);
    }

    @Override // defpackage.bnp0
    public void updateBackground() {
        v40 lastVisibleFragment = getLastVisibleFragment();
        nlp0 nlp0Var = lastVisibleFragment instanceof nlp0 ? (nlp0) lastVisibleFragment : null;
        if (nlp0Var != null) {
            setBackground(nlp0Var.getSdkBackground());
        }
    }

    @Override // defpackage.m650
    public void updateNavigationBarColor() {
        Window window;
        Window window2;
        ColorModel colorModel;
        ThemedParams themedParams;
        Boolean bool;
        if (isShownAsSlidableView()) {
            return;
        }
        z1x0 z1x0Var = this.navigationBarColorOverride;
        if (z1x0Var == null) {
            v40 lastVisibleFragment = getLastVisibleFragment();
            k650 k650Var = lastVisibleFragment instanceof k650 ? (k650) lastVisibleFragment : null;
            z1x0Var = k650Var != null ? k650Var.getNavigationBarColorModel() : null;
        }
        getInsetsController().a(z1x0Var == null || (themedParams = z1x0Var.b) == null || (bool = (Boolean) themedParams.get(requireContext())) == null ? ((r0) getThemeType()).getValue() == ThemeType.LIGHT : !bool.booleanValue());
        int i = (z1x0Var == null || (colorModel = z1x0Var.a) == null) ? z1x0.d.get(requireContext()) : colorModel.get(requireContext());
        FragmentActivity activity = getActivity();
        if (activity != null && (window2 = activity.getWindow()) != null) {
            window2.setNavigationBarColor(i);
        }
        boolean z = Color.alpha(i) == 0;
        FragmentActivity activity2 = getActivity();
        if (activity2 == null || (window = activity2.getWindow()) == null) {
            return;
        }
        window.setNavigationBarContrastEnforced(!z);
    }

    @Override // defpackage.zqq0
    public void updateSensitiveDataMode(wqq0 sensitiveDataConfig) {
        yqq0 sensitiveDataMode = sensitiveDataConfig != null ? sensitiveDataConfig.getSensitiveDataMode() : null;
        if (jl40.l(sensitiveDataMode, dab1.Q) || sensitiveDataMode == null) {
            enableScreenshots();
            return;
        }
        if (sensitiveDataMode instanceof xqq0) {
            disableScreenshots();
            return;
        }
        if (!sensitiveDataMode.equals(h2b1.P)) {
            w511.b();
            return;
        }
        com.ybsdk.rconfig.b q = ((h9g) getSdkViewComponent()).q();
        q.getClass();
        if (((CommonFeatureFlag) q.d(wlp.l).getData()).isEnabled()) {
            disableScreenshots();
        } else {
            enableScreenshots();
        }
    }

    @Override // defpackage.r5t0
    public void updateSoftInputMode() {
        Window window;
        v40 lastVisibleFragment = getLastVisibleFragment();
        p5t0 p5t0Var = lastVisibleFragment instanceof p5t0 ? (p5t0) lastVisibleFragment : null;
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(p5t0Var != null ? p5t0Var.getSoftInputModeFlag() : 16);
    }

    @Override // defpackage.f8u0
    public void updateStatusBarColor() {
        Window window;
        ColorModel colorModel;
        ThemedParams themedParams;
        Boolean bool;
        if (isShownAsSlidableView()) {
            return;
        }
        z1x0 z1x0Var = this.statusBarColorsOverride;
        if (z1x0Var == null) {
            v40 lastVisibleFragment = getLastVisibleFragment();
            d8u0 d8u0Var = lastVisibleFragment instanceof d8u0 ? (d8u0) lastVisibleFragment : null;
            z1x0Var = d8u0Var != null ? d8u0Var.getStatusBarColorModel() : null;
        }
        r751 insetsController = getInsetsController();
        boolean z = false;
        if (z1x0Var == null || (themedParams = z1x0Var.b) == null || (bool = (Boolean) themedParams.get(requireContext())) == null ? ((r0) getThemeType()).getValue() == ThemeType.LIGHT : !bool.booleanValue()) {
            z = true;
        }
        insetsController.b(z);
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setStatusBarColor((z1x0Var == null || (colorModel = z1x0Var.a) == null) ? z1x0.c.get(requireContext()) : colorModel.get(requireContext()));
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/navigation/NavigationFragment$NavigationFragmentArguments;", "Landroid/os/Parcelable;", "Lcom/ybsdk/api/YBSdkVisualParams;", "visualParams", "Lcom/ybsdk/navigation/InternalScreenIntent;", "screenIntent", "", "", "origin", "<init>", "(Lcom/ybsdk/api/YBSdkVisualParams;Lcom/ybsdk/navigation/InternalScreenIntent;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/ybsdk/api/YBSdkVisualParams;", "getVisualParams", "()Lcom/ybsdk/api/YBSdkVisualParams;", "Lcom/ybsdk/navigation/InternalScreenIntent;", "getScreenIntent", "()Lcom/ybsdk/navigation/InternalScreenIntent;", "Ljava/util/Map;", "getOrigin", "()Ljava/util/Map;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NavigationFragmentArguments implements Parcelable {
        public static final Parcelable.Creator<NavigationFragmentArguments> CREATOR = new Creator();
        private final Map<String, String> origin;
        private final InternalScreenIntent screenIntent;
        private final YBSdkVisualParams visualParams;

        public NavigationFragmentArguments(YBSdkVisualParams yBSdkVisualParams, InternalScreenIntent internalScreenIntent, Map<String, String> map) {
            this.visualParams = yBSdkVisualParams;
            this.screenIntent = internalScreenIntent;
            this.origin = map;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Map<String, String> getOrigin() {
            return this.origin;
        }

        public final InternalScreenIntent getScreenIntent() {
            return this.screenIntent;
        }

        public final YBSdkVisualParams getVisualParams() {
            return this.visualParams;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.visualParams.writeToParcel(dest, flags);
            this.screenIntent.writeToParcel(dest, flags);
            Map<String, String> map = this.origin;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator s = x4e.s(dest, 1, map);
            while (s.hasNext()) {
                Map.Entry entry = (Map.Entry) s.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NavigationFragmentArguments> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NavigationFragmentArguments createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                YBSdkVisualParams createFromParcel = YBSdkVisualParams.CREATOR.createFromParcel(parcel);
                InternalScreenIntent createFromParcel2 = InternalScreenIntent.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = xvz.b(parcel, linkedHashMap2, parcel.readString(), i, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new NavigationFragmentArguments(createFromParcel, createFromParcel2, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NavigationFragmentArguments[] newArray(int i) {
                return new NavigationFragmentArguments[i];
            }
        }
    }

    public /* synthetic */ NavigationFragment(dxj0 dxj0Var, y750 y750Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(dxj0Var, y750Var);
    }

    public NavigationFragment() {
        this(new dxj0(new s400()), new y750(new u750()));
    }
}
