package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.qrcode;

import android.content.Context;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.fintechsdk.core.ui.impl.api.qrcode.QrCodeErrorCorrectionLevel;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.avu0;
import defpackage.b6g0;
import defpackage.cvu0;
import defpackage.e6g0;
import defpackage.evu0;
import defpackage.f6g0;
import defpackage.g6g0;
import defpackage.h6g0;
import defpackage.qnf;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tg5;
import defpackage.y5g0;
import defpackage.y6i0;
import defpackage.ycc;
import defpackage.yg5;
import defpackage.zg5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 @2\u00020\u0001:\u0002;AB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0016\u0010\rJ\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001f\u0010\u0018J/\u0010%\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020 H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b(\u0010)R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00101R\u0016\u0010=\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010>¨\u0006B"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/qrcode/QrCodeView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Ly5g0;", "props", "<init>", "(Landroid/content/Context;Ly5g0;)V", "currentProps", "Lyg5;", "resolver", "Lzy11;", "resolveAll", "(Ly5g0;Lyg5;)V", "", "raw", "", "resolveRatio", "(Ljava/lang/String;Lyg5;)F", "", "resolveDp", "(Ljava/lang/String;Lyg5;)D", "subscribeToExpressions", "disposeAll", "()V", "onExpressionsChanged", "generateQrCode", "", "Lqnf;", "toCutoutsPx", "()Ljava/util/List;", "onDetachedFromWindow", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "expressionResolver", "applyExpressionResolver", "(Lyg5;)V", "Ly5g0;", "Lf6g0;", "renderer", "Lf6g0;", "", "Ltg5;", "disposables", "Ljava/util/List;", "currentResolver", "Lyg5;", "resolvedValue", "Ljava/lang/String;", "resolvedColor", "Ljava/lang/Integer;", "Lcom/yandex/fintechsdk/core/ui/impl/api/qrcode/QrCodeErrorCorrectionLevel;", "resolvedErrorCorrectionLevel", "Lcom/yandex/fintechsdk/core/ui/impl/api/qrcode/QrCodeErrorCorrectionLevel;", "Lh6g0;", "resolvedCutouts", "resolvedFinderRatio", "F", "resolvedModuleRatio", "Companion", "g6g0", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class QrCodeView extends AppCompatImageView {
    private static final g6g0 Companion = new g6g0();

    @Deprecated
    public static final float DEFAULT_FINDER_RATIO = 0.6f;

    @Deprecated
    public static final float DEFAULT_MODULE_RATIO = 1.0f;

    @Deprecated
    public static final int DEFAULT_SIZE_DP = 200;
    private yg5 currentResolver;
    private final List<tg5> disposables;
    private final y5g0 props;
    private final f6g0 renderer;
    private Integer resolvedColor;
    private List<h6g0> resolvedCutouts;
    private QrCodeErrorCorrectionLevel resolvedErrorCorrectionLevel;
    private float resolvedFinderRatio;
    private float resolvedModuleRatio;
    private String resolvedValue;

    public QrCodeView(Context context, y5g0 y5g0Var) {
        super(context);
        this.props = y5g0Var;
        this.renderer = new f6g0();
        this.disposables = new ArrayList();
        this.resolvedErrorCorrectionLevel = QrCodeErrorCorrectionLevel.MEDIUM;
        this.resolvedCutouts = EmptyList.a;
        this.resolvedFinderRatio = 0.6f;
        this.resolvedModuleRatio = 1.0f;
        setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    private final void disposeAll() {
        Iterator<T> it = this.disposables.iterator();
        while (it.hasNext()) {
            ((zg5) ((tg5) it.next())).a.close();
        }
        this.disposables.clear();
    }

    private final void generateQrCode() {
        Integer num;
        String str = this.resolvedValue;
        if (str != null) {
            String str2 = str.length() > 0 ? str : null;
            if (str2 == null || (num = this.resolvedColor) == null) {
                return;
            }
            int intValue = num.intValue();
            int min = Math.min(getWidth(), getHeight());
            Integer valueOf = min > 0 ? Integer.valueOf(min) : null;
            int intValue2 = valueOf != null ? valueOf.intValue() : (int) (200.0f * getResources().getDisplayMetrics().density);
            try {
                f6g0 f6g0Var = this.renderer;
                e6g0 e6g0Var = new e6g0(intValue, toCutoutsPx(), this.resolvedErrorCorrectionLevel, this.resolvedFinderRatio, this.resolvedModuleRatio, intValue2, str2);
                f6g0Var.getClass();
                setImageBitmap(f6g0.b(e6g0Var));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExpressionsChanged() {
        y5g0 y5g0Var = this.props;
        if (y5g0Var == null) {
            return;
        }
        resolveAll(y5g0Var, this.currentResolver);
        generateQrCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void resolveAll(y5g0 currentProps, yg5 resolver) {
        String str;
        Integer valueOf;
        String str2;
        Object obj = null;
        if (resolver != null && (str = resolver.resolveString(currentProps.b)) != null) {
            if (str.length() <= 0) {
                str = null;
            }
        }
        str = currentProps.b;
        this.resolvedValue = str;
        if (resolver == null || (valueOf = resolver.resolveColor(currentProps.a)) == null) {
            valueOf = Integer.valueOf(ModalContentViewContainer.BASE_SHADOW_COLOR);
        }
        this.resolvedColor = valueOf;
        if (resolver == null || (str2 = resolver.resolveString(currentProps.d)) == null) {
            str2 = currentProps.d;
        }
        QrCodeErrorCorrectionLevel.Companion.getClass();
        Iterator<E> it = QrCodeErrorCorrectionLevel.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (cvu0.t(((QrCodeErrorCorrectionLevel) next).getKey(), str2, true)) {
                obj = next;
                break;
            }
        }
        QrCodeErrorCorrectionLevel qrCodeErrorCorrectionLevel = (QrCodeErrorCorrectionLevel) obj;
        if (qrCodeErrorCorrectionLevel == null) {
            qrCodeErrorCorrectionLevel = QrCodeErrorCorrectionLevel.MEDIUM;
        }
        this.resolvedErrorCorrectionLevel = qrCodeErrorCorrectionLevel;
        this.resolvedFinderRatio = resolveRatio(currentProps.e.a(), resolver);
        this.resolvedModuleRatio = resolveRatio(currentProps.f.a(), resolver);
        List<b6g0> list = currentProps.c;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (b6g0 b6g0Var : list) {
            arrayList.add(new h6g0(resolveDp(b6g0Var.e.a(), resolver), resolveDp(b6g0Var.a.a(), resolver), resolveDp(b6g0Var.b.a(), resolver), resolveDp(b6g0Var.c.a(), resolver), resolveDp(b6g0Var.d.a(), resolver)));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            h6g0 h6g0Var = (h6g0) next2;
            if (h6g0Var.c > 0.0d && h6g0Var.b > 0.0d) {
                arrayList2.add(next2);
            }
        }
        this.resolvedCutouts = arrayList2;
    }

    private final double resolveDp(String raw, yg5 resolver) {
        Double resolveDouble;
        if (!evu0.y(raw, "@{", false)) {
            Double i = avu0.i(raw);
            if (i != null) {
                return i.doubleValue();
            }
            return 0.0d;
        }
        if (resolver != null && (resolveDouble = resolver.resolveDouble(raw)) != null) {
            return resolveDouble.doubleValue();
        }
        Double i2 = avu0.i(raw);
        if (i2 != null) {
            return i2.doubleValue();
        }
        return 0.0d;
    }

    private final float resolveRatio(String raw, yg5 resolver) {
        return (float) y6i0.b(resolveDp(raw, resolver), 0.0d, 1.0d);
    }

    private final void subscribeToExpressions(y5g0 currentProps, yg5 resolver) {
        disposeAll();
        if (resolver == null) {
            return;
        }
        List<b6g0> list = currentProps.c;
        ArrayList arrayList = new ArrayList();
        for (b6g0 b6g0Var : list) {
            ycc.r(scc.g(b6g0Var.c.a(), b6g0Var.d.a(), b6g0Var.b.a(), b6g0Var.a.a(), b6g0Var.e.a()), arrayList);
        }
        Iterator it = a.I(a.m0(arrayList, scc.g(currentProps.b, currentProps.a, currentProps.d, currentProps.e.a(), currentProps.f.a()))).iterator();
        while (it.hasNext()) {
            QrCodeView qrCodeView = this;
            tg5 subscribeToExpression = resolver.subscribeToExpression((String) it.next(), new QrCodeView$subscribeToExpressions$1$1(0, qrCodeView, QrCodeView.class, "onExpressionsChanged", "onExpressionsChanged()V", 0));
            if (subscribeToExpression != null) {
                qrCodeView.disposables.add(subscribeToExpression);
            }
            this = qrCodeView;
        }
    }

    private final List<qnf> toCutoutsPx() {
        float f = getResources().getDisplayMetrics().density;
        List<h6g0> list = this.resolvedCutouts;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (h6g0 h6g0Var : list) {
            double d = f;
            arrayList.add(new qnf((float) (h6g0Var.a * d), (float) (h6g0Var.b * d), (float) (h6g0Var.d * d), (float) (h6g0Var.e * d), (float) (h6g0Var.c * d)));
        }
        return arrayList;
    }

    public final void applyExpressionResolver(yg5 expressionResolver) {
        y5g0 y5g0Var = this.props;
        if (y5g0Var == null) {
            return;
        }
        this.currentResolver = expressionResolver;
        resolveAll(y5g0Var, expressionResolver);
        generateQrCode();
        subscribeToExpressions(y5g0Var, expressionResolver);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        disposeAll();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (w <= 0 || h <= 0) {
            return;
        }
        generateQrCode();
    }
}
