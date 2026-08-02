package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.media.Image;
import android.telephony.SubscriptionManager;
import android.view.View;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.u;
import com.google.common.collect.z;
import com.yandex.mapkit.map.Callback;
import com.yandex.runtime.FailedAssertionListener;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.common.domain.entities.WidgetEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.ext.ViewState;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.domain.Me2MeResultPageEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.Me2MeDebitResultState$WidgetState;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.Me2MeDebitResultState$WidgetSubState;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.Me2MeDebitResultEntity$Status;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.l;
import io.appmetrica.analytics.PulseConfig;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.L1;
import io.appmetrica.analytics.impl.Mo;
import io.appmetrica.analytics.impl.O1;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes10.dex */
public final /* synthetic */ class ak00 implements FailedAssertionListener, Callback, ev31, xb10, ed10, vls, ww01, m0x0, FunctionWithThrowable, zbv, thw0, u5v, aee0, go40, th50, L1, r131, rdj {
    public final /* synthetic */ int a;

    public /* synthetic */ ak00(int i) {
        this.a = i;
    }

    public static /* synthetic */ void e(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    @Override // io.appmetrica.analytics.impl.L1
    public void a(PulseConfig pulseConfig) {
        switch (this.a) {
            case 25:
                O1.b(pulseConfig);
                break;
            default:
                O1.a(pulseConfig);
                break;
        }
    }

    @Override // defpackage.vls, defpackage.ww01, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public Object mo489apply(Object obj) {
        List a;
        switch (this.a) {
            case 6:
                z zVar = ur10.b;
                return Long.valueOf(((tdf) obj).b);
            case 7:
                z zVar2 = ur10.b;
                return Long.valueOf(((tdf) obj).c);
            case 8:
                return ImmutableList.l(u.b(((xe10) obj).getTrackGroups().b, new s2u0(17)));
            case 9:
                pz10 pz10Var = (pz10) obj;
                pz10Var.getClass();
                am2 am2Var = uuf0.a;
                am2Var.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    am2Var.g(pz10Var, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 10:
            default:
                uzz0 uzz0Var = (uzz0) obj;
                int i = wb30.G;
                return uzz0Var;
            case 11:
                a = Mo.a((SubscriptionManager) obj);
                return a;
        }
    }

    @Override // defpackage.ed10
    public int b(Object obj) {
        String str = ((sb10) obj).a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (tw21.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // defpackage.aee0
    public oeq0 c(int i) {
        return leq0.a;
    }

    @Override // defpackage.go40
    public void d(ValueAnimator valueAnimator, View view) {
        switch (this.a) {
            case 18:
                MultiViewUpdateListener.setTranslationX(valueAnimator, view);
                break;
            case 19:
                MultiViewUpdateListener.setScale(valueAnimator, view);
                break;
            case 20:
                MultiViewUpdateListener.setTranslationY(valueAnimator, view);
                break;
            default:
                MultiViewUpdateListener.setAlpha(valueAnimator, view);
                break;
        }
    }

    @Override // defpackage.u5v
    public boolean f(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    @Override // defpackage.zbv
    public rbv g(Context context, int i, int i2) {
        return new nbv(myg0.ybsdk_ic_mobile_provider_placeholder, null);
    }

    @Override // defpackage.thw0
    public Object get() {
        switch (this.a) {
            case 13:
                return q5z.z();
            default:
                return q5z.A();
        }
    }

    @Override // defpackage.xb10
    public List getDecoderInfos(String str, boolean z, boolean z2) {
        return fd10.e(str, z, z2);
    }

    @Override // defpackage.rdj
    public void k(AlertDialog alertDialog) {
        alertDialog.setPositiveButton(kyh0.common_got_it);
    }

    @Override // defpackage.r131
    public boolean l(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    @Override // defpackage.th50
    public void onComplete() {
    }

    @Override // com.yandex.runtime.FailedAssertionListener
    public void onFailedAssertion(String str, int i, String str2, String str3, List list) {
        gv00 gv00Var = gv00.a;
        b.i(new Pair("file", str), new Pair("line", String.valueOf(i)), new Pair("condition", str2), new Pair(Constants.KEY_MESSAGE, str3), new Pair("stack", list.toString()));
        if (gv00.b) {
            gv00.c.contains("failed_assertion");
        }
    }

    @Override // com.yandex.mapkit.map.Callback
    public void onTaskFinished() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [com.ybsdk.core.utils.ColorModel] */
    /* JADX WARN: Type inference failed for: r3v18, types: [com.ybsdk.core.utils.ColorModel] */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.ybsdk.core.utils.ColorModel] */
    @Override // defpackage.ev31
    public Object q(Object obj) {
        Pair pair;
        rbv nbvVar;
        qc70 qc70Var;
        YbButtonView.a aVar;
        s451 s451Var;
        WidgetEntity.Image image;
        WidgetEntity.Image image2;
        switch (this.a) {
            case 3:
                k910 k910Var = (k910) obj;
                Me2MeResultPageEntity me2MeResultPageEntity = k910Var.a;
                Me2MeDebitResultEntity$Status me2MeDebitResultEntity$Status = k910Var.b;
                int[] iArr = r910.a;
                int i = iArr[me2MeDebitResultEntity$Status.ordinal()];
                if (i == 1 || i == 2) {
                    pair = new Pair(me2MeResultPageEntity.getTitle(), null);
                } else {
                    if (i != 3 && i != 4) {
                        w511.b();
                        return null;
                    }
                    pair = new Pair(null, me2MeResultPageEntity.getTitle());
                }
                String str = (String) pair.getFirst();
                String str2 = (String) pair.getSecond();
                com.ybsdk.core.utils.text.b bVar = Text.Companion;
                String title = me2MeResultPageEntity.getHeader().getTitle();
                bVar.getClass();
                Text.Constant constant = new Text.Constant(title);
                String description = me2MeResultPageEntity.getHeader().getDescription();
                Text.Constant constant2 = description != null ? new Text.Constant(description) : null;
                ThemedImageUrlEntity image3 = me2MeResultPageEntity.getHeader().getImage();
                stz0 stz0Var = new stz0(constant, constant2, null, image3 != null ? job1.f(image3, new ws00(17)) : null, null, null, false, null, null, null, null, null, 32756);
                ThemedImageUrlEntity themedImage = me2MeResultPageEntity.getYbInfo().getThemedImage();
                if (themedImage == null || (nbvVar = job1.f(themedImage, new ws00(18))) == null) {
                    nbvVar = new nbv(txg0.ybsdk_ic_yb_placeholder, null);
                }
                rbv rbvVar = nbvVar;
                int i2 = iArr[me2MeDebitResultEntity$Status.ordinal()];
                if (i2 == 1) {
                    qc70Var = pc70.a;
                } else if (i2 == 2) {
                    qc70Var = new l(OperationProgressView.StatusIcon.SUCCESS);
                } else if (i2 == 3) {
                    qc70Var = new l(OperationProgressView.StatusIcon.ERROR);
                } else {
                    if (i2 != 4) {
                        w511.b();
                        return null;
                    }
                    qc70Var = new l(OperationProgressView.StatusIcon.TIMEOUT);
                }
                qc70 qc70Var2 = qc70Var;
                String description2 = me2MeResultPageEntity.getDescription();
                int i3 = iArr[me2MeDebitResultEntity$Status.ordinal()];
                if (i3 == 1) {
                    aVar = null;
                } else {
                    if (i3 != 2 && i3 != 3 && i3 != 4) {
                        w511.b();
                        return null;
                    }
                    aVar = new YbButtonView.a(new Text.Resource(k910Var.f != null ? dzh0.ybsdk_common_support_chat_button_title : dzh0.ybsdk_transfer_button_agree), null, null, null, null, null, null, false, false, null, 4094);
                }
                g910 g910Var = k910Var.c;
                if (g910Var != null) {
                    boolean z = k910Var.d == Me2MeDebitResultState$WidgetState.ON;
                    Me2MeDebitResultState$WidgetSubState me2MeDebitResultState$WidgetSubState = k910Var.e;
                    boolean z2 = me2MeDebitResultState$WidgetSubState == Me2MeDebitResultState$WidgetSubState.PROGRESS;
                    boolean z3 = me2MeDebitResultState$WidgetSubState != Me2MeDebitResultState$WidgetSubState.DISABLED;
                    int i4 = ung0.ybColor_fill_color5_400;
                    int i5 = ung0.ybColor_other_separator;
                    ColorModel.Attr attr = new ColorModel.Attr(ung0.ybColor_fill_color5_600);
                    ColorModel.Attr attr2 = new ColorModel.Attr(ung0.ybColor_fill_color5_100);
                    ColorModel.Attr attr3 = new ColorModel.Attr(i4);
                    ViewState viewState = ViewState.CHECKED;
                    ViewState viewState2 = ViewState.ENABLED;
                    vbb vbbVar = new vbb(attr3, new ViewState[]{viewState, viewState2});
                    ColorModel.Attr attr4 = new ColorModel.Attr(i5);
                    ViewState viewState3 = ViewState.DISABLED;
                    p1b p1bVar = new p1b(new vbb[]{vbbVar, new vbb(attr4, new ViewState[]{viewState, viewState3}), new vbb(new ColorModel.Attr(i5), new ViewState[]{ViewState.UNCHECKED, viewState2}), new vbb(new ColorModel.Attr(i5), new ViewState[]{viewState3})});
                    Text.Constant constant3 = new Text.Constant(g910Var.a);
                    Text.Constant constant4 = new Text.Constant(g910Var.b);
                    Themes themes = g910Var.c;
                    WidgetEntity.Theme theme = (WidgetEntity.Theme) themes.getLight();
                    String backgroundColor = theme != null ? theme.getBackgroundColor() : null;
                    WidgetEntity.Theme theme2 = (WidgetEntity.Theme) themes.getDark();
                    ?? e = lvy0.e(backgroundColor, theme2 != null ? theme2.getBackgroundColor() : null);
                    ColorModel.Attr attr5 = e == 0 ? attr2 : e;
                    WidgetEntity.Theme theme3 = (WidgetEntity.Theme) themes.getLight();
                    String titleTextColor = theme3 != null ? theme3.getTitleTextColor() : null;
                    WidgetEntity.Theme theme4 = (WidgetEntity.Theme) themes.getDark();
                    ?? e2 = lvy0.e(titleTextColor, theme4 != null ? theme4.getTitleTextColor() : null);
                    ColorModel.Attr attr6 = e2 == 0 ? attr : e2;
                    WidgetEntity.Theme theme5 = (WidgetEntity.Theme) themes.getLight();
                    String descTextColor = theme5 != null ? theme5.getDescTextColor() : null;
                    WidgetEntity.Theme theme6 = (WidgetEntity.Theme) themes.getDark();
                    ?? e3 = lvy0.e(descTextColor, theme6 != null ? theme6.getDescTextColor() : null);
                    ColorModel.Attr attr7 = e3 == 0 ? attr : e3;
                    WidgetEntity.Theme theme7 = (WidgetEntity.Theme) themes.getLight();
                    String url = (theme7 == null || (image2 = theme7.getImage()) == null) ? null : image2.getUrl();
                    WidgetEntity.Theme theme8 = (WidgetEntity.Theme) themes.getDark();
                    s451Var = new s451(constant3, constant4, fob1.c(url, (theme8 == null || (image = theme8.getImage()) == null) ? null : image.getUrl(), new ws00(19)), z, z2, attr5, attr6, attr7, p1bVar, z3);
                } else {
                    s451Var = null;
                }
                return new q910(stz0Var, rbvVar, qc70Var2, str, str2, description2, aVar, s451Var);
            default:
                Throwable th = ((n570) obj).a;
                return new r570(th != null ? r501.a(th, null, null, null, null, null, null, null, null, null, null, null, null, 65534) : null);
        }
    }

    @Override // defpackage.m0x0
    public void a(Image image, int i) {
    }
}
