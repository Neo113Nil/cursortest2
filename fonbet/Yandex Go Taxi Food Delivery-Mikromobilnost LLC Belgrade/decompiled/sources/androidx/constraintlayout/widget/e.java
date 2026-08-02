package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.c7e;
import defpackage.kbs;
import defpackage.kih0;
import defpackage.ny61;
import defpackage.qbn;
import defpackage.rug;
import defpackage.vg10;
import defpackage.z3i0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes.dex */
public class e {
    public static final int[] h = {0, 4, 8};
    public static final SparseIntArray i;
    public static final SparseIntArray j;
    public String a;
    public String b = "";
    public String[] c = new String[0];
    public int d = 0;
    public final HashMap e = new HashMap();
    public boolean f = true;
    public final HashMap g = new HashMap();

    /* loaded from: classes10.dex */
    public static class a {
        public int a;
        public String b;
        public final d c = new d();
        public final c d = new c();
        public final b e = new b();
        public final C0007e f = new C0007e();
        public HashMap g = new HashMap();
        public androidx.constraintlayout.widget.d h;

        public final void b(ConstraintLayout.LayoutParams layoutParams) {
            b bVar = this.e;
            layoutParams.leftToLeft = bVar.i;
            layoutParams.leftToRight = bVar.j;
            layoutParams.rightToLeft = bVar.k;
            layoutParams.rightToRight = bVar.l;
            layoutParams.topToTop = bVar.m;
            layoutParams.topToBottom = bVar.n;
            layoutParams.bottomToTop = bVar.o;
            layoutParams.bottomToBottom = bVar.p;
            layoutParams.baselineToBaseline = bVar.q;
            layoutParams.baselineToTop = bVar.r;
            layoutParams.baselineToBottom = bVar.s;
            layoutParams.startToEnd = bVar.t;
            layoutParams.startToStart = bVar.u;
            layoutParams.endToStart = bVar.v;
            layoutParams.endToEnd = bVar.w;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bVar.G;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bVar.H;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = bVar.I;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bVar.J;
            layoutParams.goneStartMargin = bVar.S;
            layoutParams.goneEndMargin = bVar.R;
            layoutParams.goneTopMargin = bVar.O;
            layoutParams.goneBottomMargin = bVar.Q;
            layoutParams.horizontalBias = bVar.x;
            layoutParams.verticalBias = bVar.y;
            layoutParams.circleConstraint = bVar.A;
            layoutParams.circleRadius = bVar.B;
            layoutParams.circleAngle = bVar.C;
            layoutParams.dimensionRatio = bVar.z;
            layoutParams.editorAbsoluteX = bVar.D;
            layoutParams.editorAbsoluteY = bVar.E;
            layoutParams.verticalWeight = bVar.U;
            layoutParams.horizontalWeight = bVar.V;
            layoutParams.verticalChainStyle = bVar.X;
            layoutParams.horizontalChainStyle = bVar.W;
            layoutParams.constrainedWidth = bVar.m0;
            layoutParams.constrainedHeight = bVar.n0;
            layoutParams.matchConstraintDefaultWidth = bVar.Y;
            layoutParams.matchConstraintDefaultHeight = bVar.Z;
            layoutParams.matchConstraintMaxWidth = bVar.a0;
            layoutParams.matchConstraintMaxHeight = bVar.b0;
            layoutParams.matchConstraintMinWidth = bVar.c0;
            layoutParams.matchConstraintMinHeight = bVar.d0;
            layoutParams.matchConstraintPercentWidth = bVar.e0;
            layoutParams.matchConstraintPercentHeight = bVar.f0;
            layoutParams.orientation = bVar.F;
            layoutParams.guidePercent = bVar.g;
            layoutParams.guideBegin = bVar.e;
            layoutParams.guideEnd = bVar.f;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = bVar.c;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = bVar.d;
            String str = bVar.l0;
            if (str != null) {
                layoutParams.constraintTag = str;
            }
            layoutParams.wrapBehaviorInParent = bVar.p0;
            layoutParams.setMarginStart(bVar.L);
            layoutParams.setMarginEnd(bVar.K);
            layoutParams.validate();
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final a clone() {
            a aVar = new a();
            aVar.e.a(this.e);
            aVar.d.a(this.d);
            aVar.c.a(this.c);
            aVar.f.a(this.f);
            aVar.a = this.a;
            aVar.h = this.h;
            return aVar;
        }

        public final void d(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.a = i;
            int i2 = layoutParams.leftToLeft;
            b bVar = this.e;
            bVar.i = i2;
            bVar.j = layoutParams.leftToRight;
            bVar.k = layoutParams.rightToLeft;
            bVar.l = layoutParams.rightToRight;
            bVar.m = layoutParams.topToTop;
            bVar.n = layoutParams.topToBottom;
            bVar.o = layoutParams.bottomToTop;
            bVar.p = layoutParams.bottomToBottom;
            bVar.q = layoutParams.baselineToBaseline;
            bVar.r = layoutParams.baselineToTop;
            bVar.s = layoutParams.baselineToBottom;
            bVar.t = layoutParams.startToEnd;
            bVar.u = layoutParams.startToStart;
            bVar.v = layoutParams.endToStart;
            bVar.w = layoutParams.endToEnd;
            bVar.x = layoutParams.horizontalBias;
            bVar.y = layoutParams.verticalBias;
            bVar.z = layoutParams.dimensionRatio;
            bVar.A = layoutParams.circleConstraint;
            bVar.B = layoutParams.circleRadius;
            bVar.C = layoutParams.circleAngle;
            bVar.D = layoutParams.editorAbsoluteX;
            bVar.E = layoutParams.editorAbsoluteY;
            bVar.F = layoutParams.orientation;
            bVar.g = layoutParams.guidePercent;
            bVar.e = layoutParams.guideBegin;
            bVar.f = layoutParams.guideEnd;
            bVar.c = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            bVar.d = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            bVar.G = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            bVar.H = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            bVar.I = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            bVar.J = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            bVar.M = layoutParams.baselineMargin;
            bVar.U = layoutParams.verticalWeight;
            bVar.V = layoutParams.horizontalWeight;
            bVar.X = layoutParams.verticalChainStyle;
            bVar.W = layoutParams.horizontalChainStyle;
            bVar.m0 = layoutParams.constrainedWidth;
            bVar.n0 = layoutParams.constrainedHeight;
            bVar.Y = layoutParams.matchConstraintDefaultWidth;
            bVar.Z = layoutParams.matchConstraintDefaultHeight;
            bVar.a0 = layoutParams.matchConstraintMaxWidth;
            bVar.b0 = layoutParams.matchConstraintMaxHeight;
            bVar.c0 = layoutParams.matchConstraintMinWidth;
            bVar.d0 = layoutParams.matchConstraintMinHeight;
            bVar.e0 = layoutParams.matchConstraintPercentWidth;
            bVar.f0 = layoutParams.matchConstraintPercentHeight;
            bVar.l0 = layoutParams.constraintTag;
            bVar.O = layoutParams.goneTopMargin;
            bVar.Q = layoutParams.goneBottomMargin;
            bVar.N = layoutParams.goneLeftMargin;
            bVar.P = layoutParams.goneRightMargin;
            bVar.S = layoutParams.goneStartMargin;
            bVar.R = layoutParams.goneEndMargin;
            bVar.T = layoutParams.goneBaselineMargin;
            bVar.p0 = layoutParams.wrapBehaviorInParent;
            bVar.K = layoutParams.getMarginEnd();
            bVar.L = layoutParams.getMarginStart();
        }

        public final void e(int i, Constraints.LayoutParams layoutParams) {
            d(i, layoutParams);
            this.c.d = layoutParams.alpha;
            float f = layoutParams.rotation;
            C0007e c0007e = this.f;
            c0007e.b = f;
            c0007e.c = layoutParams.rotationX;
            c0007e.d = layoutParams.rotationY;
            c0007e.e = layoutParams.scaleX;
            c0007e.f = layoutParams.scaleY;
            c0007e.g = layoutParams.transformPivotX;
            c0007e.h = layoutParams.transformPivotY;
            c0007e.j = layoutParams.translationX;
            c0007e.k = layoutParams.translationY;
            c0007e.l = layoutParams.translationZ;
            c0007e.n = layoutParams.elevation;
            c0007e.m = layoutParams.applyElevation;
        }
    }

    /* loaded from: classes10.dex */
    public static class b {
        public static final SparseIntArray q0;
        public int c;
        public int d;
        public int[] j0;
        public String k0;
        public String l0;
        public boolean a = false;
        public boolean b = false;
        public int e = -1;
        public int f = -1;
        public float g = -1.0f;
        public boolean h = true;
        public int i = -1;
        public int j = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public float x = 0.5f;
        public float y = 0.5f;
        public String z = null;
        public int A = -1;
        public int B = 0;
        public float C = 0.0f;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;
        public int a0 = 0;
        public int b0 = 0;
        public int c0 = 0;
        public int d0 = 0;
        public float e0 = 1.0f;
        public float f0 = 1.0f;
        public int g0 = -1;
        public int h0 = 0;
        public int i0 = -1;
        public boolean m0 = false;
        public boolean n0 = false;
        public boolean o0 = true;
        public int p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            q0 = sparseIntArray;
            sparseIntArray.append(z3i0.Layout_layout_constraintLeft_toLeftOf, 24);
            sparseIntArray.append(z3i0.Layout_layout_constraintLeft_toRightOf, 25);
            sparseIntArray.append(z3i0.Layout_layout_constraintRight_toLeftOf, 28);
            sparseIntArray.append(z3i0.Layout_layout_constraintRight_toRightOf, 29);
            sparseIntArray.append(z3i0.Layout_layout_constraintTop_toTopOf, 35);
            sparseIntArray.append(z3i0.Layout_layout_constraintTop_toBottomOf, 34);
            sparseIntArray.append(z3i0.Layout_layout_constraintBottom_toTopOf, 4);
            sparseIntArray.append(z3i0.Layout_layout_constraintBottom_toBottomOf, 3);
            sparseIntArray.append(z3i0.Layout_layout_constraintBaseline_toBaselineOf, 1);
            sparseIntArray.append(z3i0.Layout_layout_editor_absoluteX, 6);
            sparseIntArray.append(z3i0.Layout_layout_editor_absoluteY, 7);
            sparseIntArray.append(z3i0.Layout_layout_constraintGuide_begin, 17);
            sparseIntArray.append(z3i0.Layout_layout_constraintGuide_end, 18);
            sparseIntArray.append(z3i0.Layout_layout_constraintGuide_percent, 19);
            sparseIntArray.append(z3i0.Layout_guidelineUseRtl, 90);
            sparseIntArray.append(z3i0.Layout_android_orientation, 26);
            sparseIntArray.append(z3i0.Layout_layout_constraintStart_toEndOf, 31);
            sparseIntArray.append(z3i0.Layout_layout_constraintStart_toStartOf, 32);
            sparseIntArray.append(z3i0.Layout_layout_constraintEnd_toStartOf, 10);
            sparseIntArray.append(z3i0.Layout_layout_constraintEnd_toEndOf, 9);
            sparseIntArray.append(z3i0.Layout_layout_goneMarginLeft, 13);
            sparseIntArray.append(z3i0.Layout_layout_goneMarginTop, 16);
            sparseIntArray.append(z3i0.Layout_layout_goneMarginRight, 14);
            sparseIntArray.append(z3i0.Layout_layout_goneMarginBottom, 11);
            sparseIntArray.append(z3i0.Layout_layout_goneMarginStart, 15);
            sparseIntArray.append(z3i0.Layout_layout_goneMarginEnd, 12);
            sparseIntArray.append(z3i0.Layout_layout_constraintVertical_weight, 38);
            sparseIntArray.append(z3i0.Layout_layout_constraintHorizontal_weight, 37);
            sparseIntArray.append(z3i0.Layout_layout_constraintHorizontal_chainStyle, 39);
            sparseIntArray.append(z3i0.Layout_layout_constraintVertical_chainStyle, 40);
            sparseIntArray.append(z3i0.Layout_layout_constraintHorizontal_bias, 20);
            sparseIntArray.append(z3i0.Layout_layout_constraintVertical_bias, 36);
            sparseIntArray.append(z3i0.Layout_layout_constraintDimensionRatio, 5);
            sparseIntArray.append(z3i0.Layout_layout_constraintLeft_creator, 91);
            sparseIntArray.append(z3i0.Layout_layout_constraintTop_creator, 91);
            sparseIntArray.append(z3i0.Layout_layout_constraintRight_creator, 91);
            sparseIntArray.append(z3i0.Layout_layout_constraintBottom_creator, 91);
            sparseIntArray.append(z3i0.Layout_layout_constraintBaseline_creator, 91);
            sparseIntArray.append(z3i0.Layout_android_layout_marginLeft, 23);
            sparseIntArray.append(z3i0.Layout_android_layout_marginRight, 27);
            sparseIntArray.append(z3i0.Layout_android_layout_marginStart, 30);
            sparseIntArray.append(z3i0.Layout_android_layout_marginEnd, 8);
            sparseIntArray.append(z3i0.Layout_android_layout_marginTop, 33);
            sparseIntArray.append(z3i0.Layout_android_layout_marginBottom, 2);
            sparseIntArray.append(z3i0.Layout_android_layout_width, 22);
            sparseIntArray.append(z3i0.Layout_android_layout_height, 21);
            sparseIntArray.append(z3i0.Layout_layout_constraintWidth, 41);
            sparseIntArray.append(z3i0.Layout_layout_constraintHeight, 42);
            sparseIntArray.append(z3i0.Layout_layout_constrainedWidth, 87);
            sparseIntArray.append(z3i0.Layout_layout_constrainedHeight, 88);
            sparseIntArray.append(z3i0.Layout_layout_wrapBehaviorInParent, 76);
            sparseIntArray.append(z3i0.Layout_layout_constraintCircle, 61);
            sparseIntArray.append(z3i0.Layout_layout_constraintCircleRadius, 62);
            sparseIntArray.append(z3i0.Layout_layout_constraintCircleAngle, 63);
            sparseIntArray.append(z3i0.Layout_layout_constraintWidth_percent, 69);
            sparseIntArray.append(z3i0.Layout_layout_constraintHeight_percent, 70);
            sparseIntArray.append(z3i0.Layout_chainUseRtl, 71);
            sparseIntArray.append(z3i0.Layout_barrierDirection, 72);
            sparseIntArray.append(z3i0.Layout_barrierMargin, 73);
            sparseIntArray.append(z3i0.Layout_constraint_referenced_ids, 74);
            sparseIntArray.append(z3i0.Layout_barrierAllowsGoneWidgets, 75);
            sparseIntArray.append(z3i0.Layout_layout_constraintWidth_max, 84);
            sparseIntArray.append(z3i0.Layout_layout_constraintWidth_min, 86);
            sparseIntArray.append(z3i0.Layout_layout_constraintWidth_max, 83);
            sparseIntArray.append(z3i0.Layout_layout_constraintHeight_min, 85);
            sparseIntArray.append(z3i0.Layout_layout_constraintWidth, 87);
            sparseIntArray.append(z3i0.Layout_layout_constraintHeight, 88);
            sparseIntArray.append(z3i0.ConstraintLayout_Layout_layout_constraintTag, 89);
            sparseIntArray.append(z3i0.Layout_guidelineUseRtl, 90);
        }

        public final void a(b bVar) {
            this.a = bVar.a;
            this.c = bVar.c;
            this.b = bVar.b;
            this.d = bVar.d;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.e0 = bVar.e0;
            this.f0 = bVar.f0;
            this.g0 = bVar.g0;
            this.h0 = bVar.h0;
            this.i0 = bVar.i0;
            this.l0 = bVar.l0;
            int[] iArr = bVar.j0;
            if (iArr == null || bVar.k0 != null) {
                this.j0 = null;
            } else {
                this.j0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.k0 = bVar.k0;
            this.m0 = bVar.m0;
            this.n0 = bVar.n0;
            this.o0 = bVar.o0;
            this.p0 = bVar.p0;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z3i0.Layout);
            this.b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                SparseIntArray sparseIntArray = q0;
                int i2 = sparseIntArray.get(index);
                switch (i2) {
                    case 1:
                        this.q = e.s(obtainStyledAttributes, index, this.q);
                        break;
                    case 2:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 3:
                        this.p = e.s(obtainStyledAttributes, index, this.p);
                        break;
                    case 4:
                        this.o = e.s(obtainStyledAttributes, index, this.o);
                        break;
                    case 5:
                        this.z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 7:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 8:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 9:
                        this.w = e.s(obtainStyledAttributes, index, this.w);
                        break;
                    case 10:
                        this.v = e.s(obtainStyledAttributes, index, this.v);
                        break;
                    case 11:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 12:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 13:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 14:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 15:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 16:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 17:
                        this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                        break;
                    case 18:
                        this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                        break;
                    case 19:
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 20:
                        this.x = obtainStyledAttributes.getFloat(index, this.x);
                        break;
                    case 21:
                        this.d = obtainStyledAttributes.getLayoutDimension(index, this.d);
                        break;
                    case 22:
                        this.c = obtainStyledAttributes.getLayoutDimension(index, this.c);
                        break;
                    case 23:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 24:
                        this.i = e.s(obtainStyledAttributes, index, this.i);
                        break;
                    case 25:
                        this.j = e.s(obtainStyledAttributes, index, this.j);
                        break;
                    case 26:
                        this.F = obtainStyledAttributes.getInt(index, this.F);
                        break;
                    case 27:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 28:
                        this.k = e.s(obtainStyledAttributes, index, this.k);
                        break;
                    case 29:
                        this.l = e.s(obtainStyledAttributes, index, this.l);
                        break;
                    case 30:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 31:
                        this.t = e.s(obtainStyledAttributes, index, this.t);
                        break;
                    case 32:
                        this.u = e.s(obtainStyledAttributes, index, this.u);
                        break;
                    case 33:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 34:
                        this.n = e.s(obtainStyledAttributes, index, this.n);
                        break;
                    case 35:
                        this.m = e.s(obtainStyledAttributes, index, this.m);
                        break;
                    case 36:
                        this.y = obtainStyledAttributes.getFloat(index, this.y);
                        break;
                    case 37:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 38:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 39:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 40:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 41:
                        e.t(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        e.t(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.A = e.s(obtainStyledAttributes, index, this.A);
                                break;
                            case 62:
                                this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                break;
                            case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                                this.C = obtainStyledAttributes.getFloat(index, this.C);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.g0 = obtainStyledAttributes.getInt(index, this.g0);
                                        break;
                                    case HProv.ALG_SID_GR3410_12_256 /* 73 */:
                                        this.h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.h0);
                                        break;
                                    case 74:
                                        this.k0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case HProv.PROV_GOST_2001_DH /* 75 */:
                                        this.o0 = obtainStyledAttributes.getBoolean(index, this.o0);
                                        break;
                                    case CalendarDayView.DISABLED_DAY_ALPHA /* 76 */:
                                        this.p0 = obtainStyledAttributes.getInt(index, this.p0);
                                        break;
                                    case HProv.ALG_SID_SHA3_224 /* 77 */:
                                        this.r = e.s(obtainStyledAttributes, index, this.r);
                                        break;
                                    case HProv.ALG_SID_SHA3_256 /* 78 */:
                                        this.s = e.s(obtainStyledAttributes, index, this.s);
                                        break;
                                    case HProv.ALG_SID_SHA3_384 /* 79 */:
                                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                        break;
                                    case 80:
                                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                        break;
                                    case 81:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                    case 82:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 83:
                                        this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                        break;
                                    case HProv.ALG_SID_NO_HASH /* 84 */:
                                        this.a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                        break;
                                    case 85:
                                        this.d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                        break;
                                    case MSException.ERROR_INVALID_PASSWORD /* 86 */:
                                        this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        break;
                                    case MSException.ERROR_INVALID_PARAMETER /* 87 */:
                                        this.m0 = obtainStyledAttributes.getBoolean(index, this.m0);
                                        break;
                                    case HProv.ALG_SID_KECCAK_224 /* 88 */:
                                        this.n0 = obtainStyledAttributes.getBoolean(index, this.n0);
                                        break;
                                    case HProv.ALG_SID_KECCAK_256 /* 89 */:
                                        this.l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.h = obtainStyledAttributes.getBoolean(index, this.h);
                                        break;
                                    case 91:
                                        Integer.toHexString(index);
                                        sparseIntArray.get(index);
                                        break;
                                    default:
                                        Integer.toHexString(index);
                                        sparseIntArray.get(index);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes10.dex */
    public static class c {
        public static final SparseIntArray n;
        public boolean a = false;
        public int b = -1;
        public int c = 0;
        public String d = null;
        public int e = -1;
        public int f = 0;
        public float g = Float.NaN;
        public float h = Float.NaN;
        public float i = Float.NaN;
        public int j = -1;
        public String k = null;
        public int l = -3;
        public int m = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            n = sparseIntArray;
            sparseIntArray.append(z3i0.Motion_motionPathRotate, 1);
            sparseIntArray.append(z3i0.Motion_pathMotionArc, 2);
            sparseIntArray.append(z3i0.Motion_transitionEasing, 3);
            sparseIntArray.append(z3i0.Motion_drawPath, 4);
            sparseIntArray.append(z3i0.Motion_animateRelativeTo, 5);
            sparseIntArray.append(z3i0.Motion_animateCircleAngleTo, 6);
            sparseIntArray.append(z3i0.Motion_motionStagger, 7);
            sparseIntArray.append(z3i0.Motion_quantizeMotionSteps, 8);
            sparseIntArray.append(z3i0.Motion_quantizeMotionPhase, 9);
            sparseIntArray.append(z3i0.Motion_quantizeMotionInterpolator, 10);
        }

        public final void a(c cVar) {
            this.a = cVar.a;
            this.b = cVar.b;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.h = cVar.h;
            this.g = cVar.g;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z3i0.Motion);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (n.get(index)) {
                    case 1:
                        this.h = obtainStyledAttributes.getFloat(index, this.h);
                        break;
                    case 2:
                        this.e = obtainStyledAttributes.getInt(index, this.e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.d = qbn.c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.b = e.s(obtainStyledAttributes, index, this.b);
                        break;
                    case 6:
                        this.c = obtainStyledAttributes.getInteger(index, this.c);
                        break;
                    case 7:
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 8:
                        this.j = obtainStyledAttributes.getInteger(index, this.j);
                        break;
                    case 9:
                        this.i = obtainStyledAttributes.getFloat(index, this.i);
                        break;
                    case 10:
                        int i2 = obtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.m = resourceId;
                            if (resourceId != -1) {
                                this.l = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i2 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.k = string;
                            if (string.indexOf("/") > 0) {
                                this.m = obtainStyledAttributes.getResourceId(index, -1);
                                this.l = -2;
                                break;
                            } else {
                                this.l = -1;
                                break;
                            }
                        } else {
                            this.l = obtainStyledAttributes.getInteger(index, this.m);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes10.dex */
    public static class d {
        public boolean a = false;
        public int b = 0;
        public int c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        public final void a(d dVar) {
            this.a = dVar.a;
            this.b = dVar.b;
            this.d = dVar.d;
            this.e = dVar.e;
            this.c = dVar.c;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z3i0.PropertySet);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == z3i0.PropertySet_android_alpha) {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                } else if (index == z3i0.PropertySet_android_visibility) {
                    int i2 = obtainStyledAttributes.getInt(index, this.b);
                    this.b = i2;
                    this.b = e.h[i2];
                } else if (index == z3i0.PropertySet_visibilityMode) {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                } else if (index == z3i0.PropertySet_motionProgress) {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$e, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    public static class C0007e {
        public static final SparseIntArray o;
        public boolean a = false;
        public float b = 0.0f;
        public float c = 0.0f;
        public float d = 0.0f;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = Float.NaN;
        public float h = Float.NaN;
        public int i = -1;
        public float j = 0.0f;
        public float k = 0.0f;
        public float l = 0.0f;
        public boolean m = false;
        public float n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(z3i0.Transform_android_rotation, 1);
            sparseIntArray.append(z3i0.Transform_android_rotationX, 2);
            sparseIntArray.append(z3i0.Transform_android_rotationY, 3);
            sparseIntArray.append(z3i0.Transform_android_scaleX, 4);
            sparseIntArray.append(z3i0.Transform_android_scaleY, 5);
            sparseIntArray.append(z3i0.Transform_android_transformPivotX, 6);
            sparseIntArray.append(z3i0.Transform_android_transformPivotY, 7);
            sparseIntArray.append(z3i0.Transform_android_translationX, 8);
            sparseIntArray.append(z3i0.Transform_android_translationY, 9);
            sparseIntArray.append(z3i0.Transform_android_translationZ, 10);
            sparseIntArray.append(z3i0.Transform_android_elevation, 11);
            sparseIntArray.append(z3i0.Transform_transformPivotTarget, 12);
        }

        public final void a(C0007e c0007e) {
            this.a = c0007e.a;
            this.b = c0007e.b;
            this.c = c0007e.c;
            this.d = c0007e.d;
            this.e = c0007e.e;
            this.f = c0007e.f;
            this.g = c0007e.g;
            this.h = c0007e.h;
            this.i = c0007e.i;
            this.j = c0007e.j;
            this.k = c0007e.k;
            this.l = c0007e.l;
            this.m = c0007e.m;
            this.n = c0007e.n;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z3i0.Transform);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.b = obtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 2:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 3:
                        this.d = obtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = obtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = obtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.h = obtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 8:
                        this.j = obtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 9:
                        this.k = obtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 10:
                        this.l = obtainStyledAttributes.getDimension(index, this.l);
                        break;
                    case 11:
                        this.m = true;
                        this.n = obtainStyledAttributes.getDimension(index, this.n);
                        break;
                    case 12:
                        this.i = e.s(obtainStyledAttributes, index, this.i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        i = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        j = sparseIntArray2;
        sparseIntArray.append(z3i0.Constraint_layout_constraintLeft_toLeftOf, 25);
        sparseIntArray.append(z3i0.Constraint_layout_constraintLeft_toRightOf, 26);
        sparseIntArray.append(z3i0.Constraint_layout_constraintRight_toLeftOf, 29);
        sparseIntArray.append(z3i0.Constraint_layout_constraintRight_toRightOf, 30);
        sparseIntArray.append(z3i0.Constraint_layout_constraintTop_toTopOf, 36);
        sparseIntArray.append(z3i0.Constraint_layout_constraintTop_toBottomOf, 35);
        sparseIntArray.append(z3i0.Constraint_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(z3i0.Constraint_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(z3i0.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(z3i0.Constraint_layout_constraintBaseline_toTopOf, 91);
        sparseIntArray.append(z3i0.Constraint_layout_constraintBaseline_toBottomOf, 92);
        sparseIntArray.append(z3i0.Constraint_layout_editor_absoluteX, 6);
        sparseIntArray.append(z3i0.Constraint_layout_editor_absoluteY, 7);
        sparseIntArray.append(z3i0.Constraint_layout_constraintGuide_begin, 17);
        sparseIntArray.append(z3i0.Constraint_layout_constraintGuide_end, 18);
        sparseIntArray.append(z3i0.Constraint_layout_constraintGuide_percent, 19);
        sparseIntArray.append(z3i0.Constraint_guidelineUseRtl, 99);
        sparseIntArray.append(z3i0.Constraint_android_orientation, 27);
        sparseIntArray.append(z3i0.Constraint_layout_constraintStart_toEndOf, 32);
        sparseIntArray.append(z3i0.Constraint_layout_constraintStart_toStartOf, 33);
        sparseIntArray.append(z3i0.Constraint_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(z3i0.Constraint_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(z3i0.Constraint_layout_goneMarginLeft, 13);
        sparseIntArray.append(z3i0.Constraint_layout_goneMarginTop, 16);
        sparseIntArray.append(z3i0.Constraint_layout_goneMarginRight, 14);
        sparseIntArray.append(z3i0.Constraint_layout_goneMarginBottom, 11);
        sparseIntArray.append(z3i0.Constraint_layout_goneMarginStart, 15);
        sparseIntArray.append(z3i0.Constraint_layout_goneMarginEnd, 12);
        sparseIntArray.append(z3i0.Constraint_layout_constraintVertical_weight, 40);
        sparseIntArray.append(z3i0.Constraint_layout_constraintHorizontal_weight, 39);
        sparseIntArray.append(z3i0.Constraint_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray.append(z3i0.Constraint_layout_constraintVertical_chainStyle, 42);
        sparseIntArray.append(z3i0.Constraint_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(z3i0.Constraint_layout_constraintVertical_bias, 37);
        sparseIntArray.append(z3i0.Constraint_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(z3i0.Constraint_layout_constraintLeft_creator, 87);
        sparseIntArray.append(z3i0.Constraint_layout_constraintTop_creator, 87);
        sparseIntArray.append(z3i0.Constraint_layout_constraintRight_creator, 87);
        sparseIntArray.append(z3i0.Constraint_layout_constraintBottom_creator, 87);
        sparseIntArray.append(z3i0.Constraint_layout_constraintBaseline_creator, 87);
        sparseIntArray.append(z3i0.Constraint_android_layout_marginLeft, 24);
        sparseIntArray.append(z3i0.Constraint_android_layout_marginRight, 28);
        sparseIntArray.append(z3i0.Constraint_android_layout_marginStart, 31);
        sparseIntArray.append(z3i0.Constraint_android_layout_marginEnd, 8);
        sparseIntArray.append(z3i0.Constraint_android_layout_marginTop, 34);
        sparseIntArray.append(z3i0.Constraint_android_layout_marginBottom, 2);
        sparseIntArray.append(z3i0.Constraint_android_layout_width, 23);
        sparseIntArray.append(z3i0.Constraint_android_layout_height, 21);
        sparseIntArray.append(z3i0.Constraint_layout_constraintWidth, 95);
        sparseIntArray.append(z3i0.Constraint_layout_constraintHeight, 96);
        sparseIntArray.append(z3i0.Constraint_android_visibility, 22);
        sparseIntArray.append(z3i0.Constraint_android_alpha, 43);
        sparseIntArray.append(z3i0.Constraint_android_elevation, 44);
        sparseIntArray.append(z3i0.Constraint_android_rotationX, 45);
        sparseIntArray.append(z3i0.Constraint_android_rotationY, 46);
        sparseIntArray.append(z3i0.Constraint_android_rotation, 60);
        sparseIntArray.append(z3i0.Constraint_android_scaleX, 47);
        sparseIntArray.append(z3i0.Constraint_android_scaleY, 48);
        sparseIntArray.append(z3i0.Constraint_android_transformPivotX, 49);
        sparseIntArray.append(z3i0.Constraint_android_transformPivotY, 50);
        sparseIntArray.append(z3i0.Constraint_android_translationX, 51);
        sparseIntArray.append(z3i0.Constraint_android_translationY, 52);
        sparseIntArray.append(z3i0.Constraint_android_translationZ, 53);
        sparseIntArray.append(z3i0.Constraint_layout_constraintWidth_default, 54);
        sparseIntArray.append(z3i0.Constraint_layout_constraintHeight_default, 55);
        sparseIntArray.append(z3i0.Constraint_layout_constraintWidth_max, 56);
        sparseIntArray.append(z3i0.Constraint_layout_constraintHeight_max, 57);
        sparseIntArray.append(z3i0.Constraint_layout_constraintWidth_min, 58);
        sparseIntArray.append(z3i0.Constraint_layout_constraintHeight_min, 59);
        sparseIntArray.append(z3i0.Constraint_layout_constraintCircle, 61);
        sparseIntArray.append(z3i0.Constraint_layout_constraintCircleRadius, 62);
        sparseIntArray.append(z3i0.Constraint_layout_constraintCircleAngle, 63);
        sparseIntArray.append(z3i0.Constraint_animateRelativeTo, 64);
        sparseIntArray.append(z3i0.Constraint_transitionEasing, 65);
        sparseIntArray.append(z3i0.Constraint_drawPath, 66);
        sparseIntArray.append(z3i0.Constraint_transitionPathRotate, 67);
        sparseIntArray.append(z3i0.Constraint_motionStagger, 79);
        sparseIntArray.append(z3i0.Constraint_android_id, 38);
        sparseIntArray.append(z3i0.Constraint_motionProgress, 68);
        sparseIntArray.append(z3i0.Constraint_layout_constraintWidth_percent, 69);
        sparseIntArray.append(z3i0.Constraint_layout_constraintHeight_percent, 70);
        sparseIntArray.append(z3i0.Constraint_layout_wrapBehaviorInParent, 97);
        sparseIntArray.append(z3i0.Constraint_chainUseRtl, 71);
        sparseIntArray.append(z3i0.Constraint_barrierDirection, 72);
        sparseIntArray.append(z3i0.Constraint_barrierMargin, 73);
        sparseIntArray.append(z3i0.Constraint_constraint_referenced_ids, 74);
        sparseIntArray.append(z3i0.Constraint_barrierAllowsGoneWidgets, 75);
        sparseIntArray.append(z3i0.Constraint_pathMotionArc, 76);
        sparseIntArray.append(z3i0.Constraint_layout_constraintTag, 77);
        sparseIntArray.append(z3i0.Constraint_visibilityMode, 78);
        sparseIntArray.append(z3i0.Constraint_layout_constrainedWidth, 80);
        sparseIntArray.append(z3i0.Constraint_layout_constrainedHeight, 81);
        sparseIntArray.append(z3i0.Constraint_polarRelativeTo, 82);
        sparseIntArray.append(z3i0.Constraint_transformPivotTarget, 83);
        sparseIntArray.append(z3i0.Constraint_quantizeMotionSteps, 84);
        sparseIntArray.append(z3i0.Constraint_quantizeMotionPhase, 85);
        sparseIntArray.append(z3i0.Constraint_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_editor_absoluteY, 6);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_editor_absoluteY, 7);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_orientation, 27);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_goneMarginLeft, 13);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_goneMarginTop, 16);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_goneMarginRight, 14);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_goneMarginBottom, 11);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_goneMarginStart, 15);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_goneMarginEnd, 12);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintVertical_weight, 40);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintVertical_bias, 37);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintDimensionRatio, 5);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintLeft_creator, 87);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintTop_creator, 87);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintRight_creator, 87);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintBottom_creator, 87);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintBaseline_creator, 87);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_layout_marginLeft, 24);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_layout_marginRight, 28);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_layout_marginStart, 31);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_layout_marginEnd, 8);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_layout_marginTop, 34);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_layout_marginBottom, 2);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_layout_width, 23);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_layout_height, 21);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintWidth, 95);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintHeight, 96);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_visibility, 22);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_alpha, 43);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_elevation, 44);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_rotationX, 45);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_rotationY, 46);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_rotation, 60);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_scaleX, 47);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_scaleY, 48);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_transformPivotX, 49);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_transformPivotY, 50);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_translationX, 51);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_translationY, 52);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_translationZ, 53);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintWidth_default, 54);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintHeight_default, 55);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintWidth_max, 56);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintHeight_max, 57);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintWidth_min, 58);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintHeight_min, 59);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintCircleRadius, 62);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintCircleAngle, 63);
        sparseIntArray2.append(z3i0.ConstraintOverride_animateRelativeTo, 64);
        sparseIntArray2.append(z3i0.ConstraintOverride_transitionEasing, 65);
        sparseIntArray2.append(z3i0.ConstraintOverride_drawPath, 66);
        sparseIntArray2.append(z3i0.ConstraintOverride_transitionPathRotate, 67);
        sparseIntArray2.append(z3i0.ConstraintOverride_motionStagger, 79);
        sparseIntArray2.append(z3i0.ConstraintOverride_android_id, 38);
        sparseIntArray2.append(z3i0.ConstraintOverride_motionTarget, 98);
        sparseIntArray2.append(z3i0.ConstraintOverride_motionProgress, 68);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintWidth_percent, 69);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintHeight_percent, 70);
        sparseIntArray2.append(z3i0.ConstraintOverride_chainUseRtl, 71);
        sparseIntArray2.append(z3i0.ConstraintOverride_barrierDirection, 72);
        sparseIntArray2.append(z3i0.ConstraintOverride_barrierMargin, 73);
        sparseIntArray2.append(z3i0.ConstraintOverride_constraint_referenced_ids, 74);
        sparseIntArray2.append(z3i0.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        sparseIntArray2.append(z3i0.ConstraintOverride_pathMotionArc, 76);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constraintTag, 77);
        sparseIntArray2.append(z3i0.ConstraintOverride_visibilityMode, 78);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constrainedWidth, 80);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_constrainedHeight, 81);
        sparseIntArray2.append(z3i0.ConstraintOverride_polarRelativeTo, 82);
        sparseIntArray2.append(z3i0.ConstraintOverride_transformPivotTarget, 83);
        sparseIntArray2.append(z3i0.ConstraintOverride_quantizeMotionSteps, 84);
        sparseIntArray2.append(z3i0.ConstraintOverride_quantizeMotionPhase, 85);
        sparseIntArray2.append(z3i0.ConstraintOverride_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(z3i0.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public static a d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, z3i0.ConstraintOverride);
        v(aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public static int[] m(Barrier barrier, String str) {
        int i2;
        Object designInformation;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            try {
                i2 = kih0.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i2 = ((Integer) designInformation).intValue();
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    public static a n(Context context, AttributeSet attributeSet, boolean z) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? z3i0.ConstraintOverride : z3i0.Constraint);
        if (z) {
            v(aVar, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i2 = 0;
            while (true) {
                b bVar = aVar.e;
                if (i2 < indexCount) {
                    int index = obtainStyledAttributes.getIndex(i2);
                    int i3 = z3i0.Constraint_android_id;
                    d dVar = aVar.c;
                    C0007e c0007e = aVar.f;
                    c cVar = aVar.d;
                    if (index != i3 && z3i0.Constraint_android_layout_marginStart != index && z3i0.Constraint_android_layout_marginEnd != index) {
                        cVar.a = true;
                        bVar.b = true;
                        dVar.a = true;
                        c0007e.a = true;
                    }
                    SparseIntArray sparseIntArray = i;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            bVar.q = s(obtainStyledAttributes, index, bVar.q);
                            break;
                        case 2:
                            bVar.J = obtainStyledAttributes.getDimensionPixelSize(index, bVar.J);
                            break;
                        case 3:
                            bVar.p = s(obtainStyledAttributes, index, bVar.p);
                            break;
                        case 4:
                            bVar.o = s(obtainStyledAttributes, index, bVar.o);
                            break;
                        case 5:
                            bVar.z = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            bVar.D = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.D);
                            break;
                        case 7:
                            bVar.E = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.E);
                            break;
                        case 8:
                            bVar.K = obtainStyledAttributes.getDimensionPixelSize(index, bVar.K);
                            break;
                        case 9:
                            bVar.w = s(obtainStyledAttributes, index, bVar.w);
                            break;
                        case 10:
                            bVar.v = s(obtainStyledAttributes, index, bVar.v);
                            break;
                        case 11:
                            bVar.Q = obtainStyledAttributes.getDimensionPixelSize(index, bVar.Q);
                            break;
                        case 12:
                            bVar.R = obtainStyledAttributes.getDimensionPixelSize(index, bVar.R);
                            break;
                        case 13:
                            bVar.N = obtainStyledAttributes.getDimensionPixelSize(index, bVar.N);
                            break;
                        case 14:
                            bVar.P = obtainStyledAttributes.getDimensionPixelSize(index, bVar.P);
                            break;
                        case 15:
                            bVar.S = obtainStyledAttributes.getDimensionPixelSize(index, bVar.S);
                            break;
                        case 16:
                            bVar.O = obtainStyledAttributes.getDimensionPixelSize(index, bVar.O);
                            break;
                        case 17:
                            bVar.e = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.e);
                            break;
                        case 18:
                            bVar.f = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.f);
                            break;
                        case 19:
                            bVar.g = obtainStyledAttributes.getFloat(index, bVar.g);
                            break;
                        case 20:
                            bVar.x = obtainStyledAttributes.getFloat(index, bVar.x);
                            break;
                        case 21:
                            bVar.d = obtainStyledAttributes.getLayoutDimension(index, bVar.d);
                            break;
                        case 22:
                            int i4 = obtainStyledAttributes.getInt(index, dVar.b);
                            dVar.b = i4;
                            dVar.b = h[i4];
                            break;
                        case 23:
                            bVar.c = obtainStyledAttributes.getLayoutDimension(index, bVar.c);
                            break;
                        case 24:
                            bVar.G = obtainStyledAttributes.getDimensionPixelSize(index, bVar.G);
                            break;
                        case 25:
                            bVar.i = s(obtainStyledAttributes, index, bVar.i);
                            break;
                        case 26:
                            bVar.j = s(obtainStyledAttributes, index, bVar.j);
                            break;
                        case 27:
                            bVar.F = obtainStyledAttributes.getInt(index, bVar.F);
                            break;
                        case 28:
                            bVar.H = obtainStyledAttributes.getDimensionPixelSize(index, bVar.H);
                            break;
                        case 29:
                            bVar.k = s(obtainStyledAttributes, index, bVar.k);
                            break;
                        case 30:
                            bVar.l = s(obtainStyledAttributes, index, bVar.l);
                            break;
                        case 31:
                            bVar.L = obtainStyledAttributes.getDimensionPixelSize(index, bVar.L);
                            break;
                        case 32:
                            bVar.t = s(obtainStyledAttributes, index, bVar.t);
                            break;
                        case 33:
                            bVar.u = s(obtainStyledAttributes, index, bVar.u);
                            break;
                        case 34:
                            bVar.I = obtainStyledAttributes.getDimensionPixelSize(index, bVar.I);
                            break;
                        case 35:
                            bVar.n = s(obtainStyledAttributes, index, bVar.n);
                            break;
                        case 36:
                            bVar.m = s(obtainStyledAttributes, index, bVar.m);
                            break;
                        case 37:
                            bVar.y = obtainStyledAttributes.getFloat(index, bVar.y);
                            break;
                        case 38:
                            aVar.a = obtainStyledAttributes.getResourceId(index, aVar.a);
                            break;
                        case 39:
                            bVar.V = obtainStyledAttributes.getFloat(index, bVar.V);
                            break;
                        case 40:
                            bVar.U = obtainStyledAttributes.getFloat(index, bVar.U);
                            break;
                        case 41:
                            bVar.W = obtainStyledAttributes.getInt(index, bVar.W);
                            break;
                        case 42:
                            bVar.X = obtainStyledAttributes.getInt(index, bVar.X);
                            break;
                        case 43:
                            dVar.d = obtainStyledAttributes.getFloat(index, dVar.d);
                            break;
                        case 44:
                            c0007e.m = true;
                            c0007e.n = obtainStyledAttributes.getDimension(index, c0007e.n);
                            break;
                        case 45:
                            c0007e.c = obtainStyledAttributes.getFloat(index, c0007e.c);
                            break;
                        case 46:
                            c0007e.d = obtainStyledAttributes.getFloat(index, c0007e.d);
                            break;
                        case 47:
                            c0007e.e = obtainStyledAttributes.getFloat(index, c0007e.e);
                            break;
                        case 48:
                            c0007e.f = obtainStyledAttributes.getFloat(index, c0007e.f);
                            break;
                        case 49:
                            c0007e.g = obtainStyledAttributes.getDimension(index, c0007e.g);
                            break;
                        case 50:
                            c0007e.h = obtainStyledAttributes.getDimension(index, c0007e.h);
                            break;
                        case SAFETY_TIPS_VALUE:
                            c0007e.j = obtainStyledAttributes.getDimension(index, c0007e.j);
                            break;
                        case 52:
                            c0007e.k = obtainStyledAttributes.getDimension(index, c0007e.k);
                            break;
                        case 53:
                            c0007e.l = obtainStyledAttributes.getDimension(index, c0007e.l);
                            break;
                        case 54:
                            bVar.Y = obtainStyledAttributes.getInt(index, bVar.Y);
                            break;
                        case SODA_DE_DE_VALUE:
                            bVar.Z = obtainStyledAttributes.getInt(index, bVar.Z);
                            break;
                        case 56:
                            bVar.a0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar.a0);
                            break;
                        case SODA_ES_ES_VALUE:
                            bVar.b0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar.b0);
                            break;
                        case 58:
                            bVar.c0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar.c0);
                            break;
                        case 59:
                            bVar.d0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar.d0);
                            break;
                        case 60:
                            c0007e.b = obtainStyledAttributes.getFloat(index, c0007e.b);
                            break;
                        case 61:
                            bVar.A = s(obtainStyledAttributes, index, bVar.A);
                            break;
                        case 62:
                            bVar.B = obtainStyledAttributes.getDimensionPixelSize(index, bVar.B);
                            break;
                        case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                            bVar.C = obtainStyledAttributes.getFloat(index, bVar.C);
                            break;
                        case 64:
                            cVar.b = s(obtainStyledAttributes, index, cVar.b);
                            break;
                        case 65:
                            if (obtainStyledAttributes.peekValue(index).type != 3) {
                                cVar.d = qbn.c[obtainStyledAttributes.getInteger(index, 0)];
                                break;
                            } else {
                                cVar.d = obtainStyledAttributes.getString(index);
                                break;
                            }
                        case 66:
                            cVar.f = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            cVar.h = obtainStyledAttributes.getFloat(index, cVar.h);
                            break;
                        case TRANSLATE_KIT_VALUE:
                            dVar.e = obtainStyledAttributes.getFloat(index, dVar.e);
                            break;
                        case 69:
                            bVar.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            bVar.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            bVar.g0 = obtainStyledAttributes.getInt(index, bVar.g0);
                            break;
                        case HProv.ALG_SID_GR3410_12_256 /* 73 */:
                            bVar.h0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar.h0);
                            break;
                        case 74:
                            bVar.k0 = obtainStyledAttributes.getString(index);
                            break;
                        case HProv.PROV_GOST_2001_DH /* 75 */:
                            bVar.o0 = obtainStyledAttributes.getBoolean(index, bVar.o0);
                            break;
                        case CalendarDayView.DISABLED_DAY_ALPHA /* 76 */:
                            cVar.e = obtainStyledAttributes.getInt(index, cVar.e);
                            break;
                        case HProv.ALG_SID_SHA3_224 /* 77 */:
                            bVar.l0 = obtainStyledAttributes.getString(index);
                            break;
                        case HProv.ALG_SID_SHA3_256 /* 78 */:
                            dVar.c = obtainStyledAttributes.getInt(index, dVar.c);
                            break;
                        case HProv.ALG_SID_SHA3_384 /* 79 */:
                            cVar.g = obtainStyledAttributes.getFloat(index, cVar.g);
                            break;
                        case 80:
                            bVar.m0 = obtainStyledAttributes.getBoolean(index, bVar.m0);
                            break;
                        case 81:
                            bVar.n0 = obtainStyledAttributes.getBoolean(index, bVar.n0);
                            break;
                        case 82:
                            cVar.c = obtainStyledAttributes.getInteger(index, cVar.c);
                            break;
                        case 83:
                            c0007e.i = s(obtainStyledAttributes, index, c0007e.i);
                            break;
                        case HProv.ALG_SID_NO_HASH /* 84 */:
                            cVar.j = obtainStyledAttributes.getInteger(index, cVar.j);
                            break;
                        case 85:
                            cVar.i = obtainStyledAttributes.getFloat(index, cVar.i);
                            break;
                        case MSException.ERROR_INVALID_PASSWORD /* 86 */:
                            int i5 = obtainStyledAttributes.peekValue(index).type;
                            if (i5 != 1) {
                                if (i5 != 3) {
                                    cVar.l = obtainStyledAttributes.getInteger(index, cVar.m);
                                    break;
                                } else {
                                    String string = obtainStyledAttributes.getString(index);
                                    cVar.k = string;
                                    if (string.indexOf("/") <= 0) {
                                        cVar.l = -1;
                                        break;
                                    } else {
                                        cVar.m = obtainStyledAttributes.getResourceId(index, -1);
                                        cVar.l = -2;
                                        break;
                                    }
                                }
                            } else {
                                int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                cVar.m = resourceId;
                                if (resourceId == -1) {
                                    break;
                                } else {
                                    cVar.l = -2;
                                    break;
                                }
                            }
                        case MSException.ERROR_INVALID_PARAMETER /* 87 */:
                            Integer.toHexString(index);
                            sparseIntArray.get(index);
                            break;
                        case HProv.ALG_SID_KECCAK_224 /* 88 */:
                        case HProv.ALG_SID_KECCAK_256 /* 89 */:
                        case 90:
                        default:
                            Integer.toHexString(index);
                            sparseIntArray.get(index);
                            break;
                        case 91:
                            bVar.r = s(obtainStyledAttributes, index, bVar.r);
                            break;
                        case HProv.PP_HASHOID /* 92 */:
                            bVar.s = s(obtainStyledAttributes, index, bVar.s);
                            break;
                        case HProv.PP_CIPHEROID /* 93 */:
                            bVar.M = obtainStyledAttributes.getDimensionPixelSize(index, bVar.M);
                            break;
                        case HProv.PP_SIGNATUREOID /* 94 */:
                            bVar.T = obtainStyledAttributes.getDimensionPixelSize(index, bVar.T);
                            break;
                        case HProv.PP_DHOID /* 95 */:
                            t(bVar, obtainStyledAttributes, index, 0);
                            break;
                        case HProv.PP_RESERVED1 /* 96 */:
                            t(bVar, obtainStyledAttributes, index, 1);
                            break;
                        case HProv.PP_BIO_STATISTICA_LEN /* 97 */:
                            bVar.p0 = obtainStyledAttributes.getInt(index, bVar.p0);
                            break;
                    }
                    i2++;
                } else if (bVar.k0 != null) {
                    bVar.j0 = null;
                }
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public static int s(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(Object obj, TypedArray typedArray, int i2, int i3) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i4 = typedArray.peekValue(i2).type;
        boolean z = true;
        int i5 = 0;
        if (i4 == 3) {
            String string = typedArray.getString(i2);
            if (string == null) {
                return;
            }
            int indexOf = string.indexOf(61);
            int length = string.length();
            if (indexOf <= 0 || indexOf >= length - 1) {
                return;
            }
            String substring = string.substring(0, indexOf);
            String substring2 = string.substring(indexOf + 1);
            if (substring2.length() > 0) {
                String trim = substring.trim();
                String trim2 = substring2.trim();
                if ("ratio".equalsIgnoreCase(trim)) {
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                        if (i3 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                        }
                        u(layoutParams, trim2);
                        return;
                    }
                    if (obj instanceof b) {
                        ((b) obj).z = trim2;
                        return;
                    } else {
                        if (obj instanceof androidx.constraintlayout.widget.d) {
                            ((androidx.constraintlayout.widget.d) obj).c(5, trim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof ConstraintLayout.LayoutParams) {
                            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                            if (i3 == 0) {
                                ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                                layoutParams2.horizontalWeight = parseFloat;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                                layoutParams2.verticalWeight = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof b) {
                            b bVar = (b) obj;
                            if (i3 == 0) {
                                bVar.c = 0;
                                bVar.V = parseFloat;
                                return;
                            } else {
                                bVar.d = 0;
                                bVar.U = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof androidx.constraintlayout.widget.d) {
                            androidx.constraintlayout.widget.d dVar = (androidx.constraintlayout.widget.d) obj;
                            if (i3 == 0) {
                                dVar.b(23, 0);
                                dVar.a(parseFloat, 39);
                                return;
                            } else {
                                dVar.b(21, 0);
                                dVar.a(parseFloat, 40);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ConstraintLayout.LayoutParams) {
                            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                            if (i3 == 0) {
                                ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
                                layoutParams3.matchConstraintPercentWidth = max;
                                layoutParams3.matchConstraintDefaultWidth = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                                layoutParams3.matchConstraintPercentHeight = max;
                                layoutParams3.matchConstraintDefaultHeight = 2;
                                return;
                            }
                        }
                        if (obj instanceof b) {
                            b bVar2 = (b) obj;
                            if (i3 == 0) {
                                bVar2.c = 0;
                                bVar2.e0 = max;
                                bVar2.Y = 2;
                                return;
                            } else {
                                bVar2.d = 0;
                                bVar2.f0 = max;
                                bVar2.Z = 2;
                                return;
                            }
                        }
                        if (obj instanceof androidx.constraintlayout.widget.d) {
                            androidx.constraintlayout.widget.d dVar2 = (androidx.constraintlayout.widget.d) obj;
                            if (i3 == 0) {
                                dVar2.b(23, 0);
                                dVar2.b(54, 2);
                                return;
                            } else {
                                dVar2.b(21, 0);
                                dVar2.b(55, 2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
            return;
        }
        if (i4 != 5) {
            dimensionPixelSize = typedArray.getInt(i2, 0);
            if (dimensionPixelSize == -4) {
                i5 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z = false;
            }
            if (!(obj instanceof ConstraintLayout.LayoutParams)) {
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) obj;
                if (i3 == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams4).width = i5;
                    layoutParams4.constrainedWidth = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams4).height = i5;
                    layoutParams4.constrainedHeight = z;
                    return;
                }
            }
            if (obj instanceof b) {
                b bVar3 = (b) obj;
                if (i3 == 0) {
                    bVar3.c = i5;
                    bVar3.m0 = z;
                    return;
                } else {
                    bVar3.d = i5;
                    bVar3.n0 = z;
                    return;
                }
            }
            if (obj instanceof androidx.constraintlayout.widget.d) {
                androidx.constraintlayout.widget.d dVar3 = (androidx.constraintlayout.widget.d) obj;
                if (i3 == 0) {
                    dVar3.b(23, i5);
                    dVar3.d(80, z);
                    return;
                } else {
                    dVar3.b(21, i5);
                    dVar3.d(81, z);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i2, 0);
        z = false;
        i5 = dimensionPixelSize;
        if (!(obj instanceof ConstraintLayout.LayoutParams)) {
        }
    }

    public static void u(ConstraintLayout.LayoutParams layoutParams, String str) {
        float f = Float.NaN;
        int i2 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i3 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i2 = 0;
                } else if (substring.equalsIgnoreCase(CA20Status.STATUS_CERTIFICATE_H)) {
                    i2 = 1;
                }
                i3 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i3);
                    if (substring2.length() > 0) {
                        f = Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i3, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f = i2 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.dimensionRatio = str;
        layoutParams.mDimensionRatioValue = f;
        layoutParams.mDimensionRatioSide = i2;
    }

    public static void v(a aVar, TypedArray typedArray) {
        int i2;
        int indexCount = typedArray.getIndexCount();
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        aVar.h = dVar;
        c cVar = aVar.d;
        int i3 = 0;
        cVar.a = false;
        b bVar = aVar.e;
        bVar.b = false;
        d dVar2 = aVar.c;
        dVar2.a = false;
        C0007e c0007e = aVar.f;
        c0007e.a = false;
        int i4 = 0;
        while (i4 < indexCount) {
            int index = typedArray.getIndex(i4);
            int i5 = j.get(index);
            SparseIntArray sparseIntArray = i;
            switch (i5) {
                case 2:
                    i2 = i3;
                    dVar.b(2, typedArray.getDimensionPixelSize(index, bVar.J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case HProv.ALG_SID_KECCAK_224 /* 88 */:
                case HProv.ALG_SID_KECCAK_256 /* 89 */:
                case 90:
                case 91:
                case HProv.PP_HASHOID /* 92 */:
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    i2 = i3;
                    break;
                case 5:
                    i2 = i3;
                    dVar.c(5, typedArray.getString(index));
                    break;
                case 6:
                    i2 = i3;
                    dVar.b(6, typedArray.getDimensionPixelOffset(index, bVar.D));
                    break;
                case 7:
                    i2 = i3;
                    dVar.b(7, typedArray.getDimensionPixelOffset(index, bVar.E));
                    break;
                case 8:
                    i2 = i3;
                    dVar.b(8, typedArray.getDimensionPixelSize(index, bVar.K));
                    break;
                case 11:
                    i2 = i3;
                    dVar.b(11, typedArray.getDimensionPixelSize(index, bVar.Q));
                    break;
                case 12:
                    i2 = i3;
                    dVar.b(12, typedArray.getDimensionPixelSize(index, bVar.R));
                    break;
                case 13:
                    i2 = i3;
                    dVar.b(13, typedArray.getDimensionPixelSize(index, bVar.N));
                    break;
                case 14:
                    i2 = i3;
                    dVar.b(14, typedArray.getDimensionPixelSize(index, bVar.P));
                    break;
                case 15:
                    i2 = i3;
                    dVar.b(15, typedArray.getDimensionPixelSize(index, bVar.S));
                    break;
                case 16:
                    i2 = i3;
                    dVar.b(16, typedArray.getDimensionPixelSize(index, bVar.O));
                    break;
                case 17:
                    i2 = i3;
                    dVar.b(17, typedArray.getDimensionPixelOffset(index, bVar.e));
                    break;
                case 18:
                    i2 = i3;
                    dVar.b(18, typedArray.getDimensionPixelOffset(index, bVar.f));
                    break;
                case 19:
                    i2 = i3;
                    dVar.a(typedArray.getFloat(index, bVar.g), 19);
                    break;
                case 20:
                    i2 = i3;
                    dVar.a(typedArray.getFloat(index, bVar.x), 20);
                    break;
                case 21:
                    i2 = i3;
                    dVar.b(21, typedArray.getLayoutDimension(index, bVar.d));
                    break;
                case 22:
                    i2 = i3;
                    dVar.b(22, h[typedArray.getInt(index, dVar2.b)]);
                    break;
                case 23:
                    i2 = i3;
                    dVar.b(23, typedArray.getLayoutDimension(index, bVar.c));
                    break;
                case 24:
                    i2 = i3;
                    dVar.b(24, typedArray.getDimensionPixelSize(index, bVar.G));
                    break;
                case 27:
                    i2 = i3;
                    dVar.b(27, typedArray.getInt(index, bVar.F));
                    break;
                case 28:
                    i2 = i3;
                    dVar.b(28, typedArray.getDimensionPixelSize(index, bVar.H));
                    break;
                case 31:
                    i2 = i3;
                    dVar.b(31, typedArray.getDimensionPixelSize(index, bVar.L));
                    break;
                case 34:
                    i2 = i3;
                    dVar.b(34, typedArray.getDimensionPixelSize(index, bVar.I));
                    break;
                case 37:
                    i2 = i3;
                    dVar.a(typedArray.getFloat(index, bVar.y), 37);
                    break;
                case 38:
                    i2 = i3;
                    int resourceId = typedArray.getResourceId(index, aVar.a);
                    aVar.a = resourceId;
                    dVar.b(38, resourceId);
                    break;
                case 39:
                    i2 = i3;
                    dVar.a(typedArray.getFloat(index, bVar.V), 39);
                    break;
                case 40:
                    i2 = i3;
                    dVar.a(typedArray.getFloat(index, bVar.U), 40);
                    break;
                case 41:
                    i2 = i3;
                    dVar.b(41, typedArray.getInt(index, bVar.W));
                    break;
                case 42:
                    i2 = i3;
                    dVar.b(42, typedArray.getInt(index, bVar.X));
                    break;
                case 43:
                    i2 = i3;
                    dVar.a(typedArray.getFloat(index, dVar2.d), 43);
                    break;
                case 44:
                    i2 = i3;
                    dVar.d(44, true);
                    dVar.a(typedArray.getDimension(index, c0007e.n), 44);
                    break;
                case 45:
                    i2 = i3;
                    dVar.a(typedArray.getFloat(index, c0007e.c), 45);
                    break;
                case 46:
                    i2 = i3;
                    dVar.a(typedArray.getFloat(index, c0007e.d), 46);
                    break;
                case 47:
                    i2 = i3;
                    dVar.a(typedArray.getFloat(index, c0007e.e), 47);
                    break;
                case 48:
                    i2 = i3;
                    dVar.a(typedArray.getFloat(index, c0007e.f), 48);
                    break;
                case 49:
                    i2 = i3;
                    dVar.a(typedArray.getDimension(index, c0007e.g), 49);
                    break;
                case 50:
                    i2 = i3;
                    dVar.a(typedArray.getDimension(index, c0007e.h), 50);
                    break;
                case SAFETY_TIPS_VALUE:
                    i2 = i3;
                    dVar.a(typedArray.getDimension(index, c0007e.j), 51);
                    break;
                case 52:
                    i2 = i3;
                    dVar.a(typedArray.getDimension(index, c0007e.k), 52);
                    break;
                case 53:
                    i2 = i3;
                    dVar.a(typedArray.getDimension(index, c0007e.l), 53);
                    break;
                case 54:
                    i2 = i3;
                    dVar.b(54, typedArray.getInt(index, bVar.Y));
                    break;
                case SODA_DE_DE_VALUE:
                    i2 = i3;
                    dVar.b(55, typedArray.getInt(index, bVar.Z));
                    break;
                case 56:
                    i2 = i3;
                    dVar.b(56, typedArray.getDimensionPixelSize(index, bVar.a0));
                    break;
                case SODA_ES_ES_VALUE:
                    i2 = i3;
                    dVar.b(57, typedArray.getDimensionPixelSize(index, bVar.b0));
                    break;
                case 58:
                    i2 = i3;
                    dVar.b(58, typedArray.getDimensionPixelSize(index, bVar.c0));
                    break;
                case 59:
                    i2 = i3;
                    dVar.b(59, typedArray.getDimensionPixelSize(index, bVar.d0));
                    break;
                case 60:
                    i2 = i3;
                    dVar.a(typedArray.getFloat(index, c0007e.b), 60);
                    break;
                case 62:
                    i2 = i3;
                    dVar.b(62, typedArray.getDimensionPixelSize(index, bVar.B));
                    break;
                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                    i2 = i3;
                    dVar.a(typedArray.getFloat(index, bVar.C), 63);
                    break;
                case 64:
                    i2 = i3;
                    dVar.b(64, s(typedArray, index, cVar.b));
                    break;
                case 65:
                    i2 = i3;
                    if (typedArray.peekValue(index).type != 3) {
                        dVar.c(65, qbn.c[typedArray.getInteger(index, i2)]);
                        break;
                    } else {
                        dVar.c(65, typedArray.getString(index));
                        break;
                    }
                case 66:
                    i2 = 0;
                    dVar.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    dVar.a(typedArray.getFloat(index, cVar.h), 67);
                    i2 = 0;
                    break;
                case TRANSLATE_KIT_VALUE:
                    dVar.a(typedArray.getFloat(index, dVar2.e), 68);
                    i2 = 0;
                    break;
                case 69:
                    dVar.a(typedArray.getFloat(index, 1.0f), 69);
                    i2 = 0;
                    break;
                case 70:
                    dVar.a(typedArray.getFloat(index, 1.0f), 70);
                    i2 = 0;
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    i2 = 0;
                    break;
                case 72:
                    dVar.b(72, typedArray.getInt(index, bVar.g0));
                    i2 = 0;
                    break;
                case HProv.ALG_SID_GR3410_12_256 /* 73 */:
                    dVar.b(73, typedArray.getDimensionPixelSize(index, bVar.h0));
                    i2 = 0;
                    break;
                case 74:
                    dVar.c(74, typedArray.getString(index));
                    i2 = 0;
                    break;
                case HProv.PROV_GOST_2001_DH /* 75 */:
                    dVar.d(75, typedArray.getBoolean(index, bVar.o0));
                    i2 = 0;
                    break;
                case CalendarDayView.DISABLED_DAY_ALPHA /* 76 */:
                    dVar.b(76, typedArray.getInt(index, cVar.e));
                    i2 = 0;
                    break;
                case HProv.ALG_SID_SHA3_224 /* 77 */:
                    dVar.c(77, typedArray.getString(index));
                    i2 = 0;
                    break;
                case HProv.ALG_SID_SHA3_256 /* 78 */:
                    dVar.b(78, typedArray.getInt(index, dVar2.c));
                    i2 = 0;
                    break;
                case HProv.ALG_SID_SHA3_384 /* 79 */:
                    dVar.a(typedArray.getFloat(index, cVar.g), 79);
                    i2 = 0;
                    break;
                case 80:
                    dVar.d(80, typedArray.getBoolean(index, bVar.m0));
                    i2 = 0;
                    break;
                case 81:
                    dVar.d(81, typedArray.getBoolean(index, bVar.n0));
                    i2 = 0;
                    break;
                case 82:
                    dVar.b(82, typedArray.getInteger(index, cVar.c));
                    i2 = 0;
                    break;
                case 83:
                    dVar.b(83, s(typedArray, index, c0007e.i));
                    i2 = 0;
                    break;
                case HProv.ALG_SID_NO_HASH /* 84 */:
                    dVar.b(84, typedArray.getInteger(index, cVar.j));
                    i2 = 0;
                    break;
                case 85:
                    dVar.a(typedArray.getFloat(index, cVar.i), 85);
                    i2 = 0;
                    break;
                case MSException.ERROR_INVALID_PASSWORD /* 86 */:
                    int i6 = typedArray.peekValue(index).type;
                    if (i6 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        cVar.m = resourceId2;
                        dVar.b(89, resourceId2);
                        if (cVar.m != -1) {
                            cVar.l = -2;
                            dVar.b(88, -2);
                        }
                    } else if (i6 == 3) {
                        String string = typedArray.getString(index);
                        cVar.k = string;
                        dVar.c(90, string);
                        if (cVar.k.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            cVar.m = resourceId3;
                            dVar.b(89, resourceId3);
                            cVar.l = -2;
                            dVar.b(88, -2);
                        } else {
                            cVar.l = -1;
                            dVar.b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, cVar.m);
                        cVar.l = integer;
                        dVar.b(88, integer);
                    }
                    i2 = 0;
                    break;
                case MSException.ERROR_INVALID_PARAMETER /* 87 */:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    i2 = i3;
                    break;
                case HProv.PP_CIPHEROID /* 93 */:
                    dVar.b(93, typedArray.getDimensionPixelSize(index, bVar.M));
                    i2 = i3;
                    break;
                case HProv.PP_SIGNATUREOID /* 94 */:
                    dVar.b(94, typedArray.getDimensionPixelSize(index, bVar.T));
                    i2 = i3;
                    break;
                case HProv.PP_DHOID /* 95 */:
                    t(dVar, typedArray, index, i3);
                    i2 = i3;
                    break;
                case HProv.PP_RESERVED1 /* 96 */:
                    t(dVar, typedArray, index, 1);
                    i2 = i3;
                    break;
                case HProv.PP_BIO_STATISTICA_LEN /* 97 */:
                    dVar.b(97, typedArray.getInt(index, bVar.p0));
                    i2 = i3;
                    break;
                case HProv.PP_REBOOT /* 98 */:
                    if (MotionLayout.IS_IN_EDIT_MODE) {
                        int resourceId4 = typedArray.getResourceId(index, aVar.a);
                        aVar.a = resourceId4;
                        if (resourceId4 == -1) {
                            aVar.b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.b = typedArray.getString(index);
                    } else {
                        aVar.a = typedArray.getResourceId(index, aVar.a);
                    }
                    i2 = i3;
                    break;
                case 99:
                    dVar.d(99, typedArray.getBoolean(index, bVar.h));
                    i2 = i3;
                    break;
            }
            i4++;
            i3 = i2;
        }
    }

    public static String y(int i2) {
        switch (i2) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return StringUtils.UNDEFINED;
        }
    }

    public final void a(MotionLayout motionLayout) {
        a aVar;
        int childCount = motionLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = motionLayout.getChildAt(i2);
            int id = childAt.getId();
            Integer valueOf = Integer.valueOf(id);
            HashMap hashMap = this.g;
            if (!hashMap.containsKey(valueOf)) {
                rug.d(childAt);
            } else if (this.f && id == -1) {
                kbs.g("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            } else if (hashMap.containsKey(Integer.valueOf(id)) && (aVar = (a) hashMap.get(Integer.valueOf(id))) != null) {
                c7e.f(childAt, aVar.g);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = this.g;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                rug.d(childAt);
            } else {
                if (this.f && id == -1) {
                    kbs.g("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1 && hashMap.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = (a) hashMap.get(Integer.valueOf(id));
                    if (aVar != null) {
                        d dVar = aVar.c;
                        b bVar = aVar.e;
                        C0007e c0007e = aVar.f;
                        if (childAt instanceof Barrier) {
                            bVar.i0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(bVar.g0);
                            barrier.setMargin(bVar.h0);
                            barrier.setAllowsGoneWidget(bVar.o0);
                            int[] iArr = bVar.j0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.k0;
                                if (str != null) {
                                    int[] m = m(barrier, str);
                                    bVar.j0 = m;
                                    barrier.setReferencedIds(m);
                                }
                            }
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.validate();
                        aVar.b(layoutParams);
                        c7e.f(childAt, aVar.g);
                        childAt.setLayoutParams(layoutParams);
                        if (dVar.c == 0) {
                            childAt.setVisibility(dVar.b);
                        }
                        childAt.setAlpha(dVar.d);
                        childAt.setRotation(c0007e.b);
                        childAt.setRotationX(c0007e.c);
                        childAt.setRotationY(c0007e.d);
                        childAt.setScaleX(c0007e.e);
                        childAt.setScaleY(c0007e.f);
                        if (c0007e.i != -1) {
                            if (((View) childAt.getParent()).findViewById(c0007e.i) != null) {
                                float bottom = (r5.getBottom() + r5.getTop()) / 2.0f;
                                float right = (r5.getRight() + r5.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(c0007e.g)) {
                                childAt.setPivotX(c0007e.g);
                            }
                            if (!Float.isNaN(c0007e.h)) {
                                childAt.setPivotY(c0007e.h);
                            }
                        }
                        childAt.setTranslationX(c0007e.j);
                        childAt.setTranslationY(c0007e.k);
                        childAt.setTranslationZ(c0007e.l);
                        if (c0007e.m) {
                            childAt.setElevation(c0007e.n);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = (a) hashMap.get(num);
            if (aVar2 != null) {
                b bVar2 = aVar2.e;
                if (bVar2.i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = bVar2.j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.k0;
                        if (str2 != null) {
                            int[] m2 = m(barrier2, str2);
                            bVar2.j0 = m2;
                            barrier2.setReferencedIds(m2);
                        }
                    }
                    barrier2.setType(bVar2.g0);
                    barrier2.setMargin(bVar2.h0);
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.validateParams();
                    aVar2.b(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (bVar2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.b(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).applyLayoutFeaturesInConstraintSet(constraintLayout);
            }
        }
    }

    public final void e(int i2, int i3) {
        a aVar;
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.g;
        if (!hashMap.containsKey(valueOf) || (aVar = (a) hashMap.get(Integer.valueOf(i2))) == null) {
            return;
        }
        b bVar = aVar.e;
        switch (i3) {
            case 1:
                bVar.j = -1;
                bVar.i = -1;
                bVar.G = -1;
                bVar.N = Integer.MIN_VALUE;
                break;
            case 2:
                bVar.l = -1;
                bVar.k = -1;
                bVar.H = -1;
                bVar.P = Integer.MIN_VALUE;
                break;
            case 3:
                bVar.n = -1;
                bVar.m = -1;
                bVar.I = 0;
                bVar.O = Integer.MIN_VALUE;
                break;
            case 4:
                bVar.o = -1;
                bVar.p = -1;
                bVar.J = 0;
                bVar.Q = Integer.MIN_VALUE;
                break;
            case 5:
                bVar.q = -1;
                bVar.r = -1;
                bVar.s = -1;
                bVar.M = 0;
                bVar.T = Integer.MIN_VALUE;
                break;
            case 6:
                bVar.t = -1;
                bVar.u = -1;
                bVar.L = 0;
                bVar.S = Integer.MIN_VALUE;
                break;
            case 7:
                bVar.v = -1;
                bVar.w = -1;
                bVar.K = 0;
                bVar.R = Integer.MIN_VALUE;
                break;
            case 8:
                bVar.C = -1.0f;
                bVar.B = -1;
                bVar.A = -1;
                break;
            default:
                ny61.g("unknown constraint");
                break;
        }
    }

    public final void f(int i2, Context context) {
        g((ConstraintLayout) LayoutInflater.from(context).inflate(i2, (ViewGroup) null));
    }

    public final void g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = this.g;
        hashMap.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f && id == -1) {
                kbs.g("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) hashMap.get(Integer.valueOf(id));
            if (aVar != null) {
                d dVar = aVar.c;
                b bVar = aVar.e;
                C0007e c0007e = aVar.f;
                aVar.g = c7e.a(childAt, this.e);
                aVar.d(id, layoutParams);
                dVar.b = childAt.getVisibility();
                dVar.d = childAt.getAlpha();
                c0007e.b = childAt.getRotation();
                c0007e.c = childAt.getRotationX();
                c0007e.d = childAt.getRotationY();
                c0007e.e = childAt.getScaleX();
                c0007e.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c0007e.g = pivotX;
                    c0007e.h = pivotY;
                }
                c0007e.j = childAt.getTranslationX();
                c0007e.k = childAt.getTranslationY();
                c0007e.l = childAt.getTranslationZ();
                if (c0007e.m) {
                    c0007e.n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    bVar.o0 = barrier.getAllowsGoneWidget();
                    bVar.j0 = barrier.getReferencedIds();
                    bVar.g0 = barrier.getType();
                    bVar.h0 = barrier.getMargin();
                }
            }
        }
    }

    public final void h(e eVar) {
        HashMap hashMap = this.g;
        hashMap.clear();
        for (Integer num : eVar.g.keySet()) {
            a aVar = (a) eVar.g.get(num);
            if (aVar != null) {
                hashMap.put(num, aVar.clone());
            }
        }
    }

    public final void i(int i2, int i3, int i4, int i5) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.g;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i2), new a());
        }
        a aVar = (a) hashMap.get(Integer.valueOf(i2));
        if (aVar == null) {
            return;
        }
        b bVar = aVar.e;
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    bVar.i = i4;
                    bVar.j = -1;
                    return;
                } else if (i5 != 2) {
                    vg10.i("left to ", y(i5), " undefined");
                    return;
                } else {
                    bVar.j = i4;
                    bVar.i = -1;
                    return;
                }
            case 2:
                if (i5 == 1) {
                    bVar.k = i4;
                    bVar.l = -1;
                    return;
                } else if (i5 != 2) {
                    vg10.i("right to ", y(i5), " undefined");
                    return;
                } else {
                    bVar.l = i4;
                    bVar.k = -1;
                    return;
                }
            case 3:
                if (i5 == 3) {
                    bVar.m = i4;
                    bVar.n = -1;
                    bVar.q = -1;
                    bVar.r = -1;
                    bVar.s = -1;
                    return;
                }
                if (i5 != 4) {
                    vg10.i("right to ", y(i5), " undefined");
                    return;
                }
                bVar.n = i4;
                bVar.m = -1;
                bVar.q = -1;
                bVar.r = -1;
                bVar.s = -1;
                return;
            case 4:
                if (i5 == 4) {
                    bVar.p = i4;
                    bVar.o = -1;
                    bVar.q = -1;
                    bVar.r = -1;
                    bVar.s = -1;
                    return;
                }
                if (i5 != 3) {
                    vg10.i("right to ", y(i5), " undefined");
                    return;
                }
                bVar.o = i4;
                bVar.p = -1;
                bVar.q = -1;
                bVar.r = -1;
                bVar.s = -1;
                return;
            case 5:
                if (i5 == 5) {
                    bVar.q = i4;
                    bVar.p = -1;
                    bVar.o = -1;
                    bVar.m = -1;
                    bVar.n = -1;
                    return;
                }
                if (i5 == 3) {
                    bVar.r = i4;
                    bVar.p = -1;
                    bVar.o = -1;
                    bVar.m = -1;
                    bVar.n = -1;
                    return;
                }
                if (i5 != 4) {
                    vg10.i("right to ", y(i5), " undefined");
                    return;
                }
                bVar.s = i4;
                bVar.p = -1;
                bVar.o = -1;
                bVar.m = -1;
                bVar.n = -1;
                return;
            case 6:
                if (i5 == 6) {
                    bVar.u = i4;
                    bVar.t = -1;
                    return;
                } else if (i5 != 7) {
                    vg10.i("right to ", y(i5), " undefined");
                    return;
                } else {
                    bVar.t = i4;
                    bVar.u = -1;
                    return;
                }
            case 7:
                if (i5 == 7) {
                    bVar.w = i4;
                    bVar.v = -1;
                    return;
                } else if (i5 != 6) {
                    vg10.i("right to ", y(i5), " undefined");
                    return;
                } else {
                    bVar.v = i4;
                    bVar.w = -1;
                    return;
                }
            default:
                throw new IllegalArgumentException(y(i3) + " to " + y(i5) + " unknown");
        }
    }

    public final void j(int i2, int i3, int i4, int i5, int i6) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.g;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i2), new a());
        }
        a aVar = (a) hashMap.get(Integer.valueOf(i2));
        if (aVar == null) {
            return;
        }
        b bVar = aVar.e;
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    bVar.i = i4;
                    bVar.j = -1;
                } else if (i5 != 2) {
                    vg10.i("Left to ", y(i5), " undefined");
                    return;
                } else {
                    bVar.j = i4;
                    bVar.i = -1;
                }
                bVar.G = i6;
                return;
            case 2:
                if (i5 == 1) {
                    bVar.k = i4;
                    bVar.l = -1;
                } else if (i5 != 2) {
                    vg10.i("right to ", y(i5), " undefined");
                    return;
                } else {
                    bVar.l = i4;
                    bVar.k = -1;
                }
                bVar.H = i6;
                return;
            case 3:
                if (i5 == 3) {
                    bVar.m = i4;
                    bVar.n = -1;
                    bVar.q = -1;
                    bVar.r = -1;
                    bVar.s = -1;
                } else {
                    if (i5 != 4) {
                        vg10.i("right to ", y(i5), " undefined");
                        return;
                    }
                    bVar.n = i4;
                    bVar.m = -1;
                    bVar.q = -1;
                    bVar.r = -1;
                    bVar.s = -1;
                }
                bVar.I = i6;
                return;
            case 4:
                if (i5 == 4) {
                    bVar.p = i4;
                    bVar.o = -1;
                    bVar.q = -1;
                    bVar.r = -1;
                    bVar.s = -1;
                } else {
                    if (i5 != 3) {
                        vg10.i("right to ", y(i5), " undefined");
                        return;
                    }
                    bVar.o = i4;
                    bVar.p = -1;
                    bVar.q = -1;
                    bVar.r = -1;
                    bVar.s = -1;
                }
                bVar.J = i6;
                return;
            case 5:
                if (i5 == 5) {
                    bVar.q = i4;
                    bVar.p = -1;
                    bVar.o = -1;
                    bVar.m = -1;
                    bVar.n = -1;
                    return;
                }
                if (i5 == 3) {
                    bVar.r = i4;
                    bVar.p = -1;
                    bVar.o = -1;
                    bVar.m = -1;
                    bVar.n = -1;
                    return;
                }
                if (i5 != 4) {
                    vg10.i("right to ", y(i5), " undefined");
                    return;
                }
                bVar.s = i4;
                bVar.p = -1;
                bVar.o = -1;
                bVar.m = -1;
                bVar.n = -1;
                return;
            case 6:
                if (i5 == 6) {
                    bVar.u = i4;
                    bVar.t = -1;
                } else if (i5 != 7) {
                    vg10.i("right to ", y(i5), " undefined");
                    return;
                } else {
                    bVar.t = i4;
                    bVar.u = -1;
                }
                bVar.L = i6;
                return;
            case 7:
                if (i5 == 7) {
                    bVar.w = i4;
                    bVar.v = -1;
                } else if (i5 != 6) {
                    vg10.i("right to ", y(i5), " undefined");
                    return;
                } else {
                    bVar.v = i4;
                    bVar.w = -1;
                }
                bVar.K = i6;
                return;
            default:
                throw new IllegalArgumentException(y(i3) + " to " + y(i5) + " unknown");
        }
    }

    public final void k(int i2, int i3) {
        o(i2).e.d = i3;
    }

    public final void l(int i2, int i3) {
        o(i2).e.c = i3;
    }

    public final a o(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.g;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i2), new a());
        }
        return (a) hashMap.get(Integer.valueOf(i2));
    }

    public final a p(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap hashMap = this.g;
        if (hashMap.containsKey(valueOf)) {
            return (a) hashMap.get(Integer.valueOf(i2));
        }
        return null;
    }

    public final void q(int i2, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a n = n(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        n.e.a = true;
                    }
                    this.g.put(Integer.valueOf(n.a), n);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i2, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i2, e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01af, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (!name.equals("Layout")) {
                                continue;
                            } else {
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                aVar.e.b(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            }
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                aVar.d.b(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            }
                        case -1962203927:
                            if (name.equals("ConstraintOverride")) {
                                aVar = n(context, Xml.asAttributeSet(xmlResourceParser), true);
                                break;
                            } else {
                                continue;
                            }
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                aVar.c.b(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            }
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                aVar.f.b(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            }
                        case -71750448:
                            if (name.equals("Guideline")) {
                                aVar = n(context, Xml.asAttributeSet(xmlResourceParser), false);
                                b bVar = aVar.e;
                                bVar.a = true;
                                bVar.b = true;
                                break;
                            } else {
                                continue;
                            }
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                continue;
                            }
                            break;
                        case 1331510167:
                            if (name.equals("Barrier")) {
                                aVar = n(context, Xml.asAttributeSet(xmlResourceParser), false);
                                aVar.e.i0 = 1;
                                break;
                            } else {
                                continue;
                            }
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                break;
                            } else {
                                continue;
                            }
                        case 1803088381:
                            if (name.equals("Constraint")) {
                                aVar = n(context, Xml.asAttributeSet(xmlResourceParser), false);
                                break;
                            } else {
                                continue;
                            }
                    }
                    if (aVar == null) {
                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                    }
                    c7e.e(context, xmlResourceParser, aVar.g);
                } else if (eventType == 3) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (!lowerCase.equals("guideline")) {
                                break;
                            }
                            break;
                        case -190376483:
                            if (!lowerCase.equals("constraint")) {
                                break;
                            } else {
                                break;
                            }
                        case 426575017:
                            if (!lowerCase.equals("constraintoverride")) {
                                break;
                            } else {
                                break;
                            }
                        case 2146106725:
                            if (lowerCase.equals("constraintset")) {
                                return;
                            } else {
                                continue;
                            }
                        default:
                            continue;
                    }
                    this.g.put(Integer.valueOf(aVar.a), aVar);
                    aVar = null;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing XML resource", e2);
        }
    }

    public final void w(int i2, int i3, int i4) {
        a o = o(i2);
        switch (i3) {
            case 1:
                o.e.G = i4;
                break;
            case 2:
                o.e.H = i4;
                break;
            case 3:
                o.e.I = i4;
                break;
            case 4:
                o.e.J = i4;
                break;
            case 5:
                o.e.M = i4;
                break;
            case 6:
                o.e.L = i4;
                break;
            case 7:
                o.e.K = i4;
                break;
            default:
                ny61.g("unknown constraint");
                break;
        }
    }

    public final void x(int i2, int i3) {
        o(i2).c.b = i3;
    }
}
