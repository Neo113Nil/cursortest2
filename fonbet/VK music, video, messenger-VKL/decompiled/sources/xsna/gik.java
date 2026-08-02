package xsna;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.features.crop.models.params.CropAspectRatioFormat;
import com.vk.photo.editor.features.crop.models.stat.CropStatEvent;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.photo.editor.views.RotatingView;
import com.vk.photo.editor.views.ToolBottomView;
import com.vk.photo.editor.views.ToolButton;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.d5p;
import xsna.oik;
import xsna.qbk;

/* compiled from: CropTool.kt */
/* loaded from: classes4.dex */
public final class gik extends m3p<zhk> implements bkp0, bok {
    public final v3p c;
    public final oik d;
    public final CropAspectRatioFormat e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public View i;
    public final c5p j;
    public View k;
    public View l;
    public efk m;
    public uik n;
    public RecyclerView o;
    public final dhk p = new dhk();
    public final bpn0 q = new bpn0(new m2g(this, 10));
    public final pfp r = new pfp(null);

    /* compiled from: CropTool.kt */
    public static final class a implements d5p.a<zhk> {
        public final CropAspectRatioFormat a;
        public final Set<ghk> b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public a(int i) {
            CropAspectRatioFormat cropAspectRatioFormat = CropAspectRatioFormat.CropFree;
            Set<ghk> set = hhk.a;
            this.a = cropAspectRatioFormat;
            this.b = set;
            this.c = true;
            this.d = true;
            this.e = true;
        }

        @Override // xsna.d5p.a
        public final d5p<zhk> a(v3p v3pVar) {
            vyt0 vyt0Var = new vyt0(v3pVar.getViewModelStore(), new pik(v3pVar.d(), this.a, this.b), qbk.a.b);
            rfc a = fpf0.a(oik.class);
            String h = a.h();
            if (h == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            return new gik(v3pVar, g5z.a(v3pVar.w()), (oik) vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h), a), this.a, this.c, this.d, this.e);
        }
    }

    public gik(v3p v3pVar, androidx.lifecycle.j jVar, oik oikVar, CropAspectRatioFormat cropAspectRatioFormat, boolean z, boolean z2, boolean z3) {
        this.c = v3pVar;
        this.d = oikVar;
        this.e = cropAspectRatioFormat;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.j = v3pVar.b();
        oik.a aVar = oikVar.d;
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1((aVar == null ? null : aVar).f, new eik(this, null)), jVar);
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(v3pVar.d().d, new fik(this, null)), jVar);
    }

    public final cc0 H(boolean z) {
        jfk jfkVar;
        CropAspectRatioFormat cropAspectRatioFormat;
        uik uikVar = this.n;
        if (uikVar == null || (jfkVar = uikVar.o) == null) {
            return null;
        }
        hfk hfkVar = jfkVar.c;
        v3p v3pVar = this.c;
        tnt tntVar = new tnt(v3pVar.j().getMeasuredWidth(), v3pVar.j().getMeasuredHeight());
        tntVar.d(jfkVar.j);
        cfk cfkVar = new cfk(hfkVar.getX0(), hfkVar.getX1(), hfkVar.getY0(), hfkVar.getY1(), hfkVar.getCropRect(), hfkVar.getCropAspectRatio(), hfkVar.getCenterX(), hfkVar.getCenterY(), hfkVar.getCropWidth(), hfkVar.getCropHeight(), hfkVar.getCropScale(), hfkVar.getFullWidth(), hfkVar.getFullHeight());
        uik uikVar2 = this.n;
        if (uikVar2 == null || (cropAspectRatioFormat = uikVar2.k) == null) {
            cropAspectRatioFormat = CropAspectRatioFormat.CropFree;
        }
        return new cc0(tntVar, cfkVar, cropAspectRatioFormat, z);
    }

    @Override // xsna.m3p
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void G(zhk zhkVar) {
        tnt tntVar;
        ffk content;
        rhk mirror;
        RotatingView rotatingView;
        tnt tntVar2;
        if (zhkVar instanceof pfp) {
            View j = this.c.j();
            r3h r3hVar = new r3h(this, 5);
            ViewTreeObserver viewTreeObserver = j.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnPreDrawListener(new gyt0(j, r3hVar, false));
            }
        } else {
            if (!(zhkVar instanceof cc0)) {
                throw new NoWhenBranchMatchedException();
            }
            uik uikVar = this.n;
            jfk jfkVar = uikVar != null ? uikVar.o : null;
            Float valueOf = (jfkVar == null || (tntVar2 = jfkVar.j) == null) ? null : Float.valueOf(tntVar2.a);
            cc0 cc0Var = (cc0) zhkVar;
            CropAspectRatioFormat cropAspectRatioFormat = cc0Var.c;
            tnt tntVar3 = cc0Var.a;
            if (!epx.d(valueOf, tntVar3.a) || jfkVar.j.b != tntVar3.b) {
                J(tntVar3, cropAspectRatioFormat);
            }
            uik uikVar2 = this.n;
            hfk hfkVar = uikVar2 != null ? uikVar2.e : null;
            if (hfkVar != null) {
                cfk cfkVar = cc0Var.b;
                hfkVar.O = cfkVar.b;
                hfkVar.P = cfkVar.d;
                hfkVar.Q = cfkVar.c;
                hfkVar.R = cfkVar.e;
                hfkVar.l();
                hfkVar.invalidate();
            }
            if (hfkVar != null && (rotatingView = hfkVar.getRotatingView()) != null) {
                rotatingView.b(tntVar3.h);
            }
            efk efkVar = this.m;
            if (efkVar != null && (content = efkVar.getContent()) != null && (mirror = content.getMirror()) != null) {
                mirror.setScaleX(tntVar3.c ? -1.0f : 1.0f);
            }
            efk efkVar2 = this.m;
            if (efkVar2 != null) {
                efkVar2.setClippingEnabled(true);
            }
            if (hfkVar != null) {
                hfkVar.setVisibility(0);
            }
            if (jfkVar != null && (tntVar = jfkVar.j) != null) {
                tntVar.d(tntVar3);
            }
            oik.a aVar = this.d.d;
            (aVar != null ? aVar : null).a(cropAspectRatioFormat, true);
            if (jfkVar != null) {
                jfkVar.i();
            }
            new Handler(Looper.getMainLooper()).post(new sm9(this, 5));
        }
        L(!zhkVar.I());
    }

    public final void J(tnt tntVar, CropAspectRatioFormat cropAspectRatioFormat) {
        tnt tntVar2;
        oik oikVar = this.d;
        oik.a aVar = oikVar.d;
        Float f = null;
        if (aVar == null) {
            aVar = null;
        }
        aVar.e.setValue(aVar.d);
        uik uikVar = this.n;
        if (uikVar != null) {
            uikVar.a();
        }
        uik uikVar2 = this.n;
        if (uikVar2 != null) {
            kik kikVar = uikVar2.a;
            efk efkVar = uikVar2.b;
            hfk hfkVar = uikVar2.e;
            jfk jfkVar = new jfk(efkVar, hfkVar, tntVar.a, tntVar.b, uikVar2.d);
            sot sotVar = uikVar2.f;
            if (sotVar == null) {
                uikVar2.f = new sot(kikVar.getContext(), jfkVar, new r41(uikVar2, 21));
            } else {
                sotVar.b = jfkVar;
            }
            sot sotVar2 = uikVar2.f;
            uikVar2.f = sotVar2;
            kikVar.setOnTouchListener(sotVar2);
            hfkVar.setOnCropChangeListener(uikVar2.p);
            jfk jfkVar2 = uikVar2.o;
            if ((jfkVar2 != null ? jfkVar2.j : null) != null) {
                uikVar2.k = cropAspectRatioFormat;
                if (cropAspectRatioFormat != CropAspectRatioFormat.CropFree) {
                    hfkVar.setForcedAspectRatio(cropAspectRatioFormat.h());
                } else {
                    hfkVar.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
            }
            tnt tntVar3 = jfkVar.j;
            hfkVar.g(tntVar3.e);
            hfkVar.getRotatingView().b(tntVar.h);
            efkVar.setCropArea(hfkVar);
            efkVar.getContent().getMirror().setScaleX(1.0f);
            tntVar3.d(tntVar);
            uikVar2.o = jfkVar;
            jfkVar.g();
            jfk jfkVar3 = uikVar2.o;
            if (jfkVar3 != null) {
                jfkVar3.i();
            }
            jfk jfkVar4 = uikVar2.o;
            if (jfkVar4 != null) {
                jfkVar4.e();
            }
            jfk jfkVar5 = uikVar2.o;
            if (jfkVar5 != null) {
                jfkVar5.g();
            }
            jfk jfkVar6 = uikVar2.o;
            if (jfkVar6 != null && (tntVar2 = jfkVar6.j) != null) {
                f = Float.valueOf(tntVar2.e);
            }
            if (f != null) {
                hfkVar.g(f.floatValue());
            }
            RotatingView rotatingView = hfkVar.getRotatingView();
            rotatingView.p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            rotatingView.q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            rotatingView.o = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            rotatingView.invalidate();
            rotatingView.a();
            efkVar.getContent().getMirror().setScaleX(1.0f);
        }
        oikVar.c = H(true);
        L(false);
    }

    public final void K() {
        g5p g5pVar = ((EditorState) this.c.d().b.b.getValue()).b.get(jik.a);
        zhk zhkVar = g5pVar instanceof zhk ? (zhk) g5pVar : null;
        if (zhkVar != null) {
            G(zhkVar);
        }
    }

    public final void L(boolean z) {
        View view = this.l;
        if (view != null) {
            view.setEnabled(z);
        }
        View view2 = this.l;
        if (view2 != null) {
            view2.setAlpha(z ? 1.0f : 0.4f);
        }
    }

    @Override // xsna.m3p, xsna.d5p
    public final boolean a0() {
        K();
        return false;
    }

    @Override // xsna.d5p
    public final String e(g5p g5pVar, g5p g5pVar2) {
        if (!(g5pVar == null ? true : g5pVar instanceof zhk)) {
            return null;
        }
        if (g5pVar2 != null ? g5pVar2 instanceof zhk : true) {
            return this.c.x().getString(R.string.editor_history_crop_undo);
        }
        return null;
    }

    @Override // xsna.bkp0
    public final g020 g(g5p g5pVar, ct10 ct10Var) {
        if (!(g5pVar instanceof cc0)) {
            return new g020(false, 15);
        }
        cc0 cc0Var = (cc0) g5pVar;
        tnt tntVar = cc0Var.a;
        cfk cfkVar = cc0Var.b;
        zek.b(cfkVar, tntVar);
        Matrix matrix = zek.g;
        matrix.reset();
        float[] fArr = zek.a;
        matrix.setPolyToPoly(fArr, 0, zek.b, 0, 4);
        new Matrix(matrix);
        hif0 C = edi.C(fArr);
        edi.D(C);
        g020 g020Var = new g020(tntVar.c, 11);
        float[] a2 = ct10Var.a.a();
        float[] a3 = C.a();
        Matrix matrix2 = g020Var.a;
        matrix2.setPolyToPoly(a2, 0, a3, 0, 4);
        float f = tntVar.c ? -1.0f : 1.0f;
        float f2 = tntVar.a / 2.0f;
        float f3 = tntVar.b / 2.0f;
        matrix2.preScale(f, 1.0f, f2, f3);
        matrix2.postScale(f, 1.0f, f2, f3);
        g020Var.d.set(cfkVar.f);
        g020Var.b.set(tntVar.o);
        return g020Var;
    }

    @Override // xsna.d5p
    public final /* bridge */ /* synthetic */ f5p getId() {
        return jik.a;
    }

    @Override // xsna.d5p
    public final h5p<zhk> getRenderer() {
        return new d370(16);
    }

    @Override // xsna.m3p, xsna.d5p
    public final e5p i() {
        return (hik) this.q.getValue();
    }

    @Override // xsna.d5p
    public final void k() {
        v3p v3pVar = this.c;
        v3pVar.b().b(CropStatEvent.g.a);
        Context context = v3pVar.getBottom().getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.feature_crop_bottom_panel, (ViewGroup) v3pVar.getBottom(), false);
        ToolBottomView toolBottomView = (ToolBottomView) inflate.findViewById(R.id.tool_bottom_view);
        toolBottomView.setOnCancelClickListener(new com.vk.movika.sdk.base.presenter.b(this, 28));
        toolBottomView.setOnDoneClickListener(new xrj(this, 1));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view_crop_formats);
        if (this.f) {
            this.o = recyclerView;
            oik.a aVar = this.d.d;
            if (aVar == null) {
                aVar = null;
            }
            ArrayList arrayList = ((syp0) aVar.f.b.getValue()).a.a;
            dhk dhkVar = this.p;
            dhkVar.submitList(arrayList);
            dhkVar.c = new rlh(this, 3);
            recyclerView.setAdapter(dhkVar);
        } else {
            ViewGroup viewGroup = inflate instanceof ViewGroup ? (ViewGroup) inflate : null;
            if (viewGroup != null) {
                viewGroup.removeView(recyclerView);
            }
        }
        v3pVar.getBottom().addView(inflate);
        this.i = inflate;
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.feature_crop_top_panel, (ViewGroup) v3pVar.getTop(), false);
        v3pVar.getTop().addView(inflate2);
        ViewGroup viewGroup2 = (ViewGroup) inflate2.findViewById(R.id.buttons_container);
        if (this.h) {
            inflate2.findViewById(R.id.button_crop_rotate).setOnClickListener(new f9(this, 6));
        } else {
            viewGroup2.removeView(inflate2.findViewById(R.id.container_button_crop_rotate));
        }
        if (this.g) {
            inflate2.findViewById(R.id.button_crop_mirror).setOnClickListener(new p01(this, 2));
        } else {
            viewGroup2.removeView(inflate2.findViewById(R.id.container_button_crop_mirror));
        }
        View findViewById = inflate2.findViewById(R.id.button_crop_reset);
        this.l = findViewById;
        findViewById.setOnClickListener(new q01(this, 3));
        this.k = inflate2;
        efk efkVar = this.m;
        if (efkVar != null) {
            efkVar.setClippingEnabled(true);
        }
        uik uikVar = this.n;
        hfk hfkVar = uikVar != null ? uikVar.e : null;
        if (hfkVar != null) {
            hfkVar.setVisibility(0);
        }
        K();
        uik uikVar2 = this.n;
        if (uikVar2 != null) {
            uikVar2.q.removeMessages(0);
            jfk jfkVar = uikVar2.o;
            if (jfkVar != null) {
                jfkVar.e();
            }
            jfk jfkVar2 = uikVar2.o;
            if (jfkVar2 != null) {
                jfkVar2.h(false, new se0(17));
            }
        }
        uik uikVar3 = this.n;
        if (uikVar3 != null) {
            uikVar3.c(true, new de4(13));
        }
    }

    @Override // xsna.m3p, xsna.d5p
    public final boolean o() {
        return true;
    }

    @Override // xsna.d5p
    public final void p() {
        uik uikVar = this.n;
        if (uikVar != null) {
            uikVar.c(false, new de4(13));
        }
        View view = this.i;
        v3p v3pVar = this.c;
        if (view != null) {
            v3pVar.getBottom().removeView(view);
        }
        View view2 = this.k;
        if (view2 != null) {
            v3pVar.getTop().removeView(view2);
        }
    }

    @Override // xsna.m3p, xsna.d5p
    public final void q() {
        v3p v3pVar = this.c;
        J(new tnt(v3pVar.j().getMeasuredWidth(), v3pVar.j().getMeasuredHeight()), this.e);
        uik uikVar = this.n;
        if (uikVar != null) {
            uikVar.c(false, new de4(13));
        }
    }

    @Override // xsna.d5p
    public final String r(g5p g5pVar, g5p g5pVar2) {
        if (!(g5pVar == null ? true : g5pVar instanceof zhk)) {
            return null;
        }
        if (g5pVar2 != null ? g5pVar2 instanceof zhk : true) {
            return this.c.x().getString(R.string.editor_history_crop_redo);
        }
        return null;
    }

    @Override // xsna.d5p
    public final ToolButton s(Context context) {
        ToolButton toolButton = new ToolButton(context, null, R.attr.editorToolButtonStyle_Crop, R.style.EditorToolButton_Crop, 2);
        toolButton.setImportantForAccessibility(1);
        toolButton.setContentDescription(toolButton.getResources().getString(R.string.editor_tool_button_crop));
        return toolButton;
    }

    @Override // xsna.bkp0
    public final uik t(Context context, View view) {
        efk efkVar = new efk(context);
        efkVar.b.getMirror().addView(view, 0);
        this.m = efkVar;
        kik kikVar = new kik(context, null, 0);
        kikVar.setClipChildren(false);
        yhk yhkVar = new yhk(context);
        new c290(yhkVar.getOverlay$android_release());
        uik uikVar = new uik(kikVar, efkVar, yhkVar, this.j);
        this.n = uikVar;
        uikVar.j = new sf2(this);
        return uikVar;
    }

    @Override // xsna.d5p
    public final Object u(i4p i4pVar, spj<? super zhk> spjVar) {
        pfp pfpVar = this.r;
        if (epx.f(pfpVar.a, i4pVar != null ? i4pVar.b : null)) {
            return pfpVar;
        }
        return new pfp(i4pVar != null ? i4pVar.b : null);
    }
}
