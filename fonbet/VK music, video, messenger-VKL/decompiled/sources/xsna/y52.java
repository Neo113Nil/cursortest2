package xsna;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.c;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.Lifecycle;
import com.facebook.soloader.MinElf;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import xsna.am;
import xsna.jk;
import xsna.nm8;
import xsna.q630;
import xsna.q8z;
import xsna.us2;
import xsna.v4s;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* loaded from: classes11.dex */
public final class y52 extends hk implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final ng50 M = b9x.a(R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31);
    public final mg50 A;
    public final mg50 B;
    public final String C;
    public final String D;
    public final txp0 E;
    public final pg50<jgi0> F;
    public jgi0 G;
    public boolean H;
    public final mg50 I;
    public final x52 J;
    public final ArrayList K;
    public final h L;
    public final p52 b;
    public final AccessibilityManager e;
    public List<? extends AccessibilityServiceInfo> g;
    public am l;
    public am m;
    public boolean n;
    public Integer t;
    public d x;
    public pg50 y;
    public final qg50 z;
    public int c = Integer.MIN_VALUE;
    public final g d = new g();
    public long f = 100;
    public final Handler h = new Handler(Looper.getMainLooper());
    public final c i = new c();
    public int j = Integer.MIN_VALUE;
    public int k = Integer.MIN_VALUE;
    public final pg50<qeh0> o = new pg50<>((Object) null);
    public final pg50<qeh0> p = new pg50<>((Object) null);
    public final wik0<wik0<CharSequence>> q = new wik0<>(0);
    public final wik0<eh50<CharSequence>> r = new wik0<>(0);
    public int s = -1;
    public final el3<LayoutNode> u = new el3<>(0);
    public final nm8 v = w0b.a(1, null, null, 6);
    public boolean w = true;

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class a {
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class b {
        public static final void a(am amVar, igi0 igi0Var) {
            xfi0 xfi0Var = igi0Var.d;
            plg0 plg0Var = (plg0) zfi0.a(xfi0Var, ngi0.z);
            if (b62.a(igi0Var)) {
                if (plg0Var != null && plg0Var.a == 8) {
                    return;
                }
                ck ckVar = (ck) zfi0.a(xfi0Var, wfi0.y);
                if (ckVar != null) {
                    amVar.b(new am.a(android.R.id.accessibilityActionPageUp, ckVar.a));
                }
                ck ckVar2 = (ck) zfi0.a(xfi0Var, wfi0.A);
                if (ckVar2 != null) {
                    amVar.b(new am.a(android.R.id.accessibilityActionPageDown, ckVar2.a));
                }
                ck ckVar3 = (ck) zfi0.a(xfi0Var, wfi0.z);
                if (ckVar3 != null) {
                    amVar.b(new am.a(android.R.id.accessibilityActionPageLeft, ckVar3.a));
                }
                ck ckVar4 = (ck) zfi0.a(xfi0Var, wfi0.B);
                if (ckVar4 != null) {
                    amVar.b(new am.a(android.R.id.accessibilityActionPageRight, ckVar4.a));
                }
            }
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public final class c extends bm {
        public c() {
        }

        @Override // xsna.bm
        public final void a(int i, am amVar, String str, Bundle bundle) {
            y52.this.a(i, amVar, str, bundle);
        }

        /* JADX WARN: Code restructure failed: missing block: B:292:0x06b8, code lost:
        
            if ((r13 == 1) != false) goto L312;
         */
        /* JADX WARN: Code restructure failed: missing block: B:380:0x086f, code lost:
        
            if ((r8 != null ? xsna.epx.f(xsna.zfi0.a(r8, xsna.ngi0.l), java.lang.Boolean.TRUE) : false) == false) goto L405;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x013b, code lost:
        
            if (xsna.igi0.j(4, r6).isEmpty() != false) goto L63;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0326  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0342  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0359  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0367 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:277:0x0689  */
        /* JADX WARN: Removed duplicated region for block: B:280:0x0699  */
        /* JADX WARN: Removed duplicated region for block: B:283:0x06a7  */
        /* JADX WARN: Removed duplicated region for block: B:297:0x06cd  */
        /* JADX WARN: Removed duplicated region for block: B:325:0x0728  */
        /* JADX WARN: Removed duplicated region for block: B:331:0x074a  */
        /* JADX WARN: Removed duplicated region for block: B:334:0x075e  */
        /* JADX WARN: Removed duplicated region for block: B:357:0x07e2  */
        /* JADX WARN: Removed duplicated region for block: B:374:0x0876  */
        /* JADX WARN: Removed duplicated region for block: B:396:0x08b2  */
        /* JADX WARN: Removed duplicated region for block: B:399:0x08c1  */
        /* JADX WARN: Removed duplicated region for block: B:402:0x08e9  */
        /* JADX WARN: Removed duplicated region for block: B:436:0x09f1  */
        /* JADX WARN: Removed duplicated region for block: B:439:0x0a06  */
        /* JADX WARN: Removed duplicated region for block: B:442:0x0a10  */
        /* JADX WARN: Removed duplicated region for block: B:486:0x0ac2  */
        /* JADX WARN: Removed duplicated region for block: B:489:0x0ada  */
        /* JADX WARN: Removed duplicated region for block: B:534:0x0c63  */
        /* JADX WARN: Removed duplicated region for block: B:545:0x0cab  */
        /* JADX WARN: Removed duplicated region for block: B:547:0x0c7f  */
        /* JADX WARN: Removed duplicated region for block: B:552:0x068e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0cb4  */
        /* JADX WARN: Type inference failed for: r4v64, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r4v65, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v66, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r4v67, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v71, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v72, types: [java.util.ArrayList] */
        @Override // xsna.bm
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final am b(int i) {
            ng50 ng50Var;
            LayoutNode layoutNode;
            AccessibilityNodeInfo accessibilityNodeInfo;
            y52 y52Var;
            plg0 plg0Var;
            p52 p52Var;
            igi0 igi0Var;
            AccessibilityNodeInfo accessibilityNodeInfo2;
            Resources resources;
            xfi0 xfi0Var;
            mg50 mg50Var;
            AccessibilityNodeInfo accessibilityNodeInfo3;
            am amVar;
            SpannableString spannableString;
            xfi0 xfi0Var2;
            AccessibilityNodeInfo accessibilityNodeInfo4;
            AccessibilityNodeInfo accessibilityNodeInfo5;
            plg0 plg0Var2;
            int i2;
            int i3;
            y52 y52Var2;
            int i4;
            boolean z;
            clz clzVar;
            ck ckVar;
            ck ckVar2;
            ck ckVar3;
            String j;
            ArrayList arrayList;
            CharSequence h;
            t1e0 t1e0Var;
            int i5;
            qeh0 qeh0Var;
            qeh0 qeh0Var2;
            int c;
            p52 p52Var2;
            Bundle bundle;
            int c2;
            String str;
            xd2 c3;
            eh50<CharSequence> eh50Var;
            LayoutNode layoutNode2;
            ck ckVar4;
            boolean z2;
            boolean z3;
            boolean z4;
            Collection collection;
            Collection collection2;
            xfi0 xfi0Var3;
            int i6;
            int i7;
            long j2;
            igi0 igi0Var2;
            int i8;
            am amVar2;
            y52 y52Var3 = y52.this;
            AccessibilityManager accessibilityManager = y52Var3.e;
            p52 p52Var3 = y52Var3.b;
            if (p52Var3.getComposeViewContext().c.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                if (!accessibilityManager.isEnabled()) {
                    amVar2 = new am(AccessibilityNodeInfo.obtain());
                    y52Var2 = y52Var3;
                    amVar = amVar2;
                    i3 = i;
                    if (y52Var2.n) {
                        if (i3 == y52Var2.j) {
                            y52Var2.l = amVar;
                        }
                        if (i3 == y52Var2.k) {
                            y52Var2.m = amVar;
                        }
                    }
                    return amVar;
                }
                amVar2 = null;
                y52Var2 = y52Var3;
                amVar = amVar2;
                i3 = i;
                if (y52Var2.n) {
                }
                return amVar;
            }
            lgi0 b = y52Var3.i().b(i);
            if (b == null) {
                if (!accessibilityManager.isEnabled()) {
                    amVar2 = new am(AccessibilityNodeInfo.obtain());
                    y52Var2 = y52Var3;
                    amVar = amVar2;
                    i3 = i;
                    if (y52Var2.n) {
                    }
                    return amVar;
                }
                amVar2 = null;
                y52Var2 = y52Var3;
                amVar = amVar2;
                i3 = i;
                if (y52Var2.n) {
                }
                return amVar;
            }
            igi0 igi0Var3 = b.a;
            xfi0 k = igi0Var3.k();
            LayoutNode layoutNode3 = igi0Var3.c;
            xfi0 xfi0Var4 = igi0Var3.d;
            boolean f = epx.f(zfi0.a(k, ngi0.o), Boolean.TRUE);
            if (f) {
                if (!(Build.VERSION.SDK_INT >= 34 ? ll.a(accessibilityManager) : true)) {
                    i3 = i;
                    y52Var2 = y52Var3;
                    amVar = null;
                    if (y52Var2.n) {
                    }
                    return amVar;
                }
            }
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            am amVar3 = new am(obtain);
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 34) {
                am.d.e(obtain, f);
            } else {
                Bundle extras = obtain.getExtras();
                if (extras != null) {
                    extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-65)) | (f ? 64 : 0));
                }
            }
            if (i == -1) {
                Object parentForAccessibility = p52Var3.getParentForAccessibility();
                View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                amVar3.b = -1;
                obtain.setParent(view);
            } else {
                igi0 l = igi0Var3.l();
                Integer valueOf = l != null ? Integer.valueOf(l.f) : null;
                if (valueOf == null) {
                    uzw.c("semanticsNode " + i + " has null parent");
                    throw new KotlinNothingValueException();
                }
                int intValue = valueOf.intValue();
                if (intValue == p52Var3.getSemanticsOwner().a().f) {
                    intValue = -1;
                }
                amVar3.b = intValue;
                obtain.setParent(p52Var3, intValue);
            }
            amVar3.c = i;
            obtain.setSource(p52Var3, i);
            amVar3.k(y52Var3.b(b));
            ng50 ng50Var2 = y52.M;
            mg50 mg50Var2 = y52Var3.I;
            wik0<eh50<CharSequence>> wik0Var = y52Var3.r;
            Resources resources2 = p52Var3.getContext().getResources();
            amVar3.n("android.view.View");
            ph50<sgi0<?>, Object> ph50Var = xfi0Var4.b;
            if (ph50Var.b(ngi0.G)) {
                amVar3.n("android.widget.EditText");
            }
            if (ph50Var.b(ngi0.C)) {
                amVar3.n("android.widget.TextView");
            }
            plg0 plg0Var3 = (plg0) zfi0.a(xfi0Var4, ngi0.z);
            if (plg0Var3 != null) {
                int i10 = plg0Var3.a;
                if (igi0Var3.o()) {
                    ng50Var = ng50Var2;
                    i8 = 4;
                } else {
                    ng50Var = ng50Var2;
                    i8 = 4;
                }
                if (i10 == i8) {
                    amVar3.w(resources2.getString(R.string.tab));
                } else if (i10 == 2) {
                    amVar3.w(resources2.getString(R.string.switch_role));
                } else {
                    String d = ygi0.d(i10);
                    layoutNode = layoutNode3;
                    if (i10 != 5 || igi0Var3.q() || xfi0Var4.d) {
                        amVar3.n(d);
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
                layoutNode = layoutNode3;
                s3q0 s3q0Var2 = s3q0.a;
            } else {
                ng50Var = ng50Var2;
                layoutNode = layoutNode3;
            }
            obtain.setPackageName(p52Var3.getContext().getPackageName());
            obtain.setImportantForAccessibility(qxm0.p(igi0Var3));
            boolean a = i9 >= 34 ? ll.a(accessibilityManager) : true;
            List j3 = igi0.j(4, igi0Var3);
            int size = j3.size();
            boolean z5 = a;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                accessibilityNodeInfo = amVar3.a;
                if (i12 >= size) {
                    break;
                }
                int i13 = size;
                igi0 igi0Var4 = (igi0) j3.get(i12);
                List list = j3;
                f9x<lgi0> i14 = y52Var3.i();
                int i15 = i12;
                int i16 = igi0Var4.f;
                if (i14.a(i16)) {
                    xd2 xd2Var = p52Var3.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(igi0Var4.c);
                    if (i16 != -1) {
                        if (xd2Var != null) {
                            accessibilityNodeInfo.addChild(xd2Var);
                        } else {
                            lgi0 b2 = y52Var3.i().b(i16);
                            boolean f2 = (b2 == null || (igi0Var2 = b2.a) == null) ? false : epx.f(zfi0.a(igi0Var2.k(), ngi0.o), Boolean.TRUE);
                            if (z5 || !f2) {
                                accessibilityNodeInfo.addChild(p52Var3, i16);
                            }
                        }
                        mg50Var2.g(i16, i11);
                        i11++;
                    }
                }
                i12 = i15 + 1;
                j3 = list;
                size = i13;
            }
            if (i == y52Var3.j) {
                accessibilityNodeInfo.setAccessibilityFocused(true);
                amVar3.b(am.a.h);
            } else {
                accessibilityNodeInfo.setAccessibilityFocused(false);
                amVar3.b(am.a.g);
            }
            us2 f3 = b62.f(igi0Var3);
            if (f3 != null) {
                v4s.a fontFamilyResolver = p52Var3.getFontFamilyResolver();
                azl density = p52Var3.getDensity();
                txp0 txp0Var = y52Var3.E;
                p52Var = p52Var3;
                String str2 = f3.c;
                y52Var = y52Var3;
                List<us2.d<? extends us2.a>> list2 = f3.b;
                SpannableString spannableString2 = new SpannableString(str2);
                ArrayList arrayList2 = f3.d;
                mg50Var = mg50Var2;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        int i18 = i17;
                        us2.d dVar = (us2.d) arrayList2.get(i17);
                        ArrayList arrayList3 = arrayList2;
                        hik0 hik0Var = (hik0) dVar.a;
                        int i19 = size2;
                        int i20 = dVar.b;
                        int i21 = dVar.c;
                        igi0 igi0Var5 = igi0Var3;
                        AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfo;
                        plg0 plg0Var4 = plg0Var3;
                        hik0 a2 = hik0.a(hik0Var, 0L, 65503);
                        vho0 vho0Var = a2.a;
                        zho0 zho0Var = a2.j;
                        pdo0 pdo0Var = a2.m;
                        v4s v4sVar = a2.f;
                        Resources resources3 = resources2;
                        u5s u5sVar = a2.d;
                        AccessibilityNodeInfo accessibilityNodeInfo7 = obtain;
                        am amVar4 = amVar3;
                        oik0.c(spannableString2, vho0Var.c(), i20, i21);
                        SpannableString spannableString3 = spannableString2;
                        oik0.d(spannableString3, a2.b, density, i20, i21);
                        b6s b6sVar = a2.c;
                        if (b6sVar == null && u5sVar == null) {
                            xfi0Var3 = xfi0Var4;
                            i6 = 33;
                        } else {
                            if (b6sVar == null) {
                                b6sVar = b6s.h;
                            }
                            int i22 = u5sVar != null ? u5sVar.a : 0;
                            xfi0Var3 = xfi0Var4;
                            boolean z6 = b6sVar.compareTo(b6s.e) >= 0;
                            boolean z7 = i22 == 1;
                            StyleSpan styleSpan = new StyleSpan((z7 && z6) ? 3 : z6 ? 1 : z7 ? 2 : 0);
                            i6 = 33;
                            spannableString3.setSpan(styleSpan, i20, i21, 33);
                        }
                        if (v4sVar != null) {
                            if (v4sVar instanceof qjt) {
                                spannableString3.setSpan(new TypefaceSpan(((qjt) v4sVar).d), i20, i21, i6);
                            } else {
                                v5s v5sVar = a2.e;
                                TypefaceSpan typefaceSpan = new TypefaceSpan((Typeface) fontFamilyResolver.a(v4sVar, b6s.h, 0, v5sVar != null ? v5sVar.a : MinElf.PN_XNUM).getValue());
                                i7 = 33;
                                spannableString3.setSpan(typefaceSpan, i20, i21, 33);
                                if (pdo0Var != null) {
                                    int i23 = pdo0Var.a;
                                    if ((i23 | 1) == i23) {
                                        spannableString3.setSpan(new UnderlineSpan(), i20, i21, i7);
                                    }
                                    if ((i23 | 2) == i23) {
                                        spannableString3.setSpan(new StrikethroughSpan(), i20, i21, i7);
                                    }
                                }
                                if (zho0Var != null) {
                                    spannableString3.setSpan(new ScaleXSpan(zho0Var.a), i20, i21, i7);
                                }
                                oik0.e(spannableString3, a2.k, i20, i21);
                                j2 = a2.l;
                                if (j2 == 16) {
                                    spannableString3.setSpan(new BackgroundColorSpan(f870.H(j2)), i20, i21, 33);
                                }
                                spannableString2 = spannableString3;
                                i17 = i18 + 1;
                                xfi0Var4 = xfi0Var3;
                                arrayList2 = arrayList3;
                                size2 = i19;
                                igi0Var3 = igi0Var5;
                                accessibilityNodeInfo = accessibilityNodeInfo6;
                                plg0Var3 = plg0Var4;
                                resources2 = resources3;
                                obtain = accessibilityNodeInfo7;
                                amVar3 = amVar4;
                            }
                        }
                        i7 = i6;
                        if (pdo0Var != null) {
                        }
                        if (zho0Var != null) {
                        }
                        oik0.e(spannableString3, a2.k, i20, i21);
                        j2 = a2.l;
                        if (j2 == 16) {
                        }
                        spannableString2 = spannableString3;
                        i17 = i18 + 1;
                        xfi0Var4 = xfi0Var3;
                        arrayList2 = arrayList3;
                        size2 = i19;
                        igi0Var3 = igi0Var5;
                        accessibilityNodeInfo = accessibilityNodeInfo6;
                        plg0Var3 = plg0Var4;
                        resources2 = resources3;
                        obtain = accessibilityNodeInfo7;
                        amVar3 = amVar4;
                    }
                }
                plg0Var = plg0Var3;
                igi0Var = igi0Var3;
                accessibilityNodeInfo2 = accessibilityNodeInfo;
                resources = resources2;
                SpannableString spannableString4 = spannableString2;
                xfi0Var = xfi0Var4;
                accessibilityNodeInfo3 = obtain;
                am amVar5 = amVar3;
                int length = str2.length();
                if (list2 != null) {
                    collection = new ArrayList(list2.size());
                    int size3 = list2.size();
                    for (int i24 = 0; i24 < size3; i24++) {
                        us2.d<? extends us2.a> dVar2 = list2.get(i24);
                        us2.d<? extends us2.a> dVar3 = dVar2;
                        if ((dVar3.a instanceof ysp0) && zs2.c(0, length, dVar3.b, dVar3.c)) {
                            collection.add(dVar2);
                        }
                    }
                } else {
                    collection = EmptyList.b;
                }
                int size4 = collection.size();
                for (int i25 = 0; i25 < size4; i25++) {
                    us2.d dVar4 = (us2.d) collection.get(i25);
                    ysp0 ysp0Var = (ysp0) dVar4.a;
                    int i26 = dVar4.b;
                    int i27 = dVar4.c;
                    if (!(ysp0Var instanceof smr0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    spannableString4.setSpan(new TtsSpan.VerbatimBuilder(((smr0) ysp0Var).a).build(), i26, i27, 33);
                }
                int length2 = str2.length();
                if (list2 != null) {
                    collection2 = new ArrayList(list2.size());
                    int size5 = list2.size();
                    for (int i28 = 0; i28 < size5; i28++) {
                        us2.d<? extends us2.a> dVar5 = list2.get(i28);
                        us2.d<? extends us2.a> dVar6 = dVar5;
                        if ((dVar6.a instanceof seq0) && zs2.c(0, length2, dVar6.b, dVar6.c)) {
                            collection2.add(dVar5);
                        }
                    }
                } else {
                    collection2 = EmptyList.b;
                }
                int size6 = collection2.size();
                for (int i29 = 0; i29 < size6; i29++) {
                    us2.d dVar7 = (us2.d) collection2.get(i29);
                    seq0 seq0Var = (seq0) dVar7.a;
                    int i30 = dVar7.b;
                    int i31 = dVar7.c;
                    WeakHashMap<seq0, URLSpan> weakHashMap = txp0Var.a;
                    URLSpan uRLSpan = weakHashMap.get(seq0Var);
                    if (uRLSpan == null) {
                        uRLSpan = new URLSpan(seq0Var.a);
                        weakHashMap.put(seq0Var, uRLSpan);
                    }
                    spannableString4.setSpan(uRLSpan, i30, i31, 33);
                }
                List a3 = f3.a(str2.length());
                int size7 = a3.size();
                for (int i32 = 0; i32 < size7; i32++) {
                    us2.d<q8z> dVar8 = (us2.d) a3.get(i32);
                    int i33 = dVar8.b;
                    q8z q8zVar = dVar8.a;
                    int i34 = dVar8.c;
                    if (i33 != i34) {
                        q8z q8zVar2 = q8zVar;
                        if ((q8zVar2 instanceof q8z.b) && ((q8z.b) q8zVar2).c == null) {
                            q8z.b bVar = (q8z.b) q8zVar;
                            us2.d<q8z.b> dVar9 = new us2.d<>(bVar, i33, i34);
                            WeakHashMap<us2.d<q8z.b>, URLSpan> weakHashMap2 = txp0Var.b;
                            URLSpan uRLSpan2 = weakHashMap2.get(dVar9);
                            if (uRLSpan2 == null) {
                                uRLSpan2 = new URLSpan(bVar.a);
                                weakHashMap2.put(dVar9, uRLSpan2);
                            }
                            spannableString4.setSpan(uRLSpan2, i33, i34, 33);
                        } else {
                            WeakHashMap<us2.d<q8z>, hpi> weakHashMap3 = txp0Var.c;
                            hpi hpiVar = weakHashMap3.get(dVar8);
                            if (hpiVar == null) {
                                hpiVar = new hpi(q8zVar2);
                                weakHashMap3.put(dVar8, hpiVar);
                            }
                            spannableString4.setSpan(hpiVar, i33, i34, 33);
                        }
                    }
                }
                spannableString = (SpannableString) y52.F(spannableString4);
                amVar = amVar5;
            } else {
                y52Var = y52Var3;
                plg0Var = plg0Var3;
                p52Var = p52Var3;
                igi0Var = igi0Var3;
                accessibilityNodeInfo2 = accessibilityNodeInfo;
                resources = resources2;
                xfi0Var = xfi0Var4;
                mg50Var = mg50Var2;
                accessibilityNodeInfo3 = obtain;
                amVar = amVar3;
                spannableString = null;
            }
            amVar.A(spannableString);
            sgi0<String> sgi0Var = ngi0.M;
            if (ph50Var.b(sgi0Var)) {
                accessibilityNodeInfo5 = accessibilityNodeInfo3;
                accessibilityNodeInfo5.setContentInvalid(true);
                xfi0Var2 = xfi0Var;
                accessibilityNodeInfo4 = accessibilityNodeInfo2;
                accessibilityNodeInfo4.setError((CharSequence) zfi0.a(xfi0Var2, sgi0Var));
            } else {
                xfi0Var2 = xfi0Var;
                accessibilityNodeInfo4 = accessibilityNodeInfo2;
                accessibilityNodeInfo5 = accessibilityNodeInfo3;
            }
            igi0 igi0Var6 = igi0Var;
            Resources resources4 = resources;
            amVar.z(b62.e(igi0Var6, resources4));
            amVar.l(b62.d(igi0Var6));
            ToggleableState toggleableState = (ToggleableState) zfi0.a(xfi0Var2, ngi0.K);
            if (toggleableState != null) {
                if (toggleableState == ToggleableState.On) {
                    amVar.m(true);
                } else if (toggleableState == ToggleableState.Off) {
                    amVar.m(false);
                }
                s3q0 s3q0Var3 = s3q0.a;
            }
            Boolean bool = (Boolean) zfi0.a(xfi0Var2, ngi0.J);
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (plg0Var == null) {
                    plg0Var2 = plg0Var;
                    i2 = 4;
                } else {
                    plg0Var2 = plg0Var;
                    i2 = 4;
                    if (plg0Var2.a == 4) {
                        accessibilityNodeInfo4.setSelected(booleanValue);
                        s3q0 s3q0Var4 = s3q0.a;
                    }
                }
                amVar.m(booleanValue);
                s3q0 s3q0Var42 = s3q0.a;
            } else {
                plg0Var2 = plg0Var;
                i2 = 4;
            }
            if (!xfi0Var2.d || igi0.j(i2, igi0Var6).isEmpty()) {
                List list3 = (List) zfi0.a(xfi0Var2, ngi0.a);
                amVar.r(list3 != null ? (String) j5g.a0(list3) : null);
            }
            String str3 = (String) zfi0.a(xfi0Var2, ngi0.A);
            if (str3 != null) {
                igi0 igi0Var7 = igi0Var6;
                while (true) {
                    if (igi0Var7 == null) {
                        z4 = false;
                        break;
                    }
                    xfi0 xfi0Var5 = igi0Var7.d;
                    sgi0<Boolean> sgi0Var2 = ogi0.a;
                    if (xfi0Var5.b.b(sgi0Var2)) {
                        z4 = ((Boolean) xfi0Var5.c(sgi0Var2)).booleanValue();
                        break;
                    }
                    igi0Var7 = igi0Var7.l();
                }
                if (z4) {
                    accessibilityNodeInfo5.setViewIdResourceName(str3);
                }
            }
            if (((s3q0) zfi0.a(xfi0Var2, ngi0.h)) != null) {
                amVar.u(true);
                s3q0 s3q0Var5 = s3q0.a;
            }
            if (((s3q0) zfi0.a(xfi0Var2, ngi0.i)) != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    accessibilityNodeInfo5.setTextEntryKey(true);
                } else {
                    Bundle extras2 = accessibilityNodeInfo4.getExtras();
                    if (extras2 != null) {
                        extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-9)) | 8);
                    }
                }
                s3q0 s3q0Var6 = s3q0.a;
            }
            i3 = i;
            if (i3 != -1) {
                int c4 = mg50Var.c(igi0Var6.f, -1);
                if (c4 != -1) {
                    accessibilityNodeInfo5.setDrawingOrder(c4);
                    s3q0 s3q0Var7 = s3q0.a;
                }
            }
            accessibilityNodeInfo5.setPassword(ph50Var.b(ngi0.L));
            Object a4 = zfi0.a(xfi0Var2, ngi0.O);
            Boolean bool2 = Boolean.TRUE;
            accessibilityNodeInfo5.setEditable(epx.f(a4, bool2));
            Integer num = (Integer) zfi0.a(xfi0Var2, ngi0.P);
            accessibilityNodeInfo4.setMaxTextLength(num != null ? num.intValue() : -1);
            accessibilityNodeInfo4.setEnabled(b62.a(igi0Var6));
            sgi0<Boolean> sgi0Var3 = ngi0.l;
            amVar.t(ph50Var.b(sgi0Var3));
            if (accessibilityNodeInfo5.isFocusable()) {
                accessibilityNodeInfo4.setFocused(((Boolean) xfi0Var2.c(sgi0Var3)).booleanValue());
                if (!accessibilityNodeInfo5.isFocused()) {
                    y52Var2 = y52Var;
                    i4 = 2;
                    z = true;
                    amVar.a(1);
                    amVar.C(qxm0.o(igi0Var6) ^ z);
                    if ((!igi0Var6.o() ? igi0Var6.l() : igi0Var6).m().g()) {
                        amVar.C(false);
                    }
                    clzVar = (clz) zfi0.a(xfi0Var2, ngi0.k);
                    if (clzVar != null) {
                        int i35 = clzVar.a;
                        if (!(i35 == 0)) {
                        }
                        i4 = 1;
                        accessibilityNodeInfo5.setLiveRegion(i4);
                        s3q0 s3q0Var8 = s3q0.a;
                    }
                    amVar.o(false);
                    ckVar = (ck) zfi0.a(xfi0Var2, wfi0.b);
                    if (ckVar != null) {
                        boolean f4 = epx.f(zfi0.a(xfi0Var2, ngi0.J), bool2);
                        if (!(plg0Var2 != null && plg0Var2.a == 4)) {
                            if (!(plg0Var2 != null && plg0Var2.a == 3)) {
                                z3 = false;
                                amVar.o(z3 || (z3 && !f4));
                                if (b62.a(igi0Var6) && accessibilityNodeInfo5.isClickable()) {
                                    amVar.b(new am.a(16, ckVar.a));
                                }
                                s3q0 s3q0Var9 = s3q0.a;
                            }
                        }
                        z3 = true;
                        amVar.o(z3 || (z3 && !f4));
                        if (b62.a(igi0Var6)) {
                            amVar.b(new am.a(16, ckVar.a));
                        }
                        s3q0 s3q0Var92 = s3q0.a;
                    }
                    accessibilityNodeInfo4.setLongClickable(false);
                    ckVar2 = (ck) zfi0.a(xfi0Var2, wfi0.c);
                    if (ckVar2 != null) {
                        accessibilityNodeInfo4.setLongClickable(true);
                        if (b62.a(igi0Var6)) {
                            amVar.b(new am.a(32, ckVar2.a));
                        }
                        s3q0 s3q0Var10 = s3q0.a;
                    }
                    ckVar3 = (ck) zfi0.a(xfi0Var2, wfi0.q);
                    if (ckVar3 != null) {
                        amVar.b(new am.a(16384, ckVar3.a));
                        s3q0 s3q0Var11 = s3q0.a;
                    }
                    if (b62.a(igi0Var6)) {
                        ck ckVar5 = (ck) zfi0.a(xfi0Var2, wfi0.k);
                        if (ckVar5 != null) {
                            amVar.b(new am.a(2097152, ckVar5.a));
                            s3q0 s3q0Var12 = s3q0.a;
                        }
                        ck ckVar6 = (ck) zfi0.a(xfi0Var2, wfi0.p);
                        if (ckVar6 != null) {
                            amVar.b(new am.a(android.R.id.accessibilityActionImeEnter, ckVar6.a));
                            s3q0 s3q0Var13 = s3q0.a;
                        }
                        ck ckVar7 = (ck) zfi0.a(xfi0Var2, wfi0.r);
                        if (ckVar7 != null) {
                            amVar.b(new am.a(65536, ckVar7.a));
                            s3q0 s3q0Var14 = s3q0.a;
                        }
                        ck ckVar8 = (ck) zfi0.a(xfi0Var2, wfi0.s);
                        if (ckVar8 != null) {
                            if (accessibilityNodeInfo5.isFocused() && p52Var.getClipboardManager().a()) {
                                amVar.b(new am.a(32768, ckVar8.a));
                            }
                            s3q0 s3q0Var15 = s3q0.a;
                        }
                    }
                    j = y52.j(igi0Var6);
                    if (!(j != null || j.length() == 0)) {
                        accessibilityNodeInfo5.setTextSelection(y52Var2.h(igi0Var6), y52Var2.g(igi0Var6));
                        ck ckVar9 = (ck) zfi0.a(xfi0Var2, wfi0.j);
                        amVar.b(new am.a(131072, ckVar9 != null ? ckVar9.a : null));
                        amVar.a(256);
                        amVar.a(512);
                        accessibilityNodeInfo4.setMovementGranularities(11);
                        List list4 = (List) zfi0.a(xfi0Var2, ngi0.a);
                        if ((list4 == null || list4.isEmpty()) && ph50Var.b(wfi0.a)) {
                            if (!igi0Var6.d.b.b(ngi0.G) || epx.f(zfi0.a(igi0Var6.d, ngi0.l), Boolean.TRUE)) {
                                LayoutNode c5 = b62.c(igi0Var6.c, c62.i);
                                if (c5 != null) {
                                    xfi0 d2 = c5.d();
                                }
                                z2 = false;
                                if (!z2) {
                                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                }
                            }
                            z2 = true;
                            if (!z2) {
                            }
                        }
                    }
                    arrayList = new ArrayList();
                    arrayList.add("androidx.compose.ui.semantics.id");
                    h = amVar.h();
                    if (!(h != null || h.length() == 0) && ph50Var.b(wfi0.a)) {
                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                    }
                    if (xfi0Var2.b.b(ngi0.A)) {
                        arrayList.add("androidx.compose.ui.semantics.testTag");
                    }
                    if (xfi0Var2.b.b(ngi0.Q)) {
                        arrayList.add("androidx.compose.ui.semantics.shapeType");
                        arrayList.add("androidx.compose.ui.semantics.shapeRect");
                        arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                        arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                    }
                    xfi0Var2.getClass();
                    accessibilityNodeInfo4.setAvailableExtraData(arrayList);
                    t1e0Var = (t1e0) zfi0.a(igi0Var6.n(), ngi0.c);
                    if (t1e0Var != null) {
                        float f5 = t1e0Var.a;
                        xfi0 n = igi0Var6.n();
                        sgi0<ck<izs<Float, Boolean>>> sgi0Var4 = wfi0.i;
                        if (n.b(sgi0Var4)) {
                            amVar.n("android.widget.SeekBar");
                        } else {
                            amVar.n("android.widget.ProgressBar");
                        }
                        t1e0 t1e0Var2 = t1e0.d;
                        if (t1e0Var != t1e0.d) {
                            accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, t1e0Var.a().getStart().floatValue(), t1e0Var.a().c().floatValue(), f5));
                        }
                        if (igi0Var6.n().b(sgi0Var4) && b62.a(igi0Var6)) {
                            float floatValue = t1e0Var.a().c().floatValue();
                            float floatValue2 = t1e0Var.a().getStart().floatValue();
                            if (floatValue < floatValue2) {
                                floatValue = floatValue2;
                            }
                            if (f5 < floatValue) {
                                amVar.b(am.a.i);
                            }
                            if (f5 > swe0.d(t1e0Var.a().getStart().floatValue(), t1e0Var.a().c().floatValue())) {
                                amVar.b(am.a.j);
                            }
                        }
                    }
                    i5 = Build.VERSION.SDK_INT;
                    if (b62.a(igi0Var6) && (ckVar4 = (ck) zfi0.a(igi0Var6.d, wfi0.i)) != null) {
                        amVar.b(new am.a(android.R.id.accessibilityActionSetProgress, ckVar4.a));
                    }
                    r4g.b(amVar, igi0Var6);
                    r4g.c(amVar, igi0Var6);
                    qeh0Var = (qeh0) zfi0.a(igi0Var6.n(), ngi0.v);
                    ck ckVar10 = (ck) zfi0.a(igi0Var6.n(), wfi0.d);
                    if (qeh0Var != null && ckVar10 != null) {
                        if (!(zfi0.a(igi0Var6.k(), ngi0.f) == null || zfi0.a(igi0Var6.k(), ngi0.e) != null)) {
                            amVar.n("android.widget.HorizontalScrollView");
                        }
                        if (qeh0Var.b.invoke().floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            amVar.y(true);
                        }
                        if (b62.a(igi0Var6)) {
                            if (y52.p(qeh0Var)) {
                                amVar.b(am.a.i);
                                layoutNode2 = layoutNode;
                                amVar.b(!(layoutNode2.A == LayoutDirection.Rtl) ? am.a.q : am.a.o);
                            } else {
                                layoutNode2 = layoutNode;
                            }
                            if (y52.o(qeh0Var)) {
                                amVar.b(am.a.j);
                                amVar.b(!(layoutNode2.A == LayoutDirection.Rtl) ? am.a.o : am.a.q);
                            }
                        }
                    }
                    qeh0Var2 = (qeh0) zfi0.a(igi0Var6.n(), ngi0.w);
                    if (qeh0Var2 == null && ckVar10 != null) {
                        if (!((zfi0.a(igi0Var6.k(), ngi0.f) == null && zfi0.a(igi0Var6.k(), ngi0.e) == null) ? false : true)) {
                            amVar.n("android.widget.ScrollView");
                        }
                        if (qeh0Var2.b.invoke().floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            amVar.y(true);
                        }
                        if (b62.a(igi0Var6)) {
                            if (y52.p(qeh0Var2)) {
                                amVar.b(am.a.i);
                                amVar.b(am.a.p);
                            }
                            if (y52.o(qeh0Var2)) {
                                amVar.b(am.a.j);
                                amVar.b(am.a.n);
                            }
                        }
                    }
                    if (i5 >= 29) {
                        b.a(amVar, igi0Var6);
                    }
                    amVar.v((CharSequence) zfi0.a(igi0Var6.n(), ngi0.d));
                    if (b62.a(igi0Var6)) {
                        ck ckVar11 = (ck) zfi0.a(igi0Var6.n(), wfi0.t);
                        if (ckVar11 != null) {
                            amVar.b(new am.a(SQLiteDatabase.OPEN_PRIVATECACHE, ckVar11.a));
                            s3q0 s3q0Var16 = s3q0.a;
                        }
                        ck ckVar12 = (ck) zfi0.a(igi0Var6.n(), wfi0.u);
                        if (ckVar12 != null) {
                            amVar.b(new am.a(524288, ckVar12.a));
                            s3q0 s3q0Var17 = s3q0.a;
                        }
                        ck ckVar13 = (ck) zfi0.a(igi0Var6.n(), wfi0.v);
                        if (ckVar13 != null) {
                            amVar.b(new am.a(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, ckVar13.a));
                            s3q0 s3q0Var18 = s3q0.a;
                        }
                        xfi0 n2 = igi0Var6.n();
                        sgi0<List<fmk>> sgi0Var5 = wfi0.x;
                        if (n2.b(sgi0Var5)) {
                            List list5 = (List) igi0Var6.n().c(sgi0Var5);
                            ng50 ng50Var3 = ng50Var;
                            if (list5.size() >= ng50Var3.b) {
                                throw new IllegalStateException(h5s.c(ng50Var3.b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                            }
                            wik0<CharSequence> wik0Var2 = new wik0<>(0);
                            eh50<CharSequence> a5 = pp70.a();
                            if (wik0Var.f(i3)) {
                                eh50<CharSequence> g = wik0Var.g(i3);
                                ng50 ng50Var4 = new ng50();
                                int[] iArr = ng50Var3.a;
                                int i36 = ng50Var3.b;
                                for (int i37 = 0; i37 < i36; i37++) {
                                    ng50Var4.c(iArr[i37]);
                                }
                                ArrayList arrayList4 = new ArrayList();
                                int size8 = list5.size();
                                int i38 = 0;
                                while (i38 < size8) {
                                    fmk fmkVar = (fmk) list5.get(i38);
                                    int i39 = size8;
                                    if (g.a(fmkVar.a()) >= 0) {
                                        int b3 = g.b(fmkVar.a());
                                        eh50Var = g;
                                        wik0Var2.h(b3, fmkVar.a());
                                        a5.i(fmkVar.a(), b3);
                                        ng50Var4.e(b3);
                                        amVar.b(new am.a(b3, fmkVar.a()));
                                        s3q0 s3q0Var19 = s3q0.a;
                                    } else {
                                        eh50Var = g;
                                        arrayList4.add(fmkVar);
                                    }
                                    i38++;
                                    size8 = i39;
                                    g = eh50Var;
                                }
                                int size9 = arrayList4.size();
                                for (int i40 = 0; i40 < size9; i40++) {
                                    fmk fmkVar2 = (fmk) arrayList4.get(i40);
                                    int a6 = ng50Var4.a(i40);
                                    wik0Var2.h(a6, fmkVar2.a());
                                    a5.i(fmkVar2.a(), a6);
                                    amVar.b(new am.a(a6, fmkVar2.a()));
                                }
                            } else {
                                int size10 = list5.size();
                                for (int i41 = 0; i41 < size10; i41++) {
                                    fmk fmkVar3 = (fmk) list5.get(i41);
                                    int a7 = ng50Var3.a(i41);
                                    wik0Var2.h(a7, fmkVar3.a());
                                    a5.i(fmkVar3.a(), a7);
                                    amVar.b(new am.a(a7, fmkVar3.a()));
                                }
                            }
                            y52Var2.q.h(i3, wik0Var2);
                            wik0Var.h(i3, a5);
                        }
                    }
                    amVar.x(b62.b(igi0Var6, resources4));
                    c = y52Var2.A.c(i3, -1);
                    if (c == -1) {
                        xd2 c6 = ygi0.c(p52Var.getAndroidViewsHandler$ui(), c);
                        if (c6 != null) {
                            accessibilityNodeInfo4.setTraversalBefore(c6);
                            p52Var2 = p52Var;
                        } else {
                            p52Var2 = p52Var;
                            accessibilityNodeInfo4.setTraversalBefore(p52Var2, c);
                        }
                        bundle = null;
                        y52Var2.a(i3, amVar, y52Var2.C, null);
                    } else {
                        p52Var2 = p52Var;
                        bundle = null;
                    }
                    c2 = y52Var2.B.c(i3, -1);
                    if (c2 != -1 && (c3 = ygi0.c(p52Var2.getAndroidViewsHandler$ui(), c2)) != null) {
                        accessibilityNodeInfo4.setTraversalAfter(c3);
                        y52Var2.a(i3, amVar, y52Var2.D, bundle);
                    }
                    str = (String) zfi0.a(igi0Var6.n(), ogi0.b);
                    if (str != null) {
                        amVar.n(str);
                        s3q0 s3q0Var20 = s3q0.a;
                    }
                    if (y52Var2.n) {
                    }
                    return amVar;
                }
                i4 = 2;
                amVar.a(2);
                y52Var2 = y52Var;
                y52Var2.k = i3;
            } else {
                y52Var2 = y52Var;
                i4 = 2;
            }
            z = true;
            amVar.C(qxm0.o(igi0Var6) ^ z);
            if ((!igi0Var6.o() ? igi0Var6.l() : igi0Var6).m().g()) {
            }
            clzVar = (clz) zfi0.a(xfi0Var2, ngi0.k);
            if (clzVar != null) {
            }
            amVar.o(false);
            ckVar = (ck) zfi0.a(xfi0Var2, wfi0.b);
            if (ckVar != null) {
            }
            accessibilityNodeInfo4.setLongClickable(false);
            ckVar2 = (ck) zfi0.a(xfi0Var2, wfi0.c);
            if (ckVar2 != null) {
            }
            ckVar3 = (ck) zfi0.a(xfi0Var2, wfi0.q);
            if (ckVar3 != null) {
            }
            if (b62.a(igi0Var6)) {
            }
            j = y52.j(igi0Var6);
            if (!(j != null || j.length() == 0)) {
            }
            arrayList = new ArrayList();
            arrayList.add("androidx.compose.ui.semantics.id");
            h = amVar.h();
            if (!(h != null || h.length() == 0)) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (xfi0Var2.b.b(ngi0.A)) {
            }
            if (xfi0Var2.b.b(ngi0.Q)) {
            }
            xfi0Var2.getClass();
            accessibilityNodeInfo4.setAvailableExtraData(arrayList);
            t1e0Var = (t1e0) zfi0.a(igi0Var6.n(), ngi0.c);
            if (t1e0Var != null) {
            }
            i5 = Build.VERSION.SDK_INT;
            if (b62.a(igi0Var6)) {
                amVar.b(new am.a(android.R.id.accessibilityActionSetProgress, ckVar4.a));
            }
            r4g.b(amVar, igi0Var6);
            r4g.c(amVar, igi0Var6);
            qeh0Var = (qeh0) zfi0.a(igi0Var6.n(), ngi0.v);
            ck ckVar102 = (ck) zfi0.a(igi0Var6.n(), wfi0.d);
            if (qeh0Var != null) {
                if (!(zfi0.a(igi0Var6.k(), ngi0.f) == null || zfi0.a(igi0Var6.k(), ngi0.e) != null)) {
                }
                if (qeh0Var.b.invoke().floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                }
                if (b62.a(igi0Var6)) {
                }
            }
            qeh0Var2 = (qeh0) zfi0.a(igi0Var6.n(), ngi0.w);
            if (qeh0Var2 == null) {
            }
            if (i5 >= 29) {
            }
            amVar.v((CharSequence) zfi0.a(igi0Var6.n(), ngi0.d));
            if (b62.a(igi0Var6)) {
            }
            amVar.x(b62.b(igi0Var6, resources4));
            c = y52Var2.A.c(i3, -1);
            if (c == -1) {
            }
            c2 = y52Var2.B.c(i3, -1);
            if (c2 != -1) {
                accessibilityNodeInfo4.setTraversalAfter(c3);
                y52Var2.a(i3, amVar, y52Var2.D, bundle);
            }
            str = (String) zfi0.a(igi0Var6.n(), ogi0.b);
            if (str != null) {
            }
            if (y52Var2.n) {
            }
            return amVar;
        }

        @Override // xsna.bm
        public final am c(int i) {
            y52 y52Var = y52.this;
            if (i != 1) {
                if (i == 2) {
                    return b(y52Var.j);
                }
                throw new IllegalArgumentException(lhg.a(i, "Unknown focus type: "));
            }
            int i2 = y52Var.k;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:330:0x0194, code lost:
        
            r1 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:464:0x06fb, code lost:
        
            if (r0 != 16) goto L420;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:288:0x0243  */
        /* JADX WARN: Removed duplicated region for block: B:291:0x0265  */
        /* JADX WARN: Removed duplicated region for block: B:296:0x028c  */
        /* JADX WARN: Removed duplicated region for block: B:301:0x02b2  */
        /* JADX WARN: Removed duplicated region for block: B:313:0x02b4  */
        /* JADX WARN: Removed duplicated region for block: B:320:0x029b  */
        /* JADX WARN: Removed duplicated region for block: B:321:0x0274  */
        /* JADX WARN: Removed duplicated region for block: B:322:0x0246  */
        /* JADX WARN: Removed duplicated region for block: B:470:0x07ae  */
        /* JADX WARN: Removed duplicated region for block: B:504:? A[RETURN, SYNTHETIC] */
        @Override // xsna.bm
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean e(int i, int i2, Bundle bundle) {
            igi0 igi0Var;
            int i3;
            Integer num;
            dl dlVar;
            int i4;
            int i5;
            ljo0 b;
            gzs gzsVar;
            gzs gzsVar2;
            gzs gzsVar3;
            gzs gzsVar4;
            gzs gzsVar5;
            gzs gzsVar6;
            gzs gzsVar7;
            gzs gzsVar8;
            gzs gzsVar9;
            izs izsVar;
            ck ckVar;
            long j;
            float f;
            float f2;
            float f3;
            float f4;
            long floatToRawIntBits;
            long floatToRawIntBits2;
            ck ckVar2;
            izs izsVar2;
            gzs gzsVar10;
            float f5;
            float f6;
            Object obj;
            boolean z;
            gzs gzsVar11;
            float intBitsToFloat;
            gzs gzsVar12;
            izs izsVar3;
            gzs gzsVar13;
            gzs gzsVar14;
            gzs gzsVar15;
            gzs gzsVar16;
            CharSequence g;
            List list;
            y52 y52Var = y52.this;
            AccessibilityManager accessibilityManager = y52Var.e;
            Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            p52 p52Var = y52Var.b;
            lgi0 b2 = y52Var.i().b(i);
            if (b2 == null || (igi0Var = b2.a) == null) {
                return false;
            }
            LayoutNode layoutNode = igi0Var.c;
            int i6 = igi0Var.f;
            xfi0 xfi0Var = igi0Var.d;
            Object a = zfi0.a(xfi0Var, ngi0.o);
            ph50<sgi0<?>, Object> ph50Var = xfi0Var.b;
            Boolean bool = Boolean.TRUE;
            if (epx.f(a, bool)) {
                if (!(Build.VERSION.SDK_INT >= 34 ? ll.a(accessibilityManager) : true)) {
                    return false;
                }
            }
            if (i2 == 64) {
                if (!(accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled())) {
                    return false;
                }
                int i7 = y52Var.j;
                if (i7 == i) {
                    return false;
                }
                if (i7 != Integer.MIN_VALUE) {
                    i3 = 12;
                    num = null;
                    y52.u(y52Var, i7, 65536, null, 12);
                } else {
                    i3 = 12;
                    num = null;
                }
                y52Var.j = i;
                p52Var.invalidate();
                y52.u(y52Var, i, 32768, num, i3);
                return true;
            }
            if (i2 == 128) {
                if (!(y52Var.j == i)) {
                    return false;
                }
                y52Var.j = Integer.MIN_VALUE;
                y52Var.l = null;
                p52Var.invalidate();
                y52.u(y52Var, i, 65536, null, 12);
                return true;
            }
            if (i2 != 256 && i2 != 512) {
                if (i2 == 16384) {
                    ck ckVar3 = (ck) zfi0.a(xfi0Var, wfi0.q);
                    if (ckVar3 == null || (gzsVar = (gzs) ckVar3.b) == null) {
                        return false;
                    }
                    return ((Boolean) gzsVar.invoke()).booleanValue();
                }
                if (i2 == 131072) {
                    boolean A = y52Var.A(igi0Var, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
                    if (A) {
                        y52.u(y52Var, y52Var.q(i6), 0, null, 12);
                    }
                    return A;
                }
                if (!b62.a(igi0Var)) {
                    return false;
                }
                if (i2 == 1) {
                    if (p52Var.isInTouchMode()) {
                        p52Var.requestFocusFromTouch();
                    }
                    ck ckVar4 = (ck) zfi0.a(xfi0Var, wfi0.w);
                    if (ckVar4 == null || (gzsVar2 = (gzs) ckVar4.b) == null) {
                        return false;
                    }
                    return ((Boolean) gzsVar2.invoke()).booleanValue();
                }
                if (i2 == 2) {
                    if (!epx.f(zfi0.a(xfi0Var, ngi0.l), bool)) {
                        return false;
                    }
                    p52Var.getFocusOwner().n(8, false, true);
                    return true;
                }
                switch (i2) {
                    case 16:
                        ck ckVar5 = (ck) zfi0.a(xfi0Var, wfi0.b);
                        Boolean bool2 = (ckVar5 == null || (gzsVar3 = (gzs) ckVar5.b) == null) ? null : (Boolean) gzsVar3.invoke();
                        y52.u(y52Var, i, 1, null, 12);
                        if (bool2 != null) {
                            return bool2.booleanValue();
                        }
                        return false;
                    case 32:
                        ck ckVar6 = (ck) zfi0.a(xfi0Var, wfi0.c);
                        if (ckVar6 == null || (gzsVar4 = (gzs) ckVar6.b) == null) {
                            return false;
                        }
                        return ((Boolean) gzsVar4.invoke()).booleanValue();
                    case 4096:
                    case 8192:
                        break;
                    case 32768:
                        ck ckVar7 = (ck) zfi0.a(xfi0Var, wfi0.s);
                        if (ckVar7 == null || (gzsVar5 = (gzs) ckVar7.b) == null) {
                            return false;
                        }
                        return ((Boolean) gzsVar5.invoke()).booleanValue();
                    case 65536:
                        ck ckVar8 = (ck) zfi0.a(xfi0Var, wfi0.r);
                        if (ckVar8 == null || (gzsVar6 = (gzs) ckVar8.b) == null) {
                            return false;
                        }
                        return ((Boolean) gzsVar6.invoke()).booleanValue();
                    case SQLiteDatabase.OPEN_PRIVATECACHE /* 262144 */:
                        ck ckVar9 = (ck) zfi0.a(xfi0Var, wfi0.t);
                        if (ckVar9 == null || (gzsVar7 = (gzs) ckVar9.b) == null) {
                            return false;
                        }
                        return ((Boolean) gzsVar7.invoke()).booleanValue();
                    case 524288:
                        ck ckVar10 = (ck) zfi0.a(xfi0Var, wfi0.u);
                        if (ckVar10 == null || (gzsVar8 = (gzs) ckVar10.b) == null) {
                            return false;
                        }
                        return ((Boolean) gzsVar8.invoke()).booleanValue();
                    case ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES /* 1048576 */:
                        ck ckVar11 = (ck) zfi0.a(xfi0Var, wfi0.v);
                        if (ckVar11 == null || (gzsVar9 = (gzs) ckVar11.b) == null) {
                            return false;
                        }
                        return ((Boolean) gzsVar9.invoke()).booleanValue();
                    case 2097152:
                        String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                        ck ckVar12 = (ck) zfi0.a(xfi0Var, wfi0.k);
                        if (ckVar12 == null || (izsVar = (izs) ckVar12.b) == null) {
                            return false;
                        }
                        if (string == null) {
                            string = "";
                        }
                        return ((Boolean) izsVar.invoke(new us2(string))).booleanValue();
                    case android.R.id.accessibilityActionShowOnScreen:
                        igi0 l = igi0Var.l();
                        if (l != null) {
                            ckVar = (ck) zfi0.a(l.d, wfi0.d);
                            while (ckVar == null && l != null) {
                                l = l.l();
                                if (l != null) {
                                    ckVar = (ck) zfi0.a(l.d, wfi0.d);
                                }
                            }
                            if (l == null) {
                                zhf0 g2 = igi0Var.g();
                                return p52Var.requestRectangleOnScreen(new Rect((int) Math.floor(g2.a), (int) Math.floor(g2.b), an10.b((float) Math.ceil(g2.c)), an10.b((float) Math.ceil(g2.d))));
                            }
                            long j2 = 0;
                            boolean z2 = false;
                            while (l != null) {
                                LayoutNode layoutNode2 = l.c;
                                xfi0 xfi0Var2 = l.d;
                                ck ckVar13 = (ck) zfi0.a(xfi0Var2, wfi0.d);
                                if (ckVar13 != null) {
                                    zhf0 i8 = jgz.i(layoutNode2.G.c);
                                    tny y = layoutNode2.G.c.y();
                                    zhf0 j3 = i8.j(y != null ? ((androidx.compose.ui.node.o) y).D(0L) : 0L);
                                    androidx.compose.ui.node.o d = igi0Var.d();
                                    if (d != null) {
                                        if (!d.D1().o) {
                                            d = null;
                                        }
                                        if (d != null) {
                                            j = d.D(0L);
                                            long f7 = ov70.f(j, j2);
                                            androidx.compose.ui.node.o d2 = igi0Var.d();
                                            long j4 = j2;
                                            zhf0 e = p490.e(f7, pli.w(d2 == null ? d2.d : 0L));
                                            f = e.a - j3.a;
                                            f2 = e.c - j3.c;
                                            if (Math.signum(f) == Math.signum(f2)) {
                                                f = 0.0f;
                                            } else if (Math.abs(f) >= Math.abs(f2)) {
                                                f = f2;
                                            }
                                            f3 = e.b - j3.b;
                                            f4 = e.d - j3.d;
                                            if (Math.signum(f3) == Math.signum(f4)) {
                                                f3 = 0.0f;
                                            } else if (Math.abs(f3) >= Math.abs(f4)) {
                                                f3 = f4;
                                            }
                                            floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                                            if (ov70.c(floatToRawIntBits, 0L)) {
                                                float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                                                float intBitsToFloat3 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                                                if (layoutNode.A == LayoutDirection.Rtl) {
                                                    intBitsToFloat2 = -intBitsToFloat2;
                                                }
                                                floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
                                            } else {
                                                floatToRawIntBits2 = floatToRawIntBits;
                                            }
                                            wzs wzsVar = (wzs) ckVar13.b;
                                            z2 = (wzsVar == null && ((Boolean) wzsVar.invoke(Float.valueOf(Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L))))).booleanValue()) || z2;
                                            j2 = ov70.e(j4, floatToRawIntBits);
                                        }
                                    }
                                    j = 0;
                                    long f72 = ov70.f(j, j2);
                                    androidx.compose.ui.node.o d22 = igi0Var.d();
                                    long j42 = j2;
                                    zhf0 e2 = p490.e(f72, pli.w(d22 == null ? d22.d : 0L));
                                    f = e2.a - j3.a;
                                    f2 = e2.c - j3.c;
                                    if (Math.signum(f) == Math.signum(f2)) {
                                    }
                                    f3 = e2.b - j3.b;
                                    f4 = e2.d - j3.d;
                                    if (Math.signum(f3) == Math.signum(f4)) {
                                    }
                                    floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                                    if (ov70.c(floatToRawIntBits, 0L)) {
                                    }
                                    wzs wzsVar2 = (wzs) ckVar13.b;
                                    if (wzsVar2 == null) {
                                    }
                                    j2 = ov70.e(j42, floatToRawIntBits);
                                } else {
                                    j2 = j2;
                                }
                                l = l.l();
                            }
                            return z2;
                        }
                        ckVar = null;
                        break;
                    case android.R.id.accessibilityActionSetProgress:
                        if (bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || (ckVar2 = (ck) zfi0.a(xfi0Var, wfi0.i)) == null || (izsVar2 = (izs) ckVar2.b) == null) {
                            return false;
                        }
                        return ((Boolean) izsVar2.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                    case android.R.id.accessibilityActionImeEnter:
                        ck ckVar14 = (ck) zfi0.a(xfi0Var, wfi0.p);
                        if (ckVar14 == null || (gzsVar10 = (gzs) ckVar14.b) == null) {
                            return false;
                        }
                        return ((Boolean) gzsVar10.invoke()).booleanValue();
                    default:
                        switch (i2) {
                            case android.R.id.accessibilityActionScrollUp:
                            case android.R.id.accessibilityActionScrollLeft:
                            case android.R.id.accessibilityActionScrollDown:
                            case android.R.id.accessibilityActionScrollRight:
                                break;
                            default:
                                switch (i2) {
                                    case android.R.id.accessibilityActionPageUp:
                                        ck ckVar15 = (ck) zfi0.a(xfi0Var, wfi0.y);
                                        if (ckVar15 == null || (gzsVar13 = (gzs) ckVar15.b) == null) {
                                            return false;
                                        }
                                        return ((Boolean) gzsVar13.invoke()).booleanValue();
                                    case android.R.id.accessibilityActionPageDown:
                                        ck ckVar16 = (ck) zfi0.a(xfi0Var, wfi0.A);
                                        if (ckVar16 == null || (gzsVar14 = (gzs) ckVar16.b) == null) {
                                            return false;
                                        }
                                        return ((Boolean) gzsVar14.invoke()).booleanValue();
                                    case android.R.id.accessibilityActionPageLeft:
                                        ck ckVar17 = (ck) zfi0.a(xfi0Var, wfi0.z);
                                        if (ckVar17 == null || (gzsVar15 = (gzs) ckVar17.b) == null) {
                                            return false;
                                        }
                                        return ((Boolean) gzsVar15.invoke()).booleanValue();
                                    case android.R.id.accessibilityActionPageRight:
                                        ck ckVar18 = (ck) zfi0.a(xfi0Var, wfi0.B);
                                        if (ckVar18 == null || (gzsVar16 = (gzs) ckVar18.b) == null) {
                                            return false;
                                        }
                                        return ((Boolean) gzsVar16.invoke()).booleanValue();
                                    default:
                                        wik0<CharSequence> g3 = y52Var.q.g(i);
                                        if (g3 == null || (g = g3.g(i2)) == null || (list = (List) zfi0.a(xfi0Var, wfi0.x)) == null) {
                                            return false;
                                        }
                                        int size = list.size();
                                        for (int i9 = 0; i9 < size; i9++) {
                                            fmk fmkVar = (fmk) list.get(i9);
                                            if (epx.f(fmkVar.a, g)) {
                                                return fmkVar.b.invoke().booleanValue();
                                            }
                                        }
                                        return false;
                                }
                        }
                }
                boolean z3 = i2 == 4096;
                boolean z4 = i2 == 8192;
                boolean z5 = i2 == 16908345;
                boolean z6 = i2 == 16908347;
                boolean z7 = i2 == 16908344;
                boolean z8 = i2 == 16908346;
                boolean z9 = z5 || z6 || z3 || z4;
                boolean z10 = z7 || z8 || z3 || z4;
                if (z3 || z4) {
                    t1e0 t1e0Var = (t1e0) zfi0.a(xfi0Var, ngi0.c);
                    ck ckVar19 = (ck) zfi0.a(xfi0Var, wfi0.i);
                    if (t1e0Var != null) {
                        bwf<Float> bwfVar = t1e0Var.b;
                        if (ckVar19 != null) {
                            float floatValue = bwfVar.c().floatValue();
                            float floatValue2 = bwfVar.getStart().floatValue();
                            if (floatValue < floatValue2) {
                                floatValue = floatValue2;
                            }
                            float floatValue3 = bwfVar.getStart().floatValue();
                            float floatValue4 = bwfVar.c().floatValue();
                            if (floatValue3 > floatValue4) {
                                floatValue3 = floatValue4;
                            }
                            int i10 = t1e0Var.c;
                            if (i10 > 0) {
                                f5 = floatValue - floatValue3;
                                f6 = i10 + 1;
                            } else {
                                f5 = floatValue - floatValue3;
                                f6 = 20;
                            }
                            float f8 = f5 / f6;
                            if (z4) {
                                f8 = -f8;
                            }
                            izs izsVar4 = (izs) ckVar19.b;
                            if (izsVar4 != null) {
                                return ((Boolean) izsVar4.invoke(Float.valueOf(t1e0Var.a + f8))).booleanValue();
                            }
                            return false;
                        }
                    }
                }
                long d3 = jgz.i(layoutNode.G.c).d();
                ArrayList arrayList = new ArrayList();
                ck ckVar20 = (ck) zfi0.a(xfi0Var, wfi0.C);
                Float f9 = (ckVar20 == null || (izsVar3 = (izs) ckVar20.b) == null || !((Boolean) izsVar3.invoke(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
                ck ckVar21 = (ck) zfi0.a(xfi0Var, wfi0.d);
                if (ckVar21 == null) {
                    return false;
                }
                Object obj2 = ckVar21.b;
                qeh0 qeh0Var = (qeh0) zfi0.a(xfi0Var, ngi0.v);
                if (qeh0Var == null || !z9) {
                    obj = obj2;
                    z = z10;
                } else {
                    if (f9 != null) {
                        obj = obj2;
                        intBitsToFloat = f9.floatValue();
                        z = z10;
                    } else {
                        obj = obj2;
                        z = z10;
                        intBitsToFloat = Float.intBitsToFloat((int) (d3 >> 32));
                    }
                    if (z5 || z4) {
                        intBitsToFloat = -intBitsToFloat;
                    }
                    if ((layoutNode.A == LayoutDirection.Rtl) && (z5 || z6)) {
                        intBitsToFloat = -intBitsToFloat;
                    }
                    if (y52.n(qeh0Var, intBitsToFloat)) {
                        sgi0<ck<gzs<Boolean>>> sgi0Var = wfi0.z;
                        if (!ph50Var.b(sgi0Var) && !ph50Var.b(wfi0.B)) {
                            wzs wzsVar3 = (wzs) obj;
                            if (wzsVar3 != null) {
                                return ((Boolean) wzsVar3.invoke(Float.valueOf(intBitsToFloat), valueOf)).booleanValue();
                            }
                            return false;
                        }
                        ck ckVar22 = intBitsToFloat > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (ck) zfi0.a(xfi0Var, wfi0.B) : (ck) zfi0.a(xfi0Var, sgi0Var);
                        if (ckVar22 == null || (gzsVar12 = (gzs) ckVar22.b) == null) {
                            return false;
                        }
                        return ((Boolean) gzsVar12.invoke()).booleanValue();
                    }
                }
                qeh0 qeh0Var2 = (qeh0) zfi0.a(xfi0Var, ngi0.w);
                if (qeh0Var2 == null || !z) {
                    return false;
                }
                float floatValue5 = f9 != null ? f9.floatValue() : Float.intBitsToFloat((int) (d3 & 4294967295L));
                if (z7 || z4) {
                    floatValue5 = -floatValue5;
                }
                if (!y52.n(qeh0Var2, floatValue5)) {
                    return false;
                }
                sgi0<ck<gzs<Boolean>>> sgi0Var2 = wfi0.y;
                if (!ph50Var.b(sgi0Var2) && !ph50Var.b(wfi0.A)) {
                    wzs wzsVar4 = (wzs) obj;
                    if (wzsVar4 != null) {
                        return ((Boolean) wzsVar4.invoke(valueOf, Float.valueOf(floatValue5))).booleanValue();
                    }
                    return false;
                }
                ck ckVar23 = floatValue5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (ck) zfi0.a(xfi0Var, wfi0.A) : (ck) zfi0.a(xfi0Var, sgi0Var2);
                if (ckVar23 == null || (gzsVar11 = (gzs) ckVar23.b) == null) {
                    return false;
                }
                return ((Boolean) gzsVar11.invoke()).booleanValue();
            }
            if (bundle == null) {
                return false;
            }
            int i11 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
            boolean z11 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
            boolean z12 = i2 == 256;
            Integer num2 = y52Var.t;
            if (num2 == null || i6 != num2.intValue()) {
                y52Var.s = -1;
                y52Var.t = Integer.valueOf(i6);
            }
            String j5 = y52.j(igi0Var);
            if (j5 == null || j5.length() == 0) {
                return false;
            }
            String j6 = y52.j(igi0Var);
            if (j6 != null && j6.length() != 0) {
                if (i11 == 1) {
                    Locale locale = p52Var.getContext().getResources().getConfiguration().locale;
                    if (el.d == null) {
                        el elVar = new el(0);
                        elVar.c = BreakIterator.getCharacterInstance(locale);
                        el.d = elVar;
                    }
                    el elVar2 = el.d;
                    elVar2.a = j6;
                    BreakIterator breakIterator = elVar2.c;
                    if (breakIterator == null) {
                        breakIterator = null;
                    }
                    breakIterator.setText(j6);
                    dlVar = elVar2;
                } else if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            if (hl.c == null) {
                                hl.c = new hl(0);
                            }
                            hl hlVar = hl.c;
                            hlVar.a = j6;
                            dlVar = hlVar;
                        }
                    }
                    if (ph50Var.b(wfi0.a) && (b = ygi0.b(xfi0Var)) != null) {
                        if (i11 == 4) {
                            if (fl.d == null) {
                                fl.d = new fl(0);
                            }
                            fl flVar = fl.d;
                            flVar.a = j6;
                            flVar.c = b;
                            dlVar = flVar;
                        } else {
                            if (gl.e == null) {
                                gl glVar = new gl(0);
                                new Rect();
                                gl.e = glVar;
                            }
                            gl glVar2 = gl.e;
                            glVar2.a = j6;
                            glVar2.c = b;
                            glVar2.d = igi0Var;
                            dlVar = glVar2;
                        }
                    }
                } else {
                    Locale locale2 = p52Var.getContext().getResources().getConfiguration().locale;
                    if (il.d == null) {
                        il ilVar = new il(0);
                        ilVar.c = BreakIterator.getWordInstance(locale2);
                        il.d = ilVar;
                    }
                    il ilVar2 = il.d;
                    ilVar2.a = j6;
                    BreakIterator breakIterator2 = ilVar2.c;
                    if (breakIterator2 == null) {
                        breakIterator2 = null;
                    }
                    breakIterator2.setText(j6);
                    dlVar = ilVar2;
                }
                if (dlVar != null) {
                    return false;
                }
                int g4 = y52Var.g(igi0Var);
                if (g4 == -1) {
                    g4 = z12 ? 0 : j5.length();
                }
                int[] a2 = z12 ? dlVar.a(g4) : dlVar.c(g4);
                if (a2 == null) {
                    return false;
                }
                int i12 = a2[0];
                int i13 = a2[1];
                if (z11 && !ph50Var.b(ngi0.a) && ph50Var.b(ngi0.G)) {
                    i4 = y52Var.h(igi0Var);
                    if (i4 == -1) {
                        i4 = z12 ? i12 : i13;
                    }
                    i5 = z12 ? i13 : i12;
                } else {
                    i4 = z12 ? i13 : i12;
                    i5 = i4;
                }
                y52Var.x = new d(igi0Var, z12 ? 256 : 512, i11, i12, i13, SystemClock.uptimeMillis());
                y52Var.A(igi0Var, i4, i5, true);
                return true;
            }
            dlVar = null;
            if (dlVar != null) {
            }
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class d {
        public final igi0 a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final long f;

        public d(igi0 igi0Var, int i, int i2, int i3, int i4, long j) {
            this.a = igi0Var;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = j;
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class e extends Lambda implements izs<igi0, Boolean> {
        public static final e i = new e(1);

        @Override // xsna.izs
        public final Boolean invoke(igi0 igi0Var) {
            xfi0 k = igi0Var.k();
            return Boolean.valueOf(k.b.b(ngi0.B));
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class f implements tgi0 {
        public boolean b;
        public final /* synthetic */ r5j0 c;

        public f(r5j0 r5j0Var) {
            this.c = r5j0Var;
        }

        @Override // xsna.tgi0
        public final <T> void a(sgi0<T> sgi0Var, T t) {
            if (t == this.c) {
                this.b = true;
            }
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class g extends Lambda implements izs<AccessibilityEvent, Boolean> {
        public g() {
            super(1);
        }

        @Override // xsna.izs
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(y52.this.b.getParent().requestSendAccessibilityEvent(y52.this.b, accessibilityEvent));
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class h extends Lambda implements izs<xfh0, s3q0> {
        public h() {
            super(1);
        }

        @Override // xsna.izs
        public final s3q0 invoke(xfh0 xfh0Var) {
            xfh0 xfh0Var2 = xfh0Var;
            y52 y52Var = y52.this;
            ng50 ng50Var = y52.M;
            y52Var.getClass();
            if (xfh0Var2.c.contains(xfh0Var2)) {
                t590 snapshotObserver = y52Var.b.getSnapshotObserver();
                snapshotObserver.a.d(xfh0Var2, y52Var.L, new a62(xfh0Var2, y52Var));
            }
            return s3q0.a;
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class i extends Lambda implements izs<LayoutNode, Boolean> {
        public static final i i = new i(1);

        @Override // xsna.izs
        public final Boolean invoke(LayoutNode layoutNode) {
            xfi0 d = layoutNode.d();
            boolean z = false;
            if (d != null && d.d) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final class j extends Lambda implements izs<LayoutNode, Boolean> {
        public static final j i = new j(1);

        @Override // xsna.izs
        public final Boolean invoke(LayoutNode layoutNode) {
            return Boolean.valueOf(layoutNode.G.d(8));
        }
    }

    public y52(p52 p52Var) {
        this.b = p52Var;
        this.e = (AccessibilityManager) p52Var.getContext().getSystemService("accessibility");
        pg50 pg50Var = g9x.a;
        this.y = pg50Var;
        this.z = new qg50((Object) null);
        this.A = new mg50();
        this.B = new mg50();
        this.C = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.D = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.E = new txp0();
        this.F = g9x.a();
        this.G = new jgi0(p52Var.getSemanticsOwner().a(), pg50Var);
        int i2 = x8x.a;
        this.I = new mg50();
        p52Var.addOnAttachStateChangeListener(this);
        this.J = new x52(this, 0);
        this.K = new ArrayList();
        this.L = new h();
    }

    public static Rect B(androidx.compose.ui.graphics.c cVar, float f2, float f3) {
        if (!(cVar instanceof c.b) && !(cVar instanceof c.C0013c)) {
            return null;
        }
        zhf0 a2 = cVar.a();
        return new Rect((int) (a2.a + f2), (int) (a2.b + f3), (int) (a2.c + f2), (int) (a2.d + f3));
    }

    public static float[] D(androidx.compose.ui.graphics.c cVar) {
        if (!(cVar instanceof c.C0013c)) {
            return null;
        }
        c.C0013c c0013c = (c.C0013c) cVar;
        aog0 aog0Var = c0013c.a;
        aog0 aog0Var2 = c0013c.a;
        return new float[]{Float.intBitsToFloat((int) (aog0Var.e >> 32)), Float.intBitsToFloat((int) (aog0Var2.e & 4294967295L)), Float.intBitsToFloat((int) (aog0Var2.f >> 32)), Float.intBitsToFloat((int) (aog0Var2.f & 4294967295L)), Float.intBitsToFloat((int) (aog0Var2.g >> 32)), Float.intBitsToFloat((int) (aog0Var2.g & 4294967295L)), Float.intBitsToFloat((int) (aog0Var2.h >> 32)), Float.intBitsToFloat((int) (4294967295L & aog0Var2.h))};
    }

    public static Region E(androidx.compose.ui.graphics.c cVar, float f2, float f3) {
        if (!(cVar instanceof c.a)) {
            return null;
        }
        c.a aVar = (c.a) cVar;
        zhf0 i2 = aVar.a.getBounds().i(f2, f3);
        Region region = new Region(new Rect((int) (i2.a + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), (int) (i2.b + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), (int) (i2.c + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), (int) (i2.d + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
        Region region2 = new Region();
        Path path = aVar.a;
        if (!(path instanceof androidx.compose.ui.graphics.a)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path path2 = ((androidx.compose.ui.graphics.a) path).a;
        path2.offset(f2, f3);
        region2.setPath(path2, region);
        return region2;
    }

    public static CharSequence F(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i2 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i2 = 99999;
                }
                return charSequence.subSequence(0, i2);
            }
        }
        return charSequence;
    }

    public static String j(igi0 igi0Var) {
        us2 us2Var;
        if (igi0Var != null) {
            xfi0 xfi0Var = igi0Var.d;
            ph50<sgi0<?>, Object> ph50Var = xfi0Var.b;
            sgi0<List<String>> sgi0Var = ngi0.a;
            if (ph50Var.b(sgi0Var)) {
                return hgz.b((List) xfi0Var.c(sgi0Var), StringUtils.COMMA, null, 62);
            }
            sgi0<us2> sgi0Var2 = ngi0.G;
            if (ph50Var.b(sgi0Var2)) {
                us2 us2Var2 = (us2) zfi0.a(xfi0Var, sgi0Var2);
                if (us2Var2 != null) {
                    return us2Var2.c;
                }
            } else {
                List list = (List) zfi0.a(xfi0Var, ngi0.C);
                if (list != null && (us2Var = (us2) j5g.a0(list)) != null) {
                    return us2Var.c;
                }
            }
        }
        return null;
    }

    public static final boolean n(qeh0 qeh0Var, float f2) {
        gzs<Float> gzsVar = qeh0Var.a;
        if (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || gzsVar.invoke().floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && gzsVar.invoke().floatValue() < qeh0Var.b.invoke().floatValue();
        }
        return true;
    }

    public static final boolean o(qeh0 qeh0Var) {
        gzs<Float> gzsVar = qeh0Var.a;
        if (gzsVar.invoke().floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return true;
        }
        gzsVar.invoke().floatValue();
        qeh0Var.b.invoke().floatValue();
        return false;
    }

    public static final boolean p(qeh0 qeh0Var) {
        gzs<Float> gzsVar = qeh0Var.a;
        if (gzsVar.invoke().floatValue() < qeh0Var.b.invoke().floatValue()) {
            return true;
        }
        gzsVar.invoke().floatValue();
        return false;
    }

    public static /* synthetic */ void u(y52 y52Var, int i2, int i3, Integer num, int i4) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        y52Var.t(i2, i3, num, null);
    }

    public final boolean A(igi0 igi0Var, int i2, int i3, boolean z) {
        String j2;
        xfi0 xfi0Var = igi0Var.d;
        int i4 = igi0Var.f;
        sgi0<ck<yzs<Integer, Integer, Boolean, Boolean>>> sgi0Var = wfi0.j;
        if (xfi0Var.b.b(sgi0Var) && b62.a(igi0Var)) {
            yzs yzsVar = (yzs) ((ck) igi0Var.d.c(sgi0Var)).b;
            if (yzsVar != null) {
                return ((Boolean) yzsVar.invoke(Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i2 != i3 || i3 != this.s) && (j2 = j(igi0Var)) != null) {
            if (i2 < 0 || i2 != i3 || i3 > j2.length()) {
                i2 = -1;
            }
            this.s = i2;
            boolean z2 = j2.length() > 0;
            s(f(q(i4), z2 ? Integer.valueOf(this.s) : null, z2 ? Integer.valueOf(this.s) : null, z2 ? Integer.valueOf(j2.length()) : null, j2));
            w(i4);
            return true;
        }
        return false;
    }

    public final Rect C(float f2, float f3, float f4, float f5) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
        p52 p52Var = this.b;
        long k = p52Var.k(floatToRawIntBits);
        long k2 = p52Var.k((Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32));
        int i2 = (int) (k >> 32);
        int i3 = (int) (k2 >> 32);
        int i4 = (int) (k & 4294967295L);
        int i5 = (int) (k2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3))), (int) Math.floor(Math.min(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0150, code lost:
    
        if (((r1 & ((~r1) << 6)) & r24) == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0152, code lost:
    
        r29 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        char c2;
        long j2;
        long j3;
        long j4;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        long j5;
        int i2;
        int[] iArr2;
        int i3;
        char c3;
        long j6;
        qg50 qg50Var = new qg50((Object) null);
        qg50 qg50Var2 = this.z;
        int[] iArr3 = qg50Var2.b;
        long[] jArr3 = qg50Var2.a;
        int length = jArr3.length - 2;
        pg50<jgi0> pg50Var = this.F;
        char c4 = 7;
        long j7 = -9187201950435737472L;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            j3 = 128;
            while (true) {
                long j8 = jArr3[i5];
                j4 = 255;
                if ((((~j8) << c4) & j8 & j7) != j7) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j8 & 255) < 128) {
                            c3 = c4;
                            int i8 = iArr3[(i5 << 3) + i7];
                            j6 = j7;
                            lgi0 b2 = i().b(i8);
                            igi0 igi0Var = b2 != null ? b2.a : null;
                            if (igi0Var != null) {
                                if (igi0Var.d.b.b(ngi0.d)) {
                                }
                            }
                            qg50Var.b(i8);
                            jgi0 b3 = pg50Var.b(i8);
                            v(i8, 32, b3 != null ? (String) zfi0.a(b3.a, ngi0.d) : null);
                        } else {
                            c3 = c4;
                            j6 = j7;
                        }
                        j8 >>= 8;
                        i7++;
                        c4 = c3;
                        j7 = j6;
                    }
                    c2 = c4;
                    j2 = j7;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    c2 = c4;
                    j2 = j7;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                c4 = c2;
                j7 = j2;
            }
        } else {
            c2 = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
            j4 = 255;
        }
        int[] iArr4 = qg50Var.b;
        long[] jArr4 = qg50Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j9 = jArr4[i9];
                if ((((~j9) << c2) & j9 & j2) != j2) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j9 & j4) < j3) {
                            int i12 = iArr4[(i9 << 3) + i11];
                            int hashCode = Integer.hashCode(i12) * (-862048943);
                            int i13 = hashCode ^ (hashCode << 16);
                            int i14 = i13 & 127;
                            int i15 = qg50Var2.c;
                            int i16 = (i13 >>> 7) & i15;
                            i2 = i4;
                            int i17 = 0;
                            while (true) {
                                long[] jArr5 = qg50Var2.a;
                                int i18 = i16 >> 3;
                                jArr2 = jArr4;
                                int i19 = (i16 & 7) << 3;
                                long j10 = jArr5[i18] >>> i19;
                                long j11 = jArr5[i18 + 1] << (64 - i19);
                                iArr2 = iArr4;
                                long j12 = j10 | (j11 & ((-i19) >> 63));
                                j5 = j9;
                                long j13 = (i14 * 72340172838076673L) ^ j12;
                                long j14 = (j13 - 72340172838076673L) & (~j13) & j2;
                                while (true) {
                                    if (j14 == 0) {
                                        break;
                                    }
                                    i3 = (i16 + (Long.numberOfTrailingZeros(j14) >> 3)) & i15;
                                    long j15 = j14;
                                    if (qg50Var2.b[i3] == i12) {
                                        break;
                                    } else {
                                        j14 = j15 & (j15 - 1);
                                    }
                                }
                                i17 += 8;
                                i16 = (i16 + i17) & i15;
                                iArr4 = iArr2;
                                j9 = j5;
                                jArr4 = jArr2;
                            }
                            int i20 = i3;
                            if (i20 >= 0) {
                                qg50Var2.i(i20);
                            }
                        } else {
                            jArr2 = jArr4;
                            j5 = j9;
                            i2 = i4;
                            iArr2 = iArr4;
                        }
                        j9 = j5 >> i2;
                        i11++;
                        iArr4 = iArr2;
                        i4 = i2;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    int i21 = i4;
                    iArr = iArr4;
                    if (i10 != i21) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    iArr = iArr4;
                }
                if (i9 == length2) {
                    break;
                }
                i9++;
                iArr4 = iArr;
                jArr4 = jArr;
                i4 = 8;
            }
        }
        pg50Var.d();
        f9x<lgi0> i22 = i();
        int[] iArr5 = i22.b;
        Object[] objArr = i22.c;
        long[] jArr6 = i22.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i23 = 0;
            while (true) {
                long j16 = jArr6[i23];
                if ((((~j16) << c2) & j16 & j2) != j2) {
                    int i24 = 8 - ((~(i23 - length3)) >>> 31);
                    for (int i25 = 0; i25 < i24; i25++) {
                        if ((j16 & j4) < j3) {
                            int i26 = (i23 << 3) + i25;
                            int i27 = iArr5[i26];
                            igi0 igi0Var2 = ((lgi0) objArr[i26]).a;
                            xfi0 xfi0Var = igi0Var2.d;
                            sgi0<String> sgi0Var = ngi0.d;
                            if (xfi0Var.b.b(sgi0Var) && qg50Var2.b(i27)) {
                                v(i27, 16, (String) igi0Var2.d.c(sgi0Var));
                            }
                            pg50Var.k(i27, new jgi0(igi0Var2, i()));
                        }
                        j16 >>= 8;
                    }
                    if (i24 != 8) {
                        break;
                    }
                }
                if (i23 == length3) {
                    break;
                } else {
                    i23++;
                }
            }
        }
        this.G = new jgi0(this.b.getSemanticsOwner().a(), i());
    }

    public final void a(int i2, am amVar, String str, Bundle bundle) {
        igi0 igi0Var;
        r5j0 r5j0Var;
        int i3;
        p52 p52Var;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = amVar.a;
        lgi0 b2 = i().b(i2);
        if (b2 == null || (igi0Var = b2.a) == null) {
            return;
        }
        LayoutNode layoutNode = igi0Var.c;
        xfi0 xfi0Var = igi0Var.d;
        ph50<sgi0<?>, Object> ph50Var = xfi0Var.b;
        String j2 = j(igi0Var);
        if (epx.f(str, this.C)) {
            int c2 = this.A.c(i2, -1);
            if (c2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, c2);
                return;
            }
            return;
        }
        if (epx.f(str, this.D)) {
            int c3 = this.B.c(i2, -1);
            if (c3 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, c3);
                return;
            }
            return;
        }
        boolean b3 = ph50Var.b(wfi0.a);
        p52 p52Var2 = this.b;
        if (b3 && bundle != null && epx.f(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i5 > 0 && i4 >= 0) {
                if (i4 < (j2 != null ? j2.length() : Integer.MAX_VALUE)) {
                    ljo0 b4 = ygi0.b(xfi0Var);
                    if (b4 == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i6 = 0;
                    while (i6 < i5) {
                        int i7 = i4 + i6;
                        if (i7 >= b4.a.a.c.length()) {
                            arrayList.add(null);
                            i3 = i6;
                            p52Var = p52Var2;
                        } else {
                            zhf0 b5 = b4.b(i7);
                            androidx.compose.ui.node.o d2 = igi0Var.d();
                            long j3 = 0;
                            if (d2 != null) {
                                if (!d2.D1().o) {
                                    d2 = null;
                                }
                                if (d2 != null) {
                                    j3 = d2.D(0L);
                                }
                            }
                            zhf0 j4 = b5.j(j3);
                            zhf0 g2 = igi0Var.g();
                            if ((j4.h(g2) ? j4.f(g2) : null) != null) {
                                long k = p52Var2.k((Float.floatToRawIntBits(r9.b) & 4294967295L) | (Float.floatToRawIntBits(r9.a) << 32));
                                long k2 = p52Var2.k((Float.floatToRawIntBits(r9.d) & 4294967295L) | (Float.floatToRawIntBits(r9.c) << 32));
                                int i8 = (int) (k >> 32);
                                int i9 = i6;
                                int i10 = (int) (k2 >> 32);
                                p52 p52Var3 = p52Var2;
                                int i11 = (int) (k & 4294967295L);
                                p52Var = p52Var3;
                                i3 = i9;
                                int i12 = (int) (k2 & 4294967295L);
                                rectF = new RectF(Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i10)), Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i10)), Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)));
                            } else {
                                i3 = i6;
                                p52Var = p52Var2;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i6 = i3 + 1;
                        p52Var2 = p52Var;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        sgi0<String> sgi0Var = ngi0.A;
        if (ph50Var.b(sgi0Var) && bundle != null && epx.f(str, "androidx.compose.ui.semantics.testTag")) {
            String str2 = (String) zfi0.a(xfi0Var, sgi0Var);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (epx.f(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, igi0Var.f);
            return;
        }
        if (epx.f(str, "androidx.compose.ui.semantics.shapeType")) {
            r5j0 r5j0Var2 = (r5j0) zfi0.a(xfi0Var, ngi0.Q);
            if (r5j0Var2 != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                zhf0 k3 = k(igi0Var, rect, r5j0Var2);
                float f2 = k3.b;
                float f3 = k3.a;
                androidx.compose.ui.graphics.c a2 = r5j0Var2.a(k3.d(), layoutNode.A, p52Var2.getDensity());
                if (a2 instanceof c.b) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", B(a2, f3, f2));
                    return;
                } else if (a2 instanceof c.C0013c) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", B(a2, f3, f2));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", D(a2));
                    return;
                } else {
                    if (!(a2 instanceof c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", E(a2, f3, f2));
                    return;
                }
            }
            return;
        }
        if (epx.f(str, "androidx.compose.ui.semantics.shapeRect")) {
            r5j0 r5j0Var3 = (r5j0) zfi0.a(xfi0Var, ngi0.Q);
            if (r5j0Var3 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                zhf0 k4 = k(igi0Var, rect2, r5j0Var3);
                Rect B = B(r5j0Var3.a(k4.d(), layoutNode.A, p52Var2.getDensity()), k4.a, k4.b);
                if (B != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", B);
                    return;
                }
                return;
            }
            return;
        }
        if (epx.f(str, "androidx.compose.ui.semantics.shapeCorners")) {
            r5j0 r5j0Var4 = (r5j0) zfi0.a(xfi0Var, ngi0.Q);
            if (r5j0Var4 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] D = D(r5j0Var4.a(k(igi0Var, rect3, r5j0Var4).d(), layoutNode.A, p52Var2.getDensity()));
                if (D != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", D);
                    return;
                }
                return;
            }
            return;
        }
        if (!epx.f(str, "androidx.compose.ui.semantics.shapeRegion") || (r5j0Var = (r5j0) zfi0.a(xfi0Var, ngi0.Q)) == null) {
            return;
        }
        Rect rect4 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect4);
        zhf0 k5 = k(igi0Var, rect4, r5j0Var);
        Region E = E(r5j0Var.a(k5.d(), layoutNode.A, p52Var2.getDensity()), k5.a, k5.b);
        if (E != null) {
            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", E);
        }
    }

    public final Rect b(lgi0 lgi0Var) {
        l9x l9xVar = lgi0Var.b;
        return C(l9xVar.a, l9xVar.b, l9xVar.c, l9xVar.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c1, code lost:
    
        if (xsna.qsl.b(r7, r0) == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0030, B:14:0x0060, B:20:0x0071, B:22:0x0079, B:24:0x0082, B:26:0x0087, B:28:0x0096, B:31:0x00a1, B:32:0x00a8, B:40:0x0049, B:42:0x0050), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v10, types: [xsna.o0b] */
    /* JADX WARN: Type inference failed for: r2v8, types: [xsna.o0b] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c1 -> B:13:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        z52 z52Var;
        int i2;
        el3<LayoutNode> el3Var;
        qg50 qg50Var;
        nm8.a aVar;
        qg50 qg50Var2;
        nm8.a aVar2;
        Object a2;
        try {
            if (continuationImpl instanceof z52) {
                z52Var = (z52) continuationImpl;
                int i3 = z52Var.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    z52Var.label = i3 - Integer.MIN_VALUE;
                    Object obj = z52Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = z52Var.label;
                    el3Var = this.u;
                    if (i2 != 0) {
                        kotlin.a.a(obj);
                        qg50Var = new qg50((Object) null);
                        nm8 nm8Var = this.v;
                        nm8Var.getClass();
                        aVar = new nm8.a();
                        z52Var.L$0 = qg50Var;
                        z52Var.L$1 = aVar;
                        z52Var.label = 1;
                        a2 = aVar.a(z52Var);
                        if (a2 != coroutineSingletons) {
                        }
                    } else if (i2 == 1) {
                        ?? r2 = (o0b) z52Var.L$1;
                        qg50Var2 = (qg50) z52Var.L$0;
                        kotlin.a.a(obj);
                        aVar2 = r2;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r22 = (o0b) z52Var.L$1;
                        qg50Var2 = (qg50) z52Var.L$0;
                        kotlin.a.a(obj);
                        nm8.a aVar3 = r22;
                        qg50Var = qg50Var2;
                        aVar = aVar3;
                        z52Var.L$0 = qg50Var;
                        z52Var.L$1 = aVar;
                        z52Var.label = 1;
                        a2 = aVar.a(z52Var);
                        if (a2 != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        nm8.a aVar4 = aVar;
                        qg50Var2 = qg50Var;
                        obj = a2;
                        aVar2 = aVar4;
                        if (((Boolean) obj).booleanValue()) {
                            el3Var.clear();
                            return s3q0.a;
                        }
                        aVar2.next();
                        if (l()) {
                            int i4 = el3Var.d;
                            for (int i5 = 0; i5 < i4; i5++) {
                                LayoutNode layoutNode = (LayoutNode) el3Var.c[i5];
                                y(layoutNode, qg50Var2);
                                z(layoutNode);
                            }
                            qg50Var2.c();
                            Handler handler = this.h;
                            if (!this.H && handler != null) {
                                this.H = true;
                                handler.post(this.J);
                            }
                        }
                        el3Var.clear();
                        this.o.d();
                        this.p.d();
                        long j2 = this.f;
                        z52Var.L$0 = qg50Var2;
                        z52Var.L$1 = aVar2;
                        z52Var.label = 2;
                        aVar3 = aVar2;
                    }
                }
            }
            if (i2 != 0) {
            }
        } catch (Throwable th) {
            el3Var.clear();
            throw th;
        }
        z52Var = new z52(this, continuationImpl);
        Object obj2 = z52Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = z52Var.label;
        el3Var = this.u;
    }

    public final AccessibilityEvent createEvent(int i2, int i3) {
        lgi0 b2;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        p52 p52Var = this.b;
        obtain.setPackageName(p52Var.getContext().getPackageName());
        obtain.setSource(p52Var, i2);
        if (l() && (b2 = i().b(i2)) != null) {
            igi0 igi0Var = b2.a;
            obtain.setPassword(igi0Var.d.b.b(ngi0.L));
            boolean f2 = epx.f(zfi0.a(igi0Var.d, ngi0.o), Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                jk.a.a(obtain, f2);
            }
        }
        return obtain;
    }

    public final boolean d(int i2, long j2, boolean z) {
        sgi0<qeh0> sgi0Var;
        int i3;
        qeh0 qeh0Var;
        if (!epx.f(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        f9x<lgi0> i4 = i();
        if (ov70.c(j2, 9205357640488583168L) || (((9223372034707292159L & j2) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z) {
            sgi0Var = ngi0.w;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            sgi0Var = ngi0.v;
        }
        Object[] objArr = i4.c;
        long[] jArr = i4.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        while (true) {
            long j3 = jArr[i5];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i7 = 8 - ((~(i5 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((255 & j3) < 128) {
                        lgi0 lgi0Var = (lgi0) objArr[(i5 << 3) + i8];
                        l9x l9xVar = lgi0Var.b;
                        float f2 = l9xVar.a;
                        i3 = i6;
                        float f3 = l9xVar.b;
                        float f4 = l9xVar.c;
                        float f5 = l9xVar.d;
                        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                        if (((intBitsToFloat2 < f5) & (intBitsToFloat >= f2) & (intBitsToFloat < f4) & (intBitsToFloat2 >= f3)) && (qeh0Var = (qeh0) zfi0.a(lgi0Var.a.d, sgi0Var)) != null) {
                            gzs<Float> gzsVar = qeh0Var.a;
                            if (i2 < 0) {
                                if (gzsVar.invoke().floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                }
                                z2 = true;
                            } else {
                                if (gzsVar.invoke().floatValue() >= qeh0Var.b.invoke().floatValue()) {
                                }
                                z2 = true;
                            }
                        }
                    } else {
                        i3 = i6;
                    }
                    j3 >>= i3;
                    i8++;
                    i6 = i3;
                }
                if (i7 != i6) {
                    return z2;
                }
            }
            if (i5 == length) {
                return z2;
            }
            i5++;
        }
    }

    public final void e() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (l()) {
                r(this.b.getSemanticsOwner().a(), this.G);
            }
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                x(i());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    G();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final AccessibilityEvent f(int i2, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent createEvent = createEvent(i2, 8192);
        if (num != null) {
            createEvent.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            createEvent.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            createEvent.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            createEvent.getText().add(charSequence);
        }
        return createEvent;
    }

    public final int g(igi0 igi0Var) {
        xfi0 xfi0Var = igi0Var.d;
        xfi0 xfi0Var2 = igi0Var.d;
        sgi0<List<String>> sgi0Var = ngi0.a;
        if (!xfi0Var.b.b(ngi0.a)) {
            sgi0<qko0> sgi0Var2 = ngi0.H;
            if (xfi0Var2.b.b(sgi0Var2)) {
                return (int) (((qko0) xfi0Var2.c(sgi0Var2)).a & 4294967295L);
            }
        }
        return this.s;
    }

    @Override // xsna.hk
    public final bm getAccessibilityNodeProvider(View view) {
        return this.i;
    }

    public final int h(igi0 igi0Var) {
        xfi0 xfi0Var = igi0Var.d;
        xfi0 xfi0Var2 = igi0Var.d;
        sgi0<List<String>> sgi0Var = ngi0.a;
        if (!xfi0Var.b.b(ngi0.a)) {
            sgi0<qko0> sgi0Var2 = ngi0.H;
            if (xfi0Var2.b.b(sgi0Var2)) {
                return (int) (((qko0) xfi0Var2.c(sgi0Var2)).a >> 32);
            }
        }
        return this.s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f9x<lgi0> i() {
        if (this.w) {
            this.w = false;
            p52 p52Var = this.b;
            this.y = qxm0.i(p52Var.getSemanticsOwner(), e.i);
            if (l()) {
                pg50 pg50Var = this.y;
                Resources resources = p52Var.getContext().getResources();
                mg50 mg50Var = this.A;
                mg50Var.d();
                mg50 mg50Var2 = this.B;
                mg50Var2.d();
                lgi0 lgi0Var = (lgi0) pg50Var.b(-1);
                igi0 igi0Var = lgi0Var != null ? lgi0Var.a : null;
                ArrayList b2 = wgi0.b(igi0Var, new d62(pg50Var), new e62(resources), Collections.singletonList(igi0Var));
                int h2 = e43.h(b2);
                int i2 = 1;
                if (1 <= h2) {
                    while (true) {
                        int i3 = ((igi0) b2.get(i2 - 1)).f;
                        int i4 = ((igi0) b2.get(i2)).f;
                        mg50Var.g(i3, i4);
                        mg50Var2.g(i4, i3);
                        if (i2 == h2) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return this.y;
    }

    public final zhf0 k(igi0 igi0Var, Rect rect, r5j0 r5j0Var) {
        q630.c z;
        f fVar = new f(r5j0Var);
        LayoutNode layoutNode = igi0Var.c;
        q630.c cVar = layoutNode.G.f;
        Object obj = null;
        if ((cVar.e & 8) != 0) {
            loop0: while (true) {
                if (cVar == null) {
                    break;
                }
                if ((cVar.d & 8) != 0) {
                    q630.c cVar2 = cVar;
                    ci50 ci50Var = null;
                    while (cVar2 != null) {
                        if (cVar2 instanceof fgi0) {
                            ((fgi0) cVar2).l1(fVar);
                            if (fVar.b) {
                                obj = cVar2;
                                break loop0;
                            }
                        } else if ((cVar2.d & 8) != 0 && (cVar2 instanceof ytl)) {
                            int i2 = 0;
                            for (q630.c cVar3 = ((ytl) cVar2).q; cVar3 != null; cVar3 = cVar3.g) {
                                if ((cVar3.d & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        cVar2 = cVar3;
                                    } else {
                                        if (ci50Var == null) {
                                            ci50Var = new ci50(new q630.c[16]);
                                        }
                                        if (cVar2 != null) {
                                            ci50Var.b(cVar2);
                                            cVar2 = null;
                                        }
                                        ci50Var.b(cVar3);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        cVar2 = itl.b(ci50Var);
                    }
                }
                if ((cVar.e & 8) == 0) {
                    break;
                }
                cVar = cVar.g;
            }
        }
        fgi0 fgi0Var = (fgi0) obj;
        if (fgi0Var == null || (z = fgi0Var.z()) == null || !z.o) {
            return jgz.j(layoutNode.G.d, false);
        }
        androidx.compose.ui.node.o e2 = itl.e(fgi0Var);
        zhf0 z2 = jgz.p(e2).z(e2, false);
        Rect C = C(z2.a, z2.b, z2.c, z2.d);
        float f2 = C.left - rect.left;
        float f3 = C.top - rect.top;
        return new zhf0(f2, f3, C.width() + f2, C.height() + f3);
    }

    public final boolean l() {
        AccessibilityManager accessibilityManager = this.e;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        Collection collection = this.g;
        Collection collection2 = collection;
        if (collection == null) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.g = enabledAccessibilityServiceList;
            collection2 = enabledAccessibilityServiceList;
        }
        return !collection2.isEmpty();
    }

    public final void m(LayoutNode layoutNode) {
        if (this.u.add(layoutNode)) {
            this.v.f(s3q0.a);
        }
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.g = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.g = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.e;
        if (accessibilityManager.isEnabled()) {
            this.g = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.h.removeCallbacks(this.J);
        AccessibilityManager accessibilityManager = this.e;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final int q(int i2) {
        if (i2 == this.b.getSemanticsOwner().a().f) {
            return -1;
        }
        return i2;
    }

    public final void r(igi0 igi0Var, jgi0 jgi0Var) {
        qg50 a2 = p9x.a();
        List j2 = igi0.j(4, igi0Var);
        LayoutNode layoutNode = igi0Var.c;
        int size = j2.size();
        for (int i2 = 0; i2 < size; i2++) {
            igi0 igi0Var2 = (igi0) j2.get(i2);
            f9x<lgi0> i3 = i();
            int i4 = igi0Var2.f;
            if (i3.a(i4)) {
                if (!jgi0Var.b.a(i4)) {
                    m(layoutNode);
                    return;
                }
                a2.b(i4);
            }
        }
        qg50 qg50Var = jgi0Var.b;
        int[] iArr = qg50Var.b;
        long[] jArr = qg50Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j3 = jArr[i5];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j3) < 128 && !a2.a(iArr[(i5 << 3) + i7])) {
                            m(layoutNode);
                            return;
                        }
                        j3 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        List j4 = igi0.j(4, igi0Var);
        int size2 = j4.size();
        for (int i8 = 0; i8 < size2; i8++) {
            igi0 igi0Var3 = (igi0) j4.get(i8);
            jgi0 b2 = this.F.b(igi0Var3.f);
            if (b2 != null && i().a(igi0Var3.f)) {
                r(igi0Var3, b2);
            }
        }
    }

    public final boolean s(AccessibilityEvent accessibilityEvent) {
        if (!l()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.n = true;
        }
        try {
            return ((Boolean) this.d.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.n = false;
        }
    }

    public final boolean t(int i2, int i3, Integer num, List<String> list) {
        if (i2 == Integer.MIN_VALUE || !l()) {
            return false;
        }
        AccessibilityEvent createEvent = createEvent(i2, i3);
        if (num != null) {
            createEvent.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            createEvent.setContentDescription(hgz.b(list, StringUtils.COMMA, null, 62));
        }
        return s(createEvent);
    }

    public final void v(int i2, int i3, String str) {
        AccessibilityEvent createEvent = createEvent(q(i2), 32);
        createEvent.setContentChangeTypes(i3);
        if (str != null) {
            createEvent.getText().add(str);
        }
        s(createEvent);
    }

    public final void w(int i2) {
        d dVar = this.x;
        if (dVar != null) {
            igi0 igi0Var = dVar.a;
            if (i2 != igi0Var.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - dVar.f <= 1000) {
                AccessibilityEvent createEvent = createEvent(q(igi0Var.f), 131072);
                createEvent.setFromIndex(dVar.d);
                createEvent.setToIndex(dVar.e);
                createEvent.setAction(dVar.b);
                createEvent.setMovementGranularity(dVar.c);
                createEvent.getText().add(j(igi0Var));
                s(createEvent);
            }
        }
        this.x = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x0526, code lost:
    
        if (r2 != 0) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x052b, code lost:
    
        if (r2 == 0) goto L205;
     */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(f9x<lgi0> f9xVar) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        Integer num2;
        int i2;
        int i3;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        Integer num4;
        int i7;
        jgi0 b2;
        int i8;
        igi0 igi0Var;
        boolean z;
        xfi0 xfi0Var;
        boolean z2;
        ph50<sgi0<?>, Object> ph50Var;
        int i9;
        ph50<sgi0<?>, Object> ph50Var2;
        LayoutNode layoutNode;
        int i10;
        int i11;
        ph50<sgi0<?>, Object> ph50Var3;
        Integer num5;
        ArrayList arrayList3;
        long j2;
        int i12;
        igi0 igi0Var2;
        int i13;
        ph50<sgi0<?>, Object> ph50Var4;
        LayoutNode layoutNode2;
        Integer num6;
        int i14;
        xfi0 xfi0Var2;
        int i15;
        int i16;
        boolean z3;
        sgi0<String> sgi0Var;
        boolean z4;
        int i17;
        String str;
        xfi0 xfi0Var3;
        int i18;
        int i19;
        int i20;
        AccessibilityEvent f2;
        LayoutNode layoutNode3;
        f9x<lgi0> f9xVar2 = f9xVar;
        Integer num7 = 64;
        ArrayList arrayList4 = this.K;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = f9xVar2.b;
        long[] jArr3 = f9xVar2.a;
        int i21 = 2;
        int length = jArr3.length - 2;
        int i22 = 0;
        Integer num8 = 0;
        if (length < 0) {
            return;
        }
        int i23 = 0;
        while (true) {
            long j3 = jArr3[i23];
            int i24 = i21;
            int i25 = length;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i26 = 8;
                int i27 = 8 - ((~(i23 - i25)) >>> 31);
                long j4 = j3;
                int i28 = i22;
                while (i28 < i27) {
                    if ((j4 & 255) >= 128 || (b2 = this.F.b((i7 = iArr3[(i23 << 3) + i28]))) == null) {
                        i3 = i28;
                        num3 = num7;
                        arrayList2 = arrayList5;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i4 = i26;
                        i5 = i27;
                        i6 = i23;
                        num4 = num8;
                    } else {
                        xfi0 xfi0Var4 = b2.a;
                        ph50<sgi0<?>, Object> ph50Var5 = xfi0Var4.b;
                        lgi0 b3 = f9xVar2.b(i7);
                        int i29 = i26;
                        igi0 igi0Var3 = b3 != null ? b3.a : null;
                        if (igi0Var3 == null) {
                            throw pm0.f("no value for specified key");
                        }
                        LayoutNode layoutNode4 = igi0Var3.c;
                        xfi0 xfi0Var5 = igi0Var3.d;
                        iArr2 = iArr3;
                        int i30 = igi0Var3.f;
                        jArr2 = jArr3;
                        ph50<sgi0<?>, Object> ph50Var6 = xfi0Var5.b;
                        i6 = i23;
                        Object[] objArr = ph50Var6.b;
                        Object[] objArr2 = ph50Var6.c;
                        long[] jArr4 = ph50Var6.a;
                        i3 = i28;
                        int length2 = jArr4.length - 2;
                        if (length2 >= 0) {
                            int i31 = i30;
                            ph50<sgi0<?>, Object> ph50Var7 = ph50Var6;
                            int i32 = 0;
                            z2 = false;
                            while (true) {
                                long j5 = jArr4[i32];
                                LayoutNode layoutNode5 = layoutNode4;
                                i5 = i27;
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i33 = 8 - ((~(i32 - length2)) >>> 31);
                                    int i34 = 0;
                                    while (i34 < i33) {
                                        if ((j5 & 255) < 128) {
                                            int i35 = (i32 << 3) + i34;
                                            Object obj = objArr[i35];
                                            int i36 = length2;
                                            Object obj2 = objArr2[i35];
                                            j2 = j5;
                                            sgi0 sgi0Var2 = (sgi0) obj;
                                            sgi0<qeh0> sgi0Var3 = ngi0.v;
                                            if (epx.f(sgi0Var2, sgi0Var3)) {
                                                i12 = i34;
                                            } else {
                                                i12 = i34;
                                                if (!epx.f(sgi0Var2, ngi0.w)) {
                                                    z3 = false;
                                                    if (!z3 || !epx.f(obj2, zfi0.a(xfi0Var4, sgi0Var2))) {
                                                        sgi0Var = ngi0.d;
                                                        if (!epx.f(sgi0Var2, sgi0Var)) {
                                                            String str2 = (String) obj2;
                                                            boolean b4 = ph50Var5.b(sgi0Var);
                                                            int i37 = i29;
                                                            if (b4) {
                                                                v(i7, i37, str2);
                                                            }
                                                            s3q0 s3q0Var = s3q0.a;
                                                        } else if (epx.f(sgi0Var2, ngi0.b)) {
                                                            u(this, q(i7), 2048, num7, 8);
                                                            u(this, q(i7), 2048, num8, 8);
                                                        } else {
                                                            arrayList3 = arrayList5;
                                                            if (epx.f(sgi0Var2, ngi0.K)) {
                                                                u(this, q(i7), 2048, 8192, 8);
                                                                u(this, q(i7), 2048, num8, 8);
                                                            } else if (epx.f(sgi0Var2, ngi0.M)) {
                                                                u(this, q(i7), 2048, 3072, 8);
                                                            } else if (epx.f(sgi0Var2, ngi0.c)) {
                                                                u(this, q(i7), 2048, num7, 8);
                                                                u(this, q(i7), 2048, num8, 8);
                                                            } else {
                                                                sgi0<Boolean> sgi0Var4 = ngi0.J;
                                                                if (epx.f(sgi0Var2, sgi0Var4)) {
                                                                    plg0 plg0Var = (plg0) zfi0.a(xfi0Var5, ngi0.z);
                                                                    if (!(plg0Var != null && plg0Var.a == 4)) {
                                                                        igi0Var2 = igi0Var3;
                                                                        i13 = i32;
                                                                        layoutNode3 = layoutNode5;
                                                                        u(this, q(i7), 2048, num7, 8);
                                                                        u(this, q(i7), 2048, num8, 8);
                                                                    } else if (epx.f(zfi0.a(xfi0Var5, sgi0Var4), Boolean.TRUE)) {
                                                                        AccessibilityEvent createEvent = createEvent(q(i7), 4);
                                                                        layoutNode3 = layoutNode5;
                                                                        igi0 igi0Var4 = new igi0(igi0Var3.a, true, layoutNode3, xfi0Var5);
                                                                        List list = (List) zfi0.a(igi0Var4.k(), ngi0.a);
                                                                        igi0Var2 = igi0Var3;
                                                                        String b5 = list != null ? hgz.b(list, StringUtils.COMMA, null, 62) : null;
                                                                        List list2 = (List) zfi0.a(igi0Var4.k(), ngi0.C);
                                                                        i13 = i32;
                                                                        String b6 = list2 != null ? hgz.b(list2, StringUtils.COMMA, null, 62) : null;
                                                                        if (b5 != null) {
                                                                            createEvent.setContentDescription(b5);
                                                                            s3q0 s3q0Var2 = s3q0.a;
                                                                        }
                                                                        if (b6 != null) {
                                                                            createEvent.getText().add(b6);
                                                                        }
                                                                        s(createEvent);
                                                                    } else {
                                                                        igi0Var2 = igi0Var3;
                                                                        i13 = i32;
                                                                        layoutNode3 = layoutNode5;
                                                                        u(this, q(i7), 2048, num8, 8);
                                                                    }
                                                                    num6 = num8;
                                                                    i14 = i7;
                                                                    num5 = num7;
                                                                    layoutNode2 = layoutNode3;
                                                                } else {
                                                                    igi0Var2 = igi0Var3;
                                                                    i13 = i32;
                                                                    layoutNode2 = layoutNode5;
                                                                    if (epx.f(sgi0Var2, ngi0.a)) {
                                                                        t(q(i7), 2048, 4, (List) obj2);
                                                                        num6 = num8;
                                                                        i14 = i7;
                                                                        num5 = num7;
                                                                    } else {
                                                                        sgi0<us2> sgi0Var5 = ngi0.G;
                                                                        String str3 = "";
                                                                        if (epx.f(sgi0Var2, sgi0Var5)) {
                                                                            ph50Var4 = ph50Var7;
                                                                            if (ph50Var4.b(wfi0.k)) {
                                                                                us2 us2Var = (us2) zfi0.a(xfi0Var4, sgi0Var5);
                                                                                if (us2Var == null) {
                                                                                    us2Var = "";
                                                                                }
                                                                                CharSequence charSequence = (us2) zfi0.a(xfi0Var5, sgi0Var5);
                                                                                if (charSequence == null) {
                                                                                    charSequence = "";
                                                                                }
                                                                                CharSequence F = F(charSequence);
                                                                                int length3 = us2Var.length();
                                                                                int length4 = charSequence.length();
                                                                                Integer num9 = num8;
                                                                                int i38 = length3 > length4 ? length4 : length3;
                                                                                xfi0Var3 = xfi0Var4;
                                                                                int i39 = 0;
                                                                                while (true) {
                                                                                    i19 = i38;
                                                                                    if (i39 >= i38) {
                                                                                        num5 = num7;
                                                                                        break;
                                                                                    }
                                                                                    num5 = num7;
                                                                                    if (us2Var.charAt(i39) != charSequence.charAt(i39)) {
                                                                                        break;
                                                                                    }
                                                                                    i39++;
                                                                                    i38 = i19;
                                                                                    num7 = num5;
                                                                                }
                                                                                int i40 = 0;
                                                                                while (true) {
                                                                                    if (i40 >= i19 - i39) {
                                                                                        i20 = i40;
                                                                                        break;
                                                                                    }
                                                                                    i20 = i40;
                                                                                    if (us2Var.charAt((length3 - 1) - i40) != charSequence.charAt((length4 - 1) - i20)) {
                                                                                        break;
                                                                                    } else {
                                                                                        i40 = i20 + 1;
                                                                                    }
                                                                                }
                                                                                int i41 = (length3 - i20) - i39;
                                                                                int i42 = (length4 - i20) - i39;
                                                                                sgi0<s3q0> sgi0Var6 = ngi0.L;
                                                                                boolean b7 = ph50Var5.b(sgi0Var6);
                                                                                boolean b8 = ph50Var4.b(sgi0Var6);
                                                                                boolean b9 = ph50Var5.b(ngi0.G);
                                                                                boolean z5 = b9 && !b7 && b8;
                                                                                boolean z6 = b9 && b7 && !b8;
                                                                                if (z5 || z6) {
                                                                                    int q = q(i7);
                                                                                    Integer valueOf = Integer.valueOf(length4);
                                                                                    i14 = i7;
                                                                                    i18 = i36;
                                                                                    num8 = num9;
                                                                                    ph50Var3 = ph50Var5;
                                                                                    f2 = f(q, num8, num9, valueOf, F);
                                                                                } else {
                                                                                    AccessibilityEvent createEvent2 = createEvent(q(i7), 16);
                                                                                    createEvent2.setFromIndex(i39);
                                                                                    createEvent2.setRemovedCount(i41);
                                                                                    createEvent2.setAddedCount(i42);
                                                                                    createEvent2.setBeforeText(us2Var);
                                                                                    createEvent2.getText().add(F);
                                                                                    i14 = i7;
                                                                                    f2 = createEvent2;
                                                                                    i18 = i36;
                                                                                    num8 = num9;
                                                                                    ph50Var3 = ph50Var5;
                                                                                }
                                                                                f2.setClassName("android.widget.EditText");
                                                                                s(f2);
                                                                                if (z5 || z6) {
                                                                                    long j6 = ((qko0) xfi0Var5.c(ngi0.H)).a;
                                                                                    f2.setFromIndex((int) (j6 >> 32));
                                                                                    f2.setToIndex((int) (j6 & 4294967295L));
                                                                                    s(f2);
                                                                                }
                                                                                s3q0 s3q0Var3 = s3q0.a;
                                                                            } else {
                                                                                i14 = i7;
                                                                                xfi0Var3 = xfi0Var4;
                                                                                num5 = num7;
                                                                                i18 = i36;
                                                                                ph50Var3 = ph50Var5;
                                                                                u(this, q(i14), 2048, Integer.valueOf(i24), 8);
                                                                            }
                                                                            i16 = i18;
                                                                            i15 = i31;
                                                                            xfi0Var2 = xfi0Var3;
                                                                            num6 = num8;
                                                                        } else {
                                                                            i14 = i7;
                                                                            num5 = num7;
                                                                            ph50Var4 = ph50Var7;
                                                                            i16 = i36;
                                                                            xfi0Var2 = xfi0Var4;
                                                                            ph50Var3 = ph50Var5;
                                                                            sgi0<qko0> sgi0Var7 = ngi0.H;
                                                                            if (epx.f(sgi0Var2, sgi0Var7)) {
                                                                                us2 us2Var2 = (us2) zfi0.a(xfi0Var5, sgi0Var5);
                                                                                if (us2Var2 != null && (str = us2Var2.c) != null) {
                                                                                    str3 = str;
                                                                                }
                                                                                long j7 = ((qko0) xfi0Var5.c(sgi0Var7)).a;
                                                                                num6 = num8;
                                                                                s(f(q(i14), Integer.valueOf((int) (j7 >> 32)), Integer.valueOf((int) (j7 & 4294967295L)), Integer.valueOf(str3.length()), F(str3)));
                                                                                int i43 = i31;
                                                                                w(i43);
                                                                                s3q0 s3q0Var4 = s3q0.a;
                                                                                i15 = i43;
                                                                                i16 = i16;
                                                                            } else {
                                                                                num6 = num8;
                                                                                int i44 = i31;
                                                                                if (epx.f(sgi0Var2, sgi0Var3) || epx.f(sgi0Var2, ngi0.w)) {
                                                                                    i15 = i44;
                                                                                    m(layoutNode2);
                                                                                    xfh0 a2 = ygi0.a(i14, arrayList4);
                                                                                    a2.f = (qeh0) zfi0.a(xfi0Var5, sgi0Var3);
                                                                                    a2.g = (qeh0) zfi0.a(xfi0Var5, ngi0.w);
                                                                                    if (a2.c.contains(a2)) {
                                                                                        this.b.getSnapshotObserver().a.d(a2, this.L, new a62(a2, this));
                                                                                    }
                                                                                    s3q0 s3q0Var5 = s3q0.a;
                                                                                } else if (epx.f(sgi0Var2, ngi0.l)) {
                                                                                    if (((Boolean) obj2).booleanValue()) {
                                                                                        i17 = 8;
                                                                                        s(createEvent(q(i44), 8));
                                                                                    } else {
                                                                                        i17 = 8;
                                                                                    }
                                                                                    u(this, q(i44), 2048, num6, i17);
                                                                                    i15 = i44;
                                                                                } else {
                                                                                    sgi0<List<fmk>> sgi0Var8 = wfi0.x;
                                                                                    if (epx.f(sgi0Var2, sgi0Var8)) {
                                                                                        List list3 = (List) xfi0Var5.c(sgi0Var8);
                                                                                        List list4 = (List) zfi0.a(xfi0Var2, sgi0Var8);
                                                                                        if (list4 != null) {
                                                                                            qh50 a3 = k5h0.a();
                                                                                            int size = list3.size();
                                                                                            int i45 = 0;
                                                                                            while (i45 < size) {
                                                                                                a3.e(((fmk) list3.get(i45)).a);
                                                                                                i45++;
                                                                                                list3 = list3;
                                                                                            }
                                                                                            qh50 a4 = k5h0.a();
                                                                                            int size2 = list4.size();
                                                                                            int i46 = 0;
                                                                                            while (i46 < size2) {
                                                                                                a4.e(((fmk) list4.get(i46)).a);
                                                                                                i46++;
                                                                                                i44 = i44;
                                                                                            }
                                                                                            i15 = i44;
                                                                                            z2 = !a3.equals(a4);
                                                                                        } else {
                                                                                            i15 = i44;
                                                                                            if (!list3.isEmpty()) {
                                                                                                z2 = true;
                                                                                            }
                                                                                        }
                                                                                        s3q0 s3q0Var6 = s3q0.a;
                                                                                    } else {
                                                                                        i15 = i44;
                                                                                        if (obj2 instanceof ck) {
                                                                                            ck ckVar = (ck) obj2;
                                                                                            Object a5 = zfi0.a(xfi0Var2, sgi0Var2);
                                                                                            if (ckVar != a5) {
                                                                                                if (a5 instanceof ck) {
                                                                                                    String str4 = ckVar.a;
                                                                                                    ck ckVar2 = (ck) a5;
                                                                                                    String str5 = ckVar2.a;
                                                                                                    T t = ckVar2.b;
                                                                                                    if (epx.f(str4, str5)) {
                                                                                                        T t2 = ckVar.b;
                                                                                                        if (t2 == 0) {
                                                                                                        }
                                                                                                        if (t2 != 0) {
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                z4 = false;
                                                                                                if (z4) {
                                                                                                    z2 = false;
                                                                                                    s3q0 s3q0Var7 = s3q0.a;
                                                                                                }
                                                                                            }
                                                                                            z4 = true;
                                                                                            if (z4) {
                                                                                            }
                                                                                        }
                                                                                        z2 = true;
                                                                                        s3q0 s3q0Var72 = s3q0.a;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                i15 = i31;
                                                                ph50Var4 = ph50Var7;
                                                                i16 = i36;
                                                                xfi0Var2 = xfi0Var4;
                                                                ph50Var3 = ph50Var5;
                                                            }
                                                            num6 = num8;
                                                            num5 = num7;
                                                            igi0Var2 = igi0Var3;
                                                            i13 = i32;
                                                            ph50Var4 = ph50Var7;
                                                            layoutNode2 = layoutNode5;
                                                            i14 = i7;
                                                            xfi0Var2 = xfi0Var4;
                                                            i15 = i31;
                                                            i16 = i36;
                                                            ph50Var3 = ph50Var5;
                                                        }
                                                    }
                                                    num5 = num7;
                                                    arrayList3 = arrayList5;
                                                    igi0Var2 = igi0Var3;
                                                    i13 = i32;
                                                    ph50Var4 = ph50Var7;
                                                    layoutNode2 = layoutNode5;
                                                    num6 = num8;
                                                    i14 = i7;
                                                    xfi0Var2 = xfi0Var4;
                                                    i15 = i31;
                                                    i16 = i36;
                                                    ph50Var3 = ph50Var5;
                                                }
                                            }
                                            xfh0 a6 = ygi0.a(i7, arrayList5);
                                            if (a6 != null) {
                                                z3 = false;
                                            } else {
                                                a6 = new xfh0(i7, arrayList4);
                                                z3 = true;
                                            }
                                            arrayList4.add(a6);
                                            if (!z3) {
                                            }
                                            sgi0Var = ngi0.d;
                                            if (!epx.f(sgi0Var2, sgi0Var)) {
                                            }
                                            num5 = num7;
                                            arrayList3 = arrayList5;
                                            igi0Var2 = igi0Var3;
                                            i13 = i32;
                                            ph50Var4 = ph50Var7;
                                            layoutNode2 = layoutNode5;
                                            num6 = num8;
                                            i14 = i7;
                                            xfi0Var2 = xfi0Var4;
                                            i15 = i31;
                                            i16 = i36;
                                            ph50Var3 = ph50Var5;
                                        } else {
                                            ph50Var3 = ph50Var5;
                                            num5 = num7;
                                            arrayList3 = arrayList5;
                                            j2 = j5;
                                            i12 = i34;
                                            igi0Var2 = igi0Var3;
                                            i13 = i32;
                                            ph50Var4 = ph50Var7;
                                            layoutNode2 = layoutNode5;
                                            num6 = num8;
                                            i14 = i7;
                                            xfi0Var2 = xfi0Var4;
                                            i15 = i31;
                                            i16 = length2;
                                        }
                                        i29 = 8;
                                        ph50Var7 = ph50Var4;
                                        i31 = i15;
                                        ph50Var5 = ph50Var3;
                                        j5 = j2 >> 8;
                                        length2 = i16;
                                        i34 = i12 + 1;
                                        xfi0Var4 = xfi0Var2;
                                        num8 = num6;
                                        layoutNode5 = layoutNode2;
                                        i7 = i14;
                                        i32 = i13;
                                        arrayList5 = arrayList3;
                                        igi0Var3 = igi0Var2;
                                        num7 = num5;
                                    }
                                    ph50Var = ph50Var5;
                                    num3 = num7;
                                    arrayList2 = arrayList5;
                                    igi0Var = igi0Var3;
                                    i9 = i32;
                                    ph50Var2 = ph50Var7;
                                    layoutNode = layoutNode5;
                                    z = true;
                                    num4 = num8;
                                    i8 = i7;
                                    xfi0Var = xfi0Var4;
                                    i10 = i31;
                                    i11 = length2;
                                    if (i33 != i29) {
                                        break;
                                    }
                                } else {
                                    ph50Var = ph50Var5;
                                    num3 = num7;
                                    arrayList2 = arrayList5;
                                    igi0Var = igi0Var3;
                                    i9 = i32;
                                    ph50Var2 = ph50Var7;
                                    layoutNode = layoutNode5;
                                    z = true;
                                    num4 = num8;
                                    i8 = i7;
                                    xfi0Var = xfi0Var4;
                                    i10 = i31;
                                    i11 = length2;
                                }
                                int i47 = i9;
                                if (i47 == i11) {
                                    break;
                                }
                                int i48 = i8;
                                i32 = i47 + 1;
                                length2 = i11;
                                i7 = i48;
                                xfi0Var4 = xfi0Var;
                                num8 = num4;
                                ph50Var7 = ph50Var2;
                                layoutNode4 = layoutNode;
                                i27 = i5;
                                i31 = i10;
                                arrayList5 = arrayList2;
                                ph50Var5 = ph50Var;
                                igi0Var3 = igi0Var;
                                num7 = num3;
                                i29 = 8;
                            }
                        } else {
                            i8 = i7;
                            num3 = num7;
                            arrayList2 = arrayList5;
                            i5 = i27;
                            igi0Var = igi0Var3;
                            z = true;
                            num4 = num8;
                            xfi0Var = xfi0Var4;
                            z2 = false;
                        }
                        if (!z2) {
                            Iterator<Map.Entry<? extends sgi0<?>, ? extends Object>> it = xfi0Var.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = false;
                                    break;
                                } else {
                                    if (!igi0Var.k().b.b(it.next().getKey())) {
                                        break;
                                    }
                                }
                            }
                            z2 = z;
                        }
                        if (z2) {
                            i4 = 8;
                            u(this, q(i8), 2048, num4, 8);
                        } else {
                            i4 = 8;
                        }
                    }
                    j4 >>= i4;
                    i28 = i3 + 1;
                    f9xVar2 = f9xVar;
                    num8 = num4;
                    i26 = i4;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i23 = i6;
                    i27 = i5;
                    arrayList5 = arrayList2;
                    num7 = num3;
                }
                num = num7;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                int i49 = i23;
                num2 = num8;
                if (i27 != i26) {
                    return;
                } else {
                    i2 = i49;
                }
            } else {
                num = num7;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                num2 = num8;
                i2 = i23;
            }
            if (i2 == i25) {
                return;
            }
            i23 = i2 + 1;
            f9xVar2 = f9xVar;
            length = i25;
            num8 = num2;
            i21 = i24;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            num7 = num;
            i22 = 0;
        }
    }

    public final void y(LayoutNode layoutNode, qg50 qg50Var) {
        xfi0 d2;
        LayoutNode c2;
        if (layoutNode.e() && !this.b.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(layoutNode)) {
            if (!layoutNode.G.d(8)) {
                layoutNode = b62.c(layoutNode, j.i);
            }
            if (layoutNode == null || (d2 = layoutNode.d()) == null) {
                return;
            }
            if (!d2.d && (c2 = b62.c(layoutNode, i.i)) != null) {
                layoutNode = c2;
            }
            int i2 = layoutNode.c;
            if (qg50Var.b(i2)) {
                u(this, q(i2), 2048, 1, 8);
            }
        }
    }

    public final void z(LayoutNode layoutNode) {
        if (layoutNode.e() && !this.b.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int i2 = layoutNode.c;
            qeh0 b2 = this.o.b(i2);
            qeh0 b3 = this.p.b(i2);
            if (b2 == null && b3 == null) {
                return;
            }
            AccessibilityEvent createEvent = createEvent(i2, 4096);
            if (b2 != null) {
                createEvent.setScrollX((int) b2.a.invoke().floatValue());
                createEvent.setMaxScrollX((int) b2.b.invoke().floatValue());
            }
            if (b3 != null) {
                createEvent.setScrollY((int) b3.a.invoke().floatValue());
                createEvent.setMaxScrollY((int) b3.b.invoke().floatValue());
            }
            s(createEvent);
        }
    }
}
