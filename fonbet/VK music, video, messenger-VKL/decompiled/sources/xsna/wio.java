package xsna;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.photo.editor.features.markup.draw.internal.mvi.model.BrushType;
import com.vk.photo.editor.features.markup.draw.model.stat.DrawStatEvent;
import com.vk.photo.editor.markup.path.calculator.ArrowPathCalculator;
import com.vk.photo.editor.markup.view.DrawingView;
import com.vk.photo.editor.markup.view.tools.BrushesPanel;
import com.vk.photo.editor.markup.view.tools.PipetteView;
import com.vk.photo.editor.markup.view.tools.SizeCircleView;
import com.vk.photo.editor.markup.view.tools.SizeSeekBarView;
import com.vk.photo.editor.markup.view.tools.button.ColorButton;
import com.vk.photo.editor.markup.view.tools.button.PipetteButton;
import com.vk.photo.editor.markup.view.tools.utils.Anchor;
import com.vk.photo.editor.views.ToolBottomView;
import com.vk.photo.editor.views.ToolButton;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.d5p;
import xsna.hio;
import xsna.nv10;
import xsna.qbk;
import xsna.rlo;
import xsna.wpa0;
import xsna.y8g;
import xsna.yho;
import xsna.z6y0;

/* compiled from: DrawTool.kt */
/* loaded from: classes4.dex */
public final class wio extends m3p<nio> implements p290, SizeSeekBarView.a, PipetteView.a, BrushesPanel.a, z860, v0g, g7y0, nv10.a {
    public final jf10 A;
    public final of10 B;
    public final ConcatAdapter C;
    public final rlo D;
    public final v3p c;
    public final List<Integer> d;
    public final jjo e;
    public View f;
    public View g;
    public ColorButton h;
    public PipetteButton i;
    public View j;
    public BrushesPanel k;
    public RecyclerView l;
    public ViewGroup m;
    public ViewGroup n;
    public ToolBottomView o;
    public View p;
    public View q;
    public r6y0 r;
    public final PipetteView s;
    public final SizeSeekBarView t;
    public final SizeCircleView u;
    public final tf10 v;
    public final DrawingView w;
    public final nv10 x;
    public final c5p y;
    public final ArrayList z;

    /* compiled from: DrawTool.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements wzs<hio, spj<? super s3q0>, Object> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:217:0x0476  */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARN: Type inference failed for: r6v5, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r6v6 */
        @Override // xsna.wzs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invoke(hio hioVar, spj<? super s3q0> spjVar) {
            hio.a.C3000a c3000a;
            wpa0 bVar;
            int i;
            ?? r6;
            PipetteButton pipetteButton;
            BrushesPanel.BrushType brushType;
            RecyclerView recyclerView;
            hio hioVar2 = hioVar;
            wio wioVar = (wio) this.receiver;
            of10 of10Var = wioVar.B;
            SizeCircleView sizeCircleView = wioVar.u;
            jf10 jf10Var = wioVar.A;
            hio.a aVar = hioVar2.i;
            List<vlo> list = hioVar2.e;
            int i2 = hioVar2.c;
            hio.a aVar2 = hioVar2.f;
            x5g x5gVar = hioVar2.b;
            float f = hioVar2.a;
            BrushType brushType2 = hioVar2.d;
            hio.a.c cVar = hio.a.c.a;
            if (!epx.f(aVar, cVar)) {
                vlo vloVar = list.get(i2);
                tf10 tf10Var = wioVar.v;
                if (tf10Var != null) {
                    tf10Var.b(vloVar);
                } else {
                    wioVar.c.s(new nio(vloVar));
                }
            }
            boolean z = x5gVar.b;
            int i3 = x5gVar.a;
            ArrayList arrayList = wioVar.z;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            y8g.c cVar2 = y8g.a.a;
            y8g.c cVar3 = cVar2;
            while (true) {
                Iterator it2 = it;
                if (!it.hasNext()) {
                    break;
                }
                y8g.c cVar4 = (y8g.c) it2.next();
                int i4 = i2;
                boolean z2 = cVar4.a == i3 && !z;
                if (z2) {
                    cVar3 = cVar4;
                }
                arrayList2.add(new jzp0(cVar4, z2));
                i2 = i4;
                it = it2;
                cVar2 = cVar2;
            }
            int i5 = i2;
            y8g.c cVar5 = cVar2;
            jf10Var.submitList(arrayList2);
            hio.a.C3000a c3000a2 = hio.a.C3000a.a;
            if (epx.f(aVar, c3000a2) || (aVar instanceof hio.a.d) || (recyclerView = wioVar.l) == null) {
                c3000a = c3000a2;
            } else {
                Iterator<jzp0> it3 = jf10Var.getCurrentList().iterator();
                int i6 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i6 = -1;
                        break;
                    }
                    if (it3.next().b) {
                        break;
                    }
                    i6++;
                }
                int i7 = i6 + 1;
                RecyclerView recyclerView2 = wioVar.l;
                RecyclerView.o layoutManager = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager == null) {
                    c3000a = c3000a2;
                } else {
                    int w = linearLayoutManager.w();
                    int s = linearLayoutManager.s();
                    c3000a = c3000a2;
                    if (s == -1 || w == -1 ? i7 == 1 : w - s >= i7) {
                        i7 = 0;
                    }
                }
                lkf0.c(recyclerView, i7);
            }
            ColorButton colorButton = wioVar.h;
            if (colorButton != null) {
                colorButton.setCurrentColor(z ? cVar5 : cVar3);
            }
            if (z) {
                bVar = new wpa0.a(new y8g.c(i3), ((aVar instanceof hio.a.d) || (aVar instanceof hio.a.b)) ? false : true);
            } else {
                bVar = new wpa0.b(false);
            }
            of10Var.submitList(Collections.singletonList(new xzp0(bVar)));
            PipetteButton pipetteButton2 = wioVar.i;
            if (pipetteButton2 != null) {
                pipetteButton2.setState(bVar);
            }
            PipetteButton pipetteButton3 = wioVar.i;
            if (pipetteButton3 != null) {
                pipetteButton3.setClickable(z);
                pipetteButton3.setFocusable(z);
            }
            boolean f2 = epx.f(aVar2, cVar);
            hio.a.b bVar2 = hio.a.b.a;
            if (f2 && epx.f(aVar, bVar2)) {
                if (z) {
                    PipetteButton pipetteButton4 = wioVar.i;
                    if (pipetteButton4 != null) {
                        pipetteButton4.setVisibility(0);
                    }
                    PipetteButton pipetteButton5 = wioVar.i;
                    if (pipetteButton5 != null) {
                        pipetteButton5.setAlpha(1.0f);
                    }
                    ColorButton colorButton2 = wioVar.h;
                    if (colorButton2 != null) {
                        colorButton2.setVisibility(4);
                    }
                    ColorButton colorButton3 = wioVar.h;
                    if (colorButton3 != null) {
                        colorButton3.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                } else {
                    ColorButton colorButton4 = wioVar.h;
                    if (colorButton4 != null) {
                        colorButton4.setVisibility(0);
                    }
                    ColorButton colorButton5 = wioVar.h;
                    if (colorButton5 != null) {
                        colorButton5.setAlpha(1.0f);
                    }
                    PipetteButton pipetteButton6 = wioVar.i;
                    if (pipetteButton6 != null) {
                        pipetteButton6.setVisibility(4);
                    }
                    PipetteButton pipetteButton7 = wioVar.i;
                    if (pipetteButton7 != null) {
                        pipetteButton7.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                }
            }
            ColorButton colorButton6 = wioVar.h;
            if (colorButton6 != null) {
                boolean z3 = !z;
                colorButton6.setClickable(z3);
                colorButton6.setFocusable(z3);
            }
            BrushesPanel brushesPanel = wioVar.k;
            if (brushesPanel != null) {
                int i8 = el8.$EnumSwitchMapping$0[brushType2.ordinal()];
                if (i8 == 1) {
                    brushType = BrushesPanel.BrushType.Pen;
                } else if (i8 == 2) {
                    brushType = BrushesPanel.BrushType.Arrow;
                } else if (i8 == 3) {
                    brushType = BrushesPanel.BrushType.Marker;
                } else if (i8 == 4) {
                    brushType = BrushesPanel.BrushType.Glow;
                } else {
                    if (i8 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    brushType = BrushesPanel.BrushType.Eraser;
                }
                brushesPanel.setCurrentBrush(brushType);
            }
            BrushesPanel brushesPanel2 = wioVar.k;
            if (brushesPanel2 != null) {
                brushesPanel2.setCurrentColor(i3);
            }
            wioVar.t.setSize(f);
            sizeCircleView.setRelativeSize(f);
            sizeCircleView.setColor(brushType2 != BrushType.Eraser ? i3 : -1);
            if (hioVar2.h) {
                rlo rloVar = wioVar.D;
                boolean z4 = rloVar.c;
                DrawingView drawingView = rloVar.a;
                int i9 = rlo.a.$EnumSwitchMapping$0[brushType2.ordinal()];
                if (i9 == 1) {
                    float b = rloVar.b(f);
                    y8g.c cVar6 = new y8g.c(i3);
                    Paint.Style style = Paint.Style.STROKE;
                    drawingView.e(new jq90(new lrm0(cVar6, b), g6k0.b, new DrawStatEvent.b(cVar6, (int) (f * 100.0f), DrawStatEvent.BrushType.Pen)), z4 ? new xq90(an10.b(b)) : null);
                } else if (i9 == 2) {
                    float b2 = rloVar.b(f);
                    y8g.c cVar7 = new y8g.c(i3);
                    Paint.Style style2 = Paint.Style.STROKE;
                    drawingView.e(new jq90(new lrm0(cVar7, b2), new ofy0(new eq90[]{g6k0.b, new ArrowPathCalculator(5 * b2)}, 5), new DrawStatEvent.b(cVar7, (int) (f * 100.0f), DrawStatEvent.BrushType.Arrow)), z4 ? new xq90(an10.b(b2)) : null);
                } else if (i9 == 3) {
                    int i10 = rlo.e;
                    float f3 = ((i10 - r7) * f) + rlo.d;
                    int i11 = rlo.g;
                    int i12 = rlo.f;
                    float a = rloVar.a();
                    float f4 = f3 / a;
                    kif0 kif0Var = new kif0(f4, (((i11 - i12) * f) + i12) / a);
                    y8g.c cVar8 = new y8g.c(i3);
                    drawingView.e(new nmb0(new gif0(kif0Var, cVar8, 0.6f), new kx90(), new DrawStatEvent.b(cVar8, (int) (f * 100.0f), DrawStatEvent.BrushType.Marker)), z4 ? new qmb0(an10.b(f4)) : null);
                } else if (i9 == 4) {
                    float b3 = rloVar.b(f);
                    y8g.c cVar9 = new y8g.c(i3);
                    Paint.Style style3 = Paint.Style.STROKE;
                    drawingView.e(new jq90(new t2u(rlo.h, cVar9, b3, b3 * 1.4f, b3 / 2.0f), g6k0.b, new DrawStatEvent.b(cVar9, (int) (f * 100.0f), DrawStatEvent.BrushType.Glow)), z4 ? new xq90(an10.b(b3)) : null);
                } else {
                    if (i9 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jq90 jq90Var = new jq90(new uup(rloVar.b(f)), g6k0.b, new DrawStatEvent.b(cVar5, (int) (f * 100.0f), DrawStatEvent.BrushType.Eraser));
                    int i13 = DrawingView.h;
                    drawingView.e(jq90Var, null);
                }
            }
            View view = wioVar.q;
            if (view != null) {
                view.setEnabled(i5 > 0);
            }
            View view2 = wioVar.p;
            if (view2 != null) {
                i = i5;
                view2.setEnabled(i < e43.h(list));
            } else {
                i = i5;
            }
            View view3 = wioVar.q;
            if (view3 != null) {
                view3.setAlpha(i > 0 ? 1.0f : 0.4f);
            }
            View view4 = wioVar.p;
            if (view4 != null) {
                view4.setAlpha(i < e43.h(list) ? 1.0f : 0.4f);
            }
            PipetteView pipetteView = wioVar.s;
            Object[] objArr = {wioVar.k, wioVar.l, wioVar.f, wioVar.i, wioVar.h, wioVar.j};
            int i14 = 0;
            while (true) {
                if (i14 >= 6) {
                    hio.a aVar3 = hioVar2.i;
                    boolean z5 = x5gVar.b;
                    final FrameLayout frameLayout = z5 ? wioVar.i : wioVar.h;
                    if (frameLayout == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    final BrushesPanel brushesPanel3 = wioVar.k;
                    if (brushesPanel3 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    final RecyclerView recyclerView3 = wioVar.l;
                    if (recyclerView3 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    final ViewGroup viewGroup = wioVar.m;
                    if (viewGroup == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    final ViewGroup viewGroup2 = wioVar.n;
                    if (viewGroup2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    final View view5 = wioVar.j;
                    if (view5 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    hio.a.C3000a c3000a3 = c3000a;
                    if (epx.f(aVar2, c3000a3) && epx.f(aVar3, bVar2)) {
                        PipetteButton pipetteButton8 = wioVar.i;
                        if (pipetteButton8 != null) {
                            pipetteButton8.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            fyt0.n(pipetteButton8, z5);
                        }
                        ColorButton colorButton7 = wioVar.h;
                        if (colorButton7 != null) {
                            colorButton7.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            fyt0.n(colorButton7, !z5);
                        }
                        l3p.a("DrawEditorExpand", new izs() { // from class: xsna.tio
                            @Override // xsna.izs
                            public final Object invoke(Object obj) {
                                AnimatorSet animatorSet = new AnimatorSet();
                                BrushesPanel brushesPanel4 = brushesPanel3;
                                brushesPanel4.a(true);
                                animatorSet.playTogether(lkf0.a(viewGroup, recyclerView3, r3.getWidth(), frameLayout, Anchor.Start), lkf0.b(viewGroup2, brushesPanel4, brushesPanel4.getWidth(), view5, Anchor.End));
                                animatorSet.addListener(new yio((gzs) obj));
                                animatorSet.start();
                                return s3q0.a;
                            }
                        });
                    } else if (epx.f(aVar2, bVar2) && epx.f(aVar3, c3000a3)) {
                        l3p.a("DrawEditorExpand", new izs() { // from class: xsna.vio
                            @Override // xsna.izs
                            public final Object invoke(Object obj) {
                                AnimatorSet animatorSet = new AnimatorSet();
                                BrushesPanel brushesPanel4 = brushesPanel3;
                                brushesPanel4.a(false);
                                AnimatorSet a2 = lkf0.a(viewGroup2, brushesPanel4, fyt0.f(brushesPanel4), view5, Anchor.End);
                                RecyclerView recyclerView4 = recyclerView3;
                                animatorSet.playTogether(a2, lkf0.b(viewGroup, recyclerView4, fyt0.f(recyclerView4), frameLayout, Anchor.Start));
                                animatorSet.addListener(new zio((gzs) obj));
                                animatorSet.start();
                                return s3q0.a;
                            }
                        });
                    } else if ((aVar2 instanceof hio.a.d) && !(aVar3 instanceof hio.a.d)) {
                        r6 = 0;
                        pipetteView.setSelecting(false);
                        fyt0.h(pipetteView);
                        if (!(aVar2 instanceof hio.a.d) && (aVar3 instanceof hio.a.d)) {
                            pipetteView.setVisibility(r6);
                            pipetteView.c(((hio.a.d) aVar3).a);
                            wpa0.a aVar4 = new wpa0.a(new y8g.c(pipetteView.getSelectedColor()), r6);
                            pipetteButton = wioVar.i;
                            if (pipetteButton != null) {
                                pipetteButton.setState(aVar4);
                            }
                            of10Var.submitList(Collections.singletonList(new xzp0(aVar4)));
                        }
                    }
                    r6 = 0;
                    if (!(aVar2 instanceof hio.a.d)) {
                        pipetteView.setVisibility(r6);
                        pipetteView.c(((hio.a.d) aVar3).a);
                        wpa0.a aVar42 = new wpa0.a(new y8g.c(pipetteView.getSelectedColor()), r6);
                        pipetteButton = wioVar.i;
                        if (pipetteButton != null) {
                        }
                        of10Var.submitList(Collections.singletonList(new xzp0(aVar42)));
                    }
                } else {
                    if (objArr[i14] == null) {
                        break;
                    }
                    i14++;
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: DrawTool.kt */
    public static final class b implements d5p.a<nio> {
        public final List<Integer> a = url.b;

        public b(int i) {
        }

        @Override // xsna.d5p.a
        public final d5p<nio> a(v3p v3pVar) {
            tf10 tf10Var = (tf10) v3pVar.g(uf10.a).h();
            if (tf10Var == null || !tf10Var.a(hjo.a)) {
                tf10Var = null;
            }
            vyt0 vyt0Var = new vyt0(v3pVar.getViewModelStore(), new kjo(((Number) j5g.Y(url.b)).intValue(), v3pVar.d(), tf10Var != null), qbk.a.b);
            rfc a = fpf0.a(jjo.class);
            String h = a.h();
            if (h != null) {
                return new wio(v3pVar, this.a, (jjo) vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h), a));
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
    }

    /* compiled from: DrawTool.kt */
    public static final class c implements l290 {
        public final DrawingView a;

        public c(wio wioVar) {
            this.a = wioVar.w;
        }

        @Override // xsna.l290
        public final View a() {
            return null;
        }

        @Override // xsna.l290
        public final View b() {
            return this.a;
        }

        @Override // xsna.l290
        public final View c() {
            return null;
        }
    }

    /* compiled from: DrawTool.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<vlo, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(vlo vloVar) {
            vlo vloVar2 = vloVar;
            wio wioVar = (wio) this.receiver;
            tf10 tf10Var = wioVar.v;
            if (tf10Var != null) {
                tf10Var.b(vloVar2);
            } else {
                wioVar.c.s(new nio(vloVar2));
            }
            return s3q0.a;
        }
    }

    public wio(v3p v3pVar, List<Integer> list, jjo jjoVar) {
        DrawingView drawingView;
        this.c = v3pVar;
        this.d = list;
        this.e = jjoVar;
        PipetteView pipetteView = new PipetteView(v3pVar.x(), null, 0, 14, 0);
        pipetteView.setColorSelectionListener(this);
        pipetteView.setImportantForAccessibility(2);
        this.s = pipetteView;
        SizeSeekBarView sizeSeekBarView = new SizeSeekBarView(v3pVar.x(), null, 0, 14, 0);
        sizeSeekBarView.setListener(this);
        sizeSeekBarView.setAnchor(SizeSeekBarView.Anchor.End);
        sizeSeekBarView.setContentDescription(sizeSeekBarView.getResources().getString(R.string.brush_size_seekbar_description_accessibility_description));
        this.t = sizeSeekBarView;
        SizeCircleView sizeCircleView = new SizeCircleView(v3pVar.x(), null, 0, 14, 0);
        sizeCircleView.setRelativeSize(sizeSeekBarView.getSize());
        sizeCircleView.setMaxSize(rlo.e);
        sizeCircleView.setMinSize(rlo.d);
        sizeCircleView.setImportantForAccessibility(2);
        fyt0.h(sizeCircleView);
        this.u = sizeCircleView;
        tf10 tf10Var = (tf10) v3pVar.g(uf10.a).h();
        tf10Var = (tf10Var == null || !tf10Var.a(hjo.a)) ? null : tf10Var;
        this.v = tf10Var;
        if (tf10Var == null || (drawingView = tf10Var.e()) == null) {
            DrawingView drawingView2 = new DrawingView(v3pVar.x(), null, 6, 0);
            drawingView2.setOnViewResized(new d(1, this, wio.class, "updateParams", "updateParams(Lcom/vk/photo/editor/markup/state/DrawingState;)V", 0));
            drawingView = drawingView2;
        }
        this.w = drawingView;
        this.x = v3pVar.r();
        this.y = v3pVar.b();
        List<Integer> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new y8g.c(((Number) it.next()).intValue()));
        }
        this.z = arrayList;
        jf10 jf10Var = new jf10();
        this.A = jf10Var;
        of10 of10Var = new of10();
        this.B = of10Var;
        this.C = new ConcatAdapter(of10Var, jf10Var);
        this.D = new rlo(this.w, this.x, this.v != null);
        iio iioVar = this.e.c;
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1((iioVar != null ? iioVar : null).b, new a(2, this, wio.class, "handleState", "handleState(Lcom/vk/photo/editor/features/markup/draw/internal/mvi/model/DrawEditState;)V", 4)), g5z.a(this.c.w()));
    }

    @Override // com.vk.photo.editor.markup.view.tools.PipetteView.a
    public final void A(int i) {
        jjo jjoVar = this.e;
        iio iioVar = jjoVar.c;
        if (iioVar == null) {
            iioVar = null;
        }
        iioVar.a(new uho(i, true));
        iio iioVar2 = jjoVar.c;
        (iioVar2 != null ? iioVar2 : null).a(d02.p);
    }

    @Override // xsna.m3p, xsna.d5p
    public final void C() {
        View view = this.f;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            fyt0.i(viewGroup);
        }
        View view2 = this.g;
        ViewGroup viewGroup2 = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
        if (viewGroup2 != null) {
            fyt0.i(viewGroup2);
        }
        this.x.b(this);
    }

    @Override // com.vk.photo.editor.markup.view.tools.SizeSeekBarView.a
    public final void F() {
        fyt0.h(this.u);
    }

    @Override // xsna.m3p
    public final void G(nio nioVar) {
        nio nioVar2 = nioVar;
        if (this.v == null) {
            this.w.b(nioVar2.a);
        }
    }

    @Override // com.vk.photo.editor.markup.view.tools.SizeSeekBarView.a
    public final void a() {
        this.u.setVisibility(0);
    }

    @Override // xsna.m3p, xsna.d5p
    public final boolean a0() {
        jjo jjoVar = this.e;
        iio iioVar = jjoVar.c;
        if (iioVar == null) {
            iioVar = null;
        }
        if (!(((hio) iioVar.b.b.getValue()).i instanceof hio.a.d)) {
            this.c.c(false);
            return false;
        }
        iio iioVar2 = jjoVar.c;
        (iioVar2 != null ? iioVar2 : null).a(k9q0.c);
        return true;
    }

    @Override // xsna.nv10.a
    public final void b() {
        iio iioVar = this.e.c;
        if (iioVar == null) {
            iioVar = null;
        }
        iioVar.a(vho.b);
    }

    @Override // com.vk.photo.editor.markup.view.tools.BrushesPanel.a
    public final void c(BrushesPanel.BrushType brushType) {
        BrushType brushType2;
        iio iioVar = this.e.c;
        if (iioVar == null) {
            iioVar = null;
        }
        int i = el8.$EnumSwitchMapping$1[brushType.ordinal()];
        if (i == 1) {
            brushType2 = BrushType.Pen;
        } else if (i == 2) {
            brushType2 = BrushType.Arrow;
        } else if (i == 3) {
            brushType2 = BrushType.Marker;
        } else if (i == 4) {
            brushType2 = BrushType.Glow;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            brushType2 = BrushType.Eraser;
        }
        iioVar.a(new tho(brushType2));
    }

    @Override // xsna.d5p
    public final String e(g5p g5pVar, g5p g5pVar2) {
        return null;
    }

    @Override // xsna.m3p, xsna.d5p
    public final boolean f(ToolButton toolButton, Map map) {
        vlo a2;
        Object obj = map.get(hjo.a);
        nio nioVar = null;
        bo00 bo00Var = obj instanceof nio ? (nio) obj : null;
        if (this.v != null) {
            Object obj2 = map.get(uf10.a);
            bo00Var = obj2 instanceof bo00 ? (bo00) obj2 : null;
        }
        if (bo00Var != null && (a2 = bo00Var.a()) != null) {
            nioVar = new nio(a2);
        }
        boolean z = false;
        if (nioVar != null && !nioVar.I()) {
            z = true;
        }
        toolButton.setIndicatorActive(z);
        return true;
    }

    @Override // xsna.d5p
    public final /* bridge */ /* synthetic */ f5p getId() {
        return hjo.a;
    }

    @Override // xsna.d5p
    public final h5p getRenderer() {
        return new qv20();
    }

    @Override // com.vk.photo.editor.markup.view.tools.SizeSeekBarView.a
    public final void h(float f) {
        iio iioVar = this.e.c;
        if (iioVar == null) {
            iioVar = null;
        }
        iioVar.a(new who(f));
    }

    @Override // xsna.d5p
    public final void k() {
        vlo vloVar;
        v3p v3pVar = this.c;
        Context x = v3pVar.x();
        View inflate = LayoutInflater.from(x).inflate(R.layout.feature_draw_bottom_panel, (ViewGroup) v3pVar.getBottom(), false);
        this.m = (ViewGroup) inflate.findViewById(R.id.layout_color_container);
        this.n = (ViewGroup) inflate.findViewById(R.id.layout_brush_container);
        this.h = (ColorButton) inflate.findViewById(R.id.color_button);
        this.i = (PipetteButton) inflate.findViewById(R.id.pipette_button);
        this.l = (RecyclerView) inflate.findViewById(R.id.colors_list);
        this.j = inflate.findViewById(R.id.closed_brush_panel_button);
        this.k = (BrushesPanel) inflate.findViewById(R.id.brush_panel);
        this.o = (ToolBottomView) inflate.findViewById(R.id.tool_bottom_view);
        RecyclerView recyclerView = this.l;
        if (recyclerView != null) {
            recyclerView.setClipToOutline(true);
            recyclerView.setItemAnimator(null);
            recyclerView.setAdapter(this.C);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        }
        this.A.c = new wpg(this, 9);
        this.B.c = new kdn(this, 2);
        ColorButton colorButton = this.h;
        if (colorButton != null) {
            colorButton.setOnClickListener(new x16(this, 7));
        }
        PipetteButton pipetteButton = this.i;
        if (pipetteButton != null) {
            pipetteButton.setOnClickListener(new wcd(this, 2));
        }
        View view = this.j;
        if (view != null) {
            view.setOnClickListener(new com.vk.im.video.d(this, 5));
        }
        ToolBottomView toolBottomView = this.o;
        if (toolBottomView != null) {
            toolBottomView.setOnDoneClickListener(new trf(this, 19));
        }
        ToolBottomView toolBottomView2 = this.o;
        if (toolBottomView2 != null) {
            toolBottomView2.setOnCancelClickListener(new pce(this, 22));
        }
        BrushesPanel brushesPanel = this.k;
        if (brushesPanel != null) {
            brushesPanel.setListener(this);
        }
        v3pVar.getBottom().addView(inflate);
        this.f = inflate;
        View inflate2 = LayoutInflater.from(x).inflate(R.layout.feature_draw_top_panel, (ViewGroup) v3pVar.getTop(), false);
        this.p = inflate2.findViewById(R.id.button_draw_redo);
        this.q = inflate2.findViewById(R.id.button_draw_undo);
        View view2 = this.p;
        if (view2 != null) {
            view2.setOnClickListener(new pj8(this, 4));
        }
        View view3 = this.q;
        if (view3 != null) {
            view3.setOnClickListener(new qj8(this, 4));
        }
        v3pVar.getTop().addView(inflate2);
        this.g = inflate2;
        PhotoEditorView view4 = v3pVar.getView();
        bv0 bv0Var = new bv0(17);
        SizeSeekBarView sizeSeekBarView = this.t;
        fyt0.a(view4, sizeSeekBarView, 0, bv0Var, 2);
        FrameLayout l = v3pVar.l();
        cj4 cj4Var = new cj4(19);
        SizeCircleView sizeCircleView = this.u;
        fyt0.a(l, sizeCircleView, 0, cj4Var, 2);
        if (Build.VERSION.SDK_INT >= 29) {
            fyt0.b(sizeSeekBarView, new ire(this, 15));
        }
        fyt0.h(sizeCircleView);
        fyt0.a(v3pVar.getView(), this.s, 0, new nd1(12), 2);
        ViewGroup viewGroup = this.m;
        if (viewGroup != null) {
            qj80.a(viewGroup, new xio(viewGroup, this));
        }
        DrawingView drawingView = this.w;
        drawingView.setDrawingSessionTouchListener(this);
        this.x.a(this);
        jjo jjoVar = this.e;
        com.vk.photo.editor.ivm.d dVar = jjoVar.b;
        if (dVar == null) {
            dVar = null;
        }
        bo00 j = jjoVar.j(dVar);
        iio iioVar = jjoVar.c;
        if (iioVar == null) {
            iioVar = null;
        }
        if (j == null || (vloVar = j.a()) == null) {
            vloVar = new vlo((kif0) null, 3);
        }
        iioVar.a(new yho.a(vloVar));
        this.y.b(DrawStatEvent.c.a);
        h18 e = v3pVar.e();
        ijo ijoVar = ijo.a;
        if (!e.d(ijoVar)) {
            drawingView.setTouchesEnabled(true);
            return;
        }
        if (this.r == null) {
            r6y0 r6y0Var = new r6y0(v3pVar.x(), new ow4(1, v3pVar.t(), s6y0.class, "zoom", "zoom(F)V", 0, 4));
            r6y0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xsna.uio
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    wio wioVar = wio.this;
                    wioVar.r = null;
                    wioVar.w.setTouchesEnabled(true);
                }
            });
            r6y0Var.show();
            this.r = r6y0Var;
            v3pVar.e().c(ijoVar);
        }
    }

    @Override // xsna.g7y0
    public final n6y0 l() {
        return new n6y0(new z6y0.b(2, true), new d7y0(ojo.a, 2));
    }

    @Override // xsna.m3p, xsna.d5p
    public final boolean o() {
        return true;
    }

    @Override // xsna.z860
    public final void onFinish() {
        iio iioVar = this.e.c;
        if (iioVar == null) {
            iioVar = null;
        }
        iioVar.a(new xho(this.w.d()));
    }

    @Override // xsna.d5p
    public final void p() {
        DrawingView drawingView = this.w;
        drawingView.setEnabled(false);
        View view = this.f;
        v3p v3pVar = this.c;
        v3pVar.getBottom().removeView(view);
        View view2 = this.g;
        if (view2 != null) {
            v3pVar.getTop().removeView(view2);
        }
        v3pVar.l().removeView(this.u);
        v3pVar.getView().removeView(this.t);
        v3pVar.getView().removeView(this.s);
        this.g = null;
        this.f = null;
        this.h = null;
        this.i = null;
        this.l = null;
        this.j = null;
        this.k = null;
        this.o = null;
        drawingView.c(false);
        drawingView.setTouchesEnabled(false);
        drawingView.setDrawingSessionTouchListener(null);
    }

    @Override // xsna.d5p
    public final String r(g5p g5pVar, g5p g5pVar2) {
        return null;
    }

    @Override // xsna.d5p
    public final ToolButton s(Context context) {
        ToolButton toolButton = new ToolButton(context, null, R.attr.editorToolButtonStyle_Draw, R.style.EditorToolButton_Draw, 2);
        toolButton.setImportantForAccessibility(1);
        toolButton.setContentDescription(toolButton.getResources().getString(R.string.editor_tool_button_draw));
        return toolButton;
    }

    @Override // xsna.d5p
    public final Object u(i4p i4pVar, spj<? super nio> spjVar) {
        return new nio(0);
    }

    @Override // com.vk.photo.editor.markup.view.tools.PipetteView.a
    public final void v(int i) {
        iio iioVar = this.e.c;
        if (iioVar == null) {
            iioVar = null;
        }
        iioVar.a(new uho(i, true));
    }

    @Override // xsna.p290
    public final l290 x(Context context) {
        return new c(this);
    }

    @Override // xsna.z860
    public final void d(MotionEvent motionEvent) {
    }
}
