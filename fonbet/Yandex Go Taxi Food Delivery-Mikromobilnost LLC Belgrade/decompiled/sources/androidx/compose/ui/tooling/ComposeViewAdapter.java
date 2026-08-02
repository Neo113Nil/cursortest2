package androidx.compose.ui.tooling;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.j;
import androidx.lifecycle.Lifecycle;
import defpackage.a7u0;
import defpackage.af2;
import defpackage.aii0;
import defpackage.aj2;
import defpackage.aud;
import defpackage.bc;
import defpackage.be60;
import defpackage.bj2;
import defpackage.bts;
import defpackage.bud;
import defpackage.cts;
import defpackage.cud;
import defpackage.cvu0;
import defpackage.d4z;
import defpackage.did;
import defpackage.epb1;
import defpackage.evu0;
import defpackage.f6w;
import defpackage.fid;
import defpackage.foc;
import defpackage.fxg;
import defpackage.gtq0;
import defpackage.hyy0;
import defpackage.i421;
import defpackage.i4a1;
import defpackage.i9a;
import defpackage.idt0;
import defpackage.iz40;
import defpackage.j4n;
import defpackage.j73;
import defpackage.jl40;
import defpackage.ju31;
import defpackage.juc;
import defpackage.jws0;
import defpackage.ke31;
import defpackage.lax0;
import defpackage.ldc;
import defpackage.lyc;
import defpackage.m501;
import defpackage.mi91;
import defpackage.mj5;
import defpackage.n0y;
import defpackage.nc0;
import defpackage.ne2;
import defpackage.nje;
import defpackage.ny61;
import defpackage.o430;
import defpackage.og2;
import defpackage.om9;
import defpackage.py01;
import defpackage.q2t0;
import defpackage.qoi0;
import defpackage.qsv;
import defpackage.qwd;
import defpackage.r1z;
import defpackage.r7b1;
import defpackage.rtd;
import defpackage.rvn;
import defpackage.rzo;
import defpackage.s8o;
import defpackage.sb2;
import defpackage.scc;
import defpackage.sed;
import defpackage.sls;
import defpackage.std;
import defpackage.sxe0;
import defpackage.tcc;
import defpackage.tfx;
import defpackage.thd;
import defpackage.tls;
import defpackage.ttd;
import defpackage.ur31;
import defpackage.v4r0;
import defpackage.vhd;
import defpackage.vng;
import defpackage.vtd;
import defpackage.vvf0;
import defpackage.whd;
import defpackage.wls;
import defpackage.wtd;
import defpackage.wwg;
import defpackage.x1u;
import defpackage.xe2;
import defpackage.xhd;
import defpackage.xtd;
import defpackage.y5d;
import defpackage.ybt0;
import defpackage.ycc;
import defpackage.yhd;
import defpackage.zi2;
import defpackage.zpn;
import defpackage.zx01;
import defpackage.zy11;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import kotlin.jvm.internal.MutablePropertyReference0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\n*\u0006{~\u0081\u0001\u0084\u0001\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ7\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J©\u0001\u0010-\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0012\b\u0002\u0010\u001f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u001e\u0018\u00010\u001d2\u0016\b\u0002\u0010 \u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u001e\u0018\u00010\u001d2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020\u000b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u001a2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110(2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110(H\u0001¢\u0006\u0004\b+\u0010,J\u000f\u0010/\u001a\u00020\u0011H\u0000¢\u0006\u0004\b.\u0010\u0015J\r\u00100\u001a\u00020\u000b¢\u0006\u0004\b0\u00101J\u0013\u00103\u001a\u00020\u000b*\u000202H\u0002¢\u0006\u0004\b3\u00104J\u0013\u00105\u001a\u00020\u000b*\u000202H\u0002¢\u0006\u0004\b5\u00104J\u0013\u00107\u001a\u000206*\u000202H\u0002¢\u0006\u0004\b7\u00108J=\u0010?\u001a\u0002062\u0006\u0010:\u001a\u0002092\u0006\u0010\u0003\u001a\u00020;2\f\u0010=\u001a\b\u0012\u0004\u0012\u0002060<2\u000e\u0010>\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010<H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0011H\u0002¢\u0006\u0004\bA\u0010\u0015J\u000f\u0010B\u001a\u00020\u0011H\u0002¢\u0006\u0004\bB\u0010\u0015J\u000f\u0010C\u001a\u00020\u0011H\u0002¢\u0006\u0004\bC\u0010\u0015J\u0013\u0010D\u001a\u00020\u000b*\u000202H\u0002¢\u0006\u0004\bD\u00104J\u001d\u0010G\u001a\u0004\u0018\u00010\u001a*\u0002022\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u0004\u0018\u00010I*\u00020\u001eH\u0002¢\u0006\u0004\bJ\u0010KJ%\u0010N\u001a\u0004\u0018\u00010\u001a*\u00020\u001e2\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\bH\u0002¢\u0006\u0004\bN\u0010OJ\u001d\u0010Q\u001a\u00020\u00112\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00110(H\u0003¢\u0006\u0004\bQ\u0010RJ\u0017\u0010-\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010SR\u0014\u0010T\u001a\u00020\u001a8\u0002X\u0082D¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010#\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010YR\u0016\u0010\"\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010YR(\u0010Z\u001a\b\u0012\u0004\u0012\u0002060<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R(\u0010`\u001a\b\u0012\u0004\u0012\u00020\u001a0<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010[\u001a\u0004\ba\u0010]\"\u0004\bb\u0010_R\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010UR\u0016\u00100\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010YR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u001c\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00110(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010YR\u0016\u0010'\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010UR\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010lR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR(\u0010t\u001a\u00020s8\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0004\bt\u0010u\u0012\u0004\bz\u0010\u0015\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u0014\u0010|\u001a\u00020{8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0015\u0010\u007f\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001b\u0010\u0089\u0001\u001a\u00020\u001a*\u0002028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001b\u0010\u008c\u0001\u001a\u00020\b*\u0002028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u008d\u0001"}, d2 = {"Landroidx/compose/ui/tooling/ComposeViewAdapter;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "changed", "left", "top", "right", "bottom", "Lzy11;", "onLayout", "(ZIIII)V", "onAttachedToWindow", "()V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "", "className", "methodName", "Ljava/lang/Class;", "", "previewWrapperProvider", "parameterProvider", "parameterProviderIndex", "debugPaintBounds", "debugViewInfos", "", "animationClockStartTime", "lookForDesignInfoProviders", "designInfoProvidersArgument", "Lkotlin/Function0;", "onCommit", "onDraw", "init$ui_tooling", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;IZZJZLjava/lang/String;Lsls;Lsls;)V", "init", "dispose$ui_tooling", "dispose", "hasAnimations", "()Z", "Lx1u;", "hasNullSourcePosition", "(Lx1u;)Z", "isNullGroup", "Lur31;", "toViewInfo", "(Lx1u;)Lur31;", "Laud;", "group", "Lybt0;", "", "children", "childrenToStitch", "toViewInfoFactory", "(Laud;Lybt0;Ljava/util/List;Ljava/util/List;)Lur31;", "processViewInfos", "findAndTrackAnimations", "findDesignInfoProviders", "hasDesignInfo", "Lf6w;", "box", "getDesignInfoOrNull", "(Lx1u;Lf6w;)Ljava/lang/String;", "Ljava/lang/reflect/Method;", "getDesignInfoMethodOrNull", "(Ljava/lang/Object;)Ljava/lang/reflect/Method;", RemoteBioParameters.X, RemoteBioParameters.Y, "invokeGetDesignInfo", "(Ljava/lang/Object;II)Ljava/lang/String;", "content", "WrapPreview", "(Lwls;Lfid;I)V", "(Landroid/util/AttributeSet;)V", "TAG", "Ljava/lang/String;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "Z", "viewInfos", "Ljava/util/List;", "getViewInfos$ui_tooling", "()Ljava/util/List;", "setViewInfos$ui_tooling", "(Ljava/util/List;)V", "designInfoList", "getDesignInfoList$ui_tooling", "setDesignInfoList$ui_tooling", "Lwtd;", "slotTableRecord", "Lwtd;", "composableName", "Lhyy0;", "delayedException", "Lhyy0;", "previewComposition", "Lwls;", "Lsls;", "Landroid/graphics/Paint;", "debugBoundsPaint", "Landroid/graphics/Paint;", "Lrtd;", "composition", "Lrtd;", "Lsxe0;", "clock", "Lsxe0;", "getClock$ui_tooling", "()Lsxe0;", "setClock$ui_tooling", "(Lsxe0;)V", "getClock$ui_tooling$annotations", "xhd", "FakeSavedStateRegistryOwner", "Lxhd;", "yhd", "FakeViewModelStoreOwner", "Lyhd;", "whd", "FakeOnBackPressedDispatcherOwner", "Lwhd;", "vhd", "FakeActivityResultRegistryOwner", "Lvhd;", "getFileName", "(Lx1u;)Ljava/lang/String;", "fileName", "getLineNumber", "(Lx1u;)I", "lineNumber", "ui-tooling"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ComposeViewAdapter extends FrameLayout {
    public static final int $stable = 8;
    private final vhd FakeActivityResultRegistryOwner;
    private final whd FakeOnBackPressedDispatcherOwner;
    private final xhd FakeSavedStateRegistryOwner;
    private final yhd FakeViewModelStoreOwner;
    private final String TAG;
    public sxe0 clock;
    private String composableName;
    private final ComposeView composeView;
    private rtd composition;
    private final Paint debugBoundsPaint;
    private boolean debugPaintBounds;
    private boolean debugViewInfos;
    private final hyy0 delayedException;
    private List<String> designInfoList;
    private String designInfoProvidersArgument;
    private boolean hasAnimations;
    private boolean lookForDesignInfoProviders;
    private sls onDraw;
    private wls previewComposition;
    private final wtd slotTableRecord;
    private List<ur31> viewInfos;

    public ComposeViewAdapter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "ComposeViewAdapter";
        this.composeView = new ComposeView(getContext(), null, 0, 6, null);
        EmptyList emptyList = EmptyList.a;
        this.viewInfos = emptyList;
        this.designInfoList = emptyList;
        this.slotTableRecord = new xtd();
        this.composableName = "";
        this.delayedException = new hyy0();
        y5d.a.getClass();
        this.previewComposition = y5d.b;
        this.designInfoProvidersArgument = "";
        this.onDraw = new juc(11);
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(rzo.X(ldc.g));
        this.debugBoundsPaint = paint;
        this.FakeSavedStateRegistryOwner = new xhd();
        this.FakeViewModelStoreOwner = new yhd();
        this.FakeOnBackPressedDispatcherOwner = new whd(this);
        this.FakeActivityResultRegistryOwner = new vhd();
        init(attributeSet);
    }

    private final void WrapPreview(wls wlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-265259911);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(wlsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(this) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            a7u0 a7u0Var = j.j;
            getContext();
            vvf0 a = a7u0Var.a(new m501(29));
            vvf0 a2 = j.k.a(gtq0.g(getContext()));
            qwd qwdVar = d4z.a;
            vvf0 a3 = d4z.a.a(this.FakeOnBackPressedDispatcherOwner);
            qwd qwdVar2 = r1z.a;
            sb2.c(new vvf0[]{a, a2, a3, r1z.a.a(this.FakeActivityResultRegistryOwner)}, wwg.S(-874838087, true, new i9a(24, this, wlsVar), btsVar), btsVar, 56);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(this, wlsVar, i, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 WrapPreview$lambda$0(ComposeViewAdapter composeViewAdapter, wls wlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            r7b1.b(composeViewAdapter.slotTableRecord, wlsVar, btsVar, 0);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 WrapPreview$lambda$1(ComposeViewAdapter composeViewAdapter, wls wlsVar, int i, fid fidVar, int i2) {
        composeViewAdapter.WrapPreview(wlsVar, fidVar, vng.O(i | 1));
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v7 */
    private final void findAndTrackAnimations() {
        Set set;
        char c;
        ?? r17;
        Set set2;
        Set<vtd> set3 = ((xtd) this.slotTableRecord).a;
        ArrayList arrayList = new ArrayList(tcc.n(set3, 10));
        for (vtd vtdVar : set3) {
            f6w f6wVar = jws0.a;
            aud audVar = (aud) a.Q(vtdVar.d());
            arrayList.add(audVar != null ? jws0.h(audVar, null) : rvn.h);
        }
        boolean z = false;
        z = false;
        final int i = 1;
        boolean z2 = this.clock != null;
        ComposeViewAdapter$findAndTrackAnimations$1 composeViewAdapter$findAndTrackAnimations$1 = new ComposeViewAdapter$findAndTrackAnimations$1(this, ComposeViewAdapter.class, "clock", "getClock$ui_tooling()Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", 0);
        final j4n j4nVar = new j4n();
        j4nVar.a = composeViewAdapter$findAndTrackAnimations$1;
        final int i2 = z ? 1 : 0;
        final int i3 = 5;
        zi2 zi2Var = new zi2(i3, new tls() { // from class: yi2
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i4 = i2;
                zy11 zy11Var = zy11.a;
                j4n j4nVar2 = j4nVar;
                switch (i4) {
                    case 0:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((py01) obj);
                        break;
                    case 1:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((af2) obj);
                        break;
                    case 2:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((og2) obj);
                        break;
                    case 3:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521(obj, "animateContentSize"));
                        break;
                    case 4:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521((lax0) obj, "TargetBasedAnimation"));
                        break;
                    case 5:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521((fxg) obj, "DecayAnimation"));
                        break;
                    case 6:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((oe2) obj);
                        break;
                    default:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((rsv) obj);
                        break;
                }
                return zy11Var;
            }
        });
        j4nVar.b = zi2Var;
        final int i4 = 2;
        zi2 zi2Var2 = new zi2(i4, new tls() { // from class: yi2
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i42 = i;
                zy11 zy11Var = zy11.a;
                j4n j4nVar2 = j4nVar;
                switch (i42) {
                    case 0:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((py01) obj);
                        break;
                    case 1:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((af2) obj);
                        break;
                    case 2:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((og2) obj);
                        break;
                    case 3:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521(obj, "animateContentSize"));
                        break;
                    case 4:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521((lax0) obj, "TargetBasedAnimation"));
                        break;
                    case 5:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521((fxg) obj, "DecayAnimation"));
                        break;
                    case 6:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((oe2) obj);
                        break;
                    default:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((rsv) obj);
                        break;
                }
                return zy11Var;
            }
        });
        j4nVar.c = zi2Var2;
        final int i5 = 3;
        zi2 zi2Var3 = new zi2(i5, new tls() { // from class: yi2
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i42 = i4;
                zy11 zy11Var = zy11.a;
                j4n j4nVar2 = j4nVar;
                switch (i42) {
                    case 0:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((py01) obj);
                        break;
                    case 1:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((af2) obj);
                        break;
                    case 2:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((og2) obj);
                        break;
                    case 3:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521(obj, "animateContentSize"));
                        break;
                    case 4:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521((lax0) obj, "TargetBasedAnimation"));
                        break;
                    case 5:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521((fxg) obj, "DecayAnimation"));
                        break;
                    case 6:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((oe2) obj);
                        break;
                    default:
                        ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((rsv) obj);
                        break;
                }
                return zy11Var;
            }
        });
        j4nVar.x = zi2Var3;
        Set f0 = j73.f0(new bj2[]{zi2Var, zi2Var3});
        boolean z3 = ne2.d;
        Set set4 = EmptyList.a;
        if (z3) {
            final int i6 = 6;
            set = Collections.singleton(new zi2(i, new tls() { // from class: yi2
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i42 = i6;
                    zy11 zy11Var = zy11.a;
                    j4n j4nVar2 = j4nVar;
                    switch (i42) {
                        case 0:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((py01) obj);
                            break;
                        case 1:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((af2) obj);
                            break;
                        case 2:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((og2) obj);
                            break;
                        case 3:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521(obj, "animateContentSize"));
                            break;
                        case 4:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521((lax0) obj, "TargetBasedAnimation"));
                            break;
                        case 5:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521((fxg) obj, "DecayAnimation"));
                            break;
                        case 6:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((oe2) obj);
                            break;
                        default:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((rsv) obj);
                            break;
                    }
                    return zy11Var;
                }
            }));
        } else {
            set = set4;
        }
        LinkedHashSet h = v4r0.h(f0, set);
        boolean z4 = qsv.c;
        final int i7 = 4;
        Set set5 = EmptySet.a;
        if (z4) {
            c = 2;
            r17 = 1;
            final int i8 = 7;
            set2 = Collections.singleton(new zi2(i7, new tls() { // from class: yi2
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i42 = i8;
                    zy11 zy11Var = zy11.a;
                    j4n j4nVar2 = j4nVar;
                    switch (i42) {
                        case 0:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((py01) obj);
                            break;
                        case 1:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((af2) obj);
                            break;
                        case 2:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((og2) obj);
                            break;
                        case 3:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521(obj, "animateContentSize"));
                            break;
                        case 4:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521((lax0) obj, "TargetBasedAnimation"));
                            break;
                        case 5:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521((fxg) obj, "DecayAnimation"));
                            break;
                        case 6:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((oe2) obj);
                            break;
                        default:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((rsv) obj);
                            break;
                    }
                    return zy11Var;
                }
            }));
        } else {
            c = 2;
            r17 = 1;
            set2 = set5;
        }
        LinkedHashSet h2 = v4r0.h(h, set2);
        if (xe2.b) {
            set5 = Collections.singleton(zi2Var2);
        }
        LinkedHashSet h3 = v4r0.h(h2, set5);
        j4nVar.y = h3;
        if (i421.a) {
            zi2 zi2Var4 = new zi2(z ? 1 : 0, new tls() { // from class: yi2
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i42 = i5;
                    zy11 zy11Var = zy11.a;
                    j4n j4nVar2 = j4nVar;
                    switch (i42) {
                        case 0:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((py01) obj);
                            break;
                        case 1:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((af2) obj);
                            break;
                        case 2:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((og2) obj);
                            break;
                        case 3:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521(obj, "animateContentSize"));
                            break;
                        case 4:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521((lax0) obj, "TargetBasedAnimation"));
                            break;
                        case 5:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521((fxg) obj, "DecayAnimation"));
                            break;
                        case 6:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((oe2) obj);
                            break;
                        default:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((rsv) obj);
                            break;
                    }
                    return zy11Var;
                }
            });
            aj2 aj2Var = new aj2(qoi0.a(lax0.class), new tls() { // from class: yi2
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i42 = i7;
                    zy11 zy11Var = zy11.a;
                    j4n j4nVar2 = j4nVar;
                    switch (i42) {
                        case 0:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((py01) obj);
                            break;
                        case 1:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((af2) obj);
                            break;
                        case 2:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((og2) obj);
                            break;
                        case 3:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521(obj, "animateContentSize"));
                            break;
                        case 4:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521((lax0) obj, "TargetBasedAnimation"));
                            break;
                        case 5:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521((fxg) obj, "DecayAnimation"));
                            break;
                        case 6:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((oe2) obj);
                            break;
                        default:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((rsv) obj);
                            break;
                    }
                    return zy11Var;
                }
            });
            aj2 aj2Var2 = new aj2(qoi0.a(fxg.class), new tls() { // from class: yi2
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i42 = i3;
                    zy11 zy11Var = zy11.a;
                    j4n j4nVar2 = j4nVar;
                    switch (i42) {
                        case 0:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((py01) obj);
                            break;
                        case 1:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((af2) obj);
                            break;
                        case 2:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((og2) obj);
                            break;
                        case 3:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521(obj, "animateContentSize"));
                            break;
                        case 4:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521((lax0) obj, "TargetBasedAnimation"));
                            break;
                        case 5:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b(new e521((fxg) obj, "DecayAnimation"));
                            break;
                        case 6:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((oe2) obj);
                            break;
                        default:
                            ((sxe0) ((MutablePropertyReference0) ((sls) j4nVar2.a)).get()).b((rsv) obj);
                            break;
                    }
                    return zy11Var;
                }
            });
            bj2[] bj2VarArr = new bj2[3];
            bj2VarArr[0] = zi2Var4;
            bj2VarArr[r17] = aj2Var;
            bj2VarArr[c] = aj2Var2;
            set4 = j73.f0(bj2VarArr);
        }
        LinkedHashSet h4 = v4r0.h(h3, set4);
        j4nVar.z = h4;
        j4nVar.w = v4r0.h(h4, Collections.singleton(zi2Var2));
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            loop1: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                x1u x1uVar = (x1u) it.next();
                ArrayList arrayList2 = new ArrayList();
                ArrayList i9 = scc.i(x1uVar);
                while (!i9.isEmpty()) {
                    x1u x1uVar2 = (x1u) ycc.z(i9);
                    arrayList2.add(x1uVar2);
                    i9.addAll(x1uVar2.g);
                }
                LinkedHashSet<bj2> linkedHashSet = (LinkedHashSet) j4nVar.y;
                if (linkedHashSet == null || !linkedHashSet.isEmpty()) {
                    for (bj2 bj2Var : linkedHashSet) {
                        bj2Var.getClass();
                        if (!arrayList2.isEmpty()) {
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                if (bj2Var.b((x1u) it2.next())) {
                                    z = r17;
                                    break loop1;
                                }
                            }
                        }
                    }
                }
            }
        }
        this.hasAnimations = z;
        if (z2 && z) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                x1u x1uVar3 = (x1u) it3.next();
                ArrayList arrayList3 = new ArrayList();
                ArrayList i10 = scc.i(x1uVar3);
                while (!i10.isEmpty()) {
                    x1u x1uVar4 = (x1u) ycc.z(i10);
                    arrayList3.add(x1uVar4);
                    i10.addAll(x1uVar4.g);
                }
                Iterator it4 = ((LinkedHashSet) j4nVar.w).iterator();
                while (it4.hasNext()) {
                    ((bj2) it4.next()).a(arrayList3);
                }
                LinkedHashSet linkedHashSet2 = ((zi2) j4nVar.x).b;
                ArrayList arrayList4 = new ArrayList(tcc.n(linkedHashSet2, 10));
                Iterator it5 = linkedHashSet2.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(((og2) it5.next()).a);
                }
                Set N0 = a.N0(arrayList4);
                LinkedHashSet linkedHashSet3 = ((zi2) j4nVar.c).b;
                ArrayList arrayList5 = new ArrayList(tcc.n(linkedHashSet3, 10));
                Iterator it6 = linkedHashSet3.iterator();
                while (it6.hasNext()) {
                    arrayList5.add((zx01) ((af2) it6.next()).a);
                }
                LinkedHashSet h5 = v4r0.h(N0, a.N0(arrayList5));
                Iterator it7 = ((zi2) j4nVar.b).b.iterator();
                r17 = r17;
                while (it7.hasNext()) {
                    boolean contains = h5.contains((zx01) ((py01) it7.next()).a);
                    boolean z5 = r17 == true ? 1 : 0;
                    if (contains == z5) {
                        it7.remove();
                    }
                    r17 = z5;
                }
            }
            for (bj2 bj2Var2 : (LinkedHashSet) j4nVar.z) {
                List q0 = a.q0(bj2Var2.b);
                tls tlsVar = bj2Var2.a;
                Iterator it8 = q0.iterator();
                while (it8.hasNext()) {
                    tlsVar.invoke(it8.next());
                }
            }
        }
    }

    private final void findDesignInfoProviders() {
        Set<vtd> set = ((xtd) this.slotTableRecord).a;
        ArrayList arrayList = new ArrayList(tcc.n(set, 10));
        for (vtd vtdVar : set) {
            f6w f6wVar = jws0.a;
            aud audVar = (aud) a.Q(vtdVar.d());
            arrayList.add(audVar != null ? jws0.h(audVar, null) : rvn.h);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x1u x1uVar = (x1u) it.next();
            ArrayList<x1u> arrayList3 = new ArrayList();
            ArrayList i = scc.i(x1uVar);
            while (!i.isEmpty()) {
                x1u x1uVar2 = (x1u) ycc.z(i);
                if (findDesignInfoProviders$lambda$1$0(this, x1uVar2)) {
                    arrayList3.add(x1uVar2);
                }
                i.addAll(x1uVar2.g);
            }
            ArrayList arrayList4 = new ArrayList();
            for (x1u x1uVar3 : arrayList3) {
                String designInfoOrNull = getDesignInfoOrNull(x1uVar3, x1uVar3.e);
                if (designInfoOrNull == null) {
                    Iterator it2 = x1uVar3.g.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            designInfoOrNull = null;
                            break;
                        }
                        String designInfoOrNull2 = getDesignInfoOrNull((x1u) it2.next(), x1uVar3.e);
                        if (designInfoOrNull2 != null) {
                            designInfoOrNull = designInfoOrNull2;
                            break;
                        }
                    }
                }
                if (designInfoOrNull != null) {
                    arrayList4.add(designInfoOrNull);
                }
            }
            ycc.r(arrayList4, arrayList2);
        }
        this.designInfoList = arrayList2;
    }

    private static final boolean findDesignInfoProviders$lambda$1$0(ComposeViewAdapter composeViewAdapter, x1u x1uVar) {
        if (!jl40.l(x1uVar.b, "remember") && composeViewAdapter.hasDesignInfo(x1uVar)) {
            return true;
        }
        Collection<x1u> collection = x1uVar.g;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return false;
        }
        for (x1u x1uVar2 : collection) {
            if (jl40.l(x1uVar2.b, "remember") && composeViewAdapter.hasDesignInfo(x1uVar2)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void getClock$ui_tooling$annotations() {
    }

    private final Method getDesignInfoMethodOrNull(Object obj) {
        try {
            Class<?> cls = obj.getClass();
            Class cls2 = Integer.TYPE;
            return cls.getDeclaredMethod("getDesignInfo", cls2, cls2, String.class);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final String getDesignInfoOrNull(x1u x1uVar, f6w f6wVar) {
        String str;
        Iterator it = x1uVar.f.iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                str = invokeGetDesignInfo(next, f6wVar.a, f6wVar.c);
            }
        } while (str == null);
        return str;
    }

    private final String getFileName(x1u x1uVar) {
        String str;
        idt0 idt0Var = x1uVar.c;
        return (idt0Var == null || (str = idt0Var.d) == null) ? "" : str;
    }

    private final int getLineNumber(x1u x1uVar) {
        idt0 idt0Var = x1uVar.c;
        if (idt0Var != null) {
            return idt0Var.a;
        }
        return -1;
    }

    private final boolean hasDesignInfo(x1u x1uVar) {
        Collection collection = x1uVar.f;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next != null ? getDesignInfoMethodOrNull(next) : null) != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean hasNullSourcePosition(x1u x1uVar) {
        return getFileName(x1uVar).length() == 0 && getLineNumber(x1uVar) == -1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:5|(9:18|19|8|(1:10)|11|12|13|14|15)|7|8|(0)|11|12|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        r8 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void init(AttributeSet attrs) {
        Class<?> cls;
        vng.E(this, this.FakeSavedStateRegistryOwner);
        s8o.R(this, this.FakeSavedStateRegistryOwner);
        rzo.T(this, this.FakeViewModelStoreOwner);
        addView(this.composeView);
        String attributeValue = attrs.getAttributeValue("http://schemas.android.com/tools", "composableName");
        if (attributeValue == null) {
            return;
        }
        String h0 = evu0.h0('.', attributeValue, attributeValue);
        String e0 = evu0.e0('.', attributeValue, attributeValue);
        String attributeValue2 = attrs.getAttributeValue("http://schemas.android.com/tools", "previewWrapperProviderClass");
        if (attributeValue2 != null) {
            try {
                cls = Class.forName(attributeValue2);
            } catch (ClassNotFoundException e) {
                Log.e("PreviewLogger", "Unable to find PreviewWrapperProvider '" + attributeValue2 + '\'', e);
            }
            int attributeIntValue = attrs.getAttributeIntValue("http://schemas.android.com/tools", "parameterProviderIndex", 0);
            String attributeValue3 = attrs.getAttributeValue("http://schemas.android.com/tools", "parameterProviderClass");
            Class g = attributeValue3 != null ? i4a1.g(attributeValue3) : null;
            long j = Long.parseLong(attrs.getAttributeValue("http://schemas.android.com/tools", "animationClockStartTime"));
            init$ui_tooling$default(this, h0, e0, cls, g, attributeIntValue, attrs.getAttributeBooleanValue("http://schemas.android.com/tools", "paintBounds", this.debugPaintBounds), attrs.getAttributeBooleanValue("http://schemas.android.com/tools", "printViewInfos", this.debugViewInfos), j, attrs.getAttributeBooleanValue("http://schemas.android.com/tools", "findDesignInfoProviders", this.lookForDesignInfoProviders), attrs.getAttributeValue("http://schemas.android.com/tools", "designInfoProvidersArgument"), null, null, HProv.ALG_TYPE_SECURECHANNEL, null);
        }
        cls = null;
        int attributeIntValue2 = attrs.getAttributeIntValue("http://schemas.android.com/tools", "parameterProviderIndex", 0);
        String attributeValue32 = attrs.getAttributeValue("http://schemas.android.com/tools", "parameterProviderClass");
        if (attributeValue32 != null) {
        }
        long j2 = Long.parseLong(attrs.getAttributeValue("http://schemas.android.com/tools", "animationClockStartTime"));
        init$ui_tooling$default(this, h0, e0, cls, g, attributeIntValue2, attrs.getAttributeBooleanValue("http://schemas.android.com/tools", "paintBounds", this.debugPaintBounds), attrs.getAttributeBooleanValue("http://schemas.android.com/tools", "printViewInfos", this.debugViewInfos), j2, attrs.getAttributeBooleanValue("http://schemas.android.com/tools", "findDesignInfoProviders", this.lookForDesignInfoProviders), attrs.getAttributeValue("http://schemas.android.com/tools", "designInfoProvidersArgument"), null, null, HProv.ALG_TYPE_SECURECHANNEL, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 init$lambda$2(sls slsVar, ComposeViewAdapter composeViewAdapter, long j, Class cls, String str, String str2, Class cls2, int i, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            zpn.i(slsVar, btsVar);
            composeViewAdapter.WrapPreview(wwg.S(-322523079, true, new om9(j, composeViewAdapter, cls, str, str2, cls2, i), btsVar), btsVar, 6);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c2, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
    
        if (r3 == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zy11 init$lambda$2$0(long j, ComposeViewAdapter composeViewAdapter, Class cls, String str, String str2, Class cls2, int i, fid fidVar, int i2) {
        int i3 = 0;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.runtime.internal.a S = wwg.S(-1805031794, true, new nc0(str, str2, btsVar, cls2, i, composeViewAdapter), btsVar);
            if (j >= 0) {
                btsVar.e0(-441489733);
                boolean e = btsVar.e(composeViewAdapter);
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (e || Q == o430Var) {
                    ComposeViewAdapter$init$3$1$1$1 composeViewAdapter$init$3$1$1$1 = new ComposeViewAdapter$init$3$1$1$1(0, composeViewAdapter, ComposeViewAdapter.class, "requestLayout", "requestLayout()V", 0);
                    btsVar.o0(composeViewAdapter$init$3$1$1$1);
                    Q = composeViewAdapter$init$3$1$1$1;
                }
                sls slsVar = (sls) ((tfx) Q);
                boolean e2 = btsVar.e(composeViewAdapter);
                Object Q2 = btsVar.Q();
                if (e2 || Q2 == o430Var) {
                    Q2 = new lyc(5, composeViewAdapter);
                    btsVar.o0(Q2);
                }
                composeViewAdapter.setClock$ui_tooling(new sxe0(slsVar, (sls) Q2));
                btsVar.t(false);
            } else {
                btsVar.e0(-440215447);
                btsVar.t(false);
            }
            if (cls != null) {
                btsVar.e0(-439702304);
                Constructor<?>[] constructors = cls.getConstructors();
                if (constructors != null) {
                    int length = constructors.length;
                    Constructor<?> constructor = null;
                    boolean z = false;
                    while (true) {
                        if (i3 < length) {
                            Constructor<?> constructor2 = constructors[i3];
                            if (constructor2.getParameterTypes().length == 0) {
                                if (z) {
                                    break;
                                }
                                constructor = constructor2;
                                z = true;
                            }
                            i3++;
                        }
                    }
                    if (constructor != null) {
                        constructor.setAccessible(true);
                        constructor.newInstance(null);
                        ny61.u();
                        return null;
                    }
                }
                ny61.g("PreviewWrapperProvider constructor can not have parameters");
                return null;
            }
            btsVar.e0(-439702305);
            btsVar.t(false);
            btsVar.e0(-706916214);
            S.invoke(btsVar, 6);
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 init$lambda$2$0$0(String str, String str2, fid fidVar, Class cls, int i, ComposeViewAdapter composeViewAdapter, fid fidVar2, int i2) {
        Throwable cause;
        bts btsVar = (bts) fidVar2;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            try {
                epb1.d(str, str2, fidVar, Arrays.copyOf(i4a1.h(i, cls), 0));
            } catch (Throwable th) {
                Throwable th2 = th;
                while ((th2 instanceof ReflectiveOperationException) && (cause = th2.getCause()) != null) {
                    th2 = cause;
                }
                hyy0 hyy0Var = composeViewAdapter.delayedException;
                synchronized (hyy0Var.b) {
                    hyy0Var.a = th2;
                    throw th;
                }
            }
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 init$lambda$2$0$2$0(ComposeViewAdapter composeViewAdapter) {
        boolean z = false;
        KeyEvent.Callback childAt = ((ComposeView) composeViewAdapter.getChildAt(0)).getChildAt(0);
        ju31 ju31Var = childAt instanceof ju31 ? (ju31) childAt : null;
        if (ju31Var != null) {
            ju31Var.invalidateDescendants();
        }
        synchronized (q2t0.c) {
            iz40 iz40Var = q2t0.j.h;
            if (iz40Var != null) {
                if (iz40Var.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            q2t0.a();
        }
        return zy11.a;
    }

    public static /* synthetic */ void init$ui_tooling$default(ComposeViewAdapter composeViewAdapter, String str, String str2, Class cls, Class cls2, int i, boolean z, boolean z2, long j, boolean z3, String str3, sls slsVar, sls slsVar2, int i2, Object obj) {
        composeViewAdapter.init$ui_tooling(str, str2, (i2 & 4) != 0 ? null : cls, (i2 & 8) != 0 ? null : cls2, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? -1L : j, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0 ? null : str3, (i2 & 1024) != 0 ? new juc(12) : slsVar, (i2 & 2048) != 0 ? new juc(13) : slsVar2);
    }

    private final String invokeGetDesignInfo(Object obj, int i, int i2) {
        Method designInfoMethodOrNull = getDesignInfoMethodOrNull(obj);
        if (designInfoMethodOrNull == null) {
            return null;
        }
        try {
            String str = (String) designInfoMethodOrNull.invoke(obj, Integer.valueOf(i), Integer.valueOf(i2), this.designInfoProvidersArgument);
            if (str.length() == 0) {
                return null;
            }
            return str;
        } catch (Exception unused) {
            return null;
        }
    }

    private final boolean isNullGroup(x1u x1uVar) {
        if (!hasNullSourcePosition(x1uVar) || !x1uVar.g.isEmpty()) {
            return false;
        }
        be60 be60Var = x1uVar instanceof be60 ? (be60) x1uVar : null;
        Object obj = be60Var != null ? be60Var.h : null;
        return (obj instanceof n0y ? (n0y) obj : null) == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0083, code lost:
    
        r4 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void processViewInfos() {
        cts ctsVar;
        Set<vtd> set = ((xtd) this.slotTableRecord).a;
        new foc(8);
        ComposeViewAdapter$processViewInfos$2 composeViewAdapter$processViewInfos$2 = new ComposeViewAdapter$processViewInfos$2(4, this, ComposeViewAdapter.class, "toViewInfoFactory", "toViewInfoFactory(Landroidx/compose/runtime/tooling/CompositionGroup;Landroidx/compose/ui/tooling/data/SourceContext;Ljava/util/List;Ljava/util/List;)Landroidx/compose/ui/tooling/ViewInfo;", 0);
        new sed(25);
        nje njeVar = new nje();
        bc bcVar = new bc();
        bcVar.a = composeViewAdapter$processViewInfos$2;
        bcVar.b = njeVar;
        bcVar.c = new LinkedHashMap();
        bcVar.w = new LinkedHashMap();
        bcVar.x = new LinkedHashSet();
        for (vtd vtdVar : set) {
            cud cudVar = vtdVar instanceof cud ? (cud) vtdVar : null;
            if (cudVar != null) {
                cts ctsVar2 = (cts) cudVar;
                rtd rtdVar = ctsVar2.a;
                bud budVar = rtdVar instanceof bud ? (bud) rtdVar : null;
                ttd ttdVar = budVar != null ? budVar.a : null;
                rtd i = ttdVar != null ? ttdVar.i() : null;
                if (i != null) {
                    ctsVar = new cts(i);
                    while (true) {
                        cts ctsVar3 = ctsVar2;
                        ctsVar2 = ctsVar;
                        if (ctsVar2 == null) {
                            ((LinkedHashSet) bcVar.x).add(ctsVar3);
                            break;
                        }
                        LinkedHashMap linkedHashMap = (LinkedHashMap) bcVar.c;
                        Object obj = linkedHashMap.get(ctsVar2);
                        if (obj == null) {
                            obj = new ArrayList();
                            linkedHashMap.put(ctsVar2, obj);
                        }
                        List list = (List) obj;
                        if (list.contains(ctsVar3)) {
                            break;
                        }
                        list.add(ctsVar3);
                        rtd rtdVar2 = ctsVar2.a;
                        bud budVar2 = rtdVar2 instanceof bud ? (bud) rtdVar2 : null;
                        ttd ttdVar2 = budVar2 != null ? budVar2.a : null;
                        rtd i2 = ttdVar2 != null ? ttdVar2.i() : null;
                        if (i2 != null) {
                            ctsVar = new cts(i2);
                        }
                    }
                }
                ctsVar = null;
            }
        }
        LinkedHashSet linkedHashSet = (LinkedHashSet) bcVar.x;
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            Object h = bcVar.h((cud) it.next());
            if (h != null) {
                arrayList.add(h);
            }
        }
        this.viewInfos = arrayList;
        if (this.debugViewInfos) {
            mi91.j(arrayList, 0, new ke31(17));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 processViewInfos$lambda$0(cud cudVar) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ur31 processViewInfos$lambda$1(cud cudVar, ur31 ur31Var, List list) {
        return ur31Var;
    }

    private final ur31 toViewInfo(x1u x1uVar) {
        String str;
        be60 be60Var = x1uVar instanceof be60 ? (be60) x1uVar : null;
        Object obj = be60Var != null ? be60Var.h : null;
        n0y n0yVar = obj instanceof n0y ? (n0y) obj : null;
        Collection collection = x1uVar.g;
        if (collection.size() == 1 && hasNullSourcePosition(x1uVar) && n0yVar == null) {
            return toViewInfo((x1u) a.r0(collection));
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collection) {
            if (!isNullGroup((x1u) obj2)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(toViewInfo((x1u) it.next()));
        }
        idt0 idt0Var = x1uVar.c;
        if (idt0Var == null || (str = idt0Var.d) == null) {
            str = "";
        }
        return new ur31(str, idt0Var != null ? idt0Var.a : -1, x1uVar.e, idt0Var, arrayList2, n0yVar, x1uVar.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ur31 toViewInfoFactory(aud group, ybt0 context, List<ur31> children, List<ur31> childrenToStitch) {
        String str;
        int i;
        if (childrenToStitch != null) {
            children = a.m0(childrenToStitch, children);
        }
        List<ur31> list = children;
        std stdVar = (std) context;
        idt0 b = stdVar.b();
        if (b == null || (str = b.d) == null) {
            str = "";
        }
        String str2 = str;
        idt0 b2 = stdVar.b();
        int i2 = b2 != null ? b2.a : -1;
        f6w f6wVar = stdVar.f;
        idt0 b3 = stdVar.b();
        Object node = group.getNode();
        String str3 = null;
        n0y n0yVar = node instanceof n0y ? (n0y) node : null;
        String a = ((aud) stdVar.d.last()).a();
        if (a != null) {
            if (!cvu0.x(a, "CC(", false)) {
                i = cvu0.x(a, "C(", false) ? 2 : 3;
            }
            int G = evu0.G(a, ')', 0, 6);
            if (G > 2) {
                str3 = a.substring(i, G);
            }
        }
        return new ur31(str2, i2, f6wVar, b3, list, n0yVar, str3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.onDraw.invoke();
        if (this.debugPaintBounds) {
            List<ur31> list = this.viewInfos;
            ArrayList arrayList = new ArrayList();
            for (ur31 ur31Var : list) {
                ycc.r(a.m0(ur31Var.a(), Collections.singletonList(ur31Var)), arrayList);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ur31 ur31Var2 = (ur31) it.next();
                f6w f6wVar = ur31Var2.c;
                if (f6wVar.d != 0 && f6wVar.c != 0) {
                    f6w f6wVar2 = ur31Var2.c;
                    canvas.drawRect(new Rect(f6wVar2.a, f6wVar2.b, f6wVar2.c, f6wVar2.d), this.debugBoundsPaint);
                }
            }
        }
    }

    public final void dispose$ui_tooling() {
        this.composeView.disposeComposition();
        if (this.clock != null) {
            getClock().a();
        }
        this.FakeSavedStateRegistryOwner.a.i(Lifecycle.State.DESTROYED);
        this.FakeViewModelStoreOwner.a.a();
    }

    /* renamed from: getClock$ui_tooling, reason: from getter */
    public final sxe0 getClock() {
        return this.clock;
    }

    public final List<String> getDesignInfoList$ui_tooling() {
        return this.designInfoList;
    }

    public final List<ur31> getViewInfos$ui_tooling() {
        return this.viewInfos;
    }

    /* renamed from: hasAnimations, reason: from getter */
    public final boolean getHasAnimations() {
        return this.hasAnimations;
    }

    public final void init$ui_tooling(String className, String methodName, Class<Object> previewWrapperProvider, Class<Object> parameterProvider, int parameterProviderIndex, boolean debugPaintBounds, boolean debugViewInfos, long animationClockStartTime, boolean lookForDesignInfoProviders, String designInfoProvidersArgument, sls onCommit, sls onDraw) {
        this.debugPaintBounds = debugPaintBounds;
        this.debugViewInfos = debugViewInfos;
        this.composableName = methodName;
        this.lookForDesignInfoProviders = lookForDesignInfoProviders;
        this.designInfoProvidersArgument = designInfoProvidersArgument == null ? "" : designInfoProvidersArgument;
        this.onDraw = onDraw;
        androidx.compose.runtime.internal.a aVar = new androidx.compose.runtime.internal.a(-1214370042, new thd(onCommit, this, animationClockStartTime, previewWrapperProvider, className, methodName, parameterProvider, parameterProviderIndex), true);
        this.previewComposition = aVar;
        this.composeView.setContent(aVar);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        vng.E(this.composeView.getRootView(), this.FakeSavedStateRegistryOwner);
        super.onAttachedToWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        hyy0 hyy0Var = this.delayedException;
        synchronized (hyy0Var.b) {
            Throwable th = hyy0Var.a;
            if (th != null) {
                hyy0Var.a = null;
                throw th;
            }
        }
        processViewInfos();
        if (this.composableName.length() > 0) {
            findAndTrackAnimations();
            if (this.lookForDesignInfoProviders) {
                findDesignInfoProviders();
            }
        }
    }

    public final void setClock$ui_tooling(sxe0 sxe0Var) {
        this.clock = sxe0Var;
    }

    public final void setDesignInfoList$ui_tooling(List<String> list) {
        this.designInfoList = list;
    }

    public final void setViewInfos$ui_tooling(List<ur31> list) {
        this.viewInfos = list;
    }

    public ComposeViewAdapter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "ComposeViewAdapter";
        this.composeView = new ComposeView(getContext(), null, 0, 6, null);
        EmptyList emptyList = EmptyList.a;
        this.viewInfos = emptyList;
        this.designInfoList = emptyList;
        this.slotTableRecord = new xtd();
        this.composableName = "";
        this.delayedException = new hyy0();
        y5d.a.getClass();
        this.previewComposition = y5d.b;
        this.designInfoProvidersArgument = "";
        this.onDraw = new juc(11);
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(rzo.X(ldc.g));
        this.debugBoundsPaint = paint;
        this.FakeSavedStateRegistryOwner = new xhd();
        this.FakeViewModelStoreOwner = new yhd();
        this.FakeOnBackPressedDispatcherOwner = new whd(this);
        this.FakeActivityResultRegistryOwner = new vhd();
        init(attributeSet);
    }
}
