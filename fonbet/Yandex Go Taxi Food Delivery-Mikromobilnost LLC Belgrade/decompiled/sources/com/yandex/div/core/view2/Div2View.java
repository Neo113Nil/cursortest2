package com.yandex.div.core.view2;

import android.animation.Animator;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.R;
import androidx.transition.Scene;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.dagger.Div2ViewComponent;
import com.yandex.div.core.view2.divs.n;
import com.yandex.div.core.view2.divs.o;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.histogram.HistogramConfiguration$DefaultHistogramConfiguration;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.state.db.StateEntry;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivTransitionSelector;
import com.yandex.div2.DivTransitionTrigger;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.a6u0;
import defpackage.aw5;
import defpackage.b64;
import defpackage.b7;
import defpackage.bek;
import defpackage.bf10;
import defpackage.br60;
import defpackage.bw5;
import defpackage.c3k;
import defpackage.cq90;
import defpackage.cxk;
import defpackage.d0d;
import defpackage.d3k;
import defpackage.dbl;
import defpackage.dpl;
import defpackage.dq90;
import defpackage.dx5;
import defpackage.dxg;
import defpackage.e090;
import defpackage.e3k;
import defpackage.egk;
import defpackage.ekl;
import defpackage.eq90;
import defpackage.ew5;
import defpackage.f3k;
import defpackage.f3l;
import defpackage.ffx;
import defpackage.fkl;
import defpackage.fp31;
import defpackage.fpl;
import defpackage.fu11;
import defpackage.fw5;
import defpackage.g3k;
import defpackage.g5k;
import defpackage.gkl;
import defpackage.gt6;
import defpackage.gtq0;
import defpackage.gw5;
import defpackage.gy01;
import defpackage.h3k;
import defpackage.hgk;
import defpackage.hxk;
import defpackage.hxy;
import defpackage.i3k;
import defpackage.i3y;
import defpackage.ibl;
import defpackage.ie10;
import defpackage.igy0;
import defpackage.iis0;
import defpackage.j73;
import defpackage.jl40;
import defpackage.jll;
import defpackage.jzv;
import defpackage.kvo;
import defpackage.kz;
import defpackage.l6o;
import defpackage.llu;
import defpackage.lz;
import defpackage.m3k;
import defpackage.mmk;
import defpackage.n2k0;
import defpackage.na3;
import defpackage.ngd0;
import defpackage.nkl;
import defpackage.nlk;
import defpackage.ny61;
import defpackage.o400;
import defpackage.o430;
import defpackage.ofi0;
import defpackage.omk;
import defpackage.opl;
import defpackage.pey;
import defpackage.pfi0;
import defpackage.qfi0;
import defpackage.qha1;
import defpackage.qjk;
import defpackage.qkl;
import defpackage.qmk;
import defpackage.qrq0;
import defpackage.r400;
import defpackage.res0;
import defpackage.rvo;
import defpackage.rzo;
import defpackage.s1b0;
import defpackage.s1s;
import defpackage.sjh;
import defpackage.sls;
import defpackage.sr31;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tvo;
import defpackage.u2k;
import defpackage.udq0;
import defpackage.unr0;
import defpackage.uxi0;
import defpackage.uyj;
import defpackage.v3c;
import defpackage.v3k;
import defpackage.vhl;
import defpackage.vng;
import defpackage.vsi0;
import defpackage.vz;
import defpackage.w2l;
import defpackage.w511;
import defpackage.wfx;
import defpackage.whl;
import defpackage.wkk;
import defpackage.wsi0;
import defpackage.wwg;
import defpackage.x43;
import defpackage.x4c;
import defpackage.xhl;
import defpackage.xkl0;
import defpackage.y2l;
import defpackage.y6k;
import defpackage.ykl0;
import defpackage.yuf0;
import defpackage.z2k;
import defpackage.zdk;
import defpackage.zmk;
import defpackage.znl;
import defpackage.zol;
import defpackage.zv5;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0088\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB'\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0018\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0017¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u0018\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0017¢\u0006\u0004\b\u0018\u0010\u001bJ!\u0010\u001c\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001c\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJM\u0010#\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\"\u001a\u00020\u000e2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0017¢\u0006\u0004\b#\u0010$J7\u0010%\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010&J-\u0010)\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0017¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0016H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0016H\u0016¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0016H\u0016¢\u0006\u0004\b0\u0010.J\u000f\u00104\u001a\u000201H\u0010¢\u0006\u0004\b2\u00103J\u0017\u00107\u001a\u00020\u000e2\u0006\u00106\u001a\u000205H\u0017¢\u0006\u0004\b7\u00108J7\u0010>\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u0007H\u0014¢\u0006\u0004\b>\u0010?J\u001f\u0010B\u001a\u00020\u00162\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u0007H\u0014¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\u00162\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0016H\u0014¢\u0006\u0004\bH\u0010.J\u000f\u0010I\u001a\u00020\u0016H\u0014¢\u0006\u0004\bI\u0010.J\u001f\u0010N\u001a\u00020\u00162\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ/\u0010S\u001a\u00020\u000e2\u0006\u0010P\u001a\u00020\u00112\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\bS\u0010\u001eJ\u0017\u0010V\u001a\u00020\u00162\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u0016H\u0016¢\u0006\u0004\bX\u0010.J\u000f\u0010Y\u001a\u00020\u0016H\u0016¢\u0006\u0004\bY\u0010.J\u000f\u0010Z\u001a\u00020\u0016H\u0016¢\u0006\u0004\bZ\u0010.J\u001f\u0010\\\u001a\u00020\u00162\u0006\u0010[\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u0016H\u0016¢\u0006\u0004\b^\u0010.J\u001f\u0010\\\u001a\u00020\u00162\u0006\u0010_\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\\\u0010`J-\u0010c\u001a\u00020\u00162\f\u0010a\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010b\u001a\u00020\u000eH\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\u000e2\u0006\u0010e\u001a\u00020 H\u0016¢\u0006\u0004\bf\u0010gJ\u0017\u0010j\u001a\u00020\u00162\u0006\u0010i\u001a\u00020hH\u0016¢\u0006\u0004\bj\u0010kJ\u0017\u0010l\u001a\u00020\u00162\u0006\u0010i\u001a\u00020hH\u0016¢\u0006\u0004\bl\u0010kJ\u0017\u0010p\u001a\u00020\u00162\u0006\u0010i\u001a\u00020mH\u0010¢\u0006\u0004\bn\u0010oJ\u0017\u0010r\u001a\u00020\u00162\u0006\u0010i\u001a\u00020mH\u0010¢\u0006\u0004\bq\u0010oJ\u000f\u0010s\u001a\u00020\u0016H\u0016¢\u0006\u0004\bs\u0010.J\u0011\u0010w\u001a\u0004\u0018\u00010tH\u0010¢\u0006\u0004\bu\u0010vJ\u000f\u0010x\u001a\u00020\u0016H\u0016¢\u0006\u0004\bx\u0010.J\u000f\u0010y\u001a\u00020\u0016H\u0016¢\u0006\u0004\by\u0010.J.\u0010\u0080\u0001\u001a\u00020\u00162\u0006\u0010{\u001a\u00020z2\b\b\u0002\u0010}\u001a\u00020|2\b\b\u0002\u0010\u007f\u001a\u00020~H\u0017¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J.\u0010\u0082\u0001\u001a\u00020\u000e2\u0006\u0010{\u001a\u00020z2\b\b\u0002\u0010}\u001a\u00020|2\b\b\u0002\u0010\u007f\u001a\u00020~H\u0017¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001c\u0010\u0086\u0001\u001a\u00020\u00162\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001c\u0010\u008a\u0001\u001a\u00020\u00162\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001H\u0016¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0013\u0010\u008c\u0001\u001a\u00030\u0088\u0001H\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0012\u0010\u008e\u0001\u001a\u00020\u0013H\u0017¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001c\u0010\u0092\u0001\u001a\u00020\u00162\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001H\u0016¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0011\u0010\u0094\u0001\u001a\u00020\u0016H\u0016¢\u0006\u0005\b\u0094\u0001\u0010.J\u001c\u0010\u0097\u0001\u001a\u00020\u00162\b\u0010\u0096\u0001\u001a\u00030\u0095\u0001H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0011\u0010\u0099\u0001\u001a\u00020\u0016H\u0016¢\u0006\u0005\b\u0099\u0001\u0010.J\u0019\u0010\u009a\u0001\u001a\u00020\u000e2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0005\b\u009a\u0001\u00108J\u0012\u0010\u009b\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0015\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009d\u0001H\u0016¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u0012\u0010 \u0001\u001a\u00020\u0000H\u0016¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0012\u0010¢\u0001\u001a\u00020~H\u0016¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u001b\u0010¥\u0001\u001a\u00020\u00162\u0007\u0010¤\u0001\u001a\u00020|H\u0016¢\u0006\u0006\b¥\u0001\u0010¦\u0001J$\u0010¥\u0001\u001a\u00020\u00162\u0007\u0010¤\u0001\u001a\u00020|2\u0007\u0010§\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0006\b¥\u0001\u0010¨\u0001J\u001b\u0010©\u0001\u001a\u00020\u00162\u0007\u0010¤\u0001\u001a\u00020|H\u0016¢\u0006\u0006\b©\u0001\u0010¦\u0001J\u0011\u0010ª\u0001\u001a\u00020\u0016H\u0016¢\u0006\u0005\bª\u0001\u0010.J\u0019\u0010«\u0001\u001a\u00020\u00162\u0006\u0010E\u001a\u00020DH\u0014¢\u0006\u0005\b«\u0001\u0010GJ.\u0010®\u0001\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020D2\t\u0010¬\u0001\u001a\u0004\u0018\u00010L2\u0007\u0010\u00ad\u0001\u001a\u00020\tH\u0014¢\u0006\u0006\b®\u0001\u0010¯\u0001J$\u0010´\u0001\u001a\u00020\u00162\u0007\u0010°\u0001\u001a\u00020L2\u0007\u0010±\u0001\u001a\u00020tH\u0010¢\u0006\u0006\b²\u0001\u0010³\u0001J\u001d\u0010·\u0001\u001a\u0004\u0018\u00010t2\u0007\u0010°\u0001\u001a\u00020LH\u0010¢\u0006\u0006\bµ\u0001\u0010¶\u0001J'\u0010»\u0001\u001a\u0005\u0018\u00010º\u00012\u0007\u0010¸\u0001\u001a\u00020|2\u0007\u0010¹\u0001\u001a\u00020|H\u0016¢\u0006\u0006\b»\u0001\u0010¼\u0001J$\u0010¿\u0001\u001a\u00020\u00162\u0007\u0010½\u0001\u001a\u00020|2\u0007\u0010¾\u0001\u001a\u00020|H\u0016¢\u0006\u0006\b¿\u0001\u0010À\u0001J/\u0010Ã\u0001\u001a\u00020\u000e2\u0007\u0010Á\u0001\u001a\u00020|2\u0007\u0010¾\u0001\u001a\u00020|2\t\b\u0002\u0010Â\u0001\u001a\u00020~H\u0017¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J\u001d\u0010Æ\u0001\u001a\u0004\u0018\u00010t2\u0007\u0010°\u0001\u001a\u00020LH\u0010¢\u0006\u0006\bÅ\u0001\u0010¶\u0001J\u001e\u0010É\u0001\u001a\u0005\u0018\u00010È\u00012\u0007\u0010Ç\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J\"\u0010Ï\u0001\u001a\u00020\u00162\u000e\u0010Ì\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160Ë\u0001H\u0010¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J\"\u0010Ð\u0001\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0012¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\u001c\u0010Ò\u0001\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0012¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J\u0011\u0010Ô\u0001\u001a\u00020\u0016H\u0012¢\u0006\u0005\bÔ\u0001\u0010.J-\u0010Õ\u0001\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0012¢\u0006\u0005\bÕ\u0001\u0010\u001eJ9\u0010Ö\u0001\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\"\u001a\u00020\u000eH\u0012¢\u0006\u0005\bÖ\u0001\u0010&J\u0011\u0010×\u0001\u001a\u00020\u0016H\u0012¢\u0006\u0005\b×\u0001\u0010.J\u0011\u0010Ø\u0001\u001a\u00020\u0016H\u0012¢\u0006\u0005\bØ\u0001\u0010.J\u0019\u0010Ù\u0001\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H\u0012¢\u0006\u0005\bÙ\u0001\u0010,J5\u0010Ý\u0001\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u0010Q\u001a\u00020\u00112\u0007\u0010Ú\u0001\u001a\u00020\u00112\b\u0010Ü\u0001\u001a\u00030Û\u0001H\u0012¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001J,\u0010à\u0001\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010Ü\u0001\u001a\u00030ß\u0001H\u0012¢\u0006\u0006\bà\u0001\u0010á\u0001J\u001c\u0010ã\u0001\u001a\u00020\u00162\b\u0010â\u0001\u001a\u00030È\u0001H\u0012¢\u0006\u0006\bã\u0001\u0010ä\u0001J\u001c\u0010å\u0001\u001a\u00020\u00162\b\u0010â\u0001\u001a\u00030È\u0001H\u0012¢\u0006\u0006\bå\u0001\u0010ä\u0001J\u0011\u0010æ\u0001\u001a\u00020\u0016H\u0012¢\u0006\u0005\bæ\u0001\u0010.J\u0011\u0010ç\u0001\u001a\u00020\u0016H\u0012¢\u0006\u0005\bç\u0001\u0010.J\u0019\u0010Z\u001a\u00020\u00162\u0007\u0010è\u0001\u001a\u00020\u000eH\u0012¢\u0006\u0005\bZ\u0010é\u0001J\u0011\u0010ê\u0001\u001a\u00020\u0016H\u0012¢\u0006\u0005\bê\u0001\u0010.J\u0011\u0010ë\u0001\u001a\u00020\u0016H\u0012¢\u0006\u0005\bë\u0001\u0010.J.\u0010ì\u0001\u001a\u00020\u000e2\b\u0010Q\u001a\u0004\u0018\u00010\u00112\u0006\u0010P\u001a\u00020\u00112\b\u0010Ü\u0001\u001a\u00030ß\u0001H\u0012¢\u0006\u0006\bì\u0001\u0010í\u0001J\u0014\u0010[\u001a\u00020\t*\u00020\u0011H\u0012¢\u0006\u0005\b[\u0010î\u0001J\u0019\u0010â\u0001\u001a\u0005\u0018\u00010È\u0001*\u00020\u0011H\u0012¢\u0006\u0006\bâ\u0001\u0010Ê\u0001J\"\u0010ï\u0001\u001a\u00020\u000e2\u0006\u0010[\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u000eH\u0012¢\u0006\u0006\bï\u0001\u0010ð\u0001JT\u0010ö\u0001\u001a\u00020\u00162\b\u0010Q\u001a\u0004\u0018\u00010\u00112\u0006\u0010P\u001a\u00020\u00112\t\u0010ñ\u0001\u001a\u0004\u0018\u00010t2\b\u0010ò\u0001\u001a\u00030È\u00012\u0007\u0010ó\u0001\u001a\u00020L2\u0007\u0010ô\u0001\u001a\u00020\u000e2\u0007\u0010õ\u0001\u001a\u00020\u000eH\u0012¢\u0006\u0006\bö\u0001\u0010÷\u0001J\"\u0010ø\u0001\u001a\u00020L2\u0006\u0010[\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u000eH\u0012¢\u0006\u0006\bø\u0001\u0010ù\u0001J/\u0010û\u0001\u001a\u00020L2\b\u0010ò\u0001\u001a\u00030È\u00012\u0006\u0010[\u001a\u00020\t2\t\b\u0002\u0010ú\u0001\u001a\u00020\u000eH\u0012¢\u0006\u0006\bû\u0001\u0010ü\u0001J/\u0010ý\u0001\u001a\u00020L2\b\u0010ò\u0001\u001a\u00030È\u00012\u0006\u0010[\u001a\u00020\t2\t\b\u0002\u0010ú\u0001\u001a\u00020\u000eH\u0012¢\u0006\u0006\bý\u0001\u0010ü\u0001J=\u0010\u0080\u0002\u001a\u0005\u0018\u00010ÿ\u00012\b\u0010Q\u001a\u0004\u0018\u00010\u00112\u0006\u0010P\u001a\u00020\u00112\t\u0010ñ\u0001\u001a\u0004\u0018\u00010t2\t\u0010þ\u0001\u001a\u0004\u0018\u00010tH\u0012¢\u0006\u0006\b\u0080\u0002\u0010\u0081\u0002J?\u0010\u0085\u0002\u001a\n\u0012\u0005\u0012\u00030\u0084\u00020\u0083\u00022\t\u0010Ç\u0001\u001a\u0004\u0018\u00010\u00112\u0007\u0010±\u0001\u001a\u00020t2\u0006\u0010\u007f\u001a\u00020~2\u0007\u0010\u0082\u0002\u001a\u00020\u000eH\u0012¢\u0006\u0006\b\u0085\u0002\u0010\u0086\u0002J$\u0010\u0088\u0002\u001a\u00020\u00162\u0006\u0010P\u001a\u00020\u00112\b\u0010Ü\u0001\u001a\u00030\u0087\u0002H\u0012¢\u0006\u0006\b\u0088\u0002\u0010\u0089\u0002J,\u0010\u008b\u0002\u001a\u00020\u000e2\u0006\u0010P\u001a\u00020\u00112\u0006\u0010Q\u001a\u00020\u00112\b\u0010Ü\u0001\u001a\u00030\u008a\u0002H\u0012¢\u0006\u0006\b\u008b\u0002\u0010\u008c\u0002J\u001d\u0010\u008e\u0002\u001a\u00030\u008d\u00022\b\u0010Ü\u0001\u001a\u00030\u008a\u0002H\u0012¢\u0006\u0006\b\u008e\u0002\u0010\u008f\u0002R\u001d\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\u000f\n\u0005\b\u0004\u0010\u0090\u0002\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0015\u0010\n\u001a\u00020\t8\u0012X\u0092\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u0093\u0002R \u0010\u0095\u0002\u001a\u00030\u0094\u00028\u0010X\u0090\u0004¢\u0006\u0010\n\u0006\b\u0095\u0002\u0010\u0096\u0002\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002R\u0017\u0010\u0099\u0002\u001a\u00020\u000e8\u0012X\u0092\u0004¢\u0006\b\n\u0006\b\u0099\u0002\u0010\u009a\u0002R\u0018\u0010\u009c\u0002\u001a\u00030\u009b\u00028\u0012X\u0092\u0004¢\u0006\b\n\u0006\b\u009c\u0002\u0010\u009d\u0002R\u001e\u0010\u009f\u0002\u001a\t\u0012\u0004\u0012\u00020J0\u009e\u00028\u0012X\u0092\u0004¢\u0006\b\n\u0006\b\u009f\u0002\u0010 \u0002R\u001f\u0010¡\u0002\u001a\n\u0012\u0005\u0012\u00030\u0090\u00010\u009e\u00028\u0012X\u0092\u0004¢\u0006\b\n\u0006\b¡\u0002\u0010 \u0002R\u001e\u0010¢\u0002\u001a\t\u0012\u0004\u0012\u00020h0\u009e\u00028\u0012X\u0092\u0004¢\u0006\b\n\u0006\b¢\u0002\u0010 \u0002R\u001e\u0010¤\u0002\u001a\t\u0012\u0004\u0012\u00020m0£\u00028\u0012X\u0092\u0004¢\u0006\b\n\u0006\b¤\u0002\u0010¥\u0002R$\u0010§\u0002\u001a\u000f\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020t0¦\u00028\u0012X\u0092\u0004¢\u0006\b\n\u0006\b§\u0002\u0010¨\u0002R\u001c\u0010ª\u0002\u001a\u0005\u0018\u00010©\u00028\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\bª\u0002\u0010«\u0002R*\u0010¬\u0002\u001a\u00030©\u00028\u0010@\u0010X\u0090\u000e¢\u0006\u0018\n\u0006\b¬\u0002\u0010«\u0002\u001a\u0006\b\u00ad\u0002\u0010®\u0002\"\u0006\b¯\u0002\u0010°\u0002R(\u0010±\u0002\u001a\u00020\u000e8\u0010@\u0010X\u0090\u000e¢\u0006\u0017\n\u0006\b±\u0002\u0010\u009a\u0002\u001a\u0005\b²\u0002\u0010\u0010\"\u0006\b³\u0002\u0010é\u0001R,\u0010µ\u0002\u001a\u0005\u0018\u00010´\u00028\u0010@\u0010X\u0090\u000e¢\u0006\u0018\n\u0006\bµ\u0002\u0010¶\u0002\u001a\u0006\b·\u0002\u0010¸\u0002\"\u0006\b¹\u0002\u0010º\u0002R/\u0010»\u0002\u001a\u00020\u000e8\u0010@\u0010X\u0091\u000e¢\u0006\u001e\n\u0006\b»\u0002\u0010\u009a\u0002\u0012\u0005\b¾\u0002\u0010.\u001a\u0005\b¼\u0002\u0010\u0010\"\u0006\b½\u0002\u0010é\u0001R3\u0010À\u0002\u001a\u0005\u0018\u00010¿\u00028\u0010@\u0010X\u0091\u000e¢\u0006\u001f\n\u0006\bÀ\u0002\u0010Á\u0002\u0012\u0005\bÆ\u0002\u0010.\u001a\u0006\bÂ\u0002\u0010Ã\u0002\"\u0006\bÄ\u0002\u0010Å\u0002R\u001c\u0010Ç\u0002\u001a\u0005\u0018\u00010¿\u00028\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\bÇ\u0002\u0010Á\u0002R\u001c\u0010È\u0002\u001a\u0005\u0018\u00010¿\u00028\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\bÈ\u0002\u0010Á\u0002R.\u0010[\u001a\u00020\t8\u0010@\u0010X\u0091\u000e¢\u0006\u001e\n\u0005\b[\u0010\u0093\u0002\u0012\u0005\bÌ\u0002\u0010.\u001a\u0006\bÉ\u0002\u0010\u009c\u0001\"\u0006\bÊ\u0002\u0010Ë\u0002R$\u0010Î\u0002\u001a\r Í\u0002*\u0005\u0018\u00010\u0088\u00010\u0088\u00018\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\bÎ\u0002\u0010Ï\u0002R\u001c\u0010Ð\u0002\u001a\u0005\u0018\u00010\u008d\u00028\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\bÐ\u0002\u0010Ñ\u0002R)\u0010Ó\u0002\u001a\u0014\u0012\u000f\u0012\r Í\u0002*\u0005\u0018\u00010Ò\u00020Ò\u00020Ë\u00018\u0012X\u0092\u0004¢\u0006\b\n\u0006\bÓ\u0002\u0010Ô\u0002R!\u0010Ú\u0002\u001a\u00030Õ\u00028RX\u0092\u0084\u0002¢\u0006\u0010\n\u0006\bÖ\u0002\u0010×\u0002\u001a\u0006\bØ\u0002\u0010Ù\u0002R\u0018\u0010Ü\u0002\u001a\u00030Û\u00028\u0012X\u0092\u0004¢\u0006\b\n\u0006\bÜ\u0002\u0010Ý\u0002R2\u0010Þ\u0002\u001a\u00020\u00132\u0007\u0010¹\u0001\u001a\u00020\u00138\u0016@PX\u0096\u000e¢\u0006\u0018\n\u0006\bÞ\u0002\u0010ß\u0002\u001a\u0006\bà\u0002\u0010\u008f\u0001\"\u0006\bá\u0002\u0010â\u0002R2\u0010ä\u0002\u001a\u00020\u00132\u0007\u0010ã\u0002\u001a\u00020\u00138\u0016@PX\u0096\u000e¢\u0006\u0018\n\u0006\bä\u0002\u0010ß\u0002\u001a\u0006\bå\u0002\u0010\u008f\u0001\"\u0006\bæ\u0002\u0010â\u0002R.\u0010ç\u0002\u001a\u0004\u0018\u00010\u00112\t\u0010¹\u0001\u001a\u0004\u0018\u00010\u00118\u0012@RX\u0092\u000e¢\u0006\u0010\n\u0006\bç\u0002\u0010è\u0002\"\u0006\bé\u0002\u0010Ó\u0001R,\u0010ë\u0002\u001a\u0005\u0018\u00010ê\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\bë\u0002\u0010ì\u0002\u001a\u0006\bí\u0002\u0010î\u0002\"\u0006\bï\u0002\u0010ð\u0002R\u0019\u0010ñ\u0002\u001a\u00020\t8\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\bñ\u0002\u0010\u0093\u0002R\u001e\u0010ò\u0002\u001a\u00020|8\u0012X\u0093\u0004¢\u0006\u000f\n\u0006\bò\u0002\u0010ó\u0002\u0012\u0005\bô\u0002\u0010.R\u0019\u0010õ\u0002\u001a\u00020\u000e8\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\bõ\u0002\u0010\u009a\u0002R\u0019\u0010ö\u0002\u001a\u00020\u000e8\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\bö\u0002\u0010\u009a\u0002R \u0010ø\u0002\u001a\u00030÷\u00028\u0010X\u0090\u0004¢\u0006\u0010\n\u0006\bø\u0002\u0010ù\u0002\u001a\u0006\bú\u0002\u0010û\u0002R\u0018\u0010ý\u0002\u001a\u00030ü\u00028\u0012X\u0092\u0004¢\u0006\b\n\u0006\bý\u0002\u0010þ\u0002R\u0018\u0010\u0080\u0003\u001a\u00030ÿ\u00028\u0012X\u0092\u0004¢\u0006\b\n\u0006\b\u0080\u0003\u0010\u0081\u0003R*\u0010\u0083\u0003\u001a\u00030\u0082\u00038\u0010@\u0010X\u0090\u000e¢\u0006\u0018\n\u0006\b\u0083\u0003\u0010\u0084\u0003\u001a\u0006\b\u0085\u0003\u0010\u0086\u0003\"\u0006\b\u0087\u0003\u0010\u0088\u0003R \u0010\u008a\u0003\u001a\u00030\u0089\u00038\u0010X\u0090\u0004¢\u0006\u0010\n\u0006\b\u008a\u0003\u0010\u008b\u0003\u001a\u0006\b\u008c\u0003\u0010\u008d\u0003R\u0018\u0010\u008f\u0003\u001a\u00030\u008e\u00038\u0012X\u0092\u0004¢\u0006\b\n\u0006\b\u008f\u0003\u0010\u0090\u0003R \u0010\u0092\u0003\u001a\u00030\u0091\u00038\u0010X\u0090\u0004¢\u0006\u0010\n\u0006\b\u0092\u0003\u0010\u0093\u0003\u001a\u0006\b\u0094\u0003\u0010\u0095\u0003R\u0018\u0010\u0099\u0003\u001a\u00030\u0096\u00038PX\u0090\u0004¢\u0006\b\u001a\u0006\b\u0097\u0003\u0010\u0098\u0003R\u0018\u0010\u009d\u0003\u001a\u00030\u009a\u00038PX\u0090\u0004¢\u0006\b\u001a\u0006\b\u009b\u0003\u0010\u009c\u0003R\u0017\u0010\u009f\u0003\u001a\u00020~8PX\u0090\u0004¢\u0006\b\u001a\u0006\b\u009e\u0003\u0010£\u0001R\u001a\u0010£\u0003\u001a\u0005\u0018\u00010 \u00038PX\u0090\u0004¢\u0006\b\u001a\u0006\b¡\u0003\u0010¢\u0003R\u0016\u0010¥\u0003\u001a\u00020\u000e8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¤\u0003\u0010\u0010R\u0019\u0010Ç\u0001\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\b\u001a\u0006\b¦\u0003\u0010§\u0003R\u0017\u0010ª\u0003\u001a\u00020|8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¨\u0003\u0010©\u0003R.\u0010\u00ad\u0003\u001a\u0004\u0018\u00010|2\t\u0010¹\u0001\u001a\u0004\u0018\u00010|8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b«\u0003\u0010©\u0003\"\u0006\b¬\u0003\u0010¦\u0001R\u0017\u0010°\u0003\u001a\u00020 8PX\u0090\u0004¢\u0006\b\u001a\u0006\b®\u0003\u0010¯\u0003R)\u0010³\u0003\u001a\u00020\u000e2\u0007\u0010¹\u0001\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\b±\u0003\u0010\u0010\"\u0006\b²\u0003\u0010é\u0001R\u0017\u0010´\u0003\u001a\u00020\u000e8Ò\u0002X\u0092\u0004¢\u0006\u0007\u001a\u0005\b´\u0003\u0010\u0010R\u0018\u0010¸\u0003\u001a\u00030µ\u00038RX\u0092\u0004¢\u0006\b\u001a\u0006\b¶\u0003\u0010·\u0003R\u0018\u0010¼\u0003\u001a\u00030¹\u00038RX\u0092\u0004¢\u0006\b\u001a\u0006\bº\u0003\u0010»\u0003R\u0018\u0010À\u0003\u001a\u00030½\u00038RX\u0092\u0004¢\u0006\b\u001a\u0006\b¾\u0003\u0010¿\u0003R\u0018\u0010Ä\u0003\u001a\u00030Á\u00038RX\u0092\u0004¢\u0006\b\u001a\u0006\bÂ\u0003\u0010Ã\u0003R\u0018\u0010È\u0003\u001a\u00030Å\u00038RX\u0092\u0004¢\u0006\b\u001a\u0006\bÆ\u0003\u0010Ç\u0003R\u001d\u0010\u007f\u001a\u00020~*\u0005\u0018\u00010©\u00028RX\u0092\u0004¢\u0006\b\u001a\u0006\bÉ\u0003\u0010Ê\u0003R\u001e\u0010É\u0001\u001a\u0005\u0018\u00010È\u0001*\u00020\u00118RX\u0092\u0004¢\u0006\b\u001a\u0006\bË\u0003\u0010Ê\u0001¨\u0006Ì\u0003"}, d2 = {"Lcom/yandex/div/core/view2/Div2View;", "Lcom/yandex/div/internal/widget/FrameContainerLayout;", "Lfpl;", "Lcom/yandex/div/core/Div2Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "constructorCallTime", "<init>", "(Lcom/yandex/div/core/Div2Context;Landroid/util/AttributeSet;IJ)V", "(Lcom/yandex/div/core/Div2Context;Landroid/util/AttributeSet;I)V", "", "isBackgroundBindingInProgress", "()Z", "Lomk;", Constants.KEY_DATA, "Lzmk;", "tag", "Lkotlin/Function1;", "Lzy11;", "onComplete", "setDataAsync", "(Lomk;Lzmk;Ltls;)V", "oldDivData", "(Lomk;Lomk;Lzmk;Ltls;)V", "setData", "(Lomk;Lzmk;)Z", "(Lomk;Lomk;Lzmk;)Z", "", "Lcom/yandex/div/core/state/b;", "paths", "temporary", "setDataWithStatesAsync", "(Lomk;Lzmk;Ljava/util/List;ZLtls;)V", "setDataWithStates", "(Lomk;Lzmk;Ljava/util/List;Z)Z", "Ly2l;", "patch", "applyPatchAsync", "(Ly2l;Ltls;)V", "applyPatch", "(Ly2l;)Z", "tryLogVisibility", "()V", "discardVisibilityTracking", "trackChildrenVisibility", "Lnlk;", "getCustomContainerChildFactory$div_release", "()Lnlk;", "getCustomContainerChildFactory", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "onAttachedToWindow", "onDetachedFromWindow", "Lhxy;", "loadReference", "Landroid/view/View;", "targetView", "addLoadReference", "(Lhxy;Landroid/view/View;)V", "newData", "oldData", "newDataTag", "prepareForRecycleOrCleanup", "", "throwable", "logError", "(Ljava/lang/Throwable;)V", "loadMedia", "releaseMedia", "cleanup", "stateId", "switchToState", "(JZ)V", "switchToInitialState", StateEntry.COLUMN_PATH, "(Lcom/yandex/div/core/state/b;Z)V", "pathList", "withAnimations", "switchToMultipleStates", "(Ljava/util/List;ZZ)V", "statePath", "isInState", "(Lcom/yandex/div/core/state/b;)Z", "Lqmk;", "observer", "addDivDataChangeObserver", "(Lqmk;)V", "removeDivDataChangeObserver", "Ls1b0;", "addPersistentDivDataObserver$div_release", "(Ls1b0;)V", "addPersistentDivDataObserver", "removePersistentDivDataObserver$div_release", "removePersistentDivDataObserver", "resetToInitialState", "Lm3k;", "rootDiv$div_release", "()Lm3k;", "rootDiv", "startDivAnimation", "stopDivAnimation", "Lv3k;", "action", "", CRLReasonCodeExtension.REASON, "Lrvo;", "resolver", "handleAction", "(Lv3k;Ljava/lang/String;Lrvo;)V", "handleActionWithResult", "(Lv3k;Ljava/lang/String;Lrvo;)Z", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "handleUri", "(Landroid/net/Uri;)V", "Lzol;", "viewConfig", "setConfig", "(Lzol;)V", "getConfig", "()Lzol;", "getDivTag", "()Lzmk;", "Le090;", "listener", "subscribe", "(Le090;)V", "clearSubscriptions", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChangedOutside", "(Landroid/content/res/Configuration;)V", "dismissPendingOverflowMenus", "hasScrollableViewUnder", "getCurrentStateId", "()J", "Lopl;", "getCurrentState", "()Lopl;", "getView", "()Lcom/yandex/div/core/view2/Div2View;", "getExpressionResolver", "()Lrvo;", "tooltipId", "showTooltip", "(Ljava/lang/String;)V", "multiple", "(Ljava/lang/String;Z)V", "hideTooltip", "cancelTooltips", "dispatchDraw", "child", "drawingTime", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "view", "div", "bindViewToDiv$div_release", "(Landroid/view/View;Lm3k;)V", "bindViewToDiv", "takeBindingDiv$div_release", "(Landroid/view/View;)Lm3k;", "takeBindingDiv", "name", "value", "Lcom/yandex/div/data/VariableMutationException;", "setVariable", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/div/data/VariableMutationException;", "id", "command", "applyTimerCommand", "(Ljava/lang/String;Ljava/lang/String;)V", "divId", "expressionResolver", "applyVideoCommand", "(Ljava/lang/String;Ljava/lang/String;Lrvo;)Z", "unbindViewFromDiv$div_release", "unbindViewFromDiv", "divData", "Lmmk;", "stateToBind", "(Lomk;)Lmmk;", "Lkotlin/Function0;", "function", "bulkActions$div_release", "(Lsls;)V", "bulkActions", "updateRuntimeStore", "(Lomk;Lzmk;)V", "tryAttachVariableTriggers", "(Lomk;)V", "updateTimers", "setDataInternal", "setDataWithStatesInternal", "notifyBindStarted", "notifyBindEnded", "applyPatchInternal", "newDivData", "Ldq90;", "reporter", "tryApplyPatch", "(Ly2l;Lomk;Lomk;Ldq90;)Z", "Ls1s;", "updateNow", "(Lomk;Lzmk;Ls1s;)Z", ClidProvider.STATE, "trackStateVisibility", "(Lmmk;)V", "discardStateVisibility", "discardChildrenVisibility", "sendCreationHistograms", "removeChildren", "(Z)V", "stopLoadAndSubscriptions", "cancelImageLoads", "switchToDivData", "(Lomk;Lomk;Ls1s;)Z", "(Lomk;)J", "forceSwitchToState", "(JZ)Z", "oldDiv", "newState", "newStateView", "allowsTransition", "bindBeforeViewAdded", "addNewStateViewWithTransition", "(Lomk;Lomk;Lm3k;Lmmk;Landroid/view/View;ZZ)V", "updateState", "(JZ)Landroid/view/View;", "isUpdateTemporary", "buildViewAndUpdateState", "(Lmmk;JZ)Landroid/view/View;", "buildViewAsyncAndUpdateState", "newDiv", "Landroidx/transition/Transition;", "prepareTransition", "(Lomk;Lomk;Lm3k;Lm3k;)Landroidx/transition/Transition;", "isIncoming", "Lqrq0;", "Lgy01;", "transitionSequence", "(Lomk;Lm3k;Lrvo;Z)Lqrq0;", "Lres0;", "rebind", "(Lomk;Lres0;)V", "Ld0d;", "complexRebind", "(Lomk;Lomk;Ld0d;)Z", "Lpfi0;", "createRebindTask", "(Ld0d;)Lpfi0;", "Lcom/yandex/div/core/Div2Context;", "getContext$div_release", "()Lcom/yandex/div/core/Div2Context;", "J", "Lcom/yandex/div/core/dagger/Div2Component;", "div2Component", "Lcom/yandex/div/core/dagger/Div2Component;", "getDiv2Component$div_release", "()Lcom/yandex/div/core/dagger/Div2Component;", "bindOnAttachEnabled", "Z", "Lz2k;", "divBuilder", "Lz2k;", "", "loadReferences", "Ljava/util/List;", "overflowMenuListeners", "divDataChangedObservers", "Lbr60;", "persistentDivDataObservers", "Lbr60;", "Ljava/util/WeakHashMap;", "viewToDivBindings", "Ljava/util/WeakHashMap;", "Lykl0;", "oldRuntimeStore", "Lykl0;", "runtimeStore", "getRuntimeStore$div_release", "()Lykl0;", "setRuntimeStore$div_release", "(Lykl0;)V", "inMiddleOfBind", "getInMiddleOfBind$div_release", "setInMiddleOfBind$div_release", "Lwhl;", "divTimerEventDispatcher", "Lwhl;", "getDivTimerEventDispatcher$div_release", "()Lwhl;", "setDivTimerEventDispatcher$div_release", "(Lwhl;)V", "forceCanvasClipping", "getForceCanvasClipping", "setForceCanvasClipping", "getForceCanvasClipping$annotations", "Liis0;", "bindOnAttachRunnable", "Liis0;", "getBindOnAttachRunnable$div_release", "()Liis0;", "setBindOnAttachRunnable$div_release", "(Liis0;)V", "getBindOnAttachRunnable$div_release$annotations", "reportBindingResumedRunnable", "reportBindingFinishedRunnable", "getStateId$div_release", "setStateId$div_release", "(J)V", "getStateId$div_release$annotations", "kotlin.jvm.PlatformType", ConfigConstants.CONFIG, "Lzol;", "rebindTask", "Lpfi0;", "Luxi0;", "renderConfig", "Lsls;", "Lcom/yandex/div/histogram/a;", "histogramReporter$delegate", "Li3y;", "getHistogramReporter", "()Lcom/yandex/div/histogram/a;", "histogramReporter", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "dataTag", "Lzmk;", "getDataTag", "setDataTag$div_release", "(Lzmk;)V", "<set-?>", "prevDataTag", "getPrevDataTag", "setPrevDataTag$div_release", "_divData", "Lomk;", "set_divData", "Ly6k;", "actionHandler", "Ly6k;", "getActionHandler", "()Ly6k;", "setActionHandler", "(Ly6k;)V", "timeCreated", "viewCreateCallType", "Ljava/lang/String;", "getViewCreateCallType$annotations", "drawWasSkipped", "mediaWasReleased", "Lnkl;", "divTransitionHandler", "Lnkl;", "getDivTransitionHandler$div_release", "()Lnkl;", "Lgw5;", "bindingReporterProvider", "Lgw5;", "Leq90;", "patchReporterProvider", "Leq90;", "Law5;", "bindingContext", "Law5;", "getBindingContext$div_release", "()Law5;", "setBindingContext$div_release", "(Law5;)V", "Lcom/yandex/div/core/dagger/Div2ViewComponent;", "viewComponent", "Lcom/yandex/div/core/dagger/Div2ViewComponent;", "getViewComponent$div_release", "()Lcom/yandex/div/core/dagger/Div2ViewComponent;", "Lfp31;", "bindingProvider", "Lfp31;", "Ljzv;", "inputFocusTracker", "Ljzv;", "getInputFocusTracker$div_release", "()Ljzv;", "Lwsi0;", "getReleaseViewVisitor$div_release", "()Lwsi0;", "releaseViewVisitor", "Lbf10;", "getMediaReleaseViewVisitor$div_release", "()Lbf10;", "mediaReleaseViewVisitor", "getOldExpressionResolver$div_release", "oldExpressionResolver", "Ln2k0;", "getCurrentRebindReusableList$div_release", "()Ln2k0;", "currentRebindReusableList", "getComplexRebindInProgress$div_release", "complexRebindInProgress", "getDivData", "()Lomk;", "getLogId", "()Ljava/lang/String;", "logId", "getComponentName", "setComponentName", "componentName", "getCurrentRootPath$div_release", "()Lcom/yandex/div/core/state/b;", "currentRootPath", "getVisualErrorsEnabled", "setVisualErrorsEnabled", "visualErrorsEnabled", "isComplexRebindEnabled", "Lznl;", "getDivVideoActionHandler", "()Lznl;", "divVideoActionHandler", "Lcom/yandex/div/core/tooltip/b;", "getTooltipController", "()Lcom/yandex/div/core/tooltip/b;", "tooltipController", "Lie10;", "getMediaLoadViewVisitor", "()Lie10;", "mediaLoadViewVisitor", "Lcom/yandex/div/core/view2/divs/n;", "getLayoutProviderBinder", "()Lcom/yandex/div/core/view2/divs/n;", "layoutProviderBinder", "Lcom/yandex/div/core/util/binding/a;", "getBindingDispatcher", "()Lcom/yandex/div/core/util/binding/a;", "bindingDispatcher", "getResolver", "(Lykl0;)Lrvo;", "getStateToBind", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class Div2View extends FrameContainerLayout implements fpl {
    private omk _divData;
    private y6k actionHandler;
    private final boolean bindOnAttachEnabled;
    private iis0 bindOnAttachRunnable;
    private aw5 bindingContext;
    private final fp31 bindingProvider;
    private final gw5 bindingReporterProvider;
    private zol config;
    private final long constructorCallTime;
    private final Div2Context context;
    private zmk dataTag;
    private final Div2Component div2Component;
    private final z2k divBuilder;
    private final List<qmk> divDataChangedObservers;
    private whl divTimerEventDispatcher;
    private final nkl divTransitionHandler;
    private boolean drawWasSkipped;
    private boolean forceCanvasClipping;
    private final GestureDetector gestureDetector;

    /* renamed from: histogramReporter$delegate, reason: from kotlin metadata */
    private final i3y histogramReporter;
    private boolean inMiddleOfBind;
    private final jzv inputFocusTracker;
    private final List<hxy> loadReferences;
    private boolean mediaWasReleased;
    private ykl0 oldRuntimeStore;
    private final List<e090> overflowMenuListeners;
    private final eq90 patchReporterProvider;
    private final br60 persistentDivDataObservers;
    private zmk prevDataTag;
    private pfi0 rebindTask;
    private final sls renderConfig;
    private iis0 reportBindingFinishedRunnable;
    private iis0 reportBindingResumedRunnable;
    private ykl0 runtimeStore;
    private long stateId;
    private long timeCreated;
    private final Div2ViewComponent viewComponent;
    private final String viewCreateCallType;
    private final WeakHashMap<View, m3k> viewToDivBindings;

    private Div2View(Div2Context div2Context, AttributeSet attributeSet, int i, long j) {
        super(div2Context, attributeSet, i);
        this.context = div2Context;
        this.constructorCallTime = j;
        this.div2Component = getContext().getDiv2Component();
        this.bindOnAttachEnabled = getDiv2Component().u();
        this.divBuilder = getContext().getDiv2Component().v();
        this.loadReferences = new ArrayList();
        this.overflowMenuListeners = new ArrayList();
        this.divDataChangedObservers = new ArrayList();
        this.persistentDivDataObservers = new br60();
        this.viewToDivBindings = new WeakHashMap<>();
        ykl0.a.getClass();
        this.runtimeStore = xkl0.b;
        kvo kvoVar = omk.i;
        this.stateId = -1L;
        this.config = zol.S1;
        this.renderConfig = new sls() { // from class: com.yandex.div.core.view2.Div2View$renderConfig$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (uxi0) ((i3y) ((HistogramConfiguration$DefaultHistogramConfiguration) hxk.b.m(Div2View.this.getContext()).a.a()).d.b).getValue();
            }
        };
        this.histogramReporter = kotlin.a.b(LazyThreadSafetyMode.SYNCHRONIZED, new sls() { // from class: com.yandex.div.core.view2.Div2View$histogramReporter$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                sls slsVar;
                final Div2View div2View = Div2View.this;
                sls slsVar2 = new sls() { // from class: com.yandex.div.core.view2.Div2View$histogramReporter$2.1
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        return Div2View.this.getDiv2Component().l();
                    }
                };
                slsVar = div2View.renderConfig;
                return new com.yandex.div.histogram.a(slsVar2, slsVar);
            }
        });
        this.gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.yandex.div.core.view2.Div2View$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e) {
                Div2View div2View = Div2View.this;
                com.yandex.div.core.view2.divs.a.m(div2View, div2View.getInputFocusTracker());
                return true;
            }
        }, new Handler(Looper.getMainLooper()));
        zmk zmkVar = zmk.b;
        this.dataTag = zmkVar;
        this.prevDataTag = zmkVar;
        this.timeCreated = -1L;
        this.viewCreateCallType = getDiv2Component().f().d.compareAndSet(true, false) ? wkk.f.compareAndSet(true, false) ? "Cold" : "Cool" : "Warm";
        this.drawWasSkipped = true;
        this.divTransitionHandler = new nkl(this);
        this.bindingReporterProvider = new gw5();
        this.patchReporterProvider = new eq90();
        this.bindingContext = new aw5(this, rvo.a);
        Div2ViewComponent.Builder r = getDiv2Component().r();
        r.a(this);
        this.viewComponent = r.build();
        this.bindingProvider = getViewComponent().q();
        this.inputFocusTracker = getViewComponent().j();
        AtomicBoolean atomicBoolean = wkk.e;
        this.timeCreated = udq0.t();
        final vsi0 z = getDiv2Component().z();
        z.getClass();
        pey lifecycleOwner = getContext().getLifecycleOwner();
        if (lifecycleOwner != null) {
            z.a(lifecycleOwner, this);
            return;
        }
        if (!isAttachedToWindow()) {
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.ReleaseManager$observeDivLifecycle$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    this.removeOnAttachStateChangeListener(this);
                    pey o = vng.o(this);
                    if (o != null) {
                        z.a(o, this);
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }
            });
            return;
        }
        pey o = vng.o(this);
        if (o != null) {
            z.a(o, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNewStateViewWithTransition(omk oldData, omk newData, m3k oldDiv, mmk newState, View newStateView, boolean allowsTransition, boolean bindBeforeViewAdded) {
        String id;
        Transition prepareTransition = allowsTransition ? prepareTransition(oldData, newData, oldDiv, newState.a) : null;
        if (prepareTransition != null) {
            Scene scene = (Scene) getTag(R.id.transition_current_scene);
            if (scene != null) {
                scene.c = new b7(20, this);
            }
        } else {
            ngd0.G.p();
            if (fu11.a.a()) {
                rzo.S(this, this);
                removeAllViews();
            } else {
                sjh sjhVar = uyj.a;
                tje.Y(o400.a, new ReleaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1(null, this, this));
            }
        }
        if (bindBeforeViewAdded) {
            hgk E = getDiv2Component().E();
            aw5 bindingContext = getBindingContext();
            m3k m3kVar = newState.a;
            long j = newState.b;
            egk d = m3kVar.d();
            if (d instanceof dbl) {
                dbl dblVar = (dbl) d;
                id = dblVar.p;
                if (id == null) {
                    id = dblVar.x;
                }
            } else {
                id = d.getId();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append(id != null ? ":".concat(id) : "");
            E.b(bindingContext, newStateView, m3kVar, new com.yandex.div.core.state.b(j, EmptyList.a, Collections.singletonList(sb.toString()), 8));
        }
        if (prepareTransition == null) {
            addView(newStateView);
            getViewComponent().i().b(this);
            return;
        }
        TransitionManager.b(this);
        Scene scene2 = new Scene();
        scene2.a = this;
        scene2.b = newStateView;
        com.yandex.div.core.view2.animations.c.a(scene2, prepareTransition);
        TransitionManager.d(scene2, prepareTransition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addNewStateViewWithTransition$lambda$54(Div2View div2View) {
        ngd0.G.p();
        if (fu11.a.a()) {
            rzo.S(div2View, div2View);
            div2View.removeAllViews();
        } else {
            sjh sjhVar = uyj.a;
            tje.Y(o400.a, new ReleaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1(null, div2View, div2View));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean applyPatchInternal(final y2l patch) {
        com.yandex.div.core.c F;
        rvo expressionResolver;
        ngd0 ngd0Var = ngd0.G;
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            ngd0Var.p();
            if (fu11.a.a()) {
                com.yandex.div.core.util.binding.a.a(bindingDispatcher);
                return false;
            }
        }
        bw5 a = bindingDispatcher.b.a();
        try {
            omk omkVar = get_divData();
            if (omkVar == null) {
                a.close();
                return false;
            }
            omk a2 = getDiv2Component().C().a(omkVar, getDataTag(), patch, getExpressionResolver(), this);
            this.patchReporterProvider.getClass();
            r400 r400Var = cq90.a;
            if (a2 != null && tryApplyPatch(patch, omkVar, a2, r400Var)) {
                f3l C = getDiv2Component().C();
                C.a.a.remove(getDataTag());
                Iterator<T> it = this.divDataChangedObservers.iterator();
                if (it.hasNext()) {
                    b64.D(it.next());
                    throw null;
                }
                tryAttachVariableTriggers(a2);
                getDiv2Component().E().a(this);
                com.yandex.div.core.c.c(getDiv2Component().F(), this, getExpressionResolver(), patch.c, "patch");
                a.close();
                return true;
            }
            ngd0Var.p();
            fu11 fu11Var = fu11.a;
            if (fu11Var.a()) {
                F = getDiv2Component().F();
                expressionResolver = getExpressionResolver();
            } else {
                com.yandex.div.core.util.binding.a f = getViewComponent().f();
                ngd0Var.p();
                if (!fu11Var.a()) {
                    f.c(new sls() { // from class: com.yandex.div.core.view2.Div2View$applyPatchInternal$lambda$11$$inlined$runMainThreadAction$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            com.yandex.div.core.c F2 = Div2View.this.getDiv2Component().F();
                            Div2View div2View = Div2View.this;
                            com.yandex.div.core.c.c(F2, div2View, div2View.getExpressionResolver(), patch.d, "patch");
                            return zy11.a;
                        }
                    });
                    a.close();
                    return false;
                }
                F = getDiv2Component().F();
                expressionResolver = getExpressionResolver();
            }
            com.yandex.div.core.c.c(F, this, expressionResolver, patch.d, "patch");
            a.close();
            return false;
        } finally {
        }
    }

    public static /* synthetic */ boolean applyVideoCommand$default(Div2View div2View, String str, String str2, rvo rvoVar, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: applyVideoCommand");
            return false;
        }
        if ((i & 4) != 0) {
            rvoVar = div2View.getExpressionResolver();
        }
        return div2View.applyVideoCommand(str, str2, rvoVar);
    }

    private View buildViewAndUpdateState(mmk newState, long stateId, boolean isUpdateTemporary) {
        String id;
        getDiv2Component().getStateManager().c(getDataTag(), stateId, isUpdateTemporary);
        z2k z2kVar = this.divBuilder;
        m3k m3kVar = newState.a;
        aw5 bindingContext = getBindingContext();
        long j = newState.b;
        egk d = newState.a.d();
        if (d instanceof dbl) {
            dbl dblVar = (dbl) d;
            id = dblVar.p;
            if (id == null) {
                id = dblVar.x;
            }
        } else {
            id = d.getId();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(id != null ? ":".concat(id) : "");
        com.yandex.div.core.state.b bVar = new com.yandex.div.core.state.b(j, EmptyList.a, Collections.singletonList(sb.toString()), 8);
        View a = z2kVar.a(m3kVar, bindingContext, bVar);
        z2kVar.b.b(bindingContext, a, m3kVar, bVar);
        getDiv2Component().E().a(this);
        return a;
    }

    public static /* synthetic */ View buildViewAndUpdateState$default(Div2View div2View, mmk mmkVar, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: buildViewAndUpdateState");
            return null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return div2View.buildViewAndUpdateState(mmkVar, j, z);
    }

    private View buildViewAsyncAndUpdateState(final mmk newState, long stateId, boolean isUpdateTemporary) {
        String id;
        getDiv2Component().getStateManager().c(getDataTag(), stateId, isUpdateTemporary);
        long j = newState.b;
        m3k m3kVar = newState.a;
        egk d = m3kVar.d();
        if (d instanceof dbl) {
            dbl dblVar = (dbl) d;
            id = dblVar.p;
            if (id == null) {
                id = dblVar.x;
            }
        } else {
            id = d.getId();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(id != null ? ":".concat(id) : "");
        final com.yandex.div.core.state.b bVar = new com.yandex.div.core.state.b(j, EmptyList.a, Collections.singletonList(sb.toString()), 8);
        final View a = this.divBuilder.a(m3kVar, getBindingContext(), bVar);
        if (this.bindOnAttachEnabled) {
            setBindOnAttachRunnable$div_release(new iis0(this, new sls() { // from class: com.yandex.div.core.view2.Div2View$buildViewAsyncAndUpdateState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    Div2View div2View = Div2View.this;
                    View view = a;
                    mmk mmkVar = newState;
                    try {
                        div2View.getDiv2Component().E().b(div2View.getBindingContext(), view, mmkVar.a, bVar);
                    } catch (ParsingException e) {
                        if (e.getReason() != ParsingExceptionReason.MISSING_VARIABLE && e.getReason() != ParsingExceptionReason.INVALID_VALUE && e.getReason() != ParsingExceptionReason.TYPE_MISMATCH) {
                            throw e;
                        }
                    }
                    Div2View.this.getDiv2Component().E().a(Div2View.this);
                    return zy11.a;
                }
            }));
            return a;
        }
        getDiv2Component().E().b(getBindingContext(), a, m3kVar, bVar);
        if (isAttachedToWindow()) {
            getDiv2Component().E().a(this);
            return a;
        }
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.Div2View$buildViewAsyncAndUpdateState$$inlined$doOnAttach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                this.removeOnAttachStateChangeListener(this);
                this.getDiv2Component().E().a(this);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
            }
        });
        return a;
    }

    public static /* synthetic */ View buildViewAsyncAndUpdateState$default(Div2View div2View, mmk mmkVar, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: buildViewAsyncAndUpdateState");
            return null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return div2View.buildViewAsyncAndUpdateState(mmkVar, j, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelImageLoads() {
        Iterator<T> it = this.loadReferences.iterator();
        while (it.hasNext()) {
            ((hxy) it.next()).cancel();
        }
        this.loadReferences.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cleanup(boolean removeChildren) {
        pfi0 pfi0Var = this.rebindTask;
        if (pfi0Var != null) {
            pfi0Var.clear();
            this.rebindTask = null;
        }
        discardVisibilityTracking();
        cancelImageLoads();
        int i = 0;
        while (true) {
            if (!(i < getChildCount())) {
                stopLoadAndSubscriptions();
                if (removeChildren) {
                    ngd0.G.p();
                    if (fu11.a.a()) {
                        rzo.S(this, this);
                        removeAllViews();
                    } else {
                        sjh sjhVar = uyj.a;
                        tje.Y(o400.a, new ReleaseUtils$releaseAndRemoveChildren$$inlined$executeOnMainThreadBlocking$1(null, this, this));
                    }
                }
                l6o b = getViewComponent().a().b(get_divData(), getDataTag());
                if (b != null) {
                    b.d();
                }
                o oVar = (o) getLayoutProviderBinder().d.get(get_divData());
                if (oVar != null) {
                    oVar.closeAllSubscription();
                }
                set_divData(null);
                setDataTag$div_release(zmk.b);
                return;
            }
            int i2 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return;
            } else {
                wwg.Y(getMediaReleaseViewVisitor$div_release(), childAt);
                i = i2;
            }
        }
    }

    private boolean complexRebind(omk newData, omk oldData, d0d reporter) {
        Object Y;
        String id;
        ngd0.G.p();
        if (fu11.a.a()) {
            mmk stateToBind = getStateToBind(newData);
            boolean z = false;
            if (stateToBind == null) {
                reporter.getClass();
            } else {
                getHistogramReporter().f();
                set_divData(newData);
                pfi0 pfi0Var = this.rebindTask;
                if (pfi0Var == null) {
                    pfi0Var = createRebindTask(reporter);
                    this.rebindTask = pfi0Var;
                }
                getDiv2Component().getStateManager().c(getDataTag(), stateToBind.b, false);
                ViewGroup viewGroup = (ViewGroup) getView().getChildAt(0);
                long j = stateToBind.b;
                egk d = stateToBind.a.d();
                if (d instanceof dbl) {
                    dbl dblVar = (dbl) d;
                    id = dblVar.p;
                    if (id == null) {
                        id = dblVar.x;
                    }
                } else {
                    id = d.getId();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                sb.append(id != null ? ":".concat(id) : "");
                if (pfi0Var.e(oldData, newData, viewGroup, new com.yandex.div.core.state.b(j, EmptyList.a, Collections.singletonList(sb.toString()), 8))) {
                    requestLayout();
                    getHistogramReporter().e();
                    z = true;
                }
            }
            Y = Boolean.valueOf(z);
        } else {
            sjh sjhVar = uyj.a;
            Y = tje.Y(o400.a, new Div2View$complexRebind$$inlined$executeOnMainThreadBlocking$1(null, this, newData, reporter, oldData));
        }
        return ((Boolean) Y).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public pfi0 createRebindTask(d0d reporter) {
        if (getDiv2Component().D()) {
            return new qfi0(this, getDiv2Component().E(), getOldExpressionResolver$div_release(), getExpressionResolver(), reporter);
        }
        pfi0.Z3.getClass();
        return ofi0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void discardChildrenVisibility() {
        Map e0;
        rvo rvoVar;
        i G = getDiv2Component().G();
        synchronized (this.viewToDivBindings) {
            e0 = tje.e0(this.viewToDivBindings);
        }
        for (Map.Entry entry : e0.entrySet()) {
            View view = (View) entry.getKey();
            m3k m3kVar = (m3k) entry.getValue();
            aw5 v = com.yandex.div.core.view2.divs.a.v(view);
            if (v != null && (rvoVar = v.b) != null) {
                i.l(G, this, rvoVar, null, m3kVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void discardStateVisibility(mmk state) {
        i.l(getDiv2Component().G(), this, getExpressionResolver(), null, state.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean forceSwitchToState(long stateId, boolean temporary) {
        Object obj;
        Object obj2;
        boolean z;
        setStateId$div_release(stateId);
        opl currentState = getCurrentState();
        Long valueOf = currentState != null ? Long.valueOf(currentState.a) : null;
        omk omkVar = get_divData();
        if (omkVar != null) {
            List list = omkVar.c;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                long j = ((mmk) obj).b;
                if (valueOf != null && j == valueOf.longValue()) {
                    break;
                }
            }
            mmk mmkVar = (mmk) obj;
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((mmk) obj2).b == stateId) {
                    break;
                }
            }
            mmk mmkVar2 = (mmk) obj2;
            if (mmkVar2 != null) {
                if (mmkVar != null) {
                    discardStateVisibility(mmkVar);
                }
                trackStateVisibility(mmkVar2);
                View childAt = getChildAt(0);
                if (childAt != null) {
                    ffx.u(childAt);
                }
                if (childAt != null) {
                    if (qjk.b(mmkVar != null ? mmkVar.a : null, mmkVar2.a, getExpressionResolver(), getExpressionResolver())) {
                        z = true;
                        View updateState = !z ? updateState(stateId, temporary) : buildViewAndUpdateState(mmkVar2, stateId, temporary);
                        m3k m3kVar = mmkVar != null ? mmkVar.a : null;
                        int i = qkl.a[((DivTransitionSelector) omkVar.e.a(getExpressionResolver())).ordinal()];
                        addNewStateViewWithTransition(omkVar, omkVar, m3kVar, mmkVar2, updateState, i != 1 || i == 2, z);
                        return true;
                    }
                }
                z = false;
                View updateState2 = !z ? updateState(stateId, temporary) : buildViewAndUpdateState(mmkVar2, stateId, temporary);
                m3k m3kVar2 = mmkVar != null ? mmkVar.a : null;
                int i2 = qkl.a[((DivTransitionSelector) omkVar.e.a(getExpressionResolver())).ordinal()];
                addNewStateViewWithTransition(omkVar, omkVar, m3kVar2, mmkVar2, updateState2, i2 != 1 || i2 == 2, z);
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void getBindOnAttachRunnable$div_release$annotations() {
    }

    private com.yandex.div.core.util.binding.a getBindingDispatcher() {
        return getViewComponent().f();
    }

    private znl getDivVideoActionHandler() {
        return getDiv2Component().d();
    }

    public static /* synthetic */ void getForceCanvasClipping$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.yandex.div.histogram.a getHistogramReporter() {
        return (com.yandex.div.histogram.a) this.histogramReporter.getValue();
    }

    private n getLayoutProviderBinder() {
        return getViewComponent().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ie10 getMediaLoadViewVisitor() {
        return getViewComponent().d();
    }

    private rvo getResolver(ykl0 ykl0Var) {
        com.yandex.div.core.expression.a aVar;
        tvo tvoVar;
        com.yandex.div.core.expression.local.b bVar = ykl0Var instanceof com.yandex.div.core.expression.local.b ? (com.yandex.div.core.expression.local.b) ykl0Var : null;
        return (bVar == null || (aVar = bVar.l) == null || (tvoVar = aVar.a) == null) ? rvo.a : tvoVar;
    }

    public static /* synthetic */ void getStateId$div_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public mmk getStateToBind(omk omkVar) {
        Object obj;
        Iterator it = omkVar.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((mmk) obj).b == getStateId()) {
                break;
            }
        }
        mmk mmkVar = (mmk) obj;
        return mmkVar == null ? (mmk) kotlin.collections.a.R(omkVar.c) : mmkVar;
    }

    private com.yandex.div.core.tooltip.b getTooltipController() {
        return getDiv2Component().t();
    }

    private static /* synthetic */ void getViewCreateCallType$annotations() {
    }

    public static /* synthetic */ void handleAction$default(Div2View div2View, v3k v3kVar, String str, rvo rvoVar, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: handleAction");
            return;
        }
        if ((i & 2) != 0) {
            str = "external";
        }
        if ((i & 4) != 0) {
            rvoVar = div2View.getExpressionResolver();
        }
        div2View.handleAction(v3kVar, str, rvoVar);
    }

    public static /* synthetic */ boolean handleActionWithResult$default(Div2View div2View, v3k v3kVar, String str, rvo rvoVar, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: handleActionWithResult");
            return false;
        }
        if ((i & 2) != 0) {
            str = "external";
        }
        if ((i & 4) != 0) {
            rvoVar = div2View.getExpressionResolver();
        }
        return div2View.handleActionWithResult(v3kVar, str, rvoVar);
    }

    private boolean isComplexRebindEnabled() {
        return getDiv2Component().D();
    }

    private void notifyBindEnded() {
        setInMiddleOfBind$div_release(false);
        Iterator it = this.persistentDivDataObservers.iterator();
        while (it.hasNext()) {
            ((s1b0) it.next()).a();
        }
    }

    private void notifyBindStarted() {
        if (getInMiddleOfBind()) {
            logError(new RuntimeException("New binding started when previous not ended!"));
        }
        setInMiddleOfBind$div_release(true);
        Iterator it = this.persistentDivDataObservers.iterator();
        while (it.hasNext()) {
            ((s1b0) it.next()).b();
        }
    }

    public static /* synthetic */ boolean prepareForRecycleOrCleanup$default(Div2View div2View, omk omkVar, omk omkVar2, zmk zmkVar, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: prepareForRecycleOrCleanup");
            return false;
        }
        if ((i & 2) != 0) {
            omkVar2 = null;
        }
        if ((i & 4) != 0) {
            zmkVar = null;
        }
        return div2View.prepareForRecycleOrCleanup(omkVar, omkVar2, zmkVar);
    }

    private Transition prepareTransition(omk oldData, omk newData, m3k oldDiv, m3k newDiv) {
        if (oldDiv != newDiv) {
            TransitionSet b = getViewComponent().e().b(oldDiv != null ? transitionSequence(oldData, oldDiv, getOldExpressionResolver$div_release(), false) : null, newDiv != null ? transitionSequence(newData, newDiv, getExpressionResolver(), true) : null);
            if (b.h0.size() != 0) {
                getDiv2Component().A();
                b.a(new g3k(b, o430.x, this, newData));
                return b;
            }
        }
        return null;
    }

    private void rebind(final omk newData, final res0 reporter) {
        String id;
        String id2;
        try {
            if (getChildCount() == 0) {
                reporter.getClass();
                updateNow(newData, getDataTag(), reporter);
                return;
            }
            final mmk stateToBind = getStateToBind(newData);
            if (stateToBind == null) {
                reporter.getClass();
                return;
            }
            m3k m3kVar = stateToBind.a;
            long j = stateToBind.b;
            ngd0 ngd0Var = ngd0.G;
            ngd0Var.p();
            fu11 fu11Var = fu11.a;
            boolean a = fu11Var.a();
            EmptyList emptyList = EmptyList.a;
            if (a) {
                getHistogramReporter().f();
                l6o b = getViewComponent().a().b(get_divData(), getDataTag());
                if (b != null) {
                    b.d();
                }
                set_divData(newData);
                getDiv2Component().getStateManager().c(getDataTag(), j, true);
                hgk E = getDiv2Component().E();
                aw5 bindingContext = getBindingContext();
                View childAt = getChildAt(0);
                long j2 = stateToBind.b;
                egk d = m3kVar.d();
                if (d instanceof dbl) {
                    dbl dblVar = (dbl) d;
                    id2 = dblVar.p;
                    if (id2 == null) {
                        id2 = dblVar.x;
                    }
                } else {
                    id2 = d.getId();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(j2);
                sb.append(id2 != null ? ":".concat(id2) : "");
                E.b(bindingContext, childAt, m3kVar, new com.yandex.div.core.state.b(j2, emptyList, Collections.singletonList(sb.toString()), 8));
                requestLayout();
                tryAttachVariableTriggers(newData);
                getHistogramReporter().e();
                reporter.getClass();
                return;
            }
            com.yandex.div.core.util.binding.a f = getViewComponent().f();
            ngd0Var.p();
            if (!fu11Var.a()) {
                f.c(new sls() { // from class: com.yandex.div.core.view2.Div2View$rebind$$inlined$runMainThreadAction$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        String id3;
                        Div2View.this.getHistogramReporter().f();
                        l6o b2 = Div2View.this.getViewComponent().a().b(Div2View.this.get_divData(), Div2View.this.getDataTag());
                        if (b2 != null) {
                            b2.d();
                        }
                        Div2View.this.set_divData(newData);
                        Div2View.this.getDiv2Component().getStateManager().c(Div2View.this.getDataTag(), stateToBind.b, true);
                        hgk E2 = Div2View.this.getDiv2Component().E();
                        aw5 bindingContext2 = Div2View.this.getBindingContext();
                        View childAt2 = Div2View.this.getChildAt(0);
                        mmk mmkVar = stateToBind;
                        m3k m3kVar2 = mmkVar.a;
                        long j3 = mmkVar.b;
                        egk d2 = m3kVar2.d();
                        if (d2 instanceof dbl) {
                            dbl dblVar2 = (dbl) d2;
                            id3 = dblVar2.p;
                            if (id3 == null) {
                                id3 = dblVar2.x;
                            }
                        } else {
                            id3 = d2.getId();
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(j3);
                        sb2.append(id3 != null ? ":".concat(id3) : "");
                        E2.b(bindingContext2, childAt2, m3kVar2, new com.yandex.div.core.state.b(j3, EmptyList.a, Collections.singletonList(sb2.toString()), 8));
                        Div2View.this.requestLayout();
                        Div2View.this.tryAttachVariableTriggers(newData);
                        Div2View.this.getHistogramReporter().e();
                        reporter.getClass();
                        return zy11.a;
                    }
                });
                return;
            }
            getHistogramReporter().f();
            l6o b2 = getViewComponent().a().b(get_divData(), getDataTag());
            if (b2 != null) {
                b2.d();
            }
            set_divData(newData);
            getDiv2Component().getStateManager().c(getDataTag(), j, true);
            hgk E2 = getDiv2Component().E();
            aw5 bindingContext2 = getBindingContext();
            View childAt2 = getChildAt(0);
            long j3 = stateToBind.b;
            egk d2 = m3kVar.d();
            if (d2 instanceof dbl) {
                dbl dblVar2 = (dbl) d2;
                id = dblVar2.p;
                if (id == null) {
                    id = dblVar2.x;
                }
            } else {
                id = d2.getId();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j3);
            sb2.append(id != null ? ":".concat(id) : "");
            E2.b(bindingContext2, childAt2, m3kVar, new com.yandex.div.core.state.b(j3, emptyList, Collections.singletonList(sb2.toString()), 8));
            requestLayout();
            tryAttachVariableTriggers(newData);
            getHistogramReporter().e();
            reporter.getClass();
        } catch (Exception unused) {
            reporter.getClass();
            updateNow(newData, getDataTag(), reporter);
        }
    }

    private void sendCreationHistograms() {
        if (this.timeCreated < 0) {
            return;
        }
        wkk f = getDiv2Component().f();
        long j = this.timeCreated;
        llu l = getDiv2Component().l();
        String str = this.viewCreateCallType;
        f.getClass();
        if (j >= 0) {
            llu.a(l, null, str, null, 20);
            if (f.b.compareAndSet(false, true) && f.a >= 0) {
                llu.a(l, null, f.c, null, 20);
                f.a = -1L;
            }
        }
        this.timeCreated = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean setDataInternal(omk data, omk oldDivData, zmk tag) {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        boolean z = false;
        if (bindingDispatcher.b()) {
            ngd0.G.p();
            if (fu11.a.a()) {
                com.yandex.div.core.util.binding.a.a(bindingDispatcher);
                return false;
            }
        }
        bw5 a = bindingDispatcher.b.a();
        try {
            this.bindingReporterProvider.getClass();
            fw5.X0.getClass();
            x4c x4cVar = ew5.b;
            if (data == null) {
                x4cVar.getClass();
                a.close();
                return false;
            }
            if (get_divData() == data) {
                x4cVar.getClass();
                loadMedia();
                a.close();
                return false;
            }
            this.mediaWasReleased = false;
            notifyBindStarted();
            iis0 bindOnAttachRunnable = getBindOnAttachRunnable();
            if (bindOnAttachRunnable != null) {
                bindOnAttachRunnable.a();
            }
            boolean z2 = true;
            getHistogramReporter().d = true;
            omk omkVar = get_divData();
            omk omkVar2 = omkVar == null ? oldDivData : omkVar;
            updateRuntimeStore(data, tag);
            o oVar = (o) getLayoutProviderBinder().d.get(omkVar2);
            if (oVar != null) {
                oVar.closeAllSubscription();
            }
            setDataTag$div_release(tag);
            dpl.a(getDiv2Component().q(), data, getBindingContext());
            boolean e = qjk.e(omkVar2, data, getStateId(), getOldExpressionResolver$div_release(), getExpressionResolver());
            if (omkVar2 != null) {
                int i = qkl.a[((DivTransitionSelector) data.e.a(getExpressionResolver())).ordinal()];
                if (i != 1 && i != 2) {
                    z2 = false;
                }
                if (!z2) {
                    if (e) {
                        rebind(data, x4cVar);
                    } else if (!getDiv2Component().D() || !(getChildAt(0) instanceof ViewGroup) || !complexRebind(data, omkVar2, x4cVar)) {
                        z = updateNow(data, tag, x4cVar);
                    }
                    getDiv2Component().E().a(this);
                    sendCreationHistograms();
                    notifyBindEnded();
                    a.close();
                    return z;
                }
            }
            z = updateNow(data, tag, x4cVar);
            getDiv2Component().E().a(this);
            sendCreationHistograms();
            notifyBindEnded();
            a.close();
            return z;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean setDataWithStatesInternal(omk data, zmk tag, List<com.yandex.div.core.state.b> paths, boolean temporary) {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            ngd0.G.p();
            if (fu11.a.a()) {
                com.yandex.div.core.util.binding.a.a(bindingDispatcher);
                return false;
            }
        }
        bw5 a = bindingDispatcher.b.a();
        try {
            gw5 gw5Var = this.bindingReporterProvider;
            get_divData();
            gw5Var.getClass();
            fw5.X0.getClass();
            x4c x4cVar = ew5.b;
            if (data == null) {
                x4cVar.getClass();
                a.close();
                return false;
            }
            if (get_divData() == data) {
                x4cVar.getClass();
                loadMedia();
                a.close();
                return false;
            }
            this.mediaWasReleased = false;
            notifyBindStarted();
            iis0 bindOnAttachRunnable = getBindOnAttachRunnable();
            if (bindOnAttachRunnable != null) {
                bindOnAttachRunnable.a();
            }
            boolean z = true;
            getHistogramReporter().d = true;
            omk omkVar = get_divData();
            updateRuntimeStore(data, tag);
            o oVar = (o) getLayoutProviderBinder().d.get(omkVar);
            if (oVar != null) {
                oVar.closeAllSubscription();
            }
            boolean e = qjk.e(omkVar, data, getStateId(), getOldExpressionResolver$div_release(), getExpressionResolver());
            setDataTag$div_release(tag);
            dpl.a(getDiv2Component().q(), data, getBindingContext());
            Iterator<T> it = paths.iterator();
            while (it.hasNext()) {
                getDiv2Component().getStateManager().d(getDivTag().a, (com.yandex.div.core.state.b) it.next(), temporary);
            }
            if (omkVar == null) {
                z = updateNow(data, tag, x4cVar);
            } else if (e) {
                rebind(data, x4cVar);
            } else if (!getDiv2Component().D() || !(getChildAt(0) instanceof ViewGroup) || !complexRebind(data, omkVar, x4cVar)) {
                z = updateNow(data, tag, x4cVar);
            }
            getDiv2Component().E().a(this);
            sendCreationHistograms();
            notifyBindEnded();
            a.close();
            return z;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void set_divData(omk omkVar) {
        this._divData = omkVar;
        updateTimers();
        this.bindingProvider.a(this._divData, getDataTag());
    }

    private mmk state(omk omkVar) {
        Object obj;
        long stateId = stateId(omkVar);
        Iterator it = omkVar.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((mmk) obj).b == stateId) {
                break;
            }
        }
        return (mmk) obj;
    }

    private long stateId(omk omkVar) {
        opl currentState = getCurrentState();
        if (currentState != null) {
            return currentState.a;
        }
        if (!omkVar.c.isEmpty()) {
            return ((mmk) omkVar.c.get(0)).b;
        }
        kvo kvoVar = omk.i;
        return -1L;
    }

    private void stopLoadAndSubscriptions() {
        synchronized (this.viewToDivBindings) {
            this.viewToDivBindings.clear();
        }
        cancelTooltips();
        clearSubscriptions();
        this.divDataChangedObservers.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r3 != 2) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean switchToDivData(final omk oldData, final omk newData, s1s reporter) {
        boolean z;
        fu11 fu11Var;
        m3k m3kVar = null;
        mmk state = oldData != null ? state(oldData) : null;
        final mmk state2 = state(newData);
        setStateId$div_release(stateId(newData));
        if (state2 == null) {
            reporter.getClass();
            return false;
        }
        final View buildViewAsyncAndUpdateState$default = buildViewAsyncAndUpdateState$default(this, state2, getStateId(), false, 4, null);
        if (state != null) {
            discardStateVisibility(state);
        }
        trackStateVisibility(state2);
        if (oldData != null) {
            int i = qkl.a[((DivTransitionSelector) oldData.e.a(getOldExpressionResolver$div_release())).ordinal()];
            if (i != 1) {
            }
            z = true;
            ngd0 ngd0Var = ngd0.G;
            ngd0Var.p();
            fu11Var = fu11.a;
            if (!fu11Var.a()) {
                com.yandex.div.core.util.binding.a g = unr0.g(this, ngd0Var);
                if (!fu11Var.a()) {
                    final boolean z2 = z;
                    final mmk mmkVar = state;
                    g.c(new sls() { // from class: com.yandex.div.core.view2.Div2View$switchToDivData$$inlined$runMainThreadAction$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            Div2View div2View = Div2View.this;
                            omk omkVar = oldData;
                            omk omkVar2 = newData;
                            mmk mmkVar2 = mmkVar;
                            div2View.addNewStateViewWithTransition(omkVar, omkVar2, mmkVar2 != null ? mmkVar2.a : null, state2, buildViewAsyncAndUpdateState$default, z2, false);
                            return zy11.a;
                        }
                    });
                    if (oldData == null) {
                        reporter.getClass();
                        return true;
                    }
                    reporter.getClass();
                    return true;
                }
                if (state != null) {
                    m3kVar = state.a;
                }
            } else if (state != null) {
                m3kVar = state.a;
            }
            addNewStateViewWithTransition(oldData, newData, m3kVar, state2, buildViewAsyncAndUpdateState$default, z, false);
            if (oldData == null) {
            }
        }
        int i2 = qkl.a[((DivTransitionSelector) newData.e.a(getExpressionResolver())).ordinal()];
        if (i2 != 1 && i2 != 2) {
            z = false;
            ngd0 ngd0Var2 = ngd0.G;
            ngd0Var2.p();
            fu11Var = fu11.a;
            if (!fu11Var.a()) {
            }
            addNewStateViewWithTransition(oldData, newData, m3kVar, state2, buildViewAsyncAndUpdateState$default, z, false);
            if (oldData == null) {
            }
        }
        z = true;
        ngd0 ngd0Var22 = ngd0.G;
        ngd0Var22.p();
        fu11Var = fu11.a;
        if (!fu11Var.a()) {
        }
        addNewStateViewWithTransition(oldData, newData, m3kVar, state2, buildViewAsyncAndUpdateState$default, z, false);
        if (oldData == null) {
        }
    }

    private void trackStateVisibility(mmk state) {
        i.l(getDiv2Component().G(), this, getExpressionResolver(), getView(), state.a);
    }

    private qrq0 transitionSequence(omk divData, m3k div, final rvo resolver, final boolean isIncoming) {
        DivTransitionSelector divTransitionSelector;
        Expression expression;
        final x43 x43Var = new x43();
        if (divData == null || (expression = divData.e) == null || (divTransitionSelector = (DivTransitionSelector) expression.a(resolver)) == null) {
            divTransitionSelector = DivTransitionSelector.NONE;
        }
        x43Var.addLast(divTransitionSelector);
        return new jll(div, resolver, new tls() { // from class: com.yandex.div.core.view2.Div2View$transitionSequence$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                m3k m3kVar = (m3k) obj;
                if (m3kVar instanceof u2k) {
                    x43.this.addLast(((u2k) m3kVar).c.M.a(resolver));
                }
                return Boolean.TRUE;
            }
        }, new tls() { // from class: com.yandex.div.core.view2.Div2View$transitionSequence$3
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                if (((m3k) obj) instanceof u2k) {
                    x43.this.removeLast();
                }
                return zy11.a;
            }
        }, new tls() { // from class: com.yandex.div.core.view2.Div2View$transitionSequence$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                boolean z;
                int i;
                String id;
                cxk cxkVar = (cxk) obj;
                boolean z2 = isIncoming;
                x43 x43Var2 = x43Var;
                m3k m3kVar = cxkVar.a;
                rvo rvoVar = cxkVar.b;
                egk d = m3kVar.d();
                List n = d.n();
                if (n != null) {
                    z = n.contains(DivTransitionTrigger.DATA_CHANGE);
                } else {
                    DivTransitionSelector divTransitionSelector2 = (DivTransitionSelector) x43Var2.h();
                    z = divTransitionSelector2 != null && ((i = qkl.a[divTransitionSelector2.ordinal()]) == 1 || i == 2);
                }
                if (z && (id = d.getId()) != null) {
                    if (z2) {
                        DivAppearanceTransition y = d.y();
                        if (y != null) {
                            return new gy01(id, Collections.singletonList(new ekl(y, 1)), rvoVar);
                        }
                    } else {
                        DivChangeTransition k = d.k();
                        fkl fklVar = k != null ? new fkl(k) : null;
                        DivAppearanceTransition j = d.j();
                        ekl eklVar = j != null ? new ekl(j, 2) : null;
                        if (fklVar != null || eklVar != null) {
                            return new gy01(id, j73.A(new gkl[]{fklVar, eklVar}), rvoVar);
                        }
                    }
                }
                return null;
            }
        });
    }

    private boolean tryApplyPatch(y2l patch, omk oldData, omk newDivData, dq90 reporter) {
        m3k m3kVar;
        egk d;
        mmk stateToBind = getStateToBind(newDivData);
        if (stateToBind == null) {
            return false;
        }
        iis0 bindOnAttachRunnable = getBindOnAttachRunnable();
        if (bindOnAttachRunnable != null) {
            bindOnAttachRunnable.a();
        }
        mmk state = state(oldData);
        Object obj = null;
        m3k m3kVar2 = state != null ? state.a : null;
        Iterator it = patch.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jl40.l(((w2l) next).a, (m3kVar2 == null || (d = m3kVar2.d()) == null) ? null : d.getId())) {
                obj = next;
                break;
            }
        }
        w2l w2lVar = (w2l) obj;
        if (w2lVar == null) {
            rebind(oldData, reporter);
            set_divData(newDivData);
            getDiv2Component().E().e(getBindingContext(), getChildAt(0), stateToBind.a);
            return true;
        }
        List list = w2lVar.b;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            int i = wfx.a;
            return false;
        }
        if (list.size() > 1) {
            int i2 = wfx.a;
            m3kVar = (m3k) list.get(0);
        } else {
            m3kVar = (m3k) list.get(0);
        }
        this.bindingReporterProvider.getClass();
        fw5.X0.getClass();
        if (qjk.b(m3kVar2, m3kVar, getExpressionResolver(), getExpressionResolver())) {
            rebind(newDivData, reporter);
            return true;
        }
        if (getDiv2Component().D() && (getChildAt(0) instanceof ViewGroup) && complexRebind(newDivData, oldData, ew5.b)) {
            return true;
        }
        return updateNow(newDivData, getDataTag(), reporter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryAttachVariableTriggers(omk data) {
        mmk state;
        String id;
        if ((this.bindOnAttachEnabled && !getView().isAttachedToWindow()) || data == null || (state = state(data)) == null) {
            return;
        }
        com.yandex.div.core.expression.local.a k = getViewComponent().k();
        m3k m3kVar = state.a;
        long j = state.b;
        egk d = m3kVar.d();
        if (d instanceof dbl) {
            dbl dblVar = (dbl) d;
            id = dblVar.p;
            if (id == null) {
                id = dblVar.x;
            }
        } else {
            id = d.getId();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(id != null ? ":".concat(id) : "");
        com.yandex.div.core.state.b bVar = new com.yandex.div.core.state.b(j, EmptyList.a, Collections.singletonList(sb.toString()), 8);
        k.getClass();
        com.yandex.div.core.expression.a b = getRuntimeStore().b();
        yuf0 yuf0Var = b.c;
        if (yuf0Var != null) {
            yuf0Var.H(this);
        }
        k.b(m3kVar, this, bVar, b);
    }

    private boolean updateNow(omk data, zmk tag, s1s reporter) {
        omk omkVar = get_divData();
        if (omkVar == null) {
            com.yandex.div.histogram.a histogramReporter = getHistogramReporter();
            histogramReporter.getClass();
            histogramReporter.e = Long.valueOf(com.yandex.div.histogram.a.a());
        } else {
            getHistogramReporter().f();
        }
        cleanup(false);
        setDataTag$div_release(tag);
        set_divData(data);
        boolean switchToDivData = switchToDivData(omkVar, data, reporter);
        tryAttachVariableTriggers(data);
        if (omkVar != null) {
            getHistogramReporter().e();
            return switchToDivData;
        }
        if (!this.bindOnAttachEnabled) {
            getHistogramReporter().c();
            return switchToDivData;
        }
        com.yandex.div.histogram.a histogramReporter2 = getHistogramReporter();
        histogramReporter2.getClass();
        histogramReporter2.f = Long.valueOf(com.yandex.div.histogram.a.a());
        this.reportBindingResumedRunnable = new iis0(this, new sls() { // from class: com.yandex.div.core.view2.Div2View$updateNow$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                com.yandex.div.histogram.a histogramReporter3 = Div2View.this.getHistogramReporter();
                histogramReporter3.getClass();
                histogramReporter3.g = Long.valueOf(com.yandex.div.histogram.a.a());
                return zy11.a;
            }
        });
        this.reportBindingFinishedRunnable = new iis0(this, new sls() { // from class: com.yandex.div.core.view2.Div2View$updateNow$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Div2View.this.getHistogramReporter().c();
                return zy11.a;
            }
        });
        return switchToDivData;
    }

    private void updateRuntimeStore(omk data, zmk tag) {
        ykl0 ykl0Var;
        this.oldRuntimeStore = getRuntimeStore();
        setRuntimeStore$div_release(getDiv2Component().c().b(tag, data, this));
        getRuntimeStore().c();
        if (!jl40.l(this.oldRuntimeStore, getRuntimeStore()) && (ykl0Var = this.oldRuntimeStore) != null) {
            ykl0Var.h(this);
        }
        setBindingContext$div_release(new aw5(this, getExpressionResolver()));
        ibl stateManager = getDiv2Component().getStateManager();
        aw5 bindingContext = getBindingContext();
        LinkedHashMap linkedHashMap = stateManager.d;
        String str = tag.a;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = new LinkedHashMap();
            linkedHashMap.put(str, obj);
        }
        new a6u0((Map) obj).h(data, bindingContext);
    }

    private View updateState(long stateId, boolean temporary) {
        View childAt = getView().getChildAt(0);
        getDiv2Component().getStateManager().c(getDataTag(), stateId, temporary);
        getDiv2Component().E().a(this);
        return childAt;
    }

    private void updateTimers() {
        whl divTimerEventDispatcher;
        omk omkVar = get_divData();
        if (omkVar == null) {
            return;
        }
        xhl x = getDiv2Component().x();
        zmk dataTag = getDataTag();
        rvo expressionResolver = getExpressionResolver();
        x.getClass();
        com.yandex.div.core.c cVar = x.a;
        List list = omkVar.d;
        whl whlVar = null;
        if (list != null) {
            l6o a = x.b.a(omkVar, dataTag);
            Map map = x.c;
            String str = dataTag.a;
            Object obj = map.get(str);
            Object obj2 = obj;
            if (obj == null) {
                whl whlVar2 = new whl(a);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.yandex.div.core.timer.b bVar = new com.yandex.div.core.timer.b((vhl) it.next(), cVar, a, expressionResolver);
                    String str2 = bVar.c().c;
                    LinkedHashMap linkedHashMap = whlVar2.b;
                    if (!linkedHashMap.containsKey(str2)) {
                        linkedHashMap.put(str2, bVar);
                    }
                }
                map.put(str, whlVar2);
                obj2 = whlVar2;
            }
            whl whlVar3 = (whl) obj2;
            LinkedHashSet linkedHashSet = whlVar3.c;
            LinkedHashMap linkedHashMap2 = whlVar3.b;
            List<vhl> list2 = list;
            for (vhl vhlVar : list2) {
                String str3 = vhlVar.c;
                if ((linkedHashSet.contains(str3) ? (com.yandex.div.core.timer.b) linkedHashMap2.get(str3) : null) == null) {
                    com.yandex.div.core.timer.b bVar2 = new com.yandex.div.core.timer.b(vhlVar, cVar, a, expressionResolver);
                    String str4 = bVar2.c().c;
                    if (!linkedHashMap2.containsKey(str4)) {
                        linkedHashMap2.put(str4, bVar2);
                    }
                }
            }
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((vhl) it2.next()).c);
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                if (!arrayList.contains(entry.getKey())) {
                    linkedHashMap3.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it3 = linkedHashMap3.values().iterator();
            while (it3.hasNext()) {
                ((com.yandex.div.core.timer.b) it3.next()).g();
            }
            linkedHashSet.clear();
            linkedHashSet.addAll(arrayList);
            whlVar = whlVar3;
        }
        if (!jl40.l(getDivTimerEventDispatcher(), whlVar) && (divTimerEventDispatcher = getDivTimerEventDispatcher()) != null) {
            Iterator it4 = divTimerEventDispatcher.b.values().iterator();
            while (it4.hasNext()) {
                ((com.yandex.div.core.timer.b) it4.next()).f(this);
            }
        }
        setDivTimerEventDispatcher$div_release(whlVar);
        if (whlVar != null) {
            whlVar.a(this);
        }
    }

    public void addDivDataChangeObserver(qmk observer) {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        boolean b = bindingDispatcher.b();
        dx5 dx5Var = bindingDispatcher.c;
        if (b) {
            ngd0.G.p();
            if (fu11.a.a()) {
                try {
                    bindingDispatcher.b.c(dx5Var.a());
                    dx5Var.execute(new c3k(bindingDispatcher, this, 0));
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
        }
        this.divDataChangedObservers.add(observer);
    }

    public void addLoadReference(hxy loadReference, View targetView) {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        boolean b = bindingDispatcher.b();
        dx5 dx5Var = bindingDispatcher.c;
        if (b) {
            ngd0.G.p();
            if (fu11.a.a()) {
                try {
                    bindingDispatcher.b.c(dx5Var.a());
                    dx5Var.execute(new lz(13, bindingDispatcher, this, loadReference));
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
        }
        this.loadReferences.add(loadReference);
    }

    public void addPersistentDivDataObserver$div_release(s1b0 observer) {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        boolean b = bindingDispatcher.b();
        dx5 dx5Var = bindingDispatcher.c;
        if (b) {
            ngd0.G.p();
            if (fu11.a.a()) {
                try {
                    bindingDispatcher.b.c(dx5Var.a());
                    dx5Var.execute(new d3k(bindingDispatcher, this, observer, 0));
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
        }
        this.persistentDivDataObservers.a(observer);
    }

    public boolean applyPatch(y2l patch) {
        return applyPatchInternal(patch);
    }

    public void applyPatchAsync(y2l patch, tls onComplete) {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        try {
            bindingDispatcher.b.c(bindingDispatcher.c.a());
            bindingDispatcher.c.execute(new kz(bindingDispatcher, onComplete, this, patch, 4));
        } catch (IllegalStateException unused) {
        }
    }

    public void applyTimerCommand(String id, String command) {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            ngd0.G.p();
            if (fu11.a.a()) {
                com.yandex.div.core.util.binding.a.a(bindingDispatcher);
                return;
            }
        }
        bw5 a = bindingDispatcher.b.a();
        try {
            whl divTimerEventDispatcher = getDivTimerEventDispatcher();
            if (divTimerEventDispatcher != null) {
                zy11 zy11Var = null;
                com.yandex.div.core.timer.b bVar = divTimerEventDispatcher.c.contains(id) ? (com.yandex.div.core.timer.b) divTimerEventDispatcher.b.get(id) : null;
                if (bVar != null) {
                    bVar.b(command);
                    zy11Var = zy11.a;
                }
                if (zy11Var == null) {
                    divTimerEventDispatcher.a.e(new IllegalArgumentException("Timer with id '" + id + "' does not exist!"));
                }
            }
            a.close();
        } finally {
        }
    }

    public boolean applyVideoCommand(String divId, String command, rvo expressionResolver) {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            ngd0.G.p();
            if (fu11.a.a()) {
                com.yandex.div.core.util.binding.a.a(bindingDispatcher);
                return false;
            }
        }
        bw5 a = bindingDispatcher.b.a();
        try {
            boolean b = getDivVideoActionHandler().b(this, divId, command, expressionResolver);
            a.close();
            return b;
        } finally {
        }
    }

    public void bindViewToDiv$div_release(View view, m3k div) {
        synchronized (this.viewToDivBindings) {
            this.viewToDivBindings.put(view, div);
        }
    }

    public void bulkActions$div_release(sls function) {
        gt6 g = getViewComponent().g();
        g.b++;
        function.invoke();
        int i = g.b - 1;
        g.b = i;
        if (i == 0) {
            g.a();
        }
    }

    public void cancelTooltips() {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            ngd0.G.p();
            if (fu11.a.a()) {
                com.yandex.div.core.util.binding.a.a(bindingDispatcher);
                return;
            }
        }
        bw5 a = bindingDispatcher.b.a();
        try {
            getTooltipController().b(this);
            a.close();
        } finally {
        }
    }

    public void clearSubscriptions() {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            ngd0.G.p();
            if (fu11.a.a()) {
                com.yandex.div.core.util.binding.a.a(bindingDispatcher);
                return;
            }
        }
        bw5 a = bindingDispatcher.b.a();
        try {
            this.overflowMenuListeners.clear();
            a.close();
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void discardVisibilityTracking() {
        List list;
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        boolean b = bindingDispatcher.b();
        dx5 dx5Var = bindingDispatcher.c;
        if (b) {
            ngd0.G.p();
            if (fu11.a.a()) {
                try {
                    bindingDispatcher.b.c(dx5Var.a());
                    dx5Var.execute(new f3k(bindingDispatcher, this, 0));
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
        }
        omk omkVar = get_divData();
        mmk mmkVar = null;
        if (omkVar != null && (list = omkVar.c) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((mmk) next).b == getStateId()) {
                    mmkVar = next;
                    break;
                }
            }
            mmkVar = mmkVar;
        }
        if (mmkVar != null) {
            discardStateVisibility(mmkVar);
        }
        discardChildrenVisibility();
    }

    public void dismissPendingOverflowMenus() {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            ngd0.G.p();
            if (fu11.a.a()) {
                com.yandex.div.core.util.binding.a.a(bindingDispatcher);
                return;
            }
        }
        bw5 a = bindingDispatcher.b.a();
        try {
            Iterator<T> it = this.overflowMenuListeners.iterator();
            while (it.hasNext()) {
                ((g5k) ((e090) it.next())).a();
            }
            a.close();
        } finally {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.drawWasSkipped) {
            com.yandex.div.histogram.a histogramReporter = getHistogramReporter();
            histogramReporter.getClass();
            histogramReporter.k = Long.valueOf(com.yandex.div.histogram.a.a());
        }
        super.dispatchDraw(canvas);
        if (this.drawWasSkipped) {
            getHistogramReporter().d();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.drawWasSkipped = false;
        com.yandex.div.histogram.a histogramReporter = getHistogramReporter();
        histogramReporter.getClass();
        histogramReporter.k = Long.valueOf(com.yandex.div.histogram.a.a());
        super.draw(canvas);
        getHistogramReporter().d();
        this.drawWasSkipped = true;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        if (child != null && child.getVisibility() == 0) {
            com.yandex.div.core.view2.divs.a.r(child, canvas);
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    public y6k getActionHandler() {
        return this.actionHandler;
    }

    /* renamed from: getBindOnAttachRunnable$div_release, reason: from getter */
    public iis0 getBindOnAttachRunnable() {
        return this.bindOnAttachRunnable;
    }

    /* renamed from: getBindingContext$div_release, reason: from getter */
    public aw5 getBindingContext() {
        return this.bindingContext;
    }

    public boolean getComplexRebindInProgress$div_release() {
        if (getDiv2Component().D()) {
            return qha1.h(this.rebindTask);
        }
        return false;
    }

    public String getComponentName() {
        return getHistogramReporter().c;
    }

    public zol getConfig() {
        return this.config;
    }

    /* renamed from: getContext$div_release, reason: from getter */
    public Div2Context getContext() {
        return this.context;
    }

    public n2k0 getCurrentRebindReusableList$div_release() {
        if (getDiv2Component().D()) {
            return qha1.g(this.rebindTask);
        }
        return null;
    }

    public com.yandex.div.core.state.b getCurrentRootPath$div_release() {
        List list;
        Object obj;
        String id;
        omk omkVar = get_divData();
        if (omkVar != null && (list = omkVar.c) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((mmk) obj).b == getStateId()) {
                    break;
                }
            }
            mmk mmkVar = (mmk) obj;
            if (mmkVar != null) {
                long j = mmkVar.b;
                egk d = mmkVar.a.d();
                if (d instanceof dbl) {
                    dbl dblVar = (dbl) d;
                    id = dblVar.p;
                    if (id == null) {
                        id = dblVar.x;
                    }
                } else {
                    id = d.getId();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                sb.append(id != null ? ":".concat(id) : "");
                return new com.yandex.div.core.state.b(j, EmptyList.a, Collections.singletonList(sb.toString()), 8);
            }
        }
        return new com.yandex.div.core.state.b(getStateId(), new ArrayList(), (List) null, 12);
    }

    public opl getCurrentState() {
        omk omkVar = get_divData();
        if (omkVar == null) {
            return null;
        }
        opl a = getDiv2Component().getStateManager().a(getDataTag());
        List<mmk> list = omkVar.c;
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        for (mmk mmkVar : list) {
            if (a != null && mmkVar.b == a.a) {
                return a;
            }
        }
        return null;
    }

    public long getCurrentStateId() {
        return getStateId();
    }

    public nlk getCustomContainerChildFactory$div_release() {
        return getDiv2Component().j();
    }

    public zmk getDataTag() {
        return this.dataTag;
    }

    /* renamed from: getDiv2Component$div_release, reason: from getter */
    public Div2Component getDiv2Component() {
        return this.div2Component;
    }

    /* renamed from: getDivData, reason: from getter */
    public omk get_divData() {
        return this._divData;
    }

    public zmk getDivTag() {
        return getDataTag();
    }

    /* renamed from: getDivTimerEventDispatcher$div_release, reason: from getter */
    public whl getDivTimerEventDispatcher() {
        return this.divTimerEventDispatcher;
    }

    /* renamed from: getDivTransitionHandler$div_release, reason: from getter */
    public nkl getDivTransitionHandler() {
        return this.divTransitionHandler;
    }

    @Override // defpackage.fpl
    public rvo getExpressionResolver() {
        return getResolver(getRuntimeStore());
    }

    public boolean getForceCanvasClipping() {
        return this.forceCanvasClipping;
    }

    /* renamed from: getInMiddleOfBind$div_release, reason: from getter */
    public boolean getInMiddleOfBind() {
        return this.inMiddleOfBind;
    }

    /* renamed from: getInputFocusTracker$div_release, reason: from getter */
    public jzv getInputFocusTracker() {
        return this.inputFocusTracker;
    }

    public String getLogId() {
        String str;
        omk omkVar = get_divData();
        return (omkVar == null || (str = omkVar.b) == null) ? "" : str;
    }

    public bf10 getMediaReleaseViewVisitor$div_release() {
        return getViewComponent().r();
    }

    public rvo getOldExpressionResolver$div_release() {
        return getResolver(this.oldRuntimeStore);
    }

    public zmk getPrevDataTag() {
        return this.prevDataTag;
    }

    public wsi0 getReleaseViewVisitor$div_release() {
        return getViewComponent().p();
    }

    /* renamed from: getRuntimeStore$div_release, reason: from getter */
    public ykl0 getRuntimeStore() {
        return this.runtimeStore;
    }

    /* renamed from: getStateId$div_release, reason: from getter */
    public long getStateId() {
        return this.stateId;
    }

    /* renamed from: getViewComponent$div_release, reason: from getter */
    public Div2ViewComponent getViewComponent() {
        return this.viewComponent;
    }

    public boolean getVisualErrorsEnabled() {
        return getViewComponent().i().f;
    }

    public void handleAction(v3k action, String reason, rvo resolver) {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            ngd0.G.p();
            if (fu11.a.a()) {
                com.yandex.div.core.util.binding.a.a(bindingDispatcher);
                return;
            }
        }
        bw5 a = bindingDispatcher.b.a();
        try {
            handleActionWithResult(action, reason, resolver);
            a.close();
        } finally {
        }
    }

    public boolean handleActionWithResult(v3k action, String reason, rvo resolver) {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        boolean z = false;
        if (bindingDispatcher.b()) {
            ngd0.G.p();
            if (fu11.a.a()) {
                com.yandex.div.core.util.binding.a.a(bindingDispatcher);
                return false;
            }
        }
        bw5 a = bindingDispatcher.b.a();
        try {
            com.yandex.div.core.c F = getDiv2Component().F();
            y6k actionHandler = getActionHandler();
            F.getClass();
            if (((Boolean) action.b.a(resolver)).booleanValue()) {
                z = F.a(this, resolver, action, reason, null, actionHandler);
            }
            a.close();
            return z;
        } finally {
        }
    }

    public void handleUri(Uri uri) {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            ngd0.G.p();
            if (fu11.a.a()) {
                com.yandex.div.core.util.binding.a.a(bindingDispatcher);
                return;
            }
        }
        bw5 a = bindingDispatcher.b.a();
        try {
            y6k actionHandler = getActionHandler();
            if (actionHandler != null && actionHandler.handleActionUrl(uri, this)) {
                a.close();
            } else {
                getDiv2Component().b().handleActionUrl(uri, this);
                a.close();
            }
        } finally {
        }
    }

    public boolean hasScrollableViewUnder(MotionEvent event) {
        return sr31.a(this, event);
    }

    @Override // defpackage.fpl
    public void hideTooltip(String tooltipId) {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            ngd0.G.p();
            if (fu11.a.a()) {
                com.yandex.div.core.util.binding.a.a(bindingDispatcher);
                return;
            }
        }
        bw5 a = bindingDispatcher.b.a();
        try {
            getTooltipController().d(tooltipId);
            a.close();
        } finally {
        }
    }

    public boolean isBackgroundBindingInProgress() {
        return getBindingDispatcher().b();
    }

    public boolean isInState(com.yandex.div.core.state.b statePath) {
        return jl40.l(getDiv2Component().B().a(getDataTag().a, String.valueOf(statePath.d())), statePath.c());
    }

    public void loadMedia() {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        boolean b = bindingDispatcher.b();
        dx5 dx5Var = bindingDispatcher.c;
        if (b) {
            ngd0.G.p();
            if (fu11.a.a()) {
                try {
                    bindingDispatcher.b.c(dx5Var.a());
                    dx5Var.execute(new c3k(bindingDispatcher, this, 1));
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
        }
        if (this.mediaWasReleased) {
            this.mediaWasReleased = false;
            getMediaLoadViewVisitor().i(this);
        }
    }

    public void logError(Throwable throwable) {
        getViewComponent().a().a(get_divData(), getDataTag()).e(throwable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        zv5 zv5Var;
        super.onAttachedToWindow();
        iis0 iis0Var = this.reportBindingResumedRunnable;
        if (iis0Var != null) {
            iis0Var.b();
        }
        tryAttachVariableTriggers(get_divData());
        iis0 bindOnAttachRunnable = getBindOnAttachRunnable();
        if (bindOnAttachRunnable != null) {
            bindOnAttachRunnable.b();
        }
        iis0 iis0Var2 = this.reportBindingFinishedRunnable;
        if (iis0Var2 != null) {
            iis0Var2.b();
        }
        whl divTimerEventDispatcher = getDivTimerEventDispatcher();
        if (divTimerEventDispatcher != null) {
            divTimerEventDispatcher.a(this);
        }
        n layoutProviderBinder = getLayoutProviderBinder();
        Collection collection = (Collection) layoutProviderBinder.e.get(layoutProviderBinder.b.get_divData());
        if (collection != null && !collection.isEmpty()) {
            layoutProviderBinder.a();
        }
        com.yandex.div.core.view2.debugview.b bVar = getViewComponent().i().g;
        if (bVar.l == null && (zv5Var = bVar.g) != null) {
            bVar.l = bVar.b(zv5Var);
        }
    }

    public void onConfigurationChangedOutside(Configuration newConfig) {
        dismissPendingOverflowMenus();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        discardVisibilityTracking();
        whl divTimerEventDispatcher = getDivTimerEventDispatcher();
        if (divTimerEventDispatcher != null) {
            Iterator it = divTimerEventDispatcher.b.values().iterator();
            while (it.hasNext()) {
                ((com.yandex.div.core.timer.b) it.next()).f(this);
            }
        }
        bek o = getViewComponent().o();
        o.getClass();
        LinkedHashMap linkedHashMap = o.b;
        Iterator it2 = new ArrayList(linkedHashMap.values()).iterator();
        while (it2.hasNext()) {
            ((Animator) it2.next()).cancel();
        }
        linkedHashMap.clear();
        getRuntimeStore().j(this);
        n layoutProviderBinder = getLayoutProviderBinder();
        layoutProviderBinder.b.getViewTreeObserver().removeOnPreDrawListener(layoutProviderBinder.f);
        layoutProviderBinder.f = null;
        com.yandex.div.core.view2.debugview.b bVar = getViewComponent().i().g;
        dxg dxgVar = bVar.l;
        if (dxgVar != null) {
            dxgVar.close();
        }
        bVar.l = null;
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        com.yandex.div.histogram.a histogramReporter = getHistogramReporter();
        histogramReporter.getClass();
        histogramReporter.j = Long.valueOf(com.yandex.div.histogram.a.a());
        super.onLayout(changed, left, top, right, bottom);
        tryLogVisibility();
        com.yandex.div.histogram.a histogramReporter2 = getHistogramReporter();
        Long l = histogramReporter2.j;
        if (l != null) {
            histogramReporter2.b().c += com.yandex.div.histogram.a.a() - l.longValue();
        }
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        com.yandex.div.histogram.a histogramReporter = getHistogramReporter();
        histogramReporter.getClass();
        histogramReporter.i = Long.valueOf(com.yandex.div.histogram.a.a());
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        com.yandex.div.histogram.a histogramReporter2 = getHistogramReporter();
        Long l = histogramReporter2.i;
        if (l != null) {
            histogramReporter2.b().b += com.yandex.div.histogram.a.a() - l.longValue();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (getInputFocusTracker().a != null) {
            this.gestureDetector.onTouchEvent(event);
            if (event.getAction() == 0) {
                return true;
            }
        }
        return super.onTouchEvent(event);
    }

    public boolean prepareForRecycleOrCleanup(omk newData, omk oldData, zmk newDataTag) {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            ngd0.G.p();
            if (fu11.a.a()) {
                com.yandex.div.core.util.binding.a.a(bindingDispatcher);
                return false;
            }
        }
        bw5 a = bindingDispatcher.b.a();
        if (newDataTag == null) {
            try {
                newDataTag = new zmk(UUID.randomUUID().toString());
            } finally {
            }
        }
        omk omkVar = get_divData();
        boolean e = qjk.e(omkVar == null ? oldData : omkVar, newData, getStateId(), getExpressionResolver(), getDiv2Component().c().b(newDataTag, newData, this).l.a);
        if (e) {
            int i = 0;
            while (true) {
                if (!(i < getChildCount())) {
                    stopLoadAndSubscriptions();
                    break;
                }
                int i2 = i + 1;
                View childAt = getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                wwg.Y(getReleaseViewVisitor$div_release(), childAt);
                i = i2;
            }
        } else {
            cleanup();
        }
        a.close();
        return e;
    }

    public void releaseMedia() {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        boolean b = bindingDispatcher.b();
        dx5 dx5Var = bindingDispatcher.c;
        int i = 1;
        if (b) {
            ngd0.G.p();
            if (fu11.a.a()) {
                try {
                    bindingDispatcher.b.c(dx5Var.a());
                    dx5Var.execute(new e3k(bindingDispatcher, this, i));
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
        }
        this.mediaWasReleased = true;
        cancelImageLoads();
        int i2 = 0;
        while (true) {
            if (!(i2 < getChildCount())) {
                return;
            }
            int i3 = i2 + 1;
            View childAt = getChildAt(i2);
            if (childAt == null) {
                ny61.s();
                return;
            } else {
                wwg.Y(getMediaReleaseViewVisitor$div_release(), childAt);
                i2 = i3;
            }
        }
    }

    public void removeDivDataChangeObserver(qmk observer) {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        boolean b = bindingDispatcher.b();
        dx5 dx5Var = bindingDispatcher.c;
        if (b) {
            ngd0.G.p();
            if (fu11.a.a()) {
                try {
                    bindingDispatcher.b.c(dx5Var.a());
                    dx5Var.execute(new f3k(bindingDispatcher, this, 1));
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
        }
        this.divDataChangedObservers.remove(observer);
    }

    public void removePersistentDivDataObserver$div_release(s1b0 observer) {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        boolean b = bindingDispatcher.b();
        dx5 dx5Var = bindingDispatcher.c;
        if (b) {
            ngd0.G.p();
            if (fu11.a.a()) {
                try {
                    bindingDispatcher.b.c(dx5Var.a());
                    dx5Var.execute(new d3k(bindingDispatcher, this, observer, 1));
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
        }
        this.persistentDivDataObservers.b(observer);
    }

    public void resetToInitialState() {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            ngd0.G.p();
            if (fu11.a.a()) {
                com.yandex.div.core.util.binding.a.a(bindingDispatcher);
                return;
            }
        }
        bw5 a = bindingDispatcher.b.a();
        try {
            opl currentState = getCurrentState();
            if (currentState != null) {
                currentState.b.clear();
            }
            igy0 B = getDiv2Component().B();
            String str = getDivTag().a;
            synchronized (B.a) {
            }
            switchToInitialState();
            a.close();
        } finally {
        }
    }

    public m3k rootDiv$div_release() {
        mmk state;
        omk omkVar = get_divData();
        if (omkVar == null || (state = state(omkVar)) == null) {
            return null;
        }
        return state.a;
    }

    public void setActionHandler(y6k y6kVar) {
        this.actionHandler = y6kVar;
    }

    public void setBindOnAttachRunnable$div_release(iis0 iis0Var) {
        this.bindOnAttachRunnable = iis0Var;
    }

    public void setBindingContext$div_release(aw5 aw5Var) {
        this.bindingContext = aw5Var;
    }

    public void setComponentName(String str) {
        getHistogramReporter().c = str;
    }

    public void setConfig(zol viewConfig) {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            ngd0.G.p();
            if (fu11.a.a()) {
                com.yandex.div.core.util.binding.a.a(bindingDispatcher);
                return;
            }
        }
        bw5 a = bindingDispatcher.b.a();
        try {
            this.config = viewConfig;
            a.close();
        } finally {
        }
    }

    public boolean setData(omk data, omk oldDivData, zmk tag) {
        if (oldDivData == null) {
            oldDivData = get_divData();
        }
        return setDataInternal(data, oldDivData, new zmk(tag.a));
    }

    public void setDataAsync(omk data, zmk tag, tls onComplete) {
        if (data == get_divData()) {
            loadMedia();
            if (onComplete != null) {
                onComplete.invoke(Boolean.TRUE);
                return;
            }
            return;
        }
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        try {
            bindingDispatcher.b.c(bindingDispatcher.c.a());
            bindingDispatcher.c.execute(new vz(bindingDispatcher, onComplete, this, data, tag, 3));
        } catch (IllegalStateException unused) {
        }
    }

    public void setDataTag$div_release(zmk zmkVar) {
        setPrevDataTag$div_release(this.dataTag);
        this.dataTag = zmkVar;
        this.bindingProvider.a(get_divData(), zmkVar);
    }

    public boolean setDataWithStates(omk data, zmk tag, List<com.yandex.div.core.state.b> paths, boolean temporary) {
        return setDataWithStatesInternal(data, tag, paths, temporary);
    }

    public void setDataWithStatesAsync(omk data, zmk tag, List<com.yandex.div.core.state.b> paths, boolean temporary, tls onComplete) {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        try {
            bindingDispatcher.b.c(bindingDispatcher.c.a());
            bindingDispatcher.c.execute(new i3k(bindingDispatcher, onComplete, this, data, tag, paths, temporary));
        } catch (IllegalStateException unused) {
        }
    }

    public void setDivTimerEventDispatcher$div_release(whl whlVar) {
        this.divTimerEventDispatcher = whlVar;
    }

    public void setForceCanvasClipping(boolean z) {
        this.forceCanvasClipping = z;
    }

    public void setInMiddleOfBind$div_release(boolean z) {
        this.inMiddleOfBind = z;
    }

    public void setPrevDataTag$div_release(zmk zmkVar) {
        this.prevDataTag = zmkVar;
    }

    public void setRuntimeStore$div_release(ykl0 ykl0Var) {
        this.runtimeStore = ykl0Var;
    }

    public void setStateId$div_release(long j) {
        this.stateId = j;
    }

    public VariableMutationException setVariable(String name, String value) {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            ngd0.G.p();
            if (fu11.a.a()) {
                com.yandex.div.core.util.binding.a.a(bindingDispatcher);
                return null;
            }
        }
        bw5 a = bindingDispatcher.b.a();
        try {
            VariableMutationException P = gtq0.P(this, name, value, getExpressionResolver());
            a.close();
            return P;
        } finally {
        }
    }

    public void setVisualErrorsEnabled(boolean z) {
        com.yandex.div.core.view2.errors.a i = getViewComponent().i();
        i.f = z;
        i.c();
    }

    public void showTooltip(String tooltipId) {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            ngd0.G.p();
            if (fu11.a.a()) {
                com.yandex.div.core.util.binding.a.a(bindingDispatcher);
                return;
            }
        }
        bw5 a = bindingDispatcher.b.a();
        try {
            getTooltipController().e(tooltipId, getBindingContext(), false);
            a.close();
        } finally {
        }
    }

    public void startDivAnimation() {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        boolean b = bindingDispatcher.b();
        dx5 dx5Var = bindingDispatcher.c;
        if (b) {
            ngd0.G.p();
            if (fu11.a.a()) {
                try {
                    bindingDispatcher.b.c(dx5Var.a());
                    dx5Var.execute(new c3k(bindingDispatcher, this, 2));
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
        }
        if (getChildCount() > 0) {
            KeyEvent.Callback childAt = getChildAt(0);
            zdk zdkVar = childAt instanceof zdk ? (zdk) childAt : null;
            if (zdkVar != null) {
                zdkVar.startDivAnimation();
            }
        }
    }

    public mmk stateToBind(omk divData) {
        return getStateToBind(divData);
    }

    public void stopDivAnimation() {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        boolean b = bindingDispatcher.b();
        dx5 dx5Var = bindingDispatcher.c;
        if (b) {
            ngd0.G.p();
            if (fu11.a.a()) {
                try {
                    bindingDispatcher.b.c(dx5Var.a());
                    dx5Var.execute(new e3k(bindingDispatcher, this, 2));
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
        }
        if (getChildCount() > 0) {
            KeyEvent.Callback childAt = getChildAt(0);
            zdk zdkVar = childAt instanceof zdk ? (zdk) childAt : null;
            if (zdkVar != null) {
                zdkVar.stopDivAnimation();
            }
        }
    }

    public void subscribe(e090 listener) {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            ngd0.G.p();
            if (fu11.a.a()) {
                com.yandex.div.core.util.binding.a.a(bindingDispatcher);
                return;
            }
        }
        bw5 a = bindingDispatcher.b.a();
        try {
            this.overflowMenuListeners.add(listener);
            a.close();
        } finally {
        }
    }

    public void switchToInitialState() {
        long j;
        omk omkVar = get_divData();
        if (omkVar == null) {
            return;
        }
        List list = omkVar.c;
        if (list.isEmpty()) {
            kvo kvoVar = omk.i;
            j = -1;
        } else {
            j = ((mmk) list.get(0)).b;
        }
        opl currentState = getCurrentState();
        if (currentState != null) {
            j = currentState.a;
        }
        switchToState(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void switchToMultipleStates(List<com.yandex.div.core.state.b> pathList, boolean temporary, boolean withAnimations) {
        mmk mmkVar;
        Object obj;
        List list;
        if (pathList.isEmpty()) {
            return;
        }
        com.yandex.div.core.state.b bVar = pathList.get(0);
        List<com.yandex.div.core.state.b> list2 = pathList;
        Iterator<T> it = list2.iterator();
        while (true) {
            mmkVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((com.yandex.div.core.state.b) obj).a != bVar.a) {
                    break;
                }
            }
        }
        long stateId = getStateId();
        long j = bVar.a;
        if (stateId != j) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                getDiv2Component().getStateManager().d(getDivTag().a, (com.yandex.div.core.state.b) it2.next(), temporary);
            }
            switchToState(j);
            return;
        }
        omk omkVar = get_divData();
        if (omkVar != null && (list = omkVar.c) != null) {
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (((mmk) next).b == j) {
                    mmkVar = next;
                    break;
                }
            }
            mmkVar = mmkVar;
        }
        getViewComponent().g().b(mmkVar, pathList, temporary);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fpl
    public void switchToState(com.yandex.div.core.state.b path, boolean temporary) {
        List list;
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            ngd0.G.p();
            if (fu11.a.a()) {
                com.yandex.div.core.util.binding.a.a(bindingDispatcher);
                return;
            }
        }
        bw5 a = bindingDispatcher.b.a();
        try {
            omk omkVar = get_divData();
            mmk mmkVar = null;
            if (omkVar != null && (list = omkVar.c) != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((mmk) next).b == path.a) {
                        mmkVar = next;
                        break;
                    }
                }
                mmkVar = mmkVar;
            }
            gt6 g = getViewComponent().g();
            g.getClass();
            g.b(mmkVar, Collections.singletonList(path), temporary);
            a.close();
        } finally {
        }
    }

    public m3k takeBindingDiv$div_release(View view) {
        m3k m3kVar;
        synchronized (this.viewToDivBindings) {
            m3kVar = this.viewToDivBindings.get(view);
        }
        return m3kVar;
    }

    public void trackChildrenVisibility() {
        Map e0;
        rvo rvoVar;
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            ngd0.G.p();
            if (fu11.a.a()) {
                try {
                    bindingDispatcher.b.c(bindingDispatcher.c.a());
                    bindingDispatcher.c.execute(new na3(bindingDispatcher, this, false, 1));
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
        }
        i G = getDiv2Component().G();
        synchronized (this.viewToDivBindings) {
            e0 = tje.e0(this.viewToDivBindings);
        }
        for (Map.Entry entry : e0.entrySet()) {
            View view = (View) entry.getKey();
            m3k m3kVar = (m3k) entry.getValue();
            aw5 v = com.yandex.div.core.view2.divs.a.v(view);
            if (v != null && (rvoVar = v.b) != null) {
                if (view.isAttachedToWindow()) {
                    i.l(G, this, rvoVar, view, m3kVar);
                } else {
                    i.l(G, this, rvoVar, null, m3kVar);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void tryLogVisibility() {
        List list;
        omk omkVar = get_divData();
        mmk mmkVar = null;
        if (omkVar != null && (list = omkVar.c) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((mmk) next).b == getStateId()) {
                    mmkVar = next;
                    break;
                }
            }
            mmkVar = mmkVar;
        }
        if (mmkVar != null) {
            trackStateVisibility(mmkVar);
        }
        trackChildrenVisibility();
    }

    public m3k unbindViewFromDiv$div_release(View view) {
        m3k remove;
        synchronized (this.viewToDivBindings) {
            remove = this.viewToDivBindings.remove(view);
        }
        return remove;
    }

    @Override // defpackage.fpl
    public Div2View getView() {
        return this;
    }

    public boolean setData(omk data, zmk tag) {
        return setDataInternal(data, get_divData(), new zmk(tag.a));
    }

    public final void handleAction(v3k v3kVar, String str) {
        handleAction$default(this, v3kVar, str, null, 4, null);
    }

    public final void handleAction(v3k v3kVar) {
        handleAction$default(this, v3kVar, null, null, 6, null);
    }

    public void setDataAsync(omk data, omk oldDivData, zmk tag, tls onComplete) {
        if (data == get_divData()) {
            loadMedia();
            if (onComplete != null) {
                onComplete.invoke(Boolean.TRUE);
                return;
            }
            return;
        }
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        try {
            bindingDispatcher.b.c(bindingDispatcher.c.a());
            bindingDispatcher.c.execute(new h3k(bindingDispatcher, onComplete, this, data, oldDivData, tag));
        } catch (IllegalStateException unused) {
        }
    }

    public final boolean applyVideoCommand(String str, String str2) {
        return applyVideoCommand$default(this, str, str2, null, 4, null);
    }

    @Override // defpackage.fpl
    public void showTooltip(String tooltipId, boolean multiple) {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            ngd0.G.p();
            if (fu11.a.a()) {
                com.yandex.div.core.util.binding.a.a(bindingDispatcher);
                return;
            }
        }
        bw5 a = bindingDispatcher.b.a();
        try {
            getTooltipController().e(tooltipId, getBindingContext(), multiple);
            a.close();
        } finally {
        }
    }

    public final boolean handleActionWithResult(v3k v3kVar, String str) {
        return handleActionWithResult$default(this, v3kVar, str, null, 4, null);
    }

    public final boolean handleActionWithResult(v3k v3kVar) {
        return handleActionWithResult$default(this, v3kVar, null, null, 6, null);
    }

    @Override // defpackage.fpl
    public void switchToState(long stateId, boolean temporary) {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            ngd0.G.p();
            if (fu11.a.a()) {
                com.yandex.div.core.util.binding.a.a(bindingDispatcher);
                return;
            }
        }
        bw5 a = bindingDispatcher.b.a();
        try {
            kvo kvoVar = omk.i;
            if (stateId != -1) {
                iis0 bindOnAttachRunnable = getBindOnAttachRunnable();
                if (bindOnAttachRunnable != null) {
                    bindOnAttachRunnable.a();
                }
                forceSwitchToState(stateId, temporary);
            }
            a.close();
        } finally {
        }
    }

    public void switchToState(long j) {
        switchToState(j, true);
    }

    public void cleanup() {
        com.yandex.div.core.util.binding.a bindingDispatcher = getBindingDispatcher();
        boolean b = bindingDispatcher.b();
        dx5 dx5Var = bindingDispatcher.c;
        if (b) {
            ngd0.G.p();
            if (fu11.a.a()) {
                try {
                    bindingDispatcher.b.c(dx5Var.a());
                    dx5Var.execute(new e3k(bindingDispatcher, this, 0));
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
        }
        cleanup(true);
    }

    public Div2View(Div2Context div2Context, AttributeSet attributeSet) {
        this(div2Context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Div2View(Div2Context div2Context, AttributeSet attributeSet, int i) {
        this(div2Context, attributeSet, i, r0 / 1000);
        long uptimeNanos;
        (true & true ? v3c.a : null).getClass();
        if (Build.VERSION.SDK_INT < 35) {
            uptimeNanos = System.nanoTime();
        } else {
            uptimeNanos = SystemClock.uptimeNanos();
        }
    }

    public /* synthetic */ Div2View(Div2Context div2Context, AttributeSet attributeSet, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(div2Context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, j);
    }

    public Div2View(Div2Context div2Context) {
        this(div2Context, null, 0, 6, null);
    }

    public /* synthetic */ Div2View(Div2Context div2Context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(div2Context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
